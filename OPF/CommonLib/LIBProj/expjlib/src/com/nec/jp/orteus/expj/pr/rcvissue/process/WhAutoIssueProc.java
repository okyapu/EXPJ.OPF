/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/WhAutoIssueProc.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.lot.LotStock;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.mst.ConsUnitCost;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * <pre>
 *   �����o�ɁA����у}�j���A���E�L�b�g�ꊇ�o�ɂ̂̋��ʏ������s���܂��B
 *   ���̃N���X�́A�ȉ��̋Ɩ���������Ăяo����܂��B
 *   �@�P�D��Ǝ��ѓ���
 *   �@�Q�D�o�������ѓ���
 *   �@�R�D������ѓ��́A������у����e�i���X
 *   �@�S�D�L�b�g�o��
 *   �@�T�D�}�j���A���o�Ɂi�ꊇ�X�V���j
 *  
 *   ���̃N���X��������́ASQLException����������\��������܂��B
 * </pre>
 * 
 * @author $Author: geng-jia $
 * @version $Revision: 1.14 $ $Date: 2015/12/23 01:49:56 $
 */

public class WhAutoIssueProc implements RcvIssueConst {

	/** �����o�ɏ����敪 1:�L�b�g�o�� */
	public final static int RCV_ISSUE_TYP_KIT = 1;

	/** �����o�ɏ����敪 2:�����o�� */
	public final static int RCV_ISSUE_TYP_AUTO = 2;

	/** �����o�ɏ����敪 4:�}�j���A���o�� */
	public final static int RCV_ISSUE_TYP_MANUAL = 4;

	private IDbConnection _iconn; // �g�����U�N�V�����R�l�N�V�������

	private Connection _conn; // �R�l�N�V�������

	private String _plantCd; // �H��R�[�h

	private UpdateInfo _updInfo; // ���p�ҊǗ����(�C���i�[�N���X)

	private Log _log; // ���O���(�C���i�[�N���X)

	private AutoIssueParam gin; // �����o�ɋN���p�����[�^

	private final static BigDecimal bdZero = new BigDecimal("0");

	// �o�Ɍ��ʏo�͗p������i�o�Ɏw���ԍ��j
	private final static String strDtl = "T_ISSUE_INST.ISSUE_INST_CD:";

	private final static String strItem = "�i�ڔԍ�:";

	/**
	 * <pre>
	 *   �R���X�g���N�^
	 *   new����Ƃ��ɂ͉��L�̃p�����[�^��ݒ肷��B
	 *   �H��R�[�h,���[�UID,�Ɩ����͕ʓrsetter�Őݒ肵�������Ƃ��\�B
	 * </pre>
	 * 
	 * @param conn
	 *            �R�l�N�V�������
	 * @param plantCd
	 *            �H��R�[�h
	 * @param userId
	 *            ���[�UID
	 * @param businessName
	 *            �Ɩ���
	 */
	public WhAutoIssueProc(IDbConnection conn, String plantCd, String userId,
			String businessName) {

		_iconn = conn;
		_conn = _iconn.getConn();
		_plantCd = plantCd;
		_updInfo = new UpdateInfo(userId, businessName, 0);

		// ���O�p���i�̏��������s��
		String className = this.getClass().getName();
		className = className.substring(0, className.lastIndexOf("."));
		_log = new Log(className, _iconn);
	}

	// ----------------------------------------------------
	// ���J���\�b�h
	// ----------------------------------------------------
	/**
	 * <pre>
	 *   �y�ۊǋ掩���o�ɏ����z
	 *    �w�肳�ꂽ�o�Ɏw�����ɂ��Ď����o�ɂ��s���܂��B
	 *   �@�o�Ɍ��̕i�ڍ݌ɁA���ԍ݌ɂ̑I���A����яo�Ɍ��ۊǋ�̑I����
	 *   �@�������肵�ďo�ɂ��s���܂��B�i�݂Ȃ��o�Ɂj
	 * </pre>
	 * 
	 * @param inParam
	 *            �����o�ɋN���p�����[�^
	 * 
	 * <pre>
	 *     m_WORK_ODR_CD			  ��ƌv��ԍ�
	 *     m_WORK_IN_PROC_CD		  ��ƃR�[�h
	 *     m_PARTIAL_PRD_NO		  �����
	 *     m_OPR_RSLT_CRCT_NO		  ��Ǝ��ђ�����
	 *     m_PUCH_ODR_CD			  �����ԍ�
	 *     m_ACPT_NO				  �����
	 *     m_ACPT_RSLT_CRCT_NO	  ���������
	 *     m_RCV_ISSUE_TYP		  �����o�ɏ����敪
	 *     m_RCV_ISSUE_DATE		  �o�ɔN����
	 *     m_RCV_ISSUE_RSLT_NO	  �����Ώێ��ѐ�
	 *     m_RCV_ISSUE_CMPLT_FLG	  �o�Ɋ����t���O
	 *     m_PLANT_CD				  �H��R�[�h
	 * </pre>
	 * 
	 * @param iIssueInstStruct
	 *            �o�Ɏw�����
	 * @return true;����I���i�x�����b�Z�[�W�L��̏ꍇ���܂ށj�A false �G���[����
	 * 
	 * <pre>
	 *            ���b�Z�[�W�R�[�h���X�g�`��:  String[]��List 
	 *                                         String[0]--&gt; ���b�Z�[�W�R�[�h
	 *                                         String[1]--&gt; ���b�Z�[�W�ڍׁi�i�ڃR�[�h�j
	 * </pre>
	 * 
	 * @throws SQLException
	 * @throws FoundationException
	 */

	public boolean exec(AutoIssueParam inParam, IssueInstStruct iIssueInstStruct)
			throws SQLException, FoundationException {

		BigDecimal dIssueNO;
		BigDecimal dRC;
		BigDecimal dRC1;
		BigDecimal dAutoIssueNo;

		List l_WH = null; // �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
		boolean ret = false; // �o�ɏ�������

		try {
			_log.methodStart();

			// �N���p�����[�^��ޔ�
			gin = inParam;

			/* DEBUG */_log.message("(SBM0451) ��ƌv��ԍ�(����)=[" + gin.m_WORK_ODR_CD + "]");
			/*
			 * _log.message("��ƃR�[�h=["+gin.m_WORK_IN_PROC_CD+"]");
			 * _log.message("�����=["+gin.m_PARTIAL_PRD_NO+"]");
			 * _log.message("��Ǝ��ђ�����=["+gin.m_OPR_RSLT_CRCT_NO+"]");
			 * _log.message("�����ԍ�=["+gin.m_PUCH_ODR_CD+"]");
			 * _log.message("�����=["+gin.m_ACPT_NO+"]");
			 * _log.message("���������=["+gin.m_ACPT_RSLT_CRCT_NO+"]");
			 * _log.message("�����o�ɏ����敪=["+gin.m_RCV_ISSUE_TYP+"]");
			 * _log.message("�o�ɔN����=["+gin.m_RCV_ISSUE_DATE+"]");
			 * _log.message("�����Ώێ��ѐ�=["+gin.m_RCV_ISSUE_RSLT_NO+"]");
			 * _log.message("�o�Ɋ����t���O=["+gin.m_RCV_ISSUE_CMPLT_FLG+"]");
			 * _log.message("�H��R�[�h=["+gin.m_PLANT_CD+"]");
			 */

			// ���̓p�����[�^�`�F�b�N
			if (gin.m_PUCH_ODR_CD == null || gin.m_PUCH_ODR_CD.equals("")) {
				if (gin.m_OPR_RSLT_CRCT_NO < 0) {
					_log.message("(SBM0883) ��Ǝ��ђ�����=[" + gin.m_OPR_RSLT_CRCT_NO
							+ "] ���s���Ȃ̂ŁA" + "�������I�����܂��B");
					IllegalArgumentException e = new IllegalArgumentException(
							this.getClass().getName());
					throw e;

				}
				;
			} else {
				if (gin.m_ACPT_RSLT_CRCT_NO < 0) {
					_log.message("(SBM0884) ���������=[" + gin.m_ACPT_RSLT_CRCT_NO
							+ "] ���s���Ȃ̂ŁA" + "�������I�����܂��B");
					IllegalArgumentException e = new IllegalArgumentException(
							this.getClass().getName());
					throw e;
				}
				;
			}

			// �o�ɑΏەi�ڏ��̎��o��
			IssueInstStruct stII = iIssueInstStruct;

			// ���̕i�ڂ́u�����o�ɐ��v���擾
			dAutoIssueNo = stII.m_AUTO_ISSUE_QTY;
			/* DEBUG */_log.message("(SBM0909) �����o�ɐ�=[" + dAutoIssueNo + "]");

			// �u�����o�ɐ��v��Zero�̂Ƃ�
			if (dAutoIssueNo.compareTo(bdZero) == 0) {
				// [�ۊǋ�ʓ��o��]�֒ǉ� & �o�ɏ���
				ret = issue_AT_ZERO(stII);
				/* DEBUG */_log.message("((SBM0848) �[���o�ɂ��܂���)issue_AT_ZERO");
			} else {

				// �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g���擾
				l_WH = ValidateWh.getAutoIssue(_iconn, stII.m_PLANT_CD, stII.m_ITEM_CD);

				if (l_WH.size() == 0) {
					setErrorList("AD10003", stII.m_ISSUE_INST_CD);
					ret = false;
				} else {
					ret = true;
				}

				if (ret) {
					/* DEBUG */_log.message("(SBM0910) �o�ɕi�ڂ̕i�ڎ�z�敪=["
							+ stII.m_MRP_ODR_TYP + "]");
					switch (stII.m_MRP_ODR_TYP) { // �i�ڎ�z�敪
					case 1: // �u���ԕi�ځv�̏ꍇ
						ret = issueProcForJobOdr(stII, l_WH);
						break;

					case 2: // �u�݌Ɉ����^���ԕi�ځv�̏ꍇ
						ret = issueProcForJobOdrAlc(stII, l_WH);
						break;

					case 3:
						break;

					default: // �u�l�q�o�i�ځv�ł���ꍇ
						/*
						 * �o�ɕi�ڂ̕i�ڎ�z�敪�� �P(���ԕi��)�A�Q(�݌Ɉ����^���ԕi��)�A�R(����) �ȊO�ł���Ƃ�
						 */
						// �����o�ɐ���S�ďo�ɂ���܂�
						// �y�l�q�o�i�̕��o�ۊǋ�̏����z�ŏo��
						dRC = commonMRP(stII, dAutoIssueNo, l_WH, 1);
						if (dRC == null) {
							ret = false;
						} else {
							ret = true;
						}
						break;
					}
				}
			}
			_log.methodEnd();
		} finally {
		}

		return ret;
	}

	// -------------------------------------------------------
	// ����J���\�b�h
	// -------------------------------------------------------
	/**
	 * ���ԕi�ڂ̎����o�ɏ���
	 */
	private boolean issueProcForJobOdr(IssueInstStruct iIssueInstStruct,
			List iWhList) throws SQLException, FoundationException {
		_log.methodStart();
		BigDecimal dIssueNO;
		BigDecimal dRC;

		IssueInstStruct stII = iIssueInstStruct;
		dIssueNO = stII.m_AUTO_ISSUE_QTY;

		// [���v��]�������i�o�ɉ\���A���ԏ����擾�j
		IssueRemain sIssueRemain = new IssueRemain(_iconn);
		IssueRemain.ResultByOd w_ret = sIssueRemain
				.getRemainQtyByOd(stII.m_OD_NO);
		stII.m_JOB_ODR_CD = w_ret.jobOdrCd; // [���v��].����
		stII.m_JOB_ODR_DETAIL_NO = w_ret.jobOdrDetailNo; // [���v��].���Ԏ}��

		// *******************************************************
		// 1.�ʎ�z���o�ɉ\���̎Z�o
		dRC = issue_BY_ODR(stII, dIssueNO, iWhList, w_ret);
		if (dRC == null) {
			return false;
		}
		/* DEBUG */_log.message("(SBM0911) �ʎ�z���o�ɐ�=[" + dRC + "]");
		dIssueNO = dIssueNO.subtract(dRC);

		// *******************************************************
		// 2.���Ԉ������o�ɉ\���i���ꐻ�ԁj�̎Z�o
		/* DEBUG */_log.message("(SBM0913) �o�ɗv�����i���Ԉ������o�ɉ\���i���ꐻ�ԁj�j=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_SAME(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 3.���Ԉ������o�ɉ\���i�����ԁj�̎Z�o
		/* DEBUG */_log.message("(SBM0914) �o�ɗv�����i���Ԉ������o�ɉ\���i�����ԁj�j=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_OTHER(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}
		// *******************************************************
		// 4.�݌Ɉ������o�ɉ\���̎Z�o
		/* DEBUG */_log.message("(SBM0915) �o�ɗv�����i�݌Ɉ������o�ɉ\���j=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ITEMALC(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 5. �ʎ�z��(�]��݌�)����̏o�� �c���S�Ă����蓖�Ă�
		/* DEBUG */_log.message("(SBM0911) �ʎ�z���o�ɐ�=[" + dRC + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			// �����o�ɐ���S�ďo�ɂ���܂Ły���ԕi�̕��o�ۊǋ�̏����z�ŏo��
			dRC = commonJOBODR(stII, stII.m_JOB_ODR_CD,
					stII.m_JOB_ODR_DETAIL_NO, iWhList, dIssueNO, true);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		/* DEBUG */_log.message("(SBM0916) �o�Ɏc��=[" + dIssueNO + "] *** �O�łȂ��ꍇ�ُ͈�ł�");
		_log.methodEnd();
		return true;
	}

	/**
	 * �݌Ɉ����^���ԕi�ڂ̎����o�ɏ���
	 * 
	 * @return
	 */
	private boolean issueProcForJobOdrAlc(IssueInstStruct iIssueInstStruct,
			List iWhList) throws SQLException, FoundationException {
		_log.methodStart();

		BigDecimal dIssueNO;
		BigDecimal dRC;

		IssueInstStruct stII = iIssueInstStruct;
		dIssueNO = stII.m_AUTO_ISSUE_QTY;

		// [���v��]������擾
		// [���v��]�������i�o�ɉ\���A���ԏ����擾�j
		IssueRemain sIssueRemain = new IssueRemain(_iconn);
		IssueRemain.ResultByOd w_ret = sIssueRemain
				.getRemainQtyByOd(stII.m_OD_NO);
		stII.m_JOB_ODR_CD = w_ret.jobOdrCd; // [���v��].����
		stII.m_JOB_ODR_DETAIL_NO = w_ret.jobOdrDetailNo; // [���v��].���Ԏ}��

		// *******************************************************
		// 1. �ʎ�z���o�ɉ\���̎Z�o
		dRC = issue_BY_ODR(stII, dIssueNO, iWhList, w_ret);
		if (dRC == null) {
			return false;
		}
		// _log.message("�ʎ�z���o�ɐ�=["+dRC+"]");
		dIssueNO = dIssueNO.subtract(dRC);

		// *******************************************************
		// 2. ���Ԉ������o�ɉ\���i���ꐻ�ԁj�̎Z�o
		// _log.message("�o�ɗv�����i���Ԉ������o�ɉ\���i���ꐻ�ԁj�j=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_SAME(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 3. ���Ԉ������o�ɉ\���i�����ԁj�̎Z�o
		// DEBUG
		// _log.message("�o�ɗv�����i���Ԉ������o�ɉ\���i�����ԁj�j=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_OTHER(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 4. �݌Ɉ������o�ɉ\���̎Z�o
		// DEBUG
		// _log.message("�o�ɗv�����i�݌Ɉ������o�ɉ\���j=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ITEMALC(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 5. �ʎ�z���i�]��݌Ɂj����̏o��
		// �o�ɉ\���̎Z�o �莝�݌ɂ͈͓̔��Ŋ��蓖�Ă�
		// DEBUG
		// _log.message("�o�ɗv�����i�ʎ�z���i�āj�o�ɉ\���j=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ODR_REMAIN(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 6. �i�ڍ݌�(�]��݌�)����̏o��
		// �o�Ɏc�����ׂĂ����蓖�Ă�
		/* DEBUG */_log.message("(SBM0917) �o�ɗv�����i�i�ڗ]��݌ɂ���̏o�ɗv�����j=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ITEM_REMAIN(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			} else {
				setWarnList("AD60002", stII.m_ITEM_CD);
				// �Ɩ����b�Z�[�W�e�[�u���ւ̏o��
				outBusinessMessage("AD60003", strItem + "[" + stII.m_ITEM_CD
						+ "]");
			}
		}
		/* DEBUG */_log.message("(SBM0912) �i�ڗ]��݌ɂ���̏o�ɐ�=[" + dRC + "]");
		_log.methodEnd();
		return true;
	}

	/**
	 * �u�����Ώێ��ѐ��v��Zero�̂Ƃ��A[�ۊǋ�ʓ��o��]�Ƀ��R�[�h��ǉ����܂��B
	 * 
	 * @param iInIndex
	 * @return String �o�^����[�ۊǋ�ʓ��o��]�̓��o�ɊǗ��ԍ�
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private boolean issue_AT_ZERO(IssueInstStruct iIssueInstStruct)
			throws SQLException, FoundationException {
		String strOdrCd = "";
		IssueProcess wIssueProcess; // �o�ɏ����̃I�u�W�F�N�g
		boolean ret; // �o�ɏ�������
		boolean ret_issue = false; // �[���o�ɏ�������
		String MsgCd = null;

		try {
			_log.methodStart();

			IssueInstStruct stII = iIssueInstStruct;

			// �o�^�f�[�^�̐ݒ�
			RcvIssueStruct sData = new RcvIssueStruct();

			sData.m_RCV_ISSUE_TYP = 2; // ���o�ɋ敪
			sData.m_ITEM_CD = stII.m_ITEM_CD; // �i�ڔԍ�
			sData.m_PLANT_CD = stII.m_PLANT_CD; // �H��R�[�h
			sData.m_WH_CD = null; // �ۊǋ�R�[�h
			sData.m_JOB_ODR_CD = null; // ����
			sData.m_JOB_ODR_DETAIL_NO = 0; // ���Ԏ}��
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD; // �����ԍ�
			sData.m_ACPT_NO = gin.m_ACPT_NO; // �����
			sData.m_ACPT_RSLT_CRCT_NO = gin.m_ACPT_RSLT_CRCT_NO; // ������ђ�����
			sData.m_INSPEC_RSLT_CRCT_NO = 0; // �������ђ�����
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD; // ��ƌv��ԍ�
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD; // �d�|��ƃR�[�h
			sData.m_PARTIAL_PRD_NO = gin.m_PARTIAL_PRD_NO; // �����
			sData.m_OPR_RSLT_CRCT_NO = gin.m_OPR_RSLT_CRCT_NO; // ��Ǝ��ђ�����
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD; // �o�Ɏw���ԍ�
			sData.m_RCV_ISSUE_QTY = bdZero; // ���o�ɐ�
			sData.m_RCV_ISSUE_AMOUNT = bdZero; // ���o�ɋ��z
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE); // ���o�ɔN����
			sData.m_RCV_ISSUE_GNR_TYP = 21; // ���o�ɔ����敪
			sData.m_RCV_ISSUE_ODD_QTY = bdZero; // ���o�ɒ[��
			sData.m_DEFECT_CAUSE_CD = null; // ���o�ɕs�Ǘ��R�R�[�h
			sData.m_STOCK_UPD_TYP = 2; // �݌ɍX�V�敪
			sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG; // ���o�Ɋ����t���O
			sData.m_OD_NO = stII.m_OD_NO; // �I�[�_�f�}���h�ԍ�
			sData.m_VEND_LOT_NO = gin.m_VEND_LOT_NO; // ���[�J���b�g�ԍ�
			// ---------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = ""; // ���o�ɔ��l
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd(_iconn);// ��ЃR�[�h
			sData.m_VEND_CD = stII.m_VEND_CD; // �����R�[�h
			sData.m_CONS_TYP = 0; // �x���敪
			sData.m_CONS_EXEC_DATE = null; // �L���x�����ђ��o��

			// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
			RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn,
					_updInfo);
			strOdrCd = sRcvIssueEntity.insert(sData);
			if (!strOdrCd.equals("")) {
				sData.m_RCV_ISSUE_CTRL_CD = strOdrCd; // ���o�ɊǗ��ԍ�
			}

			// �o�ɏ������Ăяo��
			_log.message("(SBM0904) �o�ɏ������Ăяo���܂�(�[���o��)");
			wIssueProcess = new IssueProcess(_iconn, strOdrCd);
			ret = wIssueProcess.execProcess();
			if (ret) {
				// �C���t�H���[�V�������b�Z�[�W��ۑ�
				for (Iterator itr = wIssueProcess.getInfoList().iterator(); itr
						.hasNext();) {
					MsgCd = (String) itr.next();
					setInfoList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
				}
				// ���[�j���O���b�Z�[�W�͕ۑ����Ȃ��i���݁AIssueProxess����ԋp����Ă��Ȃ����߁j
				ret_issue = true;
			} else {
				_infoList.clear();
				_warnList.clear();
				// �G���[���b�Z�[�W��ۑ�
				for (Iterator itr = wIssueProcess.getErrorList().iterator(); itr
						.hasNext();) {
					MsgCd = (String) itr.next();
					setErrorList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
				}
				ret_issue = false;
			}
			_log.methodEnd();
		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");
		} finally {
		}
		return ret_issue;
	};

	/**
	 * 
	 * �y�l�q�o�i�̕��o�ۊǋ�̏����z�ɏ]���āA�����o�ɐ��𖞂����܂� �e�ۊǋ悩��̏o�ɏ��������s���܂��B
	 * 
	 * @param iIssueInstStruct
	 *            �o�Ɏw���f�[�^
	 * @param dInISSUE_NO
	 *            �����o�ɐ�
	 * @param iWhList
	 *            �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 * @param iInTyp
	 * @return ���ۂɏo�ɂ������i�S�ۊǋ�̍��v�j
	 * @throws SQLException
	 * @throws Exception
	 * @throws
	 * 
	 */

	private BigDecimal commonMRP(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUE_NO, List iWhList, int iInTyp)
			throws SQLException, FoundationException {

		String strOdrCd = "";
		IssueProcess wIssueProcess; // �o�ɏ����̃I�u�W�F�N�g
		boolean ret; // �o�ɏ�������
		int iCount;
		BigDecimal dIssueNO = bdZero;
		BigDecimal dIssueCountTemp = bdZero;
		BigDecimal dTotalIssueCnt = bdZero; // �o�ɐ��i�ݐρj

		String sWH_CD = "";
		// �u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�A�������͍ŏ��R�[�h�̕ۊǋ�
		String sWH_CD_MIN = "";
		// �ŏ��̃��b�g�A�������͍ŏ��R�[�h�̃��b�g�R�[�h
		String sLOT_NO_MIN = "";

		ItemStock sItemStock;
		BigDecimal bdHandQtr = bdZero; // �ۊǋ斈�̎莝�݌ɐ�

		try {
			_log.methodStart();

			// �o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;
			dIssueNO = dInISSUE_NO;

			// �S�ۊǋ拤�ʂ̓o�^�f�[�^�ݒ� -------------------------------
			RcvIssueStruct sData = new RcvIssueStruct();

			sData.m_RCV_ISSUE_TYP = 2; // ���o�ɋ敪
			sData.m_ITEM_CD = stII.m_ITEM_CD; // �i�ڔԍ�
			sData.m_PLANT_CD = stII.m_PLANT_CD; // �H��R�[�h
			sData.m_WH_CD = ""; // �ۊǋ�R�[�h(����ŕۊǋ�ʂɐݒ�)
			sData.m_JOB_ODR_CD = null; // ����
			sData.m_JOB_ODR_DETAIL_NO = 0; // ���Ԏ}��
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD; // �����ԍ�
			sData.m_ACPT_NO = gin.m_ACPT_NO; // �����
			sData.m_ACPT_RSLT_CRCT_NO = gin.m_ACPT_RSLT_CRCT_NO; // ������ђ�����
			sData.m_INSPEC_RSLT_CRCT_NO = 0; // �������ђ�����
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD; // ��ƌv��ԍ�
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD; // �d�|��ƃR�[�h
			sData.m_PARTIAL_PRD_NO = gin.m_PARTIAL_PRD_NO; // �����
			sData.m_OPR_RSLT_CRCT_NO = gin.m_OPR_RSLT_CRCT_NO; // ��Ǝ��ђ�����
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD; // �o�Ɏw���ԍ�
			sData.m_RCV_ISSUE_QTY = bdZero; // ���o�ɐ�(����ŕۊǋ�ʂɐݒ�)
			sData.m_RCV_ISSUE_AMOUNT = bdZero; // ���o�ɋ��z
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE); // ���o�ɔN����
			sData.m_RCV_ISSUE_GNR_TYP = 21; // ���o�ɔ����敪
			sData.m_RCV_ISSUE_ODD_QTY = bdZero; // ���o�ɒ[��
			sData.m_DEFECT_CAUSE_CD = null; // ���o�ɕs�Ǘ��R�R�[�h
			sData.m_STOCK_UPD_TYP = 1; // �݌ɍX�V�敪
			sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_YET; // ���o�Ɋ����t���O(����ŕۊǋ�ʂɐݒ�)
			sData.m_OD_NO = stII.m_OD_NO; // �I�[�_�f�}���h�ԍ�
			sData.m_VEND_LOT_NO = gin.m_VEND_LOT_NO; // ���[�J���b�g�ԍ�
			// ------------------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = ""; // ���o�ɔ��l
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd(_iconn); // ��ЃR�[�h
			sData.m_VEND_CD = stII.m_VEND_CD; // �����R�[�h
			sData.m_CONS_TYP = stII.m_CONS_TYP; // �x���敪
			sData.m_CONS_EXEC_DATE = null; // �L���x�����ђ��o��
			// ------------------------------------------------------------------------

			/* DEBUG */_log.message("(SBM0918) �i�ڃR�[�h=[" + stII.m_ITEM_CD + "]");

			int iLotFlag = getLotFlag(_iconn, stII.m_ITEM_CD);
			/* DEBUG */_log.message("lotfalg=[" + iLotFlag + "]");
			if (iLotFlag == 1) {
				// �o�ɕi�ڂ����b�g�Ǘ��i�ڂł���ꍇ
				PrivateConfig pc = new PrivateConfig(_iconn);
				String AUTOISSUE_BEST_BEFORE = pc.getString("AUTOISSUE_BEST_BEFORE");
				LotStock sLotStock = null;
				if (AUTOISSUE_BEST_BEFORE == null) {
					AUTOISSUE_BEST_BEFORE = "0";
				}
				/* DEBUG */_log.message("AUTOISSUE_BEST_BEFORE=["
						+ AUTOISSUE_BEST_BEFORE + "]");
				// �Y���ۊǋ�̕i�ڍ݌ɂ�����
				List LotStockList = null;
				int iLSLCount = 0;
				sLotStock = new LotStock(_iconn);
				LotStock.LotStockStruct LSS = sLotStock.new LotStockStruct();

				System.out.println("stII.m_PLANT_CD = " + stII.m_PLANT_CD);

				LotStockList = sLotStock.getHandQty(stII.m_ITEM_CD, sData.m_RCV_ISSUE_DATE, AUTOISSUE_BEST_BEFORE, stII.m_PLANT_CD);
				if (LotStockList == null) {
					iLSLCount = 0;

				} else {
					iLSLCount = LotStockList.size();
				}
				if (iLSLCount == 0) {
					setErrorList("ZZ20001", stII.m_ISSUE_INST_CD);
					// setWarnList("ZZ20001", strDtl + stII.m_ISSUE_INST_CD);
					_log.message("(SBM0919) �s���̏ꍇ�G���[ZZ20001�Ƃ���A ���@null��ԋp");
					return null;
				}
				/* DEBUG */_log.message("iLSLCount=[" + iLSLCount + "]");
				for (int cnt = 0; cnt < iLSLCount; cnt++) {
					LSS = (LotStock.LotStockStruct) LotStockList.get(cnt);
					bdHandQtr = LSS.m_STOCK_ON_HAND_QTY;
					sData.m_WH_CD = LSS.m_WH_CD;
					sData.m_LOT_NO = LSS.m_LOT_NO;
					/* DEBUG */_log.message("sData.m_WH_CD=[" + sData.m_WH_CD
							+ "]");
					/* DEBUG */_log.message("sData.m_LOT_NO=["
							+ sData.m_LOT_NO + "]");
					/* DEBUG */_log.message("bdHandQtr=[" + bdHandQtr + "]");
					// �ŏ��̕ۊǋ�R�[�h��ޔ����Ă����B
					if (sWH_CD_MIN.equals("")) {
						sWH_CD_MIN = sData.m_WH_CD;
					}
					// �ŏ��̕ۊǋ�R�[�h�ƍŏ��̃��b�g�R�[�h��ޔ����Ă����B
					if (sLOT_NO_MIN.equals("")) {
						sLOT_NO_MIN = sData.m_LOT_NO;
					}

					if ((bdHandQtr != null)
							&& (bdHandQtr.compareTo(bdZero) != 0)) {
						// �ۊǋ斈�̓o�^�f�[�^�ݒ� ------------------------------
						dIssueCountTemp = bdHandQtr;// �莝�݌ɐ�
						if (dIssueCountTemp.compareTo(dIssueNO) >= 0) {
							dIssueCountTemp = dIssueNO;
						}

						sData.m_RCV_ISSUE_QTY = dIssueCountTemp.multiply(new BigDecimal("-1")); // ���o�ɐ�

						// �o�Ɋ����t���O�̐ݒ�
						if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
							sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
						} else {
							if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE && dIssueNO.subtract(dIssueCountTemp).compareTo(bdZero) == 0) {
								sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
							}
						}
						// ------------------------------------------------------

						// << �ۊǋ�ʓ��o�ɂ̓o�^���o�ɏ��� ���L���x������o�^ >>
						ret = insert_issue_process(sData, stII);

						if (ret) {
							dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
							dIssueNO = dIssueNO.subtract(dIssueCountTemp);
						} else {
							return null;
						}
					}
					if (dIssueNO.compareTo(bdZero) == 0) {
						break;
					}
				}
				// �s���̏ꍇ�G���[�Ƃ���iZZ20001�j
				if (dIssueNO.compareTo(bdZero) > 0) {
					/*
					 * DELETE BY SAI 2007/06/16 FOR: IN STOCK LACK START
					 * sData.m_RCV_ISSUE_QTY = dIssueNO.multiply(new BigDecimal(
					 * "-1")); sData.m_WH_CD = sWH_CD_MIN; sData.m_LOT_NO =
					 * sLOT_NO_MIN; // �o�Ɋ����t���O�̐ݒ� if (gin.m_RCV_ISSUE_TYP ==
					 * RCV_ISSUE_TYP_AUTO) { sData.m_RCV_ISSUE_CMPLT_FLG =
					 * gin.m_RCV_ISSUE_CMPLT_FLG; } else { if
					 * (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE &&
					 * dIssueNO.subtract(dIssueCountTemp) .compareTo(bdZero) ==
					 * 0) { sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE; } } //
					 * ------------------------------------------------------
					 * 
					 * ret = insert_issue_process(sData, stII); DELETE BY SAI
					 * 2007/06/16 FOR: IN STOCK LACK END
					 */

					// �G���[���b�Z�[�W��ۑ�
					// if (ret) {
					setErrorList("ZZ20001", stII.m_ISSUE_INST_CD);
					// setWarnList("ZZ20001", strDtl + stII.m_ISSUE_INST_CD);
					_log.message("(SBM0919) �s���̏ꍇ�G���[ZZ20001�Ƃ���A ���@null��ԋp");
					return null;
					// }
				}
			} else {
				iCount = 0;
				for (Iterator itr = iWhList.iterator(); itr.hasNext();) {
					// �o�Ɍ��̕ۊǋ�R�[�h�����o��
					sWH_CD = (String) itr.next();

					// �ŏ��̕ۊǋ�R�[�h��ޔ����Ă����B
					if (sWH_CD_MIN.equals("")) {
						sWH_CD_MIN = sWH_CD;
					}

					/* DEBUG */_log.message("iCount=[" + iCount + "]");
					/* DEBUG */_log.message("(SBM0920) �i�ڕʕۊǐ�D�揇�ʁE�ۊǋ�R�[�h�EsWH_CD=["
							+ sWH_CD + "]");

					// �Y���ۊǋ�̕i�ڍ݌ɂ�����
					sItemStock = new ItemStock(_iconn);
					bdHandQtr = sItemStock.getHandQty(stII.m_ITEM_CD, sWH_CD, 0);

					if ((bdHandQtr != null) && (bdHandQtr.compareTo(bdZero) != 0)) {
						// �ۊǋ斈�̓o�^�f�[�^�ݒ� ------------------------------
						sData.m_WH_CD = sWH_CD; // �ۊǋ�R�[�h
						dIssueCountTemp = bdHandQtr;// �莝�݌ɐ�
						if (dIssueCountTemp.compareTo(dIssueNO) >= 0) {
							dIssueCountTemp = dIssueNO;
						}

						sData.m_RCV_ISSUE_QTY = dIssueCountTemp.multiply(new BigDecimal("-1")); // ���o�ɐ�

						// �o�Ɋ����t���O�̐ݒ�
						if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
							sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
						} else {
							if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE
									&& dIssueNO.subtract(dIssueCountTemp)
											.compareTo(bdZero) == 0) {
								sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
							}
						}
						// ------------------------------------------------------

						// << �ۊǋ�ʓ��o�ɂ̓o�^���o�ɏ��� ���L���x������o�^ >>
						ret = insert_issue_process(sData, stII);

						if (ret) {
							iCount++;
							dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
							dIssueNO = dIssueNO.subtract(dIssueCountTemp);
						} else {
							return null;
						}
					}
					if (dIssueNO.compareTo(bdZero) == 0) {
						break;
					}
				}

				// ���ׂĂ̕ۊǋ悩��o�ɂ��Ă��܂��o�Ɏc������ꍇ�A
				// �ŏ��̕ۊǋ悩��c�����ׂĂ��o�ɂ���B
				if (dIssueNO.compareTo(bdZero) > 0) {
					// DEBUG
					// 20031104 _log.message("�i�ڕʕۊǐ�D�揇�ʂ̍ŏ��ۊǋ悩��A�o��");
					// �ۊǋ斈�̓o�^�f�[�^�̐ݒ� ------------------------------
					sData.m_WH_CD = sWH_CD_MIN; // �ŏ��̕ۊǋ�R�[�h
					sData.m_RCV_ISSUE_QTY = dIssueNO.multiply(new BigDecimal(
							"-1")); // ���o�ɐ�
					// ��

					// �o�Ɋ����t���O�̐ݒ�
					if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
						sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
					} else {
						if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE) {
							sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
						}
					}
					// ------------------------------------------------------------------------------

					// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
					// << �ۊǋ�ʓ��o�ɂ̓o�^���o�ɏ��� ���L���x������o�^ >>-----------
					ret = insert_issue_process(sData, stII);

					if (ret) {
						iCount++;
						dTotalIssueCnt = dTotalIssueCnt.add(dIssueNO);
					} else {
						return null;
					}
				}
				_log.methodEnd();
			}

		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");
		} finally {
		}
		return dTotalIssueCnt;
	}

	/**
	 * 
	 * �y���ԕi�̕��o�ۊǋ�̏����z�ɏ]���A�w�肳�ꂽ�o�ɉ\���𖞂����܂� �o�ɏ������s���B
	 * 
	 * @param iIssueInstStruct
	 *            �o�Ɏw�����
	 * @param iJobOdrCd
	 *            ���ԁi���ԍ݌ɂ���������Ƃ��̃L�[�l�j
	 * @param iJobOdrDetailNo
	 *            ���Ԏ}�ԁi���ԍ݌ɂ���������Ƃ��̃L�[�l�j
	 * @param iWhList
	 *            �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 * @param dInISSUENO
	 *            �����o�ɐ�
	 * @param chkFlg
	 *             �y �r�s�d�o2 �z���ǂ����s��
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal commonJOBODR(IssueInstStruct iIssueInstStruct,
			String iJobOdrCd, int iJobOdrDetailNo, List iWhList,
			BigDecimal dInISSUENO,boolean chkFlg) throws SQLException, FoundationException {

		IssueProcess wIssueProcess; // �o�ɏ����̃I�u�W�F�N�g
		boolean ret; // �o�ɏ�������

		int iCount = 0;
		BigDecimal dIssueNO = bdZero;
		BigDecimal dIssueCountTemp = bdZero;
		BigDecimal dTotalIssueCnt = bdZero;

		JobOdrStock sJobOdrStock; // ���ԍ݌ɃN���X
		BigDecimal bdHandQtr = bdZero; // �ۊǋ斈�̎莝�݌ɐ�

		String sWH_CD = "";
		String sWH_CD_MIN = ""; // �u�i�ڕʕۊǐ�D�揇�ʁv���ŏ��̕ۊǋ�R�[�h
		// (�܂��͗D�揇�ʃf�[�^���Ȃ��ꍇ�́A�ŏ��R�[�h�̕ۊǋ�R�[�h�j

		try {
			_log.methodStart();

			// �o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;

			dIssueNO = dInISSUENO;

			// �S�ۊǋ拤�ʂ̓o�^�f�[�^�ݒ� -------------------------------
			RcvIssueStruct sData = new RcvIssueStruct();

			sData.m_RCV_ISSUE_TYP = 2; // ���o�ɋ敪
			sData.m_ITEM_CD = stII.m_ITEM_CD; // �i�ڔԍ�
			sData.m_PLANT_CD = stII.m_PLANT_CD; // �H��R�[�h
			sData.m_WH_CD = ""; // �ۊǋ�R�[�h(����ŕۊǋ�ʂɐݒ�)
			sData.m_JOB_ODR_CD = iJobOdrCd; // ����
			sData.m_JOB_ODR_DETAIL_NO = 0; // ���Ԏ}��
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD; // �����ԍ�
			sData.m_ACPT_NO = gin.m_ACPT_NO; // �����
			sData.m_ACPT_RSLT_CRCT_NO = gin.m_ACPT_RSLT_CRCT_NO; // ������ђ�����
			sData.m_INSPEC_RSLT_CRCT_NO = 0; // �������ђ�����
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD; // ��ƌv��ԍ�
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD; // �d�|��ƃR�[�h
			sData.m_PARTIAL_PRD_NO = gin.m_PARTIAL_PRD_NO; // �����
			sData.m_OPR_RSLT_CRCT_NO = gin.m_OPR_RSLT_CRCT_NO; // ��Ǝ��ђ�����
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD; // �o�Ɏw���ԍ�
			sData.m_RCV_ISSUE_QTY = bdZero; // ���o�ɐ�(����ŕۊǋ�ʂɐݒ�)
			sData.m_RCV_ISSUE_AMOUNT = new BigDecimal(0); // ���o�ɋ��z
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE); // ���o�ɔN����
			sData.m_RCV_ISSUE_GNR_TYP = 21; // ���o�ɔ����敪
			sData.m_RCV_ISSUE_ODD_QTY = bdZero; // ���o�ɒ[��
			sData.m_DEFECT_CAUSE_CD = null; // ���o�ɕs�Ǘ��R�R�[�h
			sData.m_STOCK_UPD_TYP = 1; // �݌ɍX�V�敪
			sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_YET; // ���o�Ɋ����t���O(����ŕۊǋ�ʂɐݒ�)
			sData.m_OD_NO = stII.m_OD_NO; // �I�[�_�f�}���h�ԍ�
			sData.m_VEND_LOT_NO = gin.m_VEND_LOT_NO; // ���[�J���b�g�ԍ�
			// ---------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = ""; // ���o�ɔ��l
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd(_iconn); // ��ЃR�[�h
			sData.m_VEND_CD = stII.m_VEND_CD; // �����R�[�h
			sData.m_CONS_TYP = stII.m_CONS_TYP; // �x���敪
			sData.m_CONS_EXEC_DATE = null; // �L���x�����ђ��o��
			// ---------------------------------------------------------------

			/*******************************************************************
			 * �y �r�s�d�o�P �z �o�Ɍ��ۊǋ惊�X�g���ɏo�ɂ���B
			 ******************************************************************/
			for (Iterator itr = iWhList.iterator(); itr.hasNext();) {
				// �o�Ɍ��ۊǋ�R�[�h�����o��
				sWH_CD = (String) itr.next();

				// �ŏ��̕ۊǋ�R�[�h��ޔ����Ă����B
				if (sWH_CD_MIN.equals("")) {
					sWH_CD_MIN = sWH_CD;
				}

				// �Y���ۊǋ�̐��ԍ݌ɂ�����
				sJobOdrStock = new JobOdrStock(_iconn);
				bdHandQtr = sJobOdrStock.getHandQty(iJobOdrCd, iJobOdrDetailNo,
						stII.m_ITEM_CD, sWH_CD, 0);

				if (bdHandQtr != null && bdHandQtr.compareTo(bdZero) != 0) {
					// �ۊǋ斈�̓o�^�f�[�^�ݒ�----------------------------------
					sData.m_WH_CD = sWH_CD; // �ۊǋ�R�[�h
					// ���o�ɐ� �莝�݌ɐ��������o�ɐ� �̏ꍇ�A���o�ɐ�=�����o�ɐ�
					dIssueCountTemp = bdHandQtr;
					if (dIssueCountTemp.compareTo(dIssueNO) >= 0) {
						dIssueCountTemp = dIssueNO;
					}
					sData.m_RCV_ISSUE_QTY = dIssueCountTemp
							.multiply(new BigDecimal("-1"));

					// �o�Ɋ����t���O�̐ݒ�
					if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
						sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
					} else {
						if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE
								&& dIssueNO.subtract(dIssueCountTemp)
										.compareTo(bdZero) == 0) {
							sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
						}
					}
					// ------------------------------------------------------------
					// << �ۊǋ�ʓ��o�ɂ̓o�^���o�ɏ��� ���L���x������o�^ >>
					ret = insert_issue_process(sData, stII);

					if (ret) {
						iCount++;
						dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
						dIssueNO = dIssueNO.subtract(dIssueCountTemp);
					} else {
						return null;
					}
				}
				if (dIssueNO.compareTo(bdZero) == 0) {
					break;
				}

			}

			/*******************************************************************
			 * �y �r�s�d�o�Q �z ���ׂĂ̕ۊǋ悩��o�ɂ��Ă��܂��o�Ɏc������ꍇ�A �ŏ��̕ۊǋ悩��c�����ׂĂ��o�ɂ���B
			 ******************************************************************/
			if (dIssueNO.compareTo(bdZero) > 0 && chkFlg == true) {
				// �ۊǋ斈�̓o�^�f�[�^�̐ݒ�-------------------------------------
				sData.m_WH_CD = sWH_CD_MIN; // �ۊǋ�R�[�h
				sData.m_RCV_ISSUE_QTY = dIssueNO.multiply(new BigDecimal("-1")); // ���o�ɐ�

				// �o�Ɋ����t���O�̐ݒ�
				if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
					sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
				} else {
					if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE) {
						sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
					}
				}
				// ------------------------------------------------------------

				// << �ۊǋ�ʓ��o�ɂ̓o�^���o�ɏ��� ���L���x������o�^ >>
				ret = insert_issue_process(sData, stII);
				if (ret) {
					iCount++;
					dTotalIssueCnt = dTotalIssueCnt.add(dIssueNO);
				} else {
					return null;
				}
			}
			_log.methodEnd();
		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");
		}
		return dTotalIssueCnt;
	};

	/**
	 * 
	 * @param sData
	 *            �o�^����ۊǋ�ʓ��o�Ƀf�[�^
	 * @param stII
	 *            �o�Ɏw�����
	 * @return
	 * @throws SQLException
	 * @throws FoundationException
	 */

	private boolean insert_issue_process(RcvIssueStruct sData,
			IssueInstStruct stII) throws SQLException, FoundationException {

		String strOdrCd = "";
		boolean ret;
		// �o�Ɍ��ʃ��b�Z�[�W
		String MsgCd = null;

		// << �ۊǋ�ʓ��o�ɂ̓o�^ >> ----------------------------
		RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn, _updInfo);
		_log.message("LotNo=[" + sData.m_LOT_NO + "]");
		strOdrCd = sRcvIssueEntity.insert(sData);

		if (!strOdrCd.equals("")) {
			sData.m_RCV_ISSUE_CTRL_CD = strOdrCd; // ���o�ɊǗ��ԍ�
			// dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
			// dIssueNO = dIssueNO.subtract(dIssueCountTemp);
		}

		// �o�ɏ������Ăяo��
		_log.message("(SBM0902) �o�ɏ������Ăяo���܂�");
		_log.message("(SBM0700) ���o�ɊǗ��ԍ�=[" + strOdrCd + "]");
		IssueProcess wIssueProcess = new IssueProcess(_iconn, strOdrCd);
		ret = wIssueProcess.execProcess();
		_log.message("(SBM0902) �o�ɏ������Ăяo���܂�end");

		if (ret) {
			// �C���t�H���[�V�������b�Z�[�W��ۑ�
			for (Iterator itr = wIssueProcess.getInfoList().iterator(); itr
					.hasNext();) {
				MsgCd = (String) itr.next();
				setInfoList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			}
			// ���[�j���O���b�Z�[�W�͕ۑ����Ȃ��i���݁AIssueProxess����ԋp����Ă��Ȃ����߁j

		} else {
			_infoList.clear();
			_warnList.clear();
			// �G���[���b�Z�[�W��ۑ�
			for (Iterator itr = wIssueProcess.getErrorList().iterator(); itr
					.hasNext();) {
				MsgCd = (String) itr.next();
				setErrorList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			}
			_log.message("(SBM0921) �o�ɏ��� false");
			return false;
		}
		_log.message("(SBM0932) [�L���x������]�ւ̒ǉ�");

		// [�L���x������]�ւ̒ǉ�
		// [�o�Ɏw��]."�x���敪"=1�F�L���x���̏ꍇ[�L���x������]�֒ǉ�
		if (stII.m_CONS_TYP == 1) {
			insertPastOnerousCons(stII, sData);
		}
		_log.message("(SBM0933) ���b�g�g���[�X�̓o�^");
		// 2.9.8.4 ���b�g�g���[�X�̓o�^
		BizCommon bc = new BizCommon(this._iconn, this._updInfo.getUpdateBy(),
				this._updInfo.getUpdatePrgNm(), this._plantCd);
		List t_list = new ArrayList();
		t_list = getItemcd(gin);
		if (t_list != null && t_list.size() > 2) {
			String sItemcd = (String) t_list.get(0);
			String sLotno = (String) t_list.get(1);
			String LOT_CTRL_FLG = (String) t_list.get(2);
			String lotTraceTyp = "";
			int fromLotTraceTyp = getLotFlag(_iconn, sData.m_ITEM_CD);
			if (LOT_CTRL_FLG != null && LOT_CTRL_FLG.equals("1")
					&& fromLotTraceTyp == 1) {
				/*
				 * �u�����ԍ��v �� Null ���� [��Ǝ���]."�o�������єԍ�"��NULL�̏ꍇ 2:��Ǝ��� �u�����ԍ��v ��
				 * Null ���� [��Ǝ���]."�o�������єԍ�"��NULL�̏ꍇ 3:�o�������� �u�����ԍ��v �� Null�̏ꍇ
				 * 1:�������
				 */
				if (StringUtil.Validate(stII.m_PUCH_ODR_CD)) {
					lotTraceTyp = "1";
				} else {
					String OUTPUT_RSLT_CD = (String) t_list.get(3);
					if (StringUtil.Validate(OUTPUT_RSLT_CD)) {
						lotTraceTyp = "3";
					} else {
						lotTraceTyp = "2";
					}
				}
				List temp_list = new ArrayList();
				temp_list = bc.excMakeLotTraceFd(sData.m_ITEM_CD,
						sData.m_LOT_NO, sItemcd, sLotno, lotTraceTyp);
				// if (temp_list.get(0) != null || !temp_list.get(0).equals(""))
				// {
				// return false;
				// }
				//���b�g�g���[�X�o�^�E�X�V��������������
				if (bc.getResultStatus().intValue() != 3) {
					// ���i�ڔԍ��̔����ԍ��̌���
					String sFromPuchOdrCd = getFromPuchOdrCd(sData.m_ITEM_CD, sData.m_LOT_NO);
					
					// ���i�ڔԍ��̔����ԍ� �� Null�A�܂��́A�p�����[�^�u�����ԍ��v �� Null�̏ꍇ�A���b�g�g���[�X�̍X�V���s��
					if ((StringUtil.Validate(sFromPuchOdrCd)) || (StringUtil.Validate(stII.m_PUCH_ODR_CD))) {
						_log.message("(SBM0933) ���b�g�g���[�X�̍X�V");
						UpdateLotTraceFd(stII, sData.m_ITEM_CD, sData.m_LOT_NO, sFromPuchOdrCd, sItemcd, sLotno, lotTraceTyp);
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * [���b�g�g���[�X]�̍X�V
	 * 
	 * @param
	 * @param iIssueInstStruct
	 *            �o�Ɏw�����
	 * @param fromItemCd
	 *            ���i�ڃR�[�h
     * @param fromLotNo
	 *            �����b�g�ԍ�
	 * @param fromPuchOdrCd
	 *            �������ԍ�
	 * @param toItemCd
	 *            ��i�ڃR�[�h
     * @param toLotNo
	 *            �惍�b�g�ԍ�
	 * @param lotTraceTyp
	 *            �敪
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private void UpdateLotTraceFd(IssueInstStruct iIssueInstStruct,String fromItemCd,String fromLotNo,String fromPuchOdrCd,
	String toItemCd,String toLotNo, String lotTraceTyp) throws SQLException,FoundationException {
		
	    PreparedStatement ps = null;
	    String sql = "";
	    int iRC = 0;
	    try {
	        //�o�Ɏw�������擾
	        IssueInstStruct stII = iIssueInstStruct;
	            //�m���b�g�g���[�X�n�̍X�V���s���B
	            sql	= "	UPDATE T_LOT_TRACE " +
	                  "SET FROM_PUCH_ODR_CD = ? " +
	                  ", TO_PUCH_ODR_CD = ? " +
	                  ", UPDATED_DATE = sysdate " +
	                  ", UPDATED_BY = ? " +
	                  ", UPDATED_PRG_NM = ? " +
	                  ", MODIFY_COUNT = MODIFY_COUNT + 1 " +
	                  " WHERE FROM_ITEM_CD = ?" +
	                  " AND FROM_LOT_NO = ?" +
	                  " AND TO_ITEM_CD = ?" +
	                  " AND TO_LOT_NO = ?" +
	                  " AND LOT_TRACE_TYP = ?";
	            ps = _conn.prepareStatement(sql);
	            ps.setString(1,	fromPuchOdrCd);
	            ps.setString(2,	stII.m_PUCH_ODR_CD);
	            ps.setString(3,	_updInfo.getUpdateBy());
	            ps.setString(4,	_updInfo.getUpdatePrgNm());
	            ps.setString(5,	fromItemCd);
	            ps.setString(6,	fromLotNo);
	            ps.setString(7,	toItemCd);
	            ps.setString(8,	toLotNo);
	            ps.setInt(9,	Integer.parseInt(lotTraceTyp));
	            iRC	= ps.executeUpdate();
	       } finally {
	            if (ps != null) {
	                ps.close();
	            }
	       }
	}

	/**
	 * 
	 * ���i�ڔԍ��̔����ԍ��̌���
	 * 
	 * @param
	 * @param fromItemCd
	 *            ���i�ڃR�[�h
     * @param fromLotNo
	 *            �����b�g�ԍ�
	 * @return �������ԍ�
	 * @throws SQLException
	 * 
	 */
	private String getFromPuchOdrCd(String fromItemCd, String fromLotNo) throws SQLException {
		_log.methodStart();

		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		String sFromPuchOdrCd = null;
		String Sql = "";

		try {
			Sql = "SELECT A.PUCH_ODR_CD"
				+ " FROM T_ACPT_RSLT A"
				+ " WHERE A.ITEM_CD = ?"
				+ " AND A.LOT_NO = ?"
				+ " ORDER BY A.PUCH_ODR_CD DESC, A.ACPT_NO DESC";

			selectStmt = _conn.prepareStatement(Sql);
			selectStmt.setString(1, fromItemCd);
			selectStmt.setString(2, fromLotNo);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if (selectRslt.next()) {
				// �擪1����ԋp
				sFromPuchOdrCd = selectRslt.getString("PUCH_ODR_CD");
			}
			_log.methodEnd();
			return sFromPuchOdrCd;
		} finally {
			selectRslt.close();
			selectStmt.close();
		}

	}
	
	// ��i�ڔԍ��̌���
	private List getItemcd(AutoIssueParam AIP) throws SQLException {
		_log.methodStart();

		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		List sList = new ArrayList();
		String Sql = "";
		if (!StringUtil.Validate(AIP.m_PUCH_ODR_CD)) {
			if (!StringUtil.Validate(AIP.m_WORK_IN_PROC_CD)) {
				Sql = "SELECT A.ITEM_CD,A.LOT_NO,B.LOT_CTRL_FLG,A.OUTPUT_RSLT_CD"
						+ " FROM T_OPR_RSLT A,M_ITEM B,T_WORK_IN_PROC_BY_ITEM C"
						+ " WHERE A.ITEM_CD = B.ITEM_CD"
						+ " AND A.PARTIAL_PRD_NO = ?"
						+ " AND A.OPR_INST_CD = C.OPR_INST_CD"
						+ " AND C.WORK_ODR_CD =?";
			} else {
				Sql = "SELECT A.ITEM_CD,A.LOT_NO,B.LOT_CTRL_FLG,A.OUTPUT_RSLT_CD"
						+ " FROM T_OPR_RSLT A,M_ITEM B,T_WORK_IN_PROC_BY_PROC C"
						+ " WHERE A.ITEM_CD = B.ITEM_CD"
						+ " AND A.PARTIAL_PRD_NO = ?"
						+ " AND A.OPR_INST_CD = C.OPR_INST_CD"
						+ " AND C.WORK_IN_PROC_CD =? AND C.WORK_ODR_CD =?";
			}
		} else {
			Sql = "SELECT A.ITEM_CD,C.LOT_NO,B.LOT_CTRL_FLG"
					+ " FROM T_RLSD_PUCH_ODR A,M_ITEM B,T_ACPT_RSLT C"
					+ " WHERE A.ITEM_CD = B.ITEM_CD" + " AND C.ACPT_NO =?"
					+ " AND A.PUCH_ODR_CD =C.PUCH_ODR_CD"
					+ " AND A.PUCH_ODR_CD =?";
		}
		try {
			selectStmt = _iconn.getConn().prepareStatement(Sql);
			if (!StringUtil.Validate(AIP.m_PUCH_ODR_CD)) {
				if (!StringUtil.Validate(AIP.m_WORK_IN_PROC_CD)) {
					selectStmt.setInt(1, AIP.m_PARTIAL_PRD_NO);
					selectStmt.setString(2, AIP.m_WORK_ODR_CD);
				} else {

					selectStmt.setInt(1, AIP.m_PARTIAL_PRD_NO);
					selectStmt.setString(2, AIP.m_WORK_IN_PROC_CD);
					selectStmt.setString(3, AIP.m_WORK_ODR_CD);
				}
			} else {
				selectStmt.setInt(1, AIP.m_ACPT_NO);
				selectStmt.setString(2, AIP.m_PUCH_ODR_CD);
			}

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if (selectRslt.next()) {

				if (!StringUtil.Validate(AIP.m_PUCH_ODR_CD)) {
					sList.add(0, selectRslt.getString("ITEM_CD"));
					sList.add(1, selectRslt.getString("LOT_NO"));
					sList.add(2, selectRslt.getString("LOT_CTRL_FLG"));
					sList.add(3, selectRslt.getString("OUTPUT_RSLT_CD"));
				} else {
					sList.add(0, selectRslt.getString("ITEM_CD"));
					sList.add(1, selectRslt.getString("LOT_NO"));
					sList.add(2, selectRslt.getString("LOT_CTRL_FLG"));
				}
			}
			_log.methodEnd();
			return sList;
		} finally {
			selectRslt.close();
			selectStmt.close();
		}

	}

	/**
	 * 
	 * 2.10.7.1 �ʎ�z���o�ɉ\���̎Z�o���s���܂�
	 * 
	 * @param iInIndex
	 *            �����Ώەi�ڂ�index
	 * @param dInISSUENO
	 *            �����o�ɐ�
	 * @param iWhList
	 *            �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 * @param iRet
	 *            ���v�ʏ��
	 * @return �ʎ�z���o�ɉ\��
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ODR(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList, IssueRemain.ResultByOd iRet)
			throws SQLException, FoundationException {
		BigDecimal dRC = bdZero;
		BigDecimal ret_RC = bdZero;

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// �o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;

			/*******************************************************************
			 * ***** �o�ɉ\���̎Z�o �ʎ�z���o�ɉ\��(iRet.remainQty) �� [���v��].�I�[�_�� -
			 * ��[���v��].�o�ɗ݌v�� - ��[���Ԉ���].�o�ɍϐ�
			 */
			dRC = iRet.remainQty; // �ʎ�z���o�ɉ\��(�o�Ɏc��)

			if (dRC.compareTo(dInISSUENO) >= 0) {
				dRC = dInISSUENO;
			}

			// �ʎ�z���o�ɉ\�� �� 0
			if (dRC.compareTo(bdZero) > 0) {
				// �����o�ɐ���S�ďo�ɂ���܂Ły���ԕi�̕��o�ۊǋ�̏����z�ŏo��
				ret_RC = commonJOBODR(stII, iRet.jobOdrCd, iRet.jobOdrDetailNo,
						iWhList, dRC, false);
			}
			// _log.message("���Ԉ����E�o�ɍςݐ����v�EdISSUEED_QTY_SUM=["+dISSUEED_QTY_SUM+"]");
			// _log.message("�o�ɗv�����EdInISSUENO=["+dInISSUENO+"]");
			// _log.message("�o�ɎZ�o���EdRC=["+dRC+"]");
			// _log.message("�o�ɍϐ��EdRC1=["+dRC1+"]");

			_log.methodEnd();
		} finally {
		}
		return ret_RC;
	};

	/**
	 * 
	 * �ʎ�z���̗]��݌ɂ���o�ɂ��s���܂��B �莝�݌ɐ����Q�Ƃ��A�o�ɉ\�Ȕ͈͂ŏo�ɂ��܂��B
	 * 
	 * @param iIssueInstStruct
	 *            �����Ώەi�ڂ̏o�Ɏw�����
	 * @param dInISSUENO
	 *            �����o�ɐ�
	 * @param iWhList
	 *            �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 * @return �ʎ�z���o�ɐ�
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ODR_REMAIN(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		BigDecimal dSUM_HAND_QTY = bdZero;
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// �o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;

			// ���ԍ݌ɂ̌���
			/*
			 * [�ۊǋ�ʐ��ԍ݌�].�g���ԁh��[�o�Ɏw��].�I�[�_�f�}���h�ԍ��ň�v����[���v��]�̐��� [�ۊǋ�ʐ��ԍ݌�].�g�i�ڔԍ��h ��
			 * [�o�Ɏw��].�i�ڔԍ� [�ۊǋ�ʐ��ԍ݌�].�g�H��R�[�h�h �� [�o�Ɏw��].�H��R�[�h
			 */

			/* ***** �o�ɉ\���̎Z�o **** */
			// << [���ԍ݌ɂ�� ���莝�݌ɐ� �̎擾 >>
			JobOdrStock wJobOdrStock = new JobOdrStock(_iconn);
			dSUM_HAND_QTY = wJobOdrStock.getSumHandQty(stII.m_JOB_ODR_CD,
					stII.m_JOB_ODR_DETAIL_NO, stII.m_ITEM_CD, stII.m_PLANT_CD);
			if (dSUM_HAND_QTY != null && dSUM_HAND_QTY.compareTo(bdZero) > 0) {
				if (dSUM_HAND_QTY.compareTo(dInISSUENO) < 0) {
					dRC = dSUM_HAND_QTY;
				} else {
					dRC = dInISSUENO;
				}
			}

			// �ʎ�z���o�ɉ\�� �� 0
			if (dRC.compareTo(bdZero) > 0) {
				// �����o�ɐ���S�ďo�ɂ���܂�
				// �y���ԕi�̕��o�ۊǋ�̏����z
				dRC1 = commonJOBODR(stII, stII.m_JOB_ODR_CD,
						stII.m_JOB_ODR_DETAIL_NO, iWhList, dRC, false);
			}
			// _log.message("���Ԉ����E�o�ɍςݐ����v�EdISSUEED_QTY_SUM=["+dISSUEED_QTY_SUM+"]");
			// _log.message("�o�ɗv�����EdInISSUENO=["+dInISSUENO+"]");
			// _log.message("�o�ɎZ�o���EdRC=["+dRC+"]");
			// _log.message("�o�ɍϐ��EdRC1=["+dRC1+"]");

			_log.methodEnd();
		} finally {
		}
		return dRC1;
	};

	/**
	 * <pre>
	 *   ���Ԉ������o�ɉ\���i���ꐻ�ԁj����̏o�ɂ��s���A
	 *   ���ꐻ�ԍ݌ɂ���o�ɂ�������ԋp���܂��B
	 *   
	 *   @param iIssueInstStruct	�o�Ɏw�����
	 *   @param dInISSUENO       �����o�Ɏc��
	 *   @param iWhList          �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 *   @return�@���ꐻ�ԍ݌ɂ���o�ɂ�����
	 *   @throws SQLException
	 * 
	 */
	private BigDecimal issue_BY_JOBALC_SAME(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";

		BigDecimal dALCD_QTY = bdZero; // �����ϐ�
		BigDecimal dISSUEED_QTY = bdZero; // �o�ɍϐ�
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;
		BigDecimal dISSUENO = bdZero;
		String sJOB_ODR_CD = "";
		int jobOdrDetailNo = 0;

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// �o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;
			dISSUENO = dInISSUENO;

			// << ���Ԉ����̌��� >>
			sql = " SELECT JOB_ODR_CD,  JOB_ODR_DETAIL_NO, "
					+ "ITEM_CD, ALCD_QTY, ISSUEED_QTY "
					+ " FROM T_JOB_ODR_ALC "
					+ " WHERE ( (OD_NO=?)  AND (ALC_STOCK_TYP=2)  "
					+ " AND (JOB_ODR_CD=?) AND (JOB_ODR_DETAIL_NO = ?) ) "
					+ " ORDER BY JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, stII.m_OD_NO);
			ps.setString(2, stII.m_JOB_ODR_CD);
			ps.setInt(3, stII.m_JOB_ODR_DETAIL_NO);
			rs = ps.executeQuery();
			/* DEBUG */_log.message("(SBM0934) ���Ԉ����̌���");
			/* DEBUG */_log.message("sql=[" + sql + "]");
			if (rs.next()) {
				sJOB_ODR_CD = Nvl(rs.getString("JOB_ODR_CD"));
				jobOdrDetailNo = rs.getInt("JOB_ODR_DETAIL_NO");
				dALCD_QTY = rs.getBigDecimal("ALCD_QTY");
				dISSUEED_QTY = rs.getBigDecimal("ISSUEED_QTY");
				dRC = dALCD_QTY.subtract(dISSUEED_QTY); // �o�ɉ\��(�o�Ɏc��)

				/* DEBUG */_log.message("(SBM0935) ���v�ʁE���ʕϐ��u���ԁvsJOB_ODR_CD=["
						+ sJOB_ODR_CD + "]");
				/* DEBUG */_log.message("(SBM0936) ���Ԉ����E�����ςݐ��EdALCD_QTY=[" + dALCD_QTY
						+ "]");
				/* DEBUG */_log.message("(SBM0937) ���Ԉ����E�o�ɍςݐ��EdISSUEED_QTY=["
						+ dISSUEED_QTY + "]");
				/* DEBUG */_log.message("dRC=[" + dRC + "]");

				// �o�ɉ\��>�O�Ȃ�΁A�o�ɏ�������
				if (dRC.compareTo(bdZero) > 0) {
					if (dRC.compareTo(dISSUENO) >= 0) {
						dRC = dISSUENO;
					}
					/* DEBUG */_log.message("(SBM0845) �o�ɗv�����EdISSUENO=[" + dISSUENO
							+ "]");
					/* DEBUG */_log.message("(SBM0938) �o�ɉ\���EdRC=[" + dRC + "]");
					// ���Ԉ������o�ɉ\���i���ꐻ�ԁj> 0 ���A�����o�Ɏc�� > 0
					// �����o�ɐ���S�ďo�ɂ���܂�
					// �y���ԕi�̕��o�ۊǋ�̏����z
					dRC1 = commonJOBODR(stII, sJOB_ODR_CD, jobOdrDetailNo,
							iWhList, dRC, false); // dRC1:���ԍ݌ɂ���o�ɂ�����

					/* DEBUG */_log.message("(SBM0939) �o�ɐ��EdRC1=[" + dRC1 + "]");
				}
			}
			_log.methodEnd();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
		// ���Ԉ������o�ɉ\���i���ꐻ�ԁj����̏o�ɐ���ԋp
		return dRC1;
	};

	/**
	 * �y ���Ԉ������o�ɉ\���i�����ԁj����̏o�� �z ���Ԉ������o�ɉ\���i�����ԁj����̏o�ɂ��s���A �����ԍ݌ɂ���o�ɂ�������ԋp���܂��B
	 * 
	 * @param iIssueInstStruct
	 *            �o�Ɏw�����
	 * @param dInISSUENO
	 *            �����o�Ɏc��
	 * @param iWhList
	 *            �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 * @return �����ԍ݌ɂ���o�ɂ�����
	 * @throws SQLException
	 * @throws FoundationException
	 * 
	 */
	private BigDecimal issue_BY_JOBALC_OTHER(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";

		BigDecimal dALCD_QTY = bdZero;
		BigDecimal dISSUEED_QTY = bdZero;
		BigDecimal dISSUENO = bdZero;
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;
		BigDecimal dAllCount = bdZero;

		String jobOdrCd = ""; // [���Ԉ���]�̐���
		int jobOdrDetailNo = 0; // [���Ԉ���]�̐��Ԏ}��

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// �o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;
			dISSUENO = dInISSUENO;

			// << ���Ԉ����̌��� >>
			sql = " SELECT JOB_ODR_CD,  JOB_ODR_DETAIL_NO, "
					+ " ITEM_CD, ALCD_QTY, ISSUEED_QTY "
					+ " FROM T_JOB_ODR_ALC "
					+ " WHERE OD_NO=? AND ALC_STOCK_TYP=2 AND JOB_ODR_CD <> ? "
					+ " ORDER BY JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, stII.m_OD_NO);
			ps.setString(2, stII.m_JOB_ODR_CD);

			rs = ps.executeQuery();
			/* DEBUG */_log.message("(SBM0934) ���Ԉ����̌���");
			/* DEBUG */_log.message("sql=[" + sql + "]");
			while (rs.next()) {
				jobOdrCd = rs.getString("JOB_ODR_CD"); // [���Ԉ���]�̐��Ԃ��擾
				jobOdrDetailNo = rs.getInt("JOB_ODR_DETAIL_NO");// [���Ԉ���]�̐��Ԏ}�Ԃ��擾

				// �o�ɉ\���̎Z�o ( �����ϐ��|�o�ɍϐ� )
				dALCD_QTY = rs.getBigDecimal("ALCD_QTY"); // �����ςݐ�
				dISSUEED_QTY = rs.getBigDecimal("ISSUEED_QTY"); // �o�ɍςݐ�
				dRC = dALCD_QTY.subtract(dISSUEED_QTY); // �o�ɉ\��
				/* DEBUG */
				_log.message("(SBM0974) ���Ԉ����E�u���ԁv�EjobOdrCd=[" + jobOdrCd + "]");
				/* DEBUG */_log.message("(SBM0936) ���Ԉ����E�����ϐ��EdALCD_QTY=[" + dALCD_QTY
						+ "]");
				/* DEBUG */_log.message("(SBM0937) ���Ԉ����E�o�ɍϐ��EdISSUEED_QTY=["
						+ dISSUEED_QTY + "]");
				/* DEBUG */_log.message("dRC=[" + dRC + "]");

				// �o�ɉ\�����O�ȉ��Ȃ�΁A���̈���������������
				if (dRC.compareTo(bdZero) <= 0) {
					continue;
				}

				if (dRC.compareTo(dISSUENO) >= 0) {
					dRC = dISSUENO;
				}
				/* DEBUG */_log.message("(SBM0845) �o�ɗv�����EdISSUENO=[" + dISSUENO + "]");
				/* DEBUG */_log.message("(SBM0938) �o�ɉ\���EdRC=[" + dRC + "]");

				// ���Ԉ������o�ɉ\���i�����ԁj�� 0 ���A�����o�Ɏc�� ��0
				// �����o�ɐ���S�ďo�ɂ���܂�
				// �y���ԕi�̕��o�ۊǋ�̏����z
				dRC1 = commonJOBODR(stII, jobOdrCd, jobOdrDetailNo, iWhList,
						dRC,false);
				if (dRC1 == null) {
					return null;
				}

				dISSUENO = dISSUENO.subtract(dRC1);
				dAllCount = dAllCount.add(dRC1);
				/* DEBUG */_log.message("(SBM0975) �o�ɗv���c���EdISSUENO=[" + dISSUENO + "]");
				/* DEBUG */_log.message("(SBM0976) �o�ɐ����v�EdAllCount=[" + dAllCount + "]");
				if (dISSUENO.compareTo(bdZero) == 0) {
					break;
				}
			}
			_log.methodEnd();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
		return dAllCount;
	};

	/**
	 * 2.10.7.3 �݌Ɉ������o�ɉ\������̏o�� 3 �݌Ɉ������o�ɉ\������̏o�ɂ��s���A �݌Ɉ������̕i�ڍ݌ɂ���o�ɂ�������ԋp���܂��B
	 * 
	 * @param iIssueInstStruct
	 *            �o�Ɏw�����
	 * @param dInISSUENO
	 *            �����o�ɐ�
	 * @param iWhList
	 *            �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ITEMALC(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		BigDecimal dISSUENO = bdZero;
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;

		try {
			_log.methodStart();
			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}
			// �o�Ɏw�������擾
			IssueInstStruct stII = iIssueInstStruct;

			dISSUENO = dInISSUENO;

			// �����ς݂̕i�ڍ݌ɂ���̏o�Ɏc�����擾
			// �o�ɉ\�� = �����ϐ� - �o�ɍςݐ�
			IssueRemain sIssueRemain = new IssueRemain(_iconn);
			dRC = sIssueRemain.getRemainQtyByItem(stII.m_OD_NO);

			// DEBUG
			// _log.message("�o�ɗv�����EdISSUENO=["+dISSUENO+"]");
			// _log.message("�o�ɉ\���EdRC=["+dRC+"]");

			if (dRC.compareTo(dISSUENO) >= 0) {
				dRC = dISSUENO;
			}
			// �����o�ɐ���S�ďo�ɂ���܂Ły�l�q�o�i�̕��o�ۊǋ�̏����z�ŏo��
			if (dRC.compareTo(bdZero) > 0) {
				dRC1 = commonMRP(stII, dRC, iWhList, 3);
			}

			_log.methodEnd();
		} finally {
		}
		return dRC1;
	};

	/**
	 * 
	 * 2.10.7.4 �i�ڍ݌Ɂi�]��݌Ɂj����̏o�� �i�ڍ݌Ɂi�]��݌Ɂj����̏o�ɂ��s���A �]��݌ɂ���o�ɂ�������ԋp���܂��B
	 * 
	 * @param iIssueInstStruct
	 *            �o�Ɏw�����
	 * @param dInISSUENO
	 *            �����o�ɐ�
	 * @param iWhList
	 *            �i�ڂ��Ƃ̏o�Ɍ��ۊǋ惊�X�g
	 * @return �]��݌ɂ���̏o�ɐ�
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ITEM_REMAIN(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		BigDecimal dRC = bdZero;
		int iRC = 0;

		_log.methodStart();
		if (dInISSUENO.compareTo(bdZero) <= 0) {
			return bdZero;
		}

		// �o�Ɏw�������擾
		IssueInstStruct stII = iIssueInstStruct;

		// [���Ԉ���]�̍X�V�i�����ϐ��̍X�V�j
		JobOdrAlc wAlc = new JobOdrAlc(_iconn);
		wAlc.updateAlcQty(stII, dInISSUENO, _updInfo);

		// �����o�ɐ���S�ďo�ɂ���܂�
		// �y�l�q�o�i�̕��o�ۊǋ�̏����z
		dRC = commonMRP(stII, dInISSUENO, iWhList, 3);
		_log.methodEnd();
		return dRC;
	};

	/**
	 * 
	 * [�L���x������]�t�@�C���ւ̃��R�[�h�ǉ�
	 * 
	 * @param
	 * @param istII
	 *            �o�Ɏw�����
	 * @param istRCI
	 *            �ۊǋ�ʓ��o�Ƀf�[�^
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private void insertPastOnerousCons(IssueInstStruct istII,
			RcvIssueStruct istRCI) throws SQLException, FoundationException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";
		int iIndex = 0;
		int iRC = 0;
		String strOdrCd = "";
		boolean ret;

		java.util.Date dtDate = null;
		try {
			_log.methodStart();
			// [�x���P��]������
			ConsUnitCost sCost = new ConsUnitCost(_iconn);
			ret = sCost.read(istII.m_COMPANY_CD, istII.m_VEND_CD,
					istII.m_PLANT_CD, istII.m_ITEM_CD, gin.m_RCV_ISSUE_DATE);

			_log.message("(SBM0905) �L���x���ԍ��̍̔�");
			// �L���x���ԍ��̍̔�
			Numbering ODR_CD = new Numbering(_iconn, Numbering.ONERCONS_CD,
					_updInfo.getUpdateBy(), _updInfo.getUpdatePrgNm(), _plantCd);
			strOdrCd = ODR_CD.getNo();
			// Insert
			sql = " INSERT INTO  T_PAST_ONEROUS_CONS ( "
					+ " ONEROUS_CONS_NO	," // �L���x���ԍ�
					+ " COMPANY_CD ," // ��ЃR�[�h
					+ " VEND_CD ," // �����R�[�h
					+ " PLANT_CD ," // �H��R�[�h
					+ " JOB_ODR_CD ," // ����
					+ " JOB_ODR_DETAIL_NO ," // ���Ԏ}��
					+ " ITEM_CD ," // �i�ڔԍ�
					+ " ISSUE_DATE ," // �o�ɓ�
					+ " ISSUE_QTY ," // �o�ɐ�
					+ " UNIT_COST ," // �P��
					+ " UNIT_COST_TYP ," // �P���敪
					+ " ONEROUS_CONS_COMMENT ," // �L���x�����l
					+ " VEND_LOT_NO ," // ���[�J���b�g�ԍ�
					+ " RCV_ISSUE_CTRL_CD ," // ���o�ɊǗ��ԍ�
					+ " WORK_ODR_CD ," // ��ƌv��ԍ�
					+ " WORK_IN_PROC_CD ," // �d�|��ƃR�[�h
					+ " PUCH_ODR_CD ," // �����ԍ�
					+ " ISSUE_INST_CD ," // �o�Ɏw���ԍ�
					+ " RETURNED_WH_CD ," // �ԕi��ۊǋ�R�[�h
					+ " RETURNED_CAUSE_CD ," // �ԕi���R�R�[�h
					+ " RETURNED_GNR_TYP ," // �ԕi���������敪
					+ " AP_PROC_TYP ," // ���|�����敪
					+ " CREATED_BY ," // �쐬��
					+ " CREATED_PRG_NM ," // �쐬�v���O������
					+ " UPDATED_BY ," // �X�V��
					+ " UPDATED_PRG_NM ," // �X�V�v���O������
					+ " MODIFY_COUNT )" // �X�V��
					+ " values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			iIndex = 1;
			ps = _conn.prepareStatement(sql);
			ps.setString(iIndex++, strOdrCd); // �L���x���ԍ�
			ps.setString(iIndex++, istII.m_COMPANY_CD); // ��ЃR�[�h
			ps.setString(iIndex++, istII.m_VEND_CD); // �����R�[�h
			ps.setString(iIndex++, istII.m_PLANT_CD); // �H��R�[�h
			setNvl(iIndex++, istRCI.m_JOB_ODR_CD, ps); // ����
			ps.setInt(iIndex++, istRCI.m_JOB_ODR_DETAIL_NO); // ���Ԏ}��
			ps.setString(iIndex++, (String) istII.m_ITEM_CD); // �i�ڔԍ�

			dtDate = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime())); // ���o�ɔN����
			ps.setBigDecimal(iIndex++, istRCI.m_RCV_ISSUE_QTY
					.multiply(new BigDecimal(-1)));// �o�ɐ�
			if (ret) { // �x���P�����R�[�h�����݂����ꍇ
				// �P��
				if (sCost.getOnerousFlg() == 1) {
					ps.setBigDecimal(iIndex++, sCost.getUnitCost());
				} else if (sCost.getOnerousFlg() == 0) {
					ps.setDouble(iIndex++, 0);
				}
				// �P���敪
				ps.setInt(iIndex++, sCost.getUnitCostTyp());
			} else { // �x���P�����R�[�h�����݂��Ȃ������ꍇ
				ps.setDouble(iIndex++, 0); // �P��
				ps.setInt(iIndex++, 0); // �P���敪
			}
			ps.setNull(iIndex++, Types.VARCHAR); // �L���x�����l
			setNvl(iIndex++, istRCI.m_VEND_LOT_NO, ps); // ���[�J���b�g�ԍ�
			ps.setString(iIndex++, istRCI.m_RCV_ISSUE_CTRL_CD); // ���o�ɊǗ��ԍ�
			ps.setNull(iIndex++, Types.VARCHAR); // ��ƌv��ԍ�
			ps.setNull(iIndex++, Types.VARCHAR); // �d�|��ƃR�[�h
			ps.setString(iIndex++, istII.m_PUCH_ODR_CD); // �����ԍ�
			ps.setString(iIndex++, istII.m_ISSUE_INST_CD); // �o�Ɏw���ԍ�
			ps.setNull(iIndex++, Types.VARCHAR); // �ԕi��ۊǋ�R�[�h
			ps.setNull(iIndex++, Types.VARCHAR); // �ԕi���R�R�[�h
			ps.setInt(iIndex++, 0); // �ԕi���������敪
			ps.setInt(iIndex++, 0); // ���|�����敪
			// -----------------------------------------------------------------------
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // �쐬��
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // �쐬�v���O������
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // �X�V��
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // �X�V�v���O������
			ps.setDouble(iIndex++, 0); // �X�V��
			iRC = ps.executeUpdate();

			/* DEBUG */_log.message("(SBM0940) �L���x�������̓o�^");
			/* DEBUG */_log.message("sql=[" + sql + "]");
			/* DEBUG */_log.message("(SBM0941) �L���x�������̊Ǘ��ԍ�=[" + strOdrCd + "]");
			/* DEBUG */_log.message("(SBM0942) �L���x�������̓o�^����=[" + iRC + "]");
			_log.methodEnd();
		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
		return;
	}

	// ************************************************************************************
	// ���b�Z�[�W�����p���\�b�h
	// ************************************************************************************
	// �����o�Ɍ��ʊi�[�p�̃��b�Z�[�W���X�g
	private List retMsg = new ArrayList();// �����o�Ɍ��ʊi�[�p�̃��b�Z�[�W���X�g

	/** ��񃁃b�Z�[�W�i�[���X�g */
	private ArrayList _infoList = new ArrayList();

	/** �x�����b�Z�[�W�i�[���X�g */
	private ArrayList _warnList = new ArrayList();

	/** �G���[���b�Z�[�W�i�[���X�g */
	private ArrayList _errorList = new ArrayList();

	/**
	 * �C���t�H���[�V�������b�Z�[�W�ݒ�
	 * 
	 * @param iMsgCd
	 *            ���b�Z�[�W�R�[�h
	 * @param iMsgDetail
	 *            ���b�Z�[�W�ڍׁi�o�Ɏw���ԍ��j
	 */
	private void setInfoList(String iMsgCd, String iMsgDetail) {
		String[] w_msg = new String[2];

		w_msg[0] = iMsgCd;
		w_msg[1] = iMsgDetail;
		_infoList.add(w_msg);
		return;
	}

	/**
	 * ���[�j���O���b�Z�[�W�ݒ�
	 * 
	 * @param iMsgCd
	 *            ���b�Z�[�W�R�[�h
	 * @param iMsgDetail
	 *            ���b�Z�[�W�ڍׁi�i�ڔԍ��j
	 */
	private void setWarnList(String iMsgCd, String iMsgDetail) {
		String[] w_msg = new String[2];

		w_msg[0] = iMsgCd;
		w_msg[1] = iMsgDetail;
		_warnList.add(w_msg);
		return;
	}

	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * 
	 * @param iMsgCd
	 *            ���b�Z�[�W�R�[�h
	 * @param iMsgDetail
	 *            ���b�Z�[�W�ڍׁi�o�Ɏw���ԍ��j
	 */
	private void setErrorList(String iMsgCd, String iMsgDetail) {
		String[] w_msg = new String[2];

		_infoList.clear();
		_warnList.clear();
		w_msg[0] = iMsgCd;
		w_msg[1] = iMsgDetail;
		_errorList.add(w_msg);
		return;
	}

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return �G���[���X�g(���b�Z�[�W�R�[�h(String) �̃��X�g�j
	 */
	protected ArrayList getErrorList() {
		return _errorList;
	}

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return info���X�g
	 */
	protected ArrayList getInfoList() {
		return _infoList;
	}

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return warn���X�g
	 */
	protected ArrayList getWarnList() {
		return _warnList;
	}

	/**
	 * �Ɩ����b�Z�[�W�̏o�͂��s���B(�Ɩ����b�Z�[�W�e�[�u���ւ̏o�́j
	 * 
	 * @param conn
	 *            DB�R�l�N�V����
	 * @param businessName
	 *            �Ɩ���
	 * @param userId
	 *            ���[�U�R�[�h
	 * @param plantCd
	 *            �H��R�[�h
	 * @param businessErrCode
	 *            ���b�Z�[�W�R�[�h
	 * @param errNote
	 *            ���b�Z�[�W�ڍ�
	 * 
	 * @throws SQLException
	 * @throws FoundationException
	 * 
	 */
	private void outBusinessMessage(String businessErrCode, String errNote)
			throws SQLException, FoundationException {

		outBusinessMessage(_iconn, _updInfo.getUpdatePrgNm(), _updInfo
				.getUpdateBy(), _plantCd, businessErrCode, errNote);
	}

	/**
	 * �Ɩ����b�Z�[�W�̏o�͂��s���B(�Ɩ����b�Z�[�W�e�[�u���ւ̏o�́j
	 * 
	 * @param conn
	 *            DB�R�l�N�V����
	 * @param businessName
	 *            �Ɩ���
	 * @param userId
	 *            ���[�U�R�[�h
	 * @param plantCd
	 *            �H��R�[�h
	 * @param businessErrCode
	 *            ���b�Z�[�W�R�[�h
	 * @param errNote
	 *            ���b�Z�[�W�ڍ�
	 * 
	 * @throws SQLException
	 * @throws FoundationException
	 * 
	 */
	public final static void outBusinessMessage(IDbConnection conn,
			String businessName, String userId, String plantCd,
			String businessErrCode, String errNote) throws SQLException,
			FoundationException {

		// �Ɩ����b�Z�[�W�̏���
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		businessMsgAcc.init(conn);
		businessMsg.setBusinessOperatingName(businessName);
		businessMsg.setUser(userId);
		businessMsg.setPlantCode(plantCd);
		businessMsg.setMessageCode(businessErrCode);
		businessMsg.setData(errNote);

		Numbering logCd = new Numbering(conn, Numbering.LOG_CD, userId,
				businessName, plantCd);
		businessMsg.setLogCode(logCd.getNo());
		businessMsgAcc.add(businessMsg);
	}

	// ************************************************************************************

	// ******************************************************************
	// ������ҏW
	// ******************************************************************

	/**
	 * �P�D�w�肳�ꂽ������NULL�̏ꍇ�A�����O�̕������ԋp���܂��B �Q�D�w�肳�ꂽ������NUll�łȂ��ꍇ�́A�w�肳�ꂽ�������
	 * ���̂܂ܕԋp���܂��B
	 */
	private String Nvl(String iStr) {
		String ret_str;
		if (iStr == null) {
			ret_str = "";
		} else {
			ret_str = iStr;
		}
		return ret_str;

	}

	/**
	 * �P�D�w�肳�ꂽ���t�^��NULL�̏ꍇ�A�����O�̕������ԋp���܂��B �Q�D�w�肳�ꂽ���t�^��NUll�łȂ��ꍇ�́A
	 * �w�肳�ꂽ������(���t)��/�t���ɕϊ����ĕԋp���܂��B
	 */
	private String Nvl(Date iDate) {
		String ret_str;

		if (iDate == null) {
			ret_str = "";
		} else {
			ret_str = Converter.dateToStr(iDate, Converter.SLASH_DATE);
		}
		return ret_str;
	}

	/**
	 * PrearedStatment�ɁA�w�肳�ꂽ�l��ݒ肵�܂��B
	 * 
	 * @param idx
	 *            ���ڈʒu���
	 * @param iStr
	 *            �ݒ蕶����
	 * @param iPs
	 *            PreparedStatement
	 * @throws SQLException
	 * 
	 */
	private void setNvl(int idx, String iStr, PreparedStatement iPs)
			throws SQLException {

		if (iStr == null) {
			iPs.setNull(idx, Types.VARCHAR);
		} else {
			iPs.setString(idx, iStr);
		}
	}

	private void setNvl(int idx, Date iDate, PreparedStatement iPs)
			throws SQLException {

		if (iDate == null) {
			iPs.setNull(idx, Types.DATE);
		} else {
			iPs.setDate(idx, new java.sql.Date(iDate.getTime()));
		}
	}

	// -------------------------------------------------------------------------------------------
	// Common Sub Class
	// -------------------------------------------------------------------------------------------
	/**
	 * �����o�ɏ��� �N���p�����[�^�N���X �i�����o�ɏ������ʏ��j
	 * 
	 */
	public class AutoIssueParam {
		// �����o�ɕi�� ���ʏ��
		public int m_RCV_ISSUE_TYP = 0; // �����o�ɏ����敪

		public String m_WORK_ODR_CD = null; // ��ƌv��ԍ�

		public String m_WORK_IN_PROC_CD = null; // �d�|��ƃR�[�h

		public int m_PARTIAL_PRD_NO = 0; // �����

		public int m_OPR_RSLT_CRCT_NO = 0; // ��Ǝ��ђ�����

		public String m_PUCH_ODR_CD = null; // �����ԍ�

		public int m_ACPT_NO = 0; // �����

		public int m_ACPT_RSLT_CRCT_NO = 0; // ������ђ�����

		public String m_RCV_ISSUE_DATE = null; // �o�ɔN����(yyyy/MM/DD�`��)
		
		public String m_INSPC_ACPT_DATE = null; // �������єN����(yyyy/MM/DD�`��)

		public String m_RCV_ISSUE_RSLT_NO = null; // �����Ώێ��ѐ�

		public int m_RCV_ISSUE_CMPLT_FLG = 0; // �o�Ɋ����t���O

		public String m_PLANT_CD = null; // �H��R�[�h

		public String m_VEND_LOT_NO = null; // ���[�J���b�g�ԍ�(�L�b�g�ꊇ�o�Ɏ��Ɏg�p)
	}

	/**
	 * ���O�o��(�C���i�[�N���X)
	 */
	class Log {
		private int indent = 0;

		private SystemLog _syslog = new SystemLog(); // �������O�o�̓N���X

		// �R���X�g���N�^ // 2003/08/11 connection�擾���C��
		public Log(String className, IDbConnection conn) {
			// ���� ������
			// _syslog.init(className);
			_syslog.init("AUTO_ISSUE");
		}

		public void methodStart() {
			log("start");
			indent++;
		}

		public void methodEnd() {
			indent--;
			log("end");
		}

		public void message(String message) {
			log(message);
		}

		private void log(String message) {

			// ���̃��\�b�h���Ăяo�������\�b�h���擾
			StackTraceElement e = (new Throwable()).getStackTrace()[2];

			String className = e.getClassName();
			String methodName = e.getMethodName();

			// �p�b�P�[�W���������N���X�����擾
			StringTokenizer st = new StringTokenizer(className, ".");
			String lastClassName = "";
			while (st.hasMoreTokens()) {
				lastClassName = st.nextToken();
			}
			// ���̎��Ԃ��擾
			Date now = new Date();
			SimpleDateFormat f = new SimpleDateFormat("M/d HH:mm:ss.SSS");
			String sNow = f.format(now);
			String out = sNow + " <" + indent + "> [" + lastClassName + "/"
					+ methodName + "] " + message;

			// ���� ���O�o��
			_syslog.fine_d(out, _updInfo.getUpdateBy());

			// ���O�o��(System.out��)
			// System.out.println(out);
		}
	}

	/**
	 * ���b�gfalg���擾
	 * 
	 * @param connect
	 * @param iItemCd
	 * @return ���b�gfalg
	 * @throws SQLException
	 * @serialData 2007/04/19
	 */
	private int getLotFlag(IDbConnection connect, String iItemCd)
			throws SQLException {
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		int i = 0;
		// �����`�F�b�N
		if (!StringUtil.Validate(iItemCd)) {
			IllegalArgumentException e = new IllegalArgumentException(this
					.getClass().getName());
			throw e;
		}

		/** ���b�gflag�Ǎ��p SQL */
		String selectStr = "SELECT" + " LOT_CTRL_FLG " + "FROM" + " M_ITEM "
				+ "WHERE" + " ITEM_CD = ?";

		try {
			selectStmt = connect.getConn().prepareStatement(selectStr);
			selectStmt.setString(1, iItemCd);
			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if (selectRslt.next() == false)
				return 0;
			if (selectRslt.getString("LOT_CTRL_FLG") == null) {
				i = 0;
			} else {

				i = selectRslt.getInt("LOT_CTRL_FLG");
			}
			return i;

		} finally {
			selectRslt.close();
			selectStmt.close();
		}
	}

	/**
	 * <pre>
	 *    �H��R�[�h�A�i�ڔԍ��A���v�ʌv�Z�Ώۃt���O������
	 *    [�i�ڕʕۊǐ�D�揇��]�A[�ۊǋ�]����ۊǋ�R�[�h�ꗗ��
	 *    �D�揇�ʔԍ��̏����܂��͍~���Ŏ擾����B
	 * </pre>
	 * 
	 * @param iConnect
	 *            �R�l�N�V������OPEN����Ă��Ȃ�IDbConnection
	 * @param iPlantCd
	 *            �H��R�[�h
	 * @param iItemCd
	 *            �i�ڔԍ�
	 * @param iSortTyp
	 *            �\�[�g�t���O TRUE�F�����AFALSE�F�~��
	 * @return List �D��ۊǋ�R�[�h([�i�ڕʕۊǐ�D�揇��]."�i�ڕʕۊǐ�D�揇��"�̏���or�~��)<br>
	 *         �f�[�^�����݂��Ȃ��ꍇ�̓��X�g�T�C�Y��0�B
	 * @throws SQLException
	 *             DB�A�N�Z�X�G���[
	 */
	private static final List getMrpWhAllF(IDbConnection iConnect,
			String iPlantCd, String iItemCd, boolean iSortTyp)
			throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// �����`�F�b�N
		if (iConnect == null || !StringUtil.Validate(iPlantCd)
				|| !StringUtil.Validate(iItemCd)) {
			IllegalArgumentException e = new IllegalArgumentException(
					"ValidateWh.getPriorityByItem()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// �\�[�g�^�C�v�̐ݒ�
		String selectMWhPriority = "";
		if (iSortTyp) {
			selectMWhPriority = "SELECT WH_CD FROM "
				+ "((select "
				+ "M_WH_PRIORITY.WH_CD WH_CD, M_WH_PRIORITY.WH_PRIORITY_REF_NO WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH_PRIORITY, "
				+ "M_WH "
				+ "where "
				+ "M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "and M_WH_PRIORITY.PLANT_CD =  ? "
				+ "and M_WH_PRIORITY.ITEM_CD =  ? "
				+ "and M_WH.MRP_FLG = ?) "
				+ "union "
				+ "(select "
				+ "M_WH.WH_CD WH_CD, to_number(?) WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH "
				+ "where "
				+ " M_WH.PLANT_CD =  ? "
				+ "and M_WH.WH_CD IN   ( SELECT WH_CD FROM t_item_STOCK WHERE ITEM_cd= ?"
				+ " ) " + "AND M_WH.WH_CD NOT IN (select "
				+ "  M_WH_PRIORITY.WH_CD WH_CD " + "   from"
				+ "   M_WH_PRIORITY, " + "   M_WH" + "   where "
				+ "   M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "   and M_WH_PRIORITY.PLANT_CD =  ?"
				+ "   and M_WH_PRIORITY.ITEM_CD =  ?"
				+ "   and M_WH.MRP_FLG =  ?) "
				+ "and M_WH.MRP_FLG =  ?)) "
				+ "order by " + "WH_PRIORITY_REF_NO,WH_CD ASC";
		} else {
			selectMWhPriority = "SELECT WH_CD FROM "
				+ "((select "
				+ "M_WH_PRIORITY.WH_CD WH_CD, M_WH_PRIORITY.WH_PRIORITY_REF_NO WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH_PRIORITY, "
				+ "M_WH "
				+ "where "
				+ "M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "and M_WH_PRIORITY.PLANT_CD =  ? "
				+ "and M_WH_PRIORITY.ITEM_CD =  ? "
				+ "and M_WH.MRP_FLG = ?) "
				+ "union "
				+ "(select "
				+ "M_WH.WH_CD WH_CD, to_number(?) WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH "
				+ "where "
				+ " M_WH.PLANT_CD =  ? "
				+ "and M_WH.WH_CD IN   ( SELECT WH_CD FROM t_item_STOCK WHERE ITEM_cd= ?"
				+ " ) " + "AND M_WH.WH_CD NOT IN (select "
				+ "  M_WH_PRIORITY.WH_CD WH_CD " + "   from"
				+ "   M_WH_PRIORITY, " + "   M_WH" + "   where "
				+ "   M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "   and M_WH_PRIORITY.PLANT_CD =  ?"
				+ "   and M_WH_PRIORITY.ITEM_CD =  ?"
				+ "   and M_WH.MRP_FLG =  ?) "
				+ "and M_WH.MRP_FLG =  ?)) "
				+ "order by " + "WH_PRIORITY_REF_NO,WH_CD DESC";
		}
		try {
			// �f�[�^�Ǎ���SQL�쐬
			ps = conn.prepareStatement(selectMWhPriority);
			ps.setString(1, iPlantCd);
			ps.setString(2, iItemCd);
			ps.setInt(3, RcvIssueConst.MRP_TARGET);
			ps.setString(4, RcvIssueConst.STR_WH_PRIORITY_REF_NO);
			ps.setString(5, iPlantCd);
			ps.setString(6, iItemCd);
			ps.setString(7, iPlantCd);
			ps.setString(8, iItemCd);
			ps.setInt(9, RcvIssueConst.MRP_TARGET);
			ps.setInt(10, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// ���݃`�F�b�N
			if (rs.next()) {
				// ���ʂ�ݒ�
				outList.add(rs.getString(1));
				while (rs.next()) {
					// �f�[�^���擾
					outList.add(rs.getString(1));
				}
			}

			return outList;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}
}
