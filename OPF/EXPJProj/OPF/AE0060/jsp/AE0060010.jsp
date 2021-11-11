<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:03:54 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0060\AE0060010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0060.*" %>
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
<jsp:useBean id="aAE0060010Control" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060010Control" scope="request"/>
<jsp:useBean id="aAE0060010Struct" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受入実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/jsp/AE0060010.jsp,v $
$Author: geng-jia $
$Revision: 1.47 $ $Date: 2017/02/22 02:05:11 $
********************************************************* --%>
<html>
<head>
<title>受入実績入力</title>
<%@include file="common/expj_v5.jsp" %>
<%ScreenMoveUtil su = new ScreenMoveUtil("AE0200010Servlet", so);%>

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
<script class="expj-script-AE0060010_init">
  // AE0060010名前空間
  expj.AE0060010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0060010" data-screen="AE0060010" data-newdata="<%=aAE0060010Control.isNewData() %>">
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
              <script class="expj-script-AE0060010-AE0060010form1">
expj.AE0060010.AE0060010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.AE0060010.AE0060010form1.onLoad0 = function () {
  console.log('AE0060010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0060010.AE0060010form1.onDecision0 = function () {
  console.log('AE0060010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0060010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0060010button1/Select"
expj.AE0060010.AE0060010form1.child0 = function () {
  console.log('AE0060010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button1/Select');
};
// script4="child;1;MASK;_AE0060010button1/Select"
expj.AE0060010.AE0060010form1.child1 = function () {
  console.log('AE0060010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button1/Select');
};
// script5="onDecision;1;CHK;_AE0060010detail1/PUCH_ODR_STS_TYP[neq]9[and]_PUCH_ODR_CD[eq]_h_PUCH_ODR_CD[and]?AE0060010form1/*[eq]NORMAL@*2,*4"
expj.AE0060010.AE0060010form1.onDecision1 = function () {
  console.log('AE0060010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010detail1/PUCH_ODR_STS_TYP'), '[neq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_PUCH_ODR_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_h_PUCH_ODR_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '?AE0060010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHKRQ;A,B@*3,*4"
expj.AE0060010.AE0060010form1.child2 = function () {
  console.log('AE0060010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AE0060010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0060010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AE0060010button2/Insert"
expj.AE0060010.AE0060010form1.child3 = function () {
  console.log('AE0060010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button2/Insert');
};
// script8="child;4;MASK;_AE0060010button2/Insert"
expj.AE0060010.AE0060010form1.child4 = function () {
  console.log('AE0060010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button2/Insert');
};
// script9="onDecision;2;CHK;_AE0060010detail1/PUCH_ODR_STS_TYP[eq]9[and]_PUCH_ODR_CD[eq]_h_PUCH_ODR_CD[and]?AE0060010form1/*[eq]NORMAL[and]_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG[numeq]0@*5,*6"
expj.AE0060010.AE0060010form1.onDecision2 = function () {
  console.log('AE0060010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010detail1/PUCH_ODR_STS_TYP'), '[eq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_PUCH_ODR_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_h_PUCH_ODR_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '?AE0060010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_AE0060010button0/CancelComplete"
expj.AE0060010.AE0060010form1.child5 = function () {
  console.log('AE0060010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button0/CancelComplete');
};
// script11="child;6;MASK;_AE0060010button0/CancelComplete"
expj.AE0060010.AE0060010form1.child6 = function () {
  console.log('AE0060010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button0/CancelComplete');
};
// script12="onDecision;3;CHK;?AE0060010form1/*[eq]NORMAL[and]_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG[numeq]0[and]_AE0060010form1/ACPT_NO[numeq]1@*7,*8"
expj.AE0060010.AE0060010form1.onDecision3 = function () {
  console.log('AE0060010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '?AE0060010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG')), '[numeq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form1/ACPT_NO')), '[numeq]', expj.common.pscript.convertNumber('1'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script13="child;7;UNMASK;_AE0060010form2/c_CANCEL"
expj.AE0060010.AE0060010form1.child7 = function () {
  console.log('AE0060010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/c_CANCEL');
};
// script14="child;8;MASK;_AE0060010form2/c_CANCEL"
expj.AE0060010.AE0060010form1.child8 = function () {
  console.log('AE0060010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/c_CANCEL');
};
// script15="onLoad;2;CALL;child@9"
expj.AE0060010.AE0060010form1.onLoad2 = function () {
  console.log('AE0060010form1 script15');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child9)){this.child9();}
};
// script16="child;9;CHK;_AE0060010form2/c_CANCEL[eq]true@*10,*13"
expj.AE0060010.AE0060010form1.child9 = function () {
  console.log('AE0060010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/c_CANCEL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script17="child;10;UNMASK;_AE0060010form2/ODR_CANCEL_CAUSE_CD,_AE0060010form2/PeekerOdrCancelCauseCd@*11"
expj.AE0060010.AE0060010form1.child10 = function () {
  console.log('AE0060010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/ODR_CANCEL_CAUSE_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/PeekerOdrCancelCauseCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script18="child;11;MASK;_AE0060010form2/c_COMPLETE,_AE0060010form2/ACPT_QTY,_AE0060010form2/DISC_AMOUNT,_AE0060010form2/NET_AMOUNT,_AE0060010form2/LOT_NO,_AE0060010form2/LotInsert,_AE0060010form2/PeekerLotNo@*12"
expj.AE0060010.AE0060010form1.child11 = function () {
  console.log('AE0060010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/c_COMPLETE');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/ACPT_QTY');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/DISC_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/NET_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/LotInsert');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script19="child;12;SET;_AE0060010form2/c_COMPLETE=true,_AE0060010form2/ACPT_QTY=0,_AE0060010/LOT_NO="
expj.AE0060010.AE0060010form1.child12 = function () {
  console.log('AE0060010form1 script19');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/c_COMPLETE', 'true');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/ACPT_QTY', '0');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010/LOT_NO', '');
};
// script20="child;13;UNMASK;_AE0060010form2/c_COMPLETE,_AE0060010form2/ACPT_QTY,_AE0060010form2/DISC_AMOUNT,_AE0060010form2/NET_AMOUNT,_AE0060010form2/LOT_NO,_AE0060010form2/LotInsert,_AE0060010form2/PeekerLotNo@*14"
expj.AE0060010.AE0060010form1.child13 = function () {
  console.log('AE0060010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/c_COMPLETE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/ACPT_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/DISC_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/NET_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/LotInsert');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script21="child;14;MASK;_AE0060010form2/ODR_CANCEL_CAUSE_CD,_AE0060010form2/PeekerOdrCancelCauseCd@*15"
expj.AE0060010.AE0060010form1.child14 = function () {
  console.log('AE0060010form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/ODR_CANCEL_CAUSE_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/PeekerOdrCancelCauseCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script22="child;15;SET;_AE0060010form2/ODR_CANCEL_CAUSE_CD="
expj.AE0060010.AE0060010form1.child15 = function () {
  console.log('AE0060010form1 script22');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/ODR_CANCEL_CAUSE_CD', '');
};
// script23="onDecision;4;CHK;?AE0060010form1/*[eq]NORMAL[and]?AE0060010form1/PUCH_ODR_CD[eq]SAME[and]_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG[numeq]1@*16,*17"
expj.AE0060010.AE0060010form1.onDecision4 = function () {
  console.log('AE0060010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '?AE0060010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '?AE0060010form1/PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG')), '[numeq]', expj.common.pscript.convertNumber('1'))) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script24="child;16;UNMASK;_AE0060010button0/CancelOdrCancel"
expj.AE0060010.AE0060010form1.child16 = function () {
  console.log('AE0060010form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button0/CancelOdrCancel');
};
// script25="child;17;MASK;_AE0060010button0/CancelOdrCancel"
expj.AE0060010.AE0060010form1.child17 = function () {
  console.log('AE0060010form1 script25');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010button0/CancelOdrCancel');
};
// script26="onLoad;3;CALL;child@18"
expj.AE0060010.AE0060010form1.onLoad3 = function () {
  console.log('AE0060010form1 script26');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child18)){this.child18();}
};
// script27="child;18;CHK;_AE0060010form1/h_LOTCTRL[neq]true@*19"
expj.AE0060010.AE0060010form1.child18 = function () {
  console.log('AE0060010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form1/h_LOTCTRL'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script28="child;19;MASK;_AE0060010form2/LOT_NO,_AE0060010form2/LotInsert,_AE0060010form2/PeekerLotNo@*20"
expj.AE0060010.AE0060010form1.child19 = function () {
  console.log('AE0060010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/LotInsert');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form1', '_AE0060010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script29="child;20;SET;_AE0060010form2/LOT_NO="
expj.AE0060010.AE0060010form1.child20 = function () {
  console.log('AE0060010form1 script29');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form1', '_AE0060010form2/LOT_NO', '');
};
expj.AE0060010.AE0060010form1.executeAllOnDecision = function () {
  console.log('execute AE0060010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form1['onDecision' + i])) {
        expj.AE0060010.AE0060010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form1.executeOnLoad = function () {
  expj.AE0060010.AE0060010form1.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form1['onLoad' + i])) {
      expj.AE0060010.AE0060010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060010-AE0060010form1" action="AE0060010Servlet" name="AE0060010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0060010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form1-PUCH_ODR_CD">
expj.AE0060010.AE0060010form1.PUCH_ODR_CD = {};
expj.AE0060010.AE0060010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form1/PUCH_ODR_CD.onDecision');
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0060010.AE0060010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0060010-focus-move  required-value expj-AE0060010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form1-h_PUCH_ODR_CD" name="h_PUCH_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_PUCH_ODR_CD()) %>">
<script class="expj-script-AE0060010-AE0060010form1-h_PUCH_ODR_CD">
expj.AE0060010.AE0060010form1.h_PUCH_ODR_CD = {};
expj.AE0060010.AE0060010form1.h_PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form1/h_PUCH_ODR_CD.onDecision');
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form1.h_PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-h_PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form1', 'h_PUCH_ODR_CD', this);
  });
  expj.AE0060010.AE0060010form1.h_PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.h_PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/h_PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-h_PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0060010-AE0060010form1-PeekerPuchOdrCd">
expj.AE0060010.AE0060010form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AE0060010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0060010.AE0060010form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060010';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0060010', 'PeekerPuchOdrCd', 'SQLPARAM_1', '<%=aAE0060010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_11%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060010.AE0060010form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AE0060010.AE0060010form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060010-AE0060010form1-PeekerPuchOdrCd" class="AE0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form1-h_LOTCTRL" name="h_LOTCTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_LOTCTRL()) %>">
<script class="expj-script-AE0060010-AE0060010form1-h_LOTCTRL">
expj.AE0060010.AE0060010form1.h_LOTCTRL = {};
expj.AE0060010.AE0060010form1.h_LOTCTRL.executeAllOnDecision = function () {
  console.log('execute AE0060010form1/h_LOTCTRL.onDecision');
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form1.h_LOTCTRL.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-h_LOTCTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form1', 'h_LOTCTRL', this);
  });
  expj.AE0060010.AE0060010form1.h_LOTCTRL.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.h_LOTCTRL.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/h_LOTCTRL.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-h_LOTCTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_NO",rb)%></span><!-- 受入回数 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form1-ACPT_NO">
expj.AE0060010.AE0060010form1.ACPT_NO = {};
expj.AE0060010.AE0060010form1.ACPT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060010form1/ACPT_NO.onDecision');
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form1.ACPT_NO.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-ACPT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form1', 'ACPT_NO', this);
  });
  expj.AE0060010.AE0060010form1.ACPT_NO.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.ACPT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/ACPT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-ACPT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form1-ACPT_NO" name="ACPT_NO" class="AE0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getACPT_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form1-THIS_MONTH" name="THIS_MONTH" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getTHIS_MONTH()) %>">
<script class="expj-script-AE0060010-AE0060010form1-THIS_MONTH">
expj.AE0060010.AE0060010form1.THIS_MONTH = {};
expj.AE0060010.AE0060010form1.THIS_MONTH.executeAllOnDecision = function () {
  console.log('execute AE0060010form1/THIS_MONTH.onDecision');
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form1.THIS_MONTH.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-THIS_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form1', 'THIS_MONTH', this);
  });
  expj.AE0060010.AE0060010form1.THIS_MONTH.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.THIS_MONTH.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/THIS_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-THIS_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form1-INSTALL_FLG" name="INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getINSTALL_FLG()) %>">
<script class="expj-script-AE0060010-AE0060010form1-INSTALL_FLG">
expj.AE0060010.AE0060010form1.INSTALL_FLG = {};
expj.AE0060010.AE0060010form1.INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0060010form1/INSTALL_FLG.onDecision');
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form1.INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form1', 'INSTALL_FLG', this);
  });
  expj.AE0060010.AE0060010form1.INSTALL_FLG.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form1-PUCH_ODR_MODIFY_COUNT" name="PUCH_ODR_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_MODIFY_COUNT()) %>">
<script class="expj-script-AE0060010-AE0060010form1-PUCH_ODR_MODIFY_COUNT">
expj.AE0060010.AE0060010form1.PUCH_ODR_MODIFY_COUNT = {};
expj.AE0060010.AE0060010form1.PUCH_ODR_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0060010form1/PUCH_ODR_MODIFY_COUNT.onDecision');
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form1.PUCH_ODR_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form1-PUCH_ODR_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form1', 'PUCH_ODR_MODIFY_COUNT', this);
  });
  expj.AE0060010.AE0060010form1.PUCH_ODR_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form1.PUCH_ODR_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form1/PUCH_ODR_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form1-PUCH_ODR_MODIFY_COUNT');
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
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0060010-AE0060010button1">
expj.AE0060010.AE0060010button1 = {};
expj.AE0060010.AE0060010button1.executeAllOnDecision = function () {
  console.log('execute AE0060010button1.onDecision');
};
expj.AE0060010.AE0060010button1.executeOnLoad = function () {
  expj.AE0060010.AE0060010button1.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button1.executePScriptOnLoad = function () {
  console.log('execute AE0060010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060010-AE0060010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060010-AE0060010button1-Detail">
expj.AE0060010.AE0060010button1.Detail = {};
// script1="onClick;0;FSHOW;AE0060010float1"
expj.AE0060010.AE0060010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AE0060010', 'AE0060010float1', '');
};
expj.AE0060010.AE0060010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010button1.Detail['onClick' + i])) {
        expj.AE0060010.AE0060010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010button1.Detail.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010button1.Detail.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010button1', 'Detail', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010button1.Detail.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AE0060010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060010-AE0060010button1-Detail" name="Detail" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010button1-Select">
expj.AE0060010.AE0060010button1.Select = {};
// script1="onClick;0;CHK;_AE0060010form1/PUCH_ODR_CD[eq]@!ZZ01104"
expj.AE0060010.AE0060010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button1', '_AE0060010form1/PUCH_ODR_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010button1', 'ZZ01104');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060010form1/*@AE0060010Servlet"
expj.AE0060010.AE0060010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060010', 'AE0060010button1', '_AE0060010form1/*', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060010', response);
expj.common.updateBusinessScreenTab('AE0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060010.AE0060010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010button1.Select['onClick' + i])) {
        expj.AE0060010.AE0060010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010button1.Select.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010button1.Select.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010button1', 'Select', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010button1.Select.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0060010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060010-AE0060010button1-Select" name="Select" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0060010-AE0060010form2">
expj.AE0060010.AE0060010form2 = {};
expj.AE0060010.AE0060010form2.executeAllOnDecision = function () {
  console.log('execute AE0060010form2.onDecision');
};
expj.AE0060010.AE0060010form2.executeOnLoad = function () {
  expj.AE0060010.AE0060010form2.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060010-AE0060010form2" action="AE0060010Servlet" name="AE0060010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-ITEM_CD">
expj.AE0060010.AE0060010form2.ITEM_CD = {};
expj.AE0060010.AE0060010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/ITEM_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'ITEM_CD', this);
  });
  expj.AE0060010.AE0060010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-ITEM_CD" name="ITEM_CD" class="AE0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_LOT_CTRL_FLG" name="h_LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_LOT_CTRL_FLG()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_LOT_CTRL_FLG">
expj.AE0060010.AE0060010form2.h_LOT_CTRL_FLG = {};
expj.AE0060010.AE0060010form2.h_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_LOT_CTRL_FLG.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_LOT_CTRL_FLG', this);
  });
  expj.AE0060010.AE0060010form2.h_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-ITEM_NAME">
expj.AE0060010.AE0060010form2.ITEM_NAME = {};
expj.AE0060010.AE0060010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/ITEM_NAME.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'ITEM_NAME', this);
  });
  expj.AE0060010.AE0060010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-ITEM_NAME" name="ITEM_NAME" class="AE0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_FINAL_PROC_CD" name="h_FINAL_PROC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_FINAL_PROC_CD()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_FINAL_PROC_CD">
expj.AE0060010.AE0060010form2.h_FINAL_PROC_CD = {};
expj.AE0060010.AE0060010form2.h_FINAL_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_FINAL_PROC_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_FINAL_PROC_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_FINAL_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_FINAL_PROC_CD', this);
  });
  expj.AE0060010.AE0060010form2.h_FINAL_PROC_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_FINAL_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_FINAL_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_FINAL_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_LOT_NUMBERING_TYP" name="h_LOT_NUMBERING_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_LOT_NUMBERING_TYP()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_LOT_NUMBERING_TYP">
expj.AE0060010.AE0060010form2.h_LOT_NUMBERING_TYP = {};
expj.AE0060010.AE0060010form2.h_LOT_NUMBERING_TYP.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_LOT_NUMBERING_TYP.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_LOT_NUMBERING_TYP.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_LOT_NUMBERING_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_LOT_NUMBERING_TYP', this);
  });
  expj.AE0060010.AE0060010form2.h_LOT_NUMBERING_TYP.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_LOT_NUMBERING_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_LOT_NUMBERING_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_LOT_NUMBERING_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_WORK_ODR_CD" name="h_WORK_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_WORK_ODR_CD()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_WORK_ODR_CD">
expj.AE0060010.AE0060010form2.h_WORK_ODR_CD = {};
expj.AE0060010.AE0060010form2.h_WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_WORK_ODR_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_WORK_ODR_CD', this);
  });
  expj.AE0060010.AE0060010form2.h_WORK_ODR_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_QTY_2",rb)%></span><!-- 受入数 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-ACPT_QTY">
expj.AE0060010.AE0060010form2.ACPT_QTY = {};
// script1="onDecision;0;SET;_PUCH_ODR_AMOUNT=[{_UNIT_COST}*{_ACPT_QTY}]"
expj.AE0060010.AE0060010form2.ACPT_QTY.onDecision0 = function () {
  console.log('ACPT_QTY script1');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_PUCH_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_UNIT_COST') + '*' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_QTY')));
};
// script2="onDecision;1;SET;_DISC_AMOUNT=0"
expj.AE0060010.AE0060010form2.ACPT_QTY.onDecision1 = function () {
  console.log('ACPT_QTY script2');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_DISC_AMOUNT', '0');
};
// script3="onDecision;2;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0060010.AE0060010form2.ACPT_QTY.onDecision2 = function () {
  console.log('ACPT_QTY script3');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_DISC_AMOUNT')));
};
// script4="onDecision;3;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0060010.AE0060010form2.ACPT_QTY.onDecision3 = function () {
  console.log('ACPT_QTY script4');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_3')));
};
// script5="onDecision;4;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0060010.AE0060010form2.ACPT_QTY.onDecision4 = function () {
  console.log('ACPT_QTY script5');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_EXCH_RATE')));
};
// script6="onDecision;5;CHK;?THIS[eq]DIFFER@*0"
expj.AE0060010.AE0060010form2.ACPT_QTY.onDecision5 = function () {
  console.log('ACPT_QTY script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script7="child;0;SET;_SelectUnitCostFlag=false"
expj.AE0060010.AE0060010form2.ACPT_QTY.child0 = function () {
  console.log('ACPT_QTY script7');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_SelectUnitCostFlag', 'false');
};
expj.AE0060010.AE0060010form2.ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/ACPT_QTY.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.ACPT_QTY['onDecision' + i])) {
        expj.AE0060010.AE0060010form2.ACPT_QTY['onDecision' + i]();
      }
    }
  }
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.ACPT_QTY.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'ACPT_QTY', this);
  });
  expj.AE0060010.AE0060010form2.ACPT_QTY.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-ACPT_QTY" name="ACPT_QTY" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060010Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getACPT_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d2_STOCK_UNIT">
expj.AE0060010.AE0060010form2.d2_STOCK_UNIT = {};
expj.AE0060010.AE0060010form2.d2_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d2_STOCK_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d2_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d2_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd2_STOCK_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d2_STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d2_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d2_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d2_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d2_STOCK_UNIT" name="d2_STOCK_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_ACPT_QTY" name="h_ACPT_QTY" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_ACPT_QTY()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_ACPT_QTY">
expj.AE0060010.AE0060010form2.h_ACPT_QTY = {};
expj.AE0060010.AE0060010form2.h_ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_ACPT_QTY.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_ACPT_QTY.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_ACPT_QTY', this);
  });
  expj.AE0060010.AE0060010form2.h_ACPT_QTY.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-c_COMPLETE">
expj.AE0060010.AE0060010form2.c_COMPLETE = {};
expj.AE0060010.AE0060010form2.c_COMPLETE.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/c_COMPLETE.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.c_COMPLETE.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-c_COMPLETE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'c_COMPLETE', this, 'CheckBox');
    }
  });
  expj.AE0060010.AE0060010form2.c_COMPLETE.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.c_COMPLETE.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/c_COMPLETE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-c_COMPLETE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_COMPLETE" value="true" <%= ("true".equals(TypeConverter.convert(aAE0060010Struct.getc_COMPLETE())) || "1".equals(TypeConverter.convert(aAE0060010Struct.getc_COMPLETE())))?"checked=\"checked\"":"" %>  class="AE0060010-focus-move" id="expj-AE0060010-AE0060010form2-c_COMPLETE"><label for="expj-AE0060010-AE0060010form2-c_COMPLETE"><%=CoreTools.getRBString("Expj.ACPT_CMPLT_DATE_1",rb)%></label></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-c_CANCEL">
expj.AE0060010.AE0060010form2.c_CANCEL = {};
// script1="onClick;0;CHK;_AE0060010form2/c_CANCEL[eq]true@*0,*6"
expj.AE0060010.AE0060010form2.c_CANCEL.onClick0 = function () {
  console.log('c_CANCEL script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/c_CANCEL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script2="child;0;UNMASK;_ODR_CANCEL_CAUSE_CD,_PeekerOdrCancelCauseCd@*1"
expj.AE0060010.AE0060010form2.c_CANCEL.child0 = function () {
  console.log('c_CANCEL script2');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_ODR_CANCEL_CAUSE_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_PeekerOdrCancelCauseCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;MASK;_c_COMPLETE,_ACPT_QTY,_DISC_AMOUNT,_NET_AMOUNT,_LOT_NO,_PeekerLotNo,_LotInsert@*2"
expj.AE0060010.AE0060010form2.c_CANCEL.child1 = function () {
  console.log('c_CANCEL script3');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_c_COMPLETE');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_ACPT_QTY');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_DISC_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_NET_AMOUNT');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_PeekerLotNo');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_LotInsert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;SET;_c_COMPLETE=true,_h_ACPT_QTY=_ACPT_QTY,_ACPT_QTY=0,_h_LOT_NO=_LOT_NO,_LOT_NO="
expj.AE0060010.AE0060010form2.c_CANCEL.child2 = function () {
  console.log('c_CANCEL script4');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_c_COMPLETE', 'true');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_h_ACPT_QTY', expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_QTY'));
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_QTY', '0');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_h_LOT_NO', expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_LOT_NO'));
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_LOT_NO', '');
};
// script5="child;3;UNMASK;_c_COMPLETE,_ACPT_QTY,_DISC_AMOUNT,_NET_AMOUNT,_LOT_NO,_PeekerLotNo,_LotInsert@*4"
expj.AE0060010.AE0060010form2.c_CANCEL.child3 = function () {
  console.log('c_CANCEL script5');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_c_COMPLETE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_ACPT_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_DISC_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_NET_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_PeekerLotNo');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_LotInsert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;MASK;_ODR_CANCEL_CAUSE_CD,_PeekerOdrCancelCauseCd@*5"
expj.AE0060010.AE0060010form2.c_CANCEL.child4 = function () {
  console.log('c_CANCEL script6');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_ODR_CANCEL_CAUSE_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_PeekerOdrCancelCauseCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;SET;_c_COMPLETE=false,_ACPT_QTY=_h_ACPT_QTY,_ODR_CANCEL_CAUSE_CD=,_LOT_NO=_h_LOT_NO,"
expj.AE0060010.AE0060010form2.c_CANCEL.child5 = function () {
  console.log('c_CANCEL script7');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_c_COMPLETE', 'false');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_QTY', expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_h_ACPT_QTY'));
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_ODR_CANCEL_CAUSE_CD', '');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_LOT_NO', expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_h_LOT_NO'));
};
// script8="child;6;CHK;_AE0060010form2/h_LOT_CTRL_FLG[eq]1@*3,*7"
expj.AE0060010.AE0060010form2.c_CANCEL.child6 = function () {
  console.log('c_CANCEL script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_LOT_CTRL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;7;UNMASK;_c_COMPLETE,_ACPT_QTY,_DISC_AMOUNT,_NET_AMOUNT@*4"
expj.AE0060010.AE0060010form2.c_CANCEL.child7 = function () {
  console.log('c_CANCEL script9');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_c_COMPLETE');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_ACPT_QTY');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_DISC_AMOUNT');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060010', 'AE0060010form2', '_NET_AMOUNT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
expj.AE0060010.AE0060010form2.c_CANCEL.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.c_CANCEL['onClick' + i])) {
        expj.AE0060010.AE0060010form2.c_CANCEL['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form2.c_CANCEL.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/c_CANCEL.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.c_CANCEL.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-c_CANCEL').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'c_CANCEL', this, 'CheckBox');
    }
  });
  expj.AE0060010.AE0060010form2.c_CANCEL.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.c_CANCEL.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/c_CANCEL.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-c_CANCEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="checkbox" name="c_CANCEL" value="true" <%= ("true".equals(TypeConverter.convert(aAE0060010Struct.getc_CANCEL())) || "1".equals(TypeConverter.convert(aAE0060010Struct.getc_CANCEL())))?"checked=\"checked\"":"" %>  class="AE0060010-focus-move" id="expj-AE0060010-AE0060010form2-c_CANCEL"><label for="expj-AE0060010-AE0060010form2-c_CANCEL"><%=CoreTools.getRBString("Expj.Cmt0075",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AE0060010-AE0060010form2-BUSINESS_OPR_DATE">
expj.AE0060010.AE0060010form2.BUSINESS_OPR_DATE = {};
expj.AE0060010.AE0060010form2.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/BUSINESS_OPR_DATE.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'BUSINESS_OPR_DATE', this);
  });
  expj.AE0060010.AE0060010form2.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ACPT_DATE",rb)%></span><!-- 受入日 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-ACPT_DATE">
expj.AE0060010.AE0060010form2.ACPT_DATE = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0060010.AE0060010form2.ACPT_DATE.onDecision0 = function () {
  console.log('ACPT_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AE0060010.AE0060010form2.ACPT_DATE.child0 = function () {
  console.log('ACPT_DATE script2');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_SelectUnitCostFlag', 'false');
};
expj.AE0060010.AE0060010form2.ACPT_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/ACPT_DATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.ACPT_DATE['onDecision' + i])) {
        expj.AE0060010.AE0060010form2.ACPT_DATE['onDecision' + i]();
      }
    }
  }
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.ACPT_DATE.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-ACPT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'ACPT_DATE', this);
  });
  expj.AE0060010.AE0060010form2.ACPT_DATE.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.ACPT_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/ACPT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-ACPT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-ACPT_DATE" name="ACPT_DATE" class="AE0060010-focus-move  required-value expj-AE0060010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getACPT_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-CalendarAcptDate">
expj.AE0060010.AE0060010form2.CalendarAcptDate = {};
// script1="onClick;0;CALENDAR;_AE0060010form2/ACPT_DATE"
expj.AE0060010.AE0060010form2.CalendarAcptDate.onClick0 = function () {
  console.log('CalendarAcptDate script1');
expj.common.pscript.executeCalendar('AE0060010','AE0060010form2','_AE0060010form2/ACPT_DATE');
};
expj.AE0060010.AE0060010form2.CalendarAcptDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.CalendarAcptDate['onClick' + i])) {
        expj.AE0060010.AE0060010form2.CalendarAcptDate['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form2.CalendarAcptDate.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010form2.CalendarAcptDate.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-CalendarAcptDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'CalendarAcptDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0060010','AE0060010form2','_AE0060010form2/ACPT_DATE');
  expj.AE0060010.AE0060010form2.CalendarAcptDate.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.CalendarAcptDate.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/CalendarAcptDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-CalendarAcptDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060010-AE0060010form2-CalendarAcptDate" class="AE0060010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_DATE_FLG" name="h_DATE_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_DATE_FLG()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_DATE_FLG">
expj.AE0060010.AE0060010form2.h_DATE_FLG = {};
expj.AE0060010.AE0060010form2.h_DATE_FLG.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_DATE_FLG.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_DATE_FLG.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_DATE_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_DATE_FLG', this);
  });
  expj.AE0060010.AE0060010form2.h_DATE_FLG.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_DATE_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_DATE_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_DATE_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_ODR_CANCEL_SLIP_ISS_FLG" name="h_ODR_CANCEL_SLIP_ISS_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_ODR_CANCEL_SLIP_ISS_FLG()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_ODR_CANCEL_SLIP_ISS_FLG">
expj.AE0060010.AE0060010form2.h_ODR_CANCEL_SLIP_ISS_FLG = {};
expj.AE0060010.AE0060010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_ODR_CANCEL_SLIP_ISS_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_ODR_CANCEL_SLIP_ISS_FLG', this);
  });
  expj.AE0060010.AE0060010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_ODR_CANCEL_SLIP_ISS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD_2",rb)%></span><!-- 受入場所 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-WH_CD">
expj.AE0060010.AE0060010form2.WH_CD = {};
expj.AE0060010.AE0060010form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/WH_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.WH_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'WH_CD', this);
  });
  expj.AE0060010.AE0060010form2.WH_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-WH_CD" name="WH_CD" class="AE0060010-focus-move  required-value expj-AE0060010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-PeekerWhCd">
expj.AE0060010.AE0060010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AE0060010form2/WH_CD@<%=contextNo%>"
expj.AE0060010.AE0060010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0060010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAE0060010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060010form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060010.AE0060010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.PeekerWhCd['onClick' + i])) {
        expj.AE0060010.AE0060010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060010-AE0060010form2-PeekerWhCd" class="AE0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-WH_NAME">
expj.AE0060010.AE0060010form2.WH_NAME = {};
expj.AE0060010.AE0060010form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/WH_NAME.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'WH_NAME', this);
  });
  expj.AE0060010.AE0060010form2.WH_NAME.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-WH_NAME" name="WH_NAME" class="AE0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_PUCH_ODR_CD_1" name="h_PUCH_ODR_CD_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_PUCH_ODR_CD_1()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_PUCH_ODR_CD_1">
expj.AE0060010.AE0060010form2.h_PUCH_ODR_CD_1 = {};
expj.AE0060010.AE0060010form2.h_PUCH_ODR_CD_1.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_PUCH_ODR_CD_1.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_PUCH_ODR_CD_1.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_PUCH_ODR_CD_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_PUCH_ODR_CD_1', this);
  });
  expj.AE0060010.AE0060010form2.h_PUCH_ODR_CD_1.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_PUCH_ODR_CD_1.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_PUCH_ODR_CD_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_PUCH_ODR_CD_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INSPC_WH_CD",rb)%></span><!-- 検査待ち保管区 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-INSPC_WH_CD">
expj.AE0060010.AE0060010form2.INSPC_WH_CD = {};
expj.AE0060010.AE0060010form2.INSPC_WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/INSPC_WH_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.INSPC_WH_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-INSPC_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'INSPC_WH_CD', this);
  });
  expj.AE0060010.AE0060010form2.INSPC_WH_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.INSPC_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/INSPC_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-INSPC_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-INSPC_WH_CD" name="INSPC_WH_CD" class="AE0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getINSPC_WH_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-INSPC_WH_NAME">
expj.AE0060010.AE0060010form2.INSPC_WH_NAME = {};
expj.AE0060010.AE0060010form2.INSPC_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/INSPC_WH_NAME.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.INSPC_WH_NAME.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-INSPC_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'INSPC_WH_NAME', this);
  });
  expj.AE0060010.AE0060010form2.INSPC_WH_NAME.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.INSPC_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/INSPC_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-INSPC_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-INSPC_WH_NAME" name="INSPC_WH_NAME" class="AE0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getINSPC_WH_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_CD_1",rb)%></span><!-- 取引通貨コード --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-CUR_CD">
expj.AE0060010.AE0060010form2.CUR_CD = {};
expj.AE0060010.AE0060010form2.CUR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/CUR_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.CUR_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'CUR_CD', this);
  });
  expj.AE0060010.AE0060010form2.CUR_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-CUR_CD" name="CUR_CD" class="AE0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getCUR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-CUR_NAME">
expj.AE0060010.AE0060010form2.CUR_NAME = {};
expj.AE0060010.AE0060010form2.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/CUR_NAME.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.CUR_NAME.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'CUR_NAME', this);
  });
  expj.AE0060010.AE0060010form2.CUR_NAME.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-CUR_NAME" name="CUR_NAME" class="AE0060010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-LOT_NO">
expj.AE0060010.AE0060010form2.LOT_NO = {};
expj.AE0060010.AE0060010form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/LOT_NO.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'LOT_NO', this);
  });
  expj.AE0060010.AE0060010form2.LOT_NO.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-LOT_NO" name="LOT_NO" class="AE0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getLOT_NO()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-h_LOT_NO" name="h_LOT_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.geth_LOT_NO()) %>">
<script class="expj-script-AE0060010-AE0060010form2-h_LOT_NO">
expj.AE0060010.AE0060010form2.h_LOT_NO = {};
expj.AE0060010.AE0060010form2.h_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/h_LOT_NO.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.h_LOT_NO.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-h_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'h_LOT_NO', this);
  });
  expj.AE0060010.AE0060010form2.h_LOT_NO.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.h_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/h_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-h_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0060010-AE0060010form2-PeekerLotNo">
expj.AE0060010.AE0060010form2.PeekerLotNo = {};
// script1="onClick;0;PEEKER;_AE0060010form2/LOT_NO:@<%=contextNo%>"
expj.AE0060010.AE0060010form2.PeekerLotNo.onClick0 = function () {
  console.log('PeekerLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060010';
var parameterValues = 'PeekerLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_08%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060010form2/LOT_NO:%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060010.AE0060010form2.PeekerLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.PeekerLotNo['onClick' + i])) {
        expj.AE0060010.AE0060010form2.PeekerLotNo['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form2.PeekerLotNo.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010form2.PeekerLotNo.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-PeekerLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'PeekerLotNo', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010form2.PeekerLotNo.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.PeekerLotNo.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/PeekerLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-PeekerLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060010-AE0060010form2-PeekerLotNo" class="AE0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-LotInsert">
expj.AE0060010.AE0060010form2.LotInsert = {};
// script1="onClick;0;CHK;?AE0060010form1/*[neq]NORMAL@!ZZ01114"
expj.AE0060010.AE0060010form2.LotInsert.onClick0 = function () {
  console.log('LotInsert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '?AE0060010form1/*'), '[neq]', 'NORMAL')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'ZZ01114');
}
};
// script2="onClick;1;CHK;_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG[numeq]1[or]_AE0060010form2/c_CANCEL[eq]true@!AE20614"
expj.AE0060010.AE0060010form2.LotInsert.onClick1 = function () {
  console.log('LotInsert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG')), '[numeq]', expj.common.pscript.convertNumber('1')) || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/c_CANCEL'), '[eq]', 'true')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE20614');
}
};
// script3="onClick;2;CHK;_AE0060010form2/h_LOT_CTRL_FLG[eq]1@*0,!AE20601"
expj.AE0060010.AE0060010form2.LotInsert.onClick2 = function () {
  console.log('LotInsert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_LOT_CTRL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE20601');
}
};
// script4="onClick;3;CHK;_AE0060010form2/ACPT_QTY[numeq]0@!AE20617"
expj.AE0060010.AE0060010form2.LotInsert.onClick3 = function () {
  console.log('LotInsert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE20617');
}
};
// script5="onClick;4;SET;_AE0060010form2/param1=AE0060010form2/ITEM_CD,_AE0060010form2/param2=AE0060010form2/LOT_NO,_AE0060010form2/param3=AE0060010form2/ACPT_DATE@*3"
expj.AE0060010.AE0060010form2.LotInsert.onClick4 = function () {
  console.log('LotInsert script5');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/param1', 'AE0060010form2/ITEM_CD');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/param2', 'AE0060010form2/LOT_NO');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/param3', 'AE0060010form2/ACPT_DATE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script6="child;0;CHK;_AE0060010detail1/NON_NO_ITEM_FLG[neq]1@*1,!AE20608"
expj.AE0060010.AE0060010form2.LotInsert.child0 = function () {
  console.log('LotInsert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010detail1/NON_NO_ITEM_FLG'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE20608');
}
};
// script7="child;1;CHK;_AE0060010form2/h_FINAL_PROC_CD[eq]0@!AE20602,*2"
expj.AE0060010.AE0060010form2.LotInsert.child1 = function () {
  console.log('LotInsert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_FINAL_PROC_CD'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE20602');
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script8="child;2;CHK;_AE0060010form2/h_LOT_NUMBERING_TYP[neq]0@!AE00165"
expj.AE0060010.AE0060010form2.LotInsert.child2 = function () {
  console.log('LotInsert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_LOT_NUMBERING_TYP'), '[neq]', '0')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE00165');
}
};
// script9="child;3;SCRMV;ORTEUS_HASHED=<%=hashed%>,_AE0060010form2/ITEM_CD,_AE0060010form2/ACPT_DATE,_AE0060010form2/LOT_NO,_AE0060010form2/param1,_AE0060010form2/param2,_AE0060010form2/param3@AE0200010Servlet,<%=contextNo%>,<%=su.getScreenName()%>,<%=su.getScreenID()%>"
expj.AE0060010.AE0060010form2.LotInsert.child3 = function () {
  console.log('LotInsert script9');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060010', 'AE0060010form2', '_AE0060010form2/ITEM_CD,_AE0060010form2/ACPT_DATE,_AE0060010form2/LOT_NO,_AE0060010form2/param1,_AE0060010form2/param2,_AE0060010form2/param3', 'AE0200010Servlet');
params._FLASHPARAMETERVALUES_ += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
params._FLASHPARAMETERVALUES_ += 'SCREEN_MOVE_FLG%=%1%&%';
params._FLASHPARAMETERVALUES_ += 'TARGET_WINDOW%=%<%=su.getScreenName()%>%&%';
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var subScreenId = expj.common.analyzeScreenId('AE0200010Servlet');
var response = expj.common.accessBusinessScreen('POST', 'AE0200010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse(subScreenId, response);
expj.common.addSubBusinessScreen(subScreenId, '<%=su.getScreenName()%>', contents, 'AE0060010');
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060010.AE0060010form2.LotInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.LotInsert['onClick' + i])) {
        expj.AE0060010.AE0060010form2.LotInsert['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form2.LotInsert.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010form2.LotInsert.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-LotInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'LotInsert', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010form2.LotInsert.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.LotInsert.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/LotInsert.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-LotInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AE0060010-AE0060010form2-LotInsert" name="LotInsert" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLotInsert",rb)%></button><!-- ロット管理ボタン --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO",rb)%></span><!-- メーカロット番号 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-VEND_LOT_NO">
expj.AE0060010.AE0060010form2.VEND_LOT_NO = {};
expj.AE0060010.AE0060010form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/VEND_LOT_NO.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'VEND_LOT_NO', this);
  });
  expj.AE0060010.AE0060010form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AE0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)%></span><!-- 単価区分 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-UNIT_COST_TYP">
expj.AE0060010.AE0060010form2.UNIT_COST_TYP = {};
expj.AE0060010.AE0060010form2.UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/UNIT_COST_TYP.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-UNIT_COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0060010', 'AE0060010form2', 'UNIT_COST_TYP', this);
  });
  expj.AE0060010.AE0060010form2.UNIT_COST_TYP.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AE0060010-AE0060010form2-UNIT_COST_TYP" name='UNIT_COST_TYP' class='AE0060010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAE0060010Control.getStruct().getList_UNIT_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0060010Control.getStruct().getList_UNIT_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0060010Control.getStruct().getList_UNIT_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0060010Struct.getUNIT_COST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-SelectUnitCost">
expj.AE0060010.AE0060010form2.SelectUnitCost = {};
// script1="onClick;0;CHK;?AE0060010form1/*[neq]NORMAL@!ZZ01114"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '?AE0060010form1/*'), '[neq]', 'NORMAL')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'ZZ01114');
}
};
// script2="onClick;1;CHK;_AE0060010detail1/PUCH_ODR_STS_TYP[eq]9[and]_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG[eq]0@!AE05005"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick1 = function () {
  console.log('SelectUnitCost script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010detail1/PUCH_ODR_STS_TYP'), '[eq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE05005');
}
};
// script3="onClick;2;CHK;_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG[numneq]0@!AE00086"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick2 = function () {
  console.log('SelectUnitCost script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_ODR_CANCEL_SLIP_ISS_FLG')), '[numneq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010form2', 'AE00086');
}
};
// script4="onClick;3;CHK;_AE0060010detail1/UNIT_QTY_TYP[eq]1@*0,*1"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick3 = function () {
  console.log('SelectUnitCost script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010detail1/UNIT_QTY_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="child;0;CHK;_AE0060010form2/ACPT_QTY[lt]0@#AE05019"
expj.AE0060010.AE0060010form2.SelectUnitCost.child0 = function () {
  console.log('SelectUnitCost script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/ACPT_QTY')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010form2', 'AE05019');
}
};
// script6="child;1;CHK;_AE0060010form2/ACPT_QTY[lt]0@#AE05018"
expj.AE0060010.AE0060010form2.SelectUnitCost.child1 = function () {
  console.log('SelectUnitCost script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/ACPT_QTY')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010form2', 'AE05018');
}
};
// script7="onClick;4;CHK;_ACPT_DATE[eq]@#AE20019"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick4 = function () {
  console.log('SelectUnitCost script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_DATE'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010form2', 'AE20019');
}
};
// script8="onClick;5;CHK;_ACPT_DATE[neq][and]_ACPT_DATE[gt]_BUSINESS_OPR_DATE@#AE33111"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick5 = function () {
  console.log('SelectUnitCost script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010form2', 'AE33111');
}
};
// script9="onClick;6;CHK;_AE0060010form2/h_DATE_FLG[eq]0@*2,*3"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick6 = function () {
  console.log('SelectUnitCost script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010form2/h_DATE_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script10="onClick;7;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060010form1/*,_AE0060010form2/*,_AE0060010detail1/*@AE0060010Servlet"
expj.AE0060010.AE0060010form2.SelectUnitCost.onClick7 = function () {
  console.log('SelectUnitCost script10');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060010', 'AE0060010form2', '_AE0060010form1/*,_AE0060010form2/*,_AE0060010detail1/*', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060010', response);
expj.common.updateBusinessScreenTab('AE0060010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script11="child;2;CHK;_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE[gt]_ACPT_DATE@#AE05006"
expj.AE0060010.AE0060010form2.SelectUnitCost.child2 = function () {
  console.log('SelectUnitCost script11');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010form2', 'AE05006');
}
};
// script12="child;3;CHK;_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE[gt]_ACPT_DATE@#AE05078"
expj.AE0060010.AE0060010form2.SelectUnitCost.child3 = function () {
  console.log('SelectUnitCost script12');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010form2', 'AE05078');
}
};
expj.AE0060010.AE0060010form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.SelectUnitCost['onClick' + i])) {
        expj.AE0060010.AE0060010form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010form2.SelectUnitCost.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AE0060010-AE0060010form2-SelectUnitCost" name="SelectUnitCost" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-SelectUnitCostFlag" name="SelectUnitCostFlag" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getSelectUnitCostFlag()) %>">
<script class="expj-script-AE0060010-AE0060010form2-SelectUnitCostFlag">
expj.AE0060010.AE0060010form2.SelectUnitCostFlag = {};
expj.AE0060010.AE0060010form2.SelectUnitCostFlag.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/SelectUnitCostFlag.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.SelectUnitCostFlag.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-SelectUnitCostFlag').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'SelectUnitCostFlag', this);
  });
  expj.AE0060010.AE0060010form2.SelectUnitCostFlag.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.SelectUnitCostFlag.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/SelectUnitCostFlag.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-SelectUnitCostFlag');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-UNIT_COST">
expj.AE0060010.AE0060010form2.UNIT_COST = {};
// script1="onDecision;0;SET;_PUCH_ODR_AMOUNT=[{_UNIT_COST}*{_ACPT_QTY}]"
expj.AE0060010.AE0060010form2.UNIT_COST.onDecision0 = function () {
  console.log('UNIT_COST script1');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_PUCH_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_UNIT_COST') + '*' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ACPT_QTY')));
};
// script2="onDecision;1;SET;_DISC_AMOUNT=0"
expj.AE0060010.AE0060010form2.UNIT_COST.onDecision1 = function () {
  console.log('UNIT_COST script2');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_DISC_AMOUNT', '0');
};
// script3="onDecision;2;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0060010.AE0060010form2.UNIT_COST.onDecision2 = function () {
  console.log('UNIT_COST script3');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_DISC_AMOUNT')));
};
// script4="onDecision;3;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0060010.AE0060010form2.UNIT_COST.onDecision3 = function () {
  console.log('UNIT_COST script4');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_3')));
};
// script5="onDecision;4;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0060010.AE0060010form2.UNIT_COST.onDecision4 = function () {
  console.log('UNIT_COST script5');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_EXCH_RATE')));
};
expj.AE0060010.AE0060010form2.UNIT_COST.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/UNIT_COST.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.UNIT_COST['onDecision' + i])) {
        expj.AE0060010.AE0060010form2.UNIT_COST['onDecision' + i]();
      }
    }
  }
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.UNIT_COST.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'UNIT_COST', this);
  });
  expj.AE0060010.AE0060010form2.UNIT_COST.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-UNIT_COST" name="UNIT_COST" class="AE0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getUNIT_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-VEND_CUR_UNIT" name="VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROCESSING_COST",rb)%></span><!-- 加工費 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-PROCESSING_COST">
expj.AE0060010.AE0060010form2.PROCESSING_COST = {};
expj.AE0060010.AE0060010form2.PROCESSING_COST.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/PROCESSING_COST.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.PROCESSING_COST.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-PROCESSING_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'PROCESSING_COST', this);
  });
  expj.AE0060010.AE0060010form2.PROCESSING_COST.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.PROCESSING_COST.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/PROCESSING_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-PROCESSING_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-PROCESSING_COST" name="PROCESSING_COST" class="AE0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getPROCESSING_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d1_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d1_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d1_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d1_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d1_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d1_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd1_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d1_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d1_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d1_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d1_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d1_VEND_CUR_UNIT" name="d1_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0707",rb)%></span><!-- 消費税 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-TAX_AMOUNT_1">
expj.AE0060010.AE0060010form2.TAX_AMOUNT_1 = {};
expj.AE0060010.AE0060010form2.TAX_AMOUNT_1.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/TAX_AMOUNT_1.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.TAX_AMOUNT_1.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-TAX_AMOUNT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'TAX_AMOUNT_1', this);
  });
  expj.AE0060010.AE0060010form2.TAX_AMOUNT_1.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.TAX_AMOUNT_1.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/TAX_AMOUNT_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-TAX_AMOUNT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-TAX_AMOUNT_1" name="TAX_AMOUNT_1" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getTAX_ROUND_TYP(), aAE0060010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getTAX_AMOUNT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d7_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d7_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d7_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d7_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d7_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d7_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd7_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d7_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d7_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d7_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d7_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d7_VEND_CUR_UNIT" name="d7_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-TAX_RATE_1" name="TAX_RATE_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getTAX_RATE_1()) %>">
<script class="expj-script-AE0060010-AE0060010form2-TAX_RATE_1">
expj.AE0060010.AE0060010form2.TAX_RATE_1 = {};
expj.AE0060010.AE0060010form2.TAX_RATE_1.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/TAX_RATE_1.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.TAX_RATE_1.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-TAX_RATE_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'TAX_RATE_1', this);
  });
  expj.AE0060010.AE0060010form2.TAX_RATE_1.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.TAX_RATE_1.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/TAX_RATE_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-TAX_RATE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MATERIAL_COST",rb)%></span><!-- 材料費 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-MATERIAL_COST">
expj.AE0060010.AE0060010form2.MATERIAL_COST = {};
expj.AE0060010.AE0060010form2.MATERIAL_COST.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/MATERIAL_COST.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.MATERIAL_COST.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-MATERIAL_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'MATERIAL_COST', this);
  });
  expj.AE0060010.AE0060010form2.MATERIAL_COST.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.MATERIAL_COST.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/MATERIAL_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-MATERIAL_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-MATERIAL_COST" name="MATERIAL_COST" class="AE0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getMATERIAL_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d2_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d2_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d2_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d2_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d2_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d2_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd2_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d2_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d2_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d2_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d2_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d2_VEND_CUR_UNIT" name="d2_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0708",rb)%></span><!-- 取引税 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-TAX_AMOUNT_2">
expj.AE0060010.AE0060010form2.TAX_AMOUNT_2 = {};
expj.AE0060010.AE0060010form2.TAX_AMOUNT_2.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/TAX_AMOUNT_2.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.TAX_AMOUNT_2.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-TAX_AMOUNT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'TAX_AMOUNT_2', this);
  });
  expj.AE0060010.AE0060010form2.TAX_AMOUNT_2.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.TAX_AMOUNT_2.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/TAX_AMOUNT_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-TAX_AMOUNT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-TAX_AMOUNT_2" name="TAX_AMOUNT_2" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getTAX_ROUND_TYP(), aAE0060010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getTAX_AMOUNT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d8_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d8_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d8_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d8_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d8_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d8_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd8_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d8_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d8_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d8_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d8_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d8_VEND_CUR_UNIT" name="d8_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-TAX_RATE_2" name="TAX_RATE_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getTAX_RATE_2()) %>">
<script class="expj-script-AE0060010-AE0060010form2-TAX_RATE_2">
expj.AE0060010.AE0060010form2.TAX_RATE_2 = {};
expj.AE0060010.AE0060010form2.TAX_RATE_2.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/TAX_RATE_2.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.TAX_RATE_2.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-TAX_RATE_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'TAX_RATE_2', this);
  });
  expj.AE0060010.AE0060010form2.TAX_RATE_2.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.TAX_RATE_2.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/TAX_RATE_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-TAX_RATE_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)%></span><!-- その他経費 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-OTHER_OVERHEADS">
expj.AE0060010.AE0060010form2.OTHER_OVERHEADS = {};
expj.AE0060010.AE0060010form2.OTHER_OVERHEADS.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/OTHER_OVERHEADS.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.OTHER_OVERHEADS.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-OTHER_OVERHEADS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'OTHER_OVERHEADS', this);
  });
  expj.AE0060010.AE0060010form2.OTHER_OVERHEADS.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.OTHER_OVERHEADS.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/OTHER_OVERHEADS.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-OTHER_OVERHEADS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-OTHER_OVERHEADS" name="OTHER_OVERHEADS" class="AE0060010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getOTHER_OVERHEADS()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d3_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d3_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d3_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d3_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d3_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d3_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd3_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d3_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d3_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d3_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d3_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d3_VEND_CUR_UNIT" name="d3_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0709",rb)%></span><!-- その他税 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-TAX_AMOUNT_3">
expj.AE0060010.AE0060010form2.TAX_AMOUNT_3 = {};
expj.AE0060010.AE0060010form2.TAX_AMOUNT_3.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/TAX_AMOUNT_3.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.TAX_AMOUNT_3.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-TAX_AMOUNT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'TAX_AMOUNT_3', this);
  });
  expj.AE0060010.AE0060010form2.TAX_AMOUNT_3.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.TAX_AMOUNT_3.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/TAX_AMOUNT_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-TAX_AMOUNT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-TAX_AMOUNT_3" name="TAX_AMOUNT_3" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getTAX_ROUND_TYP(), aAE0060010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getTAX_AMOUNT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d9_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d9_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d9_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d9_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d9_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d9_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd9_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d9_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d9_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d9_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d9_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d9_VEND_CUR_UNIT" name="d9_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-TAX_RATE_3" name="TAX_RATE_3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getTAX_RATE_3()) %>">
<script class="expj-script-AE0060010-AE0060010form2-TAX_RATE_3">
expj.AE0060010.AE0060010form2.TAX_RATE_3 = {};
expj.AE0060010.AE0060010form2.TAX_RATE_3.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/TAX_RATE_3.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.TAX_RATE_3.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-TAX_RATE_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'TAX_RATE_3', this);
  });
  expj.AE0060010.AE0060010form2.TAX_RATE_3.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.TAX_RATE_3.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/TAX_RATE_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-TAX_RATE_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_1",rb)%></span><!-- 受入金額 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-PUCH_ODR_AMOUNT">
expj.AE0060010.AE0060010form2.PUCH_ODR_AMOUNT = {};
expj.AE0060010.AE0060010form2.PUCH_ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/PUCH_ODR_AMOUNT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.PUCH_ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-PUCH_ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'PUCH_ODR_AMOUNT', this);
  });
  expj.AE0060010.AE0060010form2.PUCH_ODR_AMOUNT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.PUCH_ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/PUCH_ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-PUCH_ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-PUCH_ODR_AMOUNT" name="PUCH_ODR_AMOUNT" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getROUND_TYP(), aAE0060010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d4_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d4_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d4_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d4_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d4_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d4_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd4_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d4_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d4_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d4_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d4_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d4_VEND_CUR_UNIT" name="d4_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX",rb)%></span><!-- 税込金額 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-AMOUNT_INCLUDE_TAX">
expj.AE0060010.AE0060010form2.AMOUNT_INCLUDE_TAX = {};
expj.AE0060010.AE0060010form2.AMOUNT_INCLUDE_TAX.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/AMOUNT_INCLUDE_TAX.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.AMOUNT_INCLUDE_TAX.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-AMOUNT_INCLUDE_TAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'AMOUNT_INCLUDE_TAX', this);
  });
  expj.AE0060010.AE0060010form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/AMOUNT_INCLUDE_TAX.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-AMOUNT_INCLUDE_TAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-AMOUNT_INCLUDE_TAX" name="AMOUNT_INCLUDE_TAX" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getROUND_TYP(), aAE0060010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getAMOUNT_INCLUDE_TAX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d10_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d10_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d10_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d10_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d10_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d10_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd10_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d10_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d10_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d10_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d10_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d10_VEND_CUR_UNIT" name="d10_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DISC_AMOUNT",rb)%></span><!-- 値引金額 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-DISC_AMOUNT">
expj.AE0060010.AE0060010form2.DISC_AMOUNT = {};
// script1="onDecision;0;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0060010.AE0060010form2.DISC_AMOUNT.onDecision0 = function () {
  console.log('DISC_AMOUNT script1');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_DISC_AMOUNT')));
};
// script2="onDecision;1;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0060010.AE0060010form2.DISC_AMOUNT.onDecision1 = function () {
  console.log('DISC_AMOUNT script2');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_3')));
};
// script3="onDecision;2;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0060010.AE0060010form2.DISC_AMOUNT.onDecision2 = function () {
  console.log('DISC_AMOUNT script3');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_EXCH_RATE')));
};
expj.AE0060010.AE0060010form2.DISC_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/DISC_AMOUNT.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.DISC_AMOUNT['onDecision' + i])) {
        expj.AE0060010.AE0060010form2.DISC_AMOUNT['onDecision' + i]();
      }
    }
  }
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.DISC_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-DISC_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'DISC_AMOUNT', this);
  });
  expj.AE0060010.AE0060010form2.DISC_AMOUNT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.DISC_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/DISC_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-DISC_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-DISC_AMOUNT" name="DISC_AMOUNT" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getROUND_TYP(), aAE0060010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getDISC_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d5_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d5_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d5_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d5_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d5_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d5_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd5_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d5_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d5_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d5_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d5_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d5_VEND_CUR_UNIT" name="d5_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HOME_CUR_AMOUNT",rb)%></span><!-- 邦貨金額 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-HOME_CUR_AMOUNT">
expj.AE0060010.AE0060010form2.HOME_CUR_AMOUNT = {};
expj.AE0060010.AE0060010form2.HOME_CUR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/HOME_CUR_AMOUNT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.HOME_CUR_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-HOME_CUR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'HOME_CUR_AMOUNT', this);
  });
  expj.AE0060010.AE0060010form2.HOME_CUR_AMOUNT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.HOME_CUR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/HOME_CUR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-HOME_CUR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-HOME_CUR_AMOUNT" name="HOME_CUR_AMOUNT" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getROUND_TYP(), aAE0060010Struct.getHOME_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getHOME_CUR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-HOME_CUR_UNIT">
expj.AE0060010.AE0060010form2.HOME_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/HOME_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'HOME_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-HOME_CUR_UNIT" name="HOME_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NET_AMOUNT",rb)%></span><!-- 本体金額 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-NET_AMOUNT">
expj.AE0060010.AE0060010form2.NET_AMOUNT = {};
// script1="onDecision;0;SET;_DISC_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_NET_AMOUNT}]"
expj.AE0060010.AE0060010form2.NET_AMOUNT.onDecision0 = function () {
  console.log('NET_AMOUNT script1');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_DISC_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT')));
};
// script2="onDecision;1;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0060010.AE0060010form2.NET_AMOUNT.onDecision1 = function () {
  console.log('NET_AMOUNT script2');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_TAX_AMOUNT_3')));
};
// script3="onDecision;2;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0060010.AE0060010form2.NET_AMOUNT.onDecision2 = function () {
  console.log('NET_AMOUNT script3');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_EXCH_RATE')));
};
expj.AE0060010.AE0060010form2.NET_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/NET_AMOUNT.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.NET_AMOUNT['onDecision' + i])) {
        expj.AE0060010.AE0060010form2.NET_AMOUNT['onDecision' + i]();
      }
    }
  }
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.NET_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-NET_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'NET_AMOUNT', this);
  });
  expj.AE0060010.AE0060010form2.NET_AMOUNT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.NET_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/NET_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-NET_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-NET_AMOUNT" name="NET_AMOUNT" class="AE0060010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0060010Struct.getROUND_TYP(), aAE0060010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getNET_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d6_VEND_CUR_UNIT">
expj.AE0060010.AE0060010form2.d6_VEND_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d6_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d6_VEND_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d6_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d6_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd6_VEND_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d6_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d6_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d6_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d6_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d6_VEND_CUR_UNIT" name="d6_VEND_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EXCH_RATE",rb)%></span><!-- 為替レート --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-EXCH_RATE">
expj.AE0060010.AE0060010form2.EXCH_RATE = {};
// script1="onDecision;0;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0060010.AE0060010form2.EXCH_RATE.onDecision0 = function () {
  console.log('EXCH_RATE script1');
expj.common.pscript.setReferenceComponentValue('AE0060010', 'AE0060010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_EXCH_RATE')));
};
expj.AE0060010.AE0060010form2.EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/EXCH_RATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.EXCH_RATE['onDecision' + i])) {
        expj.AE0060010.AE0060010form2.EXCH_RATE['onDecision' + i]();
      }
    }
  }
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.EXCH_RATE.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'EXCH_RATE', this);
  });
  expj.AE0060010.AE0060010form2.EXCH_RATE.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-EXCH_RATE" name="EXCH_RATE" class="AE0060010-focus-move  required-value expj-AE0060010-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;6" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getEXCH_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-d_HOME_CUR_UNIT">
expj.AE0060010.AE0060010form2.d_HOME_CUR_UNIT = {};
expj.AE0060010.AE0060010form2.d_HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/d_HOME_CUR_UNIT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.d_HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-d_HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'd_HOME_CUR_UNIT', this);
  });
  expj.AE0060010.AE0060010form2.d_HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.d_HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/d_HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-d_HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-d_HOME_CUR_UNIT" name="d_HOME_CUR_UNIT" class="AE0060010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ODR_CANCEL_CAUSE_CD",rb)%></span><!-- 取消理由コード --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-ODR_CANCEL_CAUSE_CD">
expj.AE0060010.AE0060010form2.ODR_CANCEL_CAUSE_CD = {};
expj.AE0060010.AE0060010form2.ODR_CANCEL_CAUSE_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/ODR_CANCEL_CAUSE_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.ODR_CANCEL_CAUSE_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-ODR_CANCEL_CAUSE_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'ODR_CANCEL_CAUSE_CD', this);
  });
  expj.AE0060010.AE0060010form2.ODR_CANCEL_CAUSE_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.ODR_CANCEL_CAUSE_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/ODR_CANCEL_CAUSE_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-ODR_CANCEL_CAUSE_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-ODR_CANCEL_CAUSE_CD" name="ODR_CANCEL_CAUSE_CD" class="AE0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getODR_CANCEL_CAUSE_CD()) %>" maxlength="64" ></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-PeekerOdrCancelCauseCd">
expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd = {};
// script1="onClick;0;PEEKER;_AE0060010form2/ODR_CANCEL_CAUSE_CD@<%=contextNo%>"
expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd.onClick0 = function () {
  console.log('PeekerOdrCancelCauseCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060010';
var parameterValues = 'PeekerOdrCancelCauseCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010form2', '_ODR_CANCEL_CAUSE_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ODR_CANCEL_CAUSE_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060010form2/ODR_CANCEL_CAUSE_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd['onClick' + i])) {
        expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-PeekerOdrCancelCauseCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010form2', 'PeekerOdrCancelCauseCd', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/PeekerOdrCancelCauseCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-PeekerOdrCancelCauseCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060010-AE0060010form2-PeekerOdrCancelCauseCd" class="AE0060010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_CD",rb)%></span><!-- 納品書番号 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-DLV_CD">
expj.AE0060010.AE0060010form2.DLV_CD = {};
expj.AE0060010.AE0060010form2.DLV_CD.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/DLV_CD.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.DLV_CD.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-DLV_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'DLV_CD', this);
  });
  expj.AE0060010.AE0060010form2.DLV_CD.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.DLV_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/DLV_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-DLV_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-DLV_CD" name="DLV_CD" class="AE0060010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getDLV_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_RSLT_COMMENT_1",rb)%></span><!-- 受入備考 --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010form2-ACPT_RSLT_COMMENT">
expj.AE0060010.AE0060010form2.ACPT_RSLT_COMMENT = {};
expj.AE0060010.AE0060010form2.ACPT_RSLT_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/ACPT_RSLT_COMMENT.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.ACPT_RSLT_COMMENT.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-ACPT_RSLT_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'ACPT_RSLT_COMMENT', this);
  });
  expj.AE0060010.AE0060010form2.ACPT_RSLT_COMMENT.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.ACPT_RSLT_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/ACPT_RSLT_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-ACPT_RSLT_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AE0060010-AE0060010form2-ACPT_RSLT_COMMENT" name="ACPT_RSLT_COMMENT" class="AE0060010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getACPT_RSLT_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AE0060010-AE0060010form2-param1" name="param1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getparam1()) %>">
<script class="expj-script-AE0060010-AE0060010form2-param1">
expj.AE0060010.AE0060010form2.param1 = {};
expj.AE0060010.AE0060010form2.param1.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/param1.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.param1.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-param1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'param1', this);
  });
  expj.AE0060010.AE0060010form2.param1.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.param1.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/param1.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-param1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AE0060010-AE0060010form2-param2" name="param2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getparam2()) %>">
<script class="expj-script-AE0060010-AE0060010form2-param2">
expj.AE0060010.AE0060010form2.param2 = {};
expj.AE0060010.AE0060010form2.param2.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/param2.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.param2.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-param2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'param2', this);
  });
  expj.AE0060010.AE0060010form2.param2.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.param2.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/param2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-param2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AE0060010-AE0060010form2-param3" name="param3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060010Struct.getparam3()) %>">
<script class="expj-script-AE0060010-AE0060010form2-param3">
expj.AE0060010.AE0060010form2.param3 = {};
expj.AE0060010.AE0060010form2.param3.executeAllOnDecision = function () {
  console.log('execute AE0060010form2/param3.onDecision');
  expj.AE0060010.AE0060010form2.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010form2.param3.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010form2-param3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010form2', 'param3', this);
  });
  expj.AE0060010.AE0060010form2.param3.executePScriptOnLoad();
};

expj.AE0060010.AE0060010form2.param3.executePScriptOnLoad = function () {
  console.log('execute AE0060010form2/param3.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010form2-param3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0060010-AE0060010button2">
expj.AE0060010.AE0060010button2 = {};
expj.AE0060010.AE0060010button2.executeAllOnDecision = function () {
  console.log('execute AE0060010button2.onDecision');
};
expj.AE0060010.AE0060010button2.executeOnLoad = function () {
  expj.AE0060010.AE0060010button2.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button2.executePScriptOnLoad = function () {
  console.log('execute AE0060010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060010-AE0060010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060010-AE0060010button2-Insert">
expj.AE0060010.AE0060010button2.Insert = {};
// script1="onClick;0;CHK;_AE0060010detail1/PUCH_ODR_STS_TYP[eq]9@!AE05005"
expj.AE0060010.AE0060010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/PUCH_ODR_STS_TYP'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010button2', 'AE05005');
}
};
// script2="onClick;1;CHK;_AE0060010detail1/UNIT_QTY_TYP[eq]1@*0,*1"
expj.AE0060010.AE0060010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/UNIT_QTY_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;CHK;_AE0060010form2/ACPT_QTY[lt]0@#AE05019"
expj.AE0060010.AE0060010button2.Insert.child0 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE05019');
}
};
// script4="child;1;CHK;_AE0060010form2/ACPT_QTY[lt]0@#AE05018"
expj.AE0060010.AE0060010button2.Insert.child1 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE05018');
}
};
// script5="onClick;2;CHK;_AE0060010form2/ACPT_DATE[gt]_AE0060010form2/BUSINESS_OPR_DATE@#AE33111"
expj.AE0060010.AE0060010button2.Insert.onClick2 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE33111');
}
};
// script6="onClick;3;CHK;_AE0060010form2/h_DATE_FLG[eq]0@*11,*12"
expj.AE0060010.AE0060010button2.Insert.onClick3 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_DATE_FLG'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script7="onClick;4;CHK;_AE0060010form2/EXCH_RATE[lte]0@#AE00059"
expj.AE0060010.AE0060010button2.Insert.onClick4 = function () {
  console.log('Insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/EXCH_RATE')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE00059');
}
};
// script8="onClick;5;CHK;_AE0060010form2/c_COMPLETE[neq]true[and][{_AE0060010form2/ACPT_QTY}+{_AE0060010detail1/SUM_ACPT_QTY}][gt]_AE0060010detail1/PUCH_ODR_QTY@$AE05043"
expj.AE0060010.AE0060010button2.Insert.onClick5 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/c_COMPLETE'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/SUM_ACPT_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/PUCH_ODR_QTY')))) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE05043');
}
};
// script9="onClick;6;CHK;_AE0060010form2/c_COMPLETE[eq]true[and]_AE0060010form2/c_CANCEL[neq]true[and][{_AE0060010form2/ACPT_QTY}+{_AE0060010detail1/SUM_ACPT_QTY}][lt]_AE0060010detail1/PUCH_ODR_QTY@$AE05044"
expj.AE0060010.AE0060010button2.Insert.onClick6 = function () {
  console.log('Insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/c_COMPLETE'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/c_CANCEL'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/SUM_ACPT_QTY')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/PUCH_ODR_QTY')))) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE05044');
}
};
// script10="onClick;7;CHK;_AE0060010form2/c_COMPLETE[eq]true[and]_AE0060010form2/c_CANCEL[neq]true[and][{_AE0060010form2/ACPT_QTY}+{_AE0060010detail1/SUM_ACPT_QTY}][gt]_AE0060010detail1/PUCH_ODR_QTY@$AE05045"
expj.AE0060010.AE0060010button2.Insert.onClick7 = function () {
  console.log('Insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/c_COMPLETE'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/c_CANCEL'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/SUM_ACPT_QTY')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/PUCH_ODR_QTY')))) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE05045');
}
};
// script11="onClick;8;CHK;~TO_YYYY_MM(_AE0060010form2/ACPT_DATE)[lt]~TO_YYYY_MM(_AE0060010form2/BUSINESS_OPR_DATE)@$AE05007"
expj.AE0060010.AE0060010button2.Insert.onClick8 = function () {
  console.log('Insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AE0060010', 'AE0060010button2', '_AE0060010form2/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE05007');
}
};
// script12="onClick;9;CHK;_AE0060010form2/SelectUnitCostFlag[eq]false@$AE00062"
expj.AE0060010.AE0060010button2.Insert.onClick9 = function () {
  console.log('Insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/SelectUnitCostFlag'), '[eq]', 'false')) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE00062');
}
};
// script13="onClick;10;CHK;_AE0060010form2/UNIT_COST[lt][{_AE0060010form2/PROCESSING_COST}+{_AE0060010form2/MATERIAL_COST}+{_AE0060010form2/OTHER_OVERHEADS}]@$AE00066"
expj.AE0060010.AE0060010button2.Insert.onClick10 = function () {
  console.log('Insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/UNIT_COST')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/PROCESSING_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/MATERIAL_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/OTHER_OVERHEADS')))) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE00066');
}
};
// script14="onClick;11;CHK;_AE0060010form1/INSTALL_FLG[eq]1[and]_AE0060010detail1/SPL_ITEM_TYP[neq]2@*2"
expj.AE0060010.AE0060010button2.Insert.onClick11 = function () {
  console.log('Insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form1/INSTALL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/SPL_ITEM_TYP'), '[neq]', '2')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script15="child;2;CHK;_AE0060010form1/THIS_MONTH[gt]~TO_YYYY_MM(_AE0060010form2/ACPT_DATE)@$AE00156"
expj.AE0060010.AE0060010button2.Insert.child2 = function () {
  console.log('Insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form1/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_DATE')))) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE00156');
}
};
// script16="onClick;12;CHK;_AE0060010form2/ACPT_QTY[numeq]0.0[and]_AE0060010form2/LOT_NO[neq]@#AE20617"
expj.AE0060010.AE0060010button2.Insert.onClick12 = function () {
  console.log('Insert script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY')), '[numeq]', expj.common.pscript.convertNumber('0.0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/LOT_NO'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE20617');
}
};
// script17="onClick;13;CHK;_AE0060010form2/LOT_NO[neq][and]_AE0060010detail1/NON_NO_ITEM_FLG[eq]1@#AE20608"
expj.AE0060010.AE0060010button2.Insert.onClick13 = function () {
  console.log('Insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/LOT_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/NON_NO_ITEM_FLG'), '[eq]', '1')) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE20608');
}
};
// script18="onClick;14;CHK;_AE0060010form2/LOT_NO[neq][and]_AE0060010form2/h_LOT_CTRL_FLG[neq]1@#AE20601"
expj.AE0060010.AE0060010button2.Insert.onClick14 = function () {
  console.log('Insert script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/LOT_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_LOT_CTRL_FLG'), '[neq]', '1')) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE20601');
}
};
// script19="onClick;15;CHK;_AE0060010form2/c_CANCEL[neq]true[and]_AE0060010form2/h_LOT_CTRL_FLG[eq]1[and]_AE0060010form1/h_LOTCTRL[eq]true@*3"
expj.AE0060010.AE0060010button2.Insert.onClick15 = function () {
  console.log('Insert script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/c_CANCEL'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_LOT_CTRL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form1/h_LOTCTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script20="child;3;CHK;_AE0060010form2/h_WORK_ODR_CD[eq]@*4,*5"
expj.AE0060010.AE0060010button2.Insert.child3 = function () {
  console.log('Insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_WORK_ODR_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script21="child;4;CHK;_AE0060010form2/h_LOT_NUMBERING_TYP[eq]0[and]_AE0060010detail1/NON_NO_ITEM_FLG[neq]1[and]_AE0060010form2/LOT_NO[eq][and]_AE0060010form2/ACPT_QTY[numneq]0@#AE20600"
expj.AE0060010.AE0060010button2.Insert.child4 = function () {
  console.log('Insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_LOT_NUMBERING_TYP'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/NON_NO_ITEM_FLG'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/LOT_NO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY')), '[numneq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE20600');
}
};
// script22="child;5;CHK;_AE0060010form2/LOT_NO[neq]@*6,*7"
expj.AE0060010.AE0060010button2.Insert.child5 = function () {
  console.log('Insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/LOT_NO'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script23="child;6;CHK;_AE0060010form2/h_FINAL_PROC_CD[neq]1@#AE20602"
expj.AE0060010.AE0060010button2.Insert.child6 = function () {
  console.log('Insert script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_FINAL_PROC_CD'), '[neq]', '1')) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE20602');
}
};
// script24="child;7;CHK;_AE0060010form2/h_LOT_NUMBERING_TYP[eq]0[and]_AE0060010detail1/NON_NO_ITEM_FLG[neq]1[and]_AE0060010form2/h_FINAL_PROC_CD[eq]1[and]_AE0060010form2/ACPT_QTY[numneq]0@#AE20600"
expj.AE0060010.AE0060010button2.Insert.child7 = function () {
  console.log('Insert script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_LOT_NUMBERING_TYP'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/NON_NO_ITEM_FLG'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_FINAL_PROC_CD'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY')), '[numneq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE20600');
}
};
// script25="onClick;16;CHK;_AE0060010form2/c_CANCEL[neq]true[and]_AE0060010form2/h_LOT_CTRL_FLG[eq]1[and]_AE0060010form1/h_LOTCTRL[eq]true@*8"
expj.AE0060010.AE0060010button2.Insert.onClick16 = function () {
  console.log('Insert script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/c_CANCEL'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_LOT_CTRL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form1/h_LOTCTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script26="child;8;CHK;_AE0060010form2/LOT_NO[eq][and]_AE0060010detail1/NON_NO_ITEM_FLG[neq]1[and]_AE0060010form2/ACPT_QTY[numneq]0[and]_AE0060010form2/h_LOT_NUMBERING_TYP[neq]0@*9"
expj.AE0060010.AE0060010button2.Insert.child8 = function () {
  console.log('Insert script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/LOT_NO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/NON_NO_ITEM_FLG'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_QTY')), '[numneq]', expj.common.pscript.convertNumber('0')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_LOT_NUMBERING_TYP'), '[neq]', '0')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script27="child;9;CHK;_AE0060010form2/h_WORK_ODR_CD[eq]@$AE20613,*10"
expj.AE0060010.AE0060010button2.Insert.child9 = function () {
  console.log('Insert script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_WORK_ODR_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE20613');
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script28="child;10;CHK;_AE0060010form2/h_FINAL_PROC_CD[eq]1@$AE20613"
expj.AE0060010.AE0060010button2.Insert.child10 = function () {
  console.log('Insert script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/h_FINAL_PROC_CD'), '[eq]', '1')) {
expj.common.pscript.addWarningMessage('AE0060010', 'AE0060010button2', 'AE20613');
}
};
// script29="onClick;17;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060010form1/*,_AE0060010form2/*,_AE0060010detail1/*@AE0060010Servlet,,$ZZ07001"
expj.AE0060010.AE0060010button2.Insert.onClick17 = function () {
  console.log('Insert script29');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060010', 'AE0060010button2', '_AE0060010form1/*,_AE0060010form2/*,_AE0060010detail1/*', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060010', response);
expj.common.updateBusinessScreenTab('AE0060010', contents);
};
expj.common.pscript.callConfirm('AE0060010', 'AE0060010button2', 'ZZ07001', okEvent);
};
// script30="child;11;CHK;_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE[gt]_AE0060010form2/ACPT_DATE@#AE05006"
expj.AE0060010.AE0060010button2.Insert.child11 = function () {
  console.log('Insert script30');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE05006');
}
};
// script31="child;12;CHK;_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE[gt]_AE0060010form2/ACPT_DATE@#AE05078"
expj.AE0060010.AE0060010button2.Insert.child12 = function () {
  console.log('Insert script31');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010detail1/PUCH_ODR_SLIP_ISS_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button2', '_AE0060010form2/ACPT_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060010', 'AE0060010button2', 'AE05078');
}
};
expj.AE0060010.AE0060010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 17; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010button2.Insert['onClick' + i])) {
        expj.AE0060010.AE0060010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010button2.Insert.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010button2.Insert.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010button2', 'Insert', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010button2.Insert.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AE0060010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060010-AE0060010button2-Insert" name="Insert" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 410px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0060010 Revision: 1.24  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AE0060010-AE0060010button0">
expj.AE0060010.AE0060010button0 = {};
expj.AE0060010.AE0060010button0.executeAllOnDecision = function () {
  console.log('execute AE0060010button0.onDecision');
};
expj.AE0060010.AE0060010button0.executeOnLoad = function () {
  expj.AE0060010.AE0060010button0.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button0.executePScriptOnLoad = function () {
  console.log('execute AE0060010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060010-AE0060010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060010-AE0060010button0-CancelComplete">
expj.AE0060010.AE0060010button0.CancelComplete = {};
// script1="onClick;0;CHK;_AE0060010detail1/PUCH_ODR_STS_TYP[neq]9@!AE05010"
expj.AE0060010.AE0060010button0.CancelComplete.onClick0 = function () {
  console.log('CancelComplete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button0', '_AE0060010detail1/PUCH_ODR_STS_TYP'), '[neq]', '9')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010button0', 'AE05010');
}
};
// script2="onClick;1;CHK;_AE0060010detail1/ACPT_INSPC_TYP[eq]2[and]_AE0060010detail1/INSPC_CMPLT_FLG[eq]1@!AE20135"
expj.AE0060010.AE0060010button0.CancelComplete.onClick1 = function () {
  console.log('CancelComplete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button0', '_AE0060010detail1/ACPT_INSPC_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060010', 'AE0060010button0', '_AE0060010detail1/INSPC_CMPLT_FLG'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AE0060010', 'AE0060010button0', 'AE20135');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060010form1/*,_AE0060010detail1/*@AE0060010Servlet,,$AE05011"
expj.AE0060010.AE0060010button0.CancelComplete.onClick2 = function () {
  console.log('CancelComplete script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060010', 'AE0060010button0', '_AE0060010form1/*,_AE0060010detail1/*', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060010', response);
expj.common.updateBusinessScreenTab('AE0060010', contents);
};
expj.common.pscript.callConfirm('AE0060010', 'AE0060010button0', 'AE05011', okEvent);
};
expj.AE0060010.AE0060010button0.CancelComplete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010button0.CancelComplete['onClick' + i])) {
        expj.AE0060010.AE0060010button0.CancelComplete['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010button0.CancelComplete.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010button0.CancelComplete.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010button0-CancelComplete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010button0', 'CancelComplete', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010button0.CancelComplete.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button0.CancelComplete.executePScriptOnLoad = function () {
  console.log('execute AE0060010button0/CancelComplete.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010button0-CancelComplete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060010-AE0060010button0-CancelComplete" name="CancelComplete" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelComplete",rb)%></button><!-- 完了解除ボタン --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010button0-CancelOdrCancel">
expj.AE0060010.AE0060010button0.CancelOdrCancel = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060010form1/*,_AE0060010detail1/*@AE0060010Servlet,,$AE00088"
expj.AE0060010.AE0060010button0.CancelOdrCancel.onClick0 = function () {
  console.log('CancelOdrCancel script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060010', 'AE0060010button0', '_AE0060010form1/*,_AE0060010detail1/*', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060010', response);
expj.common.updateBusinessScreenTab('AE0060010', contents);
};
expj.common.pscript.callConfirm('AE0060010', 'AE0060010button0', 'AE00088', okEvent);
};
expj.AE0060010.AE0060010button0.CancelOdrCancel.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010button0.CancelOdrCancel['onClick' + i])) {
        expj.AE0060010.AE0060010button0.CancelOdrCancel['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010button0.CancelOdrCancel.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010button0.CancelOdrCancel.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010button0-CancelOdrCancel').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010button0', 'CancelOdrCancel', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010button0.CancelOdrCancel.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button0.CancelOdrCancel.executePScriptOnLoad = function () {
  console.log('execute AE0060010button0/CancelOdrCancel.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010button0-CancelOdrCancel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060010-AE0060010button0-CancelOdrCancel" name="CancelOdrCancel" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelOdrCancel",rb)%></button><!-- 取消解除ボタン --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010button0-Clear">
expj.AE0060010.AE0060010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0060010Servlet,,$ZZ07008"
expj.AE0060010.AE0060010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060010', 'AE0060010button0', '', 'AE0060010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060010', response);
expj.common.updateBusinessScreenTab('AE0060010', contents);
};
expj.common.pscript.callConfirm('AE0060010', 'AE0060010button0', 'ZZ07008', okEvent);
};
expj.AE0060010.AE0060010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010button0.Clear['onClick' + i])) {
        expj.AE0060010.AE0060010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010button0.Clear.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0060010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060010-AE0060010button0-Clear" name="Clear" class="AE0060010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0060010-AE0060010button0-Close">
expj.AE0060010.AE0060010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0060010.AE0060010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0060010');
};
expj.AE0060010.AE0060010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060010.AE0060010button0.Close['onClick' + i])) {
        expj.AE0060010.AE0060010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0060010.AE0060010button0.Close.executeAllOnDecision = function () {
};
expj.AE0060010.AE0060010button0.Close.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060010', 'AE0060010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0060010.AE0060010button0.Close.executePScriptOnLoad();
};

expj.AE0060010.AE0060010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0060010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060010-AE0060010button0-Close" name="Close" class="AE0060010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0060010 (END)-->
<script class="expj-script-AE0060010-AE0060010detail1">
expj.AE0060010.AE0060010detail1 = {};
expj.AE0060010.AE0060010detail1.executeAllOnDecision = function () {
  console.log('execute AE0060010detail1.onDecision');
};
expj.AE0060010.AE0060010detail1.executeOnLoad = function () {
  expj.AE0060010.AE0060010detail1.executePScriptOnLoad();
};

expj.AE0060010.AE0060010detail1.executePScriptOnLoad = function () {
  console.log('execute AE0060010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0060010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0060010-AE0060010detail1" class="expj-datagird-detail" data-float="AE0060010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0060010detail1";
 detailFloat = "AE0060010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AE0060010detail1_Id = "AE0060010detail1";
 String AE0060010detail1_select = "single";
 String AE0060010detail1_sortable = "true";
 String AE0060010detail1_resize = "true";
 String AE0060010detail1_scroll = "true";
 StringBuffer AE0060010detail1_HB = new StringBuffer();
 StringBuffer AE0060010detail1_DB = new StringBuffer();
%>
<%
 AE0060010detail1_sortable = "false";
 AE0060010detail1_select = "none";
%>
<% AE0060010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0060010detail1_sortable).append("}").append(","); %>
<%  AE0060010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0060010detail1_sortable).append("}").append(",");
AE0060010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0060010detail1_sortable).append("}").append(",");
AE0060010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0060010detail1_sortable).append("}").append(",");
AE0060010detail1_HB.append("{'visible':true,'width':'0px','title':'','name':'col4', 'class':'expj-detail-cell-hidden','sortable':").append(AE0060010detail1_sortable).append("}").append(",");
 %>
  <% AE0060010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-ITEM_CD_DW\" class=\"expj-label\" data-name=\"ITEM_CD_DW\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getITEM_CD_DW())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-ITEM_NAME_DW\" class=\"expj-label\" data-name=\"ITEM_NAME_DW\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getITEM_NAME_DW())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.JOB_ODR_CD",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-JOB_ODR_CD\" class=\"expj-label\" data-name=\"JOB_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getJOB_ODR_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getSPEC())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <script class="expj-script-AE0060010-AE0060010detail1-UNIT_QTY_TYP">
expj.AE0060010.AE0060010detail1.UNIT_QTY_TYP = {};
expj.AE0060010.AE0060010detail1.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AE0060010detail1/UNIT_QTY_TYP.onDecision');
  expj.AE0060010.AE0060010detail1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010detail1.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010detail1-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010detail1', 'UNIT_QTY_TYP', this);
  });
  expj.AE0060010.AE0060010detail1.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AE0060010.AE0060010detail1.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0060010detail1/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010detail1-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AE0060010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("','").append("<input type=\"hidden\" id=\"expj-AE0060010-AE0060010detail1-UNIT_QTY_TYP\" data-detailItem=\"true\" name=\"UNIT_QTY_TYP\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAE0060010Struct.getUNIT_QTY_TYP())).append("\"").append(" maxlength=\"2147483647\">").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-VEND_CD\" class=\"expj-label\" data-name=\"VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getVEND_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.VEND_NAME",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-VEND_NAME\" class=\"expj-label\" data-name=\"VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getVEND_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0060010-AE0060010detail1-PUCH_ODR_QTY\" class=\"expj-label\" data-name=\"PUCH_ODR_QTY\" data-detailItem=\"true\" data-kind=\"").append(Kind.convertNumeric(aAE0060010Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0060010-AE0060010detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getSTOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.ACPT_QTY_5",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0060010-AE0060010detail1-SUM_ACPT_QTY\" class=\"expj-label\" data-name=\"SUM_ACPT_QTY\" data-detailItem=\"true\" data-kind=\"").append(Kind.convertNumeric(aAE0060010Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAE0060010Struct.getSUM_ACPT_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0060010-AE0060010detail1-d1_STOCK_UNIT\" class=\"expj-label\" data-name=\"d1_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getSTOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <script class="expj-script-AE0060010-AE0060010detail1-ACPT_INSPC_TYP">
expj.AE0060010.AE0060010detail1.ACPT_INSPC_TYP = {};
expj.AE0060010.AE0060010detail1.ACPT_INSPC_TYP.executeAllOnDecision = function () {
  console.log('execute AE0060010detail1/ACPT_INSPC_TYP.onDecision');
  expj.AE0060010.AE0060010detail1.executeAllOnDecision();
  expj.AE0060010.executeAllOnDecision();
};
expj.AE0060010.AE0060010detail1.ACPT_INSPC_TYP.executeOnLoad = function () {
  $('#expj-AE0060010-AE0060010detail1-ACPT_INSPC_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060010', 'AE0060010detail1', 'ACPT_INSPC_TYP', this);
  });
  expj.AE0060010.AE0060010detail1.ACPT_INSPC_TYP.executePScriptOnLoad();
};

expj.AE0060010.AE0060010detail1.ACPT_INSPC_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0060010detail1/ACPT_INSPC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0060010-AE0060010detail1-ACPT_INSPC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<% AE0060010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-ACPT_INSPC_TYP_DN\" class=\"expj-label\" data-name=\"ACPT_INSPC_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getACPT_INSPC_TYP_DN())).append("</span>").append("','").append("").append("','").append("<input type=\"hidden\" id=\"expj-AE0060010-AE0060010detail1-ACPT_INSPC_TYP\" data-detailItem=\"true\" name=\"ACPT_INSPC_TYP\" data-kind=\"\" value=\"").append(TypeConverter.sanitizer(aAE0060010Struct.getACPT_INSPC_TYP())).append("\"").append(" maxlength=\"2147483647\">").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.PUCH_ODR_INST_DATE_1",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PUCH_ODR_SLIP_ISS_DATE\" class=\"expj-label\" data-name=\"PUCH_ODR_SLIP_ISS_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_SLIP_ISS_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PUCH_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"PUCH_ODR_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_DLV_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_1",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-CONFIRM_DLV_DATE\" class=\"expj-label\" data-name=\"CONFIRM_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060010Struct.getCONFIRM_DLV_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-WORK_IN_PROC_CD\" class=\"expj-label\" data-name=\"WORK_IN_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getWORK_IN_PROC_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.PROC_NAME",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PROC_NAME\" class=\"expj-label\" data-name=\"PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPROC_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.PUCH_ODR_PERSON",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PUCH_ODR_PERSON\" class=\"expj-label\" data-name=\"PUCH_ODR_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_PERSON())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.USER_NAME",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-USER_NAME\" class=\"expj-label\" data-name=\"USER_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getUSER_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.PUCH_ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PUCH_ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"PUCH_ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_STS_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PUCH_ODR_STS_TYP\" class=\"expj-label\" data-name=\"PUCH_ODR_STS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_STS_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.INSPC_CMPLT_FLG",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-INSPC_CMPLT_FLG_DN\" class=\"expj-label\" data-name=\"INSPC_CMPLT_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getINSPC_CMPLT_FLG_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-INSPC_CMPLT_FLG\" class=\"expj-label\" data-name=\"INSPC_CMPLT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getINSPC_CMPLT_FLG())).append("</span>").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-SPL_ITEM_TYP_DN\" class=\"expj-label\" data-name=\"SPL_ITEM_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getSPL_ITEM_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-SPL_ITEM_TYP\" class=\"expj-label\" data-name=\"SPL_ITEM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getSPL_ITEM_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.PRODUCT_TYP",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PRODUCT_TYP_DN\" class=\"expj-label\" data-name=\"PRODUCT_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPRODUCT_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PRODUCT_TYP\" class=\"expj-label\" data-name=\"PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPRODUCT_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.NON_NO_ITEM_FLG",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-NON_NO_ITEM_FLG_DN\" class=\"expj-label\" data-name=\"NON_NO_ITEM_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getNON_NO_ITEM_FLG_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-NON_NO_ITEM_FLG\" class=\"expj-label\" data-name=\"NON_NO_ITEM_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getNON_NO_ITEM_FLG())).append("</span>").append("']").append(",");%>
 <% AE0060010detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.PUCH_ODR_COMMENT",rb)).append("','").append("<span id=\"expj-AE0060010-AE0060010detail1-PUCH_ODR_COMMENT\" class=\"expj-label\" data-name=\"PUCH_ODR_COMMENT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060010Struct.getPUCH_ODR_COMMENT())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0060010detail1_Id;
 detailViewSelect = AE0060010detail1_select;
 detailViewResize = AE0060010detail1_resize;
 detailViewScroll = AE0060010detail1_scroll;
 detailViewHeaderData = AE0060010detail1_HB;
 detailViewBodyData = AE0060010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAE0060010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0060010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0060010)) {
  expj.common.treeInstanceMap.AE0060010 = {};
}
expj.common.treeInstanceMap.AE0060010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0060010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0060010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0060010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0060010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0060010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0060010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0060010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0060010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060010)) {
  expj.common.detailDialogMap.AE0060010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0060010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0060010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0060010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0060010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0060010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0060010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0060010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0060010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0060010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0060010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0060010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0060010)) {
  expj.common.viewInstanceMap.AE0060010 = {};
}
expj.common.viewInstanceMap.AE0060010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0060010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0060010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0060010.<%=viewId %>.init = function () {
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
    expj.AE0060010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0060010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0060010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0060010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0060010_init">
/**
 * AE0060010用のロード完了時初期化関数
 */
expj.AE0060010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0060010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0060010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0060010');
  expj.common.calendarInstanceMap.AE0060010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0060010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0060010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0060010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0060010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0060010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0060010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0060010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0060010.AE0060010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.h_PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.h_LOTCTRL.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.ACPT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.THIS_MONTH.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.PUCH_ODR_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_FINAL_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_LOT_NUMBERING_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d2_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.c_COMPLETE.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.c_CANCEL.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.ACPT_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.CalendarAcptDate.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_DATE_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_ODR_CANCEL_SLIP_ISS_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_PUCH_ODR_CD_1.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.INSPC_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.INSPC_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.h_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.PeekerLotNo.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.LotInsert.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.SelectUnitCostFlag.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.PROCESSING_COST.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d1_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.TAX_AMOUNT_1.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d7_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.TAX_RATE_1.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.MATERIAL_COST.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d2_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.TAX_AMOUNT_2.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d8_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.TAX_RATE_2.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.OTHER_OVERHEADS.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d3_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.TAX_AMOUNT_3.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d9_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.TAX_RATE_3.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.PUCH_ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d4_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.AMOUNT_INCLUDE_TAX.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d10_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.DISC_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d5_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.HOME_CUR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.NET_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d6_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.d_HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.ODR_CANCEL_CAUSE_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.PeekerOdrCancelCauseCd.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.DLV_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.ACPT_RSLT_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.param1.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.param2.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.param3.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button0.CancelComplete.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button0.CancelOdrCancel.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010detail1.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010detail1.ACPT_INSPC_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form1.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button1.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010form2.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button2.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010button0.executeOnLoad();}catch(e){};
  try{expj.AE0060010.AE0060010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0060010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0060010', 'AE0060010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0060010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0060010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0060010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0060010', '<%=request.getContextPath() %>');
};

/**
 * AE0060010の全体onDecision処理
 */
expj.AE0060010.executeAllOnDecision = function () {
  expj.AE0060010.AE0060010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0060010_console">
expj.AE0060010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>