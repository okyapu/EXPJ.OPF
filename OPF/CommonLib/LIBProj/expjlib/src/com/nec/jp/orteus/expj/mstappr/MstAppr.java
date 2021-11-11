package com.nec.jp.orteus.expj.mstappr;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;

/**
 * マスタ系承認クラス
 * 
 * @author xing-qianying
 * @version 1.00
 *
 */
public class MstAppr {


	/** コンストラクタ */
	public MstAppr(){ clear(); }
	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AA0090030）
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
//	 変数
	/** DBアクセス用のコネクション */
	private IDbConnection _conn = null;
	
	/** 工場コード格納用 */
	private String _strPlantCd = null;

	/** ユーザコード格納用 */
	private String _strUserCd = null;

	/** プログラム名格納用 */
	private String _strProgramName = null;
	
	/** 画面URL　*/
	private String _screenURL = null;
	
	/** 承認情報アクセッサクラス */
	private MstApprDBAccessor _mstApprDBAccessor = null;
	
	/** エラーメッセージ格納リスト */
	private ArrayList errorList = new ArrayList();
	
	/** 情報メッセージ格納リスト */
	private ArrayList infoList = new ArrayList();
	
	/** 警告メッセージ格納リスト */
	private ArrayList warnList = new ArrayList();
	
	/** 承認明細 */
	private MstApprDetailStruct _detailStruct = new MstApprDetailStruct();
	
	/** 承認小明細 */
	private MstApprDetailListStruct _listStruct = new MstApprDetailListStruct();
	
	/** 承認関連依頼情報 */
	private MstApprCorrelInfoStruct _infoStruct = new MstApprCorrelInfoStruct();
	
	
	/** 一意制約処理区分,true: 一意制約あり　　false: 一意制約なし*/
	private boolean uniqueflg = true;

	
	/**
	 * 一意制約処理区分取得
	 * @return
	 */
	public boolean isUniqueflg() {
		return uniqueflg;
	}

	/**
	 * 一意制約処理区分設定
	 * @param uniqueflg
	 */
	public void setUniqueflg(boolean uniqueflg) {
		this.uniqueflg = uniqueflg;
	}
	// --------------------------------------------------------------------------
//	 共通メソッド
////////////////////////////////////////////////////////////////////////////
	/**
	 * クリア
	 *
	 * @return	なし
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
	 * メッセージ取得
	 * 
	 * @return エラーリスト
	 */
	public ArrayList getErrorList() {
		return errorList;
	}

	/**
	 * メッセージ設定
	 * 
	 * @param メッセージリスト
	 */
	public void setErrorList(ArrayList list) {
		errorList = list;
	}

	/**
	 * メッセージ取得
	 * 
	 * @return infoリスト
	 */
	public ArrayList getInfoList() {
		return infoList;
	}

	/**
	 * メッセージ設定
	 * 
	 * @param メッセージリスト
	 */
	public void setInfoList(ArrayList list) {
		infoList = list;
	}

	/**
	 * メッセージ取得
	 * 
	 * @return warnリスト
	 */
	public ArrayList getWarnList() {
		return warnList;
	}

	/**
	 * メッセージ設定
	 * 
	 * @param メッセージリスト
	 */
	public void setWarnList(ArrayList list) {
		warnList = list;
	}
	
//	--------------------------------------------------------------------------
//	 操作
	
	/**
	 *  承認情報の存在チェック処理
	 * @param mst_ID マスタ表のキー
	 * @return 承認依頼に情報が存在　false
	 * @throws SQLException DBアクセスエラー
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
	 *  承認情報処理区分：削除の存在チェック処理
	 * @param mst_ID マスタ表のキー
	 * @return 承認依頼に情報が存在　false
	 * @throws SQLException DBアクセスエラー
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
	 *  承認情報処理区分：登録の存在チェック処理
	 * @param mst_ID マスタ表のキー
	 * @return 承認依頼に情報が存在　false
	 * @throws SQLException DBアクセスエラー
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
	 * マスタ項目コラム番号の取得処理
	 * @param tablename マスタ表名
	 * @param columnname　コラム名
	 * @return String コラムID
	 * @throws SQLException DBアクセスエラー
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
	 * マスタ項目コラム名の取得処理
	 * @param tablename マスタ表名
	 * @param columnID　コラムID
	 * @return String コラム名
	 * @throws SQLException DBアクセスエラー
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
	 *  カラム番号より、承認明細表の項目IDを決定する。
	 * @param value 値
	 * @param columnID コラムID
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
	 * カラム番号より、承認明細表の項目IDを取得する。
	 * @param columnID 承認明細表のコラムID
	 * @return String MstApprDetailStructのコラム値
	 */
	public String getDetailByColumnID(MstApprDetailStruct struct,String columnID){
		String value = null;
		value = _mstApprDBAccessor.getDetailByColumnID(struct,columnID);
		return value;
	}
	
	/**
	 * カラム番号より、承認小明細表の項目IDを決定する。
	 * @param value　値
	 * @param columnID　コラムID
	 */
	public void setListByColumnID(String value,String columnID){
		_mstApprDBAccessor.setListByColumnID(_listStruct,value,columnID);
	}
	
	/**
	 * カラム番号より、承認小明細表の項目IDを取得する。
	 * @param columnID　コラムID
	 * @return　MstApprDetailListStructのコラム値
	 */
	public String getListByColumnID(MstApprDetailListStruct struct,String columnID){
		String value = null;
		value = (String) _mstApprDBAccessor.getListByColumnID(struct,columnID);
		return value;
	}
	
	/**
	 * 承認情報の登録
	 * @param struct 承認依頼表
	 * @return　String 承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public String insertMST_APPR(MstApprStruct struct) throws SQLException{
		String appr_ID = null;
		// 承認ID
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
	 * 承認明細表の登録処理
	 * @param detailStruct 承認明細表
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
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
	 * 承認小明細表の登録処理
	 * @param tableName 表名
	 * @param appr_ID　承認ID
	 * @param seq_no　シーケンス番号
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
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
	 * 承認関連依頼情報を登録処理
	 * @param tableName 表名
	 * @param appr_ID　承認ID
	 * @param seq_no　シーケンス番号
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
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
	 * 承認依頼表検索
	　* @param appr_ID 承認ID
	 * @return 承認依頼表レコード
	 * @throws FoundationException 
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectMST_APPR(String appr_ID) throws SQLException{
		List resultList = new ArrayList();
		resultList = _mstApprDBAccessor.selectMST_APPR(_conn,appr_ID);
		return resultList;
	}
	
	/**
	 * 承認明細検索
	　* @param appr_ID 承認ID
	 * @return 承認明細表レコード
	 * @throws SQLException DBアクセスエラー
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
	 * 承認小明細検索
	　* @param appr_ID 承認ID
	 * @return 承認小明細レコード
	 * @throws SQLException DBアクセスエラー
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
	 * マスタ系承認件数検索用
	 * @param plant_cd 工場コード
	 * @param user_cd ユーザコード
	 * @param select_typ 検索パターン
	 * @return　List 依頼情報
	 * @throws SQLException DBアクセスエラー
	 */
	public List select(String plant_cd,String user_cd,String select_typ) throws SQLException{
		List resultList = new ArrayList();
		switch(Integer.parseInt(select_typ)){
		// 依頼
		case 1: resultList = _mstApprDBAccessor.selectRequestData(_conn,plant_cd,user_cd); break;
		// 承認待ち
		case 2: resultList = _mstApprDBAccessor.selectAppringData(_conn,plant_cd,user_cd); break;
		// 保留
		case 3: resultList = _mstApprDBAccessor.selectReserveData(_conn,plant_cd,user_cd); break;
		}
		return resultList;
	}
	
	/**
	 * マスタ系承認明細検索用
	 * @param plant_cd  工場コード
	 * @param request_by　依頼者
	 * @param screen_url 　画面URL
	 * @param select_typ 検索パターン
	 * @return
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectDetail(String plant_cd,String user_cd,String screen_url,String select_typ) throws SQLException{
		List resultList = new ArrayList();
		switch(Integer.parseInt(select_typ)){
		// 依頼
		case 1: resultList = _mstApprDBAccessor.selectRequestDetail(_conn,plant_cd,user_cd,screen_url); break;
		// 承認待ち
		case 2: resultList = _mstApprDBAccessor.selectAppringDetail(_conn,plant_cd,screen_url); break;
		// 保留
		case 3: resultList = _mstApprDBAccessor.selectReserveDetail(_conn,plant_cd,screen_url); break;
		}
		return resultList;
	}
	
	/**
	 * マスタ系承認明細KA2130010得意先組合せメンテナンス用
	 * @param plant_cd  工場コード
	 * @param request_by　依頼者
	 * @param screen_url 　画面URL
	 * @param select_typ 検索パターン
	 * @return
	 * @throws SQLException DBアクセスエラー
	 */
	public List selectDetailKA2130(String plant_cd,String user_cd,String screen_url,String select_typ) throws SQLException{
		List resultList = new ArrayList();
		switch(Integer.parseInt(select_typ)){
		// 依頼
		case 1: resultList = _mstApprDBAccessor.selectRequestDetailKA2130(_conn,plant_cd,user_cd,screen_url); break;
		// 承認待ち
		case 2: resultList = _mstApprDBAccessor.selectAppringDetailKA2130(_conn,plant_cd,screen_url); break;
		// 保留
		case 3: resultList = _mstApprDBAccessor.selectReserveDetailKA2130(_conn,plant_cd,screen_url); break;
		}
		return resultList;
	}
	
	/**
	 * 承認
	 * @param appr_id 承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void apprAssort(String appr_id,String appr_by,String appr_date,String deleteFlg) throws SQLException{
		List mst_apprList = new ArrayList();
		List detailList = new ArrayList();
		List detaillistList = new ArrayList();
		
		HashMap keyvalueMap = new HashMap();
		
		MstApprStruct apprstruct = new MstApprStruct();
		MstApprDetailStruct detailStruct = new MstApprDetailStruct();
		MstApprDetailListStruct listStruct = new MstApprDetailListStruct();
		
		// 承認IDより、承認依頼表検索
		mst_apprList = _mstApprDBAccessor.selectMST_APPR(_conn,appr_id);
		apprstruct = (MstApprStruct) mst_apprList.get(0);
		
		// 承認IDより、承認キー対応表検索
		keyvalueMap = _mstApprDBAccessor.selectMST_APPR_KEY(_conn,appr_id);
		switch(Integer.parseInt(apprstruct.getPROC_TYP())){
		// 登録
		case 1:
			// 承認依頼表から、情報を取得
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// マスタに登録
			_mstApprDBAccessor.insertMST(_conn,detailStruct);
			// マスタ明細表に登録
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
			// 承認関連情報を実行
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// 承認依頼を削除
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// 更新
		case 2:
			// 承認依頼表から、情報を取得
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// 承認キー対応表から、情報を取得
			// マスタを更新
			_mstApprDBAccessor.updateMST(_conn,detailStruct,keyvalueMap);
			
			// マスタ明細表を更新
			detaillistList = _mstApprDBAccessor.selectMST_APPR_DETAIL_LIST(_conn,appr_id);
			
			// 承認依頼表はユーザマスタの場合、常に所属マスタを削除
			if("USER_MST".equals(detailStruct.getTABLE_NAME())){
			    _mstApprDBAccessor.deleteMSTDetail(_conn,detailStruct.getTABLE_NAME(),"BELONG_MST",keyvalueMap);
			} else {
			    // マスタ明細表を削除
			    for(int i=0 ;i<detaillistList.size();i++){
				    listStruct = (MstApprDetailListStruct) detaillistList.get(i);
				    _mstApprDBAccessor.deleteMSTDetail(_conn,detailStruct.getTABLE_NAME(),listStruct.getTABLE_NAME(),keyvalueMap);
			    }
			}

			// マスタ明細表に登録
			for(int i=0 ;i<detaillistList.size();i++){
				listStruct = (MstApprDetailListStruct) detaillistList.get(i);
				_mstApprDBAccessor.insertMSTDetail(_conn,listStruct);
			}
			// 承認関連情報を実行
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// 承認依頼を削除
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// 削除
		case 3:
			// 承認依頼表から、情報を取得
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// マスタを削除
			_mstApprDBAccessor.deleteMST(_conn,detailStruct,keyvalueMap);
			
			// マスタ明細表を削除
			detaillistList = _mstApprDBAccessor.selectMST_APPR_DETAIL_LIST(_conn,appr_id);
			for(int i=0 ;i<detaillistList.size();i++){
				listStruct = (MstApprDetailListStruct) detaillistList.get(i);
				_mstApprDBAccessor.deleteMSTDetail(_conn,detailStruct.getTABLE_NAME(),listStruct.getTABLE_NAME(),keyvalueMap);
			}
			// 承認関連情報を実行
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// 承認依頼を削除
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		}
	}
	
	/**
	 * 承認(得意先組合メンテナンス)
	 * @param appr_id 承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void apprAssortKA2130(String appr_id,String appr_by,String appr_date,String deleteFlg) throws SQLException{
		List mst_apprList = new ArrayList();
		List detailList = new ArrayList();
		
		MstApprStruct apprstruct = new MstApprStruct();
		MstApprDetailStruct detailStruct = new MstApprDetailStruct();
		
		// 承認IDより、承認依頼表検索
		mst_apprList = _mstApprDBAccessor.selectMST_APPR(_conn,appr_id);
		apprstruct = (MstApprStruct) mst_apprList.get(0);
		switch(Integer.parseInt(apprstruct.getPROC_TYP())){
		// 登録
		case 1:
			// 承認依頼表から、情報を取得
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// 得意先組合テーブルの処理区分
			if("1".equals(detailStruct.getITEM_COL1())) {
				_mstApprDBAccessor.insertM_CUST_COMB(_conn,detailStruct); // 登録
			} else if("2".equals(detailStruct.getITEM_COL1())) {
				_mstApprDBAccessor.updateM_CUST_COMB(_conn,detailStruct); // 更新
			}
			
			// 帳合先組合テーブルの処理区分
			if("1".equals(detailStruct.getITEM_COL8())) {
				_mstApprDBAccessor.insertM_BALA_ACCOUT_COMB(_conn,detailStruct); // 登録
			} else if("2".equals(detailStruct.getITEM_COL8())) {
				_mstApprDBAccessor.updateM_BALA_ACCOUT_COMB(_conn,detailStruct); // 更新
			}
			// 承認関連情報を実行
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// 承認依頼を削除
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// 更新
		case 2:
			// 承認依頼表から、情報を取得
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// 得意先組合テーブル更新
			_mstApprDBAccessor.updateM_CUST_COMB(_conn,detailStruct);
			// 帳合先組合テーブル更新
			_mstApprDBAccessor.updateM_BALA_ACCOUT_COMB(_conn,detailStruct); 
			// 承認関連情報を実行
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// 承認依頼を削除
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		// 削除
		case 3:
			// 承認依頼表から、情報を取得
			detailList = _mstApprDBAccessor.selectMST_APPR_DETAIL(_conn,appr_id);
			detailStruct = (MstApprDetailStruct) detailList.get(0);
			// 帳合先組合テーブル削除
			_mstApprDBAccessor.deleteM_BALA_ACCOUT_COMB(_conn,detailStruct); 
			// 得意先組合テーブル削除
			_mstApprDBAccessor.deleteM_CUST_COMB(_conn,detailStruct);
			// 承認関連情報を実行
			_mstApprDBAccessor.executeMST_APPR_CORREL(_conn, appr_id);
			
			if("0".equals(deleteFlg)){
				// 承認依頼を削除
				deleteAppr(appr_id);
			}else{
				updateMST_APPR(appr_id,"3", null, appr_by, appr_date);
			}
			break;
		}
	}
	
	/**
	 * 承認依頼表を更新
	　* @param conn  DBアクセス用のコネクション
	 * @param appr_id　承認ID
	 * @param status 状態区分
	 * @param reserve_cause　保留理由
	 * @param appr_by　承認者ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void updateMST_APPR(String appr_id,String status,String reserve_cause,String appr_by,String appr_date) throws SQLException{
		_mstApprDBAccessor.updateMST_APPR(_conn,appr_id,status,reserve_cause,appr_by,appr_date,_strUserCd,_strProgramName);
	}
	
	/**
	 * 承認依頼を削除
	 * @param appr_id　承認ID
	 * @throws SQLException DBアクセスエラー
	 */
	public void deleteAppr(String appr_id) throws SQLException{
		// 承認小明細表削除
		_mstApprDBAccessor.deleteMST_APPR_DETAIL_LIST(_conn,appr_id);
		// 承認明細削除
		_mstApprDBAccessor.deleteMST_APPR_DETAIL(_conn,appr_id);
		// 承認キー対応表削除
		_mstApprDBAccessor.deleteMST_APPR_KEY(_conn,appr_id);
		// 承認依頼表削除
		_mstApprDBAccessor.deleteMST_APPR(_conn,appr_id);
		// 承認関連情報削除
		_mstApprDBAccessor.deleteMST_APPR_CORREL(_conn,appr_id);
	}
	
	/**
	 * 
	 * @return DBのシステム日時
	 * @throws SQLException DBアクセスエラー
	 */
	public String readSystemDateTime() throws SQLException{
		String sysdate = null;
		sysdate = _mstApprDBAccessor.readSystemDateTime(_conn);
		return sysdate;
	}

	/**
	 * 承認キー対応表登録
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
