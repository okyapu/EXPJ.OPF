<%-- ***
This file is generated
 GeneratedDate  : Mon May 15 14:51:16 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj_WK\OPF\AE0170\AE0170010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0170.*" %>
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
<jsp:useBean id="aAE0170010Control" class="com.nec.jp.orteus.metamorBase.AE0170.AE0170010Control" scope="request"/>
<jsp:useBean id="aAE0170010Struct" class="com.nec.jp.orteus.metamorBase.AE0170.AE0170010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

発注消費税率変更
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0170/jsp/AE0170010.jsp,v $
$Author: xu-jing $	
$Revision: 1.6 $　$Date: 2017/05/15 08:13:34 $
********************************************************* --%>
<html>
<head>
<title>発注消費税率変更</title>
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
<script class="expj-script-AE0170010_init">
  // AE0170010名前空間
  expj.AE0170010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<%
    // システムオプション識別子
    String strOptionId = aAE0170010Struct.getOPTION_ID();
	// 会社コード
	String strSysCompanyCd = aAE0170010Struct.getCOMPANY_CD();
	// 工場コード
	String strSysPlantCd = aAE0170010Struct.getPLANT_CD();
	
	// 発注番号
	String sqlnamePuchOdrNo = new String();
	String sqlparamPuchOdrNo1 = new String();
	String sqlparamPuchOdrNo2 = new String();
	String sqlparamPuchOdrNo3 = new String();
	
	// Explanner/JaScmの場合
	if("SCM*".equals(strOptionId)){
	    sqlnamePuchOdrNo = "SCM_PUCH_ODR_CD_03";
		sqlparamPuchOdrNo1 = strSysCompanyCd;
		sqlparamPuchOdrNo2 = strSysPlantCd;
		sqlparamPuchOdrNo3 = "sqlparam_3=\"_PUCH_ODR_CD\"";
	}
	// Explanner/JaScm以外の場合
	else{
	    sqlnamePuchOdrNo = "PUCH_ODR_CD_06";
		sqlparamPuchOdrNo1 = strSysPlantCd;
		sqlparamPuchOdrNo2 = "_PUCH_ODR_CD";
	}
%>
<body>
  <div id="expj-business-screen-AE0170010" data-screen="AE0170010" data-newdata="<%=aAE0170010Control.isNewData() %>">
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
              <script class="expj-script-AE0170010-AE0170010form1">
expj.AE0170010.AE0170010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AE0170010.AE0170010form1.onLoad0 = function () {
  console.log('AE0170010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0170010.AE0170010form1.onDecision0 = function () {
  console.log('AE0170010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0170010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0170010button1/Select"
expj.AE0170010.AE0170010form1.child0 = function () {
  console.log('AE0170010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0170010', 'AE0170010form1', '_AE0170010button1/Select');
};
// script4="child;1;MASK;_AE0170010button1/Select"
expj.AE0170010.AE0170010form1.child1 = function () {
  console.log('AE0170010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0170010', 'AE0170010form1', '_AE0170010button1/Select');
};
// script5="onDecision;1;CHKRQ;B@*2,*4"
expj.AE0170010.AE0170010form1.onDecision1 = function () {
  console.log('AE0170010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AE0170010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;_AE0170010form2/h_UPDATE_FLG[eq]1@*3,*4"
expj.AE0170010.AE0170010form1.child2 = function () {
  console.log('AE0170010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010form1', '_AE0170010form2/h_UPDATE_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AE0170010button2/Update"
expj.AE0170010.AE0170010form1.child3 = function () {
  console.log('AE0170010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0170010', 'AE0170010form1', '_AE0170010button2/Update');
};
// script8="child;4;MASK;_AE0170010button2/Update"
expj.AE0170010.AE0170010form1.child4 = function () {
  console.log('AE0170010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0170010', 'AE0170010form1', '_AE0170010button2/Update');
};
// script9="onDecision;2;CHK;_AE0170010form2/NON_NO_ITEM_FLG[eq]1@*5,*6"
expj.AE0170010.AE0170010form1.onDecision2 = function () {
  console.log('AE0170010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010form1', '_AE0170010form2/NON_NO_ITEM_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;SET;_AE0170010form2/c_NON_NO_ITEM_FLG=true"
expj.AE0170010.AE0170010form1.child5 = function () {
  console.log('AE0170010form1 script10');
expj.common.pscript.setReferenceComponentValue('AE0170010', 'AE0170010form1', '_AE0170010form2/c_NON_NO_ITEM_FLG', 'true');
};
// script11="child;6;SET;_AE0170010form2/c_NON_NO_ITEM_FLG=false"
expj.AE0170010.AE0170010form1.child6 = function () {
  console.log('AE0170010form1 script11');
expj.common.pscript.setReferenceComponentValue('AE0170010', 'AE0170010form1', '_AE0170010form2/c_NON_NO_ITEM_FLG', 'false');
};
expj.AE0170010.AE0170010form1.executeAllOnDecision = function () {
  console.log('execute AE0170010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010form1['onDecision' + i])) {
        expj.AE0170010.AE0170010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0170010.AE0170010form1.executeOnLoad = function () {
  expj.AE0170010.AE0170010form1.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form1.executePScriptOnLoad = function () {
  console.log('execute AE0170010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0170010.AE0170010form1['onLoad' + i])) {
      expj.AE0170010.AE0170010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0170010-AE0170010form1" action="AE0170010Servlet" name="AE0170010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0170010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form1-PUCH_ODR_CD">
expj.AE0170010.AE0170010form1.PUCH_ODR_CD = {};
expj.AE0170010.AE0170010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0170010form1/PUCH_ODR_CD.onDecision');
  expj.AE0170010.AE0170010form1.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0170010.AE0170010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0170010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0170010-focus-move  required-value expj-AE0170010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form1-PeekerPuchOdrCd">
expj.AE0170010.AE0170010form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AE0170010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0170010.AE0170010form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0170010';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0170010', 'PeekerPuchOdrCd', 'SQLPARAM_1', '<%=sqlparamPuchOdrNo1%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0170010', 'PeekerPuchOdrCd', 'SQLPARAM_2', '<%=sqlparamPuchOdrNo2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=sqlnamePuchOdrNo%>%&%';
parameterValues += 'TARGET_FIELD%=%_AE0170010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0170010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0170010.AE0170010form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AE0170010.AE0170010form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0170010.AE0170010form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AE0170010.AE0170010form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0170010', 'AE0170010form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AE0170010.AE0170010form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0170010form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0170010-AE0170010form1-PeekerPuchOdrCd" class="AE0170010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form1-h_PUCH_ODR_CD" name="h_PUCH_ODR_CD" class="" data-kind="" maxlength="25" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_PUCH_ODR_CD()) %>">
<script class="expj-script-AE0170010-AE0170010form1-h_PUCH_ODR_CD">
expj.AE0170010.AE0170010form1.h_PUCH_ODR_CD = {};
expj.AE0170010.AE0170010form1.h_PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0170010form1/h_PUCH_ODR_CD.onDecision');
  expj.AE0170010.AE0170010form1.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form1.h_PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form1-h_PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form1', 'h_PUCH_ODR_CD', this);
  });
  expj.AE0170010.AE0170010form1.h_PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form1.h_PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0170010form1/h_PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form1-h_PUCH_ODR_CD');
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
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0170010-AE0170010button1">
expj.AE0170010.AE0170010button1 = {};
expj.AE0170010.AE0170010button1.executeAllOnDecision = function () {
  console.log('execute AE0170010button1.onDecision');
};
expj.AE0170010.AE0170010button1.executeOnLoad = function () {
  expj.AE0170010.AE0170010button1.executePScriptOnLoad();
};

expj.AE0170010.AE0170010button1.executePScriptOnLoad = function () {
  console.log('execute AE0170010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0170010-AE0170010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0170010-AE0170010button1-Select">
expj.AE0170010.AE0170010button1.Select = {};
// script1="onClick;0;CHK;_AE0170010form1/PUCH_ODR_CD[eq]@!ZZ01104"
expj.AE0170010.AE0170010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010button1', '_AE0170010form1/PUCH_ODR_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AE0170010', 'AE0170010button1', 'ZZ01104');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0170010form1/*@AE0170010Servlet"
expj.AE0170010.AE0170010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0170010', 'AE0170010button1', '_AE0170010form1/*', 'AE0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0170010', response);
expj.common.updateBusinessScreenTab('AE0170010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0170010.AE0170010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010button1.Select['onClick' + i])) {
        expj.AE0170010.AE0170010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0170010.AE0170010button1.Select.executeAllOnDecision = function () {
};
expj.AE0170010.AE0170010button1.Select.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0170010', 'AE0170010button1', 'Select', this, 'Button');
    }
  });
  expj.AE0170010.AE0170010button1.Select.executePScriptOnLoad();
};

expj.AE0170010.AE0170010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0170010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0170010-AE0170010button1-Select" name="Select" class="AE0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0170010-AE0170010form2">
expj.AE0170010.AE0170010form2 = {};
expj.AE0170010.AE0170010form2.executeAllOnDecision = function () {
  console.log('execute AE0170010form2.onDecision');
};
expj.AE0170010.AE0170010form2.executeOnLoad = function () {
  expj.AE0170010.AE0170010form2.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0170010-AE0170010form2" action="AE0170010Servlet" name="AE0170010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:215px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:215px;">
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
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_NET_AMOUNT" name="h_NET_AMOUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_NET_AMOUNT()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_NET_AMOUNT">
expj.AE0170010.AE0170010form2.h_NET_AMOUNT = {};
expj.AE0170010.AE0170010form2.h_NET_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_NET_AMOUNT.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_NET_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_NET_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_NET_AMOUNT', this);
  });
  expj.AE0170010.AE0170010form2.h_NET_AMOUNT.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_NET_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_NET_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_NET_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_1" name="h_TAX_AMOUNT_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_TAX_AMOUNT_1()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_TAX_AMOUNT_1">
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_1 = {};
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_1.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_TAX_AMOUNT_1.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_1.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_TAX_AMOUNT_1', this);
  });
  expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_1.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_1.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_TAX_AMOUNT_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_2" name="h_TAX_AMOUNT_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_TAX_AMOUNT_2()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_TAX_AMOUNT_2">
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_2 = {};
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_2.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_TAX_AMOUNT_2.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_2.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_TAX_AMOUNT_2', this);
  });
  expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_2.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_2.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_TAX_AMOUNT_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_3" name="h_TAX_AMOUNT_3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_TAX_AMOUNT_3()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_TAX_AMOUNT_3">
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_3 = {};
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_3.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_TAX_AMOUNT_3.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_3.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_TAX_AMOUNT_3', this);
  });
  expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_3.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_3.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_TAX_AMOUNT_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_TAX_AMOUNT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_DECIMAL_FIG" name="h_DECIMAL_FIG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_DECIMAL_FIG()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_DECIMAL_FIG">
expj.AE0170010.AE0170010form2.h_DECIMAL_FIG = {};
expj.AE0170010.AE0170010form2.h_DECIMAL_FIG.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_DECIMAL_FIG.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_DECIMAL_FIG.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_DECIMAL_FIG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_DECIMAL_FIG', this);
  });
  expj.AE0170010.AE0170010form2.h_DECIMAL_FIG.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_DECIMAL_FIG.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_DECIMAL_FIG.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_DECIMAL_FIG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-c_NON_NO_ITEM_FLG">
expj.AE0170010.AE0170010form2.c_NON_NO_ITEM_FLG = {};
expj.AE0170010.AE0170010form2.c_NON_NO_ITEM_FLG.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/c_NON_NO_ITEM_FLG.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.c_NON_NO_ITEM_FLG.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-c_NON_NO_ITEM_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0170010', 'AE0170010form2', 'c_NON_NO_ITEM_FLG', this, 'CheckBox');
    }
  });
  expj.AE0170010.AE0170010form2.c_NON_NO_ITEM_FLG.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.c_NON_NO_ITEM_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/c_NON_NO_ITEM_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-c_NON_NO_ITEM_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_NON_NO_ITEM_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAE0170010Struct.getc_NON_NO_ITEM_FLG())) || "1".equals(TypeConverter.convert(aAE0170010Struct.getc_NON_NO_ITEM_FLG())))?"checked=\"checked\"":"" %>  class="AE0170010-focus-move" id="expj-AE0170010-AE0170010form2-c_NON_NO_ITEM_FLG" disabled><label for="expj-AE0170010-AE0170010form2-c_NON_NO_ITEM_FLG"><%=CoreTools.getRBString("Expj.NON_NO_ITEM_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-NON_NO_ITEM_FLG" name="NON_NO_ITEM_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getNON_NO_ITEM_FLG()) %>">
<script class="expj-script-AE0170010-AE0170010form2-NON_NO_ITEM_FLG">
expj.AE0170010.AE0170010form2.NON_NO_ITEM_FLG = {};
expj.AE0170010.AE0170010form2.NON_NO_ITEM_FLG.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/NON_NO_ITEM_FLG.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.NON_NO_ITEM_FLG.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-NON_NO_ITEM_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'NON_NO_ITEM_FLG', this);
  });
  expj.AE0170010.AE0170010form2.NON_NO_ITEM_FLG.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.NON_NO_ITEM_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/NON_NO_ITEM_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-NON_NO_ITEM_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-ITEM_CD">
expj.AE0170010.AE0170010form2.ITEM_CD = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0170010.AE0170010form2.ITEM_CD.onDecision0 = function () {
  console.log('ITEM_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AE0170010.AE0170010form2.ITEM_CD.child0 = function () {
  console.log('ITEM_CD script2');
expj.common.pscript.setReferenceComponentValue('AE0170010', 'AE0170010form2', '_SelectUnitCostFlag', 'false');
};
expj.AE0170010.AE0170010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/ITEM_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010form2.ITEM_CD['onDecision' + i])) {
        expj.AE0170010.AE0170010form2.ITEM_CD['onDecision' + i]();
      }
    }
  }
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'ITEM_CD', this);
  });
  expj.AE0170010.AE0170010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-ITEM_CD" name="ITEM_CD" class="AE0170010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_ROUND_TYP" name="h_ROUND_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_ROUND_TYP()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_ROUND_TYP">
expj.AE0170010.AE0170010form2.h_ROUND_TYP = {};
expj.AE0170010.AE0170010form2.h_ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_ROUND_TYP.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_ROUND_TYP.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_ROUND_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_ROUND_TYP', this);
  });
  expj.AE0170010.AE0170010form2.h_ROUND_TYP.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_EXCH_RATE" name="h_EXCH_RATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_EXCH_RATE()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_EXCH_RATE">
expj.AE0170010.AE0170010form2.h_EXCH_RATE = {};
expj.AE0170010.AE0170010form2.h_EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_EXCH_RATE.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_EXCH_RATE.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_EXCH_RATE', this);
  });
  expj.AE0170010.AE0170010form2.h_EXCH_RATE.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-ITEM_NAME">
expj.AE0170010.AE0170010form2.ITEM_NAME = {};
expj.AE0170010.AE0170010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/ITEM_NAME.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'ITEM_NAME', this);
  });
  expj.AE0170010.AE0170010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-ITEM_NAME" name="ITEM_NAME" class="AE0170010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_PUCH_ODR_STS_TYP" name="h_PUCH_ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_PUCH_ODR_STS_TYP()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_PUCH_ODR_STS_TYP">
expj.AE0170010.AE0170010form2.h_PUCH_ODR_STS_TYP = {};
expj.AE0170010.AE0170010form2.h_PUCH_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_PUCH_ODR_STS_TYP.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_PUCH_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_PUCH_ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_PUCH_ODR_STS_TYP', this);
  });
  expj.AE0170010.AE0170010form2.h_PUCH_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_PUCH_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_PUCH_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_PUCH_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-VEND_CD">
expj.AE0170010.AE0170010form2.VEND_CD = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0170010.AE0170010form2.VEND_CD.onDecision0 = function () {
  console.log('VEND_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AE0170010.AE0170010form2.VEND_CD.child0 = function () {
  console.log('VEND_CD script2');
expj.common.pscript.setReferenceComponentValue('AE0170010', 'AE0170010form2', '_SelectUnitCostFlag', 'false');
};
expj.AE0170010.AE0170010form2.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/VEND_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010form2.VEND_CD['onDecision' + i])) {
        expj.AE0170010.AE0170010form2.VEND_CD['onDecision' + i]();
      }
    }
  }
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'VEND_CD', this);
  });
  expj.AE0170010.AE0170010form2.VEND_CD.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-VEND_CD" name="VEND_CD" class="AE0170010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getVEND_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-VEND_NAME">
expj.AE0170010.AE0170010form2.VEND_NAME = {};
expj.AE0170010.AE0170010form2.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/VEND_NAME.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'VEND_NAME', this);
  });
  expj.AE0170010.AE0170010form2.VEND_NAME.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-VEND_NAME" name="VEND_NAME" class="AE0170010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_PUCH_ODR_INST_SLIP_ISS_FLG" name="h_PUCH_ODR_INST_SLIP_ISS_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_PUCH_ODR_INST_SLIP_ISS_FLG()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_PUCH_ODR_INST_SLIP_ISS_FLG">
expj.AE0170010.AE0170010form2.h_PUCH_ODR_INST_SLIP_ISS_FLG = {};
expj.AE0170010.AE0170010form2.h_PUCH_ODR_INST_SLIP_ISS_FLG.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_PUCH_ODR_INST_SLIP_ISS_FLG.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_PUCH_ODR_INST_SLIP_ISS_FLG.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_PUCH_ODR_INST_SLIP_ISS_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_PUCH_ODR_INST_SLIP_ISS_FLG', this);
  });
  expj.AE0170010.AE0170010form2.h_PUCH_ODR_INST_SLIP_ISS_FLG.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_PUCH_ODR_INST_SLIP_ISS_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_PUCH_ODR_INST_SLIP_ISS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_PUCH_ODR_INST_SLIP_ISS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)%></span><!-- 発注納期 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-PUCH_ODR_DLV_DATE">
expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_DATE = {};
expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/PUCH_ODR_DLV_DATE.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-PUCH_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'PUCH_ODR_DLV_DATE', this);
  });
  expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/PUCH_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-PUCH_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-PUCH_ODR_DLV_DATE" name="PUCH_ODR_DLV_DATE" class="AE0170010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getPUCH_ODR_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-PUCH_ODR_DLV_TIME">
expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_TIME = {};
expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/PUCH_ODR_DLV_TIME.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_TIME.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-PUCH_ODR_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'PUCH_ODR_DLV_TIME', this);
  });
  expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_TIME.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/PUCH_ODR_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-PUCH_ODR_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-PUCH_ODR_DLV_TIME" name="PUCH_ODR_DLV_TIME" class="AE0170010-focus-move  " style="width:88px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getPUCH_ODR_DLV_TIME()) %>" maxlength="5" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-TAX_CD">
expj.AE0170010.AE0170010form2.TAX_CD = {};
expj.AE0170010.AE0170010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/TAX_CD.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'TAX_CD', this);
  });
  expj.AE0170010.AE0170010form2.TAX_CD.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-TAX_CD" name="TAX_CD" class="AE0170010-focus-move  required-value expj-AE0170010-required-B" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-PeekerTaxCd">
expj.AE0170010.AE0170010form2.PeekerTaxCd = {};
// script1="onClick;0;PEEKER;_AE0170010form2/TAX_CD@<%=contextNo%>"
expj.AE0170010.AE0170010form2.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0170010';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010form2', '_TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0170010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0170010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0170010.AE0170010form2.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010form2.PeekerTaxCd['onClick' + i])) {
        expj.AE0170010.AE0170010form2.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.AE0170010.AE0170010form2.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.AE0170010.AE0170010form2.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0170010', 'AE0170010form2', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.AE0170010.AE0170010form2.PeekerTaxCd.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0170010-AE0170010form2-PeekerTaxCd" class="AE0170010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb)%></span><!-- 発注予定日 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-PUCH_ODR_START_DATE">
expj.AE0170010.AE0170010form2.PUCH_ODR_START_DATE = {};
expj.AE0170010.AE0170010form2.PUCH_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/PUCH_ODR_START_DATE.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.PUCH_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-PUCH_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'PUCH_ODR_START_DATE', this);
  });
  expj.AE0170010.AE0170010form2.PUCH_ODR_START_DATE.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.PUCH_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/PUCH_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-PUCH_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-PUCH_ODR_START_DATE" name="PUCH_ODR_START_DATE" class="AE0170010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getPUCH_ODR_START_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-PUCH_ODR_START_TIME">
expj.AE0170010.AE0170010form2.PUCH_ODR_START_TIME = {};
expj.AE0170010.AE0170010form2.PUCH_ODR_START_TIME.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/PUCH_ODR_START_TIME.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.PUCH_ODR_START_TIME.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-PUCH_ODR_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'PUCH_ODR_START_TIME', this);
  });
  expj.AE0170010.AE0170010form2.PUCH_ODR_START_TIME.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.PUCH_ODR_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/PUCH_ODR_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-PUCH_ODR_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-PUCH_ODR_START_TIME" name="PUCH_ODR_START_TIME" class="AE0170010-focus-move  " style="width:88px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getPUCH_ODR_START_TIME()) %>" maxlength="5" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_TAX_CD" name="h_TAX_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_TAX_CD()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_TAX_CD">
expj.AE0170010.AE0170010form2.h_TAX_CD = {};
expj.AE0170010.AE0170010form2.h_TAX_CD.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_TAX_CD.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_TAX_CD.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_TAX_CD', this);
  });
  expj.AE0170010.AE0170010form2.h_TAX_CD.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_INSPC_CMPLT_FLG" name="h_INSPC_CMPLT_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_INSPC_CMPLT_FLG()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_INSPC_CMPLT_FLG">
expj.AE0170010.AE0170010form2.h_INSPC_CMPLT_FLG = {};
expj.AE0170010.AE0170010form2.h_INSPC_CMPLT_FLG.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_INSPC_CMPLT_FLG.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_INSPC_CMPLT_FLG.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_INSPC_CMPLT_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_INSPC_CMPLT_FLG', this);
  });
  expj.AE0170010.AE0170010form2.h_INSPC_CMPLT_FLG.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_INSPC_CMPLT_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_INSPC_CMPLT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_INSPC_CMPLT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb)%></span><!-- 発注数 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-PUCH_ODR_QTY">
expj.AE0170010.AE0170010form2.PUCH_ODR_QTY = {};
expj.AE0170010.AE0170010form2.PUCH_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/PUCH_ODR_QTY.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.PUCH_ODR_QTY.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-PUCH_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'PUCH_ODR_QTY', this);
  });
  expj.AE0170010.AE0170010form2.PUCH_ODR_QTY.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.PUCH_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/PUCH_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-PUCH_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-PUCH_ODR_QTY" name="PUCH_ODR_QTY" class="AE0170010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getPUCH_ODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT_1",rb)%></span><!-- 単位 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-STOCK_UNIT">
expj.AE0170010.AE0170010form2.STOCK_UNIT = {};
expj.AE0170010.AE0170010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/STOCK_UNIT.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'STOCK_UNIT', this);
  });
  expj.AE0170010.AE0170010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-STOCK_UNIT" name="STOCK_UNIT" class="AE0170010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getSTOCK_UNIT()) %>" maxlength="12" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_ACPT_INSPC_TYP" name="h_ACPT_INSPC_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_ACPT_INSPC_TYP()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_ACPT_INSPC_TYP">
expj.AE0170010.AE0170010form2.h_ACPT_INSPC_TYP = {};
expj.AE0170010.AE0170010form2.h_ACPT_INSPC_TYP.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_ACPT_INSPC_TYP.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_ACPT_INSPC_TYP.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_ACPT_INSPC_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_ACPT_INSPC_TYP', this);
  });
  expj.AE0170010.AE0170010form2.h_ACPT_INSPC_TYP.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_ACPT_INSPC_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_ACPT_INSPC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_ACPT_INSPC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)%></span><!-- 単価区分 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-UNIT_COST_TYP">
expj.AE0170010.AE0170010form2.UNIT_COST_TYP = {};
expj.AE0170010.AE0170010form2.UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/UNIT_COST_TYP.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-UNIT_COST_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'UNIT_COST_TYP', this);
  });
  expj.AE0170010.AE0170010form2.UNIT_COST_TYP.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-UNIT_COST_TYP" name="UNIT_COST_TYP" class="AE0170010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getUNIT_COST_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-JOB_ODR_CD">
expj.AE0170010.AE0170010form2.JOB_ODR_CD = {};
expj.AE0170010.AE0170010form2.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/JOB_ODR_CD.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'JOB_ODR_CD', this);
  });
  expj.AE0170010.AE0170010form2.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0170010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_UPDATE_FLG" name="h_UPDATE_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_UPDATE_FLG()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_UPDATE_FLG">
expj.AE0170010.AE0170010form2.h_UPDATE_FLG = {};
expj.AE0170010.AE0170010form2.h_UPDATE_FLG.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_UPDATE_FLG.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_UPDATE_FLG.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_UPDATE_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_UPDATE_FLG', this);
  });
  expj.AE0170010.AE0170010form2.h_UPDATE_FLG.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_UPDATE_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_UPDATE_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_UPDATE_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-UNIT_COST">
expj.AE0170010.AE0170010form2.UNIT_COST = {};
expj.AE0170010.AE0170010form2.UNIT_COST.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/UNIT_COST.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.UNIT_COST.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'UNIT_COST', this);
  });
  expj.AE0170010.AE0170010form2.UNIT_COST.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-UNIT_COST" name="UNIT_COST" class="AE0170010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getUNIT_COST()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-CUR_UNIT">
expj.AE0170010.AE0170010form2.CUR_UNIT = {};
expj.AE0170010.AE0170010form2.CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/CUR_UNIT.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'CUR_UNIT', this);
  });
  expj.AE0170010.AE0170010form2.CUR_UNIT.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-CUR_UNIT" name="CUR_UNIT" class="AE0170010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getCUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)%></span><!-- 受入検査区分 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-ACPT_INSPC_TYP">
expj.AE0170010.AE0170010form2.ACPT_INSPC_TYP = {};
expj.AE0170010.AE0170010form2.ACPT_INSPC_TYP.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/ACPT_INSPC_TYP.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.ACPT_INSPC_TYP.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-ACPT_INSPC_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'ACPT_INSPC_TYP', this);
  });
  expj.AE0170010.AE0170010form2.ACPT_INSPC_TYP.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.ACPT_INSPC_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/ACPT_INSPC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-ACPT_INSPC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-ACPT_INSPC_TYP" name="ACPT_INSPC_TYP" class="AE0170010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getACPT_INSPC_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_MODIFY_COUNT">
expj.AE0170010.AE0170010form2.h_MODIFY_COUNT = {};
expj.AE0170010.AE0170010form2.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_MODIFY_COUNT.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_MODIFY_COUNT', this);
  });
  expj.AE0170010.AE0170010form2.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2",rb)%></span><!-- 発注金額 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-PUCH_ODR_AMOUNT">
expj.AE0170010.AE0170010form2.PUCH_ODR_AMOUNT = {};
expj.AE0170010.AE0170010form2.PUCH_ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/PUCH_ODR_AMOUNT.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.PUCH_ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-PUCH_ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'PUCH_ODR_AMOUNT', this);
  });
  expj.AE0170010.AE0170010form2.PUCH_ODR_AMOUNT.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.PUCH_ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/PUCH_ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-PUCH_ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-PUCH_ODR_AMOUNT" name="PUCH_ODR_AMOUNT" class="AE0170010-focus-move  " style="width:260px;text-align: right;" data-kind="OBT_NUMBER;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getPUCH_ODR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_ACPT_APP_TYP",rb)%></span><!-- 検収計上区分 --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010form2-INSPC_ACPT_APP_TYP">
expj.AE0170010.AE0170010form2.INSPC_ACPT_APP_TYP = {};
expj.AE0170010.AE0170010form2.INSPC_ACPT_APP_TYP.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/INSPC_ACPT_APP_TYP.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.INSPC_ACPT_APP_TYP.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-INSPC_ACPT_APP_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'INSPC_ACPT_APP_TYP', this);
  });
  expj.AE0170010.AE0170010form2.INSPC_ACPT_APP_TYP.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.INSPC_ACPT_APP_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/INSPC_ACPT_APP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-INSPC_ACPT_APP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AE0170010-AE0170010form2-INSPC_ACPT_APP_TYP" name="INSPC_ACPT_APP_TYP" class="AE0170010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0170010Struct.getINSPC_ACPT_APP_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0170010-AE0170010form2-h_ODR_CANCEL_SLIP_ISS_FLG" name="h_ODR_CANCEL_SLIP_ISS_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0170010Struct.geth_ODR_CANCEL_SLIP_ISS_FLG()) %>">
<script class="expj-script-AE0170010-AE0170010form2-h_ODR_CANCEL_SLIP_ISS_FLG">
expj.AE0170010.AE0170010form2.h_ODR_CANCEL_SLIP_ISS_FLG = {};
expj.AE0170010.AE0170010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executeAllOnDecision = function () {
  console.log('execute AE0170010form2/h_ODR_CANCEL_SLIP_ISS_FLG.onDecision');
  expj.AE0170010.AE0170010form2.executeAllOnDecision();
  expj.AE0170010.executeAllOnDecision();
};
expj.AE0170010.AE0170010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010form2-h_ODR_CANCEL_SLIP_ISS_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0170010', 'AE0170010form2', 'h_ODR_CANCEL_SLIP_ISS_FLG', this);
  });
  expj.AE0170010.AE0170010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executePScriptOnLoad();
};

expj.AE0170010.AE0170010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0170010form2/h_ODR_CANCEL_SLIP_ISS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010form2-h_ODR_CANCEL_SLIP_ISS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0170010-AE0170010button2">
expj.AE0170010.AE0170010button2 = {};
expj.AE0170010.AE0170010button2.executeAllOnDecision = function () {
  console.log('execute AE0170010button2.onDecision');
};
expj.AE0170010.AE0170010button2.executeOnLoad = function () {
  expj.AE0170010.AE0170010button2.executePScriptOnLoad();
};

expj.AE0170010.AE0170010button2.executePScriptOnLoad = function () {
  console.log('execute AE0170010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0170010-AE0170010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0170010-AE0170010button2-Update">
expj.AE0170010.AE0170010button2.Update = {};
// script1="onClick;0;CHK;_AE0170010form2/TAX_CD[eq]_AE0170010form2/h_TAX_CD@!KQ00339"
expj.AE0170010.AE0170010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010button2', '_AE0170010form2/TAX_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010button2', '_AE0170010form2/h_TAX_CD'))) {
expj.common.pscript.viewErrorMessage('AE0170010', 'AE0170010button2', 'KQ00339');
}
};
// script2="onClick;1;CHK;_AE0170010form2/VEND_CD[eq]@!AE50037"
expj.AE0170010.AE0170010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0170010', 'AE0170010button2', '_AE0170010form2/VEND_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AE0170010', 'AE0170010button2', 'AE50037');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0170010form1/*,_AE0170010form2/*@AE0170010Servlet,,$ZZ07003"
expj.AE0170010.AE0170010button2.Update.onClick2 = function () {
  console.log('Update script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0170010', 'AE0170010button2', '_AE0170010form1/*,_AE0170010form2/*', 'AE0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0170010', response);
expj.common.updateBusinessScreenTab('AE0170010', contents);
};
expj.common.pscript.callConfirm('AE0170010', 'AE0170010button2', 'ZZ07003', okEvent);
};
expj.AE0170010.AE0170010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010button2.Update['onClick' + i])) {
        expj.AE0170010.AE0170010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AE0170010.AE0170010button2.Update.executeAllOnDecision = function () {
};
expj.AE0170010.AE0170010button2.Update.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0170010', 'AE0170010button2', 'Update', this, 'Button');
    }
  });
  expj.AE0170010.AE0170010button2.Update.executePScriptOnLoad();
};

expj.AE0170010.AE0170010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AE0170010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0170010-AE0170010button2-Update" name="Update" class="AE0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AE0170010-AE0170010view1">
expj.AE0170010.AE0170010view1 = {};
expj.AE0170010.AE0170010view1.executeAllOnClick = function () {
};
expj.AE0170010.AE0170010view1.executeAllOnDecision = function () {
  console.log('execute AE0170010view1.onDecision');
};
expj.AE0170010.AE0170010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0170010view1", "expj.AE0170010.AE0170010view1.executeAllOnClick");
%>
  expj.AE0170010.AE0170010view1.executePScriptOnLoad();
};

expj.AE0170010.AE0170010view1.executePScriptOnLoad = function () {
  console.log('execute AE0170010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0170010-AE0170010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0170010view1_Id = "AE0170010view1";
 String AE0170010view1_select = "single";
 String AE0170010view1_sortable = "true";
 String AE0170010view1_resize = "true";
 String AE0170010view1_scroll = "true";
 StringBuffer AE0170010view1_HB = new StringBuffer();
 StringBuffer AE0170010view1_DB = new StringBuffer();
%>
<%
 AE0170010view1_select = "none";
 AE0170010view1_sortable = "true";
 AE0170010view1_resize = "true";
 AE0170010view1_scroll = "true";
%>
<%
 AE0170010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
%>
     
<%
AE0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_NET_AMOUNT_LIST', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'103px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0721",rb))).append("', 'name':'l_STATUS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'85px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_NO",rb))).append("', 'name':'l_ACPT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_QTY_2",rb))).append("', 'name':'l_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'85px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_DATE",rb))).append("', 'name':'l_ACPT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_UNIT_COST",rb))).append("', 'name':'l_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'l_UNIT_COST_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'111px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_1",rb))).append("', 'name':'l_PUCH_ODR_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'92px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_QTY_4",rb))).append("', 'name':'l_INSPECTED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'92px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACCEPTED_QTY",rb))).append("', 'name':'l_ACCEPTED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
AE0170010view1_HB.append("{'visible':true, 'type':'string', 'width':'85px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.INSPEC_DATE",rb))).append("', 'name':'l_INSPEC_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0170010view1_sortable).append("}").append(",");
%>
<%
 int aAE0170010StructLength = aAE0170010Control.getListsize();
 final AE0170010Struct structBackup = aAE0170010Struct;
 aAE0170010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0170010StructLength; ++loopCount) {
  if((aAE0170010Struct = (AE0170010Struct) aAE0170010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0170010Struct", aAE0170010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0170010view1_DB.append("[");
 AE0170010view1_DB.append(loopCount);
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-h_NET_AMOUNT_LIST-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-h_NET_AMOUNT_LIST\" data-name=\"h_NET_AMOUNT_LIST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.geth_NET_AMOUNT_LIST())).append("</span><span id=\"expj-AE0170010-AE0170010view1-h_TAX_AMOUNT_1_LIST-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-h_TAX_AMOUNT_1_LIST\" data-name=\"h_NET_AMOUNT_LIST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.geth_TAX_AMOUNT_1_LIST())).append("</span><span id=\"expj-AE0170010-AE0170010view1-h_TAX_AMOUNT_2_LIST-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-h_TAX_AMOUNT_2_LIST\" data-name=\"h_NET_AMOUNT_LIST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.geth_TAX_AMOUNT_2_LIST())).append("</span><span id=\"expj-AE0170010-AE0170010view1-h_TAX_AMOUNT_3_LIST-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-h_TAX_AMOUNT_3_LIST\" data-name=\"h_NET_AMOUNT_LIST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.geth_TAX_AMOUNT_3_LIST())).append("</span><span id=\"expj-AE0170010-AE0170010view1-h_MODIFY_COUNT_LIST-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-h_MODIFY_COUNT_LIST\" data-name=\"h_NET_AMOUNT_LIST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.geth_MODIFY_COUNT_LIST())).append("</span><span id=\"expj-AE0170010-AE0170010view1-h_EXCH_RATE_LIST-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-h_EXCH_RATE_LIST\" data-name=\"h_NET_AMOUNT_LIST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.geth_EXCH_RATE_LIST())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_STATUS-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_STATUS\" data-name=\"l_STATUS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_STATUS())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_ACPT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_ACPT_NO\" data-name=\"l_ACPT_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_ACPT_NO())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_ACPT_QTY\" data-name=\"l_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_ACPT_QTY())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_ACPT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_ACPT_DATE\" data-name=\"l_ACPT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_ACPT_DATE())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_UNIT_COST\" data-name=\"l_UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_UNIT_COST())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_UNIT_COST_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_UNIT_COST_TYP\" data-name=\"l_UNIT_COST_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_UNIT_COST_TYP())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_PUCH_ODR_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_PUCH_ODR_AMOUNT\" data-name=\"l_PUCH_ODR_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_PUCH_ODR_AMOUNT())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_INSPECTED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_INSPECTED_QTY\" data-name=\"l_INSPECTED_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_INSPECTED_QTY())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_ACCEPTED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_ACCEPTED_QTY\" data-name=\"l_ACCEPTED_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_ACCEPTED_QTY())).append("</span>'");
 AE0170010view1_DB.append(",").append("'<span id=\"expj-AE0170010-AE0170010view1-l_INSPEC_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0170010-AE0170010view1-l_INSPEC_DATE\" data-name=\"l_INSPEC_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0170010Struct.getl_INSPEC_DATE())).append("</span>'");
 AE0170010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0170010StructLength) {
   AE0170010view1_DB.append(",");
  }
 }
 aAE0170010Struct = structBackup;
 viewIdList.add(AE0170010view1_Id);
 viewSelectList.add(AE0170010view1_select);
 viewResizeList.add(AE0170010view1_resize);
 viewScrollList.add(AE0170010view1_scroll);
 viewHeaderDataList.add(AE0170010view1_HB);
 viewBodyDataList.add(AE0170010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
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
<span class="version">AE0170010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AE0170010-AE0170010button0">
expj.AE0170010.AE0170010button0 = {};
expj.AE0170010.AE0170010button0.executeAllOnDecision = function () {
  console.log('execute AE0170010button0.onDecision');
};
expj.AE0170010.AE0170010button0.executeOnLoad = function () {
  expj.AE0170010.AE0170010button0.executePScriptOnLoad();
};

expj.AE0170010.AE0170010button0.executePScriptOnLoad = function () {
  console.log('execute AE0170010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0170010-AE0170010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0170010-AE0170010button0-Clear">
expj.AE0170010.AE0170010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0170010Servlet,,$ZZ07008"
expj.AE0170010.AE0170010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0170010', 'AE0170010button0', '', 'AE0170010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0170010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0170010', response);
expj.common.updateBusinessScreenTab('AE0170010', contents);
};
expj.common.pscript.callConfirm('AE0170010', 'AE0170010button0', 'ZZ07008', okEvent);
};
expj.AE0170010.AE0170010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010button0.Clear['onClick' + i])) {
        expj.AE0170010.AE0170010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0170010.AE0170010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0170010.AE0170010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0170010', 'AE0170010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0170010.AE0170010button0.Clear.executePScriptOnLoad();
};

expj.AE0170010.AE0170010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0170010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0170010-AE0170010button0-Clear" name="Clear" class="AE0170010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0170010-AE0170010button0-Close">
expj.AE0170010.AE0170010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0170010.AE0170010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0170010');
};
expj.AE0170010.AE0170010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0170010.AE0170010button0.Close['onClick' + i])) {
        expj.AE0170010.AE0170010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0170010.AE0170010button0.Close.executeAllOnDecision = function () {
};
expj.AE0170010.AE0170010button0.Close.executeOnLoad = function () {
  $('#expj-AE0170010-AE0170010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0170010', 'AE0170010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0170010.AE0170010button0.Close.executePScriptOnLoad();
};

expj.AE0170010.AE0170010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0170010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0170010-AE0170010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0170010-AE0170010button0-Close" name="Close" class="AE0170010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0170010 (END)-->
<%
MessageStruct msgStruct = aAE0170010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0170010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0170010)) {
  expj.common.treeInstanceMap.AE0170010 = {};
}
expj.common.treeInstanceMap.AE0170010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0170010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0170010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0170010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0170010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0170010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0170010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0170010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0170010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0170010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0170010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0170010)) {
  expj.common.detailDialogMap.AE0170010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0170010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0170010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0170010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0170010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0170010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0170010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0170010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0170010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0170010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0170010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0170010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0170010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0170010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0170010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0170010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0170010)) {
  expj.common.viewInstanceMap.AE0170010 = {};
}
expj.common.viewInstanceMap.AE0170010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0170010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0170010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0170010.<%=viewId %>.init = function () {
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
    expj.AE0170010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0170010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0170010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0170010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0170010_init">
/**
 * AE0170010用のロード完了時初期化関数
 */
expj.AE0170010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0170010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0170010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0170010');
  expj.common.calendarInstanceMap.AE0170010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0170010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0170010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0170010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0170010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0170010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0170010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0170010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0170010.AE0170010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form1.h_PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_NET_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_1.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_2.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_TAX_AMOUNT_3.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_DECIMAL_FIG.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.c_NON_NO_ITEM_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.NON_NO_ITEM_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_PUCH_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_PUCH_ODR_INST_SLIP_ISS_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.PUCH_ODR_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.PUCH_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.PUCH_ODR_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_INSPC_CMPLT_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.PUCH_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_ACPT_INSPC_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_UPDATE_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.ACPT_INSPC_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.PUCH_ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.INSPC_ACPT_APP_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form1.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010button1.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010form2.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010button2.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010view1.executeOnLoad();}catch(e){};
  try{expj.AE0170010.AE0170010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0170010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0170010', 'AE0170010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0170010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0170010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0170010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0170010', '<%=request.getContextPath() %>');
};

/**
 * AE0170010の全体onDecision処理
 */
expj.AE0170010.executeAllOnDecision = function () {
  expj.AE0170010.AE0170010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0170010_console">
expj.AE0170010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>