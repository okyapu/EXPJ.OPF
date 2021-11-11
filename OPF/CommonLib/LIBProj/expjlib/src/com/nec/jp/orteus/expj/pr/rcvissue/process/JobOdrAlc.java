/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/JobOdrAlc.java,v $
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

import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

public class JobOdrAlc {
    
	/** コネクション */
	private IDbConnection _iconn = null;
	private Connection _conn = null;

	private final static BigDecimal bdZero = new BigDecimal("0");
	
	/**
	 * <pre>
	 * コンストラクタ
	 * 指定のコネクションを持つオブジェクトを構築する
	 * </pre>
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public JobOdrAlc(IDbConnection connect){
		_iconn = connect;
		_conn = connect.getConn();
	}

	/**
	 * <pre>
	 * [製番引当]の引当済数を更新します。
	 * 
	 * 引数で指定された出庫指示情報に対応する[製番引当]の引当済数に
	 * 出庫数を加算します。
	 * 該当する[製番引当]が存在しない場合は、レコード追加します。
	 * </pre>
	 * @param iIssueInstStruct 出庫指示情報
	 * @param iIssueNo          出庫数
	 * @param iUpdInfo         ユーザ情報
	 * @throws SQLException
	 */
	public void updateAlcQty(IssueInstStruct iIssueInstStruct,
	                           BigDecimal iIssueNo,
	                           UpdateInfo iUpdInfo) 
	        throws SQLException ,FoundationException {
	    PreparedStatement psREAD=null;
	    PreparedStatement ps=null;
	    ResultSet rs=null;
	    String sql="";
	    
	    String sJOB_ODR_ALC_CD="";
	    String strOdrCd="";
	    BigDecimal dALCD_QTY = bdZero;
	    BigDecimal dISSUEED_QTY_SUM	= bdZero;
	    BigDecimal dRC = bdZero;
	    int iRC = 0;
	    BigDecimal	dISSUENO = bdZero;
	    boolean	bRC=true;
	    int	iIndex=0;
	    
	    try
	    {
	        //出庫指示情報を取得
	        IssueInstStruct stII = iIssueInstStruct;
	        dISSUENO = iIssueNo;
	        
	        // << 製番引当の検索 >>
	        sql	= " SELECT JOB_ODR_CD," +
	              "JOB_ODR_ALC_CD, JOB_ODR_DETAIL_NO, " +
	              "ITEM_CD, ALCD_QTY, ISSUEED_QTY " +
	              " FROM T_JOB_ODR_ALC " +
	              " WHERE (OD_NO=? AND ALC_STOCK_TYP=1) ";
	        psREAD = _conn.prepareStatement(sql);
	        psREAD.setString(1,	stII.m_OD_NO);
	        rs = psREAD.executeQuery();
	        if (rs.next())
	        {
	            //<< 製番引当の更新 >>
	        	// 出庫数のうちで出庫残数より多い分を"引当済数"に上乗せして更新する。
	        	// 引当済数＋（出庫数－（引当済数－出庫済数））
	        	// つまり、出庫数＋出庫済数 で"引当済数"を更新することになる。
	            sJOB_ODR_ALC_CD	= rs.getString("JOB_ODR_ALC_CD");	//製番引当管理番号
	            dALCD_QTY =	rs.getBigDecimal("ISSUEED_QTY");
	            sql	= "	UPDATE T_JOB_ODR_ALC " +
                      "SET ALCD_QTY = ? " +
	                  "WHERE JOB_ODR_ALC_CD = ? ";
	            ps = _conn.prepareStatement(sql);
	            ps.setBigDecimal(1,	dALCD_QTY.add(dISSUENO));
	            ps.setString(2,	sJOB_ODR_ALC_CD);
	            iRC	= ps.executeUpdate();
	            
	        } else {
	            //<< 製番引当の追加 >>
	            //製番引当管理番号の採番
	            Numbering ODR_CD = new Numbering(_iconn,Numbering.JOB_OD_ALC_CD ,
	                                             iUpdInfo.getUpdateBy(),
	                                             iUpdInfo.getUpdatePrgNm(),
	                                             stII.m_PLANT_CD);
	            
	            strOdrCd = ODR_CD.getNo();
	            sql	= " INSERT INTO  T_JOB_ODR_ALC ( "
	                +" JOB_ODR_ALC_CD, "
	                +" OD_NO, "
	                +" PLANT_CD, "
	                +" ITEM_CD, "
	                +" ALC_STOCK_TYP, "
	                +" JOB_ODR_CD, "
	                +" JOB_ODR_DETAIL_NO, "
	                +" ALCD_QTY, "
	                +" ISSUEED_QTY, "
	                +" ISSUE_CMPLT_FLG, "
	                +" CREATED_BY, "
	                +" CREATED_PRG_NM, "
	                +" UPDATED_BY, "
	                +" UPDATED_PRG_NM, "
	                +" MODIFY_COUNT "
	                +" ) "
	                +" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
	            iIndex = 1;
	            ps = _conn.prepareStatement(sql);
	            ps.setString(iIndex++, strOdrCd);			// 製番引当管理番号
	            ps.setString(iIndex++, stII.m_OD_NO);		// オーダデマンド番号
	            ps.setString(iIndex++, stII.m_PLANT_CD);	// 工場コード
	            ps.setString(iIndex++, stII.m_ITEM_CD);		// 品目番号
	            ps.setInt(iIndex++, 1);						// 引当在庫区分
	            ps.setNull(iIndex++, Types.VARCHAR);		// 製番
	            ps.setInt(iIndex++, 0 );					// 製番枝番
	            ps.setBigDecimal(iIndex++, dISSUENO);		// 引当済み数
	            ps.setInt(iIndex++, 0);						// 出庫済み数
	            ps.setInt(iIndex++, 0);						// 出庫完了フラグ
	            ps.setString(iIndex++, iUpdInfo.getUpdateBy()); 
	            ps.setString(iIndex++, iUpdInfo.getUpdatePrgNm()); 
	            ps.setString(iIndex++, iUpdInfo.getUpdateBy()); 
	            ps.setString(iIndex++, iUpdInfo.getUpdatePrgNm()); 
	            ps.setDouble(iIndex++, 0); 
	            iRC	= ps.executeUpdate();
	        }
	    } finally {
			if (rs != null)    { rs.close(); }
			if (ps != null)    { ps.close(); }
			if (psREAD != null){
				try{
					psREAD.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				psREAD = null;
			}
	    }
	}    
}
