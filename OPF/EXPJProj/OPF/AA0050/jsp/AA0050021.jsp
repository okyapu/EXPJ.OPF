<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:21:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0050\AA0050021.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0050.*" %>
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
<jsp:useBean id="aAA0050020Control" class="com.nec.jp.orteus.metamorBase.AA0050.AA0050020Control" scope="request"/>
<jsp:useBean id="aAA0050020Struct" class="com.nec.jp.orteus.metamorBase.AA0050.AA0050020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

保管先優先順位メンテナンスサブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0050/jsp/AA0050021.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:03:52 $
********************************************************* --%>
<html>
<head>
<title>保管先優先順位メンテナンスサブ1</title>
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
<script class="expj-script-AA0050020_init">
  // AA0050020名前空間
  expj.AA0050020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<%
  String CallButton = aAA0050020Control.getButton();    // 呼び出し元ボタン名
%>
<body>

  <div id="expj-business-screen-AA0050020" data-screen="AA0050021" data-newdata="<%=aAA0050020Control.isNewData() %>">
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
              <script class="expj-script-AA0050020-AA0050021form1">
expj.AA0050020.AA0050021form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0050020.AA0050021form1.onLoad0 = function () {
  console.log('AA0050021form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="onLoad;1;CALL;onDecision@0"
expj.AA0050020.AA0050021form1.onLoad1 = function () {
  console.log('AA0050021form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script3="child;0;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]append[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]copy[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]insertSub1@*1,*2"
expj.AA0050020.AA0050021form1.child0 = function () {
  console.log('AA0050021form1 script3');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'copy') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'insertSub1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;MASK;_AA0050021button1/updateSub1"
expj.AA0050020.AA0050021form1.child1 = function () {
  console.log('AA0050021form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021button1/updateSub1');
};
// script5="child;2;MASK;_AA0050021button1/insertSub1,_AA0050021form2/WH_CD,_AA0050021form2/PeekerWhCd"
expj.AA0050020.AA0050021form1.child2 = function () {
  console.log('AA0050021form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021button1/insertSub1');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021form2/WH_CD');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021form2/PeekerWhCd');
};
// script6="onDecision;0;CHKRQ;A@*3,*4"
expj.AA0050020.AA0050021form1.onDecision0 = function () {
  console.log('AA0050021form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0050020', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]append[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]copy[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]insertSub1@*5,*6"
expj.AA0050020.AA0050021form1.child3 = function () {
  console.log('AA0050021form1 script7');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'copy') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'insertSub1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;MASK;_AA0050021button1/updateSub1,_AA0050021button1/insertSub1"
expj.AA0050020.AA0050021form1.child4 = function () {
  console.log('AA0050021form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021button1/updateSub1');
expj.common.pscript.setMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021button1/insertSub1');
};
// script9="child;5;UNMASK;_AA0050021button1/insertSub1"
expj.AA0050020.AA0050021form1.child5 = function () {
  console.log('AA0050021form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021button1/insertSub1');
};
// script10="child;6;UNMASK;_AA0050021button1/updateSub1"
expj.AA0050020.AA0050021form1.child6 = function () {
  console.log('AA0050021form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AA0050020', 'AA0050021form1', '_AA0050021button1/updateSub1');
};
expj.AA0050020.AA0050021form1.executeAllOnDecision = function () {
  console.log('execute AA0050021form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050021form1['onDecision' + i])) {
        expj.AA0050020.AA0050021form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050021form1.executeOnLoad = function () {
  expj.AA0050020.AA0050021form1.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form1.executePScriptOnLoad = function () {
  console.log('execute AA0050021form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0050020.AA0050021form1['onLoad' + i])) {
      expj.AA0050020.AA0050021form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0050020-AA0050021form1" action="AA0050020Servlet" name="AA0050021form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050021form1-ITEM_CD">
expj.AA0050020.AA0050021form1.ITEM_CD = {};
expj.AA0050020.AA0050021form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0050021form1/ITEM_CD.onDecision');
  expj.AA0050020.AA0050021form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050021form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050021form1', 'ITEM_CD', this);
  });
  expj.AA0050020.AA0050021form1.ITEM_CD.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0050021form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050021form1-ITEM_CD" name="ITEM_CD" class="AA0050020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AA0050020-AA0050021form1-ITEM_NAME">
expj.AA0050020.AA0050021form1.ITEM_NAME = {};
expj.AA0050020.AA0050021form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0050021form1/ITEM_NAME.onDecision');
  expj.AA0050020.AA0050021form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050021form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050021form1', 'ITEM_NAME', this);
  });
  expj.AA0050020.AA0050021form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0050021form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050021form1-ITEM_NAME" name="ITEM_NAME" class="AA0050020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0050020-AA0050021form1-w_MODIFY_COUNT" name="w_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getw_MODIFY_COUNT()) %>">
<script class="expj-script-AA0050020-AA0050021form1-w_MODIFY_COUNT">
expj.AA0050020.AA0050021form1.w_MODIFY_COUNT = {};
expj.AA0050020.AA0050021form1.w_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0050021form1/w_MODIFY_COUNT.onDecision');
  expj.AA0050020.AA0050021form1.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050021form1.w_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021form1-w_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050021form1', 'w_MODIFY_COUNT', this);
  });
  expj.AA0050020.AA0050021form1.w_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form1.w_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0050021form1/w_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021form1-w_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0050020-AA0050021form2">
expj.AA0050020.AA0050021form2 = {};
expj.AA0050020.AA0050021form2.executeAllOnDecision = function () {
  console.log('execute AA0050021form2.onDecision');
};
expj.AA0050020.AA0050021form2.executeOnLoad = function () {
  expj.AA0050020.AA0050021form2.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form2.executePScriptOnLoad = function () {
  console.log('execute AA0050021form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0050020-AA0050021form2" action="AA0050020Servlet" name="AA0050021form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD_9",rb)%></span><!-- 出庫元保管区コード --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050021form2-WH_CD">
expj.AA0050020.AA0050021form2.WH_CD = {};
expj.AA0050020.AA0050021form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AA0050021form2/WH_CD.onDecision');
  expj.AA0050020.AA0050021form2.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050021form2.WH_CD.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050021form2', 'WH_CD', this);
  });
  expj.AA0050020.AA0050021form2.WH_CD.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AA0050021form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050021form2-WH_CD" name="WH_CD" class="AA0050020-focus-move  required-value expj-AA0050020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0050020-AA0050021form2-PeekerWhCd">
expj.AA0050020.AA0050021form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AA0050021form2/WH_CD@<%=contextNo%>"
expj.AA0050020.AA0050021form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0050020';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AA0050020', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAA0050020Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050021form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050021form2', '_AA0050021form2/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_08%&%';
parameterValues += 'TARGET_FIELD%=%_AA0050021form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0050020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0050020.AA0050021form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050021form2.PeekerWhCd['onClick' + i])) {
        expj.AA0050020.AA0050021form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050021form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050021form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050021form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AA0050020.AA0050021form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AA0050021form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0050020-AA0050021form2-PeekerWhCd" class="AA0050020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0050020-AA0050021form2-WH_NAME">
expj.AA0050020.AA0050021form2.WH_NAME = {};
expj.AA0050020.AA0050021form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AA0050021form2/WH_NAME.onDecision');
  expj.AA0050020.AA0050021form2.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050021form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050021form2', 'WH_NAME', this);
  });
  expj.AA0050020.AA0050021form2.WH_NAME.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0050021form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050021form2-WH_NAME" name="WH_NAME" class="AA0050020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_PRIORITY_REF_NO_1",rb)%></span><!-- 優先順位番号 --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050021form2-WH_PRIORITY_REF_NO">
expj.AA0050020.AA0050021form2.WH_PRIORITY_REF_NO = {};
expj.AA0050020.AA0050021form2.WH_PRIORITY_REF_NO.executeAllOnDecision = function () {
  console.log('execute AA0050021form2/WH_PRIORITY_REF_NO.onDecision');
  expj.AA0050020.AA0050021form2.executeAllOnDecision();
  expj.AA0050020.executeAllOnDecision();
};
expj.AA0050020.AA0050021form2.WH_PRIORITY_REF_NO.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021form2-WH_PRIORITY_REF_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0050020', 'AA0050021form2', 'WH_PRIORITY_REF_NO', this);
  });
  expj.AA0050020.AA0050021form2.WH_PRIORITY_REF_NO.executePScriptOnLoad();
};

expj.AA0050020.AA0050021form2.WH_PRIORITY_REF_NO.executePScriptOnLoad = function () {
  console.log('execute AA0050021form2/WH_PRIORITY_REF_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021form2-WH_PRIORITY_REF_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0050020-AA0050021form2-WH_PRIORITY_REF_NO" name="WH_PRIORITY_REF_NO" class="AA0050020-focus-move expj-align-right required-value expj-AA0050020-required-Z" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAA0050020Struct.getWH_PRIORITY_REF_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0050020-AA0050021button1">
expj.AA0050020.AA0050021button1 = {};
expj.AA0050020.AA0050021button1.executeAllOnDecision = function () {
  console.log('execute AA0050021button1.onDecision');
};
expj.AA0050020.AA0050021button1.executeOnLoad = function () {
  expj.AA0050020.AA0050021button1.executePScriptOnLoad();
};

expj.AA0050020.AA0050021button1.executePScriptOnLoad = function () {
  console.log('execute AA0050021button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0050020-AA0050021button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0050020-AA0050021button1-insertSub1">
expj.AA0050020.AA0050021button1.insertSub1 = {};
// script1="onClick;0;CHK;_AA0050021form2/WH_PRIORITY_REF_NO[numeq]0@#AA00079"
expj.AA0050020.AA0050021button1.insertSub1.onClick0 = function () {
  console.log('insertSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050021button1', '_AA0050021form2/WH_PRIORITY_REF_NO')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0050020', 'AA0050021button1', 'AA00079');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0050021form1/*,_AA0050021form2/*@AA0050020Servlet,,$ZZ07001"
expj.AA0050020.AA0050021button1.insertSub1.onClick1 = function () {
  console.log('insertSub1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050021button1', '_AA0050021form1/*,_AA0050021form2/*', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.changeBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050021button1', 'ZZ07001', okEvent);
};
expj.AA0050020.AA0050021button1.insertSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050021button1.insertSub1['onClick' + i])) {
        expj.AA0050020.AA0050021button1.insertSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050021button1.insertSub1.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050021button1.insertSub1.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021button1-insertSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050021button1', 'insertSub1', this, 'Button');
    }
  });
  expj.AA0050020.AA0050021button1.insertSub1.executePScriptOnLoad();
};

expj.AA0050020.AA0050021button1.insertSub1.executePScriptOnLoad = function () {
  console.log('execute AA0050021button1/insertSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021button1-insertSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050021button1-insertSub1" name="insertSub1" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0050020-AA0050021button1-updateSub1">
expj.AA0050020.AA0050021button1.updateSub1 = {};
// script1="onClick;0;CHK;_AA0050021form2/WH_PRIORITY_REF_NO[numeq]0@#AA00079"
expj.AA0050020.AA0050021button1.updateSub1.onClick0 = function () {
  console.log('updateSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0050020', 'AA0050021button1', '_AA0050021form2/WH_PRIORITY_REF_NO')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0050020', 'AA0050021button1', 'AA00079');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0050021form1/*,_AA0050021form2/*@AA0050020Servlet,,$ZZ07003"
expj.AA0050020.AA0050021button1.updateSub1.onClick1 = function () {
  console.log('updateSub1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050021button1', '_AA0050021form1/*,_AA0050021form2/*', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.changeBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050021button1', 'ZZ07003', okEvent);
};
expj.AA0050020.AA0050021button1.updateSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050021button1.updateSub1['onClick' + i])) {
        expj.AA0050020.AA0050021button1.updateSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050021button1.updateSub1.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050021button1.updateSub1.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021button1-updateSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050021button1', 'updateSub1', this, 'Button');
    }
  });
  expj.AA0050020.AA0050021button1.updateSub1.executePScriptOnLoad();
};

expj.AA0050020.AA0050021button1.updateSub1.executePScriptOnLoad = function () {
  console.log('execute AA0050021button1/updateSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021button1-updateSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050021button1-updateSub1" name="updateSub1" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0050021 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AA0050020-AA0050021button0">
expj.AA0050020.AA0050021button0 = {};
expj.AA0050020.AA0050021button0.executeAllOnDecision = function () {
  console.log('execute AA0050021button0.onDecision');
};
expj.AA0050020.AA0050021button0.executeOnLoad = function () {
  expj.AA0050020.AA0050021button0.executePScriptOnLoad();
};

expj.AA0050020.AA0050021button0.executePScriptOnLoad = function () {
  console.log('execute AA0050021button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0050020-AA0050021button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0050020-AA0050021button0-cancelSub1">
expj.AA0050020.AA0050021button0.cancelSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AA0050020Servlet,,$ZZ07013"
expj.AA0050020.AA0050021button0.cancelSub1.onClick0 = function () {
  console.log('cancelSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0050020', 'AA0050021button0', '', 'AA0050020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0050020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0050020', response);
expj.common.changeBusinessScreenTab('AA0050020', contents);
};
expj.common.pscript.callConfirm('AA0050020', 'AA0050021button0', 'ZZ07013', okEvent);
};
expj.AA0050020.AA0050021button0.cancelSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0050020.AA0050021button0.cancelSub1['onClick' + i])) {
        expj.AA0050020.AA0050021button0.cancelSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0050020.AA0050021button0.cancelSub1.executeAllOnDecision = function () {
};
expj.AA0050020.AA0050021button0.cancelSub1.executeOnLoad = function () {
  $('#expj-AA0050020-AA0050021button0-cancelSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0050020', 'AA0050021button0', 'cancelSub1', this, 'Button');
    }
  });
  expj.AA0050020.AA0050021button0.cancelSub1.executePScriptOnLoad();
};

expj.AA0050020.AA0050021button0.cancelSub1.executePScriptOnLoad = function () {
  console.log('execute AA0050021button0/cancelSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0050020-AA0050021button0-cancelSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0050020-AA0050021button0-cancelSub1" name="cancelSub1" class="AA0050020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0050020 (END)-->
<%
MessageStruct msgStruct = aAA0050020Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0050020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0050020)) {
  expj.common.treeInstanceMap.AA0050020 = {};
}
expj.common.treeInstanceMap.AA0050020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0050020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0050020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0050020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0050020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0050020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0050020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020)) {
  expj.common.detailDialogMap.AA0050020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0050020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0050020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0050020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0050020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0050020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0050020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0050020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0050020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0050020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0050020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0050020)) {
  expj.common.viewInstanceMap.AA0050020 = {};
}
expj.common.viewInstanceMap.AA0050020.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0050020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0050020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0050020.<%=viewId %>.init = function () {
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
    expj.AA0050020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0050020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0050020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0050020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0050020_init">
/**
 * AA0050020用のロード完了時初期化関数
 */
expj.AA0050020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0050020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0050020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0050020');
  expj.common.calendarInstanceMap.AA0050020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0050020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0050020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0050020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0050020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0050020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0050020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0050020-<%=detailId %>');
<%
 }
%>
  try{expj.AA0050020.AA0050021form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form1.w_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form2.WH_PRIORITY_REF_NO.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021button1.insertSub1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021button1.updateSub1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021button0.cancelSub1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021form2.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021button1.executeOnLoad();}catch(e){};
  try{expj.AA0050020.AA0050021button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0050020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0050020', 'AA0050020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0050020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0050020-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0050020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0050020', '<%=request.getContextPath() %>');
};

/**
 * AA0050020の全体onDecision処理
 */
expj.AA0050020.executeAllOnDecision = function () {
  expj.AA0050020.AA0050021form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0050020_console">
expj.AA0050020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>