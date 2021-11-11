<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

致命的エラーメッセージ出力
$Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/EJmenu/ExpjMessage.jsp,v $
$Author: n-saito $	
$Revision: 1.1 $ $Date: 2017/03/13 08:11:13 $
********************************************************* --%>

<%@ page import="com.nec.jp.orteus.util.*" %>
<%
	String locale = null;

	HttpSession so = request.getSession(false);
	if(so==null || so.isNew() == true){
		locale = CoreTools.getLocale(null);
	}
	else {
		locale = (String)so.getAttribute("LOCALE");
	}
	String charset = CoreTools.getCharset(locale);
	ResourceBundle rb = CoreTools.getResourceBundle("OrteusSysDic", locale);

	response.setHeader("Content-Type", "text/html; charset=" + charset);
	response.setContentType("text/html; charset=" + charset);
%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" >
<script type="text/javascript" src="common/Message_<%= locale%>.js"></script>
<script type="text/javascript" src="common/flash_v5.js"></script>
<script type="text/javascript" src="common/nonflash.js"></script>
 <link rel="stylesheet" href="common/metamorbase.css">
 <title>EXPLANNER/J ERROR MESSAGE</title>
<jsp:useBean id="msg" class="com.nec.jp.orteus.expj.util.ExpjMessage" scope="request"/>
<script type="text/javascript">
	function onInitializeOnLoad(){
		loadComplete();
		if(this.name.indexOf("SUBMIT") != -1){
			parent.location.href = "./ErrorMessage.jsp";
		}
	}
</script>

</head>
  
<body onLoad="onInitializeOnLoad()">
<div id="expj-business-screen-error">
<form class="expj-business-screen-error-page" style="height:100%;"> 
<table border="0" width="100%" height="100%">
<tr>
  <td>
    <table border="0" width="100%">
      <tr> 
        <td class="name" height="40">
          <div align="center">
            <font size="8" face="Arial, Helvetica, sans-serif" color="#996633">
              <b>Fatal&nbsp;Error&nbsp;Message</b>
            </font>
          </div>
        </td>
      </tr>
      <tr>
        <td><hr></td>
      </tr>
    </table>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<tr>
  <td height="100%" style="vertical-align: top;">
    <div class="center">
      <table width="100%">
        <tr> 
          <td width="50"></td>
          <td>
            <font size="5" face="Arial, Helvetica, sans-serif" color="#996633">
              <b>
                <font size="5">
                  <%= TypeConverter.sanitizer(msg.getStringMessage(locale)) %><br>
                </font>
              </b>
            </font>
          </td>
          <td></td>
        </tr>
      </table>
    </div>
  </td>
</tr>
<!----------------------------------------------------------------------------->
<tr>
  <td height="50" width="100%">
    <table height="50" width="100%">
      <tr> 
        <td height="30px"><hr></td>
      </tr>
      <tr> 
        <td height="30" align="right"> 
          <button type="button" class="button" onclick="delPage();"><%=CoreTools.getRBString("Orteus.Common.N00001", rb)%></button>
        </td>
      </tr>
    </table>
  </td>
</tr>
</table>
</form>
<!----------------------------------------------------------------------------->
</div>
<script>
if (typeof(expj) === 'undefined' || expj === null) {
  if (typeof(parent.expj) !== 'undefined' || parent.expj !== null) {
    parent.expj.common.controlLoadingScreen(false);
  }
} else {
  expj.error.viewConsole = function () {
    expj.common.setScreenFrameConsoleMessage('');
  };
}
</script>
</body>
</html>
