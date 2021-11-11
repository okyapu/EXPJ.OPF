/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/lot/BizCommon.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.lot;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.math.*;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * �v���V�[�W�����R�[�����ď��������s����N���X
 * �i�����i�e���v���[�g��p�N���X�j
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2013/06/27 02:06:08 $
 */
public class BizCommon {
    
    /**
     * �݌ɁA���o�ɍX�V�L�[
     */
    static final public int EXCUPDATEITEMSTOCKFD  = 1;
    
    /**
     * ���b�g�g���[�X�o�^�E�X�V�����L�[
     */
    static final public int EXCMAKELOTTRACEFD = EXCUPDATEITEMSTOCKFD + 1;
    
    /**
     * ���b�g�ʕi�ڍ݌ɓo�^�E�X�V�����L�[
     */
    static final public int EXCUPDATELOTSTOCKFD = EXCMAKELOTTRACEFD + 1;
    
    /**
     * �o�ו֐ݒ�L�[
     */
    static final public int GETDLVPLANTRANSFD = EXCUPDATELOTSTOCKFD + 1;
    
    /**
     * �݌Ɉ��������L�[
     */
    static final public int EXCINVALLOCFD = GETDLVPLANTRANSFD + 1;
    
    /**
     * �o�׎w���쐬�����L�[
     */
    static final public int EXCSHIPODRENTRYFD = EXCINVALLOCFD + 1;
    
    /**
     * �o�׎w���w�b�_�쐬�����L�[
     */
    static final public int EXCSHIPODRHENTRYFD = EXCSHIPODRENTRYFD + 1;
    
    /**
     * �o�׎��уw�b�_�쐬�����L�[
     */
    static final public int EXCSHIPHENTRYFD = EXCSHIPODRHENTRYFD + 1;
    
    /**
     * �o�׎��э쐬�����L�[
     */
    static final public int EXCSHIPENTRYFD = EXCSHIPHENTRYFD + 1;
    
    /**
     * �o�׎��у��b�g���׍쐬�����L�[
     */
    static final public int EXCSHIPLOTENTRYFD = EXCSHIPENTRYFD + 1;
    
    /**
     * �o�חp�݌�_���o�ɍX�V�L�[
     */
    static final public int EXCUPDATERESERVATIONFD = EXCSHIPLOTENTRYFD + 1;
    
    /**
     * �݌Ƀ��b�g�̔ԏ����L�[
     */
    static final public int GETSETLOTNUMBERINGFD = EXCUPDATERESERVATIONFD + 1;
    
    /**
     * �ܖ����������v�Z�L�[
     */
    static final public int CALCBESTBEFOREFD = GETSETLOTNUMBERINGFD + 1;
    
    /**
     * �̔��Ǘ����������L�[
     */
    static final public int INITSALESPROCFD  = CALCBESTBEFOREFD + 1;
    
    /**
     * �󒍃w�b�_�쐬�����L�[
     */
    static final public int EXCORDERHENTRYFD = INITSALESPROCFD + 1;
    
    
    /**
     * �󒍖��׍쐬�����L�[
     */
    static final public int EXCORDERENTRYFD = EXCORDERHENTRYFD + 1;
    

    /**
     * ���|IF�����L�[
     */
    static final public int EXCARFIFFD = EXCORDERENTRYFD + 1;
    
    
    /**
     * 0�l�ݒ�p
     */
    static final  BigDecimal BIG_DECIMAL_ZERO  = BigDecimal.valueOf(0);
    
    

    
	static final Integer STATUS_NORMAL  = Integer.valueOf("1");	// ���ʃX�e�[�^�X(1:����I��)
	static final Integer STATUS_WARNING = Integer.valueOf("2");	// ���ʃX�e�[�^�X(2:�x���I��)
	static final Integer STATUS_ERROR   = Integer.valueOf("3");	// ���ʃX�e�[�^�X(3:�ُ�I��)
	
    protected int collectKey = 0;
    protected String userCd = null;
    protected String businessCd = null;
    protected String plantCd = null;
    protected String logMode = null;
    protected String outPutMode = null;
    protected String outPutPath = null;
    protected String outPutName = null;
    protected SystemLog sysLog = null;
    protected IDbConnection conn = null;
    protected Integer resultStatus = null;
    protected List resultList = null;
    protected String messageId = null;
    protected List messageIdList = null;
    protected int resultchk = 0;

    protected OrderHeader _orderHeader = null;
    protected String messageIdLine = null;
    
    /*********************************************************************
     *** ���ʊ֐�
     *********************************************************************/
    
    
    /**
     * �R���X�g���N�^
     * @param  conn         DB�R�l�N�V����
     * @param  userCd       ���[�U�R�[�h
     * @param  businessCd   �Ɩ��R�[�h
     * @param  plantCd      �H��R�[�h
     */
    public BizCommon(IDbConnection conn, String userCd,
                     String businessCd, String plantCd) throws
        FoundationException {
        this.conn = conn;
        this.userCd = userCd;
        this.businessCd = businessCd;
        this.plantCd = plantCd;

        this.readProperty();
    }

    /**
     * �݌ɁA���o�ɍX�V  <BR>
     *
     * @param  rcvIssueCtrlCd  ���o�ɊǗ��ԍ�
     * @param  shipQty  �o�׍ϐ���
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excUpdateItemStockFd(String rcvIssueCtrlCd,String shipQty) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCUPDATEITEMSTOCKFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, rcvIssueCtrlCd); //���o�ɊǗ��ԍ�
            adapt.setString(9, shipQty); //�o�׍ϐ���
            adapt.setOutString(10); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(11); //�������ʁi���ʃX�e�[�^�X�j

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(11);
            
            for(int i =10 ; i< 11 ; i++){
                //�������ʂ̊i�[
                if(adapt.getOutString(i) == null){
                    resultList.add(""); 
                }else{
                    resultList.add(adapt.getOutString(i)); 
                }
            }
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * ���b�g�g���[�X�o�^�E�X�V����  <BR>
     *
     * @param  fromItemCd  ���i�ڃR�[�h
     * @param  fromLotNo  �����b�g�ԍ�
     * @param  toItemCd  ��i�ڃR�[�h
     * @param  toLotNo  �惍�b�g�ԍ�
     * @param  lotTraceTyp  �敪
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excMakeLotTraceFd(String fromItemCd,String fromLotNo,String toItemCd,String toLotNo,String lotTraceTyp) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCMAKELOTTRACEFD;
        
        this.resultStatus = null;
        this.messageId =null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, fromItemCd); //���i�ڃR�[�h
            adapt.setString(9, fromLotNo); //�����b�g�ԍ�
            adapt.setString(10, toItemCd); //��i�ڃR�[�h
            adapt.setString(11, toLotNo); //�惍�b�g�ԍ�
            adapt.setString(12, lotTraceTyp); //�敪
            adapt.setOutString(13); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(14); //�������ʁi���ʃX�e�[�^�X�j

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(14);
        
            //�������ʂ̊i�[
            for(int i =13 ; i< 14 ; i++){
                if(adapt.getOutString(i) == null){
                    resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
                }else{
                    resultList.add(adapt.getOutString(i)); 
                }
            }
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }   
    
    /**
     * ���b�g�ʕi�ڍ݌ɓo�^�E�X�V����  <BR>
     *
     * @param  rcvIssueCtrlCd  ���o�ɊǗ��ԍ�
     * @param  shipQty  �o�׍ϐ���
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excUpdateLotStockFd(String rcvIssueCtrlCd,String shipQty) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCUPDATELOTSTOCKFD;
        
        this.resultStatus = null;
        this.messageId =null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, rcvIssueCtrlCd); //���o�ɊǗ��ԍ�
            adapt.setString(9, shipQty); //�o�׍ϐ���
            adapt.setOutString(10); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(11); //�������ʁi���ʃX�e�[�^�X�j
        
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(11);
            
            //�������ʂ̊i�[
            for(int i =10 ; i< 11 ; i++){
                if(adapt.getOutString(i) == null){
                    resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
                }else{
                    resultList.add(adapt.getOutString(i)); 
                }
            }
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * �o�ו֐ݒ�  <BR>
     *
     * @param  companyCd  ��ЃR�[�h
     * @param  custCd  ���Ӑ�R�[�h
     * @param  delvCd  �[�i�ꏊ�R�[�h
     * @param  shipwhCd  �o�בq�ɃR�[�h
     * @param  itemCd  �i�ڔԍ�
     * @param  transportCd  �^���փR�[�h
     * @param  custDlvPlanTransNo  ���Ӑ�[���\��֔ԍ�
     * @param  inHouseShipPlanTransNo  �Г��o�ח\��֔ԍ�
     * @param  desinatedDlvDate  �w��[��
     * @param  shipPlanDate  �o�ח\���
     * @return �擾���ʂ��i�[�������X�g (1:�^���փR�[�h 2:���Ӑ�[���\��֔ԍ� 3:�Г��o�ו֔ԍ� 4:�[���\����� 5:�o�ח\����� 6:�Z�b�g�J�n���� 7:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List getDlvPlanTransFd(String companyCd,String custCd,String delvCd,String shipwhCd,String itemCd,
        String transportCd,String custDlvPlanTransNo,String inHouseShipPlanTransNo,String desinatedDlvDate,String shipPlanDate,String appTyp) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = GETDLVPLANTRANSFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, companyCd); //��ЃR�[�h
            adapt.setString(9, custCd); //���Ӑ�R�[�h
            adapt.setString(10, delvCd); //�[�i�ꏊ�R�[�h
            adapt.setString(11, shipwhCd); //�o�בq�ɃR�[�h
            adapt.setString(12, itemCd); //�i�ڔԍ�
            adapt.setString(13, transportCd); //�^���փR�[�h
            adapt.setString(14, custDlvPlanTransNo); //���Ӑ�[���\��֔ԍ�
            adapt.setString(15, inHouseShipPlanTransNo); //�Г��o�ח\��֔ԍ�
            adapt.setString(16, desinatedDlvDate); //�w��[��
            adapt.setString(17, shipPlanDate); //�o�ח\���
            adapt.setString(18,appTyp);			// �����v��敪
            adapt.setOutString(19); //�������ʁi�^���փR�[�h)
            adapt.setOutString(20); //�������ʁi���Ӑ�[���\��֔ԍ�)
            adapt.setOutString(21); //�������ʁi�Г��o�ו֔ԍ�)
            adapt.setOutString(22); //�������ʁi�[���\�����)
            adapt.setOutString(23); //�������ʁi�o�ח\�����)
            adapt.setOutString(24); //�������ʁi�Z�b�g�J�n����)
            adapt.setOutString(25); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(26); //�������ʁi���ʃX�e�[�^�X�j
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[

            this.resultStatus = adapt.getOutInteger(26);
            
            //�������ʂ̊i�[
            for(int i =19 ; i< 26 ; i++){
                if(adapt.getOutString(i) == null){
                    resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
                }else{
                    resultList.add(adapt.getOutString(i)); 
                }
            }
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }   
    
    /**
     * �݌Ɉ�������  <BR>
     *
     * @param  companylCd  ��ЃR�[�h
     * @param  odrDSeqNo  �󒍓`�[�ԍ�
     * @param  odrDSeqNo  �󒍖��ה����A��
     * @param  partDlvSeqNo  �o�׌v�敪�[����
     * @param  lotNo  �w�胍�b�g�ԍ�
     * @param  itemCd  �݌ɕi�ڔԍ�
     * @param  rsvQty  ��������
     * @param  reserveTyp  ���������敪
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excInvAllocFd(String companylCd,String odrHNo,String odrDSeqNo,String partDlvSeqNo,String lotNo,
        String itemCd,String rsvQty,String reserveTyp) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCINVALLOCFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, companylCd); //��ЃR�[�h
            adapt.setString(9, odrHNo); //�󒍓`�[�ԍ�
            adapt.setString(10, odrDSeqNo); //�󒍖��ה����A��
            adapt.setString(11, partDlvSeqNo); //�o�׌v�敪�[����
            adapt.setString(12, lotNo); //�w�胍�b�g�ԍ�
            adapt.setString(13, itemCd); //�݌ɕi�ڔԍ�
            adapt.setString(14, rsvQty); //��������
            adapt.setString(15, reserveTyp); //���������敪
            adapt.setOutString(16); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(17); //�������ʁi���ʃX�e�[�^�X�j
        
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(17);
            
            //�������ʂ̊i�[
            for(int i =16 ; i< 17 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * �o�׎w���쐬����  <BR>
     *
     * @param  companylCd    ��ЃR�[�h
     * @param  odrHNo        �󒍓`�[�ԍ�
     * @param  odrDSeqNo     �󒍖��ה����A��
     * @param  partDlvSeqNo  �o�׌v�敪�[����
     * @param  entryTyp      �f�[�^���͋敪
     * @param  updateTyp     �X�V�敪
     * @return �擾���ʂ��i�[�������X�g (:�G���[�R�[�h :���ʃX�e�[�^�X *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excShipOdrEntryFd(String companylCd,String odrHNo,String odrDSeqNo,
        String partDlvSeqNo,String entryTyp, String updateTyp)throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCSHIPODRENTRYFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, companylCd); //��ЃR�[�h
            adapt.setString(9, odrHNo); //�󒍓`�[�ԍ�
            adapt.setString(10, odrDSeqNo); //�󒍖��ה����A��
            adapt.setString(11, partDlvSeqNo); //�o�׌v�敪�[����
            adapt.setString(12, entryTyp); //�f�[�^���͋敪
            adapt.setString(13, updateTyp); //�X�V�敪
            adapt.setOutString(14); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(15); //�������ʁi���ʃX�e�[�^�X�j
                    
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(15);
            
            //�������ʂ̊i�[
            for(int i =14 ; i< 15 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * �o�׎w���w�b�_�쐬����  <BR>
     *
     * @param  companylCd  ��ЃR�[�h
     * @param  entryTyp  �f�[�^���͋敪
     * @param  shipDlvHNo  �o�ה[�i�`�[�ԍ�
     * @param  updateTyp  �X�V�敪
     * @return �擾���ʂ��i�[�������X�g (:�o�׎w���w�b�_�o�^���� :�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excShipOdrHEntryFd(String companylCd,String entryTyp,String shipDlvHNo,String updateTyp) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCSHIPODRHENTRYFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, companylCd); //��ЃR�[�h
            adapt.setString(9, entryTyp); //�f�[�^���͋敪
            adapt.setString(10, shipDlvHNo); //�o�ה[�i�`�[�ԍ�
            adapt.setString(11, updateTyp); //�X�V�敪
            adapt.setOutString(12); //�������ʁi�o�׎w���w�b�_�o�^����)
            adapt.setOutString(13); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(14); //�������ʁi���ʃX�e�[�^�X�j

        
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(14);
            
            //�������ʂ̊i�[
            for(int i =12 ; i< 14 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }

    /**
     * �o�׎��уw�b�_�쐬����  <BR>
     * @param  companyCd        ��ЃR�[�h
     * @param  shipDlvHNo   �o�ה[�i�`�[�ԍ�
     * @param  custCd       ���Ӑ�R�[�h
     * @param  billAddresseCd  ������R�[�h
     * @param  dlvLocCd         �[�i��R�[�h
     * @param  shipWhCd         �o�בq�ɃR�[�h
     * @param  salesDeptCd      ����v�㕔��R�[�h
     * @param  custChrgPsnCd    �c�ƒS���҃R�[�h
     * @param  shipDate         �o�׎��ѓ�
     * @param  orgShipDlvHNo    ���o�ה[�i�`�[�ԍ�
     * @param  modeTyp          �X�V�敪(1:�o�^�A2:����A3:�ԕi�o�^�A4:�ԕi�C���A5:�ԕi����A6:�ԕi�o�^(���`����))
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excShipHEntryFd(String companyCd,String shipDlvHNo,
                                    String custCd,String billAddresseCd,
                                    String dlvLocCd,String shipWhCd,
                                    String salesDeptCd,String custChrgPsnCd,
                                    String shipDate,String orgShipDlvHNo,String modeTyp) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || this.logMode == null ||
                this.outPutMode == null || this.outPutPath == null || this.outPutName == null) {
            return null;
        }
        this.collectKey = EXCSHIPHENTRYFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       //LOG���[�h
            adapt.setString(2, this.outPutMode);    //�o�̓��[�h
            adapt.setString(3, this.outPutPath);    //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName);    //�o�̓t�@�C����
            adapt.setString(5, this.userCd);        //���[�UID
            adapt.setString(6, this.businessCd);    //�Ɩ���
            adapt.setString(7, this.plantCd);       //�H��R�[�h
            adapt.setString(8, companyCd);          //��ЃR�[�h
            adapt.setString(9, shipDlvHNo);         //�o�ה[�i�`�[�ԍ�
            adapt.setString(10, custCd);            //���Ӑ�R�[�h
            adapt.setString(11, billAddresseCd);    //������R�[�h
            adapt.setString(12, dlvLocCd);          //�[�i��R�[�h
            adapt.setString(13, shipWhCd);          //�o�בq�ɃR�[�h
            adapt.setString(14, salesDeptCd);       //����v�㕔��R�[�h
            adapt.setString(15, custChrgPsnCd);     //�c�ƒS���҃R�[�h
            adapt.setString(16, shipDate);          //�o�׎��ѓ�
            adapt.setString(17, orgShipDlvHNo);     //���o�ה[�i�`�[�ԍ�
            adapt.setString(18, modeTyp);           //�X�V�敪
            adapt.setOutString(19);                 //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(20);                //�������ʁi���ʃX�e�[�^�X�j
        
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(20);
            
            //�������ʂ̊i�[
            for(int i =19 ; i< 20 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * �o�׎��э쐬����  <BR>
     * @param  companyCd            ��ЃR�[�h
     * @param  shipDlvHNo       �o�ה[�i�`�[�ԍ�
     * @param  shipDlvDNo       �o�ה[�i�`�[���הԍ�
     * @param  custItemCd       ���Ӑ�R�[�h
     * @param  shipDate             �o�׎��ѓ�
     * @param  itemCd           �i�ڔԍ�
     * @param  custShipQty          ���Ӑ���ѐ���
     * @param  shipQty              ���ѐ���
     * @param  shipUnitCd       �o�גP��
     * @param  unitCd           �v�ʒP��
     * @param  shipUnitPrice        �P��
     * @param  remarks              ���l
     * @param  procTyp              �����敪
     * @param  orgshipDlvHNo        ���o�ה[�i�`�[�ԍ�
     * @param  orgshipDlvDNo        ���o�ה[�i�`�[���הԍ�
     * @param  modeTyp              �X�V�敪(1:�o�^�A2:����A3:�ԕi�o�^�A4:�ԕi�C���A5:�ԕi����A6:�ԕi�o�^(���`����))
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excShipEntryFd(String companyCd,String shipDlvHNo,String shipDlvDNo,
                                String custCd,String shipDate,String itemCd ,String custShipQty,String shipQty,String shipUnitCd,
                                    String unitCd,String shipUnitPrice,String remarks,String procTyp,
                                    String orgshipDlvHNo,String orgshipDlvDNo,String modeTyp) 
        throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCSHIPENTRYFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       //LOG���[�h
            adapt.setString(2, this.outPutMode);    //�o�̓��[�h
            adapt.setString(3, this.outPutPath);    //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName);    //�o�̓t�@�C����
            adapt.setString(5, this.userCd);        //���[�UID
            adapt.setString(6, this.businessCd);    //�Ɩ���
            adapt.setString(7, this.plantCd);       //�H��R�[�h
            adapt.setString(8, companyCd);          //��ЃR�[�h
            adapt.setString(9, shipDlvHNo);         //�o�ה[�i�`�[�ԍ�
            adapt.setString(10, shipDlvDNo);        //�o�ה[�i�`�[���הԍ�
            adapt.setString(11, custCd);            //���Ӑ�i�ڔԍ�
            adapt.setString(12, shipDate);           //���Ӑ�i�ڔԍ�
            adapt.setString(13, itemCd);            //�i�ڔԍ�
            adapt.setString(14, custShipQty);       //���Ӑ���ѐ���
            adapt.setString(15, shipQty);           //���ѐ���
            adapt.setString(16, shipUnitCd);        //�o�גP��
            adapt.setString(17, unitCd);            //�v�ʒP��
            adapt.setString(18, shipUnitPrice);     //�P��
            adapt.setString(19, remarks);           //���l
            adapt.setString(20, procTyp);           //�����敪
            adapt.setString(21, orgshipDlvHNo);     //���o�ה[�i�`�[�ԍ�
            adapt.setString(22, orgshipDlvDNo);     //���o�ה[�i�`�[���הԍ�
            adapt.setString(23, modeTyp);           //���[�h
            adapt.setOutString(24);                 //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(25);                //�������ʁi���ʃX�e�[�^�X�j
        
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(25);
            
            //�������ʂ̊i�[
            for(int i =24 ; i< 25 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * �o�׎��у��b�g���׍쐬����  <BR>
     * @param  companyCd            ��ЃR�[�h
     * @param  shipDlvHNo       �o�ה[�i�`�[�ԍ�
     * @param  shipDlvDNo       �o�ה[�i�`�[���הԍ�
     * @param  shipDate         �@�@�o�׎��ѓ�
     * @param  shipWhcd             �o�בq�ɃR�[�h
     * @param  shipItemCd       �o�וi�ڔԍ�
     * @param  lotNo                �݌Ƀ��b�g�ԍ�
     * @param  lotCustShipQty   ���b�g���Ӑ���ѐ���
     * @param  lotShipQty       ���b�g���ѐ���
     * @param  shipUnitCd       �o�גP��
     * @param  unitCd           �v�ʒP��
     * @param  shipReturnCause      �o�וԕi���R
     * @param  orgshipDlvHNo        ���o�ה[�i�`�[�ԍ�
     * @param  orgshipDlvDNo        ���o�ה[�i�`�[���הԍ�
     * @param  orgLotNo             ���݌Ƀ��b�g�ԍ�
     * @param  modeTyp              �X�V�敪(1:�o�^ 2:����A3:�ԕi�o�^�A4:�ԕi�C���A5:�ԕi����A6: �ԕi�o�^�i���`����))
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excShipLotEntryFd(String companyCd,String shipDlvHNo,String shipDlvDNo,
                                    String shipDate,String shipWhcd ,
                                    String shipItemCd,String lotNo,
                                    String lotCustShipQty,String lotShipQty,
                                    String shipunitCd,String unitCd,
                                    String shipReturnCause,
                                    String orgshipDlvHNo,String orgshipDlvDNo,String orgLotNo,
                                    String modeTyp) 
        throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCSHIPLOTENTRYFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       //LOG���[�h
            adapt.setString(2, this.outPutMode);    //�o�̓��[�h
            adapt.setString(3, this.outPutPath);    //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName);    //�o�̓t�@�C����
            adapt.setString(5, this.userCd);        //���[�UID
            adapt.setString(6, this.businessCd);    //�Ɩ���
            adapt.setString(7, this.plantCd);       //�H��R�[�h
            adapt.setString(8, companyCd);          //��ЃR�[�h
            adapt.setString(9, shipDlvHNo);         //�o�ה[�i�`�[�ԍ�
            adapt.setString(10, shipDlvDNo);        //�o�ה[�i�`�[���הԍ�
            adapt.setString(11, shipDate);          //�o�׎��ѓ�
            adapt.setString(12, shipWhcd);          //�o�בq�ɃR�[�h
            adapt.setString(13, shipItemCd);        //�o�וi�ڔԍ�
            adapt.setString(14, lotNo);             //�݌Ƀ��b�g�ԍ�
            adapt.setString(15, lotCustShipQty);    //���b�g���Ӑ���ѐ���
            adapt.setString(16, lotShipQty);        //���b�g���ѐ���
            adapt.setString(17, shipunitCd);        //�o�גP��
            adapt.setString(18, unitCd);            //�v�ʒP��
            adapt.setString(19, shipReturnCause);   //�ԕi���R
            adapt.setString(20, orgshipDlvHNo);     //���o�ה[�i�`�[�ԍ�
            adapt.setString(21, orgshipDlvDNo);     //���o�ה[�i�`�[���הԍ�
            adapt.setString(22, orgLotNo);          //���݌Ƀ��b�g�ԍ�
            adapt.setString(23, modeTyp);           //�X�V�敪
            adapt.setOutString(24);                 //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(25);                //�������ʁi���ʃX�e�[�^�X�j
        
            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(25);
            
            //�������ʂ̊i�[
            for(int i =24 ; i< 25 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * �󒍃w�b�_�G���[�`�F�b�N���� <BR>
     * @param  oredrHeader            	�󒍃w�b�_�쐬�i�[�p�ϐ�
     * @param  
     * @return �󒍃w�b�_�쐬�i�[�p�ϐ�
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public OrderHeader checkOrderHFd(OrderHeader orderHeader) 
        throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        
        this.resultStatus = null;
        this.messageId =null;

        try {
        	_orderHeader = orderHeader;
        	if (!callkOrderHEntryFd(OrderHeader.EXC_DIV_VAL)){
        		this.resultStatus = STATUS_ERROR;
        		return _orderHeader;
        	}
        	// ���׏��ɂ�null��ݒ�
        	_orderHeader.orderLines(null);
        }catch (Exception  e){
        	e.printStackTrace();
        }
        return _orderHeader;
    }
    
    /**
     * �󒍖��׃G���[�`�F�b�N���� <BR>
     * @param  OrderLine            	�󒍖��׍쐬�i�[�p�ϐ�
     * @param  
     * @return �󒍖��׍쐬�i�[�p�ϐ�
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public OrderLine checkOrderDEntryFd(OrderLine orderLine) 
        throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.resultStatus = null;
        this.messageId =null;
        try {
        	// ���׍쐬���i���m�F�ŌĂ�     	
        	orderLine = callOrderDEntryFd(orderLine,OrderLine.EXC_DIV_VAL);
			
			// ���b�Z�[�WID�̐ݒ�
        	this.messageId=this.messageIdLine;
			
        }catch (Exception  e){
        	e.printStackTrace();
        }
        return orderLine;
    }
    
    /**
     * �󒍃G���[�`�F�b�N���� <BR>
     * @param  oredrHeader            	�󒍃w�b�_�쐬�i�[�p�ϐ�
     * @param  
     * @return �󒍃w�b�_�쐬�i�[�p�ϐ�
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public OrderHeader valOrderHEntryFd(OrderHeader orderHeader) 
        throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        
        try {
        	_orderHeader = orderHeader;
        	
        	// ���s�������s��
        	if (!callkOrderHEntryFd(OrderHeader.EXC_DIV_VAL)){
        		this.resultStatus = STATUS_ERROR;
        		return _orderHeader;
        	}
            
            // ���s�敪��1(�m�F)�̏ꍇ�͍Ō�Ɏ󒍖��׍쐬�������s��
    		// �󒍖��׍쐬�Ŏ��s�����ꍇ�͏����𔲂���
    		if (!excOrderLine(OrderLine.EXC_DIV_VAL)){
    			this.resultStatus = STATUS_ERROR;
    			return _orderHeader;
    		}	
    		
        	
        }catch (Exception  e){
        	e.printStackTrace();
        }
        return _orderHeader;
    }
    
    /**
     * �󒍍쐬���� <BR>
     * @param  oredrHeader            	�󒍃w�b�_�쐬�i�[�p�ϐ�
     * @param  
     * @return �󒍃w�b�_�쐬�i�[�p�ϐ�
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public OrderHeader excOrderHEntryFd(OrderHeader orderHeader) 
        throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        
        try {
        	_orderHeader = orderHeader;
        	
        	// �`�F�b�N�w�b�_����l���擾���邽�߃`�F�b�N��ʂ�
        	if (!callkOrderHEntryFd(OrderHeader.EXC_DIV_VAL)){
        		this.resultStatus = STATUS_ERROR;
        		return _orderHeader;
        	}
        	
			
        	// �����敪1(�o�^�̏ꍇ)�͎󒍓`�[�ԍ����̔Ԃ���
			if( OrderHeader.PROC_DIV_REG.equals(orderHeader.procDiv())){
				String orderHno =getOrderHNo();
				if (orderHno == null){
					this.messageId ="KQ20101";
					this.resultStatus = STATUS_ERROR;
					return _orderHeader;
				}
				_orderHeader.orderHNo(orderHno);
			}

			//�@��Ɏ󒍖��׍쐬�������s��
    		if (!excOrderLine(OrderLine.EXC_DIV_EXC)){
    			this.resultStatus = STATUS_ERROR;
    			return _orderHeader;
    		}
        	
        	// �w�b�_�쐬�������s��
        	if (!callkOrderHEntryFd(OrderHeader.EXC_DIV_EXC)){
        		this.resultStatus = STATUS_ERROR;
        		return _orderHeader;
        	}
            
        }catch (Exception  e){
        	e.printStackTrace();
        }
        return _orderHeader;
    }
 

    
    /**
     * �o�חp�݌�_���o�ɍX�V  <BR>
     * @param  odrHNo           �󒍓`�[�ԍ�
     * @param  odrDSeqNo            �󒍖��ה����A��
     * @param  partDlvSeqNo         �o�׌v�敪�[����
     * @param  rcvIssueCtrlCd   ���o�ɊǗ��ԍ�
     * @param  shipCompleteFlg      �o�׍σt���O
     * @param  procTyp              �����敪(1:�o�ׁA2:�ԕi)
     * @return �擾���ʂ��i�[�������X�g (1:�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excUpdateReservationFd(String odrHNo,String odrDSeqNo,String partDlvSeqNo,
        String rcvIssueCtrlCd,String shipCompleteFlg,String procTyp) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCUPDATERESERVATIONFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8,odrHNo); //�󒍓`�[�ԍ�
            adapt.setString(9, odrDSeqNo); //�󒍖��ה����A��
            adapt.setString(10, partDlvSeqNo); //�o�׌v�敪�[����
            adapt.setString(11, rcvIssueCtrlCd); //���o�ɊǗ��ԍ�
            adapt.setString(12, shipCompleteFlg); //�o�׍σt���O
            adapt.setString(13, procTyp); //�o�׍σt���O
            adapt.setOutString(14); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(15); //�������ʁi���ʃX�e�[�^�X�j

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(15);
        
            //�������ʂ̊i�[
            for(int i =14 ; i< 15 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
/**
	 * �݌Ƀ��b�g�̔ԏ���  <BR>
	 *
	 * @param  itemCd  �i�ڔԍ�
	 * @param  prdCmpltDate  ������t/�������t
	 * @return �擾���ʂ��i�[�������X�g (:�݌Ƀ��b�g�ԍ� :�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
	 * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
	 */
	public List getsetLotNumberingFd(String itemCd,String prdCmpltDate) throws FoundationException {
				
		//�����`�F�b�N
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}
		this.collectKey = GETSETLOTNUMBERINGFD;
		
		this.resultStatus = null;
		this. resultList = new ArrayList();		
			
		IDbAdapter adapt = null;

		try {
			adapt =this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOG���[�h
			adapt.setString(2, this.outPutMode); //�o�̓��[�h
			adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
			adapt.setString(4, this.outPutName); //�o�̓t�@�C����
			adapt.setString(5, this.userCd); //���[�UID
			adapt.setString(6, this.businessCd); //�Ɩ���
			adapt.setString(7, this.plantCd); //�H��R�[�h
			adapt.setString(8, itemCd); //�i�ڔԍ�
			adapt.setString(9, prdCmpltDate); //������t/�������t
			adapt.setOutString(10); //�������ʁi�݌Ƀ��b�g�ԍ�)
			adapt.setOutString(11); //�������ʁi�G���[�R�[�h)
			adapt.setOutInteger(12); //�������ʁi���ʃX�e�[�^�X�j

			adapt.execUpdate();

			//���ʃX�e�[�^�X�̊i�[
			this.resultStatus = adapt.getOutInteger(12);
			
			//�������ʂ̊i�[
			for(int i =10 ; i< 12 ; i++)
			if(adapt.getOutString(i) == null){
				resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
			}else{
				resultList.add(adapt.getOutString(i)); 
			}
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return resultList;
	}
    
    /**
     * �ܖ����������v�Z  <BR>
     *
     * @param  itemCd  �i�ڔԍ�
     * @param  prdCmpltDate  ������t/�������t
     * @return �擾���ʂ��i�[�������X�g (:�ܖ����� :�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List calcBestBeforeFd(String itemCd,String prdCmpltDate) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = CALCBESTBEFOREFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); //LOG���[�h
            adapt.setString(2, this.outPutMode); //�o�̓��[�h
            adapt.setString(3, this.outPutPath); //�o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); //�o�̓t�@�C����
            adapt.setString(5, this.userCd); //���[�UID
            adapt.setString(6, this.businessCd); //�Ɩ���
            adapt.setString(7, this.plantCd); //�H��R�[�h
            adapt.setString(8, itemCd); //�i�ڔԍ�
            adapt.setString(9, prdCmpltDate); //������t/�������t
            adapt.setOutString(10); //�������ʁi�ܖ�����)
            adapt.setOutString(11); //�������ʁi�G���[�R�[�h)
            adapt.setOutInteger(12); //�������ʁi���ʃX�e�[�^�X�j

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(12);
            
            //�������ʂ̊i�[
            for(int i =10 ; i< 12 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }

    /**
     * �̔��Ǘ���������  <BR>
     *
     * @param �@
     * @param  
     * @return �擾���ʂ��i�[�������X�g (: :�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List InitSalesProcFd() throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = INITSALESPROCFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); 		// LOG���[�h
            adapt.setString(2, this.outPutMode); 	// �o�̓��[�h
            adapt.setString(3, this.outPutPath); 	// �o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); 	// �o�̓t�@�C����
            adapt.setString(5, this.userCd); 		// ���[�UID
            adapt.setString(6, this.businessCd); 	// �Ɩ���
            adapt.setString(7, this.plantCd); 		// �H��R�[�h
            adapt.setOutString(5); 					// �������ʁi���[�UID)
            adapt.setOutString(8); 					// �������ʁi��ЃR�[�h)
            adapt.setOutString(9); 					// �������ʁi�̔��Ǘ��p�H��R�[�h)
            adapt.setOutString(10); 				// �������ʁi����R�[�h)
            adapt.setOutString(11); 				// �������ʁi���喼)
            adapt.setOutString(12); 				// �������ʁi���[�U��)
            adapt.setOutString(13); 				// �������ʁi�Ɩ��^�p��)
            adapt.setOutString(14); 				// �������ʁi�M�݃R�[�h)
            adapt.setOutString(15); 				// �������ʁi�G���[�R�[�h)
            adapt.setOutInteger(16); 				// �������ʁi���ʃX�e�[�^�X�j

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(16);
            if(adapt.getOutString(5) == null){
            	resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
            	resultList.add(adapt.getOutString(5));	
            }
             
            //�������ʂ̊i�[
            for(int i =8 ; i< 16 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * ���|IF��������  <BR>
     *
     * @param  procDiv		�����敪(1:�o�׎���/�o�וԕi�A2:��́E����/��́E����(�ԕi)�A3:���̑�����
     * @param  updDiv		�X�V�敪(1:�o�^�A2:����A3:�C��)
     * @param  SlipCd		�`�[�ԍ�(�o�ה[�i�`�[�ԍ��A�o�ה[�i�E���̑�����`�[�ԍ�)
     * @return �擾���ʂ��i�[�������X�g (: :�G���[�R�[�h *��O�F�G���[���Ŗ��擾�̏ꍇ�T�C�Y�O�̃��X�g)
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    public List excArfIFFd(int procDiv, int updDiv, String SlipCd) throws FoundationException {
                
        //�����`�F�b�N
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCARFIFFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode); 		// LOG���[�h
            adapt.setString(2, this.outPutMode); 	// �o�̓��[�h
            adapt.setString(3, this.outPutPath); 	// �o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName); 	// �o�̓t�@�C����
            adapt.setString(5, this.userCd); 		// ���[�UID
            adapt.setString(6, this.businessCd); 	// �Ɩ���
            adapt.setString(7, this.plantCd); 		// �H��R�[�h
            adapt.setString(8, SlipCd); 			// �`�[�ԍ�
            adapt.setInt(9, procDiv); 				// �����敪
            adapt.setInt(10,updDiv); 				// �X�V�敪
            adapt.setOutString(11); 				// �������ʁi�G���[�R�[�h)
            adapt.setOutInteger(12); 				// �������ʁi���ʃX�e�[�^�X�j

            adapt.execUpdate();

            //���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(12);
            if(adapt.getOutString(11) == null){
            	resultList.add("");    //�������ʂ�NULL�ł������ꍇ�󔒂��Z�b�g
            }else{
            	resultList.add(adapt.getOutString(11));	
            }
             
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    
    /*********************************************************************
     *** �v���C�x�[�g�֐�
     *********************************************************************/
    
    /**
     * IDbAdapter�̕ԋp
     *
     * @param  conn IDbConnection
     * @return  collectKey�ɂ��IDbAdapter���擾
     * @throws FoundationException
     */
    private IDbAdapter getAdapt(IDbConnection conn) throws FoundationException {

        //collectKey�ɂ��SP���i�̌Ăяo����؂蕪����
        switch (this.collectKey) {
            case EXCUPDATEITEMSTOCKFD:      //�݌ɁA���o�ɍX�V
                return conn.getSpAdapter("begin SQLEXCUPDATEITEMSTOCKFD(?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCMAKELOTTRACEFD:         //���b�g�g���[�X�o�^�E�X�V����
                return conn.getSpAdapter("begin SQLEXCMAKELOTTRACEFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCUPDATELOTSTOCKFD:       //���b�g�ʕi�ڍ݌ɓo�^�E�X�V����
                return conn.getSpAdapter("begin SQLEXCUPDATELOTSTOCKFD(?,?,?,?,?,?,?,?,?,?,?); end;");
            case GETDLVPLANTRANSFD:         //�o�ו֐ݒ�
                return conn.getSpAdapter("begin SQLGETDLVPLANTRANSFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCINVALLOCFD:             //�݌Ɉ�������
                return conn.getSpAdapter("begin SQLEXCINVALLOCFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCSHIPODRENTRYFD:         //�o�׎w���쐬����
                return conn.getSpAdapter("begin SQLEXCSHIPODRENTRYFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCSHIPODRHENTRYFD:        //�o�׎w���w�b�_�쐬����
                return conn.getSpAdapter("begin SQLEXCSHIPODRHENTRYFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCSHIPHENTRYFD:           //�o�׎��уw�b�_�쐬����
                return conn.getSpAdapter("begin SQLEXCSHIPHENTRYFD(?,?,?,?,?," +
                                                                     "?,?,?,?,?," +
                                                                     "?,?,?,?,?," +
                                                                     "?,?,?,?,?); end;");
            case EXCSHIPENTRYFD:            //�o�׎��э쐬����
                return conn.getSpAdapter("begin SQLEXCSHIPENTRYFD(?,?,?,?,?," +
                                                                   "?,?,?,?,?," +
                                                                   "?,?,?,?,?," +
                                                                   "?,?,?,?,?," +
                                                                   "?,?,?,?,?); end;");
            case EXCSHIPLOTENTRYFD:         //�o�׎��у��b�g���׍쐬����
                return conn.getSpAdapter("begin SQLEXCSHIPLOTENTRYFD(?,?,?,?,?," +
                                                                        "?,?,?,?,?," +
                                                                        "?,?,?,?,?," +
                                                                        "?,?,?,?,?," +
                                                                        "?,?,?,?,?); end;");
            case EXCUPDATERESERVATIONFD:    //�o�חp�݌�_���o�ɍX�V
                return conn.getSpAdapter("begin SQLEXCUPDATERESERVATIONFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case GETSETLOTNUMBERINGFD:      //�݌Ƀ��b�g�̔ԏ���
                return conn.getSpAdapter("begin SQLGETSETLOTNUMBERINGFD(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case CALCBESTBEFOREFD:          //�ܖ����������v�Z
                return conn.getSpAdapter("begin SQLCALCBESTBEFOREFD(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case INITSALESPROCFD:          // �̔��Ǘ���������
                return conn.getSpAdapter("begin SQLINITSALESPROCFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?); end;");    
                
            case EXCORDERHENTRYFD:          // �󒍃w�b�_�쐬����
                return conn.getSpAdapter("begin SQLEXCORDERHENTRYFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?); end;");
            case EXCORDERENTRYFD:          // �󒍖��׍쐬����
                return conn.getSpAdapter("begin SQLEXCORDERDENTRYFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?); end;");
                
            case EXCARFIFFD:          // ���|IF����
                return conn.getSpAdapter("begin SQLEXCARFIFFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?); end;");
            default:
                throw new FoundationException("default", "getAdapt", "(SBM0872) ��`�O�̃G���[���������܂����B");
        }
    }

    /**
     * �v���p�e�B�t�@�C�������LOG�o�͏��擾
     */
    private void readProperty() throws FoundationException {
        try {
            ResourceBundle rb = SystemConfig.getBundle();
            this.logMode = SystemConfig.getProperty("LOG_MODE", rb);
            this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE", rb);
            this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH", rb);
            this.outPutName = SystemConfig.getProperty("OUTPUT_NAME", rb);
        }
        catch (MissingResourceException mre) {
            FoundationException fe = new FoundationException("Numbering",
                mre.getMessage(), "(SBM0854) �v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
            fe.setPreviousException(mre);
            throw fe;
        }
    }

    /**
     * �󒍃w�b�_�i�[���i���g�p���Ď󒍖��ׂ��쐬����
     */
    private boolean excOrderLine(BigDecimal excDiv) throws FoundationException {
        	//  ���ׂ��ݒ肳��Ă���ꍇ�̂ݏ������s��
    	boolean errorFlg = false;
    	    List orderLinesList = null;
    	    orderLinesList =_orderHeader.orderLines();
    		if (orderLinesList !=null && orderLinesList.size() !=0){
    			for(int i=0; i< orderLinesList.size() ; i++) {
    				OrderLine orderLine =null;
    				
    				orderLine = (OrderLine) orderLinesList.get(i);
    				
    				// ���׏�񂪐ݒ肳��Ă��Ȃ��ꍇ�̓w�b�_����ݒ肷��
    				
    				if (orderLine.companyCd() == null || "".equals(orderLine.companyCd())){
        				orderLine.companyCd(_orderHeader.companyCd());				// ��ЃR�[�h
    				}
    				
    				if (orderLine.autoAppType() == null || "".equals(orderLine.autoAppType())){
    					orderLine.autoAppType(_orderHeader.autoAppType());			// ���ьv��敪
    				}
    				
    				if (orderLine.shipWhCd() == null || "".equals(orderLine.shipWhCd())){
        				
        				orderLine.shipWhCd(_orderHeader.shipWhCd());				// �o�בq�ɃR�[�h
    				}
    				
    				if (orderLine.scdlDlvDate() == null || "".equals(orderLine.scdlDlvDate())){
        				orderLine.scdlDlvDate(_orderHeader.desinatedDlvDate());		// �[���\�����
    				}
    				
    				if (orderLine.shipPlanDate() == null || "".equals(orderLine.shipPlanDate())){
        				
        				orderLine.shipPlanDate(_orderHeader.desinatedShipDate());	// �o�ח\�����
    				}
    				
    				if (orderLine.custDlvPlanTransNo() == null || "".equals(orderLine.custDlvPlanTransNo())){
        				
        				orderLine.custDlvPlanTransNo(_orderHeader.custDlvPlanTransNo());	// �[���\��֔ԍ�
    				}
    				
    				if (orderLine.custOdrNo() == null || "".equals(orderLine.custOdrNo())){
        				
        				orderLine.custOdrNo(_orderHeader.custOdrNo());						// ���Ӑ撍���ԍ�
    				}
    				
    				if (orderLine.transPortCd() == null || "".equals(orderLine.transPortCd())){
        				orderLine.transPortCd(_orderHeader.transPortCd());					// �^���փR�[�h
    				}
    				
    				if (orderLine.errorNo() == null || "".equals(orderLine.errorNo())){
        				orderLine.errorNo(_orderHeader.errorNo());							// �G���[�ԍ�
    				}
    				
    				if (orderLine.orderHNo() == null || "".equals(orderLine.orderHNo())){
    					orderLine.orderHNo(_orderHeader.orderHNo());				// �󒍓`�[�ԍ�
    				}
    				
    				if (orderLine.custCd() == null || "".equals(orderLine.custCd())){
    					orderLine.custCd(_orderHeader.custCd());					// ���Ӑ�R�[�h
    				}
    				if (orderLine.dlvLocCd() == null || "".equals(orderLine.dlvLocCd())){
    					orderLine.dlvLocCd(_orderHeader.dlvLocCd());				// �[�i�ꏊ�R�[�h
    				}
    				if (orderLine.slipType() == null || "".equals(orderLine.slipType())){
    					orderLine.slipType(_orderHeader.slipType());				// �`�[�敪
    				}
    				if (orderLine.custOdrNo() == null || "".equals(orderLine.custOdrNo())){
    					orderLine.custOdrNo(_orderHeader.custOdrNo());				// ���Ӑ撍���ԍ�
    				}
    				if (orderLine.custChrgOrgCd() == null || "".equals(orderLine.custChrgOrgCd())){
    					orderLine.custChrgOrgCd(_orderHeader.custChrgOrgCd());		// �c�ƒS���ҕ���R�[�h
    				}
    				if (orderLine.custChrgPsnCd() == null || "".equals(orderLine.custChrgPsnCd())){
    					orderLine.custChrgPsnCd(_orderHeader.custChrgPsnCd());		// �c�ƒS���҃R�[�h
    				}
    				if (orderLine.acptOrgCd() == null || "".equals(orderLine.acptOrgCd())){
    					orderLine.acptOrgCd(_orderHeader.acptOrgCd());				// ���s�S���ҕ���R�[�h	
    				}
    				if (orderLine.acptPsnCd() == null || "".equals(orderLine.acptPsnCd())){
    					orderLine.acptPsnCd(_orderHeader.acptPsnCd());				// ���s�S���҃R�[�h
    				}
    				if (orderLine.orderDate() == null || "".equals(orderLine.orderDate())){
    					orderLine.orderDate(_orderHeader.orderDate());				// �󒍓�
    				}
    				orderLine = callOrderDEntryFd(orderLine,excDiv);
    				orderLinesList.set(i,orderLine);
    				
    				// �󒍃w�b�_�쐬�����v���ʃX�e�[�^�X�̔���
    				if(STATUS_ERROR.equals(this.getResultStatus())) {
    					// ���ʃX�e�[�^�X���ُ�̏ꍇ�́A�����I��
    					if (this.messageId == null || "".equals(this.messageId)){
    						this.messageId=this.messageIdLine;
    					}
    					errorFlg = true;
    					
    				}

    			}
    		}
    		// ���׏���ݒ肷��
    		_orderHeader.orderLines(orderLinesList);
    		
    		// �P���ׂł��G���[������ꍇ�̓G���[�ɂ���
    		if (errorFlg == true){
    			return false;
    		}else{
    			return true;
    		}
            
    }
    
    /**
     * �󒍓`�[�ԍ����̔Ԃ���
     */
    private String getOrderHNo() throws FoundationException {
    	ResultSet rset = null;
        PreparedStatement stmt = null;
        String seqOdr;
    	try {
        	
        	String strSQL = ""
    			+"select "
    			+"'HODR' || LPAD(SEQ_ODR.NEXTVAL, 10, '0') AS ODR_H_NO "
    			+"from "
    			+"DUAL ";
        	
    			stmt = conn.getConn().prepareStatement(strSQL);	
    			rset = stmt.executeQuery();
    			if(rset.next() == true)
    			{	
    				seqOdr = rset.getString(1);
    				return seqOdr;
    			}else{
    				return null; 
    			}
    		
    	}catch (SQLException e) {
    		return null; 
        }finally{
        	if(rset != null){
        		try{
        			rset.close();
        		}catch(Exception e){
        			e.printStackTrace();
        		}finally{
        			rset = null;
        		}
        	}
        	if(stmt != null){
        		try{
        			stmt.close();
        		}catch(Exception e){
        			e.printStackTrace();
        		}finally{
        			stmt = null;
        		}
        	}        
        
        }
        
    }
    
    
    /**
     * �󒍃w�b�_�쐬���i�Ăяo��<BR>
     * @param  
     * @param  
     * @return �󒍃w�b�_�쐬�i�[�p�ϐ�
     * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
     */
    private boolean callkOrderHEntryFd(BigDecimal excDiv) 
        throws FoundationException {
                
        this.collectKey = EXCORDERHENTRYFD;
        
        this.resultStatus = null;
        this.messageId =null;

            
        IDbAdapter adapt = null;
        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       					// LOG���[�h
            adapt.setString(2, this.outPutMode);    					// �o�̓��[�h
            adapt.setString(3, this.outPutPath);    					// �o�̓t�@�C���p�X
            adapt.setString(4, this.outPutName);    					// �o�̓t�@�C����
            adapt.setString(5, this.userCd);        					// ���[�UID
            adapt.setString(6, this.businessCd);    					// �Ɩ���
            adapt.setString(7, this.plantCd);       					// �H��R�[�h
            adapt.setString(8, _orderHeader.companyCd());      			// ��ЃR�[�h
            adapt.setString(9, _orderHeader.orderHNo());         		// �󒍓`�[�ԍ�
            adapt.setBigDecimal(10, _orderHeader.slipType());        	// �`�[�敪
            adapt.setBigDecimal(11, _orderHeader.autoAppType());    	// �����v��敪
            adapt.setDate(12, _orderHeader.orderDate());        		// �󒍓�
            adapt.setString(13, _orderHeader.custCd());        			// ���Ӑ�R�[�h
            adapt.setString(14, _orderHeader.dlvLocCd());          		// �[�i�ꏊ�R�[�h
            adapt.setString(15, _orderHeader.billAddresseeCd());   		// ������R�[�h
            adapt.setString(16, _orderHeader.shipWhCd());        		// �o�בq�ɃR�[�h
            adapt.setString(17, _orderHeader.transPortCd());       		// �^���փR�[�h 
            adapt.setString(18, _orderHeader.custChrgOrgCd());     		// �c�ƒS���ҕ���R�[�h
            adapt.setString(19, _orderHeader.custChrgPsnCd());   		// �c�ƒS���҃R�[�h
            adapt.setString(20, _orderHeader.acptOrgCd());     			// ���s�S���ҕ���R�[�h
            adapt.setString(21, _orderHeader.acptPsnCd());     			// ���s�S���҃R�[�h
            adapt.setBigDecimal(22, _orderHeader.inputTyp());       	// ���͕��@
            adapt.setDate(23, _orderHeader.desinatedDlvDate()); 		// �w��[��
            adapt.setDate(24, _orderHeader.desinatedShipDate());		// �o�׎w���
            adapt.setBigDecimal(25, _orderHeader.custDlvPlanTransNo());	// �[���\��֔ԍ�
            adapt.setString(26, _orderHeader.custOdrNo());           	// ���Ӑ撍���ԍ�
            adapt.setString(27, _orderHeader.slipRemarks());           	// �`�[�E�v
            adapt.setString(28, _orderHeader.cancelCauseCd()); 			// ������R�R�[�h
            adapt.setBigDecimal(29, _orderHeader.modifyCount());      	// �X�V��
            adapt.setBigDecimal(30, _orderHeader.procDiv());           	// �����敪
            adapt.setBigDecimal(31, excDiv);           					// ���s�敪
            adapt.setString(32, _orderHeader.errorNo());           		// �G���[�ԍ�
            
            adapt.setOutString(9);                 	    // �������ʁi�󒍓`�[�ԍ�)			0
            adapt.setOutString(13);                 	// �������ʁi���Ӑ�R�[�h)			1
            adapt.setOutString(14);                 	// �������ʁi�[�i�ꏊ�R�[�h)		2
            adapt.setOutString(15);                 	// �������ʁi������R�[�h)			3
            adapt.setOutString(16);                 	// �������ʁi�o�בq�ɃR�[�h)		4
            adapt.setOutString(17);                 	// �������ʁi�^���փR�[�h)			5
            adapt.setOutString(18);                 	// �������ʁi�c�ƒS���ҕ���R�[�h)	6
            adapt.setOutString(19);                 	// �������ʁi�c�ƒS���҃R�[�h)		7
            adapt.setOutString(20);                 	// �������ʁi���s�S���ҕ���R�[�h)	8
            adapt.setOutString(21);                 	// �������ʁi���s�S���҃R�[�h)		9
            adapt.setOutDate(23); 						// ��������(�w��[��)				10
            adapt.setOutDate(24);						// ��������(�o�׎w���)				11 
            adapt.setOutString(33);                 	// �������ʁi���Ӑ於)				12
            adapt.setOutString(34);                 	// �������ʁi���Ӑ旪��)			13
            adapt.setOutString(35);                 	// �������ʁi���Ӑ�S����)			14
            adapt.setOutString(36);                 	// �������ʁi�����於)				15
            adapt.setOutString(37);                 	// �������ʁi�[�i�ꏊ��)			16
            adapt.setOutString(38);                 	// �������ʁi�[�i�ꏊ��(�J�i)		17		
            adapt.setOutString(39);                 	// �������ʁi�[�i�ꏊ(�p��)			18
            adapt.setOutString(40);                 	// �������ʁi�[�i�ꏊ�X�֔ԍ�)		19
            adapt.setOutString(41);                 	// �������ʁi�[�i�ꏊ�Z��1)			20
            adapt.setOutString(42);                 	// �������ʁi�[�i�ꏊ�Z��2)			21
            adapt.setOutString(43);                 	// �������ʁi�[�i�ꏊ�Z��(�J�i)1	22 
            adapt.setOutString(44);                 	// �������ʁi�[�i�ꏊ�Z��(�J�i)2	23
            adapt.setOutString(45);                 	// �������ʁi�[�i�ꏊ�d�b�ԍ�)		24
            adapt.setOutString(46);                 	// �������ʁi�[�i�ꏊFAX�ԍ�)		25
            adapt.setOutString(47);                 	// �������ʁi�o�בq�ɖ�)			26
            adapt.setOutString(48);                 	// �������ʁi�^���֖�)				27
            adapt.setOutString(49);                 	// �������ʁi�c�ƒS���ҕ��喼)		28
            adapt.setOutString(50);                 	// �������ʁi�c�ƒS���Җ�)			29
            adapt.setOutString(51);                 	// �������ʁi���s�S���ҕ��喼)		30
            adapt.setOutString(52);                 	// �������ʁi���s�S���Җ�)			31
            adapt.setOutString(53);                 	// �������ʁi�ʉ݃R�[�h)			32
            adapt.setOutBigDecimal(54);                 // �������ʁi�ב֎��)				33
            adapt.setOutBigDecimal(55);                 // �������ʁi�����敪)				34	
            adapt.setOutBigDecimal(56);                 // �������ʁi�{�̋��z)				35
            adapt.setOutBigDecimal(57);                 // �������ʁi����ō��v)			36
            adapt.setOutBigDecimal(58);                 // �������ʁi�󒍋��z���v)			37
            adapt.setOutBigDecimal(59);					// �������ʁi�����T�C�N��)		    38
            adapt.setOutString(60);                 	// �������ʁi�G���[�R�[�h)			39
            adapt.setOutInteger(61);                	// �������ʁi���ʃX�e�[�^�X�j		40
           
            
            adapt.execUpdate();

            // ���ʃX�e�[�^�X�̊i�[
            this.resultStatus = adapt.getOutInteger(61);
            // ���b�Z�[�W�R�[�h��ݒ�
            this.messageId = (adapt.getOutString(60)==null) ? "" : adapt.getOutString(60);
            
            _orderHeader.orderHNo((adapt.getOutString(9)==null) ? "" : adapt.getOutString(9));				// �������ʁi�󒍓`�[�ԍ�)			0
            _orderHeader.custCd((adapt.getOutString(13)==null) ? "" : adapt.getOutString(13));				// �������ʁi���Ӑ�R�[�h)			1
            _orderHeader.dlvLocCd((adapt.getOutString(14)==null) ? "" : adapt.getOutString(14));			// �������ʁi�[�i�ꏊ�R�[�h)		2
            _orderHeader.billAddresseeCd((adapt.getOutString(15)==null) ? "" : adapt.getOutString(15));		// �������ʁi������R�[�h)			3
            _orderHeader.shipWhCd((adapt.getOutString(16)==null) ? "" : adapt.getOutString(16));			// �������ʁi�o�בq�ɃR�[�h)		4
            _orderHeader.transPortCd((adapt.getOutString(17)==null) ? "" : adapt.getOutString(17));			// �������ʁi�^���փR�[�h)			5
            _orderHeader.custChrgOrgCd((adapt.getOutString(18)==null) ? "" : adapt.getOutString(18));		// �������ʁi�c�ƒS���ҕ���R�[�h)	6
            _orderHeader.custChrgPsnCd((adapt.getOutString(19)==null) ? "" : adapt.getOutString(19));		// �������ʁi�c�ƒS���҃R�[�h)		7
            _orderHeader.acptOrgCd((adapt.getOutString(20)==null) ? "" : adapt.getOutString(20));			// �������ʁi���s�S���ҕ���R�[�h)	8
            _orderHeader.acptPsnCd((adapt.getOutString(21)==null) ? "" : adapt.getOutString(21));			// �������ʁi���s�S���҃R�[�h)		9
            _orderHeader.desinatedDlvDate(adapt.getOutDate(23)); 											// ��������(�w��[��)				10
            _orderHeader.desinatedShipDate(adapt.getOutDate(24));											// ��������(�o�׎w���)				11
            _orderHeader.custName((adapt.getOutString(33)==null) ? "" : adapt.getOutString(33));			// �������ʁi���Ӑ於)				12
            _orderHeader.custAName((adapt.getOutString(34)==null) ? "" : adapt.getOutString(34));			// �������ʁi���Ӑ旪��)			13
            _orderHeader.custPsn((adapt.getOutString(35)==null) ? "" : adapt.getOutString(35));				// �������ʁi���Ӑ�S����)			14
            _orderHeader.billAddresseeName((adapt.getOutString(36)==null) ? "" : adapt.getOutString(36));	// �������ʁi�����於)				15
            _orderHeader.dlvLocName((adapt.getOutString(37)==null) ? "" : adapt.getOutString(37));			// �������ʁi�[�i�ꏊ��)			16
            _orderHeader.dlvLocKName((adapt.getOutString(38)==null) ? "" : adapt.getOutString(38));			// �������ʁi�[�i�ꏊ��(�J�i)		17		
            _orderHeader.dlvLocEName((adapt.getOutString(39)==null) ? "" : adapt.getOutString(39));			// �������ʁi�[�i�ꏊ(�p��)			18
            _orderHeader.dlvLocZipCd((adapt.getOutString(40)==null) ? "" : adapt.getOutString(40));			// �������ʁi�[�i�ꏊ�X�֔ԍ�)		19
            _orderHeader.dlvLocAddress1((adapt.getOutString(41)==null) ? "" : adapt.getOutString(41));		// �������ʁi�[�i�ꏊ�Z��1)			20
            _orderHeader.dlvLocAddress2((adapt.getOutString(42)==null) ? "" : adapt.getOutString(42));		// �������ʁi�[�i�ꏊ�Z��2)			21
            _orderHeader.dlvLocAddressK1((adapt.getOutString(43)==null) ? "" : adapt.getOutString(43));		// �������ʁi�[�i�ꏊ�Z��(�J�i)1	22 
            _orderHeader.dlvLocAddressK2((adapt.getOutString(44)==null) ? "" : adapt.getOutString(44));		// �������ʁi�[�i�ꏊ�Z��(�J�i)2	23
            _orderHeader.dlvLocTel((adapt.getOutString(45)==null) ? "" : adapt.getOutString(45));			// �������ʁi�[�i�ꏊ�d�b�ԍ�)		24
            _orderHeader.dlvLocFax((adapt.getOutString(46)==null) ? "" : adapt.getOutString(46));			// �������ʁi�[�i�ꏊFAX�ԍ�)		25
            _orderHeader.shipWhName((adapt.getOutString(47)==null) ? "" : adapt.getOutString(47));			// �������ʁi�o�בq�ɖ�)			26
            _orderHeader.transPortName((adapt.getOutString(48)==null) ? "" : adapt.getOutString(48));		// �������ʁi�^���֖�)				27
            _orderHeader.custChrgOrgName((adapt.getOutString(49)==null) ? "" : adapt.getOutString(49));		// �������ʁi�c�ƒS���ҕ��喼)		28
            _orderHeader.custChrgPsnName((adapt.getOutString(50)==null) ? "" : adapt.getOutString(50));		// �������ʁi�c�ƒS���Җ�)			29
            _orderHeader.acptOrgName((adapt.getOutString(51)==null) ? "" : adapt.getOutString(51));			// �������ʁi���s�S���ҕ��喼)		30
            _orderHeader.acptPsnName((adapt.getOutString(52)==null) ? "" : adapt.getOutString(52));			// �������ʁi�ʉ݃R�[�h)			31
            _orderHeader.currncyCd((adapt.getOutString(53)==null) ? "" : adapt.getOutString(53));			// �������ʁi���s�S���Җ�)			32
            _orderHeader.exchTyp(adapt.getOutBigDecimal(54));												// �������ʁi�ב֎��)				33
            _orderHeader.inspcAcptTyp(adapt.getOutBigDecimal(55)); 											// �������ʁi�����敪)				34
            _orderHeader.amountSum((adapt.getOutBigDecimal(56)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(56));							// �������ʁi�{�̋��z)				35
            _orderHeader.taxSum((adapt.getOutBigDecimal(57)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(57));							// �������ʁi����ō��v)			36
            _orderHeader.taxAmountSum((adapt.getOutBigDecimal(58)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(58)); 						// �������ʁi�󒍋��z���v)			37
            _orderHeader.claimCycleTyp(adapt.getOutBigDecimal(59));																				// �������� (�����T�C�N��)			38
            if (this.resultStatus == STATUS_ERROR){
            	return false;
            }
            return true;
        }catch (Exception  e){
        	e.printStackTrace();
        	return false;
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        
    }
    
    /** �󒍖��׍쐬���i <BR>
    * @param  OrderLine            	�󒍖��׍쐬�i�[�p�ϐ�
    * @param  
    * @return �󒍖��׍쐬�i�[�p�ϐ�
    * @throws FoundationException DB�������ɂȂ�炩�̃G���[�����������ꍇ
    */
   public OrderLine callOrderDEntryFd(OrderLine oredrLine,BigDecimal excDiv) 
       throws FoundationException {
               
       //�����`�F�b�N
       if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
           outPutMode == null || outPutPath == null || outPutName == null) {
           return null;
       }
       this.collectKey = EXCORDERENTRYFD;
       
       this.resultStatus = null;
       this.messageIdLine =null;
           
       IDbAdapter adapt = null;
       
       try {
           adapt =this.getAdapt(conn);
           adapt.setString(1, this.logMode);       						// LOG���[�h
           adapt.setString(2, this.outPutMode);    						// �o�̓��[�h
           adapt.setString(3, this.outPutPath);    						// �o�̓t�@�C���p�X
           adapt.setString(4, this.outPutName);    						// �o�̓t�@�C����
           adapt.setString(5, this.userCd);        						// ���[�UID
           adapt.setString(6, this.businessCd);    						// �Ɩ���
           adapt.setString(7, this.plantCd);       						// �H��R�[�h
           adapt.setString(8, oredrLine.companyCd());      				// ��ЃR�[�h
           adapt.setString(9, oredrLine.orderHNo());         			// �󒍓`�[�ԍ�
           adapt.setBigDecimal(10, oredrLine.lineNo());         		// �󒍖��׍s�ԍ� 
           adapt.setBigDecimal(11, oredrLine.seqNo());         			// �󒍖��ה����A�� 
           adapt.setBigDecimal(12, oredrLine.slipType());        		// �`�[�敪
           adapt.setBigDecimal(13, oredrLine.autoAppType());    		// �����v��敪
           adapt.setString(14, oredrLine.custOdrNo());         			// ���Ӑ撍���ԍ�
           adapt.setString(15, oredrLine.custChrgOrgCd());     			// �c�ƒS���ҕ���R�[�h
           adapt.setString(16, oredrLine.custChrgPsnCd());   			// �c�ƒS���҃R�[�h
           adapt.setString(17, oredrLine.acptOrgCd());     				// ���s�S���ҕ���R�[�h
           adapt.setString(18, oredrLine.acptPsnCd());     				// ���s�S���҃R�[�h
           adapt.setString(19, oredrLine.custCd());        				// ���Ӑ�R�[�h
           adapt.setString(20, oredrLine.dlvLocCd());          			// �[�i�ꏊ�R�[�h
           adapt.setString(21, oredrLine.shipWhCd());        			// �o�בq�ɃR�[�h
           adapt.setString(22, oredrLine.itemCd());        				// �i�ڔԍ�
           adapt.setBigDecimal(23, oredrLine.transType());    			// ����敪
           adapt.setString(24, oredrLine.cancelCauseCd());    			// ���׎�����R�R�[�h
           adapt.setBigDecimal(25, oredrLine.custDlvPlanTransNo()); 	// �[���\��֔ԍ�
           adapt.setBigDecimal(26, oredrLine.inHouseShipPlanTransNo()); // �Г��o�ח\��֔ԍ�
           adapt.setBigDecimal(27, oredrLine.orderUnitPrice()); 		// �󒍒P��
           adapt.setDate(28, oredrLine.scdlDlvDate()); 					// �[���\���
           adapt.setDate(29, oredrLine.shipPlanDate ());   				// �o�ח\���
           adapt.setBigDecimal(30, oredrLine.orderQty());    			// �󒍐���
           
           adapt.setString(31, oredrLine.orderUnitCd());    			// �󒍒P��
           
           adapt.setString(32, oredrLine.transPortCd());    			// �^���փR�[�h
           adapt.setString(33, oredrLine.lotNo());    					// �w�胍�b�g
           adapt.setString(34, oredrLine.remarks());    				// ���l
           adapt.setDate(35, oredrLine.orderDate ());  					// �󒍓�
           adapt.setBigDecimal(36, oredrLine.ifCtlNo());    			// IF���Ǘ��ԍ�
           adapt.setBigDecimal(37, oredrLine.orderSqe());    			// ��������
           adapt.setBigDecimal(38, oredrLine.entryType());    			// �f�[�^���͋敪
           adapt.setBigDecimal(39, oredrLine.modifyCount());    		// �X�V��
           adapt.setBigDecimal(40, oredrLine.procDiv());           		// �����敪
           adapt.setBigDecimal(41, excDiv);           					// ���s�敪
           adapt.setString(42,oredrLine.errorNo());						// �G���[�ԍ�
         
           
           adapt.setOutString(9);                 	// �������ʁi�󒍓`�[�ԍ�)			0
           adapt.setOutBigDecimal(10);              // �������ʁi�󒍖��׍s�ԍ�)		1
           adapt.setOutBigDecimal(11);              // �������ʁi�󒍖��ה����A��)		2
           adapt.setOutBigDecimal(25); 				// �������ʁi�[���\��֔ԍ�)		3
           adapt.setOutBigDecimal(26); 				// �������ʁi�Г��o�ח\��֔ԍ�)	4
           adapt.setOutBigDecimal(27); 				// �������ʁi�󒍒P��)				5
           adapt.setOutDate(28);     				// �������ʁi�[���\���)			6
           adapt.setOutDate(29);     				// �������ʁi�o�ח\���)			7
           adapt.setOutString(31);    				// �������ʁi�󒍒P��)				8
           adapt.setOutString(32);    				// �������ʁi�^���փR�[�h)			9
           
           adapt.setOutString(43);                 	// �������ʁi�i�ږ���)				10
           adapt.setOutBigDecimal(44);              // �������ʁi�󒍒P�ʐ�)			11
           adapt.setOutString(45);                 	// �������ʁi���Ӑ�i�ڔԍ�)		12
           adapt.setOutString(46);                 	// �������ʁi���Ӑ�i�ږ���)		13
           adapt.setOutString(47);                 	// �������ʁi�o�בq�ɖ�)			14
           adapt.setOutDate(48);                 	// �������ʁi�Z�b�g�J�n����)		15
           adapt.setOutString(49);                 	// �������ʁi�^���֖�)				16

           adapt.setOutBigDecimal(50);              // �������ʁi�󒍋��z)				17
           adapt.setOutBigDecimal(51);              // �������ʁi�󒍋��z(�M��))		18
           adapt.setOutBigDecimal(52);              // �������ʁi����Ŋz)				19
           adapt.setOutBigDecimal(53);              // �������ʁi�󒍋��z(�ō�))		20
           adapt.setOutBigDecimal(54);              // �������ʁi�󒍋��z(�Ŕ�))		21
           adapt.setOutString(55);              	// �������ʁiJAN�R�[�h)		        22
           adapt.setOutString(56);                 	// �������ʁi�G���[�R�[�h)			23
           adapt.setOutInteger(57);                	// �������ʁi���ʃX�e�[�^�X�j		24
          
           
           adapt.execUpdate();

           // ���ʃX�e�[�^�X�̊i�[
           this.resultStatus = adapt.getOutInteger(57);
           // ���b�Z�[�W�R�[�h��ݒ�
           this.messageIdLine = (adapt.getOutString(56)==null) ? "" : adapt.getOutString(56);
           
           oredrLine.orderHNo((adapt.getOutString(9)==null) ? "" : adapt.getOutString(9));	// �������ʁi�󒍓`�[�ԍ�)
           oredrLine.lineNo(adapt.getOutBigDecimal(10));									// �������ʁi�󒍖��׍s�ԍ�)
           oredrLine.seqNo(adapt.getOutBigDecimal(11));										// �������ʁi�󒍖��ה����A��)	
           oredrLine.custDlvPlanTransNo(adapt.getOutBigDecimal(25));						// �������ʁi�[���\��֔ԍ�)	
           oredrLine.inHouseShipPlanTransNo(adapt.getOutBigDecimal(26));					// �������ʁi�Г��o�ח\��֔ԍ�)	
           oredrLine.orderUnitPrice((adapt.getOutBigDecimal(27)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(27));	// �������ʁi�󒍒P��)
           oredrLine.scdlDlvDate(adapt.getOutDate(28));										// �������ʁi�[���\�����)
           oredrLine.shipPlanDate(adapt.getOutDate(29));									// �������ʁi�o�ח\�����)
           oredrLine.orderUnitCd((adapt.getOutString(31)==null) ? "" : adapt.getOutString(31));							// �������ʁi�󒍒P��)
           oredrLine.transPortCd((adapt.getOutString(32)==null) ? "" : adapt.getOutString(32));							// �������ʁi�^���փR�[�h)
           oredrLine.itemName((adapt.getOutString(43)==null) ? "" : adapt.getOutString(43));								// �������ʁi�i�ږ���)
           oredrLine.orderUnitQty((adapt.getOutBigDecimal(44)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(44));	// �������ʁi�󒍒P�ʐ�)
           oredrLine.custItemCd((adapt.getOutString(45)==null) ? "" : adapt.getOutString(45));							// �������ʁi���Ӑ�i�ڔԍ�)
           oredrLine.custItemName((adapt.getOutString(46)==null) ? "" : adapt.getOutString(46));						// �������ʁi���Ӑ�i�ږ���)
           oredrLine.shipWhName((adapt.getOutString(47)==null) ? "" : adapt.getOutString(47));							// �������ʁi�o�בq�ɖ�)
           oredrLine.setStDate(adapt.getOutDate(48));										// �������ʁi�Z�b�g�J�n����)
           oredrLine.transPortName((adapt.getOutString(49)==null) ? "" : adapt.getOutString(49));						// �������ʁi�^���֖�)
           oredrLine.orderAmount((adapt.getOutBigDecimal(50)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(50));				// �������ʁi�󒍋��z)			
           oredrLine.orderAmountExchRates((adapt.getOutBigDecimal(51)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(51));		// �������ʁi�󒍋��z(�M��)			
           oredrLine.taxAmount((adapt.getOutBigDecimal(52)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(52)); 				// �������ʁi����Ŋz)		
           oredrLine.orderAmountTax((adapt.getOutBigDecimal(53)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(53)); 			// �������ʁi�󒍋��z(�ō�))
           oredrLine.orderAmountExcTax((adapt.getOutBigDecimal(54)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(54)); 		// �������ʁi�󒍋��z(�Ŕ�))
           
           oredrLine.janCode((adapt.getOutString(55)==null) ? "" : adapt.getOutString(55)); 			// JAN�R�[�h
           
           
       }catch (Exception  e){
       	e.printStackTrace();
       }
       finally {
           if (adapt != null) {
               adapt.close();
               adapt = null;
           }
       }
       return oredrLine;
   }
    
   /*********************************************************************
    *** ���ʕԋp�l
    *********************************************************************/
   
    /**
     * �������ʃX�e�[�^�X�̎擾
     * @return  �������ʂ̃X�e�[�^�X���擾(���s�O�A�������̓G���[�Ŏ��s�ł��Ȃ������ꍇ��null��ԋp����j
     */
    public Integer getResultStatus() {
        return this.resultStatus;
    }
    
    /**
     * �G���[���b�Z�[�W�R�[�h�̎擾
     * @return  �������ʂ̃X�e�[�^�X���擾(���s�O�A�������̓G���[�Ŏ��s�ł��Ȃ������ꍇ��null��ԋp����j
     */
    public String getMessageId() {
        return this.messageId;
    }
    
}
