<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:08:18 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0120\AE0120010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AE0120.*" %>
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
<jsp:useBean id="aAE0120010Control" class="com.nec.jp.orteus.metamorBase.AE0120.AE0120010Control" scope="request"/>
<jsp:useBean id="aAE0120010Struct" class="com.nec.jp.orteus.metamorBase.AE0120.AE0120010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

購入返品実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0120/jsp/AE0120010.jsp,v $
$Author: geng-jia $
$Revision: 1.19 $ $Date: 2017/02/22 02:05:25 $
********************************************************* --%>
<html>
<head>
<title>購入返品実績入力</title>
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
<script class="expj-script-AE0120010_init">
  // AE0120010名前空間
  expj.AE0120010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0120010" data-screen="AE0120010" data-newdata="<%=aAE0120010Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AE0120010-AE0120010form1">
expj.AE0120010.AE0120010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4"
expj.AE0120010.AE0120010form1.onLoad0 = function () {
  console.log('AE0120010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0120010.AE0120010form1.onDecision0 = function () {
  console.log('AE0120010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0120010button1/Select"
expj.AE0120010.AE0120010form1.child0 = function () {
  console.log('AE0120010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button1/Select');
};
// script4="child;1;MASK;_AE0120010button1/Select"
expj.AE0120010.AE0120010form1.child1 = function () {
  console.log('AE0120010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button1/Select');
};
// script5="onDecision;1;CHK;_AE0120010form2/c_NON_NO_ITEM_FLG[eq]true@*2,*3"
expj.AE0120010.AE0120010form1.onDecision1 = function () {
  console.log('AE0120010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/c_NON_NO_ITEM_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;CHKRQ;B,C[or]D@*4,*5"
expj.AE0120010.AE0120010form1.child2 = function () {
  console.log('AE0120010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'B') && (expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'C') || expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'D'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHKRQ;B,C@*4,*5"
expj.AE0120010.AE0120010form1.child3 = function () {
  console.log('AE0120010form1 script7');
if (expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'B') && expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AE0120010button2/Insert"
expj.AE0120010.AE0120010form1.child4 = function () {
  console.log('AE0120010form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button2/Insert');
};
// script9="child;5;MASK;_AE0120010button2/Insert"
expj.AE0120010.AE0120010form1.child5 = function () {
  console.log('AE0120010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button2/Insert');
};
// script10="onDecision;2;CHK;?AE0120010form1/PUCH_ODR_CD[eq]SAME[and]?AE0120010form1/*[eq]NORMAL@*6,*11"
expj.AE0120010.AE0120010form1.onDecision2 = function () {
  console.log('AE0120010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '?AE0120010form1/PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '?AE0120010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script11="child;6;CHK;_AE0120010form2/c_NON_NO_ITEM_FLG[eq]true@*7,*8"
expj.AE0120010.AE0120010form1.child6 = function () {
  console.log('AE0120010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/c_NON_NO_ITEM_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;CHKRQ;A,B,C[or]D@*9,*11"
expj.AE0120010.AE0120010form1.child7 = function () {
  console.log('AE0120010form1 script12');
if (expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'B') && (expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'C') || expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'D'))) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script13="child;8;CHKRQ;A,B,C@*9,*11"
expj.AE0120010.AE0120010form1.child8 = function () {
  console.log('AE0120010form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'B') && expj.common.pscript.satisfiedRequiredComponent('AE0120010', 'C')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script14="child;9;CHK;_AE0120010form2/RTN_DEL_FLG[neq]1@*10,*11"
expj.AE0120010.AE0120010form1.child9 = function () {
  console.log('AE0120010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/RTN_DEL_FLG'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;10;UNMASK;_AE0120010button2/Update,_AE0120010button2/Delete"
expj.AE0120010.AE0120010form1.child10 = function () {
  console.log('AE0120010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button2/Delete');
};
// script16="child;11;MASK;_AE0120010button2/Update,_AE0120010button2/Delete"
expj.AE0120010.AE0120010form1.child11 = function () {
  console.log('AE0120010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010button2/Delete');
};
// script17="onDecision;3;CHK;_AE0120010form2/r2_FILTER[eq]true@*12,*13"
expj.AE0120010.AE0120010form1.onDecision3 = function () {
  console.log('AE0120010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/r2_FILTER'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script18="child;12;UNMASK;_AE0120010form2/PUCH_ODR_CD_2,_AE0120010form2/PeekerPuchOdrCd2"
expj.AE0120010.AE0120010form1.child12 = function () {
  console.log('AE0120010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PUCH_ODR_CD_2');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerPuchOdrCd2');
};
// script19="child;13;MASK;_AE0120010form2/PUCH_ODR_CD_2,_AE0120010form2/PeekerPuchOdrCd2@*14"
expj.AE0120010.AE0120010form1.child13 = function () {
  console.log('AE0120010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PUCH_ODR_CD_2');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerPuchOdrCd2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script20="child;14;SET;_AE0120010form2/PUCH_ODR_CD_2="
expj.AE0120010.AE0120010form1.child14 = function () {
  console.log('AE0120010form1 script20');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/PUCH_ODR_CD_2', '');
};
// script21="onDecision;4;CHK;?AE0120010form1/*[eq]NORMAL@*15,*23"
expj.AE0120010.AE0120010form1.onDecision4 = function () {
  console.log('AE0120010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '?AE0120010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script22="child;15;MASK;_AE0120010form2/VEND_CD@*16"
expj.AE0120010.AE0120010form1.child15 = function () {
  console.log('AE0120010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/VEND_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script23="child;16;MASK;_AE0120010form2/PeekerVendCd@*17"
expj.AE0120010.AE0120010form1.child16 = function () {
  console.log('AE0120010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerVendCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script24="child;17;MASK;_AE0120010form2/ITEM_CD@*18"
expj.AE0120010.AE0120010form1.child17 = function () {
  console.log('AE0120010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/ITEM_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child18)){this.child18();}}
};
// script25="child;18;MASK;_AE0120010form2/PeekerItemCd@*19"
expj.AE0120010.AE0120010form1.child18 = function () {
  console.log('AE0120010form1 script25');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child19)){this.child19();}}
};
// script26="child;19;MASK;_AE0120010form2/JOB_ODR_CD@*20"
expj.AE0120010.AE0120010form1.child19 = function () {
  console.log('AE0120010form1 script26');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script27="child;20;MASK;_AE0120010form2/PeekerJobOdrCd@*21"
expj.AE0120010.AE0120010form1.child20 = function () {
  console.log('AE0120010form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
// script28="child;21;MASK;_AE0120010form2/r2_FILTER@*22"
expj.AE0120010.AE0120010form1.child21 = function () {
  console.log('AE0120010form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/r2_FILTER');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script29="child;22;MASK;_AE0120010form2/c_NON_NO_ITEM_FLG,_AE0120010form2/ITEM_NAME"
expj.AE0120010.AE0120010form1.child22 = function () {
  console.log('AE0120010form1 script29');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/c_NON_NO_ITEM_FLG');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/ITEM_NAME');
};
// script30="child;23;UNMASK;_AE0120010form2/VEND_CD@*24"
expj.AE0120010.AE0120010form1.child23 = function () {
  console.log('AE0120010form1 script30');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/VEND_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
// script31="child;24;UNMASK;_AE0120010form2/PeekerVendCd@*25"
expj.AE0120010.AE0120010form1.child24 = function () {
  console.log('AE0120010form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerVendCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child25)){this.child25();}}
};
// script32="child;25;UNMASK;_AE0120010form2/ITEM_CD@*26"
expj.AE0120010.AE0120010form1.child25 = function () {
  console.log('AE0120010form1 script32');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/ITEM_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child26)){this.child26();}}
};
// script33="child;26;UNMASK;_AE0120010form2/PeekerItemCd@*27"
expj.AE0120010.AE0120010form1.child26 = function () {
  console.log('AE0120010form1 script33');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child27)){this.child27();}}
};
// script34="child;27;UNMASK;_AE0120010form2/JOB_ODR_CD@*28"
expj.AE0120010.AE0120010form1.child27 = function () {
  console.log('AE0120010form1 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/JOB_ODR_CD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child28)){this.child28();}}
};
// script35="child;28;UNMASK;_AE0120010form2/PeekerJobOdrCd@*29"
expj.AE0120010.AE0120010form1.child28 = function () {
  console.log('AE0120010form1 script35');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child29)){this.child29();}}
};
// script36="child;29;UNMASK;_AE0120010form2/r2_FILTER@*30"
expj.AE0120010.AE0120010form1.child29 = function () {
  console.log('AE0120010form1 script36');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/r2_FILTER');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child30)){this.child30();}}
};
// script37="child;30;UNMASK;_AE0120010form2/c_NON_NO_ITEM_FLG"
expj.AE0120010.AE0120010form1.child30 = function () {
  console.log('AE0120010form1 script37');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/c_NON_NO_ITEM_FLG');
};
// script38="onLoad;1;CALL;child@31"
expj.AE0120010.AE0120010form1.onLoad1 = function () {
  console.log('AE0120010form1 script38');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child31)){this.child31();}
};
// script39="child;31;CHK;_AE0120010form2/h_lotCtrl[eq]true@*32,*33"
expj.AE0120010.AE0120010form1.child31 = function () {
  console.log('AE0120010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/h_lotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
} else {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script40="child;32;UNMASK;_AE0120010form2/LOT_NO,_AE0120010form2/PeekerLotNo@*36"
expj.AE0120010.AE0120010form1.child32 = function () {
  console.log('AE0120010form1 script40');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child36)){this.child36();}}
};
// script41="child;33;MASK;_AE0120010form2/LOT_NO,_AE0120010form2/PeekerLotNo@*35"
expj.AE0120010.AE0120010form1.child33 = function () {
  console.log('AE0120010form1 script41');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child35)){this.child35();}}
};
// script42="child;34;MASK;_AE0120010form2/LOT_NO,_AE0120010form2/PeekerLotNo"
expj.AE0120010.AE0120010form1.child34 = function () {
  console.log('AE0120010form1 script42');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerLotNo');
};
// script43="child;35;SET;_AE0120010form2/LOT_NO="
expj.AE0120010.AE0120010form1.child35 = function () {
  console.log('AE0120010form1 script43');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/LOT_NO', '');
};
// script44="child;36;CHK;_AE0120010form2/c_NON_NO_ITEM_FLG[eq]true@*33,*37"
expj.AE0120010.AE0120010form1.child36 = function () {
  console.log('AE0120010form1 script44');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '_AE0120010form2/c_NON_NO_ITEM_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
} else {
if(expj.common.checkNameSpace(this.child37)){this.child37();}
}
};
// script45="child;37;UNMASK;_AE0120010form2/LOT_NO,_AE0120010form2/PeekerLotNo@*38"
expj.AE0120010.AE0120010form1.child37 = function () {
  console.log('AE0120010form1 script45');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form1', '_AE0120010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child38)){this.child38();}}
};
// script46="child;38;CHK;?AE0120010form1/*[eq]NORMAL@*34,"
expj.AE0120010.AE0120010form1.child38 = function () {
  console.log('AE0120010form1 script46');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '?AE0120010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
}
};
expj.AE0120010.AE0120010form1.executeAllOnDecision = function () {
  console.log('execute AE0120010form1.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form1['onDecision' + i])) {
        expj.AE0120010.AE0120010form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form1.executeOnLoad = function () {
  expj.AE0120010.AE0120010form1.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form1.executePScriptOnLoad = function () {
  console.log('execute AE0120010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form1['onLoad' + i])) {
      expj.AE0120010.AE0120010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0120010-AE0120010form1" action="AE0120010Servlet" name="AE0120010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0120010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD_2",rb)%></span><!-- 購入返品番号 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form1-PUCH_ODR_CD">
expj.AE0120010.AE0120010form1.PUCH_ODR_CD = {};
expj.AE0120010.AE0120010form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0120010form1/PUCH_ODR_CD.onDecision');
  expj.AE0120010.AE0120010form1.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0120010.AE0120010form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0120010form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0120010-focus-move  required-value expj-AE0120010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form1-h_PUCH_ODR_CD" name="h_PUCH_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.geth_PUCH_ODR_CD()) %>">
<script class="expj-script-AE0120010-AE0120010form1-h_PUCH_ODR_CD">
expj.AE0120010.AE0120010form1.h_PUCH_ODR_CD = {};
expj.AE0120010.AE0120010form1.h_PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0120010form1/h_PUCH_ODR_CD.onDecision');
  expj.AE0120010.AE0120010form1.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form1.h_PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form1-h_PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form1', 'h_PUCH_ODR_CD', this);
  });
  expj.AE0120010.AE0120010form1.h_PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form1.h_PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0120010form1/h_PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form1-h_PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0120010-AE0120010form1-PeekerPuchOdrCd">
expj.AE0120010.AE0120010form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AE0120010form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0120010.AE0120010form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0120010', 'PeekerPuchOdrCd', 'SQLPARAM_1', '<%=aAE0120010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_17%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AE0120010.AE0120010form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0120010form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form1-PeekerPuchOdrCd" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0001",rb)%></span><!-- （自動採番） --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AE0120010-AE0120010button1">
expj.AE0120010.AE0120010button1 = {};
expj.AE0120010.AE0120010button1.executeAllOnDecision = function () {
  console.log('execute AE0120010button1.onDecision');
};
expj.AE0120010.AE0120010button1.executeOnLoad = function () {
  expj.AE0120010.AE0120010button1.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button1.executePScriptOnLoad = function () {
  console.log('execute AE0120010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0120010-AE0120010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0120010-AE0120010button1-Select">
expj.AE0120010.AE0120010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0120010form1/*@AE0120010Servlet"
expj.AE0120010.AE0120010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0120010', 'AE0120010button1', '_AE0120010form1/*', 'AE0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0120010', response);
expj.common.updateBusinessScreenTab('AE0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0120010.AE0120010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010button1.Select['onClick' + i])) {
        expj.AE0120010.AE0120010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010button1.Select.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010button1.Select.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010button1', 'Select', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010button1.Select.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0120010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0120010-AE0120010button1-Select" name="Select" class="AE0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:19px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0120010-AE0120010form2">
expj.AE0120010.AE0120010form2 = {};
expj.AE0120010.AE0120010form2.executeAllOnDecision = function () {
  console.log('execute AE0120010form2.onDecision');
};
expj.AE0120010.AE0120010form2.executeOnLoad = function () {
  expj.AE0120010.AE0120010form2.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0120010-AE0120010form2" action="AE0120010Servlet" name="AE0120010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-VEND_CD">
expj.AE0120010.AE0120010form2.VEND_CD = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0120010.AE0120010form2.VEND_CD.onDecision0 = function () {
  console.log('VEND_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_AE0120010form2/SelectUnitCostFlag=false"
expj.AE0120010.AE0120010form2.VEND_CD.child0 = function () {
  console.log('VEND_CD script2');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/SelectUnitCostFlag', 'false');
};
expj.AE0120010.AE0120010form2.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/VEND_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.VEND_CD['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.VEND_CD['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'VEND_CD', this);
  });
  expj.AE0120010.AE0120010form2.VEND_CD.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-VEND_CD" name="VEND_CD" class="AE0120010-focus-move  required-value expj-AE0120010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerVendCd">
expj.AE0120010.AE0120010form2.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AE0120010form2/VEND_CD@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerVendCd['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerVendCd.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerVendCd" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-VEND_ANAME">
expj.AE0120010.AE0120010form2.VEND_ANAME = {};
expj.AE0120010.AE0120010form2.VEND_ANAME.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/VEND_ANAME.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.VEND_ANAME.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-VEND_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'VEND_ANAME', this);
  });
  expj.AE0120010.AE0120010form2.VEND_ANAME.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.VEND_ANAME.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/VEND_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-VEND_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-VEND_ANAME" name="VEND_ANAME" class="AE0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-INSTALL_FLG" name="INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getINSTALL_FLG()) %>">
<script class="expj-script-AE0120010-AE0120010form2-INSTALL_FLG">
expj.AE0120010.AE0120010form2.INSTALL_FLG = {};
expj.AE0120010.AE0120010form2.INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/INSTALL_FLG.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'INSTALL_FLG', this);
  });
  expj.AE0120010.AE0120010form2.INSTALL_FLG.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-ITEM_CD">
expj.AE0120010.AE0120010form2.ITEM_CD = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0120010.AE0120010form2.ITEM_CD.onDecision0 = function () {
  console.log('ITEM_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_AE0120010form2/SelectUnitCostFlag=false"
expj.AE0120010.AE0120010form2.ITEM_CD.child0 = function () {
  console.log('ITEM_CD script2');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/SelectUnitCostFlag', 'false');
};
expj.AE0120010.AE0120010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/ITEM_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.ITEM_CD['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.ITEM_CD['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'ITEM_CD', this);
  });
  expj.AE0120010.AE0120010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-ITEM_CD" name="ITEM_CD" class="AE0120010-focus-move  required-value expj-AE0120010-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerItemCd">
expj.AE0120010.AE0120010form2.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AE0120010form2/ITEM_CD@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerItemCd['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerItemCd.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerItemCd" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-c_NON_NO_ITEM_FLG">
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG = {};
// script1="onLoad;0;CALL;onClick@0"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.onLoad0 = function () {
  console.log('c_NON_NO_ITEM_FLG script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_c_NON_NO_ITEM_FLG[eq]true@*0,*1"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.onClick0 = function () {
  console.log('c_NON_NO_ITEM_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_c_NON_NO_ITEM_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_ITEM_NAME,_PRODUCT_TYP,_STOCK_UNIT@*2"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.child0 = function () {
  console.log('c_NON_NO_ITEM_FLG script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_ITEM_NAME');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_PRODUCT_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_STOCK_UNIT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;1;MASK;_ITEM_NAME,_PRODUCT_TYP,_STOCK_UNIT@*3"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.child1 = function () {
  console.log('c_NON_NO_ITEM_FLG script4');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_ITEM_NAME');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_PRODUCT_TYP');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_STOCK_UNIT');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;2;MASK;_AE0120010form2/LOT_NO,_AE0120010form2/PeekerLotNo@*6"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.child2 = function () {
  console.log('c_NON_NO_ITEM_FLG script5');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_AE0120010form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_AE0120010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script6="child;3;UNMASK;_AE0120010form2/LOT_NO,_AE0120010form2/PeekerLotNo@*4"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.child3 = function () {
  console.log('c_NON_NO_ITEM_FLG script6');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_AE0120010form2/LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_AE0120010form2/PeekerLotNo');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script7="child;4;CHK;_AE0120010form2/h_lotCtrl[eq]false@*5"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.child4 = function () {
  console.log('c_NON_NO_ITEM_FLG script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/h_lotCtrl'), '[eq]', 'false')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;5;MASK;_AE0120010form2/LOT_NO,_AE0120010form2/PeekerLotNo"
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.child5 = function () {
  console.log('c_NON_NO_ITEM_FLG script8');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_AE0120010form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0120010', 'AE0120010form2', '_AE0120010form2/PeekerLotNo');
};
// script9="child;6;SET;_AE0120010form2/LOT_NO="
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.child6 = function () {
  console.log('c_NON_NO_ITEM_FLG script9');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/LOT_NO', '');
};
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG['onClick' + i])) {
        expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/c_NON_NO_ITEM_FLG.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-c_NON_NO_ITEM_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'c_NON_NO_ITEM_FLG', this, 'CheckBox');
    }
  });
  expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/c_NON_NO_ITEM_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-c_NON_NO_ITEM_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG['onLoad' + i])) {
      expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_NON_NO_ITEM_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAE0120010Struct.getc_NON_NO_ITEM_FLG())) || "1".equals(TypeConverter.convert(aAE0120010Struct.getc_NON_NO_ITEM_FLG())))?"checked=\"checked\"":"" %>  class="AE0120010-focus-move" id="expj-AE0120010-AE0120010form2-c_NON_NO_ITEM_FLG"><label for="expj-AE0120010-AE0120010form2-c_NON_NO_ITEM_FLG"><%=CoreTools.getRBString("Expj.NON_NO_ITEM_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-THIS_MONTH" name="THIS_MONTH" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTHIS_MONTH()) %>">
<script class="expj-script-AE0120010-AE0120010form2-THIS_MONTH">
expj.AE0120010.AE0120010form2.THIS_MONTH = {};
expj.AE0120010.AE0120010form2.THIS_MONTH.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/THIS_MONTH.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.THIS_MONTH.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-THIS_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'THIS_MONTH', this);
  });
  expj.AE0120010.AE0120010form2.THIS_MONTH.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.THIS_MONTH.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/THIS_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-THIS_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_NAME",rb)%></span><!-- 品目名 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-ITEM_NAME">
expj.AE0120010.AE0120010form2.ITEM_NAME = {};
expj.AE0120010.AE0120010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/ITEM_NAME.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'ITEM_NAME', this);
  });
  expj.AE0120010.AE0120010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-ITEM_NAME" name="ITEM_NAME" class="AE0120010-focus-move  required-value expj-AE0120010-required-D" style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getITEM_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td over-inner" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span></div><script class="expj-script-AE0120010-AE0120010form2-LOT_NO">
expj.AE0120010.AE0120010form2.LOT_NO = {};
expj.AE0120010.AE0120010form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/LOT_NO.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'LOT_NO', this);
  });
  expj.AE0120010.AE0120010form2.LOT_NO.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-LOT_NO" name="LOT_NO" class="AE0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getLOT_NO()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-h_lotCtrl" name="h_lotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.geth_lotCtrl()) %>">
<script class="expj-script-AE0120010-AE0120010form2-h_lotCtrl">
expj.AE0120010.AE0120010form2.h_lotCtrl = {};
expj.AE0120010.AE0120010form2.h_lotCtrl.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/h_lotCtrl.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.h_lotCtrl.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-h_lotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'h_lotCtrl', this);
  });
  expj.AE0120010.AE0120010form2.h_lotCtrl.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.h_lotCtrl.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/h_lotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-h_lotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0120010-AE0120010form2-PeekerLotNo">
expj.AE0120010.AE0120010form2.PeekerLotNo = {};
// script1="onClick;0;PEEKER;_AE0120010form2/LOT_NO:_AE0120010form2/ITEM_CD:_AE0120010form2/WH_CD@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerLotNo.onClick0 = function () {
  console.log('PeekerLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_10%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/LOT_NO:_AE0120010form2/ITEM_CD:_AE0120010form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerLotNo['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerLotNo['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerLotNo.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerLotNo.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerLotNo', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerLotNo.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerLotNo.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerLotNo" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-JOB_ODR_CD">
expj.AE0120010.AE0120010form2.JOB_ODR_CD = {};
expj.AE0120010.AE0120010form2.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/JOB_ODR_CD.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'JOB_ODR_CD', this);
  });
  expj.AE0120010.AE0120010form2.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerJobOdrCd">
expj.AE0120010.AE0120010form2.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AE0120010form2/JOB_ODR_CD@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0120010', 'PeekerJobOdrCd', 'SQLPARAM_1', '<%= aAE0120010Control.getsysPLANT_CD() %>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerJobOdrCd['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerJobOdrCd" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PRODUCT_TYP",rb)%></span><!-- 製品区分 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PRODUCT_TYP">
expj.AE0120010.AE0120010form2.PRODUCT_TYP = {};
expj.AE0120010.AE0120010form2.PRODUCT_TYP.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PRODUCT_TYP.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PRODUCT_TYP.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PRODUCT_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0120010', 'AE0120010form2', 'PRODUCT_TYP', this);
  });
  expj.AE0120010.AE0120010form2.PRODUCT_TYP.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PRODUCT_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PRODUCT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PRODUCT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AE0120010-AE0120010form2-PRODUCT_TYP" name='PRODUCT_TYP' class='AE0120010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAE0120010Control.getStruct().getList_PRODUCT_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0120010Control.getStruct().getList_PRODUCT_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0120010Control.getStruct().getList_PRODUCT_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0120010Struct.getPRODUCT_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AE0120010-AE0120010form2-MODIFY_COUNT">
expj.AE0120010.AE0120010form2.MODIFY_COUNT = {};
expj.AE0120010.AE0120010form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/MODIFY_COUNT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'MODIFY_COUNT', this);
  });
  expj.AE0120010.AE0120010form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_RTN_QTY",rb)%></span><!-- 返品数 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PUCH_RTN_QTY">
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY = {};
// script1="onDecision;0;SET;_PUCH_ODR_AMOUNT=[{_UNIT_COST}*{_PUCH_RTN_QTY}]"
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.onDecision0 = function () {
  console.log('PUCH_RTN_QTY script1');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_UNIT_COST') + '*' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_RTN_QTY')));
};
// script2="onDecision;1;SET;_DISC_AMOUNT=0"
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.onDecision1 = function () {
  console.log('PUCH_RTN_QTY script2');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_DISC_AMOUNT', '0');
};
// script3="onDecision;2;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.onDecision2 = function () {
  console.log('PUCH_RTN_QTY script3');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_DISC_AMOUNT')));
};
// script4="onDecision;3;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.onDecision3 = function () {
  console.log('PUCH_RTN_QTY script4');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_3')));
};
// script5="onDecision;4;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.onDecision4 = function () {
  console.log('PUCH_RTN_QTY script5');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_EXCH_RATE')));
};
// script7="onDecision;5;CHK;?THIS[eq]DIFFER@*0"
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.onDecision5 = function () {
  console.log('PUCH_RTN_QTY script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script8="child;0;SET;_AE0120010form2/SelectUnitCostFlag=false"
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.child0 = function () {
  console.log('PUCH_RTN_QTY script8');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/SelectUnitCostFlag', 'false');
};
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PUCH_RTN_QTY.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PUCH_RTN_QTY['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.PUCH_RTN_QTY['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PUCH_RTN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'PUCH_RTN_QTY', this);
  });
  expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PUCH_RTN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PUCH_RTN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-PUCH_RTN_QTY" name="PUCH_RTN_QTY" class="AE0120010-focus-move  required-value expj-AE0120010-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPUCH_RTN_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_UNIT_1",rb)%></span><!-- 単位 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-STOCK_UNIT">
expj.AE0120010.AE0120010form2.STOCK_UNIT = {};
expj.AE0120010.AE0120010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/STOCK_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'STOCK_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-STOCK_UNIT" name="STOCK_UNIT" class="AE0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getSTOCK_UNIT()) %>" maxlength="12" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-RTN_DEL_FLG" name="RTN_DEL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getRTN_DEL_FLG()) %>">
<script class="expj-script-AE0120010-AE0120010form2-RTN_DEL_FLG">
expj.AE0120010.AE0120010form2.RTN_DEL_FLG = {};
expj.AE0120010.AE0120010form2.RTN_DEL_FLG.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/RTN_DEL_FLG.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.RTN_DEL_FLG.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-RTN_DEL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'RTN_DEL_FLG', this);
  });
  expj.AE0120010.AE0120010form2.RTN_DEL_FLG.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.RTN_DEL_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/RTN_DEL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-RTN_DEL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_RTN_DATE",rb)%></span><!-- 返品日 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PUCH_RTN_DATE">
expj.AE0120010.AE0120010form2.PUCH_RTN_DATE = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AE0120010.AE0120010form2.PUCH_RTN_DATE.onDecision0 = function () {
  console.log('PUCH_RTN_DATE script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_AE0120010form2/SelectUnitCostFlag=false"
expj.AE0120010.AE0120010form2.PUCH_RTN_DATE.child0 = function () {
  console.log('PUCH_RTN_DATE script2');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/SelectUnitCostFlag', 'false');
};
expj.AE0120010.AE0120010form2.PUCH_RTN_DATE.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PUCH_RTN_DATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PUCH_RTN_DATE['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.PUCH_RTN_DATE['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PUCH_RTN_DATE.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PUCH_RTN_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'PUCH_RTN_DATE', this);
  });
  expj.AE0120010.AE0120010form2.PUCH_RTN_DATE.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PUCH_RTN_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PUCH_RTN_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PUCH_RTN_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-PUCH_RTN_DATE" name="PUCH_RTN_DATE" class="AE0120010-focus-move  required-value expj-AE0120010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPUCH_RTN_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-CalendarPuchRtnDate">
expj.AE0120010.AE0120010form2.CalendarPuchRtnDate = {};
// script1="onClick;0;CALENDAR;_AE0120010form2/PUCH_RTN_DATE"
expj.AE0120010.AE0120010form2.CalendarPuchRtnDate.onClick0 = function () {
  console.log('CalendarPuchRtnDate script1');
expj.common.pscript.executeCalendar('AE0120010','AE0120010form2','_AE0120010form2/PUCH_RTN_DATE');
};
expj.AE0120010.AE0120010form2.CalendarPuchRtnDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.CalendarPuchRtnDate['onClick' + i])) {
        expj.AE0120010.AE0120010form2.CalendarPuchRtnDate['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.CalendarPuchRtnDate.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.CalendarPuchRtnDate.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-CalendarPuchRtnDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'CalendarPuchRtnDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0120010','AE0120010form2','_AE0120010form2/PUCH_RTN_DATE');
  expj.AE0120010.AE0120010form2.CalendarPuchRtnDate.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.CalendarPuchRtnDate.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/CalendarPuchRtnDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-CalendarPuchRtnDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-CalendarPuchRtnDate" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-h_PUCH_RTN_DATE" name="h_PUCH_RTN_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.geth_PUCH_RTN_DATE()) %>">
<script class="expj-script-AE0120010-AE0120010form2-h_PUCH_RTN_DATE">
expj.AE0120010.AE0120010form2.h_PUCH_RTN_DATE = {};
expj.AE0120010.AE0120010form2.h_PUCH_RTN_DATE.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/h_PUCH_RTN_DATE.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.h_PUCH_RTN_DATE.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-h_PUCH_RTN_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'h_PUCH_RTN_DATE', this);
  });
  expj.AE0120010.AE0120010form2.h_PUCH_RTN_DATE.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.h_PUCH_RTN_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/h_PUCH_RTN_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-h_PUCH_RTN_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD_11",rb)%></span><!-- 返品元保管区コード --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-WH_CD">
expj.AE0120010.AE0120010form2.WH_CD = {};
expj.AE0120010.AE0120010form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/WH_CD.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.WH_CD.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'WH_CD', this);
  });
  expj.AE0120010.AE0120010form2.WH_CD.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-WH_CD" name="WH_CD" class="AE0120010-focus-move  required-value expj-AE0120010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerWhCd">
expj.AE0120010.AE0120010form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AE0120010form2/WH_CD@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0120010', 'PeekerWhCd', 'SQLPARAM_1', '<%= aAE0120010Control.getsysPLANT_CD() %>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_11%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerWhCd['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerWhCd" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-WH_NAME">
expj.AE0120010.AE0120010form2.WH_NAME = {};
expj.AE0120010.AE0120010form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/WH_NAME.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'WH_NAME', this);
  });
  expj.AE0120010.AE0120010form2.WH_NAME.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-WH_NAME" name="WH_NAME" class="AE0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_RTN_COMMENT",rb)%></span><!-- 返品理由コード --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PUCH_RTN_COMMENT">
expj.AE0120010.AE0120010form2.PUCH_RTN_COMMENT = {};
expj.AE0120010.AE0120010form2.PUCH_RTN_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PUCH_RTN_COMMENT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PUCH_RTN_COMMENT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PUCH_RTN_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'PUCH_RTN_COMMENT', this);
  });
  expj.AE0120010.AE0120010form2.PUCH_RTN_COMMENT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PUCH_RTN_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PUCH_RTN_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PUCH_RTN_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-PUCH_RTN_COMMENT" name="PUCH_RTN_COMMENT" class="AE0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPUCH_RTN_COMMENT()) %>" maxlength="64" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerPuchRtnComment">
expj.AE0120010.AE0120010form2.PeekerPuchRtnComment = {};
// script1="onClick;0;PEEKER;_AE0120010form2/PUCH_RTN_COMMENT@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerPuchRtnComment.onClick0 = function () {
  console.log('PeekerPuchRtnComment script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerPuchRtnComment%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_RTN_COMMENT') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_RTN_COMMENT_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/PUCH_RTN_COMMENT%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerPuchRtnComment.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerPuchRtnComment['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerPuchRtnComment['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerPuchRtnComment.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerPuchRtnComment.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerPuchRtnComment').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerPuchRtnComment', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerPuchRtnComment.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerPuchRtnComment.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerPuchRtnComment.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerPuchRtnComment');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerPuchRtnComment" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO",rb)%></span><!-- メーカロット番号 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-VEND_LOT_NO">
expj.AE0120010.AE0120010form2.VEND_LOT_NO = {};
expj.AE0120010.AE0120010form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/VEND_LOT_NO.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'VEND_LOT_NO', this);
  });
  expj.AE0120010.AE0120010form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AE0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_PERSON_2",rb)%></span><!-- 担当者コード --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PUCH_ODR_PERSON">
expj.AE0120010.AE0120010form2.PUCH_ODR_PERSON = {};
expj.AE0120010.AE0120010form2.PUCH_ODR_PERSON.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PUCH_ODR_PERSON.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PUCH_ODR_PERSON.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PUCH_ODR_PERSON').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'PUCH_ODR_PERSON', this);
  });
  expj.AE0120010.AE0120010form2.PUCH_ODR_PERSON.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PUCH_ODR_PERSON.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PUCH_ODR_PERSON.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PUCH_ODR_PERSON');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-PUCH_ODR_PERSON" name="PUCH_ODR_PERSON" class="AE0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPUCH_ODR_PERSON()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerPuchOdrPerson">
expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson = {};
// script1="onClick;0;PEEKER;_AE0120010form2/PUCH_ODR_PERSON@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson.onClick0 = function () {
  console.log('PeekerPuchOdrPerson script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerPuchOdrPerson%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_PERSON') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/PUCH_ODR_PERSON%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerPuchOdrPerson').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerPuchOdrPerson', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerPuchOdrPerson.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerPuchOdrPerson');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerPuchOdrPerson" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-USER_NAME">
expj.AE0120010.AE0120010form2.USER_NAME = {};
expj.AE0120010.AE0120010form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/USER_NAME.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.USER_NAME.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'USER_NAME', this);
  });
  expj.AE0120010.AE0120010form2.USER_NAME.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-USER_NAME" name="USER_NAME" class="AE0120010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-SelectUnitCostFlag" name="SelectUnitCostFlag" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getSelectUnitCostFlag()) %>">
<script class="expj-script-AE0120010-AE0120010form2-SelectUnitCostFlag">
expj.AE0120010.AE0120010form2.SelectUnitCostFlag = {};
expj.AE0120010.AE0120010form2.SelectUnitCostFlag.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/SelectUnitCostFlag.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.SelectUnitCostFlag.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-SelectUnitCostFlag').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'SelectUnitCostFlag', this);
  });
  expj.AE0120010.AE0120010form2.SelectUnitCostFlag.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.SelectUnitCostFlag.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/SelectUnitCostFlag.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-SelectUnitCostFlag');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)%></span><!-- 単価区分 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-UNIT_COST_TYP">
expj.AE0120010.AE0120010form2.UNIT_COST_TYP = {};
expj.AE0120010.AE0120010form2.UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/UNIT_COST_TYP.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-UNIT_COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AE0120010', 'AE0120010form2', 'UNIT_COST_TYP', this);
  });
  expj.AE0120010.AE0120010form2.UNIT_COST_TYP.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AE0120010-AE0120010form2-UNIT_COST_TYP" name='UNIT_COST_TYP' class='AE0120010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAE0120010Control.getStruct().getList_UNIT_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAE0120010Control.getStruct().getList_UNIT_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAE0120010Control.getStruct().getList_UNIT_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAE0120010Struct.getUNIT_COST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-SelectUnitCost">
expj.AE0120010.AE0120010form2.SelectUnitCost = {};
// script1="onClick;0;CHK;_AE0120010form2/r1_FILTER[eq]true[and]_AE0120010form2/VEND_CD[eq]@#AE00019"
expj.AE0120010.AE0120010form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/r1_FILTER'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/VEND_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010form2', 'AE00019');
}
};
// script2="onClick;1;CHK;_AE0120010form2/r1_FILTER[eq]true[and]_AE0120010form2/c_NON_NO_ITEM_FLG[neq]true[and]_AE0120010form2/ITEM_CD[eq]@#AE00009"
expj.AE0120010.AE0120010form2.SelectUnitCost.onClick1 = function () {
  console.log('SelectUnitCost script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/r1_FILTER'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/c_NON_NO_ITEM_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/ITEM_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010form2', 'AE00009');
}
};
// script3="onClick;2;CHK;_AE0120010form2/r2_FILTER[eq]true[and]_AE0120010form2/PUCH_ODR_CD_2[eq]@#AE00099"
expj.AE0120010.AE0120010form2.SelectUnitCost.onClick2 = function () {
  console.log('SelectUnitCost script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/r2_FILTER'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/PUCH_ODR_CD_2'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010form2', 'AE00099');
}
};
// script4="onClick;3;CHK;_AE0120010form2/PUCH_RTN_QTY[numeq]0@#AE00107"
expj.AE0120010.AE0120010form2.SelectUnitCost.onClick3 = function () {
  console.log('SelectUnitCost script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/PUCH_RTN_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010form2', 'AE00107');
}
};
// script5="onClick;4;CHK;_AE0120010form2/PUCH_RTN_DATE[eq]@#AE00093"
expj.AE0120010.AE0120010form2.SelectUnitCost.onClick4 = function () {
  console.log('SelectUnitCost script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AE0120010form2/PUCH_RTN_DATE'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010form2', 'AE00093');
}
};
// script6="onClick;5;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0120010form1/*,_AE0120010form2/*@AE0120010Servlet"
expj.AE0120010.AE0120010form2.SelectUnitCost.onClick5 = function () {
  console.log('SelectUnitCost script6');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0120010', 'AE0120010form2', '_AE0120010form1/*,_AE0120010form2/*', 'AE0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0120010', response);
expj.common.updateBusinessScreenTab('AE0120010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0120010.AE0120010form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.SelectUnitCost['onClick' + i])) {
        expj.AE0120010.AE0120010form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.SelectUnitCost.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-SelectUnitCost" name="SelectUnitCost" class="AE0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-UNIT_COST">
expj.AE0120010.AE0120010form2.UNIT_COST = {};
// script1="onDecision;0;SET;_PUCH_ODR_AMOUNT=[{_UNIT_COST}*{_PUCH_RTN_QTY}]"
expj.AE0120010.AE0120010form2.UNIT_COST.onDecision0 = function () {
  console.log('UNIT_COST script1');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_UNIT_COST') + '*' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_RTN_QTY')));
};
// script2="onDecision;1;SET;_DISC_AMOUNT=0"
expj.AE0120010.AE0120010form2.UNIT_COST.onDecision1 = function () {
  console.log('UNIT_COST script2');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_DISC_AMOUNT', '0');
};
// script3="onDecision;2;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0120010.AE0120010form2.UNIT_COST.onDecision2 = function () {
  console.log('UNIT_COST script3');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_DISC_AMOUNT')));
};
// script4="onDecision;3;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0120010.AE0120010form2.UNIT_COST.onDecision3 = function () {
  console.log('UNIT_COST script4');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_3')));
};
// script5="onDecision;4;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0120010.AE0120010form2.UNIT_COST.onDecision4 = function () {
  console.log('UNIT_COST script5');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_EXCH_RATE')));
};
expj.AE0120010.AE0120010form2.UNIT_COST.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/UNIT_COST.onDecision');
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.UNIT_COST['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.UNIT_COST['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.UNIT_COST.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'UNIT_COST', this);
  });
  expj.AE0120010.AE0120010form2.UNIT_COST.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-UNIT_COST" name="UNIT_COST" class="AE0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getUNIT_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-VEND_CUR_UNIT" name="VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-r1_FILTER">
expj.AE0120010.AE0120010form2.r1_FILTER = {};
expj.AE0120010.AE0120010form2.r1_FILTER.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/r1_FILTER.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.r1_FILTER.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-r1_FILTER').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'r1_FILTER', this, 'RadioButton');
    }
  });
  expj.AE0120010.AE0120010form2.r1_FILTER.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.r1_FILTER.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/r1_FILTER.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-r1_FILTER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="r_FILTER" data-name="r1_FILTER" value="true" <%= ("true".equals(TypeConverter.convert(aAE0120010Struct.getr1_FILTER())))?"checked=\"checked\"":"" %> class="" id="expj-AE0120010-AE0120010form2-r1_FILTER" ><label for="expj-AE0120010-AE0120010form2-r1_FILTER"><%=CoreTools.getRBString("Expj.Cmt0743",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROCESSING_COST",rb)%></span><!-- 加工費 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PROCESSING_COST">
expj.AE0120010.AE0120010form2.PROCESSING_COST = {};
expj.AE0120010.AE0120010form2.PROCESSING_COST.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PROCESSING_COST.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PROCESSING_COST.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PROCESSING_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'PROCESSING_COST', this);
  });
  expj.AE0120010.AE0120010form2.PROCESSING_COST.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PROCESSING_COST.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PROCESSING_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PROCESSING_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-PROCESSING_COST" name="PROCESSING_COST" class="AE0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPROCESSING_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d1_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d1_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d1_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d1_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d1_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d1_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd1_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d1_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d1_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d1_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d1_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d1_VEND_CUR_UNIT" name="d1_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-r2_FILTER">
expj.AE0120010.AE0120010form2.r2_FILTER = {};
expj.AE0120010.AE0120010form2.r2_FILTER.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/r2_FILTER.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.r2_FILTER.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-r2_FILTER').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'r2_FILTER', this, 'RadioButton');
    }
  });
  expj.AE0120010.AE0120010form2.r2_FILTER.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.r2_FILTER.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/r2_FILTER.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-r2_FILTER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="radio" name="r_FILTER" data-name="r2_FILTER" value="true" <%= ("true".equals(TypeConverter.convert(aAE0120010Struct.getr2_FILTER())))?"checked=\"checked\"":"" %> class="" id="expj-AE0120010-AE0120010form2-r2_FILTER" ><label for="expj-AE0120010-AE0120010form2-r2_FILTER"><%=CoreTools.getRBString("Expj.Cmt0742",rb)%></label></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PUCH_ODR_CD_2">
expj.AE0120010.AE0120010form2.PUCH_ODR_CD_2 = {};
expj.AE0120010.AE0120010form2.PUCH_ODR_CD_2.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PUCH_ODR_CD_2.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PUCH_ODR_CD_2.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PUCH_ODR_CD_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'PUCH_ODR_CD_2', this);
  });
  expj.AE0120010.AE0120010form2.PUCH_ODR_CD_2.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PUCH_ODR_CD_2.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PUCH_ODR_CD_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PUCH_ODR_CD_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-PUCH_ODR_CD_2" name="PUCH_ODR_CD_2" class="AE0120010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPUCH_ODR_CD_2()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerPuchOdrCd2">
expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2 = {};
// script1="onClick;0;PEEKER;_AE0120010form2/PUCH_ODR_CD_2@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2.onClick0 = function () {
  console.log('PeekerPuchOdrCd2 script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerPuchOdrCd2%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0120010', 'PeekerPuchOdrCd2', 'SQLPARAM_1', '<%=aAE0120010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_CD_2') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_14%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/PUCH_ODR_CD_2%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerPuchOdrCd2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerPuchOdrCd2', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerPuchOdrCd2.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerPuchOdrCd2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerPuchOdrCd2" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MATERIAL_COST",rb)%></span><!-- 材料費 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-MATERIAL_COST">
expj.AE0120010.AE0120010form2.MATERIAL_COST = {};
expj.AE0120010.AE0120010form2.MATERIAL_COST.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/MATERIAL_COST.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.MATERIAL_COST.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-MATERIAL_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'MATERIAL_COST', this);
  });
  expj.AE0120010.AE0120010form2.MATERIAL_COST.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.MATERIAL_COST.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/MATERIAL_COST.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-MATERIAL_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-MATERIAL_COST" name="MATERIAL_COST" class="AE0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getMATERIAL_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d2_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d2_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d2_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d2_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d2_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d2_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd2_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d2_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d2_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d2_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d2_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d2_VEND_CUR_UNIT" name="d2_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0707",rb)%></span><!-- 消費税 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-TAX_AMOUNT_1">
expj.AE0120010.AE0120010form2.TAX_AMOUNT_1 = {};
expj.AE0120010.AE0120010form2.TAX_AMOUNT_1.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/TAX_AMOUNT_1.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.TAX_AMOUNT_1.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-TAX_AMOUNT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'TAX_AMOUNT_1', this);
  });
  expj.AE0120010.AE0120010form2.TAX_AMOUNT_1.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.TAX_AMOUNT_1.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/TAX_AMOUNT_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-TAX_AMOUNT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-TAX_AMOUNT_1" name="TAX_AMOUNT_1" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getTAX_ROUND_TYP(), aAE0120010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTAX_AMOUNT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d7_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d7_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d7_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d7_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d7_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d7_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd7_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d7_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d7_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d7_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d7_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d7_VEND_CUR_UNIT" name="d7_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-TAX_RATE_1" name="TAX_RATE_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTAX_RATE_1()) %>">
<script class="expj-script-AE0120010-AE0120010form2-TAX_RATE_1">
expj.AE0120010.AE0120010form2.TAX_RATE_1 = {};
expj.AE0120010.AE0120010form2.TAX_RATE_1.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/TAX_RATE_1.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.TAX_RATE_1.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-TAX_RATE_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'TAX_RATE_1', this);
  });
  expj.AE0120010.AE0120010form2.TAX_RATE_1.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.TAX_RATE_1.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/TAX_RATE_1.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-TAX_RATE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)%></span><!-- その他経費 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-OTHER_OVERHEADS">
expj.AE0120010.AE0120010form2.OTHER_OVERHEADS = {};
expj.AE0120010.AE0120010form2.OTHER_OVERHEADS.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/OTHER_OVERHEADS.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.OTHER_OVERHEADS.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-OTHER_OVERHEADS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'OTHER_OVERHEADS', this);
  });
  expj.AE0120010.AE0120010form2.OTHER_OVERHEADS.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.OTHER_OVERHEADS.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/OTHER_OVERHEADS.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-OTHER_OVERHEADS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-OTHER_OVERHEADS" name="OTHER_OVERHEADS" class="AE0120010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getOTHER_OVERHEADS()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d3_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d3_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d3_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d3_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d3_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d3_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd3_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d3_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d3_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d3_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d3_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d3_VEND_CUR_UNIT" name="d3_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0708",rb)%></span><!-- 取引税 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-TAX_AMOUNT_2">
expj.AE0120010.AE0120010form2.TAX_AMOUNT_2 = {};
expj.AE0120010.AE0120010form2.TAX_AMOUNT_2.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/TAX_AMOUNT_2.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.TAX_AMOUNT_2.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-TAX_AMOUNT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'TAX_AMOUNT_2', this);
  });
  expj.AE0120010.AE0120010form2.TAX_AMOUNT_2.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.TAX_AMOUNT_2.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/TAX_AMOUNT_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-TAX_AMOUNT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-TAX_AMOUNT_2" name="TAX_AMOUNT_2" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getTAX_ROUND_TYP(), aAE0120010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTAX_AMOUNT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d8_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d8_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d8_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d8_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d8_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d8_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd8_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d8_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d8_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d8_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d8_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d8_VEND_CUR_UNIT" name="d8_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-TAX_RATE_2" name="TAX_RATE_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTAX_RATE_2()) %>">
<script class="expj-script-AE0120010-AE0120010form2-TAX_RATE_2">
expj.AE0120010.AE0120010form2.TAX_RATE_2 = {};
expj.AE0120010.AE0120010form2.TAX_RATE_2.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/TAX_RATE_2.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.TAX_RATE_2.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-TAX_RATE_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'TAX_RATE_2', this);
  });
  expj.AE0120010.AE0120010form2.TAX_RATE_2.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.TAX_RATE_2.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/TAX_RATE_2.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-TAX_RATE_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_3",rb)%></span><!-- 返品金額 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PUCH_ODR_AMOUNT">
expj.AE0120010.AE0120010form2.PUCH_ODR_AMOUNT = {};
expj.AE0120010.AE0120010form2.PUCH_ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/PUCH_ODR_AMOUNT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.PUCH_ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PUCH_ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'PUCH_ODR_AMOUNT', this);
  });
  expj.AE0120010.AE0120010form2.PUCH_ODR_AMOUNT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PUCH_ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PUCH_ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PUCH_ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-PUCH_ODR_AMOUNT" name="PUCH_ODR_AMOUNT" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getROUND_TYP(), aAE0120010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getPUCH_ODR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d4_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d4_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d4_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d4_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d4_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d4_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd4_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d4_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d4_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d4_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d4_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d4_VEND_CUR_UNIT" name="d4_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0709",rb)%></span><!-- その他税 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-TAX_AMOUNT_3">
expj.AE0120010.AE0120010form2.TAX_AMOUNT_3 = {};
expj.AE0120010.AE0120010form2.TAX_AMOUNT_3.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/TAX_AMOUNT_3.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.TAX_AMOUNT_3.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-TAX_AMOUNT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'TAX_AMOUNT_3', this);
  });
  expj.AE0120010.AE0120010form2.TAX_AMOUNT_3.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.TAX_AMOUNT_3.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/TAX_AMOUNT_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-TAX_AMOUNT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-TAX_AMOUNT_3" name="TAX_AMOUNT_3" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getTAX_ROUND_TYP(), aAE0120010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTAX_AMOUNT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d9_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d9_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d9_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d9_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d9_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d9_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd9_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d9_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d9_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d9_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d9_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d9_VEND_CUR_UNIT" name="d9_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0120010-AE0120010form2-TAX_RATE_3" name="TAX_RATE_3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTAX_RATE_3()) %>">
<script class="expj-script-AE0120010-AE0120010form2-TAX_RATE_3">
expj.AE0120010.AE0120010form2.TAX_RATE_3 = {};
expj.AE0120010.AE0120010form2.TAX_RATE_3.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/TAX_RATE_3.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.TAX_RATE_3.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-TAX_RATE_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'TAX_RATE_3', this);
  });
  expj.AE0120010.AE0120010form2.TAX_RATE_3.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.TAX_RATE_3.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/TAX_RATE_3.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-TAX_RATE_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DISC_AMOUNT",rb)%></span><!-- 値引金額 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-DISC_AMOUNT">
expj.AE0120010.AE0120010form2.DISC_AMOUNT = {};
// script1="onDecision;0;SET;_NET_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_DISC_AMOUNT}]"
expj.AE0120010.AE0120010form2.DISC_AMOUNT.onDecision0 = function () {
  console.log('DISC_AMOUNT script1');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_DISC_AMOUNT')));
};
// script2="onDecision;1;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0120010.AE0120010form2.DISC_AMOUNT.onDecision1 = function () {
  console.log('DISC_AMOUNT script2');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_3')));
};
// script3="onDecision;2;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0120010.AE0120010form2.DISC_AMOUNT.onDecision2 = function () {
  console.log('DISC_AMOUNT script3');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_EXCH_RATE')));
};
expj.AE0120010.AE0120010form2.DISC_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/DISC_AMOUNT.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.DISC_AMOUNT['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.DISC_AMOUNT['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.DISC_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-DISC_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'DISC_AMOUNT', this);
  });
  expj.AE0120010.AE0120010form2.DISC_AMOUNT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.DISC_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/DISC_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-DISC_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-DISC_AMOUNT" name="DISC_AMOUNT" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getROUND_TYP(), aAE0120010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getDISC_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d5_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d5_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d5_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d5_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d5_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d5_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd5_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d5_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d5_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d5_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d5_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d5_VEND_CUR_UNIT" name="d5_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX",rb)%></span><!-- 税込金額 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-AMOUNT_INCLUDE_TAX">
expj.AE0120010.AE0120010form2.AMOUNT_INCLUDE_TAX = {};
expj.AE0120010.AE0120010form2.AMOUNT_INCLUDE_TAX.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/AMOUNT_INCLUDE_TAX.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.AMOUNT_INCLUDE_TAX.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-AMOUNT_INCLUDE_TAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'AMOUNT_INCLUDE_TAX', this);
  });
  expj.AE0120010.AE0120010form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/AMOUNT_INCLUDE_TAX.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-AMOUNT_INCLUDE_TAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-AMOUNT_INCLUDE_TAX" name="AMOUNT_INCLUDE_TAX" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getROUND_TYP(), aAE0120010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getAMOUNT_INCLUDE_TAX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d10_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d10_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d10_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d10_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d10_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d10_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd10_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d10_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d10_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d10_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d10_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d10_VEND_CUR_UNIT" name="d10_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NET_AMOUNT",rb)%></span><!-- 本体金額 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-NET_AMOUNT">
expj.AE0120010.AE0120010form2.NET_AMOUNT = {};
// script1="onDecision;0;SET;_DISC_AMOUNT=[{_PUCH_ODR_AMOUNT}-{_NET_AMOUNT}]"
expj.AE0120010.AE0120010form2.NET_AMOUNT.onDecision0 = function () {
  console.log('NET_AMOUNT script1');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_DISC_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_PUCH_ODR_AMOUNT') + '-' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT')));
};
// script2="onDecision;1;SET;_AMOUNT_INCLUDE_TAX=[{_NET_AMOUNT}+{_TAX_AMOUNT_1}+{_TAX_AMOUNT_2}+{_TAX_AMOUNT_3}]"
expj.AE0120010.AE0120010form2.NET_AMOUNT.onDecision1 = function () {
  console.log('NET_AMOUNT script2');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_NET_AMOUNT') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_1') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_2') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_AMOUNT_3')));
};
// script3="onDecision;2;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0120010.AE0120010form2.NET_AMOUNT.onDecision2 = function () {
  console.log('NET_AMOUNT script3');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_EXCH_RATE')));
};
expj.AE0120010.AE0120010form2.NET_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/NET_AMOUNT.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.NET_AMOUNT['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.NET_AMOUNT['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.NET_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-NET_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'NET_AMOUNT', this);
  });
  expj.AE0120010.AE0120010form2.NET_AMOUNT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.NET_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/NET_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-NET_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-NET_AMOUNT" name="NET_AMOUNT" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getROUND_TYP(), aAE0120010Struct.getVEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getNET_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d6_VEND_CUR_UNIT">
expj.AE0120010.AE0120010form2.d6_VEND_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d6_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d6_VEND_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d6_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d6_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd6_VEND_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d6_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d6_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d6_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d6_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d6_VEND_CUR_UNIT" name="d6_VEND_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HOME_CUR_AMOUNT",rb)%></span><!-- 邦貨金額 --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-HOME_CUR_AMOUNT">
expj.AE0120010.AE0120010form2.HOME_CUR_AMOUNT = {};
expj.AE0120010.AE0120010form2.HOME_CUR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/HOME_CUR_AMOUNT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.HOME_CUR_AMOUNT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-HOME_CUR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'HOME_CUR_AMOUNT', this);
  });
  expj.AE0120010.AE0120010form2.HOME_CUR_AMOUNT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.HOME_CUR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/HOME_CUR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-HOME_CUR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-HOME_CUR_AMOUNT" name="HOME_CUR_AMOUNT" class="AE0120010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAE0120010Struct.getROUND_TYP(), aAE0120010Struct.getHOME_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getHOME_CUR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-HOME_CUR_UNIT">
expj.AE0120010.AE0120010form2.HOME_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/HOME_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'HOME_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-HOME_CUR_UNIT" name="HOME_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.TAX_CD_1",rb)%></span><!-- 消費税コード --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-TAX_CD">
expj.AE0120010.AE0120010form2.TAX_CD = {};
expj.AE0120010.AE0120010form2.TAX_CD.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/TAX_CD.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.TAX_CD.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-TAX_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'TAX_CD', this);
  });
  expj.AE0120010.AE0120010form2.TAX_CD.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.TAX_CD.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/TAX_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-TAX_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-TAX_CD" name="TAX_CD" class="AE0120010-focus-move  required-value expj-AE0120010-required-B" style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getTAX_CD()) %>" maxlength="3" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-PeekerTaxCd">
expj.AE0120010.AE0120010form2.PeekerTaxCd = {};
// script1="onClick;0;PEEKER;_AE0120010form2/TAX_CD@<%=contextNo%>"
expj.AE0120010.AE0120010form2.PeekerTaxCd.onClick0 = function () {
  console.log('PeekerTaxCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0120010';
var parameterValues = 'PeekerTaxCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_TAX_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%TAX_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0120010form2/TAX_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0120010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0120010.AE0120010form2.PeekerTaxCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.PeekerTaxCd['onClick' + i])) {
        expj.AE0120010.AE0120010form2.PeekerTaxCd['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010form2.PeekerTaxCd.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010form2.PeekerTaxCd.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-PeekerTaxCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010form2', 'PeekerTaxCd', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010form2.PeekerTaxCd.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.PeekerTaxCd.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/PeekerTaxCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-PeekerTaxCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0120010-AE0120010form2-PeekerTaxCd" class="AE0120010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EXCH_RATE",rb)%></span><!-- 為替レート --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-EXCH_RATE">
expj.AE0120010.AE0120010form2.EXCH_RATE = {};
// script1="onDecision;0;SET;_HOME_CUR_AMOUNT=[{_AMOUNT_INCLUDE_TAX}*{_EXCH_RATE}]"
expj.AE0120010.AE0120010form2.EXCH_RATE.onDecision0 = function () {
  console.log('EXCH_RATE script1');
expj.common.pscript.setReferenceComponentValue('AE0120010', 'AE0120010form2', '_HOME_CUR_AMOUNT', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_AMOUNT_INCLUDE_TAX') + '*' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010form2', '_EXCH_RATE')));
};
expj.AE0120010.AE0120010form2.EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/EXCH_RATE.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010form2.EXCH_RATE['onDecision' + i])) {
        expj.AE0120010.AE0120010form2.EXCH_RATE['onDecision' + i]();
      }
    }
  }
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.EXCH_RATE.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'EXCH_RATE', this);
  });
  expj.AE0120010.AE0120010form2.EXCH_RATE.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-EXCH_RATE" name="EXCH_RATE" class="AE0120010-focus-move  required-value expj-AE0120010-required-B" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;6" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getEXCH_RATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010form2-d_HOME_CUR_UNIT">
expj.AE0120010.AE0120010form2.d_HOME_CUR_UNIT = {};
expj.AE0120010.AE0120010form2.d_HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AE0120010form2/d_HOME_CUR_UNIT.onDecision');
  expj.AE0120010.AE0120010form2.executeAllOnDecision();
  expj.AE0120010.executeAllOnDecision();
};
expj.AE0120010.AE0120010form2.d_HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010form2-d_HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0120010', 'AE0120010form2', 'd_HOME_CUR_UNIT', this);
  });
  expj.AE0120010.AE0120010form2.d_HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AE0120010.AE0120010form2.d_HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AE0120010form2/d_HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010form2-d_HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0120010-AE0120010form2-d_HOME_CUR_UNIT" name="d_HOME_CUR_UNIT" class="AE0120010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0120010Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AE0120010-AE0120010button2">
expj.AE0120010.AE0120010button2 = {};
expj.AE0120010.AE0120010button2.executeAllOnDecision = function () {
  console.log('execute AE0120010button2.onDecision');
};
expj.AE0120010.AE0120010button2.executeOnLoad = function () {
  expj.AE0120010.AE0120010button2.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button2.executePScriptOnLoad = function () {
  console.log('execute AE0120010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0120010-AE0120010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0120010-AE0120010button2-Insert">
expj.AE0120010.AE0120010button2.Insert = {};
// script1="onClick;0;CHK;_AE0120010form2/PUCH_RTN_QTY[lte]0@#AE00107"
expj.AE0120010.AE0120010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/PUCH_RTN_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010button2', 'AE00107');
}
};
// script2="onClick;1;CHK;_AE0120010form2/EXCH_RATE[lte]0@#AE00059"
expj.AE0120010.AE0120010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/EXCH_RATE')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010button2', 'AE00059');
}
};
// script3="onClick;2;CHK;_AE0120010form2/SelectUnitCostFlag[eq]false@$AE00062"
expj.AE0120010.AE0120010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/SelectUnitCostFlag'), '[eq]', 'false')) {
expj.common.pscript.addWarningMessage('AE0120010', 'AE0120010button2', 'AE00062');
}
};
// script4="onClick;3;CHK;_AE0120010form2/UNIT_COST[lt][{_AE0120010form2/PROCESSING_COST}+{_AE0120010form2/MATERIAL_COST}+{_AE0120010form2/OTHER_OVERHEADS}]@$AE00066"
expj.AE0120010.AE0120010button2.Insert.onClick3 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/UNIT_COST')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/PROCESSING_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/MATERIAL_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/OTHER_OVERHEADS')))) {
expj.common.pscript.addWarningMessage('AE0120010', 'AE0120010button2', 'AE00066');
}
};
// script5="onClick;4;CHK;_AE0120010form2/NET_AMOUNT[lt]0[or]_AE0120010form2/DISC_AMOUNT[lt]0@#AE00148"
expj.AE0120010.AE0120010button2.Insert.onClick4 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/NET_AMOUNT')), '[lt]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/DISC_AMOUNT')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010button2', 'AE00148');
}
};
// script6="onClick;5;CHK;_AE0120010form2/INSTALL_FLG[eq]1@*0"
expj.AE0120010.AE0120010button2.Insert.onClick5 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/INSTALL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0120010form1/*,_AE0120010form2/*@AE0120010Servlet,,$ZZ07001"
expj.AE0120010.AE0120010button2.Insert.onClick6 = function () {
  console.log('Insert script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0120010', 'AE0120010button2', '_AE0120010form1/*,_AE0120010form2/*', 'AE0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0120010', response);
expj.common.updateBusinessScreenTab('AE0120010', contents);
};
expj.common.pscript.callConfirm('AE0120010', 'AE0120010button2', 'ZZ07001', okEvent);
};
// script8="child;0;CHK;_AE0120010form2/THIS_MONTH[gt]~TO_YYYY_MM(_AE0120010form2/PUCH_RTN_DATE)@$AE00120"
expj.AE0120010.AE0120010button2.Insert.child0 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AE0120010', 'AE0120010button2', '_AE0120010form2/PUCH_RTN_DATE')))) {
expj.common.pscript.addWarningMessage('AE0120010', 'AE0120010button2', 'AE00120');
}
};
expj.AE0120010.AE0120010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010button2.Insert['onClick' + i])) {
        expj.AE0120010.AE0120010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010button2.Insert.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010button2.Insert.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010button2', 'Insert', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010button2.Insert.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AE0120010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0120010-AE0120010button2-Insert" name="Insert" class="AE0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010button2-Update">
expj.AE0120010.AE0120010button2.Update = {};
// script1="onClick;0;CHK;_AE0120010form2/PUCH_RTN_QTY[lte]0@#AE00107"
expj.AE0120010.AE0120010button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/PUCH_RTN_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010button2', 'AE00107');
}
};
// script2="onClick;1;CHK;_AE0120010form2/EXCH_RATE[lte]0@#AE00059"
expj.AE0120010.AE0120010button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/EXCH_RATE')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010button2', 'AE00059');
}
};
// script3="onClick;2;CHK;_AE0120010form2/SelectUnitCostFlag[eq]false@$AE00062"
expj.AE0120010.AE0120010button2.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/SelectUnitCostFlag'), '[eq]', 'false')) {
expj.common.pscript.addWarningMessage('AE0120010', 'AE0120010button2', 'AE00062');
}
};
// script4="onClick;3;CHK;_AE0120010form2/UNIT_COST[lt][{_AE0120010form2/PROCESSING_COST}+{_AE0120010form2/MATERIAL_COST}+{_AE0120010form2/OTHER_OVERHEADS}]@$AE00066"
expj.AE0120010.AE0120010button2.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/UNIT_COST')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/PROCESSING_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/MATERIAL_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/OTHER_OVERHEADS')))) {
expj.common.pscript.addWarningMessage('AE0120010', 'AE0120010button2', 'AE00066');
}
};
// script5="onClick;4;CHK;_AE0120010form2/NET_AMOUNT[lt]0[or]_AE0120010form2/DISC_AMOUNT[lt]0@#AE00148"
expj.AE0120010.AE0120010button2.Update.onClick4 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/NET_AMOUNT')), '[lt]', expj.common.pscript.convertNumber('0')) || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/DISC_AMOUNT')), '[lt]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0120010', 'AE0120010button2', 'AE00148');
}
};
// script6="onClick;5;CHK;_AE0120010form2/INSTALL_FLG[eq]1@*0"
expj.AE0120010.AE0120010button2.Update.onClick5 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/INSTALL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0120010form1/*,_AE0120010form2/*@AE0120010Servlet,,$ZZ07003"
expj.AE0120010.AE0120010button2.Update.onClick6 = function () {
  console.log('Update script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0120010', 'AE0120010button2', '_AE0120010form1/*,_AE0120010form2/*', 'AE0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0120010', response);
expj.common.updateBusinessScreenTab('AE0120010', contents);
};
expj.common.pscript.callConfirm('AE0120010', 'AE0120010button2', 'ZZ07003', okEvent);
};
// script8="child;0;CHK;_AE0120010form2/THIS_MONTH[gt]~TO_YYYY_MM(_AE0120010form2/PUCH_RTN_DATE)@$AE00120"
expj.AE0120010.AE0120010button2.Update.child0 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AE0120010', 'AE0120010button2', '_AE0120010form2/PUCH_RTN_DATE')))) {
expj.common.pscript.addWarningMessage('AE0120010', 'AE0120010button2', 'AE00120');
}
};
expj.AE0120010.AE0120010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010button2.Update['onClick' + i])) {
        expj.AE0120010.AE0120010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010button2.Update.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010button2.Update.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010button2', 'Update', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010button2.Update.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AE0120010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0120010-AE0120010button2-Update" name="Update" class="AE0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010button2-Delete">
expj.AE0120010.AE0120010button2.Delete = {};
// script1="onClick;0;CHK;_AE0120010form2/INSTALL_FLG[eq]1@*0"
expj.AE0120010.AE0120010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/INSTALL_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0120010form1/*,_AE0120010form2/*@AE0120010Servlet,,$ZZ07004"
expj.AE0120010.AE0120010button2.Delete.onClick1 = function () {
  console.log('Delete script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0120010', 'AE0120010button2', '_AE0120010form1/*,_AE0120010form2/*', 'AE0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0120010', response);
expj.common.updateBusinessScreenTab('AE0120010', contents);
};
expj.common.pscript.callConfirm('AE0120010', 'AE0120010button2', 'ZZ07004', okEvent);
};
// script3="child;0;CHK;_AE0120010form2/THIS_MONTH[gt]~TO_YYYY_MM(_AE0120010form2/PUCH_RTN_DATE)@$AE00120"
expj.AE0120010.AE0120010button2.Delete.child0 = function () {
  console.log('Delete script3');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0120010', 'AE0120010button2', '_AE0120010form2/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AE0120010', 'AE0120010button2', '_AE0120010form2/PUCH_RTN_DATE')))) {
expj.common.pscript.addWarningMessage('AE0120010', 'AE0120010button2', 'AE00120');
}
};
expj.AE0120010.AE0120010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010button2.Delete['onClick' + i])) {
        expj.AE0120010.AE0120010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010button2.Delete.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010button2.Delete.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010button2', 'Delete', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010button2.Delete.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute AE0120010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0120010-AE0120010button2-Delete" name="Delete" class="AE0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:19px;"></div><!--/td-->
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
<span class="version">AE0120010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AE0120010-AE0120010button0">
expj.AE0120010.AE0120010button0 = {};
expj.AE0120010.AE0120010button0.executeAllOnDecision = function () {
  console.log('execute AE0120010button0.onDecision');
};
expj.AE0120010.AE0120010button0.executeOnLoad = function () {
  expj.AE0120010.AE0120010button0.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button0.executePScriptOnLoad = function () {
  console.log('execute AE0120010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0120010-AE0120010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0120010-AE0120010button0-Clear">
expj.AE0120010.AE0120010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0120010Servlet,,$ZZ07008"
expj.AE0120010.AE0120010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0120010', 'AE0120010button0', '', 'AE0120010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0120010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0120010', response);
expj.common.updateBusinessScreenTab('AE0120010', contents);
};
expj.common.pscript.callConfirm('AE0120010', 'AE0120010button0', 'ZZ07008', okEvent);
};
expj.AE0120010.AE0120010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010button0.Clear['onClick' + i])) {
        expj.AE0120010.AE0120010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010button0.Clear.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010button0.Clear.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010button0.Clear.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0120010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0120010-AE0120010button0-Clear" name="Clear" class="AE0120010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0120010-AE0120010button0-Close">
expj.AE0120010.AE0120010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0120010.AE0120010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0120010');
};
expj.AE0120010.AE0120010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0120010.AE0120010button0.Close['onClick' + i])) {
        expj.AE0120010.AE0120010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0120010.AE0120010button0.Close.executeAllOnDecision = function () {
};
expj.AE0120010.AE0120010button0.Close.executeOnLoad = function () {
  $('#expj-AE0120010-AE0120010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0120010', 'AE0120010button0', 'Close', this, 'Button');
    }
  });
  expj.AE0120010.AE0120010button0.Close.executePScriptOnLoad();
};

expj.AE0120010.AE0120010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0120010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0120010-AE0120010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0120010-AE0120010button0-Close" name="Close" class="AE0120010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0120010 (END)-->
<%
MessageStruct msgStruct = aAE0120010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0120010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0120010)) {
  expj.common.treeInstanceMap.AE0120010 = {};
}
expj.common.treeInstanceMap.AE0120010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0120010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0120010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0120010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0120010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0120010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0120010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0120010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0120010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0120010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0120010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0120010)) {
  expj.common.detailDialogMap.AE0120010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0120010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0120010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0120010.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0120010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0120010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0120010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0120010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0120010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0120010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0120010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0120010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0120010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0120010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0120010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0120010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0120010)) {
  expj.common.viewInstanceMap.AE0120010 = {};
}
expj.common.viewInstanceMap.AE0120010.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0120010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0120010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0120010.<%=viewId %>.init = function () {
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
    expj.AE0120010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0120010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0120010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0120010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0120010_init">
/**
 * AE0120010用のロード完了時初期化関数
 */
expj.AE0120010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0120010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0120010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0120010');
  expj.common.calendarInstanceMap.AE0120010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0120010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0120010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0120010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0120010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0120010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0120010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0120010-<%=detailId %>');
<%
 }
%>
  try{expj.AE0120010.AE0120010form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form1.h_PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.VEND_ANAME.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.c_NON_NO_ITEM_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.THIS_MONTH.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.h_lotCtrl.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerLotNo.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PRODUCT_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PUCH_RTN_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.RTN_DEL_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PUCH_RTN_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.CalendarPuchRtnDate.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.h_PUCH_RTN_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PUCH_RTN_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerPuchRtnComment.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PUCH_ODR_PERSON.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerPuchOdrPerson.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.SelectUnitCostFlag.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.r1_FILTER.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PROCESSING_COST.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d1_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.r2_FILTER.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PUCH_ODR_CD_2.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerPuchOdrCd2.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.MATERIAL_COST.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d2_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.TAX_AMOUNT_1.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d7_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.TAX_RATE_1.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.OTHER_OVERHEADS.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d3_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.TAX_AMOUNT_2.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d8_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.TAX_RATE_2.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PUCH_ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d4_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.TAX_AMOUNT_3.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d9_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.TAX_RATE_3.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.DISC_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d5_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.AMOUNT_INCLUDE_TAX.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d10_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.NET_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d6_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.HOME_CUR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.TAX_CD.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.PeekerTaxCd.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.d_HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form1.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button1.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010form2.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button2.executeOnLoad();}catch(e){};
  try{expj.AE0120010.AE0120010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0120010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0120010', 'AE0120010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0120010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0120010-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0120010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0120010', '<%=request.getContextPath() %>');
};

/**
 * AE0120010の全体onDecision処理
 */
expj.AE0120010.executeAllOnDecision = function () {
  expj.AE0120010.AE0120010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0120010_console">
expj.AE0120010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>