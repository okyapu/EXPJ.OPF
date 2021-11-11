<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:57:48 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KM0010\KM0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KM0010.*" %>
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
<jsp:useBean id="aKM0010010Control" class="com.nec.jp.orteus.metamorBase.KM0010.KM0010010Control" scope="request"/>
<jsp:useBean id="aKM0010010Struct" class="com.nec.jp.orteus.metamorBase.KM0010.KM0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

案件登録
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0010/jsp/KM0010010.jsp,v $
$Author: geng-jia $  
$Revision: 1.2 $ $Date: 2017/02/22 02:06:59 $
********************************************************* --%>
<html>
<head>
<title>案件登録</title>
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
<script class="expj-script-KM0010010_init">
  // KM0010010名前空間
  expj.KM0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-KM0010010" data-screen="KM0010010" data-newdata="<%=aKM0010010Control.isNewData() %>">
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
              <script class="expj-script-KM0010010-KM0010010form1">
expj.KM0010010.KM0010010form1 = {};
// script1="onLoad;0;CALL;child@17"
expj.KM0010010.KM0010010form1.onLoad0 = function () {
  console.log('KM0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child17)){this.child17();}
};
// script2="onLoad;1;CALL;onDecision@0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17"
expj.KM0010010.KM0010010form1.onLoad1 = function () {
  console.log('KM0010010form1 script2');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision8)){this.onDecision8();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision9)){this.onDecision9();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision10)){this.onDecision10();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision11)){this.onDecision11();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision12)){this.onDecision12();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision13)){this.onDecision13();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision14)){this.onDecision14();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision15)){this.onDecision15();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision16)){this.onDecision16();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision17)){this.onDecision17();}
};
// script3="onDecision;0;CHKRQ;A@*0,*1"
expj.KM0010010.KM0010010form1.onDecision0 = function () {
  console.log('KM0010010form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('KM0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="child;0;CHK;_PROJECT_CD_FLG[neq]true@*2"
expj.KM0010010.KM0010010form1.child0 = function () {
  console.log('KM0010010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_PROJECT_CD_FLG'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script5="child;1;MASK;_KM0010010button1/select"
expj.KM0010010.KM0010010form1.child1 = function () {
  console.log('KM0010010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button1/select');
};
// script6="child;2;UNMASK;_KM0010010button1/select"
expj.KM0010010.KM0010010form1.child2 = function () {
  console.log('KM0010010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button1/select');
};
// script7="onDecision;1;CHK;_KM0010010form1/PROJECT_CD_FLG[eq]true@*3,*4"
expj.KM0010010.KM0010010form1.onDecision1 = function () {
  console.log('KM0010010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form1/PROJECT_CD_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;3;CHKRQ;B@*8,*9"
expj.KM0010010.KM0010010form1.child3 = function () {
  console.log('KM0010010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('KM0010010', 'B')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script9="child;4;CHKRQ;A,B@*8,*9"
expj.KM0010010.KM0010010form1.child4 = function () {
  console.log('KM0010010form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('KM0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('KM0010010', 'B')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script10="onDecision;2;CHK;?KM0010010form1/*[eq]NORMAL@*5,*6"
expj.KM0010010.KM0010010form1.onDecision2 = function () {
  console.log('KM0010010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script11="child;5;MASK;_KM0010010button2/insert@*7"
expj.KM0010010.KM0010010form1.child5 = function () {
  console.log('KM0010010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script12="child;6;MASK;_KM0010010button2/update,_KM0010010button2/delete"
expj.KM0010010.KM0010010form1.child6 = function () {
  console.log('KM0010010form1 script12');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/update');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/delete');
};
// script13="child;7;UNMASK;_KM0010010button2/update,_KM0010010button2/delete"
expj.KM0010010.KM0010010form1.child7 = function () {
  console.log('KM0010010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/update');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/delete');
};
// script14="child;8;UNMASK;_KM0010010button2/insert@*22"
expj.KM0010010.KM0010010form1.child8 = function () {
  console.log('KM0010010form1 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script15="child;9;MASK;_KM0010010button2/insert"
expj.KM0010010.KM0010010form1.child9 = function () {
  console.log('KM0010010form1 script15');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/insert');
};
// script16="onDecision;3;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/h_PROJECT_STAT[eq]1@*10,*11"
expj.KM0010010.KM0010010form1.onDecision3 = function () {
  console.log('KM0010010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script17="child;10;UNMASK;_KM0010010button2/delete,_KM0010010form2/CUST_CD,_KM0010010form2/PROJECT_STAT"
expj.KM0010010.KM0010010form1.child10 = function () {
  console.log('KM0010010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/delete');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/CUST_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT');
};
// script18="child;11;MASK;_KM0010010button2/delete"
expj.KM0010010.KM0010010form1.child11 = function () {
  console.log('KM0010010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/delete');
};
// script21="onDecision;5;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]2@*13"
expj.KM0010010.KM0010010form1.onDecision5 = function () {
  console.log('KM0010010form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script22="onDecision;6;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]3@*13"
expj.KM0010010.KM0010010form1.onDecision6 = function () {
  console.log('KM0010010form1 script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script23="onDecision;7;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]4@*13"
expj.KM0010010.KM0010010form1.onDecision7 = function () {
  console.log('KM0010010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script24="onDecision;8;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]8@*13"
expj.KM0010010.KM0010010form1.onDecision8 = function () {
  console.log('KM0010010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script25="onDecision;9;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]9@*13"
expj.KM0010010.KM0010010form1.onDecision9 = function () {
  console.log('KM0010010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script26="onDecision;10;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]2@*15"
expj.KM0010010.KM0010010form1.onDecision10 = function () {
  console.log('KM0010010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script27="onDecision;11;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]3@*15"
expj.KM0010010.KM0010010form1.onDecision11 = function () {
  console.log('KM0010010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script28="onDecision;12;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]4@*15"
expj.KM0010010.KM0010010form1.onDecision12 = function () {
  console.log('KM0010010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script29="onDecision;13;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]8@*15"
expj.KM0010010.KM0010010form1.onDecision13 = function () {
  console.log('KM0010010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script30="onDecision;14;CHK;?KM0010010form1/*[eq]NORMAL[and]_KM0010010form2/PROJECT_STAT[eq]9@*15"
expj.KM0010010.KM0010010form1.onDecision14 = function () {
  console.log('KM0010010form1 script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script31="child;13;MASK;_KM0010010form2/CUST_CD,_KM0010010form2/PeekerICustCd"
expj.KM0010010.KM0010010form1.child13 = function () {
  console.log('KM0010010form1 script31');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/CUST_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/PeekerICustCd');
};
// script32="child;14;UNMASK;_KM0010010form2/CUST_CD"
expj.KM0010010.KM0010010form1.child14 = function () {
  console.log('KM0010010form1 script32');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/CUST_CD');
};
// script33="child;15;UNMASK;_KM0010010form2/PROJECT_STAT"
expj.KM0010010.KM0010010form1.child15 = function () {
  console.log('KM0010010form1 script33');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT');
};
// script34="child;16;MASK;_KM0010010form2/PROJECT_STAT"
expj.KM0010010.KM0010010form1.child16 = function () {
  console.log('KM0010010form1 script34');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/PROJECT_STAT');
};
// script35="child;17;MASK;_KM0010010button1/select,_KM0010010button2/insert,_KM0010010button2/update,_KM0010010button2/delete"
expj.KM0010010.KM0010010form1.child17 = function () {
  console.log('KM0010010form1 script35');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button1/select');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/insert');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/update');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/delete');
};
// script36="onDecision;15;CHK;_KM0010010form2/h_OD_COMP_FLG[eq]1@*18,*19"
expj.KM0010010.KM0010010form1.onDecision15 = function () {
  console.log('KM0010010form1 script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form2/h_OD_COMP_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script37="child;18;SET;_OD_COMP_FLG=false"
expj.KM0010010.KM0010010form1.child18 = function () {
  console.log('KM0010010form1 script37');
expj.common.pscript.setReferenceComponentValue('KM0010010', 'KM0010010form1', '_OD_COMP_FLG', 'false');
};
// script38="child;19;SET;_OD_COMP_FLG=true"
expj.KM0010010.KM0010010form1.child19 = function () {
  console.log('KM0010010form1 script38');
expj.common.pscript.setReferenceComponentValue('KM0010010', 'KM0010010form1', '_OD_COMP_FLG', 'true');
};
// script39="onDecision;16;CHK;_KM0010010form1/PROJECT_CD[neq]_KM0010010form1/h_PROJECT_CD[and]?KM0010010form1/*[eq]NORMAL@*20"
expj.KM0010010.KM0010010form1.onDecision16 = function () {
  console.log('KM0010010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form1/PROJECT_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form1/h_PROJECT_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script40="onDecision;17;CHK;_PROJECT_CD_FLG[eq]true[and]?KM0010010form1/*[eq]NORMAL@*20"
expj.KM0010010.KM0010010form1.onDecision17 = function () {
  console.log('KM0010010form1 script40');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_PROJECT_CD_FLG'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '?KM0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script41="child;20;MASK;_KM0010010button2/update,_KM0010010button2/delete@*21"
expj.KM0010010.KM0010010form1.child20 = function () {
  console.log('KM0010010form1 script41');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/update');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child21)){this.child21();}}
};
// script42="child;21;UNMASK;_KM0010010button2/insert,_KM0010010form2/CUST_CD,_KM0010010form2/PeekerICustCd"
expj.KM0010010.KM0010010form1.child21 = function () {
  console.log('KM0010010form1 script42');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button2/insert');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/CUST_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010form2/PeekerICustCd');
};
expj.KM0010010.KM0010010form1.executeAllOnDecision = function () {
  console.log('execute KM0010010form1.onDecision');
  for (var i = 0; i <= 17; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form1['onDecision' + i])) {
        expj.KM0010010.KM0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form1.executeOnLoad = function () {
  expj.KM0010010.KM0010010form1.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form1.executePScriptOnLoad = function () {
  console.log('execute KM0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form1['onLoad' + i])) {
      expj.KM0010010.KM0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0010010-KM0010010form1" action="KM0010010Servlet" name="KM0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKM0010010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:27px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROJECT_CD",rb)%></span><!-- 案件番号 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form1-PROJECT_CD">
expj.KM0010010.KM0010010form1.PROJECT_CD = {};
expj.KM0010010.KM0010010form1.PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form1/PROJECT_CD.onDecision');
  expj.KM0010010.KM0010010form1.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form1.PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form1-PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form1', 'PROJECT_CD', this);
  });
  expj.KM0010010.KM0010010form1.PROJECT_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form1.PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form1/PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form1-PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form1-PROJECT_CD" name="PROJECT_CD" class="KM0010010-focus-move  required-value expj-KM0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPROJECT_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KM0010010-KM0010010form1-h_PROJECT_CD" name="h_PROJECT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0010010Struct.geth_PROJECT_CD()) %>">
<script class="expj-script-KM0010010-KM0010010form1-h_PROJECT_CD">
expj.KM0010010.KM0010010form1.h_PROJECT_CD = {};
expj.KM0010010.KM0010010form1.h_PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form1/h_PROJECT_CD.onDecision');
  expj.KM0010010.KM0010010form1.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form1.h_PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form1-h_PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form1', 'h_PROJECT_CD', this);
  });
  expj.KM0010010.KM0010010form1.h_PROJECT_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form1.h_PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form1/h_PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form1-h_PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-KM0010010-KM0010010form1-PeekerIProjectCd">
expj.KM0010010.KM0010010form1.PeekerIProjectCd = {};
// script1="onClick;0;PEEKER;_KM0010010form1/PROJECT_CD@<%=contextNo%>"
expj.KM0010010.KM0010010form1.PeekerIProjectCd.onClick0 = function () {
  console.log('PeekerIProjectCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerIProjectCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_KM0010010form1/PROJECT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROJECT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form1/PROJECT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form1.PeekerIProjectCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form1.PeekerIProjectCd['onClick' + i])) {
        expj.KM0010010.KM0010010form1.PeekerIProjectCd['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form1.PeekerIProjectCd.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form1.PeekerIProjectCd.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form1-PeekerIProjectCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form1', 'PeekerIProjectCd', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form1.PeekerIProjectCd.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form1.PeekerIProjectCd.executePScriptOnLoad = function () {
  console.log('execute KM0010010form1/PeekerIProjectCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form1-PeekerIProjectCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form1-PeekerIProjectCd" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-KM0010010-KM0010010form1-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0010010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-KM0010010-KM0010010form1-h_MODIFY_COUNT">
expj.KM0010010.KM0010010form1.h_MODIFY_COUNT = {};
expj.KM0010010.KM0010010form1.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KM0010010form1/h_MODIFY_COUNT.onDecision');
  expj.KM0010010.KM0010010form1.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form1.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form1-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form1', 'h_MODIFY_COUNT', this);
  });
  expj.KM0010010.KM0010010form1.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form1.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KM0010010form1/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form1-h_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form1-PROJECT_CD_FLG">
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG = {};
// script1="onLoad;0;CALL;onClick@0"
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.onLoad0 = function () {
  console.log('PROJECT_CD_FLG script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onClick0)){this.onClick0();}
};
// script2="onClick;0;CHK;_PROJECT_CD_FLG[eq]true@*0,*1"
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.onClick0 = function () {
  console.log('PROJECT_CD_FLG script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_PROJECT_CD_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;MASK;_PROJECT_CD,_PeekerIProjectCd,_KM0010010button1/select@*5"
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.child0 = function () {
  console.log('PROJECT_CD_FLG script3');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_PROJECT_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_PeekerIProjectCd');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script4="child;1;UNMASK;_PROJECT_CD,_PeekerIProjectCd@*2"
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.child1 = function () {
  console.log('PROJECT_CD_FLG script4');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_PROJECT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_PeekerIProjectCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script5="child;2;CHK;PROJECT_CD[neq]@*3"
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.child2 = function () {
  console.log('PROJECT_CD_FLG script5');
if (expj.common.pscript.evaluate('PROJECT_CD', '[neq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;3;UNMASK;_KM0010010button1/select"
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.child3 = function () {
  console.log('PROJECT_CD_FLG script6');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form1', '_KM0010010button1/select');
};
// script8="onClick;1;CHK;_PROJECT_CD_FLG[eq]false@*5"
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.onClick1 = function () {
  console.log('PROJECT_CD_FLG script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form1', '_PROJECT_CD_FLG'), '[eq]', 'false')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;SET;_PROJECT_CD=,_h_PROJECT_CD="
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.child5 = function () {
  console.log('PROJECT_CD_FLG script9');
expj.common.pscript.setReferenceComponentValue('KM0010010', 'KM0010010form1', '_PROJECT_CD', '');
expj.common.pscript.setReferenceComponentValue('KM0010010', 'KM0010010form1', '_h_PROJECT_CD', '');
};
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form1.PROJECT_CD_FLG['onClick' + i])) {
        expj.KM0010010.KM0010010form1.PROJECT_CD_FLG['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.executeAllOnDecision = function () {
  console.log('execute KM0010010form1/PROJECT_CD_FLG.onDecision');
  expj.KM0010010.KM0010010form1.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form1-PROJECT_CD_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form1', 'PROJECT_CD_FLG', this, 'CheckBox');
    }
  });
  expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.executePScriptOnLoad = function () {
  console.log('execute KM0010010form1/PROJECT_CD_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form1-PROJECT_CD_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form1.PROJECT_CD_FLG['onLoad' + i])) {
      expj.KM0010010.KM0010010form1.PROJECT_CD_FLG['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="PROJECT_CD_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKM0010010Struct.getPROJECT_CD_FLG())) || "1".equals(TypeConverter.convert(aKM0010010Struct.getPROJECT_CD_FLG())))?"checked=\"checked\"":"" %>  class="KM0010010-focus-move" id="expj-KM0010010-KM0010010form1-PROJECT_CD_FLG"><label for="expj-KM0010010-KM0010010form1-PROJECT_CD_FLG"><%=CoreTools.getRBString("Expj.Cmt6692",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KM0010010-KM0010010button1">
expj.KM0010010.KM0010010button1 = {};
expj.KM0010010.KM0010010button1.executeAllOnDecision = function () {
  console.log('execute KM0010010button1.onDecision');
};
expj.KM0010010.KM0010010button1.executeOnLoad = function () {
  expj.KM0010010.KM0010010button1.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button1.executePScriptOnLoad = function () {
  console.log('execute KM0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0010010-KM0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0010010-KM0010010button1-select">
expj.KM0010010.KM0010010button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0010010form1/*@KM0010010Servlet"
expj.KM0010010.KM0010010button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0010010', 'KM0010010button1', '_KM0010010form1/*', 'KM0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0010010', response);
expj.common.updateBusinessScreenTab('KM0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0010010.KM0010010button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010button1.select['onClick' + i])) {
        expj.KM0010010.KM0010010button1.select['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010button1.select.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010button1.select.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010button1', 'select', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010button1.select.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button1.select.executePScriptOnLoad = function () {
  console.log('execute KM0010010button1/select.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0010010-KM0010010button1-select" name="select" class="KM0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div id="expj-KM0010010-KM0010010tabs" class="tabs"  style="width:100%;height:100%;padding:0px;border:0px;"><!--画面内tab-->
  <ul id="expj-KM0010010-KM0010010tabs-tabIndex" style="width:100%;padding:0px;border:0px;margin-left:5px;"></ul>
<div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 32px);"><!--table2-->
<div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-KM0010010-KM0010010form2">
expj.KM0010010.KM0010010form2 = {};
expj.KM0010010.KM0010010form2.executeAllOnDecision = function () {
  console.log('execute KM0010010form2.onDecision');
};
expj.KM0010010.KM0010010form2.executeOnLoad = function () {
  expj.KM0010010.KM0010010form2.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0010010-KM0010010form2" action="KM0010010Servlet" name="KM0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROJECT_NAME",rb)%></span><!-- 案件名 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PROJECT_NAME">
expj.KM0010010.KM0010010form2.PROJECT_NAME = {};
expj.KM0010010.KM0010010form2.PROJECT_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/PROJECT_NAME.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.PROJECT_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PROJECT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'PROJECT_NAME', this);
  });
  expj.KM0010010.KM0010010form2.PROJECT_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PROJECT_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PROJECT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PROJECT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:602px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-PROJECT_NAME" name="PROJECT_NAME" class="KM0010010-focus-move  required-value expj-KM0010010-required-B" style="width:602px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPROJECT_NAME()) %>" maxlength="80" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-CUST_CD">
expj.KM0010010.KM0010010form2.CUST_CD = {};
expj.KM0010010.KM0010010form2.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/CUST_CD.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.CUST_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'CUST_CD', this);
  });
  expj.KM0010010.KM0010010form2.CUST_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-CUST_CD" name="CUST_CD" class="KM0010010-focus-move  required-value expj-KM0010010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getCUST_CD()) %>" maxlength="40" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PeekerICustCd">
expj.KM0010010.KM0010010form2.PeekerICustCd = {};
// script1="onClick;0;PEEKER;_KM0010010form2/CUST_CD@<%=contextNo%>"
expj.KM0010010.KM0010010form2.PeekerICustCd.onClick0 = function () {
  console.log('PeekerICustCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerICustCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form2', '_KM0010010form2/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%CUST_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form2/CUST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form2.PeekerICustCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form2.PeekerICustCd['onClick' + i])) {
        expj.KM0010010.KM0010010form2.PeekerICustCd['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form2.PeekerICustCd.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form2.PeekerICustCd.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PeekerICustCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form2', 'PeekerICustCd', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form2.PeekerICustCd.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PeekerICustCd.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PeekerICustCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PeekerICustCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form2-PeekerICustCd" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-CUST_NAME">
expj.KM0010010.KM0010010form2.CUST_NAME = {};
expj.KM0010010.KM0010010form2.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/CUST_NAME.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.CUST_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'CUST_NAME', this);
  });
  expj.KM0010010.KM0010010form2.CUST_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-CUST_NAME" name="CUST_NAME" class="KM0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_STAT",rb)%></span><!-- 案件ステータス --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PROJECT_STAT">
expj.KM0010010.KM0010010form2.PROJECT_STAT = {};
expj.KM0010010.KM0010010form2.PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/PROJECT_STAT.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PROJECT_STAT').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0010010', 'KM0010010form2', 'PROJECT_STAT', this);
  });
  expj.KM0010010.KM0010010form2.PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0010010-KM0010010form2-PROJECT_STAT" name='PROJECT_STAT' class='KM0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0010010Control.getStruct().getList_PROJECT_STAT_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0010010Control.getStruct().getList_PROJECT_STAT_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0010010Control.getStruct().getList_PROJECT_STAT_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0010010Struct.getPROJECT_STAT()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KM0010010-KM0010010form2-h_PROJECT_STAT" name="h_PROJECT_STAT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0010010Struct.geth_PROJECT_STAT()) %>">
<script class="expj-script-KM0010010-KM0010010form2-h_PROJECT_STAT">
expj.KM0010010.KM0010010form2.h_PROJECT_STAT = {};
expj.KM0010010.KM0010010form2.h_PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/h_PROJECT_STAT.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.h_PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-h_PROJECT_STAT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'h_PROJECT_STAT', this);
  });
  expj.KM0010010.KM0010010form2.h_PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.h_PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/h_PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-h_PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COMPLETE_STAT",rb)%></span><!-- 受注完了 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-COMPLETE_STAT">
expj.KM0010010.KM0010010form2.COMPLETE_STAT = {};
expj.KM0010010.KM0010010form2.COMPLETE_STAT.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/COMPLETE_STAT.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.COMPLETE_STAT.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-COMPLETE_STAT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'COMPLETE_STAT', this);
  });
  expj.KM0010010.KM0010010form2.COMPLETE_STAT.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.COMPLETE_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/COMPLETE_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-COMPLETE_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-COMPLETE_STAT" name="COMPLETE_STAT" class="KM0010010-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getCOMPLETE_STAT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACCURACY",rb)%></span><!-- 確度 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-ACCURACY_LEVEL">
expj.KM0010010.KM0010010form2.ACCURACY_LEVEL = {};
expj.KM0010010.KM0010010form2.ACCURACY_LEVEL.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/ACCURACY_LEVEL.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.ACCURACY_LEVEL.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-ACCURACY_LEVEL').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KM0010010', 'KM0010010form2', 'ACCURACY_LEVEL', this);
  });
  expj.KM0010010.KM0010010form2.ACCURACY_LEVEL.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.ACCURACY_LEVEL.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/ACCURACY_LEVEL.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-ACCURACY_LEVEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KM0010010-KM0010010form2-ACCURACY_LEVEL" name='ACCURACY_LEVEL' class='KM0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKM0010010Control.getStruct().getList_ACCURACY_LEVEL_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKM0010010Control.getStruct().getList_ACCURACY_LEVEL_name().get(i));    String val = TypeConverter.sanitizer((String)aKM0010010Control.getStruct().getList_ACCURACY_LEVEL_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKM0010010Struct.getACCURACY_LEVEL()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<input type="hidden" id="expj-KM0010010-KM0010010form2-h_ESTIMATE" name="h_ESTIMATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0010010Struct.geth_ESTIMATE()) %>">
<script class="expj-script-KM0010010-KM0010010form2-h_ESTIMATE">
expj.KM0010010.KM0010010form2.h_ESTIMATE = {};
expj.KM0010010.KM0010010form2.h_ESTIMATE.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/h_ESTIMATE.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.h_ESTIMATE.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-h_ESTIMATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'h_ESTIMATE', this);
  });
  expj.KM0010010.KM0010010form2.h_ESTIMATE.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.h_ESTIMATE.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/h_ESTIMATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-h_ESTIMATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-KM0010010-KM0010010form2-h_COMPLETE_STAT" name="h_COMPLETE_STAT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0010010Struct.geth_COMPLETE_STAT()) %>">
<script class="expj-script-KM0010010-KM0010010form2-h_COMPLETE_STAT">
expj.KM0010010.KM0010010form2.h_COMPLETE_STAT = {};
expj.KM0010010.KM0010010form2.h_COMPLETE_STAT.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/h_COMPLETE_STAT.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.h_COMPLETE_STAT.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-h_COMPLETE_STAT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'h_COMPLETE_STAT', this);
  });
  expj.KM0010010.KM0010010form2.h_COMPLETE_STAT.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.h_COMPLETE_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/h_COMPLETE_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-h_COMPLETE_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_DATE",rb)%></span><!-- 引合日 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-Vend_Date">
expj.KM0010010.KM0010010form2.Vend_Date = {};
expj.KM0010010.KM0010010form2.Vend_Date.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/Vend_Date.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.Vend_Date.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-Vend_Date').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'Vend_Date', this);
  });
  expj.KM0010010.KM0010010form2.Vend_Date.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.Vend_Date.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/Vend_Date.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-Vend_Date');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-Vend_Date" name="Vend_Date" class="KM0010010-focus-move  required-value expj-KM0010010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getVend_Date()) %>" maxlength="40" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-CalendarVend_Date">
expj.KM0010010.KM0010010form2.CalendarVend_Date = {};
// script1="onClick;0;CALENDAR;_KM0010010form2/Vend_Date"
expj.KM0010010.KM0010010form2.CalendarVend_Date.onClick0 = function () {
  console.log('CalendarVend_Date script1');
expj.common.pscript.executeCalendar('KM0010010','KM0010010form2','_KM0010010form2/Vend_Date');
};
expj.KM0010010.KM0010010form2.CalendarVend_Date.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form2.CalendarVend_Date['onClick' + i])) {
        expj.KM0010010.KM0010010form2.CalendarVend_Date['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form2.CalendarVend_Date.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form2.CalendarVend_Date.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-CalendarVend_Date').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form2', 'CalendarVend_Date', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0010010','KM0010010form2','_KM0010010form2/Vend_Date');
  expj.KM0010010.KM0010010form2.CalendarVend_Date.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.CalendarVend_Date.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/CalendarVend_Date.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-CalendarVend_Date');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form2-CalendarVend_Date" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ASSUME_DLV_DATE",rb)%></span><!-- 想定納期 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-AssumeDlv_date">
expj.KM0010010.KM0010010form2.AssumeDlv_date = {};
expj.KM0010010.KM0010010form2.AssumeDlv_date.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/AssumeDlv_date.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.AssumeDlv_date.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-AssumeDlv_date').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'AssumeDlv_date', this);
  });
  expj.KM0010010.KM0010010form2.AssumeDlv_date.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.AssumeDlv_date.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/AssumeDlv_date.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-AssumeDlv_date');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-AssumeDlv_date" name="AssumeDlv_date" class="KM0010010-focus-move  required-value expj-KM0010010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getAssumeDlv_date()) %>" maxlength="40" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-CalendarAssumeDlv_date">
expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date = {};
// script1="onClick;0;CALENDAR;_KM0010010form2/AssumeDlv_date"
expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date.onClick0 = function () {
  console.log('CalendarAssumeDlv_date script1');
expj.common.pscript.executeCalendar('KM0010010','KM0010010form2','_KM0010010form2/AssumeDlv_date');
};
expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date['onClick' + i])) {
        expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-CalendarAssumeDlv_date').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form2', 'CalendarAssumeDlv_date', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0010010','KM0010010form2','_KM0010010form2/AssumeDlv_date');
  expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/CalendarAssumeDlv_date.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-CalendarAssumeDlv_date');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form2-CalendarAssumeDlv_date" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ASSUME_AMOUNT",rb)%></span><!-- 引合想定金額 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-AssumeAmount">
expj.KM0010010.KM0010010form2.AssumeAmount = {};
expj.KM0010010.KM0010010form2.AssumeAmount.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/AssumeAmount.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.AssumeAmount.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-AssumeAmount').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'AssumeAmount', this);
  });
  expj.KM0010010.KM0010010form2.AssumeAmount.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.AssumeAmount.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/AssumeAmount.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-AssumeAmount');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-AssumeAmount" name="AssumeAmount" class="KM0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getAssumeAmount()) %>" maxlength="16" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-CurUnit">
expj.KM0010010.KM0010010form2.CurUnit = {};
expj.KM0010010.KM0010010form2.CurUnit.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/CurUnit.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.CurUnit.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-CurUnit').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'CurUnit', this);
  });
  expj.KM0010010.KM0010010form2.CurUnit.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.CurUnit.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/CurUnit.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-CurUnit');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-CurUnit" name="CurUnit" class="KM0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getCurUnit()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ASSUME_AMOUNT_EXCH_RATES",rb)%></span><!-- 引合想定金額(邦貨) --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-ASSUME_AMOUNT_EXCH_RATES">
expj.KM0010010.KM0010010form2.ASSUME_AMOUNT_EXCH_RATES = {};
expj.KM0010010.KM0010010form2.ASSUME_AMOUNT_EXCH_RATES.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/ASSUME_AMOUNT_EXCH_RATES.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.ASSUME_AMOUNT_EXCH_RATES.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-ASSUME_AMOUNT_EXCH_RATES').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'ASSUME_AMOUNT_EXCH_RATES', this);
  });
  expj.KM0010010.KM0010010form2.ASSUME_AMOUNT_EXCH_RATES.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.ASSUME_AMOUNT_EXCH_RATES.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/ASSUME_AMOUNT_EXCH_RATES.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-ASSUME_AMOUNT_EXCH_RATES');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-ASSUME_AMOUNT_EXCH_RATES" name="ASSUME_AMOUNT_EXCH_RATES" class="KM0010010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getASSUME_AMOUNT_EXCH_RATES()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DLV_LOC_CD",rb)%></span><!-- 納品場所コード --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-DLV_LOC_CD">
expj.KM0010010.KM0010010form2.DLV_LOC_CD = {};
expj.KM0010010.KM0010010form2.DLV_LOC_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/DLV_LOC_CD.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.DLV_LOC_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-DLV_LOC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'DLV_LOC_CD', this);
  });
  expj.KM0010010.KM0010010form2.DLV_LOC_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.DLV_LOC_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/DLV_LOC_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-DLV_LOC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-DLV_LOC_CD" name="DLV_LOC_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getDLV_LOC_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PeekerIDlvLocCd">
expj.KM0010010.KM0010010form2.PeekerIDlvLocCd = {};
// script1="onClick;0;PEEKER;_KM0010010form2/DLV_LOC_CD@<%=contextNo%>"
expj.KM0010010.KM0010010form2.PeekerIDlvLocCd.onClick0 = function () {
  console.log('PeekerIDlvLocCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerIDlvLocCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form2', '_KM0010010form2/CUST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form2', '_KM0010010form2/DLV_LOC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%DLV_LOC_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form2/DLV_LOC_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form2.PeekerIDlvLocCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form2.PeekerIDlvLocCd['onClick' + i])) {
        expj.KM0010010.KM0010010form2.PeekerIDlvLocCd['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form2.PeekerIDlvLocCd.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form2.PeekerIDlvLocCd.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PeekerIDlvLocCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form2', 'PeekerIDlvLocCd', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form2.PeekerIDlvLocCd.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PeekerIDlvLocCd.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PeekerIDlvLocCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PeekerIDlvLocCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form2-PeekerIDlvLocCd" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-DLV_LOC_NAME">
expj.KM0010010.KM0010010form2.DLV_LOC_NAME = {};
expj.KM0010010.KM0010010form2.DLV_LOC_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/DLV_LOC_NAME.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.DLV_LOC_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-DLV_LOC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'DLV_LOC_NAME', this);
  });
  expj.KM0010010.KM0010010form2.DLV_LOC_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.DLV_LOC_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/DLV_LOC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-DLV_LOC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-DLV_LOC_NAME" name="DLV_LOC_NAME" class="KM0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getDLV_LOC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PJ_USER_CD",rb)%></span><!-- 案件担当者コード --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PJ_USER_CD">
expj.KM0010010.KM0010010form2.PJ_USER_CD = {};
expj.KM0010010.KM0010010form2.PJ_USER_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/PJ_USER_CD.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.PJ_USER_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PJ_USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'PJ_USER_CD', this);
  });
  expj.KM0010010.KM0010010form2.PJ_USER_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PJ_USER_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PJ_USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PJ_USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-PJ_USER_CD" name="PJ_USER_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_USER_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PeekerIOwnPerCd">
expj.KM0010010.KM0010010form2.PeekerIOwnPerCd = {};
// script1="onClick;0;PEEKER;_KM0010010form2/PJ_USER_CD@<%=contextNo%>"
expj.KM0010010.KM0010010form2.PeekerIOwnPerCd.onClick0 = function () {
  console.log('PeekerIOwnPerCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerIOwnPerCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form2', '_KM0010010form2/PJ_USER_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form2/PJ_USER_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form2.PeekerIOwnPerCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form2.PeekerIOwnPerCd['onClick' + i])) {
        expj.KM0010010.KM0010010form2.PeekerIOwnPerCd['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form2.PeekerIOwnPerCd.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form2.PeekerIOwnPerCd.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PeekerIOwnPerCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form2', 'PeekerIOwnPerCd', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form2.PeekerIOwnPerCd.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PeekerIOwnPerCd.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PeekerIOwnPerCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PeekerIOwnPerCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form2-PeekerIOwnPerCd" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-USER_NAME">
expj.KM0010010.KM0010010form2.USER_NAME = {};
expj.KM0010010.KM0010010form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/USER_NAME.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.USER_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'USER_NAME', this);
  });
  expj.KM0010010.KM0010010form2.USER_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-USER_NAME" name="USER_NAME" class="KM0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getUSER_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PJ_ORG_CD",rb)%></span><!-- 案件担当部門コード --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PJ_ORG_CD">
expj.KM0010010.KM0010010form2.PJ_ORG_CD = {};
expj.KM0010010.KM0010010form2.PJ_ORG_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/PJ_ORG_CD.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.PJ_ORG_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PJ_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'PJ_ORG_CD', this);
  });
  expj.KM0010010.KM0010010form2.PJ_ORG_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PJ_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PJ_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PJ_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-PJ_ORG_CD" name="PJ_ORG_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_ORG_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-PeekerIOwnOrgCd">
expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd = {};
// script1="onClick;0;PEEKER;_KM0010010form2/PJ_ORG_CD@<%=contextNo%>"
expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd.onClick0 = function () {
  console.log('PeekerIOwnOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerIOwnOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form2', '_KM0010010form2/PJ_ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form2/PJ_ORG_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd['onClick' + i])) {
        expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-PeekerIOwnOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form2', 'PeekerIOwnOrgCd', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/PeekerIOwnOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-PeekerIOwnOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form2-PeekerIOwnOrgCd" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-ORG_NAME">
expj.KM0010010.KM0010010form2.ORG_NAME = {};
expj.KM0010010.KM0010010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/ORG_NAME.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'ORG_NAME', this);
  });
  expj.KM0010010.KM0010010form2.ORG_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-ORG_NAME" name="ORG_NAME" class="KM0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARK1",rb)%></span><!-- 備考１ --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-REMARKS1">
expj.KM0010010.KM0010010form2.REMARKS1 = {};
expj.KM0010010.KM0010010form2.REMARKS1.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/REMARKS1.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.REMARKS1.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-REMARKS1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'REMARKS1', this);
  });
  expj.KM0010010.KM0010010form2.REMARKS1.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.REMARKS1.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/REMARKS1.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-REMARKS1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-REMARKS1" name="REMARKS1" class="KM0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getREMARKS1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARK2",rb)%></span><!-- 備考２ --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-REMARKS2">
expj.KM0010010.KM0010010form2.REMARKS2 = {};
expj.KM0010010.KM0010010form2.REMARKS2.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/REMARKS2.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.REMARKS2.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-REMARKS2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'REMARKS2', this);
  });
  expj.KM0010010.KM0010010form2.REMARKS2.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.REMARKS2.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/REMARKS2.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-REMARKS2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-REMARKS2" name="REMARKS2" class="KM0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getREMARKS2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARK3",rb)%></span><!-- 備考３ --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-REMARKS3">
expj.KM0010010.KM0010010form2.REMARKS3 = {};
expj.KM0010010.KM0010010form2.REMARKS3.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/REMARKS3.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.REMARKS3.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-REMARKS3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'REMARKS3', this);
  });
  expj.KM0010010.KM0010010form2.REMARKS3.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.REMARKS3.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/REMARKS3.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-REMARKS3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-REMARKS3" name="REMARKS3" class="KM0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getREMARKS3()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARK4",rb)%></span><!-- 備考４ --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-REMARKS4">
expj.KM0010010.KM0010010form2.REMARKS4 = {};
expj.KM0010010.KM0010010form2.REMARKS4.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/REMARKS4.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.REMARKS4.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-REMARKS4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'REMARKS4', this);
  });
  expj.KM0010010.KM0010010form2.REMARKS4.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.REMARKS4.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/REMARKS4.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-REMARKS4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-REMARKS4" name="REMARKS4" class="KM0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getREMARKS4()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARK5",rb)%></span><!-- 備考５ --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-REMARKS5">
expj.KM0010010.KM0010010form2.REMARKS5 = {};
expj.KM0010010.KM0010010form2.REMARKS5.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/REMARKS5.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.REMARKS5.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-REMARKS5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'REMARKS5', this);
  });
  expj.KM0010010.KM0010010form2.REMARKS5.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.REMARKS5.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/REMARKS5.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-REMARKS5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form2-REMARKS5" name="REMARKS5" class="KM0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getREMARKS5()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form2-OD_COMP_FLG">
expj.KM0010010.KM0010010form2.OD_COMP_FLG = {};
// script1="onClick;0;CHK;_OD_COMP_FLG[eq]true@*0,*1"
expj.KM0010010.KM0010010form2.OD_COMP_FLG.onClick0 = function () {
  console.log('OD_COMP_FLG script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form2', '_OD_COMP_FLG'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SET;_KM0010010form2/h_OD_COMP_FLG=1"
expj.KM0010010.KM0010010form2.OD_COMP_FLG.child0 = function () {
  console.log('OD_COMP_FLG script2');
expj.common.pscript.setReferenceComponentValue('KM0010010', 'KM0010010form2', '_KM0010010form2/h_OD_COMP_FLG', '1');
};
// script3="child;0;SET;_KM0010010form2/h_OD_COMP_FLG=0"
expj.KM0010010.KM0010010form2.OD_COMP_FLG.child0 = function () {
  console.log('OD_COMP_FLG script3');
expj.common.pscript.setReferenceComponentValue('KM0010010', 'KM0010010form2', '_KM0010010form2/h_OD_COMP_FLG', '0');
};
expj.KM0010010.KM0010010form2.OD_COMP_FLG.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form2.OD_COMP_FLG['onClick' + i])) {
        expj.KM0010010.KM0010010form2.OD_COMP_FLG['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form2.OD_COMP_FLG.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/OD_COMP_FLG.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.OD_COMP_FLG.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-OD_COMP_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form2', 'OD_COMP_FLG', this, 'CheckBox');
    }
  });
  expj.KM0010010.KM0010010form2.OD_COMP_FLG.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.OD_COMP_FLG.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/OD_COMP_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-OD_COMP_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="OD_COMP_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKM0010010Struct.getOD_COMP_FLG())) || "1".equals(TypeConverter.convert(aKM0010010Struct.getOD_COMP_FLG())))?"checked=\"checked\"":"" %>  class="KM0010010-focus-move" id="expj-KM0010010-KM0010010form2-OD_COMP_FLG"><label for="expj-KM0010010-KM0010010form2-OD_COMP_FLG"><%=CoreTools.getRBString("Expj.Cmt6691",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KM0010010-KM0010010form2-h_OD_COMP_FLG" name="h_OD_COMP_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0010010Struct.geth_OD_COMP_FLG()) %>">
<script class="expj-script-KM0010010-KM0010010form2-h_OD_COMP_FLG">
expj.KM0010010.KM0010010form2.h_OD_COMP_FLG = {};
expj.KM0010010.KM0010010form2.h_OD_COMP_FLG.executeAllOnDecision = function () {
  console.log('execute KM0010010form2/h_OD_COMP_FLG.onDecision');
  expj.KM0010010.KM0010010form2.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form2.h_OD_COMP_FLG.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form2-h_OD_COMP_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form2', 'h_OD_COMP_FLG', this);
  });
  expj.KM0010010.KM0010010form2.h_OD_COMP_FLG.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form2.h_OD_COMP_FLG.executePScriptOnLoad = function () {
  console.log('execute KM0010010form2/h_OD_COMP_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form2-h_OD_COMP_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="datagrid-button-field-cell frame01" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02"></div><!--/td-->
<div class="datagrid-button-field-cell frame03" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0010010-KM0010010form3">
expj.KM0010010.KM0010010form3 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7,8,9,10,11,"
expj.KM0010010.KM0010010form3.onLoad0 = function () {
  console.log('KM0010010form3 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision8)){this.onDecision8();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision9)){this.onDecision9();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision10)){this.onDecision10();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision11)){this.onDecision11();}
};
// script2="onDecision;0;CHK;_KM0010010form3/PJ_CLASS_01_TYP[eq]@*1,*0"
expj.KM0010010.KM0010010form3.onDecision0 = function () {
  console.log('KM0010010form3 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_01_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;_KM0010010form3/PJ_CLASS_02_TYP[eq]@*3,*2"
expj.KM0010010.KM0010010form3.onDecision1 = function () {
  console.log('KM0010010form3 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_02_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onDecision;2;CHK;_KM0010010form3/PJ_CLASS_03_TYP[eq]@*5,*4"
expj.KM0010010.KM0010010form3.onDecision2 = function () {
  console.log('KM0010010form3 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_03_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="onDecision;3;CHK;_KM0010010form3/PJ_CLASS_04_TYP[eq]@*7,*6"
expj.KM0010010.KM0010010form3.onDecision3 = function () {
  console.log('KM0010010form3 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_04_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script6="onDecision;4;CHK;_KM0010010form3/PJ_CLASS_05_TYP[eq]@*9,*8"
expj.KM0010010.KM0010010form3.onDecision4 = function () {
  console.log('KM0010010form3 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_05_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script7="onDecision;5;CHK;_KM0010010form3/PJ_CLASS_06_TYP[eq]@*11,*10"
expj.KM0010010.KM0010010form3.onDecision5 = function () {
  console.log('KM0010010form3 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_06_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script8="onDecision;6;CHK;_KM0010010form3/PJ_CLASS_07_TYP[eq]@*13,*12"
expj.KM0010010.KM0010010form3.onDecision6 = function () {
  console.log('KM0010010form3 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_07_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script9="onDecision;7;CHK;_KM0010010form3/PJ_CLASS_08_TYP[eq]@*15,*14"
expj.KM0010010.KM0010010form3.onDecision7 = function () {
  console.log('KM0010010form3 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_08_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
}
};
// script10="onDecision;8;CHK;_KM0010010form3/PJ_CLASS_09_TYP[eq]@*17,*16"
expj.KM0010010.KM0010010form3.onDecision8 = function () {
  console.log('KM0010010form3 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_09_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script11="onDecision;9;CHK;_KM0010010form3/PJ_CLASS_10_TYP[eq]@*19,*18"
expj.KM0010010.KM0010010form3.onDecision9 = function () {
  console.log('KM0010010form3 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_10_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script12="onDecision;10;CHK;_KM0010010form3/PJ_CLASS_11_TYP[eq]@*21,*20"
expj.KM0010010.KM0010010form3.onDecision10 = function () {
  console.log('KM0010010form3 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_11_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script13="onDecision;11;CHK;_KM0010010form3/PJ_CLASS_12_TYP[eq]@*23,*22"
expj.KM0010010.KM0010010form3.onDecision11 = function () {
  console.log('KM0010010form3 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_12_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script14="child;0;UNMASK;_KM0010010form3/PJ_CLASS_01_CD,_KM0010010form3/PeekerODR_CLASS_01_CD"
expj.KM0010010.KM0010010form3.child0 = function () {
  console.log('KM0010010form3 script14');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_01_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_01_CD');
};
// script15="child;1;MASK;_KM0010010form3/PJ_CLASS_01_CD,_KM0010010form3/PeekerODR_CLASS_01_CD"
expj.KM0010010.KM0010010form3.child1 = function () {
  console.log('KM0010010form3 script15');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_01_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_01_CD');
};
// script16="child;2;UNMASK;_KM0010010form3/PJ_CLASS_02_CD,_KM0010010form3/PeekerODR_CLASS_02_CD"
expj.KM0010010.KM0010010form3.child2 = function () {
  console.log('KM0010010form3 script16');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_02_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_02_CD');
};
// script17="child;3;MASK;_KM0010010form3/PJ_CLASS_02_CD,_KM0010010form3/PeekerODR_CLASS_02_CD"
expj.KM0010010.KM0010010form3.child3 = function () {
  console.log('KM0010010form3 script17');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_02_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_02_CD');
};
// script18="child;4;UNMASK;_KM0010010form3/PJ_CLASS_03_CD,_KM0010010form3/PeekerODR_CLASS_03_CD"
expj.KM0010010.KM0010010form3.child4 = function () {
  console.log('KM0010010form3 script18');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_03_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_03_CD');
};
// script19="child;5;MASK;_KM0010010form3/PJ_CLASS_03_CD,_KM0010010form3/PeekerODR_CLASS_03_CD"
expj.KM0010010.KM0010010form3.child5 = function () {
  console.log('KM0010010form3 script19');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_03_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_03_CD');
};
// script20="child;6;UNMASK;_KM0010010form3/PJ_CLASS_04_CD,_KM0010010form3/PeekerODR_CLASS_04_CD"
expj.KM0010010.KM0010010form3.child6 = function () {
  console.log('KM0010010form3 script20');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_04_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_04_CD');
};
// script21="child;7;MASK;_KM0010010form3/PJ_CLASS_04_CD,_KM0010010form3/PeekerODR_CLASS_04_CD"
expj.KM0010010.KM0010010form3.child7 = function () {
  console.log('KM0010010form3 script21');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_04_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_04_CD');
};
// script22="child;8;UNMASK;_KM0010010form3/PJ_CLASS_05_CD,_KM0010010form3/PeekerODR_CLASS_05_CD"
expj.KM0010010.KM0010010form3.child8 = function () {
  console.log('KM0010010form3 script22');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_05_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_05_CD');
};
// script23="child;9;MASK;_KM0010010form3/PJ_CLASS_05_CD,_KM0010010form3/PeekerODR_CLASS_05_CD"
expj.KM0010010.KM0010010form3.child9 = function () {
  console.log('KM0010010form3 script23');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_05_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_05_CD');
};
// script24="child;10;UNMASK;_KM0010010form3/PJ_CLASS_06_CD,_KM0010010form3/PeekerODR_CLASS_06_CD"
expj.KM0010010.KM0010010form3.child10 = function () {
  console.log('KM0010010form3 script24');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_06_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_06_CD');
};
// script25="child;11;MASK;_KM0010010form3/PJ_CLASS_06_CD,_KM0010010form3/PeekerODR_CLASS_06_CD"
expj.KM0010010.KM0010010form3.child11 = function () {
  console.log('KM0010010form3 script25');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_06_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_06_CD');
};
// script26="child;12;UNMASK;_KM0010010form3/PJ_CLASS_07_CD,_KM0010010form3/PeekerODR_CLASS_07_CD"
expj.KM0010010.KM0010010form3.child12 = function () {
  console.log('KM0010010form3 script26');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_07_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_07_CD');
};
// script27="child;13;MASK;_KM0010010form3/PJ_CLASS_07_CD,_KM0010010form3/PeekerODR_CLASS_07_CD"
expj.KM0010010.KM0010010form3.child13 = function () {
  console.log('KM0010010form3 script27');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_07_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_07_CD');
};
// script28="child;14;UNMASK;_KM0010010form3/PJ_CLASS_08_CD,_KM0010010form3/PeekerODR_CLASS_08_CD"
expj.KM0010010.KM0010010form3.child14 = function () {
  console.log('KM0010010form3 script28');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_08_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_08_CD');
};
// script29="child;15;MASK;_KM0010010form3/PJ_CLASS_08_CD,_KM0010010form3/PeekerODR_CLASS_08_CD"
expj.KM0010010.KM0010010form3.child15 = function () {
  console.log('KM0010010form3 script29');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_08_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_08_CD');
};
// script30="child;16;UNMASK;_KM0010010form3/PJ_CLASS_09_CD,_KM0010010form3/PeekerODR_CLASS_09_CD"
expj.KM0010010.KM0010010form3.child16 = function () {
  console.log('KM0010010form3 script30');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_09_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_09_CD');
};
// script31="child;17;MASK;_KM0010010form3/PJ_CLASS_09_CD,_KM0010010form3/PeekerODR_CLASS_09_CD"
expj.KM0010010.KM0010010form3.child17 = function () {
  console.log('KM0010010form3 script31');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_09_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_09_CD');
};
// script32="child;18;UNMASK;_KM0010010form3/PJ_CLASS_10_CD,_KM0010010form3/PeekerODR_CLASS_10_CD"
expj.KM0010010.KM0010010form3.child18 = function () {
  console.log('KM0010010form3 script32');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_10_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_10_CD');
};
// script33="child;19;MASK;_KM0010010form3/PJ_CLASS_10_CD,_KM0010010form3/PeekerODR_CLASS_10_CD"
expj.KM0010010.KM0010010form3.child19 = function () {
  console.log('KM0010010form3 script33');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_10_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_10_CD');
};
// script34="child;20;UNMASK;_KM0010010form3/PJ_CLASS_11_CD,_KM0010010form3/PeekerODR_CLASS_11_CD"
expj.KM0010010.KM0010010form3.child20 = function () {
  console.log('KM0010010form3 script34');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_11_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_11_CD');
};
// script35="child;21;MASK;_KM0010010form3/PJ_CLASS_11_CD,_KM0010010form3/PeekerODR_CLASS_11_CD"
expj.KM0010010.KM0010010form3.child21 = function () {
  console.log('KM0010010form3 script35');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_11_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_11_CD');
};
// script36="child;22;UNMASK;_KM0010010form3/PJ_CLASS_12_CD,_KM0010010form3/PeekerODR_CLASS_12_CD"
expj.KM0010010.KM0010010form3.child22 = function () {
  console.log('KM0010010form3 script36');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_12_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_12_CD');
};
// script37="child;23;MASK;_KM0010010form3/PJ_CLASS_12_CD,_KM0010010form3/PeekerODR_CLASS_12_CD"
expj.KM0010010.KM0010010form3.child23 = function () {
  console.log('KM0010010form3 script37');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_12_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0010010', 'KM0010010form3', '_KM0010010form3/PeekerODR_CLASS_12_CD');
};
expj.KM0010010.KM0010010form3.executeAllOnDecision = function () {
  console.log('execute KM0010010form3.onDecision');
  for (var i = 0; i <= 11; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3['onDecision' + i])) {
        expj.KM0010010.KM0010010form3['onDecision' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.executeOnLoad = function () {
  expj.KM0010010.KM0010010form3.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3['onLoad' + i])) {
      expj.KM0010010.KM0010010form3['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0010010-KM0010010form3" action="KM0010010Servlet" name="KM0010010form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
</div><!--/tr-->
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS01",rb)%></span><!-- 案件分類01 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_01_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_01_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_01_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_01_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_01_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_01_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_01_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_01_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_01_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_01_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_01_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_01_TYP" name="PJ_CLASS_01_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_01_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_01_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_01_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_01_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_01_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_01_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_01_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_01_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_01_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_01_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_01_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_01_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_01_CD" name="PJ_CLASS_01_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_01_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_01_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_01_CD:_KM0010010form3/PJ_CLASS_01_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_01_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_01_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_01_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_01_CD', 'SQLPARAM_2', '01');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_01_CD:_KM0010010form3/PJ_CLASS_01_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_01_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_01_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_01_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_01_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_01_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_01_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_01_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_01_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_01_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_01_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_01_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_01_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_01_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_01_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_01_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_01_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_01_NAME" name="PJ_CLASS_01_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_01_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS02",rb)%></span><!-- 案件分類02 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_02_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_02_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_02_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_02_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_02_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_02_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_02_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_02_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_02_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_02_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_02_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_02_TYP" name="PJ_CLASS_02_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_02_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_02_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_02_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_02_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_02_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_02_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_02_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_02_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_02_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_02_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_02_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_02_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_02_CD" name="PJ_CLASS_02_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_02_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_02_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_02_CD:_KM0010010form3/PJ_CLASS_02_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_02_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_02_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_02_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_02_CD', 'SQLPARAM_2', '02');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_02_CD:_KM0010010form3/PJ_CLASS_02_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_02_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_02_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_02_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_02_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_02_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_02_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_02_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_02_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_02_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_02_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_02_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_02_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_02_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_02_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_02_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_02_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_02_NAME" name="PJ_CLASS_02_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_02_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS03",rb)%></span><!-- 案件分類03 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_03_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_03_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_03_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_03_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_03_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_03_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_03_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_03_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_03_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_03_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_03_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_03_TYP" name="PJ_CLASS_03_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_03_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_03_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_03_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_03_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_03_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_03_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_03_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_03_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_03_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_03_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_03_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_03_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_03_CD" name="PJ_CLASS_03_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_03_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_03_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_03_CD:_KM0010010form3/PJ_CLASS_03_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_03_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_03_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_03_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_03_CD', 'SQLPARAM_2', '03');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_03_CD:_KM0010010form3/PJ_CLASS_03_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_03_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_03_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_03_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_03_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_03_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_03_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_03_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_03_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_03_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_03_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_03_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_03_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_03_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_03_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_03_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_03_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_03_NAME" name="PJ_CLASS_03_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_03_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS04",rb)%></span><!-- 案件分類04 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_04_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_04_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_04_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_04_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_04_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_04_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_04_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_04_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_04_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_04_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_04_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_04_TYP" name="PJ_CLASS_04_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_04_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_04_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_04_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_04_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_04_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_04_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_04_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_04_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_04_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_04_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_04_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_04_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_04_CD" name="PJ_CLASS_04_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_04_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_04_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_04_CD:_KM0010010form3/PJ_CLASS_04_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_04_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_04_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_04_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_04_CD', 'SQLPARAM_2', '04');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_04_CD:_KM0010010form3/PJ_CLASS_04_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_04_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_04_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_04_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_04_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_04_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_04_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_04_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_04_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_04_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_04_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_04_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_04_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_04_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_04_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_04_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_04_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_04_NAME" name="PJ_CLASS_04_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_04_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS05",rb)%></span><!-- 案件分類05 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_05_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_05_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_05_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_05_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_05_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_05_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_05_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_05_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_05_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_05_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_05_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_05_TYP" name="PJ_CLASS_05_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_05_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_05_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_05_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_05_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_05_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_05_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_05_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_05_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_05_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_05_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_05_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_05_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_05_CD" name="PJ_CLASS_05_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_05_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_05_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_05_CD:_KM0010010form3/PJ_CLASS_05_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_05_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_05_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_05_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_05_CD', 'SQLPARAM_2', '05');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_05_CD:_KM0010010form3/PJ_CLASS_05_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_05_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_05_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_05_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_05_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_05_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_05_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_05_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_05_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_05_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_05_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_05_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_05_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_05_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_05_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_05_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_05_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_05_NAME" name="PJ_CLASS_05_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_05_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS06",rb)%></span><!-- 案件分類06 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_06_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_06_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_06_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_06_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_06_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_06_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_06_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_06_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_06_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_06_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_06_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_06_TYP" name="PJ_CLASS_06_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_06_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_06_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_06_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_06_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_06_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_06_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_06_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_06_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_06_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_06_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_06_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_06_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_06_CD" name="PJ_CLASS_06_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_06_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_06_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_06_CD:_KM0010010form3/PJ_CLASS_06_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_06_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_06_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_06_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_06_CD', 'SQLPARAM_2', '06');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_06_CD:_KM0010010form3/PJ_CLASS_06_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_06_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_06_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_06_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_06_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_06_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_06_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_06_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_06_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_06_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_06_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_06_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_06_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_06_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_06_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_06_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_06_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_06_NAME" name="PJ_CLASS_06_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_06_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS07",rb)%></span><!-- 案件分類07 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_07_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_07_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_07_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_07_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_07_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_07_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_07_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_07_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_07_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_07_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_07_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_07_TYP" name="PJ_CLASS_07_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_07_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_07_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_07_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_07_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_07_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_07_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_07_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_07_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_07_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_07_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_07_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_07_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_07_CD" name="PJ_CLASS_07_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_07_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_07_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_07_CD:_KM0010010form3/PJ_CLASS_07_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_07_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_07_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_07_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_07_CD', 'SQLPARAM_2', '07');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_07_CD:_KM0010010form3/PJ_CLASS_07_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_07_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_07_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_07_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_07_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_07_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_07_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_07_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_07_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_07_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_07_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_07_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_07_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_07_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_07_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_07_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_07_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_07_NAME" name="PJ_CLASS_07_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_07_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS08",rb)%></span><!-- 案件分類08 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_08_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_08_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_08_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_08_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_08_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_08_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_08_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_08_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_08_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_08_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_08_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_08_TYP" name="PJ_CLASS_08_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_08_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_08_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_08_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_08_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_08_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_08_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_08_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_08_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_08_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_08_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_08_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_08_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_08_CD" name="PJ_CLASS_08_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_08_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_08_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_08_CD:_KM0010010form3/PJ_CLASS_08_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_08_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_08_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_08_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_08_CD', 'SQLPARAM_2', '08');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_08_CD:_KM0010010form3/PJ_CLASS_08_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_08_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_08_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_08_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_08_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_08_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_08_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_08_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_08_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_08_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_08_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_08_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_08_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_08_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_08_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_08_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_08_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_08_NAME" name="PJ_CLASS_08_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_08_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS09",rb)%></span><!-- 案件分類09 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_09_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_09_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_09_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_09_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_09_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_09_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_09_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_09_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_09_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_09_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_09_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_09_TYP" name="PJ_CLASS_09_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_09_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_09_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_09_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_09_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_09_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_09_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_09_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_09_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_09_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_09_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_09_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_09_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_09_CD" name="PJ_CLASS_09_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_09_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_09_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_09_CD:_KM0010010form3/PJ_CLASS_09_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_09_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_09_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_09_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_09_CD', 'SQLPARAM_2', '09');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_09_CD:_KM0010010form3/PJ_CLASS_09_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_09_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_09_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_09_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_09_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_09_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_09_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_09_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_09_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_09_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_09_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_09_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_09_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_09_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_09_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_09_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_09_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_09_NAME" name="PJ_CLASS_09_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_09_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS10",rb)%></span><!-- 案件分類10 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_10_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_10_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_10_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_10_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_10_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_10_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_10_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_10_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_10_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_10_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_10_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_10_TYP" name="PJ_CLASS_10_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_10_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_10_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_10_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_10_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_10_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_10_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_10_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_10_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_10_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_10_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_10_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_10_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_10_CD" name="PJ_CLASS_10_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_10_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_10_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_10_CD:_KM0010010form3/PJ_CLASS_10_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_10_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_10_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_10_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_10_CD', 'SQLPARAM_2', '10');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_10_CD:_KM0010010form3/PJ_CLASS_10_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_10_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_10_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_10_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_10_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_10_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_10_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_10_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_10_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_10_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_10_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_10_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_10_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_10_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_10_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_10_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_10_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_10_NAME" name="PJ_CLASS_10_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_10_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS11",rb)%></span><!-- 案件分類11 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_11_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_11_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_11_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_11_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_11_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_11_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_11_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_11_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_11_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_11_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_11_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_11_TYP" name="PJ_CLASS_11_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_11_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_11_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_11_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_11_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_11_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_11_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_11_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_11_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_11_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_11_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_11_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_11_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_11_CD" name="PJ_CLASS_11_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_11_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_11_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_11_CD:_KM0010010form3/PJ_CLASS_11_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_11_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_11_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_11_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_11_CD', 'SQLPARAM_2', '11');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_11_CD:_KM0010010form3/PJ_CLASS_11_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_11_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_11_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_11_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_11_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_11_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_11_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_11_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_11_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_11_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_11_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_11_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_11_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_11_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_11_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_11_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_11_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_11_NAME" name="PJ_CLASS_11_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_11_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROJECT_CLASS12",rb)%></span><!-- 案件分類12 --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_12_TYP">
expj.KM0010010.KM0010010form3.PJ_CLASS_12_TYP = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_12_TYP.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_12_TYP.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_12_TYP.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_12_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_12_TYP', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_12_TYP.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_12_TYP.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_12_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_12_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_12_TYP" name="PJ_CLASS_12_TYP" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_12_TYP()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_12_CD">
expj.KM0010010.KM0010010form3.PJ_CLASS_12_CD = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_12_CD.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_12_CD.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_12_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_12_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_12_CD', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_12_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_12_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_12_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_12_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_12_CD" name="PJ_CLASS_12_CD" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_12_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PeekerODR_CLASS_12_CD">
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD = {};
// script1="onClick;0;PEEKER;_KM0010010form3/PJ_CLASS_12_CD:_KM0010010form3/ITEM_CLASS_12_NAME@<%=contextNo%>"
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD.onClick0 = function () {
  console.log('PeekerODR_CLASS_12_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0010010';
var parameterValues = 'PeekerODR_CLASS_12_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', '_KM0010010form3/PJ_CLASS_12_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
var checkParam = expj.common.pscript.getPeekerParam('KM0010010', 'PeekerODR_CLASS_12_CD', 'SQLPARAM_2', '12');
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010form3', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PJ_CLASS_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0010010form3/PJ_CLASS_12_CD:_KM0010010form3/ITEM_CLASS_12_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD['onClick' + i])) {
        expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PeekerODR_CLASS_12_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010form3', 'PeekerODR_CLASS_12_CD', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PeekerODR_CLASS_12_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PeekerODR_CLASS_12_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0010010-KM0010010form3-PeekerODR_CLASS_12_CD" class="KM0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010form3-PJ_CLASS_12_NAME">
expj.KM0010010.KM0010010form3.PJ_CLASS_12_NAME = {};
expj.KM0010010.KM0010010form3.PJ_CLASS_12_NAME.executeAllOnDecision = function () {
  console.log('execute KM0010010form3/PJ_CLASS_12_NAME.onDecision');
  expj.KM0010010.KM0010010form3.executeAllOnDecision();
  expj.KM0010010.executeAllOnDecision();
};
expj.KM0010010.KM0010010form3.PJ_CLASS_12_NAME.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010form3-PJ_CLASS_12_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0010010', 'KM0010010form3', 'PJ_CLASS_12_NAME', this);
  });
  expj.KM0010010.KM0010010form3.PJ_CLASS_12_NAME.executePScriptOnLoad();
};

expj.KM0010010.KM0010010form3.PJ_CLASS_12_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0010010form3/PJ_CLASS_12_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010form3-PJ_CLASS_12_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0010010-KM0010010form3-PJ_CLASS_12_NAME" name="PJ_CLASS_12_NAME" class="KM0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0010010Struct.getPJ_CLASS_12_NAME()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 " style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 " style="width:calc(100% - 189px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KM0010010-KM0010010button2">
expj.KM0010010.KM0010010button2 = {};
expj.KM0010010.KM0010010button2.executeAllOnDecision = function () {
  console.log('execute KM0010010button2.onDecision');
};
expj.KM0010010.KM0010010button2.executeOnLoad = function () {
  expj.KM0010010.KM0010010button2.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button2.executePScriptOnLoad = function () {
  console.log('execute KM0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0010010-KM0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0010010-KM0010010button2-insert">
expj.KM0010010.KM0010010button2.insert = {};
// script1="onClick;0;CHK;_KM0010010form2/AssumeDlv_date[lt]_KM0010010form2/Vend_Date@!KM00051"
expj.KM0010010.KM0010010button2.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/AssumeDlv_date')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/Vend_Date')))) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00051');
}
};
// script2="onClick;1;CHK;_KM0010010form3/PJ_CLASS_01_TYP[neq][and]_KM0010010form3/PJ_CLASS_01_CD[eq]@$KM00002:01"
expj.KM0010010.KM0010010button2.insert.onClick1 = function () {
  console.log('insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_01_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_01_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:01');
}
};
// script3="onClick;2;CHK;_KM0010010form3/PJ_CLASS_02_TYP[neq][and]_KM0010010form3/PJ_CLASS_02_CD[eq]@$KM00002:02"
expj.KM0010010.KM0010010button2.insert.onClick2 = function () {
  console.log('insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_02_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_02_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:02');
}
};
// script4="onClick;3;CHK;_KM0010010form3/PJ_CLASS_03_TYP[neq][and]_KM0010010form3/PJ_CLASS_03_CD[eq]@$KM00002:03"
expj.KM0010010.KM0010010button2.insert.onClick3 = function () {
  console.log('insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_03_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_03_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:03');
}
};
// script5="onClick;4;CHK;_KM0010010form3/PJ_CLASS_04_TYP[neq][and]_KM0010010form3/PJ_CLASS_04_CD[eq]@$KM00002:04"
expj.KM0010010.KM0010010button2.insert.onClick4 = function () {
  console.log('insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_04_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_04_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:04');
}
};
// script6="onClick;5;CHK;_KM0010010form3/PJ_CLASS_05_TYP[neq][and]_KM0010010form3/PJ_CLASS_05_CD[eq]@$KM00002:05"
expj.KM0010010.KM0010010button2.insert.onClick5 = function () {
  console.log('insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_05_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_05_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:05');
}
};
// script7="onClick;6;CHK;_KM0010010form3/PJ_CLASS_06_TYP[neq][and]_KM0010010form3/PJ_CLASS_06_CD[eq]@$KM00002:06"
expj.KM0010010.KM0010010button2.insert.onClick6 = function () {
  console.log('insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_06_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_06_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:06');
}
};
// script8="onClick;7;CHK;_KM0010010form3/PJ_CLASS_07_TYP[neq][and]_KM0010010form3/PJ_CLASS_07_CD[eq]@$KM00002:07"
expj.KM0010010.KM0010010button2.insert.onClick7 = function () {
  console.log('insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_07_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_07_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:07');
}
};
// script9="onClick;8;CHK;_KM0010010form3/PJ_CLASS_08_TYP[neq][and]_KM0010010form3/PJ_CLASS_08_CD[eq]@$KM00002:08"
expj.KM0010010.KM0010010button2.insert.onClick8 = function () {
  console.log('insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_08_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_08_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:08');
}
};
// script10="onClick;9;CHK;_KM0010010form3/PJ_CLASS_09_TYP[neq][and]_KM0010010form3/PJ_CLASS_09_CD[eq]@$KM00002:09"
expj.KM0010010.KM0010010button2.insert.onClick9 = function () {
  console.log('insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_09_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_09_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:09');
}
};
// script11="onClick;10;CHK;_KM0010010form3/PJ_CLASS_10_TYP[neq][and]_KM0010010form3/PJ_CLASS_10_CD[eq]@$KM00002:10"
expj.KM0010010.KM0010010button2.insert.onClick10 = function () {
  console.log('insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_10_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_10_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:10');
}
};
// script12="onClick;11;CHK;_KM0010010form3/PJ_CLASS_11_TYP[neq][and]_KM0010010form3/PJ_CLASS_11_CD[eq]@$KM00002:11"
expj.KM0010010.KM0010010button2.insert.onClick11 = function () {
  console.log('insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_11_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_11_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:11');
}
};
// script13="onClick;12;CHK;_KM0010010form3/PJ_CLASS_12_TYP[neq][and]_KM0010010form3/PJ_CLASS_12_CD[eq]@$KM00002:12"
expj.KM0010010.KM0010010button2.insert.onClick12 = function () {
  console.log('insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_12_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_12_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:12');
}
};
// script14="onClick;13;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0010010form1/*,_KM0010010form2/*,_KM0010010form3/*@KM0010010Servlet,,$ZZ07001"
expj.KM0010010.KM0010010button2.insert.onClick13 = function () {
  console.log('insert script14');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0010010', 'KM0010010button2', '_KM0010010form1/*,_KM0010010form2/*,_KM0010010form3/*', 'KM0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0010010', response);
expj.common.updateBusinessScreenTab('KM0010010', contents);
};
expj.common.pscript.callConfirm('KM0010010', 'KM0010010button2', 'ZZ07001', okEvent);
};
expj.KM0010010.KM0010010button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 13; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010button2.insert['onClick' + i])) {
        expj.KM0010010.KM0010010button2.insert['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010button2.insert.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010button2.insert.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010button2', 'insert', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010button2.insert.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button2.insert.executePScriptOnLoad = function () {
  console.log('execute KM0010010button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0010010-KM0010010button2-insert" name="insert" class="KM0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010button2-update">
expj.KM0010010.KM0010010button2.update = {};
// script1="onClick;0;CHK;_KM0010010form2/h_PROJECT_STAT[eq]1@*0"
expj.KM0010010.KM0010010button2.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_KM0010010form2/h_PROJECT_STAT[eq]2@*1"
expj.KM0010010.KM0010010button2.update.onClick1 = function () {
  console.log('update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_KM0010010form2/h_PROJECT_STAT[eq]3@*2"
expj.KM0010010.KM0010010button2.update.onClick2 = function () {
  console.log('update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_KM0010010form2/h_PROJECT_STAT[eq]4@*9"
expj.KM0010010.KM0010010button2.update.onClick3 = function () {
  console.log('update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script5="onClick;4;CHK;_KM0010010form2/h_PROJECT_STAT[eq]8@*3"
expj.KM0010010.KM0010010button2.update.onClick4 = function () {
  console.log('update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="onClick;5;CHK;_KM0010010form2/h_PROJECT_STAT[eq]9@*4"
expj.KM0010010.KM0010010button2.update.onClick5 = function () {
  console.log('update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="onClick;6;CHK;_KM0010010form2/h_PROJECT_STAT[eq]8@*5"
expj.KM0010010.KM0010010button2.update.onClick6 = function () {
  console.log('update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="onClick;7;CHK;_KM0010010form2/h_PROJECT_STAT[eq]8@*6"
expj.KM0010010.KM0010010button2.update.onClick7 = function () {
  console.log('update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '8')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="onClick;8;CHK;_KM0010010form2/h_PROJECT_STAT[eq]4@*7"
expj.KM0010010.KM0010010button2.update.onClick8 = function () {
  console.log('update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_PROJECT_STAT'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="onClick;9;CHK;_KM0010010form2/h_COMPLETE_STAT[eq]0@*8"
expj.KM0010010.KM0010010button2.update.onClick9 = function () {
  console.log('update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_COMPLETE_STAT'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="onClick;10;CHK;_KM0010010form2/AssumeDlv_date[lt]_KM0010010form2/Vend_Date@!KM00051"
expj.KM0010010.KM0010010button2.update.onClick10 = function () {
  console.log('update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/AssumeDlv_date')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/Vend_Date')))) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00051');
}
};
// script12="onClick;11;CHK;_KM0010010form3/PJ_CLASS_01_TYP[neq][and]_KM0010010form3/PJ_CLASS_01_CD[eq]@$KM00002:01"
expj.KM0010010.KM0010010button2.update.onClick11 = function () {
  console.log('update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_01_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_01_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:01');
}
};
// script13="onClick;12;CHK;_KM0010010form3/PJ_CLASS_02_TYP[neq][and]_KM0010010form3/PJ_CLASS_02_CD[eq]@$KM00002:02"
expj.KM0010010.KM0010010button2.update.onClick12 = function () {
  console.log('update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_02_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_02_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:02');
}
};
// script14="onClick;13;CHK;_KM0010010form3/PJ_CLASS_03_TYP[neq][and]_KM0010010form3/PJ_CLASS_03_CD[eq]@$KM00002:03"
expj.KM0010010.KM0010010button2.update.onClick13 = function () {
  console.log('update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_03_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_03_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:03');
}
};
// script15="onClick;14;CHK;_KM0010010form3/PJ_CLASS_04_TYP[neq][and]_KM0010010form3/PJ_CLASS_04_CD[eq]@$KM00002:04"
expj.KM0010010.KM0010010button2.update.onClick14 = function () {
  console.log('update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_04_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_04_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:04');
}
};
// script16="onClick;15;CHK;_KM0010010form3/PJ_CLASS_05_TYP[neq][and]_KM0010010form3/PJ_CLASS_05_CD[eq]@$KM00002:05"
expj.KM0010010.KM0010010button2.update.onClick15 = function () {
  console.log('update script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_05_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_05_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:05');
}
};
// script17="onClick;16;CHK;_KM0010010form3/PJ_CLASS_06_TYP[neq][and]_KM0010010form3/PJ_CLASS_06_CD[eq]@$KM00002:06"
expj.KM0010010.KM0010010button2.update.onClick16 = function () {
  console.log('update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_06_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_06_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:06');
}
};
// script18="onClick;17;CHK;_KM0010010form3/PJ_CLASS_07_TYP[neq][and]_KM0010010form3/PJ_CLASS_07_CD[eq]@$KM00002:07"
expj.KM0010010.KM0010010button2.update.onClick17 = function () {
  console.log('update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_07_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_07_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:07');
}
};
// script19="onClick;18;CHK;_KM0010010form3/PJ_CLASS_08_TYP[neq][and]_KM0010010form3/PJ_CLASS_08_CD[eq]@$KM00002:08"
expj.KM0010010.KM0010010button2.update.onClick18 = function () {
  console.log('update script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_08_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_08_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:08');
}
};
// script20="onClick;19;CHK;_KM0010010form3/PJ_CLASS_09_TYP[neq][and]_KM0010010form3/PJ_CLASS_09_CD[eq]@$KM00002:09"
expj.KM0010010.KM0010010button2.update.onClick19 = function () {
  console.log('update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_09_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_09_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:09');
}
};
// script21="onClick;20;CHK;_KM0010010form3/PJ_CLASS_10_TYP[neq][and]_KM0010010form3/PJ_CLASS_10_CD[eq]@$KM00002:10"
expj.KM0010010.KM0010010button2.update.onClick20 = function () {
  console.log('update script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_10_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_10_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:10');
}
};
// script22="onClick;21;CHK;_KM0010010form3/PJ_CLASS_11_TYP[neq][and]_KM0010010form3/PJ_CLASS_11_CD[eq]@$KM00002:11"
expj.KM0010010.KM0010010button2.update.onClick21 = function () {
  console.log('update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_11_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_11_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:11');
}
};
// script23="onClick;22;CHK;_KM0010010form3/PJ_CLASS_12_TYP[neq][and]_KM0010010form3/PJ_CLASS_12_CD[eq]@$KM00002:12"
expj.KM0010010.KM0010010button2.update.onClick22 = function () {
  console.log('update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_12_TYP'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form3/PJ_CLASS_12_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00002:12');
}
};
// script24="onClick;23;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0010010form1/*,_KM0010010form2/*,_KM0010010form3/*@KM0010010Servlet,,$ZZ07003"
expj.KM0010010.KM0010010button2.update.onClick23 = function () {
  console.log('update script24');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0010010', 'KM0010010button2', '_KM0010010form1/*,_KM0010010form2/*,_KM0010010form3/*', 'KM0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0010010', response);
expj.common.updateBusinessScreenTab('KM0010010', contents);
};
expj.common.pscript.callConfirm('KM0010010', 'KM0010010button2', 'ZZ07003', okEvent);
};
// script25="child;0;CHK;_KM0010010form2/PROJECT_STAT[eq]2[or]_KM0010010form2/PROJECT_STAT[eq]3[or]_KM0010010form2/PROJECT_STAT[eq]4[or]_KM0010010form2/PROJECT_STAT[eq]9@!KM00005"
expj.KM0010010.KM0010010button2.update.child0 = function () {
  console.log('update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00005');
}
};
// script26="child;1;CHK;_KM0010010form2/PROJECT_STAT[eq]1[or]_KM0010010form2/PROJECT_STAT[eq]3[or]_KM0010010form2/PROJECT_STAT[eq]4[or]_KM0010010form2/PROJECT_STAT[eq]9@!KM00005"
expj.KM0010010.KM0010010button2.update.child1 = function () {
  console.log('update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00005');
}
};
// script27="child;2;CHK;_KM0010010form2/PROJECT_STAT[eq]1[or]_KM0010010form2/PROJECT_STAT[eq]2[or]_KM0010010form2/PROJECT_STAT[eq]4[or]_KM0010010form2/PROJECT_STAT[eq]8[or]_KM0010010form2/PROJECT_STAT[eq]9@!KM00005"
expj.KM0010010.KM0010010button2.update.child2 = function () {
  console.log('update script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '8') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00005');
}
};
// script28="child;3;CHK;_KM0010010form2/PROJECT_STAT[eq]3[or]_KM0010010form2/PROJECT_STAT[eq]4[or]_KM0010010form2/PROJECT_STAT[eq]9@!KM00005"
expj.KM0010010.KM0010010button2.update.child3 = function () {
  console.log('update script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '4') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00005');
}
};
// script29="child;4;CHK;_KM0010010form2/PROJECT_STAT[eq]1[or]_KM0010010form2/PROJECT_STAT[eq]2[or]_KM0010010form2/PROJECT_STAT[eq]3[or]_KM0010010form2/PROJECT_STAT[eq]8@!KM00005"
expj.KM0010010.KM0010010button2.update.child4 = function () {
  console.log('update script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '8')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00005');
}
};
// script30="child;5;CHK;_KM0010010form2/PROJECT_STAT[eq]1[and]_KM0010010form2/h_ESTIMATE[eq]1@!KM00020"
expj.KM0010010.KM0010010button2.update.child5 = function () {
  console.log('update script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_ESTIMATE'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00020');
}
};
// script31="child;6;CHK;_KM0010010form2/PROJECT_STAT[eq]2[and]_KM0010010form2/h_ESTIMATE[eq]0@!KM00021"
expj.KM0010010.KM0010010button2.update.child6 = function () {
  console.log('update script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_ESTIMATE'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00021');
}
};
// script32="child;7;CHK;_KM0010010form2/PROJECT_STAT[eq]9[and]_KM0010010form2/h_COMPLETE_STAT[eq]0@!KM00008"
expj.KM0010010.KM0010010button2.update.child7 = function () {
  console.log('update script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/h_COMPLETE_STAT'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00008');
}
};
// script33="child;8;CHK;_KM0010010form2/PROJECT_STAT[eq]9@$KM00009"
expj.KM0010010.KM0010010button2.update.child8 = function () {
  console.log('update script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '9')) {
expj.common.pscript.addWarningMessage('KM0010010', 'KM0010010button2', 'KM00009');
}
};
// script34="child;9;CHK;_KM0010010form2/PROJECT_STAT[eq]1[or]_KM0010010form2/PROJECT_STAT[eq]2[or]_KM0010010form2/PROJECT_STAT[eq]3[or]_KM0010010form2/PROJECT_STAT[eq]8@!KM00005"
expj.KM0010010.KM0010010button2.update.child9 = function () {
  console.log('update script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '2') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0010010', 'KM0010010button2', '_KM0010010form2/PROJECT_STAT'), '[eq]', '8')) {
expj.common.pscript.viewErrorMessage('KM0010010', 'KM0010010button2', 'KM00005');
}
};
expj.KM0010010.KM0010010button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 23; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010button2.update['onClick' + i])) {
        expj.KM0010010.KM0010010button2.update['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010button2.update.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010button2.update.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010button2', 'update', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010button2.update.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button2.update.executePScriptOnLoad = function () {
  console.log('execute KM0010010button2/update.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0010010-KM0010010button2-update" name="update" class="KM0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010button2-delete">
expj.KM0010010.KM0010010button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0010010form1/*,_KM0010010form2/*,_KM0010010form3/*@KM0010010Servlet,,$ZZ07004"
expj.KM0010010.KM0010010button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0010010', 'KM0010010button2', '_KM0010010form1/*,_KM0010010form2/*,_KM0010010form3/*', 'KM0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0010010', response);
expj.common.updateBusinessScreenTab('KM0010010', contents);
};
expj.common.pscript.callConfirm('KM0010010', 'KM0010010button2', 'ZZ07004', okEvent);
};
expj.KM0010010.KM0010010button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010button2.delete['onClick' + i])) {
        expj.KM0010010.KM0010010button2.delete['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010button2.delete.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010button2.delete.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010button2', 'delete', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010button2.delete.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button2.delete.executePScriptOnLoad = function () {
  console.log('execute KM0010010button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0010010-KM0010010button2-delete" name="delete" class="KM0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/tab END-->
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
<span class="version">KM0010010 Revision: 1.1  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KM0010010-KM0010010button0">
expj.KM0010010.KM0010010button0 = {};
expj.KM0010010.KM0010010button0.executeAllOnDecision = function () {
  console.log('execute KM0010010button0.onDecision');
};
expj.KM0010010.KM0010010button0.executeOnLoad = function () {
  expj.KM0010010.KM0010010button0.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button0.executePScriptOnLoad = function () {
  console.log('execute KM0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0010010-KM0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0010010-KM0010010button0-clear">
expj.KM0010010.KM0010010button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KM0010010Servlet,,$ZZ07008"
expj.KM0010010.KM0010010button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0010010', 'KM0010010button0', '', 'KM0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0010010', response);
expj.common.updateBusinessScreenTab('KM0010010', contents);
};
expj.common.pscript.callConfirm('KM0010010', 'KM0010010button0', 'ZZ07008', okEvent);
};
expj.KM0010010.KM0010010button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010button0.clear['onClick' + i])) {
        expj.KM0010010.KM0010010button0.clear['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010button0.clear.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010button0.clear.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010button0', 'clear', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010button0.clear.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button0.clear.executePScriptOnLoad = function () {
  console.log('execute KM0010010button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0010010-KM0010010button0-clear" name="clear" class="KM0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KM0010010-KM0010010button0-close">
expj.KM0010010.KM0010010button0.close = {};
// script1="onClick;0;CLOSE"
expj.KM0010010.KM0010010button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('KM0010010');
};
expj.KM0010010.KM0010010button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0010010.KM0010010button0.close['onClick' + i])) {
        expj.KM0010010.KM0010010button0.close['onClick' + i]();
      }
    }
  }
};
expj.KM0010010.KM0010010button0.close.executeAllOnDecision = function () {
};
expj.KM0010010.KM0010010button0.close.executeOnLoad = function () {
  $('#expj-KM0010010-KM0010010button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0010010', 'KM0010010button0', 'close', this, 'Button');
    }
  });
  expj.KM0010010.KM0010010button0.close.executePScriptOnLoad();
};

expj.KM0010010.KM0010010button0.close.executePScriptOnLoad = function () {
  console.log('execute KM0010010button0/close.onLoad');
  var targetComponent = document.getElementById('expj-KM0010010-KM0010010button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0010010-KM0010010button0-close" name="close" class="KM0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KM0010010 (END)-->
<%
MessageStruct msgStruct = aKM0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KM0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KM0010010)) {
  expj.common.treeInstanceMap.KM0010010 = {};
}
expj.common.treeInstanceMap.KM0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KM0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KM0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KM0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KM0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KM0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KM0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KM0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KM0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0010010)) {
  expj.common.detailDialogMap.KM0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KM0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.KM0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KM0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KM0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KM0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KM0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KM0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KM0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KM0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KM0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KM0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KM0010010)) {
  expj.common.viewInstanceMap.KM0010010 = {};
}
expj.common.viewInstanceMap.KM0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.KM0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KM0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KM0010010.<%=viewId %>.init = function () {
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
    expj.KM0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KM0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KM0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KM0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KM0010010_init">
/**
 * KM0010010用のロード完了時初期化関数
 */
expj.KM0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KM0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KM0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KM0010010');
  expj.common.calendarInstanceMap.KM0010010 = {};
  $('#expj-KM0010010-KM0010010tabs-tabIndex').append('<li><a href="#expj-KM0010010-KM0010010form2" draggable="false"><span>** 1 **</span></a></li>');
  $('#expj-KM0010010-KM0010010tabs-tabIndex').append('<li><a href="#expj-KM0010010-KM0010010form3" draggable="false"><span>** 2 **</span></a></li>');
  if (!expj.common.checkNameSpace(expj.common.innerTabMap.KM0010010)) {
    expj.common.innerTabMap.KM0010010 = null;
  }
  $(window).ready(function(){
    $('#expj-KM0010010-KM0010010tabs').tabs({
      'beforeActivate': function (event, ui) {
        expj.common.manageChangeInnerTabPage(ui);
        expj.common.innerTabMap.KM0010010 = ui.newTab.attr('aria-controls');
      },
      'activate' : function (event, ui) {
        expj.common.manageChangeInnerTabPageAfter(ui);
      }
    });
    var innerTabPanelList = $('#expj-KM0010010-KM0010010tabs').find('.ui-tabs-panel');
    for (var i = 1; i < innerTabPanelList.length; i++) {
      var target = $(innerTabPanelList[i]);
      target.parent().parent().css('display', 'none');
    }
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KM0010010');
    if (expj.common.innerTabMap.KM0010010 !== null) {
      $('#expj-business-screen-tabs-body-KM0010010').find('li[aria-controls="' + expj.common.innerTabMap.KM0010010 + '"] a').click();
    }
  });
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KM0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KM0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KM0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KM0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KM0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KM0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KM0010010-<%=detailId %>');
<%
 }
%>
  try{expj.KM0010010.KM0010010form1.PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form1.h_PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form1.PeekerIProjectCd.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form1.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form1.PROJECT_CD_FLG.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button1.select.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PROJECT_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PeekerICustCd.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.h_PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.COMPLETE_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.ACCURACY_LEVEL.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.h_ESTIMATE.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.h_COMPLETE_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.Vend_Date.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.CalendarVend_Date.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.AssumeDlv_date.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.CalendarAssumeDlv_date.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.AssumeAmount.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.CurUnit.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.ASSUME_AMOUNT_EXCH_RATES.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.DLV_LOC_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PeekerIDlvLocCd.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.DLV_LOC_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PJ_USER_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PeekerIOwnPerCd.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PJ_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.PeekerIOwnOrgCd.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.REMARKS1.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.REMARKS2.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.REMARKS3.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.REMARKS4.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.REMARKS5.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.OD_COMP_FLG.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.h_OD_COMP_FLG.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_01_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_01_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_01_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_01_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_02_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_02_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_02_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_02_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_03_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_03_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_03_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_03_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_04_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_04_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_04_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_04_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_05_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_05_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_05_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_05_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_06_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_06_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_06_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_06_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_07_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_07_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_07_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_07_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_08_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_08_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_08_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_08_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_09_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_09_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_09_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_09_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_10_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_10_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_10_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_10_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_11_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_11_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_11_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_11_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_12_TYP.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_12_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PeekerODR_CLASS_12_CD.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.PJ_CLASS_12_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button2.insert.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button2.update.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button2.delete.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button0.clear.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button0.close.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form1.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button1.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form2.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010form3.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button2.executeOnLoad();}catch(e){};
  try{expj.KM0010010.KM0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KM0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KM0010010', 'KM0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KM0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KM0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.KM0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KM0010010', '<%=request.getContextPath() %>');
};

/**
 * KM0010010の全体onDecision処理
 */
expj.KM0010010.executeAllOnDecision = function () {
  expj.KM0010010.KM0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KM0010010_console">
expj.KM0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>