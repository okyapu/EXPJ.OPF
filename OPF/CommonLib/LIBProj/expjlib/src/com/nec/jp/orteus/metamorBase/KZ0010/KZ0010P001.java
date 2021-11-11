/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KZ0010/src/com/nec/jp/orteus/metamorBase/KZ0010/KZ0010P001.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.metamorBase.KZ0010;

import com.nec.jp.orteus.metamorBase.KZ0010.*;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;
import com.nec.jp.orteus.util.logging.*;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.combobox.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.file.*;
import com.nec.jp.orteus.expj.csv.*;


/**
 * ���|�h�^�e
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2014/11/13 06:20:38 $
*/
public class KZ0010P001 {

    protected KZ0010P001Control control;

    /**
     * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z���܂��B
     *
     * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
     * @param userId ���O�C�����[�U
     */
    public KZ0010P001(IDbConnection conn){
        try {
            control = new KZ0010P001Control();
            control.conn = conn; // �R�l�N�V�����ݒ�
            //System.out.println("���|�Ǘ�I/F�����J�n");
        }
        catch (Exception e) {
            //ExpjException ee = new ExpjException(e, "ZZ01106");
            e.printStackTrace();
        }
    }

    /**
     * �p�����[�^
     */
    private String _mode;
    private String _userId;
    private String _originalSlipCd;
    private String _redSlipCd;
    private String _blackSlipCd;

    /**
     * �p�����[�^��ݒ肵�܂��B<BR>
     * <BR>
     * @param mode           �������[�h
     *                         1:�o�׎���-�o�^
     *                         2:�o�׎���-���
     *                         3:�o�׎���-�ԕi
     *                         4:��̔���-�o�^
     *                         5:��̔���-���
     *                         6:���̑�����-�o�^
     *                         7:���̑�����-�X�V
     *                         8:���̑�����-�폜
     *                         9:�a������I/F
     * @param userId         �ďo�����p�҃R�[�h
     * @param originalSlipCd ���`�[�ԍ�
     * @param redSlipCd      �ԓ`�[�ԍ�
     * @param blackSlipCd    ���`�[�ԍ�
     */
    public void setParameter(String mode, String userId, String originalSlipCd,
                             String redSlipCd, String blackSlipCd)
    {
        _mode = mode;
        _userId = userId;
        _originalSlipCd = originalSlipCd;
        _redSlipCd = redSlipCd;
        _blackSlipCd = blackSlipCd;

        // ���[�UID�Z�b�g
        if ((userId != null) && (userId.length() > 0)) {
            control.setUserId(userId);
        }
        else {
            control.setUserId("SYSTEM");
        }

        //System.out.println("�������[�h:" + _mode);
        //System.out.println("�ďo�����p�҃R�[�h:" + _userId);
        //System.out.println("���`�[�ԍ�:" + _originalSlipCd);
        //System.out.println("�ԓ`�[�ԍ�:" + _redSlipCd);
        //System.out.println("���`�[�ԍ�:" + _blackSlipCd);
    }

    /**
     * ���b�Z�[�W�ԍ�
     */
    private String _messageNo = "0";

    /**
     * ���������s���܂��B<BR>
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    public String execute() {
        if ((_mode == null) || (_mode.length() != 1) ||
            ((!"1".equals(_mode)) && (!"2".equals(_mode)) &&
             (!"3".equals(_mode)) && (!"4".equals(_mode)) &&
             (!"5".equals(_mode)) && (!"6".equals(_mode)) &&
             (!"7".equals(_mode)) && (!"8".equals(_mode)) &&
             (!"9".equals(_mode)))) {
            // �������[�h���ݒ� or ��ݒ�
            //   �����Ȃ�
            //System.out.println("�������[�h���ݒ� or ��ݒ�");
            return "ZZ01104";
        }

        else {
            // �������ʏ�񒊏o
            _messageNo = this.readCommon();
            //System.out.println("readCommon:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;

            // �������[�h��
            if ("1".equals(_mode)) {
                //System.out.println("1:�o�׎���-�o�^ �����J�n");
                // 1:�o�׎���-�o�^
                control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����ǉ�
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
            }

            else if ("2".equals(_mode)) {
                //System.out.println("2:�o�׎���-��� �����J�n");
                // 2:�o�׎���-���
                control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����w�b�_���݃`�F�b�N
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // ���|���g�����폜���� (���R�[�h���ݎ�)

                    // ���|���g�����폜
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // ���|���g�����ԓ`�ǉ��C���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
                    control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)

                    // ���|���g�����ԓ`�ǉ��E�X�V
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("3".equals(_mode)) {
                //System.out.println("3:�o�׎���-�ԕi �����J�n");
                // 3:�o�׎���-�ԕi
                control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����w�b�_���݃`�F�b�N
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // ���|���g�����X�V���� (���R�[�h���ݎ�)

                    // ���|���g�����폜
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    // ���|���g�����ǉ�
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // ���|���g�����ԓ`�ǉ��C���|���g�������`�ǉ��C
                    // ���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
                    control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)

                    // ���|���g�����ԓ`�ǉ��E�X�V
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g

                    // ���|���g�����ǉ�
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("4".equals(_mode)) {
                //System.out.println("4:��̔���-�o�^ �����J�n");
                // 4:��̔���-�o�^
                control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����폜
                _messageNo = this.delTrn();
                //System.out.println("delTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;

                // ���|���g�����ǉ�
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
            }

            else if ("5".equals(_mode)) {
                //System.out.println("5:��̔���-��� �����J�n");
                // 5:��̔���-���
                control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����w�b�_���݃`�F�b�N
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // ���|���g������ԋ敪�X�V���� (���R�[�h���ݎ�)

                    // ���|���g�����X�V
                    _messageNo = this.upTrn();
                    //System.out.println("upTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // ���|���g�����ԓ`�ǉ��C���|���g�������`�ǉ��C
                    // ���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
                    control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)

                    // ���|���g�����ԓ`�ǉ��E�X�V
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    control.setSlipCd2(_blackSlipCd); // ���`�[�ԍ��Z�b�g(�`�[�ԍ�2)

                    // ���|���g�������`�ǉ�
                    _messageNo = this.blackTrn();
                    //System.out.println("blackTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("6".equals(_mode)) {
                //System.out.println("6:���̑�����-�o�^ �����J�n");
                // 6:���̑�����-�o�^
                control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����ǉ�
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
            }

            else if ("7".equals(_mode)) {
                //System.out.println("7:���̑�����-�X�V �����J�n");
                // 7:���̑�����-�X�V
                control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����w�b�_���݃`�F�b�N
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // ���|���g�����X�V���� (���R�[�h���ݎ�)

                    // ���|���g�����폜
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    // ���|���g�����ǉ�
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // ���|���g�����ԓ`�ǉ��C���|���g�������`�ǉ��C
                    // ���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
                    control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)

                    // ���|���g�����ԓ`�ǉ��E�X�V
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g

                    // ���|���g�����ǉ�
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("8".equals(_mode)) {
                //System.out.println("8:���̑�����-�폜 �����J�n");
                // 8:���̑�����-�폜
                control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����w�b�_���݃`�F�b�N
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // ���|���g�����폜���� (���R�[�h���ݎ�)

                    // ���|���g�����폜
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // ���|���g�����ԓ`�ǉ��C���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
                    control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)

                    // ���|���g�����ԓ`�ǉ��E�X�V
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("9".equals(_mode)) {
                //System.out.println("9:�a������I/F �����J�n");
                // 9:�a������I/F
                control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g

                // ���|���g�����ǉ�
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
            }
        }

        return _messageNo; // ����I��
    }

    /**
     * ���ʏ���<BR>
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    private String readCommon() {
        //System.out.println("���ʏ����J�n");

        // ���Џ�񒊏o
        _messageNo = control.selectMyCompany();
        //System.out.println("selectMyCompany:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // ���|�V�X�e���Ǘ��}�X�^���o
        _messageNo = control.selectArCtrl();
        //System.out.println("selectArCtrl:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // �敪�R�[�h���o
        _messageNo = control.selectClassCode();
        //System.out.println("selectClassCode:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // �`�[�敪�}�X�^���o
        _messageNo = control.selectSlipTrn();
        //System.out.println("selectSlipTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // �M�ݒ��o
        _messageNo = control.selectHomeCur();
        //System.out.println("selectHomeCur:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * ���|���g�����ǉ�<BR>
     * �������[�h1:�o�׎���-�o�^
     * �������[�h3:�o�׎���-�ԕi
     * �������[�h4:��̔���-�o�^
     * �������[�h6:���̑�����-�o�^
     * �������[�h7:���̑�����-�X�V
     * �������[�h9:�a������I/F
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    private String addTrn() {
        //System.out.println("���|���g�����ǉ������J�n");

        // ������ђ��o
        _messageNo = control.selectSales();
        //System.out.println("selectSales:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // �o�׎��ђ��o
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // �������[�h1:�o�׎���-�o�^
            // �������[�h3:�o�׎���-�ԕi
            // �������[�h4:��̔���-�o�^
            // �������[�h9:�a������I/F
            _messageNo = control.selectShip();
            //System.out.println("selectShip:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // �o�׎w�����o
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // �������[�h1:�o�׎���-�o�^
            // �������[�h3:�o�׎���-�ԕi
            // �������[�h4:��̔���-�o�^
            // �������[�h9:�a������I/F
            _messageNo = control.selectShipOdr();
            //System.out.println("selectShipOdr:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // �󒍖��ג��o
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode))) {
            // �������[�h1:�o�׎���-�o�^
            // �������[�h3:�o�׎���-�ԕi
            // �������[�h4:��̔���-�o�^
            _messageNo = control.selectOdr();
            //System.out.println("selectOdr:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // ���i�P�����o
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // �������[�h1:�o�׎���-�o�^
            // �������[�h3:�o�׎���-�ԕi
            // �������[�h4:��̔���-�o�^
            // �������[�h9:�a������I/F
            _messageNo = control.selectUnitCost();
            //System.out.println("selectUnitCost:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // ���Ӑ�}�X�^���o
        _messageNo = control.selectCust();
        //System.out.println("selectCust:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // ���Ӑ�x�X�}�X�^���o
        _messageNo = control.selectCustBranch();
        //System.out.println("selectCustBranch:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // �������Ӑ撊�o
        _messageNo = control.selectClaimCustCtrl();
        //System.out.println("selectClaimCustCtrl:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // ���Ӑ�[�i�ꏊ���o
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // �������[�h1:�o�׎���-�o�^
            // �������[�h3:�o�׎���-�ԕi
            // �������[�h4:��̔���-�o�^
            // �������[�h9:�a������I/F
            _messageNo = control.selectCustBase();
            //System.out.println("selectCustBase:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // ���i���o
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // �������[�h1:�o�׎���-�o�^
            // �������[�h3:�o�׎���-�ԕi
            // �������[�h4:��̔���-�o�^
            // �������[�h9:�a������I/F
            _messageNo = control.selectItemSpec();
            //System.out.println("selectItemSpec:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // �������IF���o
        if ("9".equals(_mode)) {
            // �������[�h9:�a������I/F
            _messageNo = control.selectInspcAcptInfoIf();
            //System.out.println("selectInspcAcptInfoIf:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // �i�ڒ��o
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // �������[�h1:�o�׎���-�o�^
            // �������[�h3:�o�׎���-�ԕi
            // �������[�h4:��̔���-�o�^
            // �������[�h9:�a������I/F
            _messageNo = control.selectItem();
            //System.out.println("selectItem:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // ����Ōv�Z����
        control.calculateTax(_mode);

        // ���|���g�����w�b�_�쐬
        _messageNo = control.insertArLedgerHTrn(_mode);
        //System.out.println("insertArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // ���|���g�������׍쐬
        _messageNo = control.insertArLedgerTrn(_mode);
        //System.out.println("insertArLedgerTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * ���|���g�����폜<BR>
     * �������[�h2:�o�׎���-���
     * �������[�h3:�o�׎���-�ԕi
     * �������[�h4:��̔���-�o�^
     * �������[�h7:���̑�����-�X�V
     * �������[�h8:���̑�����-�폜
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    private String delTrn() {
        //System.out.println("���|���g�����폜�����J�n");

        // ���|���g�����w�b�_�폜
        _messageNo = control.deleteArLedgerHTrn();
        //System.out.println("deleteArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // ���|���g�������׍폜
        _messageNo = control.deleteArLedgerTrn();
        //System.out.println("deleteArLedgerTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * ���|���g�����ԓ`�ǉ��E�X�V<BR>
     * �������[�h2:�o�׎���-���
     * �������[�h3:�o�׎���-�ԕi
     * �������[�h5:��̔���-���
     * �������[�h7:���̑�����-�X�V
     * �������[�h8:���̑�����-�폜
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    private String redTrn() {
        //System.out.println("���|���g�����ԓ`�ǉ��E�X�V�����J�n");

        // ���|���g���������w�b�_�ԓ`�X�V
        _messageNo = control.updateArLedgerH();
        //System.out.println("updateArLedgerH:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // ���|���g�����w�b�_�ԓ`�ǉ��E�X�V
        _messageNo = control.insertIntoeArLedgerHTrn();
        //System.out.println("insertIntoeArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // �����|���g�������אԓ`�ǉ��E�X�V
        _messageNo = control.insertIntoeArLedgerTrn();
        //System.out.println("insertIntoeArLedgerTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * ���|���g�����X�V<BR>
     * �������[�h5:��̔���-���
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    private String upTrn() {
        //System.out.println("���|���g�����폜�����J�n");

        // ���|���g�����w�b�_�X�V
        _messageNo = control.updateArLedgerHTrn();
        //System.out.println("updateArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * ���|���g�������`�ǉ�<BR>
     * �������[�h5:��̔���-���
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    private String blackTrn() {
        //System.out.println("���|���g�������`�ǉ������J�n");

        // ���|���g�����w�b�_���`�ǉ�
        _messageNo = control.insertIntoeArLedgerHTrn2();
        //System.out.println("insertIntoeArLedgerHTrn2:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // �����|���g�������׍��`�ǉ�
        _messageNo = control.insertIntoeArLedgerTrn2();
        //System.out.println("insertIntoeArLedgerTrn2:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }
}
