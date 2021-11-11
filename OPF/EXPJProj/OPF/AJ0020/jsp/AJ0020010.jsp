<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:43:35 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AJ0020\AJ0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AJ0020.*" %>
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
<jsp:useBean id="aAJ0020010Control" class="com.nec.jp.orteus.metamorBase.AJ0020.AJ0020010Control" scope="request"/>
<jsp:useBean id="aAJ0020010Struct" class="com.nec.jp.orteus.metamorBase.AJ0020.AJ0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製番別進捗一覧
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0020/jsp/AJ0020010.jsp,v $
$Author: geng-jia $	
$Revision: 1.15 $ $Date: 2017/02/22 02:06:11 $
********************************************************* --%>
<html>
<head>
<title>製番別進捗一覧</title>
<%@include file="common/expj_v5.jsp" %>
<%
ScreenMoveUtil su = new ScreenMoveUtil("AJ0030010Servlet", so);
ScreenMoveUtil su2 = new ScreenMoveUtil("AJ0040010Servlet", so);
ScreenMoveUtil su3 = new ScreenMoveUtil("AC0100010Servlet", so);
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
<script class="expj-script-AJ0020010_init">
  // AJ0020010名前空間
  expj.AJ0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AJ0020010" data-screen="AJ0020010" data-newdata="<%=aAJ0020010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AJ0020010-AJ0020010form1">
expj.AJ0020010.AJ0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AJ0020010.AJ0020010form1.onLoad0 = function () {
  console.log('AJ0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;_AJ0020010form1/JOB_ODR_CD[neq][and]_AJ0020010form1/JOB_ODR_CANCEL_NO[neq][and]_AJ0020010form1/DEVELOP_TYP[neq][and]_AJ0020010form1/DEVELOP_LEVEL[neq]@*0,*1"
expj.AJ0020010.AJ0020010form1.onDecision0 = function () {
  console.log('AJ0020010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/JOB_ODR_CANCEL_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/DEVELOP_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/DEVELOP_LEVEL'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AJ0020010button1/Select"
expj.AJ0020010.AJ0020010form1.child0 = function () {
  console.log('AJ0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button1/Select');
};
// script4="child;1;MASK;_AJ0020010button1/Select"
expj.AJ0020010.AJ0020010form1.child1 = function () {
  console.log('AJ0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button1/Select');
};
// script5="onDecision;1;CHKRQ;?AJ0020010view1/?[neq]NOT_SELECTED@*2,*7"
expj.AJ0020010.AJ0020010form1.onDecision1 = function () {
  console.log('AJ0020010form1 script5');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="child;2;CHK;?AJ0020010form1/PLANT_CD[eq]SAME[and]?AJ0020010form1/JOB_ODR_CD[eq]SAME[and]?AJ0020010form1/JOB_ODR_CANCEL_NO[eq]SAME[and]?AJ0020010form1/DEVELOP_TYP[eq]SAME[and]?AJ0020010form1/DEVELOP_LEVEL[eq]SAME[and]?AJ0020010form1/ITEM_CD[eq]SAME@*3,*7"
expj.AJ0020010.AJ0020010form1.child2 = function () {
  console.log('AJ0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/DEVELOP_LEVEL'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script7="child;3;CHK;_AJ0020010view1/l_MRP_ODR_TYP[eq]4[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]5[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]6[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]7[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]8@*7,*4"
expj.AJ0020010.AJ0020010form1.child3 = function () {
  console.log('AJ0020010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '7') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;CHK;_AJ0020010view1/MRP_TYP[eq]3@*7,*5"
expj.AJ0020010.AJ0020010form1.child4 = function () {
  console.log('AJ0020010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/MRP_TYP'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;CHK;_AJ0020010view1/l_WORK_IN_PROC_QTY[gt]0[and]_AJ0020010view1/l_OPR_RSLT_TYP[eq]2@*6,*7"
expj.AJ0020010.AJ0020010form1.child5 = function () {
  console.log('AJ0020010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_WORK_IN_PROC_QTY')), '[gt]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_OPR_RSLT_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;UNMASK;_AJ0020010button2/WorkProgLst"
expj.AJ0020010.AJ0020010form1.child6 = function () {
  console.log('AJ0020010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button2/WorkProgLst');
};
// script11="child;7;MASK;_AJ0020010button2/WorkProgLst"
expj.AJ0020010.AJ0020010form1.child7 = function () {
  console.log('AJ0020010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button2/WorkProgLst');
};
// script12="onDecision;2;CHKRQ;?AJ0020010view1/?[neq]NOT_SELECTED@*8,*13"
expj.AJ0020010.AJ0020010form1.onDecision2 = function () {
  console.log('AJ0020010form1 script12');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script13="child;8;CHK;?AJ0020010form1/PLANT_CD[eq]SAME[and]?AJ0020010form1/JOB_ODR_CD[eq]SAME[and]?AJ0020010form1/JOB_ODR_CANCEL_NO[eq]SAME[and]?AJ0020010form1/DEVELOP_TYP[eq]SAME[and]?AJ0020010form1/DEVELOP_LEVEL[eq]SAME[and]?AJ0020010form1/ITEM_CD[eq]SAME@*9,*13"
expj.AJ0020010.AJ0020010form1.child8 = function () {
  console.log('AJ0020010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/DEVELOP_LEVEL'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script14="child;9;CHK;_AJ0020010view1/l_MRP_ODR_TYP[eq]4[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]5[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]6[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]7[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]8@*13,*10"
expj.AJ0020010.AJ0020010form1.child9 = function () {
  console.log('AJ0020010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '7') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;10;CHK;_AJ0020010view1/MRP_TYP[eq]3@*13,*11"
expj.AJ0020010.AJ0020010form1.child10 = function () {
  console.log('AJ0020010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/MRP_TYP'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;11;CHK;_AJ0020010view1/l_RLSD_PUCH_ODR_QTY[gt]0@*12,*13"
expj.AJ0020010.AJ0020010form1.child11 = function () {
  console.log('AJ0020010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_RLSD_PUCH_ODR_QTY')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;12;UNMASK;_AJ0020010button2/PuchProgLst"
expj.AJ0020010.AJ0020010form1.child12 = function () {
  console.log('AJ0020010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button2/PuchProgLst');
};
// script18="child;13;MASK;_AJ0020010button2/PuchProgLst"
expj.AJ0020010.AJ0020010form1.child13 = function () {
  console.log('AJ0020010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button2/PuchProgLst');
};
// script19="onDecision;3;CHKRQ;?AJ0020010view1/?[neq]NOT_SELECTED@*14,*18"
expj.AJ0020010.AJ0020010form1.onDecision3 = function () {
  console.log('AJ0020010form1 script19');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010view1/?'), '[neq]', 'NOT_SELECTED'))) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script20="child;14;CHK;?AJ0020010form1/PLANT_CD[eq]SAME[and]?AJ0020010form1/JOB_ODR_CD[eq]SAME[and]?AJ0020010form1/JOB_ODR_CANCEL_NO[eq]SAME[and]?AJ0020010form1/DEVELOP_TYP[eq]SAME[and]?AJ0020010form1/DEVELOP_LEVEL[eq]SAME[and]?AJ0020010form1/ITEM_CD[eq]SAME@*15,*18"
expj.AJ0020010.AJ0020010form1.child14 = function () {
  console.log('AJ0020010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/PLANT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/JOB_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/JOB_ODR_CANCEL_NO'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/DEVELOP_TYP'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/DEVELOP_LEVEL'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '?AJ0020010form1/ITEM_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script21="child;15;CHK;_AJ0020010view1/l_MRP_ODR_TYP[eq]4[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]5[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]6[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]7[or]_AJ0020010view1/l_MRP_ODR_TYP[eq]8@*18,*16"
expj.AJ0020010.AJ0020010form1.child15 = function () {
  console.log('AJ0020010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '5') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '6') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '7') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/l_MRP_ODR_TYP'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script22="child;16;CHK;_AJ0020010view1/MRP_TYP[eq]3@*18,*17"
expj.AJ0020010.AJ0020010form1.child16 = function () {
  console.log('AJ0020010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010view1/MRP_TYP'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script23="child;17;UNMASK;_AJ0020010button2/JobOdrAlc"
expj.AJ0020010.AJ0020010form1.child17 = function () {
  console.log('AJ0020010form1 script23');
expj.common.pscript.setUnMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button2/JobOdrAlc');
};
// script24="child;18;MASK;_AJ0020010button2/JobOdrAlc"
expj.AJ0020010.AJ0020010form1.child18 = function () {
  console.log('AJ0020010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AJ0020010', 'AJ0020010form1', '_AJ0020010button2/JobOdrAlc');
};
expj.AJ0020010.AJ0020010form1.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010form1['onDecision' + i])) {
        expj.AJ0020010.AJ0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010form1.executeOnLoad = function () {
  expj.AJ0020010.AJ0020010form1.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010form1['onLoad' + i])) {
      expj.AJ0020010.AJ0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AJ0020010-AJ0020010form1" action="AJ0020010Servlet" name="AJ0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-PLANT_CD">
expj.AJ0020010.AJ0020010form1.PLANT_CD = {};
expj.AJ0020010.AJ0020010form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/PLANT_CD.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'PLANT_CD', this);
  });
  expj.AJ0020010.AJ0020010form1.PLANT_CD.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-PLANT_CD" name="PLANT_CD" class="AJ0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-PeekerPlantCd">
expj.AJ0020010.AJ0020010form1.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AJ0020010form1/PLANT_CD@<%=contextNo%>"
expj.AJ0020010.AJ0020010form1.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AJ0020010';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AJ0020010form1/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AJ0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AJ0020010.AJ0020010form1.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010form1.PeekerPlantCd['onClick' + i])) {
        expj.AJ0020010.AJ0020010form1.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010form1.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010form1.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010form1', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010form1.PeekerPlantCd.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0020010-AJ0020010form1-PeekerPlantCd" class="AJ0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-PLANT_NAME">
expj.AJ0020010.AJ0020010form1.PLANT_NAME = {};
expj.AJ0020010.AJ0020010form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/PLANT_NAME.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'PLANT_NAME', this);
  });
  expj.AJ0020010.AJ0020010form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-PLANT_NAME" name="PLANT_NAME" class="AJ0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-JOB_ODR_CD">
expj.AJ0020010.AJ0020010form1.JOB_ODR_CD = {};
expj.AJ0020010.AJ0020010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/JOB_ODR_CD.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'JOB_ODR_CD', this);
  });
  expj.AJ0020010.AJ0020010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AJ0020010-focus-move  required-value expj-AJ0020010-required-true" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-PeekerJobOdrCd">
expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AJ0020010form1/JOB_ODR_CD:_AJ0020010form1/JOB_ODR_CANCEL_NO@<%=contextNo%>"
expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AJ0020010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_08%&%';
parameterValues += 'TARGET_FIELD%=%_AJ0020010form1/JOB_ODR_CD:_AJ0020010form1/JOB_ODR_CANCEL_NO%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AJ0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0020010-AJ0020010form1-PeekerJobOdrCd" class="AJ0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-JOB_ODR_CANCEL_NO">
expj.AJ0020010.AJ0020010form1.JOB_ODR_CANCEL_NO = {};
expj.AJ0020010.AJ0020010form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AJ0020010.AJ0020010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AJ0020010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6;;" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="6" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_TYP",rb)%></span><!-- 製番種別 --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-JOB_ODR_TYP_DN">
expj.AJ0020010.AJ0020010form1.JOB_ODR_TYP_DN = {};
expj.AJ0020010.AJ0020010form1.JOB_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/JOB_ODR_TYP_DN.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.JOB_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-JOB_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'JOB_ODR_TYP_DN', this);
  });
  expj.AJ0020010.AJ0020010form1.JOB_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.JOB_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/JOB_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-JOB_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-JOB_ODR_TYP_DN" name="JOB_ODR_TYP_DN" class="AJ0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getJOB_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ALC_GRP_CD",rb)%></span><!-- 引当グループコード --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-ALC_GRP_CD">
expj.AJ0020010.AJ0020010form1.ALC_GRP_CD = {};
expj.AJ0020010.AJ0020010form1.ALC_GRP_CD.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/ALC_GRP_CD.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.ALC_GRP_CD.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-ALC_GRP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'ALC_GRP_CD', this);
  });
  expj.AJ0020010.AJ0020010form1.ALC_GRP_CD.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.ALC_GRP_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/ALC_GRP_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-ALC_GRP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-ALC_GRP_CD" name="ALC_GRP_CD" class="AJ0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getALC_GRP_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0017",rb)%></span><!-- 展開区分 --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-DEVELOP_TYP">
expj.AJ0020010.AJ0020010form1.DEVELOP_TYP = {};
expj.AJ0020010.AJ0020010form1.DEVELOP_TYP.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/DEVELOP_TYP.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.DEVELOP_TYP.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-DEVELOP_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'DEVELOP_TYP', this);
  });
  expj.AJ0020010.AJ0020010form1.DEVELOP_TYP.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.DEVELOP_TYP.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/DEVELOP_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-DEVELOP_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AJ0020010-AJ0020010form1-DEVELOP_TYP" name='DEVELOP_TYP' class='AJ0020010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAJ0020010Control.getStruct().getList_DEVELOP_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAJ0020010Control.getStruct().getList_DEVELOP_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAJ0020010Control.getStruct().getList_DEVELOP_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAJ0020010Struct.getDEVELOP_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0435",rb)%></span><!-- 展開レベル --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-DEVELOP_LEVEL">
expj.AJ0020010.AJ0020010form1.DEVELOP_LEVEL = {};
expj.AJ0020010.AJ0020010form1.DEVELOP_LEVEL.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/DEVELOP_LEVEL.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.DEVELOP_LEVEL.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-DEVELOP_LEVEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'DEVELOP_LEVEL', this);
  });
  expj.AJ0020010.AJ0020010form1.DEVELOP_LEVEL.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.DEVELOP_LEVEL.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/DEVELOP_LEVEL.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-DEVELOP_LEVEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-DEVELOP_LEVEL" name="DEVELOP_LEVEL" class="AJ0020010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;4;;" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getDEVELOP_LEVEL()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-ITEM_CD">
expj.AJ0020010.AJ0020010form1.ITEM_CD = {};
expj.AJ0020010.AJ0020010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/ITEM_CD.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'ITEM_CD', this);
  });
  expj.AJ0020010.AJ0020010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-ITEM_CD" name="ITEM_CD" class="AJ0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-PeekerItemCd">
expj.AJ0020010.AJ0020010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AJ0020010form1/ITEM_CD@<%=contextNo%>"
expj.AJ0020010.AJ0020010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AJ0020010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010form1', '_AJ0020010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AJ0020010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AJ0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AJ0020010.AJ0020010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010form1.PeekerItemCd['onClick' + i])) {
        expj.AJ0020010.AJ0020010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AJ0020010-AJ0020010form1-PeekerItemCd" class="AJ0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010form1-ITEM_NAME">
expj.AJ0020010.AJ0020010form1.ITEM_NAME = {};
expj.AJ0020010.AJ0020010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AJ0020010form1/ITEM_NAME.onDecision');
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
  expj.AJ0020010.executeAllOnDecision();
};
expj.AJ0020010.AJ0020010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AJ0020010', 'AJ0020010form1', 'ITEM_NAME', this);
  });
  expj.AJ0020010.AJ0020010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AJ0020010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AJ0020010-AJ0020010form1-ITEM_NAME" name="ITEM_NAME" class="AJ0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAJ0020010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AJ0020010-AJ0020010button1">
expj.AJ0020010.AJ0020010button1 = {};
expj.AJ0020010.AJ0020010button1.executeAllOnDecision = function () {
  console.log('execute AJ0020010button1.onDecision');
};
expj.AJ0020010.AJ0020010button1.executeOnLoad = function () {
  expj.AJ0020010.AJ0020010button1.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button1.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AJ0020010-AJ0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AJ0020010-AJ0020010button1-Select">
expj.AJ0020010.AJ0020010button1.Select = {};
// script1="onClick;0;CHK;_AJ0020010form1/DEVELOP_TYP[eq]2[and]_AJ0020010form1/ITEM_CD[eq]@!AJ00014"
expj.AJ0020010.AJ0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010button1', '_AJ0020010form1/DEVELOP_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010button1', '_AJ0020010form1/ITEM_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AJ0020010', 'AJ0020010button1', 'AJ00014');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AJ0020010form1/*@AJ0020010Servlet"
expj.AJ0020010.AJ0020010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0020010', 'AJ0020010button1', '_AJ0020010form1/*', 'AJ0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AJ0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AJ0020010', response);
expj.common.updateBusinessScreenTab('AJ0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AJ0020010.AJ0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010button1.Select['onClick' + i])) {
        expj.AJ0020010.AJ0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010button1.Select.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010button1.Select.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010button1', 'Select', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010button1.Select.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0020010-AJ0020010button1-Select" name="Select" class="AJ0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AJ0020010-AJ0020010view1">
expj.AJ0020010.AJ0020010view1 = {};
expj.AJ0020010.AJ0020010view1.executeAllOnClick = function () {
};
expj.AJ0020010.AJ0020010view1.executeAllOnDecision = function () {
  console.log('execute AJ0020010view1.onDecision');
};
expj.AJ0020010.AJ0020010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AJ0020010view1", "expj.AJ0020010.AJ0020010view1.executeAllOnClick");
%>
  expj.AJ0020010.AJ0020010view1.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010view1.executePScriptOnLoad = function () {
  console.log('execute AJ0020010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AJ0020010-AJ0020010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:326px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AJ0020010view1_Id = "AJ0020010view1";
 String AJ0020010view1_select = "single";
 String AJ0020010view1_sortable = "true";
 String AJ0020010view1_resize = "true";
 String AJ0020010view1_scroll = "true";
 StringBuffer AJ0020010view1_HB = new StringBuffer();
 StringBuffer AJ0020010view1_DB = new StringBuffer();
%>
<%
 AJ0020010view1_select = "single";
 AJ0020010view1_sortable = "true";
 AJ0020010view1_resize = "true";
 AJ0020010view1_scroll = "true";
%>
<%
 AJ0020010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
%>
        
<%
AJ0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0019",rb))).append("', 'name':'l_LEVEL', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0436",rb))).append("', 'name':'l_PROGRESS_STATUS_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_STS_TYP_1",rb))).append("', 'name':'l_ODR_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DM_STS_TYP_1",rb))).append("', 'name':'l_DM_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb))).append("', 'name':'l_OUTSIDE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'l_MRP_ODR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_START_DATE",rb))).append("', 'name':'l_ODR_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_START_DATE",rb))).append("', 'name':'l_PRD_START_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PRD_DUE_DATE",rb))).append("', 'name':'l_PRD_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DUE_DATE",rb))).append("', 'name':'l_DUE_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE",rb))).append("', 'name':'l_CONFIRM_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ODR_QTY_3",rb))).append("', 'name':'l_ODR_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_RCV_QTY_1",rb))).append("', 'name':'l_TOTAL_RCV_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_CMPLT_DATE",rb))).append("', 'name':'l_RCV_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DM_QTY_2",rb))).append("', 'name':'l_DM_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY_1",rb))).append("', 'name':'l_TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_CMPLT_DATE",rb))).append("', 'name':'l_ISSUE_CMPLT_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ALCD_QTY",rb))).append("', 'name':'l_ALCD_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OD_GNR_TYP",rb))).append("', 'name':'l_OD_GNR_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_RLSD_PUCH_ODR_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_WORK_IN_PROC_QTY', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_OPR_RSLT_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PROGRESS_STATUS', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ODR_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_DM_STS_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PLANT_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MRP_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
AJ0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'PARENT_OD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AJ0020010view1_sortable).append("}").append(",");
%>
<%
 int aAJ0020010StructLength = aAJ0020010Control.getListsize();
 final AJ0020010Struct structBackup = aAJ0020010Struct;
 aAJ0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAJ0020010StructLength; ++loopCount) {
  if((aAJ0020010Struct = (AJ0020010Struct) aAJ0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAJ0020010Struct", aAJ0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AJ0020010view1_DB.append("[");
 AJ0020010view1_DB.append(loopCount);
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_LEVEL-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_LEVEL\" data-name=\"l_LEVEL\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_LEVEL())).append("</span>'");
%> <%
String bgcolor = "";
if (aAJ0020010Struct.getl_PROGRESS_STATUS() == null 
		|| "".equals(aAJ0020010Struct.getl_PROGRESS_STATUS())) {
	bgcolor="";
} else {
	if (aAJ0020010Struct.getl_PROGRESS_STATUS().intValue() == 1) {
		bgcolor="FFFF99";
	} else if (aAJ0020010Struct.getl_PROGRESS_STATUS().intValue() == 2) {
		bgcolor="FFCCCC";
	} else if (aAJ0020010Struct.getl_PROGRESS_STATUS().intValue() == 3) {
		bgcolor="FFCC99";
	} else if (aAJ0020010Struct.getl_PROGRESS_STATUS().intValue() == 4) {
		bgcolor="ADD8E6";
	} else {
		bgcolor="";
	}
}
%> <%
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_PROGRESS_STATUS_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_PROGRESS_STATUS_DN\" data-name=\"l_PROGRESS_STATUS_DN\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_PROGRESS_STATUS_DN())).append("</span>'");
%> <%
bgcolor = null;
if (aAJ0020010Struct.getl_ODR_STS_TYP().intValue() == 1) {
	bgcolor="FFFF99";
} else if (aAJ0020010Struct.getl_ODR_STS_TYP().intValue() == 2) {
	bgcolor="A9EA9E";
} else if (aAJ0020010Struct.getl_ODR_STS_TYP().intValue() == 9) {
	bgcolor="ADD8E6";
} else {
	bgcolor="";
}
%> <%
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ODR_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ODR_STS_TYP_DN\" data-name=\"l_ODR_STS_TYP_DN\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ODR_STS_TYP_DN())).append("</span>'");
%> <%
bgcolor = null;
if (aAJ0020010Struct.getl_DM_STS_TYP().intValue() == 1) {
	bgcolor="FFFF99";
} else if (aAJ0020010Struct.getl_DM_STS_TYP().intValue() == 2) {
	bgcolor="A9EA9E";
} else if (aAJ0020010Struct.getl_DM_STS_TYP().intValue() == 9) {
	bgcolor="ADD8E6";
} else {
	bgcolor="";
}
%> <%
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_DM_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_DM_STS_TYP_DN\" data-name=\"l_DM_STS_TYP_DN\" data-view=\"true\" data-bgcolor=\"").append(bgcolor).append("\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_DM_STS_TYP_DN())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ITEM_CD())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ITEM_NAME())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_OUTSIDE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_OUTSIDE_TYP_DN\" data-name=\"l_OUTSIDE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_OUTSIDE_TYP_DN())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_MRP_ODR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_MRP_ODR_TYP_DN\" data-name=\"l_MRP_ODR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_MRP_ODR_TYP_DN())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ODR_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ODR_START_DATE\" data-name=\"l_ODR_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ODR_START_DATE())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_PRD_START_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_PRD_START_DATE\" data-name=\"l_PRD_START_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_PRD_START_DATE())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_PRD_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_PRD_DUE_DATE\" data-name=\"l_PRD_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_PRD_DUE_DATE())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_DUE_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_DUE_DATE\" data-name=\"l_DUE_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_DUE_DATE())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_CONFIRM_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_CONFIRM_DLV_DATE\" data-name=\"l_CONFIRM_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_CONFIRM_DLV_DATE())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ODR_QTY\" data-name=\"l_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ODR_QTY())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_TOTAL_RCV_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_TOTAL_RCV_QTY\" data-name=\"l_TOTAL_RCV_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_TOTAL_RCV_QTY())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_RCV_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_RCV_CMPLT_DATE\" data-name=\"l_RCV_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_RCV_CMPLT_DATE())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_DM_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_DM_QTY\" data-name=\"l_DM_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_DM_QTY())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_TOTAL_ISSUE_QTY\" data-name=\"l_TOTAL_ISSUE_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_TOTAL_ISSUE_QTY())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ISSUE_CMPLT_DATE-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ISSUE_CMPLT_DATE\" data-name=\"l_ISSUE_CMPLT_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ISSUE_CMPLT_DATE())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ALCD_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ALCD_QTY\" data-name=\"l_ALCD_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ALCD_QTY())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_STOCK_UNIT())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_OD_GNR_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_OD_GNR_TYP_DN\" data-name=\"l_OD_GNR_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_OD_GNR_TYP_DN())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_OD_NO\" data-name=\"l_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_OD_NO())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_RLSD_PUCH_ODR_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_RLSD_PUCH_ODR_QTY\" data-name=\"l_RLSD_PUCH_ODR_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_RLSD_PUCH_ODR_QTY())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_WORK_IN_PROC_QTY-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_WORK_IN_PROC_QTY\" data-name=\"l_WORK_IN_PROC_QTY\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_WORK_IN_PROC_QTY())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_MRP_ODR_TYP\" data-name=\"l_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_MRP_ODR_TYP())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_OPR_RSLT_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_OPR_RSLT_TYP\" data-name=\"l_OPR_RSLT_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_OPR_RSLT_TYP())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_PROGRESS_STATUS-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_PROGRESS_STATUS\" data-name=\"l_PROGRESS_STATUS\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_PROGRESS_STATUS())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_ODR_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_ODR_STS_TYP\" data-name=\"l_ODR_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_ODR_STS_TYP())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_DM_STS_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_DM_STS_TYP\" data-name=\"l_DM_STS_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_DM_STS_TYP())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-l_PLANT_CD-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-l_PLANT_CD\" data-name=\"l_PLANT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getl_PLANT_CD())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-MRP_TYP-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-MRP_TYP\" data-name=\"MRP_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getMRP_TYP())).append("</span>'");
 AJ0020010view1_DB.append(",").append("'<span id=\"expj-AJ0020010-AJ0020010view1-PARENT_OD_NO-").append(loopCount).append("\" class=\"expj-label expj-AJ0020010-AJ0020010view1-PARENT_OD_NO\" data-name=\"PARENT_OD_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAJ0020010Struct.getPARENT_OD_NO())).append("</span>'");
 AJ0020010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAJ0020010StructLength) {
   AJ0020010view1_DB.append(",");
  }
 }
 aAJ0020010Struct = structBackup;
 viewIdList.add(AJ0020010view1_Id);
 viewSelectList.add(AJ0020010view1_select);
 viewResizeList.add(AJ0020010view1_resize);
 viewScrollList.add(AJ0020010view1_scroll);
 viewHeaderDataList.add(AJ0020010view1_HB);
 viewBodyDataList.add(AJ0020010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AJ0020010-AJ0020010button2">
expj.AJ0020010.AJ0020010button2 = {};
expj.AJ0020010.AJ0020010button2.executeAllOnDecision = function () {
  console.log('execute AJ0020010button2.onDecision');
};
expj.AJ0020010.AJ0020010button2.executeOnLoad = function () {
  expj.AJ0020010.AJ0020010button2.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button2.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AJ0020010-AJ0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AJ0020010-AJ0020010button2-WorkProgLst">
expj.AJ0020010.AJ0020010button2.WorkProgLst = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AJ0020010view1/+@AJ0030010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AJ0020010.AJ0020010button2.WorkProgLst.onClick0 = function () {
  console.log('WorkProgLst script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0020010', 'AJ0020010button2', '_AJ0020010view1/+', 'AJ0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AJ0030010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AJ0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AJ0020010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AJ0020010.AJ0020010button2.WorkProgLst.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010button2.WorkProgLst['onClick' + i])) {
        expj.AJ0020010.AJ0020010button2.WorkProgLst['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010button2.WorkProgLst.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010button2.WorkProgLst.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010button2-WorkProgLst').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010button2', 'WorkProgLst', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010button2.WorkProgLst.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button2.WorkProgLst.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button2/WorkProgLst.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010button2-WorkProgLst');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0020010-AJ0020010button2-WorkProgLst" name="WorkProgLst" class="AJ0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnWorkInstProgress",rb)%></button><!-- 作業指示進捗ボタン --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010button2-PuchProgLst">
expj.AJ0020010.AJ0020010button2.PuchProgLst = {};
// script1="onClick;0;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AJ0020010view1/+@AJ0040010Servlet,<%=contextNo%>,<%=su2.getScreenName()%>,<%=su2.getScreenID()%>"
expj.AJ0020010.AJ0020010button2.PuchProgLst.onClick0 = function () {
  console.log('PuchProgLst script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0020010', 'AJ0020010button2', '_AJ0020010view1/+', 'AJ0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su2.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AJ0040010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AJ0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su2.getScreenName()%>', contents, 'AJ0020010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AJ0020010.AJ0020010button2.PuchProgLst.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010button2.PuchProgLst['onClick' + i])) {
        expj.AJ0020010.AJ0020010button2.PuchProgLst['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010button2.PuchProgLst.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010button2.PuchProgLst.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010button2-PuchProgLst').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010button2', 'PuchProgLst', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010button2.PuchProgLst.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button2.PuchProgLst.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button2/PuchProgLst.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010button2-PuchProgLst');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0020010-AJ0020010button2-PuchProgLst" name="PuchProgLst" class="AJ0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPuchOdrInstProgress",rb)%></button><!-- 発注指示進捗ボタン --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010button2-JobOdrAlc">
expj.AJ0020010.AJ0020010button2.JobOdrAlc = {};
// script1="onClick;0;CHK;_AJ0020010view1/l_PLANT_CD[neq]<%=aAJ0020010Control.getsysPLANT_CD()%>@!AJ00021,*0"
expj.AJ0020010.AJ0020010button2.JobOdrAlc.onClick0 = function () {
  console.log('JobOdrAlc script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010button2', '_AJ0020010view1/l_PLANT_CD'), '[neq]', '<%=aAJ0020010Control.getsysPLANT_CD()%>')) {
expj.common.pscript.viewErrorMessage('AJ0020010', 'AJ0020010button2', 'AJ00021');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AJ0020010view1/PARENT_OD_NO[eq]@!AC00212,*1"
expj.AJ0020010.AJ0020010button2.JobOdrAlc.child0 = function () {
  console.log('JobOdrAlc script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AJ0020010', 'AJ0020010button2', '_AJ0020010view1/PARENT_OD_NO'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AJ0020010', 'AJ0020010button2', 'AC00212');
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AJ0020010view1/+@AC0100010Servlet,<%=contextNo%>,<%=su3.getScreenName()%>,<%=su3.getScreenID()%>"
expj.AJ0020010.AJ0020010button2.JobOdrAlc.child1 = function () {
  console.log('JobOdrAlc script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0020010', 'AJ0020010button2', '_AJ0020010view1/+', 'AC0100010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su3.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AC0100010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AC0100010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su3.getScreenName()%>', contents, 'AJ0020010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AJ0020010.AJ0020010button2.JobOdrAlc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010button2.JobOdrAlc['onClick' + i])) {
        expj.AJ0020010.AJ0020010button2.JobOdrAlc['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010button2.JobOdrAlc.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010button2.JobOdrAlc.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010button2-JobOdrAlc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010button2', 'JobOdrAlc', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010button2.JobOdrAlc.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button2.JobOdrAlc.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button2/JobOdrAlc.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010button2-JobOdrAlc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0020010-AJ0020010button2-JobOdrAlc" name="JobOdrAlc" class="AJ0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReserveFundOrder",rb)%></button><!-- 製番引当ボタン --></div><!--/td-->
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
<span class="version">AJ0020010 Revision: 1.7  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AJ0020010-AJ0020010button0">
expj.AJ0020010.AJ0020010button0 = {};
expj.AJ0020010.AJ0020010button0.executeAllOnDecision = function () {
  console.log('execute AJ0020010button0.onDecision');
};
expj.AJ0020010.AJ0020010button0.executeOnLoad = function () {
  expj.AJ0020010.AJ0020010button0.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button0.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AJ0020010-AJ0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AJ0020010-AJ0020010button0-Clear">
expj.AJ0020010.AJ0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AJ0020010form1/*@AJ0020010Servlet,,$ZZ07008"
expj.AJ0020010.AJ0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AJ0020010', 'AJ0020010button0', '_AJ0020010form1/*', 'AJ0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AJ0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AJ0020010', response);
expj.common.updateBusinessScreenTab('AJ0020010', contents);
};
expj.common.pscript.callConfirm('AJ0020010', 'AJ0020010button0', 'ZZ07008', okEvent);
};
expj.AJ0020010.AJ0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010button0.Clear['onClick' + i])) {
        expj.AJ0020010.AJ0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010button0.Clear.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010button0.Clear.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010button0.Clear.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0020010-AJ0020010button0-Clear" name="Clear" class="AJ0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AJ0020010-AJ0020010button0-Close">
expj.AJ0020010.AJ0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AJ0020010.AJ0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AJ0020010');
};
expj.AJ0020010.AJ0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AJ0020010.AJ0020010button0.Close['onClick' + i])) {
        expj.AJ0020010.AJ0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AJ0020010.AJ0020010button0.Close.executeAllOnDecision = function () {
};
expj.AJ0020010.AJ0020010button0.Close.executeOnLoad = function () {
  $('#expj-AJ0020010-AJ0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AJ0020010', 'AJ0020010button0', 'Close', this, 'Button');
    }
  });
  expj.AJ0020010.AJ0020010button0.Close.executePScriptOnLoad();
};

expj.AJ0020010.AJ0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AJ0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AJ0020010-AJ0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AJ0020010-AJ0020010button0-Close" name="Close" class="AJ0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AJ0020010 (END)-->
<%
MessageStruct msgStruct = aAJ0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AJ0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AJ0020010)) {
  expj.common.treeInstanceMap.AJ0020010 = {};
}
expj.common.treeInstanceMap.AJ0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AJ0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AJ0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AJ0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AJ0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AJ0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AJ0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AJ0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AJ0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AJ0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AJ0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0020010)) {
  expj.common.detailDialogMap.AJ0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AJ0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AJ0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AJ0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AJ0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AJ0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AJ0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AJ0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AJ0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AJ0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AJ0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AJ0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AJ0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AJ0020010)) {
  expj.common.viewInstanceMap.AJ0020010 = {};
}
expj.common.viewInstanceMap.AJ0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AJ0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AJ0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AJ0020010.<%=viewId %>.init = function () {
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
    expj.AJ0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AJ0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AJ0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AJ0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AJ0020010_init">
/**
 * AJ0020010用のロード完了時初期化関数
 */
expj.AJ0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AJ0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AJ0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AJ0020010');
  expj.common.calendarInstanceMap.AJ0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AJ0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AJ0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AJ0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AJ0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AJ0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AJ0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AJ0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AJ0020010.AJ0020010form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.JOB_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.ALC_GRP_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.DEVELOP_TYP.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.DEVELOP_LEVEL.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button2.WorkProgLst.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button2.PuchProgLst.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button2.JobOdrAlc.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010form1.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button1.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010view1.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button2.executeOnLoad();}catch(e){};
  try{expj.AJ0020010.AJ0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AJ0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AJ0020010', 'AJ0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AJ0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AJ0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AJ0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AJ0020010', '<%=request.getContextPath() %>');
};

/**
 * AJ0020010の全体onDecision処理
 */
expj.AJ0020010.executeAllOnDecision = function () {
  expj.AJ0020010.AJ0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AJ0020010_console">
expj.AJ0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>