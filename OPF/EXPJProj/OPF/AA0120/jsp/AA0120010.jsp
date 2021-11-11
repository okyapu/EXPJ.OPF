<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:23:34 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0120\AA0120010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0120.*" %>
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
<jsp:useBean id="aAA0120010Control" class="com.nec.jp.orteus.metamorBase.AA0120.AA0120010Control" scope="request"/>
<jsp:useBean id="aAA0120010Struct" class="com.nec.jp.orteus.metamorBase.AA0120.AA0120010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

為替レート情報メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0120/jsp/AA0120010.jsp,v $
$Author: geng-jia $ 
$Revision: 1.10 $　$Date: 2017/02/22 02:04:00 $
********************************************************* --%>
<html>
<head>
<title>為替レート情報メンテナンス</title>
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
<script class="expj-script-AA0120010_init">
  // AA0120010名前空間
  expj.AA0120010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0120010" data-screen="AA0120010" data-newdata="<%=aAA0120010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style=""></div><!--/td-->

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
              <script class="expj-script-AA0120010-AA0120010form1">
expj.AA0120010.AA0120010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AA0120010.AA0120010form1.onLoad0 = function () {
  console.log('AA0120010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*3"
expj.AA0120010.AA0120010form1.onDecision0 = function () {
  console.log('AA0120010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0120010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="onDecision;1;CHK;?AA0120010form1/*[eq]INITIAL@*4,*6"
expj.AA0120010.AA0120010form1.onDecision1 = function () {
  console.log('AA0120010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120010form1', '?AA0120010form1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script4="onDecision;2;CHKRQ;?AA0120010view1/?[eq]SINGLE@*7,*5"
expj.AA0120010.AA0120010form1.onDecision2 = function () {
  console.log('AA0120010form1 script4');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120010form1', '?AA0120010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="onDecision;3;CHK;_AA0120010form1/EXCH_TYP_K[eq]2@*8,*9"
expj.AA0120010.AA0120010form1.onDecision3 = function () {
  console.log('AA0120010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120010form1', '_AA0120010form1/EXCH_TYP_K'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script6="child;0;UNMASK;_AA0120010button1/Select"
expj.AA0120010.AA0120010form1.child0 = function () {
  console.log('AA0120010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button1/Select');
};
// script7="child;1;UNMASK;_AA0120010button2/LineInsert"
expj.AA0120010.AA0120010form1.child1 = function () {
  console.log('AA0120010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineInsert');
};
// script8="child;2;UNMASK;_AA0120010button2/LineUpdate,_AA0120010button2/LineCopy,_AA0120010button2/LineDelete"
expj.AA0120010.AA0120010form1.child2 = function () {
  console.log('AA0120010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineUpdate');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineCopy');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineDelete');
};
// script9="child;3;MASK;_AA0120010button1/Select"
expj.AA0120010.AA0120010form1.child3 = function () {
  console.log('AA0120010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button1/Select');
};
// script10="child;4;MASK;_AA0120010button2/LineInsert"
expj.AA0120010.AA0120010form1.child4 = function () {
  console.log('AA0120010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineInsert');
};
// script11="child;5;MASK;_AA0120010button2/LineUpdate,_AA0120010button2/LineCopy,_AA0120010button2/LineDelete"
expj.AA0120010.AA0120010form1.child5 = function () {
  console.log('AA0120010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineUpdate');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineCopy');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010button2/LineDelete');
};
// script12="child;6;CHK;?CUR_CD[eq]SAME@*1,*4"
expj.AA0120010.AA0120010form1.child6 = function () {
  console.log('AA0120010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120010form1', '?CUR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script13="child;7;CHK;?CUR_CD[eq]SAME@*2,*5"
expj.AA0120010.AA0120010form1.child7 = function () {
  console.log('AA0120010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120010form1', '?CUR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script14="child;8;UNMASK;_AA0120010form1/EXCH_RESERVE_CD_K"
expj.AA0120010.AA0120010form1.child8 = function () {
  console.log('AA0120010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010form1/EXCH_RESERVE_CD_K');
};
// script15="child;9;MASK;_AA0120010form1/EXCH_RESERVE_CD_K@*10"
expj.AA0120010.AA0120010form1.child9 = function () {
  console.log('AA0120010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AA0120010', 'AA0120010form1', '_AA0120010form1/EXCH_RESERVE_CD_K');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script16="child;10;SET;_AA0120010form1/EXCH_RESERVE_CD_K="
expj.AA0120010.AA0120010form1.child10 = function () {
  console.log('AA0120010form1 script16');
expj.common.pscript.setReferenceComponentValue('AA0120010', 'AA0120010form1', '_AA0120010form1/EXCH_RESERVE_CD_K', '');
};
expj.AA0120010.AA0120010form1.executeAllOnDecision = function () {
  console.log('execute AA0120010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010form1['onDecision' + i])) {
        expj.AA0120010.AA0120010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010form1.executeOnLoad = function () {
  expj.AA0120010.AA0120010form1.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0120010.AA0120010form1['onLoad' + i])) {
      expj.AA0120010.AA0120010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0120010-AA0120010form1" action="AA0120010Servlet" name="AA0120010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0120010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUR_CD",rb)%></span><!-- 通貨コード --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-CUR_CD">
expj.AA0120010.AA0120010form1.CUR_CD = {};
expj.AA0120010.AA0120010form1.CUR_CD.executeAllOnDecision = function () {
  console.log('execute AA0120010form1/CUR_CD.onDecision');
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form1.CUR_CD.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form1', 'CUR_CD', this);
  });
  expj.AA0120010.AA0120010form1.CUR_CD.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form1-CUR_CD" name="CUR_CD" class="AA0120010-focus-move  required-value expj-AA0120010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getCUR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-PeekerCurCd">
expj.AA0120010.AA0120010form1.PeekerCurCd = {};
// script1="onClick;0;PEEKER;_AA0120010form1/CUR_CD@<%=contextNo%>"
expj.AA0120010.AA0120010form1.PeekerCurCd.onClick0 = function () {
  console.log('PeekerCurCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0120010';
var parameterValues = 'PeekerCurCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0120010', 'AA0120010form1', '_CUR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUR_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0120010form1/CUR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0120010.AA0120010form1.PeekerCurCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010form1.PeekerCurCd['onClick' + i])) {
        expj.AA0120010.AA0120010form1.PeekerCurCd['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010form1.PeekerCurCd.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010form1.PeekerCurCd.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-PeekerCurCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010form1', 'PeekerCurCd', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010form1.PeekerCurCd.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.PeekerCurCd.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/PeekerCurCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-PeekerCurCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0120010-AA0120010form1-PeekerCurCd" class="AA0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-CUR_NAME">
expj.AA0120010.AA0120010form1.CUR_NAME = {};
expj.AA0120010.AA0120010form1.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute AA0120010form1/CUR_NAME.onDecision');
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form1.CUR_NAME.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form1', 'CUR_NAME', this);
  });
  expj.AA0120010.AA0120010form1.CUR_NAME.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form1-CUR_NAME" name="CUR_NAME" class="AA0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0120010-AA0120010form1-h_APR_EXCH_RATE" name="h_APR_EXCH_RATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0120010Struct.geth_APR_EXCH_RATE()) %>">
<script class="expj-script-AA0120010-AA0120010form1-h_APR_EXCH_RATE">
expj.AA0120010.AA0120010form1.h_APR_EXCH_RATE = {};
expj.AA0120010.AA0120010form1.h_APR_EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AA0120010form1/h_APR_EXCH_RATE.onDecision');
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form1.h_APR_EXCH_RATE.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-h_APR_EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form1', 'h_APR_EXCH_RATE', this);
  });
  expj.AA0120010.AA0120010form1.h_APR_EXCH_RATE.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.h_APR_EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/h_APR_EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-h_APR_EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_TYP",rb)%></span><!-- 為替種別 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-EXCH_TYP_K">
expj.AA0120010.AA0120010form1.EXCH_TYP_K = {};
expj.AA0120010.AA0120010form1.EXCH_TYP_K.executeAllOnDecision = function () {
  console.log('execute AA0120010form1/EXCH_TYP_K.onDecision');
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form1.EXCH_TYP_K.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-EXCH_TYP_K').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0120010', 'AA0120010form1', 'EXCH_TYP_K', this);
  });
  expj.AA0120010.AA0120010form1.EXCH_TYP_K.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.EXCH_TYP_K.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/EXCH_TYP_K.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-EXCH_TYP_K');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0120010-AA0120010form1-EXCH_TYP_K" name='EXCH_TYP_K' class='AA0120010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0120010Control.getStruct().getList_EXCH_TYP_K_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0120010Control.getStruct().getList_EXCH_TYP_K_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0120010Control.getStruct().getList_EXCH_TYP_K_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0120010Struct.getEXCH_TYP_K()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_RESERVE_CD",rb)%></span><!-- 為替予約コード --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-EXCH_RESERVE_CD_K">
expj.AA0120010.AA0120010form1.EXCH_RESERVE_CD_K = {};
expj.AA0120010.AA0120010form1.EXCH_RESERVE_CD_K.executeAllOnDecision = function () {
  console.log('execute AA0120010form1/EXCH_RESERVE_CD_K.onDecision');
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form1.EXCH_RESERVE_CD_K.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-EXCH_RESERVE_CD_K').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form1', 'EXCH_RESERVE_CD_K', this);
  });
  expj.AA0120010.AA0120010form1.EXCH_RESERVE_CD_K.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.EXCH_RESERVE_CD_K.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/EXCH_RESERVE_CD_K.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-EXCH_RESERVE_CD_K');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form1-EXCH_RESERVE_CD_K" name="EXCH_RESERVE_CD_K" class="AA0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getEXCH_RESERVE_CD_K()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_START_DATE",rb)%></span><!-- 為替開始日付 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-EXCH_START_DATE_K">
expj.AA0120010.AA0120010form1.EXCH_START_DATE_K = {};
expj.AA0120010.AA0120010form1.EXCH_START_DATE_K.executeAllOnDecision = function () {
  console.log('execute AA0120010form1/EXCH_START_DATE_K.onDecision');
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form1.EXCH_START_DATE_K.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-EXCH_START_DATE_K').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form1', 'EXCH_START_DATE_K', this);
  });
  expj.AA0120010.AA0120010form1.EXCH_START_DATE_K.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.EXCH_START_DATE_K.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/EXCH_START_DATE_K.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-EXCH_START_DATE_K');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form1-EXCH_START_DATE_K" name="EXCH_START_DATE_K" class="AA0120010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getEXCH_START_DATE_K()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-CalendarExchStartDate">
expj.AA0120010.AA0120010form1.CalendarExchStartDate = {};
// script1="onClick;0;CALENDAR;_AA0120010form1/EXCH_START_DATE_K"
expj.AA0120010.AA0120010form1.CalendarExchStartDate.onClick0 = function () {
  console.log('CalendarExchStartDate script1');
expj.common.pscript.executeCalendar('AA0120010','AA0120010form1','_AA0120010form1/EXCH_START_DATE_K');
};
expj.AA0120010.AA0120010form1.CalendarExchStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010form1.CalendarExchStartDate['onClick' + i])) {
        expj.AA0120010.AA0120010form1.CalendarExchStartDate['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010form1.CalendarExchStartDate.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010form1.CalendarExchStartDate.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-CalendarExchStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010form1', 'CalendarExchStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0120010','AA0120010form1','_AA0120010form1/EXCH_START_DATE_K');
  expj.AA0120010.AA0120010form1.CalendarExchStartDate.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.CalendarExchStartDate.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/CalendarExchStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-CalendarExchStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0120010-AA0120010form1-CalendarExchStartDate" class="AA0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-EXCH_END_DATE_K">
expj.AA0120010.AA0120010form1.EXCH_END_DATE_K = {};
expj.AA0120010.AA0120010form1.EXCH_END_DATE_K.executeAllOnDecision = function () {
  console.log('execute AA0120010form1/EXCH_END_DATE_K.onDecision');
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form1.EXCH_END_DATE_K.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-EXCH_END_DATE_K').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form1', 'EXCH_END_DATE_K', this);
  });
  expj.AA0120010.AA0120010form1.EXCH_END_DATE_K.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.EXCH_END_DATE_K.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/EXCH_END_DATE_K.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-EXCH_END_DATE_K');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form1-EXCH_END_DATE_K" name="EXCH_END_DATE_K" class="AA0120010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getEXCH_END_DATE_K()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form1-CalendarExchEndDate">
expj.AA0120010.AA0120010form1.CalendarExchEndDate = {};
// script1="onClick;0;CALENDAR;_AA0120010form1/EXCH_END_DATE_K"
expj.AA0120010.AA0120010form1.CalendarExchEndDate.onClick0 = function () {
  console.log('CalendarExchEndDate script1');
expj.common.pscript.executeCalendar('AA0120010','AA0120010form1','_AA0120010form1/EXCH_END_DATE_K');
};
expj.AA0120010.AA0120010form1.CalendarExchEndDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010form1.CalendarExchEndDate['onClick' + i])) {
        expj.AA0120010.AA0120010form1.CalendarExchEndDate['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010form1.CalendarExchEndDate.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010form1.CalendarExchEndDate.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form1-CalendarExchEndDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010form1', 'CalendarExchEndDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AA0120010','AA0120010form1','_AA0120010form1/EXCH_END_DATE_K');
  expj.AA0120010.AA0120010form1.CalendarExchEndDate.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form1.CalendarExchEndDate.executePScriptOnLoad = function () {
  console.log('execute AA0120010form1/CalendarExchEndDate.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form1-CalendarExchEndDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0120010-AA0120010form1-CalendarExchEndDate" class="AA0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0120010-AA0120010button1">
expj.AA0120010.AA0120010button1 = {};
expj.AA0120010.AA0120010button1.executeAllOnDecision = function () {
  console.log('execute AA0120010button1.onDecision');
};
expj.AA0120010.AA0120010button1.executeOnLoad = function () {
  expj.AA0120010.AA0120010button1.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button1.executePScriptOnLoad = function () {
  console.log('execute AA0120010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0120010-AA0120010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0120010-AA0120010button1-Select">
expj.AA0120010.AA0120010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0120010form1/*@AA0120010Servlet"
expj.AA0120010.AA0120010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120010button1', '_AA0120010form1/*', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.updateBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0120010.AA0120010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010button1.Select['onClick' + i])) {
        expj.AA0120010.AA0120010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010button1.Select.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010button1.Select.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010button1', 'Select', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010button1.Select.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AA0120010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120010button1-Select" name="Select" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0120010-AA0120010view1">
expj.AA0120010.AA0120010view1 = {};
expj.AA0120010.AA0120010view1.executeAllOnClick = function () {
};
expj.AA0120010.AA0120010view1.executeAllOnDecision = function () {
  console.log('execute AA0120010view1.onDecision');
};
expj.AA0120010.AA0120010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0120010view1", "expj.AA0120010.AA0120010view1.executeAllOnClick");
%>
  expj.AA0120010.AA0120010view1.executePScriptOnLoad();
};

expj.AA0120010.AA0120010view1.executePScriptOnLoad = function () {
  console.log('execute AA0120010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0120010-AA0120010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0120010view1_Id = "AA0120010view1";
 String AA0120010view1_select = "single";
 String AA0120010view1_sortable = "true";
 String AA0120010view1_resize = "true";
 String AA0120010view1_scroll = "true";
 StringBuffer AA0120010view1_HB = new StringBuffer();
 StringBuffer AA0120010view1_DB = new StringBuffer();
%>
<%
 AA0120010view1_select = "single";
 AA0120010view1_sortable = "true";
 AA0120010view1_resize = "true";
 AA0120010view1_scroll = "true";
%>
<%
 AA0120010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0120010view1_sortable).append("}").append(",");
%>
     
<%
AA0120010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXCH_TYP",rb))).append("', 'name':'l_EXCH_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0120010view1_sortable).append("}").append(",");
AA0120010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_EXCH_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0120010view1_sortable).append("}").append(",");
AA0120010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXCH_RESERVE_CD",rb))).append("', 'name':'l_EXCH_RESERVE_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0120010view1_sortable).append("}").append(",");
AA0120010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXCH_START_DATE",rb))).append("', 'name':'l_EXCH_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0120010view1_sortable).append("}").append(",");
AA0120010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EXCH_RATE",rb))).append("', 'name':'l_EXCH_RATE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0120010view1_sortable).append("}").append(",");
AA0120010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0120010view1_sortable).append("}").append(",");
%>
<%
 int aAA0120010StructLength = aAA0120010Control.getListsize();
 final AA0120010Struct structBackup = aAA0120010Struct;
 aAA0120010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0120010StructLength; ++loopCount) {
  if((aAA0120010Struct = (AA0120010Struct) aAA0120010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0120010Struct", aAA0120010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0120010view1_DB.append("[");
 AA0120010view1_DB.append(loopCount);
 AA0120010view1_DB.append(",").append("'<span id=\"expj-AA0120010-AA0120010view1-l_EXCH_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AA0120010-AA0120010view1-l_EXCH_TYP_DN\" data-name=\"l_EXCH_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0120010Struct.getl_EXCH_TYP_DN())).append("</span>'");
 AA0120010view1_DB.append(",").append("'<span id=\"expj-AA0120010-AA0120010view1-l_EXCH_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0120010-AA0120010view1-l_EXCH_TYP\" data-name=\"l_EXCH_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0120010Struct.getl_EXCH_TYP())).append("</span>'");
 AA0120010view1_DB.append(",").append("'<span id=\"expj-AA0120010-AA0120010view1-l_EXCH_RESERVE_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0120010-AA0120010view1-l_EXCH_RESERVE_CD\" data-name=\"l_EXCH_RESERVE_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0120010Struct.getl_EXCH_RESERVE_CD())).append("</span>'");
 AA0120010view1_DB.append(",").append("'<span id=\"expj-AA0120010-AA0120010view1-l_EXCH_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0120010-AA0120010view1-l_EXCH_START_DATE\" data-name=\"l_EXCH_START_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAA0120010Struct.getl_EXCH_START_DATE())).append("</span>'");
 AA0120010view1_DB.append(",").append("'<span id=\"expj-AA0120010-AA0120010view1-l_EXCH_RATE-").append(loopCount).append("\" class=\"expj-label expj-AA0120010-AA0120010view1-l_EXCH_RATE\" data-name=\"l_EXCH_RATE\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;6\">").append(TypeConverter.sanitizer(aAA0120010Struct.getl_EXCH_RATE())).append("</span>'");
 AA0120010view1_DB.append(",").append("'<span id=\"expj-AA0120010-AA0120010view1-l_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0120010-AA0120010view1-l_MODIFY_COUNT\" data-name=\"l_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0120010Struct.getl_MODIFY_COUNT())).append("</span>'");
 AA0120010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0120010StructLength) {
   AA0120010view1_DB.append(",");
  }
 }
 aAA0120010Struct = structBackup;
 viewIdList.add(AA0120010view1_Id);
 viewSelectList.add(AA0120010view1_select);
 viewResizeList.add(AA0120010view1_resize);
 viewScrollList.add(AA0120010view1_scroll);
 viewHeaderDataList.add(AA0120010view1_HB);
 viewBodyDataList.add(AA0120010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:420px;"><script class="expj-script-AA0120010-AA0120010button2">
expj.AA0120010.AA0120010button2 = {};
expj.AA0120010.AA0120010button2.executeAllOnDecision = function () {
  console.log('execute AA0120010button2.onDecision');
};
expj.AA0120010.AA0120010button2.executeOnLoad = function () {
  expj.AA0120010.AA0120010button2.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button2.executePScriptOnLoad = function () {
  console.log('execute AA0120010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0120010-AA0120010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0120010-AA0120010button2-LineInsert">
expj.AA0120010.AA0120010button2.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0120010form1/*@AA0120010Servlet"
expj.AA0120010.AA0120010button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120010button2', '_AA0120010form1/*', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.changeBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0120010.AA0120010button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010button2.LineInsert['onClick' + i])) {
        expj.AA0120010.AA0120010button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010button2.LineInsert.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010button2.LineInsert.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010button2.LineInsert.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AA0120010button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120010button2-LineInsert" name="LineInsert" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010button2-LineUpdate">
expj.AA0120010.AA0120010button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0120010form1/*,_AA0120010view1/+@AA0120010Servlet"
expj.AA0120010.AA0120010button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120010button2', '_AA0120010form1/*,_AA0120010view1/+', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.changeBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0120010.AA0120010button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010button2.LineUpdate['onClick' + i])) {
        expj.AA0120010.AA0120010button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010button2.LineUpdate.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AA0120010button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120010button2-LineUpdate" name="LineUpdate" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010button2-LineCopy">
expj.AA0120010.AA0120010button2.LineCopy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0120010form1/*,_AA0120010view1/+@AA0120010Servlet"
expj.AA0120010.AA0120010button2.LineCopy.onClick0 = function () {
  console.log('LineCopy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120010button2', '_AA0120010form1/*,_AA0120010view1/+', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.changeBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0120010.AA0120010button2.LineCopy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010button2.LineCopy['onClick' + i])) {
        expj.AA0120010.AA0120010button2.LineCopy['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010button2.LineCopy.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010button2.LineCopy.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010button2-LineCopy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010button2', 'LineCopy', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010button2.LineCopy.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button2.LineCopy.executePScriptOnLoad = function () {
  console.log('execute AA0120010button2/LineCopy.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010button2-LineCopy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120010button2-LineCopy" name="LineCopy" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010button2-LineDelete">
expj.AA0120010.AA0120010button2.LineDelete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0120010form1/*,_AA0120010view1/+,_AA0120010form3/*@AA0120010Servlet,,$ZZ07004"
expj.AA0120010.AA0120010button2.LineDelete.onClick0 = function () {
  console.log('LineDelete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120010button2', '_AA0120010form1/*,_AA0120010view1/+,_AA0120010form3/*', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.updateBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callConfirm('AA0120010', 'AA0120010button2', 'ZZ07004', okEvent);
};
expj.AA0120010.AA0120010button2.LineDelete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010button2.LineDelete['onClick' + i])) {
        expj.AA0120010.AA0120010button2.LineDelete['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010button2.LineDelete.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010button2.LineDelete.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010button2-LineDelete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010button2', 'LineDelete', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010button2.LineDelete.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button2.LineDelete.executePScriptOnLoad = function () {
  console.log('execute AA0120010button2/LineDelete.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010button2-LineDelete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120010button2-LineDelete" name="LineDelete" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AA0120010-AA0120010form3">
expj.AA0120010.AA0120010form3 = {};
expj.AA0120010.AA0120010form3.executeAllOnDecision = function () {
  console.log('execute AA0120010form3.onDecision');
};
expj.AA0120010.AA0120010form3.executeOnLoad = function () {
  expj.AA0120010.AA0120010form3.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form3.executePScriptOnLoad = function () {
  console.log('execute AA0120010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0120010-AA0120010form3" action="AA0120010Servlet" name="AA0120010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_UNIT",rb)%></span><!-- 通貨単位 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form3-CUR_UNIT">
expj.AA0120010.AA0120010form3.CUR_UNIT = {};
expj.AA0120010.AA0120010form3.CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0120010form3/CUR_UNIT.onDecision');
  expj.AA0120010.AA0120010form3.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form3.CUR_UNIT.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form3-CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form3', 'CUR_UNIT', this);
  });
  expj.AA0120010.AA0120010form3.CUR_UNIT.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form3.CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0120010form3/CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form3-CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form3-CUR_UNIT" name="CUR_UNIT" class="AA0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getCUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_SYMBOL",rb)%></span><!-- 通貨記号 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form3-CUR_SYMBOL">
expj.AA0120010.AA0120010form3.CUR_SYMBOL = {};
expj.AA0120010.AA0120010form3.CUR_SYMBOL.executeAllOnDecision = function () {
  console.log('execute AA0120010form3/CUR_SYMBOL.onDecision');
  expj.AA0120010.AA0120010form3.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form3.CUR_SYMBOL.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form3-CUR_SYMBOL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form3', 'CUR_SYMBOL', this);
  });
  expj.AA0120010.AA0120010form3.CUR_SYMBOL.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form3.CUR_SYMBOL.executePScriptOnLoad = function () {
  console.log('execute AA0120010form3/CUR_SYMBOL.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form3-CUR_SYMBOL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form3-CUR_SYMBOL" name="CUR_SYMBOL" class="AA0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getCUR_SYMBOL()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DECIMAL_FIG",rb)%></span><!-- 小数桁数 --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010form3-DECIMAL_FIG">
expj.AA0120010.AA0120010form3.DECIMAL_FIG = {};
expj.AA0120010.AA0120010form3.DECIMAL_FIG.executeAllOnDecision = function () {
  console.log('execute AA0120010form3/DECIMAL_FIG.onDecision');
  expj.AA0120010.AA0120010form3.executeAllOnDecision();
  expj.AA0120010.executeAllOnDecision();
};
expj.AA0120010.AA0120010form3.DECIMAL_FIG.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010form3-DECIMAL_FIG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0120010', 'AA0120010form3', 'DECIMAL_FIG', this);
  });
  expj.AA0120010.AA0120010form3.DECIMAL_FIG.executePScriptOnLoad();
};

expj.AA0120010.AA0120010form3.DECIMAL_FIG.executePScriptOnLoad = function () {
  console.log('execute AA0120010form3/DECIMAL_FIG.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010form3-DECIMAL_FIG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0120010-AA0120010form3-DECIMAL_FIG" name="DECIMAL_FIG" class="AA0120010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0120010Struct.getDECIMAL_FIG()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0120010 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0120010-AA0120010button0">
expj.AA0120010.AA0120010button0 = {};
expj.AA0120010.AA0120010button0.executeAllOnDecision = function () {
  console.log('execute AA0120010button0.onDecision');
};
expj.AA0120010.AA0120010button0.executeOnLoad = function () {
  expj.AA0120010.AA0120010button0.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button0.executePScriptOnLoad = function () {
  console.log('execute AA0120010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0120010-AA0120010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0120010-AA0120010button0-Clear">
expj.AA0120010.AA0120010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0120010Servlet,,$ZZ07008"
expj.AA0120010.AA0120010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0120010', 'AA0120010button0', '', 'AA0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0120010', response);
expj.common.updateBusinessScreenTab('AA0120010', contents);
};
expj.common.pscript.callConfirm('AA0120010', 'AA0120010button0', 'ZZ07008', okEvent);
};
expj.AA0120010.AA0120010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010button0.Clear['onClick' + i])) {
        expj.AA0120010.AA0120010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010button0.Clear.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010button0.Clear.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010button0.Clear.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0120010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120010button0-Clear" name="Clear" class="AA0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0120010-AA0120010button0-Close">
expj.AA0120010.AA0120010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0120010.AA0120010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0120010');
};
expj.AA0120010.AA0120010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0120010.AA0120010button0.Close['onClick' + i])) {
        expj.AA0120010.AA0120010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0120010.AA0120010button0.Close.executeAllOnDecision = function () {
};
expj.AA0120010.AA0120010button0.Close.executeOnLoad = function () {
  $('#expj-AA0120010-AA0120010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0120010', 'AA0120010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0120010.AA0120010button0.Close.executePScriptOnLoad();
};

expj.AA0120010.AA0120010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0120010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0120010-AA0120010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0120010-AA0120010button0-Close" name="Close" class="AA0120010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0120010 (END)-->
<%
MessageStruct msgStruct = aAA0120010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0120010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0120010)) {
  expj.common.treeInstanceMap.AA0120010 = {};
}
expj.common.treeInstanceMap.AA0120010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0120010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0120010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0120010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0120010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0120010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0120010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010)) {
  expj.common.detailDialogMap.AA0120010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0120010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0120010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0120010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0120010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0120010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0120010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0120010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0120010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0120010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0120010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0120010)) {
  expj.common.viewInstanceMap.AA0120010 = {};
}
expj.common.viewInstanceMap.AA0120010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0120010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0120010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0120010.<%=viewId %>.init = function () {
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
    expj.AA0120010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0120010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0120010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0120010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0120010_init">
/**
 * AA0120010用のロード完了時初期化関数
 */
expj.AA0120010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0120010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0120010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0120010');
  expj.common.calendarInstanceMap.AA0120010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0120010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0120010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0120010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0120010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0120010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0120010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0120010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0120010.AA0120010form1.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.PeekerCurCd.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.h_APR_EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.EXCH_TYP_K.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.EXCH_RESERVE_CD_K.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.EXCH_START_DATE_K.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.CalendarExchStartDate.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.EXCH_END_DATE_K.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.CalendarExchEndDate.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button2.LineCopy.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button2.LineDelete.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form3.CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form3.CUR_SYMBOL.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form3.DECIMAL_FIG.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form1.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button1.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010view1.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button2.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010form3.executeOnLoad();}catch(e){};
  try{expj.AA0120010.AA0120010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0120010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0120010', 'AA0120010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0120010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0120010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0120010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0120010', '<%=request.getContextPath() %>');
};

/**
 * AA0120010の全体onDecision処理
 */
expj.AA0120010.executeAllOnDecision = function () {
  expj.AA0120010.AA0120010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0120010_console">
expj.AA0120010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>