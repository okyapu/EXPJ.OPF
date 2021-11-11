<%@ page pageEncoding="Windows-31J" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.security.acl.Acl"%>
<%@ page import="java.security.acl.Group"%>
<%@ page import="java.security.acl.Permission"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.util.Enumeration"%>
<%@ page import="java.util.HashSet"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page import="javax.sql.DataSource"%>
<%// @ page import="weblogic.security.acl.CachingRealm"%>
<%// @ page import="weblogic.security.acl.PermissionImpl"%>
<%// @ page import="weblogic.security.acl.Security"%>
<%// @ page import="weblogic.security.acl.User"%>

<% //CoreTools関連 %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>

<% //foundation関連 %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.log.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="com.nec.jp.orteus.xaf.util.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<%@ page import="com.nec.jp.orteus.msg.core.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="com.nec.jp.orteus.expj.util.*" %>
<% //logging関連 logger.jar必須%>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<% //JAVA関連 %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>

<%
    // ログインチェック
    ManageContainer container = CoreTools.getContainer();
    Hashtable params = CoreTools.getParamsList(request);
    HttpSession so;
    so = request.getSession(false);
    if(so == null || so.isNew() == true){
        // ログインしていない場合の処理
        out.print("<html><head></head><body><div id=\"expj-session-timeout\"></div></body></html>");
        return;
    }

//-------------------------------------------------------
// 2004/01/22 m-kusunoki 国際化対応
	String locale = (String)so.getAttribute("LOCALE");
	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

    MasterCash mstCash = null;
    mstCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
    if ( mstCash == null ){
        out.print("<html><head></head><body><div id=\"expj-session-timeout\"></div></body></html>");
        return;
    }
%>

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" >
    <% // Orteus パスワード変更 %>
    <title><%=CoreTools.getRBString("Orteus.CoreMsg.N00001", rb)%>-SecFix0603-4a-Coding</title>
    <% String jsFileName = "chkPassWord_" + locale + ".js"; %>
    <script type="text/javascript" src="<%=jsFileName%>"></script>

    <% // EJ ADD 2line %>
    <script type="text/javascript" src="common/Message_<%= locale%>.js"></script>
    <script type="text/javascript" src="common/nonflash.js"></script>
    <script type="text/javascript" src="changePassword.js"></script>

  </head>
  <body bgcolor="#FFFFFF" onLoad="focus();checkPassword();">
    <div id="expj-business-screen-PASSWORD">
    <% // さんのパスワード変更 %>
    <center>
    <font color="#003973"><b>
    <%=MessageSetForm.setText(request.getRemoteUser())%> <%=CoreTools.getRBString("Orteus.CoreMsg.N00002", rb)%>
    </font></b>
    <hr>
<%
	boolean bChange = false;
	if ( request.getParameter("passwordOld") != null && request.getParameter("passwordOld").length() != 0){
		String user = request.getRemoteUser();
		String pswdOld = request.getParameter("passwordOld");
		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();
			ss = new SqlSelect("USER_MST");
			ss.addKey("USER_CD",user);
			ss.addKey("PASSWORD",XafTools.getCryptString(pswdOld));
			ss.execute(conn);
			if(ss.getRowSize() != 1){
				%>
				<% // パスワードが違います %>
				<%=CoreTools.getRBString("Orteus.CoreMsg.E00001", rb)%>
				<%
			}
			else{
				bChange = true;
			}
		}catch(Exception e){
	        e.printStackTrace();
		}finally{
			if(ss != null ){
				ss.close();
				ss = null;
			}
			if(conn != null){
				conn.rollback();
				CoreTools.closeTransConnection(conn);
				conn=null;
			}
		}
	}
    if ( request.getParameter("password1") != null &&
         request.getParameter("password2") != null &&
		 bChange == true ){
%>
<% // パスワードを変更しました %>
<%=CoreTools.getRBString("Orteus.CoreMsg.N00003", rb)%><br>
<% // 閉じる %>
<!-- <input type="button" value="<%=CoreTools.getRBString("Orteus.Common.N00001", rb)%>" onClick="window.close();"> -->

<% // EJ CHANGE 1line %>
<input type="button" value="<%=CoreTools.getRBString("Orteus.Common.N00001", rb)%>" onClick="expj.common.closeCommonPage('PASSWORD');">

<% 
		IDbConnection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try{
			//CachingRealm realm = null;
			String userCd = request.getRemoteUser();
			String pass = request.getParameter("password1");
			String busDate = "";
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();
			//SQLインジェクション問題対応
			/////////////////////////////////////////////////////////////
			//    旧パスワード変更ロジック削除                         //
			/////////////////////////////////////////////////////////////
			//業務運用日を取得
			String dateSql = "SELECT TO_CHAR(T.BUSINESS_OPR_DATE,'YYYY/MM/DD') FROM SYS_DATE_CTRL T, USER_MST M WHERE T.PLANT_CD = M.PLANT_CD AND M.USER_CD = ?";
			pstmt = conn.getConn().prepareStatement(dateSql);
			pstmt.setString(1,userCd);
			rset = pstmt.executeQuery();
			pstmt = null;
			if (rset.next()){
				busDate = rset.getString(1);
			}
			// 新パスワード変更ロジック
			String sql="UPDATE USER_MST SET PASSWORD=?, PASSWORD_CHG_DATE=TO_DATE(?,'YYYY/MM/DD'), UPDATED_DATE = SYSDATE, UPDATED_BY = ?, UPDATED_PRG_NM = 'changePassword', MODIFY_COUNT = MODIFY_COUNT + 1 WHERE USER_CD=?";
			pstmt = conn.getConn().prepareStatement(sql);
			pstmt.setString(1, XafTools.getCryptString(pass));
			pstmt.setString(2,busDate);
			pstmt.setString(3, userCd);
			pstmt.setString(4, userCd);
			pstmt.executeUpdate();

			conn.commit();

//        User user = null;
//        realm = (CachingRealm) Security.getRealm();
//        user=realm.getUser(userCd);
//        if ( user == null ){
%>
<!--
       <% // レルムからのユーザ取得に失敗しました %>
       <font color="red"><% //=CoreTools.getRBString("Orteus.CoreMsg.E00003", rb)%></font>
-->
<%
//        }
//        realm.refresh();
		}catch(Exception e){
			e.printStackTrace();
%>
        <% // エクセプションが発生しました %>
        <font color="red"><%=CoreTools.getRBString("Orteus.CoreMsg.E00002", rb)%>:<%=e.toString()%></font>
<%
		}finally{
//        if( adapt != null ){
//		adapt.close();
//		adapt=null;
//	}
			if(pstmt != null ){
				pstmt.close();
				pstmt = null;
			}
			if(rset != null ){
				rset.close();
				rset = null;
			}
			if(conn != null){
				conn.rollback();
				CoreTools.closeTransConnection(conn);
				conn=null;
			}
		}
    }else{
%>
<%
		// 最低文字数＆英数混在チェック有無フラグ取得
		String getParameterSql = "select "
			+ "  SYS_PARAMETER.VALUE as \"VALUE\" "
			+ "from "
			+ "  SYS_PARAMETER "
			+ "where "
			+ "  SYS_PARAMETER.\"NAME\" = ? ";

		IDbConnection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String pswMinLength = "0"; // 最低文字数設定なし（デフォルト）
		String pswRule = "0"; // 英数混在チェックしない（デフォルト）

		try{
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			// 最低文字数
			pstmt = conn.getConn().prepareStatement(getParameterSql);
			pstmt.setString(1, "PSW_MIN_LENGTH");
			rset = pstmt.executeQuery();

			if (rset.next()) {
				pswMinLength = rset.getString("VALUE");
			}

			if(pstmt != null ){
				pstmt.close();
				pstmt = null;
			}
			if(rset != null ){
				rset.close();
				rset = null;
			}

			// 英数混在チェック有無フラグ
			pstmt = conn.getConn().prepareStatement(getParameterSql);
			pstmt.setString(1, "PSW_RULE");
			rset = pstmt.executeQuery();

			if (rset.next()) {
				pswRule = rset.getString("VALUE");
			}

		}catch(Exception e){
			e.printStackTrace();

		} finally {
			if(pstmt != null ){
				pstmt.close();
				pstmt = null;
			}
			if(rset != null ){
				rset.close();
				rset = null;
			}
			if(conn != null){
				conn.commit();
				CoreTools.closeTransConnection(conn);
				conn=null;
			}
		}
%>
    <form name="pswd" method="post" action="changePassword.jsp">
      <table border="1" bgcolor="#CFC7EF">
        <tr>
          <% // パスワード(旧) %>
          <td><%=CoreTools.getRBString("Orteus.CoreMsg.N00004", rb)%></td>
          <td><input type="password" size="20" name="passwordOld" maxlength="20" id="expj-business-screen-PASSWORD-passwordOld"></td>
        </tr>
        <tr>
          <% // パスワード(新規) %>
          <td><%=CoreTools.getRBString("Orteus.CoreMsg.N00005", rb)%></td>
          <td><input type="password" size="20" name="password1" maxlength="20" id="expj-business-screen-PASSWORD-password1"></td>
        </tr>
        <tr>
          <% // パスワード(確認) %>
          <td><%=CoreTools.getRBString("Orteus.CoreMsg.N00006", rb)%></td>
          <td><input type="password" size="20" name="password2" maxlength="20" id="expj-business-screen-PASSWORD-password2"></td>
        </tr>
      </table>
      <input type="hidden" size="20" name="userCd" maxlength="20" value="<%=request.getRemoteUser()%>" id="expj-business-screen-PASSWORD-userCd">
      <br>
      <hr>
      <br>
      <% // 変更 %>
      <input type="button" value="<%=CoreTools.getRBString("Orteus.CoreMsg.N00007", rb)%>" name="change" onClick="expj_submit_change_password_process('<%=pswMinLength%>', '<%=pswRule%>')" id="expj-business-screen-PASSWORD-button">
      <% // 閉じる %>
<!--      <input type="button" value="<%=CoreTools.getRBString("Orteus.Common.N00001", rb)%>" onClick="javascript:window.close();"> -->

      <% // EJ CHANGE 1line %>
      <input type="button" value="<%=CoreTools.getRBString("Orteus.Common.N00001", rb)%>" onClick="expj.common.closeCommonPage('PASSWORD');">

    </form>
<%
    }
%>
    </center>
    </div>
  </body>
</html>