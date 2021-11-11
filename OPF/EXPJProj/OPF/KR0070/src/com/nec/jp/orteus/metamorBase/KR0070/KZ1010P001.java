/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KZ1010P001.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.metamorBase.KR0070;

import java.util.List;

import com.nec.jp.orteus.metamorBase.KR0070.*;
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
 * ���|�h�^�e(�����i�p)
 *
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 07:52:29 $
*/
public class KZ1010P001 {
	protected KZ1010P001Control control;
	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z���܂��B
	 *
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param userId ���O�C�����[�U
	 */
	public KZ1010P001(IDbConnection conn){
		try {
			control = new KZ1010P001Control();
			control.conn = conn; // �R�l�N�V�����ݒ�
		}
		catch (Exception e) {
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
	 *                         6:���̑�����-�o�^
	 *                         7:���̑�����-�X�V
	 *                         8:���̑�����-�폜
	 * @param userId         �ďo�����p�҃R�[�h
	 * @param originalSlipCd ���`�[�ԍ�
	 * @param redSlipCd      �ԓ`�[�ԍ�
	 * @param blackSlipCd    ���`�[�ԍ�
	 * @param taxCd          ����ŃR�[�h
	 */
	public void setParameter(String mode, String userId, String originalSlipCd, String redSlipCd, String blackSlipCd, String taxCd) {
		_mode = mode;
		_userId = userId;
		_originalSlipCd = originalSlipCd;
		_redSlipCd = redSlipCd;
		_blackSlipCd = blackSlipCd;
		System.out.println("setParameter");
		// ���[�UID�Z�b�g
		if ((userId != null) && (userId.length() > 0)) {
			control.setUserId(userId);
		} else {
			control.setUserId("SYSTEM");
		}
        // ����ŃR�[�h
        control.setTaxCd(taxCd);
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
		if ((_mode == null) || (_mode.length() != 1) || ((!"1".equals(_mode)) && (!"2".equals(_mode)) && (!"3".equals(_mode)) && (!"6".equals(_mode)) && (!"7".equals(_mode)) && (!"8".equals(_mode)))) {
			// �������[�h���ݒ� or ��ݒ�
			// �����Ȃ�
			return "ZZ01104";
		} else {
			// �V�X�e�����t���擾����
			
			// �������ʏ�񒊏o
			_messageNo = this.readCommon();
			if (!"0".equals(_messageNo)) return _messageNo;
			
			// �������[�h��
			if ("1".equals(_mode)) {
				// 1:�o�׎���-�o�^
				control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g
				// ���|���g�����ǉ�
				_messageNo = this.addTrn();
				if (!"0".equals(_messageNo)) return _messageNo;
			} else if ("2".equals(_mode)) {
				// 2:�o�׎���-���
				control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g
				// ���|���g�����w�b�_���݃`�F�b�N
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// ���|���g�����폜���� (���R�[�h���ݎ�)
					// ���|���g�����폜
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// ���|���g�����ԓ`�ǉ��C���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
					control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)
					// ���|���g�����ԓ`�ǉ��E�X�V
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
			} else if ("3".equals(_mode)) {
				// 3:�o�׎���-�ԕi
				control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g
				
				// ���|���g�����w�b�_���݃`�F�b�N
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// ���|���g�����X�V���� (���R�[�h���ݎ�)
					
					// ���|���g�����폜
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					// ���|���g�����ǉ�
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// ���|���g�����ԓ`�ǉ��C���|���g�������`�ǉ��C
					// ���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
					control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)
					// ���|���g�����ԓ`�ǉ��E�X�V
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g
					// ���|���g�����ǉ�
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
			} else if ("6".equals(_mode)) {
				// 6:���̑�����-�o�^
				control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g
				// ���|���g�����ǉ�
				_messageNo = this.addTrn();
				if (!"0".equals(_messageNo)) return _messageNo;
			} else if ("7".equals(_mode)) {
				// 7:���̑�����-�X�V
				control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g
				// ���|���g�����w�b�_���݃`�F�b�N
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// ���|���g�����X�V���� (���R�[�h���ݎ�)
					// ���|���g�����폜
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					// ���|���g�����ǉ�
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// ���|���g�����ԓ`�ǉ��C���|���g�������`�ǉ��C
					// ���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
					control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)
					// ���|���g�����ԓ`�ǉ��E�X�V
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					control.setSlipCd(_blackSlipCd); // ���`�[�ԍ��Z�b�g
					// ���|���g�����ǉ�
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
			} else if ("8".equals(_mode)) {
				// 8:���̑�����-�폜
				control.setSlipCd(_originalSlipCd); // ���`�[�ԍ��Z�b�g
				// ���|���g�����w�b�_���݃`�F�b�N
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// ���|���g�����폜���� (���R�[�h���ݎ�)
					// ���|���g�����폜
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// ���|���g�����ԓ`�ǉ��C���|�������ԓ`�X�V���� (���R�[�h�����ݎ�)
					control.setSlipCd2(_redSlipCd); // �ԓ`�[�ԍ��Z�b�g(�`�[�ԍ�2)
					// ���|���g�����ԓ`�ǉ��E�X�V
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
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
		// ���Џ�񒊏o
		_messageNo = control.selectMyCompany();
		if (!"0".equals(_messageNo)) return _messageNo;
		// ���|�V�X�e���Ǘ��}�X�^���o
		_messageNo = control.selectArCtrl();
		if (!"0".equals(_messageNo)) return _messageNo;
		// �敪�R�[�h���o
		_messageNo = control.selectClassCode();
		if (!"0".equals(_messageNo)) return _messageNo;
		// �`�[�敪�}�X�^���o
		_messageNo = control.selectSlipTrn();
		if (!"0".equals(_messageNo)) return _messageNo;
		// �M�ݒ��o
		_messageNo = control.selectHomeCur();
		if (!"0".equals(_messageNo)) return _messageNo;
		return _messageNo;
	}
	
	/**
	 * ���|���g�����ǉ�<BR>
	 * �������[�h1:�o�׎���-�o�^
	 * �������[�h3:�o�׎���-�ԕi
	 * �������[�h6:���̑�����-�o�^
	 * �������[�h7:���̑�����-�X�V
	 *
	 * @return ���b�Z�[�W�ԍ�
	 *         ����I����:"0"
	 */
	private String addTrn() {
		// ������ђ��o
		_messageNo = control.selectSales();
		if (!"0".equals(_messageNo)) return _messageNo;
		// �o�׎��ђ��o
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// �������[�h1:�o�׎���-�o�^
			// �������[�h3:�o�׎���-�ԕi
			_messageNo = control.selectShip();
			if (!"0".equals(_messageNo)) return _messageNo; 
		}
		
		// �o�׎w�����o
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// �������[�h1:�o�׎���-�o�^
			// �������[�h3:�o�׎���-�ԕi
			_messageNo = control.selectShipOdr();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// �m��󒍒��o
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// �������[�h1:�o�׎���-�o�^
			// �������[�h3:�o�׎���-�ԕi
			_messageNo = control.selectOdr();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// ���i�P�����o
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// �������[�h1:�o�׎���-�o�^
			// �������[�h3:�o�׎���-�ԕi
			_messageNo = control.selectUnitCost();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// ���Ӑ�}�X�^���o
		_messageNo = control.selectCust();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// ���Ӑ�x�X�}�X�^���o
		_messageNo = control.selectCustBranch();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// �������Ӑ撊�o
		_messageNo = control.selectClaimCustCtrl();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// �[�i�ꏊ���o
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// �������[�h1:�o�׎���-�o�^
			// �������[�h3:�o�׎���-�ԕi
			_messageNo = control.selectCustBase();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// �בփ��[�g�}�X�^���o
		_messageNo = control.selectHomeCurCd();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// �i�ڒ��o
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// �������[�h1:�o�׎���-�o�^
			// �������[�h3:�o�׎���-�ԕi
			_messageNo = control.selectItem();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		// ����Ōv�Z����
		control.calculateTax(_mode);
		// ���|���g�����w�b�_�쐬
		_messageNo = control.insertArLedgerHTrn(_mode);
		if (!"0".equals(_messageNo)) return _messageNo;
		// ���|���g�������׍쐬
		_messageNo = control.insertArLedgerTrn(_mode);
		if (!"0".equals(_messageNo)) return _messageNo;
		return _messageNo;
	}
	
	/**
	 * ���|���g�����폜<BR>
	 * �������[�h2:�o�׎���-���
	 * �������[�h3:�o�׎���-�ԕi
	 * �������[�h7:���̑�����-�X�V
	 * �������[�h8:���̑�����-�폜
	 *
	 * @return ���b�Z�[�W�ԍ�
	 *         ����I����:"0"
	 */
	private String delTrn() {
		// ���|���g�����w�b�_�폜
		_messageNo = control.deleteArLedgerHTrn();
		if (!"0".equals(_messageNo)) return _messageNo;
		// ���|���g�������׍폜
		_messageNo = control.deleteArLedgerTrn();
		if (!"0".equals(_messageNo)) return _messageNo;
		return _messageNo;
	}

	/**
	 * ���|���g�����ԓ`�ǉ��E�X�V<BR>
	 * �������[�h2:�o�׎���-���
	 * �������[�h3:�o�׎���-�ԕi
	 * �������[�h7:���̑�����-�X�V
	 * �������[�h8:���̑�����-�폜
	 *
	 * @return ���b�Z�[�W�ԍ�
	 *         ����I����:"0"
	 */
	private String redTrn() {
		if(control.isSelectArLedgerH()) {
			// ���|�������ɓ`�[�ԍ������݂���ꍇ
			// ���|���g���������w�b�_�ԓ`�X�V
			_messageNo = control.updateArLedgerH();
			if (!"0".equals(_messageNo)) return _messageNo;
			//�ԓ`�[�ԍ��̃Z�b�g
			control.setSlipCd2(_redSlipCd);
			// ���|���g�����w�b�_�ԓ`�ǉ��E�X�V
			_messageNo = control.insertIntoeArLedgerHTrn();
			if (!"0".equals(_messageNo)) return _messageNo;
			//�����|���g�������אԓ`�ǉ��E�X�V
			_messageNo = control.insertIntoeArLedgerTrn();
			if (!"0".equals(_messageNo)) return _messageNo;
			return _messageNo;
		}
		return "0";
	}
	
	/**
     * �̔��P���擾�̃��[�j���O���X�g��߂�<BR>
     *
     * @return �̔��P���擾�̃��[�j���O���X�g
     *
     */
    public List getSalesUnitPriceWarningList() {
        return control.getSalesUnitPriceWarningList();
    }
}
