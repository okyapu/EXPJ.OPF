//------------------------------------------------------------------------------
// (#)ATMrpManager.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2003/07/08 �V�K�쐬 K.Matsumoto
// 2003/08/05 version 1.00 ���� M.Isoda
// 2003/08/06 version 1.01 HolidayList�N���X���̕ύX�ɔ����C��.Isoda
//                         �O�FHolidayList
//                         ��FHolidayAccessor
// 2003/08/08 version 1.02 MrpManager�p�b�P�[�W���ɔ����ύX M.Isoda
//            �O�Fcom.nec.jp.orteus.metamorBase.AB0010
//            ��Fcom.nec.jp.orteus.metamorBase.common01.StockCalculate
//            HolidayAccessor�N���X�̃p�b�P�[�W���̂��߁Aimport��ǉ�
//            MrpData�N���X�̃p�b�P�[�W���̂��߁Aimport��ǉ�
//
// version 1.03
// 2003/09/05 M.Isoda
//            �O���̗L���݌ɂ��}�C�i�X�̏ꍇ���v���X�̏ꍇ�Ɠ��l�̌v�Z�����������Ȃ��悤�ɏC��
//
// version 1.04
// 2003/09/12 M.Isoda
//            ���ʉ��Z�N���X�֑Ή�(Calculate�p�b�P�[�W�̂�import�ǉ�)
//              �Ή��ɔ����A�g�p���Ȃ��Ȃ������\�b�h���폜
//
// version 1.05
// 2008/10/05 nexs.ima
//		For AT �ߋ����̏��v��LOAD�\�ɂ����ŁB
//
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
// 2003/08/08 M.Isoda
//------------------------------------------------------------------------------
package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.expj.util.MrpData;
import com.nec.jp.orteus.expj.util.HolidayAccessor;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
//------------------------------------------------------------------------------

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Vector;


/**
 *(#)ATMrpManager.java
 *
 * Copyright (c) 2008 NEXS,Ltd.
 *
 * @author nexs.ima
 * Date : 2008/12/08
 * @version 1.01
 * <pre>
 * History 
 * 2008/10/05 nexs.ima
 *		For AT �ߋ����̏��v��LOAD�\�ɂ����ŁB
 *
 *
 * �EFor AT Chk:20081208
 * 
 * ATMrpManager�N���X
 * 	MRP�f�[�^�Z�o�E���o����
 *  executeTime
 *  execute
 * 
 *-------------------------------------------OriSpc
 * MrpManager.java
 *
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 *
 * History
 * 2003/07/08 �V�K�쐬 K.Matsumoto
 * 2003/08/05 version 1.00 ���� M.Isoda
 * 2003/08/06 version 1.01 HolidayList�N���X���̕ύX�ɔ����C��.Isoda
 *                         �O�FHolidayList
 *                         ��FHolidayAccessor
 * 2003/08/08 version 1.02 MrpManager�p�b�P�[�W���ɔ����ύX M.Isoda
 *            �O�Fcom.nec.jp.orteus.metamorBase.AB0010
 *            ��Fcom.nec.jp.orteus.metamorBase.common01.StockCalculate
 *            HolidayAccessor�N���X�̃p�b�P�[�W���̂��߁Aimport��ǉ�
 *            MrpData�N���X�̃p�b�P�[�W���̂��߁Aimport��ǉ�
 *
 * version 1.03
 * 2003/09/05 M.Isoda
 *            �O���̗L���݌ɂ��}�C�i�X�̏ꍇ���v���X�̏ꍇ�Ɠ��l�̌v�Z�����������Ȃ��悤�ɏC��
 *
 * version 1.04
 * 2003/09/12 M.Isoda
 *            ���ʉ��Z�N���X�֑Ή�(Calculate�p�b�P�[�W�̂�import�ǉ�)
 *              �Ή��ɔ����A�g�p���Ȃ��Ȃ������\�b�h���폜
 *
 * </pre>
 *         
 */

public class ATMrpManager
{
	private MrpData _pastData = null;	// �ߋ��̏��
	private Hashtable _hStore = null;	// MRP���
	private Vector    _vStore = null;	// MRP���(From�ȍ~)
	private Vector   _vPStore = null;	// MRP���(�Ɩ��^�p���`From�̑O��)
	private Connection _conn  = null;	// DB�ڑ�
	private String _itemCode  = null;	// �i�ڃR�[�h
	private String _plantCode = null;	// �H��R�[�h
	private String _from      = null;	// ���Y�v�����(From)
	private String _to        = null;	// ���Y�v�����(To)
	private String _running   = null;	// �Ɩ��^�p��
	private int _fg           = 0;		// �i�ڃ}�X�^�J�����_�`�F�b�N�t���O
	private int _extDmFlg     = 1;      // �I�[�_�f�}���h�����^�C�v

//------------------------------------------------------------------------------
// 2003/07/30 M.Isoda
//------------------------------------------------------------------------------
	private String _defFrom   = null;	// �f�t�H���g���Y�v�����(From)
	private String _defTo     = null;	// �f�t�H���g���Y�v�����(To)
	private HolidayAccessor _holiday = null;// �x���ꗗ
	private int _UnitQtyTyp = 1;    // �݌ɐ��P�ʋ敪
//------------------------------------------------------------------------------
    // �݌ɐ��P�ʋ敪�擾
    private String _UnitQtyTypSql = 
    	"SELECT " +
    	"UNIT_QTY_TYP AS UNIT_QTY_TYP " +
    	"FROM M_ITEM " +
    	"WHERE ITEM_CD = ?";

	// �m��f�}���h�Z�o
	private String _fixDemSql =
		"SELECT" +
		" TO_CHAR(DUE_DATE, 'YYYY/MM/DD') AS DUE_DATE," +
		" TO_CHAR(SUM(DM_QTY - TOTAL_ISSUE_QTY), 'FM99999999999990.0999') AS FIX_DM " +
			"FROM T_OD " +
			"WHERE DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '2' AND" +
			" DM_QTY - TOTAL_ISSUE_QTY > 0 " +
			" GROUP BY TO_CHAR(DUE_DATE, 'YYYY/MM/DD')" +
			" ORDER BY DUE_DATE";

	// �v��f�}���h�Z�o
	private String _planDemSql =
		"SELECT" +
		" TO_CHAR(DUE_DATE, 'YYYY/MM/DD') AS DUE_DATE," +
		" TO_CHAR(SUM(DM_QTY - TOTAL_ISSUE_QTY), 'FM99999999999990.0999') AS DM_QTY " +
			"FROM T_OD " +
			"WHERE DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '1' " +
			" GROUP BY TO_CHAR(DUE_DATE, 'YYYY/MM/DD')" +
			" ORDER BY DUE_DATE";

	// �m��I�[�_�Z�o
	private String _fixOrdSql =
		"SELECT" +
		" TO_CHAR(PRD_DUE_DATE, 'YYYY/MM/DD') AS PRD_DUE_DATE," +
		" TO_CHAR(SUM(ODR_QTY - TOTAL_RCV_QTY), 'FM99999999999990.0999') AS FIX_OD " +
			"FROM T_OD " +
			"WHERE PRD_DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '2' AND" +
			" ODR_QTY - TOTAL_RCV_QTY > 0 " +
			" GROUP BY TO_CHAR(PRD_DUE_DATE, 'YYYY/MM/DD')" +
			" ORDER BY PRD_DUE_DATE";

	// �v��I�[�_�Z�o
	private String _planOrdSql =
		"SELECT" +
		" TO_CHAR(PRD_DUE_DATE, 'YYYY/MM/DD') AS PRD_DUE_DATE," +
		" TO_CHAR(SUM(ODR_QTY), 'FM99999999999990.0999') AS OLD_PLAN_OD " +
			"FROM T_OD " +
			"WHERE PRD_DUE_DATE IS NOT NULL AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '1'"+
			" GROUP BY TO_CHAR(PRD_DUE_DATE, 'YYYY/MM/DD')" +
			" ORDER BY PRD_DUE_DATE";

	// �Ɩ��^�p��
	private String _ordDateSql =
		"SELECT" +
		" TO_CHAR(BUSINESS_OPR_DATE, 'YYYY/MM/DD') AS BUSINESS_OPR_DATE " +
			"FROM SYS_DATE_CTRL " +
			"WHERE PLANT_CD = ?";

//------------------------------------------------------------------------------------
// 2007.02 �ǉ�
// ASP�A�g�F�����ʕ\��
//------------------------------------------------------------------------------------
	// �m��f�}���h�Z�o
	private String _fixDemTimeSql =
		"(SELECT" +
		" '�ߋ�' AS DUE_DATE," +
		" NVL(TO_CHAR(SUM(DM_QTY - TOTAL_ISSUE_QTY), 'FM99999999999990.0999'),'0') AS FIX_DM " +
			"FROM T_OD " +
			"WHERE TO_CHAR(DUE_DATE,'YYYY/MM/DD') < ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '2' AND" +
			" DM_QTY - TOTAL_ISSUE_QTY > 0 " +
		")UNION(" +
		"SELECT" +
		" TO_CHAR(DUE_DATE, 'HH24:MI') AS DUE_DATE," +
		" TO_CHAR(SUM(DM_QTY - TOTAL_ISSUE_QTY), 'FM99999999999990.0999') AS FIX_DM " +
			"FROM T_OD " +
			"WHERE TO_CHAR(DUE_DATE,'YYYY/MM/DD') = ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '2' AND" +
			" DM_QTY - TOTAL_ISSUE_QTY > 0 " +
			" GROUP BY TO_CHAR(DUE_DATE, 'HH24:MI')" +
			")";

	// �v��f�}���h�Z�o
	private String _planDemTimeSql =
		"(SELECT" +
		" '�ߋ�' AS DUE_DATE," +
		" NVL(TO_CHAR(SUM(DM_QTY- TOTAL_ISSUE_QTY), 'FM99999999999990.0999'),'0') AS DM_QTY " +
			"FROM T_OD " +
			"WHERE TO_CHAR(DUE_DATE,'YYYY/MM/DD') < ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '1' " +
		")UNION(" +
		"SELECT" +
		" TO_CHAR(DUE_DATE, 'HH24:MI') AS DUE_DATE," +
		" TO_CHAR(SUM(DM_QTY - TOTAL_ISSUE_QTY), 'FM99999999999990.0999') AS DM_QTY " +
			"FROM T_OD " +
			"WHERE TO_CHAR(DUE_DATE,'YYYY/MM/DD') = ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '3' AND" +
			" DM_STS_TYP = '1' " +
			" GROUP BY TO_CHAR(DUE_DATE, 'HH24:MI')" +
		")";

	// �m��I�[�_�Z�o
	private String _fixOrdTimeSql =
		"(SELECT" +
		" '�ߋ�' AS PRD_DUE_DATE," +
		" NVL(TO_CHAR(SUM(ODR_QTY - TOTAL_RCV_QTY), 'FM99999999999990.0999'),'0') AS FIX_OD " +
			"FROM T_OD " +
			"WHERE TO_CHAR(PRD_DUE_DATE,'YYYY/MM/DD') < ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '2' AND" +
			" ODR_QTY - TOTAL_RCV_QTY > 0 " +
		")UNION(" +
		"SELECT" +
		" TO_CHAR(PRD_DUE_DATE, 'HH24:MI') AS PRD_DUE_DATE," +
		" TO_CHAR(SUM(ODR_QTY - TOTAL_RCV_QTY), 'FM99999999999990.0999') AS FIX_OD " +
			"FROM T_OD " +
			"WHERE TO_CHAR(PRD_DUE_DATE,'YYYY/MM/DD') = ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '2' AND" +
			" ODR_QTY - TOTAL_RCV_QTY > 0 " +
			" GROUP BY TO_CHAR(PRD_DUE_DATE, 'HH24:MI')" +
		")";


	// �v��I�[�_�Z�o
	private String _planOrdTimeSql =
		"(SELECT" +
		" '�ߋ�' AS PRD_DUE_DATE," +
		" NVL(TO_CHAR(SUM(ODR_QTY), 'FM99999999999990.0999'),'0') AS OLD_PLAN_OD " +
			"FROM T_OD " +
			"WHERE TO_CHAR(PRD_DUE_DATE,'YYYY/MM/DD') < ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '1'"+
		")UNION(" +
		"SELECT" +
		" TO_CHAR(PRD_DUE_DATE, 'HH24:MI') AS PRD_DUE_DATE," +
		" TO_CHAR(SUM(ODR_QTY), 'FM99999999999990.0999') AS OLD_PLAN_OD " +
			"FROM T_OD " +
			"WHERE TO_CHAR(PRD_DUE_DATE,'YYYY/MM/DD') = ? AND" +
			" ITEM_CD = ? AND" +
			" PLANT_CD = ? AND" +
		    " EXTERNAL_DM_FLG <= ? AND" +
			" OD_TYP = '2' AND" +
			" ODR_STS_TYP = '1'"+
			" GROUP BY TO_CHAR(PRD_DUE_DATE, 'HH24:MI')" +
		")";
	
	//�\�������擾
	private String _dispTimeSql =
		"(SELECT TO_CHAR(DUE_DATE,'HH24:MI') AS DT" +
		" FROM T_OD WHERE" +
		" TO_CHAR(DUE_DATE,'YYYY/MM/DD') = ?" +
		" AND ITEM_CD = ?" +
		" AND PLANT_CD = ?" +
		" AND EXTERNAL_DM_FLG <= ?" +
		" AND OD_TYP = '3'" +
		" AND DM_STS_TYP = '2'" +
		" AND DM_QTY - TOTAL_ISSUE_QTY > 0 )" +
		" UNION" +
		"(SELECT TO_CHAR(DUE_DATE,'HH24:MI') AS DT" +
		" FROM T_OD WHERE" +
		" TO_CHAR(DUE_DATE,'YYYY/MM/DD') = ?" +
		" AND ITEM_CD = ?" +
		" AND PLANT_CD = ?" +
		" AND EXTERNAL_DM_FLG <= ?" +
		" AND OD_TYP = '3'" +
		" AND DM_STS_TYP = '1')" +
		" UNION" +
		"(SELECT TO_CHAR(PRD_DUE_DATE,'HH24:MI') AS DT" +
		" FROM T_OD WHERE" +
		" TO_CHAR(PRD_DUE_DATE,'YYYY/MM/DD') = ?" +
		" AND ITEM_CD = ?" +
		" AND PLANT_CD = ?" +
		" AND EXTERNAL_DM_FLG <= ?" +
		" AND OD_TYP = '2'" +
		" AND ODR_STS_TYP = '2'" +
		" AND ODR_QTY - TOTAL_RCV_QTY > 0 )" +
		" UNION" +
		"(SELECT TO_CHAR(PRD_DUE_DATE,'HH24:MI') AS DT" +
		" FROM T_OD WHERE" +
		" TO_CHAR(PRD_DUE_DATE,'YYYY/MM/DD') = ?" +
		" AND ITEM_CD = ?" +
		" AND PLANT_CD = ?" +
		" AND EXTERNAL_DM_FLG <= ?" +
		" AND OD_TYP = '2'" +
		" AND ODR_STS_TYP = '1')";

//------------------------------------------------------------------------------------

	/**
	 * �����Ȃ��R���X�g���N�^�B
	 */
	public ATMrpManager()
	{
		initialize();
	}

	/**
	 * ��������R���X�g���N�^�B
	 * @param conn DB�ڑ�
	 * @param itemCode �i�ڔԍ�
	 * @param plantCode �H��R�[�h
	 * @param from �J�n��
	 * @param to �I����
	 */
	public ATMrpManager(IDbConnection conn,
					   String itemCode,
					   String plantCode,
					   String from,
					   String to)
	{
		initialize();
		setConnection(conn);
		setItemCode(itemCode);
		setPlantCode(plantCode);
		setFrom(from);
		setTo(to);
	}
	/**
	 * ��������R���X�g���N�^�B
	 * @param conn DB�ڑ�
	 * @param itemCode �i�ڔԍ�
	 * @param plantCode �H��R�[�h
	 * @param from �J�n��
	 * @param to �I����
	 * @param fg �J�����_�擾�`�F�b�N�t���O
	 */
	public ATMrpManager(IDbConnection conn,
					   String itemCode,
					   String plantCode,
					   String from,
					   String to,
					   int fg)
	{
		initialize();
		setConnection(conn);
		setItemCode(itemCode);
		setPlantCode(plantCode);
		setFrom(from);
		setTo(to);
		setfg(fg);
	}
	/**
	 * DB�ڑ��ݒ�B
	 * @param DB�ڑ�
	 */
	public void setConnection(IDbConnection conn)
	{
		_conn = conn.getConn();
	}

	/**
	 * �i�ڔԍ��ݒ�B
	 * @param itemCode �i�ڔԍ�
	 */
	public void setItemCode(String itemCode)
	{
		_itemCode = itemCode;
	}

	/**
	 * �H��R�[�h�ݒ�B
	 * @param String �H��R�[�h
	 */
	public void setPlantCode(String plantCode)
	{
		_plantCode = plantCode;
	}

	/**
	 * �J�n���ݒ�B
	 * @param �J�n��
	 */
	public void setFrom(String from)
	{
		_from = from;
	}

	/**
	 * �I�����ݒ�B
	 * @param �I����
	 */
	public void setTo(String to)
	{
		_to = to;
	}

		/**
	 * �`�F�b�N�t���O�ݒ�B
	 * @param �t���O
	 */
	public void setfg(int fg)
	{
		_fg = fg;
	}

	/**
	 * MRP�̏��̎擾�B
	 * @param String ���t yyyy/mm/dd
	 */
	public MrpData getData(String date)
	{
		return (MrpData)_hStore.get(date);
	}

	/**
	 * MRP�̏��̎擾�B
	 * @param int �C���f�b�N�X �[���J�n
	 */
	public MrpData getData(int index)
	{
		return (MrpData)_vStore.get(index);
	}

	/**
	 * MRP�̉ߋ����̎擾�B
	 */
	public MrpData getPast()
	{
		return _pastData;
	}

	/**
	 * MRP���̌������擾�B
	 *
	 * @return ����
	 */
	public int size()
	{
		return _vStore.size();
	}

	/**
	 * MRP�̏����\�z�B
	 *
	 * @param stockOnHandQty �莝�݌�
	 * @param itemSpoil �d����
	 * @return ����
	 */
	//public boolean execute(double stockOnHandQty, double itemSpoil)
	//�H��R�[�h�Ō���
	public boolean execute(String stockOnHandQty, String itemSpoil, String fromDate)
	{
		try
		{
			// �Ó�������
			if (isValid() == false) {
				return false;
			}
			// ������
			initialize();

			// �Ɩ��^�p���擾 �� ���From�֕ύX
			//----DEL
			//_running = doRunning();
			//if (_running == null || _running.equals("") == true) {
			//return false;
			//}

			_running = fromDate;
			//----
			
			// �x���ꗗ�擾
			if(_fg ==0){
			_holiday.init(_conn, _plantCode, _from , _to);
			}else{
				_holiday.init(_conn, _itemCode, _from , _to, _fg);
			}

			// �݌ɐ��P�ʋ敪�擾
			getUnitQtyTyp();

			// ���Y�v�����(From)���Ɩ��^�p���̏ꍇ
			if (_running.compareTo(_from) == 0)
			{
				// ���ԓ��t�쐬
				createSpan();

				// �f�}���h�E�I�[�_�̎Z�o
				doFixDmd();
				doPlanDmd();
				doFixOrd();
				doPlanOrd();

				// �L���݌ɂ̎Z�o
				doStock(stockOnHandQty, itemSpoil);
			}

			// ���Y�v�����(From)���Ɩ��^�p���̗����ȍ~�̏ꍇ
			if(_running.compareTo(_from) < 0)
			{
				// ���ԓ��t�쐬
				createSpan();
				createPastSpan();

				// �f�}���h�E�I�[�_�̎Z�o
				doFixDmdAfter();
				doPlanDmdAfter();
				doFixOrdAfter();
				doPlanOrdAfter();

				// �L���݌ɂ̎Z�o
				doStockAfter(stockOnHandQty, itemSpoil);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * MRP�̏����\�z�B
	 *
	 * @param stockOnHandQty �莝�݌�
	 * @param itemSpoil �d����
	 * @param extDmFlg �O���f�}���h�t���O
	 * @return ����
	 */
	//public boolean execute(double stockOnHandQty, double itemSpoil)
	//�H��R�[�h�Ō���
	public boolean execute(String stockOnHandQty, String itemSpoil, String fromDate, int extDmFlg)
	{
		try
		{
			// �Ó�������
			if (isValid() == false) {
				return false;
			}
			// ������
			initialize();

			// �Ɩ��^�p���擾 �� ���From�֕ύX
			//----DEL
			//_running = doRunning();
			//if (_running == null || _running.equals("") == true) {
			//return false;
			//}

			_running = fromDate;
			//----
			
			// �x���ꗗ�擾
			if(_fg ==0){
			_holiday.init(_conn, _plantCode, _from , _to);
			}else{
				_holiday.init(_conn, _itemCode, _from , _to, _fg);
			}
			
			// �݌ɐ��P�ʋ敪�擾
			getUnitQtyTyp();
			
			// �I�[�_�f�}���h�����^�C�v���Z�b�g
			_extDmFlg = extDmFlg;

			// ���Y�v�����(From)���Ɩ��^�p���̏ꍇ
			if (_running.compareTo(_from) == 0)
			{
				// ���ԓ��t�쐬
				createSpan();

				// �f�}���h�E�I�[�_�̎Z�o
				doFixDmd();
				doPlanDmd();
				doFixOrd();
				doPlanOrd();

				// �L���݌ɂ̎Z�o
				doStock(stockOnHandQty, itemSpoil);
			}

			// ���Y�v�����(From)���Ɩ��^�p���̗����ȍ~�̏ꍇ
			if(_running.compareTo(_from) < 0)
			{
				// ���ԓ��t�쐬
				createSpan();
				createPastSpan();

				// �f�}���h�E�I�[�_�̎Z�o
				doFixDmdAfter();
				doPlanDmdAfter();
				doFixOrdAfter();
				doPlanOrdAfter();

				// �L���݌ɂ̎Z�o
				doStockAfter(stockOnHandQty, itemSpoil);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * �����̑Ó����m�F�B
	 * @return �Ó���
	 */
	private boolean isValid()
	{
		if (_conn == null ||
			_itemCode == null ||
			_plantCode == null ||
			_from == null ||
			_to == null)
		{
			return false;
		}
		return true;
	}

	/**
	 * �Z�o�ς݂�MRP��������������B
	 */
	private void initialize()
	{
		_hStore   = new Hashtable();
		_vStore   = new Vector();
		_vPStore  = new Vector();
		_pastData = new MrpData();
		_holiday  = new HolidayAccessor();
	}

	/**
	 * �Ɩ��^�p�����擾���܂��B
	 *
	 * @return �Ɩ��^�p��
	 */
	private String doRunning() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt  = null;
		String running  = "";

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_ordDateSql);
			stmt.setString(1, _plantCode);
			rslt = stmt.executeQuery();
			if (rslt.next() == true) {
				running = rslt.getString(1);
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
		return running;
	 }

	/**
	 * ���Y�v����Ԃ̓��t���쐬���܂��B
	 *
	 * @throws ParseException ���t���s��
	 */
	private void createSpan() throws ParseException
	{
		SimpleDateFormat convert = new SimpleDateFormat("yyyy/MM/dd");
		Calendar fromCal = new GregorianCalendar();
		Calendar toCal   = new GregorianCalendar();
		Date fromDate = convert.parse(_from);
		Date toDate   = convert.parse(_to);

		// �O����
		fromCal.setTime(fromDate);
		toCal.setTime(toDate);

		// from��to�̓��������Z�o
		long fromTime = fromCal.getTime().getTime();
		long toTime   = toCal.getTime().getTime();
		long diff = (toTime - fromTime) / 24 / 60 / 60 / 1000;

		// �i�[
		for(int i = 0; i <= diff; i++)
		{
			MrpData data = new MrpData();
//------------------------------------------------------------------------------
// 2003/07/30 M.Isoda
//------------------------------------------------------------------------------
			String dateWork = convert.format(fromCal.getTime());
			data.setPlanDate(dateWork);
//System.out.println("[" + i + "]= " + data.getPlanDate());
			data.setHoliday(_holiday.isHoliday(dateWork));
			_vStore.add(data);
			_hStore.put(dateWork, data);
//------------------------------------------------------------------------------
			fromCal.add(Calendar.DATE, + 1);
		}
	}

	/**
	 * ���Y�v�����(�ߋ�)�̓��t���쐬���܂��B
	 * �Ɩ��^�p���̗����`���Y�v�����(From)�̑O���܂�
	 *
	 * @throws ParseException ���t���s��
	 */
	private void createPastSpan() throws ParseException
	{
		SimpleDateFormat convert = new SimpleDateFormat("yyyy/MM/dd");
		Calendar fromCal = new GregorianCalendar();
		Calendar toCal   = new GregorianCalendar();
		Date fromDate = convert.parse(_running);
		Date toDate   = convert.parse(_from);

		// �O����
		fromCal.setTime(fromDate);
		toCal.setTime(toDate);
		fromCal.add(Calendar.DATE, + 1);
		toCal.add(Calendar.DATE, - 1);

		// from��to�̓��������Z�o
		long fromTime = fromCal.getTime().getTime();
		long toTime   = toCal.getTime().getTime();
		long diff = (toTime - fromTime) / 24 / 60 / 60 / 1000;

		// �i�[
		for(int i = 0; i <= diff; i++)
		{
			MrpData data = new MrpData();
			data.setPlanDate(convert.format(fromCal.getTime()));
			_vPStore.add(data);
			_hStore.put(convert.format(fromCal.getTime()), data);
			fromCal.add(Calendar.DATE, + 1);
		}
	}

	/**
	 * �݌ɐ��P�ʋ敪���擾�B
	 *
	 * @throws SQLException
	 */
	private void getUnitQtyTyp() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_UnitQtyTypSql);
			stmt.setString(1, _itemCode);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				_UnitQtyTyp = rslt.getInt(1);
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �m��f�}���h���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doFixDmd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_fixDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getFixDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixDemand(Double.toString(past));
					String past = _pastData.getFixDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixDemand(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixDemand(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �v��f�}���h���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doPlanDmd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_planDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getPlanDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanDemand(Double.toString(past));
					String past = _pastData.getPlanDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanDemand(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanDemand(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �m��I�[�_���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doFixOrd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_fixOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getFixOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixOrder(Double.toString(past));
					String past = _pastData.getFixOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixOrder(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixOrder(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �v��I�[�_���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doPlanOrd() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_planOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) < 0)
				{
					//double past = _pastData.getPlanOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanOrder(Double.toString(past));
					String past = _pastData.getPlanOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanOrder(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanOrder(rslt.getString(2));
//System.out.println("doPlanOrd() �v��I�[�_(�擾��) = " + rslt.getString(2));
//					data.setPlanOrder(Double.toString(Double.parseDouble(rslt.getString(2))));
//System.out.println("doPlanOrd() �v��I�[�_(�ϊ���) = " + data.getPlanOrder());
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �m��f�}���h���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̗����ȍ~�̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doFixDmdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_fixDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getFixDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixDemand(Double.toString(past));
					String past = _pastData.getFixDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixDemand(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixDemand(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �v��f�}���h���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̗����ȍ~�̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doPlanDmdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_planDemSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getPlanDemand_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanDemand(Double.toString(past));
					String past = _pastData.getPlanDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanDemand(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanDemand(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �m��I�[�_���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̗����ȍ~�̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doFixOrdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_fixOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getFixOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setFixOrder(Double.toString(past));
					String past = _pastData.getFixOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixOrder(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixOrder(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �v��I�[�_���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̗����ȍ~�̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doPlanOrdAfter() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_planOrdSql);
			stmt.setString(1, _itemCode);
			stmt.setString(2, _plantCode);
			stmt.setInt(3, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).compareTo(_running) <= 0)
				{
					//double past = _pastData.getPlanOrder_double();
					//past += Double.parseDouble(rslt.getString(2));
					//_pastData.setPlanOrder(Double.toString(past));
					String past = _pastData.getPlanOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanOrder(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanOrder(rslt.getString(2));
//System.out.println("doPlanOrdAfter() �v��I�[�_(�擾��) = " + rslt.getString(2));
//					data.setPlanOrder(Double.toString(Double.parseDouble(rslt.getString(2))));
//System.out.println("doPlanOrdAfter() �v��I�[�_(�ϊ���) = " + data.getPlanOrder());
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �L���݌ɂ��Z�o���܂��B
	 * ���Y�v�����(From)���Ɩ��^�p���̏ꍇ�B
	 *
	 * @param stockOnHandQty �莝�݌�
	 * @param itemSpoil �d����
	 * @throws SQLException DB�G���[
	 */
	private void doStock(String stockOnHandQty, String itemSpoil) throws SQLException
	{
		//double planOrdMin = 0;		// �v��I�[�_�ŏ����e��
		//double fixOrdMin  = 0;		// �m��I�[�_�ŏ����e��
		//double store      = 0;		// ���ɗ\��
		//double fixDmd     = 0;		// �m��f�}���h
		//double planDmd    = 0;		// �v��f�}���h
		//double stock      = 0;		// �L���݌�
		String planOrdMin = "0";		// �v��I�[�_�ŏ����e��
		String fixOrdMin  = "0";		// �m��I�[�_�ŏ����e��
		String store      = "0";		// ���ɗ\��
		String fixDmd     = "0";		// �m��f�}���h
		String planDmd    = "0";		// �v��f�}���h
		String stock      = "0";		// �L���݌�

		// �ߋ��̃I�[�_�ŏ����e�ʁE���ɗ\����Z�o
		//planOrdMin = convert(_pastData.getPlanOrder_double() / (1 + (itemSpoil / 100)));
		planOrdMin	= Calculate.divide(_pastData.getPlanOrder(), Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//fixOrdMin  = convert(_pastData.getFixOrder_double()  / (1 + (itemSpoil / 100)));
		fixOrdMin	= Calculate.divide(_pastData.getFixOrder(), Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//store      = convert(planOrdMin + fixOrdMin);
		store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);

		// �ߋ��̒l���Z�o
		//fixDmd  = _pastData.getFixDemand_double();
		fixDmd  = _pastData.getFixDemand();
		//planDmd = _pastData.getPlanDemand_double();
		planDmd = _pastData.getPlanDemand();
		//stock = stockOnHandQty - ((fixDmd + planDmd) - store);
		stock	= Calculate.subtract(stockOnHandQty, Calculate.subtract(Calculate.add(fixDmd, planDmd), store));
		//_pastData.setStock(Double.toString(stock));
		_pastData.setStock(stock);

		// ���Y�v�����(From)�̒l���Z�o
		MrpData data = (MrpData)_vStore.get(0);
		//fixDmd     = convert(data.getFixDemand_double());
		fixDmd		= Calculate.floor(data.getFixDemand(), 4);
		//planDmd    = convert(data.getPlanDemand_double());
		planDmd		= Calculate.floor(data.getPlanDemand(), 4);
		//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
		planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
		fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//store      = convert(planOrdMin + fixOrdMin);
		store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
		//stock      = convert(stock - ((fixDmd + planDmd) - store));
		if (_UnitQtyTyp == 1) {
			stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 0);
		} else {
			stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
		}
		//data.setStock(Double.toString(stock));
		data.setStock(stock);

		// ���Y�v�����(From)�̗����ȍ~�̒l���Z�o
		int size = _vStore.size();
		for(int i = 1; i < size; i++)
		{
			data = (MrpData)_vStore.get(i);
			//fixDmd     = convert(data.getFixDemand_double());
			fixDmd     = Calculate.floor(data.getFixDemand(), 4);
			//planDmd    = convert(data.getPlanDemand_double());
			planDmd    = Calculate.floor(data.getPlanDemand(), 4);
			//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
			planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
			fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//store      = convert(planOrdMin + fixOrdMin);
			store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
			//stock = convert(stock - ((fixDmd + planDmd) - store));
			if (_UnitQtyTyp == 1) {
				stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 0);
			} else {
				stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
			}
			//data.setStock(Double.toString(stock));
			data.setStock(stock);
		}
	}

	/**
	 * �L���݌ɂ��Z�o���܂��B
	 * ���Y�v�����(From)���Ɩ��^�p���̗����ȍ~�̏ꍇ�B
	 *
	 * @param stockOnHandQty �莝�݌�
	 * @param itemSpoil �d����
	 * @throws SQLException DB�G���[
	 */
	private void doStockAfter(String stockOnHandQty, String itemSpoil) throws SQLException
	{
		//double planOrdMin = 0;		// �v��I�[�_�ŏ����e��
		//double fixOrdMin  = 0;		// �m��I�[�_�ŏ����e��
		//double store      = 0;		// ���ɗ\��
		//double fixDmd     = 0;		// �m��f�}���h
		//double planDmd    = 0;		// �v��f�}���h
		//double stock      = 0;		// �L���݌�
		String planOrdMin = "0";		// �v��I�[�_�ŏ����e��
		String fixOrdMin  = "0";		// �m��I�[�_�ŏ����e��
		String store      = "0";		// ���ɗ\��
		String fixDmd     = "0";		// �m��f�}���h
		String planDmd    = "0";		// �v��f�}���h
		String stock      = "0";		// �L���݌�


		// �ߋ��̃I�[�_�ŏ����e�ʁE���ɗ\����Z�o
		//planOrdMin = convert(_pastData.getPlanOrder_double() / (1 + (itemSpoil / 100)));
		planOrdMin	= Calculate.divide(_pastData.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//fixOrdMin  = convert(_pastData.getFixOrder_double()  / (1 + (itemSpoil / 100)));
		fixOrdMin	= Calculate.divide(_pastData.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		//store      = convert(planOrdMin + fixOrdMin);
		store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);

		// �ߋ��̒l���Z�o(�Ɩ��^�p���܂�)
		//fixDmd  = _pastData.getFixDemand_double();
		fixDmd  = _pastData.getFixDemand();
		//planDmd = _pastData.getPlanDemand_double();
		planDmd = _pastData.getPlanDemand();
		//stock = stockOnHandQty - ((fixDmd + planDmd) - store);
		stock	= Calculate.subtract(stockOnHandQty, Calculate.subtract(Calculate.add(fixDmd, planDmd), store));

		// �ߋ��̒l���Z�o(�Ɩ��^�p���̗����`���Y�v�����(From)�̑O���܂�)
		MrpData data = null;
		int size = _vPStore.size();
		for(int i = 0; i < size; i++)
		{
			data = (MrpData)_vPStore.get(i);
			//fixDmd     = convert(data.getFixDemand_double());
			fixDmd		= Calculate.floor(data.getFixDemand(), 4);
			//planDmd    = convert(data.getPlanDemand_double());
			planDmd		= Calculate.floor(data.getPlanDemand(), 4);
			//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
			planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
			fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//store      = convert(planOrdMin + fixOrdMin);
			store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
			//stock = convert(stock - ((fixDmd + planDmd) - store));
			stock		= Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
		}
		if (_UnitQtyTyp == 1) {
			stock = Calculate.floor(stock,0);
		} 
		//_pastData.setStock(Double.toString(stock));
		_pastData.setStock(stock);

		// ���Y�v�����(From)�̗����ȍ~�̒l���Z�o
		size = _vStore.size();
		for(int i = 0; i < size; i++)
		{
			data = (MrpData)_vStore.get(i);
			//fixDmd     = convert(data.getFixDemand_double());
			fixDmd		= Calculate.floor(data.getFixDemand(), 4);
			//planDmd    = convert(data.getPlanDemand_double());
			planDmd		= Calculate.floor(data.getPlanDemand(), 4);
			//planOrdMin = convert(data.getPlanOrder_double() / (1 + (itemSpoil / 100)));
			planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//fixOrdMin  = convert(data.getFixOrder_double()  / (1 + (itemSpoil / 100)));
			fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			//store      = convert(planOrdMin + fixOrdMin);
			store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
			//stock = convert(stock - ((fixDmd + planDmd) - store));
			if (_UnitQtyTyp == 1) {
				stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 0);
			} else {
				stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
			}
			//data.setStock(Double.toString(stock));
			data.setStock(stock);
		}
	}

//------------------------------------------------------------------------------------
// 2007.02 �ǉ�
// ASP�A�g�F�����ʕ\��
//------------------------------------------------------------------------------------

	/**
	 * MRP�̏����\�z�B
	 *
	 * @param stockOnHandQty �莝�݌�
	 * @param itemSpoil �d����
	 * @return ����
	 */
	//public boolean executeTime(String stockOnHandQty, String itemSpoil)
	public boolean executeTime(String stockOnHandQty, String itemSpoil, String fromDate)
	{
		try
		{
			// �Ó�������
			if (isValid() == false) {
				return false;
			}
			// ������
			initialize();

			// �Ɩ��^�p���擾 �� ���From�֕ύX
			//----DEL
			//_running = doRunning();
			//if (_running == null || _running.equals("") == true) {
			//return false;
			//}

			_running = fromDate;

			// �݌ɐ��P�ʋ敪�擾
			getUnitQtyTyp();
			
			//----
			// ���ԓ��t�쐬
			createSpanTime();

			// �f�}���h�E�I�[�_�̎Z�o
			doFixDmdTime();
			doPlanDmdTime();
			doFixOrdTime();
			doPlanOrdTime();

			// �L���݌ɂ̎Z�o
			doStockTime(stockOnHandQty, itemSpoil);

		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * MRP�̏����\�z�B
	 *
	 * @param stockOnHandQty �莝�݌�
	 * @param itemSpoil �d����
	 * @return ����
	 */
	//public boolean executeTime(String stockOnHandQty, String itemSpoil)
	public boolean executeTime(String stockOnHandQty, String itemSpoil, String fromDate, int extDmFlg)
	{
		try
		{
			// �Ó�������
			if (isValid() == false) {
				return false;
			}
			// ������
			initialize();

			// �Ɩ��^�p���擾 �� ���From�֕ύX
			//----DEL
			//_running = doRunning();
			//if (_running == null || _running.equals("") == true) {
			//return false;
			//}

			_running = fromDate;

			// �݌ɐ��P�ʋ敪�擾
			getUnitQtyTyp();

			// �I�[�_�f�}���h�����^�C�v���Z�b�g
			_extDmFlg = extDmFlg;
			
			//----
			// ���ԓ��t�쐬
			createSpanTime();

			// �f�}���h�E�I�[�_�̎Z�o
			doFixDmdTime();
			doPlanDmdTime();
			doFixOrdTime();
			doPlanOrdTime();

			// �L���݌ɂ̎Z�o
			doStockTime(stockOnHandQty, itemSpoil);

		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * �\�����鎞�����쐬���܂��B
	 *
	 * @throws ParseException �������s��
	 */
	private void createSpanTime() throws SQLException
	{

		PreparedStatement stmt = null;
		ResultSet rslt = null;
		
		try
		{
			// �\�������̎擾
			stmt = _conn.prepareStatement(_dispTimeSql);
			stmt.setString(1, _from);
			stmt.setString(2, _itemCode);
			stmt.setString(3, _plantCode);
			stmt.setInt(4, _extDmFlg);
			stmt.setString(5, _from);
			stmt.setString(6, _itemCode);
			stmt.setString(7, _plantCode);
			stmt.setInt(8, _extDmFlg);
			stmt.setString(9, _from);
			stmt.setString(10, _itemCode);
			stmt.setString(11, _plantCode);
			stmt.setInt(12, _extDmFlg);
			stmt.setString(13, _from);
			stmt.setString(14, _itemCode);
			stmt.setString(15, _plantCode);
			stmt.setInt(16, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				MrpData data = new MrpData();
				String dateWork = rslt.getString(1);
				data.setPlanDate(dateWork);
				_vStore.add(data);
				_hStore.put(dateWork, data);
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �m��f�}���h���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doFixDmdTime() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_fixDemTimeSql);
			stmt.setString(1, _from);
			stmt.setString(2, _itemCode);
			stmt.setString(3, _plantCode);
			stmt.setInt(4, _extDmFlg);
			stmt.setString(5, _from);
			stmt.setString(6, _itemCode);
			stmt.setString(7, _plantCode);
			stmt.setInt(8, _extDmFlg);
			rslt = stmt.executeQuery();


			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).equals("�ߋ�"))
				{
					String past = _pastData.getFixDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixDemand(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixDemand(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �v��f�}���h���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doPlanDmdTime() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_planDemTimeSql);
			stmt.setString(1, _from);
			stmt.setString(2, _itemCode);
			stmt.setString(3, _plantCode);
			stmt.setInt(4, _extDmFlg);
			stmt.setString(5, _from);
			stmt.setString(6, _itemCode);
			stmt.setString(7, _plantCode);
			stmt.setInt(8, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).equals("�ߋ�"))
				{
					String past = _pastData.getPlanDemand();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanDemand(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanDemand(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �m��I�[�_���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doFixOrdTime() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_fixOrdTimeSql);
			stmt.setString(1, _from);
			stmt.setString(2, _itemCode);
			stmt.setString(3, _plantCode);
			stmt.setInt(4, _extDmFlg);
			stmt.setString(5, _from);
			stmt.setString(6, _itemCode);
			stmt.setString(7, _plantCode);
			stmt.setInt(8, _extDmFlg);
			rslt = stmt.executeQuery();
			
			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).equals("�ߋ�"))
				{
					String past = _pastData.getFixOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setFixOrder(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setFixOrder(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �v��I�[�_���擾�B
	 * ���Y�v�����(From)�̒l���Ɩ��^�p���̏ꍇ
	 *
	 * @throws SQLException
	 */
	private void doPlanOrdTime() throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rslt = null;

		try
		{
			// �擾
			stmt = _conn.prepareStatement(_planOrdTimeSql);
			stmt.setString(1, _from);
			stmt.setString(2, _itemCode);
			stmt.setString(3, _plantCode);
			stmt.setInt(4, _extDmFlg);
			stmt.setString(5, _from);
			stmt.setString(6, _itemCode);
			stmt.setString(7, _plantCode);
			stmt.setInt(8, _extDmFlg);
			rslt = stmt.executeQuery();

			while (rslt.next() == true)
			{
				// �ߋ��f�[�^�쐬
				if (rslt.getString(1).equals("�ߋ�"))
				{
					String past = _pastData.getPlanOrder();
					past = Calculate.add(past, rslt.getString(2));
					_pastData.setPlanOrder(past);
				}
				// ���ԓ��f�[�^�쐬
				else if (_hStore.containsKey(rslt.getString(1)) == true)
				{
					MrpData data = (MrpData)_hStore.get(rslt.getString(1));
					data.setPlanOrder(rslt.getString(2));
				}
				else
				{
					// �ΏۊO�̓��t�Ȃ�j������
				}
			}
		}
		finally
		{
			closeResultSet(rslt);
			closePreparedStatement(stmt);
		}
	}

	/**
	 * �L���݌ɂ��Z�o���܂��B
	 * ���Y�v�����(From)���Ɩ��^�p���̏ꍇ�B
	 *
	 * @param stockOnHandQty �莝�݌�
	 * @param itemSpoil �d����
	 * @throws SQLException DB�G���[
	 */
	private void doStockTime(String stockOnHandQty, String itemSpoil) throws SQLException
	{
		String planOrdMin = "0";		// �v��I�[�_�ŏ����e��
		String fixOrdMin  = "0";		// �m��I�[�_�ŏ����e��
		String store      = "0";		// ���ɗ\��
		String fixDmd     = "0";		// �m��f�}���h
		String planDmd    = "0";		// �v��f�}���h
		String stock      = "0";		// �L���݌�

		// �ߋ��̃I�[�_�ŏ����e�ʁE���ɗ\����Z�o
		planOrdMin	= Calculate.divide(_pastData.getPlanOrder(), Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		fixOrdMin	= Calculate.divide(_pastData.getFixOrder(), Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
		store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);

		// �ߋ��̒l���Z�o
		fixDmd  = _pastData.getFixDemand();
		planDmd = _pastData.getPlanDemand();
		stock	= Calculate.subtract(stockOnHandQty, Calculate.subtract(Calculate.add(fixDmd, planDmd), store));
		if (_UnitQtyTyp == 1) {
			stock = Calculate.floor(stock,0);
		}
		_pastData.setStock(stock);
		
		
		// �l���Z�o
		int size = _vStore.size();
		for(int i = 0; i < size; i++)
		{
			MrpData data = (MrpData)_vStore.get(i);
			fixDmd     = Calculate.floor(data.getFixDemand(), 4);
			planDmd    = Calculate.floor(data.getPlanDemand(), 4);
			planOrdMin	= Calculate.divide(data.getPlanOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			fixOrdMin	= Calculate.divide(data.getFixOrder(),	Calculate.add("1", Calculate.divide(itemSpoil, "100", 6, Calculate._FLOOR)), 4, Calculate._FLOOR);
			store		= Calculate.floor(Calculate.add(planOrdMin, fixOrdMin), 4);
			if (_UnitQtyTyp == 1) {
				stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 0);
			} else {
				stock = Calculate.floor(Calculate.subtract(stock, Calculate.subtract(Calculate.add(fixDmd, planDmd), store)), 4);
			}
			data.setStock(stock);

		}
	}
//------------------------------------------------------------------------------------

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
			} catch (SQLException e) {
			}
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
			} catch (SQLException e) {
			}
		}
	}

}
