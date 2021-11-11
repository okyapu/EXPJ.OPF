<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:42:01 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AH0020\AH0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AH0020.*" %>
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
<jsp:useBean id="aAH0020010Control" class="com.nec.jp.orteus.metamorBase.AH0020.AH0020010Control" scope="request"/>
<jsp:useBean id="aAH0020010Struct" class="com.nec.jp.orteus.metamorBase.AH0020.AH0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

棚卸条件メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0020/jsp/AH0020010.jsp,v $
$Author: geng-jia $	
$Revision: 1.7 $ $Date: 2017/02/22 02:06:03 $
********************************************************* --%>
<html>
<head>
<title>棚卸条件メンテナンス</title>
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
<script class="expj-script-AH0020010_init">
  // AH0020010名前空間
  expj.AH0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AH0020010" data-screen="AH0020010" data-newdata="<%=aAH0020010Control.isNewData() %>">
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
              <script class="expj-script-AH0020010-AH0020010form1">
expj.AH0020010.AH0020010form1 = {};
// script1="onLoad;0;CALL;child@0,6"
expj.AH0020010.AH0020010form1.onLoad0 = function () {
  console.log('AH0020010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child6)){this.child6();}
};
// script2="child;0;CHK;_AH0020010form1/h_REGULAR_INV_FLG[eq]1@*1,*2"
expj.AH0020010.AH0020010form1.child0 = function () {
  console.log('AH0020010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_REGULAR_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0020010form2/c_REGULAR_INV_FLG=true@*2"
expj.AH0020010.AH0020010form1.child1 = function () {
  console.log('AH0020010form1 script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;CHK;_AH0020010form1/h_CYCLE_INV_FLG[eq]1@*3,*4"
expj.AH0020010.AH0020010form1.child2 = function () {
  console.log('AH0020010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_CYCLE_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;SET;_AH0020010form2/c_CYCLE_INV_FLG=true@*4"
expj.AH0020010.AH0020010form1.child3 = function () {
  console.log('AH0020010form1 script5');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;CHK;_AH0020010form1/h_TEMP_INV_FLG[eq]1@*5"
expj.AH0020010.AH0020010form1.child4 = function () {
  console.log('AH0020010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_TEMP_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;5;SET;_AH0020010form2/c_TEMP_INV_FLG=true"
expj.AH0020010.AH0020010form1.child5 = function () {
  console.log('AH0020010form1 script7');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG', 'true');
};
// script8="child;6;CHK;_AH0020010form1/h_REGULAR_INV_FLG[eq]1[and]_AH0020010form1/h_CYCLE_INV_FLG[eq]1[and]_AH0020010form1/h_TEMP_INV_FLG[eq]1@*9,*7"
expj.AH0020010.AH0020010form1.child6 = function () {
  console.log('AH0020010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_REGULAR_INV_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_CYCLE_INV_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_TEMP_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="child;7;CHK;_AH0020010form1/h_REGULAR_INV_FLG[eq]1[and]_AH0020010form1/h_CYCLE_INV_FLG[eq]1@*9,*8"
expj.AH0020010.AH0020010form1.child7 = function () {
  console.log('AH0020010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_REGULAR_INV_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_CYCLE_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;8;CHK;_AH0020010form1/h_REGULAR_INV_FLG[eq]1[and]_AH0020010form1/h_TEMP_INV_FLG[eq]1@*9,*11"
expj.AH0020010.AH0020010form1.child8 = function () {
  console.log('AH0020010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_REGULAR_INV_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_TEMP_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script11="child;9;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*10"
expj.AH0020010.AH0020010form1.child9 = function () {
  console.log('AH0020010form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script12="child;10;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form1.child10 = function () {
  console.log('AH0020010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script13="child;11;CHK;_AH0020010form1/h_REGULAR_INV_FLG[neq]1[and]_AH0020010form1/h_CYCLE_INV_FLG[neq]1[and]_AH0020010form1/h_TEMP_INV_FLG[neq]1@*12,*13"
expj.AH0020010.AH0020010form1.child11 = function () {
  console.log('AH0020010form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_REGULAR_INV_FLG'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_CYCLE_INV_FLG'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_TEMP_INV_FLG'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script14="child;12;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG,_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form1.child12 = function () {
  console.log('AH0020010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script15="child;13;CHK;_AH0020010form1/h_REGULAR_INV_FLG[eq]1@*14,*15"
expj.AH0020010.AH0020010form1.child13 = function () {
  console.log('AH0020010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_REGULAR_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script16="child;14;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*16"
expj.AH0020010.AH0020010form1.child14 = function () {
  console.log('AH0020010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script17="child;15;UNMASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*16"
expj.AH0020010.AH0020010form1.child15 = function () {
  console.log('AH0020010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child16)){this.child16();}}
};
// script18="child;16;CHK;_AH0020010form1/h_CYCLE_INV_FLG[eq]1@*17,*18"
expj.AH0020010.AH0020010form1.child16 = function () {
  console.log('AH0020010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_CYCLE_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script19="child;17;MASK;_AH0020010form2/c_REGULAR_INV_FLG@*20"
expj.AH0020010.AH0020010form1.child17 = function () {
  console.log('AH0020010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script20="child;18;CHK;_AH0020010form1/h_TEMP_INV_FLG[neq]1@*19,*20"
expj.AH0020010.AH0020010form1.child18 = function () {
  console.log('AH0020010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_TEMP_INV_FLG'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script21="child;19;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*20"
expj.AH0020010.AH0020010form1.child19 = function () {
  console.log('AH0020010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script22="child;20;CHK;_AH0020010form1/h_TEMP_INV_FLG[eq]1@*21,*22"
expj.AH0020010.AH0020010form1.child20 = function () {
  console.log('AH0020010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_TEMP_INV_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script23="child;21;MASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form1.child21 = function () {
  console.log('AH0020010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG');
};
// script24="child;22;CHK;_AH0020010form1/h_CYCLE_INV_FLG[neq]1@*23"
expj.AH0020010.AH0020010form1.child22 = function () {
  console.log('AH0020010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_CYCLE_INV_FLG'), '[neq]', '1')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script25="child;23;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form1.child23 = function () {
  console.log('AH0020010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG');
};
// script26="onLoad;1;CALL;onDecision@0,1"
expj.AH0020010.AH0020010form1.onLoad1 = function () {
  console.log('AH0020010form1 script26');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script27="onDecision;0;CHKRQ;A@*24,*25"
expj.AH0020010.AH0020010form1.onDecision0 = function () {
  console.log('AH0020010form1 script27');
if (expj.common.pscript.satisfiedRequiredComponent('AH0020010', 'A')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script28="child;24;UNMASK;_AH0020010button1/select"
expj.AH0020010.AH0020010form1.child24 = function () {
  console.log('AH0020010form1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button1/select');
};
// script29="child;25;MASK;_AH0020010button1/select"
expj.AH0020010.AH0020010form1.child25 = function () {
  console.log('AH0020010form1 script29');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button1/select');
};
// script30="onDecision;1;CHKRQ;A@*26,*50"
expj.AH0020010.AH0020010form1.onDecision1 = function () {
  console.log('AH0020010form1 script30');
if (expj.common.pscript.satisfiedRequiredComponent('AH0020010', 'A')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child50)){this.child50();}
}
};
// script31="child;26;CHK;?AH0020010form1/*[eq]NORMAL@*27,*44"
expj.AH0020010.AH0020010form1.child26 = function () {
  console.log('AH0020010form1 script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '?AH0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
} else {
if(expj.common.checkNameSpace(this.child44)){this.child44();}
}
};
// script32="child;27;CHK;_AH0020010form1/INV_DATE[eq]_AH0020010form1/h_saveINV_DATE@*28,*44"
expj.AH0020010.AH0020010form1.child27 = function () {
  console.log('AH0020010form1 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/INV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_saveINV_DATE'))) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
} else {
if(expj.common.checkNameSpace(this.child44)){this.child44();}
}
};
// script33="child;28;CHK;_AH0020010form1/h_saveTEMP_INV_FLG[eq]1[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*29,*30"
expj.AH0020010.AH0020010form1.child28 = function () {
  console.log('AH0020010form1 script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_saveTEMP_INV_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script34="child;29;UNMASK;_AH0020010button2/select_wh,_AH0020010button2/select_item@*31"
expj.AH0020010.AH0020010form1.child29 = function () {
  console.log('AH0020010form1 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_wh');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_item');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child31)){this.child31();}}
};
// script35="child;30;MASK;_AH0020010button2/select_wh,_AH0020010button2/select_item@*31"
expj.AH0020010.AH0020010form1.child30 = function () {
  console.log('AH0020010form1 script35');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_wh');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_item');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child31)){this.child31();}}
};
// script36="child;31;CHK;_AH0020010form1/h_saveINV_STS_TYP[eq]0@*32,*40"
expj.AH0020010.AH0020010form1.child31 = function () {
  console.log('AH0020010form1 script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_saveINV_STS_TYP'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
} else {
if(expj.common.checkNameSpace(this.child40)){this.child40();}
}
};
// script37="child;32;CHK;_AH0020010form2/c_REGULAR_INV_FLG[neq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[neq]true[and]_AH0020010form2/c_TEMP_INV_FLG[neq]true@*38,*33"
expj.AH0020010.AH0020010form1.child32 = function () {
  console.log('AH0020010form1 script37');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child38)){this.child38();}
} else {
if(expj.common.checkNameSpace(this.child33)){this.child33();}
}
};
// script38="child;33;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*38,*34"
expj.AH0020010.AH0020010form1.child33 = function () {
  console.log('AH0020010form1 script38');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child38)){this.child38();}
} else {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
}
};
// script39="child;34;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*38,*35"
expj.AH0020010.AH0020010form1.child34 = function () {
  console.log('AH0020010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child38)){this.child38();}
} else {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
}
};
// script40="child;35;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*38,*36"
expj.AH0020010.AH0020010form1.child35 = function () {
  console.log('AH0020010form1 script40');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child38)){this.child38();}
} else {
if(expj.common.checkNameSpace(this.child36)){this.child36();}
}
};
// script41="child;36;UNMASK;_AH0020010button2/update,_AH0020010button2/delete@*37"
expj.AH0020010.AH0020010form1.child36 = function () {
  console.log('AH0020010form1 script41');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/update');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child37)){this.child37();}}
};
// script42="child;37;MASK;_AH0020010button2/insert"
expj.AH0020010.AH0020010form1.child37 = function () {
  console.log('AH0020010form1 script42');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/insert');
};
// script43="child;38;UNMASK;_AH0020010button2/delete@*39"
expj.AH0020010.AH0020010form1.child38 = function () {
  console.log('AH0020010form1 script43');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child39)){this.child39();}}
};
// script44="child;39;MASK;_AH0020010button2/insert,_AH0020010button2/update"
expj.AH0020010.AH0020010form1.child39 = function () {
  console.log('AH0020010form1 script44');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/update');
};
// script45="child;40;CHK;_AH0020010form1/h_saveINV_STS_TYP[eq]1@*41,*42"
expj.AH0020010.AH0020010form1.child40 = function () {
  console.log('AH0020010form1 script45');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form1/h_saveINV_STS_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child41)){this.child41();}
} else {
if(expj.common.checkNameSpace(this.child42)){this.child42();}
}
};
// script46="child;41;MASK;_AH0020010button2/insert,_AH0020010button2/update,_AH0020010button2/delete"
expj.AH0020010.AH0020010form1.child41 = function () {
  console.log('AH0020010form1 script46');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/delete');
};
// script47="child;42;UNMASK;_AH0020010button2/delete@*43"
expj.AH0020010.AH0020010form1.child42 = function () {
  console.log('AH0020010form1 script47');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child43)){this.child43();}}
};
// script48="child;43;MASK;_AH0020010button2/insert,_AH0020010button2/update"
expj.AH0020010.AH0020010form1.child43 = function () {
  console.log('AH0020010form1 script48');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/update');
};
// script49="child;44;CHK;_AH0020010form2/c_REGULAR_INV_FLG[neq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[neq]true[and]_AH0020010form2/c_TEMP_INV_FLG[neq]true@*50,*45"
expj.AH0020010.AH0020010form1.child44 = function () {
  console.log('AH0020010form1 script49');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child50)){this.child50();}
} else {
if(expj.common.checkNameSpace(this.child45)){this.child45();}
}
};
// script50="child;45;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*50,*46"
expj.AH0020010.AH0020010form1.child45 = function () {
  console.log('AH0020010form1 script50');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child50)){this.child50();}
} else {
if(expj.common.checkNameSpace(this.child46)){this.child46();}
}
};
// script51="child;46;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*50,*47"
expj.AH0020010.AH0020010form1.child46 = function () {
  console.log('AH0020010form1 script51');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child50)){this.child50();}
} else {
if(expj.common.checkNameSpace(this.child47)){this.child47();}
}
};
// script52="child;47;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*50,*48"
expj.AH0020010.AH0020010form1.child47 = function () {
  console.log('AH0020010form1 script52');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form1', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child50)){this.child50();}
} else {
if(expj.common.checkNameSpace(this.child48)){this.child48();}
}
};
// script53="child;48;UNMASK;_AH0020010button2/insert@*49"
expj.AH0020010.AH0020010form1.child48 = function () {
  console.log('AH0020010form1 script53');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child49)){this.child49();}}
};
// script54="child;49;MASK;_AH0020010button2/update,_AH0020010button2/delete,_AH0020010button2/select_wh,_AH0020010button2/select_item"
expj.AH0020010.AH0020010form1.child49 = function () {
  console.log('AH0020010form1 script54');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_wh');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_item');
};
// script55="child;50;MASK;_AH0020010button2/insert,_AH0020010button2/update,_AH0020010button2/delete,_AH0020010button2/select_wh,_AH0020010button2/select_item"
expj.AH0020010.AH0020010form1.child50 = function () {
  console.log('AH0020010form1 script55');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/update');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_wh');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form1', '_AH0020010button2/select_item');
};
expj.AH0020010.AH0020010form1.executeAllOnDecision = function () {
  console.log('execute AH0020010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010form1['onDecision' + i])) {
        expj.AH0020010.AH0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010form1.executeOnLoad = function () {
  expj.AH0020010.AH0020010form1.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AH0020010.AH0020010form1['onLoad' + i])) {
      expj.AH0020010.AH0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0020010-AH0020010form1" action="AH0020010Servlet" name="AH0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAH0020010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:80px;align:"></div>
<div class="div-td" style="width:4px;align:"></div>
<div class="div-td" style="width:4px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.INV_DATE",rb)%></span><!-- 棚卸日 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form1-INV_DATE">
expj.AH0020010.AH0020010form1.INV_DATE = {};
expj.AH0020010.AH0020010form1.INV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/INV_DATE.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.INV_DATE.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-INV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'INV_DATE', this);
  });
  expj.AH0020010.AH0020010form1.INV_DATE.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.INV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/INV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-INV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020010form1-INV_DATE" name="INV_DATE" class="AH0020010-focus-move  required-value expj-AH0020010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getINV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form1-CalendarINV_DATE">
expj.AH0020010.AH0020010form1.CalendarINV_DATE = {};
// script1="onClick;0;CALENDAR;_AH0020010form1/INV_DATE"
expj.AH0020010.AH0020010form1.CalendarINV_DATE.onClick0 = function () {
  console.log('CalendarINV_DATE script1');
expj.common.pscript.executeCalendar('AH0020010','AH0020010form1','_AH0020010form1/INV_DATE');
};
expj.AH0020010.AH0020010form1.CalendarINV_DATE.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010form1.CalendarINV_DATE['onClick' + i])) {
        expj.AH0020010.AH0020010form1.CalendarINV_DATE['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010form1.CalendarINV_DATE.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010form1.CalendarINV_DATE.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-CalendarINV_DATE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010form1', 'CalendarINV_DATE', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AH0020010','AH0020010form1','_AH0020010form1/INV_DATE');
  expj.AH0020010.AH0020010form1.CalendarINV_DATE.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.CalendarINV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/CalendarINV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-CalendarINV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AH0020010-AH0020010form1-CalendarINV_DATE" class="AH0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form1-w_INV_STS_TYP">
expj.AH0020010.AH0020010form1.w_INV_STS_TYP = {};
expj.AH0020010.AH0020010form1.w_INV_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/w_INV_STS_TYP.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.w_INV_STS_TYP.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-w_INV_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'w_INV_STS_TYP', this);
  });
  expj.AH0020010.AH0020010form1.w_INV_STS_TYP.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.w_INV_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/w_INV_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-w_INV_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020010form1-w_INV_STS_TYP" name="w_INV_STS_TYP" class="AH0020010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getw_INV_STS_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AH0020010-AH0020010form1-h_INV_STS_TYP" name="h_INV_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_INV_STS_TYP()) %>">
<script class="expj-script-AH0020010-AH0020010form1-h_INV_STS_TYP">
expj.AH0020010.AH0020010form1.h_INV_STS_TYP = {};
expj.AH0020010.AH0020010form1.h_INV_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/h_INV_STS_TYP.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.h_INV_STS_TYP.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-h_INV_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'h_INV_STS_TYP', this);
  });
  expj.AH0020010.AH0020010form1.h_INV_STS_TYP.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.h_INV_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/h_INV_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-h_INV_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0020010-AH0020010form1-h_REGULAR_INV_FLG" name="h_REGULAR_INV_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_REGULAR_INV_FLG()) %>">
<script class="expj-script-AH0020010-AH0020010form1-h_REGULAR_INV_FLG">
expj.AH0020010.AH0020010form1.h_REGULAR_INV_FLG = {};
expj.AH0020010.AH0020010form1.h_REGULAR_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/h_REGULAR_INV_FLG.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.h_REGULAR_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-h_REGULAR_INV_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'h_REGULAR_INV_FLG', this);
  });
  expj.AH0020010.AH0020010form1.h_REGULAR_INV_FLG.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.h_REGULAR_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/h_REGULAR_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-h_REGULAR_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0020010-AH0020010form1-h_CYCLE_INV_FLG" name="h_CYCLE_INV_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_CYCLE_INV_FLG()) %>">
<script class="expj-script-AH0020010-AH0020010form1-h_CYCLE_INV_FLG">
expj.AH0020010.AH0020010form1.h_CYCLE_INV_FLG = {};
expj.AH0020010.AH0020010form1.h_CYCLE_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/h_CYCLE_INV_FLG.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.h_CYCLE_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-h_CYCLE_INV_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'h_CYCLE_INV_FLG', this);
  });
  expj.AH0020010.AH0020010form1.h_CYCLE_INV_FLG.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.h_CYCLE_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/h_CYCLE_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-h_CYCLE_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AH0020010-AH0020010form1-h_TEMP_INV_FLG" name="h_TEMP_INV_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_TEMP_INV_FLG()) %>">
<script class="expj-script-AH0020010-AH0020010form1-h_TEMP_INV_FLG">
expj.AH0020010.AH0020010form1.h_TEMP_INV_FLG = {};
expj.AH0020010.AH0020010form1.h_TEMP_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/h_TEMP_INV_FLG.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.h_TEMP_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-h_TEMP_INV_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'h_TEMP_INV_FLG', this);
  });
  expj.AH0020010.AH0020010form1.h_TEMP_INV_FLG.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.h_TEMP_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/h_TEMP_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-h_TEMP_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0020010-AH0020010form1-h_saveINV_DATE" name="h_saveINV_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_saveINV_DATE()) %>">
<script class="expj-script-AH0020010-AH0020010form1-h_saveINV_DATE">
expj.AH0020010.AH0020010form1.h_saveINV_DATE = {};
expj.AH0020010.AH0020010form1.h_saveINV_DATE.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/h_saveINV_DATE.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.h_saveINV_DATE.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-h_saveINV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'h_saveINV_DATE', this);
  });
  expj.AH0020010.AH0020010form1.h_saveINV_DATE.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.h_saveINV_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/h_saveINV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-h_saveINV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:80px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0020010-AH0020010form1-h_saveINV_STS_TYP" name="h_saveINV_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_saveINV_STS_TYP()) %>">
<script class="expj-script-AH0020010-AH0020010form1-h_saveINV_STS_TYP">
expj.AH0020010.AH0020010form1.h_saveINV_STS_TYP = {};
expj.AH0020010.AH0020010form1.h_saveINV_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/h_saveINV_STS_TYP.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.h_saveINV_STS_TYP.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-h_saveINV_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'h_saveINV_STS_TYP', this);
  });
  expj.AH0020010.AH0020010form1.h_saveINV_STS_TYP.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.h_saveINV_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/h_saveINV_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-h_saveINV_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:4px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AH0020010-AH0020010form1-h_saveTEMP_INV_FLG" name="h_saveTEMP_INV_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAH0020010Struct.geth_saveTEMP_INV_FLG()) %>">
<script class="expj-script-AH0020010-AH0020010form1-h_saveTEMP_INV_FLG">
expj.AH0020010.AH0020010form1.h_saveTEMP_INV_FLG = {};
expj.AH0020010.AH0020010form1.h_saveTEMP_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0020010form1/h_saveTEMP_INV_FLG.onDecision');
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form1.h_saveTEMP_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form1-h_saveTEMP_INV_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form1', 'h_saveTEMP_INV_FLG', this);
  });
  expj.AH0020010.AH0020010form1.h_saveTEMP_INV_FLG.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form1.h_saveTEMP_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0020010form1/h_saveTEMP_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form1-h_saveTEMP_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:4px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AH0020010-AH0020010button1">
expj.AH0020010.AH0020010button1 = {};
expj.AH0020010.AH0020010button1.executeAllOnDecision = function () {
  console.log('execute AH0020010button1.onDecision');
};
expj.AH0020010.AH0020010button1.executeOnLoad = function () {
  expj.AH0020010.AH0020010button1.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button1.executePScriptOnLoad = function () {
  console.log('execute AH0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0020010-AH0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0020010-AH0020010button1-select">
expj.AH0020010.AH0020010button1.select = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010button1.select.onClick0 = function () {
  console.log('select script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true@*1,*2"
expj.AH0020010.AH0020010button1.select.child0 = function () {
  console.log('select script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0020010form1/h_REGULAR_INV_FLG=1@*3"
expj.AH0020010.AH0020010button1.select.child1 = function () {
  console.log('select script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form1/h_REGULAR_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0020010form1/h_REGULAR_INV_FLG=0@*3"
expj.AH0020010.AH0020010button1.select.child2 = function () {
  console.log('select script4');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form1/h_REGULAR_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*4,*5"
expj.AH0020010.AH0020010button1.select.child3 = function () {
  console.log('select script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;SET;_AH0020010form1/h_CYCLE_INV_FLG=1@*6"
expj.AH0020010.AH0020010button1.select.child4 = function () {
  console.log('select script6');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form1/h_CYCLE_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;5;SET;_AH0020010form1/h_CYCLE_INV_FLG=0@*6"
expj.AH0020010.AH0020010button1.select.child5 = function () {
  console.log('select script7');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form1/h_CYCLE_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;CHK;_AH0020010form2/c_TEMP_INV_FLG[eq]true@*7,*8"
expj.AH0020010.AH0020010button1.select.child6 = function () {
  console.log('select script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;7;SET;_AH0020010form1/h_TEMP_INV_FLG=1@*9"
expj.AH0020010.AH0020010button1.select.child7 = function () {
  console.log('select script9');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form1/h_TEMP_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script10="child;8;SET;_AH0020010form1/h_TEMP_INV_FLG=0@*9"
expj.AH0020010.AH0020010button1.select.child8 = function () {
  console.log('select script10');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button1', '_AH0020010form1/h_TEMP_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*@AH0020010Servlet"
expj.AH0020010.AH0020010button1.select.child9 = function () {
  console.log('select script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020010button1', '_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.updateBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0020010.AH0020010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button1.select['onClick' + i])) {
        expj.AH0020010.AH0020010button1.select['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button1.select.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button1.select.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button1', 'select', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button1.select.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button1.select.executePScriptOnLoad = function () {
  console.log('execute AH0020010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button1-select" name="select" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AH0020010-AH0020010form2">
expj.AH0020010.AH0020010form2 = {};
expj.AH0020010.AH0020010form2.executeAllOnDecision = function () {
  console.log('execute AH0020010form2.onDecision');
};
expj.AH0020010.AH0020010form2.executeOnLoad = function () {
  expj.AH0020010.AH0020010form2.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form2.executePScriptOnLoad = function () {
  console.log('execute AH0020010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0020010-AH0020010form2" action="AH0020010Servlet" name="AH0020010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
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
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form2-c_REGULAR_INV_FLG">
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.onClick0 = function () {
  console.log('c_REGULAR_INV_FLG script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*3,*1"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child0 = function () {
  console.log('c_REGULAR_INV_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*3,*2"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child1 = function () {
  console.log('c_REGULAR_INV_FLG script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;2;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*3,*5"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child2 = function () {
  console.log('c_REGULAR_INV_FLG script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="child;3;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*4"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child3 = function () {
  console.log('c_REGULAR_INV_FLG script5');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child4 = function () {
  console.log('c_REGULAR_INV_FLG script6');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script7="child;5;CHK;_AH0020010form2/c_REGULAR_INV_FLG[neq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[neq]true[and]_AH0020010form2/c_TEMP_INV_FLG[neq]true@*6,*7"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child5 = function () {
  console.log('c_REGULAR_INV_FLG script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;6;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG,_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child6 = function () {
  console.log('c_REGULAR_INV_FLG script8');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script9="child;7;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true@*8,*9"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child7 = function () {
  console.log('c_REGULAR_INV_FLG script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;8;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*10"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child8 = function () {
  console.log('c_REGULAR_INV_FLG script10');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script11="child;9;UNMASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*10"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child9 = function () {
  console.log('c_REGULAR_INV_FLG script11');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script12="child;10;CHK;_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*11,*12"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child10 = function () {
  console.log('c_REGULAR_INV_FLG script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script13="child;11;MASK;_AH0020010form2/c_REGULAR_INV_FLG@*14"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child11 = function () {
  console.log('c_REGULAR_INV_FLG script13');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script14="child;12;CHK;_AH0020010form2/c_TEMP_INV_FLG[neq]true@*13,*14"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child12 = function () {
  console.log('c_REGULAR_INV_FLG script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script15="child;13;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*14"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child13 = function () {
  console.log('c_REGULAR_INV_FLG script15');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script16="child;14;CHK;_AH0020010form2/c_TEMP_INV_FLG[eq]true@*15,*16"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child14 = function () {
  console.log('c_REGULAR_INV_FLG script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script17="child;15;MASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child15 = function () {
  console.log('c_REGULAR_INV_FLG script17');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
};
// script18="child;16;CHK;_AH0020010form2/c_CYCLE_INV_FLG[neq]true@*17"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child16 = function () {
  console.log('c_REGULAR_INV_FLG script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="child;17;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.child17 = function () {
  console.log('c_REGULAR_INV_FLG script19');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
};
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG['onClick' + i])) {
        expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0020010form2/c_REGULAR_INV_FLG.onDecision');
  expj.AH0020010.AH0020010form2.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form2-c_REGULAR_INV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010form2', 'c_REGULAR_INV_FLG', this, 'CheckBox');
    }
  });
  expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0020010form2/c_REGULAR_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form2-c_REGULAR_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_REGULAR_INV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAH0020010Struct.getc_REGULAR_INV_FLG())) || "1".equals(TypeConverter.convert(aAH0020010Struct.getc_REGULAR_INV_FLG())))?"checked=\"checked\"":"" %>  class="AH0020010-focus-move" id="expj-AH0020010-AH0020010form2-c_REGULAR_INV_FLG"><label for="expj-AH0020010-AH0020010form2-c_REGULAR_INV_FLG"><%=CoreTools.getRBString("Expj.REGULAR_INV_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form2-c_CYCLE_INV_FLG">
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.onClick0 = function () {
  console.log('c_CYCLE_INV_FLG script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*3,*1"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child0 = function () {
  console.log('c_CYCLE_INV_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*3,*2"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child1 = function () {
  console.log('c_CYCLE_INV_FLG script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;2;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*3,*5"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child2 = function () {
  console.log('c_CYCLE_INV_FLG script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="child;3;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*4"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child3 = function () {
  console.log('c_CYCLE_INV_FLG script5');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child4 = function () {
  console.log('c_CYCLE_INV_FLG script6');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script7="child;5;CHK;_AH0020010form2/c_REGULAR_INV_FLG[neq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[neq]true[and]_AH0020010form2/c_TEMP_INV_FLG[neq]true@*6,*7"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child5 = function () {
  console.log('c_CYCLE_INV_FLG script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;6;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG,_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child6 = function () {
  console.log('c_CYCLE_INV_FLG script8');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script9="child;7;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true@*8,*9"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child7 = function () {
  console.log('c_CYCLE_INV_FLG script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;8;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*10"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child8 = function () {
  console.log('c_CYCLE_INV_FLG script10');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script11="child;9;UNMASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*10"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child9 = function () {
  console.log('c_CYCLE_INV_FLG script11');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script12="child;10;CHK;_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*11,*12"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child10 = function () {
  console.log('c_CYCLE_INV_FLG script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script13="child;11;MASK;_AH0020010form2/c_REGULAR_INV_FLG@*14"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child11 = function () {
  console.log('c_CYCLE_INV_FLG script13');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script14="child;12;CHK;_AH0020010form2/c_TEMP_INV_FLG[neq]true@*13,*14"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child12 = function () {
  console.log('c_CYCLE_INV_FLG script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script15="child;13;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*14"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child13 = function () {
  console.log('c_CYCLE_INV_FLG script15');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script16="child;14;CHK;_AH0020010form2/c_TEMP_INV_FLG[eq]true@*15,*16"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child14 = function () {
  console.log('c_CYCLE_INV_FLG script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script17="child;15;MASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child15 = function () {
  console.log('c_CYCLE_INV_FLG script17');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
};
// script18="child;16;CHK;_AH0020010form2/c_CYCLE_INV_FLG[neq]true@*17"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child16 = function () {
  console.log('c_CYCLE_INV_FLG script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="child;17;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.child17 = function () {
  console.log('c_CYCLE_INV_FLG script19');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
};
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG['onClick' + i])) {
        expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0020010form2/c_CYCLE_INV_FLG.onDecision');
  expj.AH0020010.AH0020010form2.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form2-c_CYCLE_INV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010form2', 'c_CYCLE_INV_FLG', this, 'CheckBox');
    }
  });
  expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0020010form2/c_CYCLE_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form2-c_CYCLE_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_CYCLE_INV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAH0020010Struct.getc_CYCLE_INV_FLG())) || "1".equals(TypeConverter.convert(aAH0020010Struct.getc_CYCLE_INV_FLG())))?"checked=\"checked\"":"" %>  class="AH0020010-focus-move" id="expj-AH0020010-AH0020010form2-c_CYCLE_INV_FLG"><label for="expj-AH0020010-AH0020010form2-c_CYCLE_INV_FLG"><%=CoreTools.getRBString("Expj.CYCLE_INV_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form2-c_TEMP_INV_FLG">
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.onClick0 = function () {
  console.log('c_TEMP_INV_FLG script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*3,*1"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child0 = function () {
  console.log('c_TEMP_INV_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*3,*2"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child1 = function () {
  console.log('c_TEMP_INV_FLG script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;2;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true[and]_AH0020010form2/c_TEMP_INV_FLG[eq]true@*3,*5"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child2 = function () {
  console.log('c_TEMP_INV_FLG script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script5="child;3;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*4"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child3 = function () {
  console.log('c_TEMP_INV_FLG script5');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script6="child;4;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child4 = function () {
  console.log('c_TEMP_INV_FLG script6');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script7="child;5;CHK;_AH0020010form2/c_REGULAR_INV_FLG[neq]true[and]_AH0020010form2/c_CYCLE_INV_FLG[neq]true[and]_AH0020010form2/c_TEMP_INV_FLG[neq]true@*6,*7"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child5 = function () {
  console.log('c_TEMP_INV_FLG script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script8="child;6;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG,_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child6 = function () {
  console.log('c_TEMP_INV_FLG script8');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
};
// script9="child;7;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true@*8,*9"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child7 = function () {
  console.log('c_TEMP_INV_FLG script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="child;8;MASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*10"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child8 = function () {
  console.log('c_TEMP_INV_FLG script10');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script11="child;9;UNMASK;_AH0020010form2/c_CYCLE_INV_FLG,_AH0020010form2/c_TEMP_INV_FLG@*10"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child9 = function () {
  console.log('c_TEMP_INV_FLG script11');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script12="child;10;CHK;_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*11,*12"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child10 = function () {
  console.log('c_TEMP_INV_FLG script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script13="child;11;MASK;_AH0020010form2/c_REGULAR_INV_FLG@*14"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child11 = function () {
  console.log('c_TEMP_INV_FLG script13');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script14="child;12;CHK;_AH0020010form2/c_TEMP_INV_FLG[neq]true@*13,*14"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child12 = function () {
  console.log('c_TEMP_INV_FLG script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script15="child;13;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG@*14"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child13 = function () {
  console.log('c_TEMP_INV_FLG script15');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script16="child;14;CHK;_AH0020010form2/c_TEMP_INV_FLG[eq]true@*15,*16"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child14 = function () {
  console.log('c_TEMP_INV_FLG script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script17="child;15;MASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child15 = function () {
  console.log('c_TEMP_INV_FLG script17');
expj.common.pscript.setMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
};
// script18="child;16;CHK;_AH0020010form2/c_CYCLE_INV_FLG[neq]true@*17"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child16 = function () {
  console.log('c_TEMP_INV_FLG script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010form2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script19="child;17;UNMASK;_AH0020010form2/c_REGULAR_INV_FLG"
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.child17 = function () {
  console.log('c_TEMP_INV_FLG script19');
expj.common.pscript.setUnMaskToReferenceComponent('AH0020010', 'AH0020010form2', '_AH0020010form2/c_REGULAR_INV_FLG');
};
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG['onClick' + i])) {
        expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.executeAllOnDecision = function () {
  console.log('execute AH0020010form2/c_TEMP_INV_FLG.onDecision');
  expj.AH0020010.AH0020010form2.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form2-c_TEMP_INV_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010form2', 'c_TEMP_INV_FLG', this, 'CheckBox');
    }
  });
  expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.executePScriptOnLoad = function () {
  console.log('execute AH0020010form2/c_TEMP_INV_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form2-c_TEMP_INV_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_TEMP_INV_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aAH0020010Struct.getc_TEMP_INV_FLG())) || "1".equals(TypeConverter.convert(aAH0020010Struct.getc_TEMP_INV_FLG())))?"checked=\"checked\"":"" %>  class="AH0020010-focus-move" id="expj-AH0020010-AH0020010form2-c_TEMP_INV_FLG"><label for="expj-AH0020010-AH0020010form2-c_TEMP_INV_FLG"><%=CoreTools.getRBString("Expj.TEMP_INV_FLG_1",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_COMMENT",rb)%></span><!-- 棚卸備考 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form2-INV_COMMENT">
expj.AH0020010.AH0020010form2.INV_COMMENT = {};
expj.AH0020010.AH0020010form2.INV_COMMENT.executeAllOnDecision = function () {
  console.log('execute AH0020010form2/INV_COMMENT.onDecision');
  expj.AH0020010.AH0020010form2.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form2.INV_COMMENT.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form2-INV_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form2', 'INV_COMMENT', this);
  });
  expj.AH0020010.AH0020010form2.INV_COMMENT.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form2.INV_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AH0020010form2/INV_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form2-INV_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020010form2-INV_COMMENT" name="INV_COMMENT" class="AH0020010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getINV_COMMENT()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 609px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:525px;"><script class="expj-script-AH0020010-AH0020010button2">
expj.AH0020010.AH0020010button2 = {};
expj.AH0020010.AH0020010button2.executeAllOnDecision = function () {
  console.log('execute AH0020010button2.onDecision');
};
expj.AH0020010.AH0020010button2.executeOnLoad = function () {
  expj.AH0020010.AH0020010button2.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button2.executePScriptOnLoad = function () {
  console.log('execute AH0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0020010-AH0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:525px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0020010-AH0020010button2-insert">
expj.AH0020010.AH0020010button2.insert = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true@*1,*2"
expj.AH0020010.AH0020010button2.insert.child0 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0020010form1/h_REGULAR_INV_FLG=1@*3"
expj.AH0020010.AH0020010button2.insert.child1 = function () {
  console.log('insert script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_REGULAR_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0020010form1/h_REGULAR_INV_FLG=0@*3"
expj.AH0020010.AH0020010button2.insert.child2 = function () {
  console.log('insert script4');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_REGULAR_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*4,*5"
expj.AH0020010.AH0020010button2.insert.child3 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;SET;_AH0020010form1/h_CYCLE_INV_FLG=1@*6"
expj.AH0020010.AH0020010button2.insert.child4 = function () {
  console.log('insert script6');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_CYCLE_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;5;SET;_AH0020010form1/h_CYCLE_INV_FLG=0@*6"
expj.AH0020010.AH0020010button2.insert.child5 = function () {
  console.log('insert script7');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_CYCLE_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;CHK;_AH0020010form2/c_TEMP_INV_FLG[eq]true@*7,*8"
expj.AH0020010.AH0020010button2.insert.child6 = function () {
  console.log('insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;7;SET;_AH0020010form1/h_TEMP_INV_FLG=1@*9"
expj.AH0020010.AH0020010button2.insert.child7 = function () {
  console.log('insert script9');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_TEMP_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script10="child;8;SET;_AH0020010form1/h_TEMP_INV_FLG=0@*9"
expj.AH0020010.AH0020010button2.insert.child8 = function () {
  console.log('insert script10');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_TEMP_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*@AH0020010Servlet,,$ZZ07001"
expj.AH0020010.AH0020010button2.insert.child9 = function () {
  console.log('insert script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020010button2', '_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.updateBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callConfirm('AH0020010', 'AH0020010button2', 'ZZ07001', okEvent);
};
expj.AH0020010.AH0020010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button2.insert['onClick' + i])) {
        expj.AH0020010.AH0020010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button2.insert.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button2.insert.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button2', 'insert', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button2.insert.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button2.insert.executePScriptOnLoad = function () {
  console.log('execute AH0020010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button2-insert" name="insert" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010button2-update">
expj.AH0020010.AH0020010button2.update = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true@*1,*2"
expj.AH0020010.AH0020010button2.update.child0 = function () {
  console.log('update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0020010form1/h_REGULAR_INV_FLG=1@*3"
expj.AH0020010.AH0020010button2.update.child1 = function () {
  console.log('update script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_REGULAR_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0020010form1/h_REGULAR_INV_FLG=0@*3"
expj.AH0020010.AH0020010button2.update.child2 = function () {
  console.log('update script4');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_REGULAR_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*4,*5"
expj.AH0020010.AH0020010button2.update.child3 = function () {
  console.log('update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;SET;_AH0020010form1/h_CYCLE_INV_FLG=1@*6"
expj.AH0020010.AH0020010button2.update.child4 = function () {
  console.log('update script6');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_CYCLE_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;5;SET;_AH0020010form1/h_CYCLE_INV_FLG=0@*6"
expj.AH0020010.AH0020010button2.update.child5 = function () {
  console.log('update script7');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_CYCLE_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;CHK;_AH0020010form2/c_TEMP_INV_FLG[eq]true@*7,*8"
expj.AH0020010.AH0020010button2.update.child6 = function () {
  console.log('update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;7;SET;_AH0020010form1/h_TEMP_INV_FLG=1@*9"
expj.AH0020010.AH0020010button2.update.child7 = function () {
  console.log('update script9');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_TEMP_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script10="child;8;SET;_AH0020010form1/h_TEMP_INV_FLG=0@*9"
expj.AH0020010.AH0020010button2.update.child8 = function () {
  console.log('update script10');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_TEMP_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*@AH0020010Servlet,,$ZZ07003"
expj.AH0020010.AH0020010button2.update.child9 = function () {
  console.log('update script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020010button2', '_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.updateBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callConfirm('AH0020010', 'AH0020010button2', 'ZZ07003', okEvent);
};
expj.AH0020010.AH0020010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button2.update['onClick' + i])) {
        expj.AH0020010.AH0020010button2.update['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button2.update.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button2.update.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button2', 'update', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button2.update.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button2.update.executePScriptOnLoad = function () {
  console.log('execute AH0020010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button2-update" name="update" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010button2-delete">
expj.AH0020010.AH0020010button2.delete = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010button2.delete.onClick0 = function () {
  console.log('delete script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;CHK;_AH0020010form2/c_REGULAR_INV_FLG[eq]true@*1,*2"
expj.AH0020010.AH0020010button2.delete.child0 = function () {
  console.log('delete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_REGULAR_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;SET;_AH0020010form1/h_REGULAR_INV_FLG=1@*3"
expj.AH0020010.AH0020010button2.delete.child1 = function () {
  console.log('delete script3');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_REGULAR_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script4="child;2;SET;_AH0020010form1/h_REGULAR_INV_FLG=0@*3"
expj.AH0020010.AH0020010button2.delete.child2 = function () {
  console.log('delete script4');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_REGULAR_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AH0020010form2/c_CYCLE_INV_FLG[eq]true@*4,*5"
expj.AH0020010.AH0020010button2.delete.child3 = function () {
  console.log('delete script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_CYCLE_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script6="child;4;SET;_AH0020010form1/h_CYCLE_INV_FLG=1@*6"
expj.AH0020010.AH0020010button2.delete.child4 = function () {
  console.log('delete script6');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_CYCLE_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script7="child;5;SET;_AH0020010form1/h_CYCLE_INV_FLG=0@*6"
expj.AH0020010.AH0020010button2.delete.child5 = function () {
  console.log('delete script7');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_CYCLE_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;CHK;_AH0020010form2/c_TEMP_INV_FLG[eq]true@*7,*8"
expj.AH0020010.AH0020010button2.delete.child6 = function () {
  console.log('delete script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form2/c_TEMP_INV_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script9="child;7;SET;_AH0020010form1/h_TEMP_INV_FLG=1@*9"
expj.AH0020010.AH0020010button2.delete.child7 = function () {
  console.log('delete script9');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_TEMP_INV_FLG', '1');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script10="child;8;SET;_AH0020010form1/h_TEMP_INV_FLG=0@*9"
expj.AH0020010.AH0020010button2.delete.child8 = function () {
  console.log('delete script10');
expj.common.pscript.setReferenceComponentValue('AH0020010', 'AH0020010button2', '_AH0020010form1/h_TEMP_INV_FLG', '0');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*@AH0020010Servlet,,$ZZ07004"
expj.AH0020010.AH0020010button2.delete.child9 = function () {
  console.log('delete script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020010button2', '_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.updateBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callConfirm('AH0020010', 'AH0020010button2', 'ZZ07004', okEvent);
};
expj.AH0020010.AH0020010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button2.delete['onClick' + i])) {
        expj.AH0020010.AH0020010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button2.delete.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button2.delete.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button2', 'delete', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button2.delete.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button2.delete.executePScriptOnLoad = function () {
  console.log('execute AH0020010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button2-delete" name="delete" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010button2-select_wh">
expj.AH0020010.AH0020010button2.select_wh = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010button2.select_wh.onClick0 = function () {
  console.log('select_wh script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*@AH0020010Servlet"
expj.AH0020010.AH0020010button2.select_wh.child0 = function () {
  console.log('select_wh script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020010button2', '_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.changeBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0020010.AH0020010button2.select_wh.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button2.select_wh['onClick' + i])) {
        expj.AH0020010.AH0020010button2.select_wh['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button2.select_wh.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button2.select_wh.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button2-select_wh').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button2', 'select_wh', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button2.select_wh.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button2.select_wh.executePScriptOnLoad = function () {
  console.log('execute AH0020010button2/select_wh.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button2-select_wh');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button2-select_wh" name="select_wh" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.Cmt0230",rb)%></button><!-- 保管区指定ボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010button2-select_item">
expj.AH0020010.AH0020010button2.select_item = {};
// script1="onClick;0;CHK;1[eq]1@*0"
expj.AH0020010.AH0020010button2.select_item.onClick0 = function () {
  console.log('select_item script1');
if (expj.common.pscript.evaluate('1', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*@AH0020010Servlet"
expj.AH0020010.AH0020010button2.select_item.child0 = function () {
  console.log('select_item script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020010button2', '_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.changeBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AH0020010.AH0020010button2.select_item.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button2.select_item['onClick' + i])) {
        expj.AH0020010.AH0020010button2.select_item['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button2.select_item.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button2.select_item.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button2-select_item').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button2', 'select_item', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button2.select_item.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button2.select_item.executePScriptOnLoad = function () {
  console.log('execute AH0020010button2/select_item.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button2-select_item');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button2-select_item" name="select_item" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.Cmt0231",rb)%></button><!-- 品目指定ボタン --></div><!--/td-->
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
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AH0020010-AH0020010form3">
expj.AH0020010.AH0020010form3 = {};
expj.AH0020010.AH0020010form3.executeAllOnDecision = function () {
  console.log('execute AH0020010form3.onDecision');
};
expj.AH0020010.AH0020010form3.executeOnLoad = function () {
  expj.AH0020010.AH0020010form3.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form3.executePScriptOnLoad = function () {
  console.log('execute AH0020010form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AH0020010-AH0020010form3" action="AH0020010Servlet" name="AH0020010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_START_DATE",rb)%></span><!-- 棚卸開始日 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form3-INV_START_DATE">
expj.AH0020010.AH0020010form3.INV_START_DATE = {};
expj.AH0020010.AH0020010form3.INV_START_DATE.executeAllOnDecision = function () {
  console.log('execute AH0020010form3/INV_START_DATE.onDecision');
  expj.AH0020010.AH0020010form3.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form3.INV_START_DATE.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form3-INV_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form3', 'INV_START_DATE', this);
  });
  expj.AH0020010.AH0020010form3.INV_START_DATE.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form3.INV_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0020010form3/INV_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form3-INV_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020010form3-INV_START_DATE" name="INV_START_DATE" class="AH0020010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getINV_START_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_SAVE_DATE",rb)%></span><!-- 在庫退避日時 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form3-STOCK_SAVE_DATE">
expj.AH0020010.AH0020010form3.STOCK_SAVE_DATE = {};
expj.AH0020010.AH0020010form3.STOCK_SAVE_DATE.executeAllOnDecision = function () {
  console.log('execute AH0020010form3/STOCK_SAVE_DATE.onDecision');
  expj.AH0020010.AH0020010form3.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form3.STOCK_SAVE_DATE.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form3-STOCK_SAVE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form3', 'STOCK_SAVE_DATE', this);
  });
  expj.AH0020010.AH0020010form3.STOCK_SAVE_DATE.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form3.STOCK_SAVE_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0020010form3/STOCK_SAVE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form3-STOCK_SAVE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020010form3-STOCK_SAVE_DATE" name="STOCK_SAVE_DATE" class="AH0020010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getSTOCK_SAVE_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.INV_UPDATED_DATE",rb)%></span><!-- 実棚更新日時 --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010form3-INV_UPDATED_DATE">
expj.AH0020010.AH0020010form3.INV_UPDATED_DATE = {};
expj.AH0020010.AH0020010form3.INV_UPDATED_DATE.executeAllOnDecision = function () {
  console.log('execute AH0020010form3/INV_UPDATED_DATE.onDecision');
  expj.AH0020010.AH0020010form3.executeAllOnDecision();
  expj.AH0020010.executeAllOnDecision();
};
expj.AH0020010.AH0020010form3.INV_UPDATED_DATE.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010form3-INV_UPDATED_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AH0020010', 'AH0020010form3', 'INV_UPDATED_DATE', this);
  });
  expj.AH0020010.AH0020010form3.INV_UPDATED_DATE.executePScriptOnLoad();
};

expj.AH0020010.AH0020010form3.INV_UPDATED_DATE.executePScriptOnLoad = function () {
  console.log('execute AH0020010form3/INV_UPDATED_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010form3-INV_UPDATED_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AH0020010-AH0020010form3-INV_UPDATED_DATE" name="INV_UPDATED_DATE" class="AH0020010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAH0020010Struct.getINV_UPDATED_DATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<span class="version">AH0020010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AH0020010-AH0020010button0">
expj.AH0020010.AH0020010button0 = {};
expj.AH0020010.AH0020010button0.executeAllOnDecision = function () {
  console.log('execute AH0020010button0.onDecision');
};
expj.AH0020010.AH0020010button0.executeOnLoad = function () {
  expj.AH0020010.AH0020010button0.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button0.executePScriptOnLoad = function () {
  console.log('execute AH0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AH0020010-AH0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AH0020010-AH0020010button0-clear">
expj.AH0020010.AH0020010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*@AH0020010Servlet,,$ZZ07008"
expj.AH0020010.AH0020010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AH0020010', 'AH0020010button0', '_AH0020010form1/*,_AH0020010form2/*,_AH0020010form3/*', 'AH0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AH0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AH0020010', response);
expj.common.updateBusinessScreenTab('AH0020010', contents);
};
expj.common.pscript.callConfirm('AH0020010', 'AH0020010button0', 'ZZ07008', okEvent);
};
expj.AH0020010.AH0020010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button0.clear['onClick' + i])) {
        expj.AH0020010.AH0020010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button0.clear.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button0.clear.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button0', 'clear', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button0.clear.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button0.clear.executePScriptOnLoad = function () {
  console.log('execute AH0020010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button0-clear" name="clear" class="AH0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AH0020010-AH0020010button0-close">
expj.AH0020010.AH0020010button0.close = {};
// script1="onClick;0;CLOSE"
expj.AH0020010.AH0020010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AH0020010');
};
expj.AH0020010.AH0020010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AH0020010.AH0020010button0.close['onClick' + i])) {
        expj.AH0020010.AH0020010button0.close['onClick' + i]();
      }
    }
  }
};
expj.AH0020010.AH0020010button0.close.executeAllOnDecision = function () {
};
expj.AH0020010.AH0020010button0.close.executeOnLoad = function () {
  $('#expj-AH0020010-AH0020010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AH0020010', 'AH0020010button0', 'close', this, 'Button');
    }
  });
  expj.AH0020010.AH0020010button0.close.executePScriptOnLoad();
};

expj.AH0020010.AH0020010button0.close.executePScriptOnLoad = function () {
  console.log('execute AH0020010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AH0020010-AH0020010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AH0020010-AH0020010button0-close" name="close" class="AH0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AH0020010 (END)-->
<%
MessageStruct msgStruct = aAH0020010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AH0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AH0020010)) {
  expj.common.treeInstanceMap.AH0020010 = {};
}
expj.common.treeInstanceMap.AH0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AH0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AH0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AH0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AH0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AH0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AH0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010)) {
  expj.common.detailDialogMap.AH0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AH0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.AH0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AH0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AH0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AH0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AH0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AH0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AH0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AH0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AH0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AH0020010)) {
  expj.common.viewInstanceMap.AH0020010 = {};
}
expj.common.viewInstanceMap.AH0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.AH0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AH0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AH0020010.<%=viewId %>.init = function () {
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
    expj.AH0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AH0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AH0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AH0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AH0020010_init">
/**
 * AH0020010用のロード完了時初期化関数
 */
expj.AH0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AH0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AH0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AH0020010');
  expj.common.calendarInstanceMap.AH0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AH0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AH0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AH0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AH0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AH0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AH0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AH0020010-<%=detailId %>');
<%
 }
%>
  try{expj.AH0020010.AH0020010form1.INV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.CalendarINV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.w_INV_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.h_INV_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.h_REGULAR_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.h_CYCLE_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.h_TEMP_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.h_saveINV_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.h_saveINV_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.h_saveTEMP_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button1.select.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form2.c_REGULAR_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form2.c_CYCLE_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form2.c_TEMP_INV_FLG.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form2.INV_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button2.insert.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button2.update.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button2.delete.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button2.select_wh.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button2.select_item.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form3.INV_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form3.STOCK_SAVE_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form3.INV_UPDATED_DATE.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button0.clear.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button0.close.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form1.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button1.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form2.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button2.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010form3.executeOnLoad();}catch(e){};
  try{expj.AH0020010.AH0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AH0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AH0020010', 'AH0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AH0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AH0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.AH0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AH0020010', '<%=request.getContextPath() %>');
};

/**
 * AH0020010の全体onDecision処理
 */
expj.AH0020010.executeAllOnDecision = function () {
  expj.AH0020010.AH0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AH0020010_console">
expj.AH0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>