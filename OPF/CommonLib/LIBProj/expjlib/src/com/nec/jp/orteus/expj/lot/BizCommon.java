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
 * プロシージャをコールして処理を実行するクラス
 * （自部品テンプレート専用クラス）
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2013/06/27 02:06:08 $
 */
public class BizCommon {
    
    /**
     * 在庫、入出庫更新キー
     */
    static final public int EXCUPDATEITEMSTOCKFD  = 1;
    
    /**
     * ロットトレース登録・更新処理キー
     */
    static final public int EXCMAKELOTTRACEFD = EXCUPDATEITEMSTOCKFD + 1;
    
    /**
     * ロット別品目在庫登録・更新処理キー
     */
    static final public int EXCUPDATELOTSTOCKFD = EXCMAKELOTTRACEFD + 1;
    
    /**
     * 出荷便設定キー
     */
    static final public int GETDLVPLANTRANSFD = EXCUPDATELOTSTOCKFD + 1;
    
    /**
     * 在庫引当処理キー
     */
    static final public int EXCINVALLOCFD = GETDLVPLANTRANSFD + 1;
    
    /**
     * 出荷指示作成処理キー
     */
    static final public int EXCSHIPODRENTRYFD = EXCINVALLOCFD + 1;
    
    /**
     * 出荷指示ヘッダ作成処理キー
     */
    static final public int EXCSHIPODRHENTRYFD = EXCSHIPODRENTRYFD + 1;
    
    /**
     * 出荷実績ヘッダ作成処理キー
     */
    static final public int EXCSHIPHENTRYFD = EXCSHIPODRHENTRYFD + 1;
    
    /**
     * 出荷実績作成処理キー
     */
    static final public int EXCSHIPENTRYFD = EXCSHIPHENTRYFD + 1;
    
    /**
     * 出荷実績ロット明細作成処理キー
     */
    static final public int EXCSHIPLOTENTRYFD = EXCSHIPENTRYFD + 1;
    
    /**
     * 出荷用在庫_入出庫更新キー
     */
    static final public int EXCUPDATERESERVATIONFD = EXCSHIPLOTENTRYFD + 1;
    
    /**
     * 在庫ロット採番処理キー
     */
    static final public int GETSETLOTNUMBERINGFD = EXCUPDATERESERVATIONFD + 1;
    
    /**
     * 賞味期限自動計算キー
     */
    static final public int CALCBESTBEFOREFD = GETSETLOTNUMBERINGFD + 1;
    
    /**
     * 販売管理初期処理キー
     */
    static final public int INITSALESPROCFD  = CALCBESTBEFOREFD + 1;
    
    /**
     * 受注ヘッダ作成処理キー
     */
    static final public int EXCORDERHENTRYFD = INITSALESPROCFD + 1;
    
    
    /**
     * 受注明細作成処理キー
     */
    static final public int EXCORDERENTRYFD = EXCORDERHENTRYFD + 1;
    

    /**
     * 売掛IF処理キー
     */
    static final public int EXCARFIFFD = EXCORDERENTRYFD + 1;
    
    
    /**
     * 0値設定用
     */
    static final  BigDecimal BIG_DECIMAL_ZERO  = BigDecimal.valueOf(0);
    
    

    
	static final Integer STATUS_NORMAL  = Integer.valueOf("1");	// 結果ステータス(1:正常終了)
	static final Integer STATUS_WARNING = Integer.valueOf("2");	// 結果ステータス(2:警告終了)
	static final Integer STATUS_ERROR   = Integer.valueOf("3");	// 結果ステータス(3:異常終了)
	
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
     *** 共通関数
     *********************************************************************/
    
    
    /**
     * コンストラクタ
     * @param  conn         DBコネクション
     * @param  userCd       ユーザコード
     * @param  businessCd   業務コード
     * @param  plantCd      工場コード
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
     * 在庫、入出庫更新  <BR>
     *
     * @param  rcvIssueCtrlCd  入出庫管理番号
     * @param  shipQty  出荷済数量
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excUpdateItemStockFd(String rcvIssueCtrlCd,String shipQty) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, rcvIssueCtrlCd); //入出庫管理番号
            adapt.setString(9, shipQty); //出荷済数量
            adapt.setOutString(10); //処理結果（エラーコード)
            adapt.setOutInteger(11); //処理結果（結果ステータス）

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(11);
            
            for(int i =10 ; i< 11 ; i++){
                //処理結果の格納
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
     * ロットトレース登録・更新処理  <BR>
     *
     * @param  fromItemCd  元品目コード
     * @param  fromLotNo  元ロット番号
     * @param  toItemCd  先品目コード
     * @param  toLotNo  先ロット番号
     * @param  lotTraceTyp  区分
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excMakeLotTraceFd(String fromItemCd,String fromLotNo,String toItemCd,String toLotNo,String lotTraceTyp) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, fromItemCd); //元品目コード
            adapt.setString(9, fromLotNo); //元ロット番号
            adapt.setString(10, toItemCd); //先品目コード
            adapt.setString(11, toLotNo); //先ロット番号
            adapt.setString(12, lotTraceTyp); //区分
            adapt.setOutString(13); //処理結果（エラーコード)
            adapt.setOutInteger(14); //処理結果（結果ステータス）

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(14);
        
            //処理結果の格納
            for(int i =13 ; i< 14 ; i++){
                if(adapt.getOutString(i) == null){
                    resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * ロット別品目在庫登録・更新処理  <BR>
     *
     * @param  rcvIssueCtrlCd  入出庫管理番号
     * @param  shipQty  出荷済数量
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excUpdateLotStockFd(String rcvIssueCtrlCd,String shipQty) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, rcvIssueCtrlCd); //入出庫管理番号
            adapt.setString(9, shipQty); //出荷済数量
            adapt.setOutString(10); //処理結果（エラーコード)
            adapt.setOutInteger(11); //処理結果（結果ステータス）
        
            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(11);
            
            //処理結果の格納
            for(int i =10 ; i< 11 ; i++){
                if(adapt.getOutString(i) == null){
                    resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 出荷便設定  <BR>
     *
     * @param  companyCd  会社コード
     * @param  custCd  得意先コード
     * @param  delvCd  納品場所コード
     * @param  shipwhCd  出荷倉庫コード
     * @param  itemCd  品目番号
     * @param  transportCd  運送便コード
     * @param  custDlvPlanTransNo  得意先納入予定便番号
     * @param  inHouseShipPlanTransNo  社内出荷予定便番号
     * @param  desinatedDlvDate  指定納期
     * @param  shipPlanDate  出荷予定日
     * @return 取得結果を格納したリスト (1:運送便コード 2:得意先納入予定便番号 3:社内出荷便番号 4:納入予定日時 5:出荷予定日時 6:セット開始日時 7:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List getDlvPlanTransFd(String companyCd,String custCd,String delvCd,String shipwhCd,String itemCd,
        String transportCd,String custDlvPlanTransNo,String inHouseShipPlanTransNo,String desinatedDlvDate,String shipPlanDate,String appTyp) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, companyCd); //会社コード
            adapt.setString(9, custCd); //得意先コード
            adapt.setString(10, delvCd); //納品場所コード
            adapt.setString(11, shipwhCd); //出荷倉庫コード
            adapt.setString(12, itemCd); //品目番号
            adapt.setString(13, transportCd); //運送便コード
            adapt.setString(14, custDlvPlanTransNo); //得意先納入予定便番号
            adapt.setString(15, inHouseShipPlanTransNo); //社内出荷予定便番号
            adapt.setString(16, desinatedDlvDate); //指定納期
            adapt.setString(17, shipPlanDate); //出荷予定日
            adapt.setString(18,appTyp);			// 自動計上区分
            adapt.setOutString(19); //処理結果（運送便コード)
            adapt.setOutString(20); //処理結果（得意先納入予定便番号)
            adapt.setOutString(21); //処理結果（社内出荷便番号)
            adapt.setOutString(22); //処理結果（納入予定日時)
            adapt.setOutString(23); //処理結果（出荷予定日時)
            adapt.setOutString(24); //処理結果（セット開始日時)
            adapt.setOutString(25); //処理結果（エラーコード)
            adapt.setOutInteger(26); //処理結果（結果ステータス）
            adapt.execUpdate();

            //結果ステータスの格納

            this.resultStatus = adapt.getOutInteger(26);
            
            //処理結果の格納
            for(int i =19 ; i< 26 ; i++){
                if(adapt.getOutString(i) == null){
                    resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 在庫引当処理  <BR>
     *
     * @param  companylCd  会社コード
     * @param  odrDSeqNo  受注伝票番号
     * @param  odrDSeqNo  受注明細発生連番
     * @param  partDlvSeqNo  出荷計画分納項番
     * @param  lotNo  指定ロット番号
     * @param  itemCd  在庫品目番号
     * @param  rsvQty  引当数量
     * @param  reserveTyp  引当処理区分
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excInvAllocFd(String companylCd,String odrHNo,String odrDSeqNo,String partDlvSeqNo,String lotNo,
        String itemCd,String rsvQty,String reserveTyp) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, companylCd); //会社コード
            adapt.setString(9, odrHNo); //受注伝票番号
            adapt.setString(10, odrDSeqNo); //受注明細発生連番
            adapt.setString(11, partDlvSeqNo); //出荷計画分納項番
            adapt.setString(12, lotNo); //指定ロット番号
            adapt.setString(13, itemCd); //在庫品目番号
            adapt.setString(14, rsvQty); //引当数量
            adapt.setString(15, reserveTyp); //引当処理区分
            adapt.setOutString(16); //処理結果（エラーコード)
            adapt.setOutInteger(17); //処理結果（結果ステータス）
        
            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(17);
            
            //処理結果の格納
            for(int i =16 ; i< 17 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 出荷指示作成処理  <BR>
     *
     * @param  companylCd    会社コード
     * @param  odrHNo        受注伝票番号
     * @param  odrDSeqNo     受注明細発生連番
     * @param  partDlvSeqNo  出荷計画分納項番
     * @param  entryTyp      データ入力区分
     * @param  updateTyp     更新区分
     * @return 取得結果を格納したリスト (:エラーコード :結果ステータス *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excShipOdrEntryFd(String companylCd,String odrHNo,String odrDSeqNo,
        String partDlvSeqNo,String entryTyp, String updateTyp)throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, companylCd); //会社コード
            adapt.setString(9, odrHNo); //受注伝票番号
            adapt.setString(10, odrDSeqNo); //受注明細発生連番
            adapt.setString(11, partDlvSeqNo); //出荷計画分納項番
            adapt.setString(12, entryTyp); //データ入力区分
            adapt.setString(13, updateTyp); //更新区分
            adapt.setOutString(14); //処理結果（エラーコード)
            adapt.setOutInteger(15); //処理結果（結果ステータス）
                    
            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(15);
            
            //処理結果の格納
            for(int i =14 ; i< 15 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 出荷指示ヘッダ作成処理  <BR>
     *
     * @param  companylCd  会社コード
     * @param  entryTyp  データ入力区分
     * @param  shipDlvHNo  出荷納品伝票番号
     * @param  updateTyp  更新区分
     * @return 取得結果を格納したリスト (:出荷指示ヘッダ登録件数 :エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excShipOdrHEntryFd(String companylCd,String entryTyp,String shipDlvHNo,String updateTyp) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, companylCd); //会社コード
            adapt.setString(9, entryTyp); //データ入力区分
            adapt.setString(10, shipDlvHNo); //出荷納品伝票番号
            adapt.setString(11, updateTyp); //更新区分
            adapt.setOutString(12); //処理結果（出荷指示ヘッダ登録件数)
            adapt.setOutString(13); //処理結果（エラーコード)
            adapt.setOutInteger(14); //処理結果（結果ステータス）

        
            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(14);
            
            //処理結果の格納
            for(int i =12 ; i< 14 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 出荷実績ヘッダ作成処理  <BR>
     * @param  companyCd        会社コード
     * @param  shipDlvHNo   出荷納品伝票番号
     * @param  custCd       得意先コード
     * @param  billAddresseCd  請求先コード
     * @param  dlvLocCd         納品先コード
     * @param  shipWhCd         出荷倉庫コード
     * @param  salesDeptCd      売上計上部門コード
     * @param  custChrgPsnCd    営業担当者コード
     * @param  shipDate         出荷実績日
     * @param  orgShipDlvHNo    元出荷納品伝票番号
     * @param  modeTyp          更新区分(1:登録、2:取消、3:返品登録、4:返品修正、5:返品取消、6:返品登録(元伝無し))
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excShipHEntryFd(String companyCd,String shipDlvHNo,
                                    String custCd,String billAddresseCd,
                                    String dlvLocCd,String shipWhCd,
                                    String salesDeptCd,String custChrgPsnCd,
                                    String shipDate,String orgShipDlvHNo,String modeTyp) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode);       //LOGモード
            adapt.setString(2, this.outPutMode);    //出力モード
            adapt.setString(3, this.outPutPath);    //出力ファイルパス
            adapt.setString(4, this.outPutName);    //出力ファイル名
            adapt.setString(5, this.userCd);        //ユーザID
            adapt.setString(6, this.businessCd);    //業務名
            adapt.setString(7, this.plantCd);       //工場コード
            adapt.setString(8, companyCd);          //会社コード
            adapt.setString(9, shipDlvHNo);         //出荷納品伝票番号
            adapt.setString(10, custCd);            //得意先コード
            adapt.setString(11, billAddresseCd);    //請求先コード
            adapt.setString(12, dlvLocCd);          //納品先コード
            adapt.setString(13, shipWhCd);          //出荷倉庫コード
            adapt.setString(14, salesDeptCd);       //売上計上部門コード
            adapt.setString(15, custChrgPsnCd);     //営業担当者コード
            adapt.setString(16, shipDate);          //出荷実績日
            adapt.setString(17, orgShipDlvHNo);     //元出荷納品伝票番号
            adapt.setString(18, modeTyp);           //更新区分
            adapt.setOutString(19);                 //処理結果（エラーコード)
            adapt.setOutInteger(20);                //処理結果（結果ステータス）
        
            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(20);
            
            //処理結果の格納
            for(int i =19 ; i< 20 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 出荷実績作成処理  <BR>
     * @param  companyCd            会社コード
     * @param  shipDlvHNo       出荷納品伝票番号
     * @param  shipDlvDNo       出荷納品伝票明細番号
     * @param  custItemCd       得意先コード
     * @param  shipDate             出荷実績日
     * @param  itemCd           品目番号
     * @param  custShipQty          得意先実績数量
     * @param  shipQty              実績数量
     * @param  shipUnitCd       出荷単位
     * @param  unitCd           計量単位
     * @param  shipUnitPrice        単価
     * @param  remarks              備考
     * @param  procTyp              処理区分
     * @param  orgshipDlvHNo        元出荷納品伝票番号
     * @param  orgshipDlvDNo        元出荷納品伝票明細番号
     * @param  modeTyp              更新区分(1:登録、2:取消、3:返品登録、4:返品修正、5:返品取消、6:返品登録(元伝無し))
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excShipEntryFd(String companyCd,String shipDlvHNo,String shipDlvDNo,
                                String custCd,String shipDate,String itemCd ,String custShipQty,String shipQty,String shipUnitCd,
                                    String unitCd,String shipUnitPrice,String remarks,String procTyp,
                                    String orgshipDlvHNo,String orgshipDlvDNo,String modeTyp) 
        throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode);       //LOGモード
            adapt.setString(2, this.outPutMode);    //出力モード
            adapt.setString(3, this.outPutPath);    //出力ファイルパス
            adapt.setString(4, this.outPutName);    //出力ファイル名
            adapt.setString(5, this.userCd);        //ユーザID
            adapt.setString(6, this.businessCd);    //業務名
            adapt.setString(7, this.plantCd);       //工場コード
            adapt.setString(8, companyCd);          //会社コード
            adapt.setString(9, shipDlvHNo);         //出荷納品伝票番号
            adapt.setString(10, shipDlvDNo);        //出荷納品伝票明細番号
            adapt.setString(11, custCd);            //得意先品目番号
            adapt.setString(12, shipDate);           //得意先品目番号
            adapt.setString(13, itemCd);            //品目番号
            adapt.setString(14, custShipQty);       //得意先実績数量
            adapt.setString(15, shipQty);           //実績数量
            adapt.setString(16, shipUnitCd);        //出荷単位
            adapt.setString(17, unitCd);            //計量単位
            adapt.setString(18, shipUnitPrice);     //単価
            adapt.setString(19, remarks);           //備考
            adapt.setString(20, procTyp);           //処理区分
            adapt.setString(21, orgshipDlvHNo);     //元出荷納品伝票番号
            adapt.setString(22, orgshipDlvDNo);     //元出荷納品伝票明細番号
            adapt.setString(23, modeTyp);           //モード
            adapt.setOutString(24);                 //処理結果（エラーコード)
            adapt.setOutInteger(25);                //処理結果（結果ステータス）
        
            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(25);
            
            //処理結果の格納
            for(int i =24 ; i< 25 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 出荷実績ロット明細作成処理  <BR>
     * @param  companyCd            会社コード
     * @param  shipDlvHNo       出荷納品伝票番号
     * @param  shipDlvDNo       出荷納品伝票明細番号
     * @param  shipDate         　　出荷実績日
     * @param  shipWhcd             出荷倉庫コード
     * @param  shipItemCd       出荷品目番号
     * @param  lotNo                在庫ロット番号
     * @param  lotCustShipQty   ロット得意先実績数量
     * @param  lotShipQty       ロット実績数量
     * @param  shipUnitCd       出荷単位
     * @param  unitCd           計量単位
     * @param  shipReturnCause      出荷返品理由
     * @param  orgshipDlvHNo        元出荷納品伝票番号
     * @param  orgshipDlvDNo        元出荷納品伝票明細番号
     * @param  orgLotNo             元在庫ロット番号
     * @param  modeTyp              更新区分(1:登録 2:取消、3:返品登録、4:返品修正、5:返品取消、6: 返品登録（元伝無し))
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
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
                
        //引数チェック
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
            adapt.setString(1, this.logMode);       //LOGモード
            adapt.setString(2, this.outPutMode);    //出力モード
            adapt.setString(3, this.outPutPath);    //出力ファイルパス
            adapt.setString(4, this.outPutName);    //出力ファイル名
            adapt.setString(5, this.userCd);        //ユーザID
            adapt.setString(6, this.businessCd);    //業務名
            adapt.setString(7, this.plantCd);       //工場コード
            adapt.setString(8, companyCd);          //会社コード
            adapt.setString(9, shipDlvHNo);         //出荷納品伝票番号
            adapt.setString(10, shipDlvDNo);        //出荷納品伝票明細番号
            adapt.setString(11, shipDate);          //出荷実績日
            adapt.setString(12, shipWhcd);          //出荷倉庫コード
            adapt.setString(13, shipItemCd);        //出荷品目番号
            adapt.setString(14, lotNo);             //在庫ロット番号
            adapt.setString(15, lotCustShipQty);    //ロット得意先実績数量
            adapt.setString(16, lotShipQty);        //ロット実績数量
            adapt.setString(17, shipunitCd);        //出荷単位
            adapt.setString(18, unitCd);            //計量単位
            adapt.setString(19, shipReturnCause);   //返品理由
            adapt.setString(20, orgshipDlvHNo);     //元出荷納品伝票番号
            adapt.setString(21, orgshipDlvDNo);     //元出荷納品伝票明細番号
            adapt.setString(22, orgLotNo);          //元在庫ロット番号
            adapt.setString(23, modeTyp);           //更新区分
            adapt.setOutString(24);                 //処理結果（エラーコード)
            adapt.setOutInteger(25);                //処理結果（結果ステータス）
        
            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(25);
            
            //処理結果の格納
            for(int i =24 ; i< 25 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 受注ヘッダエラーチェック処理 <BR>
     * @param  oredrHeader            	受注ヘッダ作成格納用変数
     * @param  
     * @return 受注ヘッダ作成格納用変数
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public OrderHeader checkOrderHFd(OrderHeader orderHeader) 
        throws FoundationException {
                
        //引数チェック
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
        	// 明細情報にはnullを設定
        	_orderHeader.orderLines(null);
        }catch (Exception  e){
        	e.printStackTrace();
        }
        return _orderHeader;
    }
    
    /**
     * 受注明細エラーチェック処理 <BR>
     * @param  OrderLine            	受注明細作成格納用変数
     * @param  
     * @return 受注明細作成格納用変数
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public OrderLine checkOrderDEntryFd(OrderLine orderLine) 
        throws FoundationException {
                
        //引数チェック
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.resultStatus = null;
        this.messageId =null;
        try {
        	// 明細作成部品を確認で呼ぶ     	
        	orderLine = callOrderDEntryFd(orderLine,OrderLine.EXC_DIV_VAL);
			
			// メッセージIDの設定
        	this.messageId=this.messageIdLine;
			
        }catch (Exception  e){
        	e.printStackTrace();
        }
        return orderLine;
    }
    
    /**
     * 受注エラーチェック処理 <BR>
     * @param  oredrHeader            	受注ヘッダ作成格納用変数
     * @param  
     * @return 受注ヘッダ作成格納用変数
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public OrderHeader valOrderHEntryFd(OrderHeader orderHeader) 
        throws FoundationException {
                
        //引数チェック
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        
        try {
        	_orderHeader = orderHeader;
        	
        	// 実行処理を行う
        	if (!callkOrderHEntryFd(OrderHeader.EXC_DIV_VAL)){
        		this.resultStatus = STATUS_ERROR;
        		return _orderHeader;
        	}
            
            // 実行区分が1(確認)の場合は最後に受注明細作成処理を行う
    		// 受注明細作成で失敗した場合は処理を抜ける
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
     * 受注作成処理 <BR>
     * @param  oredrHeader            	受注ヘッダ作成格納用変数
     * @param  
     * @return 受注ヘッダ作成格納用変数
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public OrderHeader excOrderHEntryFd(OrderHeader orderHeader) 
        throws FoundationException {
                
        //引数チェック
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        
        try {
        	_orderHeader = orderHeader;
        	
        	// チェックヘッダ既定値を取得するためチェックを通す
        	if (!callkOrderHEntryFd(OrderHeader.EXC_DIV_VAL)){
        		this.resultStatus = STATUS_ERROR;
        		return _orderHeader;
        	}
        	
			
        	// 処理区分1(登録の場合)は受注伝票番号を採番する
			if( OrderHeader.PROC_DIV_REG.equals(orderHeader.procDiv())){
				String orderHno =getOrderHNo();
				if (orderHno == null){
					this.messageId ="KQ20101";
					this.resultStatus = STATUS_ERROR;
					return _orderHeader;
				}
				_orderHeader.orderHNo(orderHno);
			}

			//　先に受注明細作成処理を行う
    		if (!excOrderLine(OrderLine.EXC_DIV_EXC)){
    			this.resultStatus = STATUS_ERROR;
    			return _orderHeader;
    		}
        	
        	// ヘッダ作成処理を行う
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
     * 出荷用在庫_入出庫更新  <BR>
     * @param  odrHNo           受注伝票番号
     * @param  odrDSeqNo            受注明細発生連番
     * @param  partDlvSeqNo         出荷計画分納項番
     * @param  rcvIssueCtrlCd   入出庫管理番号
     * @param  shipCompleteFlg      出荷済フラグ
     * @param  procTyp              処理区分(1:出荷、2:返品)
     * @return 取得結果を格納したリスト (1:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excUpdateReservationFd(String odrHNo,String odrDSeqNo,String partDlvSeqNo,
        String rcvIssueCtrlCd,String shipCompleteFlg,String procTyp) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8,odrHNo); //受注伝票番号
            adapt.setString(9, odrDSeqNo); //受注明細発生連番
            adapt.setString(10, partDlvSeqNo); //出荷計画分納項番
            adapt.setString(11, rcvIssueCtrlCd); //入出庫管理番号
            adapt.setString(12, shipCompleteFlg); //出荷済フラグ
            adapt.setString(13, procTyp); //出荷済フラグ
            adapt.setOutString(14); //処理結果（エラーコード)
            adapt.setOutInteger(15); //処理結果（結果ステータス）

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(15);
        
            //処理結果の格納
            for(int i =14 ; i< 15 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
	 * 在庫ロット採番処理  <BR>
	 *
	 * @param  itemCd  品目番号
	 * @param  prdCmpltDate  受入日付/製造日付
	 * @return 取得結果を格納したリスト (:在庫ロット番号 :エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public List getsetLotNumberingFd(String itemCd,String prdCmpltDate) throws FoundationException {
				
		//引数チェック
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
			adapt.setString(1, this.logMode); //LOGモード
			adapt.setString(2, this.outPutMode); //出力モード
			adapt.setString(3, this.outPutPath); //出力ファイルパス
			adapt.setString(4, this.outPutName); //出力ファイル名
			adapt.setString(5, this.userCd); //ユーザID
			adapt.setString(6, this.businessCd); //業務名
			adapt.setString(7, this.plantCd); //工場コード
			adapt.setString(8, itemCd); //品目番号
			adapt.setString(9, prdCmpltDate); //受入日付/製造日付
			adapt.setOutString(10); //処理結果（在庫ロット番号)
			adapt.setOutString(11); //処理結果（エラーコード)
			adapt.setOutInteger(12); //処理結果（結果ステータス）

			adapt.execUpdate();

			//結果ステータスの格納
			this.resultStatus = adapt.getOutInteger(12);
			
			//処理結果の格納
			for(int i =10 ; i< 12 ; i++)
			if(adapt.getOutString(i) == null){
				resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 賞味期限自動計算  <BR>
     *
     * @param  itemCd  品目番号
     * @param  prdCmpltDate  受入日付/製造日付
     * @return 取得結果を格納したリスト (:賞味期限 :エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List calcBestBeforeFd(String itemCd,String prdCmpltDate) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); //LOGモード
            adapt.setString(2, this.outPutMode); //出力モード
            adapt.setString(3, this.outPutPath); //出力ファイルパス
            adapt.setString(4, this.outPutName); //出力ファイル名
            adapt.setString(5, this.userCd); //ユーザID
            adapt.setString(6, this.businessCd); //業務名
            adapt.setString(7, this.plantCd); //工場コード
            adapt.setString(8, itemCd); //品目番号
            adapt.setString(9, prdCmpltDate); //受入日付/製造日付
            adapt.setOutString(10); //処理結果（賞味期限)
            adapt.setOutString(11); //処理結果（エラーコード)
            adapt.setOutInteger(12); //処理結果（結果ステータス）

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(12);
            
            //処理結果の格納
            for(int i =10 ; i< 12 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 販売管理初期処理  <BR>
     *
     * @param 　
     * @param  
     * @return 取得結果を格納したリスト (: :エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List InitSalesProcFd() throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); 		// LOGモード
            adapt.setString(2, this.outPutMode); 	// 出力モード
            adapt.setString(3, this.outPutPath); 	// 出力ファイルパス
            adapt.setString(4, this.outPutName); 	// 出力ファイル名
            adapt.setString(5, this.userCd); 		// ユーザID
            adapt.setString(6, this.businessCd); 	// 業務名
            adapt.setString(7, this.plantCd); 		// 工場コード
            adapt.setOutString(5); 					// 処理結果（ユーザID)
            adapt.setOutString(8); 					// 処理結果（会社コード)
            adapt.setOutString(9); 					// 処理結果（販売管理用工場コード)
            adapt.setOutString(10); 				// 処理結果（部門コード)
            adapt.setOutString(11); 				// 処理結果（部門名)
            adapt.setOutString(12); 				// 処理結果（ユーザ名)
            adapt.setOutString(13); 				// 処理結果（業務運用日)
            adapt.setOutString(14); 				// 処理結果（邦貨コード)
            adapt.setOutString(15); 				// 処理結果（エラーコード)
            adapt.setOutInteger(16); 				// 処理結果（結果ステータス）

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(16);
            if(adapt.getOutString(5) == null){
            	resultList.add("");    //処理結果がNULLであった場合空白をセット
            }else{
            	resultList.add(adapt.getOutString(5));	
            }
             
            //処理結果の格納
            for(int i =8 ; i< 16 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     * 売掛IF処理処理  <BR>
     *
     * @param  procDiv		処理区分(1:出荷実績/出荷返品、2:受領・売上/受領・売上(返品)、3:その他売上
     * @param  updDiv		更新区分(1:登録、2:取消、3:修正)
     * @param  SlipCd		伝票番号(出荷納品伝票番号、出荷納品・その他売上伝票番号)
     * @return 取得結果を格納したリスト (: :エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excArfIFFd(int procDiv, int updDiv, String SlipCd) throws FoundationException {
                
        //引数チェック
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
            adapt.setString(1, this.logMode); 		// LOGモード
            adapt.setString(2, this.outPutMode); 	// 出力モード
            adapt.setString(3, this.outPutPath); 	// 出力ファイルパス
            adapt.setString(4, this.outPutName); 	// 出力ファイル名
            adapt.setString(5, this.userCd); 		// ユーザID
            adapt.setString(6, this.businessCd); 	// 業務名
            adapt.setString(7, this.plantCd); 		// 工場コード
            adapt.setString(8, SlipCd); 			// 伝票番号
            adapt.setInt(9, procDiv); 				// 処理区分
            adapt.setInt(10,updDiv); 				// 更新区分
            adapt.setOutString(11); 				// 処理結果（エラーコード)
            adapt.setOutInteger(12); 				// 処理結果（結果ステータス）

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(12);
            if(adapt.getOutString(11) == null){
            	resultList.add("");    //処理結果がNULLであった場合空白をセット
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
     *** プライベート関数
     *********************************************************************/
    
    /**
     * IDbAdapterの返却
     *
     * @param  conn IDbConnection
     * @return  collectKeyによりIDbAdapterを取得
     * @throws FoundationException
     */
    private IDbAdapter getAdapt(IDbConnection conn) throws FoundationException {

        //collectKeyによりSP部品の呼び出しを切り分ける
        switch (this.collectKey) {
            case EXCUPDATEITEMSTOCKFD:      //在庫、入出庫更新
                return conn.getSpAdapter("begin SQLEXCUPDATEITEMSTOCKFD(?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCMAKELOTTRACEFD:         //ロットトレース登録・更新処理
                return conn.getSpAdapter("begin SQLEXCMAKELOTTRACEFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCUPDATELOTSTOCKFD:       //ロット別品目在庫登録・更新処理
                return conn.getSpAdapter("begin SQLEXCUPDATELOTSTOCKFD(?,?,?,?,?,?,?,?,?,?,?); end;");
            case GETDLVPLANTRANSFD:         //出荷便設定
                return conn.getSpAdapter("begin SQLGETDLVPLANTRANSFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCINVALLOCFD:             //在庫引当処理
                return conn.getSpAdapter("begin SQLEXCINVALLOCFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCSHIPODRENTRYFD:         //出荷指示作成処理
                return conn.getSpAdapter("begin SQLEXCSHIPODRENTRYFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCSHIPODRHENTRYFD:        //出荷指示ヘッダ作成処理
                return conn.getSpAdapter("begin SQLEXCSHIPODRHENTRYFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case EXCSHIPHENTRYFD:           //出荷実績ヘッダ作成処理
                return conn.getSpAdapter("begin SQLEXCSHIPHENTRYFD(?,?,?,?,?," +
                                                                     "?,?,?,?,?," +
                                                                     "?,?,?,?,?," +
                                                                     "?,?,?,?,?); end;");
            case EXCSHIPENTRYFD:            //出荷実績作成処理
                return conn.getSpAdapter("begin SQLEXCSHIPENTRYFD(?,?,?,?,?," +
                                                                   "?,?,?,?,?," +
                                                                   "?,?,?,?,?," +
                                                                   "?,?,?,?,?," +
                                                                   "?,?,?,?,?); end;");
            case EXCSHIPLOTENTRYFD:         //出荷実績ロット明細作成処理
                return conn.getSpAdapter("begin SQLEXCSHIPLOTENTRYFD(?,?,?,?,?," +
                                                                        "?,?,?,?,?," +
                                                                        "?,?,?,?,?," +
                                                                        "?,?,?,?,?," +
                                                                        "?,?,?,?,?); end;");
            case EXCUPDATERESERVATIONFD:    //出荷用在庫_入出庫更新
                return conn.getSpAdapter("begin SQLEXCUPDATERESERVATIONFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case GETSETLOTNUMBERINGFD:      //在庫ロット採番処理
                return conn.getSpAdapter("begin SQLGETSETLOTNUMBERINGFD(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case CALCBESTBEFOREFD:          //賞味期限自動計算
                return conn.getSpAdapter("begin SQLCALCBESTBEFOREFD(?,?,?,?,?,?,?,?,?,?,?,?); end;");
            case INITSALESPROCFD:          // 販売管理初期処理
                return conn.getSpAdapter("begin SQLINITSALESPROCFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?); end;");    
                
            case EXCORDERHENTRYFD:          // 受注ヘッダ作成処理
                return conn.getSpAdapter("begin SQLEXCORDERHENTRYFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?); end;");
            case EXCORDERENTRYFD:          // 受注明細作成処理
                return conn.getSpAdapter("begin SQLEXCORDERDENTRYFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?,?,?,?," +
                														"?,?,?,?,?,?,?); end;");
                
            case EXCARFIFFD:          // 売掛IF処理
                return conn.getSpAdapter("begin SQLEXCARFIFFD(?,?,?,?,?,?,?,?,?,?," +
                														"?,?); end;");
            default:
                throw new FoundationException("default", "getAdapt", "(SBM0872) 定義外のエラーが発生しました。");
        }
    }

    /**
     * プロパティファイルからのLOG出力情報取得
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
                mre.getMessage(), "(SBM0854) プロパティファイルの読み込みに失敗しました。");
            fe.setPreviousException(mre);
            throw fe;
        }
    }

    /**
     * 受注ヘッダ格納部品を使用して受注明細を作成する
     */
    private boolean excOrderLine(BigDecimal excDiv) throws FoundationException {
        	//  明細が設定されている場合のみ処理を行う
    	boolean errorFlg = false;
    	    List orderLinesList = null;
    	    orderLinesList =_orderHeader.orderLines();
    		if (orderLinesList !=null && orderLinesList.size() !=0){
    			for(int i=0; i< orderLinesList.size() ; i++) {
    				OrderLine orderLine =null;
    				
    				orderLine = (OrderLine) orderLinesList.get(i);
    				
    				// 明細情報が設定されていない場合はヘッダ情報を設定する
    				
    				if (orderLine.companyCd() == null || "".equals(orderLine.companyCd())){
        				orderLine.companyCd(_orderHeader.companyCd());				// 会社コード
    				}
    				
    				if (orderLine.autoAppType() == null || "".equals(orderLine.autoAppType())){
    					orderLine.autoAppType(_orderHeader.autoAppType());			// 実績計上区分
    				}
    				
    				if (orderLine.shipWhCd() == null || "".equals(orderLine.shipWhCd())){
        				
        				orderLine.shipWhCd(_orderHeader.shipWhCd());				// 出荷倉庫コード
    				}
    				
    				if (orderLine.scdlDlvDate() == null || "".equals(orderLine.scdlDlvDate())){
        				orderLine.scdlDlvDate(_orderHeader.desinatedDlvDate());		// 納入予定日時
    				}
    				
    				if (orderLine.shipPlanDate() == null || "".equals(orderLine.shipPlanDate())){
        				
        				orderLine.shipPlanDate(_orderHeader.desinatedShipDate());	// 出荷予定日時
    				}
    				
    				if (orderLine.custDlvPlanTransNo() == null || "".equals(orderLine.custDlvPlanTransNo())){
        				
        				orderLine.custDlvPlanTransNo(_orderHeader.custDlvPlanTransNo());	// 納入予定便番号
    				}
    				
    				if (orderLine.custOdrNo() == null || "".equals(orderLine.custOdrNo())){
        				
        				orderLine.custOdrNo(_orderHeader.custOdrNo());						// 得意先注文番号
    				}
    				
    				if (orderLine.transPortCd() == null || "".equals(orderLine.transPortCd())){
        				orderLine.transPortCd(_orderHeader.transPortCd());					// 運送便コード
    				}
    				
    				if (orderLine.errorNo() == null || "".equals(orderLine.errorNo())){
        				orderLine.errorNo(_orderHeader.errorNo());							// エラー番号
    				}
    				
    				if (orderLine.orderHNo() == null || "".equals(orderLine.orderHNo())){
    					orderLine.orderHNo(_orderHeader.orderHNo());				// 受注伝票番号
    				}
    				
    				if (orderLine.custCd() == null || "".equals(orderLine.custCd())){
    					orderLine.custCd(_orderHeader.custCd());					// 得意先コード
    				}
    				if (orderLine.dlvLocCd() == null || "".equals(orderLine.dlvLocCd())){
    					orderLine.dlvLocCd(_orderHeader.dlvLocCd());				// 納品場所コード
    				}
    				if (orderLine.slipType() == null || "".equals(orderLine.slipType())){
    					orderLine.slipType(_orderHeader.slipType());				// 伝票区分
    				}
    				if (orderLine.custOdrNo() == null || "".equals(orderLine.custOdrNo())){
    					orderLine.custOdrNo(_orderHeader.custOdrNo());				// 得意先注文番号
    				}
    				if (orderLine.custChrgOrgCd() == null || "".equals(orderLine.custChrgOrgCd())){
    					orderLine.custChrgOrgCd(_orderHeader.custChrgOrgCd());		// 営業担当者部門コード
    				}
    				if (orderLine.custChrgPsnCd() == null || "".equals(orderLine.custChrgPsnCd())){
    					orderLine.custChrgPsnCd(_orderHeader.custChrgPsnCd());		// 営業担当者コード
    				}
    				if (orderLine.acptOrgCd() == null || "".equals(orderLine.acptOrgCd())){
    					orderLine.acptOrgCd(_orderHeader.acptOrgCd());				// 発行担当者部門コード	
    				}
    				if (orderLine.acptPsnCd() == null || "".equals(orderLine.acptPsnCd())){
    					orderLine.acptPsnCd(_orderHeader.acptPsnCd());				// 発行担当者コード
    				}
    				if (orderLine.orderDate() == null || "".equals(orderLine.orderDate())){
    					orderLine.orderDate(_orderHeader.orderDate());				// 受注日
    				}
    				orderLine = callOrderDEntryFd(orderLine,excDiv);
    				orderLinesList.set(i,orderLine);
    				
    				// 受注ヘッダ作成処理」結果ステータスの判定
    				if(STATUS_ERROR.equals(this.getResultStatus())) {
    					// 結果ステータスが異常の場合は、処理終了
    					if (this.messageId == null || "".equals(this.messageId)){
    						this.messageId=this.messageIdLine;
    					}
    					errorFlg = true;
    					
    				}

    			}
    		}
    		// 明細情報を設定する
    		_orderHeader.orderLines(orderLinesList);
    		
    		// １明細でもエラーがある場合はエラーにする
    		if (errorFlg == true){
    			return false;
    		}else{
    			return true;
    		}
            
    }
    
    /**
     * 受注伝票番号を採番する
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
     * 受注ヘッダ作成部品呼び出し<BR>
     * @param  
     * @param  
     * @return 受注ヘッダ作成格納用変数
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    private boolean callkOrderHEntryFd(BigDecimal excDiv) 
        throws FoundationException {
                
        this.collectKey = EXCORDERHENTRYFD;
        
        this.resultStatus = null;
        this.messageId =null;

            
        IDbAdapter adapt = null;
        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       					// LOGモード
            adapt.setString(2, this.outPutMode);    					// 出力モード
            adapt.setString(3, this.outPutPath);    					// 出力ファイルパス
            adapt.setString(4, this.outPutName);    					// 出力ファイル名
            adapt.setString(5, this.userCd);        					// ユーザID
            adapt.setString(6, this.businessCd);    					// 業務名
            adapt.setString(7, this.plantCd);       					// 工場コード
            adapt.setString(8, _orderHeader.companyCd());      			// 会社コード
            adapt.setString(9, _orderHeader.orderHNo());         		// 受注伝票番号
            adapt.setBigDecimal(10, _orderHeader.slipType());        	// 伝票区分
            adapt.setBigDecimal(11, _orderHeader.autoAppType());    	// 自動計上区分
            adapt.setDate(12, _orderHeader.orderDate());        		// 受注日
            adapt.setString(13, _orderHeader.custCd());        			// 得意先コード
            adapt.setString(14, _orderHeader.dlvLocCd());          		// 納品場所コード
            adapt.setString(15, _orderHeader.billAddresseeCd());   		// 請求先コード
            adapt.setString(16, _orderHeader.shipWhCd());        		// 出荷倉庫コード
            adapt.setString(17, _orderHeader.transPortCd());       		// 運送便コード 
            adapt.setString(18, _orderHeader.custChrgOrgCd());     		// 営業担当者部門コード
            adapt.setString(19, _orderHeader.custChrgPsnCd());   		// 営業担当者コード
            adapt.setString(20, _orderHeader.acptOrgCd());     			// 発行担当者部門コード
            adapt.setString(21, _orderHeader.acptPsnCd());     			// 発行担当者コード
            adapt.setBigDecimal(22, _orderHeader.inputTyp());       	// 入力方法
            adapt.setDate(23, _orderHeader.desinatedDlvDate()); 		// 指定納期
            adapt.setDate(24, _orderHeader.desinatedShipDate());		// 出荷指定日
            adapt.setBigDecimal(25, _orderHeader.custDlvPlanTransNo());	// 納入予定便番号
            adapt.setString(26, _orderHeader.custOdrNo());           	// 得意先注文番号
            adapt.setString(27, _orderHeader.slipRemarks());           	// 伝票摘要
            adapt.setString(28, _orderHeader.cancelCauseCd()); 			// 取消理由コード
            adapt.setBigDecimal(29, _orderHeader.modifyCount());      	// 更新回数
            adapt.setBigDecimal(30, _orderHeader.procDiv());           	// 処理区分
            adapt.setBigDecimal(31, excDiv);           					// 実行区分
            adapt.setString(32, _orderHeader.errorNo());           		// エラー番号
            
            adapt.setOutString(9);                 	    // 処理結果（受注伝票番号)			0
            adapt.setOutString(13);                 	// 処理結果（得意先コード)			1
            adapt.setOutString(14);                 	// 処理結果（納品場所コード)		2
            adapt.setOutString(15);                 	// 処理結果（請求先コード)			3
            adapt.setOutString(16);                 	// 処理結果（出荷倉庫コード)		4
            adapt.setOutString(17);                 	// 処理結果（運送便コード)			5
            adapt.setOutString(18);                 	// 処理結果（営業担当者部門コード)	6
            adapt.setOutString(19);                 	// 処理結果（営業担当者コード)		7
            adapt.setOutString(20);                 	// 処理結果（発行担当者部門コード)	8
            adapt.setOutString(21);                 	// 処理結果（発行担当者コード)		9
            adapt.setOutDate(23); 						// 処理結果(指定納期)				10
            adapt.setOutDate(24);						// 処理結果(出荷指定日)				11 
            adapt.setOutString(33);                 	// 処理結果（得意先名)				12
            adapt.setOutString(34);                 	// 処理結果（得意先略称)			13
            adapt.setOutString(35);                 	// 処理結果（得意先担当者)			14
            adapt.setOutString(36);                 	// 処理結果（請求先名)				15
            adapt.setOutString(37);                 	// 処理結果（納品場所名)			16
            adapt.setOutString(38);                 	// 処理結果（納品場所名(カナ)		17		
            adapt.setOutString(39);                 	// 処理結果（納品場所(英名)			18
            adapt.setOutString(40);                 	// 処理結果（納品場所郵便番号)		19
            adapt.setOutString(41);                 	// 処理結果（納品場所住所1)			20
            adapt.setOutString(42);                 	// 処理結果（納品場所住所2)			21
            adapt.setOutString(43);                 	// 処理結果（納品場所住所(カナ)1	22 
            adapt.setOutString(44);                 	// 処理結果（納品場所住所(カナ)2	23
            adapt.setOutString(45);                 	// 処理結果（納品場所電話番号)		24
            adapt.setOutString(46);                 	// 処理結果（納品場所FAX番号)		25
            adapt.setOutString(47);                 	// 処理結果（出荷倉庫名)			26
            adapt.setOutString(48);                 	// 処理結果（運送便名)				27
            adapt.setOutString(49);                 	// 処理結果（営業担当者部門名)		28
            adapt.setOutString(50);                 	// 処理結果（営業担当者名)			29
            adapt.setOutString(51);                 	// 処理結果（発行担当者部門名)		30
            adapt.setOutString(52);                 	// 処理結果（発行担当者名)			31
            adapt.setOutString(53);                 	// 処理結果（通貨コード)			32
            adapt.setOutBigDecimal(54);                 // 処理結果（為替種別)				33
            adapt.setOutBigDecimal(55);                 // 処理結果（検収区分)				34	
            adapt.setOutBigDecimal(56);                 // 処理結果（本体金額)				35
            adapt.setOutBigDecimal(57);                 // 処理結果（消費税合計)			36
            adapt.setOutBigDecimal(58);                 // 処理結果（受注金額合計)			37
            adapt.setOutBigDecimal(59);					// 処理結果（請求サイクル)		    38
            adapt.setOutString(60);                 	// 処理結果（エラーコード)			39
            adapt.setOutInteger(61);                	// 処理結果（結果ステータス）		40
           
            
            adapt.execUpdate();

            // 結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(61);
            // メッセージコードを設定
            this.messageId = (adapt.getOutString(60)==null) ? "" : adapt.getOutString(60);
            
            _orderHeader.orderHNo((adapt.getOutString(9)==null) ? "" : adapt.getOutString(9));				// 処理結果（受注伝票番号)			0
            _orderHeader.custCd((adapt.getOutString(13)==null) ? "" : adapt.getOutString(13));				// 処理結果（得意先コード)			1
            _orderHeader.dlvLocCd((adapt.getOutString(14)==null) ? "" : adapt.getOutString(14));			// 処理結果（納品場所コード)		2
            _orderHeader.billAddresseeCd((adapt.getOutString(15)==null) ? "" : adapt.getOutString(15));		// 処理結果（請求先コード)			3
            _orderHeader.shipWhCd((adapt.getOutString(16)==null) ? "" : adapt.getOutString(16));			// 処理結果（出荷倉庫コード)		4
            _orderHeader.transPortCd((adapt.getOutString(17)==null) ? "" : adapt.getOutString(17));			// 処理結果（運送便コード)			5
            _orderHeader.custChrgOrgCd((adapt.getOutString(18)==null) ? "" : adapt.getOutString(18));		// 処理結果（営業担当者部門コード)	6
            _orderHeader.custChrgPsnCd((adapt.getOutString(19)==null) ? "" : adapt.getOutString(19));		// 処理結果（営業担当者コード)		7
            _orderHeader.acptOrgCd((adapt.getOutString(20)==null) ? "" : adapt.getOutString(20));			// 処理結果（発行担当者部門コード)	8
            _orderHeader.acptPsnCd((adapt.getOutString(21)==null) ? "" : adapt.getOutString(21));			// 処理結果（発行担当者コード)		9
            _orderHeader.desinatedDlvDate(adapt.getOutDate(23)); 											// 処理結果(指定納期)				10
            _orderHeader.desinatedShipDate(adapt.getOutDate(24));											// 処理結果(出荷指定日)				11
            _orderHeader.custName((adapt.getOutString(33)==null) ? "" : adapt.getOutString(33));			// 処理結果（得意先名)				12
            _orderHeader.custAName((adapt.getOutString(34)==null) ? "" : adapt.getOutString(34));			// 処理結果（得意先略称)			13
            _orderHeader.custPsn((adapt.getOutString(35)==null) ? "" : adapt.getOutString(35));				// 処理結果（得意先担当者)			14
            _orderHeader.billAddresseeName((adapt.getOutString(36)==null) ? "" : adapt.getOutString(36));	// 処理結果（請求先名)				15
            _orderHeader.dlvLocName((adapt.getOutString(37)==null) ? "" : adapt.getOutString(37));			// 処理結果（納品場所名)			16
            _orderHeader.dlvLocKName((adapt.getOutString(38)==null) ? "" : adapt.getOutString(38));			// 処理結果（納品場所名(カナ)		17		
            _orderHeader.dlvLocEName((adapt.getOutString(39)==null) ? "" : adapt.getOutString(39));			// 処理結果（納品場所(英名)			18
            _orderHeader.dlvLocZipCd((adapt.getOutString(40)==null) ? "" : adapt.getOutString(40));			// 処理結果（納品場所郵便番号)		19
            _orderHeader.dlvLocAddress1((adapt.getOutString(41)==null) ? "" : adapt.getOutString(41));		// 処理結果（納品場所住所1)			20
            _orderHeader.dlvLocAddress2((adapt.getOutString(42)==null) ? "" : adapt.getOutString(42));		// 処理結果（納品場所住所2)			21
            _orderHeader.dlvLocAddressK1((adapt.getOutString(43)==null) ? "" : adapt.getOutString(43));		// 処理結果（納品場所住所(カナ)1	22 
            _orderHeader.dlvLocAddressK2((adapt.getOutString(44)==null) ? "" : adapt.getOutString(44));		// 処理結果（納品場所住所(カナ)2	23
            _orderHeader.dlvLocTel((adapt.getOutString(45)==null) ? "" : adapt.getOutString(45));			// 処理結果（納品場所電話番号)		24
            _orderHeader.dlvLocFax((adapt.getOutString(46)==null) ? "" : adapt.getOutString(46));			// 処理結果（納品場所FAX番号)		25
            _orderHeader.shipWhName((adapt.getOutString(47)==null) ? "" : adapt.getOutString(47));			// 処理結果（出荷倉庫名)			26
            _orderHeader.transPortName((adapt.getOutString(48)==null) ? "" : adapt.getOutString(48));		// 処理結果（運送便名)				27
            _orderHeader.custChrgOrgName((adapt.getOutString(49)==null) ? "" : adapt.getOutString(49));		// 処理結果（営業担当者部門名)		28
            _orderHeader.custChrgPsnName((adapt.getOutString(50)==null) ? "" : adapt.getOutString(50));		// 処理結果（営業担当者名)			29
            _orderHeader.acptOrgName((adapt.getOutString(51)==null) ? "" : adapt.getOutString(51));			// 処理結果（発行担当者部門名)		30
            _orderHeader.acptPsnName((adapt.getOutString(52)==null) ? "" : adapt.getOutString(52));			// 処理結果（通貨コード)			31
            _orderHeader.currncyCd((adapt.getOutString(53)==null) ? "" : adapt.getOutString(53));			// 処理結果（発行担当者名)			32
            _orderHeader.exchTyp(adapt.getOutBigDecimal(54));												// 処理結果（為替種別)				33
            _orderHeader.inspcAcptTyp(adapt.getOutBigDecimal(55)); 											// 処理結果（検収区分)				34
            _orderHeader.amountSum((adapt.getOutBigDecimal(56)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(56));							// 処理結果（本体金額)				35
            _orderHeader.taxSum((adapt.getOutBigDecimal(57)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(57));							// 処理結果（消費税合計)			36
            _orderHeader.taxAmountSum((adapt.getOutBigDecimal(58)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(58)); 						// 処理結果（受注金額合計)			37
            _orderHeader.claimCycleTyp(adapt.getOutBigDecimal(59));																				// 処理結果 (検収サイクル)			38
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
    
    /** 受注明細作成部品 <BR>
    * @param  OrderLine            	受注明細作成格納用変数
    * @param  
    * @return 受注明細作成格納用変数
    * @throws FoundationException DB検索時になんらかのエラーが発生した場合
    */
   public OrderLine callOrderDEntryFd(OrderLine oredrLine,BigDecimal excDiv) 
       throws FoundationException {
               
       //引数チェック
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
           adapt.setString(1, this.logMode);       						// LOGモード
           adapt.setString(2, this.outPutMode);    						// 出力モード
           adapt.setString(3, this.outPutPath);    						// 出力ファイルパス
           adapt.setString(4, this.outPutName);    						// 出力ファイル名
           adapt.setString(5, this.userCd);        						// ユーザID
           adapt.setString(6, this.businessCd);    						// 業務名
           adapt.setString(7, this.plantCd);       						// 工場コード
           adapt.setString(8, oredrLine.companyCd());      				// 会社コード
           adapt.setString(9, oredrLine.orderHNo());         			// 受注伝票番号
           adapt.setBigDecimal(10, oredrLine.lineNo());         		// 受注明細行番号 
           adapt.setBigDecimal(11, oredrLine.seqNo());         			// 受注明細発生連番 
           adapt.setBigDecimal(12, oredrLine.slipType());        		// 伝票区分
           adapt.setBigDecimal(13, oredrLine.autoAppType());    		// 自動計上区分
           adapt.setString(14, oredrLine.custOdrNo());         			// 得意先注文番号
           adapt.setString(15, oredrLine.custChrgOrgCd());     			// 営業担当者部門コード
           adapt.setString(16, oredrLine.custChrgPsnCd());   			// 営業担当者コード
           adapt.setString(17, oredrLine.acptOrgCd());     				// 発行担当者部門コード
           adapt.setString(18, oredrLine.acptPsnCd());     				// 発行担当者コード
           adapt.setString(19, oredrLine.custCd());        				// 得意先コード
           adapt.setString(20, oredrLine.dlvLocCd());          			// 納品場所コード
           adapt.setString(21, oredrLine.shipWhCd());        			// 出荷倉庫コード
           adapt.setString(22, oredrLine.itemCd());        				// 品目番号
           adapt.setBigDecimal(23, oredrLine.transType());    			// 取引区分
           adapt.setString(24, oredrLine.cancelCauseCd());    			// 明細取消理由コード
           adapt.setBigDecimal(25, oredrLine.custDlvPlanTransNo()); 	// 納入予定便番号
           adapt.setBigDecimal(26, oredrLine.inHouseShipPlanTransNo()); // 社内出荷予定便番号
           adapt.setBigDecimal(27, oredrLine.orderUnitPrice()); 		// 受注単価
           adapt.setDate(28, oredrLine.scdlDlvDate()); 					// 納入予定日
           adapt.setDate(29, oredrLine.shipPlanDate ());   				// 出荷予定日
           adapt.setBigDecimal(30, oredrLine.orderQty());    			// 受注数量
           
           adapt.setString(31, oredrLine.orderUnitCd());    			// 受注単位
           
           adapt.setString(32, oredrLine.transPortCd());    			// 運送便コード
           adapt.setString(33, oredrLine.lotNo());    					// 指定ロット
           adapt.setString(34, oredrLine.remarks());    				// 備考
           adapt.setDate(35, oredrLine.orderDate ());  					// 受注日
           adapt.setBigDecimal(36, oredrLine.ifCtlNo());    			// IF情報管理番号
           adapt.setBigDecimal(37, oredrLine.orderSqe());    			// 注文項番
           adapt.setBigDecimal(38, oredrLine.entryType());    			// データ入力区分
           adapt.setBigDecimal(39, oredrLine.modifyCount());    		// 更新回数
           adapt.setBigDecimal(40, oredrLine.procDiv());           		// 処理区分
           adapt.setBigDecimal(41, excDiv);           					// 実行区分
           adapt.setString(42,oredrLine.errorNo());						// エラー番号
         
           
           adapt.setOutString(9);                 	// 処理結果（受注伝票番号)			0
           adapt.setOutBigDecimal(10);              // 処理結果（受注明細行番号)		1
           adapt.setOutBigDecimal(11);              // 処理結果（受注明細発生連番)		2
           adapt.setOutBigDecimal(25); 				// 処理結果（納入予定便番号)		3
           adapt.setOutBigDecimal(26); 				// 処理結果（社内出荷予定便番号)	4
           adapt.setOutBigDecimal(27); 				// 処理結果（受注単価)				5
           adapt.setOutDate(28);     				// 処理結果（納入予定日)			6
           adapt.setOutDate(29);     				// 処理結果（出荷予定日)			7
           adapt.setOutString(31);    				// 処理結果（受注単位)				8
           adapt.setOutString(32);    				// 処理結果（運送便コード)			9
           
           adapt.setOutString(43);                 	// 処理結果（品目名称)				10
           adapt.setOutBigDecimal(44);              // 処理結果（受注単位数)			11
           adapt.setOutString(45);                 	// 処理結果（得意先品目番号)		12
           adapt.setOutString(46);                 	// 処理結果（得意先品目名称)		13
           adapt.setOutString(47);                 	// 処理結果（出荷倉庫名)			14
           adapt.setOutDate(48);                 	// 処理結果（セット開始日時)		15
           adapt.setOutString(49);                 	// 処理結果（運送便名)				16

           adapt.setOutBigDecimal(50);              // 処理結果（受注金額)				17
           adapt.setOutBigDecimal(51);              // 処理結果（受注金額(邦貨))		18
           adapt.setOutBigDecimal(52);              // 処理結果（消費税額)				19
           adapt.setOutBigDecimal(53);              // 処理結果（受注金額(税込))		20
           adapt.setOutBigDecimal(54);              // 処理結果（受注金額(税抜))		21
           adapt.setOutString(55);              	// 処理結果（JANコード)		        22
           adapt.setOutString(56);                 	// 処理結果（エラーコード)			23
           adapt.setOutInteger(57);                	// 処理結果（結果ステータス）		24
          
           
           adapt.execUpdate();

           // 結果ステータスの格納
           this.resultStatus = adapt.getOutInteger(57);
           // メッセージコードを設定
           this.messageIdLine = (adapt.getOutString(56)==null) ? "" : adapt.getOutString(56);
           
           oredrLine.orderHNo((adapt.getOutString(9)==null) ? "" : adapt.getOutString(9));	// 処理結果（受注伝票番号)
           oredrLine.lineNo(adapt.getOutBigDecimal(10));									// 処理結果（受注明細行番号)
           oredrLine.seqNo(adapt.getOutBigDecimal(11));										// 処理結果（受注明細発生連番)	
           oredrLine.custDlvPlanTransNo(adapt.getOutBigDecimal(25));						// 処理結果（納入予定便番号)	
           oredrLine.inHouseShipPlanTransNo(adapt.getOutBigDecimal(26));					// 処理結果（社内出荷予定便番号)	
           oredrLine.orderUnitPrice((adapt.getOutBigDecimal(27)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(27));	// 処理結果（受注単価)
           oredrLine.scdlDlvDate(adapt.getOutDate(28));										// 処理結果（納入予定日時)
           oredrLine.shipPlanDate(adapt.getOutDate(29));									// 処理結果（出荷予定日時)
           oredrLine.orderUnitCd((adapt.getOutString(31)==null) ? "" : adapt.getOutString(31));							// 処理結果（受注単位)
           oredrLine.transPortCd((adapt.getOutString(32)==null) ? "" : adapt.getOutString(32));							// 処理結果（運送便コード)
           oredrLine.itemName((adapt.getOutString(43)==null) ? "" : adapt.getOutString(43));								// 処理結果（品目名称)
           oredrLine.orderUnitQty((adapt.getOutBigDecimal(44)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(44));	// 処理結果（受注単位数)
           oredrLine.custItemCd((adapt.getOutString(45)==null) ? "" : adapt.getOutString(45));							// 処理結果（得意先品目番号)
           oredrLine.custItemName((adapt.getOutString(46)==null) ? "" : adapt.getOutString(46));						// 処理結果（得意先品目名称)
           oredrLine.shipWhName((adapt.getOutString(47)==null) ? "" : adapt.getOutString(47));							// 処理結果（出荷倉庫名)
           oredrLine.setStDate(adapt.getOutDate(48));										// 処理結果（セット開始日時)
           oredrLine.transPortName((adapt.getOutString(49)==null) ? "" : adapt.getOutString(49));						// 処理結果（運送便名)
           oredrLine.orderAmount((adapt.getOutBigDecimal(50)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(50));				// 処理結果（受注金額)			
           oredrLine.orderAmountExchRates((adapt.getOutBigDecimal(51)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(51));		// 処理結果（受注金額(邦貨)			
           oredrLine.taxAmount((adapt.getOutBigDecimal(52)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(52)); 				// 処理結果（消費税額)		
           oredrLine.orderAmountTax((adapt.getOutBigDecimal(53)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(53)); 			// 処理結果（受注金額(税込))
           oredrLine.orderAmountExcTax((adapt.getOutBigDecimal(54)==null) ? BIG_DECIMAL_ZERO : adapt.getOutBigDecimal(54)); 		// 処理結果（受注金額(税抜))
           
           oredrLine.janCode((adapt.getOutString(55)==null) ? "" : adapt.getOutString(55)); 			// JANコード
           
           
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
    *** 共通返却値
    *********************************************************************/
   
    /**
     * 処理結果ステータスの取得
     * @return  処理結果のステータスを取得(実行前、もしくはエラーで実行できなかった場合はnullを返却する）
     */
    public Integer getResultStatus() {
        return this.resultStatus;
    }
    
    /**
     * エラーメッセージコードの取得
     * @return  処理結果のステータスを取得(実行前、もしくはエラーで実行できなかった場合はnullを返却する）
     */
    public String getMessageId() {
        return this.messageId;
    }
    
}
