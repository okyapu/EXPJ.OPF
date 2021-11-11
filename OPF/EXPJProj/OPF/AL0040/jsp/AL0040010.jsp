<%-- ********************************************************
  This file is generated
    GeneratedDate  : Sun Feb 12 12:45:19 CST 2017
    JspGeneratorVer: 1.1
    HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AL0040\AL0040010.html
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

複数工程日別負荷参照
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/jsp/AL0040010.jsp,v $
$Author: geng-jia $    
$Revision: 1.11 $ $Date: 2017/02/22 02:06:18 $
********************************************************* --%>
<html>
<head>
<title>複数工程日別負荷参照</title>
<%@include file="common/expj.jsp" %>
<STYLE>
.black a:link       {COLOR:#000000;}
.black a:visited    {COLOR:#000000;}
.black a:active     {COLOR:#000000;}
</STYLE>
<link rel="stylesheet" href="common/metamorbase.css">
<script language="JavaScript" src="common/nonflash.js"></script>
<script language="JavaScript">
  // 読込ボタン押下時の処理
  function checkSelectKey(frmMe)
  {
    // 検索時のチェック
    if (isNull(frmMe.DateFrom) == true || isNull(frmMe.DateTo) == true) {
      // 期間(From), 期間(To)のいずれかがNullの場合
      addErrorMessage("ZZ01104");
    }
  
    if (isDate(frmMe.DateFrom) == false) {
      // 期間(From)が日付として正しくない場合
      addErrorMessage("AL40011");
    }
  
    if (isDate(frmMe.DateTo) == false) {
      // 期間(To)が日付として正しくない場合
      addErrorMessage("AL40012");
    }
  
    if (isNull(frmMe.DateFrom) == false && isNull(frmMe.DateTo) == false
        && isDate(frmMe.DateTo) == true && isDate(frmMe.DateFrom) == true) {
      // 期間(From), 期間(To)のいずれも日付として正しい場合
  
      // 期間の大小をチェック
      if (Date.parse(frmMe.DateFrom.value) > Date.parse(frmMe.DateTo.value)) {
        addErrorMessage("AL04001");
      }
  
      // 90日以内かをチェック
      ChangeDay = new Date(frmMe.DateFrom.value);
      Day = 24 * 60 * 60 * 1000;
      if (Date.parse(frmMe.DateTo.value) > ChangeDay.setTime(ChangeDay.getTime() + Day * 89)) {
        addErrorMessage("AL04002");
      }
    }
  
    // エラーメッセージを表示
    if (displayErrorMessages()) {
      return false;
    }
  
    prepareSubmit();
    return true;
  }
  
  // アンカークリックの処理
  function clickAnchor()
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

  <% int selectSize = 0; %>
  <% String highColor = TypeConverter.sanitizer(aAL0040010Struct.gethidden_High_Color()); %>
  <% String middColor = TypeConverter.sanitizer(aAL0040010Struct.gethidden_Midd_Color()); %>
  <% String lowColor  = TypeConverter.sanitizer(aAL0040010Struct.gethidden_Low_Color()); %>
  <table width="968px" border="0" height="100%">
    <tr> 
      <td height="30px" width="934px">
        <table border="0" width="100%" align="center">
          <tr> 
            <td width="170px"> 
              <div align="right"><b><%=CoreTools.getRBString("Expj.Cmt0029",rb)%></b></div>
            </td>
            <td width="350px"> 
              <input type="text" name="DateFrom" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getDateFrom()) %>">
              <%=CoreTools.getRBString("Expj.Cmt0043",rb)%> 
              <input type="text" name="DateTo" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getDateTo()) %>">
            </td>
            <%
              if (aAL0040010Control.getCheckNumber() == 0) {
                selectSize = 0;
              } else {
                selectSize = 1;
              }
            %>
            <td> 
              <div align="right"><%=CoreTools.getRBString("Expj.Cmt0414",rb)%></div>
            </td> 
            <td> 
            <%
              if (selectSize == 0) {
            %>
              <input type="radio" name="r_Btn" value="1">
              <%=CoreTools.getRBString("Expj.Cmt0025",rb)%><br>
              <input type="radio" name="r_Btn" value="0" checked>
              <%=CoreTools.getRBString("Expj.Cmt0024",rb)%>
            <%
              } else { 
            %>
              <input type="radio" name="r_Btn" value="1" checked>
              <%=CoreTools.getRBString("Expj.Cmt0025",rb)%><br>
              <input type="radio" name="r_Btn" value="0">
              <%=CoreTools.getRBString("Expj.Cmt0024",rb)%>
            <%
              } 
            %>
            </td>
            <td> 
              <div align="right">
                <input type="hidden" name="hidden_DateFrom" value="<%= TypeConverter.sanitizer(aAL0040010Struct.gethidden_DateFrom()) %>">
                <input type="hidden" name="hidden_DateTo" value="<%= TypeConverter.sanitizer(aAL0040010Struct.gethidden_DateTo()) %>">
                <input type="hidden" name="hidden_High_Color" value="<%= TypeConverter.sanitizer(aAL0040010Struct.gethidden_High_Color()) %>">
                <input type="hidden" name="hidden_Midd_Color" value="<%= TypeConverter.sanitizer(aAL0040010Struct.gethidden_Midd_Color()) %>">
                <input type="hidden" name="hidden_Low_Color" value="<%= TypeConverter.sanitizer(aAL0040010Struct.gethidden_Low_Color()) %>">
                <input type="submit" name="Select" value='<%=CoreTools.getRBString("Expj.BtnSelect",rb)%>' class="button" onClick="return checkSelectKey(this.form);">
              </div>
            </td>
          </tr>
          <tr> 
            <td colspan="5"> 
              <hr>
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr> 
      <td width="934px"> 
        <%
          if (aAL0040010Control.isInitialScreen()) {
        %>
        <div class="center"> 
          <table width="934px" cellspacing="0" cellpadding="0">
            <tr> 
              <td> 
                <table width="934px" cellspacing="0" cellpadding="0">
                </table>
              </td>
            </tr>
          </table>
        </div>
        <%
          } else {
        %>
        <div class="center"> 
          <table class="outer" width="7450px" cellspacing="0" cellpadding="0">
            <tr> 
              <td> 
                <%
                  int headerCount = 0; 
                %>
                <table width="100%" height="100%" cellspacing=1 cellpadding=3>
                  <%-- ********** Generated section begin ********** --%>
<%
{
  int aAL0040010StructLength = aAL0040010Control.getListsize();
  final AL0040010Struct structBackup = aAL0040010Struct;
  aAL0040010Struct = null;
  for(int loopCount = 0; loopCount < aAL0040010StructLength; ++loopCount) {
%>
<%
  if((aAL0040010Struct = (AL0040010Struct) aAL0040010Control.getListvalue(loopCount)) == null) continue;
  pageContext.setAttribute("aAL0040010Struct", aAL0040010Struct);
  String rowStyleClass=(loopCount%2==0)?"":"";
%>
<%-- ********** Generated section end ********** --%> 
                  <%
                    if (headerCount == 0) {
                  %>
                  <tr class="header"> 
                    <%
                      for (int i = 0; i < 90; ++i) {
                        if (i == 0 || i == 12 || i == 24 || i == 36 || i == 48 || i == 60 || i == 72 || i == 84) {
                    %>
                    <td nowrap><b><%=CoreTools.getRBString("Expj.NECK_PROC_CD",rb)%></b></td>
                    <%
                          if (Integer.parseInt(aAL0040010Control.getHoliDay(i)) == 1) {
                    %>
                    <td width="65px" class="holiday"> 
                      <div align="center"> <b><%= aAL0040010Control.getHeaderDay(i).substring(5, 10) %></b> 
                      </div>
                    </td>
                    <%
                          } else {
                    %>
                    <td width="65px"> 
                      <div align="center"> <b><%= aAL0040010Control.getHeaderDay(i).substring(5, 10) %></b> 
                      </div>
                    </td>
                    <%
                          }
                        } else {
                          if (Integer.parseInt(aAL0040010Control.getHoliDay(i)) == 1) {
                    %>
                    <td width="65px" class="holiday"> 
                      <div align="center"> <b><%= aAL0040010Control.getHeaderDay(i).substring(5, 10) %></b> 
                      </div>
                    </td>
                    <%
                          } else {
                    %>
                    <td width="65px"> 
                      <div align="center"> <b><%= aAL0040010Control.getHeaderDay(i).substring(5, 10) %></b> 
                      </div>
                    </td>
                    <%  
                          }  
                        } 
                      }
                    %>
                  </tr>
                  <%
                      headerCount++;
                    } else {
                      if (headerCount == 11) {
                        headerCount = 0;
                      } else {
                        headerCount++;
                      }
                    }
                  %>
                  <tr class="<%=rowStyleClass%>"> 
                    <%
                      if (aAL0040010Struct == null) {
                          continue;
                      } else {
                        for (int j = 0; j < 90; ++j) {
                          if (j == 0 || j == 12 || j == 24 || j == 36 || j == 48 || j == 60 || j == 72 || j == 84) {
                    %>
                    <td class="header" nowrap>
                      <%= TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_NAME()) %></orlabel> 
                      <input type="hidden" name="NECK_PROC_CD" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_CD()) %>">
                    </td>
                    <% 
                          } 
                          //if (Integer.parseInt(aAL0040010Control.getLOAD_QTY(j, loopCount)) > aAL0040010Control.getHighLoad()) {
                          java.math.BigDecimal bigdecimalLoadRatio = new java.math.BigDecimal(aAL0040010Control.getLOAD_QTY(j, loopCount));
                          if (bigdecimalLoadRatio.compareTo(java.math.BigDecimal.valueOf((long)aAL0040010Control.getHighLoad())) > 0) {
                    %>
                    <td width="65px" bgcolor="<%=highColor%>" class="black"> 
                    <%
                            if (aAL0040010Control.isSimulation() && Integer.parseInt(aAL0040010Control.getFlg(j, loopCount)) == 1) {
                    %>
                      <div align="center" style="border:3px solid gray">
                        <a href="AL0040010Servlet?KFromDay=<%=aAL0040010Control.getKFromDay()%>&KToDay=<%=aAL0040010Control.getKToDay()%>&HeaderDay=<%=aAL0040010Control.getHeaderDay(j)%>&NeckProcCd=<%=TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_CD())%>" name="SelectNeckCD" value="SelectNeckCD" class="button" onClick="return clickAnchor()">
                          <%= aAL0040010Control.getLOAD_QTY(j, loopCount) %> 
                        </a>
                      </div>
                    <%          
                            } else {
                    %>
                      <div align="center">
                        <a href="AL0040010Servlet?KFromDay=<%=aAL0040010Control.getKFromDay()%>&KToDay=<%=aAL0040010Control.getKToDay()%>&HeaderDay=<%=aAL0040010Control.getHeaderDay(j)%>&NeckProcCd=<%=TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_CD())%>" name="SelectNeckCD" value="SelectNeckCD" class="button" onClick="return clickAnchor()"> 
                          <%= aAL0040010Control.getLOAD_QTY(j, loopCount) %>
                        </a> 
                      </div>
                    <%
                            }
                    %>
                    </td>
                    <%
                          //} else if (Integer.parseInt(aAL0040010Control.getLOAD_QTY(j, loopCount)) >= aAL0040010Control.getLowLoad()
                          //    && Integer.parseInt(aAL0040010Control.getLOAD_QTY(j, loopCount)) <= aAL0040010Control.getHighLoad()) {
                          } else if (bigdecimalLoadRatio.compareTo(java.math.BigDecimal.valueOf((long)aAL0040010Control.getLowLoad())) >= 0
                              && bigdecimalLoadRatio.compareTo(java.math.BigDecimal.valueOf((long)aAL0040010Control.getHighLoad())) <= 0) {
                    %>
                    <td width="65px" bgcolor="<%= middColor %>" class="black"> 
                    <%
                            if (aAL0040010Control.isSimulation() && Integer.parseInt(aAL0040010Control.getFlg(j, loopCount)) == 1) {
                    %>
                      <div align="center" style="border:3px solid gray">
                        <a href="AL0040010Servlet?KFromDay=<%=aAL0040010Control.getKFromDay()%>&KToDay=<%=aAL0040010Control.getKToDay()%>&HeaderDay=<%=aAL0040010Control.getHeaderDay(j)%>&NeckProcCd=<%=TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_CD())%>" name="SelectNeckCD" value="SelectNeckCD" class="button" onClick="return clickAnchor()">
                          <%= aAL0040010Control.getLOAD_QTY(j, loopCount) %> 
                        </a>
                      </div>
                    <%
                            } else {
                    %>
                      <div align="center">
                        <a href="AL0040010Servlet?KFromDay=<%=aAL0040010Control.getKFromDay()%>&KToDay=<%=aAL0040010Control.getKToDay()%>&HeaderDay=<%=aAL0040010Control.getHeaderDay(j)%>&NeckProcCd=<%=TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_CD())%>" name="SelectNeckCD" value="SelectNeckCD" class="button" onClick="return clickAnchor()"> 
                          <%= aAL0040010Control.getLOAD_QTY(j, loopCount) %>
                        </a> 
                      </div>
                    <%
                            }
                    %>
                    </td>
                    <%
                          //} else if (Integer.parseInt(aAL0040010Control.getLOAD_QTY(j, loopCount)) < aAL0040010Control.getLowLoad()
                          //    && Integer.parseInt(aAL0040010Control.getLOAD_QTY(j, loopCount)) > 0) {
                          } else if (bigdecimalLoadRatio.compareTo(java.math.BigDecimal.valueOf((long)aAL0040010Control.getLowLoad())) < 0
                              && bigdecimalLoadRatio.compareTo(java.math.BigDecimal.valueOf(0)) > 0) {
                    %>
                    <td width="65px" bgcolor="<%=lowColor%>" class="black"> 
                    <%
                            if (aAL0040010Control.isSimulation() && Integer.parseInt(aAL0040010Control.getFlg(j, loopCount)) == 1) {
                    %>
                      <div align="center" style="border:3px solid gray">
                        <a href="AL0040010Servlet?KFromDay=<%=aAL0040010Control.getKFromDay()%>&KToDay=<%=aAL0040010Control.getKToDay()%>&HeaderDay=<%=aAL0040010Control.getHeaderDay(j) %>&NeckProcCd=<%=TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_CD())%>" name="SelectNeckCD" value="SelectNeckCD" class="button" onClick="return clickAnchor()">
                          <%= aAL0040010Control.getLOAD_QTY(j, loopCount) %> 
                        </a>
                      </div>
                    <%
                            } else {
                    %>
                      <div align="center">
                        <a href="AL0040010Servlet?KFromDay=<%=aAL0040010Control.getKFromDay()%>&KToDay=<%=aAL0040010Control.getKToDay()%>&HeaderDay=<%=aAL0040010Control.getHeaderDay(j) %>&NeckProcCd=<%=TypeConverter.sanitizer(aAL0040010Struct.getNECK_PROC_CD())%>" name="SelectNeckCD" value="SelectNeckCD" class="button" onClick="return clickAnchor()"> 
                          <%= aAL0040010Control.getLOAD_QTY(j,loopCount) %>
                        </a> 
                      </div>
                    <%
                            }
                    %>
                    </td>
                    <%
                          } else {
                    %>
                    <td width="65px" bgcolor="FFFFCC">&nbsp; </td>
                    <%
                          }
                        }
                      }
                    %>
                  </tr>
                  <%-- ********** Generated section begin ********** --%>
<%
  }
  aAL0040010Struct = structBackup;
}
%>
<%-- ********** Generated section end ********** --%> 
                </table>
              </td>
            </tr>
          </table>
        </div>
        <%
          }
        %>
      </td>
    </tr>
    <tr> 
      <td height="40px" width="934px"> 
        <table width="934px">
          <tr> 
            <td> 
              <hr>
            </td>
          </tr>
          <tr> 
            <td> 
              <div align="right"> 
                <input type="hidden" name="K_PLANT_CD" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_PLANT_CD()) %>">
                <input type="hidden" name="K_NECK_PROC_CD" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_NECK_PROC_CD()) %>">
                <input type="hidden" name="K_LOAD_DATE" value="<%= TypeConverter.sanitizer(aAL0040010Struct.getK_LOAD_DATE()) %>">
                <input type="submit" name="Clear" value='<%=CoreTools.getRBString("Expj.BtnClear",rb)%>' class="button" onClick="return clearPage();">
                <input type="button" name="Close" value='<%=CoreTools.getRBString("Expj.BtnClose",rb)%>' class="button" onClick="return delPage();">
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

