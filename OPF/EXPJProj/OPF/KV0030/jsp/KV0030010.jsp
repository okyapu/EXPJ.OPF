<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 13:03:43 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KV0030\KV0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KV0030.*" %>
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
<jsp:useBean id="aKV0030010Control" class="com.nec.jp.orteus.metamorBase.KV0030.KV0030010Control" scope="request"/>
<jsp:useBean id="aKV0030010Struct" class="com.nec.jp.orteus.metamorBase.KV0030.KV0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

生産管理Ｉ／Ｆ
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0030/jsp/KV0030010.jsp,v $
$Author: geng-jia $	
$Revision: 1.14 $ $Date: 2017/02/22 02:07:34 $
********************************************************* --%>
<html>
<head>
<title>生産管理Ｉ／Ｆ</title>
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
<script class="expj-script-KV0030010_init">
  // KV0030010名前空間
  expj.KV0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KV0030010" data-screen="KV0030010" data-newdata="<%=aKV0030010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->

  <!--first start -->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

  <!--first end -->

  <!--second start -->
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
              <!--ここにバッチ選択用のDataGridを配置する。↓ -->
              <script class="expj-script-KV0030010-KV0030010form1">
expj.KV0030010.KV0030010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.KV0030010.KV0030010form1.onLoad0 = function () {
  console.log('KV0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHK;_KV0030010form1/rdoPlantTyp1[eq]true@*0"
expj.KV0030010.KV0030010form1.onDecision0 = function () {
  console.log('KV0030010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHK;_KV0030010form1/txtPlantCd[eq]@*1,*2"
expj.KV0030010.KV0030010form1.child0 = function () {
  console.log('KV0030010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;MASK;_KV0030010button1/execute"
expj.KV0030010.KV0030010form1.child1 = function () {
  console.log('KV0030010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010button1/execute');
};
// script5="child;2;UNMASK;_KV0030010button1/execute"
expj.KV0030010.KV0030010form1.child2 = function () {
  console.log('KV0030010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010button1/execute');
};
// script6="onDecision;1;CHK;_KV0030010form1/rdoPlantTyp2[eq]true@*2"
expj.KV0030010.KV0030010form1.onDecision1 = function () {
  console.log('KV0030010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="onDecision;2;CHK;_KV0030010form1/rdoPlantTyp2[eq]true@*3"
expj.KV0030010.KV0030010form1.onDecision2 = function () {
  console.log('KV0030010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script8="child;3;MASK;_KV0030010form1/txtPlantCd,_KV0030010form1/PeekerIPlantCd"
expj.KV0030010.KV0030010form1.child3 = function () {
  console.log('KV0030010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd');
expj.common.pscript.setMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010form1/PeekerIPlantCd');
};
// script9="onDecision;3;CHK;_KV0030010form1/rdoPlantTyp1[eq]true@*4"
expj.KV0030010.KV0030010form1.onDecision3 = function () {
  console.log('KV0030010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script10="child;4;UNMASK;_KV0030010form1/txtPlantCd"
expj.KV0030010.KV0030010form1.child4 = function () {
  console.log('KV0030010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd');
};
// script11="onDecision;4;CHK;_KV0030010form1/rdoPlantTyp2[eq]true@*5"
expj.KV0030010.KV0030010form1.onDecision4 = function () {
  console.log('KV0030010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script12="child;5;SET;_KV0030010form1/txtPlantCd="
expj.KV0030010.KV0030010form1.child5 = function () {
  console.log('KV0030010form1 script12');
expj.common.pscript.setReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd', '');
};
expj.KV0030010.KV0030010form1.executeAllOnDecision = function () {
  console.log('execute KV0030010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0030010.KV0030010form1['onDecision' + i])) {
        expj.KV0030010.KV0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.KV0030010.KV0030010form1.executeOnLoad = function () {
  expj.KV0030010.KV0030010form1.executePScriptOnLoad();
};

expj.KV0030010.KV0030010form1.executePScriptOnLoad = function () {
  console.log('execute KV0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KV0030010.KV0030010form1['onLoad' + i])) {
      expj.KV0030010.KV0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KV0030010-KV0030010form1" action="KV0030010Servlet" name="KV0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:center"></div>
<div class="div-td" style="width:150px;align:center"></div>
<div class="div-td" style="width:110px;align:center"></div>
<div class="div-td" style="width:40px;align:center"></div>
<div class="div-td" style="width:22px;align:center"></div>
<div class="div-td" style="width:88px;align:center"></div>
<div class="div-td" style="width:22px;align:center"></div>
<div class="div-td" style="width:150px;align:center"></div>
<div class="div-td" style="width:70px;align:center"></div>
<div class="div-td" style="width:822px;align:center"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:110px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:822px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:110px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:822px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0030010-KV0030010form1-rdoPlantTyp1">
expj.KV0030010.KV0030010form1.rdoPlantTyp1 = {};
// script1="onClick;0;UNMASK;_KV0030010form1/txtPlantCd,_KV0030010form1/PeekerIPlantCd"
expj.KV0030010.KV0030010form1.rdoPlantTyp1.onClick0 = function () {
  console.log('rdoPlantTyp1 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd');
expj.common.pscript.setUnMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010form1/PeekerIPlantCd');
};
// script2="onClick;1;SET;_KV0030010form1/rdoPlantTyp=1"
expj.KV0030010.KV0030010form1.rdoPlantTyp1.onClick1 = function () {
  console.log('rdoPlantTyp1 script2');
expj.common.pscript.setReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/rdoPlantTyp', '1');
};
expj.KV0030010.KV0030010form1.rdoPlantTyp1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0030010.KV0030010form1.rdoPlantTyp1['onClick' + i])) {
        expj.KV0030010.KV0030010form1.rdoPlantTyp1['onClick' + i]();
      }
    }
  }
};
expj.KV0030010.KV0030010form1.rdoPlantTyp1.executeAllOnDecision = function () {
  console.log('execute KV0030010form1/rdoPlantTyp1.onDecision');
  expj.KV0030010.KV0030010form1.executeAllOnDecision();
  expj.KV0030010.executeAllOnDecision();
};
expj.KV0030010.KV0030010form1.rdoPlantTyp1.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010form1-rdoPlantTyp1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0030010', 'KV0030010form1', 'rdoPlantTyp1', this, 'RadioButton');
    }
  });
  expj.KV0030010.KV0030010form1.rdoPlantTyp1.executePScriptOnLoad();
};

expj.KV0030010.KV0030010form1.rdoPlantTyp1.executePScriptOnLoad = function () {
  console.log('execute KV0030010form1/rdoPlantTyp1.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010form1-rdoPlantTyp1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp1" value="true" <%= ("true".equals(TypeConverter.convert(aKV0030010Struct.getrdoPlantTyp1())) || "".equals(TypeConverter.convert(aKV0030010Struct.getrdoPlantTyp1())))?"checked=\"checked\"": "" %> class="" id="expj-KV0030010-KV0030010form1-rdoPlantTyp1" ><label for="expj-KV0030010-KV0030010form1-rdoPlantTyp1"><%=CoreTools.getRBString("Expj.Cmt0038",rb)%></label></div><!--/td-->
<script class="expj-script-KV0030010-KV0030010form1-txtPlantCd">
expj.KV0030010.KV0030010form1.txtPlantCd = {};
expj.KV0030010.KV0030010form1.txtPlantCd.executeAllOnDecision = function () {
  console.log('execute KV0030010form1/txtPlantCd.onDecision');
  expj.KV0030010.KV0030010form1.executeAllOnDecision();
  expj.KV0030010.executeAllOnDecision();
};
expj.KV0030010.KV0030010form1.txtPlantCd.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010form1-txtPlantCd').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0030010', 'KV0030010form1', 'txtPlantCd', this);
  });
  expj.KV0030010.KV0030010form1.txtPlantCd.executePScriptOnLoad();
};

expj.KV0030010.KV0030010form1.txtPlantCd.executePScriptOnLoad = function () {
  console.log('execute KV0030010form1/txtPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010form1-txtPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KV0030010-KV0030010form1-txtPlantCd" name="txtPlantCd" class="KV0030010-focus-move  required-value expj-KV0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKV0030010Struct.gettxtPlantCd()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-KV0030010-KV0030010form1-PeekerIPlantCd">
expj.KV0030010.KV0030010form1.PeekerIPlantCd = {};
// script1="onClick;0;PEEKER;_KV0030010form1/txtPlantCd@<%=contextNo%>"
expj.KV0030010.KV0030010form1.PeekerIPlantCd.onClick0 = function () {
  console.log('PeekerIPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KV0030010';
var parameterValues = 'PeekerIPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KV0030010form1/txtPlantCd%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KV0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KV0030010.KV0030010form1.PeekerIPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0030010.KV0030010form1.PeekerIPlantCd['onClick' + i])) {
        expj.KV0030010.KV0030010form1.PeekerIPlantCd['onClick' + i]();
      }
    }
  }
};
expj.KV0030010.KV0030010form1.PeekerIPlantCd.executeAllOnDecision = function () {
};
expj.KV0030010.KV0030010form1.PeekerIPlantCd.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010form1-PeekerIPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0030010', 'KV0030010form1', 'PeekerIPlantCd', this, 'Button');
    }
  });
  expj.KV0030010.KV0030010form1.PeekerIPlantCd.executePScriptOnLoad();
};

expj.KV0030010.KV0030010form1.PeekerIPlantCd.executePScriptOnLoad = function () {
  console.log('execute KV0030010form1/PeekerIPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010form1-PeekerIPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KV0030010-KV0030010form1-PeekerIPlantCd" class="KV0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:822px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:center;"></div><!--/td-->
<script class="expj-script-KV0030010-KV0030010form1-rdoPlantTyp2">
expj.KV0030010.KV0030010form1.rdoPlantTyp2 = {};
// script1="onClick;0;MASK;_KV0030010form1/txtPlantCd,_KV0030010form1/PeekerIPlantCd"
expj.KV0030010.KV0030010form1.rdoPlantTyp2.onClick0 = function () {
  console.log('rdoPlantTyp2 script1');
expj.common.pscript.setMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd');
expj.common.pscript.setMaskToReferenceComponent('KV0030010', 'KV0030010form1', '_KV0030010form1/PeekerIPlantCd');
};
// script2="onClick;1;SET;_KV0030010form1/rdoPlantTyp=2,_KV0030010form1/txtPlantCd="
expj.KV0030010.KV0030010form1.rdoPlantTyp2.onClick1 = function () {
  console.log('rdoPlantTyp2 script2');
expj.common.pscript.setReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/rdoPlantTyp', '2');
expj.common.pscript.setReferenceComponentValue('KV0030010', 'KV0030010form1', '_KV0030010form1/txtPlantCd', '');
};
expj.KV0030010.KV0030010form1.rdoPlantTyp2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0030010.KV0030010form1.rdoPlantTyp2['onClick' + i])) {
        expj.KV0030010.KV0030010form1.rdoPlantTyp2['onClick' + i]();
      }
    }
  }
};
expj.KV0030010.KV0030010form1.rdoPlantTyp2.executeAllOnDecision = function () {
  console.log('execute KV0030010form1/rdoPlantTyp2.onDecision');
  expj.KV0030010.KV0030010form1.executeAllOnDecision();
  expj.KV0030010.executeAllOnDecision();
};
expj.KV0030010.KV0030010form1.rdoPlantTyp2.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010form1-rdoPlantTyp2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0030010', 'KV0030010form1', 'rdoPlantTyp2', this, 'RadioButton');
    }
  });
  expj.KV0030010.KV0030010form1.rdoPlantTyp2.executePScriptOnLoad();
};

expj.KV0030010.KV0030010form1.rdoPlantTyp2.executePScriptOnLoad = function () {
  console.log('execute KV0030010form1/rdoPlantTyp2.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010form1-rdoPlantTyp2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp2" value="true" <%= ("true".equals(TypeConverter.convert(aKV0030010Struct.getrdoPlantTyp2())))?"checked=\"checked\"":"" %> class="" id="expj-KV0030010-KV0030010form1-rdoPlantTyp2" ><label for="expj-KV0030010-KV0030010form1-rdoPlantTyp2"><%=CoreTools.getRBString("Expj.Cmt0036",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KV0030010-KV0030010form1-rdoPlantTyp" name="rdoPlantTyp" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKV0030010Struct.getrdoPlantTyp()) %>">
<script class="expj-script-KV0030010-KV0030010form1-rdoPlantTyp">
expj.KV0030010.KV0030010form1.rdoPlantTyp = {};
expj.KV0030010.KV0030010form1.rdoPlantTyp.executeAllOnDecision = function () {
  console.log('execute KV0030010form1/rdoPlantTyp.onDecision');
  expj.KV0030010.KV0030010form1.executeAllOnDecision();
  expj.KV0030010.executeAllOnDecision();
};
expj.KV0030010.KV0030010form1.rdoPlantTyp.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010form1-rdoPlantTyp').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KV0030010', 'KV0030010form1', 'rdoPlantTyp', this);
  });
  expj.KV0030010.KV0030010form1.rdoPlantTyp.executePScriptOnLoad();
};

expj.KV0030010.KV0030010form1.rdoPlantTyp.executePScriptOnLoad = function () {
  console.log('execute KV0030010form1/rdoPlantTyp.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010form1-rdoPlantTyp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:70px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:822px;text-align:center;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!--ここにバッチ選択用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KV0030010-KV0030010button1">
expj.KV0030010.KV0030010button1 = {};
expj.KV0030010.KV0030010button1.executeAllOnDecision = function () {
  console.log('execute KV0030010button1.onDecision');
};
expj.KV0030010.KV0030010button1.executeOnLoad = function () {
  expj.KV0030010.KV0030010button1.executePScriptOnLoad();
};

expj.KV0030010.KV0030010button1.executePScriptOnLoad = function () {
  console.log('execute KV0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KV0030010-KV0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KV0030010-KV0030010button1-execute">
expj.KV0030010.KV0030010button1.execute = {};
// script1="onClick;0;CHK;_KV0030010form1/rdoPlantTyp1[eq]true@*2,*1"
expj.KV0030010.KV0030010button1.execute.onClick0 = function () {
  console.log('execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010button1', '_KV0030010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;1;CHK;_KV0030010form1/rdoPlantTyp2[eq]true@*4,!AZ00006"
expj.KV0030010.KV0030010button1.execute.child1 = function () {
  console.log('execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010button1', '_KV0030010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
expj.common.pscript.viewErrorMessage('KV0030010', 'KV0030010button1', 'AZ00006');
}
};
// script3="child;2;CHK;_KV0030010form1/txtPlantCd[neq]@*3,!ZZ01104"
expj.KV0030010.KV0030010button1.execute.child2 = function () {
  console.log('execute script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KV0030010', 'KV0030010button1', '_KV0030010form1/txtPlantCd'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
expj.common.pscript.viewErrorMessage('KV0030010', 'KV0030010button1', 'ZZ01104');
}
};
// script4="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0030010form1/*@KV0030010Servlet,,$ZZ07010"
expj.KV0030010.KV0030010button1.execute.child3 = function () {
  console.log('execute script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0030010', 'KV0030010button1', '_KV0030010form1/*', 'KV0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0030010', response);
expj.common.updateBusinessScreenTab('KV0030010', contents);
};
expj.common.pscript.callConfirm('KV0030010', 'KV0030010button1', 'ZZ07010', okEvent);
};
// script5="child;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KV0030010form1/*@KV0030010Servlet,,$ZZ07010"
expj.KV0030010.KV0030010button1.execute.child4 = function () {
  console.log('execute script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0030010', 'KV0030010button1', '_KV0030010form1/*', 'KV0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0030010', response);
expj.common.updateBusinessScreenTab('KV0030010', contents);
};
expj.common.pscript.callConfirm('KV0030010', 'KV0030010button1', 'ZZ07010', okEvent);
};
expj.KV0030010.KV0030010button1.execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0030010.KV0030010button1.execute['onClick' + i])) {
        expj.KV0030010.KV0030010button1.execute['onClick' + i]();
      }
    }
  }
};
expj.KV0030010.KV0030010button1.execute.executeAllOnDecision = function () {
};
expj.KV0030010.KV0030010button1.execute.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010button1-execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0030010', 'KV0030010button1', 'execute', this, 'Button');
    }
  });
  expj.KV0030010.KV0030010button1.execute.executePScriptOnLoad();
};

expj.KV0030010.KV0030010button1.execute.executePScriptOnLoad = function () {
  console.log('execute KV0030010button1/execute.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010button1-execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0030010-KV0030010button1-execute" name="execute" class="KV0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<!--second end --><!--third start --><div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<!--third end --><!--four start --><div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - -10px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KV0030010 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KV0030010-KV0030010button0">
expj.KV0030010.KV0030010button0 = {};
expj.KV0030010.KV0030010button0.executeAllOnDecision = function () {
  console.log('execute KV0030010button0.onDecision');
};
expj.KV0030010.KV0030010button0.executeOnLoad = function () {
  expj.KV0030010.KV0030010button0.executePScriptOnLoad();
};

expj.KV0030010.KV0030010button0.executePScriptOnLoad = function () {
  console.log('execute KV0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KV0030010-KV0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KV0030010-KV0030010button0-clear">
expj.KV0030010.KV0030010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KV0030010Servlet,,$ZZ07008"
expj.KV0030010.KV0030010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KV0030010', 'KV0030010button0', '', 'KV0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KV0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KV0030010', response);
expj.common.updateBusinessScreenTab('KV0030010', contents);
};
expj.common.pscript.callConfirm('KV0030010', 'KV0030010button0', 'ZZ07008', okEvent);
};
expj.KV0030010.KV0030010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0030010.KV0030010button0.clear['onClick' + i])) {
        expj.KV0030010.KV0030010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KV0030010.KV0030010button0.clear.executeAllOnDecision = function () {
};
expj.KV0030010.KV0030010button0.clear.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0030010', 'KV0030010button0', 'clear', this, 'Button');
    }
  });
  expj.KV0030010.KV0030010button0.clear.executePScriptOnLoad();
};

expj.KV0030010.KV0030010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KV0030010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0030010-KV0030010button0-clear" name="clear" class="KV0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KV0030010-KV0030010button0-close">
expj.KV0030010.KV0030010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KV0030010.KV0030010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KV0030010');
};
expj.KV0030010.KV0030010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KV0030010.KV0030010button0.close['onClick' + i])) {
        expj.KV0030010.KV0030010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KV0030010.KV0030010button0.close.executeAllOnDecision = function () {
};
expj.KV0030010.KV0030010button0.close.executeOnLoad = function () {
  $('#expj-KV0030010-KV0030010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KV0030010', 'KV0030010button0', 'close', this, 'Button');
    }
  });
  expj.KV0030010.KV0030010button0.close.executePScriptOnLoad();
};

expj.KV0030010.KV0030010button0.close.executePScriptOnLoad = function () {
  console.log('execute KV0030010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KV0030010-KV0030010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KV0030010-KV0030010button0-close" name="close" class="KV0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
<!--four end --></div><!-- /table1 -->
</div><!-- expj-business-screen-KV0030010 (END)-->
<%
MessageStruct msgStruct = aKV0030010Control.getMsgStruct();
%><%@ include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KV0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KV0030010)) {
  expj.common.treeInstanceMap.KV0030010 = {};
}
expj.common.treeInstanceMap.KV0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KV0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KV0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KV0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KV0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KV0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KV0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KV0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KV0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KV0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KV0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0030010)) {
  expj.common.detailDialogMap.KV0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KV0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.KV0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KV0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KV0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KV0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KV0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KV0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KV0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KV0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KV0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KV0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KV0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KV0030010)) {
  expj.common.viewInstanceMap.KV0030010 = {};
}
expj.common.viewInstanceMap.KV0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.KV0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KV0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KV0030010.<%=viewId %>.init = function () {
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
    expj.KV0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KV0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KV0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KV0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KV0030010_init">
/**
 * KV0030010用のロード完了時初期化関数
 */
expj.KV0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KV0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KV0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KV0030010');
  expj.common.calendarInstanceMap.KV0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KV0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KV0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KV0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KV0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KV0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KV0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KV0030010-<%=detailId %>');
<%
 }
%>
  try{expj.KV0030010.KV0030010form1.rdoPlantTyp1.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010form1.txtPlantCd.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010form1.PeekerIPlantCd.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010form1.rdoPlantTyp2.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010form1.rdoPlantTyp.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010button1.execute.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010button0.close.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010form1.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010button1.executeOnLoad();}catch(e){};
  try{expj.KV0030010.KV0030010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KV0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KV0030010', 'KV0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KV0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KV0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.KV0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KV0030010', '<%=request.getContextPath() %>');
};

/**
 * KV0030010の全体onDecision処理
 */
expj.KV0030010.executeAllOnDecision = function () {
  expj.KV0030010.KV0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KV0030010_console">
expj.KV0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>