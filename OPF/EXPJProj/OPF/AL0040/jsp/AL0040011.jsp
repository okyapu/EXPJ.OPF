<%-- ********************************************************
  This file is generated
    GeneratedDate  : Sun Feb 12 12:45:22 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0040\AL0040011.html
********************************************************* --%>
<%-- ********** Generated section begin ********** --%>
<%@ page pageEncoding="MS932" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AL0040.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>

<%
    HttpSession so = request.getSession(false);
    String locale = (String)so.getAttribute("LOCALE");
    ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);
    ResourceBundle rbs = CoreTools.getResourceBundle("OrteusSysDic", locale);

    response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
    response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>

<jsp:useBean id="aAL0040010Control" class="com.nec.jp.orteus.metamorBase.AL0040.AL0040010Control" scope="request"/>
<jsp:useBean id="aAL0040010Struct" class="com.nec.jp.orteus.metamorBase.AL0040.AL0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

工程別負荷参照
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/jsp/AL0040011.jsp,v $
$Author: geng-jia $    
$Revision: 1.8 $ $Date: 2017/02/22 02:06:18 $
********************************************************* --%>
<html>
<head>
<title>工程別負荷参照</title>
<%@include file="common/expj.jsp"%>
<link rel="stylesheet" href="common/metamorbase.css">
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
  // サブ(子)画面戻るボタン押下時の処理
  function checkCancel1(frmMe)
  {
    // 確認ダイアログを表示
    if (displayConfirmMessage("ZZ07013") == false) {
        return false;
    }

    prepareSubmit();
    return true;
  }

  // グラフ移動時のチェック処理
  function checkSelGraph(frmMe)
  {
    if (isNull(frmMe.Shift_Date) == true) {
      // 移動日数がNullの場合
      addErrorMessage("ZZ05002");
      displayErrorMessages();
      return false;
    }
    if (isInteger(frmMe.Shift_Date) == false) {
      // 移動日数が数値でないの場合
      addErrorMessage("ZZ05002");
      displayErrorMessages();
      return false;
    }
  
    prepareSubmit();
    return true;
  }
  
  // グラフハイパーリンククリックの処理
  function clickHyperlink()
  {
    prepareSubmit();
    return true;
  }
</script>
<%-- ********** Generated section begin ********** --%>
<script language="javascript">
function executeSubmit(formobj) {
  return(true);
}
</script>
<meta http-equiv="X-UA-Compatible" content="IE=5" />
<script language="JavaScript" src="common/html5_message.js"></script>
<meta http-equiv="Content-Type" content="<%="text/html; charset=" + CoreTools.getCharset(locale)%>">
<%-- ********** Generated section end ********** --%>
</head>

<body onLoad="loadComplete()"><%-- ********** Generated section begin ********** --%>
<div id="expj-business-screen-AL0040010" data-noFlash="true" data-screenId="AL0040010" class="expj-noflash">
<%String nativevalue;%>
<%-- ********** Generated section end ********** --%>
<form name="header" method="post" action="AL0040010Servlet">

  <table width="968px" border="0" height="100%">
    <tr> 
      <td width="934px" align="center"> 
        <input type="hidden" name="K_PLANT_CD" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_PLANT_CD()) %>">
        <input type="hidden" name="K_NECK_PROC_CD" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_NECK_PROC_CD()) %>">
        <input type="hidden" name="K_LOAD_DATE" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_LOAD_DATE()) %>">
        <input type="hidden" name="DateFrom" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getDateFrom()) %>">
        <input type="hidden" name="DateTo" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getDateTo()) %>">
        <input type="hidden" name="S_LOAD_DATE" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getS_LOAD_DATE()) %>">
        <table border="0" width="934px" align="center">
          <tr> 
            <td><%=CoreTools.getRBString("Expj.NECK_PROC_CD",rb)%>
              <input type="text" name="L_NECK_PROC_CD" class="readonly" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getL_NECK_PROC_CD()) %>">
              &nbsp;
              <input type="text" name="L_NECK_PROC_NAME" class="readonly" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getL_NECK_PROC_NAME()) %>">
            </td>
            <td width="35%"><%=CoreTools.getRBString("Expj.NECK_PROC_CAPA_1",rb)%>
              <input type="text" name="L_NECK_PROC_CAPA" class="readonly" style="text-align:right" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getL_NECK_PROC_CAPA()) %>">
              &nbsp;
              <input type="text" name="L_NECK_PROC_CAPA_UNIT" class="readonly" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getL_NECK_PROC_CAPA_UNIT()) %>">
            </td>
          </tr>
          <tr> 
            <td colspan="2"> 
              <hr>
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr> 
      <td height="100%"> 
        <div class="center"> 
          <table width="934px" border="0">
            <tr> 
              <td> 
                <div align="center"> 
                  <jsp:include page='<%=TypeConverter.sanitizer(aAL0040010Control.getMapName()+".html")%>' flush="true"> 
                  </jsp:include>
                  <p>
                    <img usemap="#<%=TypeConverter.sanitizer(aAL0040010Control.getsysUSER_CD())%>" border="0" src="<%=TypeConverter.sanitizer(aAL0040010Control.getJpegName())%>.jpg?<%=aAL0040010Control.getJpegIdentifier()%>">
                  </p>
                </div>
              </td>
            </tr>
            <tr> 
              <td> 
                <div align="center"> 
                  <input type="image" name="Select_Prev" id="Select_Prev" value="Select_Prev" src="images/ya_left.gif" pattern="select" orteus="true" onClick="return checkSelGraph(this.form)">
                  &nbsp;&nbsp;<%=CoreTools.getRBString("Expj.Cmt0412",rb)%>
                  <input type="text" name="Shift_Date" maxlength="3" size="5" style="text-align:right" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getShift_Date()) %>">
                  &nbsp;&nbsp; 
                  <input type="image" name="Select_Next" id="Select_Next" value="Select_Next" src="images/ya_right.gif" pattern="select" orteus="true" onClick="return checkSelGraph(this.form)">
                </div>
              </td>
            </tr>
          </table>
        </div>
      </td>
    </tr>
    <tr> 
      <td width="934px" align="center"> 
        <table>
          <tr> 
            <td width="934px" align="center"> 
              <hr>
            </td>
          </tr>
          <tr> 
            <td> 
              <div align="right"> 
                <input type="submit" class="button" name="CancelSub1" value='<%=CoreTools.getRBString("Expj.BtnReturn",rb)%>' onClick="return checkCancel1()">
              </div>
            </td>
          </tr>
          <tr> 
            <td height="20%"> 
              <%
                MessageStruct msgStruct = aAL0040010Control.getMsgStruct();
              %>
              <%@ include file="common/SetServerMessage.jsp" %>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div>
<script class="expj-script-AL0040010-noflash-console-message">
function getExpjNoFlashPageConsoleMessage() {
  return '<%=messageString %>';
}
(function () {
  var message = getExpjNoFlashPageConsoleMessage();
  if (message !== '') {
    // コンソール出力
    parent.expj.common.setScreenFrameConsoleMessage(message);
  }
  parent.expj.common.controlLoadingScreen(false);
  _expj_screen_move_convert();
  
  var forms = document.getElementsByTagName('form');
  for (var formElement in forms) {
    var ele = forms[formElement];
    forms[formElement].onsubmit = function () {
      parent.expj.common.controlLoadingScreen(true);
    };
  }
})();
</script>
</body>
</html>

