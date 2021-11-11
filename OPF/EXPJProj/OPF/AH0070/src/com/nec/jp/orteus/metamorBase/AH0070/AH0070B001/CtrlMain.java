/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0070/src/com/nec/jp/orteus/metamorBase/AH0070/AH0070B001/CtrlMain.java,v $
 *
 * Copyright (c) 2003-2005 NEC Corporation.
 * Copyright (c) 2003-2005 NEC Informatec Systems,Ltd.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * テンプレート履歴：
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 *                     ,EXPLANNER/J用に改造
 * 3.0.0.0 (2003/12/10),処理結果を利用可能にする修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AH0070.AH0070B001;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;

//{{user_implement_dev:import
//------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageControl;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageInformation;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.util.Date;
//------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.10 $ $Date: 2014/11/05 07:13:46 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medAH0070B001 m_med=null;

	/**
	 * controlクラス インスタンス
	 */
	protected interControl m_control=null;

	/**
	 * コンダクタクラスインスタンス
	 */
	protected BatchAppConductor m_conductor;

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * 処理結果ステータス
	 */
	public static int m_status = 0;
	public static int getExecuteStatus() { return m_status; }
	public static void setExecuteStatus(int status) { m_status = status; }

	//////////////////////////////

	/**
	 * CtrlMainクラスのコンストラクタ
	 *
		 */
	public CtrlMain(medAH0070B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
       
        //////////////////////////////
        // コードジェネレータは、以下のコードへの上書きを行いません
        //------------------------------------------------------------------
        ////////////////////////////////////////////////////////////////////////////
		
		/** ログレベル インフォメーション */
        private static final int INFOMATION = 0;
        /** ログレベル ワーニング */
        private static final int WORNING = 1;
        /** ログレベル エラー */
        private static final int ERROR = 2;
       
        /** DBコネクション */
        private IDbConnection conn = null;
       
        /** 業務メッセージログ用Numberingクラス */
        private Numbering numbering = null;
        /** 業務メッセージログ用BusinessMessageAccessorクラス */
        private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
        /** 業務メッセージログ用BusinessMessageクラス */
        private BusinessMessage businessMsg = new BusinessMessage();
       
        /** 業務ロッククラス */
        private BusinessLock lock = null;
       
        /** ロック失敗時ロックキー */
        private static final int LOCK_FAILD = -1;
       
        /** バッチパラメータ(共通1) バッチ処理区分 */
        private String _sysBatchType;
        /** バッチパラメータ(共通2)業務ID */
        private String _sysProgramId;
        /** バッチパラメータ(共通3)ユーザID */
        private String _sysUserCd;
        /** バッチパラメータ(共通4)工場コード */
        private String _sysPlantCd;
        // バッチクラス共通エラー処理用
        private String errCode = null;		     // バッチエラーコード
        private String errMsg = null;		     // バッチエラーメッセージ
        private String errNote = "";             // バッチエラーメッセージ(備考) 必要に応じて使用。
    
        // metamorBase業務メッセージ用
        private String businessErrCode = null;   // metamorBase業務メッセージコード
		
        /**
         * ログファイル出力
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @param value 置換文字列
         */
        private void writeLogFiles(int logLevel, String code, String value) {
         ExpjMessage emsg;
         // 置換文字列判定
         if (!isNull(value)) {
          emsg = new ExpjMessage(code, value);
         } else {
          emsg = new ExpjMessage(code);
         }
       
         // ログレベルによってログタイプを分ける
         switch (logLevel) {
          case INFOMATION :
           m_med.getSyslog().info(emsg, m_med.getUsername());
           break;
          case WORNING :
           m_med.getSyslog().warning(emsg, m_med.getUsername());
           break;
          case ERROR :
           m_med.getSyslog().severe(emsg, m_med.getUsername());
           break;
         }
        }
       
        /**
         * ログファイル出力
         * @param logLevel ログレベル
         * @param code メッセージコード
         */
        private void writeLogFiles(int logLevel, String code) {
         writeLogFiles(logLevel, code, null);
        }
       
        /**
         * ログDB出力
         * @param code メッセージコード
         * @param value 置換文字列
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLogDB(String code, String value, String dataStr)
         throws FoundationException, SQLException {
         if (numbering == null) {
          throw new NullPointerException();
         }
         businessMsg.setLogCode(numbering.getNo());
         businessMsg.setMessageCode(code);
         businessMsg.setData(dataStr);
         businessMsgAcc.add(businessMsg);
        }
       
        /**
         * ログDB出力
         * @param code メッセージコード
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLogDB(String code, String dataStr) throws FoundationException, SQLException {
         writeLogDB(code, null, dataStr);
        }
       
        /**
         * ログファイル、ログDB出力を行います。
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @param value 置換文字列
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code, String value, String dataStr)
         throws FoundationException, SQLException {
         writeLogFiles(logLevel, code, value);
         if (!isNull(dataStr)) {
          writeLogFiles(logLevel, "ZZ01006", dataStr);
         }
         writeLogDB(code, value, dataStr);
        }
       
        /**
         * ログファイル、ログDB出力を行います。
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code, String dataStr)
         throws FoundationException, SQLException {
         writeLog(logLevel, code, null, dataStr);
        }
       
        /**
         * ログファイル、ログDB出力を行います。
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code) throws FoundationException, SQLException {
         writeLog(logLevel, code, null, null);
        }
        
        
        /**
         * metamorBase業務メッセージの出力を行う。
         * metamorBase業務メッセージの出力には、業務名、ユーザコード、工場コードを必要とする
         *
         * @param conn DBコネクション
         * @param businessName 業務名
         * @param userId ユーザコード
         * @param plantCd 工場コード
         * @return なし
         */
        protected void outBusinessMessage(IDbConnection conn,
                                          String businessName,
                                          String userId,
                                          String plantCd) throws Exception{
    
            // 特定の業務エラーコードがセットされていない場合
            if (businessErrCode == null) {
                businessErrCode = "ZZ09009";  // バッチ処理を開始できませんでした。
            }
    
            // 業務メッセージの準備
            BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
            BusinessMessage businessMsg = new BusinessMessage();
            businessMsgAcc.init(conn);
            businessMsg.setBusinessOperatingName(businessName);
            businessMsg.setUser(userId);
            businessMsg.setPlantCode(plantCd);
            businessMsg.setMessageCode(businessErrCode);
            businessMsg.setData(errNote);
            try {
       Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
       businessMsg.setLogCode(logCd.getNo());
                businessMsgAcc.add(businessMsg);
                // 業務メッセージは、業務プログラム側でコネクションをコミットする
                // 必要がある。所要量計算指示は、業務プログラムでトランザクションを
                // 意識する必要がないため、メイン処理と同じコネクションに対し都度コミット
                // する。
                conn.commit();
            } catch (SQLException e) {
                errCode = "AC00999"; // SQL実行時エラー。
                throw e;
            } catch (Exception e) {
                errCode = "AC53402";  // その他　Ｅｒｒｏｒ
                throw e;
            }
        }
    

        /**
        * バッチパラメータ（共通）を設定します。
        * @return 設定に成功した場合は true 、失敗した場合は false を返します。
        * @throws BatchAppException
        */
        private boolean setCommonParams() throws BatchAppException {
         String[] args = m_med.getArgs();

         // バッチパラメータの形式が不正な場合
         if (args.length != 5) {
         writeLogFiles(ERROR, "ZZ09022");
         return false;
         }

         _sysBatchType = args[0];
         _sysProgramId = args[1];
         _sysUserCd = args[2];
         _sysPlantCd = args[3];

         return true;
        }

        /**
        * バッチパラメータ（共通）のチェックを行います。
        * @return 正常の場合true、不正の場合false
        * @throws BatchAppException
        */
        private boolean checkCommonParams() throws BatchAppException {
         // バッチ処理区分がNullの場合
         if (isNull(_sysBatchType)) {
         	writeLogFiles(ERROR, "ZZ09023");
         	return false;
         }

         // バッチ処理区分が１、２以外の場合
         if ((!_sysBatchType.equals("1") && !_sysBatchType.equals("2"))) {
         	writeLogFiles(ERROR, "ZZ09024");
         	return false;
         }

         // ユーザーコードがNullの場合
         if (isNull(_sysUserCd)) {
         	writeLogFiles(ERROR, "ZZ09025");
         	return false;
         }

         // [ユーザマスタ]に存在しない場合
         if (!isExsistsUserMst(_sysUserCd)) {
         	writeLogFiles(ERROR, "ZZ09026");
         	return false;
         }

         // 工場コードがNullの場合
         if (isNull(_sysPlantCd)) {
         	writeLogFiles(ERROR, "ZZ09027");
         	return false;
         }
         // [工場]に存在しない場合
         if (!isExistsMPlant(_sysPlantCd)) {
         	writeLogFiles(ERROR, "ZZ09028");
         	return false;
         }
         	
         // 業務名がNullの場合
         if (isNull(_sysProgramId)) {
             writeLogFiles(ERROR, "ZZ09029");
             return false;
         }

        return true;
        }

        /**
        * [ユーザマスタ]に存在するかを判定します 。
        * @return [ユーザマスタ]に存在する場合はtrue、存在しない場合はfalse
        */
        private boolean isExsistsUserMst(String userCd) throws BatchAppException {
         m_med.setUSER_CD(userCd);
         m_med.getUSER_MST().read();
         return m_med.getUSER_MST().hasRecord(false);
        }

        /**
        * [工場]に存在するかを判定します 。
        * @param plantCd 工場コード
        * @return [工場]に存在する場合はtrue、存在しない場合はfalse
        */
        private boolean isExistsMPlant(String plantCd) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.getM_PLANT().read();
         return m_med.getM_PLANT().hasRecord(false);
        }

        /**
        * 棚卸日、工場コードで[棚卸制御]に棚卸承認区分が2：棚卸承認済　ではないのデータが存在するかを判定します 。
        * @param plantCd 工場コード
        * @param invDate 棚卸日
        * @return [棚卸制御]に存在する場合はtrue、存在しない場合はfalse
        */
        private boolean isExistsMTInvCtrL(String plantCd,String invDate) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.setINV_DATE(invDate);
         m_med.getT_INV_CTRL().read();
         return m_med.getT_INV_CTRL().hasRecord(false);
        }

        /** バッチパラメータ(業務固有)棚卸日 */
        private String _InvDate;

        /**
        * バッチパラメータ（業務固有）の設定を行います。
        * @return 正常の場合true、不正の場合false
        * @throws BatchAppException
        * @throws FoundationException
        * @throws SQLException
        */
        private boolean setParams() throws BatchAppException {
         String[] args = m_med.getArgs();

         _InvDate = args[4];

         return true;
        }

         /**
         * 業務ロックを行います
         * @return ロックキャンセルキー
         * @throws FoundationException
         */
        private int businessLock() throws FoundationException {
         lock = new BusinessLock(conn, _sysUserCd, _sysPlantCd);
         // 解除キーの取得
         int lockCancelKey = lock.doLock(m_med.getProgname());
         conn.commit();
         return lockCancelKey;
        }
       
        /**
         * 業務ロックを解除します
         * @param lockCancelKey ロックキャンセルキー
         * @return ロック解除成功時true、失敗時false
         * @throws FoundationException
         */
        private boolean businessUnLock(int lockCancelKey) throws FoundationException {
       
         if (lockCancelKey == LOCK_FAILD) {
          return true;
         }
         boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
         conn.commit();
         return result;
        }

        /**
         * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
         * @param str 対象文字列
         * @return Nullの場合はtrue、Nullではない場合はfalse
         */
        private boolean isNull(String str) {
        	if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
        		return true;
        	}
        	return false;
        }
       
        ////////////////////////////////////////////////////////////////////////////
        /*
         * 業務メッセージ出力用メッセージ定数
         */
        private final String MES_UPDATE_START					= "(SBM0641)<< 棚卸更新処理開始 >>";
        private final String MES_UPDATE_END						= "(SBM0642)<< 棚卸更新処理終了 >>";
        private final String MES_UPDATE_START4INV_CTRL			= "(SBM0643)<< 棚卸制御更新開始 >>";
        private final String MES_UPDATE_END4INV_CTRL			= "(SBM0644)<< 棚卸制御更新終了 >>";
        private final String MES_UPDATE_START4ITEM_STOCK		= "(SBM0645)<< 保管区別品目在庫更新開始 >>";
        private final String MES_UPDATE_END4ITEM_STOCK			= "(SBM0646)<< 保管区別品目在庫更新終了 >>";
        private final String MES_UPDATE_START4JOB_ODR_CD_STOCK	= "(SBM0647)<< 保管区別製番在庫更新開始 >>";
        private final String MES_UPDATE_END4JOB_ODR_CD_STOCK	= "(SBM0648)<< 保管区別製番在庫更新終了 >>";
        private final String MES_UPDATE_START4LOT_STOCK         = "(SBM0649)<< ロット別品目在庫更新開始 >>";
        private final String MES_UPDATE_END4LOT_STOCK			= "(SBM0650)<< ロット別品目在庫更新終了 >>";
        ////////////////////////////////////////////////////////////////////////////
       /**
         * 処理成功時のメッセージ加工設定処理
         *
         * @param	invAccessor		棚卸アクセッサクラス
         * @param	strMessageCode	メッセージコード
         * @param	strAddMessage	追加メッセージ
         * @return	なし
         */
        private void resultMessage4Success(
         InvAccessor invAccessor,
         String strMessageCode,
         String strAddMessage) throws FoundationException, SQLException 
        {
         InvMessageInformation invMessageInfo = null;
         InvMessageControl msg = invAccessor.getMessage();
         String strResultNote = "";
         for(int i = 0; ((invMessageInfo = msg.get(i)) != null); i++)
         {
          if(invMessageInfo.getType() == InvMessageControl.TYP_SUCCESS)
          {
           strResultNote = invMessageInfo.getNote();
           System.out.println(strAddMessage + strResultNote);
           writeLog(INFOMATION,strMessageCode,strAddMessage + strResultNote);
           break;
          }
         }
         return;
        }

        /**
         * 処理失敗時のメッセージ加工設定処理
         *
         * @param	invAccessor	棚卸アクセッサクラス
         * @return	なし
         * @throws  FoundationException
         */
        private void resultMessage4Error(
         InvAccessor invAccessor) throws FoundationException, SQLException 
        {
         InvMessageInformation invMessageInfo = null;
         InvMessageControl msg = invAccessor.getMessage();
         String strErrorCode = "";
         String strResultNote = "";
         for(int i = 0; ((invMessageInfo = msg.get(i)) != null); i++)
         {
          strResultNote = invMessageInfo.getNote();
          if(invMessageInfo.getParentType() == InvMessageControl.TYP_ERROR)
          {
           if(invMessageInfo.getType() == InvMessageControl.TYP_SQL_ERROR)
           {
            strErrorCode = "AH53401";// SQLエラー
           }
           else
           {
            strErrorCode = invMessageInfo.getCode();
            if(strErrorCode == null || "".equals(strErrorCode) == true)
            {
             strErrorCode = "AH53402";// その他エラー
            }
           }
           writeLog(ERROR,strErrorCode,strResultNote);
          }
          System.out.println(strResultNote);
          break;
         }
         return;
        }
       
        ////////////////////////////////////////////////////////////////////////////
        /**
         * 更新処理メイン
         *
         * @param	conn			DBアクセス用のコネクション
         * @param	userId			ユーザコード
         * @param	plantCd			工場コード
         * @param	strProgramName	プログラム名
         * @param	arg				その他の引数の文字列
         * @return	なし
         */
        private void updateCore(
         IDbConnection conn, 
         String userId, 
         String plantCd, 
         String strProgramName, 
         String arg) throws Exception
        {
         // DB更新中フラグ初期化
         boolean bDBUpdate = false;
       
         // パラメータ
         String strInvDate = null;	// 棚卸日
         try
         {
          // 引数取得 ********************************************************
          StringTokenizer tokEtcPrm = new StringTokenizer(arg, ",");	// その他の引数：棚卸日
          int i = 0;
          while(tokEtcPrm.hasMoreTokens())
          {
           if(i == 0)
           {
            strInvDate = (String)tokEtcPrm.nextElement();  // 棚卸日
            i++;
           }
          }
          // 入力チェック ****************************************************
          // エラーフラグ初期化
          boolean bError = false;
       
          // 棚卸日取得
          if(strInvDate == null || strInvDate.equals("null") || strInvDate.equals("Null") || strInvDate.equals("NULL"))
          {
           strInvDate = null;
          }
       
          // 棚卸日未入力チェック
          if(strInvDate == null || "".equals(strInvDate) == true)
          {
           bError = true;
          }
          else
          {
           // 日付形式チェック
           DateConverter dateConv = new DateConverter();
           Date dateWork = dateConv.str2date(strInvDate);
           if(dateWork == null)
           {
            bError = true;
           }
          }
          if(bError == true)
          {
           System.out.println("(SBM0639)棚卸日：[ " + strInvDate + " ]");
           System.out.println("(SBM1018)棚卸日に指定された日付の形式が不正です。");
           writeLog(ERROR, "AH50805","(SBM0639)棚卸日：[ " + strInvDate + " ]");
           throw new Exception();
          }
       
          // 更新処理 ********************************************************
          // 処理実行前準備 --------------------------------------------------
          String strResultNote;
          String strErrorCode;
          boolean bSuccess;
       
          // トランザクション開始
          conn.beginTransWeb();
       
          // 棚卸アクセッサクラス生成
          InvAccessor invAccessor = new InvAccessor(plantCd, userId, strProgramName);
       
          // DB更新中フラグON
          bDBUpdate = true;
       
          // 処理実行 --------------------------------------------------------
          System.out.println(MES_UPDATE_START + "棚卸日：[ " + strInvDate + " ]");
          System.out.println("(SBM0992)バッチ処理を開始しました。");
          writeLog(INFOMATION, "ZZ09001",MES_UPDATE_START + "棚卸日：[ " + strInvDate + " ]");// バッチ処理を開始しました。
       
          // 棚卸制御更新実行 ------------------------------------------------
          System.out.println(MES_UPDATE_START4INV_CTRL);
          System.out.println("(SBM0993)棚卸制御の更新を開始しました。");
          writeLog(INFOMATION, "AH50810",MES_UPDATE_START4INV_CTRL);// 棚卸制御の更新を開始しました。
          bSuccess = invAccessor.updateInvCtrl(conn, strInvDate);
          if(bSuccess == true)
          {
           // 更新成功
           System.out.println("(SBM0994)棚卸制御の更新を終了しました。");
           resultMessage4Success(invAccessor, "AH50811", MES_UPDATE_END4INV_CTRL);//棚卸制御の更新を終了しました。
          }
          else
          {
           // 更新失敗
           resultMessage4Error(invAccessor);
           System.out.println("(SBM0995)棚卸制御の更新でエラーが発生しました。");

           throw new Exception();
          }
       
          // 保管区別品目在庫更新実行 ----------------------------------------
          System.out.println(MES_UPDATE_START4ITEM_STOCK);
          System.out.println("(SBM0996)保管区別品目在庫の更新を開始しました。");
          writeLog(INFOMATION, "AH50806",MES_UPDATE_START4ITEM_STOCK);
          bSuccess = invAccessor.updateItemStock(conn, strInvDate);
          if(bSuccess == true)
          {
           // 更新成功
           System.out.println("(SBM0997)保管区別品目在庫の更新を終了しました。");
           resultMessage4Success(invAccessor, "AH50807", MES_UPDATE_END4ITEM_STOCK);
          }
          else
          {
           // 更新失敗
           resultMessage4Error(invAccessor);
           System.out.println("(SBM0998)保管区別品目在庫の更新でエラーが発生しました。");
           throw new Exception();
          }
       
          // 保管区別製番在庫更新実行 ----------------------------------------
          System.out.println(MES_UPDATE_START4JOB_ODR_CD_STOCK);
          System.out.println("(SBM0999)保管区別製番在庫の更新を開始しました。");
          writeLog(INFOMATION, "AH50808",MES_UPDATE_START4JOB_ODR_CD_STOCK);
          bSuccess = invAccessor.updateJobOdrCdStock(conn, strInvDate);
          if(bSuccess == true)
          {
           // 更新成功
           resultMessage4Success(invAccessor, "AH50809", MES_UPDATE_END4JOB_ODR_CD_STOCK);
           System.out.println("(SBM1000)保管区別製番在庫の更新を終了しました。");
          }
          else
          {
           // 更新失敗
           resultMessage4Error(invAccessor);
           System.out.println("(SBM1001)保管区別製番在庫の更新でエラーが発生しました。");
           throw new Exception();
          }
          
          // ロット別品目在庫更新実行 ----------------------------------------         
	      if(LotCtrl.checkLotCtrl(conn)){
	    	System.out.println("(SBM1002)ロット別品目在庫の更新を開始しました。");
	    	writeLog(INFOMATION, "AH50812",MES_UPDATE_START4LOT_STOCK);         
	    	bSuccess = invAccessor.updateLotStock(conn, strInvDate);
	    	if(bSuccess)
	    	{
	    		// 更新成功
	    		System.out.println("(SBM1003)ロット別品目在庫の更新を終了しました。");
	    		resultMessage4Success(invAccessor, "AH50813", MES_UPDATE_END4LOT_STOCK);
	    	}
	    	else
	    	{
	    		// 更新失敗
	    		resultMessage4Error(invAccessor);
	    		System.out.println("(SBM1004)ロット別品目在庫の更新でエラーが発生しました。");
	    		throw new Exception();
	    	}  
	      }
          // 処理成功 --------------------------------------------------------
          // コミット
          conn.commit();
       
          // DB更新中フラグOFF
          bDBUpdate = false;
       
          // 処理終了 --------------------------------------------------------
       
         } finally {
          if(bDBUpdate == true)
          {
           try {
            // ロールバック
            conn.rollback();
            System.out.println("CtrlMain：main - rollback ok");
           } catch(FoundationException fe) {
            System.out.println("(SBM0640)ロールバックに失敗しました。");
            System.out.println("CtrlMain：main - rollback failed");
            writeLog(INFOMATION, "AH53402","(SBM0640)ロールバックに失敗しました。");
           }
          }
         }
         return;
        }
        
        //------------------------------------------------------------------
       
        /**
         * CtrlMainクラスの標準コンストラクタ
         *
         * @return なし
         */
        public CtrlMain(medAH0070B001 med) throws BatchAppException
        {
         // メンバ変数を初期化します
         m_med = med;
         m_control = new interControl(med);
       
       
         return;
        }
       
        /**
         * インスタンス破壊時に行う処理
         *
         * @param なし
         */
        public void finalize()
        {
         // 各メンバ変数の初期化
         m_med = null;
         m_control = null;
         objMessage = null;
       
       
         return;
        }
       
        //////////////////////////////
       
        /**
         * main： ユーザ定義用メソッドです<br>
         * <<説明を記述してください>>
         *
         * @return <<説明を記述してください>>
         * @exception <<説明を記述してください>>
         */
        public int main() throws BatchAppException
        {
         //------------------------------------------------------------------
         // ロック解除キー
		int lockCancelKey = LOCK_FAILD;
		
		// パラメータ取得
		String[] args = m_med.getArgs();
		
		// バッチパラメータ出力
		System.out.println("-------------------------------------------------");
		System.out.println("execute " + m_med.getProgname());
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}
		
		// DB接続取得処理
		conn = m_conductor.m_transactionConn;

          if(args.length >= 2){
            m_med.setUsername(args[1]);
          }
		
		// バッチパラメータ（共通）をパラメータ変数に設定
		if (!setCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		// ↓業務ロジック
		// バッチパラメータ（業務固有）をパラメータ変数に設定
		if (!setParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		// バッチパラメータ（共通）チェック
		if (!checkCommonParams()) {
			writeLogFiles(ERROR, "ZZ09009");
			return BREAK;
		}
		
		try{
	         //////////////////////////////////////////////////////     		
     		PrivateConfig privateConfig = new PrivateConfig(conn);
     		String aprInvCtrl = privateConfig.getString("APR_INV_CTRL");
     		// パラメータ「棚卸承認」が取得できなかった場合
     		if(aprInvCtrl == null || "".equals(aprInvCtrl)){

  				String locale = CoreTools.getLocale(_sysUserCd);
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  	    		//ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00070"));
             	writeLogFiles(ERROR, "AZ00041", messages.getString("AZ00070"));
                businessErrCode = "KV03005"; //                 
                errCode = businessErrCode;
                errNote = messages.getString("AZ00070");
                //writeLogDB("AZ00041",errNote ,errNote);
                //AlarmMessage msg = new AlarmMessage(errCode);
                //errMsg = "[" + errCode + "]" + msg.getMessage();
        		outBusinessMessage(conn, _sysProgramId, _sysUserCd, _sysPlantCd);
                throw new Exception();		
     		}
     		if("1".equals(aprInvCtrl)){
     	         // [棚卸承認]に存在場合
     	         if (isExistsMTInvCtrL(_sysPlantCd,_InvDate)) {
     	         	writeLogFiles(ERROR, "AH00047");
                    businessErrCode = "AH00047"; // 
                    errCode = businessErrCode;
            		outBusinessMessage(conn, _sysProgramId, _sysUserCd, _sysPlantCd);
                    throw new Exception();
     	         }
     		}	         
	        /////////////////////////////////////////////////////////
			// DBメッセージ更新準備
			IDbConnection conn_msg = m_conductor.m_defaultConn;
			numbering = new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _sysPlantCd);
			businessMsgAcc.init(conn_msg);
			businessMsg.setBusinessOperatingName(_sysProgramId);
			businessMsg.setUser(_sysUserCd);
			businessMsg.setPlantCode(_sysPlantCd);
			
			// 業務ロック
			lockCancelKey = businessLock();
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01001");
				return BREAK;
			}
       
         ///////////////////////////////////////////////////////////////////
         // OPF専用処理 はじめ
       
          // 更新処理
          updateCore(conn, _sysUserCd, _sysPlantCd, _sysProgramId, _InvDate);
       
         // OPF専用処理 おわり
         ///////////////////////////////////////////////////////////////////
         } catch (SQLException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (FoundationException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (Exception e) {
          // ここでExceptionをキャッチしてはいけないのですが、mainメソッドを
          // 呼び出しているexecuteメソッドがStackTraceを行わないためキャッチしています。
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } finally { 
          try {
           // 業務ロック解除
            if (!businessUnLock(lockCancelKey)) {
             writeLog(ERROR, "ZZ01004");
            }
          	if (lockCancelKey != LOCK_FAILD) {
            System.out.println(MES_UPDATE_END);
            System.out.println("(SBM1005)バッチ処理を終了しました。");
            writeLog(INFOMATION, "ZZ09002",MES_UPDATE_END);
          	}
           } catch (Exception ee) {
           	ee.printStackTrace();
           	throw new BatchAppException("CtrlMain", "main", ee.getMessage());
          }
         }
         // 共通処理 終わり =============================================
               //------------------------------------------------------------------
       
         return BREAK;
        }
       
       
        //////////////////////////////
       
        /**
         * object型を返します
         *
         * @return object型
         */
        public int getType()
        {
         return m_control.getType();
        }
       
        /**
         * 初期処理
         *
         * @return <<コメントを記述してください>>
         * @exception <<コメントを記述してください>>
         */
        public int beginProc() throws BatchAppException
        {
       
       
         return m_control.beginProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int endProc() throws BatchAppException
        {
       
       
         return m_control.endProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int execute() throws BatchAppException
        {
       
       
         return m_control.execute();
        }
       
        //}}user_implement_code

	//{{control_class(wizard code)

	//////////////////////////////

	class interControl
		implements IBatchAppCommon
	{

		//////////////////////////////

		/**
		 * mediatorクラス インスタンス
		 */
		public medAH0070B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAH0070B001 med) throws BatchAppException
		{
			// 各メンバ変数の初期化
			m_med = med;

			try {
				m_container = new ManageContainer();
			} catch(FoundationException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "constractor", "DBへの接続に失敗しました");
			}
			return;
		}

		protected void finalize()
		{
			m_med = null;
			return;
		}

		//////////////////////////////



		//////////////////////////////

		public int getType()
		{
			return TYPE_CONTROL;
		}

		public int beginProc() throws BatchAppException
		{
			return IBatchAppCommon.SUCCESS;
		}

		public int endProc() throws BatchAppException
		{
			int ret;

			return IBatchAppCommon.SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret;

			try {
				if((ret=main())!=IBatchAppCommon.SUCCESS ) return ret;
			} catch(Exception ex) {
				throw new BatchAppException("CtrlMain", "execute", "executeの処理に失敗しました");
			}

			return IBatchAppCommon.SUCCESS;
		}

		public void commit() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().commit();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "commit", "DBへのコミット時に失敗しました(SQLException)");
			}

			return;
		}

		public void rollback() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().rollback();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "rollback", "DBへのロールバック時に失敗しました(SQLException)");
			}

			return;
		}

		//////////////////////////////

	}

	//}}control_class(wizard code)

}
