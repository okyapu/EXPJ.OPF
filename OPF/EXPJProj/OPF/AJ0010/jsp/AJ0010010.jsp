<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:43:24 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AJ0010\AJ0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AJ0010.*" %>
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
<jsp:useBean id="aAJ0010010Control" class="com.nec.jp.orteus.metamorBase.AJ0010.AJ0010010Control" scope="request"/>
<jsp:useBean id="aAJ0010010Struct" class="com.nec.jp.orteus.metamorBase.AJ0010.AJ0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

オーダ別進捗一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0010/jsp/AJ0010010.jsp,v $
$Author: geng-jia $	
$Revision: 1.15 $ $Date: 2017/02/22 02:06:10 $
********************************************************* --%>
<html>
<head>
<title>オーダ別進捗一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AJ0020010Servlet", so);
ScreenMoveUtil su2 = new ScreenMoveUtil("AJ0030010Servlet", so);
ScreenMoveUtil su3 = new ScreenMoveUtil("AJ0040010Servlet", so);
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
<script class="expj-script-AJ0010010_init">
  // AJ0010010名前空間
  expj.AJ0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AJ0010010" data-screen="AJ0010010" data-newdata="<%=aAJ0010010Control.isNewData() %>">
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
              <script class="expj-script-AJ0010010-AJ0010010form1">
expj.AJ0010010.AJ0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.AJ0010010.AJ0010010form1.onLoad0 = function () {
  console.log('AJ0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHKRQ;?AJ0010010view1/?[neq]NOT_SELECTED@*0,*3"
expj.AJ0010010.AJ0010010form1.onDecision0 = function () {
  console.log('AJ0010010form1 script2');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;0;CHK;?AJ0010010form1/PLANT_CD[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_TO[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_TO[eq]SAME[and]?AJ0010010form1/r1_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r2_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r3_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/c1_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c1_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c3_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/JOB_ODR_CD[eq]SAME[and]?AJ0010010form1/ITEM_CD[eq]SAME@*1,*3"
expj.AJ0010010.AJ0010010form1.child0 = function () {
  console.log('AJ0010010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r1_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r2_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r3_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c3_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHK;_AJ0010010view1/l_JOB_ODR_CD[neq][and]_AJ0010010view1/l_JOB_ODR_CANCEL_NO[neq]@*2,*3"
expj.AJ0010010.AJ0010010form1.child1 = function () {
  console.log('AJ0010010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010view1/l_JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010view1/l_JOB_ODR_CANCEL_NO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_AJ0010010button2/JobOdrProgLst"
expj.AJ0010010.AJ0010010form1.child2 = function () {
  console.log('AJ0010010form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button2/JobOdrProgLst');
};
// script6="child;3;MASK;_AJ0010010button2/JobOdrProgLst"
expj.AJ0010010.AJ0010010form1.child3 = function () {
  console.log('AJ0010010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button2/JobOdrProgLst');
};
// script7="onDecision;1;CHKRQ;?AJ0010010view1/?[neq]NOT_SELECTED@*4,*7"
expj.AJ0010010.AJ0010010form1.onDecision1 = function () {
  console.log('AJ0010010form1 script7');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;4;CHK;?AJ0010010form1/PLANT_CD[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_TO[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_TO[eq]SAME[and]?AJ0010010form1/r1_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r2_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r3_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/c1_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c1_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c3_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/JOB_ODR_CD[eq]SAME[and]?AJ0010010form1/ITEM_CD[eq]SAME@*5,*7"
expj.AJ0010010.AJ0010010form1.child4 = function () {
  console.log('AJ0010010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r1_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r2_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r3_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c3_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;5;CHK;_AJ0010010view1/l_WORK_IN_PROC_QTY[gt]0[and]_AJ0010010view1/l_OPR_RSLT_TYP[eq]2@*6,*7"
expj.AJ0010010.AJ0010010form1.child5 = function () {
  console.log('AJ0010010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010view1/l_WORK_IN_PROC_QTY')), '[gt]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010view1/l_OPR_RSLT_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;UNMASK;_AJ0010010button2/WorkProgLst"
expj.AJ0010010.AJ0010010form1.child6 = function () {
  console.log('AJ0010010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button2/WorkProgLst');
};
// script11="child;7;MASK;_AJ0010010button2/WorkProgLst"
expj.AJ0010010.AJ0010010form1.child7 = function () {
  console.log('AJ0010010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button2/WorkProgLst');
};
// script12="onDecision;2;CHKRQ;?AJ0010010view1/?[neq]NOT_SELECTED@*8,*11"
expj.AJ0010010.AJ0010010form1.onDecision2 = function () {
  console.log('AJ0010010form1 script12');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="child;8;CHK;?AJ0010010form1/PLANT_CD[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_TO[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_TO[eq]SAME[and]?AJ0010010form1/r1_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r2_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r3_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/c1_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c1_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c3_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/JOB_ODR_CD[eq]SAME[and]?AJ0010010form1/ITEM_CD[eq]SAME@*9,*11"
expj.AJ0010010.AJ0010010form1.child8 = function () {
  console.log('AJ0010010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r1_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r2_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r3_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c3_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;9;CHK;_AJ0010010view1/l_RLSD_PUCH_ODR_QTY[gt]0@*10,*11"
expj.AJ0010010.AJ0010010form1.child9 = function () {
  console.log('AJ0010010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010view1/l_RLSD_PUCH_ODR_QTY')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;10;UNMASK;_AJ0010010button2/PuchProgLst"
expj.AJ0010010.AJ0010010form1.child10 = function () {
  console.log('AJ0010010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button2/PuchProgLst');
};
// script16="child;11;MASK;_AJ0010010button2/PuchProgLst"
expj.AJ0010010.AJ0010010form1.child11 = function () {
  console.log('AJ0010010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button2/PuchProgLst');
};
// script17="onDecision;3;CHK;?AJ0010010form1/*[eq]NORMAL@*12,*14"
expj.AJ0010010.AJ0010010form1.onDecision3 = function () {
  console.log('AJ0010010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script18="child;12;CHK;?AJ0010010form1/PLANT_CD[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_DUE_DATE_TO[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_FROM[eq]SAME[and]?AJ0010010form1/PRD_START_DATE_TO[eq]SAME[and]?AJ0010010form1/r1_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r2_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/r3_MRP_ODR_TYP[eq]SAME[and]?AJ0010010form1/c1_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_PROGRESS_STS_TYP[eq]SAME[and]?AJ0010010form1/c1_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c2_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/c3_ODR_STS_TYP[eq]SAME[and]?AJ0010010form1/JOB_ODR_CD[eq]SAME[and]?AJ0010010form1/ITEM_CD[eq]SAME@*13,*14"
expj.AJ0010010.AJ0010010form1.child12 = function () {
  console.log('AJ0010010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_DUE_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_FROM'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/PRD_START_DATE_TO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r1_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r2_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/r3_MRP_ODR_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_PROGRESS_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c1_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c2_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/c3_ODR_STS_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '?AJ0010010form1/ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script19="child;13;UNMASK;_AJ0010010button0/CsvOut"
expj.AJ0010010.AJ0010010form1.child13 = function () {
  console.log('AJ0010010form1 script19');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button0/CsvOut');
};
// script20="child;14;MASK;_AJ0010010button0/CsvOut"
expj.AJ0010010.AJ0010010form1.child14 = function () {
  console.log('AJ0010010form1 script20');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010button0/CsvOut');
};
// script21="onDecision;4;CHK;_AJ0010010form1/r1_MRP_ODR_TYP[eq]true@*15,*18"
expj.AJ0010010.AJ0010010form1.onDecision4 = function () {
  console.log('AJ0010010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/r1_MRP_ODR_TYP'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script22="child;15;MASK;_AJ0010010form1/JOB_ODR_CD@*16"
expj.AJ0010010.AJ0010010form1.child15 = function () {
  console.log('AJ0010010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script23="child;16;SET;_AJ0010010form1/JOB_ODR_CD=@*17"
expj.AJ0010010.AJ0010010form1.child16 = function () {
  console.log('AJ0010010form1 script23');
expj.common.pscript.setReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script24="child;17;MASK;_AJ0010010form1/PeekerJOB_ODR_CD"
expj.AJ0010010.AJ0010010form1.child17 = function () {
  console.log('AJ0010010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PeekerJOB_ODR_CD');
};
// script25="child;18;UNMASK;_AJ0010010form1/JOB_ODR_CD@*19"
expj.AJ0010010.AJ0010010form1.child18 = function () {
  console.log('AJ0010010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child19)){this.child19();}}
};
// script26="child;19;UNMASK;_AJ0010010form1/PeekerJOB_ODR_CD"
expj.AJ0010010.AJ0010010form1.child19 = function () {
  console.log('AJ0010010form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PeekerJOB_ODR_CD');
};
// script27="onDecision;5;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*20,*21"
expj.AJ0010010.AJ0010010form1.onDecision5 = function () {
  console.log('AJ0010010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script28="child;20;UNMASK;_AJ0010010form1/PRD_DUE_TIME_FROM,_AJ0010010form1/PRD_DUE_TIME_TO,_AJ0010010form1/PRD_START_TIME_FROM,_AJ0010010form1/PRD_START_TIME_TO"
expj.AJ0010010.AJ0010010form1.child20 = function () {
  console.log('AJ0010010form1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_DUE_TIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_DUE_TIME_TO');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_START_TIME_FROM');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_START_TIME_TO');
};
// script29="child;21;MASK;_AJ0010010form1/PRD_DUE_TIME_FROM,_AJ0010010form1/PRD_DUE_TIME_TO,_AJ0010010form1/PRD_START_TIME_FROM,_AJ0010010form1/PRD_START_TIME_TO"
expj.AJ0010010.AJ0010010form1.child21 = function () {
  console.log('AJ0010010form1 script29');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_DUE_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_DUE_TIME_TO');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_START_TIME_FROM');
expj.common.pscript.setMaskToReferenceComponent('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PRD_START_TIME_TO');
};
expj.AJ0010010.AJ0010010form1.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1['onDecision' + i])) {
        expj.AJ0010010.AJ0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.executeOnLoad = function () {
  expj.AJ0010010.AJ0010010form1.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1['onLoad' + i])) {
      expj.AJ0010010.AJ0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AJ0010010-AJ0010010form1" action="AJ0010010Servlet" name="AJ0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAJ0010010Control.getReadStatusString()) %>" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:150px;align:right"></div>
<div class="div-td" style="width:110px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:18px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:20px;align:center"></div>
<div class="div-td" style="width:34px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:20px;align:right"></div>
<div class="div-td" style="width:90px;align:right"></div>
<div class="div-td" style="width:80px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0056",rb)%></span><!-- 表示対象 --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-r1_MRP_ODR_TYP">
expj.AJ0010010.AJ0010010form1.r1_MRP_ODR_TYP = {};
expj.AJ0010010.AJ0010010form1.r1_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/r1_MRP_ODR_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.r1_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-r1_MRP_ODR_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'r1_MRP_ODR_TYP', this, 'RadioButton');
    }
  });
  expj.AJ0010010.AJ0010010form1.r1_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.r1_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/r1_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-r1_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="radio" name="r_MRP_ODR_TYP" data-name="r1_MRP_ODR_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getr1_MRP_ODR_TYP())) || "".equals(TypeConverter.convert(aAJ0010010Struct.getr1_MRP_ODR_TYP())))?"checked=\"checked\"": "" %> class="" id="expj-AJ0010010-AJ0010010form1-r1_MRP_ODR_TYP" ><label for="expj-AJ0010010-AJ0010010form1-r1_MRP_ODR_TYP"><%=CoreTools.getRBString("Expj.Cmt0236",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-r2_MRP_ODR_TYP">
expj.AJ0010010.AJ0010010form1.r2_MRP_ODR_TYP = {};
expj.AJ0010010.AJ0010010form1.r2_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/r2_MRP_ODR_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.r2_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-r2_MRP_ODR_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'r2_MRP_ODR_TYP', this, 'RadioButton');
    }
  });
  expj.AJ0010010.AJ0010010form1.r2_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.r2_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/r2_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-r2_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:18px;text-align:left;"><input type="radio" name="r_MRP_ODR_TYP" data-name="r2_MRP_ODR_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getr2_MRP_ODR_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-AJ0010010-AJ0010010form1-r2_MRP_ODR_TYP" ><label for="expj-AJ0010010-AJ0010010form1-r2_MRP_ODR_TYP"><%=CoreTools.getRBString("Expj.Cmt0237",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-r3_MRP_ODR_TYP">
expj.AJ0010010.AJ0010010form1.r3_MRP_ODR_TYP = {};
expj.AJ0010010.AJ0010010form1.r3_MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/r3_MRP_ODR_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.r3_MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-r3_MRP_ODR_TYP').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'r3_MRP_ODR_TYP', this, 'RadioButton');
    }
  });
  expj.AJ0010010.AJ0010010form1.r3_MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.r3_MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/r3_MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-r3_MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="r_MRP_ODR_TYP" data-name="r3_MRP_ODR_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getr3_MRP_ODR_TYP())))?"checked=\"checked\"":"" %> class="" id="expj-AJ0010010-AJ0010010form1-r3_MRP_ODR_TYP" ><label for="expj-AJ0010010-AJ0010010form1-r3_MRP_ODR_TYP"><%=CoreTools.getRBString("Expj.Cmt0238",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:90px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:80px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PLANT_CD">
expj.AJ0010010.AJ0010010form1.PLANT_CD = {};
expj.AJ0010010.AJ0010010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PLANT_CD.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PLANT_CD', this);
  });
  expj.AJ0010010.AJ0010010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PLANT_CD" name="PLANT_CD" class="AJ0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PeekerPlantCd">
expj.AJ0010010.AJ0010010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AJ0010010form1/PLANT_CD@<%=contextNo%>"
expj.AJ0010010.AJ0010010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AJ0010010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AJ0010010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AJ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AJ0010010.AJ0010010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1.PeekerPlantCd['onClick' + i])) {
        expj.AJ0010010.AJ0010010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0010010-AJ0010010form1-PeekerPlantCd" class="AJ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PLANT_NAME">
expj.AJ0010010.AJ0010010form1.PLANT_NAME = {};
expj.AJ0010010.AJ0010010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PLANT_NAME.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PLANT_NAME', this);
  });
  expj.AJ0010010.AJ0010010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:370px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PLANT_NAME" name="PLANT_NAME" class="AJ0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:80px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></span><!-- 製造納期 --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_DUE_DATE_FROM">
expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_FROM = {};
expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_DUE_DATE_FROM.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_FROM.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_DUE_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_DUE_DATE_FROM', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_FROM.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_DUE_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_DUE_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_DUE_DATE_FROM" name="PRD_DUE_DATE_FROM" class="AJ0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_DUE_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-CalendarPrdDueDateFrom">
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom = {};
// script1="onClick;0;CALENDAR;_AJ0010010form1/PRD_DUE_DATE_FROM"
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom.onClick0 = function () {
  console.log('CalendarPrdDueDateFrom script1');
expj.common.pscript.executeCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_DUE_DATE_FROM');
};
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom['onClick' + i])) {
        expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-CalendarPrdDueDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'CalendarPrdDueDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_DUE_DATE_FROM');
  expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/CalendarPrdDueDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-CalendarPrdDueDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0010010-AJ0010010form1-CalendarPrdDueDateFrom" class="AJ0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_DUE_TIME_FROM">
expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_FROM = {};
expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_DUE_TIME_FROM.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_FROM.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_DUE_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_DUE_TIME_FROM', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_FROM.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_DUE_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_DUE_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_DUE_TIME_FROM" name="PRD_DUE_TIME_FROM" class="AJ0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_DUE_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_DUE_DATE_TO">
expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_TO = {};
expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_DUE_DATE_TO.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_TO.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_DUE_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_DUE_DATE_TO', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_TO.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_DUE_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_DUE_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_DUE_DATE_TO" name="PRD_DUE_DATE_TO" class="AJ0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_DUE_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-CalendarPrdDueDateTo">
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo = {};
// script1="onClick;0;CALENDAR;_AJ0010010form1/PRD_DUE_DATE_TO"
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo.onClick0 = function () {
  console.log('CalendarPrdDueDateTo script1');
expj.common.pscript.executeCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_DUE_DATE_TO');
};
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo['onClick' + i])) {
        expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-CalendarPrdDueDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'CalendarPrdDueDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_DUE_DATE_TO');
  expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/CalendarPrdDueDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-CalendarPrdDueDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0010010-AJ0010010form1-CalendarPrdDueDateTo" class="AJ0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_DUE_TIME_TO">
expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_TO = {};
expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_TO.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_DUE_TIME_TO.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_TO.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_DUE_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_DUE_TIME_TO', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_TO.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_DUE_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_DUE_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_DUE_TIME_TO" name="PRD_DUE_TIME_TO" class="AJ0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_DUE_TIME_TO()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:90px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0436",rb)%></span><!-- 進捗ステータス --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-c1_PROGRESS_STS_TYP">
expj.AJ0010010.AJ0010010form1.c1_PROGRESS_STS_TYP = {};
expj.AJ0010010.AJ0010010form1.c1_PROGRESS_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/c1_PROGRESS_STS_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.c1_PROGRESS_STS_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-c1_PROGRESS_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'c1_PROGRESS_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AJ0010010.AJ0010010form1.c1_PROGRESS_STS_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.c1_PROGRESS_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/c1_PROGRESS_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-c1_PROGRESS_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;background-color:#FFCCCC"><input type="checkbox" name="c1_PROGRESS_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getc1_PROGRESS_STS_TYP())) || "".equals(TypeConverter.convert(aAJ0010010Struct.getc1_PROGRESS_STS_TYP())))?"checked=\"checked\"": "" %> class="AJ0010010-focus-move" id="expj-AJ0010010-AJ0010010form1-c1_PROGRESS_STS_TYP"><label for="expj-AJ0010010-AJ0010010form1-c1_PROGRESS_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0438",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRD_START_DATE",rb)%></span><!-- 製造着手日 --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_START_DATE_FROM">
expj.AJ0010010.AJ0010010form1.PRD_START_DATE_FROM = {};
expj.AJ0010010.AJ0010010form1.PRD_START_DATE_FROM.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_START_DATE_FROM.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_START_DATE_FROM.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_START_DATE_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_START_DATE_FROM', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_START_DATE_FROM.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_START_DATE_FROM.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_START_DATE_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_START_DATE_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_START_DATE_FROM" name="PRD_START_DATE_FROM" class="AJ0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_START_DATE_FROM()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-CalendarPrdStartDateFrom">
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom = {};
// script1="onClick;0;CALENDAR;_AJ0010010form1/PRD_START_DATE_FROM"
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom.onClick0 = function () {
  console.log('CalendarPrdStartDateFrom script1');
expj.common.pscript.executeCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_START_DATE_FROM');
};
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom['onClick' + i])) {
        expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-CalendarPrdStartDateFrom').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'CalendarPrdStartDateFrom', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_START_DATE_FROM');
  expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/CalendarPrdStartDateFrom.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-CalendarPrdStartDateFrom');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0010010-AJ0010010form1-CalendarPrdStartDateFrom" class="AJ0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_START_TIME_FROM">
expj.AJ0010010.AJ0010010form1.PRD_START_TIME_FROM = {};
expj.AJ0010010.AJ0010010form1.PRD_START_TIME_FROM.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_START_TIME_FROM.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_START_TIME_FROM.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_START_TIME_FROM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_START_TIME_FROM', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_START_TIME_FROM.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_START_TIME_FROM.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_START_TIME_FROM.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_START_TIME_FROM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_START_TIME_FROM" name="PRD_START_TIME_FROM" class="AJ0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_START_TIME_FROM()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0043",rb)%></span><!-- ～ --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_START_DATE_TO">
expj.AJ0010010.AJ0010010form1.PRD_START_DATE_TO = {};
expj.AJ0010010.AJ0010010form1.PRD_START_DATE_TO.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_START_DATE_TO.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_START_DATE_TO.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_START_DATE_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_START_DATE_TO', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_START_DATE_TO.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_START_DATE_TO.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_START_DATE_TO.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_START_DATE_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_START_DATE_TO" name="PRD_START_DATE_TO" class="AJ0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_START_DATE_TO()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-CalendarPrdStartDateTo">
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo = {};
// script1="onClick;0;CALENDAR;_AJ0010010form1/PRD_START_DATE_TO"
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo.onClick0 = function () {
  console.log('CalendarPrdStartDateTo script1');
expj.common.pscript.executeCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_START_DATE_TO');
};
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo['onClick' + i])) {
        expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-CalendarPrdStartDateTo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'CalendarPrdStartDateTo', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AJ0010010','AJ0010010form1','_AJ0010010form1/PRD_START_DATE_TO');
  expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/CalendarPrdStartDateTo.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-CalendarPrdStartDateTo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0010010-AJ0010010form1-CalendarPrdStartDateTo" class="AJ0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PRD_START_TIME_TO">
expj.AJ0010010.AJ0010010form1.PRD_START_TIME_TO = {};
expj.AJ0010010.AJ0010010form1.PRD_START_TIME_TO.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/PRD_START_TIME_TO.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.PRD_START_TIME_TO.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PRD_START_TIME_TO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'PRD_START_TIME_TO', this);
  });
  expj.AJ0010010.AJ0010010form1.PRD_START_TIME_TO.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PRD_START_TIME_TO.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PRD_START_TIME_TO.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PRD_START_TIME_TO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-PRD_START_TIME_TO" name="PRD_START_TIME_TO" class="AJ0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getPRD_START_TIME_TO()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:90px;text-align:right;"></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-c2_PROGRESS_STS_TYP">
expj.AJ0010010.AJ0010010form1.c2_PROGRESS_STS_TYP = {};
expj.AJ0010010.AJ0010010form1.c2_PROGRESS_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/c2_PROGRESS_STS_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.c2_PROGRESS_STS_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-c2_PROGRESS_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'c2_PROGRESS_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AJ0010010.AJ0010010form1.c2_PROGRESS_STS_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.c2_PROGRESS_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/c2_PROGRESS_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-c2_PROGRESS_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"><input type="checkbox" name="c2_PROGRESS_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getc2_PROGRESS_STS_TYP())) || "1".equals(TypeConverter.convert(aAJ0010010Struct.getc2_PROGRESS_STS_TYP())))?"checked=\"checked\"":"" %>  class="AJ0010010-focus-move" id="expj-AJ0010010-AJ0010010form1-c2_PROGRESS_STS_TYP"><label for="expj-AJ0010010-AJ0010010form1-c2_PROGRESS_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0439",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-JOB_ODR_CD">
expj.AJ0010010.AJ0010010form1.JOB_ODR_CD = {};
expj.AJ0010010.AJ0010010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/JOB_ODR_CD.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'JOB_ODR_CD', this);
  });
  expj.AJ0010010.AJ0010010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AJ0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AJ0010010-AJ0010010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AJ0010010-AJ0010010form1-TIME_CTRL">
expj.AJ0010010.AJ0010010form1.TIME_CTRL = {};
expj.AJ0010010.AJ0010010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/TIME_CTRL.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'TIME_CTRL', this);
  });
  expj.AJ0010010.AJ0010010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AJ0010010-AJ0010010form1-PeekerJOB_ODR_CD">
expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AJ0010010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AJ0010010';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AJ0010010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AJ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0010010-AJ0010010form1-PeekerJOB_ODR_CD" class="AJ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:90px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_STS_TYP",rb)%></span><!-- オーダ状態区分 --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-c1_ODR_STS_TYP">
expj.AJ0010010.AJ0010010form1.c1_ODR_STS_TYP = {};
expj.AJ0010010.AJ0010010form1.c1_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/c1_ODR_STS_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.c1_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-c1_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'c1_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AJ0010010.AJ0010010form1.c1_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.c1_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/c1_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-c1_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;background-color:#FFFF99"><input type="checkbox" name="c1_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getc1_ODR_STS_TYP())) || "1".equals(TypeConverter.convert(aAJ0010010Struct.getc1_ODR_STS_TYP())))?"checked=\"checked\"":"" %>  class="AJ0010010-focus-move" id="expj-AJ0010010-AJ0010010form1-c1_ODR_STS_TYP"><label for="expj-AJ0010010-AJ0010010form1-c1_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0440",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:150px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-ITEM_CD">
expj.AJ0010010.AJ0010010form1.ITEM_CD = {};
expj.AJ0010010.AJ0010010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/ITEM_CD.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'ITEM_CD', this);
  });
  expj.AJ0010010.AJ0010010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0010010-AJ0010010form1-ITEM_CD" name="ITEM_CD" class="AJ0010010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-PeekerITEM_CD">
expj.AJ0010010.AJ0010010form1.PeekerITEM_CD = {};
// script1="onClick;0;PEEKER;_AJ0010010form1/ITEM_CD@<%=contextNo%>"
expj.AJ0010010.AJ0010010form1.PeekerITEM_CD.onClick0 = function () {
  console.log('PeekerITEM_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AJ0010010';
var parameterValues = 'PeekerITEM_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010form1', '_AJ0010010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AJ0010010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AJ0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AJ0010010.AJ0010010form1.PeekerITEM_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010form1.PeekerITEM_CD['onClick' + i])) {
        expj.AJ0010010.AJ0010010form1.PeekerITEM_CD['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010form1.PeekerITEM_CD.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010form1.PeekerITEM_CD.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-PeekerITEM_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'PeekerITEM_CD', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010form1.PeekerITEM_CD.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.PeekerITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/PeekerITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-PeekerITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0010010-AJ0010010form1-PeekerITEM_CD" class="AJ0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span><!-- （ワイルドカード指定可） --></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AJ0010010-AJ0010010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAJ0010010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AJ0010010-AJ0010010form1-DOWNLOAD_FILE">
expj.AJ0010010.AJ0010010form1.DOWNLOAD_FILE = {};
expj.AJ0010010.AJ0010010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/DOWNLOAD_FILE.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0010010', 'AJ0010010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AJ0010010.AJ0010010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:90px;text-align:left;"></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-c2_ODR_STS_TYP">
expj.AJ0010010.AJ0010010form1.c2_ODR_STS_TYP = {};
expj.AJ0010010.AJ0010010form1.c2_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/c2_ODR_STS_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.c2_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-c2_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'c2_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AJ0010010.AJ0010010form1.c2_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.c2_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/c2_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-c2_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;background-color:#A9EA9E"><input type="checkbox" name="c2_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getc2_ODR_STS_TYP())) || "".equals(TypeConverter.convert(aAJ0010010Struct.getc2_ODR_STS_TYP())))?"checked=\"checked\"": "" %> class="AJ0010010-focus-move" id="expj-AJ0010010-AJ0010010form1-c2_ODR_STS_TYP"><label for="expj-AJ0010010-AJ0010010form1-c2_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0441",rb)%></label></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:110px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:18px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:34px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:90px;text-align:right;"></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010form1-c3_ODR_STS_TYP">
expj.AJ0010010.AJ0010010form1.c3_ODR_STS_TYP = {};
expj.AJ0010010.AJ0010010form1.c3_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0010010form1/c3_ODR_STS_TYP.onDecision');
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
  expj.AJ0010010.executeAllOnDecision();
};
expj.AJ0010010.AJ0010010form1.c3_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010form1-c3_ODR_STS_TYP').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010form1', 'c3_ODR_STS_TYP', this, 'CheckBox');
    }
  });
  expj.AJ0010010.AJ0010010form1.c3_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010form1.c3_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0010010form1/c3_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010form1-c3_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;background-color:#ADD8E6"><input type="checkbox" name="c3_ODR_STS_TYP" value="true" <%= ("true".equals(TypeConverter.convert(aAJ0010010Struct.getc3_ODR_STS_TYP())) || "1".equals(TypeConverter.convert(aAJ0010010Struct.getc3_ODR_STS_TYP())))?"checked=\"checked\"":"" %>  class="AJ0010010-focus-move" id="expj-AJ0010010-AJ0010010form1-c3_ODR_STS_TYP"><label for="expj-AJ0010010-AJ0010010form1-c3_ODR_STS_TYP"><%=CoreTools.getRBString("Expj.Cmt0013",rb)%></label></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AJ0010010-AJ0010010button1">
expj.AJ0010010.AJ0010010button1 = {};
expj.AJ0010010.AJ0010010button1.executeAllOnDecision = function () {
  console.log('execute AJ0010010button1.onDecision');
};
expj.AJ0010010.AJ0010010button1.executeOnLoad = function () {
  expj.AJ0010010.AJ0010010button1.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button1.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AJ0010010-AJ0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AJ0010010-AJ0010010button1-Select">
expj.AJ0010010.AJ0010010button1.Select = {};
// script1="onClick;0;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*0"
expj.AJ0010010.AJ0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*1"
expj.AJ0010010.AJ0010010button1.Select.onClick1 = function () {
  console.log('Select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*2"
expj.AJ0010010.AJ0010010button1.Select.onClick2 = function () {
  console.log('Select script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*3"
expj.AJ0010010.AJ0010010button1.Select.onClick3 = function () {
  console.log('Select script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*4"
expj.AJ0010010.AJ0010010button1.Select.onClick4 = function () {
  console.log('Select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*5"
expj.AJ0010010.AJ0010010button1.Select.onClick5 = function () {
  console.log('Select script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*6"
expj.AJ0010010.AJ0010010button1.Select.onClick6 = function () {
  console.log('Select script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_AJ0010010form1/TIME_CTRL[eq]true@*7"
expj.AJ0010010.AJ0010010button1.Select.onClick7 = function () {
  console.log('Select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_DUE_TIME_FROM)[eq]3@*8"
expj.AJ0010010.AJ0010010button1.Select.onClick8 = function () {
  console.log('Select script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="onClick;9;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_DUE_TIME_TO)[eq]3@*9"
expj.AJ0010010.AJ0010010button1.Select.onClick9 = function () {
  console.log('Select script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="onClick;10;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_START_TIME_FROM)[eq]3@*10"
expj.AJ0010010.AJ0010010button1.Select.onClick10 = function () {
  console.log('Select script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script12="onClick;11;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_START_TIME_TO)[eq]3@*11"
expj.AJ0010010.AJ0010010button1.Select.onClick11 = function () {
  console.log('Select script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="onClick;12;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_DUE_TIME_FROM)[eq]3@*12"
expj.AJ0010010.AJ0010010button1.Select.onClick12 = function () {
  console.log('Select script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="onClick;13;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_DUE_TIME_TO)[eq]3@*13"
expj.AJ0010010.AJ0010010button1.Select.onClick13 = function () {
  console.log('Select script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script15="onClick;14;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_START_TIME_FROM)[eq]3@*14"
expj.AJ0010010.AJ0010010button1.Select.onClick14 = function () {
  console.log('Select script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script16="onClick;15;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_START_TIME_TO)[eq]3@*15"
expj.AJ0010010.AJ0010010button1.Select.onClick15 = function () {
  console.log('Select script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script17="onClick;16;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_DUE_TIME_FROM)[eq]4@*16"
expj.AJ0010010.AJ0010010button1.Select.onClick16 = function () {
  console.log('Select script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script18="onClick;17;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_DUE_TIME_TO)[eq]4@*17"
expj.AJ0010010.AJ0010010button1.Select.onClick17 = function () {
  console.log('Select script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="onClick;18;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_START_TIME_FROM)[eq]4@*18"
expj.AJ0010010.AJ0010010button1.Select.onClick18 = function () {
  console.log('Select script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script20="onClick;19;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]~LEN(_AJ0010010form1/PRD_START_TIME_TO)[eq]4@*19"
expj.AJ0010010.AJ0010010button1.Select.onClick19 = function () {
  console.log('Select script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script21="onClick;20;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]_AJ0010010form1/PRD_DUE_DATE_FROM[eq]_AJ0010010form1/PRD_DUE_DATE_TO@*20"
expj.AJ0010010.AJ0010010button1.Select.onClick20 = function () {
  console.log('Select script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_TO'))) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script22="onClick;21;CHK;_AJ0010010form1/TIME_CTRL[eq]true[and]_AJ0010010form1/PRD_START_DATE_FROM[eq]_AJ0010010form1/PRD_START_DATE_TO@*22"
expj.AJ0010010.AJ0010010button1.Select.onClick21 = function () {
  console.log('Select script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_FROM'), '[eq]', expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_TO'))) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script23="onClick;22;CHK;_AJ0010010form1/PRD_DUE_DATE_FROM[neq][and]_AJ0010010form1/PRD_DUE_DATE_TO[neq]@*24"
expj.AJ0010010.AJ0010010button1.Select.onClick22 = function () {
  console.log('Select script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script24="onClick;23;CHK;_AJ0010010form1/PRD_START_DATE_FROM[neq][and]_AJ0010010form1/PRD_START_DATE_TO[neq]@*25"
expj.AJ0010010.AJ0010010button1.Select.onClick23 = function () {
  console.log('Select script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script25="onClick;24;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AJ0010010form1/*@AJ0010010Servlet"
expj.AJ0010010.AJ0010010button1.Select.onClick24 = function () {
  console.log('Select script25');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/*', 'AJ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AJ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AJ0010010', response);
expj.common.updateBusinessScreenTab('AJ0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script26="child;0;CHK;_AJ0010010form1/PRD_DUE_DATE_FROM[eq][and]_AJ0010010form1/PRD_DUE_TIME_FROM[neq]@!AS00069"
expj.AJ0010010.AJ0010010button1.Select.child0 = function () {
  console.log('Select script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00069');
}
};
// script27="child;1;CHK;_AJ0010010form1/PRD_DUE_DATE_TO[eq][and]_AJ0010010form1/PRD_DUE_TIME_TO[neq]@!AS00070"
expj.AJ0010010.AJ0010010button1.Select.child1 = function () {
  console.log('Select script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00070');
}
};
// script28="child;2;CHK;_AJ0010010form1/PRD_START_DATE_FROM[eq][and]_AJ0010010form1/PRD_START_TIME_FROM[neq]@!AS00071"
expj.AJ0010010.AJ0010010button1.Select.child2 = function () {
  console.log('Select script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_FROM'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00071');
}
};
// script29="child;3;CHK;_AJ0010010form1/PRD_START_DATE_TO[eq][and]_AJ0010010form1/PRD_START_TIME_TO[neq]@!AS00072"
expj.AJ0010010.AJ0010010button1.Select.child3 = function () {
  console.log('Select script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_TO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00072');
}
};
// script30="child;4;CHK;~LEN(_AJ0010010form1/PRD_DUE_TIME_FROM)[eq]1[or]~LEN(_AJ0010010form1/PRD_DUE_TIME_FROM)[eq]2@!AS00073"
expj.AJ0010010.AJ0010010button1.Select.child4 = function () {
  console.log('Select script30');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00073');
}
};
// script31="child;5;CHK;~LEN(_AJ0010010form1/PRD_DUE_TIME_TO)[eq]1[or]~LEN(_AJ0010010form1/PRD_DUE_TIME_TO)[eq]2@!AS00074"
expj.AJ0010010.AJ0010010button1.Select.child5 = function () {
  console.log('Select script31');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00074');
}
};
// script32="child;6;CHK;~LEN(_AJ0010010form1/PRD_START_TIME_FROM)[eq]1[or]~LEN(_AJ0010010form1/PRD_START_TIME_FROM)[eq]2@!AS00075"
expj.AJ0010010.AJ0010010button1.Select.child6 = function () {
  console.log('Select script32');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00075');
}
};
// script33="child;7;CHK;~LEN(_AJ0010010form1/PRD_START_TIME_TO)[eq]1[or]~LEN(_AJ0010010form1/PRD_START_TIME_TO)[eq]2@!AS00076"
expj.AJ0010010.AJ0010010button1.Select.child7 = function () {
  console.log('Select script33');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'), '[eq]', '2')) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00076');
}
};
// script34="child;8;SET;_AJ0010010form1/PRD_DUE_TIME_FROM=_AJ0010010form1/PRD_DUE_TIME_FROM"
expj.AJ0010010.AJ0010010button1.Select.child8 = function () {
  console.log('Select script34');
expj.common.pscript.setReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM', expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'));
};
// script35="child;9;SET;_AJ0010010form1/PRD_DUE_TIME_TO=_AJ0010010form1/PRD_DUE_TIME_TO"
expj.AJ0010010.AJ0010010button1.Select.child9 = function () {
  console.log('Select script35');
expj.common.pscript.setReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO', expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'));
};
// script36="child;10;SET;_AJ0010010form1/PRD_START_TIME_FROM=_AJ0010010form1/PRD_START_TIME_FROM"
expj.AJ0010010.AJ0010010button1.Select.child10 = function () {
  console.log('Select script36');
expj.common.pscript.setReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM', expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'));
};
// script37="child;11;SET;_AJ0010010form1/PRD_START_TIME_TO=_AJ0010010form1/PRD_START_TIME_TO"
expj.AJ0010010.AJ0010010button1.Select.child11 = function () {
  console.log('Select script37');
expj.common.pscript.setReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO', expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'));
};
// script38="child;12;CHK;[{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_FROM:1)}*10+{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_FROM:2)}][gte]60@!AS00077"
expj.AJ0010010.AJ0010010button1.Select.child12 = function () {
  console.log('Select script38');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00077');
}
};
// script39="child;13;CHK;[{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_TO:1)}*10+{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_TO:2)}][gte]60@!AS00078"
expj.AJ0010010.AJ0010010button1.Select.child13 = function () {
  console.log('Select script39');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00078');
}
};
// script40="child;14;CHK;[{~CHARAT(_AJ0010010form1/PRD_START_TIME_FROM:1)}*10+{~CHARAT(_AJ0010010form1/PRD_START_TIME_FROM:2)}][gte]60@!AS00079"
expj.AJ0010010.AJ0010010button1.Select.child14 = function () {
  console.log('Select script40');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00079');
}
};
// script41="child;15;CHK;[{~CHARAT(_AJ0010010form1/PRD_START_TIME_TO:1)}*10+{~CHARAT(_AJ0010010form1/PRD_START_TIME_TO:2)}][gte]60@!AS00080"
expj.AJ0010010.AJ0010010button1.Select.child15 = function () {
  console.log('Select script41');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00080');
}
};
// script42="child;16;CHK;[{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_FROM:0)}*10+{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_FROM:1)}][gte]24[or][{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_FROM:2)}*10+{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_FROM:3)}][gte]60@!AS00077"
expj.AJ0010010.AJ0010010button1.Select.child16 = function () {
  console.log('Select script42');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00077');
}
};
// script43="child;17;CHK;[{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_TO:0)}*10+{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_TO:1)}][gte]24[or][{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_TO:2)}*10+{~CHARAT(_AJ0010010form1/PRD_DUE_TIME_TO:3)}][gte]60@!AS00078"
expj.AJ0010010.AJ0010010button1.Select.child17 = function () {
  console.log('Select script43');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00078');
}
};
// script44="child;18;CHK;[{~CHARAT(_AJ0010010form1/PRD_START_TIME_FROM:0)}*10+{~CHARAT(_AJ0010010form1/PRD_START_TIME_FROM:1)}][gte]24[or][{~CHARAT(_AJ0010010form1/PRD_START_TIME_FROM:2)}*10+{~CHARAT(_AJ0010010form1/PRD_START_TIME_FROM:3)}][gte]60@!AS00079"
expj.AJ0010010.AJ0010010button1.Select.child18 = function () {
  console.log('Select script44');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00079');
}
};
// script45="child;19;CHK;[{~CHARAT(_AJ0010010form1/PRD_START_TIME_TO:0)}*10+{~CHARAT(_AJ0010010form1/PRD_START_TIME_TO:1)}][gte]24[or][{~CHARAT(_AJ0010010form1/PRD_START_TIME_TO:2)}*10+{~CHARAT(_AJ0010010form1/PRD_START_TIME_TO:3)}][gte]60@!AS00080"
expj.AJ0010010.AJ0010010button1.Select.child19 = function () {
  console.log('Select script45');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AS00080');
}
};
// script46="child;20;CHK;_AJ0010010form1/PRD_DUE_TIME_FROM[neq][and]_AJ0010010form1/PRD_DUE_TIME_TO[neq]@*21"
expj.AJ0010010.AJ0010010button1.Select.child20 = function () {
  console.log('Select script46');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script47="child;21;CHK;_AJ0010010form1/PRD_DUE_TIME_FROM[gt]_AJ0010010form1/PRD_DUE_TIME_TO@!AJ00003"
expj.AJ0010010.AJ0010010button1.Select.child21 = function () {
  console.log('Select script47');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_TIME_TO')))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AJ00003');
}
};
// script48="child;22;CHK;_AJ0010010form1/PRD_START_TIME_FROM[neq][and]_AJ0010010form1/PRD_START_TIME_TO[neq]@*23"
expj.AJ0010010.AJ0010010button1.Select.child22 = function () {
  console.log('Select script48');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script49="child;23;CHK;_AJ0010010form1/PRD_START_TIME_FROM[gt]_AJ0010010form1/PRD_START_TIME_TO@!AJ00006"
expj.AJ0010010.AJ0010010button1.Select.child23 = function () {
  console.log('Select script49');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_TIME_TO')))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AJ00006');
}
};
// script50="child;24;CHK;_AJ0010010form1/PRD_DUE_DATE_FROM[gt]_AJ0010010form1/PRD_DUE_DATE_TO@!AJ00003"
expj.AJ0010010.AJ0010010button1.Select.child24 = function () {
  console.log('Select script50');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_DUE_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AJ00003');
}
};
// script51="child;25;CHK;_AJ0010010form1/PRD_START_DATE_FROM[gt]_AJ0010010form1/PRD_START_DATE_TO@!AJ00006"
expj.AJ0010010.AJ0010010button1.Select.child25 = function () {
  console.log('Select script51');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_FROM')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0010010', 'AJ0010010button1', '_AJ0010010form1/PRD_START_DATE_TO')))) {
expj.common.pscript.viewErrorMessage('AJ0010010', 'AJ0010010button1', 'AJ00006');
}
};
expj.AJ0010010.AJ0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 24; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010button1.Select['onClick' + i])) {
        expj.AJ0010010.AJ0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010button1.Select.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010button1.Select.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010button1', 'Select', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010button1.Select.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0010010-AJ0010010button1-Select" name="Select" class="AJ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AJ0010010-AJ0010010view1">
expj.AJ0010010.AJ0010010view1 = {};
expj.AJ0010010.AJ0010010view1.executeAllOnClick = function () {
};
expj.AJ0010010.AJ0010010view1.executeAllOnDecision = function () {
  console.log('execute AJ0010010view1.onDecision');
};
expj.AJ0010010.AJ0010010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AJ0010010view1", "expj.AJ0010010.AJ0010010view1.executeAllOnClick");
%>
  expj.AJ0010010.AJ0010010view1.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010view1.executePScriptOnLoad = function () {
  console.log('execute AJ0010010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AJ0010010-AJ0010010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AJ0010010view1_Id = "AJ0010010view1";
 String AJ0010010view1_select = "single";
 String AJ0010010view1_sortable = "true";
 String AJ0010010view1_resize = "true";
 String AJ0010010view1_scroll = "true";
 StringBuffer AJ0010010view1_HB = new StringBuffer();
 StringBuffer AJ0010010view1_DB = new StringBuffer();
%>
<%
 AJ0010010view1_select = "single";
 AJ0010010view1_sortable = "true";
 AJ0010010view1_resize = "true";
 AJ0010010view1_scroll = "true";
%>
<%
 AJ0010010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
%>
       
<%
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0436",rb))).append("', 'name':'l_PROGRESS_STATUS_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_STS_TYP",rb))).append("', 'name':'l_ODR_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'160px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'l_OUTSIDE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'l_MRP_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PLANT_CD",rb))).append("', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'l_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_START_DATE",rb))).append("', 'name':'l_PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_START_DATE",rb))).append("', 'name':'l_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_2",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_RCV_QTY_2",rb))).append("', 'name':'l_TOTAL_RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_CMPLT_DATE_1",rb))).append("', 'name':'l_RCV_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb))).append("', 'name':'l_JOB_ODR_CANCEL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_TYP",rb))).append("', 'name':'l_JOB_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALC_GRP_CD",rb))).append("', 'name':'l_ALC_GRP_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_GNR_TYP",rb))).append("', 'name':'l_OD_GNR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0434",rb))).append("', 'name':'l_EXTERNAL_PLAN_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_RLSD_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_WORK_IN_PROC_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OPR_RSLT_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
AJ0010010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PROGRESS_STATUS', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0010010view1_sortable).append("}").append(",");
%>
<%
 int aAJ0010010StructLength = aAJ0010010Control.getListsize();
 final AJ0010010Struct structBackup = aAJ0010010Struct;
 aAJ0010010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAJ0010010StructLength; ++loopCount) {
  if((aAJ0010010Struct = (AJ0010010Struct) aAJ0010010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAJ0010010Struct", aAJ0010010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AJ0010010view1_DB.append("[");
 AJ0010010view1_DB.append(loopCount);
%> <%
String bgcolor = null;
if (aAJ0010010Struct.getl_PROGRESS_STATUS().intValue() == 2) {
	bgcolor="ADD8E6";
} else if (aAJ0010010Struct.getl_PROGRESS_STATUS().intValue() == 1) {
	bgcolor="FFCCCC";
} else {
	bgcolor="";
}
%> <%
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_PROGRESS_STATUS_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_PROGRESS_STATUS_DN\" data-name=\"l_PROGRESS_STATUS_DN\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_PROGRESS_STATUS_DN())).append("</span>'");
%> <%
bgcolor = null;
if (aAJ0010010Struct.getl_ODR_STS_TYP().intValue() == 0) {
	bgcolor="";
} else if (aAJ0010010Struct.getl_ODR_STS_TYP().intValue() == 1) {
	bgcolor="FFFF99";
} else if (aAJ0010010Struct.getl_ODR_STS_TYP().intValue() == 2) {
	bgcolor="A9EA9E";
} else if (aAJ0010010Struct.getl_ODR_STS_TYP().intValue() == 9) {
	bgcolor="ADD8E6";
} else {
	bgcolor="";
}
%> <%
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_ODR_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_ODR_STS_TYP_DN\" data-name=\"l_ODR_STS_TYP_DN\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_ODR_STS_TYP_DN())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_ITEM_CD())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_ITEM_NAME())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_OUTSIDE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_OUTSIDE_TYP_DN\" data-name=\"l_OUTSIDE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_OUTSIDE_TYP_DN())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_MRP_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_MRP_ODR_TYP_DN\" data-name=\"l_MRP_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_MRP_ODR_TYP_DN())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_PLANT_CD())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_PRD_DUE_DATE\" data-name=\"l_PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_PRD_DUE_DATE())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_PRD_START_DATE\" data-name=\"l_PRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_PRD_START_DATE())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_ODR_START_DATE\" data-name=\"l_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_ODR_START_DATE())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_ODR_QTY())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_TOTAL_RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_TOTAL_RCV_QTY\" data-name=\"l_TOTAL_RCV_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_TOTAL_RCV_QTY())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_STOCK_UNIT())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_RCV_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_RCV_CMPLT_DATE\" data-name=\"l_RCV_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_RCV_CMPLT_DATE())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_JOB_ODR_CD())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_JOB_ODR_CANCEL_NO-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_JOB_ODR_CANCEL_NO\" data-name=\"l_JOB_ODR_CANCEL_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_JOB_ODR_CANCEL_NO())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_JOB_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_JOB_ODR_TYP_DN\" data-name=\"l_JOB_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_JOB_ODR_TYP_DN())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_ALC_GRP_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_ALC_GRP_CD\" data-name=\"l_ALC_GRP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_ALC_GRP_CD())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_OD_GNR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_OD_GNR_TYP_DN\" data-name=\"l_OD_GNR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_OD_GNR_TYP_DN())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_EXTERNAL_PLAN_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_EXTERNAL_PLAN_CD\" data-name=\"l_EXTERNAL_PLAN_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_EXTERNAL_PLAN_CD())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_OD_NO\" data-name=\"l_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_OD_NO())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_RLSD_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_RLSD_PUCH_ODR_QTY\" data-name=\"l_RLSD_PUCH_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_RLSD_PUCH_ODR_QTY())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_WORK_IN_PROC_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_WORK_IN_PROC_QTY\" data-name=\"l_WORK_IN_PROC_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_WORK_IN_PROC_QTY())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_MRP_ODR_TYP\" data-name=\"l_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_MRP_ODR_TYP())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_OPR_RSLT_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_OPR_RSLT_TYP\" data-name=\"l_OPR_RSLT_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_OPR_RSLT_TYP())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_ODR_STS_TYP\" data-name=\"l_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_ODR_STS_TYP())).append("</span>'");
 AJ0010010view1_DB.append(",").append("'<span id=\"expj-AJ0010010-AJ0010010view1-l_PROGRESS_STATUS-").append(loopCount).append("\" class=\"expj-label expj-AJ0010010-AJ0010010view1-l_PROGRESS_STATUS\" data-name=\"l_PROGRESS_STATUS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0010010Struct.getl_PROGRESS_STATUS())).append("</span>'");
 AJ0010010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAJ0010010StructLength) {
   AJ0010010view1_DB.append(",");
  }
 }
 aAJ0010010Struct = structBackup;
 viewIdList.add(AJ0010010view1_Id);
 viewSelectList.add(AJ0010010view1_select);
 viewResizeList.add(AJ0010010view1_resize);
 viewScrollList.add(AJ0010010view1_scroll);
 viewHeaderDataList.add(AJ0010010view1_HB);
 viewBodyDataList.add(AJ0010010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AJ0010010-AJ0010010button2">
expj.AJ0010010.AJ0010010button2 = {};
expj.AJ0010010.AJ0010010button2.executeAllOnDecision = function () {
  console.log('execute AJ0010010button2.onDecision');
};
expj.AJ0010010.AJ0010010button2.executeOnLoad = function () {
  expj.AJ0010010.AJ0010010button2.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button2.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AJ0010010-AJ0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AJ0010010-AJ0010010button2-JobOdrProgLst">
expj.AJ0010010.AJ0010010button2.JobOdrProgLst = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AJ0010010view1/+@AJ0020010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AJ0010010.AJ0010010button2.JobOdrProgLst.onClick0 = function () {
  console.log('JobOdrProgLst script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0010010', 'AJ0010010button2', '_AJ0010010view1/+', 'AJ0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AJ0020010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AJ0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AJ0010010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AJ0010010.AJ0010010button2.JobOdrProgLst.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010button2.JobOdrProgLst['onClick' + i])) {
        expj.AJ0010010.AJ0010010button2.JobOdrProgLst['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010button2.JobOdrProgLst.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010button2.JobOdrProgLst.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010button2-JobOdrProgLst').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010button2', 'JobOdrProgLst', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010button2.JobOdrProgLst.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button2.JobOdrProgLst.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button2/JobOdrProgLst.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010button2-JobOdrProgLst');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0010010-AJ0010010button2-JobOdrProgLst" name="JobOdrProgLst" class="AJ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnJobOdrProgress",rb)%></button><!-- 製番別進捗ボタン --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010button2-WorkProgLst">
expj.AJ0010010.AJ0010010button2.WorkProgLst = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AJ0010010view1/+@AJ0030010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AJ0010010.AJ0010010button2.WorkProgLst.onClick0 = function () {
  console.log('WorkProgLst script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0010010', 'AJ0010010button2', '_AJ0010010view1/+', 'AJ0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AJ0030010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AJ0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AJ0010010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AJ0010010.AJ0010010button2.WorkProgLst.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010button2.WorkProgLst['onClick' + i])) {
        expj.AJ0010010.AJ0010010button2.WorkProgLst['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010button2.WorkProgLst.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010button2.WorkProgLst.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010button2-WorkProgLst').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010button2', 'WorkProgLst', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010button2.WorkProgLst.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button2.WorkProgLst.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button2/WorkProgLst.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010button2-WorkProgLst');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0010010-AJ0010010button2-WorkProgLst" name="WorkProgLst" class="AJ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnWorkInstProgress",rb)%></button><!-- 作業指示進捗ボタン --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010button2-PuchProgLst">
expj.AJ0010010.AJ0010010button2.PuchProgLst = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AJ0010010view1/+@AJ0040010Servlet,<%=contextNo%>,<%=su3.getScreenName()%>,<%=su3.getScreenID()%>"
expj.AJ0010010.AJ0010010button2.PuchProgLst.onClick0 = function () {
  console.log('PuchProgLst script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0010010', 'AJ0010010button2', '_AJ0010010view1/+', 'AJ0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su3.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AJ0040010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AJ0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su3.getScreenName()%>', contents, 'AJ0010010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AJ0010010.AJ0010010button2.PuchProgLst.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010button2.PuchProgLst['onClick' + i])) {
        expj.AJ0010010.AJ0010010button2.PuchProgLst['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010button2.PuchProgLst.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010button2.PuchProgLst.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010button2-PuchProgLst').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010button2', 'PuchProgLst', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010button2.PuchProgLst.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button2.PuchProgLst.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button2/PuchProgLst.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010button2-PuchProgLst');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0010010-AJ0010010button2-PuchProgLst" name="PuchProgLst" class="AJ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPuchOdrInstProgress",rb)%></button><!-- 発注指示進捗ボタン --></div><!--/td-->
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
<span class="version">AJ0010010 Revision: 1.8  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AJ0010010-AJ0010010button0">
expj.AJ0010010.AJ0010010button0 = {};
expj.AJ0010010.AJ0010010button0.executeAllOnDecision = function () {
  console.log('execute AJ0010010button0.onDecision');
};
expj.AJ0010010.AJ0010010button0.executeOnLoad = function () {
  expj.AJ0010010.AJ0010010button0.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button0.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AJ0010010-AJ0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AJ0010010-AJ0010010button0-CsvOut">
expj.AJ0010010.AJ0010010button0.CsvOut = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AJ0010010form1/*@AJ0010010Servlet,,$ZZ07011"
expj.AJ0010010.AJ0010010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0010010', 'AJ0010010button0', '_AJ0010010form1/*', 'AJ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AJ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AJ0010010', response);
expj.common.updateBusinessScreenTab('AJ0010010', contents);
};
expj.common.pscript.callConfirm('AJ0010010', 'AJ0010010button0', 'ZZ07011', okEvent);
};
expj.AJ0010010.AJ0010010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010button0.CsvOut['onClick' + i])) {
        expj.AJ0010010.AJ0010010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010button0.CsvOut.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0010010-AJ0010010button0-CsvOut" name="CsvOut" class="AJ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010button0-Clear">
expj.AJ0010010.AJ0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AJ0010010form1/*@AJ0010010Servlet,,$ZZ07008"
expj.AJ0010010.AJ0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0010010', 'AJ0010010button0', '_AJ0010010form1/*', 'AJ0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AJ0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AJ0010010', response);
expj.common.updateBusinessScreenTab('AJ0010010', contents);
};
expj.common.pscript.callConfirm('AJ0010010', 'AJ0010010button0', 'ZZ07008', okEvent);
};
expj.AJ0010010.AJ0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010button0.Clear['onClick' + i])) {
        expj.AJ0010010.AJ0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010button0.Clear.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010button0.Clear.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010button0.Clear.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0010010-AJ0010010button0-Clear" name="Clear" class="AJ0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AJ0010010-AJ0010010button0-Close">
expj.AJ0010010.AJ0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AJ0010010.AJ0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AJ0010010');
};
expj.AJ0010010.AJ0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0010010.AJ0010010button0.Close['onClick' + i])) {
        expj.AJ0010010.AJ0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AJ0010010.AJ0010010button0.Close.executeAllOnDecision = function () {
};
expj.AJ0010010.AJ0010010button0.Close.executeOnLoad = function () {
  $('#expj-AJ0010010-AJ0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0010010', 'AJ0010010button0', 'Close', this, 'Button');
    }
  });
  expj.AJ0010010.AJ0010010button0.Close.executePScriptOnLoad();
};

expj.AJ0010010.AJ0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AJ0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AJ0010010-AJ0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0010010-AJ0010010button0-Close" name="Close" class="AJ0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AJ0010010 (END)-->
<%
MessageStruct msgStruct = aAJ0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AJ0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AJ0010010)) {
  expj.common.treeInstanceMap.AJ0010010 = {};
}
expj.common.treeInstanceMap.AJ0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AJ0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AJ0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AJ0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AJ0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AJ0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AJ0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AJ0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AJ0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AJ0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AJ0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0010010)) {
  expj.common.detailDialogMap.AJ0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AJ0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AJ0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AJ0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AJ0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AJ0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AJ0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AJ0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AJ0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AJ0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AJ0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AJ0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AJ0010010)) {
  expj.common.viewInstanceMap.AJ0010010 = {};
}
expj.common.viewInstanceMap.AJ0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AJ0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AJ0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AJ0010010.<%=viewId %>.init = function () {
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
    expj.AJ0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AJ0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AJ0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AJ0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AJ0010010_init">
/**
 * AJ0010010用のロード完了時初期化関数
 */
expj.AJ0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AJ0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AJ0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AJ0010010');
  expj.common.calendarInstanceMap.AJ0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AJ0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AJ0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AJ0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AJ0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AJ0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AJ0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AJ0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AJ0010010.AJ0010010form1.r1_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.r2_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.r3_MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateFrom.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_DUE_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.CalendarPrdDueDateTo.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_DUE_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.c1_PROGRESS_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_START_DATE_FROM.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateFrom.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_START_TIME_FROM.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_START_DATE_TO.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.CalendarPrdStartDateTo.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PRD_START_TIME_TO.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.c2_PROGRESS_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.c1_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.PeekerITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.c2_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.c3_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button2.JobOdrProgLst.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button2.WorkProgLst.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button2.PuchProgLst.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010form1.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button1.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010view1.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button2.executeOnLoad();}catch(e){};
  try{expj.AJ0010010.AJ0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AJ0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AJ0010010', 'AJ0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AJ0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AJ0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AJ0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AJ0010010', '<%=request.getContextPath() %>');
};

/**
 * AJ0010010の全体onDecision処理
 */
expj.AJ0010010.executeAllOnDecision = function () {
  expj.AJ0010010.AJ0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AJ0010010_console">
expj.AJ0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>