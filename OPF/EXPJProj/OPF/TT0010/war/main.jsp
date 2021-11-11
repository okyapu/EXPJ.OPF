<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J"%>

<% //CoreTools関連 %>
<%@ page import="com.nec.jp.orteus.common.*" %>
<%@ page import="com.nec.jp.orteus.eo.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //foundation関連 %>
<%@ page import="com.nec.jp.orteus.xaf.foundation.*" %>
<%@ page import="com.nec.jp.orteus.xaf.common.*" %>
<%@ page import="com.nec.jp.orteus.xaf.log.*" %>
<%@ page import="com.nec.jp.orteus.xaf.wa.*" %>
<%@ page import="com.nec.jp.orteus.xaf.util.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>

<% //logging関連 logger.jar必須 %>
<%@ page import="com.nec.jp.orteus.util.logging.*" %>

<%@ page import="java.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="java.io.*" %>
<%@ page import="com.nec.jp.orteus.msg.core.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>

<%
    String locale = null;
    String charset = null;
    ResourceBundle rb = null;

    if(CoreTools.initialize()!=true) {
%>
<jsp:forward page="initerr.jsp"/>
<%
        return;
    }
%>
<%
    HttpSession so = null;
    so = request.getSession(true);
    if( so == null || so.isNew() == true ){
        // ログイン失敗時の処理
%>
<jsp:forward page="SessionTimeout.jsp"/>
<%
        return;
    }
%>
<%
    try {
        locale = (String)so.getAttribute("LOCALE");
        if ((null == locale) || (0 == locale.length())) {
            locale = CoreTools.getLocale(request.getRemoteUser());
        }
        
        so.setAttribute("DB_TYPE","ORACLE");
        MasterCash masterCash = new MasterCash(locale);
        so.setAttribute("MSG_MASTER_CASH",masterCash);
        so.setAttribute("MSG_SORTKEY", "CREATED_DATE");
        so.setAttribute("MSG_SORTORDER", "DESC");
        so.setAttribute("UserId", request.getRemoteUser());
        // 2003/07/18 m-kusunoki 追加
        so.setAttribute("MSG_USER_CD", request.getRemoteUser());
        System.out.println("UserId="+request.getRemoteUser());

        // 2004/01/22 m-kusunoki 国際化対応
        charset = CoreTools.getCharset(locale);
        rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

        response.setHeader("Content-Type", "text/html; charset=" + charset);
        response.setContentType("text/html; charset=" + charset);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="<%=charset %>">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-store">
<meta http-equiv="expires" content="0">
<meta http-equiv="cache-control" content="no-store">
<title>EXPLANNER/J Main</title>
<link rel="stylesheet" href="expj-mainscreen.css">
<script>
var wakuWindow = null;
var wakuWindowWidth = 968; // 画面枠部品を表示するウィンドウの横幅を指定する変数
var wakuWindowHeight = 684; // 画面枠部品を表示するウィンドウの縦幅を指定する変数

var userAgent = window.navigator.userAgent.toLowerCase();
if (userAgent.indexOf('edge') > -1) {
  wakuWindowWidth += 14;
  wakuWindowHeight += 122;
} else if (userAgent.indexOf('chrome') > -1) {
  if (userAgent.indexOf('windows nt 10') > -1) {
    wakuWindowWidth += 34;
    wakuWindowHeight += 179;
  } else {
    wakuWindowWidth += 14;
    wakuWindowHeight += 118;
  }
}


function setTitle(s){
  this.document.title=s;
}
function openFrameWindow(){
  window.name="mainWindow";
  wakuWindow = window.open("messageControl?MSG_PG=menu", "waku", "width=" + wakuWindowWidth + ",height=" + wakuWindowHeight + ",status=no,resizable=yes,location=no");
  wakuWindow.moveTo(window.screen.width - window.screen.availWidth, window.screen.height - window.screen.availHeight, wakuWindowWidth, wakuWindowHeight);
}
function wakuWindowCheck(){
  if(wakuWindow != null){
    wakuWindow.close();
  }
}
</script>
</head>
<body onLoad="openFrameWindow()" onUnLoad="wakuWindowCheck()">
<div id="expj-view">
  <div id="expj-logo">
    <img draggable="false" src="common/img/expj_logo.png"  style="width:260px;height:32px;vertical-align:bottom;">
  </div>
  <div id="expj-copyright">Copyright&nbsp;&copy;&nbsp;1994-2017&nbsp;NEC&nbsp;Corporation.&nbsp;All&nbsp;rights&nbsp;reserved.</div>
</div>
</body>
</html>
<%
    } catch (Exception e) {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteStream);
        e.printStackTrace(printStream);
        String error = byteStream.toString();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
        out.println("<meta http-equiv=\"Pragma\" content=\"no-store\">");
        out.println("<meta http-equiv=\"expires\" content=\"0\">");
        out.println("<meta http-equiv=\"cache-control\" content=\"no-store\">");
        out.println("<title>EXPLANNER/J</title>");
        out.println("<body>");
        
        if (e instanceof MessageApiException || e instanceof MessageControlException) {
            DisplayMessage objMessage = new DisplayMessage();
            MsgException e_tmp = (MsgException)e;
            MsgException old_tmp = e_tmp;
            while(e_tmp != null){
%>
<%=e_tmp.getMessage()%>
<%=objMessage.getMessage(e_tmp.getMessage())%>
<%
                String [] detail = e_tmp.getDetail();
                for(int i=0;detail != null && i<detail.length;i++){
                    String msg = CoreTools.getRBString("Orteus.Common.N00022", rb) + (i+1) + " : " + detail[i];
%>
<%=msg%>
<%
                }
                e_tmp = e_tmp.getNextException();
                if(e_tmp != null){
                    old_tmp = e_tmp;
                }
            }
        }
        else {
%>
<%="" + e%>
<%
        }
        out.println("<pre>" + error + "</pre>");
        out.println("</body>");
        out.println("</html>");
    }
%>