<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:02:39 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0020\AE0020021.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0020.*" %>
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
<jsp:useBean id="aAE0020020Control" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020020Control" scope="request"/>
<jsp:useBean id="aAE0020020Struct" class="com.nec.jp.orteus.metamorBase.AE0020.AE0020020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

発注計画メンテナンス（製番）サブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0020/jsp/AE0020021.jsp,v $
$Author: geng-jia $
$Revision: 1.27 $ $Date: 2017/02/22 02:05:06 $
********************************************************* --%>
<html>
<head>
<title>発注計画メンテナンス（製番）サブ１</title>
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
<script class="expj-script-AE0020020_init">
  // AE0020020名前空間
  expj.AE0020020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0020020" data-screen="AE0020021" data-newdata="<%=aAE0020020Control.isNewData() %>">
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
              <script class="expj-script-AE0020020-AE0020021form1">
expj.AE0020020.AE0020021form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.AE0020020.AE0020021form1.onLoad0 = function () {
  console.log('AE0020021form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHK;<%=aAE0020020Control.getOperationMode()%>[eq]INSERT@*0,*5"
expj.AE0020020.AE0020021form1.onDecision0 = function () {
  console.log('AE0020021form1 script2');
if (expj.common.pscript.evaluate('<%=aAE0020020Control.getOperationMode()%>', '[eq]', 'INSERT')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script3="child;0;CHKRQ;?AE0020021form1/*[neq]ERROR@*1,*5"
expj.AE0020020.AE0020021form1.child0 = function () {
  console.log('AE0020021form1 script3');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form1', '?AE0020021form1/*'), '[neq]', 'ERROR'))) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script4="child;1;CHK;_AE0020021form2/OUTSIDE_TYP[eq]1@*2,*3"
expj.AE0020020.AE0020021form1.child1 = function () {
  console.log('AE0020021form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form1', '_AE0020021form2/OUTSIDE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;CHKRQ;A@*4,*5"
expj.AE0020020.AE0020021form1.child2 = function () {
  console.log('AE0020021form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AE0020020', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;3;CHKRQ;A,B@*4,*5"
expj.AE0020020.AE0020021form1.child3 = function () {
  console.log('AE0020021form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AE0020020', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0020020', 'B')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;4;UNMASK;_AE0020021button1/Insert"
expj.AE0020020.AE0020021form1.child4 = function () {
  console.log('AE0020021form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021button1/Insert');
};
// script8="child;5;MASK;_AE0020021button1/Insert"
expj.AE0020020.AE0020021form1.child5 = function () {
  console.log('AE0020021form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021button1/Insert');
};
// script9="onDecision;1;CHK;<%=aAE0020020Control.getOperationMode()%>[eq]UPDATE@*6,*11"
expj.AE0020020.AE0020021form1.onDecision1 = function () {
  console.log('AE0020021form1 script9');
if (expj.common.pscript.evaluate('<%=aAE0020020Control.getOperationMode()%>', '[eq]', 'UPDATE')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script10="child;6;CHKRQ;?AE0020021form1/*[neq]ERROR@*7,*11"
expj.AE0020020.AE0020021form1.child6 = function () {
  console.log('AE0020021form1 script10');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form1', '?AE0020021form1/*'), '[neq]', 'ERROR'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script11="child;7;CHK;_AE0020021form2/OUTSIDE_TYP[eq]1@*8,*9"
expj.AE0020020.AE0020021form1.child7 = function () {
  console.log('AE0020021form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form1', '_AE0020021form2/OUTSIDE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;8;CHKRQ;A@*10,*11"
expj.AE0020020.AE0020021form1.child8 = function () {
  console.log('AE0020021form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('AE0020020', 'A')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="child;9;CHKRQ;A,B@*10,*11"
expj.AE0020020.AE0020021form1.child9 = function () {
  console.log('AE0020021form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('AE0020020', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0020020', 'B')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;10;UNMASK;_AE0020021button1/Update"
expj.AE0020020.AE0020021form1.child10 = function () {
  console.log('AE0020021form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021button1/Update');
};
// script15="child;11;MASK;_AE0020021button1/Update"
expj.AE0020020.AE0020021form1.child11 = function () {
  console.log('AE0020021form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021button1/Update');
};
// script16="onDecision;2;CHK;<%=aAE0020020Control.getODR_STATE_TYP()%>[eq]2@*12,*13"
expj.AE0020020.AE0020021form1.onDecision2 = function () {
  console.log('AE0020021form1 script16');
if (expj.common.pscript.evaluate('<%=aAE0020020Control.getODR_STATE_TYP()%>', '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;12;MASK;_AE0020021form2/PUCH_ODR_DLV_DATE,_AE0020021form2/CalendarPuchOdrDlvDate,_AE0020021form2/PUCH_ODR_START_DATE,_AE0020021form2/CalendarPuchOdrStartDate,_AE0020021form2/PUCH_ODR_QTY,_AE0020021form2/OUTSIDE_TYP,_AE0020021form2/VEND_CD,_AE0020021form2/WH_CD,_AE0020021form2/PeekerVendCd,_AE0020021form2/PeekerWhCd,_AE0020021form2/PUCH_ODR_PERSON,_AE0020021form2/SPL_ITEM_TYP,_AE0020021form2/UNIT_COST_TYP,_AE0020021form2/SelectUnitCost,_AE0020021form2/UNIT_COST,_AE0020021form2/PROCESSING_COST,_AE0020021form2/MATERIAL_COST,_AE0020021form2/OTHER_OVERHEADS,_AE0020021form2/EXCH_RATE,_AE0020021form2/PUCH_ODR_AMOUNT,_AE0020021form2/DISC_AMOUNT,_AE0020021form2/NET_AMOUNT,_AE0020021form2/PUCH_ODR_COMMENT"
expj.AE0020020.AE0020021form1.child12 = function () {
  console.log('AE0020021form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_DLV_DATE');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/CalendarPuchOdrDlvDate');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_START_DATE');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/CalendarPuchOdrStartDate');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_QTY');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/OUTSIDE_TYP');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/WH_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PeekerVendCd');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PeekerWhCd');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_PERSON');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/SPL_ITEM_TYP');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/UNIT_COST_TYP');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/UNIT_COST');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PROCESSING_COST');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/MATERIAL_COST');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/OTHER_OVERHEADS');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/EXCH_RATE');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/DISC_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/NET_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_COMMENT');
};
// script18="child;13;UNMASK;_AE0020021form2/PUCH_ODR_DLV_DATE,_AE0020021form2/CalendarPuchOdrDlvDate,_AE0020021form2/PUCH_ODR_START_DATE,_AE0020021form2/CalendarPuchOdrStartDate,_AE0020021form2/PUCH_ODR_QTY,_AE0020021form2/OUTSIDE_TYP,_AE0020021form2/VEND_CD,_AE0020021form2/WH_CD,_AE0020021form2/PeekerVendCd,_AE0020021form2/PeekerWhCd,_AE0020021form2/PUCH_ODR_PERSON,_AE0020021form2/SPL_ITEM_TYP,_AE0020021form2/UNIT_COST_TYP,_AE0020021form2/SelectUnitCost,_AE0020021form2/UNIT_COST,_AE0020021form2/PROCESSING_COST,_AE0020021form2/MATERIAL_COST,_AE0020021form2/OTHER_OVERHEADS,_AE0020021form2/EXCH_RATE,_AE0020021form2/DISC_AMOUNT,_AE0020021form2/NET_AMOUNT,_AE0020021form2/PUCH_ODR_COMMENT"
expj.AE0020020.AE0020021form1.child13 = function () {
  console.log('AE0020021form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_DLV_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/CalendarPuchOdrDlvDate');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_START_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/CalendarPuchOdrStartDate');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/OUTSIDE_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/VEND_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/WH_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PeekerVendCd');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PeekerWhCd');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_PERSON');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/SPL_ITEM_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/UNIT_COST_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/SelectUnitCost');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/UNIT_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PROCESSING_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/MATERIAL_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/OTHER_OVERHEADS');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/EXCH_RATE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/DISC_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/NET_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_COMMENT');
};
// script19="onDecision;3;CHK;_AE0020021form1/TIME_CTRL[eq]true@*14,*15"
expj.AE0020020.AE0020021form1.onDecision3 = function () {
  console.log('AE0020021form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script20="child;14;UNMASK;_AE0020021form2/PUCH_ODR_DLV_TIME,_AE0020021form2/CONFIRM_DLV_TIME,_AE0020021form2/PUCH_ODR_START_TIME"
expj.AE0020020.AE0020021form1.child14 = function () {
  console.log('AE0020021form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_DLV_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/CONFIRM_DLV_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_START_TIME');
};
// script21="child;15;MASK;_AE0020021form2/PUCH_ODR_DLV_TIME,_AE0020021form2/CONFIRM_DLV_TIME,_AE0020021form2/PUCH_ODR_START_TIME"
expj.AE0020020.AE0020021form1.child15 = function () {
  console.log('AE0020021form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_DLV_TIME');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/CONFIRM_DLV_TIME');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_START_TIME');
};
// script22="onDecision;4;CHK;<%=aAE0020020Control.getODR_STATE_TYP()%>[eq]2@*16"
expj.AE0020020.AE0020021form1.onDecision4 = function () {
  console.log('AE0020021form1 script22');
if (expj.common.pscript.evaluate('<%=aAE0020020Control.getODR_STATE_TYP()%>', '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script23="child;16;MASK;_AE0020021form2/PUCH_ODR_DLV_TIME,_AE0020021form2/PUCH_ODR_START_TIME"
expj.AE0020020.AE0020021form1.child16 = function () {
  console.log('AE0020021form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_DLV_TIME');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form1', '_AE0020021form2/PUCH_ODR_START_TIME');
};
expj.AE0020020.AE0020021form1.executeAllOnDecision = function () {
  console.log('execute AE0020021form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form1['onDecision' + i])) {
        expj.AE0020020.AE0020021form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021form1.executeOnLoad = function () {
  expj.AE0020020.AE0020021form1.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form1['onLoad' + i])) {
      expj.AE0020020.AE0020021form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0020020-AE0020021form1" action="AE0020020Servlet" name="AE0020021form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0020020Control.getReadStatusString()) %>" style="height:119px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:119px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form1-PLANT_CD">
expj.AE0020020.AE0020021form1.PLANT_CD = {};
expj.AE0020020.AE0020021form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/PLANT_CD.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'PLANT_CD', this);
  });
  expj.AE0020020.AE0020021form1.PLANT_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form1-PLANT_CD" name="PLANT_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPLANT_CD()) %>" maxlength="2" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form1-PLANT_NAME">
expj.AE0020020.AE0020021form1.PLANT_NAME = {};
expj.AE0020020.AE0020021form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/PLANT_NAME.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'PLANT_NAME', this);
  });
  expj.AE0020020.AE0020021form1.PLANT_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form1-PLANT_NAME" name="PLANT_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getTIME_CTRL()) %>">
<script class="expj-script-AE0020020-AE0020021form1-TIME_CTRL">
expj.AE0020020.AE0020021form1.TIME_CTRL = {};
expj.AE0020020.AE0020021form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/TIME_CTRL.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'TIME_CTRL', this);
  });
  expj.AE0020020.AE0020021form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form1-JOB_ODR_CD">
expj.AE0020020.AE0020021form1.JOB_ODR_CD = {};
expj.AE0020020.AE0020021form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/JOB_ODR_CD.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'JOB_ODR_CD', this);
  });
  expj.AE0020020.AE0020021form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CANCEL_NO",rb)%></span><!-- 製番取消発生番号 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form1-JOB_ODR_CANCEL_NO">
expj.AE0020020.AE0020021form1.JOB_ODR_CANCEL_NO = {};
expj.AE0020020.AE0020021form1.JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/JOB_ODR_CANCEL_NO.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'JOB_ODR_CANCEL_NO', this);
  });
  expj.AE0020020.AE0020021form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form1-JOB_ODR_CANCEL_NO" name="JOB_ODR_CANCEL_NO" class="AE0020020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getJOB_ODR_CANCEL_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form1-ITEM_CD">
expj.AE0020020.AE0020021form1.ITEM_CD = {};
expj.AE0020020.AE0020021form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/ITEM_CD.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'ITEM_CD', this);
  });
  expj.AE0020020.AE0020021form1.ITEM_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form1-ITEM_CD" name="ITEM_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form1-ITEM_NAME">
expj.AE0020020.AE0020021form1.ITEM_NAME = {};
expj.AE0020020.AE0020021form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/ITEM_NAME.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'ITEM_NAME', this);
  });
  expj.AE0020020.AE0020021form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form1-ITEM_NAME" name="ITEM_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form1-PUCH_ODR_CD">
expj.AE0020020.AE0020021form1.PUCH_ODR_CD = {};
expj.AE0020020.AE0020021form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/PUCH_ODR_CD.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0020020.AE0020021form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AE0020020-AE0020021form1-MODIFY_COUNT">
expj.AE0020020.AE0020021form1.MODIFY_COUNT = {};
expj.AE0020020.AE0020021form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0020021form1/MODIFY_COUNT.onDecision');
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form1', 'MODIFY_COUNT', this);
  });
  expj.AE0020020.AE0020021form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form1-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame18" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0020020-AE0020021form2">
expj.AE0020020.AE0020021form2 = {};
expj.AE0020020.AE0020021form2.executeAllOnDecision = function () {
  console.log('execute AE0020021form2.onDecision');
};
expj.AE0020020.AE0020021form2.executeOnLoad = function () {
  expj.AE0020020.AE0020021form2.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0020020-AE0020021form2" action="AE0020020Servlet" name="AE0020021form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-DRAW_CD">
expj.AE0020020.AE0020021form2.DRAW_CD = {};
expj.AE0020020.AE0020021form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/DRAW_CD.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'DRAW_CD', this);
  });
  expj.AE0020020.AE0020021form2.DRAW_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-DRAW_CD" name="DRAW_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-SPEC">
expj.AE0020020.AE0020021form2.SPEC = {};
expj.AE0020020.AE0020021form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/SPEC.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.SPEC.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'SPEC', this);
  });
  expj.AE0020020.AE0020021form2.SPEC.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-SPEC" name="SPEC" class="AE0020020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-MRP_ODR_TYP_DN">
expj.AE0020020.AE0020021form2.MRP_ODR_TYP_DN = {};
expj.AE0020020.AE0020021form2.MRP_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/MRP_ODR_TYP_DN.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.MRP_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-MRP_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'MRP_ODR_TYP_DN', this);
  });
  expj.AE0020020.AE0020021form2.MRP_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.MRP_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/MRP_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-MRP_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-MRP_ODR_TYP_DN" name="MRP_ODR_TYP_DN" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getMRP_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)%></span><!-- 発注納期 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_DLV_DATE">
expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_DATE = {};
expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_DLV_DATE.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_DLV_DATE', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_DLV_DATE" name="PUCH_ODR_DLV_DATE" class="AE0020020-focus-move  required-value expj-AE0020020-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CalendarPuchOdrDlvDate">
expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate = {};
// script1="onClick;0;CALENDAR;_AE0020021form2/PUCH_ODR_DLV_DATE"
expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate.onClick0 = function () {
  console.log('CalendarPuchOdrDlvDate script1');
expj.common.pscript.executeCalendar('AE0020020','AE0020021form2','_AE0020021form2/PUCH_ODR_DLV_DATE');
};
expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate['onClick' + i])) {
        expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CalendarPuchOdrDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021form2', 'CalendarPuchOdrDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0020020','AE0020021form2','_AE0020021form2/PUCH_ODR_DLV_DATE');
  expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CalendarPuchOdrDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CalendarPuchOdrDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0020020-AE0020021form2-CalendarPuchOdrDlvDate" class="AE0020020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_DLV_TIME">
expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_TIME = {};
expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_DLV_TIME.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_TIME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_DLV_TIME', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_TIME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_DLV_TIME" name="PUCH_ODR_DLV_TIME" class="AE0020020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_DLV_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_1",rb)%></span><!-- 取引先回答納期 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CONFIRM_DLV_DATE">
expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE = {};
expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/CONFIRM_DLV_DATE.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CONFIRM_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'CONFIRM_DLV_DATE', this);
  });
  expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CONFIRM_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CONFIRM_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-CONFIRM_DLV_DATE" name="CONFIRM_DLV_DATE" class="AE0020020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getCONFIRM_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CalendarConfirmDlvDate">
expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate = {};
// script1="onClick;0;CALENDAR;_AE0020021form2/CONFIRM_DLV_DATE"
expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate.onClick0 = function () {
  console.log('CalendarConfirmDlvDate script1');
expj.common.pscript.executeCalendar('AE0020020','AE0020021form2','_AE0020021form2/CONFIRM_DLV_DATE');
};
expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate['onClick' + i])) {
        expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CalendarConfirmDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021form2', 'CalendarConfirmDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0020020','AE0020021form2','_AE0020021form2/CONFIRM_DLV_DATE');
  expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CalendarConfirmDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CalendarConfirmDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0020020-AE0020021form2-CalendarConfirmDlvDate" class="AE0020020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CONFIRM_DLV_TIME">
expj.AE0020020.AE0020021form2.CONFIRM_DLV_TIME = {};
expj.AE0020020.AE0020021form2.CONFIRM_DLV_TIME.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/CONFIRM_DLV_TIME.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.CONFIRM_DLV_TIME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CONFIRM_DLV_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'CONFIRM_DLV_TIME', this);
  });
  expj.AE0020020.AE0020021form2.CONFIRM_DLV_TIME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CONFIRM_DLV_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CONFIRM_DLV_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CONFIRM_DLV_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-CONFIRM_DLV_TIME" name="CONFIRM_DLV_TIME" class="AE0020020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getCONFIRM_DLV_TIME()) %>" maxlength="4" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_COMMENT",rb)%></span><!-- 取引先回答納期備考 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CONFIRM_DLV_DATE_COMMENT">
expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE_COMMENT = {};
expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/CONFIRM_DLV_DATE_COMMENT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE_COMMENT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CONFIRM_DLV_DATE_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'CONFIRM_DLV_DATE_COMMENT', this);
  });
  expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE_COMMENT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CONFIRM_DLV_DATE_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CONFIRM_DLV_DATE_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-CONFIRM_DLV_DATE_COMMENT" name="CONFIRM_DLV_DATE_COMMENT" class="AE0020020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getCONFIRM_DLV_DATE_COMMENT()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_START_DATE_1",rb)%></span><!-- 発注予定日 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_START_DATE">
expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE.onDecision0 = function () {
  console.log('PUCH_ODR_START_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE.child0 = function () {
  console.log('PUCH_ODR_START_DATE script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_SelectUnitCostFlag', 'false');
};
expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_START_DATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_START_DATE', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_START_DATE" name="PUCH_ODR_START_DATE" class="AE0020020-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CalendarPuchOdrStartDate">
expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate = {};
// script1="onClick;0;CALENDAR;_AE0020021form2/PUCH_ODR_START_DATE"
expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate.onClick0 = function () {
  console.log('CalendarPuchOdrStartDate script1');
expj.common.pscript.executeCalendar('AE0020020','AE0020021form2','_AE0020021form2/PUCH_ODR_START_DATE');
};
expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate['onClick' + i])) {
        expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CalendarPuchOdrStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021form2', 'CalendarPuchOdrStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0020020','AE0020021form2','_AE0020021form2/PUCH_ODR_START_DATE');
  expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CalendarPuchOdrStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CalendarPuchOdrStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0020020-AE0020021form2-CalendarPuchOdrStartDate" class="AE0020020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_START_TIME">
expj.AE0020020.AE0020021form2.PUCH_ODR_START_TIME = {};
expj.AE0020020.AE0020021form2.PUCH_ODR_START_TIME.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_START_TIME.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_START_TIME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_START_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_START_TIME', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_START_TIME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_START_TIME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_START_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_START_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_START_TIME" name="PUCH_ODR_START_TIME" class="AE0020020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_START_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb)%></span><!-- 発注数 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_QTY">
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY = {};
// script1="onDecision;0;SET;_PUCH_ODR_AMOUNT=[{_UNIT_COST}*{_PUCH_ODR_QTY}]"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision0 = function () {
  console.log('PUCH_ODR_QTY script1');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_UNIT_COST') + '*' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_QTY')));
};
// script2="onDecision;1;SET;_DISC_AMOUNT=0"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision1 = function () {
  console.log('PUCH_ODR_QTY script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_DISC_AMOUNT', '0');
};
// script3="onDecision;2;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision2 = function () {
  console.log('PUCH_ODR_QTY script3');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_DISC_AMOUNT')));
};
// script4="onDecision;3;SET;_TAX_AMOUNT_1=[{_NET_AMOUNT}*({_TAX_RATE_1}/100)]"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision3 = function () {
  console.log('PUCH_ODR_QTY script4');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_1') + '/100)'));
};
// script5="onDecision;4;SET;_TAX_AMOUNT_2=[{_NET_AMOUNT}*({_TAX_RATE_2}/100)]"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision4 = function () {
  console.log('PUCH_ODR_QTY script5');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_2') + '/100)'));
};
// script6="onDecision;5;SET;_TAX_AMOUNT_3=[{_NET_AMOUNT}*({_TAX_RATE_3}/100)]"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision5 = function () {
  console.log('PUCH_ODR_QTY script6');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_3') + '/100)'));
};
// script7="onDecision;6;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision6 = function () {
  console.log('PUCH_ODR_QTY script7');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3')));
};
// script8="onDecision;7;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision7 = function () {
  console.log('PUCH_ODR_QTY script8');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_EXCH_RATE')));
};
// script9="onDecision;8;CHK;?THIS[eq]DIFFER@*0"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.onDecision8 = function () {
  console.log('PUCH_ODR_QTY script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script10="child;0;SET;_SelectUnitCostFlag=false"
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.child0 = function () {
  console.log('PUCH_ODR_QTY script10');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_SelectUnitCostFlag', 'false');
};
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_QTY.onDecision');
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.PUCH_ODR_QTY['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.PUCH_ODR_QTY['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_QTY', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_QTY" name="PUCH_ODR_QTY" class="AE0020020-focus-move  required-value expj-AE0020020-required-A" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-STOCK_UNIT">
expj.AE0020020.AE0020021form2.STOCK_UNIT = {};
expj.AE0020020.AE0020021form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/STOCK_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'STOCK_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-STOCK_UNIT" name="STOCK_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-h_PUCH_ODR_QTY" name="h_PUCH_ODR_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.geth_PUCH_ODR_QTY()) %>">
<script class="expj-script-AE0020020-AE0020021form2-h_PUCH_ODR_QTY">
expj.AE0020020.AE0020021form2.h_PUCH_ODR_QTY = {};
expj.AE0020020.AE0020021form2.h_PUCH_ODR_QTY.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/h_PUCH_ODR_QTY.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.h_PUCH_ODR_QTY.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-h_PUCH_ODR_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'h_PUCH_ODR_QTY', this);
  });
  expj.AE0020020.AE0020021form2.h_PUCH_ODR_QTY.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.h_PUCH_ODR_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/h_PUCH_ODR_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-h_PUCH_ODR_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-OUTSIDE_TYP">
expj.AE0020020.AE0020021form2.OUTSIDE_TYP = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AE0020020.AE0020021form2.OUTSIDE_TYP.onLoad0 = function () {
  console.log('OUTSIDE_TYP script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;_OUTSIDE_TYP[eq]1@*0,*1"
expj.AE0020020.AE0020021form2.OUTSIDE_TYP.onDecision0 = function () {
  console.log('OUTSIDE_TYP script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_OUTSIDE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;MASK;_VEND_CD,_WH_CD,_PUCH_ODR_PERSON,_SPL_ITEM_TYP,_UNIT_COST_TYP,_UNIT_COST,_PROCESSING_COST,_MATERIAL_COST,_OTHER_OVERHEADS,_DISC_AMOUNT,_NET_AMOUNT,_EXCH_RATE,_SelectUnitCost"
expj.AE0020020.AE0020021form2.OUTSIDE_TYP.child0 = function () {
  console.log('OUTSIDE_TYP script3');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_WH_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_PUCH_ODR_PERSON');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_SPL_ITEM_TYP');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_UNIT_COST_TYP');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_UNIT_COST');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_PROCESSING_COST');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_MATERIAL_COST');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_OTHER_OVERHEADS');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_DISC_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_NET_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_EXCH_RATE');
expj.common.pscript.setMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_SelectUnitCost');
};
// script4="child;1;UNMASK;_VEND_CD,_WH_CD,_PUCH_ODR_PERSON,_SPL_ITEM_TYP,_UNIT_COST_TYP,_UNIT_COST,_PROCESSING_COST,_MATERIAL_COST,_OTHER_OVERHEADS,_DISC_AMOUNT,_NET_AMOUNT,_EXCH_RATE,_SelectUnitCost"
expj.AE0020020.AE0020021form2.OUTSIDE_TYP.child1 = function () {
  console.log('OUTSIDE_TYP script4');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_VEND_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_WH_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_PUCH_ODR_PERSON');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_SPL_ITEM_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_UNIT_COST_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_UNIT_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_PROCESSING_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_MATERIAL_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_OTHER_OVERHEADS');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_DISC_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_NET_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_EXCH_RATE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0020020', 'AE0020021form2', '_SelectUnitCost');
};
expj.AE0020020.AE0020021form2.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/OUTSIDE_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.OUTSIDE_TYP['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.OUTSIDE_TYP['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0020020', 'AE0020021form2', 'OUTSIDE_TYP', this);
  });
  expj.AE0020020.AE0020021form2.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.OUTSIDE_TYP['onLoad' + i])) {
      expj.AE0020020.AE0020021form2.OUTSIDE_TYP['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AE0020020-AE0020021form2-OUTSIDE_TYP" name='OUTSIDE_TYP' class='AE0020020-focus-move' style='width:260px;'><%  for(int i = 0, size = aAE0020020Control.getStruct().getList_OUTSIDE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0020020Control.getStruct().getList_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0020020Control.getStruct().getList_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0020020Struct.getOUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-h_OUTSIDE_TYP" name="h_OUTSIDE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.geth_OUTSIDE_TYP()) %>">
<script class="expj-script-AE0020020-AE0020021form2-h_OUTSIDE_TYP">
expj.AE0020020.AE0020021form2.h_OUTSIDE_TYP = {};
expj.AE0020020.AE0020021form2.h_OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/h_OUTSIDE_TYP.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.h_OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-h_OUTSIDE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'h_OUTSIDE_TYP', this);
  });
  expj.AE0020020.AE0020021form2.h_OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.h_OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/h_OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-h_OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-VEND_CD">
expj.AE0020020.AE0020021form2.VEND_CD = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0020020.AE0020021form2.VEND_CD.onDecision0 = function () {
  console.log('VEND_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AE0020020.AE0020021form2.VEND_CD.child0 = function () {
  console.log('VEND_CD script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_SelectUnitCostFlag', 'false');
};
expj.AE0020020.AE0020021form2.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/VEND_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.VEND_CD['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.VEND_CD['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'VEND_CD', this);
  });
  expj.AE0020020.AE0020021form2.VEND_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-VEND_CD" name="VEND_CD" class="AE0020020-focus-move  required-value expj-AE0020020-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PeekerVendCd">
expj.AE0020020.AE0020021form2.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AE0020021form2/VEND_CD@<%=contextNo%>"
expj.AE0020020.AE0020021form2.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0020020';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0020021form2/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0020020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0020020.AE0020021form2.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.PeekerVendCd['onClick' + i])) {
        expj.AE0020020.AE0020021form2.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021form2.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021form2.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021form2', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AE0020020.AE0020021form2.PeekerVendCd.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0020020-AE0020021form2-PeekerVendCd" class="AE0020020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-VEND_NAME">
expj.AE0020020.AE0020021form2.VEND_NAME = {};
expj.AE0020020.AE0020021form2.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/VEND_NAME.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'VEND_NAME', this);
  });
  expj.AE0020020.AE0020021form2.VEND_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-VEND_NAME" name="VEND_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD_2",rb)%></span><!-- 受入場所 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-WH_CD">
expj.AE0020020.AE0020021form2.WH_CD = {};
expj.AE0020020.AE0020021form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/WH_CD.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.WH_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'WH_CD', this);
  });
  expj.AE0020020.AE0020021form2.WH_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-WH_CD" name="WH_CD" class="AE0020020-focus-move  required-value expj-AE0020020-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PeekerWhCd">
expj.AE0020020.AE0020021form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AE0020021form2/WH_CD@<%=contextNo%>"
expj.AE0020020.AE0020021form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0020020';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AE0020021form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0020020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0020020.AE0020021form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.PeekerWhCd['onClick' + i])) {
        expj.AE0020020.AE0020021form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AE0020020.AE0020021form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0020020-AE0020021form2-PeekerWhCd" class="AE0020020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-WH_NAME">
expj.AE0020020.AE0020021form2.WH_NAME = {};
expj.AE0020020.AE0020021form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/WH_NAME.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'WH_NAME', this);
  });
  expj.AE0020020.AE0020021form2.WH_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-WH_NAME" name="WH_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_PERSON",rb)%></span><!-- 発注担当者コード --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_PERSON">
expj.AE0020020.AE0020021form2.PUCH_ODR_PERSON = {};
expj.AE0020020.AE0020021form2.PUCH_ODR_PERSON.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_PERSON.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_PERSON.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_PERSON', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_PERSON.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_PERSON.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_PERSON" name="PUCH_ODR_PERSON" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_PERSON()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-USER_NAME">
expj.AE0020020.AE0020021form2.USER_NAME = {};
expj.AE0020020.AE0020021form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/USER_NAME.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.USER_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'USER_NAME', this);
  });
  expj.AE0020020.AE0020021form2.USER_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-USER_NAME" name="USER_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)%></span><!-- 受給品区分 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-SPL_ITEM_TYP">
expj.AE0020020.AE0020021form2.SPL_ITEM_TYP = {};
expj.AE0020020.AE0020021form2.SPL_ITEM_TYP.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/SPL_ITEM_TYP.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.SPL_ITEM_TYP.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-SPL_ITEM_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0020020', 'AE0020021form2', 'SPL_ITEM_TYP', this);
  });
  expj.AE0020020.AE0020021form2.SPL_ITEM_TYP.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.SPL_ITEM_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/SPL_ITEM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-SPL_ITEM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AE0020020-AE0020021form2-SPL_ITEM_TYP" name='SPL_ITEM_TYP' class='AE0020020-focus-move' style='width:260px;'><%  for(int i = 0, size = aAE0020020Control.getStruct().getList_SPL_ITEM_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0020020Control.getStruct().getList_SPL_ITEM_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0020020Control.getStruct().getList_SPL_ITEM_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0020020Struct.getSPL_ITEM_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-h_SPL_ITEM_TYP" name="h_SPL_ITEM_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.geth_SPL_ITEM_TYP()) %>">
<script class="expj-script-AE0020020-AE0020021form2-h_SPL_ITEM_TYP">
expj.AE0020020.AE0020021form2.h_SPL_ITEM_TYP = {};
expj.AE0020020.AE0020021form2.h_SPL_ITEM_TYP.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/h_SPL_ITEM_TYP.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.h_SPL_ITEM_TYP.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-h_SPL_ITEM_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'h_SPL_ITEM_TYP', this);
  });
  expj.AE0020020.AE0020021form2.h_SPL_ITEM_TYP.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.h_SPL_ITEM_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/h_SPL_ITEM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-h_SPL_ITEM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRODUCT_TYP",rb)%></span><!-- 製品区分 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PRODUCT_TYP_DN">
expj.AE0020020.AE0020021form2.PRODUCT_TYP_DN = {};
expj.AE0020020.AE0020021form2.PRODUCT_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PRODUCT_TYP_DN.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PRODUCT_TYP_DN.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PRODUCT_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PRODUCT_TYP_DN', this);
  });
  expj.AE0020020.AE0020021form2.PRODUCT_TYP_DN.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PRODUCT_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PRODUCT_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PRODUCT_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PRODUCT_TYP_DN" name="PRODUCT_TYP_DN" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPRODUCT_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-PRODUCT_TYP" name="PRODUCT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPRODUCT_TYP()) %>">
<script class="expj-script-AE0020020-AE0020021form2-PRODUCT_TYP">
expj.AE0020020.AE0020021form2.PRODUCT_TYP = {};
expj.AE0020020.AE0020021form2.PRODUCT_TYP.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PRODUCT_TYP.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PRODUCT_TYP.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PRODUCT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PRODUCT_TYP', this);
  });
  expj.AE0020020.AE0020021form2.PRODUCT_TYP.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PRODUCT_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PRODUCT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PRODUCT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_CD_1",rb)%></span><!-- 取引通貨コード --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CUR_CD">
expj.AE0020020.AE0020021form2.CUR_CD = {};
expj.AE0020020.AE0020021form2.CUR_CD.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/CUR_CD.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.CUR_CD.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'CUR_CD', this);
  });
  expj.AE0020020.AE0020021form2.CUR_CD.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-CUR_CD" name="CUR_CD" class="AE0020020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getCUR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-CUR_NAME">
expj.AE0020020.AE0020021form2.CUR_NAME = {};
expj.AE0020020.AE0020021form2.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/CUR_NAME.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.CUR_NAME.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'CUR_NAME', this);
  });
  expj.AE0020020.AE0020021form2.CUR_NAME.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-CUR_NAME" name="CUR_NAME" class="AE0020020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)%></span><!-- 単価区分 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-UNIT_COST_TYP">
expj.AE0020020.AE0020021form2.UNIT_COST_TYP = {};
expj.AE0020020.AE0020021form2.UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/UNIT_COST_TYP.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-UNIT_COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0020020', 'AE0020021form2', 'UNIT_COST_TYP', this);
  });
  expj.AE0020020.AE0020021form2.UNIT_COST_TYP.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AE0020020-AE0020021form2-UNIT_COST_TYP" name='UNIT_COST_TYP' class='AE0020020-focus-move' style='width:260px;'><%  for(int i = 0, size = aAE0020020Control.getStruct().getList_UNIT_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0020020Control.getStruct().getList_UNIT_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0020020Control.getStruct().getList_UNIT_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0020020Struct.getUNIT_COST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-SelectUnitCost">
expj.AE0020020.AE0020021form2.SelectUnitCost = {};
// script1="onClick;0;CHK;_PUCH_ODR_DLV_DATE[eq]@#AE00014"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_DLV_DATE'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AE00014');
}
};
// script2="onClick;1;CHK;_PUCH_ODR_START_DATE[eq]@$AE00199"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick1 = function () {
  console.log('SelectUnitCost script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_START_DATE'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021form2', 'AE00199');
}
};
// script3="onClick;2;CHK;_PUCH_ODR_DLV_DATE[neq][and]_PUCH_ODR_START_DATE[neq][and]_PUCH_ODR_DLV_DATE[lt]_PUCH_ODR_START_DATE@#AE32608"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick2 = function () {
  console.log('SelectUnitCost script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_START_DATE')))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AE32608');
}
};
// script4="onClick;3;CHK;_PUCH_ODR_QTY[lte]0@#AE00038"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick3 = function () {
  console.log('SelectUnitCost script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AE00038');
}
};
// script5="onClick;4;CHK;_VEND_CD[eq]@#AE00019"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick4 = function () {
  console.log('SelectUnitCost script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_VEND_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AE00019');
}
};
// script6="onClick;5;CHK;_AE0020021form1/TIME_CTRL[eq]true@*0"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick5 = function () {
  console.log('SelectUnitCost script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script7="child;0;CHK;_AE0020021form2/PUCH_ODR_START_DATE[eq][and]_AE0020021form2/PUCH_ODR_START_TIME[neq]@#AS00103"
expj.AE0020020.AE0020021form2.SelectUnitCost.child0 = function () {
  console.log('SelectUnitCost script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AS00103');
}
};
// script8="onClick;6;CHK;_AE0020021form1/TIME_CTRL[eq]true@*1"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick6 = function () {
  console.log('SelectUnitCost script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script9="child;1;CHK;~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]1[or]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]2@#AS00105"
expj.AE0020020.AE0020021form2.SelectUnitCost.child1 = function () {
  console.log('SelectUnitCost script9');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AS00105');
}
};
// script10="onClick;7;CHK;_AE0020021form1/TIME_CTRL[eq]true@*2"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick7 = function () {
  console.log('SelectUnitCost script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script11="child;2;CHK;~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]1[or]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]2@#AS00106"
expj.AE0020020.AE0020021form2.SelectUnitCost.child2 = function () {
  console.log('SelectUnitCost script11');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AS00106');
}
};
// script12="onClick;8;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]3@*3"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick8 = function () {
  console.log('SelectUnitCost script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script13="child;3;SET;_AE0020021form2/PUCH_ODR_START_TIME=_AE0020021form2/PUCH_ODR_START_TIME"
expj.AE0020020.AE0020021form2.SelectUnitCost.child3 = function () {
  console.log('SelectUnitCost script13');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME'));
};
// script14="onClick;9;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]3@*4"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick9 = function () {
  console.log('SelectUnitCost script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script15="child;4;SET;_AE0020021form2/PUCH_ODR_DLV_TIME=_AE0020021form2/PUCH_ODR_DLV_TIME"
expj.AE0020020.AE0020021form2.SelectUnitCost.child4 = function () {
  console.log('SelectUnitCost script15');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME'));
};
// script16="onClick;10;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]3@*5"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick10 = function () {
  console.log('SelectUnitCost script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script17="child;5;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:1)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:2)}][gte]60@#AS00107"
expj.AE0020020.AE0020021form2.SelectUnitCost.child5 = function () {
  console.log('SelectUnitCost script17');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AS00107');
}
};
// script18="onClick;11;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]3@*6"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick11 = function () {
  console.log('SelectUnitCost script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script19="child;6;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:1)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:2)}][gte]60@#AS00108"
expj.AE0020020.AE0020021form2.SelectUnitCost.child6 = function () {
  console.log('SelectUnitCost script19');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AS00108');
}
};
// script20="onClick;12;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]4@*7"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick12 = function () {
  console.log('SelectUnitCost script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script21="child;7;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:0)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:2)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:3)}][gte]60@#AS00107"
expj.AE0020020.AE0020021form2.SelectUnitCost.child7 = function () {
  console.log('SelectUnitCost script21');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AS00107');
}
};
// script22="onClick;13;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]4@*8"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick13 = function () {
  console.log('SelectUnitCost script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script23="child;8;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:0)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:2)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:3)}][gte]60@#AS00108"
expj.AE0020020.AE0020021form2.SelectUnitCost.child8 = function () {
  console.log('SelectUnitCost script23');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021form2', '_AE0020021form2/PUCH_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021form2', 'AS00108');
}
};
// script24="onClick;14;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0020021form1/*,_AE0020021form2/*@AE0020020Servlet"
expj.AE0020020.AE0020021form2.SelectUnitCost.onClick14 = function () {
  console.log('SelectUnitCost script24');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020021form2', '_AE0020021form1/*,_AE0020021form2/*', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.updateBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0020020.AE0020021form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 14; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.SelectUnitCost['onClick' + i])) {
        expj.AE0020020.AE0020021form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.AE0020020.AE0020021form2.SelectUnitCost.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AE0020020-AE0020021form2-SelectUnitCost" name="SelectUnitCost" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-SelectUnitCostFlag" name="SelectUnitCostFlag" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getSelectUnitCostFlag()) %>">
<script class="expj-script-AE0020020-AE0020021form2-SelectUnitCostFlag">
expj.AE0020020.AE0020021form2.SelectUnitCostFlag = {};
expj.AE0020020.AE0020021form2.SelectUnitCostFlag.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/SelectUnitCostFlag.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.SelectUnitCostFlag.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-SelectUnitCostFlag').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'SelectUnitCostFlag', this);
  });
  expj.AE0020020.AE0020021form2.SelectUnitCostFlag.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.SelectUnitCostFlag.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/SelectUnitCostFlag.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-SelectUnitCostFlag');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-UNIT_COST">
expj.AE0020020.AE0020021form2.UNIT_COST = {};
// script1="onDecision;0;SET;_PUCH_ODR_AMOUNT=[{_UNIT_COST}*{_PUCH_ODR_QTY}]"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision0 = function () {
  console.log('UNIT_COST script1');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_UNIT_COST') + '*' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_QTY')));
};
// script2="onDecision;1;SET;_DISC_AMOUNT=0"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision1 = function () {
  console.log('UNIT_COST script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_DISC_AMOUNT', '0');
};
// script3="onDecision;2;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision2 = function () {
  console.log('UNIT_COST script3');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_DISC_AMOUNT')));
};
// script4="onDecision;3;SET;_TAX_AMOUNT_1=[{_NET_AMOUNT}*({_TAX_RATE_1}/100)]"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision3 = function () {
  console.log('UNIT_COST script4');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_1') + '/100)'));
};
// script5="onDecision;4;SET;_TAX_AMOUNT_2=[{_NET_AMOUNT}*({_TAX_RATE_2}/100)]"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision4 = function () {
  console.log('UNIT_COST script5');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_2') + '/100)'));
};
// script6="onDecision;5;SET;_TAX_AMOUNT_3=[{_NET_AMOUNT}*({_TAX_RATE_3}/100)]"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision5 = function () {
  console.log('UNIT_COST script6');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_3') + '/100)'));
};
// script7="onDecision;6;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision6 = function () {
  console.log('UNIT_COST script7');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3')));
};
// script8="onDecision;7;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0020020.AE0020021form2.UNIT_COST.onDecision7 = function () {
  console.log('UNIT_COST script8');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_EXCH_RATE')));
};
expj.AE0020020.AE0020021form2.UNIT_COST.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/UNIT_COST.onDecision');
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.UNIT_COST['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.UNIT_COST['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.UNIT_COST.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'UNIT_COST', this);
  });
  expj.AE0020020.AE0020021form2.UNIT_COST.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-UNIT_COST" name="UNIT_COST" class="AE0020020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getUNIT_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-VEND_CUR_UNIT" name="VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROCESSING_COST",rb)%></span><!-- 加工費 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PROCESSING_COST">
expj.AE0020020.AE0020021form2.PROCESSING_COST = {};
expj.AE0020020.AE0020021form2.PROCESSING_COST.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PROCESSING_COST.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PROCESSING_COST.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PROCESSING_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PROCESSING_COST', this);
  });
  expj.AE0020020.AE0020021form2.PROCESSING_COST.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PROCESSING_COST.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PROCESSING_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PROCESSING_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PROCESSING_COST" name="PROCESSING_COST" class="AE0020020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPROCESSING_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d1_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d1_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d1_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d1_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d1_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d1_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd1_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d1_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d1_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d1_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d1_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d1_VEND_CUR_UNIT" name="d1_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0707",rb)%></span><!-- 消費税 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-TAX_AMOUNT_1">
expj.AE0020020.AE0020021form2.TAX_AMOUNT_1 = {};
expj.AE0020020.AE0020021form2.TAX_AMOUNT_1.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/TAX_AMOUNT_1.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.TAX_AMOUNT_1.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-TAX_AMOUNT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'TAX_AMOUNT_1', this);
  });
  expj.AE0020020.AE0020021form2.TAX_AMOUNT_1.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.TAX_AMOUNT_1.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/TAX_AMOUNT_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-TAX_AMOUNT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-TAX_AMOUNT_1" name="TAX_AMOUNT_1" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getTAX_ROUND_TYP(), aAE0020020Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getTAX_AMOUNT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d7_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d7_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d7_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d7_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d7_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d7_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd7_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d7_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d7_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d7_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d7_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d7_VEND_CUR_UNIT" name="d7_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-TAX_RATE_1" name="TAX_RATE_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getTAX_RATE_1()) %>">
<script class="expj-script-AE0020020-AE0020021form2-TAX_RATE_1">
expj.AE0020020.AE0020021form2.TAX_RATE_1 = {};
expj.AE0020020.AE0020021form2.TAX_RATE_1.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/TAX_RATE_1.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.TAX_RATE_1.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-TAX_RATE_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'TAX_RATE_1', this);
  });
  expj.AE0020020.AE0020021form2.TAX_RATE_1.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.TAX_RATE_1.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/TAX_RATE_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-TAX_RATE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MATERIAL_COST",rb)%></span><!-- 材料費 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-MATERIAL_COST">
expj.AE0020020.AE0020021form2.MATERIAL_COST = {};
expj.AE0020020.AE0020021form2.MATERIAL_COST.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/MATERIAL_COST.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.MATERIAL_COST.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-MATERIAL_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'MATERIAL_COST', this);
  });
  expj.AE0020020.AE0020021form2.MATERIAL_COST.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.MATERIAL_COST.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/MATERIAL_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-MATERIAL_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-MATERIAL_COST" name="MATERIAL_COST" class="AE0020020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getMATERIAL_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d2_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d2_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d2_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d2_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d2_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d2_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd2_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d2_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d2_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d2_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d2_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d2_VEND_CUR_UNIT" name="d2_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0708",rb)%></span><!-- 取引税 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-TAX_AMOUNT_2">
expj.AE0020020.AE0020021form2.TAX_AMOUNT_2 = {};
expj.AE0020020.AE0020021form2.TAX_AMOUNT_2.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/TAX_AMOUNT_2.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.TAX_AMOUNT_2.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-TAX_AMOUNT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'TAX_AMOUNT_2', this);
  });
  expj.AE0020020.AE0020021form2.TAX_AMOUNT_2.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.TAX_AMOUNT_2.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/TAX_AMOUNT_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-TAX_AMOUNT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-TAX_AMOUNT_2" name="TAX_AMOUNT_2" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getTAX_ROUND_TYP(), aAE0020020Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getTAX_AMOUNT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d8_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d8_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d8_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d8_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d8_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d8_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd8_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d8_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d8_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d8_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d8_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d8_VEND_CUR_UNIT" name="d8_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-TAX_RATE_2" name="TAX_RATE_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getTAX_RATE_2()) %>">
<script class="expj-script-AE0020020-AE0020021form2-TAX_RATE_2">
expj.AE0020020.AE0020021form2.TAX_RATE_2 = {};
expj.AE0020020.AE0020021form2.TAX_RATE_2.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/TAX_RATE_2.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.TAX_RATE_2.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-TAX_RATE_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'TAX_RATE_2', this);
  });
  expj.AE0020020.AE0020021form2.TAX_RATE_2.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.TAX_RATE_2.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/TAX_RATE_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-TAX_RATE_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)%></span><!-- その他経費 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-OTHER_OVERHEADS">
expj.AE0020020.AE0020021form2.OTHER_OVERHEADS = {};
expj.AE0020020.AE0020021form2.OTHER_OVERHEADS.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/OTHER_OVERHEADS.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.OTHER_OVERHEADS.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-OTHER_OVERHEADS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'OTHER_OVERHEADS', this);
  });
  expj.AE0020020.AE0020021form2.OTHER_OVERHEADS.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.OTHER_OVERHEADS.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/OTHER_OVERHEADS.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-OTHER_OVERHEADS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-OTHER_OVERHEADS" name="OTHER_OVERHEADS" class="AE0020020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getOTHER_OVERHEADS()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d3_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d3_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d3_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d3_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d3_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d3_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd3_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d3_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d3_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d3_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d3_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d3_VEND_CUR_UNIT" name="d3_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0709",rb)%></span><!-- その他税 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-TAX_AMOUNT_3">
expj.AE0020020.AE0020021form2.TAX_AMOUNT_3 = {};
expj.AE0020020.AE0020021form2.TAX_AMOUNT_3.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/TAX_AMOUNT_3.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.TAX_AMOUNT_3.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-TAX_AMOUNT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'TAX_AMOUNT_3', this);
  });
  expj.AE0020020.AE0020021form2.TAX_AMOUNT_3.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.TAX_AMOUNT_3.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/TAX_AMOUNT_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-TAX_AMOUNT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-TAX_AMOUNT_3" name="TAX_AMOUNT_3" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getTAX_ROUND_TYP(), aAE0020020Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getTAX_AMOUNT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d9_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d9_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d9_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d9_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d9_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d9_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd9_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d9_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d9_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d9_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d9_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d9_VEND_CUR_UNIT" name="d9_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0020020-AE0020021form2-TAX_RATE_3" name="TAX_RATE_3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getTAX_RATE_3()) %>">
<script class="expj-script-AE0020020-AE0020021form2-TAX_RATE_3">
expj.AE0020020.AE0020021form2.TAX_RATE_3 = {};
expj.AE0020020.AE0020021form2.TAX_RATE_3.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/TAX_RATE_3.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.TAX_RATE_3.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-TAX_RATE_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'TAX_RATE_3', this);
  });
  expj.AE0020020.AE0020021form2.TAX_RATE_3.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.TAX_RATE_3.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/TAX_RATE_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-TAX_RATE_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2",rb)%></span><!-- 発注金額 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_AMOUNT">
expj.AE0020020.AE0020021form2.PUCH_ODR_AMOUNT = {};
expj.AE0020020.AE0020021form2.PUCH_ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_AMOUNT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_AMOUNT', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_AMOUNT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_AMOUNT" name="PUCH_ODR_AMOUNT" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getROUND_TYP(), aAE0020020Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d4_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d4_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d4_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d4_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d4_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d4_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd4_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d4_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d4_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d4_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d4_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d4_VEND_CUR_UNIT" name="d4_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX",rb)%></span><!-- 税込金額 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-AMOUNT_INCLUDE_TAX">
expj.AE0020020.AE0020021form2.AMOUNT_INCLUDE_TAX = {};
expj.AE0020020.AE0020021form2.AMOUNT_INCLUDE_TAX.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/AMOUNT_INCLUDE_TAX.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.AMOUNT_INCLUDE_TAX.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-AMOUNT_INCLUDE_TAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'AMOUNT_INCLUDE_TAX', this);
  });
  expj.AE0020020.AE0020021form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/AMOUNT_INCLUDE_TAX.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-AMOUNT_INCLUDE_TAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-AMOUNT_INCLUDE_TAX" name="AMOUNT_INCLUDE_TAX" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getROUND_TYP(), aAE0020020Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getAMOUNT_INCLUDE_TAX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d10_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d10_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d10_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d10_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d10_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d10_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd10_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d10_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d10_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d10_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d10_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d10_VEND_CUR_UNIT" name="d10_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DISC_AMOUNT",rb)%></span><!-- 値引金額 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-DISC_AMOUNT">
expj.AE0020020.AE0020021form2.DISC_AMOUNT = {};
// script1="onDecision;0;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0020020.AE0020021form2.DISC_AMOUNT.onDecision0 = function () {
  console.log('DISC_AMOUNT script1');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_DISC_AMOUNT')));
};
// script2="onDecision;1;SET;_TAX_AMOUNT_1=[{_NET_AMOUNT}*({_TAX_RATE_1}/100)]"
expj.AE0020020.AE0020021form2.DISC_AMOUNT.onDecision1 = function () {
  console.log('DISC_AMOUNT script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_1') + '/100)'));
};
// script3="onDecision;2;SET;_TAX_AMOUNT_2=[{_NET_AMOUNT}*({_TAX_RATE_2}/100)]"
expj.AE0020020.AE0020021form2.DISC_AMOUNT.onDecision2 = function () {
  console.log('DISC_AMOUNT script3');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_2') + '/100)'));
};
// script4="onDecision;3;SET;_TAX_AMOUNT_3=[{_NET_AMOUNT}*({_TAX_RATE_3}/100)]"
expj.AE0020020.AE0020021form2.DISC_AMOUNT.onDecision3 = function () {
  console.log('DISC_AMOUNT script4');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_3') + '/100)'));
};
// script5="onDecision;4;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0020020.AE0020021form2.DISC_AMOUNT.onDecision4 = function () {
  console.log('DISC_AMOUNT script5');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3')));
};
// script6="onDecision;5;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0020020.AE0020021form2.DISC_AMOUNT.onDecision5 = function () {
  console.log('DISC_AMOUNT script6');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_EXCH_RATE')));
};
expj.AE0020020.AE0020021form2.DISC_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/DISC_AMOUNT.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.DISC_AMOUNT['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.DISC_AMOUNT['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.DISC_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-DISC_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'DISC_AMOUNT', this);
  });
  expj.AE0020020.AE0020021form2.DISC_AMOUNT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.DISC_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/DISC_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-DISC_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-DISC_AMOUNT" name="DISC_AMOUNT" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getROUND_TYP(), aAE0020020Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getDISC_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d5_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d5_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d5_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d5_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d5_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d5_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd5_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d5_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d5_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d5_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d5_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d5_VEND_CUR_UNIT" name="d5_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HOME_CUR_AMOUNT",rb)%></span><!-- 邦貨金額 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-HOME_CUR_AMOUNT">
expj.AE0020020.AE0020021form2.HOME_CUR_AMOUNT = {};
expj.AE0020020.AE0020021form2.HOME_CUR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/HOME_CUR_AMOUNT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.HOME_CUR_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-HOME_CUR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'HOME_CUR_AMOUNT', this);
  });
  expj.AE0020020.AE0020021form2.HOME_CUR_AMOUNT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.HOME_CUR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/HOME_CUR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-HOME_CUR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-HOME_CUR_AMOUNT" name="HOME_CUR_AMOUNT" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getROUND_TYP(), aAE0020020Struct.getHOME_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getHOME_CUR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-HOME_CUR_UNIT">
expj.AE0020020.AE0020021form2.HOME_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/HOME_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'HOME_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-HOME_CUR_UNIT" name="HOME_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NET_AMOUNT",rb)%></span><!-- 本体金額 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-NET_AMOUNT">
expj.AE0020020.AE0020021form2.NET_AMOUNT = {};
// script1="onDecision;0;SET;_DISC_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_NET_AMOUNT}]"
expj.AE0020020.AE0020021form2.NET_AMOUNT.onDecision0 = function () {
  console.log('NET_AMOUNT script1');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_DISC_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT')));
};
// script2="onDecision;1;SET;_TAX_AMOUNT_1=[{_NET_AMOUNT}*({_TAX_RATE_1}/100)]"
expj.AE0020020.AE0020021form2.NET_AMOUNT.onDecision1 = function () {
  console.log('NET_AMOUNT script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_1') + '/100)'));
};
// script3="onDecision;2;SET;_TAX_AMOUNT_2=[{_NET_AMOUNT}*({_TAX_RATE_2}/100)]"
expj.AE0020020.AE0020021form2.NET_AMOUNT.onDecision2 = function () {
  console.log('NET_AMOUNT script3');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_2') + '/100)'));
};
// script4="onDecision;3;SET;_TAX_AMOUNT_3=[{_NET_AMOUNT}*({_TAX_RATE_3}/100)]"
expj.AE0020020.AE0020021form2.NET_AMOUNT.onDecision3 = function () {
  console.log('NET_AMOUNT script4');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '*(' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_RATE_3') + '/100)'));
};
// script5="onDecision;4;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0020020.AE0020021form2.NET_AMOUNT.onDecision4 = function () {
  console.log('NET_AMOUNT script5');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_TAX_AMOUNT_3')));
};
// script6="onDecision;5;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0020020.AE0020021form2.NET_AMOUNT.onDecision5 = function () {
  console.log('NET_AMOUNT script6');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_EXCH_RATE')));
};
expj.AE0020020.AE0020021form2.NET_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/NET_AMOUNT.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.NET_AMOUNT['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.NET_AMOUNT['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.NET_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-NET_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'NET_AMOUNT', this);
  });
  expj.AE0020020.AE0020021form2.NET_AMOUNT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.NET_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/NET_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-NET_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-NET_AMOUNT" name="NET_AMOUNT" class="AE0020020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0020020Struct.getROUND_TYP(), aAE0020020Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getNET_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d6_VEND_CUR_UNIT">
expj.AE0020020.AE0020021form2.d6_VEND_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d6_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d6_VEND_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d6_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d6_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd6_VEND_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d6_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d6_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d6_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d6_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d6_VEND_CUR_UNIT" name="d6_VEND_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EXCH_RATE",rb)%></span><!-- 為替レート --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-EXCH_RATE">
expj.AE0020020.AE0020021form2.EXCH_RATE = {};
// script1="onDecision;0;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0020020.AE0020021form2.EXCH_RATE.onDecision0 = function () {
  console.log('EXCH_RATE script1');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021form2', '_EXCH_RATE')));
};
expj.AE0020020.AE0020021form2.EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/EXCH_RATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021form2.EXCH_RATE['onDecision' + i])) {
        expj.AE0020020.AE0020021form2.EXCH_RATE['onDecision' + i]();
      }
    }
  }
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.EXCH_RATE.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'EXCH_RATE', this);
  });
  expj.AE0020020.AE0020021form2.EXCH_RATE.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-EXCH_RATE" name="EXCH_RATE" class="AE0020020-focus-move  required-value expj-AE0020020-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;6" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getEXCH_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-d_HOME_CUR_UNIT">
expj.AE0020020.AE0020021form2.d_HOME_CUR_UNIT = {};
expj.AE0020020.AE0020021form2.d_HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/d_HOME_CUR_UNIT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.d_HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-d_HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'd_HOME_CUR_UNIT', this);
  });
  expj.AE0020020.AE0020021form2.d_HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.d_HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/d_HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-d_HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-d_HOME_CUR_UNIT" name="d_HOME_CUR_UNIT" class="AE0020020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_COMMENT",rb)%></span><!-- 発注備考 --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021form2-PUCH_ODR_COMMENT">
expj.AE0020020.AE0020021form2.PUCH_ODR_COMMENT = {};
expj.AE0020020.AE0020021form2.PUCH_ODR_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0020021form2/PUCH_ODR_COMMENT.onDecision');
  expj.AE0020020.AE0020021form2.executeAllOnDecision();
  expj.AE0020020.executeAllOnDecision();
};
expj.AE0020020.AE0020021form2.PUCH_ODR_COMMENT.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021form2-PUCH_ODR_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0020020', 'AE0020021form2', 'PUCH_ODR_COMMENT', this);
  });
  expj.AE0020020.AE0020021form2.PUCH_ODR_COMMENT.executePScriptOnLoad();
};

expj.AE0020020.AE0020021form2.PUCH_ODR_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0020021form2/PUCH_ODR_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021form2-PUCH_ODR_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AE0020020-AE0020021form2-PUCH_ODR_COMMENT" name="PUCH_ODR_COMMENT" class="AE0020020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0020020Struct.getPUCH_ODR_COMMENT()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0020020-AE0020021button1">
expj.AE0020020.AE0020021button1 = {};
expj.AE0020020.AE0020021button1.executeAllOnDecision = function () {
  console.log('execute AE0020021button1.onDecision');
};
expj.AE0020020.AE0020021button1.executeOnLoad = function () {
  expj.AE0020020.AE0020021button1.executePScriptOnLoad();
};

expj.AE0020020.AE0020021button1.executePScriptOnLoad = function () {
  console.log('execute AE0020021button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020020-AE0020021button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020020-AE0020021button1-Insert">
expj.AE0020020.AE0020021button1.Insert = {};
// script1="onClick;0;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]_AE0020021form2/PUCH_ODR_DLV_TIME[eq]@*0"
expj.AE0020020.AE0020021button1.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_AE0020021form2/PUCH_ODR_DLV_TIME=2359"
expj.AE0020020.AE0020021button1.Insert.child0 = function () {
  console.log('Insert script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2359');
};
// script3="onClick;1;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]_AE0020021form2/CONFIRM_DLV_DATE[neq][and]_AE0020021form2/CONFIRM_DLV_TIME[eq]@*1"
expj.AE0020020.AE0020021button1.Insert.onClick1 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;SET;_AE0020021form2/CONFIRM_DLV_TIME=2359"
expj.AE0020020.AE0020021button1.Insert.child1 = function () {
  console.log('Insert script4');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '2359');
};
// script5="onClick;2;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_START_TIME[eq]@*2"
expj.AE0020020.AE0020021button1.Insert.onClick2 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;SET;_AE0020021form2/PUCH_ODR_START_TIME=2359"
expj.AE0020020.AE0020021button1.Insert.child2 = function () {
  console.log('Insert script6');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '2359');
};
// script7="onClick;3;CHK;_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_DLV_DATE[lt]_AE0020021form2/PUCH_ODR_START_DATE@#AE32608"
expj.AE0020020.AE0020021button1.Insert.onClick3 = function () {
  console.log('Insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE')))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32608');
}
};
// script8="onClick;4;CHK;_AE0020021form2/PUCH_ODR_QTY[lte]0@#AE00038"
expj.AE0020020.AE0020021button1.Insert.onClick4 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE00038');
}
};
// script9="onClick;5;CHK;_AE0020021form2/OUTSIDE_TYP[eq]1@#AE00011"
expj.AE0020020.AE0020021button1.Insert.onClick5 = function () {
  console.log('Insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OUTSIDE_TYP'), '[eq]', '1')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE00011');
}
};
// script10="onClick;6;CHK;_AE0020021form2/EXCH_RATE[lte]0@#AE00059"
expj.AE0020020.AE0020021button1.Insert.onClick6 = function () {
  console.log('Insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/EXCH_RATE')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE00059');
}
};
// script11="onClick;7;CHK;_AE0020021form2/PUCH_ODR_START_DATE[eq]@$AE00064"
expj.AE0020020.AE0020021button1.Insert.onClick7 = function () {
  console.log('Insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE00064');
}
};
// script12="onClick;8;CHK;_AE0020021form2/SelectUnitCostFlag[eq]false@$AE00062"
expj.AE0020020.AE0020021button1.Insert.onClick8 = function () {
  console.log('Insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/SelectUnitCostFlag'), '[eq]', 'false')) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE00062');
}
};
// script13="onClick;9;CHK;_AE0020021form2/UNIT_COST[lt][{_AE0020021form2/PROCESSING_COST}+{_AE0020021form2/MATERIAL_COST}+{_AE0020021form2/OTHER_OVERHEADS}]@$AE00066"
expj.AE0020020.AE0020021button1.Insert.onClick9 = function () {
  console.log('Insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/UNIT_COST')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PROCESSING_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/MATERIAL_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OTHER_OVERHEADS')))) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE00066');
}
};
// script14="onClick;10;CHK;_AE0020021form2/PUCH_ODR_DLV_DATE[neq][and]_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_DLV_TIME[neq][and]_AE0020021form2/PUCH_ODR_START_TIME[neq][and]_AE0020021form2/PUCH_ODR_DLV_DATE[eq]_AE0020021form2/PUCH_ODR_START_DATE[and]_AE0020021form2/PUCH_ODR_DLV_TIME[lt]_AE0020021form2/PUCH_ODR_START_TIME@#AE32608"
expj.AE0020020.AE0020021button1.Insert.onClick10 = function () {
  console.log('Insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME')))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32608');
}
};
// script15="onClick;11;CHK;_AE0020021form2/PUCH_ODR_DLV_DATE[neq][and]_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_DLV_TIME[neq][and]_AE0020021form2/PUCH_ODR_START_TIME[eq][and]_AE0020021form2/PUCH_ODR_DLV_DATE[eq]_AE0020021form2/PUCH_ODR_START_DATE[and]_AE0020021form2/PUCH_ODR_DLV_TIME[lt]2359@#AE32608"
expj.AE0020020.AE0020021button1.Insert.onClick11 = function () {
  console.log('Insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME')), '[lt]', expj.common.pscript.convertNumber('2359'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32608');
}
};
// script16="onClick;12;CHK;_AE0020021form1/TIME_CTRL[eq]true@*3"
expj.AE0020020.AE0020021button1.Insert.onClick12 = function () {
  console.log('Insert script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script17="child;3;CHK;_AE0020021form2/PUCH_ODR_START_DATE[eq][and]_AE0020021form2/PUCH_ODR_START_TIME[neq]@#AS00103"
expj.AE0020020.AE0020021button1.Insert.child3 = function () {
  console.log('Insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00103');
}
};
// script18="onClick;13;CHK;_AE0020021form1/TIME_CTRL[eq]true@*4"
expj.AE0020020.AE0020021button1.Insert.onClick13 = function () {
  console.log('Insert script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script19="child;4;CHK;_AE0020021form2/CONFIRM_DLV_DATE[eq][and]_AE0020021form2/CONFIRM_DLV_TIME[neq]@#AS00112"
expj.AE0020020.AE0020021button1.Insert.child4 = function () {
  console.log('Insert script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00112');
}
};
// script20="onClick;14;CHK;_AE0020021form1/TIME_CTRL[eq]true@*5"
expj.AE0020020.AE0020021button1.Insert.onClick14 = function () {
  console.log('Insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script21="child;5;CHK;~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]1[or]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]2@#AS00105"
expj.AE0020020.AE0020021button1.Insert.child5 = function () {
  console.log('Insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00105');
}
};
// script22="onClick;15;CHK;_AE0020021form1/TIME_CTRL[eq]true@*6"
expj.AE0020020.AE0020021button1.Insert.onClick15 = function () {
  console.log('Insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script23="child;6;CHK;~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]1[or]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]2@#AS00106"
expj.AE0020020.AE0020021button1.Insert.child6 = function () {
  console.log('Insert script23');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00106');
}
};
// script24="onClick;16;CHK;_AE0020021form1/TIME_CTRL[eq]true@*7"
expj.AE0020020.AE0020021button1.Insert.onClick16 = function () {
  console.log('Insert script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script25="child;7;CHK;~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]1[or]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]2@#AS00113"
expj.AE0020020.AE0020021button1.Insert.child7 = function () {
  console.log('Insert script25');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00113');
}
};
// script26="onClick;17;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]3@*8"
expj.AE0020020.AE0020021button1.Insert.onClick17 = function () {
  console.log('Insert script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script27="child;8;SET;_AE0020021form2/PUCH_ODR_START_TIME=_AE0020021form2/PUCH_ODR_START_TIME"
expj.AE0020020.AE0020021button1.Insert.child8 = function () {
  console.log('Insert script27');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'));
};
// script28="onClick;18;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]3@*9"
expj.AE0020020.AE0020021button1.Insert.onClick18 = function () {
  console.log('Insert script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script29="child;9;SET;_AE0020021form2/PUCH_ODR_DLV_TIME=_AE0020021form2/PUCH_ODR_DLV_TIME"
expj.AE0020020.AE0020021button1.Insert.child9 = function () {
  console.log('Insert script29');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'));
};
// script30="onClick;19;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]3@*10"
expj.AE0020020.AE0020021button1.Insert.onClick19 = function () {
  console.log('Insert script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script31="child;10;SET;_AE0020021form2/CONFIRM_DLV_TIME=_AE0020021form2/CONFIRM_DLV_TIME"
expj.AE0020020.AE0020021button1.Insert.child10 = function () {
  console.log('Insert script31');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'));
};
// script32="onClick;20;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]3@*11"
expj.AE0020020.AE0020021button1.Insert.onClick20 = function () {
  console.log('Insert script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script33="child;11;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:1)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:2)}][gte]60@#AS00107"
expj.AE0020020.AE0020021button1.Insert.child11 = function () {
  console.log('Insert script33');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00107');
}
};
// script34="onClick;21;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]3@*12"
expj.AE0020020.AE0020021button1.Insert.onClick21 = function () {
  console.log('Insert script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script35="child;12;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:1)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:2)}][gte]60@#AS00108"
expj.AE0020020.AE0020021button1.Insert.child12 = function () {
  console.log('Insert script35');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00108');
}
};
// script36="onClick;22;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]3@*13"
expj.AE0020020.AE0020021button1.Insert.onClick22 = function () {
  console.log('Insert script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script37="child;13;CHK;[{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:1)}*10+{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:2)}][gte]60@#AS00114"
expj.AE0020020.AE0020021button1.Insert.child13 = function () {
  console.log('Insert script37');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00114');
}
};
// script38="onClick;23;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]4@*14"
expj.AE0020020.AE0020021button1.Insert.onClick23 = function () {
  console.log('Insert script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script39="child;14;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:0)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:2)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:3)}][gte]60@#AS00107"
expj.AE0020020.AE0020021button1.Insert.child14 = function () {
  console.log('Insert script39');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00107');
}
};
// script40="onClick;24;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]4@*15"
expj.AE0020020.AE0020021button1.Insert.onClick24 = function () {
  console.log('Insert script40');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script41="child;15;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:0)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:2)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:3)}][gte]60@#AS00108"
expj.AE0020020.AE0020021button1.Insert.child15 = function () {
  console.log('Insert script41');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00108');
}
};
// script42="onClick;25;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]4@*16"
expj.AE0020020.AE0020021button1.Insert.onClick25 = function () {
  console.log('Insert script42');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script43="child;16;CHK;[{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:0)}*10+{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:2)}*10+{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:3)}][gte]60@#AS00114"
expj.AE0020020.AE0020021button1.Insert.child16 = function () {
  console.log('Insert script43');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00114');
}
};
// script44="onClick;26;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0020021form1/*,_AE0020021form2/*@AE0020020Servlet,,$ZZ07001"
expj.AE0020020.AE0020021button1.Insert.onClick26 = function () {
  console.log('Insert script44');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020021button1', '_AE0020021form1/*,_AE0020021form2/*', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.changeBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callConfirm('AE0020020', 'AE0020021button1', 'ZZ07001', okEvent);
};
expj.AE0020020.AE0020021button1.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 26; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021button1.Insert['onClick' + i])) {
        expj.AE0020020.AE0020021button1.Insert['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021button1.Insert.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021button1.Insert.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021button1-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021button1', 'Insert', this, 'Button');
    }
  });
  expj.AE0020020.AE0020021button1.Insert.executePScriptOnLoad();
};

expj.AE0020020.AE0020021button1.Insert.executePScriptOnLoad = function () {
  console.log('execute AE0020021button1/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021button1-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020021button1-Insert" name="Insert" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AE0020020-AE0020021button1-Update">
expj.AE0020020.AE0020021button1.Update = {};
// script1="onClick;0;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]_AE0020021form2/PUCH_ODR_DLV_TIME[eq]@*0"
expj.AE0020020.AE0020021button1.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_AE0020021form2/PUCH_ODR_DLV_TIME=2359"
expj.AE0020020.AE0020021button1.Update.child0 = function () {
  console.log('Update script2');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2359');
};
// script3="onClick;1;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]_AE0020021form2/CONFIRM_DLV_DATE[neq][and]_AE0020021form2/CONFIRM_DLV_TIME[eq]@*1"
expj.AE0020020.AE0020021button1.Update.onClick1 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;1;SET;_AE0020021form2/CONFIRM_DLV_TIME=2359"
expj.AE0020020.AE0020021button1.Update.child1 = function () {
  console.log('Update script4');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '2359');
};
// script5="onClick;2;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_START_TIME[eq]@*2"
expj.AE0020020.AE0020021button1.Update.onClick2 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script6="child;2;SET;_AE0020021form2/PUCH_ODR_START_TIME=2359"
expj.AE0020020.AE0020021button1.Update.child2 = function () {
  console.log('Update script6');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '2359');
};
// script7="onClick;3;CHK;_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_DLV_DATE[lt]_AE0020021form2/PUCH_ODR_START_DATE@#AE32608"
expj.AE0020020.AE0020021button1.Update.onClick3 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE')))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32608');
}
};
// script8="onClick;4;CHK;_AE0020021form2/PUCH_ODR_QTY[lte]0@#AE00038"
expj.AE0020020.AE0020021button1.Update.onClick4 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE00038');
}
};
// script9="onClick;5;CHK;_AE0020021form2/OUTSIDE_TYP[neq]1[and]_AE0020021form2/SPL_ITEM_TYP[eq]0[and]_AE0020021form2/h_SPL_ITEM_TYP[neq]0@#AE32602"
expj.AE0020020.AE0020021button1.Update.onClick5 = function () {
  console.log('Update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OUTSIDE_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/SPL_ITEM_TYP'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/h_SPL_ITEM_TYP'), '[neq]', '0')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32602');
}
};
// script10="onClick;6;CHK;_AE0020021form2/OUTSIDE_TYP[neq]1[and]_AE0020021form2/SPL_ITEM_TYP[neq]0[and]_AE0020021form2/h_SPL_ITEM_TYP[eq]0@#AE32603"
expj.AE0020020.AE0020021button1.Update.onClick6 = function () {
  console.log('Update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OUTSIDE_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/SPL_ITEM_TYP'), '[neq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/h_SPL_ITEM_TYP'), '[eq]', '0')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32603');
}
};
// script11="onClick;7;CHK;_AE0020021form2/OUTSIDE_TYP[neq]1[and]_AE0020021form2/EXCH_RATE[lte]0@#AE00059"
expj.AE0020020.AE0020021button1.Update.onClick7 = function () {
  console.log('Update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OUTSIDE_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/EXCH_RATE')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE00059');
}
};
// script12="onClick;8;CHK;_AE0020021form2/PUCH_ODR_START_DATE[eq]@$AE00064"
expj.AE0020020.AE0020021button1.Update.onClick8 = function () {
  console.log('Update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE00064');
}
};
// script13="onClick;9;CHK;_AE0020021form2/PUCH_ODR_QTY[numneq]_AE0020021form2/h_PUCH_ODR_QTY@$AE00007"
expj.AE0020020.AE0020021button1.Update.onClick9 = function () {
  console.log('Update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_QTY')), '[numneq]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/h_PUCH_ODR_QTY')))) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE00007');
}
};
// script14="onClick;10;CHK;_AE0020021form2/OUTSIDE_TYP[eq]1@$AE25016"
expj.AE0020020.AE0020021button1.Update.onClick10 = function () {
  console.log('Update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OUTSIDE_TYP'), '[eq]', '1')) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE25016');
}
};
// script15="onClick;11;CHK;_AE0020021form2/OUTSIDE_TYP[neq]1[and]_AE0020021form2/SelectUnitCostFlag[eq]false@$AE00062"
expj.AE0020020.AE0020021button1.Update.onClick11 = function () {
  console.log('Update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OUTSIDE_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/SelectUnitCostFlag'), '[eq]', 'false')) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE00062');
}
};
// script16="onClick;12;CHK;_AE0020021form2/UNIT_COST[lt][{_AE0020021form2/PROCESSING_COST}+{_AE0020021form2/MATERIAL_COST}+{_AE0020021form2/OTHER_OVERHEADS}]@$AE00066"
expj.AE0020020.AE0020021button1.Update.onClick12 = function () {
  console.log('Update script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/UNIT_COST')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PROCESSING_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/MATERIAL_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/OTHER_OVERHEADS')))) {
expj.common.pscript.addWarningMessage('AE0020020', 'AE0020021button1', 'AE00066');
}
};
// script17="onClick;13;CHK;_AE0020021form2/PUCH_ODR_DLV_DATE[neq][and]_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_DLV_TIME[neq][and]_AE0020021form2/PUCH_ODR_START_TIME[neq][and]_AE0020021form2/PUCH_ODR_DLV_DATE[eq]_AE0020021form2/PUCH_ODR_START_DATE[and]_AE0020021form2/PUCH_ODR_DLV_TIME[lt]_AE0020021form2/PUCH_ODR_START_TIME@#AE32608"
expj.AE0020020.AE0020021button1.Update.onClick13 = function () {
  console.log('Update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME')))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32608');
}
};
// script18="onClick;14;CHK;_AE0020021form2/PUCH_ODR_DLV_DATE[neq][and]_AE0020021form2/PUCH_ODR_START_DATE[neq][and]_AE0020021form2/PUCH_ODR_DLV_TIME[neq][and]_AE0020021form2/PUCH_ODR_START_TIME[eq][and]_AE0020021form2/PUCH_ODR_DLV_DATE[eq]_AE0020021form2/PUCH_ODR_START_DATE[and]_AE0020021form2/PUCH_ODR_DLV_TIME[lt]2359@#AE32608"
expj.AE0020020.AE0020021button1.Update.onClick14 = function () {
  console.log('Update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME')), '[lt]', expj.common.pscript.convertNumber('2359'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AE32608');
}
};
// script19="onClick;15;CHK;_AE0020021form1/TIME_CTRL[eq]true@*3"
expj.AE0020020.AE0020021button1.Update.onClick15 = function () {
  console.log('Update script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script20="child;3;CHK;_AE0020021form2/PUCH_ODR_START_DATE[eq][and]_AE0020021form2/PUCH_ODR_START_TIME[neq]@#AS00103"
expj.AE0020020.AE0020021button1.Update.child3 = function () {
  console.log('Update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00103');
}
};
// script21="onClick;16;CHK;_AE0020021form1/TIME_CTRL[eq]true@*4"
expj.AE0020020.AE0020021button1.Update.onClick16 = function () {
  console.log('Update script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script22="child;4;CHK;_AE0020021form2/CONFIRM_DLV_DATE[eq][and]_AE0020021form2/CONFIRM_DLV_TIME[neq]@#AS00112"
expj.AE0020020.AE0020021button1.Update.child4 = function () {
  console.log('Update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00112');
}
};
// script23="onClick;17;CHK;_AE0020021form1/TIME_CTRL[eq]true@*5"
expj.AE0020020.AE0020021button1.Update.onClick17 = function () {
  console.log('Update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script24="child;5;CHK;~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]1[or]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]2@#AS00105"
expj.AE0020020.AE0020021button1.Update.child5 = function () {
  console.log('Update script24');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00105');
}
};
// script25="onClick;18;CHK;_AE0020021form1/TIME_CTRL[eq]true@*6"
expj.AE0020020.AE0020021button1.Update.onClick18 = function () {
  console.log('Update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script26="child;6;CHK;~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]1[or]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]2@#AS00106"
expj.AE0020020.AE0020021button1.Update.child6 = function () {
  console.log('Update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00106');
}
};
// script27="onClick;19;CHK;_AE0020021form1/TIME_CTRL[eq]true@*7"
expj.AE0020020.AE0020021button1.Update.onClick19 = function () {
  console.log('Update script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script28="child;7;CHK;~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]1[or]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]2@#AS00113"
expj.AE0020020.AE0020021button1.Update.child7 = function () {
  console.log('Update script28');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00113');
}
};
// script29="onClick;20;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]3@*8"
expj.AE0020020.AE0020021button1.Update.onClick20 = function () {
  console.log('Update script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script30="child;8;SET;_AE0020021form2/PUCH_ODR_START_TIME=_AE0020021form2/PUCH_ODR_START_TIME"
expj.AE0020020.AE0020021button1.Update.child8 = function () {
  console.log('Update script30');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'));
};
// script31="onClick;21;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]3@*9"
expj.AE0020020.AE0020021button1.Update.onClick21 = function () {
  console.log('Update script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script32="child;9;SET;_AE0020021form2/PUCH_ODR_DLV_TIME=_AE0020021form2/PUCH_ODR_DLV_TIME"
expj.AE0020020.AE0020021button1.Update.child9 = function () {
  console.log('Update script32');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'));
};
// script33="onClick;22;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]3@*10"
expj.AE0020020.AE0020021button1.Update.onClick22 = function () {
  console.log('Update script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script34="child;10;SET;_AE0020021form2/CONFIRM_DLV_TIME=_AE0020021form2/CONFIRM_DLV_TIME"
expj.AE0020020.AE0020021button1.Update.child10 = function () {
  console.log('Update script34');
expj.common.pscript.setReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'));
};
// script35="onClick;23;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]3@*11"
expj.AE0020020.AE0020021button1.Update.onClick23 = function () {
  console.log('Update script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script36="child;11;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:1)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:2)}][gte]60@#AS00107"
expj.AE0020020.AE0020021button1.Update.child11 = function () {
  console.log('Update script36');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00107');
}
};
// script37="onClick;24;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]3@*12"
expj.AE0020020.AE0020021button1.Update.onClick24 = function () {
  console.log('Update script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script38="child;12;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:1)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:2)}][gte]60@#AS00108"
expj.AE0020020.AE0020021button1.Update.child12 = function () {
  console.log('Update script38');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00108');
}
};
// script39="onClick;25;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]3@*13"
expj.AE0020020.AE0020021button1.Update.onClick25 = function () {
  console.log('Update script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script40="child;13;CHK;[{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:1)}*10+{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:2)}][gte]60@#AS00114"
expj.AE0020020.AE0020021button1.Update.child13 = function () {
  console.log('Update script40');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00114');
}
};
// script41="onClick;26;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_START_TIME)[eq]4@*14"
expj.AE0020020.AE0020021button1.Update.onClick26 = function () {
  console.log('Update script41');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script42="child;14;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:0)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:2)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_START_TIME:3)}][gte]60@#AS00107"
expj.AE0020020.AE0020021button1.Update.child14 = function () {
  console.log('Update script42');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_START_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00107');
}
};
// script43="onClick;27;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/PUCH_ODR_DLV_TIME)[eq]4@*15"
expj.AE0020020.AE0020021button1.Update.onClick27 = function () {
  console.log('Update script43');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script44="child;15;CHK;[{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:0)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:2)}*10+{~CHARAT(_AE0020021form2/PUCH_ODR_DLV_TIME:3)}][gte]60@#AS00108"
expj.AE0020020.AE0020021button1.Update.child15 = function () {
  console.log('Update script44');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/PUCH_ODR_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00108');
}
};
// script45="onClick;28;CHK;_AE0020021form1/TIME_CTRL[eq]true[and]~LEN(_AE0020021form2/CONFIRM_DLV_TIME)[eq]4@*16"
expj.AE0020020.AE0020021button1.Update.onClick28 = function () {
  console.log('Update script45');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0020020', 'AE0020021button1', '_AE0020021form1/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script46="child;16;CHK;[{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:0)}*10+{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:1)}][gte]24[or][{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:2)}*10+{~CHARAT(_AE0020021form2/CONFIRM_DLV_TIME:3)}][gte]60@#AS00114"
expj.AE0020020.AE0020021button1.Update.child16 = function () {
  console.log('Update script46');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AE0020020', 'AE0020021button1', '_AE0020021form2/CONFIRM_DLV_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AE0020020', 'AE0020021button1', 'AS00114');
}
};
// script47="onClick;29;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0020021form1/*,_AE0020021form2/*@AE0020020Servlet,,$ZZ07003"
expj.AE0020020.AE0020021button1.Update.onClick29 = function () {
  console.log('Update script47');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020021button1', '_AE0020021form1/*,_AE0020021form2/*', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.changeBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callConfirm('AE0020020', 'AE0020021button1', 'ZZ07003', okEvent);
};
expj.AE0020020.AE0020021button1.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 29; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021button1.Update['onClick' + i])) {
        expj.AE0020020.AE0020021button1.Update['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021button1.Update.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021button1.Update.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021button1-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021button1', 'Update', this, 'Button');
    }
  });
  expj.AE0020020.AE0020021button1.Update.executePScriptOnLoad();
};

expj.AE0020020.AE0020021button1.Update.executePScriptOnLoad = function () {
  console.log('execute AE0020021button1/Update.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021button1-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020021button1-Update" name="Update" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0020021 Revision: 1.13  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AE0020020-AE0020021button0">
expj.AE0020020.AE0020021button0 = {};
expj.AE0020020.AE0020021button0.executeAllOnDecision = function () {
  console.log('execute AE0020021button0.onDecision');
};
expj.AE0020020.AE0020021button0.executeOnLoad = function () {
  expj.AE0020020.AE0020021button0.executePScriptOnLoad();
};

expj.AE0020020.AE0020021button0.executePScriptOnLoad = function () {
  console.log('execute AE0020021button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0020020-AE0020021button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0020020-AE0020021button0-Return">
expj.AE0020020.AE0020021button0.Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0020021form1/*,_AE0020021form2/*@AE0020020Servlet,,$ZZ07013"
expj.AE0020020.AE0020021button0.Return.onClick0 = function () {
  console.log('Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0020020', 'AE0020021button0', '_AE0020021form1/*,_AE0020021form2/*', 'AE0020020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0020020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0020020', response);
expj.common.changeBusinessScreenTab('AE0020020', contents);
};
expj.common.pscript.callConfirm('AE0020020', 'AE0020021button0', 'ZZ07013', okEvent);
};
expj.AE0020020.AE0020021button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0020020.AE0020021button0.Return['onClick' + i])) {
        expj.AE0020020.AE0020021button0.Return['onClick' + i]();
      }
    }
  }
};
expj.AE0020020.AE0020021button0.Return.executeAllOnDecision = function () {
};
expj.AE0020020.AE0020021button0.Return.executeOnLoad = function () {
  $('#expj-AE0020020-AE0020021button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0020020', 'AE0020021button0', 'Return', this, 'Button');
    }
  });
  expj.AE0020020.AE0020021button0.Return.executePScriptOnLoad();
};

expj.AE0020020.AE0020021button0.Return.executePScriptOnLoad = function () {
  console.log('execute AE0020021button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-AE0020020-AE0020021button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0020020-AE0020021button0-Return" name="Return" class="AE0020020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0020020 (END)-->
<%
MessageStruct msgStruct = aAE0020020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0020020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0020020)) {
  expj.common.treeInstanceMap.AE0020020 = {};
}
expj.common.treeInstanceMap.AE0020020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0020020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0020020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0020020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0020020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0020020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0020020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020)) {
  expj.common.detailDialogMap.AE0020020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0020020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0020020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0020020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0020020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0020020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0020020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0020020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0020020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0020020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0020020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0020020)) {
  expj.common.viewInstanceMap.AE0020020 = {};
}
expj.common.viewInstanceMap.AE0020020.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0020020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0020020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0020020.<%=viewId %>.init = function () {
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
    expj.AE0020020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0020020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0020020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0020020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0020020_init">
/**
 * AE0020020用のロード完了時初期化関数
 */
expj.AE0020020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0020020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0020020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0020020');
  expj.common.calendarInstanceMap.AE0020020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0020020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0020020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0020020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0020020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0020020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0020020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0020020-<%=detailId %>');
<%
 }
%>
  try{expj.AE0020020.AE0020021form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.MRP_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CalendarPuchOdrDlvDate.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CalendarConfirmDlvDate.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CONFIRM_DLV_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CONFIRM_DLV_DATE_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CalendarPuchOdrStartDate.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_START_TIME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.h_PUCH_ODR_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.h_OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_PERSON.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.SPL_ITEM_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.h_SPL_ITEM_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PRODUCT_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PRODUCT_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.SelectUnitCostFlag.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PROCESSING_COST.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d1_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.TAX_AMOUNT_1.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d7_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.TAX_RATE_1.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.MATERIAL_COST.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d2_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.TAX_AMOUNT_2.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d8_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.TAX_RATE_2.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.OTHER_OVERHEADS.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d3_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.TAX_AMOUNT_3.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d9_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.TAX_RATE_3.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d4_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.AMOUNT_INCLUDE_TAX.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d10_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.DISC_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d5_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.HOME_CUR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.NET_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d6_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.d_HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.PUCH_ODR_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021button1.Insert.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021button1.Update.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021button0.Return.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form1.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021form2.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021button1.executeOnLoad();}catch(e){};
  try{expj.AE0020020.AE0020021button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0020020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0020020', 'AE0020020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0020020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0020020-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0020020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0020020', '<%=request.getContextPath() %>');
};

/**
 * AE0020020の全体onDecision処理
 */
expj.AE0020020.executeAllOnDecision = function () {
  expj.AE0020020.AE0020021form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0020020_console">
expj.AE0020020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>