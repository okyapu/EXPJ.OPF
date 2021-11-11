<%-- ***
This file is generated
 GeneratedDate  : Thu Feb 16 20:27:32 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0120\AF0120010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0120.*" %>
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
<jsp:useBean id="aAF0120010Control" class="com.nec.jp.orteus.metamorBase.AF0120.AF0120010Control" scope="request"/>
<jsp:useBean id="aAF0120010Struct" class="com.nec.jp.orteus.metamorBase.AF0120.AF0120010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

オーダ問合せ
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0120/jsp/AF0120010.jsp,v $
$Author: geng-jia $	
$Revision: 1.7 $　$Date: 2017/02/22 02:05:53 $
********************************************************* --%>
<html>
<head>
<title>オーダ問合せ</title>
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
<script class="expj-script-AF0120010_init">
  // AF0120010名前空間
  expj.AF0120010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<% ScreenMoveUtil su1 = new ScreenMoveUtil("AG0010010Servlet", so);
   ScreenMoveUtil su2 = new ScreenMoveUtil("AE0060010Servlet", so);
%>
<body>
  <div id="expj-business-screen-AF0120010" data-screen="AF0120010" data-newdata="<%=aAF0120010Control.isNewData() %>">
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
			  <script class="expj-script-AF0120010-AF0120010Form">
expj.AF0120010.AF0120010Form = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AF0120010.AF0120010Form.onLoad0 = function () {
  console.log('AF0120010Form script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*1,*2"
expj.AF0120010.AF0120010Form.onDecision0 = function () {
  console.log('AF0120010Form script2');
if (expj.common.pscript.satisfiedRequiredComponent('AF0120010', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;UNMASK;_AF0120010BUTTON1/Select1"
expj.AF0120010.AF0120010Form.child1 = function () {
  console.log('AF0120010Form script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0120010', 'AF0120010Form', '_AF0120010BUTTON1/Select1');
};
// script4="child;2;MASK;_AF0120010BUTTON1/Select1"
expj.AF0120010.AF0120010Form.child2 = function () {
  console.log('AF0120010Form script4');
expj.common.pscript.setMaskToReferenceComponent('AF0120010', 'AF0120010Form', '_AF0120010BUTTON1/Select1');
};
// script5="onDecision;1;CHK;?AF0120010VIEW1/?[neq]NOT_SELECTED[and]_AF0120010VIEW1/PUCH_ODR_STS_TYP[eq]2@*3,*4"
expj.AF0120010.AF0120010Form.onDecision1 = function () {
  console.log('AF0120010Form script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0120010', 'AF0120010Form', '?AF0120010VIEW1/?'), '[neq]', 'NOT_SELECTED') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0120010', 'AF0120010Form', '_AF0120010VIEW1/PUCH_ODR_STS_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_AF0120010BUTTON2/AcceptEntry"
expj.AF0120010.AF0120010Form.child3 = function () {
  console.log('AF0120010Form script6');
expj.common.pscript.setUnMaskToReferenceComponent('AF0120010', 'AF0120010Form', '_AF0120010BUTTON2/AcceptEntry');
};
// script7="child;4;MASK;_AF0120010BUTTON2/AcceptEntry"
expj.AF0120010.AF0120010Form.child4 = function () {
  console.log('AF0120010Form script7');
expj.common.pscript.setMaskToReferenceComponent('AF0120010', 'AF0120010Form', '_AF0120010BUTTON2/AcceptEntry');
};
// script8="onDecision;2;CHK;1[eq]1@*5"
expj.AF0120010.AF0120010Form.onDecision2 = function () {
  console.log('AF0120010Form script8');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;CHK;?AF0120010Form/*[eq]NORMAL@*6,*8"
expj.AF0120010.AF0120010Form.child5 = function () {
  console.log('AF0120010Form script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0120010', 'AF0120010Form', '?AF0120010Form/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;6;CHK;_AF0120010Form/ITEM_CD[eq]_AF0120010Form/h_ITEM_CD@*7,*8"
expj.AF0120010.AF0120010Form.child6 = function () {
  console.log('AF0120010Form script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0120010', 'AF0120010Form', '_AF0120010Form/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AF0120010', 'AF0120010Form', '_AF0120010Form/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;7;UNMASK;_AF0120010BUTTON2/StockInquiry"
expj.AF0120010.AF0120010Form.child7 = function () {
  console.log('AF0120010Form script11');
expj.common.pscript.setUnMaskToReferenceComponent('AF0120010', 'AF0120010Form', '_AF0120010BUTTON2/StockInquiry');
};
// script12="child;8;MASK;_AF0120010BUTTON2/StockInquiry"
expj.AF0120010.AF0120010Form.child8 = function () {
  console.log('AF0120010Form script12');
expj.common.pscript.setMaskToReferenceComponent('AF0120010', 'AF0120010Form', '_AF0120010BUTTON2/StockInquiry');
};
expj.AF0120010.AF0120010Form.executeAllOnDecision = function () {
  console.log('execute AF0120010Form.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0120010.AF0120010Form['onDecision' + i])) {
        expj.AF0120010.AF0120010Form['onDecision' + i]();
      }
    }
  }
};
expj.AF0120010.AF0120010Form.executeOnLoad = function () {
  expj.AF0120010.AF0120010Form.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0120010.AF0120010Form['onLoad' + i])) {
      expj.AF0120010.AF0120010Form['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0120010-AF0120010Form" action="AF0120010Servlet" name="AF0120010Form" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0120010Control.getReadStatusString()) %>" style="height:25px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:25px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AF0120010-AF0120010Form-ITEM_CD">
expj.AF0120010.AF0120010Form.ITEM_CD = {};
expj.AF0120010.AF0120010Form.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0120010Form/ITEM_CD.onDecision');
  expj.AF0120010.AF0120010Form.executeAllOnDecision();
  expj.AF0120010.executeAllOnDecision();
};
expj.AF0120010.AF0120010Form.ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010Form-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0120010', 'AF0120010Form', 'ITEM_CD', this);
  });
  expj.AF0120010.AF0120010Form.ITEM_CD.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010Form-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0120010-AF0120010Form-ITEM_CD" name="ITEM_CD" class="AF0120010-focus-move  required-value expj-AF0120010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0120010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AF0120010-AF0120010Form-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0120010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-AF0120010-AF0120010Form-h_ITEM_CD">
expj.AF0120010.AF0120010Form.h_ITEM_CD = {};
expj.AF0120010.AF0120010Form.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0120010Form/h_ITEM_CD.onDecision');
  expj.AF0120010.AF0120010Form.executeAllOnDecision();
  expj.AF0120010.executeAllOnDecision();
};
expj.AF0120010.AF0120010Form.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010Form-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0120010', 'AF0120010Form', 'h_ITEM_CD', this);
  });
  expj.AF0120010.AF0120010Form.h_ITEM_CD.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010Form-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0120010-AF0120010Form-PLANT_CD" name="PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0120010Struct.getPLANT_CD()) %>">
<script class="expj-script-AF0120010-AF0120010Form-PLANT_CD">
expj.AF0120010.AF0120010Form.PLANT_CD = {};
expj.AF0120010.AF0120010Form.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AF0120010Form/PLANT_CD.onDecision');
  expj.AF0120010.AF0120010Form.executeAllOnDecision();
  expj.AF0120010.executeAllOnDecision();
};
expj.AF0120010.AF0120010Form.PLANT_CD.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010Form-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0120010', 'AF0120010Form', 'PLANT_CD', this);
  });
  expj.AF0120010.AF0120010Form.PLANT_CD.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010Form-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AF0120010-AF0120010Form-ITEM_CD_PEEKER">
expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER = {};
// script1="onClick;0;PEEKER;_AF0120010Form/ITEM_CD@<%=contextNo%>"
expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER.onClick0 = function () {
  console.log('ITEM_CD_PEEKER script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0120010';
var parameterValues = 'ITEM_CD_PEEKER%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0120010', 'AF0120010Form', '_AF0120010Form/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_09%&%';
parameterValues += 'TARGET_FIELD%=%_AF0120010Form/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER['onClick' + i])) {
        expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER['onClick' + i]();
      }
    }
  }
};
expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER.executeAllOnDecision = function () {
};
expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010Form-ITEM_CD_PEEKER').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0120010', 'AF0120010Form', 'ITEM_CD_PEEKER', this, 'Button');
    }
  });
  expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form/ITEM_CD_PEEKER.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010Form-ITEM_CD_PEEKER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0120010-AF0120010Form-ITEM_CD_PEEKER" class="AF0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0120010-AF0120010Form-ITEM_NAME">
expj.AF0120010.AF0120010Form.ITEM_NAME = {};
expj.AF0120010.AF0120010Form.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AF0120010Form/ITEM_NAME.onDecision');
  expj.AF0120010.AF0120010Form.executeAllOnDecision();
  expj.AF0120010.executeAllOnDecision();
};
expj.AF0120010.AF0120010Form.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010Form-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0120010', 'AF0120010Form', 'ITEM_NAME', this);
  });
  expj.AF0120010.AF0120010Form.ITEM_NAME.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010Form-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0120010-AF0120010Form-ITEM_NAME" name="ITEM_NAME" class="AF0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0120010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0120010-AF0120010Form-MSG_BUSINESS_CD" name="MSG_BUSINESS_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0120010Struct.getMSG_BUSINESS_CD()) %>">
<script class="expj-script-AF0120010-AF0120010Form-MSG_BUSINESS_CD">
expj.AF0120010.AF0120010Form.MSG_BUSINESS_CD = {};
expj.AF0120010.AF0120010Form.MSG_BUSINESS_CD.executeAllOnDecision = function () {
  console.log('execute AF0120010Form/MSG_BUSINESS_CD.onDecision');
  expj.AF0120010.AF0120010Form.executeAllOnDecision();
  expj.AF0120010.executeAllOnDecision();
};
expj.AF0120010.AF0120010Form.MSG_BUSINESS_CD.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010Form-MSG_BUSINESS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0120010', 'AF0120010Form', 'MSG_BUSINESS_CD', this);
  });
  expj.AF0120010.AF0120010Form.MSG_BUSINESS_CD.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.MSG_BUSINESS_CD.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form/MSG_BUSINESS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010Form-MSG_BUSINESS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</span><div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0120010-AF0120010Form-MSG_CONTEXT_NO" name="MSG_CONTEXT_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0120010Struct.getMSG_CONTEXT_NO()) %>">
<script class="expj-script-AF0120010-AF0120010Form-MSG_CONTEXT_NO">
expj.AF0120010.AF0120010Form.MSG_CONTEXT_NO = {};
expj.AF0120010.AF0120010Form.MSG_CONTEXT_NO.executeAllOnDecision = function () {
  console.log('execute AF0120010Form/MSG_CONTEXT_NO.onDecision');
  expj.AF0120010.AF0120010Form.executeAllOnDecision();
  expj.AF0120010.executeAllOnDecision();
};
expj.AF0120010.AF0120010Form.MSG_CONTEXT_NO.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010Form-MSG_CONTEXT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0120010', 'AF0120010Form', 'MSG_CONTEXT_NO', this);
  });
  expj.AF0120010.AF0120010Form.MSG_CONTEXT_NO.executePScriptOnLoad();
};

expj.AF0120010.AF0120010Form.MSG_CONTEXT_NO.executePScriptOnLoad = function () {
  console.log('execute AF0120010Form/MSG_CONTEXT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010Form-MSG_CONTEXT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</span><div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0120010-AF0120010BUTTON1">
expj.AF0120010.AF0120010BUTTON1 = {};
expj.AF0120010.AF0120010BUTTON1.executeAllOnDecision = function () {
  console.log('execute AF0120010BUTTON1.onDecision');
};
expj.AF0120010.AF0120010BUTTON1.executeOnLoad = function () {
  expj.AF0120010.AF0120010BUTTON1.executePScriptOnLoad();
};

expj.AF0120010.AF0120010BUTTON1.executePScriptOnLoad = function () {
  console.log('execute AF0120010BUTTON1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0120010-AF0120010BUTTON1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0120010-AF0120010BUTTON1-Select1">
expj.AF0120010.AF0120010BUTTON1.Select1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0120010Form/ITEM_CD@AF0120010Servlet,,"
expj.AF0120010.AF0120010BUTTON1.Select1.onClick0 = function () {
  console.log('Select1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0120010', 'AF0120010BUTTON1', '_AF0120010Form/ITEM_CD', 'AF0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0120010', response);
expj.common.updateBusinessScreenTab('AF0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0120010.AF0120010BUTTON1.Select1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0120010.AF0120010BUTTON1.Select1['onClick' + i])) {
        expj.AF0120010.AF0120010BUTTON1.Select1['onClick' + i]();
      }
    }
  }
};
expj.AF0120010.AF0120010BUTTON1.Select1.executeAllOnDecision = function () {
};
expj.AF0120010.AF0120010BUTTON1.Select1.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010BUTTON1-Select1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0120010', 'AF0120010BUTTON1', 'Select1', this, 'Button');
    }
  });
  expj.AF0120010.AF0120010BUTTON1.Select1.executePScriptOnLoad();
};

expj.AF0120010.AF0120010BUTTON1.Select1.executePScriptOnLoad = function () {
  console.log('execute AF0120010BUTTON1/Select1.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010BUTTON1-Select1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:105px;float:none;height:30px;"><button type="button" id="expj-AF0120010-AF0120010BUTTON1-Select1" name="Select1" class="AF0120010-focus-move" style="width:px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AF0120010-AF0120010VIEW1">
expj.AF0120010.AF0120010VIEW1 = {};
expj.AF0120010.AF0120010VIEW1.executeAllOnClick = function () {
};
expj.AF0120010.AF0120010VIEW1.executeAllOnDecision = function () {
  console.log('execute AF0120010VIEW1.onDecision');
};
expj.AF0120010.AF0120010VIEW1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0120010VIEW1", "expj.AF0120010.AF0120010VIEW1.executeAllOnClick");
%>
  expj.AF0120010.AF0120010VIEW1.executePScriptOnLoad();
};

expj.AF0120010.AF0120010VIEW1.executePScriptOnLoad = function () {
  console.log('execute AF0120010VIEW1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0120010-AF0120010VIEW1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0120010VIEW1_Id = "AF0120010VIEW1";
 String AF0120010VIEW1_select = "single";
 String AF0120010VIEW1_sortable = "true";
 String AF0120010VIEW1_resize = "true";
 String AF0120010VIEW1_scroll = "true";
 StringBuffer AF0120010VIEW1_HB = new StringBuffer();
 StringBuffer AF0120010VIEW1_DB = new StringBuffer();
%>
<%
 AF0120010VIEW1_select = "single";
 AF0120010VIEW1_sortable = "true";
 AF0120010VIEW1_resize = "true";
 AF0120010VIEW1_scroll = "true";
%>
<%
 AF0120010VIEW1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
%>
     
<%
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb))).append("', 'name':'PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3135",rb))).append("', 'name':'SUM_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3136",rb))).append("', 'name':'SRCS', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE_1",rb))).append("', 'name':'PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_STS_TYP",rb))).append("', 'name':'PUCH_ODR_STS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3125",rb))).append("', 'name':'WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_ITEM_CD",rb))).append("', 'name':'VEND_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_NAME",rb))).append("', 'name':'VEND_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
AF0120010VIEW1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PUCH_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0120010VIEW1_sortable).append("}").append(",");
%>
<%
 int aAF0120010StructLength = aAF0120010Control.getListsize();
 final AF0120010Struct structBackup = aAF0120010Struct;
 aAF0120010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0120010StructLength; ++loopCount) {
  if((aAF0120010Struct = (AF0120010Struct) aAF0120010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0120010Struct", aAF0120010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0120010VIEW1_DB.append("[");
 AF0120010VIEW1_DB.append(loopCount);
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-PUCH_ODR_QTY\" data-name=\"PUCH_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPUCH_ODR_QTY())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-SUM_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-SUM_ACPT_QTY\" data-name=\"SUM_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0120010Struct.getSUM_ACPT_QTY())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-SRCS-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-SRCS\" data-name=\"SRCS\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0120010Struct.getSRCS())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-PUCH_ODR_DLV_DATE\" data-name=\"PUCH_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPUCH_ODR_DLV_DATE())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-PUCH_ODR_STS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-PUCH_ODR_STS_NAME\" data-name=\"PUCH_ODR_STS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPUCH_ODR_STS_NAME())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-WH_NAME\" data-name=\"WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getWH_NAME())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-VEND_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-VEND_ITEM_CD\" data-name=\"VEND_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getVEND_ITEM_CD())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getVEND_CD())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-VEND_NAME\" data-name=\"VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getVEND_NAME())).append("</span>'");
 AF0120010VIEW1_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW1-PUCH_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW1-PUCH_ODR_STS_TYP\" data-name=\"PUCH_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPUCH_ODR_STS_TYP())).append("</span>'");
 AF0120010VIEW1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0120010StructLength) {
   AF0120010VIEW1_DB.append(",");
  }
 }
 aAF0120010Struct = structBackup;
 viewIdList.add(AF0120010VIEW1_Id);
 viewSelectList.add(AF0120010VIEW1_select);
 viewResizeList.add(AF0120010VIEW1_resize);
 viewScrollList.add(AF0120010VIEW1_scroll);
 viewHeaderDataList.add(AF0120010VIEW1_HB);
 viewBodyDataList.add(AF0120010VIEW1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:210px;"><script class="expj-script-AF0120010-AF0120010BUTTON2">
expj.AF0120010.AF0120010BUTTON2 = {};
expj.AF0120010.AF0120010BUTTON2.executeAllOnDecision = function () {
  console.log('execute AF0120010BUTTON2.onDecision');
};
expj.AF0120010.AF0120010BUTTON2.executeOnLoad = function () {
  expj.AF0120010.AF0120010BUTTON2.executePScriptOnLoad();
};

expj.AF0120010.AF0120010BUTTON2.executePScriptOnLoad = function () {
  console.log('execute AF0120010BUTTON2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0120010-AF0120010BUTTON2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0120010-AF0120010BUTTON2-AcceptEntry">
expj.AF0120010.AF0120010BUTTON2.AcceptEntry = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AF0120010VIEW1/+@AE0060010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AF0120010.AF0120010BUTTON2.AcceptEntry.onClick0 = function () {
  console.log('AcceptEntry script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0120010', 'AF0120010BUTTON2', '_AF0120010VIEW1/+', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0060010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AF0120010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0120010.AF0120010BUTTON2.AcceptEntry.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0120010.AF0120010BUTTON2.AcceptEntry['onClick' + i])) {
        expj.AF0120010.AF0120010BUTTON2.AcceptEntry['onClick' + i]();
      }
    }
  }
};
expj.AF0120010.AF0120010BUTTON2.AcceptEntry.executeAllOnDecision = function () {
};
expj.AF0120010.AF0120010BUTTON2.AcceptEntry.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010BUTTON2-AcceptEntry').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0120010', 'AF0120010BUTTON2', 'AcceptEntry', this, 'Button');
    }
  });
  expj.AF0120010.AF0120010BUTTON2.AcceptEntry.executePScriptOnLoad();
};

expj.AF0120010.AF0120010BUTTON2.AcceptEntry.executePScriptOnLoad = function () {
  console.log('execute AF0120010BUTTON2/AcceptEntry.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010BUTTON2-AcceptEntry');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0120010-AF0120010BUTTON2-AcceptEntry" name="AcceptEntry" class="AF0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAcceptEntry",rb)%></button><!-- 受入実績入力ボタン --></div><!--/td-->
<script class="expj-script-AF0120010-AF0120010BUTTON2-StockInquiry">
expj.AF0120010.AF0120010BUTTON2.StockInquiry = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AF0120010Form/ITEM_CD,_AF0120010Form/PLANT_CD@AG0010010Servlet,<%=contextNo%>,<%=su1.getScreenName()%>,<%=su1.getScreenID()%>"
expj.AF0120010.AF0120010BUTTON2.StockInquiry.onClick0 = function () {
  console.log('StockInquiry script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0120010', 'AF0120010BUTTON2', '_AF0120010Form/ITEM_CD,_AF0120010Form/PLANT_CD', 'AG0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su1.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AG0010010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AG0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su1.getScreenName()%>', contents, 'AF0120010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0120010.AF0120010BUTTON2.StockInquiry.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0120010.AF0120010BUTTON2.StockInquiry['onClick' + i])) {
        expj.AF0120010.AF0120010BUTTON2.StockInquiry['onClick' + i]();
      }
    }
  }
};
expj.AF0120010.AF0120010BUTTON2.StockInquiry.executeAllOnDecision = function () {
};
expj.AF0120010.AF0120010BUTTON2.StockInquiry.executeOnLoad = function () {
  $('#expj-AF0120010-AF0120010BUTTON2-StockInquiry').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0120010', 'AF0120010BUTTON2', 'StockInquiry', this, 'Button');
    }
  });
  expj.AF0120010.AF0120010BUTTON2.StockInquiry.executePScriptOnLoad();
};

expj.AF0120010.AF0120010BUTTON2.StockInquiry.executePScriptOnLoad = function () {
  console.log('execute AF0120010BUTTON2/StockInquiry.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-AF0120010BUTTON2-StockInquiry');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0120010-AF0120010BUTTON2-StockInquiry" name="StockInquiry" class="AF0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnStockInquiry",rb)%></button><!-- 在庫参照ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AF0120010-AF0120010VIEW2">
expj.AF0120010.AF0120010VIEW2 = {};
expj.AF0120010.AF0120010VIEW2.executeAllOnClick = function () {
};
expj.AF0120010.AF0120010VIEW2.executeAllOnDecision = function () {
  console.log('execute AF0120010VIEW2.onDecision');
};
expj.AF0120010.AF0120010VIEW2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0120010VIEW2", "expj.AF0120010.AF0120010VIEW2.executeAllOnClick");
%>
  expj.AF0120010.AF0120010VIEW2.executePScriptOnLoad();
};

expj.AF0120010.AF0120010VIEW2.executePScriptOnLoad = function () {
  console.log('execute AF0120010VIEW2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0120010-AF0120010VIEW2" class="expj-datagrid-view expj-view-multi" style="width:100%;height:194px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0120010VIEW2_Id = "AF0120010VIEW2";
 String AF0120010VIEW2_select = "single";
 String AF0120010VIEW2_sortable = "true";
 String AF0120010VIEW2_resize = "true";
 String AF0120010VIEW2_scroll = "true";
 StringBuffer AF0120010VIEW2_HB = new StringBuffer();
 StringBuffer AF0120010VIEW2_DB = new StringBuffer();
%>
<%
 AF0120010VIEW2_select = "multi";
 AF0120010VIEW2_sortable = "true";
 AF0120010VIEW2_resize = "true";
 AF0120010VIEW2_scroll = "true";
%>
<%
 AF0120010VIEW2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
%>
      <%
                  List listBackup = aAF0120010Control.getList();
                  aAF0120010Control.setList(aAF0120010Control.getCompList());
                %>
<%
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt3137",rb))).append("', 'name':'DISPLAY_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'PARENT_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'PARENT_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt1530",rb))).append("', 'name':'PUCH_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.LIMIT",rb))).append("', 'name':'PUCH_ODR_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.QTY",rb))).append("', 'name':'PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_CD",rb))).append("', 'name':'OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
AF0120010VIEW2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0120010VIEW2_sortable).append("}").append(",");
%>
<%
 int aAF0120010StructLength = aAF0120010Control.getListsize();
 final AF0120010Struct structBackup = aAF0120010Struct;
 aAF0120010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0120010StructLength; ++loopCount) {
  if((aAF0120010Struct = (AF0120010Struct) aAF0120010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0120010Struct", aAF0120010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0120010VIEW2_DB.append("[");
 AF0120010VIEW2_DB.append(loopCount);
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-DISPLAY_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-DISPLAY_NAME\" data-name=\"DISPLAY_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getDISPLAY_NAME())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-PARENT_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-PARENT_ITEM_CD\" data-name=\"PARENT_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPARENT_ITEM_CD())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-PARENT_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-PARENT_ITEM_NAME\" data-name=\"PARENT_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPARENT_ITEM_NAME())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-PUCH_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-PUCH_ODR_START_DATE\" data-name=\"PUCH_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPUCH_ODR_START_DATE())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-PUCH_ODR_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-PUCH_ODR_DLV_DATE\" data-name=\"PUCH_ODR_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPUCH_ODR_DLV_DATE())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-PUCH_ODR_QTY\" data-name=\"PUCH_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0120010Struct.getPUCH_ODR_QTY())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-WS_CD\" data-name=\"WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getWS_CD())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-WS_NAME\" data-name=\"WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getWS_NAME())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-OPR_INST_CD\" data-name=\"OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getOPR_INST_CD())).append("</span>'");
 AF0120010VIEW2_DB.append(",").append("'<span id=\"expj-AF0120010-AF0120010VIEW2-WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0120010-AF0120010VIEW2-WORK_ODR_CD\" data-name=\"WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0120010Struct.getWORK_ODR_CD())).append("</span>'");
 AF0120010VIEW2_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0120010StructLength) {
   AF0120010VIEW2_DB.append(",");
  }
 }
 aAF0120010Struct = structBackup;
 viewIdList.add(AF0120010VIEW2_Id);
 viewSelectList.add(AF0120010VIEW2_select);
 viewResizeList.add(AF0120010VIEW2_resize);
 viewScrollList.add(AF0120010VIEW2_scroll);
 viewHeaderDataList.add(AF0120010VIEW2_HB);
 viewBodyDataList.add(AF0120010VIEW2_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:559px;"></div><!--/td-->
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
<span class="version">AF0120010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AF0120010-ZZ0000000button0">
expj.AF0120010.ZZ0000000button0 = {};
expj.AF0120010.ZZ0000000button0.executeAllOnDecision = function () {
  console.log('execute ZZ0000000button0.onDecision');
};
expj.AF0120010.ZZ0000000button0.executeOnLoad = function () {
  expj.AF0120010.ZZ0000000button0.executePScriptOnLoad();
};

expj.AF0120010.ZZ0000000button0.executePScriptOnLoad = function () {
  console.log('execute ZZ0000000button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0120010-ZZ0000000button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0120010-ZZ0000000button0-Clear">
expj.AF0120010.ZZ0000000button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0120010Servlet,,$ZZ07008"
expj.AF0120010.ZZ0000000button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0120010', 'ZZ0000000button0', '', 'AF0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0120010', response);
expj.common.updateBusinessScreenTab('AF0120010', contents);
};
expj.common.pscript.callConfirm('AF0120010', 'ZZ0000000button0', 'ZZ07008', okEvent);
};
expj.AF0120010.ZZ0000000button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0120010.ZZ0000000button0.Clear['onClick' + i])) {
        expj.AF0120010.ZZ0000000button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AF0120010.ZZ0000000button0.Clear.executeAllOnDecision = function () {
};
expj.AF0120010.ZZ0000000button0.Clear.executeOnLoad = function () {
  $('#expj-AF0120010-ZZ0000000button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0120010', 'ZZ0000000button0', 'Clear', this, 'Button');
    }
  });
  expj.AF0120010.ZZ0000000button0.Clear.executePScriptOnLoad();
};

expj.AF0120010.ZZ0000000button0.Clear.executePScriptOnLoad = function () {
  console.log('execute ZZ0000000button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-ZZ0000000button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0120010-ZZ0000000button0-Clear" name="Clear" class="AF0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0120010-ZZ0000000button0-Close">
expj.AF0120010.ZZ0000000button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AF0120010.ZZ0000000button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AF0120010');
};
expj.AF0120010.ZZ0000000button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0120010.ZZ0000000button0.Close['onClick' + i])) {
        expj.AF0120010.ZZ0000000button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AF0120010.ZZ0000000button0.Close.executeAllOnDecision = function () {
};
expj.AF0120010.ZZ0000000button0.Close.executeOnLoad = function () {
  $('#expj-AF0120010-ZZ0000000button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0120010', 'ZZ0000000button0', 'Close', this, 'Button');
    }
  });
  expj.AF0120010.ZZ0000000button0.Close.executePScriptOnLoad();
};

expj.AF0120010.ZZ0000000button0.Close.executePScriptOnLoad = function () {
  console.log('execute ZZ0000000button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AF0120010-ZZ0000000button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0120010-ZZ0000000button0-Close" name="Close" class="AF0120010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0120010 (END)-->
<%
MessageStruct msgStruct = aAF0120010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0120010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0120010)) {
  expj.common.treeInstanceMap.AF0120010 = {};
}
expj.common.treeInstanceMap.AF0120010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0120010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0120010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0120010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0120010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0120010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0120010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0120010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0120010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0120010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0120010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0120010)) {
  expj.common.detailDialogMap.AF0120010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0120010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0120010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0120010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0120010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0120010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0120010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0120010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0120010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0120010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0120010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0120010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0120010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0120010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0120010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0120010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0120010)) {
  expj.common.viewInstanceMap.AF0120010 = {};
}
expj.common.viewInstanceMap.AF0120010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0120010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0120010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0120010.<%=viewId %>.init = function () {
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
    expj.AF0120010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0120010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0120010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0120010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0120010_init">
/**
 * AF0120010用のロード完了時初期化関数
 */
expj.AF0120010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0120010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0120010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0120010');
  expj.common.calendarInstanceMap.AF0120010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0120010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0120010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0120010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0120010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0120010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0120010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0120010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0120010.AF0120010Form.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010Form.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010Form.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010Form.ITEM_CD_PEEKER.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010Form.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010Form.MSG_BUSINESS_CD.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010Form.MSG_CONTEXT_NO.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010BUTTON1.Select1.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010BUTTON2.AcceptEntry.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010BUTTON2.StockInquiry.executeOnLoad();}catch(e){};
  try{expj.AF0120010.ZZ0000000button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AF0120010.ZZ0000000button0.Close.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010Form.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010BUTTON1.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010VIEW1.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010BUTTON2.executeOnLoad();}catch(e){};
  try{expj.AF0120010.AF0120010VIEW2.executeOnLoad();}catch(e){};
  try{expj.AF0120010.ZZ0000000button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0120010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0120010', 'AF0120010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0120010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0120010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0120010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0120010', '<%=request.getContextPath() %>');
};

/**
 * AF0120010の全体onDecision処理
 */
expj.AF0120010.executeAllOnDecision = function () {
  expj.AF0120010.AF0120010Form.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0120010_console">
expj.AF0120010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>