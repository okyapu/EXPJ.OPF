//------------------------------------------------------------------------------
// (#)ExtPlanExpProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2004/01/20 �V�K�쐬 J.Higashi
//
// 2004/02/23 M.Hotokebuchi
// �E�I�[�_�����ő��z���ʂ����傫���ꍇ�A�I�[�_�������鏈�����R�����g��
//   �ő��z�������傫���Ă����̂܂܂̐��ŃI�[�_�𗧂Ă�悤�C��
//
// 2004/02/26 M.Hotokebuchi
// �EStruct�N���X�̖��̂�ύX
// �E�폜�t���O�̗����Ă��鏊�v�ʃ��R�[�h���폜���鏈����ǉ�
// �EDouble,Integer��String�ɕύX �S�ʓI�ɉ���
//
// 2004/03/02 �Ɩ��^�p���̎擾������{�p�b�P�[�W���̃N���X���g�p  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.ExtPlanExp;

//----- �p�b�P�[�W�C���|�[�g��` -----------------------------------------------
// JAVA �W���p�b�P�[�W
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

// ORTEUS �W���p�b�P�[�W
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

// EXPLANNER/J ���ʃp�b�P�[�W
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;

/**
 * MRP�̏����擾����N���X�B
 *
 * @author J.Higashi
 * @version 1.01
 */
public class ExtPlanExpProcess
{

//----- �ϐ���` ---------------------------------------------------------------
    private IDbConnection _conn;                    // DB�ڑ�
    private String        _userCd         = null;   // ���p�҃R�[�h
    private String        _plantCd        = null;   // �H��R�[�h
    private String        _strProgramName = null;   // �v���O������
    private boolean       _roundFlg       = false;  // �܂�߃t���O
    private Date          _oprDate        = null;   // �Ɩ��^�p��
    private int           _expIndex       = 0;

    private ExtPlanStruct _extStruct;       // �O���v��Q�Ɨp�f�[�^�N���X
    private PsStruct _psStruct;             // �W�J�\���Q�Ɨp�f�[�^�N���X
    private ArrayList         _extPs;       // �W�J�\���i�[�p

//----- �G���[�o�͗p ----------
    List      errCodeList = new ArrayList();    // �G���[���X�g
    Hashtable errNoteHash = new Hashtable();    // �G���[�m�[�g
    //�G���[�m�[�g�Z�b�^�[
    public void setErrNote(String note){
        errNoteHash.put(Integer.toString(errCodeList.size()-1),note);
    }

//------------------------------------------------------------------------------

    // ���v�ʌv�Z����(���v�ʌv�Z���t���O�擾�p)
    private String _odCalcCtrlSql =
        "SELECT TO_CHAR(OD_CALC_FLG) FROM SYS_OD_CALC_CTRL WHERE PLANT_CD = ?";

    // ���v�ʌv�Z����X�V
    private String _updOdCalcCtrlSql =
        "UPDATE SYS_OD_CALC_CTRL " +
        "   SET OD_CALC_FLG    = ?" +
        "      ,UPDATED_DATE   = SYSDATE" +
        "      ,UPDATED_BY     = ?" +
        "      ,UPDATED_PRG_NM = ?" +
        "      ,MODIFY_COUNT   = MODIFY_COUNT + 1" +
        " WHERE PLANT_CD = ?";

    // ���v�ʌv�Z����X�V
    private String _updExtPlanSql =
        "UPDATE T_EXTERNAL_PLAN" +
        "   SET EXTERNAL_PLAN_EXP_TYP = 9" +
        "      ,UPDATED_DATE          = SYSDATE" +
        "      ,UPDATED_BY            = ?" +
        "      ,UPDATED_PRG_NM        = ?" +
        "      ,MODIFY_COUNT          = MODIFY_COUNT + 1" +
        " WHERE EXTERNAL_PLAN_CD = ? AND OD_NO = ?";

    // �i�ڏ�񌟍�
    private String _selectItem =
        "SELECT * FROM M_ITEM WHERE ITEM_CD = ?";

    // ���v�ʏ��폜
    private String _delOd =
        "DELETE FROM T_OD WHERE OD_NO IN " +
            "(SELECT OD_NO FROM T_EXTERNAL_PLAN WHERE EXTERNAL_PLAN_CD = ? AND EXTERNAL_PLAN_REG_TYP = 2)";

    // �폜�t���O�̂������v�ʏ��폜
    private String _delFlgOd =
        "DELETE FROM T_OD WHERE OD_NO IN " +
            "(SELECT OD_NO FROM T_EXTERNAL_PLAN WHERE EXTERNAL_PLAN_CD = ? AND EXTERNAL_PLAN_DEL_FLG = 1)";

    // �O���v��폜
    private String _delExtPlan =
        "DELETE FROM T_EXTERNAL_PLAN WHERE EXTERNAL_PLAN_CD = ? AND EXTERNAL_PLAN_REG_TYP = 2";


    /*------------------------------------------------------*
     * �����Ȃ��R���X�g���N�^�B
     *------------------------------------------------------*/
    public ExtPlanExpProcess()
    {
        initialize();
    }

    /*------------------------------------------------------*
     * ��������R���X�g���N�^�B
     * @param conn           DB�ڑ�
     * @param userCd         ���p�҃R�[�h
     * @param plantCd        �H��R�[�h
     * @param strProgramName �v���O������
     * @param roundFlg       �܂�߃t���O
     *------------------------------------------------------*/
    public ExtPlanExpProcess(IDbConnection conn,
                             String userCd,
                             String plantCd,
                             String strProgramName,
                             boolean roundFlg)
    {
        initialize();
        _conn           = conn;
        _userCd         = userCd;
        _plantCd        = plantCd;
        _strProgramName = strProgramName;
        _roundFlg       = roundFlg;
    }

    /**
     * ���[�N�p�G���A�̏��������s���B
     */
    private void initialize()
    {
        _extStruct = new ExtPlanStruct();
        _psStruct  = new PsStruct();
        _extPs     = new ArrayList();
    }

    /*------------------------------------------------------*
     * MRP�̏����\�z�B
     *
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    public boolean execute()
    {
        try {
            // �������擾�ł��Ă��Ȃ��ꍇ�ɂ̓G���[
            if (_conn    == null || _userCd         == null ||
                _plantCd == null || _strProgramName == null) {
                return false;
            }
            initialize();       // ������
            if (getInitialInfo() == false)  return false;   // �����f�[�^�擾����

            try {
                if (extPlanLoop() == false)  return false;      // ���C������
            }
            finally {
                if (updCalcCtrl("0") == false) return false;    // ���v�ʌv�Z����̍X�V(1:������ �� 0:������)
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            errCodeList.add("AC10022");     // �O���I�[�_����̑����v�ʓW�J���I�����܂����B
            setErrNote("");
            businessMessageWrite();     // �Ɩ����O���̏o��
        }
        return true;
    }

    /*------------------------------------------------------*
     * �����f�[�^�擾����
     *
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean getInitialInfo()  throws SQLException
    {
        SimpleDateFormat strFmt = new SimpleDateFormat("yyyy/MM/dd");
        String oprDate;
        try {
            errCodeList.add("AC10021");     // �O���I�[�_����̑����v�ʓW�J���J�n���܂����B
            setErrNote("(SBM0620)�H��R�[�h�F[" + _plantCd + "]");

            // ���v�ʌv�Z����̊m�F
            if (chkCalcCtrl() == false) return false;


            // ���v�ʌv�Z����̍X�V(0:������ �� 1:������)
            if (updCalcCtrl("1") == false) return false;

            // �Ɩ��^�p���̎擾
            oprDate = doRunning();
            if (oprDate == null || oprDate.equals("") == true) return false;
            _oprDate = strFmt.parse(oprDate);   // �����񁨓��t�ϊ�

            _conn.commit();     // �����ł�������R�~�b�g�����s
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*------------------------------------------------------*
     * ���v�ʌv�Z����̊m�F
     * @param _plantCd  �H��R�[�h
     * @return ����Ftrue  �ُ�Ffalse
     * @throws SQLException
     *         SQL�̔��s�Ɏ��s�����ꍇ
     *------------------------------------------------------*/
    private boolean chkCalcCtrl()
    {
        PreparedStatement stmt = null;
        ResultSet rslt  = null;
        String odCalcFlg = "";
        boolean sts = false;

        try {
            // ���v�ʌv�Z���t���O�擾
            stmt = _conn.getConn().prepareStatement(_odCalcCtrlSql);
            stmt.setString(1, _plantCd);
            rslt = stmt.executeQuery();
            if (rslt.next() == true) {
                sts =true;
                odCalcFlg = rslt.getString(1);
                if (odCalcFlg.equals("1") == true) {
                    errCodeList.add("AC32162"); // ���v�ʌv�Z���������s���̂��ߏ������s���܂���B
                    setErrNote("(SBM0620)�H��R�[�h�F[" + _plantCd + "]");
                    sts =false;
                }
            }
            else {
                errCodeList.add("AC50552"); // ���v�ʌv�Z����f�[�^�����݂��܂���B
                setErrNote("(SBM0620)�H��R�[�h�F[ " + _plantCd + " ]");
                sts =false;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0656)���v�ʌv�Z����̓Ǎ��ŃG���[���������܂����B �H��R�[�h�F[ " + _plantCd + " ]");
            return false;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            closeResultSet(rslt);
            closePreparedStatement(stmt);
        }
        return sts;
     }

    /*------------------------------------------------------*
     * ���v�ʌv�Z����̍X�V
     * @param _odCalcCtrlFlg  ���v�ʌv�Z���t���O
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean updCalcCtrl(String _odCalcCtrlFlg)
    {
        PreparedStatement stmt = null;
        try {
            // ���v�ʌv�Z���t���O�̍X�V
            stmt = _conn.getConn().prepareStatement(_updOdCalcCtrlSql);
            stmt.setString(1, _odCalcCtrlFlg);
            stmt.setString(2, _userCd);
            stmt.setString(3, _strProgramName);
            stmt.setString(4, _plantCd);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0656)���v�ʌv�Z����̍X�V�ŃG���[���������܂����B �H��R�[�h�F[ " + _plantCd + " ]");
            e.printStackTrace();
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }
        return true;
     }

    /*------------------------------------------------------*
     * �Ɩ��^�p�����擾���܂��B
     *
     * @return �Ɩ��^�p��
     *------------------------------------------------------*/
    private String doRunning()
    {
        String oprDate  = "";
        try {
            DateCtrl dateCtrl = new DateCtrl(_conn);
            oprDate = dateCtrl.getBusinessOprDate(_conn, _plantCd);
            if (oprDate == null) {
                errCodeList.add("AC00115"); // ���t����̓Ǎ��Ɏ��s���܂����B
                setErrNote("(SBM0620)�H��R�[�h�F[ " + _plantCd + " ]");
            }
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0657)���t����̓Ǎ��ŃG���[���������܂����B �H��R�[�h�F[ " + _plantCd + " ]");
            return null;
        }
        return oprDate;
     }

    /*------------------------------------------------------*
     * ���C�����[�v����
     *
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean extPlanLoop()
    {
        PreparedStatement stmt = null;
        ResultSet rslt = null;

        try {
            // �O���v���񌟍�
            stmt = _conn.getConn().prepareStatement(_extStruct._selectExtPlan);
            stmt.setString(1, _plantCd);
            rslt = stmt.executeQuery();
            int index = 1;

            while (rslt.next() == true) {

                _conn.beginTrans();     // �g�����U�N�V�����J�n

                _extStruct.setLEVEL(new String("0"));                               // �K�w���x��
                _extStruct.setEXTERNAL_PLAN_CD(rslt.getString(1));                  // �O���v��ԍ�
                _extStruct.setPLANT_CD(rslt.getString(2));                          // �H��R�[�h
                _extStruct.setEXTERNAL_PLAN_REG_TYP(rslt.getString(3));             // �O���v��o�^�敪
                _extStruct.setEXTERNAL_PLAN_EXP_TYP(rslt.getString(4));             // �O���v�揈���敪
                _extStruct.setEXTERNAL_PLAN_DEL_FLG(rslt.getString(5));             // �O���v��폜�t���O
                _extStruct.setOD_NO(rslt.getString(6));                             // �I�[�_�f�}���h�ԍ�
                _extStruct.setITEM_CD(rslt.getString(7));                           // �i�ڔԍ�
                _extStruct.setODR_STS_TYP(rslt.getString(8));                       // �I�[�_��ԋ敪
                _extStruct.setDUE_DATE(rslt.getString(9));                          // �v���[��
                _extStruct.setODR_START_DATE(rslt.getString(10));                   // ��z�����
                _extStruct.setPRD_DUE_DATE(rslt.getString(11));                     // �����[��
                _extStruct.setPRD_START_DATE(rslt.getString(12));                   // ���������
                _extStruct.setODR_QTY(rslt.getString(13));                          // �I�[�_��
                _extStruct.setMRP_ODR_TYP(rslt.getString(14));                      // �i�ڎ�z�敪
                _extStruct.setEXTERNAL_DM_FLG(rslt.getString(15));                  // �O���f�}���h�t���O
                _extStruct.setOD_LEVEL_NO(new String("1"));                         // ���v�ʃ��x���ԍ�
                _extStruct.setEXT_LEVEL_NO(new String("1"));                        // �O���v�摊�΃��x���ԍ�

                System.out.println("");
                System.out.println("(SBM0853)[" + index + "]���� �O���I�[�_=====================================");
                System.out.println("        (SBM1019)�K�w���x���F[" + _extStruct.getLEVEL() + "]");
                System.out.println("      (SBM0847)�O���v��ԍ��F[" + _extStruct.getEXTERNAL_PLAN_CD() + "]");
                System.out.println("        (SBM0399)�H��R�[�h�F[" + _extStruct.getPLANT_CD() + "]");
                System.out.println("  (SBM0849)�O���v��o�^�敪�F[" + _extStruct.getEXTERNAL_PLAN_REG_TYP() + "]");
                System.out.println("  (SBM0850)�O���v�揈���敪�F[" + _extStruct.getEXTERNAL_PLAN_EXP_TYP() + "]");
                System.out.println("(SBM0851)�O���v��폜�t���O�F[" + _extStruct.getEXTERNAL_PLAN_DEL_FLG() + "]");
                System.out.println("(SBM0852)�I�[�_�f�}���h�ԍ��F[" + _extStruct.getOD_NO() + "]");
                System.out.println("          (SBM0688)�i�ڔԍ��F[" + _extStruct.getITEM_CD() + "]");
                System.out.println("    (SBM1020)�I�[�_��ԋ敪�F[" + _extStruct.getODR_STS_TYP() + "]");
                System.out.println("          (SBM1021)�v���[���F[" + _extStruct.getDUE_DATE() + "]");
                System.out.println("        (SBM1022)��z������F[" + _extStruct.getODR_START_DATE() + "]");
                System.out.println("          (SBM1023)�����[���F[" + _extStruct.getPRD_DUE_DATE() + "]");
                System.out.println("        (SBM1024)����������F[" + _extStruct.getPRD_START_DATE() + "]");
                System.out.println("          (SBM1025)�I�[�_���F[" + _extStruct.getODR_QTY() + "]");
                System.out.println("      (SBM1026)�i�ڎ�z�敪�F[" + _extStruct.getMRP_ODR_TYP() + "]");
                System.out.println("(SBM1027)�O���f�}���h�t���O�F[" + _extStruct.getEXTERNAL_DM_FLG() + "]");
                System.out.println("  (SBM1028)���v�ʃ��x���ԍ��F[" + _extStruct.getOD_LEVEL_NO() + "]");
                System.out.println("(SBM1029)�O���v�摊�΃��x���F[" + _extStruct.getEXT_LEVEL_NO() + "]");
                System.out.println("=======================================================");

                // �ύX���������O���v��̏ꍇ�A�ȑO�W�J�����O���v��E���v�ʂ��폜
                if (_extStruct.getEXTERNAL_PLAN_EXP_TYP().equals(_extStruct.PLAN_EXP_TYP_UPDATE)) {
                    if (delExtPlan() == false )  return false ;     // �O���v��E���v�ʍ폜
                }

                // �ǉ�or�X�V�̂������O���v������ɍ\���W�J���s���A�I�[�_�E�f�}���h���쐬
                if (((_extStruct.getEXTERNAL_PLAN_EXP_TYP().equals(_extStruct.PLAN_EXP_TYP_INSERT)) ||
                     (_extStruct.getEXTERNAL_PLAN_EXP_TYP().equals(_extStruct.PLAN_EXP_TYP_UPDATE))) &&
                     (_extStruct.getEXTERNAL_PLAN_DEL_FLG().equals(_extStruct.PLAN_DEL_FLG_OFF))) {
                    _extPs.clear();                 // ����܂ł̍\�����N���A
                    _extPs.add(0, _extStruct);      // �ŏ�ʂ̕i�ڂ�z��ɃZ�b�g
                    _expIndex = 1;                  // �W�J�C���f�b�N�X��������
                    if (expandExtPlan() == false) return false;     // �O���v��\���W�J����
                }

                // �O���v�揈���敪��"9"(��)�ɍX�V
                if (updateExtPlan(_extStruct.getEXTERNAL_PLAN_CD(), _extStruct.getOD_NO()) == false)  return false;

                _conn.commit();     // �R�~�b�g
                index++;
            }
        }
        catch (FoundationException fe) {
            // Commit���������s�����ꍇ
            fe.printStackTrace();
            return false;
        }
        catch (Exception e) {
            try {
                _conn.rollback();     // ���[���o�b�N
            }
            catch (FoundationException fe) {
                fe.printStackTrace();
                return false;
            }
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                _conn.rollback();     // ���[���o�b�N
            }
            catch (FoundationException fe) {
                fe.printStackTrace();
                return false;
            }
            closeResultSet(rslt);
            closePreparedStatement(stmt);
        }
        return true;
    }
    /*------------------------------------------------------*
     * �O���v��E���v�ʍ폜
     *
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean delExtPlan() {
        PreparedStatement stmt = null;

        // ���v�ʂ̍폜
        try {
            stmt = _conn.getConn().prepareStatement(_delOd);
            stmt.setString(1, _extStruct.getEXTERNAL_PLAN_CD());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0697)���v�ʂ̍폜�ŃG���[���������܂����B �O���v��ԍ��F[ " + _extStruct.getEXTERNAL_PLAN_CD() + " ]" + e);
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }

        // �폜�t���O�̂������v�ʂ̍폜
        try {
            stmt = _conn.getConn().prepareStatement(_delFlgOd);
            stmt.setString(1, _extStruct.getEXTERNAL_PLAN_CD());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0697)���v�ʂ̍폜�ŃG���[���������܂����B �O���v��ԍ��F[ " + _extStruct.getEXTERNAL_PLAN_CD() + " ]" + e);
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }

        // �O���v��̍폜
        try {
            stmt = _conn.getConn().prepareStatement(_delExtPlan);
            stmt.setString(1, _extStruct.getEXTERNAL_PLAN_CD());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            // �O���v��̍폜�Ɏ��s���܂���
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0659)�O���v��̍폜�ŃG���[���������܂����B �O���v��ԍ��F[" + _extStruct.getEXTERNAL_PLAN_CD() + "] " + e);
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }
        return true;
    }

    /*------------------------------------------------------*
     * �O���v��\���W�J����
     *
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean expandExtPlan()
    {
        PreparedStatement stmt = null;
        ResultSet rslt = null;
        Calculate calc = new Calculate();
        DateConverter dc = new DateConverter();
        Date odrStartDate = new Date();
        Date effPhaseInDate = new Date();
        Date effPhaseOutDate = new Date();
        int  expLevel = 0;
        int  ps_size;
        ExtPlanStruct   odData;     // �o�^�I�[�_�i�[�p���[�N

        try {
            // �O���v��I�[�_�\���W�J
            stmt = _conn.getConn().prepareStatement(_psStruct._expandPs);
            stmt.setString(1, _extStruct.getITEM_CD());
            rslt = stmt.executeQuery();
            int index = 1;

            while (rslt.next() == true) {

                _psStruct.setLEVEL(new Integer(rslt.getInt(1)));                    // �\�����x��
                _psStruct.setPARENT_ITEM_CD(rslt.getString(2));                     // �e�i�ڔԍ�
                _psStruct.setCOMP_ITEM_CD(rslt.getString(3));                       // �q�i�ڔԍ�
                _psStruct.setPS_EDITION(rslt.getString(4));                         // �\���Ő�
                _psStruct.setPS_UNIT_DENOMINATOR(rslt.getString(5));                // �\���P�ʐ�����
                _psStruct.setPS_UNIT_NUMERATOR(rslt.getString(6));                  // �\���P�ʐ����q
                _psStruct.setEFF_PHASE_IN_DATE(rslt.getString(7));                  // �\���L���J�n��
                _psStruct.setEFF_PHASE_OUT_DATE(rslt.getString(8));                 // �\���L���I����
                _psStruct.setPS_SPOIL(rslt.getString(9));                           // �\���d����
                _psStruct.setCONS_TYP(rslt.getString(10));                          // �x���敪
                _psStruct.setPS_LT_FLG(rslt.getString(11));                         // �\��LT�g�p�t���O
                _psStruct.setPS_FIXED_LT(rslt.getString(12));                       // �\���Œ蕪LT
                _psStruct.setPS_PROP_LT(rslt.getString(13));                        // �\����ᕪLT
                _psStruct.setPS_PROP_LOT_SIZE(rslt.getString(14));                  // �\����ᕪLS
                _psStruct.setPS_REF_NO(rslt.getString(15));                         // �\���Ɖ�L�[
                _psStruct.setCOST_UP_TYP(rslt.getString(16));                       // �����Ϗ�敪
                _psStruct.setMRP_EXP_TYP(rslt.getString(17));                       // ���v�ʓW�J�敪

                System.out.println(" (SBM1030)[" + index + "]���x�� �\��-------------------------------------");
                System.out.print("    (SBM1031)�\�����x���F[" + _psStruct.getLEVEL() + "];");
                System.out.print(" (SBM1032)�e�i�ڔԍ��F[" + _psStruct.getPARENT_ITEM_CD() + "];");
                System.out.print(" (SBM1033)�q�i�ڔԍ��F[" + _psStruct.getCOMP_ITEM_CD() + "];");
                System.out.print(" (SBM1034)�\���Ő��F[" + _psStruct.getPS_EDITION() + "];");
                System.out.print(" (SBM1035)�\���P�ʐ�����F[" + _psStruct.getPS_UNIT_DENOMINATOR() + "];");
                System.out.print(" (SBM1036)�\���P�ʐ����q�F[" + _psStruct.getPS_UNIT_NUMERATOR() + "];");
                System.out.print(" (SBM1037)�\���L���J�n���F[" + _psStruct.getEFF_PHASE_IN_DATE() + "];");
                System.out.print(" (SBM1038)�\���L���I�����F[" + _psStruct.getEFF_PHASE_OUT_DATE() + "];");
                System.out.print(" (SBM1039)�\���d�����F[" + _psStruct.getPS_SPOIL() + "];");
                System.out.print(" (SBM1040)�x���敪�F[" + _psStruct.getCONS_TYP() + "];");
                System.out.print(" (SBM1041)�\��LT�g�p�t���O�F[" + _psStruct.getPS_LT_FLG() + "];");
                System.out.print(" (SBM1042)�\���Œ蕪LT�F[" + _psStruct.getPS_FIXED_LT() + "];");
                System.out.print(" (SBM1043)�\����ᕪLT�F[" + _psStruct.getPS_PROP_LT() + "];");
                System.out.print(" (SBM1044)�\����ᕪLS�F[" + _psStruct.getPS_PROP_LOT_SIZE() + "];");
                System.out.print(" (SBM1045)�\���Ɖ�L�[�F[" + _psStruct.getPS_REF_NO() + "];");
                System.out.print(" (SBM1046)�����Ϗ�敪�F[" + _psStruct.getCOST_UP_TYP() + "];");
                System.out.println(" (SBM1047)���v�ʓW�J�敪�F[" + _psStruct.getMRP_EXP_TYP() + "]");
                System.out.println(" -------------------------------------------------------");

                // �����x������ʂ̍\������������Ă����̂ŕs�v�ȏ����폜
                if (expLevel >= _psStruct.getLEVEL().intValue()) {
                    expLevel = _psStruct.getLEVEL().intValue();
                    ps_size = _extPs.size();
                    for (int i=ps_size-1;i>=0;i--) {
                        odData = (ExtPlanStruct)_extPs.get(i);
                        if (calc.compare(odData.getLEVEL(), _psStruct.getLEVEL().toString()) >= 0) {
                            _extPs.remove(i);
                        }
                    }
                    _extPs.trimToSize();
                }

                // ���ʃf�}���h/�I�[�_���o�^
                ps_size = _extPs.size();
                for (int i=0;i<ps_size;i++) {
                    odData = (ExtPlanStruct)_extPs.get(i);
                    if (odData.getLEVEL().equals(calc.subtract(_psStruct.getLEVEL().toString(), "1"))) {
                        // ��z��������\���̗L�����ԓ��̏ꍇ�A���ʃf�}���h�E�I�[�_���쐬
                        odrStartDate = dc.str2date(odData.getODR_START_DATE());
                        effPhaseInDate = dc.str2date(_psStruct.getEFF_PHASE_IN_DATE());
                        effPhaseOutDate = dc.str2date(_psStruct.getEFF_PHASE_OUT_DATE());

                        if ((odrStartDate.compareTo(effPhaseInDate)  >= 0) &&
                            (odrStartDate.compareTo(effPhaseOutDate) <= 0)) {
                            expLevel++;
                            if (createOd(odData, _psStruct) == false)  return false ;  // �I�[�_�E�f�}���h����
                        }
                    }
                }
                index++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            closeResultSet(rslt);
            closePreparedStatement(stmt);
        }

        return true;
    }

    /*------------------------------------------------------*
     * �I�[�_�E�f�}���h��������
     * @param odData    �O���v����
     * @param psData    �\�����
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean createOd(ExtPlanStruct odData, PsStruct psData)
        throws SQLException {
        PreparedStatement stItem   = null;    // �i�ڌ����p
        ResultSet         rsItem   = null;    // �i�ڌ����p
        Statement         stOd     = null;    // ���v�ʒǉ��p
        int               rsRows   = 0;
        String            sql      = null;    // ���v�ʒǉ��pSQL���i�[�p
        SimpleDateFormat  dtFmt    = new SimpleDateFormat();
        DateConverter     dc       = new DateConverter();
        Calculate         calc     = new Calculate();
        int               extLevel = 0;

        try {
            dtFmt.applyPattern("yyyy/MM/dd");   // ���t�������ϊ��̃t�H�[�}�b�g�ݒ�

            // �q�i�ڂ̏�������
            stItem = _conn.getConn().prepareStatement(_selectItem);
            stItem.setString(1, psData.getCOMP_ITEM_CD());
            rsItem = stItem.executeQuery();
            if ( rsItem.next() ) {
                String itemSpoil   = rsItem.getString("ITEM_SPOIL");         // �i�ڎd����
                String odrLt       = rsItem.getString("ODR_LT");             // ��z���[�h�^�C��
                String issueLt     = rsItem.getString("ISSUE_LT");           // ���o���[�h�^�C��
                String fixedLt     = rsItem.getString("FIXED_LT");           // �Œ蕪���[�h�^�C��
                String propLotSize = rsItem.getString("PROP_LOT_SIZE");      // ��ᕪ���b�g�T�C�Y
                String propLt      = rsItem.getString("PROP_LT");            // ��ᕪ���[�h�^�C��
                String safetyLt    = rsItem.getString("SAFETY_LT");          // ���S����
                String mrpOdrTyp   = rsItem.getString("MRP_ODR_TYP");        // �i�ڎ�z�敪
                String odrStsTyp   = ( mrpOdrTyp.equals("8") ) ? "1" : "0";  // �I�[�_��ԋ敪(1:�v��/0:�I�[�_�łȂ�)
                String odTyp       = ( mrpOdrTyp.equals("8") ) ? "4" : "3";  // �I�[�_�f�}���h�敪(4:�^��/3:�f�}���h)
                String propQty     = "0";                                    // ��ᕪ���b�g��
                String lt          = "0";                                    // ��ᕪ���[�h�^�C������
                String mulOdrQty   = rsItem.getString("MUL_ODR_QTY");        // �܂�ߒP��
                String outSideTyp  = rsItem.getString("OUTSIDE_TYP");
                String issueTyp    = rsItem.getString("ISSUE_TYP");

                extLevel = new Integer(odData.getEXT_LEVEL_NO()).intValue();

                // �\���P�ʐ��̌v�Z
                String psDenominator = psData.getPS_UNIT_DENOMINATOR();           // �\���P�ʐ�����
                String psNumerator   = psData.getPS_UNIT_NUMERATOR();             // �\���P�ʐ����q
                String psUnitQty = ( psDenominator.equals("0.0") )                // �\���P�ʐ�
                                     ? psDenominator 
                                       : calc.divide(psNumerator, psDenominator, 4, calc._FLOOR);

                // �f�}���h���ʂ̌v�Z
                String parentOdrQty = odData.getODR_QTY();                                              // �e�̃I�[�_��
                String psSpoil      = ( mrpOdrTyp.equals("8") ) ? "0.0" : psData.getPS_SPOIL();         // �\���d����
                String dmQty        =  calc.multiply( parentOdrQty, calc.multiply( psUnitQty, 
                                       ( calc.add("1", calc.divide( psSpoil, "100", 6, calc._FLOOR)))));// �f�}���h��
                String odrQty       = "0.0";                                                            // �I�[�_��

                // �݌ɐ��ʒP�ʋ敪(0:����/1:����)�ɂ��ۂ�
                String unitQtyTyp = rsItem.getString("UNIT_QTY_TYP");
                psUnitQty      = changeQtyUp(psUnitQty, unitQtyTyp);
                dmQty          = changeQtyUp(dmQty, unitQtyTyp);

                // ���[�h�^�C���̌v�Z
                String psLtFlg       = psData.getPS_FIXED_LT();            // ���i�\�����[�h�^�C���g�p�t���O
                String psFixedLt     = psData.getPS_FIXED_LT();            // �Œ蕪���[�h�^�C��
                String psPropLotSize = psData.getPS_PROP_LOT_SIZE();       // ���i�\����ᕪ���b�g�T�C�Y
                String psPropLt      = psData.getPS_PROP_LT();             // ���i�\����ᕪ���[�h�^�C��
                Date   cDueDate      = new Date();                         // �v���[��
                Date   cPrdDueDate   = new Date();                         // �����[��
                Date   cPrdStartDate = new Date();                         // ���������
                Date   cOdrStartDate = new Date();                         // ��z�����

                if ( psLtFlg.equals("0") ) {
                    cDueDate = dc.str2date(odData.getODR_START_DATE());       // �e�̎�z������Ɠ���
                }
                else {
                    // �e�̐����[�� - �\�����[�h�^�C���Ōv�Z
                    if ( psPropLotSize.equals("0")) {
                        errCodeList.add("AC50417"); // ���i�\����ᕪ���b�g�T�C�Y�������͂ł�
                        setErrNote("(SBM0684)�e�i�ڔԍ��F[" + psData.getPARENT_ITEM_CD() + "] " +
                                   "�q�i�ڔԍ��F[" + psData.getCOMP_ITEM_CD()   + "] " +
                                   "�\���Ő��F["   + psData.getPS_EDITION()     + "]");
                        return false;
                    }
                    // ���i�\����ᕪ���� = �I�[�_��(�e)/���i�\����ᕪ���b�g�T�C�Y (�����ɐ؂�グ)
                    String psPropQty = calc.divide(parentOdrQty, psPropLotSize, 0, calc._CEIL);
                    if ( psPropQty.equals("0") ) psPropQty = "1";        // ���i�\����ᕪ����=0 �̏ꍇ�A=1�Ƃ���
                    // �\�����[�h�^�C��=���i�\���Œ胊�[�h�^�C�� + ���i�\����჊�[�h�^�C��*���i�\����ᕪ����(�����ɐ؂�グ)
                    String psLt = calc.ceil( calc.add( psFixedLt, calc.multiply( psPropLt, psPropQty)), 0);
                    // �ғ����V�t�g (��ʃI�[�_�̐����[������ߋ��ɃV�t�g)
                    cPrdDueDate = dc.str2date(odData.getPRD_DUE_DATE());
                    cDueDate = this.shiftDate(psLt, cPrdDueDate);
               }

                String newOdNo = this.getNewNumber(Numbering.ODNO);     // �I�[�_�f�}���h�ԍ��̔�
                if (newOdNo == null) {
                    errCodeList.add("AC53401"); // Oracle Error
                    setErrNote("(SBM0685)�I�[�_�f�}���h�ԍ��̍̔ԂɎ��s���܂����B");
                    return false;
                }

                if(cDueDate == null){
                    errCodeList.add("AC50502"); // �J�����_���׃f�[�^�����݂��܂���B
                    setErrNote("(SBM0686)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                               "�v���[�� �� �Ɩ��^�p��[" + dc.date2str(_oprDate) + "]���Đݒ肵�܂����B");
                    cDueDate = _oprDate;
                }

                // �v���[�����Ɩ��^�p�����ߋ����t�̏ꍇ�ɂ́A�Ɩ��^�p����v���[���ɃZ�b�g
                if (cDueDate.compareTo(_oprDate) < 0) {
                    errCodeList.add("AC50774"); // ���t���Ɩ��^�p�����ߋ��ł��B
                    setErrNote("(SBM0687)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                               "�v���[��[" + dtFmt.format(cDueDate) + "]��" +
                               "�Ɩ��^�p��[" + dtFmt.format(_oprDate) + "]���Đݒ肵�܂����B");
                    cDueDate = _oprDate;
                }
                cPrdDueDate = cDueDate;

                // SQL���s�p�ɕϊ�
                String sDueDate      = "{d '" + new java.sql.Date(cDueDate.getTime()) + "'}";    // �v���[��
                String sPrdDueDate   = "{d '" + new java.sql.Date(cPrdDueDate.getTime()) + "'}"; // �����[��
                String sOdrStartDate = "null";                                                  // ��z�����
                String sPrdStartDate = "null";                                                  // ���������

                if ( mrpOdrTyp.equals("8") ) {
                    // �I�[�_�� = �f�}���h���� * ( 1 + ( ���v�ʕi�ڎd���� / 100 )
                    odrQty = calc.multiply(dmQty, ( calc.add("1", calc.divide( itemSpoil, "100", 6, calc._FLOOR))));
                    odrQty = changeQtyUp(odrQty, unitQtyTyp);   // �ۂߏ���

                    // �����[�� = �v���[�� - ���o���[�h�^�C�� (�ғ����`�F�b�N)
                    cPrdDueDate = this.shiftDate(issueLt, cDueDate);
                    if(cPrdDueDate == null){
                        errCodeList.add("AC50502"); // �J�����_���׃f�[�^�����݂��܂���B
                        setErrNote("(SBM0589)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                   "�����[�� �� �Ɩ��^�p��[" + dc.date2str(_oprDate) + "]���Đݒ肵�܂����B");
                        cPrdDueDate = _oprDate;
                    }
                    // �����[�����Ɩ��^�p�����ߋ����t�̏ꍇ�ɂ́A�Ɩ��^�p���𐻑��[���ɃZ�b�g
                    if (cPrdDueDate.compareTo(_oprDate) < 0) {
                        errCodeList.add("AC50774"); // ���t���Ɩ��^�p�����ߋ��ł��B
                        setErrNote("(SBM0692)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                   "�����[��[" + dtFmt.format(cPrdDueDate) + "]��" +
                                   "�Ɩ��^�p��[" + dtFmt.format(_oprDate) + "]���Đݒ肵�܂����B");
                        cPrdDueDate = _oprDate;
                    }

                    // ��������� = �����[�� - �i�ڃ��[�h�^�C��
                    if ( propLotSize.equals("0")) {
                        errCodeList.add("AC50416"); // ��ᕪ���b�g�T�C�Y�������͂ł�
                        setErrNote("(SBM0688)�i�ڔԍ��F[" + psData.getCOMP_ITEM_CD() + "]");
                        return false;
                    }
                    propQty = calc.divide(odrQty, propLotSize, 0, calc._CEIL);
                    if ( propQty.equals("0") ) propQty = "1";                    // ��ᕪ����=0 �̏ꍇ�A=1�Ƃ���

                    // �i�ڃ��[�h�^�C�� = �Œ胊�[�h�^�C�� + ( ��჊�[�h�^�C�� * ������) + ���S���� (�����ɐ؂�グ)
                    lt = calc.ceil( calc.add(calc.add( fixedLt, calc.multiply( propLt, propQty)), safetyLt), 0);

                    cPrdStartDate = this.shiftDate(lt, cPrdDueDate);
                    if(cPrdStartDate == null){
                        errCodeList.add("AC50502"); // �J�����_���׃f�[�^�����݂��܂���B
                        setErrNote("(SBM0693)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                   "��������� �� �Ɩ��^�p��[" + dc.date2str(_oprDate) + "]���Đݒ肵�܂����B");
                        cPrdStartDate = _oprDate;
                    }
                    // ������������Ɩ��^�p�����ߋ����t�̏ꍇ�ɂ́A�Ɩ��^�p���𐻑�������ɃZ�b�g
                    if (cPrdStartDate.compareTo(_oprDate) < 0) {
                        errCodeList.add("AC50774"); // ���t���Ɩ��^�p�����ߋ��ł��B
                        setErrNote("(SBM0694)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                   "���������[" + dtFmt.format(cPrdStartDate) + "]��" +
                                   "�Ɩ��^�p��[" + dtFmt.format(_oprDate) + "]���Đݒ肵�܂����B");
                        cPrdStartDate = _oprDate;
                    }

                    cOdrStartDate = this.shiftDate(odrLt, cPrdStartDate);
                    if(cOdrStartDate == null){
                        errCodeList.add("AC50502"); // �J�����_���׃f�[�^�����݂��܂���B
                        setErrNote("(SBM0689)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                   "��z����� �� �Ɩ��^�p��[" + dc.date2str(_oprDate) + "]���Đݒ肵�܂����B");
                        cOdrStartDate = _oprDate;
                    }
                    // ��z��������Ɩ��^�p�����ߋ����t�̏ꍇ�ɂ́A�Ɩ��^�p������z������ɃZ�b�g
                    if (cOdrStartDate.compareTo(_oprDate) < 0) {
                        errCodeList.add("AC50774"); // ���t���Ɩ��^�p�����ߋ��ł��B
                        setErrNote("(SBM0690)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                   "��z�����[" + dtFmt.format(cOdrStartDate) + "]��" +
                                   "�Ɩ��^�p��[" + dtFmt.format(_oprDate) + "]���Đݒ肵�܂����B");
                        cOdrStartDate = _oprDate;
                    }

                    sPrdDueDate = "{d '" + new java.sql.Date(cPrdDueDate.getTime()) + "'}";
                    sOdrStartDate = "{d '" + new java.sql.Date(cOdrStartDate.getTime()) + "'}";
                    sPrdStartDate = "{d '" + new java.sql.Date(cPrdStartDate.getTime()) + "'}";
                }

                // �f�}���hor�I�[�_�f�}���h���o�^
                sql = "INSERT INTO T_OD ( "
                    + " OD_NO"                          // �I�[�_�f�}���h�ԍ�
                    + ",ALC_GRP_CD"                     // �����O���[�v�R�[�h
                    + ",PLANT_CD"                       // �H��R�[�h
                    + ",ITEM_CD"                        // �i�ڔԍ�
                    + ",PS_EDITION"                     // ���v�ʕi�ڍ\���Ő�
                    + ",JOB_ODR_CD"                     // ����
                    + ",JOB_ODR_DETAIL_NO"              // ���Ԏ}��
                    + ",JOB_ODR_CANCEL_NO"              // ���Ԏ�������ԍ�
                    + ",ODR_STS_TYP"                    // �I�[�_��ԋ敪
                    + ",DM_STS_TYP"                     // �f�}���h��ԋ敪
                    + ",OD_TYP"                         // �I�[�_�f�}���h�敪
                    + ",DUE_DATE"                       // �v���[��
                    + ",ODR_START_DATE"                 // ��z�����
                    + ",PRD_DUE_DATE"                   // �����[��
                    + ",PRD_START_DATE"                 // ���������
                    + ",DM_QTY"                         // �f�}���h��
                    + ",ODR_QTY"                        // �I�[�_��
                    + ",MRP_ODR_TYP"                    // �i�ڎ�z�敪
                    + ",OUTSIDE_TYP"                    // ���v�ʓ��O��敪
                    + ",ISSUE_TYP"                      // ���v�ʏo�ɋ敪
                    + ",ODR_LT"                         // ��z���[�h�^�C��
                    + ",FIXED_LT"                       // �Œ蕪���[�h�^�C��
                    + ",PROP_LT"                        // ��ᕪ���[�h�^�C��
                    + ",SAFETY_LT"                      // ���S����
                    + ",ISSUE_LT"                       // ���o���[�h�^�C��
                    + ",PROP_LOT_SIZE"                  // ��ᕪ���b�g�T�C�Y
                    + ",PS_LT_FLG"                      // ���i�\�����[�h�^�C���g�p�t���O
                    + ",PS_FIXED_LT"                    // ���i�\���Œ蕪���[�h�^�C��
                    + ",PS_PROP_LT"                     // ���i�\����ᕪ���[�h�^�C��
                    + ",PS_PROP_LOT_SIZE"               // ���i�\����ᕪ���b�g�T�C�Y
                    + ",PS_UNIT_QTY"                    // ���i�\���P�ʐ�
                    + ",PS_UNIT_NUMERATOR"              // ���i�\���P�ʐ����q
                    + ",PS_UNIT_DENOMINATOR"            // ���i�\���P�ʐ�����
                    + ",TOTAL_RCV_QTY"                  // ���ɗ݌v��
                    + ",RCV_CMPLT_DATE"                 // ���Ɋ�����
                    + ",TOTAL_ISSUE_INST_QTY"           // �o�Ɏw���݌v��
                    + ",TOTAL_ISSUE_QTY"                // �o�ɗ݌v��
                    + ",ISSUE_CMPLT_DATE"               // �o�Ɋ�����
                    + ",OD_GNR_TYP"                     // ���v�ʔ��������敪
                    + ",OD_LEVEL_NO"                    // ���v�ʃ��x���ԍ�
                    + ",PARENT_OD_NO"                   // �e�I�[�_�f�}���h�ԍ�
                    + ",ITEM_SPOIL"                     // ���v�ʕi�ڎd����
                    + ",PS_SPOIL"                       // ���v�ʍ\���d����
                    + ",CONS_TYP"                       // �\���x���敪
                    + ",EFF_PHASE_IN_DATE"              // ���v�ʗL���J�n��
                    + ",EFF_PHASE_OUT_DATE"             // ���v�ʗL���I����
                    + ",MRP_TYP"                        // ���v�ʏ����敪
                    + ",EXTERNAL_DM_FLG"                // �O���f�}���h�t���O
                    + ",ODR_RELEASE_FLG"                // �I�[�_�����σt���O
                    + ",CREATED_BY"                     // �쐬��
                    + ",CREATED_PRG_NM"                 // �쐬�v���O������
                    + ",UPDATED_BY"                     // �X�V��
                    + ",UPDATED_PRG_NM"                 // �X�V�v���O������
                    + ",MODIFY_COUNT"                   // �X�V��
                    + ") values ("
                    + "'" + newOdNo + "'"                             // �I�[�_�f�}���h�ԍ�
                    + ",null"                                         // �����O���[�v�R�[�h
                    + ",'" + _plantCd + "'"                           // �H��R�[�h
                    + ",'" + psData.getCOMP_ITEM_CD() + "'"           // �i�ڔԍ�
                    + ",'" + psData.getPS_EDITION() + "'"             // ���v�ʕi�ڍ\���Ő�
                    + ",null"                                         // ����
                    + ",0"                                            // ���Ԏ}��
                    + ",0"                                            // ���Ԏ�������ԍ�
                    + "," + odrStsTyp                                 // �I�[�_��ԋ敪
                    + ",1"                                            // �f�}���h��ԋ敪
                    + "," + odTyp                                     // �I�[�_�f�}���h�敪
                    + "," + sDueDate                                  // �v���[��
                    + "," + sOdrStartDate                             // ��z�����
                    + "," + sPrdDueDate                               // �����[��
                    + "," + sPrdStartDate                             // ���������
                    + "," + dmQty                                     // �f�}���h��
                    + "," + odrQty                                    // �I�[�_��
                    + "," + mrpOdrTyp                                 // �i�ڎ�z�敪
                    + "," + outSideTyp                                // ���v�ʓ��O��敪
                    + "," + issueTyp                                  // ���v�ʏo�ɋ敪
                    + "," + odrLt                                     // ��z���[�h�^�C��
                    + "," + fixedLt                                   // �Œ蕪���[�h�^�C��
                    + "," + propLt                                    // ��ᕪ���[�h�^�C��
                    + "," + safetyLt                                  // ���S����
                    + "," + issueLt                                   // ���o���[�h�^�C��
                    + "," + propLotSize                               // ��ᕪ���b�g�T�C�Y
                    + "," + psLtFlg                                   // ���i�\�����[�h�^�C���g�p�t���O
                    + "," + psFixedLt                                 // ���i�\���Œ蕪���[�h�^�C��
                    + "," + psPropLt                                  // ���i�\����ᕪ���[�h�^�C��
                    + "," + psPropLotSize                             // ���i�\����ᕪ���b�g�T�C�Y
                    + "," + psUnitQty                                 // ���i�\���P�ʐ�
                    + "," + psNumerator                               // ���i�\���P�ʐ����q
                    + "," + psDenominator                             // ���i�\���P�ʐ�����
                    + ",0"                                            // ���ɗ݌v��
                    + ",null"                                         // ���Ɋ�����
                    + ",0"                                            // �o�Ɏw���݌v��
                    + ",0"                                            // �o�ɗ݌v��
                    + ",null"                                         // �o�Ɋ�����
                    + ",9"                                            // ���v�ʔ��������敪
                    + "," + calc.add(odData.getOD_LEVEL_NO(), "1")    // ���v�ʃ��x���ԍ�
                    + ",'" + odData.getOD_NO() + "'"                  // �e�I�[�_�f�}���h�ԍ�
                    + "," + itemSpoil                                 // ���v�ʕi�ڎd����
                    + "," + psSpoil                                   // ���v�ʍ\���d����
                    + "," + psData.getCONS_TYP()                      // �\���x���敪
                    + ",{d '" + psData.getEFF_PHASE_IN_DATE() + "'}"  // ���v�ʗL���J�n��
                    + ",{d '" + psData.getEFF_PHASE_OUT_DATE() + "'}" // ���v�ʗL���I����
                    + ",9"                                            // ���v�ʏ����敪
                    + ",1"                                            // �O���f�}���h�t���O
                    + ",0"                                            // �I�[�_�����σt���O
                    + ",'" + _userCd + "'"                            // �쐬��
                    + ",'" + _strProgramName + "'"                    // �쐬�v���O������
                    + ",'" + _userCd + "'"                            // �X�V��
                    + ",'" + _strProgramName + "'"                    // �X�V�v���O������
                    + ",0"                                            // �X�V��
                    + ")";

                    System.out.println("     (SBM1048)���f�}���h�o�^ ----------------------------------------------");
                    System.out.print("       (SBM0852)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "];");
                    System.out.print(" (SBM0688)�i�ڔԍ��F[" + psData.getCOMP_ITEM_CD() + "];");
                    System.out.print(" (SBM1020)�I�[�_��ԋ敪�F[" + odrStsTyp + "];");
                    System.out.print(" (SBM1052)�f�}���h��ԋ敪�F[" + "1" + "];");
                    System.out.print(" (SBM1053)�I�[�_�f�}���h�敪�F[" + odTyp + "];");
                    System.out.print(" (SBM1021)�v���[���F[" + sDueDate + "];");
                    System.out.print(" (SBM1022)��z������F[" + sOdrStartDate + "];");
                    System.out.print(" (SBM1023)�����[���F[" + sPrdDueDate + "];");
                    System.out.print(" (SBM1024)����������F[" + sPrdStartDate + "];");
                    System.out.print(" (SBM1058)�f�}���h���F[" + dmQty + "];");
                    System.out.print(" (SBM1025)�I�[�_���F[" + odrQty + "];");
                    System.out.print(" (SBM1026)�i�ڎ�z�敪�F[" + mrpOdrTyp + "];");
                    System.out.print(" (SBM1061)���v�ʓ��O��敪�F[" + outSideTyp + "];");
                    System.out.print(" (SBM1062)��zLT�F[" + odrLt + "];");
                    System.out.print(" (SBM1063)�Œ蕪LT�F[" + fixedLt + "];");
                    System.out.print(" (SBM1064)��ᕪLT�F[" + propLt + "];");
                    System.out.print(" (SBM1065)���S�����F[" + safetyLt + "];");
                    System.out.print(" (SBM1066)���oLT�F[" + issueLt + "];");
                    System.out.print(" (SBM1067)��ᕪLS�F[" + propLotSize + "];");
                    System.out.print(" (SBM1068)���v�ʏ����敪�F[" + "9" + "];");
                    System.out.println(" (SBM1069)�O���f�}���h�t���O�F[" + "1" + "];");

                try {
                    stOd = _conn.getConn().createStatement();
                    rsRows = stOd.executeUpdate(sql);

                    // �O���v����o�^(�f�}���hor�I�[�_�f�}���h��)
                    if (insertExtPlan(odData.getEXTERNAL_PLAN_CD(), newOdNo, extLevel + 1) == false)   return false;
                }
                catch (SQLException edm) {
                    errCodeList.add("AC53401"); // Oracle Error
                    setErrNote("(SBM0691)�f�}���h���̓o�^�ŃG���[���������܂����B �i�ڔԍ��F[" + psData.getCOMP_ITEM_CD() +
                               "] �f�}���h���F[" + dmQty + "] " + edm);
                    return false;
                }
                finally {
                    closeStatement(stOd);
                }

                if ( mrpOdrTyp.equals("8") ) {
                    // �I�[�_���X�g�ɓo�^
                    ExtPlanStruct odList = new ExtPlanStruct();
                    odList.setLEVEL(calc.add(odData.getLEVEL(), "1"));               // �K�w���x��
                    odList.setEXTERNAL_PLAN_CD(odData.getEXTERNAL_PLAN_CD());        // �O���v��ԍ�
                    odList.setPLANT_CD(_plantCd);                                    // �H��R�[�h
                    odList.setEXTERNAL_PLAN_REG_TYP("2");                            // �O���v��o�^�敪
                    odList.setEXTERNAL_PLAN_EXP_TYP("9");                            // �O���v�揈���敪
                    odList.setEXTERNAL_PLAN_DEL_FLG("0");                            // �O���v��폜�t���O
                    odList.setOD_NO(newOdNo);                                        // �I�[�_�f�}���h�ԍ�
                    odList.setITEM_CD(psData.getCOMP_ITEM_CD());                     // �i�ڔԍ�
                    odList.setODR_STS_TYP("1");                                      // �I�[�_��ԋ敪
                    odList.setDUE_DATE(dc.date2str(cDueDate));                       // �v���[��
                    odList.setODR_START_DATE(dc.date2str(cOdrStartDate));            // ��z�����
                    odList.setPRD_DUE_DATE(dc.date2str(cPrdDueDate));                // �����[��
                    odList.setPRD_START_DATE(dc.date2str(cPrdStartDate));            // ���������
                    odList.setODR_QTY(odrQty);                                       // �I�[�_��
                    odList.setMRP_ODR_TYP(mrpOdrTyp);                                // �i�ڎ�z�敪
                    odList.setEXTERNAL_DM_FLG("1");                                  // �O���f�}���h�t���O
                    odList.setOD_LEVEL_NO(calc.add(odData.getOD_LEVEL_NO(), "1"));   // ���v�ʃ��x���ԍ�
                    odList.setEXT_LEVEL_NO("" + (extLevel + 1));                     // �O���v�摊�΃��x���ԍ�
                    _extPs.add(odList); // �I�[�_�������X�g�ɒǉ�
                }

                // ���b�g��z�i��or��ʔ����i�ڂ̏ꍇ�A�I�[�_���̓o�^
                if ((mrpOdrTyp.equals("5")) || (mrpOdrTyp.equals("6"))){
                    try {
                        // �I�[�_�� = �f�}���h���� * ( 1 + ( ���v�ʕi�ڎd���� / 100 )
                        String ttlOdrQty = calc.multiply(dmQty, ( calc.add("1", calc.divide(itemSpoil, "100", 6, calc._FLOOR ))));
                        String maxOdrQty = rsItem.getString("MAX_ODR_QTY");     // �ő��z����
                        String minOdrQty = rsItem.getString("MIN_ODR_QTY");     // �ŏ���z����
                        String fixOdrQty = rsItem.getString("FIXED_ODR_QTY");   // ��ʔ�����

                        stOd = _conn.getConn().createStatement();

                        do {
                            // �I�[�_���̌v�Z
                            if (mrpOdrTyp.equals("5")) {       // ���b�g��z�i�ڂ̏ꍇ
                                if (calc.compare(ttlOdrQty, maxOdrQty) >= 0) {
                                    // �ő��z���ȏ�̏ꍇ�ɂ́A�ő��z�����I�[�_���Ƃ���(�����I�[�_�ւ̕���)
                                    // odrQty = maxOdrQty;

                                    // 2004-02-23 M.Hotokebuchi
                                    // ��z�����I�[�_���Ƃ���(�ő��z���ʂ͍l�����Ȃ�)
                                    odrQty = ttlOdrQty;
                                }
                                else {
                                    // �ŏ���z���ȉ��̏ꍇ�ɂ́A�ŏ���z�����I�[�_���Ƃ���
                                    if (calc.compare(ttlOdrQty, minOdrQty) <= 0) {
                                        odrQty = minOdrQty;
                                    }
                                    else {
                                        // �݌ɐ��P�ʋ敪(����/����)�ɂ��I�[�_�܂��
                                        odrQty =  changeQtyUp(ttlOdrQty, unitQtyTyp) ;
                                        // �܂�ߒP�ʂɂ��I�[�_�܂��
                                        if (_roundFlg == true) {
                                            if (mulOdrQty.equals("0")) mulOdrQty = "1";
                                            String unit = calc.divide(calc.subtract(odrQty, minOdrQty), mulOdrQty, 0, calc._CEIL);
                                            if (odrQty.equals(calc.add(calc.multiply(unit, mulOdrQty), minOdrQty)) == false)
                                               calc.add(unit, "1");
                                            odrQty = calc.add(calc.multiply(unit, mulOdrQty), minOdrQty);
                                        }
                                    }
                                }
                            }
                            else {  // ��ʔ����i�ڂ̏ꍇ�A��ʔ��������Z�b�g
                                odrQty =   fixOdrQty ;
                            }
                            ttlOdrQty = calc.subtract(ttlOdrQty, odrQty);

                            newOdNo = this.getNewNumber(Numbering.ODNO);        // �I�[�_�f�}���h�ԍ��̔�
                            if (newOdNo == null) {
                                errCodeList.add("AC53401"); // Oracle Error
                                setErrNote("(SBM0685)�I�[�_�f�}���h�ԍ��̍̔ԂɎ��s���܂����B");
                                return false;
                            }

                            // �����[�� = �v���[�� - ���o���[�h�^�C�� (�ғ����`�F�b�N)
                            cPrdDueDate = this.shiftDate(issueLt, cDueDate);
                            if(cPrdDueDate == null){
                                errCodeList.add("AC50502"); // �J�����_���׃f�[�^�����݂��܂���B
                                setErrNote("(SBM0589)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                           "�����[�� �� �Ɩ��^�p��[" + dc.date2str(_oprDate) + "]���Đݒ肵�܂����B");
                                cPrdDueDate = _oprDate;
                            }
                            // �����[�����Ɩ��^�p�����ߋ����t�̏ꍇ�ɂ́A�Ɩ��^�p���𐻑��[���ɃZ�b�g
                            if (cPrdDueDate.compareTo(_oprDate) < 0) {
                                errCodeList.add("AC50774"); // ���t���Ɩ��^�p�����ߋ��ł��B
                                setErrNote("(SBM0692)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                           "�����[��[" + dtFmt.format(cPrdDueDate) + "]��" +
                                           "�Ɩ��^�p��[" + dtFmt.format(_oprDate) + "]���Đݒ肵�܂����B");
                                cPrdDueDate = _oprDate;
                            }

                            // ��������� = �����[�� - �i�ڃ��[�h�^�C��
                            if ( propLotSize.equals("0")) {
                                errCodeList.add("AC50416"); // ��ᕪ���b�g�T�C�Y�������͂ł�
                                setErrNote("(SBM0688)�i�ڔԍ��F[" + psData.getCOMP_ITEM_CD() + "]");
                                return false;
                            }
                            propQty = calc.divide( odrQty, propLotSize, 0, calc._CEIL );

                            // ��ᕪ����=0 �̏ꍇ�A=1�Ƃ���
                            if ( propQty.equals("0") ) propQty = "1";

                            // �i�ڃ��[�h�^�C�� = �Œ胊�[�h�^�C�� + ( ��჊�[�h�^�C�� * ������) + ���S���� (�����ɐ؂�グ)
                            lt = calc.ceil( calc.add(calc.add(fixedLt, calc.multiply( propLt, propQty )), safetyLt), 0);

                            cPrdStartDate = this.shiftDate(lt, cPrdDueDate);
                            if(cPrdStartDate == null){
                                errCodeList.add("AC50502"); // �J�����_���׃f�[�^�����݂��܂���B
                                setErrNote("(SBM0693)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                           "��������� �� �Ɩ��^�p��[" + dc.date2str(_oprDate) + "]���Đݒ肵�܂����B");
                                cPrdStartDate = _oprDate;
                            }
                            // ������������Ɩ��^�p�����ߋ����t�̏ꍇ�ɂ́A�Ɩ��^�p���𐻑�������ɃZ�b�g
                            if (cPrdStartDate.compareTo(_oprDate) < 0) {
                                errCodeList.add("AC50774"); // ���t���Ɩ��^�p�����ߋ��ł��B
                                setErrNote("(SBM0694)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                           "���������[" + dtFmt.format(cPrdStartDate) + "]��" +
                                           "�Ɩ��^�p��[" + dtFmt.format(_oprDate) + "]���Đݒ肵�܂����B");
                                cPrdStartDate = _oprDate;
                            }

                            // ��z����� = ��������� - ��z���[�h�^�C��
                            cOdrStartDate = this.shiftDate(odrLt, cPrdStartDate);
                            if(cOdrStartDate == null){
                                errCodeList.add("AC50502"); // �J�����_���׃f�[�^�����݂��܂���B
                                setErrNote("(SBM0689)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                           "��z����� �� �Ɩ��^�p��[" + dc.date2str(_oprDate) + "]���Đݒ肵�܂����B");
                                cOdrStartDate = _oprDate;
                            }
                            // ��z��������Ɩ��^�p�����ߋ����t�̏ꍇ�ɂ́A�Ɩ��^�p������z������ɃZ�b�g
                            if (cOdrStartDate.compareTo(_oprDate) < 0) {
                                errCodeList.add("AC50774"); // ���t���Ɩ��^�p�����ߋ��ł��B
                                setErrNote("(SBM0690)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "] " +
                                           "��z�����[" + dtFmt.format(cOdrStartDate) + "]��" +
                                           "�Ɩ��^�p��[" + dtFmt.format(_oprDate) + "]���Đݒ肵�܂����B");
                                cOdrStartDate = _oprDate;
                            }

                            sDueDate      = "{d '" + new java.sql.Date(cDueDate.getTime()) + "'}";       // �v���[��
                            sPrdDueDate   = "{d '" + new java.sql.Date(cPrdDueDate.getTime()) + "'}";    // �����[��
                            sOdrStartDate = "{d '" + new java.sql.Date(cPrdStartDate.getTime()) + "'}";  // ��z�����
                            sPrdStartDate = "{d '" + new java.sql.Date(cOdrStartDate.getTime()) + "'}";  // ���������

                            // �I�[�_���o�^
                            sql = "INSERT INTO T_OD ( "
                                + " OD_NO"                          // �I�[�_�f�}���h�ԍ�
                                + ",ALC_GRP_CD"                     // �����O���[�v�R�[�h
                                + ",PLANT_CD"                       // �H��R�[�h
                                + ",ITEM_CD"                        // �i�ڔԍ�
                                + ",PS_EDITION"                     // ���v�ʕi�ڍ\���Ő�
                                + ",JOB_ODR_CD"                     // ����
                                + ",JOB_ODR_DETAIL_NO"              // ���Ԏ}��
                                + ",JOB_ODR_CANCEL_NO"              // ���Ԏ�������ԍ�
                                + ",ODR_STS_TYP"                    // �I�[�_��ԋ敪
                                + ",DM_STS_TYP"                     // �f�}���h��ԋ敪
                                + ",OD_TYP"                         // �I�[�_�f�}���h�敪
                                + ",DUE_DATE"                       // �v���[��
                                + ",ODR_START_DATE"                 // ��z�����
                                + ",PRD_DUE_DATE"                   // �����[��
                                + ",PRD_START_DATE"                 // ���������
                                + ",DM_QTY"                         // �f�}���h��
                                + ",ODR_QTY"                        // �I�[�_��
                                + ",MRP_ODR_TYP"                    // �i�ڎ�z�敪
                                + ",OUTSIDE_TYP"                    // ���v�ʓ��O��敪
                                + ",ISSUE_TYP"                      // ���v�ʏo�ɋ敪
                                + ",ODR_LT"                         // ��z���[�h�^�C��
                                + ",FIXED_LT"                       // �Œ蕪���[�h�^�C��
                                + ",PROP_LT"                        // ��ᕪ���[�h�^�C��
                                + ",SAFETY_LT"                      // ���S����
                                + ",ISSUE_LT"                       // ���o���[�h�^�C��
                                + ",PROP_LOT_SIZE"                  // ��ᕪ���b�g�T�C�Y
                                + ",PS_LT_FLG"                      // ���i�\�����[�h�^�C���g�p�t���O
                                + ",PS_FIXED_LT"                    // ���i�\���Œ蕪���[�h�^�C��
                                + ",PS_PROP_LT"                     // ���i�\����ᕪ���[�h�^�C��
                                + ",PS_PROP_LOT_SIZE"               // ���i�\����ᕪ���b�g�T�C�Y
                                + ",PS_UNIT_QTY"                    // ���i�\���P�ʐ�
                                + ",PS_UNIT_NUMERATOR"              // ���i�\���P�ʐ����q
                                + ",PS_UNIT_DENOMINATOR"            // ���i�\���P�ʐ�����
                                + ",TOTAL_RCV_QTY"                  // ���ɗ݌v��
                                + ",RCV_CMPLT_DATE"                 // ���Ɋ�����
                                + ",TOTAL_ISSUE_INST_QTY"           // �o�Ɏw���݌v��
                                + ",TOTAL_ISSUE_QTY"                // �o�ɗ݌v��
                                + ",ISSUE_CMPLT_DATE"               // �o�Ɋ�����
                                + ",OD_GNR_TYP"                     // ���v�ʔ��������敪
                                + ",OD_LEVEL_NO"                    // ���v�ʃ��x���ԍ�
                                + ",PARENT_OD_NO"                   // �e�I�[�_�f�}���h�ԍ�
                                + ",ITEM_SPOIL"                     // ���v�ʕi�ڎd����
                                + ",PS_SPOIL"                       // ���v�ʍ\���d����
                                + ",CONS_TYP"                       // �\���x���敪
                                + ",EFF_PHASE_IN_DATE"              // ���v�ʗL���J�n��
                                + ",EFF_PHASE_OUT_DATE"             // ���v�ʗL���I����
                                + ",MRP_TYP"                        // ���v�ʏ����敪
                                + ",EXTERNAL_DM_FLG"                // �O���f�}���h�t���O
                                + ",ODR_RELEASE_FLG"                // �I�[�_�����σt���O
                                + ",CREATED_BY"                     // �쐬��
                                + ",CREATED_PRG_NM"                 // �쐬�v���O������
                                + ",UPDATED_BY"                     // �X�V��
                                + ",UPDATED_PRG_NM"                 // �X�V�v���O������
                                + ",MODIFY_COUNT"                   // �X�V��
                                + ") values ("
                                + "'" + newOdNo + "'"                             // �I�[�_�f�}���h�ԍ�
                                + ",null"                                         // �����O���[�v�R�[�h
                                + ",'" + _plantCd + "'"                           // �H��R�[�h
                                + ",'" + psData.getCOMP_ITEM_CD() + "'"           // �i�ڔԍ�
                                + ",null"                                         // ���v�ʕi�ڍ\���Ő�
                                + ",null"                                         // ����
                                + ",0"                                            // ���Ԏ}��
                                + ",0"                                            // ���Ԏ�������ԍ�
                                + ",1"                                            // �I�[�_��ԋ敪
                                + ",0"                                            // �f�}���h��ԋ敪
                                + ",2"                                            // �I�[�_�f�}���h�敪
                                + ",null"                                         // �v���[��
                                + "," + sOdrStartDate                             // ��z�����
                                + "," + sPrdDueDate                               // �����[��
                                + "," + sPrdStartDate                             // ���������
                                + ",0"                                            // �f�}���h��
                                + "," + odrQty                                    // �I�[�_��
                                + "," + mrpOdrTyp                                 // �i�ڎ�z�敪
                                + "," + outSideTyp                                // ���v�ʓ��O��敪
                                + "," + issueTyp                                  // ���v�ʏo�ɋ敪
                                + "," + odrLt                                     // ��z���[�h�^�C��
                                + "," + fixedLt                                   // �Œ蕪���[�h�^�C��
                                + "," + propLt                                    // ��ᕪ���[�h�^�C��
                                + "," + safetyLt                                  // ���S����
                                + "," + issueLt                                   // ���o���[�h�^�C��
                                + "," + propLotSize                               // ��ᕪ���b�g�T�C�Y
                                + ",0"                                            // ���i�\�����[�h�^�C���g�p�t���O
                                + ",0"                                            // ���i�\���Œ蕪���[�h�^�C��
                                + ",0"                                            // ���i�\����ᕪ���[�h�^�C��
                                + ",0"                                            // ���i�\����ᕪ���b�g�T�C�Y
                                + ",0"                                            // ���i�\���P�ʐ�
                                + ",0"                                            // ���i�\���P�ʐ����q
                                + ",1"                                            // ���i�\���P�ʐ�����
                                + ",0"                                            // ���ɗ݌v��
                                + ",null"                                         // ���Ɋ�����
                                + ",0"                                            // �o�Ɏw���݌v��
                                + ",0"                                            // �o�ɗ݌v��
                                + ",null"                                         // �o�Ɋ�����
                                + ",9"                                            // ���v�ʔ��������敪
                                + ",1"                                            // ���v�ʃ��x���ԍ�
                                + ",null"                                         // �e�I�[�_�f�}���h�ԍ�
                                + "," + itemSpoil                                 // ���v�ʕi�ڎd����
                                + ",0"                                            // ���v�ʍ\���d����
                                + ",0"                                            // �\���x���敪
                                + ",null"                                         // ���v�ʗL���J�n��
                                + ",null"                                         // ���v�ʗL���I����
                                + ",9"                                            // ���v�ʏ����敪
                                + ",1"                                            // �O���f�}���h�t���O
                                + ",0"                                            // �I�[�_�����σt���O
                                + ",'" + _userCd + "'"                            // �쐬��
                                + ",'" + _strProgramName + "'"                    // �쐬�v���O������
                                + ",'" + _userCd + "'"                            // �X�V��
                                + ",'" + _strProgramName + "'"                    // �X�V�v���O������
                                + ",0"                                            // �X�V��
                                + ")";

                            System.out.println("     (SBM1070)���I�[�_�o�^ ----------------------------------------------");
                            System.out.print("       (SBM0852)�I�[�_�f�}���h�ԍ��F[" + newOdNo + "];");
                            System.out.print(" (SBM0688)�i�ڔԍ��F[" + psData.getCOMP_ITEM_CD() + "];");
                            System.out.print(" (SBM1071)�I�[�_��ԋ敪�F[" + "1" + "];");
                            System.out.print(" (SBM1072)�f�}���h��ԋ敪�F[" + "0" + "];");
                            System.out.print(" (SBM1073)�I�[�_�f�}���h�敪�F[" + "2" + "];");
                            System.out.print(" (SBM1074)�v���[���F[" + "null" + "];");
                            System.out.print(" (SBM1022)��z������F[" + sOdrStartDate + "];");
                            System.out.print(" (SBM1023)�����[���F[" + sPrdDueDate + "];");
                            System.out.print(" (SBM1024)����������F[" + sPrdStartDate + "];");
                            System.out.print(" (SBM1075)�f�}���h���F[" + "0" + "];");
                            System.out.print(" (SBM1025)�I�[�_���F[" + odrQty + "];");
                            System.out.print(" (SBM1026)�i�ڎ�z�敪�F[" + mrpOdrTyp + "];");
                            System.out.print(" (SBM1061)���v�ʓ��O��敪�F[" + outSideTyp + "];");
                            System.out.print(" (SBM1062)��zLT�F[" + odrLt + "];");
                            System.out.print(" (SBM1063)�Œ蕪LT�F[" + fixedLt + "];");
                            System.out.print(" (SBM1064)��ᕪLT�F[" + propLt + "];");
                            System.out.print(" (SBM1065)���S�����F[" + safetyLt + "];");
                            System.out.print(" (SBM1066)���oLT�F[" + issueLt + "];");
                            System.out.print(" (SBM1067)��ᕪLS�F[" + propLotSize + "];");
                            System.out.print(" (SBM1068)���v�ʏ����敪�F[" + "9" + "];");
                            System.out.println(" (SBM1069)�O���f�}���h�t���O�F[" + "1" + "];");

                            rsRows = stOd.executeUpdate(sql);
                            // �O���v��o�^(�I�[�_��)
                            if (insertExtPlan(odData.getEXTERNAL_PLAN_CD(), newOdNo, extLevel + 1) == false)   return false;

                            // �I�[�_���X�g�ɓo�^
                            ExtPlanStruct odList = new ExtPlanStruct();
                            odList.setLEVEL(calc.add(odData.getLEVEL(), "1"));              // �K�w���x��
                            odList.setEXTERNAL_PLAN_CD(odData.getEXTERNAL_PLAN_CD());        // �O���v��ԍ�
                            odList.setPLANT_CD(_plantCd);                                    // �H��R�[�h
                            odList.setEXTERNAL_PLAN_REG_TYP("2");                            // �O���v��o�^�敪
                            odList.setEXTERNAL_PLAN_EXP_TYP("9");                            // �O���v�揈���敪
                            odList.setEXTERNAL_PLAN_DEL_FLG("0");                            // �O���v��폜�t���O
                            odList.setOD_NO(newOdNo);                                        // �I�[�_�f�}���h�ԍ�
                            odList.setITEM_CD(psData.getCOMP_ITEM_CD());                     // �i�ڔԍ�
                            odList.setODR_STS_TYP("1");                                      // �I�[�_��ԋ敪
                            odList.setDUE_DATE(dc.date2str(cDueDate));                       // �v���[��
                            odList.setODR_START_DATE(dc.date2str(cOdrStartDate));            // ��z�����
                            odList.setPRD_DUE_DATE(dc.date2str(cPrdDueDate));                // �����[��
                            odList.setPRD_START_DATE(dc.date2str(cPrdStartDate));            // ���������
                            odList.setODR_QTY(odrQty);                                       // �I�[�_��
                            odList.setMRP_ODR_TYP(mrpOdrTyp);                                // �i�ڎ�z�敪
                            odList.setEXTERNAL_DM_FLG("1");                                  // �O���f�}���h�t���O
                            odList.setOD_LEVEL_NO("1");                                      // ���v�ʃ��x���ԍ�
                            odList.setEXT_LEVEL_NO("" + (extLevel + 1));                     // �O���v�摊�΃��x���ԍ�
                            _extPs.add(odList); // �I�[�_�������X�g�ɒǉ�

                        } while(calc.compare(ttlOdrQty, "0") > 0); // �I�[�_�����[���ȉ��ɂȂ�܂ŃI�[�_�o�^���������{
                    }
                    catch (SQLException e) {
                        e.printStackTrace();
                        errCodeList.add("AC53401"); // Oracle Error
                        setErrNote("(SBM0695)�I�[�_���̓o�^�ŃG���[���������܂����B �i�ڔԍ��F[" + psData.getCOMP_ITEM_CD() +
                                   "] �I�[�_���F[" + dmQty + "]  " + e);
                        return false;
                    }
                    finally {
                        closeStatement(stOd);
                    }
                }

                rsItem.close();
            } else {
                // 50509 �i�ڃf�[�^�����݂��܂���
                errCodeList.add("AC50509"); // �i�ڃf�[�^�����݂��܂���
                setErrNote("(SBM0688)�i�ڔԍ��F[" + psData.getCOMP_ITEM_CD() + "]");
                return false;
            }
        }
        finally {
            closeResultSet(rsItem);
            closePreparedStatement(stItem);
        }
        return true;
    }

    /*------------------------------------------------------*
     * �O���v����̓o�^
     * @param extPlanCd �O���v��ԍ�
     * @param odNo      �I�[�_�f�}���h�ԍ�
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean insertExtPlan(String extPlanCd, String odNo, int extLevel) {
        PreparedStatement stmt = null;
        //Statement stExtPlan = null;
        try {
            // �O���v��o�^�pSQL������
            String sql = "INSERT INTO T_EXTERNAL_PLAN ( "
                + " EXTERNAL_PLAN_CD"               // �O���v��ԍ�
                + ",OD_NO"                          // �I�[�_�f�}���h�ԍ�
                + ",PLANT_CD"                       // �H��R�[�h
                + ",EXTERNAL_PLAN_REG_TYP"          // �O���v��o�^�敪
                + ",EXTERNAL_PLAN_EXP_TYP"          // �O���v�揈���敪
                + ",EXTERNAL_PLAN_DEL_FLG"          // �O���v��폜�敪
                + ",EXTERNAL_EXP_INDEX"             // �O���v��W�J�C���f�b�N�X
                + ",EXTERNAL_LEVEL_NO"              // ���΃��x���ԍ�
                + ",CREATED_DATE"                   // �쐬��
                + ",CREATED_BY"                     // �쐬��
                + ",CREATED_PRG_NM"                 // �쐬�v���O������
                + ",UPDATED_DATE"                   // �X�V��
                + ",UPDATED_BY"                     // �X�V��
                + ",UPDATED_PRG_NM"                 // �X�V�v���O������
                + ",MODIFY_COUNT"                   // �X�V��
                + ") values ( ?, ?, ?, 2, 9, 0, ?, ?, SYSDATE, ?, ?, SYSDATE, ?, ?, 0) ";
            stmt = _conn.getConn().prepareStatement(sql);
            stmt.setString(1, extPlanCd);
            stmt.setString(2, odNo);
            stmt.setString(3, _plantCd);
            stmt.setInt(4, ++_expIndex);
            stmt.setInt(5, extLevel);
            stmt.setString(6, _userCd);
            stmt.setString(7, _strProgramName);
            stmt.setString(8, _userCd);
            stmt.setString(9, _strProgramName);
            stmt.executeUpdate();
        
        }
        catch (SQLException ex) {
            errCodeList.add("AC53401"); // Oracle Error
            String ErrMsg = "(SBM0696)�O���v��̓o�^�ŃG���[���������܂����B " +
                            "�O���v��ԍ��F[ " + extPlanCd + " ] " +
                            "�I�[�_�f�}���h�ԍ��F[ " + odNo + " ] ";
            setErrNote(ErrMsg);
            ex.printStackTrace();
            return false;
        }
        finally {
            closePreparedStatement(stmt);
            }
        return true;
    }

    /*------------------------------------------------------*
     * �O���v����̍X�V
     * @param extPlanCd �O���v��ԍ�
     * @return ����Ftrue  �ُ�Ffalse
     *------------------------------------------------------*/
    private boolean updateExtPlan(String extPlanCd, String odNo) {
        PreparedStatement stmt = null;
        try {
            stmt = _conn.getConn().prepareStatement(_updExtPlanSql);
            stmt.setString(1, _userCd);
            stmt.setString(2, _strProgramName);
            stmt.setString(3, extPlanCd);
            stmt.setString(4, odNo);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            String ErrMsg = "(SBM0696)�O���v��̍X�V�ŃG���[���������܂����B " +
                            "�O���v��ԍ��F[ " + extPlanCd + " ] " +
                            "�I�[�_�f�}���h�ԍ��F[ " + odNo + " ] ";
            setErrNote(ErrMsg);
            e.printStackTrace();
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }
        return true;
    }

    /**
     * �e��ԍ��̔�
     * @return �V�����̔Ԃ����ԍ�
     */
    private String getNewNumber(int collectKey) {
        String newNumber = "";
        try{
            Numbering cn = new Numbering( _conn, collectKey, _userCd, _strProgramName, _plantCd );
            newNumber = cn.getNo();
            cn = null;
        } catch (FoundationException ex) {
            return null;
        }
        return newNumber;
    }

//---------- �ȉ��A���ʃt�@���N�V���� ----------------------------------------
    /**
     * ���ʂ܂�߁i�؏グ�^�j
     * �����œn���ꂽ���ʁA�݌ɐ��ʒP�ʋ敪�����Ƃɐ��ʂ܂�߂��s���B
     *  1.�����Ǘ��ŁA�����������l�̏ꍇ�A�����l��؏グ�Đ����ɕϊ�����
     *  2.�����Ǘ��ŁA�����̏�����5�ʁ�0�̏ꍇ�A������5�ʂ�؏グ��
     *  3.�����Ǘ��ŁA�����̏�����5�ʁ�0�̏ꍇ�A������5�ʈȉ���؂�̂Ă�
     *
     * @param qty ����
     * @param unitQtyTyp �݌ɐ��ʒP�ʋ敪�ԍ�
     * @return ���ʂ܂�ߌ���
     */
    private String changeQtyUp(String qty, String unitQtyTyp){
        String  result = "0";
        Calculate calc = new Calculate();

        // �݌ɐ��ʒP�ʋ敪�������Ǘ�
        if ( unitQtyTyp.equals("1") ) {
            result = calc.ceil( qty, 0);
        }
        //�݌ɐ��ʒP�ʋ敪�������Ǘ�
        if ( unitQtyTyp.equals("2") ) {
            result = calc.ceil( qty, 4);
        }
        return result;
     }

    /**
     * ���t�V�t�g����
     * @param difference �V�t�g����
     * @param startDate ���
     * @return �V�t�g�������t
     */
    private Date shiftDate(String difference, Date startDate)
    {
        Date shiftDate = new Date();
        Calculate calc = new Calculate();
        int  diff = new Integer(calc.formatInteger(difference)).intValue();

        try{
            WorkCalendar workDay = new WorkCalendar( _conn, _userCd, _strProgramName,
                                           _plantCd, startDate, -diff, false );
            shiftDate = workDay.calcDate();
            workDay = null;
        }
        catch (FoundationException ex) {
            return null;
        }
        return shiftDate;
    }

    /**
     * PreparedStatement�����B
     *
     * @param statement ����Ώۂ�statment
     */
    private void closePreparedStatement(PreparedStatement statement)
    {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {}
        }
    }

    /**
     * Statement�����B
     *
     * @param statement ����Ώۂ�statment
     */
    private void closeStatement(Statement statement)
    {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {}
        }
    }

    /**
     * ResultSet�����B
     *
     * @param resultset ����Ώۂ�resultset
     */
    private void closeResultSet(ResultSet resultset)
    {
        if (resultset != null) {
            try {
                resultset.close();
            }
            catch (SQLException e){}
        }
    }

    /**
     * �Ɩ����b�Z�[�W�o�^����
     *
     * @return  true:���� / false:���s
     */
    private boolean businessMessageWrite()
    {
        boolean bResult = true;
        try
        {
            // metamorBase�Ɩ����b�Z�[�W
            BusinessMessageAccessor businessMsgAcc = null;
            BusinessMessage businessMsg = null;     // metamorBase�Ɩ����b�Z�[�W

            // �Ɩ����b�Z�[�W�̏���
            businessMsgAcc = new BusinessMessageAccessor();
            businessMsg = new BusinessMessage();
            businessMsgAcc.init(_conn);
            businessMsg.setBusinessOperatingName(_strProgramName);
            businessMsg.setUser(_userCd);
            businessMsg.setPlantCode(_plantCd);

            // �Ɩ����b�Z�[�W�̓o�^
            String errCode;
            String errNote;
            for(int i = 0; i < errCodeList.size(); i++)
            {
                errCode = (String)errCodeList.get(i);
                errNote = (String)errNoteHash.get(Integer.toString(i));
                try{
                    Numbering numbering = new Numbering(_conn, Numbering.LOG_CD, _userCd, _strProgramName, _plantCd);
                    businessMsg.setLogCode(numbering.getNo());
                    businessMsg.setMessageCode(errCode);
                    businessMsg.setData(errNote);
                    businessMsgAcc.add(businessMsg);
                }
                catch (FoundationException ex) {
                    ex.printStackTrace();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            bResult = false;
        }
        return bResult;
    }
}
