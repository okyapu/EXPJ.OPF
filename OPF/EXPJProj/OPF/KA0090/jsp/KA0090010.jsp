<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:57:23 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KA0090\KA0090010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KA0090.*" %>
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
<jsp:useBean id="aKA0090010Control" class="com.nec.jp.orteus.metamorBase.KA0090.KA0090010Control" scope="request"/>
<jsp:useBean id="aKA0090010Struct" class="com.nec.jp.orteus.metamorBase.KA0090.KA0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

部門メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0090/jsp/KA0090010.jsp,v $
$Author: geng-jia $	
$Revision: 1.9 $ $Date: 2017/02/22 02:06:56 $
********************************************************* --%>
<html>
<head>
<title>部門メンテナンス</title>
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
<script class="expj-script-KA0090010_init">
  // KA0090010名前空間
  expj.KA0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KA0090010" data-screen="KA0090010" data-newdata="<%=aKA0090010Control.isNewData() %>">
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
              <script class="expj-script-KA0090010-KA0090010form1">
expj.KA0090010.KA0090010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.KA0090010.KA0090010form1.onLoad0 = function () {
  console.log('KA0090010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KA0090010.KA0090010form1.onDecision0 = function () {
  console.log('KA0090010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KA0090010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?KA0090010form1/ORG_CD[eq]SAME[and]?KA0090010form1/*[eq]NORMAL@*6,*3"
expj.KA0090010.KA0090010form1.onDecision1 = function () {
  console.log('KA0090010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0090010', 'KA0090010form1', '?KA0090010form1/ORG_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0090010', 'KA0090010form1', '?KA0090010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="onDecision;2;CHK;?KA0090010form1/ORG_CD[eq]SAME[and]?KA0090010form1/*[eq]NORMAL@*7,*5"
expj.KA0090010.KA0090010form1.onDecision2 = function () {
  console.log('KA0090010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0090010', 'KA0090010form1', '?KA0090010form1/ORG_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0090010', 'KA0090010form1', '?KA0090010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="onDecision;3;CHK;?KA0090010form1/ORG_CD[eq]SAME@*8,*9"
expj.KA0090010.KA0090010form1.onDecision3 = function () {
  console.log('KA0090010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0090010', 'KA0090010form1', '?KA0090010form1/ORG_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script6="child;0;UNMASK;_KA0090010button1/select"
expj.KA0090010.KA0090010form1.child0 = function () {
  console.log('KA0090010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button1/select');
};
// script7="child;1;MASK;_KA0090010button1/select"
expj.KA0090010.KA0090010form1.child1 = function () {
  console.log('KA0090010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button1/select');
};
// script8="child;2;UNMASK;_KA0090010button2/update"
expj.KA0090010.KA0090010form1.child2 = function () {
  console.log('KA0090010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button2/update');
};
// script9="child;3;MASK;_KA0090010button2/update"
expj.KA0090010.KA0090010form1.child3 = function () {
  console.log('KA0090010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button2/update');
};
// script10="child;4;UNMASK;_KA0090010button2/delete"
expj.KA0090010.KA0090010form1.child4 = function () {
  console.log('KA0090010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button2/delete');
};
// script11="child;5;MASK;_KA0090010button2/delete"
expj.KA0090010.KA0090010form1.child5 = function () {
  console.log('KA0090010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button2/delete');
};
// script12="child;6;CHKRQ;A@*2,*3"
expj.KA0090010.KA0090010form1.child6 = function () {
  console.log('KA0090010form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('KA0090010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;7;CHKRQ;A@*4,*5"
expj.KA0090010.KA0090010form1.child7 = function () {
  console.log('KA0090010form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('KA0090010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script14="child;8;CHK;?KA0090010form1/*[eq]NORMAL@*11,*9"
expj.KA0090010.KA0090010form1.child8 = function () {
  console.log('KA0090010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0090010', 'KA0090010form1', '?KA0090010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;9;CHKRQ;A@*10,*11"
expj.KA0090010.KA0090010form1.child9 = function () {
  console.log('KA0090010form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('KA0090010', 'A')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_KA0090010button2/insert"
expj.KA0090010.KA0090010form1.child10 = function () {
  console.log('KA0090010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button2/insert');
};
// script17="child;11;MASK;_KA0090010button2/insert"
expj.KA0090010.KA0090010form1.child11 = function () {
  console.log('KA0090010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('KA0090010', 'KA0090010form1', '_KA0090010button2/insert');
};
expj.KA0090010.KA0090010form1.executeAllOnDecision = function () {
  console.log('execute KA0090010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010form1['onDecision' + i])) {
        expj.KA0090010.KA0090010form1['onDecision' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010form1.executeOnLoad = function () {
  expj.KA0090010.KA0090010form1.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form1.executePScriptOnLoad = function () {
  console.log('execute KA0090010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KA0090010.KA0090010form1['onLoad' + i])) {
      expj.KA0090010.KA0090010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0090010-KA0090010form1" action="KA0090010Servlet" name="KA0090010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKA0090010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ORG_CD",rb)%></span><!-- 部門コード --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form1-ORG_CD">
expj.KA0090010.KA0090010form1.ORG_CD = {};
expj.KA0090010.KA0090010form1.ORG_CD.executeAllOnDecision = function () {
  console.log('execute KA0090010form1/ORG_CD.onDecision');
  expj.KA0090010.KA0090010form1.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form1.ORG_CD.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form1-ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form1', 'ORG_CD', this);
  });
  expj.KA0090010.KA0090010form1.ORG_CD.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form1.ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KA0090010form1/ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form1-ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form1-ORG_CD" name="ORG_CD" class="KA0090010-focus-move  required-value expj-KA0090010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getORG_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KA0090010-KA0090010form1-h_ORG_CD" name="h_ORG_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0090010Struct.geth_ORG_CD()) %>">
<script class="expj-script-KA0090010-KA0090010form1-h_ORG_CD">
expj.KA0090010.KA0090010form1.h_ORG_CD = {};
expj.KA0090010.KA0090010form1.h_ORG_CD.executeAllOnDecision = function () {
  console.log('execute KA0090010form1/h_ORG_CD.onDecision');
  expj.KA0090010.KA0090010form1.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form1.h_ORG_CD.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form1-h_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form1', 'h_ORG_CD', this);
  });
  expj.KA0090010.KA0090010form1.h_ORG_CD.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form1.h_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KA0090010form1/h_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form1-h_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KA0090010-KA0090010form1-PeekerIOrgCd">
expj.KA0090010.KA0090010form1.PeekerIOrgCd = {};
// script1="onClick;0;PEEKER;_KA0090010form1/ORG_CD@<%=contextNo%>"
expj.KA0090010.KA0090010form1.PeekerIOrgCd.onClick0 = function () {
  console.log('PeekerIOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KA0090010';
var parameterValues = 'PeekerIOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KA0090010', 'KA0090010form1', '_KA0090010form1/ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KA0090010form1/ORG_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KA0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KA0090010.KA0090010form1.PeekerIOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010form1.PeekerIOrgCd['onClick' + i])) {
        expj.KA0090010.KA0090010form1.PeekerIOrgCd['onClick' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010form1.PeekerIOrgCd.executeAllOnDecision = function () {
};
expj.KA0090010.KA0090010form1.PeekerIOrgCd.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form1-PeekerIOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0090010', 'KA0090010form1', 'PeekerIOrgCd', this, 'Button');
    }
  });
  expj.KA0090010.KA0090010form1.PeekerIOrgCd.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form1.PeekerIOrgCd.executePScriptOnLoad = function () {
  console.log('execute KA0090010form1/PeekerIOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form1-PeekerIOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0090010-KA0090010form1-PeekerIOrgCd" class="KA0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KA0090010-KA0090010button1">
expj.KA0090010.KA0090010button1 = {};
expj.KA0090010.KA0090010button1.executeAllOnDecision = function () {
  console.log('execute KA0090010button1.onDecision');
};
expj.KA0090010.KA0090010button1.executeOnLoad = function () {
  expj.KA0090010.KA0090010button1.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button1.executePScriptOnLoad = function () {
  console.log('execute KA0090010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0090010-KA0090010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0090010-KA0090010button1-select">
expj.KA0090010.KA0090010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0090010form1/*@KA0090010Servlet"
expj.KA0090010.KA0090010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0090010', 'KA0090010button1', '_KA0090010form1/*', 'KA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0090010', response);
expj.common.updateBusinessScreenTab('KA0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KA0090010.KA0090010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010button1.select['onClick' + i])) {
        expj.KA0090010.KA0090010button1.select['onClick' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010button1.select.executeAllOnDecision = function () {
};
expj.KA0090010.KA0090010button1.select.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0090010', 'KA0090010button1', 'select', this, 'Button');
    }
  });
  expj.KA0090010.KA0090010button1.select.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button1.select.executePScriptOnLoad = function () {
  console.log('execute KA0090010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0090010-KA0090010button1-select" name="select" class="KA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KA0090010-KA0090010form2">
expj.KA0090010.KA0090010form2 = {};
expj.KA0090010.KA0090010form2.executeAllOnDecision = function () {
  console.log('execute KA0090010form2.onDecision');
};
expj.KA0090010.KA0090010form2.executeOnLoad = function () {
  expj.KA0090010.KA0090010form2.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0090010-KA0090010form2" action="KA0090010Servlet" name="KA0090010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_NAME",rb)%></span><!-- 部門名 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ORG_NAME">
expj.KA0090010.KA0090010form2.ORG_NAME = {};
expj.KA0090010.KA0090010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ORG_NAME.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ORG_NAME', this);
  });
  expj.KA0090010.KA0090010form2.ORG_NAME.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ORG_NAME" name="ORG_NAME" class="KA0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getORG_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_ANAME",rb)%></span><!-- 部門略称 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ORG_ANAME">
expj.KA0090010.KA0090010form2.ORG_ANAME = {};
expj.KA0090010.KA0090010form2.ORG_ANAME.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ORG_ANAME.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ORG_ANAME.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ORG_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ORG_ANAME', this);
  });
  expj.KA0090010.KA0090010form2.ORG_ANAME.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ORG_ANAME.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ORG_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ORG_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ORG_ANAME" name="ORG_ANAME" class="KA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getORG_ANAME()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_KNAME",rb)%></span><!-- 部門名（カナ） --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ORG_KNAME">
expj.KA0090010.KA0090010form2.ORG_KNAME = {};
expj.KA0090010.KA0090010form2.ORG_KNAME.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ORG_KNAME.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ORG_KNAME.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ORG_KNAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ORG_KNAME', this);
  });
  expj.KA0090010.KA0090010form2.ORG_KNAME.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ORG_KNAME.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ORG_KNAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ORG_KNAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ORG_KNAME" name="ORG_KNAME" class="KA0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getORG_KNAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_ENAME",rb)%></span><!-- 部門略称（英名） --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ORG_ENAME">
expj.KA0090010.KA0090010form2.ORG_ENAME = {};
expj.KA0090010.KA0090010form2.ORG_ENAME.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ORG_ENAME.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ORG_ENAME.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ORG_ENAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ORG_ENAME', this);
  });
  expj.KA0090010.KA0090010form2.ORG_ENAME.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ORG_ENAME.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ORG_ENAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ORG_ENAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ORG_ENAME" name="ORG_ENAME" class="KA0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getORG_ENAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ZIP_CD",rb)%></span><!-- 郵便番号 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ZIP_CD">
expj.KA0090010.KA0090010form2.ZIP_CD = {};
expj.KA0090010.KA0090010form2.ZIP_CD.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ZIP_CD.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ZIP_CD.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ZIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ZIP_CD', this);
  });
  expj.KA0090010.KA0090010form2.ZIP_CD.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ZIP_CD.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ZIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ZIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ZIP_CD" name="ZIP_CD" class="KA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getZIP_CD()) %>" maxlength="8" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_1",rb)%></span><!-- 住所1 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ADDRESS_1">
expj.KA0090010.KA0090010form2.ADDRESS_1 = {};
expj.KA0090010.KA0090010form2.ADDRESS_1.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ADDRESS_1.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ADDRESS_1.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ADDRESS_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ADDRESS_1', this);
  });
  expj.KA0090010.KA0090010form2.ADDRESS_1.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ADDRESS_1.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ADDRESS_1.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ADDRESS_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ADDRESS_1" name="ADDRESS_1" class="KA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getADDRESS_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_2",rb)%></span><!-- 住所2 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ADDRESS_2">
expj.KA0090010.KA0090010form2.ADDRESS_2 = {};
expj.KA0090010.KA0090010form2.ADDRESS_2.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ADDRESS_2.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ADDRESS_2.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ADDRESS_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ADDRESS_2', this);
  });
  expj.KA0090010.KA0090010form2.ADDRESS_2.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ADDRESS_2.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ADDRESS_2.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ADDRESS_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ADDRESS_2" name="ADDRESS_2" class="KA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getADDRESS_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_1",rb)%></span><!-- 住所(カナ)1 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ADDRESS_K_1">
expj.KA0090010.KA0090010form2.ADDRESS_K_1 = {};
expj.KA0090010.KA0090010form2.ADDRESS_K_1.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ADDRESS_K_1.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ADDRESS_K_1.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ADDRESS_K_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ADDRESS_K_1', this);
  });
  expj.KA0090010.KA0090010form2.ADDRESS_K_1.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ADDRESS_K_1.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ADDRESS_K_1.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ADDRESS_K_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ADDRESS_K_1" name="ADDRESS_K_1" class="KA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getADDRESS_K_1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_K_2",rb)%></span><!-- 住所(カナ)2 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-ADDRESS_K_2">
expj.KA0090010.KA0090010form2.ADDRESS_K_2 = {};
expj.KA0090010.KA0090010form2.ADDRESS_K_2.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/ADDRESS_K_2.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.ADDRESS_K_2.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-ADDRESS_K_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'ADDRESS_K_2', this);
  });
  expj.KA0090010.KA0090010form2.ADDRESS_K_2.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.ADDRESS_K_2.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/ADDRESS_K_2.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-ADDRESS_K_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-ADDRESS_K_2" name="ADDRESS_K_2" class="KA0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getADDRESS_K_2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TEL",rb)%></span><!-- 電話番号 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-TEL">
expj.KA0090010.KA0090010form2.TEL = {};
expj.KA0090010.KA0090010form2.TEL.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/TEL.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.TEL.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-TEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'TEL', this);
  });
  expj.KA0090010.KA0090010form2.TEL.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.TEL.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/TEL.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-TEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-TEL" name="TEL" class="KA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getTEL()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.FAX",rb)%></span><!-- FAX番号 --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010form2-FAX">
expj.KA0090010.KA0090010form2.FAX = {};
expj.KA0090010.KA0090010form2.FAX.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/FAX.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.FAX.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-FAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'FAX', this);
  });
  expj.KA0090010.KA0090010form2.FAX.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.FAX.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/FAX.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-FAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0090010-KA0090010form2-FAX" name="FAX" class="KA0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getFAX()) %>" maxlength="20" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-KA0090010-KA0090010form2-h_MODE" name="h_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0090010Control.getMode()) %>">
<script class="expj-script-KA0090010-KA0090010form2-h_MODE">
expj.KA0090010.KA0090010form2.h_MODE = {};
expj.KA0090010.KA0090010form2.h_MODE.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/h_MODE.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.h_MODE.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-h_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'h_MODE', this);
  });
  expj.KA0090010.KA0090010form2.h_MODE.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.h_MODE.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/h_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-h_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0090010-KA0090010form2-h_RESULT" name="h_RESULT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0090010Struct.geth_RESULT()) %>">
<script class="expj-script-KA0090010-KA0090010form2-h_RESULT">
expj.KA0090010.KA0090010form2.h_RESULT = {};
expj.KA0090010.KA0090010form2.h_RESULT.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/h_RESULT.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.h_RESULT.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-h_RESULT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'h_RESULT', this);
  });
  expj.KA0090010.KA0090010form2.h_RESULT.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.h_RESULT.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/h_RESULT.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-h_RESULT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0090010-KA0090010form2-k_MODE" name="k_MODE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0090010Struct.getk_MODE()) %>">
<script class="expj-script-KA0090010-KA0090010form2-k_MODE">
expj.KA0090010.KA0090010form2.k_MODE = {};
expj.KA0090010.KA0090010form2.k_MODE.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/k_MODE.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.k_MODE.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-k_MODE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'k_MODE', this);
  });
  expj.KA0090010.KA0090010form2.k_MODE.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.k_MODE.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/k_MODE.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-k_MODE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KA0090010-KA0090010form2-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0090010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-KA0090010-KA0090010form2-h_MODIFY_COUNT">
expj.KA0090010.KA0090010form2.h_MODIFY_COUNT = {};
expj.KA0090010.KA0090010form2.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KA0090010form2/h_MODIFY_COUNT.onDecision');
  expj.KA0090010.KA0090010form2.executeAllOnDecision();
  expj.KA0090010.executeAllOnDecision();
};
expj.KA0090010.KA0090010form2.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010form2-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0090010', 'KA0090010form2', 'h_MODIFY_COUNT', this);
  });
  expj.KA0090010.KA0090010form2.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KA0090010.KA0090010form2.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KA0090010form2/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010form2-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-KA0090010-KA0090010button2">
expj.KA0090010.KA0090010button2 = {};
expj.KA0090010.KA0090010button2.executeAllOnDecision = function () {
  console.log('execute KA0090010button2.onDecision');
};
expj.KA0090010.KA0090010button2.executeOnLoad = function () {
  expj.KA0090010.KA0090010button2.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button2.executePScriptOnLoad = function () {
  console.log('execute KA0090010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0090010-KA0090010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0090010-KA0090010button2-insert">
expj.KA0090010.KA0090010button2.insert = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0090010form1/*,_KA0090010form2/*@KA0090010Servlet,,$ZZ07001"
expj.KA0090010.KA0090010button2.insert.onClick0 = function () {
  console.log('insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0090010', 'KA0090010button2', '_KA0090010form1/*,_KA0090010form2/*', 'KA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0090010', response);
expj.common.updateBusinessScreenTab('KA0090010', contents);
};
expj.common.pscript.callConfirm('KA0090010', 'KA0090010button2', 'ZZ07001', okEvent);
};
expj.KA0090010.KA0090010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010button2.insert['onClick' + i])) {
        expj.KA0090010.KA0090010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010button2.insert.executeAllOnDecision = function () {
};
expj.KA0090010.KA0090010button2.insert.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0090010', 'KA0090010button2', 'insert', this, 'Button');
    }
  });
  expj.KA0090010.KA0090010button2.insert.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button2.insert.executePScriptOnLoad = function () {
  console.log('execute KA0090010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0090010-KA0090010button2-insert" name="insert" class="KA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010button2-update">
expj.KA0090010.KA0090010button2.update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0090010form1/*,_KA0090010form2/*@KA0090010Servlet,,$ZZ07003"
expj.KA0090010.KA0090010button2.update.onClick0 = function () {
  console.log('update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0090010', 'KA0090010button2', '_KA0090010form1/*,_KA0090010form2/*', 'KA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0090010', response);
expj.common.updateBusinessScreenTab('KA0090010', contents);
};
expj.common.pscript.callConfirm('KA0090010', 'KA0090010button2', 'ZZ07003', okEvent);
};
expj.KA0090010.KA0090010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010button2.update['onClick' + i])) {
        expj.KA0090010.KA0090010button2.update['onClick' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010button2.update.executeAllOnDecision = function () {
};
expj.KA0090010.KA0090010button2.update.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0090010', 'KA0090010button2', 'update', this, 'Button');
    }
  });
  expj.KA0090010.KA0090010button2.update.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button2.update.executePScriptOnLoad = function () {
  console.log('execute KA0090010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0090010-KA0090010button2-update" name="update" class="KA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010button2-delete">
expj.KA0090010.KA0090010button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0090010form1/*,_KA0090010form2/*@KA0090010Servlet,,$ZZ07004"
expj.KA0090010.KA0090010button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0090010', 'KA0090010button2', '_KA0090010form1/*,_KA0090010form2/*', 'KA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0090010', response);
expj.common.updateBusinessScreenTab('KA0090010', contents);
};
expj.common.pscript.callConfirm('KA0090010', 'KA0090010button2', 'ZZ07004', okEvent);
};
expj.KA0090010.KA0090010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010button2.delete['onClick' + i])) {
        expj.KA0090010.KA0090010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010button2.delete.executeAllOnDecision = function () {
};
expj.KA0090010.KA0090010button2.delete.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0090010', 'KA0090010button2', 'delete', this, 'Button');
    }
  });
  expj.KA0090010.KA0090010button2.delete.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button2.delete.executePScriptOnLoad = function () {
  console.log('execute KA0090010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0090010-KA0090010button2-delete" name="delete" class="KA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<span class="version">KA0090010 Revision: 1.2  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KA0090010-KA0090010button0">
expj.KA0090010.KA0090010button0 = {};
expj.KA0090010.KA0090010button0.executeAllOnDecision = function () {
  console.log('execute KA0090010button0.onDecision');
};
expj.KA0090010.KA0090010button0.executeOnLoad = function () {
  expj.KA0090010.KA0090010button0.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button0.executePScriptOnLoad = function () {
  console.log('execute KA0090010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0090010-KA0090010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0090010-KA0090010button0-clear">
expj.KA0090010.KA0090010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KA0090010form1/*@KA0090010Servlet,,$ZZ07008"
expj.KA0090010.KA0090010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0090010', 'KA0090010button0', '_KA0090010form1/*', 'KA0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0090010', response);
expj.common.updateBusinessScreenTab('KA0090010', contents);
};
expj.common.pscript.callConfirm('KA0090010', 'KA0090010button0', 'ZZ07008', okEvent);
};
expj.KA0090010.KA0090010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010button0.clear['onClick' + i])) {
        expj.KA0090010.KA0090010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010button0.clear.executeAllOnDecision = function () {
};
expj.KA0090010.KA0090010button0.clear.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0090010', 'KA0090010button0', 'clear', this, 'Button');
    }
  });
  expj.KA0090010.KA0090010button0.clear.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KA0090010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0090010-KA0090010button0-clear" name="clear" class="KA0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KA0090010-KA0090010button0-close">
expj.KA0090010.KA0090010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KA0090010.KA0090010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KA0090010');
};
expj.KA0090010.KA0090010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0090010.KA0090010button0.close['onClick' + i])) {
        expj.KA0090010.KA0090010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KA0090010.KA0090010button0.close.executeAllOnDecision = function () {
};
expj.KA0090010.KA0090010button0.close.executeOnLoad = function () {
  $('#expj-KA0090010-KA0090010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0090010', 'KA0090010button0', 'close', this, 'Button');
    }
  });
  expj.KA0090010.KA0090010button0.close.executePScriptOnLoad();
};

expj.KA0090010.KA0090010button0.close.executePScriptOnLoad = function () {
  console.log('execute KA0090010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KA0090010-KA0090010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0090010-KA0090010button0-close" name="close" class="KA0090010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--six end --></div><!-- /table1 -->
</div><!-- expj-business-screen-KA0090010 (END)-->
<%
MessageStruct msgStruct = aKA0090010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KA0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KA0090010)) {
  expj.common.treeInstanceMap.KA0090010 = {};
}
expj.common.treeInstanceMap.KA0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KA0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KA0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KA0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KA0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KA0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KA0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KA0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KA0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0090010)) {
  expj.common.detailDialogMap.KA0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KA0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.KA0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KA0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KA0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KA0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KA0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KA0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KA0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KA0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KA0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KA0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KA0090010)) {
  expj.common.viewInstanceMap.KA0090010 = {};
}
expj.common.viewInstanceMap.KA0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.KA0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KA0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KA0090010.<%=viewId %>.init = function () {
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
    expj.KA0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KA0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KA0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KA0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KA0090010_init">
/**
 * KA0090010用のロード完了時初期化関数
 */
expj.KA0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KA0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KA0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KA0090010');
  expj.common.calendarInstanceMap.KA0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KA0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KA0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KA0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KA0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KA0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KA0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KA0090010-<%=detailId %>');
<%
 }
%>
  try{expj.KA0090010.KA0090010form1.ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form1.h_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form1.PeekerIOrgCd.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button1.select.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ORG_ANAME.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ORG_KNAME.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ORG_ENAME.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ZIP_CD.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ADDRESS_1.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ADDRESS_2.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ADDRESS_K_1.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.ADDRESS_K_2.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.TEL.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.FAX.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.h_MODE.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.h_RESULT.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.k_MODE.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button2.insert.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button2.update.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button2.delete.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button0.close.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form1.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button1.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010form2.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button2.executeOnLoad();}catch(e){};
  try{expj.KA0090010.KA0090010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KA0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KA0090010', 'KA0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KA0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KA0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.KA0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KA0090010', '<%=request.getContextPath() %>');
};

/**
 * KA0090010の全体onDecision処理
 */
expj.KA0090010.executeAllOnDecision = function () {
  expj.KA0090010.KA0090010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KA0090010_console">
expj.KA0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>