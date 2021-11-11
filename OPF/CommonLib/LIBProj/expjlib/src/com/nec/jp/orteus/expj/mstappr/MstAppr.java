package com.nec.jp.orteus.expj.mstappr;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;

/**
 * �}�X�^�n���F�N���X
 * 
 * @author xing-qianying
 * @version 1.00
 *
 */
public class MstAppr {


	/** �R���X�g���N�^ */
	public MstAppr(){ clear(); }
	/** �R���X�g���N�^
	 *
	 * @param	strPlantCd		�H��R�[�h
	 * @param	strUserCd		���[�U�R�[�h
	 * @param	strProgramName	�v���O�������i�� AA0090030�j
	 */
	public MstAppr(IDbConnection connect,String strPlantCd, String strUserCd, String strProgramName ,String screenURL)
	{
		clear();
		_conn = connect;
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_screenURL = screenURL;
		_mstApprDBAccessor = new MstApprDBAccessor(_strPlantCd, _strUserCd, _strProgramName);
	}
	
//	--------------------------------------------------------------------------
//	 �ϐ�
	/** DB�A�N�Z�X�p�̃R�l�N�V���� */
	private IDbConnection _conn = null;
	
	/** �H��R�[�h�i�[�p */
	private String _strPlantCd = null;

	/** ���[�U�R�[�h�i�[�p */
	private String _strUserCd = null;

	/** �v���O�������i�[�p */
	private String _strProgramName = null;
	
	/** ���URL�@*/
	private String _screenURL = null;
	
	/** ���F���A�N�Z�b�T�N���X */
	private MstApprDBAccessor _mstApprDBAccessor = null;
	
	/** �G���[���b�Z�[�W�i�[���X�g */
	private ArrayList errorList = new ArrayList();
	
	/** ��񃁃b�Z�[�W�i�[���X�g */
	private ArrayList infoList = new ArrayList();
	
	/** �x�����b�Z�[�W�i�[���X�g */
	private ArrayList warnList = new ArrayList();
	
	/** ���F���� */
	private MstApprDetailStruct _detailStruct = new MstApprDetailStruct();
	
	/** ���F������ */
	private MstApprDetailListStruct _listStruct = new MstApprDetailListStruct();
	
	/** ���F�֘A�˗���� */
	private MstApprCorrelInfoStruct _infoStruct = new MstApprCorrelInfoStruct();
	
	
	/** ��Ӑ��񏈗��敪,true: ��Ӑ��񂠂�@�@false: ��Ӑ���Ȃ�*/
	private boolean uniqueflg = true;

	
	/**
	 * ��Ӑ��񏈗��敪�擾
	 * @return
	 */
	public boolean isUniqueflg() {
		return uniqueflg;
	}

	/**
	 * ��Ӑ��񏈗��敪�ݒ�
	 * @param uniqueflg
	 */
	public void setUniqueflg(boolean uniqueflg) {
		this.uniqueflg = uniqueflg;
	}
	// --------------------------------------------------------------------------
//	 ���ʃ��\�b�h
////////////////////////////////////////////////////////////////////////////
	/**
	 * �N���A
	 *
	 * @return	�Ȃ�
	 */
	public void clear()
	{
		_conn = null;
		_strPlantCd = null;
		_strUserCd = null;
		_strProgramName = null;
		_screenURL = null;
		_mstApprDBAccessor = null;
	}
	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return �G���[���X�g
	 */
	public ArrayList getErrorList() {
		return errorList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * 
	 * @param ���b�Z�[�W���X�g
	 */
	public void setErrorList(ArrayList list) {
		errorList = list;
	}

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return info���X�g
	 */
	public ArrayList getInfoList() {
		return infoList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * 
	 * @param ���b�Z�[�W���X�g
	 */
	public void setInfoList(ArrayList list) {
		infoList = list;
	}

	/**
	 * ���b�Z�[�W�擾
	 * 
	 * @return warn���X�g
	 */
	public ArrayList getWarnList() {
		return warnList;
	}

	/**
	 * ���b�Z�[�W�ݒ�
	 * 
	 * @param ���b�Z�[�W���X�g
	 */
	public void setWarnList(ArrayList list) {
		warnList = list;
	}
	
//	--------------------------------------------------------------------------
//	 ����
	
	/**
	 *  ���F���̑��݃`�F�b�N����
	 * @param mst_ID �}�X�^�\�̃L�[
	 * @return ���F�˗��ɏ�񂪑��݁@false
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public boolean checkMST_APPR(String tableName,ArrayList keyvalueList) throws SQLException{
		boolean result = false;
		try {
			result = _mstApprDBAccessor.checkMST_APPR(_conn,tableName,keyvalueList);
		} catch (SQLException e) {
			throw e;
		}
		return result;
	}
	
	/**
	 *  ���F��񏈗��敪�F�폜�̑��݃`�F�b�N����
	 * @param mst_ID �}�X�^�\�̃L�[
	 * @return ���F�˗��ɏ�񂪑��݁@false
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public boolean checkMST_APPRDel(String tableName,ArrayList keyvalueList) throws SQLException{
		boolean result = false;
		try {
			result = _mstApprDBAccessor.checkMST_APPRDel(_conn,tableName,keyvalueList);
		} catch (SQLException e) {
			throw e;
		}
		return result;
	}
	
	/**
	 *  ���F��񏈗��敪�F�o�^�̑��݃`�F�b�N����
	 * @param mst_ID �}�X�^�\�̃L�[
	 * @return ���F�˗��ɏ�񂪑��݁@false
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public boolean checkMST_APPRAdd(String tableName,ArrayList keyvalueList) throws SQLException{
		boolean result = false;
		try {
			result = _mstApprDBAccessor.checkMST_APPRAdd(_conn,tableName,keyvalueList);
		} catch (SQLException e) {
			throw e;
		}
		return result;
	}
	
	/**
	 * �}�X�^���ڃR�����ԍ��̎擾����
	 * @param tablename �}�X�^�\��
	 * @param columnname�@�R������
	 * @return String �R����ID
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public String getColumnID(String tablename,String columnname) throws SQLException{
		String columnID = null;
		try {
			columnID = _mstApprDBAccessor.getColumnID(_conn,tablename,columnname);
		} catch (SQLException e) {
			throw e;
		}
		return columnID;
	}
	
	/**
	 * �}�X�^���ڃR�������̎擾����
	 * @param tablename �}�X�^�\��
	 * @param columnID�@�R����ID
	 * @return String �R������
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public String getColumnName(String tablename,String columnID) throws SQLException{
		String columnName = null;
		try {
			columnName = _mstApprDBAccessor.getColumnName(_conn,tablename,columnID);
		} catch (SQLException e) {
			throw e;
		}
		return columnName;
	}
	
	/**
	 *  �J�����ԍ����A���F���ו\�̍���ID�����肷��B
	 * @param value �l
	 * @param columnID �R����ID
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	public void setDetailByColumnID(String value,String columnID) {
		
		_mstApprDBAccessor.setDetailByColumnID(_detailStruct,value,columnID);
	}
	
	/**
	 * �J�����ԍ����A���F���ו\�̍���ID���擾����B
	 * @param columnID ���F���ו\�̃R����ID
	 * @return String MstApprDetailStruct�̃R�����l
	 */
	public String getDetailByColumnID(MstApprDetailStruct struct,String columnID){
		String value = null;
		value = _mstApprDBAccessor.getDetailByColumnID(struct,columnID);
		return value;
	}
	
	/**
	 * �J�����ԍ����A���F�����ו\�̍���ID�����肷��B
	 * @param value�@�l
	 * @param columnID�@�R����ID
	 */
	public void setListByColumnID(String value,String columnID){
		_mstApprDBAccessor.setListByColumnID(_listStruct,value,columnID);
	}
	
	/**
	 * �J�����ԍ����A���F�����ו\�̍���ID���擾����B
	 * @param columnID�@�R����ID
	 * @return�@MstApprDetailListStruct�̃R�����l
	 */
	public String getListByColumnID(MstApprDetailListStruct struct,String columnID){
		String value = null;
		value = (String) _mstApprDBAccessor.getListByColumnID(struct,columnID);
		return value;
	}
	
	/**
	 * ���F���̓o�^
	 * @param struct ���F�˗��\
	 * @return�@String ���FID
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public String insertMST_APPR(MstApprStruct struct) throws SQLException{
		String appr_ID = null;
		// ���FID
		appr_ID = _mstApprDBAccessor.selectSEQ_APPR_ID(_conn);
		struct.setAPPR_ID(appr_ID);
		String businessOprDate = DateCtrl.getBusinessOprDate(_conn, struct.getPLANT_CD());
		if(null == businessOprDate){
			struct.setREQUEST_DATE("");	
		}else{
			struct.setREQUEST_DATE(businessOprDate);	
		}
		struct.setCREATED_BY(_strUserCd);
		struct.setUPDATED_BY(_strUserCd);
		struct.setCREATED_PRG_NM(_strProgramName);
		struct.setUPDATED_PRG_NM(_strProgramName);
		_mstApprDBAccessor.insertMST_APPR(_conn,struct);
		
		return appr_ID;
		
	}
	
	/**
	 * ���F���ו\�̓o�^����
	 * @param detailStruct ���F���ו\
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int insertMST_APPR_DETAIL(String tableName ,String appr_ID) throws SQLException{
		int result = 0;
		try {
			_detailStruct.setAPPR_ID(appr_ID);
			_detailStruct.setTABLE_NAME(tableName);
			_detailStruct.setCREATED_BY(_strUserCd);
			_detailStruct.setUPDATED_BY(_strUserCd);
			_detailStruct.setCREATED_PRG_NM(_strProgramName);
			_detailStruct.setUPDATED_PRG_NM(_strProgramName);
			result =  _mstApprDBAccessor.insertMST_APPR_DETAIL(_conn,_detailStruct);
		} catch (SQLException e) {
			throw e;
		}
		return result;
	}
	
	/**
	 * ���F�����ו\�̓o�^����
	 * @param tableName �\��
	 * @param appr_ID�@���FID
	 * @param seq_no�@�V�[�P���X�ԍ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int insertMST_APPR_DETAIL_LIST(String tableName,String appr_ID,String seq_no) throws SQLException{
		int result = 0;
		try {
			_listStruct.setAPPR_ID(appr_ID);
			_listStruct.setSEQ_NO(seq_no);
			_listStruct.setTABLE_NAME(tableName);
			_listStruct.setCREATED_BY(_strUserCd);
			_listStruct.setUPDATED_BY(_strUserCd);
			_listStruct.setCREATED_PRG_NM(_strProgramName);
			_listStruct.setUPDATED_PRG_NM(_strProgramName);
			result =  _mstApprDBAccessor.insertMST_APPR_DETAIL_LIST(_conn,_listStruct,appr_ID);
		} catch (SQLException e) {
			throw e;
		}
		return result;
	}
	/**
	 * ���F�֘A�˗�����o�^����
	 * @param tableName �\��
	 * @param appr_ID�@���FID
	 * @param seq_no�@�V�[�P���X�ԍ�
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public int insertMST_APPR_CORREL(String appr_ID,List info_col) throws SQLException{
		int result = 0;
		try {
			_infoStruct.setAPPR_ID(appr_ID);
            _infoStruct.setINFO_COL(info_col);
			_infoStruct.setCREATED_BY(_strUserCd);
			_infoStruct.setUPDATED_BY(_strUserCd);
			_infoStruct.setCREATED_PRG_NM(_strProgramName);
			_infoStruct.setUPDATED_PRG_NM(_strProgramName);
			result =  _mstApprDBAccessor.insertMST_APPR_CORREL(_conn,_infoStruct);
		} catch (SQLException e) {
			throw e;
		}
		return result;
	}
	
	/**
	 * ���F�˗��\����
	�@* @param appr_ID ���FID
	 * @return ���F�˗��\���R�[�h
	 * @throws FoundationException 
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public List selectMST_APPR(String appr_ID) throws SQLException{
		List resultList = new ArrayList();
		resultList = _mstApprDBAccessor.selectMST_APPR(_conn,appr_ID);
		return resultList;
	}
	
	/**
	 * ���F���׌���
	�@* @param appr_ID ���FID
	 * @return ���F���ו\���R�[�h
	 * @throws SQLException DB�A�N�Z�X�G���[
	 * @throws FoundationException 
	 */
	public List selectMST_APPR_DETAIL(String appr_ID) throws SQLException{
		List resultList = new ArrayList();
		try{
			resultList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_ID);
		}catch(SQLException e){
			throw e;
		}
		return resultList;
	}

	/**
	 * ���F�����׌���
	�@* @param appr_ID ���FID
	 * @return ���F�����׃��R�[�h
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public List selectMST_APPR_DETAIL_LIST(String appr_ID) throws SQLException{
		List resultList = new ArrayList();
		try{
			resultList = _mstApprDBAccessor.selectMST_APPR_DETAIL_LIST(_conn,appr_ID);
		}catch(SQLException e){
			throw e;
		} 
		return resultList;
	}
	
	/**
	 * �}�X�^�n���F���������p
	 * @param plant_cd �H��R�[�h
	 * @param user_cd ���[�U�R�[�h
	 * @param select_typ �����p�^�[��
	 * @return�@List �˗����
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public List select(String plant_cd,String user_cd,String select_typ) throws SQLException{
		List resultList = new ArrayList();
		switch(Integer.parseInt(select_typ)){
		// �˗�
		case 1: resultList = _mstApprDBAccessor.selectRequestData(_conn,plant_cd,user_cd); break;
		// ���F�҂�
		case 2: resultList = _mstApprDBAccessor.selectAppringData(_conn,plant_cd,user_cd); break;
		// �ۗ�
		case 3: resultList = _mstApprDBAccessor.selectReserveData(_conn,plant_cd,user_cd); break;
		}
		return resultList;
	}
	
	/**
	 * �}�X�^�n���F���׌����p
	 * @param plant_cd  �H��R�[�h
	 * @param request_by�@�˗���
	 * @param screen_url �@���URL
	 * @param select_typ �����p�^�[��
	 * @return
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public List selectDetail(String plant_cd,String user_cd,String screen_url,String select_typ) throws SQLException{
		List resultList = new ArrayList();
		switch(Integer.parseInt(select_typ)){
		// �˗�
		case 1: resultList = _mstApprDBAccessor.selectRequestDetail(_conn,plant_cd,user_cd,screen_url); break;
		// ���F�҂�
		case 2: resultList = _mstApprDBAccessor.selectAppringDetail(_conn,plant_cd,screen_url); break;
		// �ۗ�
		case 3: resultList = _mstApprDBAccessor.selectReserveDetail(_conn,plant_cd,screen_url); break;
		}
		return resultList;
	}
	
	/**
	 * �}�X�^�n���F����KA2130010���Ӑ�g���������e�i���X�p
	 * @param plant_cd  �H��R�[�h
	 * @param request_by�@�˗���
	 * @param screen_url �@���URL
	 * @param select_typ �����p�^�[��
	 * @return
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public List selectDetailKA2130(String plant_cd,String user_cd,String screen_url,String select_typ) throws SQLException{
		List resultList = new ArrayList();
		switch(Integer.parseInt(select_typ)){
		// �˗�
		case 1: resultList = _mstApprDBAccessor.selectRequestDetailKA2130(_conn,plant_cd,user_cd,screen_url); break;
		// ���F�҂�
		case 2: resultList = _mstApprDBAccessor.selectAppringDetailKA2130(_conn,plant_cd,screen_url); break;
		// �ۗ�
		case 3: resultList = _mstApprDBAccessor.selectReserveDetailKA2130(_conn,plant_cd,screen_url); break;
		}
		return resultList;
	}
	
	/**
	 * ���F
	 * @param appr_id ���FID
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public void apprAssort(String appr_id,String appr_by,String appr_date,String deleteFlg) throws SQLException{
		List mst_apprList = new ArrayList();
		List detailList = new ArrayList();
		List detaillistList = new ArrayList();
		
		HashMap keyvalueMap = new HashMap();
		
		MstApprStruct apprstruct = new MstApprStruct();
		MstApprDetailStruct detailStruct = new MstApprDetailStruct();
		MstApprDetailListStruct listStruct = new MstApprDetailListStruct();
		
		// ���FID���A���F�˗��\����
		mst_apprList = _mstApprDBAccessor.selectMST_APPR(_conn,appr_id);
		apprstruct = (MstApprStruct) mst_apprList.get(0);
		
		// ���FID���A���F�L�[�Ή��\����
		keyvalueMap = _mstApprDBAccessor.selectMST_APPR_KEY(_conn,appr_id);
		switch(Integer.parseInt(apprstruct.getPROC_TYP())){
		// �o�^
		case 1:
			// ���F�˗��\����A�����擾
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// �}�X�^�ɓo�^
			_mstApprDBAccessor.insertMST(_conn,detailStruct);
			// �}�X�^���ו\�ɓo�^
			detaillistList = _mstApprDBAccessor.selectMST_APPR_DETAIL_LIST(_conn,appr_id);
			for(int i=0 ;i<detaillistList.size();i++){
				listStruct = (MstApprDetailListStruct) detaillistList.get(i);
				try{
					_mstApprDBAccessor.insertMSTDetail(_conn,listStruct);	
				}catch(SQLException e){
					
					if(this.isUniqueflg() == true || e.getErrorCode() != 1){
						throw e;
					}
				}
			}
			// ���F�֘A�������s
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// ���F�˗����폜
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// �X�V
		case 2:
			// ���F�˗��\����A�����擾
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// ���F�L�[�Ή��\����A�����擾
			// �}�X�^���X�V
			_mstApprDBAccessor.updateMST(_conn,detailStruct,keyvalueMap);
			
			// �}�X�^���ו\���X�V
			detaillistList = _mstApprDBAccessor.selectMST_APPR_DETAIL_LIST(_conn,appr_id);
			
			// ���F�˗��\�̓��[�U�}�X�^�̏ꍇ�A��ɏ����}�X�^���폜
			if("USER_MST".equals(detailStruct.getTABLE_NAME())){
			    _mstApprDBAccessor.deleteMSTDetail(_conn,detailStruct.getTABLE_NAME(),"BELONG_MST",keyvalueMap);
			} else {
			    // �}�X�^���ו\���폜
			    for(int i=0 ;i<detaillistList.size();i++){
				    listStruct = (MstApprDetailListStruct) detaillistList.get(i);
				    _mstApprDBAccessor.deleteMSTDetail(_conn,detailStruct.getTABLE_NAME(),listStruct.getTABLE_NAME(),keyvalueMap);
			    }
			}

			// �}�X�^���ו\�ɓo�^
			for(int i=0 ;i<detaillistList.size();i++){
				listStruct = (MstApprDetailListStruct) detaillistList.get(i);
				_mstApprDBAccessor.insertMSTDetail(_conn,listStruct);
			}
			// ���F�֘A�������s
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// ���F�˗����폜
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// �폜
		case 3:
			// ���F�˗��\����A�����擾
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// �}�X�^���폜
			_mstApprDBAccessor.deleteMST(_conn,detailStruct,keyvalueMap);
			
			// �}�X�^���ו\���폜
			detaillistList = _mstApprDBAccessor.selectMST_APPR_DETAIL_LIST(_conn,appr_id);
			for(int i=0 ;i<detaillistList.size();i++){
				listStruct = (MstApprDetailListStruct) detaillistList.get(i);
				_mstApprDBAccessor.deleteMSTDetail(_conn,detailStruct.getTABLE_NAME(),listStruct.getTABLE_NAME(),keyvalueMap);
			}
			// ���F�֘A�������s
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// ���F�˗����폜
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		}
	}
	
	/**
	 * ���F(���Ӑ�g�������e�i���X)
	 * @param appr_id ���FID
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public void apprAssortKA2130(String appr_id,String appr_by,String appr_date,String deleteFlg) throws SQLException{
		List mst_apprList = new ArrayList();
		List detailList = new ArrayList();
		
		MstApprStruct apprstruct = new MstApprStruct();
		MstApprDetailStruct detailStruct = new MstApprDetailStruct();
		
		// ���FID���A���F�˗��\����
		mst_apprList = _mstApprDBAccessor.selectMST_APPR(_conn,appr_id);
		apprstruct = (MstApprStruct) mst_apprList.get(0);
		switch(Integer.parseInt(apprstruct.getPROC_TYP())){
		// �o�^
		case 1:
			// ���F�˗��\����A�����擾
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// ���Ӑ�g���e�[�u���̏����敪
			if("1".equals(detailStruct.getITEM_COL1())) {
				_mstApprDBAccessor.insertM_CUST_COMB(_conn,detailStruct); // �o�^
			} else if("2".equals(detailStruct.getITEM_COL1())) {
				_mstApprDBAccessor.updateM_CUST_COMB(_conn,detailStruct); // �X�V
			}
			
			// ������g���e�[�u���̏����敪
			if("1".equals(detailStruct.getITEM_COL8())) {
				_mstApprDBAccessor.insertM_BALA_ACCOUT_COMB(_conn,detailStruct); // �o�^
			} else if("2".equals(detailStruct.getITEM_COL8())) {
				_mstApprDBAccessor.updateM_BALA_ACCOUT_COMB(_conn,detailStruct); // �X�V
			}
			// ���F�֘A�������s
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// ���F�˗����폜
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// �X�V
		case 2:
			// ���F�˗��\����A�����擾
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// ���Ӑ�g���e�[�u���X�V
			_mstApprDBAccessor.updateM_CUST_COMB(_conn,detailStruct);
			// ������g���e�[�u���X�V
			_mstApprDBAccessor.updateM_BALA_ACCOUT_COMB(_conn,detailStruct); 
			// ���F�֘A�������s
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// ���F�˗����폜
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// �폜
		case 3:
			// ���F�˗��\����A�����擾
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// ������g���e�[�u���폜
			_mstApprDBAccessor.deleteM_BALA_ACCOUT_COMB(_conn,detailStruct); 
			// ���Ӑ�g���e�[�u���폜
			_mstApprDBAccessor.deleteM_CUST_COMB(_conn,detailStruct);
			// ���F�֘A�������s
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// ���F�˗����폜
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		}
	}
	
	/**
	 * ���F�˗��\���X�V
	�@* @param conn  DB�A�N�Z�X�p�̃R�l�N�V����
	 * @param appr_id�@���FID
	 * @param status ��ԋ敪
	 * @param reserve_cause�@�ۗ����R
	 * @param appr_by�@���F��ID
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public void updateMST_APPR(String appr_id,String status,String reserve_cause,String appr_by,String appr_date) throws SQLException{
		_mstApprDBAccessor.updateMST_APPR(_conn,appr_id,status,reserve_cause,appr_by,appr_date,_strUserCd,_strProgramName);
	}
	
	/**
	 * ���F�˗����폜
	 * @param appr_id�@���FID
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public void deleteAppr(String appr_id) throws SQLException{
		// ���F�����ו\�폜
		_mstApprDBAccessor.deleteMST_APPR_DETAIL_LIST(_conn,appr_id);
		// ���F���׍폜
		_mstApprDBAccessor.deleteMST_APPR_DETAIL(_conn,appr_id);
		// ���F�L�[�Ή��\�폜
		_mstApprDBAccessor.deleteMST_APPR_KEY(_conn,appr_id);
		// ���F�˗��\�폜
		_mstApprDBAccessor.deleteMST_APPR(_conn,appr_id);
		// ���F�֘A���폜
		_mstApprDBAccessor.deleteMST_APPR_CORREL(_conn,appr_id);
	}
	
	/**
	 * 
	 * @return DB�̃V�X�e������
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
	public String readSystemDateTime() throws SQLException{
		String sysdate = null;
		sysdate = _mstApprDBAccessor.readSystemDateTime(_conn);
		return sysdate;
	}

	/**
	 * ���F�L�[�Ή��\�o�^
	 * @param struct
	 * @return
	 * @throws SQLException
	 */
	public int insertMST_APPR_KEY(MstApprKeyStruct struct) throws SQLException{
		int result = 0;
		struct.setCREATED_BY(_strUserCd);
		struct.setUPDATED_BY(_strUserCd);
		struct.setCREATED_PRG_NM(_strProgramName);
		struct.setUPDATED_PRG_NM(_strProgramName);
		result = _mstApprDBAccessor.insertMST_APPR_KEY(_conn,struct);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
