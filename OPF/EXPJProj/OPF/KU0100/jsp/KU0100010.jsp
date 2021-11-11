<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:03:23 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KU0100\KU0100010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KU0100.*" %>
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
<jsp:useBean id="aKU0100010Control" class="com.nec.jp.orteus.metamorBase.KU0100.KU0100010Control" scope="request"/>
<jsp:useBean id="aKU0100010Struct" class="com.nec.jp.orteus.metamorBase.KU0100.KU0100010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出荷インボイス帳票出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0100/jsp/KU0100010.jsp,v $
$Author: geng-jia $
$Revision: 1.2 $ $Date: 2017/02/22 02:07:32 $
********************************************************* --%>
<html>
<head>
<title>出荷インボイス帳票出力</title>
<%@include file="common/expj_v5.jsp" %>
<script language="JavaScript">
<!--
function downLoadCsvFromFlash(str){
	var obj = this;
	if(str != null && str != "") {
		var temp = obj.window.location.pathname.split("/");
		var url = obj.window.location.protocol + "//" + obj.window.location.host + "/" + temp[1];
		var fileArray = str.split("|");
		if(fileArray.length > 0) {
			var i;
			for (i in fileArray) {
				var newWin = window.open(url + fileArray[i]);
			}
		}
	} else {
		return false;
	}
}
-->
</script>
<%
    // システムオプション識別子
    String strOptionId = aKU0100010Struct.getOPTION_ID();

	String strDlvPeekerName = "";
	String strDlvPeekerParam2 = "";
	String strDlvPeekerParam3 = "";
	// Explanner/Jaの場合
	if("JA*".equals(strOptionId)){
	    strDlvPeekerName = "MP_DLV_LOC_CD_04";
		strDlvPeekerParam2 = "_DLV_LOC_CD";
		strDlvPeekerParam3 = "";
	}
	// Explanner/Ja以外の場合
	else{
	    strDlvPeekerName = "DLV_LOC_CD_01";
		strDlvPeekerParam2 = "";
		strDlvPeekerParam3 = "_DLV_LOC_CD";
	}
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
<script class="expj-script-KU0100010_init">
  // KU0100010名前空間
  expj.KU0100010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KU0100010" data-screen="KU0100010" data-newdata="<%=aKU0100010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px">
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

     <div class="expj-tr expjDynamicHeight" style="">
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;">
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">

            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">

            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;">
              <!-- 1段目のDataGrid配置↓ -->
              <script class="expj-script-KU0100010-KU0100010form1">
expj.KU0100010.KU0100010form1 = {};
// script1="onLoad;1;CALL;onDecision@0,1,2,3"
expj.KU0100010.KU0100010form1.onLoad1 = function () {
  console.log('KU0100010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;_KU0100010form1/r_MasterPrint[eq]true@*0,*1"
expj.KU0100010.KU0100010form1.onDecision0 = function () {
  console.log('KU0100010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/r_MasterPrint'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;MASK;_KU0100010form1/COUNT"
expj.KU0100010.KU0100010form1.child0 = function () {
  console.log('KU0100010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('KU0100010', 'KU0100010form1', '_KU0100010form1/COUNT');
};
// script4="child;1;UNMASK;_KU0100010form1/COUNT"
expj.KU0100010.KU0100010form1.child1 = function () {
  console.log('KU0100010form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('KU0100010', 'KU0100010form1', '_KU0100010form1/COUNT');
};
// script5="onDecision;1;CHK;_KU0100010form1/RE_OUT_PUT[eq]true@*2,*3"
expj.KU0100010.KU0100010form1.onDecision1 = function () {
  console.log('KU0100010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/RE_OUT_PUT'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;SET;_KU0100010form1/c_RE_OUT_PUT=true"
expj.KU0100010.KU0100010form1.child2 = function () {
  console.log('KU0100010form1 script6');
expj.common.pscript.setReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/c_RE_OUT_PUT', 'true');
};
// script7="child;3;SET;_KU0100010form1/c_RE_OUT_PUT=false"
expj.KU0100010.KU0100010form1.child3 = function () {
  console.log('KU0100010form1 script7');
expj.common.pscript.setReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/c_RE_OUT_PUT', 'false');
};
// script8="onDecision;2;CHK;_KU0100010form1/OPTION_ID[neq]JA*@*4"
expj.KU0100010.KU0100010form1.onDecision2 = function () {
  console.log('KU0100010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/OPTION_ID'), '[neq]', 'JA*')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="child;4;MASK;_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM,_KU0100010form1/SHIP_PLAN_DATE_TIME_TO"
expj.KU0100010.KU0100010form1.child4 = function () {
  console.log('KU0100010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KU0100010', 'KU0100010form1', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('KU0100010', 'KU0100010form1', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO');
};
// script10="onDecision;3;CHK;_KU0100010form1/r_CopyPrint[eq]true@*5"
expj.KU0100010.KU0100010form1.onDecision3 = function () {
  console.log('KU0100010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/r_CopyPrint'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script11="child;5;CHKRQ;A@*7,*6"
expj.KU0100010.KU0100010form1.child5 = function () {
  console.log('KU0100010form1 script11');
if (expj.common.pscript.satisfiedRequiredComponent('KU0100010', 'A')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script12="child;6;MASK;KU0100010button0/Print"
expj.KU0100010.KU0100010form1.child6 = function () {
  console.log('KU0100010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('KU0100010', 'KU0100010form1', 'KU0100010button0/Print');
};
// script13="child;7;UNMASK;KU0100010button0/Print"
expj.KU0100010.KU0100010form1.child7 = function () {
  console.log('KU0100010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KU0100010', 'KU0100010form1', 'KU0100010button0/Print');
};
expj.KU0100010.KU0100010form1.executeAllOnDecision = function () {
  console.log('execute KU0100010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1['onDecision' + i])) {
        expj.KU0100010.KU0100010form1['onDecision' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.executeOnLoad = function () {
  expj.KU0100010.KU0100010form1.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1['onLoad' + i])) {
      expj.KU0100010.KU0100010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KU0100010-KU0100010form1" action="KU0100010Servlet" name="KU0100010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:86px;align:"></div>
<div class="div-td" style="width:32px;align:"></div>
<div class="div-td" style="width:40px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:78px;align:"></div>
<div class="div-td" style="width:0px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:180px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:86px;"></div><!--/td-->
<div class="div-td" style="width:32px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:180px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:86px;"></div><!--/td-->
<div class="div-td" style="width:32px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:180px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-CUST_CD">
expj.KU0100010.KU0100010form1.CUST_CD = {};
expj.KU0100010.KU0100010form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/CUST_CD.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'CUST_CD', this);
  });
  expj.KU0100010.KU0100010form1.CUST_CD.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-CUST_CD" name="CUST_CD" class="KU0100010-focus-move  " style="width:250px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getCUST_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-PeekerCustCd">
expj.KU0100010.KU0100010form1.PeekerCustCd = {};
// script1="onClick;0;PEEKER;_KU0100010form1/CUST_CD@<%=contextNo%>"
expj.KU0100010.KU0100010form1.PeekerCustCd.onClick0 = function () {
  console.log('PeekerCustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0100010';
var parameterValues = 'PeekerCustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0100010form1/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0100010.KU0100010form1.PeekerCustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.PeekerCustCd['onClick' + i])) {
        expj.KU0100010.KU0100010form1.PeekerCustCd['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.PeekerCustCd.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010form1.PeekerCustCd.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-PeekerCustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'PeekerCustCd', this, 'Button');
    }
  });
  expj.KU0100010.KU0100010form1.PeekerCustCd.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.PeekerCustCd.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/PeekerCustCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-PeekerCustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0100010-KU0100010form1-PeekerCustCd" class="KU0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0100010-KU0100010form1-COPY" name="COPY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getCOPY()) %>">
<script class="expj-script-KU0100010-KU0100010form1-COPY">
expj.KU0100010.KU0100010form1.COPY = {};
expj.KU0100010.KU0100010form1.COPY.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/COPY.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.COPY.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-COPY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'COPY', this);
  });
  expj.KU0100010.KU0100010form1.COPY.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.COPY.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/COPY.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-COPY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:180px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-DLV_LOC_CD">
expj.KU0100010.KU0100010form1.DLV_LOC_CD = {};
expj.KU0100010.KU0100010form1.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/DLV_LOC_CD.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'DLV_LOC_CD', this);
  });
  expj.KU0100010.KU0100010form1.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-DLV_LOC_CD" name="DLV_LOC_CD" class="KU0100010-focus-move  " style="width:250px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getDLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-PeekerDlvLocCd">
expj.KU0100010.KU0100010form1.PeekerDlvLocCd = {};
// script1="onClick;0;PEEKER;_KU0100010form1/DLV_LOC_CD@<%=contextNo%>"
expj.KU0100010.KU0100010form1.PeekerDlvLocCd.onClick0 = function () {
  console.log('PeekerDlvLocCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0100010';
var parameterValues = 'PeekerDlvLocCd%=%汎用%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KU0100010', 'PeekerDlvLocCd', 'SQLPARAM_2', '<%=strDlvPeekerParam2%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%<%=strDlvPeekerName%>%&%';
parameterValues += 'TARGET_FIELD%=%_KU0100010form1/DLV_LOC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0100010.KU0100010form1.PeekerDlvLocCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.PeekerDlvLocCd['onClick' + i])) {
        expj.KU0100010.KU0100010form1.PeekerDlvLocCd['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.PeekerDlvLocCd.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010form1.PeekerDlvLocCd.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-PeekerDlvLocCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'PeekerDlvLocCd', this, 'Button');
    }
  });
  expj.KU0100010.KU0100010form1.PeekerDlvLocCd.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.PeekerDlvLocCd.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/PeekerDlvLocCd.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-PeekerDlvLocCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0100010-KU0100010form1-PeekerDlvLocCd" class="KU0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0100010-KU0100010form1-RE_OUT_PUT" name="RE_OUT_PUT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getRE_OUT_PUT()) %>">
<script class="expj-script-KU0100010-KU0100010form1-RE_OUT_PUT">
expj.KU0100010.KU0100010form1.RE_OUT_PUT = {};
expj.KU0100010.KU0100010form1.RE_OUT_PUT.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/RE_OUT_PUT.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.RE_OUT_PUT.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-RE_OUT_PUT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'RE_OUT_PUT', this);
  });
  expj.KU0100010.KU0100010form1.RE_OUT_PUT.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.RE_OUT_PUT.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/RE_OUT_PUT.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-RE_OUT_PUT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:180px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_INVOICE_CTL_NO",rb)%></span><!-- 出荷インボイス管理番号 --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-SHIP_INVOICE_CTL_NO">
expj.KU0100010.KU0100010form1.SHIP_INVOICE_CTL_NO = {};
expj.KU0100010.KU0100010form1.SHIP_INVOICE_CTL_NO.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/SHIP_INVOICE_CTL_NO.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.SHIP_INVOICE_CTL_NO.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-SHIP_INVOICE_CTL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'SHIP_INVOICE_CTL_NO', this);
  });
  expj.KU0100010.KU0100010form1.SHIP_INVOICE_CTL_NO.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.SHIP_INVOICE_CTL_NO.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/SHIP_INVOICE_CTL_NO.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-SHIP_INVOICE_CTL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:258px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-SHIP_INVOICE_CTL_NO" name="SHIP_INVOICE_CTL_NO" class="KU0100010-focus-move  " style="width:250px;" data-kind="" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getSHIP_INVOICE_CTL_NO()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-PeekerShipInvoiceCtlNo">
expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo = {};
// script1="onClick;0;PEEKER;_KU0100010form1/SHIP_INVOICE_CTL_NO@<%=contextNo%>"
expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo.onClick0 = function () {
  console.log('PeekerShipInvoiceCtlNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KU0100010';
var parameterValues = 'PeekerShipInvoiceCtlNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_SHIP_INVOICE_CTL_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%SHIP_INVOICE_CTL_NO_01%&%';
parameterValues += 'TARGET_FIELD%=%_KU0100010form1/SHIP_INVOICE_CTL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KU0100010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo['onClick' + i])) {
        expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-PeekerShipInvoiceCtlNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'PeekerShipInvoiceCtlNo', this, 'Button');
    }
  });
  expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/PeekerShipInvoiceCtlNo.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-PeekerShipInvoiceCtlNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0100010-KU0100010form1-PeekerShipInvoiceCtlNo" class="KU0100010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0100010-KU0100010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KU0100010-KU0100010form1-DOWNLOAD_FILE">
expj.KU0100010.KU0100010form1.DOWNLOAD_FILE = {};
expj.KU0100010.KU0100010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/DOWNLOAD_FILE.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'DOWNLOAD_FILE', this);
  });
  expj.KU0100010.KU0100010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:180px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SHIP_INVOICE_DATE",rb)%></span><!-- 出荷インボイス作成日 --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_FROM">
expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_FROM = {};
expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/SHIP_INVOICE_DATE_FROM.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_FROM.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'SHIP_INVOICE_DATE_FROM', this);
  });
  expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_FROM.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/SHIP_INVOICE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:158px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_FROM" name="SHIP_INVOICE_DATE_FROM" class="KU0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getSHIP_INVOICE_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-CalendarShipInvoiceDateFrom">
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom = {};
// script1="onClick;0;CALENDAR;_KU0100010form1/SHIP_INVOICE_DATE_FROM@<%=contextNo%>"
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom.onClick0 = function () {
  console.log('CalendarShipInvoiceDateFrom script1');
expj.common.pscript.executeCalendar('KU0100010','KU0100010form1','_KU0100010form1/SHIP_INVOICE_DATE_FROM');
};
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom['onClick' + i])) {
        expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-CalendarShipInvoiceDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'CalendarShipInvoiceDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0100010','KU0100010form1','_KU0100010form1/SHIP_INVOICE_DATE_FROM');
  expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/CalendarShipInvoiceDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-CalendarShipInvoiceDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0100010-KU0100010form1-CalendarShipInvoiceDateFrom" class="KU0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_TO">
expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_TO = {};
expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/SHIP_INVOICE_DATE_TO.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_TO.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'SHIP_INVOICE_DATE_TO', this);
  });
  expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_TO.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/SHIP_INVOICE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-SHIP_INVOICE_DATE_TO" name="SHIP_INVOICE_DATE_TO" class="KU0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getSHIP_INVOICE_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-CalendarShipInvoiceDateTo">
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo = {};
// script1="onClick;0;CALENDAR;_KU0100010form1/SHIP_INVOICE_DATE_TO@<%=contextNo%>"
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo.onClick0 = function () {
  console.log('CalendarShipInvoiceDateTo script1');
expj.common.pscript.executeCalendar('KU0100010','KU0100010form1','_KU0100010form1/SHIP_INVOICE_DATE_TO');
};
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo['onClick' + i])) {
        expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-CalendarShipInvoiceDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'CalendarShipInvoiceDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0100010','KU0100010form1','_KU0100010form1/SHIP_INVOICE_DATE_TO');
  expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/CalendarShipInvoiceDateTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-CalendarShipInvoiceDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0100010-KU0100010form1-CalendarShipInvoiceDateTo" class="KU0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:180px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SCDL_SHIP_DATE",rb)%></span><!-- 出荷予定日 --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-SCDL_SHIP_DATE_FROM">
expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_FROM = {};
expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/SCDL_SHIP_DATE_FROM.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_FROM.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-SCDL_SHIP_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'SCDL_SHIP_DATE_FROM', this);
  });
  expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_FROM.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/SCDL_SHIP_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-SCDL_SHIP_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:158px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-SCDL_SHIP_DATE_FROM" name="SCDL_SHIP_DATE_FROM" class="KU0100010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getSCDL_SHIP_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-CalendarScdlShipDateFrom">
expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom = {};
// script1="onClick;0;CALENDAR;_KU0100010form1/SCDL_SHIP_DATE_FROM@<%=contextNo%>"
expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom.onClick0 = function () {
  console.log('CalendarScdlShipDateFrom script1');
expj.common.pscript.executeCalendar('KU0100010','KU0100010form1','_KU0100010form1/SCDL_SHIP_DATE_FROM');
};
expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom['onClick' + i])) {
        expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-CalendarScdlShipDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'CalendarScdlShipDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0100010','KU0100010form1','_KU0100010form1/SCDL_SHIP_DATE_FROM');
  expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/CalendarScdlShipDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-CalendarScdlShipDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0100010-KU0100010form1-CalendarScdlShipDateFrom" class="KU0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_FROM">
expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_FROM = {};
expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/SHIP_PLAN_DATE_TIME_FROM.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_FROM.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'SHIP_PLAN_DATE_TIME_FROM', this);
  });
  expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_FROM.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/SHIP_PLAN_DATE_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:78px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_FROM" name="SHIP_PLAN_DATE_TIME_FROM" class="KU0100010-focus-move  " style="width:78px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getSHIP_PLAN_DATE_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-SCDL_SHIP_DATE_TO">
expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_TO = {};
expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_TO.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/SCDL_SHIP_DATE_TO.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_TO.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-SCDL_SHIP_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'SCDL_SHIP_DATE_TO', this);
  });
  expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_TO.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/SCDL_SHIP_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-SCDL_SHIP_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-SCDL_SHIP_DATE_TO" name="SCDL_SHIP_DATE_TO" class="KU0100010-focus-move  " style="width:100%;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getSCDL_SHIP_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-CalendarScdlShipDateTo">
expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo = {};
// script1="onClick;0;CALENDAR;_KU0100010form1/SCDL_SHIP_DATE_TO@<%=contextNo%>"
expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo.onClick0 = function () {
  console.log('CalendarScdlShipDateTo script1');
expj.common.pscript.executeCalendar('KU0100010','KU0100010form1','_KU0100010form1/SCDL_SHIP_DATE_TO');
};
expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo['onClick' + i])) {
        expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-CalendarScdlShipDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'CalendarScdlShipDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KU0100010','KU0100010form1','_KU0100010form1/SCDL_SHIP_DATE_TO');
  expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/CalendarScdlShipDateTo.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-CalendarScdlShipDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KU0100010-KU0100010form1-CalendarScdlShipDateTo" class="KU0100010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_TO">
expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_TO = {};
expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_TO.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/SHIP_PLAN_DATE_TIME_TO.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_TO.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'SHIP_PLAN_DATE_TIME_TO', this);
  });
  expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_TO.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/SHIP_PLAN_DATE_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:180px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-SHIP_PLAN_DATE_TIME_TO" name="SHIP_PLAN_DATE_TIME_TO" class="KU0100010-focus-move  " style="width:78px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getSHIP_PLAN_DATE_TIME_TO()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:86px;"></div><!--/td-->
<div class="div-td" style="width:32px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:180px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:86px;"></div><!--/td-->
<div class="div-td" style="width:32px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:180px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-c_RE_OUT_PUT">
expj.KU0100010.KU0100010form1.c_RE_OUT_PUT = {};
// script1="onClick;0;CHK;_KU0100010form1/c_RE_OUT_PUT[eq]true@*0,*1"
expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.onClick0 = function () {
  console.log('c_RE_OUT_PUT script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/c_RE_OUT_PUT'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_KU0100010form1/RE_OUT_PUT=true"
expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.child0 = function () {
  console.log('c_RE_OUT_PUT script2');
expj.common.pscript.setReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/RE_OUT_PUT', 'true');
};
// script3="child;1;SET;_KU0100010form1/RE_OUT_PUT=false"
expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.child1 = function () {
  console.log('c_RE_OUT_PUT script3');
expj.common.pscript.setReferenceComponentValue('KU0100010', 'KU0100010form1', '_KU0100010form1/RE_OUT_PUT', 'false');
};
expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010form1.c_RE_OUT_PUT['onClick' + i])) {
        expj.KU0100010.KU0100010form1.c_RE_OUT_PUT['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/c_RE_OUT_PUT.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-c_RE_OUT_PUT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'c_RE_OUT_PUT', this, 'CheckBox');
    }
  });
  expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/c_RE_OUT_PUT.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-c_RE_OUT_PUT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:86px;text-align:left;"><input type="checkbox" name="c_RE_OUT_PUT" value="" <%= ("true".equals(TypeConverter.convert(aKU0100010Struct.getc_RE_OUT_PUT())) || "1".equals(TypeConverter.convert(aKU0100010Struct.getc_RE_OUT_PUT())))?"checked=\"checked\"":"" %>  class="KU0100010-focus-move" id="expj-KU0100010-KU0100010form1-c_RE_OUT_PUT"><label for="expj-KU0100010-KU0100010form1-c_RE_OUT_PUT"><%=CoreTools.getRBString("Expj.Cmt0203",rb)%></label></div><!--/td-->
<div class="div-td" style="width:32px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KU0100010-KU0100010form1-OPTION_ID" name="OPTION_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getOPTION_ID()) %>">
<script class="expj-script-KU0100010-KU0100010form1-OPTION_ID">
expj.KU0100010.KU0100010form1.OPTION_ID = {};
expj.KU0100010.KU0100010form1.OPTION_ID.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/OPTION_ID.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.OPTION_ID.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-OPTION_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'OPTION_ID', this);
  });
  expj.KU0100010.KU0100010form1.OPTION_ID.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.OPTION_ID.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/OPTION_ID.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-OPTION_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:180px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-r_MasterPrint">
expj.KU0100010.KU0100010form1.r_MasterPrint = {};
expj.KU0100010.KU0100010form1.r_MasterPrint.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/r_MasterPrint.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.r_MasterPrint.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-r_MasterPrint').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'r_MasterPrint', this, 'RadioButton');
    }
  });
  expj.KU0100010.KU0100010form1.r_MasterPrint.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.r_MasterPrint.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/r_MasterPrint.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-r_MasterPrint');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:86px;text-align:left;"><input type="radio" name="A" data-name="r_MasterPrint" value="true" <%= ("true".equals(TypeConverter.convert(aKU0100010Struct.getr_MasterPrint())) || "".equals(TypeConverter.convert(aKU0100010Struct.getr_MasterPrint())))?"checked=\"checked\"": "" %> class="" id="expj-KU0100010-KU0100010form1-r_MasterPrint" ><label for="expj-KU0100010-KU0100010form1-r_MasterPrint"><%=CoreTools.getRBString("Expj.Cmt6222",rb)%></label></div><!--/td-->
<div class="div-td" style="width:32px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:180px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-r_CopyPrint">
expj.KU0100010.KU0100010form1.r_CopyPrint = {};
expj.KU0100010.KU0100010form1.r_CopyPrint.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/r_CopyPrint.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.r_CopyPrint.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-r_CopyPrint').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010form1', 'r_CopyPrint', this, 'RadioButton');
    }
  });
  expj.KU0100010.KU0100010form1.r_CopyPrint.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.r_CopyPrint.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/r_CopyPrint.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-r_CopyPrint');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:86px;text-align:left;"><input type="radio" name="A" data-name="r_CopyPrint" value="true" <%= ("true".equals(TypeConverter.convert(aKU0100010Struct.getr_CopyPrint())))?"checked=\"checked\"":"" %> class="" id="expj-KU0100010-KU0100010form1-r_CopyPrint" ><label for="expj-KU0100010-KU0100010form1-r_CopyPrint"><%=CoreTools.getRBString("Expj.Cmt6223",rb)%></label></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010form1-COUNT">
expj.KU0100010.KU0100010form1.COUNT = {};
expj.KU0100010.KU0100010form1.COUNT.executeAllOnDecision = function () {
  console.log('execute KU0100010form1/COUNT.onDecision');
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
  expj.KU0100010.executeAllOnDecision();
};
expj.KU0100010.KU0100010form1.COUNT.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010form1-COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KU0100010', 'KU0100010form1', 'COUNT', this);
  });
  expj.KU0100010.KU0100010form1.COUNT.executePScriptOnLoad();
};

expj.KU0100010.KU0100010form1.COUNT.executePScriptOnLoad = function () {
  console.log('execute KU0100010form1/COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010form1-COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:32px;text-align:left;"><input type="text" id="expj-KU0100010-KU0100010form1-COUNT" name="COUNT" class="KU0100010-focus-move  required-value expj-KU0100010-required-A" style="width:32px;text-align: right;" data-kind="OBT_INTEGER;2;;" value="<%= TypeConverter.sanitizer(aKU0100010Struct.getCOUNT()) %>" maxlength="2" ></div><!--/td-->
<div class="div-td" style="width:40px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt6224",rb)%></span><!-- 」部 --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:78px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:180px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 1段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame03 button-area-left" style="width:60px;"></div><!--/td-->
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
<span class="version">KU0100010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KU0100010-KU0100010button0">
expj.KU0100010.KU0100010button0 = {};
expj.KU0100010.KU0100010button0.executeAllOnDecision = function () {
  console.log('execute KU0100010button0.onDecision');
};
expj.KU0100010.KU0100010button0.executeOnLoad = function () {
  expj.KU0100010.KU0100010button0.executePScriptOnLoad();
};

expj.KU0100010.KU0100010button0.executePScriptOnLoad = function () {
  console.log('execute KU0100010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KU0100010-KU0100010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KU0100010-KU0100010button0-Print">
expj.KU0100010.KU0100010button0.Print = {};
// script1="onClick;0;CHK;_KU0100010form1/SHIP_INVOICE_DATE_FROM[neq][and]_KU0100010form1/SHIP_INVOICE_DATE_TO[neq][and]_KU0100010form1/SHIP_INVOICE_DATE_FROM[gt]_KU0100010form1/SHIP_INVOICE_DATE_TO@!KU00115"
expj.KU0100010.KU0100010button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_INVOICE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_INVOICE_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_INVOICE_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_INVOICE_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU00115');
}
};
// script2="onClick;1;CHK;_KU0100010form1/SCDL_SHIP_DATE_FROM[neq][and]_KU0100010form1/SCDL_SHIP_DATE_TO[neq][and]_KU0100010form1/SCDL_SHIP_DATE_FROM[gt]_KU0100010form1/SCDL_SHIP_DATE_TO@!KU10017"
expj.KU0100010.KU0100010button0.Print.onClick1 = function () {
  console.log('Print script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10017');
}
};
// script3="onClick;2;CHK;_KU0100010form1/OPTION_ID[eq]JA*[and]_KU0100010form1/SCDL_SHIP_DATE_FROM[eq][and]_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM[neq]@!KU10094"
expj.KU0100010.KU0100010button0.Print.onClick2 = function () {
  console.log('Print script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10094');
}
};
// script4="onClick;3;CHK;_KU0100010form1/OPTION_ID[eq]JA*[and]_KU0100010form1/SCDL_SHIP_DATE_TO[eq][and]_KU0100010form1/SHIP_PLAN_DATE_TIME_TO[neq]@!KU10095"
expj.KU0100010.KU0100010button0.Print.onClick3 = function () {
  console.log('Print script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10095');
}
};
// script5="onClick;4;CHK;_KU0100010form1/OPTION_ID[eq]JA*[and]_KU0100010form1/SCDL_SHIP_DATE_FROM[neq][and]_KU0100010form1/SCDL_SHIP_DATE_TO[neq][and]_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM[neq][and]_KU0100010form1/SHIP_PLAN_DATE_TIME_TO[neq]@*0"
expj.KU0100010.KU0100010button0.Print.onClick4 = function () {
  console.log('Print script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script6="child;0;CHK;_KU0100010form1/SCDL_SHIP_DATE_FROM[eq]_KU0100010form1/SCDL_SHIP_DATE_TO[and]_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM[gt]_KU0100010form1/SHIP_PLAN_DATE_TIME_TO@!KU10017"
expj.KU0100010.KU0100010button0.Print.child0 = function () {
  console.log('Print script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SCDL_SHIP_DATE_TO')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO')))) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10017');
}
};
// script7="onClick;5;CHK;_KU0100010form1/OPTION_ID[eq]JA*@*1"
expj.KU0100010.KU0100010button0.Print.onClick5 = function () {
  console.log('Print script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script8="child;1;CHK;~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]1[or]~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]2@!KU10096"
expj.KU0100010.KU0100010button0.Print.child1 = function () {
  console.log('Print script8');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10096');
}
};
// script9="onClick;6;CHK;_KU0100010form1/OPTION_ID[eq]JA*@*2"
expj.KU0100010.KU0100010button0.Print.onClick6 = function () {
  console.log('Print script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script10="child;2;CHK;~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO)[eq]1[or]~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO)[eq]2@!KU10097@!KU10096"
expj.KU0100010.KU0100010button0.Print.child2 = function () {
  console.log('Print script10');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10097');
}
};
// script11="onClick;7;CHK;_KU0100010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]3@*3"
expj.KU0100010.KU0100010button0.Print.onClick7 = function () {
  console.log('Print script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script12="child;3;CHK;[{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM:1)}*10+{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM:2)}][gte]60@!KU10100"
expj.KU0100010.KU0100010button0.Print.child3 = function () {
  console.log('Print script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10100');
}
};
// script13="onClick;8;CHK;_KU0100010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM)[eq]4@*4"
expj.KU0100010.KU0100010button0.Print.onClick8 = function () {
  console.log('Print script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;CHK;[{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM:0)}*10+{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM:1)}][gte]24[or][{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM:2)}*10+{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM:3)}][gte]60@!KU10100"
expj.KU0100010.KU0100010button0.Print.child4 = function () {
  console.log('Print script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10100');
}
};
// script15="onClick;9;CHK;_KU0100010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO)[eq]3@*5"
expj.KU0100010.KU0100010button0.Print.onClick9 = function () {
  console.log('Print script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script16="child;5;CHK;[{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO:1)}*10+{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO:2)}][gte]60@!KU10101"
expj.KU0100010.KU0100010button0.Print.child5 = function () {
  console.log('Print script16');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10101');
}
};
// script17="onClick;10;CHK;_KU0100010form1/OPTION_ID[eq]JA*[and]~LEN(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO)[eq]4@*6"
expj.KU0100010.KU0100010button0.Print.onClick10 = function () {
  console.log('Print script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KU0100010', 'KU0100010button0', '_KU0100010form1/OPTION_ID'), '[eq]', 'JA*') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script18="child;6;CHK;[{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO:0)}*10+{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO:1)}][gte]24[or][{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO:2)}*10+{~CHARAT(_KU0100010form1/SHIP_PLAN_DATE_TIME_TO:3)}][gte]60@!KU10101"
expj.KU0100010.KU0100010button0.Print.child6 = function () {
  console.log('Print script18');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('KU0100010', 'KU0100010button0', '_KU0100010form1/SHIP_PLAN_DATE_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('KU0100010', 'KU0100010button0', 'KU10101');
}
};
// script19="onClick;11;PRINTER;ORTEUS_HASHED=<%=hashed%>,_KU0100010form1/*@KU0100010Servlet:H,H,H"
expj.KU0100010.KU0100010button0.Print.onClick11 = function () {
  console.log('Print script19');
expj.common.pscript.viewPrinterDialog('KU0100010', 'KU0100010button0', '_KU0100010form1/*', 'KU0100010Servlet', 'H,H,H');
};
expj.KU0100010.KU0100010button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 11; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010button0.Print['onClick' + i])) {
        expj.KU0100010.KU0100010button0.Print['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010button0.Print.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010button0.Print.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010button0', 'Print', this, 'Button');
    }
  });
  expj.KU0100010.KU0100010button0.Print.executePScriptOnLoad();
};

expj.KU0100010.KU0100010button0.Print.executePScriptOnLoad = function () {
  console.log('execute KU0100010button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0100010-KU0100010button0-Print" name="Print" class="KU0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010button0-Clear">
expj.KU0100010.KU0100010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KU0100010Servlet,,$ZZ07008"
expj.KU0100010.KU0100010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KU0100010', 'KU0100010button0', '', 'KU0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KU0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KU0100010', response);
expj.common.updateBusinessScreenTab('KU0100010', contents);
};
expj.common.pscript.callConfirm('KU0100010', 'KU0100010button0', 'ZZ07008', okEvent);
};
expj.KU0100010.KU0100010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010button0.Clear['onClick' + i])) {
        expj.KU0100010.KU0100010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010button0.Clear.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010button0.Clear.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010button0', 'Clear', this, 'Button');
    }
  });
  expj.KU0100010.KU0100010button0.Clear.executePScriptOnLoad();
};

expj.KU0100010.KU0100010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KU0100010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0100010-KU0100010button0-Clear" name="Clear" class="KU0100010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KU0100010-KU0100010button0-Close">
expj.KU0100010.KU0100010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KU0100010.KU0100010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KU0100010');
};
expj.KU0100010.KU0100010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KU0100010.KU0100010button0.Close['onClick' + i])) {
        expj.KU0100010.KU0100010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KU0100010.KU0100010button0.Close.executeAllOnDecision = function () {
};
expj.KU0100010.KU0100010button0.Close.executeOnLoad = function () {
  $('#expj-KU0100010-KU0100010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KU0100010', 'KU0100010button0', 'Close', this, 'Button');
    }
  });
  expj.KU0100010.KU0100010button0.Close.executePScriptOnLoad();
};

expj.KU0100010.KU0100010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KU0100010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KU0100010-KU0100010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KU0100010-KU0100010button0-Close" name="Close" class="KU0100010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KU0100010 (END)-->
<%
MessageStruct msgStruct = aKU0100010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KU0100010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KU0100010)) {
  expj.common.treeInstanceMap.KU0100010 = {};
}
expj.common.treeInstanceMap.KU0100010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0100010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KU0100010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KU0100010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KU0100010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KU0100010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KU0100010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KU0100010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KU0100010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KU0100010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KU0100010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0100010)) {
  expj.common.detailDialogMap.KU0100010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0100010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KU0100010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0100010.<%=detailId %>)) {
  expj.common.detailDialogMap.KU0100010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0100010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KU0100010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KU0100010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KU0100010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KU0100010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KU0100010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KU0100010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KU0100010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KU0100010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KU0100010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KU0100010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KU0100010)) {
  expj.common.viewInstanceMap.KU0100010 = {};
}
expj.common.viewInstanceMap.KU0100010.<%=viewId %> = {};
expj.common.viewInstanceMap.KU0100010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KU0100010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KU0100010.<%=viewId %>.init = function () {
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
    expj.KU0100010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KU0100010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KU0100010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KU0100010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KU0100010_init">
/**
 * KU0100010用のロード完了時初期化関数
 */
expj.KU0100010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KU0100010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KU0100010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KU0100010');
  expj.common.calendarInstanceMap.KU0100010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KU0100010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.init();
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KU0100010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KU0100010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KU0100010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KU0100010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KU0100010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KU0100010-<%=detailId %>');
<%
 }
%>
  try{expj.KU0100010.KU0100010form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.PeekerCustCd.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.COPY.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.PeekerDlvLocCd.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.RE_OUT_PUT.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.SHIP_INVOICE_CTL_NO.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.PeekerShipInvoiceCtlNo.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateFrom.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.SHIP_INVOICE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.CalendarShipInvoiceDateTo.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.CalendarScdlShipDateFrom.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.SCDL_SHIP_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.CalendarScdlShipDateTo.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.SHIP_PLAN_DATE_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.c_RE_OUT_PUT.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.OPTION_ID.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.r_MasterPrint.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.r_CopyPrint.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.COUNT.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010button0.Print.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010form1.executeOnLoad();}catch(e){};
  try{expj.KU0100010.KU0100010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KU0100010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KU0100010', 'KU0100010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KU0100010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KU0100010-focus-move');
  // 初期フォーカス当てる処理
  $('.KU0100010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KU0100010', '<%=request.getContextPath() %>');
};

/**
 * KU0100010の全体onDecision処理
 */
expj.KU0100010.executeAllOnDecision = function () {
  expj.KU0100010.KU0100010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KU0100010_console">
expj.KU0100010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>