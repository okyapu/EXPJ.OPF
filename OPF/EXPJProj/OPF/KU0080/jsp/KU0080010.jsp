<%-- ***
This file is generated
 GeneratedDate  : Fri Feb 17 09:31:04 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0080\KU0080010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0080.*" %>
<%@ page import="com.nec.jp.orteus.util.*" %>
<%@ page import="com.nec.jp.orteus.msg.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
 HttpSession so = request.getSession(false);
 String locale = (String)so.getAttribute("LOCALE");
 ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic", locale);
 ResourceBundle rbs = CoreTools.getResourceBundle("OrteusSysDic", locale);
 response.setHeader("Content-Type", "text/html; charset=" + CoreTools.getCharset(locale));
 response.setContentType("text/html; charset=" + CoreTools.getCharset(locale));
%>
<jsp:useBean id="aKU0080010Control" class="com.nec.jp.orteus.metamorBase.KU0080.KU0080010Control" scope="request"/>
<jsp:useBean id="aKU0080010Struct" class="com.nec.jp.orteus.metamorBase.KU0080.KU0080010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷インボイスメンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0080/jsp/KU0080010.jsp,v $
$Author: geng-jia $	
$Revision: 1.3 $　$Date: 2017/02/22 02:07:30 $
********************************************************* --%>
<html>
<head>
<title>出荷インボイスメンテナンス</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("KU0100010Servlet", so);
%>

<%-- ********** Generated section begin ********** --%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%
 //For DETAIL
 String detailId = null;
 String detailFloat = null;
 int detailWidth = -1;
 int detailHeight = -1;
 String detailViewId = null;
 StringBuffer detailViewHeaderData = null;
 StringBuffer detailViewBodyData = null;
 String detailViewSelect = null;
 String detailViewResize = null;
 String detailViewScroll = null;
 //For TREE
 String treeId = null;
 String treeXmlData = null;
 //For VIEW
 List viewIdList = new ArrayList();
 List viewHeaderDataList = new ArrayList();
 List viewBodyDataList = new ArrayList();
 List viewSelectList = new ArrayList();
 List viewResizeList = new ArrayList();
 List viewScrollList = new ArrayList();
 Map viewSelectEvent = new HashMap();
 Map treeClickEvent = new HashMap();
%>
<script class="expj-script-KU0080010_init">
  // KU0080010名前空間
  expj.KU0080010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KU0080010" data-screen="KU0080010" data-newdata="<%=aKU0080010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
			  <script class="expj-script-KU0080010-KU0080010form1">
expj.KU0080010.KU0080010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7"
expj.KU0080010.KU0080010form1.onLoad0 = function () {
  console.log('KU0080010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
};
// script2="onDecision;0;CHKRQ;A@*1,*0"
expj.KU0080010.KU0080010form1.onDecision0 = function () {
  console.log('KU0080010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KU0080010', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;?KU0080010form1/*[eq]NORMAL[and]?KU0080010form1/IN_SHIP_INVOICE_CTL_NO[eq]SAME@*8,*9"
expj.KU0080010.KU0080010form1.onDecision1 = function () {
  console.log('KU0080010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/IN_SHIP_INVOICE_CTL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script4="onDecision;2;CHK;<%= aKU0080010Struct.getPRINT_FLG()%>[eq]1[and]?KU0080010form1/*[eq]NORMAL[and]?KU0080010form1/IN_SHIP_INVOICE_CTL_NO[eq]SAME@*7,*6"
expj.KU0080010.KU0080010form1.onDecision2 = function () {
  console.log('KU0080010form1 script4');
if (expj.common.pscript.evaluate('<%= aKU0080010Struct.getPRINT_FLG()%>', '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/IN_SHIP_INVOICE_CTL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script5="onDecision;3;CHK;<%= aKU0080010Struct.getPRINT_FLG()%>[eq]0[and]?KU0080010form1/*[eq]NORMAL[and]?KU0080010form1/IN_SHIP_INVOICE_CTL_NO[eq]SAME@*5,*4"
expj.KU0080010.KU0080010form1.onDecision3 = function () {
  console.log('KU0080010form1 script5');
if (expj.common.pscript.evaluate('<%= aKU0080010Struct.getPRINT_FLG()%>', '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/IN_SHIP_INVOICE_CTL_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onDecision;4;CHK;<%= aKU0080010Struct.getjump_flag()%>[eq]1@*10,*2"
expj.KU0080010.KU0080010form1.onDecision4 = function () {
  console.log('KU0080010form1 script6');
if (expj.common.pscript.evaluate('<%= aKU0080010Struct.getjump_flag()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="onDecision;5;CHK;<%= aKU0080010Struct.getjump_flag()%>[eq]1@*11,*12"
expj.KU0080010.KU0080010form1.onDecision5 = function () {
  console.log('KU0080010form1 script7');
if (expj.common.pscript.evaluate('<%= aKU0080010Struct.getjump_flag()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script8="onDecision;6;CHK;<%= aKU0080010Struct.getjump_flag()%>[eq]1@*13,*14"
expj.KU0080010.KU0080010form1.onDecision6 = function () {
  console.log('KU0080010form1 script8');
if (expj.common.pscript.evaluate('<%= aKU0080010Struct.getjump_flag()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script9="child;0;MASK;_KU0080010button1/Select"
expj.KU0080010.KU0080010form1.child0 = function () {
  console.log('KU0080010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button1/Select');
};
// script10="child;1;UNMASK;_KU0080010button1/Select"
expj.KU0080010.KU0080010form1.child1 = function () {
  console.log('KU0080010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button1/Select');
};
// script11="child;2;MASK;_KU0080010button2/Insert"
expj.KU0080010.KU0080010form1.child2 = function () {
  console.log('KU0080010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/Insert');
};
// script12="child;3;UNMASK;_KU0080010button2/Insert"
expj.KU0080010.KU0080010form1.child3 = function () {
  console.log('KU0080010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/Insert');
};
// script13="child;4;MASK;_KU0080010button2/Update,_KU0080010button2/DeleteAll"
expj.KU0080010.KU0080010form1.child4 = function () {
  console.log('KU0080010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/DeleteAll');
};
// script14="child;5;UNMASK;_KU0080010button2/Update,_KU0080010button2/DeleteAll"
expj.KU0080010.KU0080010form1.child5 = function () {
  console.log('KU0080010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/DeleteAll');
};
// script15="child;6;MASK;_KU0080010button2/Cancel"
expj.KU0080010.KU0080010form1.child6 = function () {
  console.log('KU0080010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/Cancel');
};
// script16="child;7;UNMASK;_KU0080010button2/Cancel"
expj.KU0080010.KU0080010form1.child7 = function () {
  console.log('KU0080010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/Cancel');
};
// script17="child;8;UNMASK;_KU0080010button2/GoPrint"
expj.KU0080010.KU0080010form1.child8 = function () {
  console.log('KU0080010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/GoPrint');
};
// script18="child;9;MASK;_KU0080010button2/GoPrint"
expj.KU0080010.KU0080010form1.child9 = function () {
  console.log('KU0080010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button2/GoPrint');
};
// script19="child;10;CHKRQ;B@*3,*2"
expj.KU0080010.KU0080010form1.child10 = function () {
  console.log('KU0080010form1 script19');
if (expj.common.pscript.satisfiedRequiredComponent('KU0080010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script20="child;11;MASK;_KU0080010form1/IN_SHIP_INVOICE_CTL_NO,_KU0080010form1/PeekerIN_SHIP_INVOICE_CTL_NO"
expj.KU0080010.KU0080010form1.child11 = function () {
  console.log('KU0080010form1 script20');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010form1/IN_SHIP_INVOICE_CTL_NO');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010form1/PeekerIN_SHIP_INVOICE_CTL_NO');
};
// script21="child;12;UNMASK;_KU0080010form1/IN_SHIP_INVOICE_CTL_NO,_KU0080010form1/PeekerIN_SHIP_INVOICE_CTL_NO"
expj.KU0080010.KU0080010form1.child12 = function () {
  console.log('KU0080010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010form1/IN_SHIP_INVOICE_CTL_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010form1/PeekerIN_SHIP_INVOICE_CTL_NO');
};
// script22="child;13;UNMASK;_KU0080010form2/SHIP_INVOICE_NO"
expj.KU0080010.KU0080010form1.child13 = function () {
  console.log('KU0080010form1 script22');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010form2/SHIP_INVOICE_NO');
};
// script23="child;14;MASK;_KU0080010form2/SHIP_INVOICE_NO"
expj.KU0080010.KU0080010form1.child14 = function () {
  console.log('KU0080010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010form2/SHIP_INVOICE_NO');
};
// script24="onDecision;7;CHK;<%= aKU0080010Struct.getPRINT_FLG()%>[eq]0[and]?KU0080010form1/*[eq]NORMAL[and]?KU0080010form1/IN_SHIP_INVOICE_CTL_NO[eq]SAME[and]?KU0080010view1/#[neq]0@*16,*15"
expj.KU0080010.KU0080010form1.onDecision7 = function () {
  console.log('KU0080010form1 script24');
if (expj.common.pscript.evaluate('<%= aKU0080010Struct.getPRINT_FLG()%>', '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010form1/IN_SHIP_INVOICE_CTL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '?KU0080010view1/#'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script25="child;15;MASK;_KU0080010button3/Delete"
expj.KU0080010.KU0080010form1.child15 = function () {
  console.log('KU0080010form1 script25');
expj.common.pscript.setMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button3/Delete');
};
// script26="child;16;UNMASK;_KU0080010button3/Delete"
expj.KU0080010.KU0080010form1.child16 = function () {
  console.log('KU0080010form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('KU0080010', 'KU0080010form1', '_KU0080010button3/Delete');
};
expj.KU0080010.KU0080010form1.executeAllOnDecision = function () {
  console.log('execute KU0080010form1.onDecision');
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010form1['onDecision' + i])) {
        expj.KU0080010.KU0080010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010form1.executeOnLoad = function () {
  expj.KU0080010.KU0080010form1.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form1.executePScriptOnLoad = function () {
  console.log('execute KU0080010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KU0080010.KU0080010form1['onLoad' + i])) {
      expj.KU0080010.KU0080010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0080010-KU0080010form1" action="KU0080010Servlet" name="KU0080010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKU0080010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:260px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:482px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SHIP_INVOICE_CTL_NO",rb)%></span><!-- 出荷インボイス管理番号 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form1-IN_SHIP_INVOICE_CTL_NO">
expj.KU0080010.KU0080010form1.IN_SHIP_INVOICE_CTL_NO = {};
expj.KU0080010.KU0080010form1.IN_SHIP_INVOICE_CTL_NO.executeAllOnDecision = function () {
  console.log('execute KU0080010form1/IN_SHIP_INVOICE_CTL_NO.onDecision');
  expj.KU0080010.KU0080010form1.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form1.IN_SHIP_INVOICE_CTL_NO.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form1-IN_SHIP_INVOICE_CTL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form1', 'IN_SHIP_INVOICE_CTL_NO', this);
  });
  expj.KU0080010.KU0080010form1.IN_SHIP_INVOICE_CTL_NO.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form1.IN_SHIP_INVOICE_CTL_NO.executePScriptOnLoad = function () {
  console.log('execute KU0080010form1/IN_SHIP_INVOICE_CTL_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form1-IN_SHIP_INVOICE_CTL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form1-IN_SHIP_INVOICE_CTL_NO" name="IN_SHIP_INVOICE_CTL_NO" class="KU0080010-focus-move  required-value expj-KU0080010-required-A" style="width:100%;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getIN_SHIP_INVOICE_CTL_NO()) %>" maxlength="20" ></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form1-PeekerIN_SHIP_INVOICE_CTL_NO">
expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO = {};
// script1="onClick;0;PEEKER;_KU0080010form1/IN_SHIP_INVOICE_CTL_NO@<%=contextNo%>"
expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO.onClick0 = function () {
  console.log('PeekerIN_SHIP_INVOICE_CTL_NO script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0080010';
var parameterValues = 'PeekerIN_SHIP_INVOICE_CTL_NO%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0080010', 'KU0080010form1', '_KU0080010form1/IN_SHIP_INVOICE_CTL_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SHIP_INVOICE_CTL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0080010form1/IN_SHIP_INVOICE_CTL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0080010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO['onClick' + i])) {
        expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form1-PeekerIN_SHIP_INVOICE_CTL_NO').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010form1', 'PeekerIN_SHIP_INVOICE_CTL_NO', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO.executePScriptOnLoad = function () {
  console.log('execute KU0080010form1/PeekerIN_SHIP_INVOICE_CTL_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form1-PeekerIN_SHIP_INVOICE_CTL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0080010-KU0080010form1-PeekerIN_SHIP_INVOICE_CTL_NO" class="KU0080010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:482px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KU0080010-KU0080010button1">
expj.KU0080010.KU0080010button1 = {};
expj.KU0080010.KU0080010button1.executeAllOnDecision = function () {
  console.log('execute KU0080010button1.onDecision');
};
expj.KU0080010.KU0080010button1.executeOnLoad = function () {
  expj.KU0080010.KU0080010button1.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button1.executePScriptOnLoad = function () {
  console.log('execute KU0080010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0080010-KU0080010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0080010-KU0080010button1-Select">
expj.KU0080010.KU0080010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0080010form1/*@KU0080010Servlet"
expj.KU0080010.KU0080010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button1', '_KU0080010form1/*', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0080010', response);
expj.common.updateBusinessScreenTab('KU0080010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0080010.KU0080010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button1.Select['onClick' + i])) {
        expj.KU0080010.KU0080010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button1.Select.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button1.Select.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button1', 'Select', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button1.Select.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KU0080010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button1-Select" name="Select" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-KU0080010-KU0080010form2">
expj.KU0080010.KU0080010form2 = {};
expj.KU0080010.KU0080010form2.executeAllOnDecision = function () {
  console.log('execute KU0080010form2.onDecision');
};
expj.KU0080010.KU0080010form2.executeOnLoad = function () {
  expj.KU0080010.KU0080010form2.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0080010-KU0080010form2" action="KU0080010Servlet" name="KU0080010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.INVOICE_CD_1",rb)%></span><!-- インボイス番号 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-SHIP_INVOICE_NO">
expj.KU0080010.KU0080010form2.SHIP_INVOICE_NO = {};
expj.KU0080010.KU0080010form2.SHIP_INVOICE_NO.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/SHIP_INVOICE_NO.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.SHIP_INVOICE_NO.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-SHIP_INVOICE_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'SHIP_INVOICE_NO', this);
  });
  expj.KU0080010.KU0080010form2.SHIP_INVOICE_NO.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.SHIP_INVOICE_NO.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/SHIP_INVOICE_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-SHIP_INVOICE_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-SHIP_INVOICE_NO" name="SHIP_INVOICE_NO" class="KU0080010-focus-move  required-value expj-KU0080010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getSHIP_INVOICE_NO()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEPARTURE_PLACE",rb)%></span><!-- 出港元 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-DEPARTURE_PLACE">
expj.KU0080010.KU0080010form2.DEPARTURE_PLACE = {};
expj.KU0080010.KU0080010form2.DEPARTURE_PLACE.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/DEPARTURE_PLACE.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.DEPARTURE_PLACE.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-DEPARTURE_PLACE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'DEPARTURE_PLACE', this);
  });
  expj.KU0080010.KU0080010form2.DEPARTURE_PLACE.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.DEPARTURE_PLACE.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/DEPARTURE_PLACE.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-DEPARTURE_PLACE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-DEPARTURE_PLACE" name="DEPARTURE_PLACE" class="KU0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getDEPARTURE_PLACE()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEPARTURE_DATE",rb)%></span><!-- 出港日 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-DEPARTURE_DATE">
expj.KU0080010.KU0080010form2.DEPARTURE_DATE = {};
expj.KU0080010.KU0080010form2.DEPARTURE_DATE.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/DEPARTURE_DATE.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.DEPARTURE_DATE.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-DEPARTURE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'DEPARTURE_DATE', this);
  });
  expj.KU0080010.KU0080010form2.DEPARTURE_DATE.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.DEPARTURE_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/DEPARTURE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-DEPARTURE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-DEPARTURE_DATE" name="DEPARTURE_DATE" class="KU0080010-focus-move  " style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getDEPARTURE_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-DEPARTURE_DATE_CALENDAR">
expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KU0080010form2/DEPARTURE_DATE"
expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR.onClick0 = function () {
  console.log('DEPARTURE_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KU0080010','KU0080010form2','_KU0080010form2/DEPARTURE_DATE');
};
expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR['onClick' + i])) {
        expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-DEPARTURE_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010form2', 'DEPARTURE_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0080010','KU0080010form2','_KU0080010form2/DEPARTURE_DATE');
  expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/DEPARTURE_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-DEPARTURE_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0080010-KU0080010form2-DEPARTURE_DATE_CALENDAR" class="KU0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ARRIVAL_PLACE",rb)%></span><!-- 到着地 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-ARRIVAL_PLACE">
expj.KU0080010.KU0080010form2.ARRIVAL_PLACE = {};
expj.KU0080010.KU0080010form2.ARRIVAL_PLACE.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/ARRIVAL_PLACE.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.ARRIVAL_PLACE.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-ARRIVAL_PLACE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'ARRIVAL_PLACE', this);
  });
  expj.KU0080010.KU0080010form2.ARRIVAL_PLACE.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.ARRIVAL_PLACE.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/ARRIVAL_PLACE.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-ARRIVAL_PLACE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-ARRIVAL_PLACE" name="ARRIVAL_PLACE" class="KU0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getARRIVAL_PLACE()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ARRIVAL_DATE_1",rb)%></span><!-- 入港日 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-ARRIVAL_DATE">
expj.KU0080010.KU0080010form2.ARRIVAL_DATE = {};
expj.KU0080010.KU0080010form2.ARRIVAL_DATE.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/ARRIVAL_DATE.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.ARRIVAL_DATE.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-ARRIVAL_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'ARRIVAL_DATE', this);
  });
  expj.KU0080010.KU0080010form2.ARRIVAL_DATE.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.ARRIVAL_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/ARRIVAL_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-ARRIVAL_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-ARRIVAL_DATE" name="ARRIVAL_DATE" class="KU0080010-focus-move  " style="width:100%;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getARRIVAL_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-ARRIVAL_DATE_CALENDAR">
expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KU0080010form2/ARRIVAL_DATE"
expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR.onClick0 = function () {
  console.log('ARRIVAL_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KU0080010','KU0080010form2','_KU0080010form2/ARRIVAL_DATE');
};
expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR['onClick' + i])) {
        expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-ARRIVAL_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010form2', 'ARRIVAL_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0080010','KU0080010form2','_KU0080010form2/ARRIVAL_DATE');
  expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/ARRIVAL_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-ARRIVAL_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0080010-KU0080010form2-ARRIVAL_DATE_CALENDAR" class="KU0080010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TRANSPORT_METHOD",rb)%></span><!-- 輸送手段 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-TRANSPORT_METHOD">
expj.KU0080010.KU0080010form2.TRANSPORT_METHOD = {};
expj.KU0080010.KU0080010form2.TRANSPORT_METHOD.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/TRANSPORT_METHOD.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.TRANSPORT_METHOD.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-TRANSPORT_METHOD').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KU0080010', 'KU0080010form2', 'TRANSPORT_METHOD', this);
  });
  expj.KU0080010.KU0080010form2.TRANSPORT_METHOD.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.TRANSPORT_METHOD.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/TRANSPORT_METHOD.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-TRANSPORT_METHOD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KU0080010-KU0080010form2-TRANSPORT_METHOD" name='TRANSPORT_METHOD' class='KU0080010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKU0080010Control.getStruct().getList_TRANSPORT_METHOD_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKU0080010Control.getStruct().getList_TRANSPORT_METHOD_name().get(i));    String val = TypeConverter.sanitizer((String)aKU0080010Control.getStruct().getList_TRANSPORT_METHOD_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKU0080010Struct.getTRANSPORT_METHOD()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_NO",rb)%></span><!-- 便番号 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-SHIP_NO">
expj.KU0080010.KU0080010form2.SHIP_NO = {};
expj.KU0080010.KU0080010form2.SHIP_NO.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/SHIP_NO.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.SHIP_NO.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-SHIP_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'SHIP_NO', this);
  });
  expj.KU0080010.KU0080010form2.SHIP_NO.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.SHIP_NO.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/SHIP_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-SHIP_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-SHIP_NO" name="SHIP_NO" class="KU0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getSHIP_NO()) %>" maxlength="25" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS_1",rb)%></span><!-- 備考１ --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-REMARKS_1">
expj.KU0080010.KU0080010form2.REMARKS_1 = {};
expj.KU0080010.KU0080010form2.REMARKS_1.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/REMARKS_1.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.REMARKS_1.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-REMARKS_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'REMARKS_1', this);
  });
  expj.KU0080010.KU0080010form2.REMARKS_1.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.REMARKS_1.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/REMARKS_1.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-REMARKS_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-REMARKS_1" name="REMARKS_1" class="KU0080010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getREMARKS_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS_2",rb)%></span><!-- 備考２ --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form2-REMARKS_2">
expj.KU0080010.KU0080010form2.REMARKS_2 = {};
expj.KU0080010.KU0080010form2.REMARKS_2.executeAllOnDecision = function () {
  console.log('execute KU0080010form2/REMARKS_2.onDecision');
  expj.KU0080010.KU0080010form2.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form2.REMARKS_2.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form2-REMARKS_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form2', 'REMARKS_2', this);
  });
  expj.KU0080010.KU0080010form2.REMARKS_2.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form2.REMARKS_2.executePScriptOnLoad = function () {
  console.log('execute KU0080010form2/REMARKS_2.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form2-REMARKS_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form2-REMARKS_2" name="REMARKS_2" class="KU0080010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getREMARKS_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 609px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:525px;"><script class="expj-script-KU0080010-KU0080010button2">
expj.KU0080010.KU0080010button2 = {};
expj.KU0080010.KU0080010button2.executeAllOnDecision = function () {
  console.log('execute KU0080010button2.onDecision');
};
expj.KU0080010.KU0080010button2.executeOnLoad = function () {
  expj.KU0080010.KU0080010button2.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button2.executePScriptOnLoad = function () {
  console.log('execute KU0080010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0080010-KU0080010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:525px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0080010-KU0080010button2-Insert">
expj.KU0080010.KU0080010button2.Insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*@KU0080010Servlet,,$ZZ07001"
expj.KU0080010.KU0080010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button2', '_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0080010', response);
expj.common.updateBusinessScreenTab('KU0080010', contents);
};
expj.common.pscript.callConfirm('KU0080010', 'KU0080010button2', 'ZZ07001', okEvent);
};
expj.KU0080010.KU0080010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button2.Insert['onClick' + i])) {
        expj.KU0080010.KU0080010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button2.Insert.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button2.Insert.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button2', 'Insert', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button2.Insert.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute KU0080010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button2-Insert" name="Insert" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010button2-Update">
expj.KU0080010.KU0080010button2.Update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*@KU0080010Servlet,,$ZZ07003"
expj.KU0080010.KU0080010button2.Update.onClick0 = function () {
  console.log('Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button2', '_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0080010', response);
expj.common.updateBusinessScreenTab('KU0080010', contents);
};
expj.common.pscript.callConfirm('KU0080010', 'KU0080010button2', 'ZZ07003', okEvent);
};
expj.KU0080010.KU0080010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button2.Update['onClick' + i])) {
        expj.KU0080010.KU0080010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button2.Update.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button2.Update.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button2', 'Update', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button2.Update.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button2.Update.executePScriptOnLoad = function () {
  console.log('execute KU0080010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button2-Update" name="Update" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010button2-DeleteAll">
expj.KU0080010.KU0080010button2.DeleteAll = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*@KU0080010Servlet,,$ZZ07004"
expj.KU0080010.KU0080010button2.DeleteAll.onClick0 = function () {
  console.log('DeleteAll script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button2', '_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0080010', response);
expj.common.updateBusinessScreenTab('KU0080010', contents);
};
expj.common.pscript.callConfirm('KU0080010', 'KU0080010button2', 'ZZ07004', okEvent);
};
expj.KU0080010.KU0080010button2.DeleteAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button2.DeleteAll['onClick' + i])) {
        expj.KU0080010.KU0080010button2.DeleteAll['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button2.DeleteAll.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button2.DeleteAll.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button2-DeleteAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button2', 'DeleteAll', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button2.DeleteAll.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button2.DeleteAll.executePScriptOnLoad = function () {
  console.log('execute KU0080010button2/DeleteAll.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button2-DeleteAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button2-DeleteAll" name="DeleteAll" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010button2-Cancel">
expj.KU0080010.KU0080010button2.Cancel = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*@KU0080010Servlet,,"
expj.KU0080010.KU0080010button2.Cancel.onClick0 = function () {
  console.log('Cancel script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button2', '_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*,_KU0080010view1/*', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0080010', response);
expj.common.updateBusinessScreenTab('KU0080010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0080010.KU0080010button2.Cancel.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button2.Cancel['onClick' + i])) {
        expj.KU0080010.KU0080010button2.Cancel['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button2.Cancel.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button2.Cancel.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button2-Cancel').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button2', 'Cancel', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button2.Cancel.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button2.Cancel.executePScriptOnLoad = function () {
  console.log('execute KU0080010button2/Cancel.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button2-Cancel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button2-Cancel" name="Cancel" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint_Cancel",rb)%></button><!-- 帳票取消ボタン --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010button2-GoPrint">
expj.KU0080010.KU0080010button2.GoPrint = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KU0080010form1/*@KU0100010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KU0080010.KU0080010button2.GoPrint.onClick0 = function () {
  console.log('GoPrint script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button2', '_KU0080010form1/*', 'KU0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KU0100010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KU0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KU0080010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KU0080010.KU0080010button2.GoPrint.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button2.GoPrint['onClick' + i])) {
        expj.KU0080010.KU0080010button2.GoPrint['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button2.GoPrint.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button2.GoPrint.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button2-GoPrint').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button2', 'GoPrint', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button2.GoPrint.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button2.GoPrint.executePScriptOnLoad = function () {
  console.log('execute KU0080010button2/GoPrint.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button2-GoPrint');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button2-GoPrint" name="GoPrint" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style=""></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-KU0080010-KU0080010form3">
expj.KU0080010.KU0080010form3 = {};
expj.KU0080010.KU0080010form3.executeAllOnDecision = function () {
  console.log('execute KU0080010form3.onDecision');
};
expj.KU0080010.KU0080010form3.executeOnLoad = function () {
  expj.KU0080010.KU0080010form3.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form3.executePScriptOnLoad = function () {
  console.log('execute KU0080010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0080010-KU0080010form3" action="KU0080010Servlet" name="KU0080010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form3-CUST_CD">
expj.KU0080010.KU0080010form3.CUST_CD = {};
expj.KU0080010.KU0080010form3.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0080010form3/CUST_CD.onDecision');
  expj.KU0080010.KU0080010form3.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form3.CUST_CD.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form3-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form3', 'CUST_CD', this);
  });
  expj.KU0080010.KU0080010form3.CUST_CD.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form3.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0080010form3/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form3-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form3-CUST_CD" name="CUST_CD" class="KU0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getCUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.AMOUNT",rb)%></span><!-- 金額 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form3-INVOICE_AMOUNT">
expj.KU0080010.KU0080010form3.INVOICE_AMOUNT = {};
expj.KU0080010.KU0080010form3.INVOICE_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KU0080010form3/INVOICE_AMOUNT.onDecision');
  expj.KU0080010.KU0080010form3.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form3.INVOICE_AMOUNT.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form3-INVOICE_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form3', 'INVOICE_AMOUNT', this);
  });
  expj.KU0080010.KU0080010form3.INVOICE_AMOUNT.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form3.INVOICE_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KU0080010form3/INVOICE_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form3-INVOICE_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form3-INVOICE_AMOUNT" name="INVOICE_AMOUNT" class="KU0080010-focus-move  " style="width:260px;text-align: right;" data-kind="OBT_NUMBER;14.2;CEIL;4" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getINVOICE_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form3-DLV_LOC_CD">
expj.KU0080010.KU0080010form3.DLV_LOC_CD = {};
expj.KU0080010.KU0080010form3.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KU0080010form3/DLV_LOC_CD.onDecision');
  expj.KU0080010.KU0080010form3.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form3.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form3-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form3', 'DLV_LOC_CD', this);
  });
  expj.KU0080010.KU0080010form3.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form3.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KU0080010form3/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form3-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form3-DLV_LOC_CD" name="DLV_LOC_CD" class="KU0080010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getDLV_LOC_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INVOICE_TAX_AMOUNT_1",rb)%></span><!-- VAT --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form3-INVOICE_TAX_AMOUNT">
expj.KU0080010.KU0080010form3.INVOICE_TAX_AMOUNT = {};
expj.KU0080010.KU0080010form3.INVOICE_TAX_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KU0080010form3/INVOICE_TAX_AMOUNT.onDecision');
  expj.KU0080010.KU0080010form3.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form3.INVOICE_TAX_AMOUNT.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form3-INVOICE_TAX_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form3', 'INVOICE_TAX_AMOUNT', this);
  });
  expj.KU0080010.KU0080010form3.INVOICE_TAX_AMOUNT.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form3.INVOICE_TAX_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KU0080010form3/INVOICE_TAX_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form3-INVOICE_TAX_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form3-INVOICE_TAX_AMOUNT" name="INVOICE_TAX_AMOUNT" class="KU0080010-focus-move  " style="width:260px;text-align: right;" data-kind="OBT_NUMBER;14.2;CEIL;4" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getINVOICE_TAX_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SCDL_SHIP_DATE",rb)%></span><!-- 出荷予定日 --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form3-SCDL_SHIP_DATE">
expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE = {};
expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE.executeAllOnDecision = function () {
  console.log('execute KU0080010form3/SCDL_SHIP_DATE.onDecision');
  expj.KU0080010.KU0080010form3.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form3-SCDL_SHIP_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form3', 'SCDL_SHIP_DATE', this);
  });
  expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE.executePScriptOnLoad = function () {
  console.log('execute KU0080010form3/SCDL_SHIP_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form3-SCDL_SHIP_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form3-SCDL_SHIP_DATE" name="SCDL_SHIP_DATE" class="KU0080010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getSCDL_SHIP_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010form3-SCDL_SHIP_DATE_TIME">
expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE_TIME = {};
expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute KU0080010form3/SCDL_SHIP_DATE_TIME.onDecision');
  expj.KU0080010.KU0080010form3.executeAllOnDecision();
  expj.KU0080010.executeAllOnDecision();
};
expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE_TIME.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010form3-SCDL_SHIP_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0080010', 'KU0080010form3', 'SCDL_SHIP_DATE_TIME', this);
  });
  expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE_TIME.executePScriptOnLoad();
};

expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute KU0080010form3/SCDL_SHIP_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010form3-SCDL_SHIP_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-KU0080010-KU0080010form3-SCDL_SHIP_DATE_TIME" name="SCDL_SHIP_DATE_TIME" class="KU0080010-focus-move  " style="width:100%;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0080010Struct.getSCDL_SHIP_DATE_TIME()) %>" maxlength="4" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段一覧用のDataGridを配置する。↓ --><script class="expj-script-KU0080010-KU0080010view1">
expj.KU0080010.KU0080010view1 = {};
expj.KU0080010.KU0080010view1.executeAllOnClick = function () {
};
expj.KU0080010.KU0080010view1.executeAllOnDecision = function () {
  console.log('execute KU0080010view1.onDecision');
};
expj.KU0080010.KU0080010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KU0080010view1", "expj.KU0080010.KU0080010view1.executeAllOnClick");
%>
  expj.KU0080010.KU0080010view1.executePScriptOnLoad();
};

expj.KU0080010.KU0080010view1.executePScriptOnLoad = function () {
  console.log('execute KU0080010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KU0080010-KU0080010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aKU0080010Control.getReadStatus())%>"></div>
<!-- VIEW END -->
<%
 String KU0080010view1_Id = "KU0080010view1";
 String KU0080010view1_select = "single";
 String KU0080010view1_sortable = "true";
 String KU0080010view1_resize = "true";
 String KU0080010view1_scroll = "true";
 StringBuffer KU0080010view1_HB = new StringBuffer();
 StringBuffer KU0080010view1_DB = new StringBuffer();
%>
<%
 KU0080010view1_select = "multi";
 KU0080010view1_sortable = "true";
 KU0080010view1_resize = "true";
 KU0080010view1_scroll = "true";
%>
<%
 KU0080010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
%>
     
<%
KU0080010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SLIP_DETAIL_NO",rb))).append("', 'name':'SLIP_DETAIL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ODR_NO",rb))).append("', 'name':'CUST_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ORD_CD",rb))).append("', 'name':'ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PART_DLV_SEQ_NO",rb))).append("', 'name':'PART_DLV_SEQ_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SHIP_ODR_NO",rb))).append("', 'name':'SHIP_ODR_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.QTY",rb))).append("', 'name':'SHIP_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb))).append("', 'name':'UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.AMOUNT",rb))).append("', 'name':'SHIP_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'UNIT_COST_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_AMOUNT",rb))).append("', 'name':'TAX_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
KU0080010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TAX_RATE",rb))).append("', 'name':'TAX_RATE', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KU0080010view1_sortable).append("}").append(",");
%>
<%
 int aKU0080010StructLength = aKU0080010Control.getListsize();
 final KU0080010Struct structBackup = aKU0080010Struct;
 aKU0080010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKU0080010StructLength; ++loopCount) {
  if((aKU0080010Struct = (KU0080010Struct) aKU0080010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKU0080010Struct", aKU0080010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KU0080010view1_DB.append("[");
 KU0080010view1_DB.append(loopCount);
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-SLIP_DETAIL_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-SLIP_DETAIL_NO\" data-name=\"SLIP_DETAIL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getSLIP_DETAIL_NO())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-CUST_ITEM_CD\" data-name=\"CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getCUST_ITEM_CD())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-CUST_ITEM_NAME\" data-name=\"CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getCUST_ITEM_NAME())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-CUST_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-CUST_ODR_NO\" data-name=\"CUST_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getCUST_ODR_NO())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-ODR_NO\" data-name=\"ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getODR_NO())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-PART_DLV_SEQ_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-PART_DLV_SEQ_NO\" data-name=\"PART_DLV_SEQ_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getPART_DLV_SEQ_NO())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getITEM_CD())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getITEM_NAME())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-SHIP_ODR_NO-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-SHIP_ODR_NO\" data-name=\"SHIP_ODR_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getSHIP_ODR_NO())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-SHIP_QTY-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-SHIP_QTY\" data-name=\"SHIP_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKU0080010Struct.getSHIP_QTY())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-UNIT_PRICE\" data-name=\"UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKU0080010Struct.getUNIT_PRICE())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-SHIP_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-SHIP_ODR_AMOUNT\" data-name=\"SHIP_ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKU0080010Struct.getSHIP_ODR_AMOUNT())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-UNIT_COST_TYP-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-UNIT_COST_TYP\" data-name=\"UNIT_COST_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKU0080010Struct.getUNIT_COST_TYP())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-TAX_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-TAX_AMOUNT\" data-name=\"TAX_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;CEIL;4\">").append(TypeConverter.sanitizer(aKU0080010Struct.getTAX_AMOUNT())).append("</span>'");
 KU0080010view1_DB.append(",").append("'<span id=\"expj-KU0080010-KU0080010view1-TAX_RATE-").append(loopCount).append("\" class=\"expj-label expj-KU0080010-KU0080010view1-TAX_RATE\" data-name=\"TAX_RATE\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aKU0080010Struct.getTAX_RATE())).append("</span>'");
 KU0080010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKU0080010StructLength) {
   KU0080010view1_DB.append(",");
  }
 }
 aKU0080010Struct = structBackup;
 viewIdList.add(KU0080010view1_Id);
 viewSelectList.add(KU0080010view1_select);
 viewResizeList.add(KU0080010view1_resize);
 viewScrollList.add(KU0080010view1_scroll);
 viewHeaderDataList.add(KU0080010view1_HB);
 viewBodyDataList.add(KU0080010view1_DB);
%>
<%
}
%>
<!-- ここに下段一覧用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:105px;"><script class="expj-script-KU0080010-KU0080010button3">
expj.KU0080010.KU0080010button3 = {};
expj.KU0080010.KU0080010button3.executeAllOnDecision = function () {
  console.log('execute KU0080010button3.onDecision');
};
expj.KU0080010.KU0080010button3.executeOnLoad = function () {
  expj.KU0080010.KU0080010button3.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button3.executePScriptOnLoad = function () {
  console.log('execute KU0080010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0080010-KU0080010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0080010-KU0080010button3-Delete">
expj.KU0080010.KU0080010button3.Delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KU0080010view1/+,_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*@KU0080010Servlet,,$ZZ07004"
expj.KU0080010.KU0080010button3.Delete.onClick0 = function () {
  console.log('Delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button3', '_KU0080010view1/+,_KU0080010form1/*,_KU0080010form2/*,_KU0080010form3/*', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0080010', response);
expj.common.updateBusinessScreenTab('KU0080010', contents);
};
expj.common.pscript.callConfirm('KU0080010', 'KU0080010button3', 'ZZ07004', okEvent);
};
expj.KU0080010.KU0080010button3.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button3.Delete['onClick' + i])) {
        expj.KU0080010.KU0080010button3.Delete['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button3.Delete.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button3.Delete.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button3-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button3', 'Delete', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button3.Delete.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button3.Delete.executePScriptOnLoad = function () {
  console.log('execute KU0080010button3/Delete.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button3-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button3-Delete" name="Delete" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAssort_1",rb)%></button><!-- 選択削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KU0080010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0080010-KU0080010button0">
expj.KU0080010.KU0080010button0 = {};
expj.KU0080010.KU0080010button0.executeAllOnDecision = function () {
  console.log('execute KU0080010button0.onDecision');
};
expj.KU0080010.KU0080010button0.executeOnLoad = function () {
  expj.KU0080010.KU0080010button0.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button0.executePScriptOnLoad = function () {
  console.log('execute KU0080010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0080010-KU0080010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0080010-KU0080010button0-Clear">
expj.KU0080010.KU0080010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0080010Servlet,,$ZZ07008"
expj.KU0080010.KU0080010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0080010', 'KU0080010button0', '', 'KU0080010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0080010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0080010', response);
expj.common.updateBusinessScreenTab('KU0080010', contents);
};
expj.common.pscript.callConfirm('KU0080010', 'KU0080010button0', 'ZZ07008', okEvent);
};
expj.KU0080010.KU0080010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button0.Clear['onClick' + i])) {
        expj.KU0080010.KU0080010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button0.Clear.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button0.Clear.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button0', 'Clear', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button0.Clear.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KU0080010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button0-Clear" name="Clear" class="KU0080010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0080010-KU0080010button0-Close">
expj.KU0080010.KU0080010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KU0080010.KU0080010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KU0080010');
};
expj.KU0080010.KU0080010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0080010.KU0080010button0.Close['onClick' + i])) {
        expj.KU0080010.KU0080010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KU0080010.KU0080010button0.Close.executeAllOnDecision = function () {
};
expj.KU0080010.KU0080010button0.Close.executeOnLoad = function () {
  $('#expj-KU0080010-KU0080010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0080010', 'KU0080010button0', 'Close', this, 'Button');
    }
  });
  expj.KU0080010.KU0080010button0.Close.executePScriptOnLoad();
};

expj.KU0080010.KU0080010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KU0080010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KU0080010-KU0080010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0080010-KU0080010button0-Close" name="Close" class="KU0080010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KU0080010 (END)-->
<%
MessageStruct msgStruct = aKU0080010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0080010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0080010)) {
  expj.common.treeInstanceMap.KU0080010 = {};
}
expj.common.treeInstanceMap.KU0080010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0080010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0080010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0080010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0080010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0080010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0080010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0080010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0080010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0080010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0080010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0080010)) {
  expj.common.detailDialogMap.KU0080010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0080010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0080010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0080010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0080010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0080010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0080010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0080010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0080010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0080010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0080010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0080010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0080010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0080010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0080010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
<%
}
%>
};
</script>
<%
 }
//DETAIL JS宣言(END)

//VIEW JS宣言
for (int i = 0; i < viewIdList.size(); i++) {
 String viewId = (String) viewIdList.get(i);
 String viewResize = (String) viewResizeList.get(i);
 String viewSelect = (String) viewSelectList.get(i);
 String viewScroll = (String) viewScrollList.get(i);
 StringBuffer viewHeaderBuffer = (StringBuffer) viewHeaderDataList.get(i);
 StringBuffer viewDataBuffer = (StringBuffer) viewBodyDataList.get(i);
%>
<script class="expj-script-KU0080010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0080010)) {
  expj.common.viewInstanceMap.KU0080010 = {};
}
expj.common.viewInstanceMap.KU0080010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0080010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0080010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0080010.<%=viewId %>.init = function () {
  // DataGrid(VIEW)のボディデータ
  var body_data = [<%=viewDataBuffer.toString() %>];
  // DataGrid(VIEW)のヘッダーデータ
  var header_data = [<%=viewHeaderBuffer.toString() %>];
  var viewSelectEvent = function (target) {
    console.log('execute <%=viewId %>.onClick');
    expj.common.pscript.onClickTargetButtonData = null;
<%
 String viewClickFunctionName = (String) viewSelectEvent.get((String) viewId);
 if (viewClickFunctionName != null) {
%>
    <%=viewClickFunctionName %>();
<%
 }
%>
    expj.KU0080010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0080010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0080010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0080010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0080010_init">
/**
 * KU0080010用のロード完了時初期化関数
 */
expj.KU0080010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0080010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0080010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0080010');
  expj.common.calendarInstanceMap.KU0080010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0080010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0080010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0080010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0080010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0080010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0080010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0080010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0080010.KU0080010form1.IN_SHIP_INVOICE_CTL_NO.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form1.PeekerIN_SHIP_INVOICE_CTL_NO.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.SHIP_INVOICE_NO.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.DEPARTURE_PLACE.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.DEPARTURE_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.DEPARTURE_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.ARRIVAL_PLACE.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.ARRIVAL_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.ARRIVAL_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.TRANSPORT_METHOD.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.SHIP_NO.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.REMARKS_1.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.REMARKS_2.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button2.Update.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button2.DeleteAll.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button2.Cancel.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button2.GoPrint.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form3.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form3.INVOICE_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form3.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form3.INVOICE_TAX_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form3.SCDL_SHIP_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button3.Delete.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form1.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button1.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form2.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button2.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010form3.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010view1.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button3.executeOnLoad();}catch(e){};
  try{expj.KU0080010.KU0080010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0080010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0080010', 'KU0080010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0080010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0080010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0080010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0080010', '<%=request.getContextPath() %>');
};

/**
 * KU0080010の全体onDecision処理
 */
expj.KU0080010.executeAllOnDecision = function () {
  expj.KU0080010.KU0080010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0080010_console">
expj.KU0080010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>