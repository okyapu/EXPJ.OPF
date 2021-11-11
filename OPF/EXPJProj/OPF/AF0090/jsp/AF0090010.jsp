<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:39:55 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0090\AF0090010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0090.*" %>
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
<jsp:useBean id="aAF0090010Control" class="com.nec.jp.orteus.metamorBase.AF0090.AF0090010Control" scope="request"/>
<jsp:useBean id="aAF0090010Struct" class="com.nec.jp.orteus.metamorBase.AF0090.AF0090010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

計画外出庫実績入力
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0090/jsp/AF0090010.jsp,v $
$Author: geng-jia $	
$Revision: 1.15 $ $Date: 2017/02/22 02:05:50 $
********************************************************* --%>
<html>
<head>
<title>計画外出庫実績入力</title>
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
<script class="expj-script-AF0090010_init">
  // AF0090010名前空間
  expj.AF0090010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0090010" data-screen="AF0090010" data-newdata="<%=aAF0090010Control.isNewData() %>">
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
 
            <div class="expj-td frame04" style=""></div><!--/td-->

            <div class="expj-td frame05" style=""> 
              <script class="expj-script-AF0090010-AF0090010form1">
expj.AF0090010.AF0090010form1 = {};
// script1="onLoad;0;CALL;child@0,21"
expj.AF0090010.AF0090010form1.onLoad0 = function () {
  console.log('AF0090010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child21)){this.child21();}
};
// script2="child;0;CHK;_AF0090010form1/w_JOB_ODR[eq]1@*1,*4"
expj.AF0090010.AF0090010form1.child0 = function () {
  console.log('AF0090010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/w_JOB_ODR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script3="child;1;UNMASK;_JOB_ODR_CD,_PeekerJobOdrCd@*2"
expj.AF0090010.AF0090010form1.child1 = function () {
  console.log('AF0090010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;SET;_AF0090010form1/c_JOB_ODR_CD=true,_AF0090010form2/c_RCV_ISSUE_QTY=false@*3"
expj.AF0090010.AF0090010form1.child2 = function () {
  console.log('AF0090010form1 script4');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/c_JOB_ODR_CD', 'true');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/c_RCV_ISSUE_QTY', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;MASK;_AF0090010form2/c_RCV_ISSUE_QTY"
expj.AF0090010.AF0090010form1.child3 = function () {
  console.log('AF0090010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/c_RCV_ISSUE_QTY');
};
// script6="child;4;SET;_AF0090010form1/c_JOB_ODR_CD=false,_AF0090010form1/JOB_ODR_CD=@*5"
expj.AF0090010.AF0090010form1.child4 = function () {
  console.log('AF0090010form1 script6');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/c_JOB_ODR_CD', 'false');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;MASK;_JOB_ODR_CD,_PeekerJobOdrCd@*6"
expj.AF0090010.AF0090010form1.child5 = function () {
  console.log('AF0090010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;CHK;_AF0090010form1/w_INFERIOR[eq]1@*7,*8"
expj.AF0090010.AF0090010form1.child6 = function () {
  console.log('AF0090010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/w_INFERIOR'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;7;SET;_AF0090010form2/c_RCV_ISSUE_QTY=true"
expj.AF0090010.AF0090010form1.child7 = function () {
  console.log('AF0090010form1 script9');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/c_RCV_ISSUE_QTY', 'true');
};
// script10="child;8;SET;_AF0090010form2/c_RCV_ISSUE_QTY=false"
expj.AF0090010.AF0090010form1.child8 = function () {
  console.log('AF0090010form1 script10');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/c_RCV_ISSUE_QTY', 'false');
};
// script11="onLoad;1;CALL;onDecision@0"
expj.AF0090010.AF0090010form1.onLoad1 = function () {
  console.log('AF0090010form1 script11');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script12="onDecision;0;CHK;_AF0090010form1/c_JOB_ODR_CD[eq]true@*9,*15"
expj.AF0090010.AF0090010form1.onDecision0 = function () {
  console.log('AF0090010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/c_JOB_ODR_CD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script13="child;9;CHKRQ;A,B@*10,*14"
expj.AF0090010.AF0090010form1.child9 = function () {
  console.log('AF0090010form1 script13');
if (expj.common.pscript.satisfiedRequiredComponent('AF0090010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AF0090010', 'B')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script14="child;10;UNMASK;_AF0090010button1/select@*11"
expj.AF0090010.AF0090010form1.child10 = function () {
  console.log('AF0090010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script15="child;11;CHKRQ;C@*12,*13"
expj.AF0090010.AF0090010form1.child11 = function () {
  console.log('AF0090010form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('AF0090010', 'C')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script16="child;12;CHK;_AF0090010form2/c_ISSUE_FLG[eq]true@*29,*30"
expj.AF0090010.AF0090010form1.child12 = function () {
  console.log('AF0090010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/c_ISSUE_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script17="child;13;MASK;_AF0090010button2/insert"
expj.AF0090010.AF0090010form1.child13 = function () {
  console.log('AF0090010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button2/insert');
};
// script18="child;14;MASK;_AF0090010button1/select,_AF0090010button2/insert"
expj.AF0090010.AF0090010form1.child14 = function () {
  console.log('AF0090010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button2/insert');
};
// script19="child;15;CHKRQ;B@*16,*20"
expj.AF0090010.AF0090010form1.child15 = function () {
  console.log('AF0090010form1 script19');
if (expj.common.pscript.satisfiedRequiredComponent('AF0090010', 'B')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script20="child;16;UNMASK;_AF0090010button1/select@*17"
expj.AF0090010.AF0090010form1.child16 = function () {
  console.log('AF0090010form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script21="child;17;CHKRQ;C@*18,*19"
expj.AF0090010.AF0090010form1.child17 = function () {
  console.log('AF0090010form1 script21');
if (expj.common.pscript.satisfiedRequiredComponent('AF0090010', 'C')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script22="child;18;CHK;_AF0090010form2/c_ISSUE_FLG[eq]true@*29,*30"
expj.AF0090010.AF0090010form1.child18 = function () {
  console.log('AF0090010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/c_ISSUE_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script23="child;19;MASK;_AF0090010button2/insert"
expj.AF0090010.AF0090010form1.child19 = function () {
  console.log('AF0090010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button2/insert');
};
// script24="child;20;MASK;_AF0090010button1/select,_AF0090010button2/insert"
expj.AF0090010.AF0090010form1.child20 = function () {
  console.log('AF0090010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button1/select');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button2/insert');
};
// script25="child;21;CHK;_AF0090010form2/c_ISSUE_FLG[eq]true@*22,*25"
expj.AF0090010.AF0090010form1.child21 = function () {
  console.log('AF0090010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/c_ISSUE_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script26="child;22;UNMASK;_AF0090010form2/ISSUE_ITEM_CD,_AF0090010form2/PeekerIssueItemCd@*23"
expj.AF0090010.AF0090010form1.child22 = function () {
  console.log('AF0090010form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/PeekerIssueItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child23)){this.child23();}}
};
// script27="child;23;UNMASK;_AF0090010form2/ISSUE_JOB_ODR_CD,_AF0090010form2/PeekerIssueJobOdrCd@*24"
expj.AF0090010.AF0090010form1.child23 = function () {
  console.log('AF0090010form1 script27');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/PeekerIssueJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child24)){this.child24();}}
};
// script28="child;24;UNMASK;_AF0090010form2/ISSUE_PROC_CD,_AF0090010form2/PeekerIssueProcCd"
expj.AF0090010.AF0090010form1.child24 = function () {
  console.log('AF0090010form1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_PROC_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/PeekerIssueProcCd');
};
// script29="child;25;MASK;_AF0090010form2/ISSUE_ITEM_CD,_AF0090010form2/PeekerIssueItemCd@*26"
expj.AF0090010.AF0090010form1.child25 = function () {
  console.log('AF0090010form1 script29');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/PeekerIssueItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child26)){this.child26();}}
};
// script30="child;26;MASK;_AF0090010form2/ISSUE_JOB_ODR_CD,_AF0090010form2/PeekerIssueJobOdrCd@*27"
expj.AF0090010.AF0090010form1.child26 = function () {
  console.log('AF0090010form1 script30');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/PeekerIssueJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child27)){this.child27();}}
};
// script31="child;27;MASK;_AF0090010form2/ISSUE_PROC_CD,_AF0090010form2/PeekerIssueProcCd@*28"
expj.AF0090010.AF0090010form1.child27 = function () {
  console.log('AF0090010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_PROC_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/PeekerIssueProcCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child28)){this.child28();}}
};
// script32="child;28;SET;_AF0090010form2/ISSUE_ITEM_CD=,_AF0090010form2/ISSUE_JOB_ODR_CD=,_AF0090010form2/ISSUE_PROC_CD="
expj.AF0090010.AF0090010form1.child28 = function () {
  console.log('AF0090010form1 script32');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_JOB_ODR_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/ISSUE_PROC_CD', '');
};
// script33="child;29;CHKRQ;D@*30,*31"
expj.AF0090010.AF0090010form1.child29 = function () {
  console.log('AF0090010form1 script33');
if (expj.common.pscript.satisfiedRequiredComponent('AF0090010', 'D')) {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script34="child;30;UNMASK;_AF0090010button2/insert"
expj.AF0090010.AF0090010form1.child30 = function () {
  console.log('AF0090010form1 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button2/insert');
};
// script35="child;31;MASK;_AF0090010button2/insert"
expj.AF0090010.AF0090010form1.child31 = function () {
  console.log('AF0090010form1 script35');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010button2/insert');
};
// script36="onLoad;2;CALL;child@32"
expj.AF0090010.AF0090010form1.onLoad2 = function () {
  console.log('AF0090010form1 script36');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child32)){this.child32();}
};
// script37="child;32;CHK;_AF0090010form1/h_LotCtrl[eq]true@*33,*34"
expj.AF0090010.AF0090010form1.child32 = function () {
  console.log('AF0090010form1 script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/h_LotCtrl'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
} else {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
}
};
// script38="child;33;UNMASK;_AF0090010form1/LOT_NO,_AF0090010form1/PeekerWStockLotCd@*36"
expj.AF0090010.AF0090010form1.child33 = function () {
  console.log('AF0090010form1 script38');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form1/LOT_NO');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form1/PeekerWStockLotCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child36)){this.child36();}}
};
// script39="child;34;MASK;_AF0090010form1/LOT_NO,_AF0090010form1/PeekerWStockLotCd@*35"
expj.AF0090010.AF0090010form1.child34 = function () {
  console.log('AF0090010form1 script39');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form1/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form1/PeekerWStockLotCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child35)){this.child35();}}
};
// script40="child;35;SET;_AF0090010form3/LOT_STOCK_ON_HAND_QTY=,_AF0090010form3/LOT_DEFECT_QTY=,_AF0090010form3/ALLOCABLE_QTY="
expj.AF0090010.AF0090010form1.child35 = function () {
  console.log('AF0090010form1 script40');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form3/LOT_STOCK_ON_HAND_QTY', '');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form3/LOT_DEFECT_QTY', '');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form3/ALLOCABLE_QTY', '');
};
// script41="child;36;CHK;_AF0090010form1/h_lotFlg[eq]1@,*35"
expj.AF0090010.AF0090010form1.child36 = function () {
  console.log('AF0090010form1 script41');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/h_lotFlg'), '[eq]', '1')) {

} else {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
}
};
expj.AF0090010.AF0090010form1.executeAllOnDecision = function () {
  console.log('execute AF0090010form1.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form1['onDecision' + i])) {
        expj.AF0090010.AF0090010form1['onDecision' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form1.executeOnLoad = function () {
  expj.AF0090010.AF0090010form1.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form1['onLoad' + i])) {
      expj.AF0090010.AF0090010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0090010-AF0090010form1" action="AF0090010Servlet" name="AF0090010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AF0090010-AF0090010form1-JOB_ODR_CD">
expj.AF0090010.AF0090010form1.JOB_ODR_CD = {};
expj.AF0090010.AF0090010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/JOB_ODR_CD.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'JOB_ODR_CD', this);
  });
  expj.AF0090010.AF0090010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AF0090010-focus-move  required-value expj-AF0090010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-PeekerJobOdrCd">
expj.AF0090010.AF0090010form1.PeekerJobOdrCd = {};
// script1="onClick;0;PEEKER;_AF0090010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form1.PeekerJobOdrCd.onClick0 = function () {
  console.log('PeekerJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0090010', 'PeekerJobOdrCd', 'SQLPARAM_1', '<%=aAF0090010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form1.PeekerJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form1.PeekerJobOdrCd['onClick' + i])) {
        expj.AF0090010.AF0090010form1.PeekerJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form1.PeekerJobOdrCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form1.PeekerJobOdrCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-PeekerJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form1', 'PeekerJobOdrCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form1.PeekerJobOdrCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.PeekerJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/PeekerJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-PeekerJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form1-PeekerJobOdrCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-c_JOB_ODR_CD">
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*3"
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.onClick0 = function () {
  console.log('c_JOB_ODR_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script2="child;0;UNMASK;_JOB_ODR_CD,_PeekerJobOdrCd@*1"
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.child0 = function () {
  console.log('c_JOB_ODR_CD script2');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;SET;_AF0090010form2/c_RCV_ISSUE_QTY=false@*2"
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.child1 = function () {
  console.log('c_JOB_ODR_CD script3');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form2/c_RCV_ISSUE_QTY', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;MASK;_AF0090010form2/c_RCV_ISSUE_QTY"
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.child2 = function () {
  console.log('c_JOB_ODR_CD script4');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/c_RCV_ISSUE_QTY');
};
// script5="child;3;SET;_AF0090010form1/JOB_ODR_CD=@*4"
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.child3 = function () {
  console.log('c_JOB_ODR_CD script5');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;MASK;_JOB_ODR_CD,_PeekerJobOdrCd@*5"
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.child4 = function () {
  console.log('c_JOB_ODR_CD script6');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_PeekerJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;UNMASK;_AF0090010form2/c_RCV_ISSUE_QTY"
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.child5 = function () {
  console.log('c_JOB_ODR_CD script7');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form1', '_AF0090010form2/c_RCV_ISSUE_QTY');
};
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form1.c_JOB_ODR_CD['onClick' + i])) {
        expj.AF0090010.AF0090010form1.c_JOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/c_JOB_ODR_CD.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-c_JOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form1', 'c_JOB_ODR_CD', this, 'CheckBox');
    }
  });
  expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/c_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-c_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR_CD" value="true" <%= ("true".equals(TypeConverter.convert(aAF0090010Struct.getc_JOB_ODR_CD())) || "1".equals(TypeConverter.convert(aAF0090010Struct.getc_JOB_ODR_CD())))?"checked=\"checked\"":"" %>  class="AF0090010-focus-move" id="expj-AF0090010-AF0090010form1-c_JOB_ODR_CD"><label for="expj-AF0090010-AF0090010form1-c_JOB_ODR_CD"><%=CoreTools.getRBString("Expj.Cmt0210",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-ITEM_CD">
expj.AF0090010.AF0090010form1.ITEM_CD = {};
expj.AF0090010.AF0090010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/ITEM_CD.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'ITEM_CD', this);
  });
  expj.AF0090010.AF0090010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form1-ITEM_CD" name="ITEM_CD" class="AF0090010-focus-move  required-value expj-AF0090010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AF0090010-AF0090010form1-w_JOB_ODR" name="w_JOB_ODR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getw_JOB_ODR()) %>">
<script class="expj-script-AF0090010-AF0090010form1-w_JOB_ODR">
expj.AF0090010.AF0090010form1.w_JOB_ODR = {};
expj.AF0090010.AF0090010form1.w_JOB_ODR.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/w_JOB_ODR.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.w_JOB_ODR.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-w_JOB_ODR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'w_JOB_ODR', this);
  });
  expj.AF0090010.AF0090010form1.w_JOB_ODR.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.w_JOB_ODR.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/w_JOB_ODR.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-w_JOB_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AF0090010-AF0090010form1-w_INFERIOR" name="w_INFERIOR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getw_INFERIOR()) %>">
<script class="expj-script-AF0090010-AF0090010form1-w_INFERIOR">
expj.AF0090010.AF0090010form1.w_INFERIOR = {};
expj.AF0090010.AF0090010form1.w_INFERIOR.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/w_INFERIOR.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.w_INFERIOR.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-w_INFERIOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'w_INFERIOR', this);
  });
  expj.AF0090010.AF0090010form1.w_INFERIOR.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.w_INFERIOR.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/w_INFERIOR.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-w_INFERIOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AF0090010-AF0090010form1-PeekerItemCd">
expj.AF0090010.AF0090010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AF0090010form1/ITEM_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form1.PeekerItemCd['onClick' + i])) {
        expj.AF0090010.AF0090010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form1-PeekerItemCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-ITEM_NAME">
expj.AF0090010.AF0090010form1.ITEM_NAME = {};
expj.AF0090010.AF0090010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/ITEM_NAME.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'ITEM_NAME', this);
  });
  expj.AF0090010.AF0090010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form1-ITEM_NAME" name="ITEM_NAME" class="AF0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AF0090010-AF0090010form1-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AF0090010-AF0090010form1-BUSINESS_OPR_DATE">
expj.AF0090010.AF0090010form1.BUSINESS_OPR_DATE = {};
expj.AF0090010.AF0090010form1.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/BUSINESS_OPR_DATE.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'BUSINESS_OPR_DATE', this);
  });
  expj.AF0090010.AF0090010form1.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD",rb)%></span><!-- 保管区コード --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-WH_CD">
expj.AF0090010.AF0090010form1.WH_CD = {};
expj.AF0090010.AF0090010form1.WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/WH_CD.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.WH_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'WH_CD', this);
  });
  expj.AF0090010.AF0090010form1.WH_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form1-WH_CD" name="WH_CD" class="AF0090010-focus-move  required-value expj-AF0090010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-PeekerWhCd">
expj.AF0090010.AF0090010form1.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AF0090010form1/WH_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form1.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0090010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAF0090010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form1.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form1.PeekerWhCd['onClick' + i])) {
        expj.AF0090010.AF0090010form1.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form1.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form1.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form1', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form1.PeekerWhCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form1-PeekerWhCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-WH_NAME">
expj.AF0090010.AF0090010form1.WH_NAME = {};
expj.AF0090010.AF0090010form1.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/WH_NAME.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.WH_NAME.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'WH_NAME', this);
  });
  expj.AF0090010.AF0090010form1.WH_NAME.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form1-WH_NAME" name="WH_NAME" class="AF0090010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-LOT_NO">
expj.AF0090010.AF0090010form1.LOT_NO = {};
expj.AF0090010.AF0090010form1.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/LOT_NO.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.LOT_NO.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'LOT_NO', this);
  });
  expj.AF0090010.AF0090010form1.LOT_NO.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form1-LOT_NO" name="LOT_NO" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getLOT_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form1-PeekerWStockLotCd">
expj.AF0090010.AF0090010form1.PeekerWStockLotCd = {};
// script1="onClick;0;PEEKER;_AF0090010form1/LOT_NO:_AF0090010form1/ITEM_CD:_AF0090010form1/WH_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form1.PeekerWStockLotCd.onClick0 = function () {
  console.log('PeekerWStockLotCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerWStockLotCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form1', '_AF0090010form1/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_10%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form1/LOT_NO:_AF0090010form1/ITEM_CD:_AF0090010form1/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form1.PeekerWStockLotCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form1.PeekerWStockLotCd['onClick' + i])) {
        expj.AF0090010.AF0090010form1.PeekerWStockLotCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form1.PeekerWStockLotCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form1.PeekerWStockLotCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-PeekerWStockLotCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form1', 'PeekerWStockLotCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form1.PeekerWStockLotCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.PeekerWStockLotCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/PeekerWStockLotCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-PeekerWStockLotCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form1-PeekerWStockLotCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AF0090010-AF0090010form1-h_lotFlg" name="h_lotFlg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0090010Struct.geth_lotFlg()) %>">
<script class="expj-script-AF0090010-AF0090010form1-h_lotFlg">
expj.AF0090010.AF0090010form1.h_lotFlg = {};
expj.AF0090010.AF0090010form1.h_lotFlg.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/h_lotFlg.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.h_lotFlg.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-h_lotFlg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'h_lotFlg', this);
  });
  expj.AF0090010.AF0090010form1.h_lotFlg.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.h_lotFlg.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/h_lotFlg.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-h_lotFlg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0090010-AF0090010form1-h_LotCtrl" name="h_LotCtrl" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0090010Struct.geth_LotCtrl()) %>">
<script class="expj-script-AF0090010-AF0090010form1-h_LotCtrl">
expj.AF0090010.AF0090010form1.h_LotCtrl = {};
expj.AF0090010.AF0090010form1.h_LotCtrl.executeAllOnDecision = function () {
  console.log('execute AF0090010form1/h_LotCtrl.onDecision');
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form1.h_LotCtrl.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form1-h_LotCtrl').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form1', 'h_LotCtrl', this);
  });
  expj.AF0090010.AF0090010form1.h_LotCtrl.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form1.h_LotCtrl.executePScriptOnLoad = function () {
  console.log('execute AF0090010form1/h_LotCtrl.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form1-h_LotCtrl');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0090010-AF0090010button1">
expj.AF0090010.AF0090010button1 = {};
expj.AF0090010.AF0090010button1.executeAllOnDecision = function () {
  console.log('execute AF0090010button1.onDecision');
};
expj.AF0090010.AF0090010button1.executeOnLoad = function () {
  expj.AF0090010.AF0090010button1.executePScriptOnLoad();
};

expj.AF0090010.AF0090010button1.executePScriptOnLoad = function () {
  console.log('execute AF0090010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0090010-AF0090010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0090010-AF0090010button1-select">
expj.AF0090010.AF0090010button1.select = {};
// script1="onClick;0;CHK;_AF0090010form1/c_JOB_ODR_CD[eq]true@*0,*1"
expj.AF0090010.AF0090010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010button1', '_AF0090010form1/c_JOB_ODR_CD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="onClick;1;CHK;_AF0090010form2/c_RCV_ISSUE_QTY[eq]true@*2,*3"
expj.AF0090010.AF0090010button1.select.onClick1 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010button1', '_AF0090010form2/c_RCV_ISSUE_QTY'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0090010form1/*,_AF0090010form2/*,_AF0090010form3/*@AF0090010Servlet"
expj.AF0090010.AF0090010button1.select.onClick2 = function () {
  console.log('select script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0090010', 'AF0090010button1', '_AF0090010form1/*,_AF0090010form2/*,_AF0090010form3/*', 'AF0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0090010', response);
expj.common.updateBusinessScreenTab('AF0090010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
// script4="child;0;SET;_AF0090010form1/w_JOB_ODR=1"
expj.AF0090010.AF0090010button1.select.child0 = function () {
  console.log('select script4');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button1', '_AF0090010form1/w_JOB_ODR', '1');
};
// script5="child;1;SET;_AF0090010form1/w_JOB_ODR=0"
expj.AF0090010.AF0090010button1.select.child1 = function () {
  console.log('select script5');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button1', '_AF0090010form1/w_JOB_ODR', '0');
};
// script6="child;2;SET;_AF0090010form1/w_INFERIOR=1"
expj.AF0090010.AF0090010button1.select.child2 = function () {
  console.log('select script6');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button1', '_AF0090010form1/w_INFERIOR', '1');
};
// script7="child;3;SET;_AF0090010form1/w_INFERIOR=0"
expj.AF0090010.AF0090010button1.select.child3 = function () {
  console.log('select script7');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button1', '_AF0090010form1/w_INFERIOR', '0');
};
expj.AF0090010.AF0090010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010button1.select['onClick' + i])) {
        expj.AF0090010.AF0090010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010button1.select.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010button1.select.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010button1', 'select', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010button1.select.executePScriptOnLoad();
};

expj.AF0090010.AF0090010button1.select.executePScriptOnLoad = function () {
  console.log('execute AF0090010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0090010-AF0090010button1-select" name="select" class="AF0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0090010-AF0090010form2">
expj.AF0090010.AF0090010form2 = {};
expj.AF0090010.AF0090010form2.executeAllOnDecision = function () {
  console.log('execute AF0090010form2.onDecision');
};
expj.AF0090010.AF0090010form2.executeOnLoad = function () {
  expj.AF0090010.AF0090010form2.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0090010-AF0090010form2" action="AF0090010Servlet" name="AF0090010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:22px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_QTY",rb)%></span><!-- 出庫数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-RCV_ISSUE_QTY">
expj.AF0090010.AF0090010form2.RCV_ISSUE_QTY = {};
expj.AF0090010.AF0090010form2.RCV_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/RCV_ISSUE_QTY.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.RCV_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-RCV_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'RCV_ISSUE_QTY', this);
  });
  expj.AF0090010.AF0090010form2.RCV_ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.RCV_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/RCV_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-RCV_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-RCV_ISSUE_QTY" name="RCV_ISSUE_QTY" class="AF0090010-focus-move expj-align-right required-value expj-AF0090010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getRCV_ISSUE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-STOCK_UNIT">
expj.AF0090010.AF0090010form2.STOCK_UNIT = {};
expj.AF0090010.AF0090010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/STOCK_UNIT.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'STOCK_UNIT', this);
  });
  expj.AF0090010.AF0090010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-STOCK_UNIT" name="STOCK_UNIT" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-c_RCV_ISSUE_QTY">
expj.AF0090010.AF0090010form2.c_RCV_ISSUE_QTY = {};
expj.AF0090010.AF0090010form2.c_RCV_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/c_RCV_ISSUE_QTY.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.c_RCV_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-c_RCV_ISSUE_QTY').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'c_RCV_ISSUE_QTY', this, 'CheckBox');
    }
  });
  expj.AF0090010.AF0090010form2.c_RCV_ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.c_RCV_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/c_RCV_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-c_RCV_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_RCV_ISSUE_QTY" value="true" <%= ("true".equals(TypeConverter.convert(aAF0090010Struct.getc_RCV_ISSUE_QTY())) || "1".equals(TypeConverter.convert(aAF0090010Struct.getc_RCV_ISSUE_QTY())))?"checked=\"checked\"":"" %>  class="AF0090010-focus-move" id="expj-AF0090010-AF0090010form2-c_RCV_ISSUE_QTY"><label for="expj-AF0090010-AF0090010form2-c_RCV_ISSUE_QTY"><%=CoreTools.getRBString("Expj.Cmt0216",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_DATE",rb)%></span><!-- 出庫日 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-RCV_ISSUE_DATE">
expj.AF0090010.AF0090010form2.RCV_ISSUE_DATE = {};
expj.AF0090010.AF0090010form2.RCV_ISSUE_DATE.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/RCV_ISSUE_DATE.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.RCV_ISSUE_DATE.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-RCV_ISSUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'RCV_ISSUE_DATE', this);
  });
  expj.AF0090010.AF0090010form2.RCV_ISSUE_DATE.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.RCV_ISSUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/RCV_ISSUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-RCV_ISSUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-RCV_ISSUE_DATE" name="RCV_ISSUE_DATE" class="AF0090010-focus-move  required-value expj-AF0090010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD;" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getRCV_ISSUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-CalendarRcvIssueDate">
expj.AF0090010.AF0090010form2.CalendarRcvIssueDate = {};
// script1="onClick;0;CALENDAR;_AF0090010form2/RCV_ISSUE_DATE"
expj.AF0090010.AF0090010form2.CalendarRcvIssueDate.onClick0 = function () {
  console.log('CalendarRcvIssueDate script1');
expj.common.pscript.executeCalendar('AF0090010','AF0090010form2','_AF0090010form2/RCV_ISSUE_DATE');
};
expj.AF0090010.AF0090010form2.CalendarRcvIssueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form2.CalendarRcvIssueDate['onClick' + i])) {
        expj.AF0090010.AF0090010form2.CalendarRcvIssueDate['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form2.CalendarRcvIssueDate.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form2.CalendarRcvIssueDate.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-CalendarRcvIssueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'CalendarRcvIssueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AF0090010','AF0090010form2','_AF0090010form2/RCV_ISSUE_DATE');
  expj.AF0090010.AF0090010form2.CalendarRcvIssueDate.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.CalendarRcvIssueDate.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/CalendarRcvIssueDate.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-CalendarRcvIssueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form2-CalendarRcvIssueDate" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt6853",rb)%></span><!-- 計画外理由 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-NON_PLANNED_CAUSE_CD">
expj.AF0090010.AF0090010form2.NON_PLANNED_CAUSE_CD = {};
expj.AF0090010.AF0090010form2.NON_PLANNED_CAUSE_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/NON_PLANNED_CAUSE_CD.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.NON_PLANNED_CAUSE_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-NON_PLANNED_CAUSE_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'NON_PLANNED_CAUSE_CD', this);
  });
  expj.AF0090010.AF0090010form2.NON_PLANNED_CAUSE_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.NON_PLANNED_CAUSE_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/NON_PLANNED_CAUSE_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-NON_PLANNED_CAUSE_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-NON_PLANNED_CAUSE_CD" name="NON_PLANNED_CAUSE_CD" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getNON_PLANNED_CAUSE_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-PeekerNonPlannedcd">
expj.AF0090010.AF0090010form2.PeekerNonPlannedcd = {};
// script1="onClick;0;PEEKER;_AF0090010form2/NON_PLANNED_CAUSE_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form2.PeekerNonPlannedcd.onClick0 = function () {
  console.log('PeekerNonPlannedcd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerNonPlannedcd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/NON_PLANNED_CAUSE_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%NON_PLANNED_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form2/NON_PLANNED_CAUSE_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form2.PeekerNonPlannedcd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form2.PeekerNonPlannedcd['onClick' + i])) {
        expj.AF0090010.AF0090010form2.PeekerNonPlannedcd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form2.PeekerNonPlannedcd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form2.PeekerNonPlannedcd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-PeekerNonPlannedcd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'PeekerNonPlannedcd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form2.PeekerNonPlannedcd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.PeekerNonPlannedcd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/PeekerNonPlannedcd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-PeekerNonPlannedcd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form2-PeekerNonPlannedcd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO",rb)%></span><!-- メーカロット番号 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-VEND_LOT_NO">
expj.AF0090010.AF0090010form2.VEND_LOT_NO = {};
expj.AF0090010.AF0090010form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/VEND_LOT_NO.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'VEND_LOT_NO', this);
  });
  expj.AF0090010.AF0090010form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-c_ISSUE_FLG">
expj.AF0090010.AF0090010form2.c_ISSUE_FLG = {};
// script1="onClick;0;CHK;_AF0090010form2/c_ISSUE_FLG[eq]true@*0,*3"
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.onClick0 = function () {
  console.log('c_ISSUE_FLG script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/c_ISSUE_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script2="child;0;UNMASK;_AF0090010form2/ISSUE_ITEM_CD,_AF0090010form2/PeekerIssueItemCd@*1"
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.child0 = function () {
  console.log('c_ISSUE_FLG script2');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/PeekerIssueItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;UNMASK;_AF0090010form2/ISSUE_JOB_ODR_CD,_AF0090010form2/PeekerIssueJobOdrCd@*2"
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.child1 = function () {
  console.log('c_ISSUE_FLG script3');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/PeekerIssueJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;UNMASK;_AF0090010form2/ISSUE_PROC_CD,_AF0090010form2/PeekerIssueProcCd"
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.child2 = function () {
  console.log('c_ISSUE_FLG script4');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_PROC_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/PeekerIssueProcCd');
};
// script5="child;3;MASK;_AF0090010form2/ISSUE_ITEM_CD,_AF0090010form2/PeekerIssueItemCd@*4"
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.child3 = function () {
  console.log('c_ISSUE_FLG script5');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/PeekerIssueItemCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;MASK;_AF0090010form2/ISSUE_JOB_ODR_CD,_AF0090010form2/PeekerIssueJobOdrCd@*5"
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.child4 = function () {
  console.log('c_ISSUE_FLG script6');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/PeekerIssueJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;MASK;_AF0090010form2/ISSUE_PROC_CD,_AF0090010form2/PeekerIssueProcCd@*6"
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.child5 = function () {
  console.log('c_ISSUE_FLG script7');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_PROC_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0090010', 'AF0090010form2', '_AF0090010form2/PeekerIssueProcCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;SET;_AF0090010form2/ISSUE_ITEM_CD=,_AF0090010form2/ISSUE_JOB_ODR_CD=,_AF0090010form2/ISSUE_PROC_CD="
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.child6 = function () {
  console.log('c_ISSUE_FLG script8');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_ITEM_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_JOB_ODR_CD', '');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_PROC_CD', '');
};
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form2.c_ISSUE_FLG['onClick' + i])) {
        expj.AF0090010.AF0090010form2.c_ISSUE_FLG['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/c_ISSUE_FLG.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.c_ISSUE_FLG.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-c_ISSUE_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'c_ISSUE_FLG', this, 'CheckBox');
    }
  });
  expj.AF0090010.AF0090010form2.c_ISSUE_FLG.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.c_ISSUE_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/c_ISSUE_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-c_ISSUE_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_ISSUE_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAF0090010Struct.getc_ISSUE_FLG())) || "1".equals(TypeConverter.convert(aAF0090010Struct.getc_ISSUE_FLG())))?"checked=\"checked\"":"" %>  class="AF0090010-focus-move" id="expj-AF0090010-AF0090010form2-c_ISSUE_FLG"><label for="expj-AF0090010-AF0090010form2-c_ISSUE_FLG"><%=CoreTools.getRBString("Expj.Cmt2117",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.Cmt2114",rb)%></span><!-- 出庫先品目番号 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-ISSUE_ITEM_CD">
expj.AF0090010.AF0090010form2.ISSUE_ITEM_CD = {};
expj.AF0090010.AF0090010form2.ISSUE_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/ISSUE_ITEM_CD.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.ISSUE_ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-ISSUE_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'ISSUE_ITEM_CD', this);
  });
  expj.AF0090010.AF0090010form2.ISSUE_ITEM_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.ISSUE_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/ISSUE_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-ISSUE_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-ISSUE_ITEM_CD" name="ISSUE_ITEM_CD" class="AF0090010-focus-move  required-value expj-AF0090010-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getISSUE_ITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-PeekerIssueItemCd">
expj.AF0090010.AF0090010form2.PeekerIssueItemCd = {};
// script1="onClick;0;PEEKER;_AF0090010form2/ISSUE_ITEM_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form2.PeekerIssueItemCd.onClick0 = function () {
  console.log('PeekerIssueItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerIssueItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_10%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form2/ISSUE_ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form2.PeekerIssueItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form2.PeekerIssueItemCd['onClick' + i])) {
        expj.AF0090010.AF0090010form2.PeekerIssueItemCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form2.PeekerIssueItemCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form2.PeekerIssueItemCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-PeekerIssueItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'PeekerIssueItemCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form2.PeekerIssueItemCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.PeekerIssueItemCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/PeekerIssueItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-PeekerIssueItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form2-PeekerIssueItemCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt2115",rb)%></span><!-- 出庫先製番 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-ISSUE_JOB_ODR_CD">
expj.AF0090010.AF0090010form2.ISSUE_JOB_ODR_CD = {};
expj.AF0090010.AF0090010form2.ISSUE_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/ISSUE_JOB_ODR_CD.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.ISSUE_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-ISSUE_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'ISSUE_JOB_ODR_CD', this);
  });
  expj.AF0090010.AF0090010form2.ISSUE_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.ISSUE_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/ISSUE_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-ISSUE_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-ISSUE_JOB_ODR_CD" name="ISSUE_JOB_ODR_CD" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getISSUE_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-PeekerIssueJobOdrCd">
expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd = {};
// script1="onClick;0;PEEKER;_AF0090010form2/ISSUE_JOB_ODR_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd.onClick0 = function () {
  console.log('PeekerIssueJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerIssueJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0090010', 'PeekerIssueJobOdrCd', 'SQLPARAM_1', '<%=aAF0090010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form2/ISSUE_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd['onClick' + i])) {
        expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-PeekerIssueJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'PeekerIssueJobOdrCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/PeekerIssueJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-PeekerIssueJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form2-PeekerIssueJobOdrCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt2116",rb)%></span><!-- 出庫先作業工程コード --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-ISSUE_PROC_CD">
expj.AF0090010.AF0090010form2.ISSUE_PROC_CD = {};
expj.AF0090010.AF0090010form2.ISSUE_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/ISSUE_PROC_CD.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.ISSUE_PROC_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-ISSUE_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'ISSUE_PROC_CD', this);
  });
  expj.AF0090010.AF0090010form2.ISSUE_PROC_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.ISSUE_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/ISSUE_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-ISSUE_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-ISSUE_PROC_CD" name="ISSUE_PROC_CD" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getISSUE_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-PeekerIssueProcCd">
expj.AF0090010.AF0090010form2.PeekerIssueProcCd = {};
// script1="onClick;0;PEEKER;_AF0090010form2/ISSUE_PROC_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form2.PeekerIssueProcCd.onClick0 = function () {
  console.log('PeekerIssueProcCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerIssueProcCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0090010', 'PeekerIssueProcCd', 'SQLPARAM_1', '<%=aAF0090010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/ISSUE_PROC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROC_GRP_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form2/ISSUE_PROC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form2.PeekerIssueProcCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form2.PeekerIssueProcCd['onClick' + i])) {
        expj.AF0090010.AF0090010form2.PeekerIssueProcCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form2.PeekerIssueProcCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form2.PeekerIssueProcCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-PeekerIssueProcCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'PeekerIssueProcCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form2.PeekerIssueProcCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.PeekerIssueProcCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/PeekerIssueProcCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-PeekerIssueProcCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form2-PeekerIssueProcCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXPENSE_CLASS_CD",rb)%></span><!-- 科目コード --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-ACCT_CD">
expj.AF0090010.AF0090010form2.ACCT_CD = {};
expj.AF0090010.AF0090010form2.ACCT_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/ACCT_CD.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.ACCT_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-ACCT_CD').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0090010', 'AF0090010form2', 'ACCT_CD', this);
  });
  expj.AF0090010.AF0090010form2.ACCT_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.ACCT_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/ACCT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-ACCT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0090010-AF0090010form2-ACCT_CD" name='ACCT_CD' class='AF0090010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0090010Control.getStruct().getList_ACCT_CD_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_ACCT_CD_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_ACCT_CD_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0090010Struct.getACCT_CD()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEPT_CD",rb)%></span><!-- 負担部門コード --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-DEPT_CD">
expj.AF0090010.AF0090010form2.DEPT_CD = {};
expj.AF0090010.AF0090010form2.DEPT_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/DEPT_CD.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.DEPT_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-DEPT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'DEPT_CD', this);
  });
  expj.AF0090010.AF0090010form2.DEPT_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.DEPT_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/DEPT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-DEPT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-DEPT_CD" name="DEPT_CD" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getDEPT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-PeekerDeptCd">
expj.AF0090010.AF0090010form2.PeekerDeptCd = {};
// script1="onClick;0;PEEKER;_AF0090010form2/DEPT_CD@<%=contextNo%>"
expj.AF0090010.AF0090010form2.PeekerDeptCd.onClick0 = function () {
  console.log('PeekerDeptCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0090010';
var parameterValues = 'PeekerDeptCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0090010', 'PeekerDeptCd', 'SQLPARAM_1', '<%=aAF0090010Control.getsysCOMPANY_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form2', '_AF0090010form2/DEPT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DEPT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0090010form2/DEPT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0090010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0090010.AF0090010form2.PeekerDeptCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form2.PeekerDeptCd['onClick' + i])) {
        expj.AF0090010.AF0090010form2.PeekerDeptCd['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010form2.PeekerDeptCd.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010form2.PeekerDeptCd.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-PeekerDeptCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010form2', 'PeekerDeptCd', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010form2.PeekerDeptCd.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.PeekerDeptCd.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/PeekerDeptCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-PeekerDeptCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0090010-AF0090010form2-PeekerDeptCd" class="AF0090010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-DEPT_NAME">
expj.AF0090010.AF0090010form2.DEPT_NAME = {};
expj.AF0090010.AF0090010form2.DEPT_NAME.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/DEPT_NAME.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.DEPT_NAME.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-DEPT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form2', 'DEPT_NAME', this);
  });
  expj.AF0090010.AF0090010form2.DEPT_NAME.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.DEPT_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/DEPT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-DEPT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form2-DEPT_NAME" name="DEPT_NAME" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getDEPT_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PJ_CD",rb)%></span><!-- プロジェクトコード --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-PJ_CD">
expj.AF0090010.AF0090010form2.PJ_CD = {};
expj.AF0090010.AF0090010form2.PJ_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/PJ_CD.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.PJ_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-PJ_CD').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0090010', 'AF0090010form2', 'PJ_CD', this);
  });
  expj.AF0090010.AF0090010form2.PJ_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.PJ_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/PJ_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-PJ_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0090010-AF0090010form2-PJ_CD" name='PJ_CD' class='AF0090010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0090010Control.getStruct().getList_PJ_CD_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_PJ_CD_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_PJ_CD_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0090010Struct.getPJ_CD()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS1",rb)%></span><!-- セグメント1 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-SEG_CONTENTS1">
expj.AF0090010.AF0090010form2.SEG_CONTENTS1 = {};
expj.AF0090010.AF0090010form2.SEG_CONTENTS1.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS1.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.SEG_CONTENTS1.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-SEG_CONTENTS1').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0090010', 'AF0090010form2', 'SEG_CONTENTS1', this);
  });
  expj.AF0090010.AF0090010form2.SEG_CONTENTS1.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.SEG_CONTENTS1.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS1.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-SEG_CONTENTS1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0090010-AF0090010form2-SEG_CONTENTS1" name='SEG_CONTENTS1' class='AF0090010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0090010Control.getStruct().getList_SEG_CONTENTS1_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS1_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS1_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0090010Struct.getSEG_CONTENTS1()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS2",rb)%></span><!-- セグメント2 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-SEG_CONTENTS2">
expj.AF0090010.AF0090010form2.SEG_CONTENTS2 = {};
expj.AF0090010.AF0090010form2.SEG_CONTENTS2.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS2.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.SEG_CONTENTS2.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-SEG_CONTENTS2').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0090010', 'AF0090010form2', 'SEG_CONTENTS2', this);
  });
  expj.AF0090010.AF0090010form2.SEG_CONTENTS2.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.SEG_CONTENTS2.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS2.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-SEG_CONTENTS2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0090010-AF0090010form2-SEG_CONTENTS2" name='SEG_CONTENTS2' class='AF0090010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0090010Control.getStruct().getList_SEG_CONTENTS2_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS2_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS2_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0090010Struct.getSEG_CONTENTS2()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS3",rb)%></span><!-- セグメント3 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-SEG_CONTENTS3">
expj.AF0090010.AF0090010form2.SEG_CONTENTS3 = {};
expj.AF0090010.AF0090010form2.SEG_CONTENTS3.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS3.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.SEG_CONTENTS3.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-SEG_CONTENTS3').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0090010', 'AF0090010form2', 'SEG_CONTENTS3', this);
  });
  expj.AF0090010.AF0090010form2.SEG_CONTENTS3.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.SEG_CONTENTS3.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS3.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-SEG_CONTENTS3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0090010-AF0090010form2-SEG_CONTENTS3" name='SEG_CONTENTS3' class='AF0090010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0090010Control.getStruct().getList_SEG_CONTENTS3_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS3_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS3_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0090010Struct.getSEG_CONTENTS3()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SEG_CONTENTS4",rb)%></span><!-- セグメント4 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form2-SEG_CONTENTS4">
expj.AF0090010.AF0090010form2.SEG_CONTENTS4 = {};
expj.AF0090010.AF0090010form2.SEG_CONTENTS4.executeAllOnDecision = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS4.onDecision');
  expj.AF0090010.AF0090010form2.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form2.SEG_CONTENTS4.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form2-SEG_CONTENTS4').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AF0090010', 'AF0090010form2', 'SEG_CONTENTS4', this);
  });
  expj.AF0090010.AF0090010form2.SEG_CONTENTS4.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form2.SEG_CONTENTS4.executePScriptOnLoad = function () {
  console.log('execute AF0090010form2/SEG_CONTENTS4.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form2-SEG_CONTENTS4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AF0090010-AF0090010form2-SEG_CONTENTS4" name='SEG_CONTENTS4' class='AF0090010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAF0090010Control.getStruct().getList_SEG_CONTENTS4_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS4_name().get(i));    String val = TypeConverter.sanitizer((String)aAF0090010Control.getStruct().getList_SEG_CONTENTS4_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAF0090010Struct.getSEG_CONTENTS4()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style=""></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0090010-AF0090010button2">
expj.AF0090010.AF0090010button2 = {};
expj.AF0090010.AF0090010button2.executeAllOnDecision = function () {
  console.log('execute AF0090010button2.onDecision');
};
expj.AF0090010.AF0090010button2.executeOnLoad = function () {
  expj.AF0090010.AF0090010button2.executePScriptOnLoad();
};

expj.AF0090010.AF0090010button2.executePScriptOnLoad = function () {
  console.log('execute AF0090010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0090010-AF0090010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0090010-AF0090010button2-insert">
expj.AF0090010.AF0090010button2.insert = {};
// script1="onClick;0;CHK;_AF0090010form2/RCV_ISSUE_QTY[numeq]0@#AF00146"
expj.AF0090010.AF0090010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form2/RCV_ISSUE_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AF0090010', 'AF0090010button2', 'AF00146');
}
};
// script2="onClick;1;CHK;_AF0090010form2/RCV_ISSUE_DATE[gt]_AF0090010form1/BUSINESS_OPR_DATE@#ZZ05103"
expj.AF0090010.AF0090010button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form2/RCV_ISSUE_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form1/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AF0090010', 'AF0090010button2', 'ZZ05103');
}
};
// script3="onClick;2;CHK;_AF0090010form1/c_JOB_ODR_CD[eq]true@*0,*1"
expj.AF0090010.AF0090010button2.insert.onClick2 = function () {
  console.log('insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form1/c_JOB_ODR_CD'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onClick;3;CHK;_AF0090010form2/c_RCV_ISSUE_QTY[eq]true@*2,*3"
expj.AF0090010.AF0090010button2.insert.onClick3 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form2/c_RCV_ISSUE_QTY'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0090010form1/*,_AF0090010form2/*,_AF0090010form3/*@AF0090010Servlet,,$ZZ07001"
expj.AF0090010.AF0090010button2.insert.onClick4 = function () {
  console.log('insert script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0090010', 'AF0090010button2', '_AF0090010form1/*,_AF0090010form2/*,_AF0090010form3/*', 'AF0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0090010', response);
expj.common.updateBusinessScreenTab('AF0090010', contents);
};
expj.common.pscript.callConfirm('AF0090010', 'AF0090010button2', 'ZZ07001', okEvent);
};
// script6="child;0;SET;_AF0090010form1/w_JOB_ODR=1"
expj.AF0090010.AF0090010button2.insert.child0 = function () {
  console.log('insert script6');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form1/w_JOB_ODR', '1');
};
// script7="child;1;SET;_AF0090010form1/w_JOB_ODR=0"
expj.AF0090010.AF0090010button2.insert.child1 = function () {
  console.log('insert script7');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form1/w_JOB_ODR', '0');
};
// script8="child;2;SET;_AF0090010form1/w_INFERIOR=1"
expj.AF0090010.AF0090010button2.insert.child2 = function () {
  console.log('insert script8');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form1/w_INFERIOR', '1');
};
// script9="child;3;SET;_AF0090010form1/w_INFERIOR=0"
expj.AF0090010.AF0090010button2.insert.child3 = function () {
  console.log('insert script9');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010button2', '_AF0090010form1/w_INFERIOR', '0');
};
expj.AF0090010.AF0090010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010button2.insert['onClick' + i])) {
        expj.AF0090010.AF0090010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010button2.insert.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010button2.insert.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010button2', 'insert', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010button2.insert.executePScriptOnLoad();
};

expj.AF0090010.AF0090010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AF0090010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0090010-AF0090010button2-insert" name="insert" class="AF0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<%
    String ColKind1 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind2 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind3 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind4 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind5 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind6 = "OBT_NUMBER;14.1;FLOOR;4";
	String ColKind7 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind8 = "OBT_NUMBER;14.1;FLOOR;4";
    String ColKind9 = "OBT_NUMBER;14.1;FLOOR;4";

    if(aAF0090010Struct.getw_WH_STOCK_ON_HAND_QTY() == null){
        ColKind1 ="";
    }

    if((("1").equals(aAF0090010Struct.getw_JOB_ODR().toString()) == true) || (aAF0090010Struct.getDEFECT_QTY() == null)){
        ColKind2 ="";
    }

    if(aAF0090010Struct.getw_TOTAL_STOCK_ON_HAND_QTY() == null){
        ColKind3 ="";
    }

    if((("1").equals(aAF0090010Struct.getw_JOB_ODR().toString()) == true) || (aAF0090010Struct.getw_TOTAL_DEFECT_QTY() == null)){
        ColKind4 ="";
    }

    if(aAF0090010Struct.getALC_POS_QTY() == null){
        ColKind5 ="";
    }

    if(aAF0090010Struct.getTHIS_TIME_POS_QTY() == null){
        ColKind6 ="";
    }
	if(aAF0090010Struct.getLOT_STOCK_ON_HAND_QTY() == null){
        ColKind7 ="";
    }
	
	if(aAF0090010Struct.getLOT_DEFECT_QTY() == null){
	    ColKind8 ="";
    }

	if(aAF0090010Struct.getALLOCABLE_QTY() == null){
        ColKind9 ="";
    }
%><div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AF0090010-AF0090010form3">
expj.AF0090010.AF0090010form3 = {};
expj.AF0090010.AF0090010form3.executeAllOnDecision = function () {
  console.log('execute AF0090010form3.onDecision');
};
expj.AF0090010.AF0090010form3.executeOnLoad = function () {
  expj.AF0090010.AF0090010form3.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0090010-AF0090010form3" action="AF0090010Servlet" name="AF0090010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-DRAW_CD">
expj.AF0090010.AF0090010form3.DRAW_CD = {};
expj.AF0090010.AF0090010form3.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/DRAW_CD.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.DRAW_CD.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'DRAW_CD', this);
  });
  expj.AF0090010.AF0090010form3.DRAW_CD.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-DRAW_CD" name="DRAW_CD" class="AF0090010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-SPEC">
expj.AF0090010.AF0090010form3.SPEC = {};
expj.AF0090010.AF0090010form3.SPEC.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/SPEC.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.SPEC.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'SPEC', this);
  });
  expj.AF0090010.AF0090010form3.SPEC.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.SPEC.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-SPEC" name="SPEC" class="AF0090010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_3",rb)%></span><!-- 保管区在庫数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-w_WH_STOCK_ON_HAND_QTY">
expj.AF0090010.AF0090010form3.w_WH_STOCK_ON_HAND_QTY = {};
expj.AF0090010.AF0090010form3.w_WH_STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/w_WH_STOCK_ON_HAND_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.w_WH_STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-w_WH_STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'w_WH_STOCK_ON_HAND_QTY', this);
  });
  expj.AF0090010.AF0090010form3.w_WH_STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.w_WH_STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/w_WH_STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-w_WH_STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-w_WH_STOCK_ON_HAND_QTY" name="w_WH_STOCK_ON_HAND_QTY" class="AF0090010-focus-move expj-align-right " style="width:150px;" data-kind="<%= ColKind1 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getw_WH_STOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_1">
expj.AF0090010.AF0090010form3.STOCK_UNIT_1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_1.onLoad0 = function () {
  console.log('STOCK_UNIT_1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_1.child0 = function () {
  console.log('STOCK_UNIT_1 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_1.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_1.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_1', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_1.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_1['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_1" name="STOCK_UNIT_1" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_5",rb)%></span><!-- ロット別手持在庫数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-LOT_STOCK_ON_HAND_QTY">
expj.AF0090010.AF0090010form3.LOT_STOCK_ON_HAND_QTY = {};
expj.AF0090010.AF0090010form3.LOT_STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/LOT_STOCK_ON_HAND_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.LOT_STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-LOT_STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'LOT_STOCK_ON_HAND_QTY', this);
  });
  expj.AF0090010.AF0090010form3.LOT_STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.LOT_STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/LOT_STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-LOT_STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-LOT_STOCK_ON_HAND_QTY" name="LOT_STOCK_ON_HAND_QTY" class="AF0090010-focus-move  " style="width:150px;" data-kind="<%= ColKind7 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getLOT_STOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_7">
expj.AF0090010.AF0090010form3.STOCK_UNIT_7 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_7.onLoad0 = function () {
  console.log('STOCK_UNIT_7 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_7.child0 = function () {
  console.log('STOCK_UNIT_7 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_7.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_7.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_7.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_7').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_7', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_7.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_7.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_7.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_7');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_7['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_7['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_7" name="STOCK_UNIT_7" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_QTY_5",rb)%></span><!-- 保管区不良品在庫数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-DEFECT_QTY">
expj.AF0090010.AF0090010form3.DEFECT_QTY = {};
expj.AF0090010.AF0090010form3.DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/DEFECT_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'DEFECT_QTY', this);
  });
  expj.AF0090010.AF0090010form3.DEFECT_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-DEFECT_QTY" name="DEFECT_QTY" class="AF0090010-focus-move expj-align-right " style="width:150px;" data-kind="<%= ColKind2 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getDEFECT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_2">
expj.AF0090010.AF0090010form3.STOCK_UNIT_2 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_2.onLoad0 = function () {
  console.log('STOCK_UNIT_2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_2.child0 = function () {
  console.log('STOCK_UNIT_2 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_2.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_2.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_2', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_2.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_2['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_2" name="STOCK_UNIT_2" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DEFECT_QTY_6",rb)%></span><!-- ロット別不良数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-LOT_DEFECT_QTY">
expj.AF0090010.AF0090010form3.LOT_DEFECT_QTY = {};
expj.AF0090010.AF0090010form3.LOT_DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/LOT_DEFECT_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.LOT_DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-LOT_DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'LOT_DEFECT_QTY', this);
  });
  expj.AF0090010.AF0090010form3.LOT_DEFECT_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.LOT_DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/LOT_DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-LOT_DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-LOT_DEFECT_QTY" name="LOT_DEFECT_QTY" class="AF0090010-focus-move  " style="width:150px;" data-kind="<%= ColKind8 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getLOT_DEFECT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_8">
expj.AF0090010.AF0090010form3.STOCK_UNIT_8 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_8.onLoad0 = function () {
  console.log('STOCK_UNIT_8 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_8.child0 = function () {
  console.log('STOCK_UNIT_8 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_8.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_8.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_8.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_8').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_8', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_8.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_8.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_8.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_8');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_8['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_8['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_8" name="STOCK_UNIT_8" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0306",rb)%></span><!-- 在庫累計数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-w_TOTAL_STOCK_ON_HAND_QTY">
expj.AF0090010.AF0090010form3.w_TOTAL_STOCK_ON_HAND_QTY = {};
expj.AF0090010.AF0090010form3.w_TOTAL_STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/w_TOTAL_STOCK_ON_HAND_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.w_TOTAL_STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-w_TOTAL_STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'w_TOTAL_STOCK_ON_HAND_QTY', this);
  });
  expj.AF0090010.AF0090010form3.w_TOTAL_STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.w_TOTAL_STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/w_TOTAL_STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-w_TOTAL_STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-w_TOTAL_STOCK_ON_HAND_QTY" name="w_TOTAL_STOCK_ON_HAND_QTY" class="AF0090010-focus-move expj-align-right " style="width:150px;" data-kind="<%= ColKind3 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getw_TOTAL_STOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_3">
expj.AF0090010.AF0090010form3.STOCK_UNIT_3 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_3.onLoad0 = function () {
  console.log('STOCK_UNIT_3 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_3.child0 = function () {
  console.log('STOCK_UNIT_3 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_3.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_3.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_3.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_3', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_3.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_3.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_3.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_3['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_3['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_3" name="STOCK_UNIT_3" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0340",rb)%></span><!-- 出庫可能数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-ALLOCABLE_QTY">
expj.AF0090010.AF0090010form3.ALLOCABLE_QTY = {};
expj.AF0090010.AF0090010form3.ALLOCABLE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/ALLOCABLE_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.ALLOCABLE_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-ALLOCABLE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'ALLOCABLE_QTY', this);
  });
  expj.AF0090010.AF0090010form3.ALLOCABLE_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.ALLOCABLE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/ALLOCABLE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-ALLOCABLE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-ALLOCABLE_QTY" name="ALLOCABLE_QTY" class="AF0090010-focus-move  " style="width:150px;" data-kind="<%= ColKind9 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getALLOCABLE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_9">
expj.AF0090010.AF0090010form3.STOCK_UNIT_9 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_9.onLoad0 = function () {
  console.log('STOCK_UNIT_9 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_9.child0 = function () {
  console.log('STOCK_UNIT_9 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_9.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_9.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_9.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_9').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_9', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_9.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_9.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_9.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_9');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_9['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_9['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_9" name="STOCK_UNIT_9" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0315",rb)%></span><!-- 不良品在庫累計数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-w_TOTAL_DEFECT_QTY">
expj.AF0090010.AF0090010form3.w_TOTAL_DEFECT_QTY = {};
expj.AF0090010.AF0090010form3.w_TOTAL_DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/w_TOTAL_DEFECT_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.w_TOTAL_DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-w_TOTAL_DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'w_TOTAL_DEFECT_QTY', this);
  });
  expj.AF0090010.AF0090010form3.w_TOTAL_DEFECT_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.w_TOTAL_DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/w_TOTAL_DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-w_TOTAL_DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-w_TOTAL_DEFECT_QTY" name="w_TOTAL_DEFECT_QTY" class="AF0090010-focus-move expj-align-right " style="width:150px;" data-kind="<%= ColKind4 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getw_TOTAL_DEFECT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_4">
expj.AF0090010.AF0090010form3.STOCK_UNIT_4 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_4.onLoad0 = function () {
  console.log('STOCK_UNIT_4 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_4.child0 = function () {
  console.log('STOCK_UNIT_4 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_4.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_4.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_4.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_4', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_4.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_4.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_4.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_4['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_4['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_4" name="STOCK_UNIT_4" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0348",rb)%></span><!-- 品目別出庫可能数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-ALC_POS_QTY">
expj.AF0090010.AF0090010form3.ALC_POS_QTY = {};
expj.AF0090010.AF0090010form3.ALC_POS_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/ALC_POS_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.ALC_POS_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-ALC_POS_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'ALC_POS_QTY', this);
  });
  expj.AF0090010.AF0090010form3.ALC_POS_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.ALC_POS_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/ALC_POS_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-ALC_POS_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-ALC_POS_QTY" name="ALC_POS_QTY" class="AF0090010-focus-move expj-align-right " style="width:150px;" data-kind="<%= ColKind5 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getALC_POS_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_5">
expj.AF0090010.AF0090010form3.STOCK_UNIT_5 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_5.onLoad0 = function () {
  console.log('STOCK_UNIT_5 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_5.child0 = function () {
  console.log('STOCK_UNIT_5 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_5.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_5.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_5.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_5', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_5.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_5.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_5.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_5['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_5['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_5" name="STOCK_UNIT_5" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0349",rb)%></span><!-- 保管区出庫可能数 --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-THIS_TIME_POS_QTY">
expj.AF0090010.AF0090010form3.THIS_TIME_POS_QTY = {};
expj.AF0090010.AF0090010form3.THIS_TIME_POS_QTY.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/THIS_TIME_POS_QTY.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.THIS_TIME_POS_QTY.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-THIS_TIME_POS_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'THIS_TIME_POS_QTY', this);
  });
  expj.AF0090010.AF0090010form3.THIS_TIME_POS_QTY.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.THIS_TIME_POS_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/THIS_TIME_POS_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-THIS_TIME_POS_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-THIS_TIME_POS_QTY" name="THIS_TIME_POS_QTY" class="AF0090010-focus-move expj-align-right " style="width:150px;" data-kind="<%= ColKind6 %>" value="<%= TypeConverter.sanitizer(aAF0090010Struct.getTHIS_TIME_POS_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010form3-STOCK_UNIT_6">
expj.AF0090010.AF0090010form3.STOCK_UNIT_6 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0090010.AF0090010form3.STOCK_UNIT_6.onLoad0 = function () {
  console.log('STOCK_UNIT_6 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0090010form2/STOCK_UNIT"
expj.AF0090010.AF0090010form3.STOCK_UNIT_6.child0 = function () {
  console.log('STOCK_UNIT_6 script2');
expj.common.pscript.setReferenceComponentValue('AF0090010', 'AF0090010form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0090010', 'AF0090010form3', '_AF0090010form2/STOCK_UNIT'));
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_6.executeAllOnDecision = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_6.onDecision');
  expj.AF0090010.AF0090010form3.executeAllOnDecision();
  expj.AF0090010.executeAllOnDecision();
};
expj.AF0090010.AF0090010form3.STOCK_UNIT_6.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010form3-STOCK_UNIT_6').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0090010', 'AF0090010form3', 'STOCK_UNIT_6', this);
  });
  expj.AF0090010.AF0090010form3.STOCK_UNIT_6.executePScriptOnLoad();
};

expj.AF0090010.AF0090010form3.STOCK_UNIT_6.executePScriptOnLoad = function () {
  console.log('execute AF0090010form3/STOCK_UNIT_6.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010form3-STOCK_UNIT_6');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0090010.AF0090010form3.STOCK_UNIT_6['onLoad' + i])) {
      expj.AF0090010.AF0090010form3.STOCK_UNIT_6['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0090010-AF0090010form3-STOCK_UNIT_6" name="STOCK_UNIT_6" class="AF0090010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
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
<div class="expj-tr" style="height:5px"><div class="expj-td" style=""></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 200px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0090010 Revision: 1.11  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AF0090010-AF0090010button0">
expj.AF0090010.AF0090010button0 = {};
expj.AF0090010.AF0090010button0.executeAllOnDecision = function () {
  console.log('execute AF0090010button0.onDecision');
};
expj.AF0090010.AF0090010button0.executeOnLoad = function () {
  expj.AF0090010.AF0090010button0.executePScriptOnLoad();
};

expj.AF0090010.AF0090010button0.executePScriptOnLoad = function () {
  console.log('execute AF0090010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0090010-AF0090010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0090010-AF0090010button0-clear">
expj.AF0090010.AF0090010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AF0090010Servlet,,$ZZ07008"
expj.AF0090010.AF0090010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0090010', 'AF0090010button0', '', 'AF0090010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0090010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0090010', response);
expj.common.updateBusinessScreenTab('AF0090010', contents);
};
expj.common.pscript.callConfirm('AF0090010', 'AF0090010button0', 'ZZ07008', okEvent);
};
expj.AF0090010.AF0090010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010button0.clear['onClick' + i])) {
        expj.AF0090010.AF0090010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010button0.clear.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010button0.clear.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010button0', 'clear', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010button0.clear.executePScriptOnLoad();
};

expj.AF0090010.AF0090010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AF0090010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0090010-AF0090010button0-clear" name="clear" class="AF0090010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AF0090010-AF0090010button0-close">
expj.AF0090010.AF0090010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AF0090010.AF0090010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AF0090010');
};
expj.AF0090010.AF0090010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0090010.AF0090010button0.close['onClick' + i])) {
        expj.AF0090010.AF0090010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AF0090010.AF0090010button0.close.executeAllOnDecision = function () {
};
expj.AF0090010.AF0090010button0.close.executeOnLoad = function () {
  $('#expj-AF0090010-AF0090010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0090010', 'AF0090010button0', 'close', this, 'Button');
    }
  });
  expj.AF0090010.AF0090010button0.close.executePScriptOnLoad();
};

expj.AF0090010.AF0090010button0.close.executePScriptOnLoad = function () {
  console.log('execute AF0090010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AF0090010-AF0090010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0090010-AF0090010button0-close" name="close" class="AF0090010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0090010 (END)-->
<%
MessageStruct msgStruct = aAF0090010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0090010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0090010)) {
  expj.common.treeInstanceMap.AF0090010 = {};
}
expj.common.treeInstanceMap.AF0090010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0090010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0090010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0090010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0090010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0090010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0090010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0090010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0090010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0090010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0090010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0090010)) {
  expj.common.detailDialogMap.AF0090010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0090010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0090010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0090010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0090010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0090010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0090010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0090010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0090010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0090010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0090010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0090010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0090010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0090010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0090010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0090010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0090010)) {
  expj.common.viewInstanceMap.AF0090010 = {};
}
expj.common.viewInstanceMap.AF0090010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0090010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0090010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0090010.<%=viewId %>.init = function () {
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
    expj.AF0090010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0090010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0090010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0090010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0090010_init">
/**
 * AF0090010用のロード完了時初期化関数
 */
expj.AF0090010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0090010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0090010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0090010');
  expj.common.calendarInstanceMap.AF0090010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0090010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0090010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0090010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0090010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0090010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0090010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0090010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0090010.AF0090010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.PeekerJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.c_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.w_JOB_ODR.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.w_INFERIOR.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.PeekerWStockLotCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.h_lotFlg.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.h_LotCtrl.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010button1.select.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.RCV_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.c_RCV_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.RCV_ISSUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.CalendarRcvIssueDate.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.NON_PLANNED_CAUSE_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.PeekerNonPlannedcd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.c_ISSUE_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.ISSUE_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.PeekerIssueItemCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.ISSUE_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.PeekerIssueJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.ISSUE_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.PeekerIssueProcCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.ACCT_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.DEPT_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.PeekerDeptCd.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.DEPT_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.PJ_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.SEG_CONTENTS1.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.SEG_CONTENTS2.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.SEG_CONTENTS3.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.SEG_CONTENTS4.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.SPEC.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.w_WH_STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.LOT_STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_7.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.LOT_DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_8.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.w_TOTAL_STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_3.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.ALLOCABLE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_9.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.w_TOTAL_DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_4.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.ALC_POS_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_5.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.THIS_TIME_POS_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.STOCK_UNIT_6.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010button0.close.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form1.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010button1.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form2.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010button2.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010form3.executeOnLoad();}catch(e){};
  try{expj.AF0090010.AF0090010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0090010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0090010', 'AF0090010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0090010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0090010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0090010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0090010', '<%=request.getContextPath() %>');
};

/**
 * AF0090010の全体onDecision処理
 */
expj.AF0090010.executeAllOnDecision = function () {
  expj.AF0090010.AF0090010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0090010_console">
expj.AF0090010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>