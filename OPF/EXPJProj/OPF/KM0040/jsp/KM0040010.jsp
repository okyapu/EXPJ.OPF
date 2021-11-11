<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 19:12:04 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KM0040\KM0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KM0040.*" %>
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
<jsp:useBean id="aKM0040010Control" class="com.nec.jp.orteus.metamorBase.KM0040.KM0040010Control" scope="request"/>
<jsp:useBean id="aKM0040010Struct" class="com.nec.jp.orteus.metamorBase.KM0040.KM0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

案件一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0040/jsp/KM0040010.jsp,v $
$Author: geng-jia $	
$Revision: 1.2 $　$Date: 2017/02/22 02:07:04 $
********************************************************* --%>
<html>
<head>
<title>案件一覧</title>
<%@include file="common/expj_v5.jsp" %>

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
<script class="expj-script-KM0040010_init">
  // KM0040010名前空間
  expj.KM0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<%ScreenMoveUtil su = new ScreenMoveUtil("KM0020010Servlet"); %>
<%ScreenMoveUtil su1 = new ScreenMoveUtil("KM0050010Servlet"); %>
<%ScreenMoveUtil su2 = new ScreenMoveUtil("KM0030010Servlet"); %>
  <div id="expj-business-screen-KM0040010" data-screen="KM0040010" data-newdata="<%=aKM0040010Control.isNewData() %>">
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
              <script class="expj-script-KM0040010-KM0040010form1">
expj.KM0040010.KM0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.KM0040010.KM0040010form1.onLoad0 = function () {
  console.log('KM0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;?KM0040010view1/?[eq]NOT_SELECTED@*0"
expj.KM0040010.KM0040010form1.onDecision0 = function () {
  console.log('KM0040010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010view1/?'), '[eq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;?KM0040010form1/*[eq]NORMAL@*1,*3"
expj.KM0040010.KM0040010form1.onDecision1 = function () {
  console.log('KM0040010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;0;MASK;_KM0040010button2/GoSub1,_KM0040010button2/GoSub2,_KM0040010button2/GoSub3"
expj.KM0040010.KM0040010form1.child0 = function () {
  console.log('KM0040010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010form1', '_KM0040010button2/GoSub1');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010form1', '_KM0040010button2/GoSub2');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010form1', '_KM0040010button2/GoSub3');
};
// script5="child;1;CHK;?KM0040010form1/IN_PROJECT_CD[eq]SAME[and]?KM0040010form1/IN_CUST_CD[eq]SAME[and]?KM0040010form1/IN_PJ_USER_CD[eq]SAME[and]?KM0040010form1/IN_ES_USER_CD[eq]SAME[and]?KM0040010form1/IN_PJ_USER_NAME[eq]SAME[and]?KM0040010form1/IN_ES_USER_NAME[eq]SAME[and]?KM0040010form1/FROM_ASSUME_DLV_DATE[eq]SAME[and]?KM0040010form1/TO_ASSUME_DLV_DATE[eq]SAME[and]?KM0040010form1/FROM_ESTIMATE_DATE[eq]SAME[and]?KM0040010form1/TO_ESTIMATE_DATE[eq]SAME[and]?KM0040010form1/CHECK_1[eq]SAME[and]?KM0040010form1/C1_PROJECT_STAT[eq]SAME[and]?KM0040010form1/C2_PROJECT_STAT[eq]SAME[and]?KM0040010form1/C3_PROJECT_STAT[eq]SAME[and]?KM0040010form1/C4_PROJECT_STAT[eq]SAME[and]?KM0040010form1/C5_PROJECT_STAT[eq]SAME[and]?KM0040010form1/C6_PROJECT_STAT[eq]SAME@*2,*3"
expj.KM0040010.KM0040010form1.child1 = function () {
  console.log('KM0040010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/IN_PROJECT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/IN_CUST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/IN_PJ_USER_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/IN_ES_USER_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/IN_PJ_USER_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/IN_ES_USER_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/FROM_ASSUME_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/TO_ASSUME_DLV_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/FROM_ESTIMATE_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/TO_ESTIMATE_DATE'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/CHECK_1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/C1_PROJECT_STAT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/C2_PROJECT_STAT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/C3_PROJECT_STAT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/C4_PROJECT_STAT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/C5_PROJECT_STAT'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '?KM0040010form1/C6_PROJECT_STAT'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_KM0040010button0/CSVOut"
expj.KM0040010.KM0040010form1.child2 = function () {
  console.log('KM0040010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010form1', '_KM0040010button0/CSVOut');
};
// script7="child;3;MASK;_KM0040010button0/CSVOut"
expj.KM0040010.KM0040010form1.child3 = function () {
  console.log('KM0040010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010form1', '_KM0040010button0/CSVOut');
};
expj.KM0040010.KM0040010form1.executeAllOnDecision = function () {
  console.log('execute KM0040010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1['onDecision' + i])) {
        expj.KM0040010.KM0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.executeOnLoad = function () {
  expj.KM0040010.KM0040010form1.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1['onLoad' + i])) {
      expj.KM0040010.KM0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0040010-KM0040010form1" action="KM0040010Servlet" name="KM0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKM0040010Control.getReadStatusString()) %>" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:20px;align:"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:68px;align:"></div>
<div class="div-td" style="width:80px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CD",rb)%></span><!-- 案件番号 --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-IN_PROJECT_CD">
expj.KM0040010.KM0040010form1.IN_PROJECT_CD = {};
expj.KM0040010.KM0040010form1.IN_PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/IN_PROJECT_CD.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.IN_PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-IN_PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'IN_PROJECT_CD', this);
  });
  expj.KM0040010.KM0040010form1.IN_PROJECT_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.IN_PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/IN_PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-IN_PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-IN_PROJECT_CD" name="IN_PROJECT_CD" class="KM0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getIN_PROJECT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-PeekerIN_PROJECT_CD">
expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD = {};
// script1="onClick;0;PEEKER;_KM0040010form1/IN_PROJECT_CD@<%=contextNo%>"
expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD.onClick0 = function () {
  console.log('PeekerIN_PROJECT_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0040010';
var parameterValues = 'PeekerIN_PROJECT_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '_KM0040010form1/IN_PROJECT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROJECT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0040010form1/IN_PROJECT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD['onClick' + i])) {
        expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-PeekerIN_PROJECT_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'PeekerIN_PROJECT_CD', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/PeekerIN_PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-PeekerIN_PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-PeekerIN_PROJECT_CD" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-CHECK_1">
expj.KM0040010.KM0040010form1.CHECK_1 = {};
expj.KM0040010.KM0040010form1.CHECK_1.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/CHECK_1.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.CHECK_1.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-CHECK_1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'CHECK_1', this, 'CheckBox');
    }
  });
  expj.KM0040010.KM0040010form1.CHECK_1.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.CHECK_1.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/CHECK_1.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-CHECK_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="CHECK_1" value="true" <%= ("true".equals(TypeConverter.convert(aKM0040010Struct.getCHECK_1())) || "1".equals(TypeConverter.convert(aKM0040010Struct.getCHECK_1())))?"checked=\"checked\"":"" %>  class="KM0040010-focus-move" id="expj-KM0040010-KM0040010form1-CHECK_1"><label for="expj-KM0040010-KM0040010form1-CHECK_1"><%=CoreTools.getRBString("Expj.Cmt6683",rb)%></label></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_STAT",rb)%></span><!-- 案件ステータス --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-IN_CUST_CD">
expj.KM0040010.KM0040010form1.IN_CUST_CD = {};
expj.KM0040010.KM0040010form1.IN_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/IN_CUST_CD.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.IN_CUST_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-IN_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'IN_CUST_CD', this);
  });
  expj.KM0040010.KM0040010form1.IN_CUST_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.IN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/IN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-IN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-IN_CUST_CD" name="IN_CUST_CD" class="KM0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getIN_CUST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-PeekerIN_CUST_CD">
expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD = {};
// script1="onClick;0;PEEKER;_KM0040010form1/IN_CUST_CD@<%=contextNo%>"
expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD.onClick0 = function () {
  console.log('PeekerIN_CUST_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0040010';
var parameterValues = 'PeekerIN_CUST_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '_KM0040010form1/IN_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0040010form1/IN_CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD['onClick' + i])) {
        expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-PeekerIN_CUST_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'PeekerIN_CUST_CD', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/PeekerIN_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-PeekerIN_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-PeekerIN_CUST_CD" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-C1_PROJECT_STAT">
expj.KM0040010.KM0040010form1.C1_PROJECT_STAT = {};
expj.KM0040010.KM0040010form1.C1_PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/C1_PROJECT_STAT.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.C1_PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-C1_PROJECT_STAT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'C1_PROJECT_STAT', this, 'CheckBox');
    }
  });
  expj.KM0040010.KM0040010form1.C1_PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.C1_PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/C1_PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-C1_PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="C1_PROJECT_STAT" value="true" <%= ("true".equals(TypeConverter.convert(aKM0040010Struct.getC1_PROJECT_STAT())) || "1".equals(TypeConverter.convert(aKM0040010Struct.getC1_PROJECT_STAT())))?"checked=\"checked\"":"" %>  class="KM0040010-focus-move" id="expj-KM0040010-KM0040010form1-C1_PROJECT_STAT"><label for="expj-KM0040010-KM0040010form1-C1_PROJECT_STAT"><%=CoreTools.getRBString("Expj.Cmt6686",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PJ_USER_CD",rb)%></span><!-- 案件担当者コード --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-IN_PJ_USER_CD">
expj.KM0040010.KM0040010form1.IN_PJ_USER_CD = {};
expj.KM0040010.KM0040010form1.IN_PJ_USER_CD.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/IN_PJ_USER_CD.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.IN_PJ_USER_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-IN_PJ_USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'IN_PJ_USER_CD', this);
  });
  expj.KM0040010.KM0040010form1.IN_PJ_USER_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.IN_PJ_USER_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/IN_PJ_USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-IN_PJ_USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-IN_PJ_USER_CD" name="IN_PJ_USER_CD" class="KM0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getIN_PJ_USER_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-PeekerIN_PJ_USER_CD">
expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD = {};
// script1="onClick;0;PEEKER;_KM0040010form1/IN_PJ_USER_CD@<%=contextNo%>"
expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD.onClick0 = function () {
  console.log('PeekerIN_PJ_USER_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0040010';
var parameterValues = 'PeekerIN_PJ_USER_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '_KM0040010form1/IN_PJ_USER_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0040010form1/IN_PJ_USER_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD['onClick' + i])) {
        expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-PeekerIN_PJ_USER_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'PeekerIN_PJ_USER_CD', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/PeekerIN_PJ_USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-PeekerIN_PJ_USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-PeekerIN_PJ_USER_CD" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-IN_PJ_USER_NAME">
expj.KM0040010.KM0040010form1.IN_PJ_USER_NAME = {};
expj.KM0040010.KM0040010form1.IN_PJ_USER_NAME.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/IN_PJ_USER_NAME.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.IN_PJ_USER_NAME.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-IN_PJ_USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'IN_PJ_USER_NAME', this);
  });
  expj.KM0040010.KM0040010form1.IN_PJ_USER_NAME.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.IN_PJ_USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/IN_PJ_USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-IN_PJ_USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-IN_PJ_USER_NAME" name="IN_PJ_USER_NAME" class="KM0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getIN_PJ_USER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-C2_PROJECT_STAT">
expj.KM0040010.KM0040010form1.C2_PROJECT_STAT = {};
expj.KM0040010.KM0040010form1.C2_PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/C2_PROJECT_STAT.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.C2_PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-C2_PROJECT_STAT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'C2_PROJECT_STAT', this, 'CheckBox');
    }
  });
  expj.KM0040010.KM0040010form1.C2_PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.C2_PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/C2_PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-C2_PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="C2_PROJECT_STAT" value="true" <%= ("true".equals(TypeConverter.convert(aKM0040010Struct.getC2_PROJECT_STAT())) || "1".equals(TypeConverter.convert(aKM0040010Struct.getC2_PROJECT_STAT())))?"checked=\"checked\"":"" %>  class="KM0040010-focus-move" id="expj-KM0040010-KM0040010form1-C2_PROJECT_STAT"><label for="expj-KM0040010-KM0040010form1-C2_PROJECT_STAT"><%=CoreTools.getRBString("Expj.Cmt6687",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ES_USER_CD",rb)%></span><!-- 見積担当者コード --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-IN_ES_USER_CD">
expj.KM0040010.KM0040010form1.IN_ES_USER_CD = {};
expj.KM0040010.KM0040010form1.IN_ES_USER_CD.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/IN_ES_USER_CD.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.IN_ES_USER_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-IN_ES_USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'IN_ES_USER_CD', this);
  });
  expj.KM0040010.KM0040010form1.IN_ES_USER_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.IN_ES_USER_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/IN_ES_USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-IN_ES_USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-IN_ES_USER_CD" name="IN_ES_USER_CD" class="KM0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getIN_ES_USER_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-PeekerES_USER_CD">
expj.KM0040010.KM0040010form1.PeekerES_USER_CD = {};
// script1="onClick;0;PEEKER;_KM0040010form1/IN_ES_USER_CD@<%=contextNo%>"
expj.KM0040010.KM0040010form1.PeekerES_USER_CD.onClick0 = function () {
  console.log('PeekerES_USER_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0040010';
var parameterValues = 'PeekerES_USER_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010form1', '_KM0040010form1/IN_ES_USER_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0040010form1/IN_ES_USER_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0040010.KM0040010form1.PeekerES_USER_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.PeekerES_USER_CD['onClick' + i])) {
        expj.KM0040010.KM0040010form1.PeekerES_USER_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.PeekerES_USER_CD.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.PeekerES_USER_CD.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-PeekerES_USER_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'PeekerES_USER_CD', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010form1.PeekerES_USER_CD.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.PeekerES_USER_CD.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/PeekerES_USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-PeekerES_USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-PeekerES_USER_CD" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-IN_ES_USER_NAME">
expj.KM0040010.KM0040010form1.IN_ES_USER_NAME = {};
expj.KM0040010.KM0040010form1.IN_ES_USER_NAME.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/IN_ES_USER_NAME.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.IN_ES_USER_NAME.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-IN_ES_USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'IN_ES_USER_NAME', this);
  });
  expj.KM0040010.KM0040010form1.IN_ES_USER_NAME.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.IN_ES_USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/IN_ES_USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-IN_ES_USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-IN_ES_USER_NAME" name="IN_ES_USER_NAME" class="KM0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getIN_ES_USER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-C3_PROJECT_STAT">
expj.KM0040010.KM0040010form1.C3_PROJECT_STAT = {};
expj.KM0040010.KM0040010form1.C3_PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/C3_PROJECT_STAT.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.C3_PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-C3_PROJECT_STAT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'C3_PROJECT_STAT', this, 'CheckBox');
    }
  });
  expj.KM0040010.KM0040010form1.C3_PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.C3_PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/C3_PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-C3_PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="C3_PROJECT_STAT" value="true" <%= ("true".equals(TypeConverter.convert(aKM0040010Struct.getC3_PROJECT_STAT())) || "1".equals(TypeConverter.convert(aKM0040010Struct.getC3_PROJECT_STAT())))?"checked=\"checked\"":"" %>  class="KM0040010-focus-move" id="expj-KM0040010-KM0040010form1-C3_PROJECT_STAT"><label for="expj-KM0040010-KM0040010form1-C3_PROJECT_STAT"><%=CoreTools.getRBString("Expj.Cmt6693",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_DATE",rb)%></span><!-- 引合日 --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-FROM_VEND_DATE">
expj.KM0040010.KM0040010form1.FROM_VEND_DATE = {};
expj.KM0040010.KM0040010form1.FROM_VEND_DATE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/FROM_VEND_DATE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.FROM_VEND_DATE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-FROM_VEND_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'FROM_VEND_DATE', this);
  });
  expj.KM0040010.KM0040010form1.FROM_VEND_DATE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.FROM_VEND_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/FROM_VEND_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-FROM_VEND_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-FROM_VEND_DATE" name="FROM_VEND_DATE" class="KM0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getFROM_VEND_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-FROM_VEND_DATE_CALENDAR">
expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KM0040010form1/FROM_VEND_DATE"
expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR.onClick0 = function () {
  console.log('FROM_VEND_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KM0040010','KM0040010form1','_KM0040010form1/FROM_VEND_DATE');
};
expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR['onClick' + i])) {
        expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-FROM_VEND_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'FROM_VEND_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0040010','KM0040010form1','_KM0040010form1/FROM_VEND_DATE');
  expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/FROM_VEND_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-FROM_VEND_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-FROM_VEND_DATE_CALENDAR" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-TO_VEND_DATE">
expj.KM0040010.KM0040010form1.TO_VEND_DATE = {};
expj.KM0040010.KM0040010form1.TO_VEND_DATE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/TO_VEND_DATE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.TO_VEND_DATE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-TO_VEND_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'TO_VEND_DATE', this);
  });
  expj.KM0040010.KM0040010form1.TO_VEND_DATE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.TO_VEND_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/TO_VEND_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-TO_VEND_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-TO_VEND_DATE" name="TO_VEND_DATE" class="KM0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getTO_VEND_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-TO_VEND_DATE_CALENDAR">
expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KM0040010form1/TO_VEND_DATE"
expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR.onClick0 = function () {
  console.log('TO_VEND_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KM0040010','KM0040010form1','_KM0040010form1/TO_VEND_DATE');
};
expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR['onClick' + i])) {
        expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-TO_VEND_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'TO_VEND_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0040010','KM0040010form1','_KM0040010form1/TO_VEND_DATE');
  expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/TO_VEND_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-TO_VEND_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-TO_VEND_DATE_CALENDAR" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-C4_PROJECT_STAT">
expj.KM0040010.KM0040010form1.C4_PROJECT_STAT = {};
expj.KM0040010.KM0040010form1.C4_PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/C4_PROJECT_STAT.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.C4_PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-C4_PROJECT_STAT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'C4_PROJECT_STAT', this, 'CheckBox');
    }
  });
  expj.KM0040010.KM0040010form1.C4_PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.C4_PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/C4_PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-C4_PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="C4_PROJECT_STAT" value="true" <%= ("true".equals(TypeConverter.convert(aKM0040010Struct.getC4_PROJECT_STAT())) || "1".equals(TypeConverter.convert(aKM0040010Struct.getC4_PROJECT_STAT())))?"checked=\"checked\"":"" %>  class="KM0040010-focus-move" id="expj-KM0040010-KM0040010form1-C4_PROJECT_STAT"><label for="expj-KM0040010-KM0040010form1-C4_PROJECT_STAT"><%=CoreTools.getRBString("Expj.Cmt6688",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ASSUME_DLV_DATE",rb)%></span><!-- 想定納期 --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE">
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE = {};
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/FROM_ASSUME_DLV_DATE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'FROM_ASSUME_DLV_DATE', this);
  });
  expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/FROM_ASSUME_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE" name="FROM_ASSUME_DLV_DATE" class="KM0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getFROM_ASSUME_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE_CALENDAR">
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KM0040010form1/FROM_ASSUME_DLV_DATE"
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR.onClick0 = function () {
  console.log('FROM_ASSUME_DLV_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KM0040010','KM0040010form1','_KM0040010form1/FROM_ASSUME_DLV_DATE');
};
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR['onClick' + i])) {
        expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'FROM_ASSUME_DLV_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0040010','KM0040010form1','_KM0040010form1/FROM_ASSUME_DLV_DATE');
  expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/FROM_ASSUME_DLV_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-FROM_ASSUME_DLV_DATE_CALENDAR" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE">
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE = {};
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/TO_ASSUME_DLV_DATE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'TO_ASSUME_DLV_DATE', this);
  });
  expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/TO_ASSUME_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE" name="TO_ASSUME_DLV_DATE" class="KM0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getTO_ASSUME_DLV_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE_CALENDAR">
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KM0040010form1/TO_ASSUME_DLV_DATE"
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR.onClick0 = function () {
  console.log('TO_ASSUME_DLV_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KM0040010','KM0040010form1','_KM0040010form1/TO_ASSUME_DLV_DATE');
};
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR['onClick' + i])) {
        expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'TO_ASSUME_DLV_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0040010','KM0040010form1','_KM0040010form1/TO_ASSUME_DLV_DATE');
  expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/TO_ASSUME_DLV_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-TO_ASSUME_DLV_DATE_CALENDAR" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<input type="hidden" id="expj-KM0040010-KM0040010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KM0040010-KM0040010form1-DOWNLOAD_FILE">
expj.KM0040010.KM0040010form1.DOWNLOAD_FILE = {};
expj.KM0040010.KM0040010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/DOWNLOAD_FILE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'DOWNLOAD_FILE', this);
  });
  expj.KM0040010.KM0040010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-C5_PROJECT_STAT">
expj.KM0040010.KM0040010form1.C5_PROJECT_STAT = {};
expj.KM0040010.KM0040010form1.C5_PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/C5_PROJECT_STAT.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.C5_PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-C5_PROJECT_STAT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'C5_PROJECT_STAT', this, 'CheckBox');
    }
  });
  expj.KM0040010.KM0040010form1.C5_PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.C5_PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/C5_PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-C5_PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="C5_PROJECT_STAT" value="true" <%= ("true".equals(TypeConverter.convert(aKM0040010Struct.getC5_PROJECT_STAT())) || "1".equals(TypeConverter.convert(aKM0040010Struct.getC5_PROJECT_STAT())))?"checked=\"checked\"":"" %>  class="KM0040010-focus-move" id="expj-KM0040010-KM0040010form1-C5_PROJECT_STAT"><label for="expj-KM0040010-KM0040010form1-C5_PROJECT_STAT"><%=CoreTools.getRBString("Expj.Cmt6689",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_DATE",rb)%></span><!-- 見積日 --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE">
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE = {};
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/FROM_ESTIMATE_DATE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'FROM_ESTIMATE_DATE', this);
  });
  expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/FROM_ESTIMATE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE" name="FROM_ESTIMATE_DATE" class="KM0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getFROM_ESTIMATE_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE_CALENDAR">
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KM0040010form1/FROM_ESTIMATE_DATE"
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR.onClick0 = function () {
  console.log('FROM_ESTIMATE_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KM0040010','KM0040010form1','_KM0040010form1/FROM_ESTIMATE_DATE');
};
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR['onClick' + i])) {
        expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'FROM_ESTIMATE_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0040010','KM0040010form1','_KM0040010form1/FROM_ESTIMATE_DATE');
  expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/FROM_ESTIMATE_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-FROM_ESTIMATE_DATE_CALENDAR" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-TO_ESTIMATE_DATE">
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE = {};
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/TO_ESTIMATE_DATE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-TO_ESTIMATE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'TO_ESTIMATE_DATE', this);
  });
  expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/TO_ESTIMATE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-TO_ESTIMATE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0040010-KM0040010form1-TO_ESTIMATE_DATE" name="TO_ESTIMATE_DATE" class="KM0040010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getTO_ESTIMATE_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-TO_ESTIMATE_DATE_CALENDAR">
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_KM0040010form1/TO_ESTIMATE_DATE"
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR.onClick0 = function () {
  console.log('TO_ESTIMATE_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('KM0040010','KM0040010form1','_KM0040010form1/TO_ESTIMATE_DATE');
};
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR['onClick' + i])) {
        expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-TO_ESTIMATE_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'TO_ESTIMATE_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0040010','KM0040010form1','_KM0040010form1/TO_ESTIMATE_DATE');
  expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/TO_ESTIMATE_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-TO_ESTIMATE_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0040010-KM0040010form1-TO_ESTIMATE_DATE_CALENDAR" class="KM0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:68px;"></div><!--/td-->
<div class="div-td" style="width:80px;"></div><!--/td-->
<input type="hidden" id="expj-KM0040010-KM0040010form1-TXT_FILE" name="TXT_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0040010Struct.getTXT_FILE()) %>">
<script class="expj-script-KM0040010-KM0040010form1-TXT_FILE">
expj.KM0040010.KM0040010form1.TXT_FILE = {};
expj.KM0040010.KM0040010form1.TXT_FILE.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/TXT_FILE.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.TXT_FILE.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-TXT_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0040010', 'KM0040010form1', 'TXT_FILE', this);
  });
  expj.KM0040010.KM0040010form1.TXT_FILE.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.TXT_FILE.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/TXT_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-TXT_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010form1-C6_PROJECT_STAT">
expj.KM0040010.KM0040010form1.C6_PROJECT_STAT = {};
expj.KM0040010.KM0040010form1.C6_PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0040010form1/C6_PROJECT_STAT.onDecision');
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
  expj.KM0040010.executeAllOnDecision();
};
expj.KM0040010.KM0040010form1.C6_PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010form1-C6_PROJECT_STAT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010form1', 'C6_PROJECT_STAT', this, 'CheckBox');
    }
  });
  expj.KM0040010.KM0040010form1.C6_PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0040010.KM0040010form1.C6_PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0040010form1/C6_PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010form1-C6_PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="C6_PROJECT_STAT" value="true" <%= ("true".equals(TypeConverter.convert(aKM0040010Struct.getC6_PROJECT_STAT())) || "1".equals(TypeConverter.convert(aKM0040010Struct.getC6_PROJECT_STAT())))?"checked=\"checked\"":"" %>  class="KM0040010-focus-move" id="expj-KM0040010-KM0040010form1-C6_PROJECT_STAT"><label for="expj-KM0040010-KM0040010form1-C6_PROJECT_STAT"><%=CoreTools.getRBString("Expj.Cmt6690",rb)%></label></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KM0040010-KM0040010button1">
expj.KM0040010.KM0040010button1 = {};
expj.KM0040010.KM0040010button1.executeAllOnDecision = function () {
  console.log('execute KM0040010button1.onDecision');
};
expj.KM0040010.KM0040010button1.executeOnLoad = function () {
  expj.KM0040010.KM0040010button1.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button1.executePScriptOnLoad = function () {
  console.log('execute KM0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0040010-KM0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0040010-KM0040010button1-Select">
expj.KM0040010.KM0040010button1.Select = {};
// script1="onClick;1;CHK;_KM0040010form1/FROM_ASSUME_DLV_DATE[neq][and]_KM0040010form1/TO_ASSUME_DLV_DATE[neq][and]_KM0040010form1/TO_ASSUME_DLV_DATE[lt]_KM0040010form1/FROM_ASSUME_DLV_DATE@!ZZ05101"
expj.KM0040010.KM0040010button1.Select.onClick1 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/FROM_ASSUME_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/TO_ASSUME_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/TO_ASSUME_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/FROM_ASSUME_DLV_DATE')))) {
expj.common.pscript.viewErrorMessage('KM0040010', 'KM0040010button1', 'ZZ05101');
}
};
// script2="onClick;2;CHK;_KM0040010form1/FROM_ESTIMATE_DATE[neq][and]_KM0040010form1/TO_ESTIMATE_DATE[neq][and]_KM0040010form1/TO_ESTIMATE_DATE[lt]_KM0040010form1/FROM_ESTIMATE_DATE@!ZZ05101"
expj.KM0040010.KM0040010button1.Select.onClick2 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/FROM_ESTIMATE_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/TO_ESTIMATE_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/TO_ESTIMATE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/FROM_ESTIMATE_DATE')))) {
expj.common.pscript.viewErrorMessage('KM0040010', 'KM0040010button1', 'ZZ05101');
}
};
// script3="onClick;3;CHK;_KM0040010form1/FROM_VEND_DATE[neq][and]_KM0040010form1/TO_VEND_DATE[neq][and]_KM0040010form1/TO_VEND_DATE[lt]_KM0040010form1/FROM_VEND_DATE@!ZZ05101"
expj.KM0040010.KM0040010button1.Select.onClick3 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/FROM_VEND_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/TO_VEND_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/TO_VEND_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010button1', '_KM0040010form1/FROM_VEND_DATE')))) {
expj.common.pscript.viewErrorMessage('KM0040010', 'KM0040010button1', 'ZZ05101');
}
};
// script4="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0040010form1/*@KM0040010Servlet"
expj.KM0040010.KM0040010button1.Select.onClick4 = function () {
  console.log('Select script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0040010', 'KM0040010button1', '_KM0040010form1/*', 'KM0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0040010', response);
expj.common.updateBusinessScreenTab('KM0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0040010.KM0040010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010button1.Select['onClick' + i])) {
        expj.KM0040010.KM0040010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010button1.Select.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010button1.Select.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010button1', 'Select', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010button1.Select.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KM0040010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0040010-KM0040010button1-Select" name="Select" class="KM0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0040010-KM0040010view1">
expj.KM0040010.KM0040010view1 = {};
// script1="onClick;0;CHK;_KM0040010view1/I_PROJECT_STAT[eq]1[or]_KM0040010view1/I_PROJECT_STAT[eq]8@*0"
expj.KM0040010.KM0040010view1.onClick0 = function () {
  console.log('KM0040010view1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_KM0040010view1/I_PROJECT_STAT[eq]2@*1"
expj.KM0040010.KM0040010view1.onClick1 = function () {
  console.log('KM0040010view1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_KM0040010view1/I_PROJECT_STAT[eq]2@*2"
expj.KM0040010.KM0040010view1.onClick2 = function () {
  console.log('KM0040010view1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_KM0040010view1/I_PROJECT_STAT[eq]9@*3"
expj.KM0040010.KM0040010view1.onClick3 = function () {
  console.log('KM0040010view1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_KM0040010view1/I_PROJECT_STAT[eq]1[or]_KM0040010view1/I_PROJECT_STAT[eq]2[or]_KM0040010view1/I_PROJECT_STAT[eq]3[or]_KM0040010view1/I_PROJECT_STAT[eq]4[or]_KM0040010view1/I_PROJECT_STAT[eq]8[or]_KM0040010view1/I_PROJECT_STAT[eq]9@*4"
expj.KM0040010.KM0040010view1.onClick4 = function () {
  console.log('KM0040010view1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '8') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_KM0040010view1/I_PROJECT_STAT[eq]3@*5"
expj.KM0040010.KM0040010view1.onClick5 = function () {
  console.log('KM0040010view1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_KM0040010view1/I_PROJECT_STAT[eq]3@*6"
expj.KM0040010.KM0040010view1.onClick6 = function () {
  console.log('KM0040010view1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_KM0040010view1/I_PROJECT_STAT[eq]4@*7"
expj.KM0040010.KM0040010view1.onClick7 = function () {
  console.log('KM0040010view1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_KM0040010view1/I_PROJECT_STAT[eq]9@*8"
expj.KM0040010.KM0040010view1.onClick8 = function () {
  console.log('KM0040010view1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="onClick;9;CHK;_KM0040010view1/I_PROJECT_STAT[eq]9@*9"
expj.KM0040010.KM0040010view1.onClick9 = function () {
  console.log('KM0040010view1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0040010', 'KM0040010view1', '_KM0040010view1/I_PROJECT_STAT'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="child;0;MASK;_KM0040010button2/GoSub2,_KM0040010button2/GoSub3"
expj.KM0040010.KM0040010view1.child0 = function () {
  console.log('KM0040010view1 script11');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub2');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub3');
};
// script12="child;1;MASK;_KM0040010button2/GoSub2"
expj.KM0040010.KM0040010view1.child1 = function () {
  console.log('KM0040010view1 script12');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub2');
};
// script13="child;2;UNMASK;_KM0040010button2/GoSub3"
expj.KM0040010.KM0040010view1.child2 = function () {
  console.log('KM0040010view1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub3');
};
// script14="child;3;MASK;_KM0040010button2/GoSub3"
expj.KM0040010.KM0040010view1.child3 = function () {
  console.log('KM0040010view1 script14');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub3');
};
// script15="child;4;UNMASK;_KM0040010button2/GoSub1"
expj.KM0040010.KM0040010view1.child4 = function () {
  console.log('KM0040010view1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub1');
};
// script16="child;5;MASK;_KM0040010button2/GoSub2"
expj.KM0040010.KM0040010view1.child5 = function () {
  console.log('KM0040010view1 script16');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub2');
};
// script17="child;6;UNMASK;_KM0040010button2/GoSub3"
expj.KM0040010.KM0040010view1.child6 = function () {
  console.log('KM0040010view1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub3');
};
// script18="child;7;UNMASK;_KM0040010button2/GoSub1,_KM0040010button2/GoSub2,_KM0040010button2/GoSub3"
expj.KM0040010.KM0040010view1.child7 = function () {
  console.log('KM0040010view1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub1');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub2');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub3');
};
// script19="child;8;UNMASK;_KM0040010button2/GoSub2"
expj.KM0040010.KM0040010view1.child8 = function () {
  console.log('KM0040010view1 script19');
expj.common.pscript.setUnMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub2');
};
// script20="child;9;MASK;_KM0040010button2/GoSub3"
expj.KM0040010.KM0040010view1.child9 = function () {
  console.log('KM0040010view1 script20');
expj.common.pscript.setMaskToReferenceComponent('KM0040010', 'KM0040010view1', '_KM0040010button2/GoSub3');
};
expj.KM0040010.KM0040010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 9; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010view1['onClick' + i])) {
        expj.KM0040010.KM0040010view1['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010view1.executeAllOnDecision = function () {
  console.log('execute KM0040010view1.onDecision');
};
expj.KM0040010.KM0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KM0040010view1", "expj.KM0040010.KM0040010view1.executeAllOnClick");
%>
  expj.KM0040010.KM0040010view1.executePScriptOnLoad();
};

expj.KM0040010.KM0040010view1.executePScriptOnLoad = function () {
  console.log('execute KM0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KM0040010-KM0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String KM0040010view1_Id = "KM0040010view1";
 String KM0040010view1_select = "single";
 String KM0040010view1_sortable = "true";
 String KM0040010view1_resize = "true";
 String KM0040010view1_scroll = "true";
 StringBuffer KM0040010view1_HB = new StringBuffer();
 StringBuffer KM0040010view1_DB = new StringBuffer();
%>
<%
 KM0040010view1_select = "single";
 KM0040010view1_sortable = "true";
 KM0040010view1_resize = "true";
 KM0040010view1_scroll = "true";
%>
<%
 KM0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
%>
     
<%
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROJECT_CD",rb))).append("', 'name':'PROJECT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_NO",rb))).append("', 'name':'ESTIMATE_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROJECT_STAT",rb))).append("', 'name':'PROJECT_STAT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROJECT_NAME",rb))).append("', 'name':'PROJECT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACCURACY",rb))).append("', 'name':'ACCURACY', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ASSUME_DLV_DATE",rb))).append("', 'name':'ASSUME_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ASSUME_AMOUNT",rb))).append("', 'name':'ASSUME_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_AMOUNT",rb))).append("', 'name':'ESTIMATE_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ASSUME_AMOUNT_EXCH_RATES",rb))).append("', 'name':'ASSUME_AMOUNT_EXCH_RATES', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_AMOUNT_JPN",rb))).append("', 'name':'ESTIMATE_AMOUNT_JPN', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_DATE",rb))).append("', 'name':'VEND_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_CD",rb))).append("', 'name':'CUST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_NAME",rb))).append("', 'name':'CUST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_CD",rb))).append("', 'name':'DLV_LOC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_LOC_NAME",rb))).append("', 'name':'DLV_LOC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PJ_ORG_CD",rb))).append("', 'name':'PJ_ORG_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ORG_NAME_1",rb))).append("', 'name':'ORG_NAME_1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PJ_USER_CD",rb))).append("', 'name':'PJ_USER_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.USER_NAME_1",rb))).append("', 'name':'USER_NAME_1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS1",rb))).append("', 'name':'REMARKS1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS2",rb))).append("', 'name':'REMARKS2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS3",rb))).append("', 'name':'REMARKS3', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS4",rb))).append("', 'name':'REMARKS4', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS5",rb))).append("', 'name':'REMARKS5', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_STAT",rb))).append("', 'name':'ESTIMATE_STAT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_DATE",rb))).append("', 'name':'ESTIMATE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'ES_COMMET1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt5934",rb))).append("', 'name':'ES_COMMET2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ES_COMMET3",rb))).append("', 'name':'ES_COMMET3', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ES_COMMET4",rb))).append("', 'name':'ES_COMMET4', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ES_COMMET5",rb))).append("', 'name':'ES_COMMET5', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ES_ORG_CD",rb))).append("', 'name':'ES_ORG_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ORG_NAME_2",rb))).append("', 'name':'ORG_NAME_2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ES_USER_CD",rb))).append("', 'name':'ES_USER_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.USER_NAME_2",rb))).append("', 'name':'USER_NAME_2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESREMARK1",rb))).append("', 'name':'ESREMARK1', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESREMARK2",rb))).append("', 'name':'ESREMARK2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESREMARK3",rb))).append("', 'name':'ESREMARK3', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
KM0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'I_PROJECT_STAT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0040010view1_sortable).append("}").append(",");
%>
<%
 int aKM0040010StructLength = aKM0040010Control.getListsize();
 final KM0040010Struct structBackup = aKM0040010Struct;
 aKM0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKM0040010StructLength; ++loopCount) {
  if((aKM0040010Struct = (KM0040010Struct) aKM0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKM0040010Struct", aKM0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KM0040010view1_DB.append("[");
 KM0040010view1_DB.append(loopCount);
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-PROJECT_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-PROJECT_CD\" data-name=\"PROJECT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getPROJECT_CD())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESTIMATE_NO-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESTIMATE_NO\" data-name=\"ESTIMATE_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESTIMATE_NO())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-PROJECT_STAT-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-PROJECT_STAT\" data-name=\"PROJECT_STAT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getPROJECT_STAT())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-PROJECT_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-PROJECT_NAME\" data-name=\"PROJECT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getPROJECT_NAME())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ACCURACY-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ACCURACY\" data-name=\"ACCURACY\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getACCURACY())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ASSUME_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ASSUME_DLV_DATE\" data-name=\"ASSUME_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getASSUME_DLV_DATE())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ASSUME_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ASSUME_AMOUNT\" data-name=\"ASSUME_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0040010Struct.getASSUME_AMOUNT())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESTIMATE_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESTIMATE_AMOUNT\" data-name=\"ESTIMATE_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESTIMATE_AMOUNT())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-CUR_UNIT\" data-name=\"CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getCUR_UNIT())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ASSUME_AMOUNT_EXCH_RATES-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ASSUME_AMOUNT_EXCH_RATES\" data-name=\"ASSUME_AMOUNT_EXCH_RATES\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0040010Struct.getASSUME_AMOUNT_EXCH_RATES())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESTIMATE_AMOUNT_JPN-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESTIMATE_AMOUNT_JPN\" data-name=\"ESTIMATE_AMOUNT_JPN\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESTIMATE_AMOUNT_JPN())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-VEND_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-VEND_DATE\" data-name=\"VEND_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getVEND_DATE())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-CUST_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-CUST_CD\" data-name=\"CUST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getCUST_CD())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-CUST_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-CUST_NAME\" data-name=\"CUST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getCUST_NAME())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-DLV_LOC_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-DLV_LOC_CD\" data-name=\"DLV_LOC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getDLV_LOC_CD())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-DLV_LOC_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-DLV_LOC_NAME\" data-name=\"DLV_LOC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getDLV_LOC_NAME())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-PJ_ORG_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-PJ_ORG_CD\" data-name=\"PJ_ORG_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getPJ_ORG_CD())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ORG_NAME_1-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ORG_NAME_1\" data-name=\"ORG_NAME_1\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getORG_NAME_1())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-PJ_USER_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-PJ_USER_CD\" data-name=\"PJ_USER_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getPJ_USER_CD())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-USER_NAME_1-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-USER_NAME_1\" data-name=\"USER_NAME_1\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getUSER_NAME_1())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-REMARKS1-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-REMARKS1\" data-name=\"REMARKS1\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getREMARKS1())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-REMARKS2-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-REMARKS2\" data-name=\"REMARKS2\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getREMARKS2())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-REMARKS3-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-REMARKS3\" data-name=\"REMARKS3\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getREMARKS3())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-REMARKS4-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-REMARKS4\" data-name=\"REMARKS4\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getREMARKS4())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-REMARKS5-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-REMARKS5\" data-name=\"REMARKS5\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getREMARKS5())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESTIMATE_STAT-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESTIMATE_STAT\" data-name=\"ESTIMATE_STAT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESTIMATE_STAT())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESTIMATE_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESTIMATE_DATE\" data-name=\"ESTIMATE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESTIMATE_DATE())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ES_COMMET1-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ES_COMMET1\" data-name=\"ES_COMMET1\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getES_COMMET1())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ES_COMMET2-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ES_COMMET2\" data-name=\"ES_COMMET2\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getES_COMMET2())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ES_COMMET3-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ES_COMMET3\" data-name=\"ES_COMMET3\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getES_COMMET3())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ES_COMMET4-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ES_COMMET4\" data-name=\"ES_COMMET4\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getES_COMMET4())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ES_COMMET5-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ES_COMMET5\" data-name=\"ES_COMMET5\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getES_COMMET5())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ES_ORG_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ES_ORG_CD\" data-name=\"ES_ORG_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getES_ORG_CD())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ORG_NAME_2-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ORG_NAME_2\" data-name=\"ORG_NAME_2\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getORG_NAME_2())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ES_USER_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ES_USER_CD\" data-name=\"ES_USER_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getES_USER_CD())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-USER_NAME_2-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-USER_NAME_2\" data-name=\"USER_NAME_2\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getUSER_NAME_2())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESREMARK1-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESREMARK1\" data-name=\"ESREMARK1\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESREMARK1())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESREMARK2-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESREMARK2\" data-name=\"ESREMARK2\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESREMARK2())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-ESREMARK3-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-ESREMARK3\" data-name=\"ESREMARK3\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getESREMARK3())).append("</span>'");
 KM0040010view1_DB.append(",").append("'<span id=\"expj-KM0040010-KM0040010view1-I_PROJECT_STAT-").append(loopCount).append("\" class=\"expj-label expj-KM0040010-KM0040010view1-I_PROJECT_STAT\" data-name=\"I_PROJECT_STAT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0040010Struct.getI_PROJECT_STAT())).append("</span>'");
 KM0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKM0040010StructLength) {
   KM0040010view1_DB.append(",");
  }
 }
 aKM0040010Struct = structBackup;
 viewIdList.add(KM0040010view1_Id);
 viewSelectList.add(KM0040010view1_select);
 viewResizeList.add(KM0040010view1_resize);
 viewScrollList.add(KM0040010view1_scroll);
 viewHeaderDataList.add(KM0040010view1_HB);
 viewBodyDataList.add(KM0040010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:315px;"><script class="expj-script-KM0040010-KM0040010button2">
expj.KM0040010.KM0040010button2 = {};
expj.KM0040010.KM0040010button2.executeAllOnDecision = function () {
  console.log('execute KM0040010button2.onDecision');
};
expj.KM0040010.KM0040010button2.executeOnLoad = function () {
  expj.KM0040010.KM0040010button2.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button2.executePScriptOnLoad = function () {
  console.log('execute KM0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0040010-KM0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0040010-KM0040010button2-GoSub1">
expj.KM0040010.KM0040010button2.GoSub1 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KM0040010view1/+@KM0020010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.KM0040010.KM0040010button2.GoSub1.onClick0 = function () {
  console.log('GoSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0040010', 'KM0040010button2', '_KM0040010view1/+', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KM0020010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'KM0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0040010.KM0040010button2.GoSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010button2.GoSub1['onClick' + i])) {
        expj.KM0040010.KM0040010button2.GoSub1['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010button2.GoSub1.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010button2.GoSub1.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010button2-GoSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010button2', 'GoSub1', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010button2.GoSub1.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button2.GoSub1.executePScriptOnLoad = function () {
  console.log('execute KM0040010button2/GoSub1.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010button2-GoSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0040010-KM0040010button2-GoSub1" name="GoSub1" class="KM0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnEstimatedReg",rb)%></button><!-- 見積登録ボタン --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010button2-GoSub2">
expj.KM0040010.KM0040010button2.GoSub2 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KM0040010view1/+@KM0050010Servlet,<%=contextNo%>,<%=su1.getScreenName()%>,<%=su1.getScreenID()%>"
expj.KM0040010.KM0040010button2.GoSub2.onClick0 = function () {
  console.log('GoSub2 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0040010', 'KM0040010button2', '_KM0040010view1/+', 'KM0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su1.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KM0050010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KM0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su1.getScreenName()%>', contents, 'KM0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0040010.KM0040010button2.GoSub2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010button2.GoSub2['onClick' + i])) {
        expj.KM0040010.KM0040010button2.GoSub2['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010button2.GoSub2.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010button2.GoSub2.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010button2-GoSub2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010button2', 'GoSub2', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010button2.GoSub2.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button2.GoSub2.executePScriptOnLoad = function () {
  console.log('execute KM0040010button2/GoSub2.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010button2-GoSub2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0040010-KM0040010button2-GoSub2" name="GoSub2" class="KM0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCaseProgress",rb)%></button><!-- 案件進捗ボタン --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010button2-GoSub3">
expj.KM0040010.KM0040010button2.GoSub3 = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_KM0040010view1/+@KM0030010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.KM0040010.KM0040010button2.GoSub3.onClick0 = function () {
  console.log('GoSub3 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0040010', 'KM0040010button2', '_KM0040010view1/+', 'KM0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('KM0030010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'KM0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'KM0040010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0040010.KM0040010button2.GoSub3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010button2.GoSub3['onClick' + i])) {
        expj.KM0040010.KM0040010button2.GoSub3['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010button2.GoSub3.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010button2.GoSub3.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010button2-GoSub3').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010button2', 'GoSub3', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010button2.GoSub3.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button2.GoSub3.executePScriptOnLoad = function () {
  console.log('execute KM0040010button2/GoSub3.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010button2-GoSub3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0040010-KM0040010button2-GoSub3" name="GoSub3" class="KM0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCaseOrderReg",rb)%></button><!-- 案件受注登録ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 643px);"></div><!--/td-->
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
<span class="version">KM0040010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-KM0040010-KM0040010button0">
expj.KM0040010.KM0040010button0 = {};
expj.KM0040010.KM0040010button0.executeAllOnDecision = function () {
  console.log('execute KM0040010button0.onDecision');
};
expj.KM0040010.KM0040010button0.executeOnLoad = function () {
  expj.KM0040010.KM0040010button0.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button0.executePScriptOnLoad = function () {
  console.log('execute KM0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0040010-KM0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0040010-KM0040010button0-CSVOut">
expj.KM0040010.KM0040010button0.CSVOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0040010form1/*@KM0040010Servlet,,$ZZ07011"
expj.KM0040010.KM0040010button0.CSVOut.onClick0 = function () {
  console.log('CSVOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0040010', 'KM0040010button0', '_KM0040010form1/*', 'KM0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0040010', response);
expj.common.updateBusinessScreenTab('KM0040010', contents);
};
expj.common.pscript.callConfirm('KM0040010', 'KM0040010button0', 'ZZ07011', okEvent);
};
expj.KM0040010.KM0040010button0.CSVOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010button0.CSVOut['onClick' + i])) {
        expj.KM0040010.KM0040010button0.CSVOut['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010button0.CSVOut.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010button0.CSVOut.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010button0-CSVOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010button0', 'CSVOut', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010button0.CSVOut.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button0.CSVOut.executePScriptOnLoad = function () {
  console.log('execute KM0040010button0/CSVOut.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010button0-CSVOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0040010-KM0040010button0-CSVOut" name="CSVOut" class="KM0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010button0-Clear">
expj.KM0040010.KM0040010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KM0040010Servlet,,$ZZ07008"
expj.KM0040010.KM0040010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0040010', 'KM0040010button0', '', 'KM0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0040010', response);
expj.common.updateBusinessScreenTab('KM0040010', contents);
};
expj.common.pscript.callConfirm('KM0040010', 'KM0040010button0', 'ZZ07008', okEvent);
};
expj.KM0040010.KM0040010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010button0.Clear['onClick' + i])) {
        expj.KM0040010.KM0040010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010button0.Clear.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010button0.Clear.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010button0', 'Clear', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010button0.Clear.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KM0040010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0040010-KM0040010button0-Clear" name="Clear" class="KM0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KM0040010-KM0040010button0-Close">
expj.KM0040010.KM0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KM0040010.KM0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KM0040010');
};
expj.KM0040010.KM0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0040010.KM0040010button0.Close['onClick' + i])) {
        expj.KM0040010.KM0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KM0040010.KM0040010button0.Close.executeAllOnDecision = function () {
};
expj.KM0040010.KM0040010button0.Close.executeOnLoad = function () {
  $('#expj-KM0040010-KM0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0040010', 'KM0040010button0', 'Close', this, 'Button');
    }
  });
  expj.KM0040010.KM0040010button0.Close.executePScriptOnLoad();
};

expj.KM0040010.KM0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KM0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KM0040010-KM0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0040010-KM0040010button0-Close" name="Close" class="KM0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KM0040010 (END)-->
<%
MessageStruct msgStruct = aKM0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KM0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KM0040010)) {
  expj.common.treeInstanceMap.KM0040010 = {};
}
expj.common.treeInstanceMap.KM0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KM0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KM0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KM0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KM0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KM0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KM0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KM0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KM0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0040010)) {
  expj.common.detailDialogMap.KM0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KM0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.KM0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KM0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KM0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KM0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KM0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KM0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KM0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KM0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KM0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KM0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KM0040010)) {
  expj.common.viewInstanceMap.KM0040010 = {};
}
expj.common.viewInstanceMap.KM0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.KM0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KM0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KM0040010.<%=viewId %>.init = function () {
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
    expj.KM0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KM0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KM0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KM0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KM0040010_init">
/**
 * KM0040010用のロード完了時初期化関数
 */
expj.KM0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KM0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KM0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KM0040010');
  expj.common.calendarInstanceMap.KM0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KM0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KM0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KM0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KM0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KM0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KM0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KM0040010-<%=detailId %>');
<%
 }
%>
  try{expj.KM0040010.KM0040010form1.IN_PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.PeekerIN_PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.CHECK_1.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.IN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.PeekerIN_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.C1_PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.IN_PJ_USER_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.PeekerIN_PJ_USER_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.IN_PJ_USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.C2_PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.IN_ES_USER_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.PeekerES_USER_CD.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.IN_ES_USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.C3_PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.FROM_VEND_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.FROM_VEND_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.TO_VEND_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.TO_VEND_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.C4_PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.FROM_ASSUME_DLV_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.TO_ASSUME_DLV_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.C5_PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.FROM_ESTIMATE_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.TO_ESTIMATE_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.TXT_FILE.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.C6_PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button2.GoSub1.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button2.GoSub2.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button2.GoSub3.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button0.CSVOut.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010form1.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button1.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010view1.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button2.executeOnLoad();}catch(e){};
  try{expj.KM0040010.KM0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KM0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KM0040010', 'KM0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KM0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KM0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.KM0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KM0040010', '<%=request.getContextPath() %>');
};

/**
 * KM0040010の全体onDecision処理
 */
expj.KM0040010.executeAllOnDecision = function () {
  expj.KM0040010.KM0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KM0040010_console">
expj.KM0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>