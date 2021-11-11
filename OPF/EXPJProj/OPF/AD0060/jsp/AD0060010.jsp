<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:31:33 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0060\AD0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0060.*" %>
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
<jsp:useBean id="aAD0060010Control" class="com.nec.jp.orteus.metamorBase.AD0060.AD0060010Control" scope="request"/>
<jsp:useBean id="aAD0060010Struct" class="com.nec.jp.orteus.metamorBase.AD0060.AD0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

現品票両替発行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0060/jsp/AD0060010.jsp,v $
$Author: geng-jia $	
$Revision: 1.5 $ $Date: 2017/02/22 02:04:52 $
********************************************************* --%>
<html>
<head>
<title>現品票両替発行</title>
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
<script class="expj-script-AD0060010_init">
  // AD0060010名前空間
  expj.AD0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0060010" data-screen="AD0060010" data-newdata="<%=aAD0060010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
<!--one start -->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

<!--one end -->

<!--two start -->
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
              <script class="expj-script-AD0060010-AD0060010form1">
expj.AD0060010.AD0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AD0060010.AD0060010form1.onLoad0 = function () {
  console.log('AD0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AD0060010.AD0060010form1.onDecision0 = function () {
  console.log('AD0060010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0060010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?AD0060010form1/IDENT_CARD_CTL_NO[eq]SAME[and]?AD0060010form1/*[eq]NORMAL@*4,*3"
expj.AD0060010.AD0060010form1.onDecision1 = function () {
  console.log('AD0060010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form1', '?AD0060010form1/IDENT_CARD_CTL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form1', '?AD0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;0;UNMASK;_AD0060010button1/select"
expj.AD0060010.AD0060010form1.child0 = function () {
  console.log('AD0060010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AD0060010', 'AD0060010form1', '_AD0060010button1/select');
};
// script5="child;1;MASK;_AD0060010button1/select"
expj.AD0060010.AD0060010form1.child1 = function () {
  console.log('AD0060010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AD0060010', 'AD0060010form1', '_AD0060010button1/select');
};
// script6="child;2;UNMASK;_AD0060010button2/Print"
expj.AD0060010.AD0060010form1.child2 = function () {
  console.log('AD0060010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AD0060010', 'AD0060010form1', '_AD0060010button2/Print');
};
// script7="child;3;MASK;_AD0060010button2/Print"
expj.AD0060010.AD0060010form1.child3 = function () {
  console.log('AD0060010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AD0060010', 'AD0060010form1', '_AD0060010button2/Print');
};
// script8="child;4;CHKRQ;A@*2,*3"
expj.AD0060010.AD0060010form1.child4 = function () {
  console.log('AD0060010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AD0060010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
expj.AD0060010.AD0060010form1.executeAllOnDecision = function () {
  console.log('execute AD0060010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0060010.AD0060010form1['onDecision' + i])) {
        expj.AD0060010.AD0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0060010.AD0060010form1.executeOnLoad = function () {
  expj.AD0060010.AD0060010form1.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form1.executePScriptOnLoad = function () {
  console.log('execute AD0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0060010.AD0060010form1['onLoad' + i])) {
      expj.AD0060010.AD0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0060010-AD0060010form1" action="AD0060010Servlet" name="AD0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0060010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.IDENT_CARD_CTL_NO",rb)%></span><!-- 現品票管理番号 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form1-IDENT_CARD_CTL_NO">
expj.AD0060010.AD0060010form1.IDENT_CARD_CTL_NO = {};
expj.AD0060010.AD0060010form1.IDENT_CARD_CTL_NO.executeAllOnDecision = function () {
  console.log('execute AD0060010form1/IDENT_CARD_CTL_NO.onDecision');
  expj.AD0060010.AD0060010form1.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form1.IDENT_CARD_CTL_NO.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form1-IDENT_CARD_CTL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form1', 'IDENT_CARD_CTL_NO', this);
  });
  expj.AD0060010.AD0060010form1.IDENT_CARD_CTL_NO.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form1.IDENT_CARD_CTL_NO.executePScriptOnLoad = function () {
  console.log('execute AD0060010form1/IDENT_CARD_CTL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form1-IDENT_CARD_CTL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form1-IDENT_CARD_CTL_NO" name="IDENT_CARD_CTL_NO" class="AD0060010-focus-move  required-value expj-AD0060010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getIDENT_CARD_CTL_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form1-PeekerIOrgCd">
expj.AD0060010.AD0060010form1.PeekerIOrgCd = {};
// script1="onClick;0;PEEKER;_AD0060010form1/IDENT_CARD_CTL_NO@<%=contextNo%>"
expj.AD0060010.AD0060010form1.PeekerIOrgCd.onClick0 = function () {
  console.log('PeekerIOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0060010';
var parameterValues = 'PeekerIOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0060010', 'PeekerIOrgCd', 'SQLPARAM_1', '<%=aAD0060010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%MP_IDENT_CARD_CTL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0060010form1/IDENT_CARD_CTL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0060010.AD0060010form1.PeekerIOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0060010.AD0060010form1.PeekerIOrgCd['onClick' + i])) {
        expj.AD0060010.AD0060010form1.PeekerIOrgCd['onClick' + i]();
      }
    }
  }
};
expj.AD0060010.AD0060010form1.PeekerIOrgCd.executeAllOnDecision = function () {
};
expj.AD0060010.AD0060010form1.PeekerIOrgCd.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form1-PeekerIOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0060010', 'AD0060010form1', 'PeekerIOrgCd', this, 'Button');
    }
  });
  expj.AD0060010.AD0060010form1.PeekerIOrgCd.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form1.PeekerIOrgCd.executePScriptOnLoad = function () {
  console.log('execute AD0060010form1/PeekerIOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form1-PeekerIOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0060010-AD0060010form1-PeekerIOrgCd" class="AD0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0060010-AD0060010button1">
expj.AD0060010.AD0060010button1 = {};
expj.AD0060010.AD0060010button1.executeAllOnDecision = function () {
  console.log('execute AD0060010button1.onDecision');
};
expj.AD0060010.AD0060010button1.executeOnLoad = function () {
  expj.AD0060010.AD0060010button1.executePScriptOnLoad();
};

expj.AD0060010.AD0060010button1.executePScriptOnLoad = function () {
  console.log('execute AD0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0060010-AD0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0060010-AD0060010button1-select">
expj.AD0060010.AD0060010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0060010form1/*@AD0060010Servlet"
expj.AD0060010.AD0060010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0060010', 'AD0060010button1', '_AD0060010form1/*', 'AD0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0060010', response);
expj.common.updateBusinessScreenTab('AD0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0060010.AD0060010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0060010.AD0060010button1.select['onClick' + i])) {
        expj.AD0060010.AD0060010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AD0060010.AD0060010button1.select.executeAllOnDecision = function () {
};
expj.AD0060010.AD0060010button1.select.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0060010', 'AD0060010button1', 'select', this, 'Button');
    }
  });
  expj.AD0060010.AD0060010button1.select.executePScriptOnLoad();
};

expj.AD0060010.AD0060010button1.select.executePScriptOnLoad = function () {
  console.log('execute AD0060010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0060010-AD0060010button1-select" name="select" class="AD0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--two end --><!--three start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--three end --><!--four start --><div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0060010-AD0060010form2">
expj.AD0060010.AD0060010form2 = {};
expj.AD0060010.AD0060010form2.executeAllOnDecision = function () {
  console.log('execute AD0060010form2.onDecision');
};
expj.AD0060010.AD0060010form2.executeOnLoad = function () {
  expj.AD0060010.AD0060010form2.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0060010-AD0060010form2" action="AD0060010Servlet" name="AD0060010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-OPR_INST_CD">
expj.AD0060010.AD0060010form2.OPR_INST_CD = {};
expj.AD0060010.AD0060010form2.OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/OPR_INST_CD.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'OPR_INST_CD', this);
  });
  expj.AD0060010.AD0060010form2.OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-OPR_INST_CD" name="OPR_INST_CD" class="AD0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getOPR_INST_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0060010-AD0060010form2-T_IDENT_CARD_CTL_NO" name="T_IDENT_CARD_CTL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getT_IDENT_CARD_CTL_NO()) %>">
<script class="expj-script-AD0060010-AD0060010form2-T_IDENT_CARD_CTL_NO">
expj.AD0060010.AD0060010form2.T_IDENT_CARD_CTL_NO = {};
expj.AD0060010.AD0060010form2.T_IDENT_CARD_CTL_NO.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/T_IDENT_CARD_CTL_NO.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.T_IDENT_CARD_CTL_NO.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-T_IDENT_CARD_CTL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'T_IDENT_CARD_CTL_NO', this);
  });
  expj.AD0060010.AD0060010form2.T_IDENT_CARD_CTL_NO.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.T_IDENT_CARD_CTL_NO.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/T_IDENT_CARD_CTL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-T_IDENT_CARD_CTL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PARTIAL_PRD_NO",rb)%></span><!-- 分作回数 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-PARTIAL_PRD_NO">
expj.AD0060010.AD0060010form2.PARTIAL_PRD_NO = {};
expj.AD0060010.AD0060010form2.PARTIAL_PRD_NO.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/PARTIAL_PRD_NO.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.PARTIAL_PRD_NO.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-PARTIAL_PRD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'PARTIAL_PRD_NO', this);
  });
  expj.AD0060010.AD0060010form2.PARTIAL_PRD_NO.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.PARTIAL_PRD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/PARTIAL_PRD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-PARTIAL_PRD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-PARTIAL_PRD_NO" name="PARTIAL_PRD_NO" class="AD0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getPARTIAL_PRD_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-ITEM_CD">
expj.AD0060010.AD0060010form2.ITEM_CD = {};
expj.AD0060010.AD0060010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/ITEM_CD.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'ITEM_CD', this);
  });
  expj.AD0060010.AD0060010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-ITEM_CD" name="ITEM_CD" class="AD0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-ITEM_NAME">
expj.AD0060010.AD0060010form2.ITEM_NAME = {};
expj.AD0060010.AD0060010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/ITEM_NAME.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'ITEM_NAME', this);
  });
  expj.AD0060010.AD0060010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-ITEM_NAME" name="ITEM_NAME" class="AD0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-WS_CD">
expj.AD0060010.AD0060010form2.WS_CD = {};
expj.AD0060010.AD0060010form2.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/WS_CD.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.WS_CD.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'WS_CD', this);
  });
  expj.AD0060010.AD0060010form2.WS_CD.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-WS_CD" name="WS_CD" class="AD0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getWS_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-WS_NAME">
expj.AD0060010.AD0060010form2.WS_NAME = {};
expj.AD0060010.AD0060010form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/WS_NAME.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'WS_NAME', this);
  });
  expj.AD0060010.AD0060010form2.WS_NAME.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-WS_NAME" name="WS_NAME" class="AD0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getWS_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-JOB_ODR_CD">
expj.AD0060010.AD0060010form2.JOB_ODR_CD = {};
expj.AD0060010.AD0060010form2.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/JOB_ODR_CD.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'JOB_ODR_CD', this);
  });
  expj.AD0060010.AD0060010form2.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getJOB_ODR_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-LOT_NO">
expj.AD0060010.AD0060010form2.LOT_NO = {};
expj.AD0060010.AD0060010form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/LOT_NO.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'LOT_NO', this);
  });
  expj.AD0060010.AD0060010form2.LOT_NO.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-LOT_NO" name="LOT_NO" class="AD0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getLOT_NO()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_DATE_3",rb)%></span><!-- 作業日 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-OPR_DATE">
expj.AD0060010.AD0060010form2.OPR_DATE = {};
expj.AD0060010.AD0060010form2.OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/OPR_DATE.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'OPR_DATE', this);
  });
  expj.AD0060010.AD0060010form2.OPR_DATE.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-OPR_DATE" name="OPR_DATE" class="AD0060010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getOPR_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0060010-AD0060010form2-TEMP_IDENT_CARD_QTY" name="TEMP_IDENT_CARD_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getTEMP_IDENT_CARD_QTY()) %>">
<script class="expj-script-AD0060010-AD0060010form2-TEMP_IDENT_CARD_QTY">
expj.AD0060010.AD0060010form2.TEMP_IDENT_CARD_QTY = {};
expj.AD0060010.AD0060010form2.TEMP_IDENT_CARD_QTY.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/TEMP_IDENT_CARD_QTY.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.TEMP_IDENT_CARD_QTY.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-TEMP_IDENT_CARD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'TEMP_IDENT_CARD_QTY', this);
  });
  expj.AD0060010.AD0060010form2.TEMP_IDENT_CARD_QTY.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.TEMP_IDENT_CARD_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/TEMP_IDENT_CARD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-TEMP_IDENT_CARD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.FIRST_IDENT_CARD_QTY",rb)%></span><!-- 初期現品票数量 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-FIRST_IDENT_CARD_QTY">
expj.AD0060010.AD0060010form2.FIRST_IDENT_CARD_QTY = {};
expj.AD0060010.AD0060010form2.FIRST_IDENT_CARD_QTY.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/FIRST_IDENT_CARD_QTY.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.FIRST_IDENT_CARD_QTY.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-FIRST_IDENT_CARD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'FIRST_IDENT_CARD_QTY', this);
  });
  expj.AD0060010.AD0060010form2.FIRST_IDENT_CARD_QTY.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.FIRST_IDENT_CARD_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/FIRST_IDENT_CARD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-FIRST_IDENT_CARD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-FIRST_IDENT_CARD_QTY" name="FIRST_IDENT_CARD_QTY" class="AD0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getFIRST_IDENT_CARD_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0060010-AD0060010form2-ORI_IDENT_CARD_QTY" name="ORI_IDENT_CARD_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getORI_IDENT_CARD_QTY()) %>">
<script class="expj-script-AD0060010-AD0060010form2-ORI_IDENT_CARD_QTY">
expj.AD0060010.AD0060010form2.ORI_IDENT_CARD_QTY = {};
expj.AD0060010.AD0060010form2.ORI_IDENT_CARD_QTY.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/ORI_IDENT_CARD_QTY.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.ORI_IDENT_CARD_QTY.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-ORI_IDENT_CARD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'ORI_IDENT_CARD_QTY', this);
  });
  expj.AD0060010.AD0060010form2.ORI_IDENT_CARD_QTY.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.ORI_IDENT_CARD_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/ORI_IDENT_CARD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-ORI_IDENT_CARD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.IDENT_CARD_QTY",rb)%></span><!-- 現品票数量 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-IDENT_CARD_QTY">
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY = {};
// script1="onDecision;0;CHK;_AD0060010form2/UNIT_QTY_TYP[eq]1@*0,*4"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.onDecision0 = function () {
  console.log('IDENT_CARD_QTY script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/UNIT_QTY_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script2="child;0;CHK;[({_IDENT_CARD_QTY}*10000)%10000][gt]0@*1,*4"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child0 = function () {
  console.log('IDENT_CARD_QTY script2');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY') + '*10000)%10000'), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script3="child;1;CFMPUT;_AD0060010form2/IDENT_CARD_QTY=YES:3,2@AB90001"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child1 = function () {
  console.log('IDENT_CARD_QTY script3');
var yesFunc = function () {
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child3();
};
var noFunc = function () {
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child2();
};
expj.common.pscript.executeConfirmPut('AD0060010', 'AD0060010form2', '_AD0060010form2/IDENT_CARD_QTY', 'AB90001', yesFunc, noFunc);
};
// script4="child;2;SET;_IDENT_CARD_QTY=_ORI_IDENT_CARD_QTY"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child2 = function () {
  console.log('IDENT_CARD_QTY script4');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY', expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_ORI_IDENT_CARD_QTY'));
};
// script5="child;3;SET;_IDENT_CARD_QTY=[({_IDENT_CARD_QTY}-((({_IDENT_CARD_QTY}*10000)%10000)/10000))+1],*4"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child3 = function () {
  console.log('IDENT_CARD_QTY script5');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY', expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY') + '-(((' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY') + '*10000)%10000)/10000))+1'));
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '*4', '');
};
// script6="child;4;CHK;_AD0060010form2/IDENT_CARD_QTY[gt]_AD0060010form2/FIRST_IDENT_CARD_QTY[or]_AD0060010form2/IDENT_CARD_QTY[lte]0@*5,*12"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child4 = function () {
  console.log('IDENT_CARD_QTY script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/IDENT_CARD_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/FIRST_IDENT_CARD_QTY'))) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/IDENT_CARD_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script7="child;5;CHK;_AD0060010form2/IDENT_CARD_QTY[gt]_AD0060010form2/FIRST_IDENT_CARD_QTY@*6,*9"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child5 = function () {
  console.log('IDENT_CARD_QTY script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/IDENT_CARD_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/FIRST_IDENT_CARD_QTY')))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script8="child;6;SET;_TEMP_IDENT_CARD_QTY=_IDENT_CARD_QTY@*7"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child6 = function () {
  console.log('IDENT_CARD_QTY script8');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_TEMP_IDENT_CARD_QTY', expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script9="child;7;SET;_IDENT_CARD_QTY=_ORI_IDENT_CARD_QTY@*8"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child7 = function () {
  console.log('IDENT_CARD_QTY script9');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY', expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_ORI_IDENT_CARD_QTY'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script10="child;8;CHK;_AD0060010form2/TEMP_IDENT_CARD_QTY[gt]_AD0060010form2/FIRST_IDENT_CARD_QTY@!KZ10003"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child8 = function () {
  console.log('IDENT_CARD_QTY script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/TEMP_IDENT_CARD_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/FIRST_IDENT_CARD_QTY')))) {
expj.common.pscript.viewErrorMessage('AD0060010', 'AD0060010form2', 'KZ10003');
}
};
// script11="child;9;SET;_TEMP_IDENT_CARD_QTY=_IDENT_CARD_QTY@*10"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child9 = function () {
  console.log('IDENT_CARD_QTY script11');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_TEMP_IDENT_CARD_QTY', expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script12="child;10;SET;_IDENT_CARD_QTY=_ORI_IDENT_CARD_QTY@*11"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child10 = function () {
  console.log('IDENT_CARD_QTY script12');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY', expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_ORI_IDENT_CARD_QTY'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script13="child;11;CHK;_AD0060010form2/TEMP_IDENT_CARD_QTY[lte]0@!KZ10004"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child11 = function () {
  console.log('IDENT_CARD_QTY script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_AD0060010form2/TEMP_IDENT_CARD_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AD0060010', 'AD0060010form2', 'KZ10004');
}
};
// script14="child;12;SET;_ORI_IDENT_CARD_QTY=_IDENT_CARD_QTY@*13"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child12 = function () {
  console.log('IDENT_CARD_QTY script14');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_ORI_IDENT_CARD_QTY', expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script15="child;13;CHK;[({_IDENT_CARD_QTY}%{_PKG_UNIT_QTY})][eq]0@*14,*15"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child13 = function () {
  console.log('IDENT_CARD_QTY script15');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY') + '%' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_PKG_UNIT_QTY') + ')'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script16="child;14;SET;_PRINT_QTY=[({_IDENT_CARD_QTY}/{_PKG_UNIT_QTY})]"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child14 = function () {
  console.log('IDENT_CARD_QTY script16');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_PRINT_QTY', expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY') + '/' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_PKG_UNIT_QTY') + ')'));
};
// script17="child;15;SET;_PRINT_QTY=[({_IDENT_CARD_QTY}/{_PKG_UNIT_QTY})+1]"
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.child15 = function () {
  console.log('IDENT_CARD_QTY script17');
expj.common.pscript.setReferenceComponentValue('AD0060010', 'AD0060010form2', '_PRINT_QTY', expj.common.pscript.eval('(' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_IDENT_CARD_QTY') + '/' + expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010form2', '_PKG_UNIT_QTY') + ')+1'));
};
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/IDENT_CARD_QTY.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0060010.AD0060010form2.IDENT_CARD_QTY['onDecision' + i])) {
        expj.AD0060010.AD0060010form2.IDENT_CARD_QTY['onDecision' + i]();
      }
    }
  }
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-IDENT_CARD_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'IDENT_CARD_QTY', this);
  });
  expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/IDENT_CARD_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-IDENT_CARD_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-IDENT_CARD_QTY" name="IDENT_CARD_QTY" class="AD0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getIDENT_CARD_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0060010-AD0060010form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AD0060010-AD0060010form2-MODIFY_COUNT">
expj.AD0060010.AD0060010form2.MODIFY_COUNT = {};
expj.AD0060010.AD0060010form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/MODIFY_COUNT.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'MODIFY_COUNT', this);
  });
  expj.AD0060010.AD0060010form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PKG_UNIT_QTY_1",rb)%></span><!-- 荷姿単位数量 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-PKG_UNIT_QTY">
expj.AD0060010.AD0060010form2.PKG_UNIT_QTY = {};
expj.AD0060010.AD0060010form2.PKG_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/PKG_UNIT_QTY.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.PKG_UNIT_QTY.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-PKG_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'PKG_UNIT_QTY', this);
  });
  expj.AD0060010.AD0060010form2.PKG_UNIT_QTY.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.PKG_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/PKG_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-PKG_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-PKG_UNIT_QTY" name="PKG_UNIT_QTY" class="AD0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getPKG_UNIT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0060010-AD0060010form2-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AD0060010-AD0060010form2-DOWNLOAD_FILE">
expj.AD0060010.AD0060010form2.DOWNLOAD_FILE = {};
expj.AD0060010.AD0060010form2.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/DOWNLOAD_FILE.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'DOWNLOAD_FILE', this);
  });
  expj.AD0060010.AD0060010form2.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRINT_QTY",rb)%></span><!-- 出力枚数 --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010form2-PRINT_QTY">
expj.AD0060010.AD0060010form2.PRINT_QTY = {};
expj.AD0060010.AD0060010form2.PRINT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/PRINT_QTY.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.PRINT_QTY.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-PRINT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'PRINT_QTY', this);
  });
  expj.AD0060010.AD0060010form2.PRINT_QTY.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.PRINT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/PRINT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-PRINT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0060010-AD0060010form2-PRINT_QTY" name="PRINT_QTY" class="AD0060010-focus-move  " style="width:100%;text-align: right;" data-kind="OBT_INTEGER_Z;10;;" value="<%= TypeConverter.sanitizer(aAD0060010Struct.getPRINT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0060010-AD0060010form2-h_UNIT_QTY_TYP" name="h_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0060010Struct.geth_UNIT_QTY_TYP()) %>">
<script class="expj-script-AD0060010-AD0060010form2-h_UNIT_QTY_TYP">
expj.AD0060010.AD0060010form2.h_UNIT_QTY_TYP = {};
expj.AD0060010.AD0060010form2.h_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AD0060010form2/h_UNIT_QTY_TYP.onDecision');
  expj.AD0060010.AD0060010form2.executeAllOnDecision();
  expj.AD0060010.executeAllOnDecision();
};
expj.AD0060010.AD0060010form2.h_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010form2-h_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0060010', 'AD0060010form2', 'h_UNIT_QTY_TYP', this);
  });
  expj.AD0060010.AD0060010form2.h_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AD0060010.AD0060010form2.h_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0060010form2/h_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010form2-h_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0060010-AD0060010button2">
expj.AD0060010.AD0060010button2 = {};
expj.AD0060010.AD0060010button2.executeAllOnDecision = function () {
  console.log('execute AD0060010button2.onDecision');
};
expj.AD0060010.AD0060010button2.executeOnLoad = function () {
  expj.AD0060010.AD0060010button2.executePScriptOnLoad();
};

expj.AD0060010.AD0060010button2.executePScriptOnLoad = function () {
  console.log('execute AD0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0060010-AD0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0060010-AD0060010button2-Print">
expj.AD0060010.AD0060010button2.Print = {};
// script1="onClick;0;CHK;_AD0060010form2/h_UNIT_QTY_TYP[eq]1@*1"
expj.AD0060010.AD0060010button2.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010button2', '_AD0060010form2/h_UNIT_QTY_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="onClick;1;CFMPUT;_AD0060010button2/Print=YES:0@ZZ07003"
expj.AD0060010.AD0060010button2.Print.onClick1 = function () {
  console.log('Print script2');
var yesFunc = function () {
expj.AD0060010.AD0060010button2.Print.child0();
};
var noFunc = function () {
};
expj.common.pscript.executeConfirmPut('AD0060010', 'AD0060010button2', '_AD0060010button2/Print', 'ZZ07003', yesFunc, noFunc);
};
// script3="child;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AD0060010form2/*@AD0060010Servlet:H,H,H"
expj.AD0060010.AD0060010button2.Print.child0 = function () {
  console.log('Print script3');
expj.common.pscript.viewPrinterDialog('AD0060010', 'AD0060010button2', '_AD0060010form2/*', 'AD0060010Servlet', 'H,H,H');
};
// script4="child;1;CHK;[{_AD0060010form2/IDENT_CARD_QTY}%1][numneq]0@!KU10087"
expj.AD0060010.AD0060010button2.Print.child1 = function () {
  console.log('Print script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AD0060010', 'AD0060010button2', '_AD0060010form2/IDENT_CARD_QTY') + '%1'), '[numneq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AD0060010', 'AD0060010button2', 'KU10087');
}
};
expj.AD0060010.AD0060010button2.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0060010.AD0060010button2.Print['onClick' + i])) {
        expj.AD0060010.AD0060010button2.Print['onClick' + i]();
      }
    }
  }
};
expj.AD0060010.AD0060010button2.Print.executeAllOnDecision = function () {
};
expj.AD0060010.AD0060010button2.Print.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010button2-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0060010', 'AD0060010button2', 'Print', this, 'Button');
    }
  });
  expj.AD0060010.AD0060010button2.Print.executePScriptOnLoad();
};

expj.AD0060010.AD0060010button2.Print.executePScriptOnLoad = function () {
  console.log('execute AD0060010button2/Print.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010button2-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0060010-AD0060010button2-Print" name="Print" class="AD0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--four end --><!--five start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--five end --><!--six start --><div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0060010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0060010-AD0060010button0">
expj.AD0060010.AD0060010button0 = {};
expj.AD0060010.AD0060010button0.executeAllOnDecision = function () {
  console.log('execute AD0060010button0.onDecision');
};
expj.AD0060010.AD0060010button0.executeOnLoad = function () {
  expj.AD0060010.AD0060010button0.executePScriptOnLoad();
};

expj.AD0060010.AD0060010button0.executePScriptOnLoad = function () {
  console.log('execute AD0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0060010-AD0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0060010-AD0060010button0-clear">
expj.AD0060010.AD0060010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0060010form1/*@AD0060010Servlet,,$ZZ07008"
expj.AD0060010.AD0060010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0060010', 'AD0060010button0', '_AD0060010form1/*', 'AD0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0060010', response);
expj.common.updateBusinessScreenTab('AD0060010', contents);
};
expj.common.pscript.callConfirm('AD0060010', 'AD0060010button0', 'ZZ07008', okEvent);
};
expj.AD0060010.AD0060010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0060010.AD0060010button0.clear['onClick' + i])) {
        expj.AD0060010.AD0060010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AD0060010.AD0060010button0.clear.executeAllOnDecision = function () {
};
expj.AD0060010.AD0060010button0.clear.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0060010', 'AD0060010button0', 'clear', this, 'Button');
    }
  });
  expj.AD0060010.AD0060010button0.clear.executePScriptOnLoad();
};

expj.AD0060010.AD0060010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AD0060010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0060010-AD0060010button0-clear" name="clear" class="AD0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0060010-AD0060010button0-close">
expj.AD0060010.AD0060010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AD0060010.AD0060010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AD0060010');
};
expj.AD0060010.AD0060010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0060010.AD0060010button0.close['onClick' + i])) {
        expj.AD0060010.AD0060010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AD0060010.AD0060010button0.close.executeAllOnDecision = function () {
};
expj.AD0060010.AD0060010button0.close.executeOnLoad = function () {
  $('#expj-AD0060010-AD0060010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0060010', 'AD0060010button0', 'close', this, 'Button');
    }
  });
  expj.AD0060010.AD0060010button0.close.executePScriptOnLoad();
};

expj.AD0060010.AD0060010button0.close.executePScriptOnLoad = function () {
  console.log('execute AD0060010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AD0060010-AD0060010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0060010-AD0060010button0-close" name="close" class="AD0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--six end --></div><!-- /table1 -->
</div><!-- expj-business-screen-AD0060010 (END)-->
<%
MessageStruct msgStruct = aAD0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0060010)) {
  expj.common.treeInstanceMap.AD0060010 = {};
}
expj.common.treeInstanceMap.AD0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0060010)) {
  expj.common.detailDialogMap.AD0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0060010)) {
  expj.common.viewInstanceMap.AD0060010 = {};
}
expj.common.viewInstanceMap.AD0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0060010.<%=viewId %>.init = function () {
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
    expj.AD0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0060010_init">
/**
 * AD0060010用のロード完了時初期化関数
 */
expj.AD0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0060010');
  expj.common.calendarInstanceMap.AD0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0060010.AD0060010form1.IDENT_CARD_CTL_NO.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form1.PeekerIOrgCd.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010button1.select.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.T_IDENT_CARD_CTL_NO.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.PARTIAL_PRD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.TEMP_IDENT_CARD_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.FIRST_IDENT_CARD_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.ORI_IDENT_CARD_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.IDENT_CARD_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.PKG_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.PRINT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.h_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010button2.Print.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010button0.close.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form1.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010button1.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010form2.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010button2.executeOnLoad();}catch(e){};
  try{expj.AD0060010.AD0060010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0060010', 'AD0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0060010', '<%=request.getContextPath() %>');
};

/**
 * AD0060010の全体onDecision処理
 */
expj.AD0060010.executeAllOnDecision = function () {
  expj.AD0060010.AD0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0060010_console">
expj.AD0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>