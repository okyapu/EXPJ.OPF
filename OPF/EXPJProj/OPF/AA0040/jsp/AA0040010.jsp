<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:21:22 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0040\AA0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0040.*" %>
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
<jsp:useBean id="aAA0040010Control" class="com.nec.jp.orteus.metamorBase.AA0040.AA0040010Control" scope="request"/>
<jsp:useBean id="aAA0040010Struct" class="com.nec.jp.orteus.metamorBase.AA0040.AA0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

購入単価メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0040/jsp/AA0040010.jsp,v $
$Author: geng-jia $     
$Revision: 1.18 $ $Date: 2017/02/22 02:03:47 $
********************************************************* --%>
<html>
<head>
<title>購入単価メンテナンス</title>
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
<script class="expj-script-AA0040010_init">
  // AA0040010名前空間
  expj.AA0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<%
// 金額の書式
String costColKind = "OBT_NUMBER_P;14.2;FLOOR;4";
/*if(aAA0040010Struct.getROUND_TYP() != null && aAA0040010Struct.getDECIMAL_FIG() != null
&& "".equals(aAA0040010Struct.getROUND_TYP()) == false && "".equals(aAA0040010Struct.getDECIMAL_FIG()) == false){
    costColKind = Kind.convertNumeric(Kind.NUMBER,Kind.Z,14,2,aAA0040010Struct.getROUND_TYP(),aAA0040010Struct.getDECIMAL_FIG());
}*/
%>


  <div id="expj-business-screen-AA0040010" data-screen="AA0040010" data-newdata="<%=aAA0040010Control.isNewData() %>">
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
              <script class="expj-script-AA0040010-AA0040010form1">
expj.AA0040010.AA0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.AA0040010.AA0040010form1.onLoad0 = function () {
  console.log('AA0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AA0040010.AA0040010form1.onDecision0 = function () {
  console.log('AA0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AA0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AA0040010button1/select"
expj.AA0040010.AA0040010form1.child0 = function () {
  console.log('AA0040010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button1/select');
};
// script4="child;1;MASK;_AA0040010button1/select"
expj.AA0040010.AA0040010form1.child1 = function () {
  console.log('AA0040010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button1/select');
};
// script5="onDecision;1;CHK;?AA0040010form1/*[neq]INITIAL@*2,*3"
expj.AA0040010.AA0040010form1.onDecision1 = function () {
  console.log('AA0040010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '?AA0040010form1/*'), '[neq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AA0040010button2/update,_AA0040010button3/append,_AA0040010button3/deleteAll"
expj.AA0040010.AA0040010form1.child2 = function () {
  console.log('AA0040010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button2/update');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/append');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/deleteAll');
};
// script7="child;3;MASK;_AA0040010button2/update,_AA0040010button3/append,_AA0040010button3/modify,_AA0040010button3/copy,_AA0040010button3/erase,_AA0040010button3/deleteAll"
expj.AA0040010.AA0040010form1.child3 = function () {
  console.log('AA0040010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/append');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/erase');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/deleteAll');
};
// script8="onDecision;2;CHK;?AA0040010view1/?[eq]SINGLE@*4,*5"
expj.AA0040010.AA0040010form1.onDecision2 = function () {
  console.log('AA0040010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '?AA0040010view1/?'), '[eq]', 'SINGLE')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;4;UNMASK;_AA0040010button3/modify,_AA0040010button3/copy,_AA0040010button3/erase"
expj.AA0040010.AA0040010form1.child4 = function () {
  console.log('AA0040010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/modify');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/copy');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/erase');
};
// script10="child;5;MASK;_AA0040010button3/modify,_AA0040010button3/copy,_AA0040010button3/erase"
expj.AA0040010.AA0040010form1.child5 = function () {
  console.log('AA0040010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/erase');
};
// script11="onDecision;3;CHK;?AA0040010form1/ITEM_CD[neq]SAME[or]?AA0040010form1/VEND_CD[neq]SAME@*6"
expj.AA0040010.AA0040010form1.onDecision3 = function () {
  console.log('AA0040010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '?AA0040010form1/ITEM_CD'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '?AA0040010form1/VEND_CD'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script12="child;6;MASK;_AA0040010button2/update,_AA0040010button3/append,_AA0040010button3/modify,_AA0040010button3/copy,_AA0040010button3/erase,_AA0040010button3/deleteAll"
expj.AA0040010.AA0040010form1.child6 = function () {
  console.log('AA0040010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/append');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/erase');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/deleteAll');
};
// script13="onDecision;4;CHK;_AA0040010form1/h_APR_PUCH_UNIT_COST[eq]1@*7,*8"
expj.AA0040010.AA0040010form1.onDecision4 = function () {
  console.log('AA0040010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '_AA0040010form1/h_APR_PUCH_UNIT_COST'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script14="child;7;UNMASK;_AA0040010form2/APPR_REMARKS"
expj.AA0040010.AA0040010form1.child7 = function () {
  console.log('AA0040010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010form2/APPR_REMARKS');
};
// script15="child;8;MASK;_AA0040010form2/APPR_REMARKS"
expj.AA0040010.AA0040010form1.child8 = function () {
  console.log('AA0040010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010form2/APPR_REMARKS');
};
// script16="onDecision;5;CHK;_AA0040010form1/h_SCREENMOVE_TYP[neq]@*9"
expj.AA0040010.AA0040010form1.onDecision5 = function () {
  console.log('AA0040010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '_AA0040010form1/h_SCREENMOVE_TYP'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script17="child;9;MASK;_AA0040010button1/select,_AA0040010button1/Detail,_AA0040010button2/update,_AA0040010button3/append,_AA0040010button3/modify,_AA0040010button3/copy,_AA0040010button3/erase,_AA0040010button3/delete,_AA0040010button3/deleteAll,_AA0040010button0/clear"
expj.AA0040010.AA0040010form1.child9 = function () {
  console.log('AA0040010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button1/Detail');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/append');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/modify');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/copy');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/erase');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/delete');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button3/deleteAll');
expj.common.pscript.setMaskToReferenceComponent('AA0040010', 'AA0040010form1', '_AA0040010button0/clear');
};
expj.AA0040010.AA0040010form1.executeAllOnDecision = function () {
  console.log('execute AA0040010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010form1['onDecision' + i])) {
        expj.AA0040010.AA0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010form1.executeOnLoad = function () {
  expj.AA0040010.AA0040010form1.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0040010.AA0040010form1['onLoad' + i])) {
      expj.AA0040010.AA0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0040010-AA0040010form1" action="AA0040010Servlet" name="AA0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0040010Control.getReadStatusString()) %>" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form1-ITEM_CD">
expj.AA0040010.AA0040010form1.ITEM_CD = {};
expj.AA0040010.AA0040010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/ITEM_CD.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'ITEM_CD', this);
  });
  expj.AA0040010.AA0040010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form1-ITEM_CD" name="ITEM_CD" class="AA0040010-focus-move  required-value expj-AA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form1-DRAW_CD" name="DRAW_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getDRAW_CD()) %>">
<script class="expj-script-AA0040010-AA0040010form1-DRAW_CD">
expj.AA0040010.AA0040010form1.DRAW_CD = {};
expj.AA0040010.AA0040010form1.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/DRAW_CD.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.DRAW_CD.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'DRAW_CD', this);
  });
  expj.AA0040010.AA0040010form1.DRAW_CD.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0040010-AA0040010form1-SPEC" name="SPEC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getSPEC()) %>">
<script class="expj-script-AA0040010-AA0040010form1-SPEC">
expj.AA0040010.AA0040010form1.SPEC = {};
expj.AA0040010.AA0040010form1.SPEC.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/SPEC.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.SPEC.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'SPEC', this);
  });
  expj.AA0040010.AA0040010form1.SPEC.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.SPEC.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0040010-AA0040010form1-PeekerItemCd">
expj.AA0040010.AA0040010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AA0040010form1/ITEM_CD@<%=contextNo%>"
expj.AA0040010.AA0040010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0040010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '_AA0040010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0040010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0040010.AA0040010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010form1.PeekerItemCd['onClick' + i])) {
        expj.AA0040010.AA0040010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0040010-AA0040010form1-PeekerItemCd" class="AA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form1-ITEM_NAME">
expj.AA0040010.AA0040010form1.ITEM_NAME = {};
expj.AA0040010.AA0040010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/ITEM_NAME.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'ITEM_NAME', this);
  });
  expj.AA0040010.AA0040010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form1-ITEM_NAME" name="ITEM_NAME" class="AA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-AA0040010-AA0040010form1-h_SCREENMOVE_TYP">
expj.AA0040010.AA0040010form1.h_SCREENMOVE_TYP = {};
expj.AA0040010.AA0040010form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/h_SCREENMOVE_TYP.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.AA0040010.AA0040010form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form1-VEND_CD">
expj.AA0040010.AA0040010form1.VEND_CD = {};
expj.AA0040010.AA0040010form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/VEND_CD.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'VEND_CD', this);
  });
  expj.AA0040010.AA0040010form1.VEND_CD.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form1-VEND_CD" name="VEND_CD" class="AA0040010-focus-move  required-value expj-AA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form1-PeekerVendCd">
expj.AA0040010.AA0040010form1.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AA0040010form1/VEND_CD@<%=contextNo%>"
expj.AA0040010.AA0040010form1.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0040010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form1', '_AA0040010form1/VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AA0040010form1/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0040010.AA0040010form1.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010form1.PeekerVendCd['onClick' + i])) {
        expj.AA0040010.AA0040010form1.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010form1.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010form1.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010form1', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010form1.PeekerVendCd.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0040010-AA0040010form1-PeekerVendCd" class="AA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form1-VEND_ANAME">
expj.AA0040010.AA0040010form1.VEND_ANAME = {};
expj.AA0040010.AA0040010form1.VEND_ANAME.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/VEND_ANAME.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.VEND_ANAME.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-VEND_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'VEND_ANAME', this);
  });
  expj.AA0040010.AA0040010form1.VEND_ANAME.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.VEND_ANAME.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/VEND_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-VEND_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form1-VEND_ANAME" name="VEND_ANAME" class="AA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getVEND_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.geth_APPR_ID()) %>">
<script class="expj-script-AA0040010-AA0040010form1-h_APPR_ID">
expj.AA0040010.AA0040010form1.h_APPR_ID = {};
expj.AA0040010.AA0040010form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/h_APPR_ID.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'h_APPR_ID', this);
  });
  expj.AA0040010.AA0040010form1.h_APPR_ID.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-h_APPR_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form1-ROUND_TYP" name="ROUND_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getROUND_TYP()) %>">
<script class="expj-script-AA0040010-AA0040010form1-ROUND_TYP">
expj.AA0040010.AA0040010form1.ROUND_TYP = {};
expj.AA0040010.AA0040010form1.ROUND_TYP.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/ROUND_TYP.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.ROUND_TYP.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-ROUND_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'ROUND_TYP', this);
  });
  expj.AA0040010.AA0040010form1.ROUND_TYP.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.ROUND_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/ROUND_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-ROUND_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_CD",rb)%></span><!-- 通貨コード --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form1-CUR_CD">
expj.AA0040010.AA0040010form1.CUR_CD = {};
expj.AA0040010.AA0040010form1.CUR_CD.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/CUR_CD.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.CUR_CD.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'CUR_CD', this);
  });
  expj.AA0040010.AA0040010form1.CUR_CD.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form1-CUR_CD" name="CUR_CD" class="AA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getCUR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form1-CUR_NAME">
expj.AA0040010.AA0040010form1.CUR_NAME = {};
expj.AA0040010.AA0040010form1.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/CUR_NAME.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.CUR_NAME.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'CUR_NAME', this);
  });
  expj.AA0040010.AA0040010form1.CUR_NAME.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form1-CUR_NAME" name="CUR_NAME" class="AA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form1-h_APR_PUCH_UNIT_COST" name="h_APR_PUCH_UNIT_COST" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.geth_APR_PUCH_UNIT_COST()) %>">
<script class="expj-script-AA0040010-AA0040010form1-h_APR_PUCH_UNIT_COST">
expj.AA0040010.AA0040010form1.h_APR_PUCH_UNIT_COST = {};
expj.AA0040010.AA0040010form1.h_APR_PUCH_UNIT_COST.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/h_APR_PUCH_UNIT_COST.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.h_APR_PUCH_UNIT_COST.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-h_APR_PUCH_UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'h_APR_PUCH_UNIT_COST', this);
  });
  expj.AA0040010.AA0040010form1.h_APR_PUCH_UNIT_COST.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.h_APR_PUCH_UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/h_APR_PUCH_UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-h_APR_PUCH_UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form1-DECIMAL_FIG" name="DECIMAL_FIG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getDECIMAL_FIG()) %>">
<script class="expj-script-AA0040010-AA0040010form1-DECIMAL_FIG">
expj.AA0040010.AA0040010form1.DECIMAL_FIG = {};
expj.AA0040010.AA0040010form1.DECIMAL_FIG.executeAllOnDecision = function () {
  console.log('execute AA0040010form1/DECIMAL_FIG.onDecision');
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form1.DECIMAL_FIG.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form1-DECIMAL_FIG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form1', 'DECIMAL_FIG', this);
  });
  expj.AA0040010.AA0040010form1.DECIMAL_FIG.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form1.DECIMAL_FIG.executePScriptOnLoad = function () {
  console.log('execute AA0040010form1/DECIMAL_FIG.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form1-DECIMAL_FIG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0040010-AA0040010button1">
expj.AA0040010.AA0040010button1 = {};
expj.AA0040010.AA0040010button1.executeAllOnDecision = function () {
  console.log('execute AA0040010button1.onDecision');
};
expj.AA0040010.AA0040010button1.executeOnLoad = function () {
  expj.AA0040010.AA0040010button1.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button1.executePScriptOnLoad = function () {
  console.log('execute AA0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0040010-AA0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0040010-AA0040010button1-Detail">
expj.AA0040010.AA0040010button1.Detail = {};
// script1="onClick;0;FSHOW;AA0040010float1"
expj.AA0040010.AA0040010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AA0040010', 'AA0040010float1', '');
};
expj.AA0040010.AA0040010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button1.Detail['onClick' + i])) {
        expj.AA0040010.AA0040010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button1.Detail.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button1.Detail.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button1', 'Detail', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button1.Detail.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AA0040010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button1-Detail" name="Detail" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010button1-select">
expj.AA0040010.AA0040010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0040010form1/*@AA0040010Servlet"
expj.AA0040010.AA0040010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button1', '_AA0040010form1/*', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.updateBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0040010.AA0040010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button1.select['onClick' + i])) {
        expj.AA0040010.AA0040010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button1.select.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button1.select.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button1', 'select', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button1.select.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0040010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button1-select" name="select" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><script class="expj-script-AA0040010-AA0040010form2">
expj.AA0040010.AA0040010form2 = {};
expj.AA0040010.AA0040010form2.executeAllOnDecision = function () {
  console.log('execute AA0040010form2.onDecision');
};
expj.AA0040010.AA0040010form2.executeOnLoad = function () {
  expj.AA0040010.AA0040010form2.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0040010-AA0040010form2" action="AA0040010Servlet" name="AA0040010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_PRIORITY_REF_NO_1",rb)%></span><!-- 取引先優先順位 --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form2-PUCH_PRIORITY_REF_NO">
expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.onLoad0 = function () {
  console.log('PUCH_PRIORITY_REF_NO script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;_AA0040010form2/PUCH_PRIORITY_REF_NO[eq]0@*0"
expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.onDecision0 = function () {
  console.log('PUCH_PRIORITY_REF_NO script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010form2', '_AA0040010form2/PUCH_PRIORITY_REF_NO'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;SET;_AA0040010form2/PUCH_PRIORITY_REF_NO=1"
expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.child0 = function () {
  console.log('PUCH_PRIORITY_REF_NO script3');
expj.common.pscript.setReferenceComponentValue('AA0040010', 'AA0040010form2', '_AA0040010form2/PUCH_PRIORITY_REF_NO', '1');
};
expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/PUCH_PRIORITY_REF_NO.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO['onDecision' + i])) {
        expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO['onDecision' + i]();
      }
    }
  }
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-PUCH_PRIORITY_REF_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'PUCH_PRIORITY_REF_NO', this);
  });
  expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/PUCH_PRIORITY_REF_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-PUCH_PRIORITY_REF_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO['onLoad' + i])) {
      expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form2-PUCH_PRIORITY_REF_NO" name="PUCH_PRIORITY_REF_NO" class="AA0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getPUCH_PRIORITY_REF_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO" name="h_PUCH_PRIORITY_REF_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Control.getStruct().getPUCH_PRIORITY_REF_NO()) %>">
<script class="expj-script-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO">
expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO = {};
expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/h_PUCH_PRIORITY_REF_NO.onDecision');
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'h_PUCH_PRIORITY_REF_NO', this);
  });
  expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/h_PUCH_PRIORITY_REF_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_ITEM_CD",rb)%></span><!-- 取引先品目番号 --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form2-VEND_ITEM_CD">
expj.AA0040010.AA0040010form2.VEND_ITEM_CD = {};
expj.AA0040010.AA0040010form2.VEND_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/VEND_ITEM_CD.onDecision');
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.VEND_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-VEND_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'VEND_ITEM_CD', this);
  });
  expj.AA0040010.AA0040010form2.VEND_ITEM_CD.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.VEND_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/VEND_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-VEND_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form2-VEND_ITEM_CD" name="VEND_ITEM_CD" class="AA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getVEND_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form2-h_VEND_ITEM_CD" name="h_VEND_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Control.getStruct().getVEND_ITEM_CD()) %>">
<script class="expj-script-AA0040010-AA0040010form2-h_VEND_ITEM_CD">
expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD = {};
expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/h_VEND_ITEM_CD.onDecision');
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-h_VEND_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'h_VEND_ITEM_CD', this);
  });
  expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/h_VEND_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-h_VEND_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0040010-AA0040010form2-w_MODIFY_COUNT_H" name="w_MODIFY_COUNT_H" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getw_MODIFY_COUNT_H()) %>">
<script class="expj-script-AA0040010-AA0040010form2-w_MODIFY_COUNT_H">
expj.AA0040010.AA0040010form2.w_MODIFY_COUNT_H = {};
expj.AA0040010.AA0040010form2.w_MODIFY_COUNT_H.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/w_MODIFY_COUNT_H.onDecision');
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.w_MODIFY_COUNT_H.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-w_MODIFY_COUNT_H').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'w_MODIFY_COUNT_H', this);
  });
  expj.AA0040010.AA0040010form2.w_MODIFY_COUNT_H.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.w_MODIFY_COUNT_H.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/w_MODIFY_COUNT_H.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-w_MODIFY_COUNT_H');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010form2-APPR_REMARKS">
expj.AA0040010.AA0040010form2.APPR_REMARKS = {};
expj.AA0040010.AA0040010form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/APPR_REMARKS.onDecision');
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'APPR_REMARKS', this);
  });
  expj.AA0040010.AA0040010form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AA0040010-AA0040010form2-APPR_REMARKS" name="APPR_REMARKS" class="AA0040010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0040010Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO_1" name="h_PUCH_PRIORITY_REF_NO_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.geth_PUCH_PRIORITY_REF_NO_1()) %>">
<script class="expj-script-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO_1">
expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO_1 = {};
expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO_1.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/h_PUCH_PRIORITY_REF_NO_1.onDecision');
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO_1.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'h_PUCH_PRIORITY_REF_NO_1', this);
  });
  expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO_1.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO_1.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/h_PUCH_PRIORITY_REF_NO_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-h_PUCH_PRIORITY_REF_NO_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0040010-AA0040010form2-h_VEND_ITEM_CD_1" name="h_VEND_ITEM_CD_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0040010Struct.geth_VEND_ITEM_CD_1()) %>">
<script class="expj-script-AA0040010-AA0040010form2-h_VEND_ITEM_CD_1">
expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD_1 = {};
expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD_1.executeAllOnDecision = function () {
  console.log('execute AA0040010form2/h_VEND_ITEM_CD_1.onDecision');
  expj.AA0040010.AA0040010form2.executeAllOnDecision();
  expj.AA0040010.executeAllOnDecision();
};
expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD_1.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010form2-h_VEND_ITEM_CD_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0040010', 'AA0040010form2', 'h_VEND_ITEM_CD_1', this);
  });
  expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD_1.executePScriptOnLoad();
};

expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD_1.executePScriptOnLoad = function () {
  console.log('execute AA0040010form2/h_VEND_ITEM_CD_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010form2-h_VEND_ITEM_CD_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0040010-AA0040010button2">
expj.AA0040010.AA0040010button2 = {};
expj.AA0040010.AA0040010button2.executeAllOnDecision = function () {
  console.log('execute AA0040010button2.onDecision');
};
expj.AA0040010.AA0040010button2.executeOnLoad = function () {
  expj.AA0040010.AA0040010button2.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button2.executePScriptOnLoad = function () {
  console.log('execute AA0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0040010-AA0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0040010-AA0040010button2-update">
expj.AA0040010.AA0040010button2.update = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0040010form1/*,_AA0040010form2/*@AA0040010Servlet,,$ZZ07003"
expj.AA0040010.AA0040010button2.update.onClick0 = function () {
  console.log('update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button2', '_AA0040010form1/*,_AA0040010form2/*', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.updateBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callConfirm('AA0040010', 'AA0040010button2', 'ZZ07003', okEvent);
};
expj.AA0040010.AA0040010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button2.update['onClick' + i])) {
        expj.AA0040010.AA0040010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button2.update.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button2.update.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button2', 'update', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button2.update.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0040010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button2-update" name="update" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0040010-AA0040010view1">
expj.AA0040010.AA0040010view1 = {};
expj.AA0040010.AA0040010view1.executeAllOnClick = function () {
};
expj.AA0040010.AA0040010view1.executeAllOnDecision = function () {
  console.log('execute AA0040010view1.onDecision');
};
expj.AA0040010.AA0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0040010view1", "expj.AA0040010.AA0040010view1.executeAllOnClick");
%>
  expj.AA0040010.AA0040010view1.executePScriptOnLoad();
};

expj.AA0040010.AA0040010view1.executePScriptOnLoad = function () {
  console.log('execute AA0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0040010-AA0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0040010view1_Id = "AA0040010view1";
 String AA0040010view1_select = "single";
 String AA0040010view1_sortable = "true";
 String AA0040010view1_resize = "true";
 String AA0040010view1_scroll = "true";
 StringBuffer AA0040010view1_HB = new StringBuffer();
 StringBuffer AA0040010view1_DB = new StringBuffer();
%>
<%
 AA0040010view1_select = "single";
 AA0040010view1_sortable = "true";
 AA0040010view1_resize = "true";
 AA0040010view1_scroll = "true";
%>
<%
 AA0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
%>
     
<%
AA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'w_MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb))).append("', 'name':'EFF_PHASE_IN_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_SIZE",rb))).append("', 'name':'PUCH_SIZE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'UNIT_COST_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'UNIT_COST_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST",rb))).append("', 'name':'PROCESSING_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST",rb))).append("', 'name':'MATERIAL_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
AA0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb))).append("', 'name':'OTHER_OVERHEADS', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AA0040010view1_sortable).append("}").append(",");
%>
<%
 int aAA0040010StructLength = aAA0040010Control.getListsize();
 final AA0040010Struct structBackup = aAA0040010Struct;
 aAA0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0040010StructLength; ++loopCount) {
  if((aAA0040010Struct = (AA0040010Struct) aAA0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0040010Struct", aAA0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0040010view1_DB.append("[");
 AA0040010view1_DB.append(loopCount);
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-w_MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-w_MODIFY_COUNT\" data-name=\"w_MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getw_MODIFY_COUNT())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-EFF_PHASE_IN_DATE-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-EFF_PHASE_IN_DATE\" data-name=\"EFF_PHASE_IN_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getEFF_PHASE_IN_DATE())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-PUCH_SIZE-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-PUCH_SIZE\" data-name=\"PUCH_SIZE\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0040010Struct.getPUCH_SIZE())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-UNIT_COST_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-UNIT_COST_NAME\" data-name=\"UNIT_COST_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getUNIT_COST_NAME())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-UNIT_COST_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-UNIT_COST_TYP\" data-name=\"UNIT_COST_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getUNIT_COST_TYP())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-UNIT_COST\" data-name=\"UNIT_COST\" data-view=\"true\" data-kind=\"").append( costColKind ).append("\">").append(TypeConverter.sanitizer(aAA0040010Struct.getUNIT_COST())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-PROCESSING_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-PROCESSING_COST\" data-name=\"PROCESSING_COST\" data-view=\"true\" data-kind=\"").append( costColKind ).append("\">").append(TypeConverter.sanitizer(aAA0040010Struct.getPROCESSING_COST())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-MATERIAL_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-MATERIAL_COST\" data-name=\"MATERIAL_COST\" data-view=\"true\" data-kind=\"").append( costColKind ).append("\">").append(TypeConverter.sanitizer(aAA0040010Struct.getMATERIAL_COST())).append("</span>'");
 AA0040010view1_DB.append(",").append("'<span id=\"expj-AA0040010-AA0040010view1-OTHER_OVERHEADS-").append(loopCount).append("\" class=\"expj-label expj-AA0040010-AA0040010view1-OTHER_OVERHEADS\" data-name=\"OTHER_OVERHEADS\" data-view=\"true\" data-kind=\"").append( costColKind ).append("\">").append(TypeConverter.sanitizer(aAA0040010Struct.getOTHER_OVERHEADS())).append("</span>'");
 AA0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0040010StructLength) {
   AA0040010view1_DB.append(",");
  }
 }
 aAA0040010Struct = structBackup;
 viewIdList.add(AA0040010view1_Id);
 viewSelectList.add(AA0040010view1_select);
 viewResizeList.add(AA0040010view1_resize);
 viewScrollList.add(AA0040010view1_scroll);
 viewHeaderDataList.add(AA0040010view1_HB);
 viewBodyDataList.add(AA0040010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:525px;"><script class="expj-script-AA0040010-AA0040010button3">
expj.AA0040010.AA0040010button3 = {};
expj.AA0040010.AA0040010button3.executeAllOnDecision = function () {
  console.log('execute AA0040010button3.onDecision');
};
expj.AA0040010.AA0040010button3.executeOnLoad = function () {
  expj.AA0040010.AA0040010button3.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button3.executePScriptOnLoad = function () {
  console.log('execute AA0040010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0040010-AA0040010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:525px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0040010-AA0040010button3-append">
expj.AA0040010.AA0040010button3.append = {};
// script1="onClick;0;CHK;_AA0040010form2/PUCH_PRIORITY_REF_NO[neq]_AA0040010form2/h_PUCH_PRIORITY_REF_NO[or]_AA0040010form2/VEND_ITEM_CD[neq]_AA0040010form2/h_VEND_ITEM_CD@$AA90005"
expj.AA0040010.AA0040010button3.append.onClick0 = function () {
  console.log('append script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/PUCH_PRIORITY_REF_NO'), '[neq]', expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/h_PUCH_PRIORITY_REF_NO')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/VEND_ITEM_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/h_VEND_ITEM_CD'))) {
expj.common.pscript.addWarningMessage('AA0040010', 'AA0040010button3', 'AA90005');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0040010form1/*,_AA0040010form2/*,_AA0040010detail1/*@AA0040010Servlet"
expj.AA0040010.AA0040010button3.append.onClick1 = function () {
  console.log('append script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button3', '_AA0040010form1/*,_AA0040010form2/*,_AA0040010detail1/*', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.changeBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0040010.AA0040010button3.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button3.append['onClick' + i])) {
        expj.AA0040010.AA0040010button3.append['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button3.append.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button3.append.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button3-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button3', 'append', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button3.append.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button3.append.executePScriptOnLoad = function () {
  console.log('execute AA0040010button3/append.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button3-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button3-append" name="append" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010button3-modify">
expj.AA0040010.AA0040010button3.modify = {};
// script1="onClick;0;CHK;_AA0040010form2/PUCH_PRIORITY_REF_NO[neq]_AA0040010form2/h_PUCH_PRIORITY_REF_NO[or]_AA0040010form2/VEND_ITEM_CD[neq]_AA0040010form2/h_VEND_ITEM_CD@$AA90005"
expj.AA0040010.AA0040010button3.modify.onClick0 = function () {
  console.log('modify script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/PUCH_PRIORITY_REF_NO'), '[neq]', expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/h_PUCH_PRIORITY_REF_NO')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/VEND_ITEM_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/h_VEND_ITEM_CD'))) {
expj.common.pscript.addWarningMessage('AA0040010', 'AA0040010button3', 'AA90005');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/+,_AA0040010detail1/*@AA0040010Servlet"
expj.AA0040010.AA0040010button3.modify.onClick1 = function () {
  console.log('modify script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button3', '_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/+,_AA0040010detail1/*', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.changeBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0040010.AA0040010button3.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button3.modify['onClick' + i])) {
        expj.AA0040010.AA0040010button3.modify['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button3.modify.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button3.modify.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button3-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button3', 'modify', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button3.modify.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button3.modify.executePScriptOnLoad = function () {
  console.log('execute AA0040010button3/modify.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button3-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button3-modify" name="modify" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010button3-copy">
expj.AA0040010.AA0040010button3.copy = {};
// script1="onClick;0;CHK;_AA0040010form2/PUCH_PRIORITY_REF_NO[neq]_AA0040010form2/h_PUCH_PRIORITY_REF_NO[or]_AA0040010form2/VEND_ITEM_CD[neq]_AA0040010form2/h_VEND_ITEM_CD@$AA90005"
expj.AA0040010.AA0040010button3.copy.onClick0 = function () {
  console.log('copy script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/PUCH_PRIORITY_REF_NO'), '[neq]', expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/h_PUCH_PRIORITY_REF_NO')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/VEND_ITEM_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AA0040010', 'AA0040010button3', '_AA0040010form2/h_VEND_ITEM_CD'))) {
expj.common.pscript.addWarningMessage('AA0040010', 'AA0040010button3', 'AA90005');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/+,_AA0040010detail1/*@AA0040010Servlet"
expj.AA0040010.AA0040010button3.copy.onClick1 = function () {
  console.log('copy script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button3', '_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/+,_AA0040010detail1/*', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.changeBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0040010.AA0040010button3.copy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button3.copy['onClick' + i])) {
        expj.AA0040010.AA0040010button3.copy['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button3.copy.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button3.copy.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button3-copy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button3', 'copy', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button3.copy.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button3.copy.executePScriptOnLoad = function () {
  console.log('execute AA0040010button3/copy.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button3-copy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button3-copy" name="copy" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010button3-erase">
expj.AA0040010.AA0040010button3.erase = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/+@AA0040010Servlet,,$ZZ07004"
expj.AA0040010.AA0040010button3.erase.onClick0 = function () {
  console.log('erase script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button3', '_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/+', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.updateBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callConfirm('AA0040010', 'AA0040010button3', 'ZZ07004', okEvent);
};
expj.AA0040010.AA0040010button3.erase.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button3.erase['onClick' + i])) {
        expj.AA0040010.AA0040010button3.erase['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button3.erase.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button3.erase.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button3-erase').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button3', 'erase', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button3.erase.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button3.erase.executePScriptOnLoad = function () {
  console.log('execute AA0040010button3/erase.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button3-erase');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button3-erase" name="erase" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010button3-deleteAll">
expj.AA0040010.AA0040010button3.deleteAll = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/*@AA0040010Servlet,,$ZZ07014"
expj.AA0040010.AA0040010button3.deleteAll.onClick0 = function () {
  console.log('deleteAll script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button3', '_AA0040010form1/*,_AA0040010form2/*,_AA0040010view1/*', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.updateBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callConfirm('AA0040010', 'AA0040010button3', 'ZZ07014', okEvent);
};
expj.AA0040010.AA0040010button3.deleteAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button3.deleteAll['onClick' + i])) {
        expj.AA0040010.AA0040010button3.deleteAll['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button3.deleteAll.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button3.deleteAll.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button3-deleteAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button3', 'deleteAll', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button3.deleteAll.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button3.deleteAll.executePScriptOnLoad = function () {
  console.log('execute AA0040010button3/deleteAll.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button3-deleteAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button3-deleteAll" name="deleteAll" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 609px);"></div><!--/td-->
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
<span class="version">AA0040010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0040010-AA0040010button0">
expj.AA0040010.AA0040010button0 = {};
expj.AA0040010.AA0040010button0.executeAllOnDecision = function () {
  console.log('execute AA0040010button0.onDecision');
};
expj.AA0040010.AA0040010button0.executeOnLoad = function () {
  expj.AA0040010.AA0040010button0.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button0.executePScriptOnLoad = function () {
  console.log('execute AA0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0040010-AA0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0040010-AA0040010button0-clear">
expj.AA0040010.AA0040010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0040010Servlet,,$ZZ07008"
expj.AA0040010.AA0040010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0040010', 'AA0040010button0', '', 'AA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0040010', response);
expj.common.updateBusinessScreenTab('AA0040010', contents);
};
expj.common.pscript.callConfirm('AA0040010', 'AA0040010button0', 'ZZ07008', okEvent);
};
expj.AA0040010.AA0040010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button0.clear['onClick' + i])) {
        expj.AA0040010.AA0040010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button0.clear.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button0.clear.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button0', 'clear', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button0.clear.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0040010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button0-clear" name="clear" class="AA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0040010-AA0040010button0-close">
expj.AA0040010.AA0040010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0040010.AA0040010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0040010');
};
expj.AA0040010.AA0040010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0040010.AA0040010button0.close['onClick' + i])) {
        expj.AA0040010.AA0040010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0040010.AA0040010button0.close.executeAllOnDecision = function () {
};
expj.AA0040010.AA0040010button0.close.executeOnLoad = function () {
  $('#expj-AA0040010-AA0040010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0040010', 'AA0040010button0', 'close', this, 'Button');
    }
  });
  expj.AA0040010.AA0040010button0.close.executePScriptOnLoad();
};

expj.AA0040010.AA0040010button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0040010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0040010-AA0040010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0040010-AA0040010button0-close" name="close" class="AA0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0040010 (END)-->
<script class="expj-script-AA0040010-AA0040010detail1">
expj.AA0040010.AA0040010detail1 = {};
expj.AA0040010.AA0040010detail1.executeAllOnDecision = function () {
  console.log('execute AA0040010detail1.onDecision');
};
expj.AA0040010.AA0040010detail1.executeOnLoad = function () {
  expj.AA0040010.AA0040010detail1.executePScriptOnLoad();
};

expj.AA0040010.AA0040010detail1.executePScriptOnLoad = function () {
  console.log('execute AA0040010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAA0040010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AA0040010-AA0040010detail1" class="expj-datagird-detail" data-float="AA0040010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AA0040010detail1";
 detailFloat = "AA0040010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AA0040010detail1_Id = "AA0040010detail1";
 String AA0040010detail1_select = "single";
 String AA0040010detail1_sortable = "true";
 String AA0040010detail1_resize = "true";
 String AA0040010detail1_scroll = "true";
 StringBuffer AA0040010detail1_HB = new StringBuffer();
 StringBuffer AA0040010detail1_DB = new StringBuffer();
%>
<%
 AA0040010detail1_sortable = "false";
 AA0040010detail1_select = "none";
%>
<% AA0040010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AA0040010detail1_sortable).append("}").append(","); %>
<%  AA0040010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AA0040010detail1_sortable).append("}").append(",");
AA0040010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AA0040010detail1_sortable).append("}").append(",");
AA0040010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AA0040010detail1_sortable).append("}").append(",");
 %>
  <% AA0040010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AA0040010-AA0040010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0040010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AA0040010-AA0040010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0040010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AA0040010-AA0040010detail1-w_MRP_ODR_NAME\" class=\"expj-label\" data-name=\"w_MRP_ODR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getw_MRP_ODR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0040010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AA0040010-AA0040010detail1-w_OUTSIDE_NAME\" class=\"expj-label\" data-name=\"w_OUTSIDE_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getw_OUTSIDE_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0040010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.STOCK_UNIT",rb)).append("','").append("<span id=\"expj-AA0040010-AA0040010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0040010Struct.getSTOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AA0040010detail1_Id;
 detailViewSelect = AA0040010detail1_select;
 detailViewResize = AA0040010detail1_resize;
 detailViewScroll = AA0040010detail1_scroll;
 detailViewHeaderData = AA0040010detail1_HB;
 detailViewBodyData = AA0040010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAA0040010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0040010)) {
  expj.common.treeInstanceMap.AA0040010 = {};
}
expj.common.treeInstanceMap.AA0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0040010)) {
  expj.common.detailDialogMap.AA0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0040010)) {
  expj.common.viewInstanceMap.AA0040010 = {};
}
expj.common.viewInstanceMap.AA0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0040010.<%=viewId %>.init = function () {
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
    expj.AA0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0040010_init">
/**
 * AA0040010用のロード完了時初期化関数
 */
expj.AA0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0040010');
  expj.common.calendarInstanceMap.AA0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0040010.AA0040010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.SPEC.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.VEND_ANAME.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.ROUND_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.h_APR_PUCH_UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.DECIMAL_FIG.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.PUCH_PRIORITY_REF_NO.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.VEND_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.w_MODIFY_COUNT_H.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.h_PUCH_PRIORITY_REF_NO_1.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.h_VEND_ITEM_CD_1.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button3.append.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button3.modify.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button3.copy.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button3.erase.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button3.deleteAll.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form1.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button1.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010form2.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button2.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010view1.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button3.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010button0.executeOnLoad();}catch(e){};
  try{expj.AA0040010.AA0040010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0040010', 'AA0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0040010', '<%=request.getContextPath() %>');
};

/**
 * AA0040010の全体onDecision処理
 */
expj.AA0040010.executeAllOnDecision = function () {
  expj.AA0040010.AA0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0040010_console">
expj.AA0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>