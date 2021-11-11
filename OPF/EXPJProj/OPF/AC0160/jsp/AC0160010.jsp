<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:29:45 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0160\AC0160010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0160.*" %>
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
<jsp:useBean id="aAC0160010Control" class="com.nec.jp.orteus.metamorBase.AC0160.AC0160010Control" scope="request"/>
<jsp:useBean id="aAC0160010Struct" class="com.nec.jp.orteus.metamorBase.AC0160.AC0160010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

所要量CSV出力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0160/jsp/AC0160010.jsp,v $
$Author: geng-jia $	
$Revision: 1.7 $　$Date: 2017/02/22 02:04:36 $
********************************************************* --%>
<html>
<head>
<title>所要量CSV出力</title>
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
<script class="expj-script-AC0160010_init">
  // AC0160010名前空間
  expj.AC0160010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-AC0160010" data-screen="AC0160010" data-newdata="<%=aAC0160010Control.isNewData() %>">
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
			  <script class="expj-script-AC0160010-AC0160010form1">
expj.AC0160010.AC0160010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.AC0160010.AC0160010form1.onLoad0 = function () {
  console.log('AC0160010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHK;_r1_FILTER1[eq]true@*0,*1"
expj.AC0160010.AC0160010form1.onDecision0 = function () {
  console.log('AC0160010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '_r1_FILTER1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;CHKRQ;A,B@*2,*3"
expj.AC0160010.AC0160010form1.child0 = function () {
  console.log('AC0160010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AC0160010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AC0160010', 'B')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHKRQ;C,D@*2,*3"
expj.AC0160010.AC0160010form1.child1 = function () {
  console.log('AC0160010form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('AC0160010', 'C') && expj.common.pscript.satisfiedRequiredComponent('AC0160010', 'D')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_AC0160010button1/Select"
expj.AC0160010.AC0160010form1.child2 = function () {
  console.log('AC0160010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_AC0160010button1/Select');
};
// script6="child;3;MASK;_AC0160010button1/Select"
expj.AC0160010.AC0160010form1.child3 = function () {
  console.log('AC0160010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_AC0160010button1/Select');
};
// script11="onDecision;1;CHK;_r1_FILTER1[eq]true@*4,*6"
expj.AC0160010.AC0160010form1.onDecision1 = function () {
  console.log('AC0160010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '_r1_FILTER1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script12="child;4;UNMASK;_IN_PRD_START_DATE_FROM,_CalendarPrdStartDateFrom,_IN_PRD_START_DATE_TO,_CalendarPrdStartDateTo@*5"
expj.AC0160010.AC0160010form1.child4 = function () {
  console.log('AC0160010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_START_DATE_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdStartDateFrom');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_START_DATE_TO');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdStartDateTo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script13="child;5;MASK;_IN_PRD_DUE_DATE_FROM,_CalendarPrdDueDateFrom,_IN_PRD_DUE_DATE_TO,_CalendarPrdDueDateTo"
expj.AC0160010.AC0160010form1.child5 = function () {
  console.log('AC0160010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_DUE_DATE_FROM');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdDueDateFrom');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_DUE_DATE_TO');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdDueDateTo');
};
// script14="child;6;UNMASK;_IN_PRD_DUE_DATE_FROM,_CalendarPrdDueDateFrom,_IN_PRD_DUE_DATE_TO,_CalendarPrdDueDateTo@*7"
expj.AC0160010.AC0160010form1.child6 = function () {
  console.log('AC0160010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_DUE_DATE_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdDueDateFrom');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_DUE_DATE_TO');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdDueDateTo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script15="child;7;MASK;_IN_PRD_START_DATE_FROM,_CalendarPrdStartDateFrom,_IN_PRD_START_DATE_TO,_CalendarPrdStartDateTo"
expj.AC0160010.AC0160010form1.child7 = function () {
  console.log('AC0160010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_START_DATE_FROM');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdStartDateFrom');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_PRD_START_DATE_TO');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_CalendarPrdStartDateTo');
};
// script16="onDecision;2;CHK;_r1_FILTER2[eq]true@*8,*9"
expj.AC0160010.AC0160010form1.onDecision2 = function () {
  console.log('AC0160010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '_r1_FILTER2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script17="child;8;UNMASK;_IN_WS_CD,_PeekerWsCd"
expj.AC0160010.AC0160010form1.child8 = function () {
  console.log('AC0160010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_WS_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_PeekerWsCd');
};
// script18="child;9;MASK;_IN_WS_CD,_PeekerWsCd,_IN_WS_NAME"
expj.AC0160010.AC0160010form1.child9 = function () {
  console.log('AC0160010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_PeekerWsCd');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_IN_WS_NAME');
};
// script19="onDecision;3;CHK;?AC0160010form1/*[eq]NORMAL@*10,*12"
expj.AC0160010.AC0160010form1.onDecision3 = function () {
  console.log('AC0160010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?AC0160010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script20="child;10;CHK;?r1_FILTER2[eq]SAME[and]?r2_FILTER2[eq]SAME[and]?IN_ITEM_CD[eq]SAME[and]?IN_WS_CD[eq]SAME[and]?IN_PRD_START_DATE_FROM[eq]SAME[and]?IN_PRD_START_DATE_TO[eq]SAME[and]?r1_FILTER1[eq]SAME[and]?IN_PRD_DUE_DATE_FROM[eq]SAME[and]?IN_PRD_DUE_DATE_TO[eq]SAME[and]?r2_FILTER1[eq]SAME[and]?w_OD_TYP[eq]SAME[and]?PRODUCT_TYP[eq]SAME[and]?c1_ODR_STS_TYP[eq]SAME[and]?c2_ODR_STS_TYP[eq]SAME[and]?c3_ODR_STS_TYP[eq]SAME@*11,*12"
expj.AC0160010.AC0160010form1.child10 = function () {
  console.log('AC0160010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?r1_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?r2_FILTER2'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?IN_ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?IN_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?IN_PRD_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?IN_PRD_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?r1_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?IN_PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?IN_PRD_DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?r2_FILTER1'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?w_OD_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?PRODUCT_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?c1_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?c2_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '?c3_ODR_STS_TYP'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script21="child;11;UNMASK;_AC0160010button0/CsvOut"
expj.AC0160010.AC0160010form1.child11 = function () {
  console.log('AC0160010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_AC0160010button0/CsvOut');
};
// script22="child;12;MASK;_AC0160010button0/CsvOut"
expj.AC0160010.AC0160010form1.child12 = function () {
  console.log('AC0160010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AC0160010', 'AC0160010form1', '_AC0160010button0/CsvOut');
};
// script23="onDecision;4;CHK;_r2_FILTER2[eq]true@*13"
expj.AC0160010.AC0160010form1.onDecision4 = function () {
  console.log('AC0160010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '_r2_FILTER2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script24="child;13;SET;_AC0160010form1/IN_WS_CD=@*14"
expj.AC0160010.AC0160010form1.child13 = function () {
  console.log('AC0160010form1 script24');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_AC0160010form1/IN_WS_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script25="child;14;SET;_AC0160010form1/IN_WS_NAME="
expj.AC0160010.AC0160010form1.child14 = function () {
  console.log('AC0160010form1 script25');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_AC0160010form1/IN_WS_NAME', '');
};
expj.AC0160010.AC0160010form1.executeAllOnDecision = function () {
  console.log('execute AC0160010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1['onDecision' + i])) {
        expj.AC0160010.AC0160010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.executeOnLoad = function () {
  expj.AC0160010.AC0160010form1.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1['onLoad' + i])) {
      expj.AC0160010.AC0160010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0160010-AC0160010form1" action="AC0160010Servlet" name="AC0160010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAC0160010Control.getReadStatusString()) %>" style="height:188px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:188px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:117px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-r1_FILTER2">
expj.AC0160010.AC0160010form1.r1_FILTER2 = {};
// script1="onClick;0;SET;_AC0160010form1/TXT_FILE=1"
expj.AC0160010.AC0160010form1.r1_FILTER2.onClick0 = function () {
  console.log('r1_FILTER2 script1');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_AC0160010form1/TXT_FILE', '1');
};
expj.AC0160010.AC0160010form1.r1_FILTER2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.r1_FILTER2['onClick' + i])) {
        expj.AC0160010.AC0160010form1.r1_FILTER2['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.r1_FILTER2.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/r1_FILTER2.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.r1_FILTER2.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-r1_FILTER2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'r1_FILTER2', this, 'RadioButton');
    }
  });
  expj.AC0160010.AC0160010form1.r1_FILTER2.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.r1_FILTER2.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/r1_FILTER2.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-r1_FILTER2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER2" data-name="r1_FILTER2" value="true" <%= ("true".equals(TypeConverter.convert(aAC0160010Struct.getr1_FILTER2())))?"checked=\"checked\"":"" %> class="" id="expj-AC0160010-AC0160010form1-r1_FILTER2" ><label for="expj-AC0160010-AC0160010form1-r1_FILTER2"><%=CoreTools.getRBString("Expj.Cmt0220",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-r2_FILTER2">
expj.AC0160010.AC0160010form1.r2_FILTER2 = {};
// script1="onClick;0;SET;_AC0160010form1/TXT_FILE=2"
expj.AC0160010.AC0160010form1.r2_FILTER2.onClick0 = function () {
  console.log('r2_FILTER2 script1');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_AC0160010form1/TXT_FILE', '2');
};
expj.AC0160010.AC0160010form1.r2_FILTER2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.r2_FILTER2['onClick' + i])) {
        expj.AC0160010.AC0160010form1.r2_FILTER2['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.r2_FILTER2.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/r2_FILTER2.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.r2_FILTER2.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-r2_FILTER2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'r2_FILTER2', this, 'RadioButton');
    }
  });
  expj.AC0160010.AC0160010form1.r2_FILTER2.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.r2_FILTER2.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/r2_FILTER2.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-r2_FILTER2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="FILTER2" data-name="r2_FILTER2" value="true" <%= ("true".equals(TypeConverter.convert(aAC0160010Struct.getr2_FILTER2())))?"checked=\"checked\"":"" %> class="" id="expj-AC0160010-AC0160010form1-r2_FILTER2" ><label for="expj-AC0160010-AC0160010form1-r2_FILTER2"><%=CoreTools.getRBString("Expj.Cmt0218",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AC0160010-AC0160010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AC0160010-AC0160010form1-DOWNLOAD_FILE">
expj.AC0160010.AC0160010form1.DOWNLOAD_FILE = {};
expj.AC0160010.AC0160010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/DOWNLOAD_FILE.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AC0160010.AC0160010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:117px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_ITEM_CD">
expj.AC0160010.AC0160010form1.IN_ITEM_CD = {};
expj.AC0160010.AC0160010form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_ITEM_CD.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_ITEM_CD', this);
  });
  expj.AC0160010.AC0160010form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_ITEM_CD" name="IN_ITEM_CD" class="AC0160010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-PeekerItemCd">
expj.AC0160010.AC0160010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AC0160010form1/IN_ITEM_CD@<%=contextNo%>"
expj.AC0160010.AC0160010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0160010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '_AC0160010form1/IN_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '_AC0160010form1/TXT_FILE') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_13%&%';
parameterValues += 'TARGET_FIELD%=%_AC0160010form1/IN_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0160010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0160010.AC0160010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.PeekerItemCd['onClick' + i])) {
        expj.AC0160010.AC0160010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AC0160010.AC0160010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0160010-AC0160010form1-PeekerItemCd" class="AC0160010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_ITEM_NAME">
expj.AC0160010.AC0160010form1.IN_ITEM_NAME = {};
expj.AC0160010.AC0160010form1.IN_ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_ITEM_NAME.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_ITEM_NAME.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_ITEM_NAME', this);
  });
  expj.AC0160010.AC0160010form1.IN_ITEM_NAME.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:437px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_ITEM_NAME" name="IN_ITEM_NAME" class="AC0160010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_ITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AC0160010-AC0160010form1-TXT_FILE" name="TXT_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getTXT_FILE()) %>">
<script class="expj-script-AC0160010-AC0160010form1-TXT_FILE">
expj.AC0160010.AC0160010form1.TXT_FILE = {};
expj.AC0160010.AC0160010form1.TXT_FILE.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/TXT_FILE.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.TXT_FILE.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-TXT_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'TXT_FILE', this);
  });
  expj.AC0160010.AC0160010form1.TXT_FILE.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.TXT_FILE.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/TXT_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-TXT_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_WS_CD">
expj.AC0160010.AC0160010form1.IN_WS_CD = {};
expj.AC0160010.AC0160010form1.IN_WS_CD.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_WS_CD.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_WS_CD.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_WS_CD', this);
  });
  expj.AC0160010.AC0160010form1.IN_WS_CD.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_WS_CD.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_WS_CD" name="IN_WS_CD" class="AC0160010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_WS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-PeekerWsCd">
expj.AC0160010.AC0160010form1.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AC0160010form1/IN_WS_CD@<%=contextNo%>"
expj.AC0160010.AC0160010form1.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0160010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AC0160010', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAC0160010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010form1', '_AC0160010form1/IN_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AC0160010form1/IN_WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0160010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0160010.AC0160010form1.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.PeekerWsCd['onClick' + i])) {
        expj.AC0160010.AC0160010form1.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010form1.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AC0160010.AC0160010form1.PeekerWsCd.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0160010-AC0160010form1-PeekerWsCd" class="AC0160010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_WS_NAME">
expj.AC0160010.AC0160010form1.IN_WS_NAME = {};
expj.AC0160010.AC0160010form1.IN_WS_NAME.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_WS_NAME.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_WS_NAME.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_WS_NAME', this);
  });
  expj.AC0160010.AC0160010form1.IN_WS_NAME.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:437px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_WS_NAME" name="IN_WS_NAME" class="AC0160010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_WS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PRD_PUCH_START_DATE",rb)%></span><!-- 製造着手日/発注予定日 --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_PRD_START_DATE_FROM">
expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_FROM = {};
expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_PRD_START_DATE_FROM.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_PRD_START_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_PRD_START_DATE_FROM', this);
  });
  expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_FROM.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_PRD_START_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_PRD_START_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_PRD_START_DATE_FROM" name="IN_PRD_START_DATE_FROM" class="AC0160010-focus-move  required-value expj-AC0160010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_PRD_START_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-CalendarPrdStartDateFrom">
expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom = {};
// script1="onClick;0;CALENDAR;_AC0160010form1/IN_PRD_START_DATE_FROM@<%=contextNo%>"
expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom.onClick0 = function () {
  console.log('CalendarPrdStartDateFrom script1');
expj.common.pscript.executeCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_START_DATE_FROM');
};
expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom['onClick' + i])) {
        expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-CalendarPrdStartDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'CalendarPrdStartDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_START_DATE_FROM');
  expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/CalendarPrdStartDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-CalendarPrdStartDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0160010-AC0160010form1-CalendarPrdStartDateFrom" class="AC0160010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_PRD_START_DATE_TO">
expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_TO = {};
expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_PRD_START_DATE_TO.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_PRD_START_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_PRD_START_DATE_TO', this);
  });
  expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_TO.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_PRD_START_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_PRD_START_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_PRD_START_DATE_TO" name="IN_PRD_START_DATE_TO" class="AC0160010-focus-move  required-value expj-AC0160010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_PRD_START_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-CalendarPrdStartDateTo">
expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo = {};
// script1="onClick;0;CALENDAR;_AC0160010form1/IN_PRD_START_DATE_TO@<%=contextNo%>"
expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo.onClick0 = function () {
  console.log('CalendarPrdStartDateTo script1');
expj.common.pscript.executeCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_START_DATE_TO');
};
expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo['onClick' + i])) {
        expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-CalendarPrdStartDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'CalendarPrdStartDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_START_DATE_TO');
  expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/CalendarPrdStartDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-CalendarPrdStartDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:117px;text-align:left;"><button type="button" id="expj-AC0160010-AC0160010form1-CalendarPrdStartDateTo" class="AC0160010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-r1_FILTER1">
expj.AC0160010.AC0160010form1.r1_FILTER1 = {};
// script1="onClick;0;SET;_IN_PRD_DUE_DATE_FROM="
expj.AC0160010.AC0160010form1.r1_FILTER1.onClick0 = function () {
  console.log('r1_FILTER1 script1');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_IN_PRD_DUE_DATE_FROM', '');
};
// script2="onClick;1;SET;_IN_PRD_DUE_DATE_TO="
expj.AC0160010.AC0160010form1.r1_FILTER1.onClick1 = function () {
  console.log('r1_FILTER1 script2');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_IN_PRD_DUE_DATE_TO', '');
};
expj.AC0160010.AC0160010form1.r1_FILTER1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.r1_FILTER1['onClick' + i])) {
        expj.AC0160010.AC0160010form1.r1_FILTER1['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.r1_FILTER1.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/r1_FILTER1.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.r1_FILTER1.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-r1_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'r1_FILTER1', this, 'RadioButton');
    }
  });
  expj.AC0160010.AC0160010form1.r1_FILTER1.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.r1_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/r1_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-r1_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="FILTER1" data-name="r1_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAC0160010Struct.getr1_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-AC0160010-AC0160010form1-r1_FILTER1" ><label for="expj-AC0160010-AC0160010form1-r1_FILTER1"><%=CoreTools.getRBString("Expj.Cmt6683_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PRD_PUCH_DUE_DATE",rb)%></span><!-- 製造納期/発注納期 --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_FROM">
expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_FROM = {};
expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_PRD_DUE_DATE_FROM.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_FROM.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_PRD_DUE_DATE_FROM', this);
  });
  expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_FROM.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_PRD_DUE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_FROM" name="IN_PRD_DUE_DATE_FROM" class="AC0160010-focus-move  required-value expj-AC0160010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_PRD_DUE_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-CalendarPrdDueDateFrom">
expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom = {};
// script1="onClick;0;CALENDAR;_AC0160010form1/IN_PRD_DUE_DATE_FROM@<%=contextNo%>"
expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom.onClick0 = function () {
  console.log('CalendarPrdDueDateFrom script1');
expj.common.pscript.executeCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_DUE_DATE_FROM');
};
expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom['onClick' + i])) {
        expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-CalendarPrdDueDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'CalendarPrdDueDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_DUE_DATE_FROM');
  expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/CalendarPrdDueDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-CalendarPrdDueDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0160010-AC0160010form1-CalendarPrdDueDateFrom" class="AC0160010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_TO">
expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_TO = {};
expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/IN_PRD_DUE_DATE_TO.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_TO.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0160010', 'AC0160010form1', 'IN_PRD_DUE_DATE_TO', this);
  });
  expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_TO.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/IN_PRD_DUE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0160010-AC0160010form1-IN_PRD_DUE_DATE_TO" name="IN_PRD_DUE_DATE_TO" class="AC0160010-focus-move  required-value expj-AC0160010-required-D" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0160010Struct.getIN_PRD_DUE_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-CalendarPrdDueDateTo">
expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo = {};
// script1="onClick;0;CALENDAR;_AC0160010form1/IN_PRD_DUE_DATE_TO@<%=contextNo%>"
expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo.onClick0 = function () {
  console.log('CalendarPrdDueDateTo script1');
expj.common.pscript.executeCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_DUE_DATE_TO');
};
expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo['onClick' + i])) {
        expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-CalendarPrdDueDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'CalendarPrdDueDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0160010','AC0160010form1','_AC0160010form1/IN_PRD_DUE_DATE_TO');
  expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/CalendarPrdDueDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-CalendarPrdDueDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:117px;text-align:left;"><button type="button" id="expj-AC0160010-AC0160010form1-CalendarPrdDueDateTo" class="AC0160010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-r2_FILTER1">
expj.AC0160010.AC0160010form1.r2_FILTER1 = {};
// script1="onClick;0;SET;_IN_PRD_START_DATE_FROM="
expj.AC0160010.AC0160010form1.r2_FILTER1.onClick0 = function () {
  console.log('r2_FILTER1 script1');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_IN_PRD_START_DATE_FROM', '');
};
// script2="onClick;1;SET;_IN_PRD_START_DATE_TO="
expj.AC0160010.AC0160010form1.r2_FILTER1.onClick1 = function () {
  console.log('r2_FILTER1 script2');
expj.common.pscript.setReferenceComponentValue('AC0160010', 'AC0160010form1', '_IN_PRD_START_DATE_TO', '');
};
expj.AC0160010.AC0160010form1.r2_FILTER1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010form1.r2_FILTER1['onClick' + i])) {
        expj.AC0160010.AC0160010form1.r2_FILTER1['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010form1.r2_FILTER1.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/r2_FILTER1.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.r2_FILTER1.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-r2_FILTER1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'r2_FILTER1', this, 'RadioButton');
    }
  });
  expj.AC0160010.AC0160010form1.r2_FILTER1.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.r2_FILTER1.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/r2_FILTER1.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-r2_FILTER1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="FILTER1" data-name="r2_FILTER1" value="true" <%= ("true".equals(TypeConverter.convert(aAC0160010Struct.getr2_FILTER1())))?"checked=\"checked\"":"" %> class="" id="expj-AC0160010-AC0160010form1-r2_FILTER1" ><label for="expj-AC0160010-AC0160010form1-r2_FILTER1"><%=CoreTools.getRBString("Expj.Cmt6684",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OD_TYP",rb)%></span><!-- オーダデマンド区分 --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-w_OD_TYP">
expj.AC0160010.AC0160010form1.w_OD_TYP = {};
expj.AC0160010.AC0160010form1.w_OD_TYP.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/w_OD_TYP.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.w_OD_TYP.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-w_OD_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AC0160010', 'AC0160010form1', 'w_OD_TYP', this);
  });
  expj.AC0160010.AC0160010form1.w_OD_TYP.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.w_OD_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/w_OD_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-w_OD_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AC0160010-AC0160010form1-w_OD_TYP" name='w_OD_TYP' class='AC0160010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAC0160010Control.getStruct().getList_w_OD_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAC0160010Control.getStruct().getList_w_OD_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAC0160010Control.getStruct().getList_w_OD_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAC0160010Struct.getw_OD_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:117px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRODUCT_TYP",rb)%></span><!-- 製品区分 --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-PRODUCT_TYP">
expj.AC0160010.AC0160010form1.PRODUCT_TYP = {};
expj.AC0160010.AC0160010form1.PRODUCT_TYP.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/PRODUCT_TYP.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.PRODUCT_TYP.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-PRODUCT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AC0160010', 'AC0160010form1', 'PRODUCT_TYP', this);
  });
  expj.AC0160010.AC0160010form1.PRODUCT_TYP.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.PRODUCT_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/PRODUCT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-PRODUCT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AC0160010-AC0160010form1-PRODUCT_TYP" name='PRODUCT_TYP' class='AC0160010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAC0160010Control.getStruct().getList_PRODUCT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAC0160010Control.getStruct().getList_PRODUCT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAC0160010Control.getStruct().getList_PRODUCT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAC0160010Struct.getPRODUCT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:117px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_STS_TYP",rb)%></span><!-- 状態区分 --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-c1_ODR_STS_TYP">
expj.AC0160010.AC0160010form1.c1_ODR_STS_TYP = {};
expj.AC0160010.AC0160010form1.c1_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/c1_ODR_STS_TYP.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.c1_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-c1_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'c1_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AC0160010.AC0160010form1.c1_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.c1_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/c1_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-c1_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c1_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0160010Struct.getc1_ODR_STS_TYP())) || "".equals(TypeConverter.convert(aAC0160010Struct.getc1_ODR_STS_TYP())))?"checked=\"checked\"": "" %> class="AC0160010-focus-move" id="expj-AC0160010-AC0160010form1-c1_ODR_STS_TYP"><label for="expj-AC0160010-AC0160010form1-c1_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0440",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-c2_ODR_STS_TYP">
expj.AC0160010.AC0160010form1.c2_ODR_STS_TYP = {};
expj.AC0160010.AC0160010form1.c2_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/c2_ODR_STS_TYP.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.c2_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-c2_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'c2_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AC0160010.AC0160010form1.c2_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.c2_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/c2_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-c2_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c2_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0160010Struct.getc2_ODR_STS_TYP())) || "1".equals(TypeConverter.convert(aAC0160010Struct.getc2_ODR_STS_TYP())))?"checked=\"checked\"":"" %>  class="AC0160010-focus-move" id="expj-AC0160010-AC0160010form1-c2_ODR_STS_TYP"><label for="expj-AC0160010-AC0160010form1-c2_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0441",rb)%></label></div><!--/td-->
<div class="div-td" style="width:117px;"></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010form1-c3_ODR_STS_TYP">
expj.AC0160010.AC0160010form1.c3_ODR_STS_TYP = {};
expj.AC0160010.AC0160010form1.c3_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0160010form1/c3_ODR_STS_TYP.onDecision');
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
  expj.AC0160010.executeAllOnDecision();
};
expj.AC0160010.AC0160010form1.c3_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010form1-c3_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010form1', 'c3_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AC0160010.AC0160010form1.c3_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0160010.AC0160010form1.c3_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0160010form1/c3_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010form1-c3_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c3_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAC0160010Struct.getc3_ODR_STS_TYP())) || "1".equals(TypeConverter.convert(aAC0160010Struct.getc3_ODR_STS_TYP())))?"checked=\"checked\"":"" %>  class="AC0160010-focus-move" id="expj-AC0160010-AC0160010form1-c3_ODR_STS_TYP"><label for="expj-AC0160010-AC0160010form1-c3_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt3177",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AC0160010-AC0160010button1">
expj.AC0160010.AC0160010button1 = {};
expj.AC0160010.AC0160010button1.executeAllOnDecision = function () {
  console.log('execute AC0160010button1.onDecision');
};
expj.AC0160010.AC0160010button1.executeOnLoad = function () {
  expj.AC0160010.AC0160010button1.executePScriptOnLoad();
};

expj.AC0160010.AC0160010button1.executePScriptOnLoad = function () {
  console.log('execute AC0160010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0160010-AC0160010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:106px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0160010-AC0160010button1-Select">
expj.AC0160010.AC0160010button1.Select = {};
// script1="onClick;1;CHK;_AC0160010form1/IN_PRD_START_DATE_FROM[neq][and]_AC0160010form1/IN_PRD_START_DATE_TO[neq][and]_AC0160010form1/IN_PRD_START_DATE_TO[lt]_AC0160010form1/IN_PRD_START_DATE_FROM@!ZZ05101"
expj.AC0160010.AC0160010button1.Select.onClick1 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_START_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_START_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_START_DATE_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_START_DATE_FROM')))) {
expj.common.pscript.viewErrorMessage('AC0160010', 'AC0160010button1', 'ZZ05101');
}
};
// script2="onClick;2;CHK;_AC0160010form1/IN_PRD_DUE_DATE_FROM[neq][and]_AC0160010form1/IN_PRD_DUE_DATE_TO[neq][and]_AC0160010form1/IN_PRD_DUE_DATE_TO[lt]_AC0160010form1/IN_PRD_DUE_DATE_FROM@!ZZ05101"
expj.AC0160010.AC0160010button1.Select.onClick2 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_DUE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_DUE_DATE_TO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_DUE_DATE_TO')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/IN_PRD_DUE_DATE_FROM')))) {
expj.common.pscript.viewErrorMessage('AC0160010', 'AC0160010button1', 'ZZ05101');
}
};
// script3="onClick;3;CHK;_AC0160010form1/c1_ODR_STS_TYP[neq]true[and]_AC0160010form1/c2_ODR_STS_TYP[neq]true[and]_AC0160010form1/c3_ODR_STS_TYP[neq]true@!AC00254"
expj.AC0160010.AC0160010button1.Select.onClick3 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/c1_ODR_STS_TYP'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/c2_ODR_STS_TYP'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0160010', 'AC0160010button1', '_AC0160010form1/c3_ODR_STS_TYP'), '[neq]', 'true')) {
expj.common.pscript.viewErrorMessage('AC0160010', 'AC0160010button1', 'AC00254');
}
};
// script4="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0160010form1/*@AC0160010Servlet"
expj.AC0160010.AC0160010button1.Select.onClick4 = function () {
  console.log('Select script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0160010', 'AC0160010button1', '_AC0160010form1/*', 'AC0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0160010', response);
expj.common.updateBusinessScreenTab('AC0160010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AC0160010.AC0160010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010button1.Select['onClick' + i])) {
        expj.AC0160010.AC0160010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010button1.Select.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010button1.Select.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010button1', 'Select', this, 'Button');
    }
  });
  expj.AC0160010.AC0160010button1.Select.executePScriptOnLoad();
};

expj.AC0160010.AC0160010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AC0160010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0160010-AC0160010button1-Select" name="Select" class="AC0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<%
     if(aAC0160010Control.getListsize() > 0) {
		 aAC0160010Struct = (AC0160010Struct)aAC0160010Control.getListvalue(0);
     }
%><div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AC0160010-AC0160010view1">
expj.AC0160010.AC0160010view1 = {};
expj.AC0160010.AC0160010view1.executeAllOnClick = function () {
};
expj.AC0160010.AC0160010view1.executeAllOnDecision = function () {
  console.log('execute AC0160010view1.onDecision');
};
expj.AC0160010.AC0160010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AC0160010view1", "expj.AC0160010.AC0160010view1.executeAllOnClick");
%>
  expj.AC0160010.AC0160010view1.executePScriptOnLoad();
};

expj.AC0160010.AC0160010view1.executePScriptOnLoad = function () {
  console.log('execute AC0160010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AC0160010-AC0160010view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AC0160010view1_Id = "AC0160010view1";
 String AC0160010view1_select = "single";
 String AC0160010view1_sortable = "true";
 String AC0160010view1_resize = "true";
 String AC0160010view1_scroll = "true";
 StringBuffer AC0160010view1_HB = new StringBuffer();
 StringBuffer AC0160010view1_DB = new StringBuffer();
%>
<%
 AC0160010view1_select = "none";
 AC0160010view1_sortable = "true";
 AC0160010view1_resize = "true";
 AC0160010view1_scroll = "true";
%>
<%
 AC0160010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
%>
     
<%
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_PUCH_DUE_DATE",rb))).append("', 'name':'PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_PUCH_START_DATE",rb))).append("', 'name':'PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_PUCH_ODR_QTY",rb))).append("', 'name':'OPR_INST_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_VEND_CD",rb))).append("', 'name':'WS_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEALINGS_ANS_DATE",rb))).append("', 'name':'CONFIRM_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REC_PLA",rb))).append("', 'name':'WH_CD_2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.REMARKS",rb))).append("', 'name':'REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_FLG",rb))).append("', 'name':'NON_NO_ITEM_FLG', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_NAME",rb))).append("', 'name':'NON_NO_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_TYP",rb))).append("', 'name':'NON_NO_ITEM_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NON_NO_ITEM_PUCH_ODR_UNIT",rb))).append("', 'name':'NON_NO_ITEM_PUCH_ODR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_TYP",rb))).append("', 'name':'UNIT_COST_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST",rb))).append("', 'name':'PROCESSING_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST",rb))).append("', 'name':'MATERIAL_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb))).append("', 'name':'OTHER_OVERHEADS', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.NET_AMOUNT",rb))).append("', 'name':'NET_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_NAME",rb))).append("', 'name':'CUR_NAME', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'90px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MON_EXCH_RATE",rb))).append("', 'name':'EXCH_RATE', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
AC0160010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AC0160010view1_sortable).append("}").append(",");
%>
<%
 int aAC0160010StructLength = aAC0160010Control.getListsize();
 final AC0160010Struct structBackup = aAC0160010Struct;
 aAC0160010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAC0160010StructLength; ++loopCount) {
  if((aAC0160010Struct = (AC0160010Struct) aAC0160010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAC0160010Struct", aAC0160010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AC0160010view1_DB.append("[");
 AC0160010view1_DB.append(loopCount);
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-ITEM_CD\" data-name=\"ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getITEM_CD())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-ITEM_NAME\" data-name=\"ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getITEM_NAME())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-PRD_DUE_DATE\" data-name=\"PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getPRD_DUE_DATE())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-PRD_START_DATE\" data-name=\"PRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getPRD_START_DATE())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-OPR_INST_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-OPR_INST_PUCH_ODR_QTY\" data-name=\"OPR_INST_PUCH_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getOPR_INST_PUCH_ODR_QTY())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-WS_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-WS_VEND_CD\" data-name=\"WS_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getWS_VEND_CD())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getJOB_ODR_CD())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-CONFIRM_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-CONFIRM_DLV_DATE\" data-name=\"CONFIRM_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getCONFIRM_DLV_DATE())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-WH_CD_2-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-WH_CD_2\" data-name=\"WH_CD_2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getWH_CD_2())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-REMARKS-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-REMARKS\" data-name=\"REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getREMARKS())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-NON_NO_ITEM_FLG-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-NON_NO_ITEM_FLG\" data-name=\"NON_NO_ITEM_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getNON_NO_ITEM_FLG())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-NON_NO_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-NON_NO_ITEM_NAME\" data-name=\"NON_NO_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getNON_NO_ITEM_NAME())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-NON_NO_ITEM_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-NON_NO_ITEM_TYP\" data-name=\"NON_NO_ITEM_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getNON_NO_ITEM_TYP())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-NON_NO_ITEM_PUCH_ODR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-NON_NO_ITEM_PUCH_ODR_UNIT\" data-name=\"NON_NO_ITEM_PUCH_ODR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getNON_NO_ITEM_PUCH_ODR_UNIT())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-UNIT_COST_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-UNIT_COST_TYP\" data-name=\"UNIT_COST_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getUNIT_COST_TYP())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-UNIT_COST\" data-name=\"UNIT_COST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getUNIT_COST())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-PROCESSING_COST-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-PROCESSING_COST\" data-name=\"PROCESSING_COST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getPROCESSING_COST())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-MATERIAL_COST-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-MATERIAL_COST\" data-name=\"MATERIAL_COST\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getMATERIAL_COST())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-OTHER_OVERHEADS-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-OTHER_OVERHEADS\" data-name=\"OTHER_OVERHEADS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getOTHER_OVERHEADS())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-NET_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-NET_AMOUNT\" data-name=\"NET_AMOUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getNET_AMOUNT())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-CUR_NAME-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-CUR_NAME\" data-name=\"CUR_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getCUR_NAME())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-EXCH_RATE-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-EXCH_RATE\" data-name=\"EXCH_RATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.getEXCH_RATE())).append("</span>'");
 AC0160010view1_DB.append(",").append("'<span id=\"expj-AC0160010-AC0160010view1-h_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AC0160010-AC0160010view1-h_ODR_STS_TYP\" data-name=\"h_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAC0160010Struct.geth_ODR_STS_TYP())).append("</span>'");
 AC0160010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAC0160010StructLength) {
   AC0160010view1_DB.append(",");
  }
 }
 aAC0160010Struct = structBackup;
 viewIdList.add(AC0160010view1_Id);
 viewSelectList.add(AC0160010view1_select);
 viewResizeList.add(AC0160010view1_resize);
 viewScrollList.add(AC0160010view1_scroll);
 viewHeaderDataList.add(AC0160010view1_HB);
 viewBodyDataList.add(AC0160010view1_DB);
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0160010 Revision: 1.4  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AC0160010-AC0160010button0">
expj.AC0160010.AC0160010button0 = {};
expj.AC0160010.AC0160010button0.executeAllOnDecision = function () {
  console.log('execute AC0160010button0.onDecision');
};
expj.AC0160010.AC0160010button0.executeOnLoad = function () {
  expj.AC0160010.AC0160010button0.executePScriptOnLoad();
};

expj.AC0160010.AC0160010button0.executePScriptOnLoad = function () {
  console.log('execute AC0160010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0160010-AC0160010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0160010-AC0160010button0-CsvOut">
expj.AC0160010.AC0160010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0160010form1/*@AC0160010Servlet,,$ZZ07011"
expj.AC0160010.AC0160010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0160010', 'AC0160010button0', '_AC0160010form1/*', 'AC0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0160010', response);
expj.common.updateBusinessScreenTab('AC0160010', contents);
};
expj.common.pscript.callConfirm('AC0160010', 'AC0160010button0', 'ZZ07011', okEvent);
};
expj.AC0160010.AC0160010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010button0.CsvOut['onClick' + i])) {
        expj.AC0160010.AC0160010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AC0160010.AC0160010button0.CsvOut.executePScriptOnLoad();
};

expj.AC0160010.AC0160010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AC0160010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0160010-AC0160010button0-CsvOut" name="CsvOut" class="AC0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010button0-Clear">
expj.AC0160010.AC0160010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0160010Servlet,,$ZZ07008"
expj.AC0160010.AC0160010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0160010', 'AC0160010button0', '', 'AC0160010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0160010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0160010', response);
expj.common.updateBusinessScreenTab('AC0160010', contents);
};
expj.common.pscript.callConfirm('AC0160010', 'AC0160010button0', 'ZZ07008', okEvent);
};
expj.AC0160010.AC0160010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010button0.Clear['onClick' + i])) {
        expj.AC0160010.AC0160010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010button0.Clear.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010button0.Clear.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0160010.AC0160010button0.Clear.executePScriptOnLoad();
};

expj.AC0160010.AC0160010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0160010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0160010-AC0160010button0-Clear" name="Clear" class="AC0160010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0160010-AC0160010button0-Close">
expj.AC0160010.AC0160010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0160010.AC0160010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0160010');
};
expj.AC0160010.AC0160010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0160010.AC0160010button0.Close['onClick' + i])) {
        expj.AC0160010.AC0160010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0160010.AC0160010button0.Close.executeAllOnDecision = function () {
};
expj.AC0160010.AC0160010button0.Close.executeOnLoad = function () {
  $('#expj-AC0160010-AC0160010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0160010', 'AC0160010button0', 'Close', this, 'Button');
    }
  });
  expj.AC0160010.AC0160010button0.Close.executePScriptOnLoad();
};

expj.AC0160010.AC0160010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0160010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0160010-AC0160010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0160010-AC0160010button0-Close" name="Close" class="AC0160010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0160010 (END)-->
<%
MessageStruct msgStruct = aAC0160010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0160010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0160010)) {
  expj.common.treeInstanceMap.AC0160010 = {};
}
expj.common.treeInstanceMap.AC0160010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0160010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0160010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0160010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0160010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0160010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0160010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0160010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0160010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0160010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0160010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0160010)) {
  expj.common.detailDialogMap.AC0160010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0160010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0160010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0160010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0160010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0160010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0160010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0160010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0160010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0160010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0160010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0160010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0160010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0160010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0160010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0160010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0160010)) {
  expj.common.viewInstanceMap.AC0160010 = {};
}
expj.common.viewInstanceMap.AC0160010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0160010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0160010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0160010.<%=viewId %>.init = function () {
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
    expj.AC0160010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0160010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0160010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0160010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0160010_init">
/**
 * AC0160010用のロード完了時初期化関数
 */
expj.AC0160010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0160010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0160010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0160010');
  expj.common.calendarInstanceMap.AC0160010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0160010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0160010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0160010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0160010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0160010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0160010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0160010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0160010.AC0160010form1.r1_FILTER2.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.r2_FILTER2.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.TXT_FILE.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_WS_CD.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.CalendarPrdStartDateFrom.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_PRD_START_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.CalendarPrdStartDateTo.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.r1_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.CalendarPrdDueDateFrom.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.IN_PRD_DUE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.CalendarPrdDueDateTo.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.r2_FILTER1.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.w_OD_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.PRODUCT_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.c1_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.c2_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.c3_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010form1.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010button1.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010view1.executeOnLoad();}catch(e){};
  try{expj.AC0160010.AC0160010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0160010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0160010', 'AC0160010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0160010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0160010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0160010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0160010', '<%=request.getContextPath() %>');
};

/**
 * AC0160010の全体onDecision処理
 */
expj.AC0160010.executeAllOnDecision = function () {
  expj.AC0160010.AC0160010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0160010_console">
expj.AC0160010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>