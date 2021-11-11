<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:37:55 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0010\AF0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0010.*" %>
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
<jsp:useBean id="aAF0010010Control" class="com.nec.jp.orteus.metamorBase.AF0010.AF0010010Control" scope="request"/>
<jsp:useBean id="aAF0010010Struct" class="com.nec.jp.orteus.metamorBase.AF0010.AF0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

出庫指示一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0010/jsp/AF0010010.jsp,v $
$Author: geng-jia $	
$Revision: 1.26 $ $Date: 2017/02/22 02:05:34 $
********************************************************* --%>
<html>
<head>
<title>出庫指示一覧</title>
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
<script class="expj-script-AF0010010_init">
  // AF0010010名前空間
  expj.AF0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0010010" data-screen="AF0010010" data-newdata="<%=aAF0010010Control.isNewData() %>">
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
              <script class="expj-script-AF0010010-AF0010010form1">
expj.AF0010010.AF0010010form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0010010.AF0010010form1.onLoad0 = function () {
  console.log('AF0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AF0010010form1/*[neq]NORMAL@*1"
expj.AF0010010.AF0010010form1.child0 = function () {
  console.log('AF0010010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;MASK;_AF0010010button0/csv"
expj.AF0010010.AF0010010form1.child1 = function () {
  console.log('AF0010010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button0/csv');
};
// script4="onLoad;1;CALL;onDecision@0"
expj.AF0010010.AF0010010form1.onLoad1 = function () {
  console.log('AF0010010form1 script4');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script5="onDecision;0;CHK;?AF0010010form1/*[eq]NORMAL@*2,*4"
expj.AF0010010.AF0010010form1.onDecision0 = function () {
  console.log('AF0010010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AF0010010form1/PLANT_CD[eq]SAME[and]?AF0010010form1/w_WS_CD[eq]SAME[and]?AF0010010form1/w_VEND_CD[eq]SAME[and]?AF0010010form1/c1_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c2_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c3_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c4_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c5_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/OPR_INST_CD[eq]SAME[and]?AF0010010form1/PUCH_ODR_CD[eq]SAME[and]?AF0010010form1/ISSUE_INST_CD[eq]SAME[and]?AF0010010form1/scdl_issue_date_from[eq]SAME[and]?AF0010010form1/scdl_issue_date_to[eq]SAME[and]?AF0010010form1/B_WH_CD[eq]SAME[and]?AF0010010form1/B_WH_NAME[eq]SAME[and]?AF0010010form1/WH_CD[eq]SAME[and]?AF0010010form1/WH_NAME[eq]SAME[and]?AF0010010form1/ITEM_CD[eq]SAME[and]?AF0010010form1/ITEM_NAME[eq]SAME[and]?AF0010010form1/c1_ISSUE_TYP[eq]SAME[and]?AF0010010form1/c2_ISSUE_TYP[eq]SAME[and]?AF0010010form1/c3_ISSUE_TYP[eq]SAME[and]?AF0010010form1/c_RE_PRINT[eq]SAME@*3,*4"
expj.AF0010010.AF0010010form1.child2 = function () {
  console.log('AF0010010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/w_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c1_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c2_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c3_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c4_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c5_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/ISSUE_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/scdl_issue_date_from'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/scdl_issue_date_to'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/B_WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/B_WH_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/WH_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/ITEM_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c1_ISSUE_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c2_ISSUE_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c3_ISSUE_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '?AF0010010form1/c_RE_PRINT'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AF0010010button2/CheckAll,_AF0010010button2/UncheckAll@*9"
expj.AF0010010.AF0010010form1.child3 = function () {
  console.log('AF0010010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button2/CheckAll');
expj.common.pscript.setUnMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button2/UncheckAll');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script8="child;4;MASK;_AF0010010button0/csv,_AF0010010button2/CheckAll,_AF0010010button2/UncheckAll"
expj.AF0010010.AF0010010form1.child4 = function () {
  console.log('AF0010010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button0/csv');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button2/CheckAll');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button2/UncheckAll');
};
// script9="onLoad;2;CALL;child@5"
expj.AF0010010.AF0010010form1.onLoad2 = function () {
  console.log('AF0010010form1 script9');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child5)){this.child5();}
};
// script10="child;5;CHK;_AF0010010form1/TIME_CTRL[neq]true@*6,*8"
expj.AF0010010.AF0010010form1.child5 = function () {
  console.log('AF0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/TIME_CTRL'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;MASK;_AF0010010form1/scdl_issue_time_from,_AF0010010form1/scdl_issue_time_to@*7"
expj.AF0010010.AF0010010form1.child6 = function () {
  console.log('AF0010010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010form1/scdl_issue_time_from');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010form1/scdl_issue_time_to');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script12="child;7;SET;_AF0010010form1/scdl_issue_time_from=,_AF0010010form1/scdl_issue_time_to="
expj.AF0010010.AF0010010form1.child7 = function () {
  console.log('AF0010010form1 script12');
expj.common.pscript.setReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/scdl_issue_time_from', '');
expj.common.pscript.setReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/scdl_issue_time_to', '');
};
// script13="child;8;UNMASK;_AF0010010form1/scdl_issue_time_from,_AF0010010form1/scdl_issue_time_to"
expj.AF0010010.AF0010010form1.child8 = function () {
  console.log('AF0010010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010form1/scdl_issue_time_from');
expj.common.pscript.setUnMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010form1/scdl_issue_time_to');
};
// script14="child;9;CHKRQ;1[eq]1@*10,*11"
expj.AF0010010.AF0010010form1.child9 = function () {
  console.log('AF0010010form1 script14');
if ((expj.common.pscript.evaluate('1', '[eq]', '1'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;10;UNMASK;_AF0010010button0/csv"
expj.AF0010010.AF0010010form1.child10 = function () {
  console.log('AF0010010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button0/csv');
};
// script16="child;11;MASK;_AF0010010button0/csv"
expj.AF0010010.AF0010010form1.child11 = function () {
  console.log('AF0010010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010button0/csv');
};
// script17="onDecision;1;CHK;_AF0010010form1/c2_ISSUE_TYP[eq]true[or]_AF0010010form1/c1_ISSUE_TYP[eq]true@*12,*13"
expj.AF0010010.AF0010010form1.onDecision1 = function () {
  console.log('AF0010010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/c2_ISSUE_TYP'), '[eq]', 'true') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/c1_ISSUE_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;12;UNMASK;_AF0010010form1/c_RE_PRINT"
expj.AF0010010.AF0010010form1.child12 = function () {
  console.log('AF0010010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010form1/c_RE_PRINT');
};
// script19="child;13;MASK;_AF0010010form1/c_RE_PRINT@*14"
expj.AF0010010.AF0010010form1.child13 = function () {
  console.log('AF0010010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AF0010010', 'AF0010010form1', '_AF0010010form1/c_RE_PRINT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script20="child;14;SET;_AF0010010form1/c_RE_PRINT=NULL"
expj.AF0010010.AF0010010form1.child14 = function () {
  console.log('AF0010010form1 script20');
expj.common.pscript.setReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/c_RE_PRINT', 'NULL');
};
expj.AF0010010.AF0010010form1.executeAllOnDecision = function () {
  console.log('execute AF0010010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1['onDecision' + i])) {
        expj.AF0010010.AF0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.executeOnLoad = function () {
  expj.AF0010010.AF0010010form1.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1['onLoad' + i])) {
      expj.AF0010010.AF0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0010010-AF0010010form1" action="AF0010010Servlet" name="AF0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAF0010010Control.getReadStatusString()) %>" style="height:234px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:234px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:20px;align:right"></div>
<div class="div-td" style="width:130px;align:right"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:38px;align:"></div>
<div class="div-td" style="width:112px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PLANT_CD">
expj.AF0010010.AF0010010form1.PLANT_CD = {};
expj.AF0010010.AF0010010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/PLANT_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'PLANT_CD', this);
  });
  expj.AF0010010.AF0010010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-PLANT_CD" name="PLANT_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerPlantCd">
expj.AF0010010.AF0010010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/PLANT_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerPlantCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerPlantCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PLANT_NAME">
expj.AF0010010.AF0010010form1.PLANT_NAME = {};
expj.AF0010010.AF0010010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/PLANT_NAME.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'PLANT_NAME', this);
  });
  expj.AF0010010.AF0010010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-PLANT_NAME" name="PLANT_NAME" class="AF0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0010010-AF0010010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AF0010010-AF0010010form1-DOWNLOAD_FILE">
expj.AF0010010.AF0010010form1.DOWNLOAD_FILE = {};
expj.AF0010010.AF0010010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/DOWNLOAD_FILE.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AF0010010.AF0010010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0010010-AF0010010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AF0010010-AF0010010form1-TIME_CTRL">
expj.AF0010010.AF0010010form1.TIME_CTRL = {};
expj.AF0010010.AF0010010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/TIME_CTRL.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'TIME_CTRL', this);
  });
  expj.AF0010010.AF0010010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-w_WS_CD">
expj.AF0010010.AF0010010form1.w_WS_CD = {};
expj.AF0010010.AF0010010form1.w_WS_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/w_WS_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.w_WS_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-w_WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'w_WS_CD', this);
  });
  expj.AF0010010.AF0010010form1.w_WS_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.w_WS_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/w_WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-w_WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-w_WS_CD" name="w_WS_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getw_WS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerWWsCd">
expj.AF0010010.AF0010010form1.PeekerWWsCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/w_WS_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerWWsCd.onClick0 = function () {
  console.log('PeekerWWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerWWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/w_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/w_WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerWWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerWWsCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerWWsCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerWWsCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerWWsCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerWWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerWWsCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerWWsCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerWWsCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerWWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerWWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerWWsCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-w_WS_NAME">
expj.AF0010010.AF0010010form1.w_WS_NAME = {};
expj.AF0010010.AF0010010form1.w_WS_NAME.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/w_WS_NAME.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.w_WS_NAME.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-w_WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'w_WS_NAME', this);
  });
  expj.AF0010010.AF0010010form1.w_WS_NAME.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.w_WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/w_WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-w_WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-w_WS_NAME" name="w_WS_NAME" class="AF0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getw_WS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0010010-AF0010010form1-h_issue_cmplt_flg" name="h_issue_cmplt_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0010010Struct.geth_issue_cmplt_flg()) %>">
<script class="expj-script-AF0010010-AF0010010form1-h_issue_cmplt_flg">
expj.AF0010010.AF0010010form1.h_issue_cmplt_flg = {};
expj.AF0010010.AF0010010form1.h_issue_cmplt_flg.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/h_issue_cmplt_flg.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.h_issue_cmplt_flg.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-h_issue_cmplt_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'h_issue_cmplt_flg', this);
  });
  expj.AF0010010.AF0010010form1.h_issue_cmplt_flg.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.h_issue_cmplt_flg.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/h_issue_cmplt_flg.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-h_issue_cmplt_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-w_VEND_CD">
expj.AF0010010.AF0010010form1.w_VEND_CD = {};
expj.AF0010010.AF0010010form1.w_VEND_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/w_VEND_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.w_VEND_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-w_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'w_VEND_CD', this);
  });
  expj.AF0010010.AF0010010form1.w_VEND_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.w_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/w_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-w_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-w_VEND_CD" name="w_VEND_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getw_VEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerWVendCd">
expj.AF0010010.AF0010010form1.PeekerWVendCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/w_VEND_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerWVendCd.onClick0 = function () {
  console.log('PeekerWVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerWVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/w_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/w_VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerWVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerWVendCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerWVendCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerWVendCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerWVendCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerWVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerWVendCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerWVendCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerWVendCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerWVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerWVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerWVendCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-w_VEND_ANAME">
expj.AF0010010.AF0010010form1.w_VEND_ANAME = {};
expj.AF0010010.AF0010010form1.w_VEND_ANAME.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/w_VEND_ANAME.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.w_VEND_ANAME.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-w_VEND_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'w_VEND_ANAME', this);
  });
  expj.AF0010010.AF0010010form1.w_VEND_ANAME.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.w_VEND_ANAME.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/w_VEND_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-w_VEND_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-w_VEND_ANAME" name="w_VEND_ANAME" class="AF0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getw_VEND_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-OPR_INST_CD">
expj.AF0010010.AF0010010form1.OPR_INST_CD = {};
expj.AF0010010.AF0010010form1.OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/OPR_INST_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'OPR_INST_CD', this);
  });
  expj.AF0010010.AF0010010form1.OPR_INST_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-OPR_INST_CD" name="OPR_INST_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getOPR_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerOprInstCd">
expj.AF0010010.AF0010010form1.PeekerOprInstCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/OPR_INST_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerOprInstCd.onClick0 = function () {
  console.log('PeekerOprInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerOprInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/OPR_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OPR_INST_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/OPR_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerOprInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerOprInstCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerOprInstCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerOprInstCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerOprInstCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerOprInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerOprInstCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerOprInstCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerOprInstCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerOprInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerOprInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerOprInstCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c1_ISSUE_TYP">
expj.AF0010010.AF0010010form1.c1_ISSUE_TYP = {};
expj.AF0010010.AF0010010form1.c1_ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c1_ISSUE_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c1_ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c1_ISSUE_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c1_ISSUE_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c1_ISSUE_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c1_ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c1_ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c1_ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:130px;text-align:left;"><input type="checkbox" name="c1_ISSUE_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc1_ISSUE_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc1_ISSUE_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c1_ISSUE_TYP"><label for="expj-AF0010010-AF0010010form1-c1_ISSUE_TYP"><%=CoreTools.getRBString("Expj.Cmt6225",rb)%></label></div><!--/td-->
<div class="div-td" style="width:60px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0721",rb)%></span><!-- ステータス --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c1_WORK_STS_TYP">
expj.AF0010010.AF0010010form1.c1_WORK_STS_TYP = {};
expj.AF0010010.AF0010010form1.c1_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c1_WORK_STS_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c1_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c1_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c1_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c1_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c1_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c1_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c1_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:112px;text-align:left;"><input type="checkbox" name="c1_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc1_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc1_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c1_WORK_STS_TYP"><label for="expj-AF0010010-AF0010010form1-c1_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0729",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c2_WORK_STS_TYP">
expj.AF0010010.AF0010010form1.c2_WORK_STS_TYP = {};
expj.AF0010010.AF0010010form1.c2_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c2_WORK_STS_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c2_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c2_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c2_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c2_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c2_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c2_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c2_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="c2_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc2_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc2_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c2_WORK_STS_TYP"><label for="expj-AF0010010-AF0010010form1-c2_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0730",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PUCH_ODR_CD">
expj.AF0010010.AF0010010form1.PUCH_ODR_CD = {};
expj.AF0010010.AF0010010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/PUCH_ODR_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'PUCH_ODR_CD', this);
  });
  expj.AF0010010.AF0010010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerPuchOdrCd">
expj.AF0010010.AF0010010form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerPuchOdrCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c2_ISSUE_TYP">
expj.AF0010010.AF0010010form1.c2_ISSUE_TYP = {};
expj.AF0010010.AF0010010form1.c2_ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c2_ISSUE_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c2_ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c2_ISSUE_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c2_ISSUE_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c2_ISSUE_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c2_ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c2_ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c2_ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:130px;text-align:left;"><input type="checkbox" name="c2_ISSUE_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc2_ISSUE_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc2_ISSUE_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c2_ISSUE_TYP"><label for="expj-AF0010010-AF0010010form1-c2_ISSUE_TYP"><%=CoreTools.getRBString("Expj.Cmt6226",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:38px;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c3_WORK_STS_TYP">
expj.AF0010010.AF0010010form1.c3_WORK_STS_TYP = {};
expj.AF0010010.AF0010010form1.c3_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c3_WORK_STS_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c3_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c3_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c3_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c3_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c3_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c3_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c3_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:112px;text-align:left;"><input type="checkbox" name="c3_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc3_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc3_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c3_WORK_STS_TYP"><label for="expj-AF0010010-AF0010010form1-c3_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0731",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c4_WORK_STS_TYP">
expj.AF0010010.AF0010010form1.c4_WORK_STS_TYP = {};
expj.AF0010010.AF0010010form1.c4_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c4_WORK_STS_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c4_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c4_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c4_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c4_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c4_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c4_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c4_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="c4_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc4_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc4_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c4_WORK_STS_TYP"><label for="expj-AF0010010-AF0010010form1-c4_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0732",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_INST_CD",rb)%></span><!-- 出庫指示番号 --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-ISSUE_INST_CD">
expj.AF0010010.AF0010010form1.ISSUE_INST_CD = {};
expj.AF0010010.AF0010010form1.ISSUE_INST_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/ISSUE_INST_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.ISSUE_INST_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-ISSUE_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'ISSUE_INST_CD', this);
  });
  expj.AF0010010.AF0010010form1.ISSUE_INST_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.ISSUE_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/ISSUE_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-ISSUE_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-ISSUE_INST_CD" name="ISSUE_INST_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getISSUE_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerIssueInstCd">
expj.AF0010010.AF0010010form1.PeekerIssueInstCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/ISSUE_INST_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerIssueInstCd.onClick0 = function () {
  console.log('PeekerIssueInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerIssueInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/ISSUE_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ISSUE_INST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/ISSUE_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerIssueInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerIssueInstCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerIssueInstCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerIssueInstCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerIssueInstCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerIssueInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerIssueInstCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerIssueInstCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerIssueInstCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerIssueInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerIssueInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerIssueInstCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c3_ISSUE_TYP">
expj.AF0010010.AF0010010form1.c3_ISSUE_TYP = {};
expj.AF0010010.AF0010010form1.c3_ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c3_ISSUE_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c3_ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c3_ISSUE_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c3_ISSUE_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c3_ISSUE_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c3_ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c3_ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c3_ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:130px;text-align:left;"><input type="checkbox" name="c3_ISSUE_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc3_ISSUE_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc3_ISSUE_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c3_ISSUE_TYP"><label for="expj-AF0010010-AF0010010form1-c3_ISSUE_TYP"><%=CoreTools.getRBString("Expj.Cmt6227",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:38px;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c5_WORK_STS_TYP">
expj.AF0010010.AF0010010form1.c5_WORK_STS_TYP = {};
expj.AF0010010.AF0010010form1.c5_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c5_WORK_STS_TYP.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c5_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c5_WORK_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c5_WORK_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c5_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c5_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c5_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c5_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:112px;text-align:left;"><input type="checkbox" name="c5_WORK_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc5_WORK_STS_TYP())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc5_WORK_STS_TYP())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c5_WORK_STS_TYP"><label for="expj-AF0010010-AF0010010form1-c5_WORK_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0013",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SCDL_ISSUE_DATE",rb)%></span><!-- 出庫予定日 --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-scdl_issue_date_from">
expj.AF0010010.AF0010010form1.scdl_issue_date_from = {};
expj.AF0010010.AF0010010form1.scdl_issue_date_from.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/scdl_issue_date_from.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.scdl_issue_date_from.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-scdl_issue_date_from').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'scdl_issue_date_from', this);
  });
  expj.AF0010010.AF0010010form1.scdl_issue_date_from.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.scdl_issue_date_from.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/scdl_issue_date_from.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-scdl_issue_date_from');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-scdl_issue_date_from" name="scdl_issue_date_from" class="AF0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getscdl_issue_date_from()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-CalendarFromDate">
expj.AF0010010.AF0010010form1.CalendarFromDate = {};
// script1="onClick;0;CALENDAR;_AF0010010form1/scdl_issue_date_from"
expj.AF0010010.AF0010010form1.CalendarFromDate.onClick0 = function () {
  console.log('CalendarFromDate script1');
expj.common.pscript.executeCalendar('AF0010010','AF0010010form1','_AF0010010form1/scdl_issue_date_from');
};
expj.AF0010010.AF0010010form1.CalendarFromDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.CalendarFromDate['onClick' + i])) {
        expj.AF0010010.AF0010010form1.CalendarFromDate['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.CalendarFromDate.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.CalendarFromDate.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-CalendarFromDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'CalendarFromDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AF0010010','AF0010010form1','_AF0010010form1/scdl_issue_date_from');
  expj.AF0010010.AF0010010form1.CalendarFromDate.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.CalendarFromDate.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/CalendarFromDate.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-CalendarFromDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-CalendarFromDate" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-scdl_issue_time_from">
expj.AF0010010.AF0010010form1.scdl_issue_time_from = {};
expj.AF0010010.AF0010010form1.scdl_issue_time_from.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/scdl_issue_time_from.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.scdl_issue_time_from.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-scdl_issue_time_from').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'scdl_issue_time_from', this);
  });
  expj.AF0010010.AF0010010form1.scdl_issue_time_from.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.scdl_issue_time_from.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/scdl_issue_time_from.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-scdl_issue_time_from');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-scdl_issue_time_from" name="scdl_issue_time_from" class="AF0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getscdl_issue_time_from()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-scdl_issue_date_to">
expj.AF0010010.AF0010010form1.scdl_issue_date_to = {};
expj.AF0010010.AF0010010form1.scdl_issue_date_to.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/scdl_issue_date_to.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.scdl_issue_date_to.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-scdl_issue_date_to').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'scdl_issue_date_to', this);
  });
  expj.AF0010010.AF0010010form1.scdl_issue_date_to.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.scdl_issue_date_to.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/scdl_issue_date_to.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-scdl_issue_date_to');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-scdl_issue_date_to" name="scdl_issue_date_to" class="AF0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getscdl_issue_date_to()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-CalendarToDate">
expj.AF0010010.AF0010010form1.CalendarToDate = {};
// script1="onClick;0;CALENDAR;_AF0010010form1/scdl_issue_date_to"
expj.AF0010010.AF0010010form1.CalendarToDate.onClick0 = function () {
  console.log('CalendarToDate script1');
expj.common.pscript.executeCalendar('AF0010010','AF0010010form1','_AF0010010form1/scdl_issue_date_to');
};
expj.AF0010010.AF0010010form1.CalendarToDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.CalendarToDate['onClick' + i])) {
        expj.AF0010010.AF0010010form1.CalendarToDate['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.CalendarToDate.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.CalendarToDate.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-CalendarToDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'CalendarToDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AF0010010','AF0010010form1','_AF0010010form1/scdl_issue_date_to');
  expj.AF0010010.AF0010010form1.CalendarToDate.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.CalendarToDate.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/CalendarToDate.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-CalendarToDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-CalendarToDate" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-scdl_issue_time_to">
expj.AF0010010.AF0010010form1.scdl_issue_time_to = {};
expj.AF0010010.AF0010010form1.scdl_issue_time_to.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/scdl_issue_time_to.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.scdl_issue_time_to.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-scdl_issue_time_to').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'scdl_issue_time_to', this);
  });
  expj.AF0010010.AF0010010form1.scdl_issue_time_to.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.scdl_issue_time_to.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/scdl_issue_time_to.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-scdl_issue_time_to');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-scdl_issue_time_to" name="scdl_issue_time_to" class="AF0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getscdl_issue_time_to()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-c_RE_PRINT">
expj.AF0010010.AF0010010form1.c_RE_PRINT = {};
expj.AF0010010.AF0010010form1.c_RE_PRINT.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/c_RE_PRINT.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.c_RE_PRINT.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-c_RE_PRINT').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'c_RE_PRINT', this, 'CheckBox');
    }
  });
  expj.AF0010010.AF0010010form1.c_RE_PRINT.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.c_RE_PRINT.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/c_RE_PRINT.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-c_RE_PRINT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="checkbox" name="c_RE_PRINT" value="true" <%= ("true".equals(TypeConverter.convert(aAF0010010Struct.getc_RE_PRINT())) || "1".equals(TypeConverter.convert(aAF0010010Struct.getc_RE_PRINT())))?"checked=\"checked\"":"" %>  class="AF0010010-focus-move" id="expj-AF0010010-AF0010010form1-c_RE_PRINT"><label for="expj-AF0010010-AF0010010form1-c_RE_PRINT"><%=CoreTools.getRBString("Expj.Cmt0203",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD_10",rb)%></span><!-- 出庫元保管区コード --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-B_WH_CD">
expj.AF0010010.AF0010010form1.B_WH_CD = {};
expj.AF0010010.AF0010010form1.B_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/B_WH_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.B_WH_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-B_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'B_WH_CD', this);
  });
  expj.AF0010010.AF0010010form1.B_WH_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.B_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/B_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-B_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-B_WH_CD" name="B_WH_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getB_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerBWhCd">
expj.AF0010010.AF0010010form1.PeekerBWhCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/B_WH_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerBWhCd.onClick0 = function () {
  console.log('PeekerBWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerBWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0010010', 'PeekerBWhCd', 'SQLPARAM_1', '<%=aAF0010010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/B_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0010010', 'PeekerBWhCd', 'SQLPARAM_4', '0');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_5%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0010010', 'PeekerBWhCd', 'SQLPARAM_5', '1');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_11%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/B_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerBWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerBWhCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerBWhCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerBWhCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerBWhCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerBWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerBWhCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerBWhCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerBWhCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerBWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerBWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerBWhCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-B_WH_NAME">
expj.AF0010010.AF0010010form1.B_WH_NAME = {};
expj.AF0010010.AF0010010form1.B_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/B_WH_NAME.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.B_WH_NAME.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-B_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'B_WH_NAME', this);
  });
  expj.AF0010010.AF0010010form1.B_WH_NAME.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.B_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/B_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-B_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-B_WH_NAME" name="B_WH_NAME" class="AF0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getB_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD_1",rb)%></span><!-- 出庫先保管区コード --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-WH_CD">
expj.AF0010010.AF0010010form1.WH_CD = {};
expj.AF0010010.AF0010010form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/WH_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.WH_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'WH_CD', this);
  });
  expj.AF0010010.AF0010010form1.WH_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-WH_CD" name="WH_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerWhCd">
expj.AF0010010.AF0010010form1.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/WH_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0010010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAF0010010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0010010', 'PeekerWhCd', 'SQLPARAM_4', '0');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_5%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0010010', 'PeekerWhCd', 'SQLPARAM_5', '1');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_11%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerWhCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerWhCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerWhCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-WH_NAME">
expj.AF0010010.AF0010010form1.WH_NAME = {};
expj.AF0010010.AF0010010form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/WH_NAME.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'WH_NAME', this);
  });
  expj.AF0010010.AF0010010form1.WH_NAME.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-WH_NAME" name="WH_NAME" class="AF0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-ITEM_CD">
expj.AF0010010.AF0010010form1.ITEM_CD = {};
expj.AF0010010.AF0010010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/ITEM_CD.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'ITEM_CD', this);
  });
  expj.AF0010010.AF0010010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-ITEM_CD" name="ITEM_CD" class="AF0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-PeekerItemCd">
expj.AF0010010.AF0010010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AF0010010form1/ITEM_CD@<%=contextNo%>"
expj.AF0010010.AF0010010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0010010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010form1', '_AF0010010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0010010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0010010.AF0010010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010form1.PeekerItemCd['onClick' + i])) {
        expj.AF0010010.AF0010010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0010010-AF0010010form1-PeekerItemCd" class="AF0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010form1-ITEM_NAME">
expj.AF0010010.AF0010010form1.ITEM_NAME = {};
expj.AF0010010.AF0010010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AF0010010form1/ITEM_NAME.onDecision');
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
  expj.AF0010010.executeAllOnDecision();
};
expj.AF0010010.AF0010010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0010010', 'AF0010010form1', 'ITEM_NAME', this);
  });
  expj.AF0010010.AF0010010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AF0010010.AF0010010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0010010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:322px;text-align:left;"><input type="text" id="expj-AF0010010-AF0010010form1-ITEM_NAME" name="ITEM_NAME" class="AF0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0010010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0010010-AF0010010button1">
expj.AF0010010.AF0010010button1 = {};
expj.AF0010010.AF0010010button1.executeAllOnDecision = function () {
  console.log('execute AF0010010button1.onDecision');
};
expj.AF0010010.AF0010010button1.executeOnLoad = function () {
  expj.AF0010010.AF0010010button1.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button1.executePScriptOnLoad = function () {
  console.log('execute AF0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0010010-AF0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0010010-AF0010010button1-select">
expj.AF0010010.AF0010010button1.select = {};
// script1="onClick;0;CHK;_AF0010010form1/TIME_CTRL[eq]true@*1"
expj.AF0010010.AF0010010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;1;CHK;_AF0010010form1/scdl_issue_date_from[eq][and]_AF0010010form1/scdl_issue_time_from[neq]@!AS00063"
expj.AF0010010.AF0010010button1.select.child1 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_from'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00063');
}
};
// script3="onClick;1;CHK;_AF0010010form1/TIME_CTRL[eq]true@*2"
expj.AF0010010.AF0010010button1.select.onClick1 = function () {
  console.log('select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;2;CHK;_AF0010010form1/scdl_issue_date_to[eq][and]_AF0010010form1/scdl_issue_time_to[neq]@!AS00064"
expj.AF0010010.AF0010010button1.select.child2 = function () {
  console.log('select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_to'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00064');
}
};
// script5="onClick;2;CHK;_AF0010010form1/TIME_CTRL[eq]true@*3"
expj.AF0010010.AF0010010button1.select.onClick2 = function () {
  console.log('select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;3;CHK;~LEN(_AF0010010form1/scdl_issue_time_from)[eq]1[or]~LEN(_AF0010010form1/scdl_issue_time_from)[eq]2@!AS00065"
expj.AF0010010.AF0010010button1.select.child3 = function () {
  console.log('select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00065');
}
};
// script7="onClick;3;CHK;_AF0010010form1/TIME_CTRL[eq]true@*4"
expj.AF0010010.AF0010010button1.select.onClick3 = function () {
  console.log('select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;CHK;~LEN(_AF0010010form1/scdl_issue_time_to)[eq]1[or]~LEN(_AF0010010form1/scdl_issue_time_to)[eq]2@!AS00066"
expj.AF0010010.AF0010010button1.select.child4 = function () {
  console.log('select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00066');
}
};
// script9="onClick;4;CHK;_AF0010010form1/TIME_CTRL[eq]true[and]~LEN(_AF0010010form1/scdl_issue_time_from)[eq]3@*5"
expj.AF0010010.AF0010010button1.select.onClick4 = function () {
  console.log('select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;5;CHK;[{~CHARAT(_AF0010010form1/scdl_issue_time_from:1)}*10+{~CHARAT(_AF0010010form1/scdl_issue_time_from:2)}][gte]60@!AS00067"
expj.AF0010010.AF0010010button1.select.child5 = function () {
  console.log('select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00067');
}
};
// script11="onClick;5;CHK;~LEN(_AF0010010form1/scdl_issue_time_from)[eq]4@*6"
expj.AF0010010.AF0010010button1.select.onClick5 = function () {
  console.log('select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script12="child;6;CHK;[{~CHARAT(_AF0010010form1/scdl_issue_time_from:0)}*10+{~CHARAT(_AF0010010form1/scdl_issue_time_from:1)}][gte]24[or][{~CHARAT(_AF0010010form1/scdl_issue_time_from:2)}*10+{~CHARAT(_AF0010010form1/scdl_issue_time_from:3)}][gte]60@!AS00067"
expj.AF0010010.AF0010010button1.select.child6 = function () {
  console.log('select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00067');
}
};
// script13="onClick;6;CHK;_AF0010010form1/TIME_CTRL[eq]true[and]~LEN(_AF0010010form1/scdl_issue_time_to)[eq]3@*7"
expj.AF0010010.AF0010010button1.select.onClick6 = function () {
  console.log('select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script14="child;7;CHK;[{~CHARAT(_AF0010010form1/scdl_issue_time_to:1)}*10+{~CHARAT(_AF0010010form1/scdl_issue_time_to:2)}][gte]60@!AS00068"
expj.AF0010010.AF0010010button1.select.child7 = function () {
  console.log('select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00068');
}
};
// script15="onClick;7;CHK;~LEN(_AF0010010form1/scdl_issue_time_to)[eq]4@*8"
expj.AF0010010.AF0010010button1.select.onClick7 = function () {
  console.log('select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script16="child;8;CHK;[{~CHARAT(_AF0010010form1/scdl_issue_time_to:0)}*10+{~CHARAT(_AF0010010form1/scdl_issue_time_to:1)}][gte]24[or][{~CHARAT(_AF0010010form1/scdl_issue_time_to:2)}*10+{~CHARAT(_AF0010010form1/scdl_issue_time_to:3)}][gte]60@!AS00068"
expj.AF0010010.AF0010010button1.select.child8 = function () {
  console.log('select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'AS00068');
}
};
// script17="onClick;8;CHK;_AF0010010form1/scdl_issue_date_from[neq][and]_AF0010010form1/scdl_issue_date_to[neq]@*9"
expj.AF0010010.AF0010010button1.select.onClick8 = function () {
  console.log('select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_from'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_to'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script18="child;9;CHK;_AF0010010form1/scdl_issue_date_from[gt]_AF0010010form1/scdl_issue_date_to@!ZZ05101"
expj.AF0010010.AF0010010button1.select.child9 = function () {
  console.log('select script18');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_from')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_to')))) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'ZZ05101');
}
};
// script19="onClick;9;CHK;_AF0010010form1/scdl_issue_date_from[neq][and]_AF0010010form1/scdl_issue_date_to[neq][and]_AF0010010form1/scdl_issue_date_from[eq]_AF0010010form1/scdl_issue_date_to[and]_AF0010010form1/scdl_issue_time_from[neq][and]_AF0010010form1/scdl_issue_time_to[neq]@*10"
expj.AF0010010.AF0010010button1.select.onClick9 = function () {
  console.log('select script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_from'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_to'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_from'), '[eq]', expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_date_to')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script20="child;10;CHK;_AF0010010form1/scdl_issue_time_from[gt]_AF0010010form1/scdl_issue_time_to@!ZZ05101"
expj.AF0010010.AF0010010button1.select.child10 = function () {
  console.log('select script20');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_from')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/scdl_issue_time_to')))) {
expj.common.pscript.viewErrorMessage('AF0010010', 'AF0010010button1', 'ZZ05101');
}
};
// script21="onClick;10;CHK;_AF0010010form1/c5_WORK_STS_TYP[eq]true@*11,*12"
expj.AF0010010.AF0010010button1.select.onClick10 = function () {
  console.log('select script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/c5_WORK_STS_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script22="child;11;SET;_AF0010010form1/h_issue_cmplt_flg=1"
expj.AF0010010.AF0010010button1.select.child11 = function () {
  console.log('select script22');
expj.common.pscript.setReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/h_issue_cmplt_flg', '1');
};
// script23="child;12;SET;_AF0010010form1/h_issue_cmplt_flg=0"
expj.AF0010010.AF0010010button1.select.child12 = function () {
  console.log('select script23');
expj.common.pscript.setReferenceComponentValue('AF0010010', 'AF0010010button1', '_AF0010010form1/h_issue_cmplt_flg', '0');
};
// script24="onClick;11;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0010010form1/*@AF0010010Servlet"
expj.AF0010010.AF0010010button1.select.onClick11 = function () {
  console.log('select script24');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0010010', 'AF0010010button1', '_AF0010010form1/*', 'AF0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0010010', response);
expj.common.updateBusinessScreenTab('AF0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0010010.AF0010010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 11; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010button1.select['onClick' + i])) {
        expj.AF0010010.AF0010010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010button1.select.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010button1.select.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010button1', 'select', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010button1.select.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button1.select.executePScriptOnLoad = function () {
  console.log('execute AF0010010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0010010-AF0010010button1-select" name="select" class="AF0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0010010-AF0010010view1">
expj.AF0010010.AF0010010view1 = {};
expj.AF0010010.AF0010010view1.executeAllOnClick = function () {
};
expj.AF0010010.AF0010010view1.executeAllOnDecision = function () {
  console.log('execute AF0010010view1.onDecision');
};
expj.AF0010010.AF0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AF0010010view1", "expj.AF0010010.AF0010010view1.executeAllOnClick");
%>
  expj.AF0010010.AF0010010view1.executePScriptOnLoad();
};

expj.AF0010010.AF0010010view1.executePScriptOnLoad = function () {
  console.log('execute AF0010010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AF0010010-AF0010010view1" class="expj-datagrid-view expj-view-multi" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AF0010010view1_Id = "AF0010010view1";
 String AF0010010view1_select = "single";
 String AF0010010view1_sortable = "true";
 String AF0010010view1_resize = "true";
 String AF0010010view1_scroll = "true";
 StringBuffer AF0010010view1_HB = new StringBuffer();
 StringBuffer AF0010010view1_DB = new StringBuffer();
%>
<%
 AF0010010view1_select = "multi";
 AF0010010view1_sortable = "true";
 AF0010010view1_resize = "true";
 AF0010010view1_scroll = "true";
%>
<%
 AF0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
%>
     
<%
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_TYP",rb))).append("', 'name':'ISSUE_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0721",rb))).append("', 'name':'l_STATUS_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'l_ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_QTY",rb))).append("', 'name':'ISSUE_INST_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb))).append("', 'name':'TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0305",rb))).append("', 'name':'w_SHIP_REMAIN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SCDL_ISSUE_DATE",rb))).append("', 'name':'SCDL_ISSUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_DATE",rb))).append("', 'name':'ISSUE_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_CMPLT_FLG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_FLG",rb))).append("', 'name':'ISSUE_CMPLT_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_1",rb))).append("', 'name':'l_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_2",rb))).append("', 'name':'l_WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'CONS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONS_TYP",rb))).append("', 'name':'CONS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_INST_CD",rb))).append("', 'name':'s_OPR_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'l_WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_NAME",rb))).append("', 'name':'WS_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_ODR_CD",rb))).append("', 'name':'WORK_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb))).append("', 'name':'WORK_IN_PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_CD",rb))).append("', 'name':'l_PUCH_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'l_VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_ANAME",rb))).append("', 'name':'VEND_ANAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_NO",rb))).append("', 'name':'OD_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PS_EDITION_1",rb))).append("', 'name':'PS_EDITION', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_NUMERATOR_2",rb))).append("', 'name':'ISSUE_INST_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_DENOMINATOR_2",rb))).append("', 'name':'ISSUE_INST_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_COMMENT",rb))).append("', 'name':'ISSUE_INST_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_B_WH_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_B_WH_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_HAND_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_LOT_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
AF0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_h_JOB_ODR_DETAIL_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AF0010010view1_sortable).append("}").append(",");
%>
<%
 int aAF0010010StructLength = aAF0010010Control.getListsize();
 final AF0010010Struct structBackup = aAF0010010Struct;
 aAF0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAF0010010StructLength; ++loopCount) {
  if((aAF0010010Struct = (AF0010010Struct) aAF0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAF0010010Struct", aAF0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AF0010010view1_DB.append("[");
 AF0010010view1_DB.append(loopCount);
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_NAME\" data-name=\"ISSUE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_STATUS_DN-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_STATUS_DN\" data-name=\"l_STATUS_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_STATUS_DN())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_PLANT_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_ISSUE_INST_CD\" data-name=\"l_ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_ISSUE_INST_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_ITEM_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_ITEM_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_INST_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_INST_QTY\" data-name=\"ISSUE_INST_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_INST_QTY())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-TOTAL_ISSUE_QTY\" data-name=\"TOTAL_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0010010Struct.getTOTAL_ISSUE_QTY())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-w_SHIP_REMAIN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-w_SHIP_REMAIN_QTY\" data-name=\"w_SHIP_REMAIN_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0010010Struct.getw_SHIP_REMAIN_QTY())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-STOCK_UNIT\" data-name=\"STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getSTOCK_UNIT())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-SCDL_ISSUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-SCDL_ISSUE_DATE\" data-name=\"SCDL_ISSUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getSCDL_ISSUE_DATE())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_CMPLT_DATE\" data-name=\"ISSUE_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_CMPLT_DATE())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_CMPLT_FLG-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_CMPLT_FLG\" data-name=\"ISSUE_CMPLT_FLG\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_CMPLT_FLG())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_CMPLT_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_CMPLT_NAME\" data-name=\"ISSUE_CMPLT_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_CMPLT_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_TYP\" data-name=\"ISSUE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_TYP())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_WH_CD\" data-name=\"l_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_WH_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_WH_NAME\" data-name=\"l_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_WH_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-CONS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-CONS_TYP\" data-name=\"CONS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getCONS_TYP())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-CONS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-CONS_NAME\" data-name=\"CONS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getCONS_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-JOB_ODR_CD\" data-name=\"JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getJOB_ODR_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-s_OPR_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-s_OPR_INST_CD\" data-name=\"s_OPR_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.gets_OPR_INST_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_WS_CD\" data-name=\"l_WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_WS_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-WS_NAME\" data-name=\"WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getWS_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-WORK_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-WORK_ODR_CD\" data-name=\"WORK_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getWORK_ODR_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-WORK_IN_PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-WORK_IN_PROC_CD\" data-name=\"WORK_IN_PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getWORK_IN_PROC_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-PROC_NAME\" data-name=\"PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getPROC_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_PUCH_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_PUCH_ODR_CD\" data-name=\"l_PUCH_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_PUCH_ODR_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_VEND_CD\" data-name=\"l_VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_VEND_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-VEND_ANAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-VEND_ANAME\" data-name=\"VEND_ANAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getVEND_ANAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-OD_NO\" data-name=\"OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getOD_NO())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-PS_EDITION-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-PS_EDITION\" data-name=\"PS_EDITION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getPS_EDITION())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_INST_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_INST_UNIT_NUMERATOR\" data-name=\"ISSUE_INST_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_INST_UNIT_NUMERATOR())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_INST_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_INST_UNIT_DENOMINATOR\" data-name=\"ISSUE_INST_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_INST_UNIT_DENOMINATOR())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-ISSUE_INST_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-ISSUE_INST_COMMENT\" data-name=\"ISSUE_INST_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getISSUE_INST_COMMENT())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_h_B_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_h_B_WH_CD\" data-name=\"l_h_B_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_h_B_WH_CD())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_h_B_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_h_B_WH_NAME\" data-name=\"l_h_B_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_h_B_WH_NAME())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_h_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_h_HAND_QTY\" data-name=\"l_h_HAND_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_h_HAND_QTY())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_h_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_h_LOT_NO\" data-name=\"l_h_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_h_LOT_NO())).append("</span>'");
 AF0010010view1_DB.append(",").append("'<span id=\"expj-AF0010010-AF0010010view1-l_h_JOB_ODR_DETAIL_NO-").append(loopCount).append("\" class=\"expj-label expj-AF0010010-AF0010010view1-l_h_JOB_ODR_DETAIL_NO\" data-name=\"l_h_JOB_ODR_DETAIL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAF0010010Struct.getl_h_JOB_ODR_DETAIL_NO())).append("</span>'");
 AF0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAF0010010StructLength) {
   AF0010010view1_DB.append(",");
  }
 }
 aAF0010010Struct = structBackup;
 viewIdList.add(AF0010010view1_Id);
 viewSelectList.add(AF0010010view1_select);
 viewResizeList.add(AF0010010view1_resize);
 viewScrollList.add(AF0010010view1_scroll);
 viewHeaderDataList.add(AF0010010view1_HB);
 viewBodyDataList.add(AF0010010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame18 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19 button-area" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 748px);"><script class="expj-script-AF0010010-AF0010010button2">
expj.AF0010010.AF0010010button2 = {};
expj.AF0010010.AF0010010button2.executeAllOnDecision = function () {
  console.log('execute AF0010010button2.onDecision');
};
expj.AF0010010.AF0010010button2.executeOnLoad = function () {
  expj.AF0010010.AF0010010button2.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button2.executePScriptOnLoad = function () {
  console.log('execute AF0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0010010-AF0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0010010-AF0010010button2-CheckAll">
expj.AF0010010.AF0010010button2.CheckAll = {};
// script1="onClick;0;DGSALL;AF0010010view1"
expj.AF0010010.AF0010010button2.CheckAll.onClick0 = function () {
  console.log('CheckAll script1');
expj.common.pscript.selectVIEWAllRow('AF0010010', 'AF0010010view1');
};
expj.AF0010010.AF0010010button2.CheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010button2.CheckAll['onClick' + i])) {
        expj.AF0010010.AF0010010button2.CheckAll['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010button2.CheckAll.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010button2.CheckAll.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010button2-CheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010button2', 'CheckAll', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010button2.CheckAll.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button2.CheckAll.executePScriptOnLoad = function () {
  console.log('execute AF0010010button2/CheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010button2-CheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0010010-AF0010010button2-CheckAll" name="CheckAll" class="AF0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCheckAll",rb)%></button><!-- 全選択ボタン --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010button2-UncheckAll">
expj.AF0010010.AF0010010button2.UncheckAll = {};
// script1="onClick;0;DGSCANCEL;AF0010010view1"
expj.AF0010010.AF0010010button2.UncheckAll.onClick0 = function () {
  console.log('UncheckAll script1');
expj.common.pscript.unselectVIEWAllRow('AF0010010', 'AF0010010view1');
};
expj.AF0010010.AF0010010button2.UncheckAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010button2.UncheckAll['onClick' + i])) {
        expj.AF0010010.AF0010010button2.UncheckAll['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010button2.UncheckAll.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010button2.UncheckAll.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010button2-UncheckAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010button2', 'UncheckAll', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010button2.UncheckAll.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button2.UncheckAll.executePScriptOnLoad = function () {
  console.log('execute AF0010010button2/UncheckAll.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010button2-UncheckAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0010010-AF0010010button2-UncheckAll" name="UncheckAll" class="AF0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClearAssort",rb)%></button><!-- 選択解除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 413px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0010010 Revision: 1.16  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AF0010010-AF0010010button0">
expj.AF0010010.AF0010010button0 = {};
expj.AF0010010.AF0010010button0.executeAllOnDecision = function () {
  console.log('execute AF0010010button0.onDecision');
};
expj.AF0010010.AF0010010button0.executeOnLoad = function () {
  expj.AF0010010.AF0010010button0.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button0.executePScriptOnLoad = function () {
  console.log('execute AF0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0010010-AF0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0010010-AF0010010button0-print">
expj.AF0010010.AF0010010button0.print = {};
// script1="onClick;0;CHK;?AF0010010form1/*[eq]NORMAL@*0,*2"
expj.AF0010010.AF0010010button0.print.onClick0 = function () {
  console.log('print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;0;CHK;?AF0010010form1/PLANT_CD[eq]SAME[and]?AF0010010form1/w_WS_CD[eq]SAME[and]?AF0010010form1/w_VEND_CD[eq]SAME[and]?AF0010010form1/c1_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c2_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c3_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c4_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/c5_WORK_STS_TYP[eq]SAME[and]?AF0010010form1/OPR_INST_CD[eq]SAME[and]?AF0010010form1/PUCH_ODR_CD[eq]SAME[and]?AF0010010form1/ISSUE_INST_CD[eq]SAME[and]?AF0010010form1/scdl_issue_date_from[eq]SAME[and]?AF0010010form1/scdl_issue_date_to[eq]SAME[and]?AF0010010form1/B_WH_CD[eq]SAME[and]?AF0010010form1/B_WH_NAME[eq]SAME[and]?AF0010010form1/WH_CD[eq]SAME[and]?AF0010010form1/WH_NAME[eq]SAME[and]?AF0010010form1/ITEM_CD[eq]SAME[and]?AF0010010form1/ITEM_NAME[eq]SAME[and]?AF0010010form1/c1_ISSUE_TYP[eq]SAME[and]?AF0010010form1/c2_ISSUE_TYP[eq]SAME[and]?AF0010010form1/c3_ISSUE_TYP[eq]SAME[and]?AF0010010form1/c_RE_PRINT[eq]SAME@*1,*2"
expj.AF0010010.AF0010010button0.print.child0 = function () {
  console.log('print script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/w_WS_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/w_VEND_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c1_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c2_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c3_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c4_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c5_WORK_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/ISSUE_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/scdl_issue_date_from'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/scdl_issue_date_to'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/B_WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/B_WH_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/WH_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/WH_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/ITEM_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/ITEM_NAME'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c1_ISSUE_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c2_ISSUE_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c3_ISSUE_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010form1/c_RE_PRINT'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;CHK;?AF0010010view1/?[neq]NOT_SELECTED@*4,*3"
expj.AF0010010.AF0010010button0.print.child1 = function () {
  console.log('print script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0010010', 'AF0010010button0', '?AF0010010view1/?'), '[neq]', 'NOT_SELECTED')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;2;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AF0010010form1/*@AF0010010Servlet:C,M,M"
expj.AF0010010.AF0010010button0.print.child2 = function () {
  console.log('print script4');
expj.common.pscript.viewPrinterDialog('AF0010010', 'AF0010010button0', '_AF0010010form1/*', 'AF0010010Servlet', 'C,M,M');
};
// script5="child;3;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AF0010010form1/*,_AF0010010view1/*@AF0010010Servlet:U,C,M"
expj.AF0010010.AF0010010button0.print.child3 = function () {
  console.log('print script5');
expj.common.pscript.viewPrinterDialog('AF0010010', 'AF0010010button0', '_AF0010010form1/*,_AF0010010view1/*', 'AF0010010Servlet', 'U,C,M');
};
// script6="child;4;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AF0010010form1/*,_AF0010010view1/+@AF0010010Servlet:U,U,C"
expj.AF0010010.AF0010010button0.print.child4 = function () {
  console.log('print script6');
expj.common.pscript.viewPrinterDialog('AF0010010', 'AF0010010button0', '_AF0010010form1/*,_AF0010010view1/+', 'AF0010010Servlet', 'U,U,C');
};
expj.AF0010010.AF0010010button0.print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010button0.print['onClick' + i])) {
        expj.AF0010010.AF0010010button0.print['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010button0.print.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010button0.print.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010button0-print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010button0', 'print', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010button0.print.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button0.print.executePScriptOnLoad = function () {
  console.log('execute AF0010010button0/print.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010button0-print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0010010-AF0010010button0-print" name="print" class="AF0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010button0-csv">
expj.AF0010010.AF0010010button0.csv = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0010010form1/*,_AF0010010view1/*@AF0010010Servlet,,$ZZ07011"
expj.AF0010010.AF0010010button0.csv.onClick0 = function () {
  console.log('csv script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0010010', 'AF0010010button0', '_AF0010010form1/*,_AF0010010view1/*', 'AF0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0010010', response);
expj.common.updateBusinessScreenTab('AF0010010', contents);
};
expj.common.pscript.callConfirm('AF0010010', 'AF0010010button0', 'ZZ07011', okEvent);
};
expj.AF0010010.AF0010010button0.csv.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010button0.csv['onClick' + i])) {
        expj.AF0010010.AF0010010button0.csv['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010button0.csv.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010button0.csv.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010button0-csv').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010button0', 'csv', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010button0.csv.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button0.csv.executePScriptOnLoad = function () {
  console.log('execute AF0010010button0/csv.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010button0-csv');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0010010-AF0010010button0-csv" name="csv" class="AF0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- ＣＳＶ出力ボタン --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010button0-clear">
expj.AF0010010.AF0010010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0010010Servlet,,$ZZ07008"
expj.AF0010010.AF0010010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0010010', 'AF0010010button0', '', 'AF0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0010010', response);
expj.common.updateBusinessScreenTab('AF0010010', contents);
};
expj.common.pscript.callConfirm('AF0010010', 'AF0010010button0', 'ZZ07008', okEvent);
};
expj.AF0010010.AF0010010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010button0.clear['onClick' + i])) {
        expj.AF0010010.AF0010010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010button0.clear.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010button0.clear.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010button0', 'clear', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010button0.clear.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AF0010010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0010010-AF0010010button0-clear" name="clear" class="AF0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0010010-AF0010010button0-close">
expj.AF0010010.AF0010010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AF0010010.AF0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AF0010010');
};
expj.AF0010010.AF0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0010010.AF0010010button0.close['onClick' + i])) {
        expj.AF0010010.AF0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AF0010010.AF0010010button0.close.executeAllOnDecision = function () {
};
expj.AF0010010.AF0010010button0.close.executeOnLoad = function () {
  $('#expj-AF0010010-AF0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0010010', 'AF0010010button0', 'close', this, 'Button');
    }
  });
  expj.AF0010010.AF0010010button0.close.executePScriptOnLoad();
};

expj.AF0010010.AF0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute AF0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AF0010010-AF0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0010010-AF0010010button0-close" name="close" class="AF0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0010010 (END)-->
<%
MessageStruct msgStruct = aAF0010010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0010010)) {
  expj.common.treeInstanceMap.AF0010010 = {};
}
expj.common.treeInstanceMap.AF0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0010010)) {
  expj.common.detailDialogMap.AF0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0010010)) {
  expj.common.viewInstanceMap.AF0010010 = {};
}
expj.common.viewInstanceMap.AF0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0010010.<%=viewId %>.init = function () {
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
    expj.AF0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0010010_init">
/**
 * AF0010010用のロード完了時初期化関数
 */
expj.AF0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0010010');
  expj.common.calendarInstanceMap.AF0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0010010.AF0010010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.w_WS_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerWWsCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.w_WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.h_issue_cmplt_flg.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.w_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerWVendCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.w_VEND_ANAME.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerOprInstCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c1_ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c1_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c2_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c2_ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c3_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c4_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.ISSUE_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerIssueInstCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c3_ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c5_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.scdl_issue_date_from.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.CalendarFromDate.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.scdl_issue_time_from.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.scdl_issue_date_to.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.CalendarToDate.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.scdl_issue_time_to.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.c_RE_PRINT.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.B_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerBWhCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.B_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button1.select.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button2.CheckAll.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button2.UncheckAll.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button0.print.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button0.csv.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010form1.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button1.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010view1.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button2.executeOnLoad();}catch(e){};
  try{expj.AF0010010.AF0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0010010', 'AF0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0010010', '<%=request.getContextPath() %>');
};

/**
 * AF0010010の全体onDecision処理
 */
expj.AF0010010.executeAllOnDecision = function () {
  expj.AF0010010.AF0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0010010_console">
expj.AF0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>