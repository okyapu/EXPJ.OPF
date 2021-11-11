<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:29:34 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0150\AC0150010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0150.*" %>
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
<jsp:useBean id="aAC0150010Control" class="com.nec.jp.orteus.metamorBase.AC0150.AC0150010Control" scope="request"/>
<jsp:useBean id="aAC0150010Struct" class="com.nec.jp.orteus.metamorBase.AC0150.AC0150010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

個別オーダ発効（製番）
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0150/jsp/AC0150010.jsp,v $
$Author: geng-jia $
$Revision: 1.7 $ $Date: 2017/02/22 02:04:36 $
********************************************************* --%>
<html>
<head>
<title>個別オーダ発効（製番）</title>
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
<script class="expj-script-AC0150010_init">
  // AC0150010名前空間
  expj.AC0150010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AC0150010" data-screen="AC0150010" data-newdata="<%=aAC0150010Control.isNewData() %>">
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
              <!-- 1段目のDataGrid配置↓ -->
              <script class="expj-script-AC0150010-AC0150010form1">
expj.AC0150010.AC0150010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AC0150010.AC0150010form1.onLoad0 = function () {
  console.log('AC0150010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHKRQ;A@*2,*1"
expj.AC0150010.AC0150010form1.onDecision0 = function () {
  console.log('AC0150010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AC0150010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onDecision;1;CHK;?AC0150010form1/*[eq]NORMAL@*10,*3"
expj.AC0150010.AC0150010form1.onDecision1 = function () {
  console.log('AC0150010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '?AC0150010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;0;CHK;?AC0150010view1/?[neq]NOT_SELECTED@*5,*6"
expj.AC0150010.AC0150010form1.child0 = function () {
  console.log('AC0150010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '?AC0150010view1/?'), '[neq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script5="child;1;MASK;_AC0150010button1/select,_AC0150010button2/ClearAssort,_AC0150010button2/CheckAll,_AC0150010button2/Released"
expj.AC0150010.AC0150010form1.child1 = function () {
  console.log('AC0150010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/ClearAssort');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/Released');
};
// script6="child;2;UNMASK;_AC0150010button1/select"
expj.AC0150010.AC0150010form1.child2 = function () {
  console.log('AC0150010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button1/select');
};
// script7="child;3;MASK;_AC0150010button2/ClearAssort,_AC0150010button2/CheckAll,_AC0150010button2/Released"
expj.AC0150010.AC0150010form1.child3 = function () {
  console.log('AC0150010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/ClearAssort');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/Released');
};
// script8="child;4;UNMASK;_AC0150010button2/CheckAll@*0"
expj.AC0150010.AC0150010form1.child4 = function () {
  console.log('AC0150010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/CheckAll');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child0)){this.child0();}}
};
// script9="child;5;UNMASK;_AC0150010button2/ClearAssort,_AC0150010button2/Released,_AC0150010button2/CheckAll@*8"
expj.AC0150010.AC0150010form1.child5 = function () {
  console.log('AC0150010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/ClearAssort');
expj.common.pscript.setUnMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/Released');
expj.common.pscript.setUnMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/CheckAll');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script10="child;6;MASK;_AC0150010button2/ClearAssort,_AC0150010button2/Released@*7"
expj.AC0150010.AC0150010form1.child6 = function () {
  console.log('AC0150010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/ClearAssort');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/Released');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script11="child;7;UNMASK;_AC0150010button2/CheckAll"
expj.AC0150010.AC0150010form1.child7 = function () {
  console.log('AC0150010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/CheckAll');
};
// script12="child;8;SELCHKT;AC0150010view1:_l_ODR_STS_TYP[neq]1@*9"
expj.AC0150010.AC0150010form1.child8 = function () {
  console.log('AC0150010form1 script12');
var selectCells = expj.common.pscript.getSelectedVIEWCells('AC0150010', 'AC0150010view1');
var checkFlg = false;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (expj.common.pscript.evaluate(cell.l_ODR_STS_TYP, '[neq]', '1')) {
checkFlg = true;
break;
}
}
if (checkFlg) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;9;MASK;_AC0150010button2/Released"
expj.AC0150010.AC0150010form1.child9 = function () {
  console.log('AC0150010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AC0150010', 'AC0150010form1', '_AC0150010button2/Released');
};
// script14="child;10;CHK;?AC0150010form1/JOB_ODR_CD[neq]SAME[or]?AC0150010form1/ITEM_CD[neq]SAME[or]?AC0150010form1/JOB_ODR_CANCEL_NO[neq]SAME[or]?AC0150010form1/DEVELOP_LEVEL[neq]SAME[or]?AC0150010form1/c1_ODR_STS_TYP[neq]SAME@*3,*4"
expj.AC0150010.AC0150010form1.child10 = function () {
  console.log('AC0150010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '?AC0150010form1/JOB_ODR_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '?AC0150010form1/ITEM_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '?AC0150010form1/JOB_ODR_CANCEL_NO'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '?AC0150010form1/DEVELOP_LEVEL'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '?AC0150010form1/c1_ODR_STS_TYP'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
expj.AC0150010.AC0150010form1.executeAllOnDecision = function () {
  console.log('execute AC0150010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010form1['onDecision' + i])) {
        expj.AC0150010.AC0150010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010form1.executeOnLoad = function () {
  expj.AC0150010.AC0150010form1.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0150010.AC0150010form1['onLoad' + i])) {
      expj.AC0150010.AC0150010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0150010-AC0150010form1" action="AC0150010Servlet" name="AC0150010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0150010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-JOB_ODR_CD">
expj.AC0150010.AC0150010form1.JOB_ODR_CD = {};
expj.AC0150010.AC0150010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0150010form1/JOB_ODR_CD.onDecision');
  expj.AC0150010.AC0150010form1.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form1', 'JOB_ODR_CD', this);
  });
  expj.AC0150010.AC0150010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0150010-focus-move  required-value expj-AC0150010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-PeekerJobOdrCd">
expj.AC0150010.AC0150010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AC0150010form1/JOB_ODR_CD:_AC0150010form1/JOB_ODR_CANCEL_NO@<%=contextNo%>"
expj.AC0150010.AC0150010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0150010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AC0150010', 'PeekerJobOdrCd', 'SQLPARAM_1', '<%=aAC0150010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '_AC0150010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_08%&%';
parameterValues += 'TARGET_FIELD%=%_AC0150010form1/JOB_ODR_CD:_AC0150010form1/JOB_ODR_CANCEL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0150010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0150010.AC0150010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AC0150010.AC0150010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0150010-AC0150010form1-PeekerJobOdrCd" class="AC0150010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-JOB_ODR_CANCEL_NO">
expj.AC0150010.AC0150010form1.JOB_ODR_CANCEL_NO = {};
expj.AC0150010.AC0150010form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AC0150010form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AC0150010.AC0150010form1.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AC0150010.AC0150010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AC0150010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="6" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0018",rb)%></span><!-- 初期展開レベル --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-DEVELOP_LEVEL">
expj.AC0150010.AC0150010form1.DEVELOP_LEVEL = {};
expj.AC0150010.AC0150010form1.DEVELOP_LEVEL.executeAllOnDecision = function () {
  console.log('execute AC0150010form1/DEVELOP_LEVEL.onDecision');
  expj.AC0150010.AC0150010form1.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form1.DEVELOP_LEVEL.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-DEVELOP_LEVEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form1', 'DEVELOP_LEVEL', this);
  });
  expj.AC0150010.AC0150010form1.DEVELOP_LEVEL.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.DEVELOP_LEVEL.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/DEVELOP_LEVEL.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-DEVELOP_LEVEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form1-DEVELOP_LEVEL" name="DEVELOP_LEVEL" class="AC0150010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;4" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getDEVELOP_LEVEL()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-ITEM_CD">
expj.AC0150010.AC0150010form1.ITEM_CD = {};
expj.AC0150010.AC0150010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0150010form1/ITEM_CD.onDecision');
  expj.AC0150010.AC0150010form1.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form1', 'ITEM_CD', this);
  });
  expj.AC0150010.AC0150010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form1-ITEM_CD" name="ITEM_CD" class="AC0150010-focus-move  " style="width:260px;" data-kind="OBT_WILD;" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-PeekerITEM_CD">
expj.AC0150010.AC0150010form1.PeekerITEM_CD = {};
// script1="onClick;0;PEEKER;_AC0150010form1/ITEM_CD@<%=contextNo%>"
expj.AC0150010.AC0150010form1.PeekerITEM_CD.onClick0 = function () {
  console.log('PeekerITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0150010';
var parameterValues = 'PeekerITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0150010', 'AC0150010form1', '_AC0150010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0150010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0150010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0150010.AC0150010form1.PeekerITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010form1.PeekerITEM_CD['onClick' + i])) {
        expj.AC0150010.AC0150010form1.PeekerITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010form1.PeekerITEM_CD.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010form1.PeekerITEM_CD.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-PeekerITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010form1', 'PeekerITEM_CD', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010form1.PeekerITEM_CD.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.PeekerITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/PeekerITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-PeekerITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0150010-AC0150010form1-PeekerITEM_CD" class="AC0150010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-ITEM_NAME">
expj.AC0150010.AC0150010form1.ITEM_NAME = {};
expj.AC0150010.AC0150010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0150010form1/ITEM_NAME.onDecision');
  expj.AC0150010.AC0150010form1.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form1', 'ITEM_NAME', this);
  });
  expj.AC0150010.AC0150010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form1-ITEM_NAME" name="ITEM_NAME" class="AC0150010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_STS_TYP",rb)%></span><!-- オーダ状態区分 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form1-c1_ODR_STS_TYP">
expj.AC0150010.AC0150010form1.c1_ODR_STS_TYP = {};
expj.AC0150010.AC0150010form1.c1_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0150010form1/c1_ODR_STS_TYP.onDecision');
  expj.AC0150010.AC0150010form1.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form1.c1_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form1-c1_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010form1', 'c1_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AC0150010.AC0150010form1.c1_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form1.c1_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0150010form1/c1_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form1-c1_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c1_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0150010Struct.getc1_ODR_STS_TYP())) || "1".equals(TypeConverter.convert(aAC0150010Struct.getc1_ODR_STS_TYP())))?"checked=\"checked\"":"" %>  class="AC0150010-focus-move" id="expj-AC0150010-AC0150010form1-c1_ODR_STS_TYP"><label for="expj-AC0150010-AC0150010form1-c1_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0440",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 1段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0150010-AC0150010button1">
expj.AC0150010.AC0150010button1 = {};
expj.AC0150010.AC0150010button1.executeAllOnDecision = function () {
  console.log('execute AC0150010button1.onDecision');
};
expj.AC0150010.AC0150010button1.executeOnLoad = function () {
  expj.AC0150010.AC0150010button1.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button1.executePScriptOnLoad = function () {
  console.log('execute AC0150010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0150010-AC0150010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0150010-AC0150010button1-select">
expj.AC0150010.AC0150010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0150010form1/*@AC0150010Servlet"
expj.AC0150010.AC0150010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0150010', 'AC0150010button1', '_AC0150010form1/*', 'AC0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0150010', response);
expj.common.updateBusinessScreenTab('AC0150010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0150010.AC0150010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010button1.select['onClick' + i])) {
        expj.AC0150010.AC0150010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010button1.select.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010button1.select.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010button1', 'select', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010button1.select.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button1.select.executePScriptOnLoad = function () {
  console.log('execute AC0150010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0150010-AC0150010button1-select" name="select" class="AC0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- 2段目のDataGrid配置↓ --><script class="expj-script-AC0150010-AC0150010form2">
expj.AC0150010.AC0150010form2 = {};
expj.AC0150010.AC0150010form2.executeAllOnDecision = function () {
  console.log('execute AC0150010form2.onDecision');
};
expj.AC0150010.AC0150010form2.executeOnLoad = function () {
  expj.AC0150010.AC0150010form2.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form2.executePScriptOnLoad = function () {
  console.log('execute AC0150010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0150010-AC0150010form2" action="AC0150010Servlet" name="AC0150010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)%></span><!-- 製番種別 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form2-JOB_ODR_TYP_NAME">
expj.AC0150010.AC0150010form2.JOB_ODR_TYP_NAME = {};
expj.AC0150010.AC0150010form2.JOB_ODR_TYP_NAME.executeAllOnDecision = function () {
  console.log('execute AC0150010form2/JOB_ODR_TYP_NAME.onDecision');
  expj.AC0150010.AC0150010form2.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form2.JOB_ODR_TYP_NAME.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form2-JOB_ODR_TYP_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form2', 'JOB_ODR_TYP_NAME', this);
  });
  expj.AC0150010.AC0150010form2.JOB_ODR_TYP_NAME.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form2.JOB_ODR_TYP_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0150010form2/JOB_ODR_TYP_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form2-JOB_ODR_TYP_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form2-JOB_ODR_TYP_NAME" name="JOB_ODR_TYP_NAME" class="AC0150010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getJOB_ODR_TYP_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_STS_TYP",rb)%></span><!-- 製番状態区分 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form2-JOB_ODR_STS_TYP_NAME">
expj.AC0150010.AC0150010form2.JOB_ODR_STS_TYP_NAME = {};
expj.AC0150010.AC0150010form2.JOB_ODR_STS_TYP_NAME.executeAllOnDecision = function () {
  console.log('execute AC0150010form2/JOB_ODR_STS_TYP_NAME.onDecision');
  expj.AC0150010.AC0150010form2.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form2.JOB_ODR_STS_TYP_NAME.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form2-JOB_ODR_STS_TYP_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form2', 'JOB_ODR_STS_TYP_NAME', this);
  });
  expj.AC0150010.AC0150010form2.JOB_ODR_STS_TYP_NAME.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form2.JOB_ODR_STS_TYP_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0150010form2/JOB_ODR_STS_TYP_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form2-JOB_ODR_STS_TYP_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form2-JOB_ODR_STS_TYP_NAME" name="JOB_ODR_STS_TYP_NAME" class="AC0150010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getJOB_ODR_STS_TYP_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLAN_TYP",rb)%></span><!-- 計画タイプ --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form2-PLAN_TYP_NAME">
expj.AC0150010.AC0150010form2.PLAN_TYP_NAME = {};
expj.AC0150010.AC0150010form2.PLAN_TYP_NAME.executeAllOnDecision = function () {
  console.log('execute AC0150010form2/PLAN_TYP_NAME.onDecision');
  expj.AC0150010.AC0150010form2.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form2.PLAN_TYP_NAME.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form2-PLAN_TYP_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form2', 'PLAN_TYP_NAME', this);
  });
  expj.AC0150010.AC0150010form2.PLAN_TYP_NAME.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form2.PLAN_TYP_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0150010form2/PLAN_TYP_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form2-PLAN_TYP_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form2-PLAN_TYP_NAME" name="PLAN_TYP_NAME" class="AC0150010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getPLAN_TYP_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form2-ALC_GRP_CD">
expj.AC0150010.AC0150010form2.ALC_GRP_CD = {};
expj.AC0150010.AC0150010form2.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AC0150010form2/ALC_GRP_CD.onDecision');
  expj.AC0150010.AC0150010form2.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form2.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form2-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form2', 'ALC_GRP_CD', this);
  });
  expj.AC0150010.AC0150010form2.ALC_GRP_CD.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form2.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AC0150010form2/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form2-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form2-ALC_GRP_CD" name="ALC_GRP_CD" class="AC0150010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getALC_GRP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_DLV_DATE",rb)%></span><!-- 製番納期 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form2-JOB_ODR_DLV_DATE">
expj.AC0150010.AC0150010form2.JOB_ODR_DLV_DATE = {};
expj.AC0150010.AC0150010form2.JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AC0150010form2/JOB_ODR_DLV_DATE.onDecision');
  expj.AC0150010.AC0150010form2.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form2.JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form2-JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form2', 'JOB_ODR_DLV_DATE', this);
  });
  expj.AC0150010.AC0150010form2.JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form2.JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0150010form2/JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form2-JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form2-JOB_ODR_DLV_DATE" name="JOB_ODR_DLV_DATE" class="AC0150010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getJOB_ODR_DLV_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_QTY",rb)%></span><!-- 製番数 --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010form2-JOB_ODR_QTY">
expj.AC0150010.AC0150010form2.JOB_ODR_QTY = {};
expj.AC0150010.AC0150010form2.JOB_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AC0150010form2/JOB_ODR_QTY.onDecision');
  expj.AC0150010.AC0150010form2.executeAllOnDecision();
  expj.AC0150010.executeAllOnDecision();
};
expj.AC0150010.AC0150010form2.JOB_ODR_QTY.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010form2-JOB_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0150010', 'AC0150010form2', 'JOB_ODR_QTY', this);
  });
  expj.AC0150010.AC0150010form2.JOB_ODR_QTY.executePScriptOnLoad();
};

expj.AC0150010.AC0150010form2.JOB_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AC0150010form2/JOB_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010form2-JOB_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0150010-AC0150010form2-JOB_ODR_QTY" name="JOB_ODR_QTY" class="AC0150010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0150010Struct.getJOB_ODR_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- 2段目のDataGrid配置↑ --></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- 3段目のDataGrid配置↓ --><script class="expj-script-AC0150010-AC0150010view1">
expj.AC0150010.AC0150010view1 = {};
expj.AC0150010.AC0150010view1.executeAllOnClick = function () {
};
expj.AC0150010.AC0150010view1.executeAllOnDecision = function () {
  console.log('execute AC0150010view1.onDecision');
};
expj.AC0150010.AC0150010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0150010view1", "expj.AC0150010.AC0150010view1.executeAllOnClick");
%>
  expj.AC0150010.AC0150010view1.executePScriptOnLoad();
};

expj.AC0150010.AC0150010view1.executePScriptOnLoad = function () {
  console.log('execute AC0150010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0150010-AC0150010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0150010view1_Id = "AC0150010view1";
 String AC0150010view1_select = "single";
 String AC0150010view1_sortable = "true";
 String AC0150010view1_resize = "true";
 String AC0150010view1_scroll = "true";
 StringBuffer AC0150010view1_HB = new StringBuffer();
 StringBuffer AC0150010view1_DB = new StringBuffer();
%>
<%
 AC0150010view1_select = "multi";
 AC0150010view1_sortable = "true";
 AC0150010view1_resize = "true";
 AC0150010view1_scroll = "true";
%>
<%
 AC0150010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
%>
      
<%
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OrderID', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0019",rb))).append("', 'name':'Lev_No', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_STS_TYP",rb))).append("', 'name':'l_ODR_STS_TYP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'l_OUTSIDE_TYP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_UNIT_1",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_START_DATE",rb))).append("', 'name':'l_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_START_DATE",rb))).append("', 'name':'l_PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'l_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DUE_DATE",rb))).append("', 'name':'l_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_QTY_1",rb))).append("', 'name':'l_RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_CMPLT_DATE",rb))).append("', 'name':'l_RCV_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_NO",rb))).append("', 'name':'l_OD_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OD_GNR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
AC0150010view1_HB.append("{'visible':true, 'type':'string', 'width':'140px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_GNR_TYP",rb))).append("', 'name':'l_OD_GNR_TYP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0150010view1_sortable).append("}").append(",");
%>
<%
 int aAC0150010StructLength = aAC0150010Control.getListsize();
 final AC0150010Struct structBackup = aAC0150010Struct;
 aAC0150010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0150010StructLength; ++loopCount) {
  if((aAC0150010Struct = (AC0150010Struct) aAC0150010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0150010Struct", aAC0150010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0150010view1_DB.append("[");
 AC0150010view1_DB.append(loopCount);
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-OrderID-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-OrderID\" data-name=\"OrderID\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getOrderID())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-Lev_No-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-Lev_No\" data-name=\"Lev_No\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getLev_No())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_ODR_STS_TYP\" data-name=\"l_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_ODR_STS_TYP())).append("</span>'");
%> <%
String bgcolor = null;
if (aAC0150010Struct.getl_ODR_STS_TYP().equals("1")) {
	bgcolor="FFFF99";
} else if (aAC0150010Struct.getl_ODR_STS_TYP().equals("2")) {
	bgcolor="A9EA9E";
} else if (aAC0150010Struct.getl_ODR_STS_TYP().equals("9")) {
	bgcolor="ADD8E6";
} else {
	bgcolor="";
}
%> <%
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_ODR_STS_TYP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_ODR_STS_TYP_NAME\" data-name=\"l_ODR_STS_TYP_NAME\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_ODR_STS_TYP_NAME())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_ITEM_CD())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_ITEM_NAME())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_OUTSIDE_TYP\" data-name=\"l_OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_OUTSIDE_TYP())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_OUTSIDE_TYP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_OUTSIDE_TYP_NAME\" data-name=\"l_OUTSIDE_TYP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_OUTSIDE_TYP_NAME())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_ODR_QTY())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_STOCK_UNIT())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_ODR_START_DATE\" data-name=\"l_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_ODR_START_DATE())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_PRD_START_DATE\" data-name=\"l_PRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_PRD_START_DATE())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_PRD_DUE_DATE\" data-name=\"l_PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_PRD_DUE_DATE())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_DUE_DATE\" data-name=\"l_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_DUE_DATE())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_RCV_QTY\" data-name=\"l_RCV_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_RCV_QTY())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_RCV_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_RCV_CMPLT_DATE\" data-name=\"l_RCV_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_RCV_CMPLT_DATE())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_OD_NO\" data-name=\"l_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_OD_NO())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_OD_GNR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_OD_GNR_TYP\" data-name=\"l_OD_GNR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_OD_GNR_TYP())).append("</span>'");
 AC0150010view1_DB.append(",").append("'<span id=\"expj-AC0150010-AC0150010view1-l_OD_GNR_TYP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0150010-AC0150010view1-l_OD_GNR_TYP_NAME\" data-name=\"l_OD_GNR_TYP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0150010Struct.getl_OD_GNR_TYP_NAME())).append("</span>'");
 AC0150010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0150010StructLength) {
   AC0150010view1_DB.append(",");
  }
 }
 aAC0150010Struct = structBackup;
 viewIdList.add(AC0150010view1_Id);
 viewSelectList.add(AC0150010view1_select);
 viewResizeList.add(AC0150010view1_resize);
 viewScrollList.add(AC0150010view1_scroll);
 viewHeaderDataList.add(AC0150010view1_HB);
 viewBodyDataList.add(AC0150010view1_DB);
%>
<%
}
%>
<!-- 3段目のDataGrid配置↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AC0150010-AC0150010button2">
expj.AC0150010.AC0150010button2 = {};
expj.AC0150010.AC0150010button2.executeAllOnDecision = function () {
  console.log('execute AC0150010button2.onDecision');
};
expj.AC0150010.AC0150010button2.executeOnLoad = function () {
  expj.AC0150010.AC0150010button2.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button2.executePScriptOnLoad = function () {
  console.log('execute AC0150010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0150010-AC0150010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0150010-AC0150010button2-Released">
expj.AC0150010.AC0150010button2.Released = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0150010form1/*,_AC0150010form2/*,_AC0150010view1/+@AC0150010Servlet,,$AC00227"
expj.AC0150010.AC0150010button2.Released.onClick0 = function () {
  console.log('Released script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0150010', 'AC0150010button2', '_AC0150010form1/*,_AC0150010form2/*,_AC0150010view1/+', 'AC0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0150010', response);
expj.common.updateBusinessScreenTab('AC0150010', contents);
};
expj.common.pscript.callConfirm('AC0150010', 'AC0150010button2', 'AC00227', okEvent);
};
expj.AC0150010.AC0150010button2.Released.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010button2.Released['onClick' + i])) {
        expj.AC0150010.AC0150010button2.Released['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010button2.Released.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010button2.Released.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010button2-Released').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010button2', 'Released', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010button2.Released.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button2.Released.executePScriptOnLoad = function () {
  console.log('execute AC0150010button2/Released.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010button2-Released');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0150010-AC0150010button2-Released" name="Released" class="AC0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReleased",rb)%></button><!-- オーダ発効ボタン --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010button2-ClearAssort">
expj.AC0150010.AC0150010button2.ClearAssort = {};
// script1="onClick;0;DGSCANCEL;AC0150010view1"
expj.AC0150010.AC0150010button2.ClearAssort.onClick0 = function () {
  console.log('ClearAssort script1');
expj.common.pscript.unselectVIEWAllRow('AC0150010', 'AC0150010view1');
};
expj.AC0150010.AC0150010button2.ClearAssort.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010button2.ClearAssort['onClick' + i])) {
        expj.AC0150010.AC0150010button2.ClearAssort['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010button2.ClearAssort.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010button2.ClearAssort.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010button2-ClearAssort').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010button2', 'ClearAssort', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010button2.ClearAssort.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button2.ClearAssort.executePScriptOnLoad = function () {
  console.log('execute AC0150010button2/ClearAssort.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010button2-ClearAssort');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0150010-AC0150010button2-ClearAssort" name="ClearAssort" class="AC0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckClear",rb)%></button><!-- 全解除ボタン --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010button2-CheckAll">
expj.AC0150010.AC0150010button2.CheckAll = {};
// script1="onClick;0;DGSALL;AC0150010view1"
expj.AC0150010.AC0150010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AC0150010', 'AC0150010view1');
};
expj.AC0150010.AC0150010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010button2.CheckAll['onClick' + i])) {
        expj.AC0150010.AC0150010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010button2.CheckAll.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010button2.CheckAll.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010button2.CheckAll.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AC0150010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0150010-AC0150010button2-CheckAll" name="CheckAll" class="AC0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
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
<span class="version">AC0150010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AC0150010-AC0150010button0">
expj.AC0150010.AC0150010button0 = {};
expj.AC0150010.AC0150010button0.executeAllOnDecision = function () {
  console.log('execute AC0150010button0.onDecision');
};
expj.AC0150010.AC0150010button0.executeOnLoad = function () {
  expj.AC0150010.AC0150010button0.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button0.executePScriptOnLoad = function () {
  console.log('execute AC0150010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0150010-AC0150010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0150010-AC0150010button0-Clear">
expj.AC0150010.AC0150010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0150010Servlet,,$ZZ07008"
expj.AC0150010.AC0150010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0150010', 'AC0150010button0', '', 'AC0150010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0150010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0150010', response);
expj.common.updateBusinessScreenTab('AC0150010', contents);
};
expj.common.pscript.callConfirm('AC0150010', 'AC0150010button0', 'ZZ07008', okEvent);
};
expj.AC0150010.AC0150010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010button0.Clear['onClick' + i])) {
        expj.AC0150010.AC0150010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010button0.Clear.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010button0.Clear.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010button0.Clear.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0150010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0150010-AC0150010button0-Clear" name="Clear" class="AC0150010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0150010-AC0150010button0-Close">
expj.AC0150010.AC0150010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0150010.AC0150010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0150010');
};
expj.AC0150010.AC0150010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0150010.AC0150010button0.Close['onClick' + i])) {
        expj.AC0150010.AC0150010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0150010.AC0150010button0.Close.executeAllOnDecision = function () {
};
expj.AC0150010.AC0150010button0.Close.executeOnLoad = function () {
  $('#expj-AC0150010-AC0150010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0150010', 'AC0150010button0', 'Close', this, 'Button');
    }
  });
  expj.AC0150010.AC0150010button0.Close.executePScriptOnLoad();
};

expj.AC0150010.AC0150010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0150010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0150010-AC0150010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0150010-AC0150010button0-Close" name="Close" class="AC0150010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0150010 (END)-->
<%
MessageStruct msgStruct = aAC0150010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0150010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0150010)) {
  expj.common.treeInstanceMap.AC0150010 = {};
}
expj.common.treeInstanceMap.AC0150010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0150010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0150010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0150010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0150010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0150010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0150010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0150010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0150010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0150010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0150010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0150010)) {
  expj.common.detailDialogMap.AC0150010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0150010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0150010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0150010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0150010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0150010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0150010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0150010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0150010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0150010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0150010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0150010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0150010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0150010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0150010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0150010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0150010)) {
  expj.common.viewInstanceMap.AC0150010 = {};
}
expj.common.viewInstanceMap.AC0150010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0150010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0150010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0150010.<%=viewId %>.init = function () {
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
    expj.AC0150010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0150010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0150010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0150010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0150010_init">
/**
 * AC0150010用のロード完了時初期化関数
 */
expj.AC0150010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0150010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0150010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0150010');
  expj.common.calendarInstanceMap.AC0150010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0150010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0150010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0150010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0150010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0150010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0150010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0150010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0150010.AC0150010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.DEVELOP_LEVEL.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.PeekerITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.c1_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button1.select.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form2.JOB_ODR_TYP_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form2.JOB_ODR_STS_TYP_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form2.PLAN_TYP_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form2.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form2.JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form2.JOB_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button2.Released.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button2.ClearAssort.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form1.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button1.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010form2.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010view1.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button2.executeOnLoad();}catch(e){};
  try{expj.AC0150010.AC0150010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0150010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0150010', 'AC0150010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0150010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0150010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0150010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0150010', '<%=request.getContextPath() %>');
};

/**
 * AC0150010の全体onDecision処理
 */
expj.AC0150010.executeAllOnDecision = function () {
  expj.AC0150010.AC0150010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0150010_console">
expj.AC0150010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>