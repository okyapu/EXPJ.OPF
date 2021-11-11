<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:04:02 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0060\AE0060020.html
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
<jsp:useBean id="aAE0060020Control" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060020Control" scope="request"/>
<jsp:useBean id="aAE0060020Struct" class="com.nec.jp.orteus.metamorBase.AE0060.AE0060020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

受入実績メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/jsp/AE0060020.jsp,v $
$Author: geng-jia $  
$Revision: 1.39 $ $Date: 2017/02/22 02:05:13 $
********************************************************* --%>
<html>
<head>
<title>受入実績メンテナンス</title>
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
<script class="expj-script-AE0060020_init">
  // AE0060020名前空間
  expj.AE0060020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AE0060020" data-screen="AE0060020" data-newdata="<%=aAE0060020Control.isNewData() %>">
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
              <script class="expj-script-AE0060020-AE0060020form1">
expj.AE0060020.AE0060020form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7,8"
expj.AE0060020.AE0060020form1.onLoad0 = function () {
  console.log('AE0060020form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision8)){this.onDecision8();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AE0060020.AE0060020form1.onDecision0 = function () {
  console.log('AE0060020form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0060020', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AE0060020button1/Select"
expj.AE0060020.AE0060020form1.child0 = function () {
  console.log('AE0060020form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button1/Select');
};
// script4="child;1;MASK;_AE0060020button1/Select"
expj.AE0060020.AE0060020form1.child1 = function () {
  console.log('AE0060020form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button1/Select');
};
// script5="onDecision;1;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[neq]9[and]?PUCH_ODR_CD[eq]SAME[and]?AE0060020form1/*[eq]NORMAL@*2,*3"
expj.AE0060020.AE0060020form1.onDecision1 = function () {
  console.log('AE0060020form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[neq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AE0060020button2/LineInsert"
expj.AE0060020.AE0060020form1.child2 = function () {
  console.log('AE0060020form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button2/LineInsert');
};
// script7="child;3;MASK;_AE0060020button2/LineInsert"
expj.AE0060020.AE0060020form1.child3 = function () {
  console.log('AE0060020form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button2/LineInsert');
};
// script8="onDecision;2;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[neq]9[and]?PUCH_ODR_CD[eq]SAME[and]?AE0060020form1/*[eq]NORMAL@*4,*6"
expj.AE0060020.AE0060020form1.onDecision2 = function () {
  console.log('AE0060020form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[neq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;4;CHKRQ;?AE0060020view1/?[eq]SINGLE@*5,*6"
expj.AE0060020.AE0060020form1.child4 = function () {
  console.log('AE0060020form1 script9');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_AE0060020button2/LineUpdate"
expj.AE0060020.AE0060020form1.child5 = function () {
  console.log('AE0060020form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button2/LineUpdate');
};
// script11="child;6;MASK;_AE0060020button2/LineUpdate"
expj.AE0060020.AE0060020form1.child6 = function () {
  console.log('AE0060020form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button2/LineUpdate');
};
// script12="onDecision;3;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[eq]9[and]_AE0060020form1/h_ODR_CANCEL_SLIP_ISS_FLG[eq]0[and]?PUCH_ODR_CD[eq]SAME[and]?AE0060020form1/*[eq]NORMAL@*7,*8"
expj.AE0060020.AE0060020form1.onDecision3 = function () {
  console.log('AE0060020form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[eq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_AE0060020form1/h_ODR_CANCEL_SLIP_ISS_FLG'), '[eq]', '0') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script13="child;7;UNMASK;_AE0060020button0/CancelComplete"
expj.AE0060020.AE0060020form1.child7 = function () {
  console.log('AE0060020form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button0/CancelComplete');
};
// script14="child;8;MASK;_AE0060020button0/CancelComplete"
expj.AE0060020.AE0060020form1.child8 = function () {
  console.log('AE0060020form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button0/CancelComplete');
};
// script15="onDecision;4;CHK;?PUCH_ODR_CD[eq]SAME@*9,*12"
expj.AE0060020.AE0060020form1.onDecision4 = function () {
  console.log('AE0060020form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script16="child;9;CHK;?AE0060020form1/*[eq]NORMAL[or]?AE0060020form1/*[eq]TOO_MANY@*10,*12"
expj.AE0060020.AE0060020form1.child9 = function () {
  console.log('AE0060020form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script17="child;10;CHKRQ;?AE0060020view1/?[eq]SINGLE@*11,*12"
expj.AE0060020.AE0060020form1.child10 = function () {
  console.log('AE0060020form1 script17');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script18="child;11;UNMASK;_AE0060020button3/UseParts"
expj.AE0060020.AE0060020form1.child11 = function () {
  console.log('AE0060020form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/UseParts');
};
// script19="child;12;MASK;_AE0060020button3/UseParts"
expj.AE0060020.AE0060020form1.child12 = function () {
  console.log('AE0060020form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/UseParts');
};
// script20="onDecision;5;CHK;?PUCH_ODR_CD[eq]SAME@*13,*16"
expj.AE0060020.AE0060020form1.onDecision5 = function () {
  console.log('AE0060020form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script21="child;13;CHK;?AE0060020form1/*[eq]NORMAL[or]?AE0060020form1/*[eq]TOO_MANY@*14,*16"
expj.AE0060020.AE0060020form1.child13 = function () {
  console.log('AE0060020form1 script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script22="child;14;CHKRQ;?AE0060020view1/?[eq]SINGLE,?AE0060020view2/?[eq]SINGLE@*15,*16"
expj.AE0060020.AE0060020form1.child14 = function () {
  console.log('AE0060020form1 script22');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020view1/?'), '[eq]', 'SINGLE')) && (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020view2/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script23="child;15;UNMASK;_AE0060020button3/NoUserParts"
expj.AE0060020.AE0060020form1.child15 = function () {
  console.log('AE0060020form1 script23');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/NoUserParts');
};
// script24="child;16;MASK;_AE0060020button3/NoUserParts"
expj.AE0060020.AE0060020form1.child16 = function () {
  console.log('AE0060020form1 script24');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/NoUserParts');
};
// script25="onDecision;6;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[neq]9[and]?PUCH_ODR_CD[eq]SAME[and]?AE0060020form1/*[eq]NORMAL@*17,*19"
expj.AE0060020.AE0060020form1.onDecision6 = function () {
  console.log('AE0060020form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[neq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script26="child;17;CHKRQ;?AE0060020view1/?[eq]SINGLE@*18,*19"
expj.AE0060020.AE0060020form1.child17 = function () {
  console.log('AE0060020form1 script26');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script27="child;18;UNMASK;_AE0060020button3/UseParts"
expj.AE0060020.AE0060020form1.child18 = function () {
  console.log('AE0060020form1 script27');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/UseParts');
};
// script28="child;19;MASK;_AE0060020button3/UseParts"
expj.AE0060020.AE0060020form1.child19 = function () {
  console.log('AE0060020form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/UseParts');
};
// script29="onDecision;7;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[neq]9[and]?PUCH_ODR_CD[eq]SAME[and]?AE0060020form1/*[eq]NORMAL@*20,*22"
expj.AE0060020.AE0060020form1.onDecision7 = function () {
  console.log('AE0060020form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[neq]', '9') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script30="child;20;CHKRQ;?AE0060020view1/?[eq]SINGLE,?AE0060020view2/?[eq]SINGLE@*21,*22"
expj.AE0060020.AE0060020form1.child20 = function () {
  console.log('AE0060020form1 script30');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020view1/?'), '[eq]', 'SINGLE')) && (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020view2/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script31="child;21;UNMASK;_AE0060020button3/NoUserParts"
expj.AE0060020.AE0060020form1.child21 = function () {
  console.log('AE0060020form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/NoUserParts');
};
// script32="child;22;MASK;_AE0060020button3/NoUserParts"
expj.AE0060020.AE0060020form1.child22 = function () {
  console.log('AE0060020form1 script32');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button3/NoUserParts');
};
// script33="onDecision;8;CHK;_AE0060020form1/h_ODR_CANCEL_SLIP_ISS_FLG[eq]1[and]?PUCH_ODR_CD[eq]SAME[and]?AE0060020form1/*[eq]NORMAL@*23,*24"
expj.AE0060020.AE0060020form1.onDecision8 = function () {
  console.log('AE0060020form1 script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_AE0060020form1/h_ODR_CANCEL_SLIP_ISS_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?PUCH_ODR_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '?AE0060020form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script34="child;23;UNMASK;_AE0060020button0/CancelOdrCancel"
expj.AE0060020.AE0060020form1.child23 = function () {
  console.log('AE0060020form1 script34');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button0/CancelOdrCancel');
};
// script35="child;24;MASK;_AE0060020button0/CancelOdrCancel"
expj.AE0060020.AE0060020form1.child24 = function () {
  console.log('AE0060020form1 script35');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060020form1', '_AE0060020button0/CancelOdrCancel');
};
expj.AE0060020.AE0060020form1.executeAllOnDecision = function () {
  console.log('execute AE0060020form1.onDecision');
  for (var i = 0; i <= 8; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020form1['onDecision' + i])) {
        expj.AE0060020.AE0060020form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020form1.executeOnLoad = function () {
  expj.AE0060020.AE0060020form1.executePScriptOnLoad();
};

expj.AE0060020.AE0060020form1.executePScriptOnLoad = function () {
  console.log('execute AE0060020form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0060020.AE0060020form1['onLoad' + i])) {
      expj.AE0060020.AE0060020form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060020-AE0060020form1" action="AE0060020Servlet" name="AE0060020form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAE0060020Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060020form1-PUCH_ODR_CD">
expj.AE0060020.AE0060020form1.PUCH_ODR_CD = {};
expj.AE0060020.AE0060020form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060020form1/PUCH_ODR_CD.onDecision');
  expj.AE0060020.AE0060020form1.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060020form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060020form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0060020.AE0060020form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0060020.AE0060020form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060020form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060020form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0060020-focus-move  required-value expj-AE0060020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060020form1-h_LOTCTRL" name="h_LOTCTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_LOTCTRL()) %>">
<script class="expj-script-AE0060020-AE0060020form1-h_LOTCTRL">
expj.AE0060020.AE0060020form1.h_LOTCTRL = {};
expj.AE0060020.AE0060020form1.h_LOTCTRL.executeAllOnDecision = function () {
  console.log('execute AE0060020form1/h_LOTCTRL.onDecision');
  expj.AE0060020.AE0060020form1.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060020form1.h_LOTCTRL.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020form1-h_LOTCTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060020form1', 'h_LOTCTRL', this);
  });
  expj.AE0060020.AE0060020form1.h_LOTCTRL.executePScriptOnLoad();
};

expj.AE0060020.AE0060020form1.h_LOTCTRL.executePScriptOnLoad = function () {
  console.log('execute AE0060020form1/h_LOTCTRL.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020form1-h_LOTCTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AE0060020-AE0060020form1-PeekerPuchOdrCd">
expj.AE0060020.AE0060020form1.PeekerPuchOdrCd = {};
// script1="onClick;0;PEEKER;_AE0060020form1/PUCH_ODR_CD@<%=contextNo%>"
expj.AE0060020.AE0060020form1.PeekerPuchOdrCd.onClick0 = function () {
  console.log('PeekerPuchOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060020';
var parameterValues = 'PeekerPuchOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AE0060020', 'PeekerPuchOdrCd', 'SQLPARAM_1', '<%=aAE0060020Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020form1', '_PUCH_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PUCH_ODR_CD_12%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060020form1/PUCH_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060020.AE0060020form1.PeekerPuchOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020form1.PeekerPuchOdrCd['onClick' + i])) {
        expj.AE0060020.AE0060020form1.PeekerPuchOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020form1.PeekerPuchOdrCd.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020form1.PeekerPuchOdrCd.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020form1-PeekerPuchOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020form1', 'PeekerPuchOdrCd', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020form1.PeekerPuchOdrCd.executePScriptOnLoad();
};

expj.AE0060020.AE0060020form1.PeekerPuchOdrCd.executePScriptOnLoad = function () {
  console.log('execute AE0060020form1/PeekerPuchOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020form1-PeekerPuchOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060020-AE0060020form1-PeekerPuchOdrCd" class="AE0060020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060020form1-h_PUCH_ODR_CD" name="h_PUCH_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_PUCH_ODR_CD()) %>">
<script class="expj-script-AE0060020-AE0060020form1-h_PUCH_ODR_CD">
expj.AE0060020.AE0060020form1.h_PUCH_ODR_CD = {};
expj.AE0060020.AE0060020form1.h_PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060020form1/h_PUCH_ODR_CD.onDecision');
  expj.AE0060020.AE0060020form1.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060020form1.h_PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020form1-h_PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060020form1', 'h_PUCH_ODR_CD', this);
  });
  expj.AE0060020.AE0060020form1.h_PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0060020.AE0060020form1.h_PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060020form1/h_PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020form1-h_PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060020form1-h_ODR_CANCEL_SLIP_ISS_FLG" name="h_ODR_CANCEL_SLIP_ISS_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_ODR_CANCEL_SLIP_ISS_FLG()) %>">
<script class="expj-script-AE0060020-AE0060020form1-h_ODR_CANCEL_SLIP_ISS_FLG">
expj.AE0060020.AE0060020form1.h_ODR_CANCEL_SLIP_ISS_FLG = {};
expj.AE0060020.AE0060020form1.h_ODR_CANCEL_SLIP_ISS_FLG.executeAllOnDecision = function () {
  console.log('execute AE0060020form1/h_ODR_CANCEL_SLIP_ISS_FLG.onDecision');
  expj.AE0060020.AE0060020form1.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060020form1.h_ODR_CANCEL_SLIP_ISS_FLG.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020form1-h_ODR_CANCEL_SLIP_ISS_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060020form1', 'h_ODR_CANCEL_SLIP_ISS_FLG', this);
  });
  expj.AE0060020.AE0060020form1.h_ODR_CANCEL_SLIP_ISS_FLG.executePScriptOnLoad();
};

expj.AE0060020.AE0060020form1.h_ODR_CANCEL_SLIP_ISS_FLG.executePScriptOnLoad = function () {
  console.log('execute AE0060020form1/h_ODR_CANCEL_SLIP_ISS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020form1-h_ODR_CANCEL_SLIP_ISS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060020form1-PUCH_ODR_MODIFY_COUNT" name="PUCH_ODR_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_MODIFY_COUNT()) %>">
<script class="expj-script-AE0060020-AE0060020form1-PUCH_ODR_MODIFY_COUNT">
expj.AE0060020.AE0060020form1.PUCH_ODR_MODIFY_COUNT = {};
expj.AE0060020.AE0060020form1.PUCH_ODR_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AE0060020form1/PUCH_ODR_MODIFY_COUNT.onDecision');
  expj.AE0060020.AE0060020form1.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060020form1.PUCH_ODR_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020form1-PUCH_ODR_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060020form1', 'PUCH_ODR_MODIFY_COUNT', this);
  });
  expj.AE0060020.AE0060020form1.PUCH_ODR_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AE0060020.AE0060020form1.PUCH_ODR_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AE0060020form1/PUCH_ODR_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020form1-PUCH_ODR_MODIFY_COUNT');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0060020-AE0060020button1">
expj.AE0060020.AE0060020button1 = {};
expj.AE0060020.AE0060020button1.executeAllOnDecision = function () {
  console.log('execute AE0060020button1.onDecision');
};
expj.AE0060020.AE0060020button1.executeOnLoad = function () {
  expj.AE0060020.AE0060020button1.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button1.executePScriptOnLoad = function () {
  console.log('execute AE0060020button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060020-AE0060020button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060020-AE0060020button1-Detail">
expj.AE0060020.AE0060020button1.Detail = {};
// script1="onClick;0;FSHOW;AE0060020float1"
expj.AE0060020.AE0060020button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AE0060020', 'AE0060020float1', '');
};
expj.AE0060020.AE0060020button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button1.Detail['onClick' + i])) {
        expj.AE0060020.AE0060020button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button1.Detail.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button1.Detail.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button1', 'Detail', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button1.Detail.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AE0060020button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button1-Detail" name="Detail" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060020button1-Select">
expj.AE0060020.AE0060020button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060020form1/*@AE0060020Servlet"
expj.AE0060020.AE0060020button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button1', '_AE0060020form1/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.updateBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060020.AE0060020button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button1.Select['onClick' + i])) {
        expj.AE0060020.AE0060020button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button1.Select.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button1.Select.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button1', 'Select', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button1.Select.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button1.Select.executePScriptOnLoad = function () {
  console.log('execute AE0060020button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button1-Select" name="Select" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0060020-AE0060020view1">
expj.AE0060020.AE0060020view1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ClickShow=ACT,_AE0060020form1/*,_AE0060020view1/+@AE0060020Servlet"
expj.AE0060020.AE0060020view1.onClick0 = function () {
  console.log('AE0060020view1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020view1', 'ClickShow=ACT,_AE0060020form1/*,_AE0060020view1/+', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.updateBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060020.AE0060020view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020view1['onClick' + i])) {
        expj.AE0060020.AE0060020view1['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020view1.executeAllOnDecision = function () {
  console.log('execute AE0060020view1.onDecision');
};
expj.AE0060020.AE0060020view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0060020view1", "expj.AE0060020.AE0060020view1.executeAllOnClick");
%>
  expj.AE0060020.AE0060020view1.executePScriptOnLoad();
};

expj.AE0060020.AE0060020view1.executePScriptOnLoad = function () {
  console.log('execute AE0060020view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0060020-AE0060020view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0060020view1_Id = "AE0060020view1";
 String AE0060020view1_select = "single";
 String AE0060020view1_sortable = "true";
 String AE0060020view1_resize = "true";
 String AE0060020view1_scroll = "true";
 StringBuffer AE0060020view1_HB = new StringBuffer();
 StringBuffer AE0060020view1_DB = new StringBuffer();
%>
<%
 AE0060020view1_select = "single";
 AE0060020view1_sortable = "true";
 AE0060020view1_resize = "true";
 AE0060020view1_scroll = "true";
%>
<%
 AE0060020view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
%>
     
<%
AE0060020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_NO",rb))).append("', 'name':'l_ACPT_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_QTY_2",rb))).append("', 'name':'l_ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD_2",rb))).append("', 'name':'l_WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_NAME_1",rb))).append("', 'name':'l_WH_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DLV_CD",rb))).append("', 'name':'l_DLV_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST",rb))).append("', 'name':'l_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'l_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
AE0060020view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_STS_TYP_1",rb))).append("', 'name':'l_ACPT_STS_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view1_sortable).append("}").append(",");
%>
<%
 int aAE0060020StructLength = aAE0060020Control.getListsize();
 final AE0060020Struct structBackup = aAE0060020Struct;
 aAE0060020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0060020StructLength; ++loopCount) {
  if((aAE0060020Struct = (AE0060020Struct) aAE0060020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0060020Struct", aAE0060020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0060020view1_DB.append("[");
 AE0060020view1_DB.append(loopCount);
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_ACPT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_ACPT_NO\" data-name=\"l_ACPT_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ACPT_NO())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_ACPT_QTY\" data-name=\"l_ACPT_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ACPT_QTY())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_STOCK_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_STOCK_UNIT\" data-name=\"l_STOCK_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_STOCK_UNIT())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_WH_CD\" data-name=\"l_WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_WH_CD())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_WH_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_WH_NAME\" data-name=\"l_WH_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_WH_NAME())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_DLV_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_DLV_CD\" data-name=\"l_DLV_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_DLV_CD())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_UNIT_COST\" data-name=\"l_UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_UNIT_COST())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_CUR_UNIT\" data-name=\"l_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_CUR_UNIT())).append("</span>'");
 AE0060020view1_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view1-l_ACPT_STS_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view1-l_ACPT_STS_TYP_DN\" data-name=\"l_ACPT_STS_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ACPT_STS_TYP_DN())).append("</span>'");
 AE0060020view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0060020StructLength) {
   AE0060020view1_DB.append(",");
  }
 }
 aAE0060020Struct = structBackup;
 viewIdList.add(AE0060020view1_Id);
 viewSelectList.add(AE0060020view1_select);
 viewResizeList.add(AE0060020view1_resize);
 viewScrollList.add(AE0060020view1_scroll);
 viewHeaderDataList.add(AE0060020view1_HB);
 viewBodyDataList.add(AE0060020view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0060020-AE0060020button2">
expj.AE0060020.AE0060020button2 = {};
expj.AE0060020.AE0060020button2.executeAllOnDecision = function () {
  console.log('execute AE0060020button2.onDecision');
};
expj.AE0060020.AE0060020button2.executeOnLoad = function () {
  expj.AE0060020.AE0060020button2.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button2.executePScriptOnLoad = function () {
  console.log('execute AE0060020button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060020-AE0060020button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060020-AE0060020button2-LineInsert">
expj.AE0060020.AE0060020button2.LineInsert = {};
// script1="onClick;0;CHK;_AE0060020detail1/ACPT_INSPC_TYP[eq]2[and]_AE0060020detail1/INSPC_CMPLT_FLG[eq]1@!AE20135"
expj.AE0060020.AE0060020button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button2', '_AE0060020detail1/ACPT_INSPC_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button2', '_AE0060020detail1/INSPC_CMPLT_FLG'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AE0060020', 'AE0060020button2', 'AE20135');
}
};
// script2="onClick;1;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[eq]9@!AE05005"
expj.AE0060020.AE0060020button2.LineInsert.onClick1 = function () {
  console.log('LineInsert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button2', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('AE0060020', 'AE0060020button2', 'AE05005');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0060020form1/*,_AE0060020detail1/*@AE0060020Servlet"
expj.AE0060020.AE0060020button2.LineInsert.onClick2 = function () {
  console.log('LineInsert script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button2', '_AE0060020form1/*,_AE0060020detail1/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.changeBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060020.AE0060020button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button2.LineInsert['onClick' + i])) {
        expj.AE0060020.AE0060020button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button2.LineInsert.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button2.LineInsert.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button2.LineInsert.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AE0060020button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button2-LineInsert" name="LineInsert" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060020button2-LineUpdate">
expj.AE0060020.AE0060020button2.LineUpdate = {};
// script1="onClick;0;CHK;_AE0060020detail1/ACPT_INSPC_TYP[eq]2[and]_AE0060020detail1/INSPC_CMPLT_FLG[eq]1@!AE20135"
expj.AE0060020.AE0060020button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button2', '_AE0060020detail1/ACPT_INSPC_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button2', '_AE0060020detail1/INSPC_CMPLT_FLG'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AE0060020', 'AE0060020button2', 'AE20135');
}
};
// script2="onClick;1;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[eq]9@!AE05005"
expj.AE0060020.AE0060020button2.LineUpdate.onClick1 = function () {
  console.log('LineUpdate script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button2', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[eq]', '9')) {
expj.common.pscript.viewErrorMessage('AE0060020', 'AE0060020button2', 'AE05005');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0060020form1/*,_AE0060020view1/+,_AE0060020detail1/*@AE0060020Servlet"
expj.AE0060020.AE0060020button2.LineUpdate.onClick2 = function () {
  console.log('LineUpdate script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button2', '_AE0060020form1/*,_AE0060020view1/+,_AE0060020detail1/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.changeBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060020.AE0060020button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button2.LineUpdate['onClick' + i])) {
        expj.AE0060020.AE0060020button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button2.LineUpdate.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AE0060020button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button2-LineUpdate" name="LineUpdate" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><%
                List listBackup = aAE0060020Control.getList();
                aAE0060020Control.setList(aAE0060020Control.getIssueList());
              %><script class="expj-script-AE0060020-AE0060020view2">
expj.AE0060020.AE0060020view2 = {};
expj.AE0060020.AE0060020view2.executeAllOnClick = function () {
};
expj.AE0060020.AE0060020view2.executeAllOnDecision = function () {
  console.log('execute AE0060020view2.onDecision');
};
expj.AE0060020.AE0060020view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AE0060020view2", "expj.AE0060020.AE0060020view2.executeAllOnClick");
%>
  expj.AE0060020.AE0060020view2.executePScriptOnLoad();
};

expj.AE0060020.AE0060020view2.executePScriptOnLoad = function () {
  console.log('execute AE0060020view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AE0060020-AE0060020view2" class="expj-datagrid-view expj-view-single" style="width:100%;height:184px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AE0060020view2_Id = "AE0060020view2";
 String AE0060020view2_select = "single";
 String AE0060020view2_sortable = "true";
 String AE0060020view2_resize = "true";
 String AE0060020view2_scroll = "true";
 StringBuffer AE0060020view2_HB = new StringBuffer();
 StringBuffer AE0060020view2_DB = new StringBuffer();
%>
<%
 AE0060020view2_select = "single";
 AE0060020view2_sortable = "true";
 AE0060020view2_resize = "true";
 AE0060020view2_scroll = "true";
%>
<%
 AE0060020view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
%>
     
<%
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD_11",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_3",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.JOB_ODR_CD",rb))).append("', 'name':'l_JOB_ODR_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_ISSUE_GNR_TYP",rb))).append("', 'name':'l_SUPPLIED_GNR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_ISSUE_QTY",rb))).append("', 'name':'l_SUPPLIED_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0357",rb))).append("', 'name':'l_SUPPLIED_RE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0321",rb))).append("', 'name':'l_TOTAL_ISSUE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'60px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_STOCK_UNIT2', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.RCV_ISSUE_DATE_1",rb))).append("', 'name':'l_SUPPLIED_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0356",rb))).append("', 'name':'l_HAND_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PART_SUPPLIED_COMMENT",rb))).append("', 'name':'l_PART_SUPPLIED_COMMENT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_CD",rb))).append("', 'name':'l_ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb))).append("', 'name':'l_MRP_ODR_TYP', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_UNIT_DENOMINATOR",rb))).append("', 'name':'l_SUPPLIED_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SUPPLIED_UNIT_NUMERATOR",rb))).append("', 'name':'l_SUPPLIED_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
AE0060020view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_UNIT_QTY_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AE0060020view2_sortable).append("}").append(",");
%>
<%
 int aAE0060020StructLength = aAE0060020Control.getListsize();
 final AE0060020Struct structBackup = aAE0060020Struct;
 aAE0060020Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAE0060020StructLength; ++loopCount) {
  if((aAE0060020Struct = (AE0060020Struct) aAE0060020Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAE0060020Struct", aAE0060020Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AE0060020view2_DB.append("[");
 AE0060020view2_DB.append(loopCount);
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ITEM_CD())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ITEM_NAME())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_LOT_NO())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_JOB_ODR_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_JOB_ODR_CD\" data-name=\"l_JOB_ODR_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_JOB_ODR_CD())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_GNR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_GNR_TYP\" data-name=\"l_SUPPLIED_GNR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_GNR_TYP())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_QTY\" data-name=\"l_SUPPLIED_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_RE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_RE_QTY\" data-name=\"l_SUPPLIED_RE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_RE_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_TOTAL_ISSUE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_TOTAL_ISSUE_QTY\" data-name=\"l_TOTAL_ISSUE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_TOTAL_ISSUE_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_STOCK_UNIT2-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_STOCK_UNIT2\" data-name=\"l_STOCK_UNIT2\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_STOCK_UNIT2())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_DATE-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_DATE\" data-name=\"l_SUPPLIED_DATE\" data-view=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_DATE())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_HAND_QTY-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_HAND_QTY\" data-name=\"l_HAND_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_HAND_QTY())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_PART_SUPPLIED_COMMENT-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_PART_SUPPLIED_COMMENT\" data-name=\"l_PART_SUPPLIED_COMMENT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_PART_SUPPLIED_COMMENT())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_ISSUE_INST_CD\" data-name=\"l_ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_ISSUE_INST_CD())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_MRP_ODR_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_MRP_ODR_TYP\" data-name=\"l_MRP_ODR_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_MRP_ODR_TYP())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_DENOMINATOR\" data-name=\"l_SUPPLIED_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_UNIT_DENOMINATOR())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_SUPPLIED_UNIT_NUMERATOR\" data-name=\"l_SUPPLIED_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_SUPPLIED_UNIT_NUMERATOR())).append("</span>'");
 AE0060020view2_DB.append(",").append("'<span id=\"expj-AE0060020-AE0060020view2-l_UNIT_QTY_TYP-").append(loopCount).append("\" class=\"expj-label expj-AE0060020-AE0060020view2-l_UNIT_QTY_TYP\" data-name=\"l_UNIT_QTY_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getl_UNIT_QTY_TYP())).append("</span>'");
 AE0060020view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAE0060020StructLength) {
   AE0060020view2_DB.append(",");
  }
 }
 aAE0060020Struct = structBackup;
 viewIdList.add(AE0060020view2_Id);
 viewSelectList.add(AE0060020view2_select);
 viewResizeList.add(AE0060020view2_resize);
 viewScrollList.add(AE0060020view2_scroll);
 viewHeaderDataList.add(AE0060020view2_HB);
 viewBodyDataList.add(AE0060020view2_DB);
%>
<%
}
%>
<%
                aAE0060020Control.setList(listBackup);
              %><!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0060020-AE0060020button3">
expj.AE0060020.AE0060020button3 = {};
expj.AE0060020.AE0060020button3.executeAllOnDecision = function () {
  console.log('execute AE0060020button3.onDecision');
};
expj.AE0060020.AE0060020button3.executeOnLoad = function () {
  expj.AE0060020.AE0060020button3.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button3.executePScriptOnLoad = function () {
  console.log('execute AE0060020button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060020-AE0060020button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060020-AE0060020button3-NoUserParts">
expj.AE0060020.AE0060020button3.NoUserParts = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0060020form1/*,_AE0060020view1/+,_AE0060020view2/+,_AE0060020detail1/*@AE0060020Servlet"
expj.AE0060020.AE0060020button3.NoUserParts.onClick0 = function () {
  console.log('NoUserParts script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button3', '_AE0060020form1/*,_AE0060020view1/+,_AE0060020view2/+,_AE0060020detail1/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.changeBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060020.AE0060020button3.NoUserParts.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button3.NoUserParts['onClick' + i])) {
        expj.AE0060020.AE0060020button3.NoUserParts['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button3.NoUserParts.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button3.NoUserParts.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button3-NoUserParts').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button3', 'NoUserParts', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button3.NoUserParts.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button3.NoUserParts.executePScriptOnLoad = function () {
  console.log('execute AE0060020button3/NoUserParts.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button3-NoUserParts');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button3-NoUserParts" name="NoUserParts" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnNoUserParts",rb)%></button><!-- 使用数修正ボタン --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060020button3-UseParts">
expj.AE0060020.AE0060020button3.UseParts = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0060020form1/*,_AE0060020view1/+,_AE0060020detail1/*@AE0060020Servlet"
expj.AE0060020.AE0060020button3.UseParts.onClick0 = function () {
  console.log('UseParts script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button3', '_AE0060020form1/*,_AE0060020view1/+,_AE0060020detail1/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.changeBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AE0060020.AE0060020button3.UseParts.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button3.UseParts['onClick' + i])) {
        expj.AE0060020.AE0060020button3.UseParts['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button3.UseParts.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button3.UseParts.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button3-UseParts').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button3', 'UseParts', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button3.UseParts.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button3.UseParts.executePScriptOnLoad = function () {
  console.log('execute AE0060020button3/UseParts.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button3-UseParts');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button3-UseParts" name="UseParts" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnAdditionalSupply",rb)%></button><!-- 支給品追加登録ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 410px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0060020 Revision: 1.10  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AE0060020-AE0060020button0">
expj.AE0060020.AE0060020button0 = {};
expj.AE0060020.AE0060020button0.executeAllOnDecision = function () {
  console.log('execute AE0060020button0.onDecision');
};
expj.AE0060020.AE0060020button0.executeOnLoad = function () {
  expj.AE0060020.AE0060020button0.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button0.executePScriptOnLoad = function () {
  console.log('execute AE0060020button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060020-AE0060020button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060020-AE0060020button0-CancelComplete">
expj.AE0060020.AE0060020button0.CancelComplete = {};
// script1="onClick;0;CHK;_AE0060020detail1/PUCH_ODR_STS_TYP[neq]9@!AE05010"
expj.AE0060020.AE0060020button0.CancelComplete.onClick0 = function () {
  console.log('CancelComplete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button0', '_AE0060020detail1/PUCH_ODR_STS_TYP'), '[neq]', '9')) {
expj.common.pscript.viewErrorMessage('AE0060020', 'AE0060020button0', 'AE05010');
}
};
// script2="onClick;1;CHK;_AE0060020detail1/ACPT_INSPC_TYP[eq]2[and]_AE0060020detail1/INSPC_CMPLT_FLG[eq]1@!AE20135"
expj.AE0060020.AE0060020button0.CancelComplete.onClick1 = function () {
  console.log('CancelComplete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button0', '_AE0060020detail1/ACPT_INSPC_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060020button0', '_AE0060020detail1/INSPC_CMPLT_FLG'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AE0060020', 'AE0060020button0', 'AE20135');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060020form1/*,_AE0060020detail1/*@AE0060020Servlet,,$AE05011"
expj.AE0060020.AE0060020button0.CancelComplete.onClick2 = function () {
  console.log('CancelComplete script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button0', '_AE0060020form1/*,_AE0060020detail1/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.updateBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callConfirm('AE0060020', 'AE0060020button0', 'AE05011', okEvent);
};
expj.AE0060020.AE0060020button0.CancelComplete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button0.CancelComplete['onClick' + i])) {
        expj.AE0060020.AE0060020button0.CancelComplete['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button0.CancelComplete.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button0.CancelComplete.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button0-CancelComplete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button0', 'CancelComplete', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button0.CancelComplete.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button0.CancelComplete.executePScriptOnLoad = function () {
  console.log('execute AE0060020button0/CancelComplete.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button0-CancelComplete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button0-CancelComplete" name="CancelComplete" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelComplete",rb)%></button><!-- 完了解除ボタン --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060020button0-CancelOdrCancel">
expj.AE0060020.AE0060020button0.CancelOdrCancel = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AE0060020form1/*,_AE0060020detail1/*@AE0060020Servlet,,$AE00088"
expj.AE0060020.AE0060020button0.CancelOdrCancel.onClick0 = function () {
  console.log('CancelOdrCancel script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button0', '_AE0060020form1/*,_AE0060020detail1/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.updateBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callConfirm('AE0060020', 'AE0060020button0', 'AE00088', okEvent);
};
expj.AE0060020.AE0060020button0.CancelOdrCancel.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button0.CancelOdrCancel['onClick' + i])) {
        expj.AE0060020.AE0060020button0.CancelOdrCancel['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button0.CancelOdrCancel.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button0.CancelOdrCancel.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button0-CancelOdrCancel').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button0', 'CancelOdrCancel', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button0.CancelOdrCancel.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button0.CancelOdrCancel.executePScriptOnLoad = function () {
  console.log('execute AE0060020button0/CancelOdrCancel.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button0-CancelOdrCancel');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button0-CancelOdrCancel" name="CancelOdrCancel" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelOdrCancel",rb)%></button><!-- 取消解除ボタン --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060020button0-Clear">
expj.AE0060020.AE0060020button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AE0060020Servlet,,$ZZ07008"
expj.AE0060020.AE0060020button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060020button0', '', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.updateBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callConfirm('AE0060020', 'AE0060020button0', 'ZZ07008', okEvent);
};
expj.AE0060020.AE0060020button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button0.Clear['onClick' + i])) {
        expj.AE0060020.AE0060020button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button0.Clear.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button0.Clear.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button0', 'Clear', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button0.Clear.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AE0060020button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button0-Clear" name="Clear" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060020button0-Close">
expj.AE0060020.AE0060020button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AE0060020.AE0060020button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AE0060020');
};
expj.AE0060020.AE0060020button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060020button0.Close['onClick' + i])) {
        expj.AE0060020.AE0060020button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060020button0.Close.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060020button0.Close.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060020button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060020button0', 'Close', this, 'Button');
    }
  });
  expj.AE0060020.AE0060020button0.Close.executePScriptOnLoad();
};

expj.AE0060020.AE0060020button0.Close.executePScriptOnLoad = function () {
  console.log('execute AE0060020button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060020button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060020button0-Close" name="Close" class="AE0060020-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0060020 (END)-->
<script class="expj-script-AE0060020-AE0060020detail1">
expj.AE0060020.AE0060020detail1 = {};
expj.AE0060020.AE0060020detail1.executeAllOnDecision = function () {
  console.log('execute AE0060020detail1.onDecision');
};
expj.AE0060020.AE0060020detail1.executeOnLoad = function () {
  expj.AE0060020.AE0060020detail1.executePScriptOnLoad();
};

expj.AE0060020.AE0060020detail1.executePScriptOnLoad = function () {
  console.log('execute AE0060020detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAE0060020Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AE0060020-AE0060020detail1" class="expj-datagird-detail" data-float="AE0060020float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AE0060020detail1";
 detailFloat = "AE0060020float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AE0060020detail1_Id = "AE0060020detail1";
 String AE0060020detail1_select = "single";
 String AE0060020detail1_sortable = "true";
 String AE0060020detail1_resize = "true";
 String AE0060020detail1_scroll = "true";
 StringBuffer AE0060020detail1_HB = new StringBuffer();
 StringBuffer AE0060020detail1_DB = new StringBuffer();
%>
<%
 AE0060020detail1_sortable = "false";
 AE0060020detail1_select = "none";
%>
<% AE0060020detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AE0060020detail1_sortable).append("}").append(","); %>
<%  AE0060020detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AE0060020detail1_sortable).append("}").append(",");
AE0060020detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AE0060020detail1_sortable).append("}").append(",");
AE0060020detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AE0060020detail1_sortable).append("}").append(",");
AE0060020detail1_HB.append("{'visible':true,'width':'0px','title':'','name':'col4', 'class':'expj-detail-cell-hidden','sortable':").append(AE0060020detail1_sortable).append("}").append(",");
 %>
  <% AE0060020detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.ITEM_CD",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-ITEM_CD\" class=\"expj-label\" data-name=\"ITEM_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getITEM_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_NAME",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-ITEM_NAME\" class=\"expj-label\" data-name=\"ITEM_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getITEM_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.JOB_ODR_CD",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-JOB_ODR_CD\" class=\"expj-label\" data-name=\"JOB_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getJOB_ODR_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getDRAW_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.SPEC",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getSPEC())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.UNIT_QTY_TYP",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-UNIT_QTY_TYP_DN\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getUNIT_QTY_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-UNIT_QTY_TYP\" class=\"expj-label\" data-name=\"UNIT_QTY_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getUNIT_QTY_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.VEND_CD",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-VEND_CD\" class=\"expj-label\" data-name=\"VEND_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getVEND_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.VEND_NAME",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-VEND_NAME\" class=\"expj-label\" data-name=\"VEND_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getVEND_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.PUCH_ODR_QTY",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0060020-AE0060020detail1-PUCH_ODR_QTY\" class=\"expj-label\" data-name=\"PUCH_ODR_QTY\" data-detailItem=\"true\" data-kind=\"").append(Kind.convertNumeric(aAE0060020Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0060020-AE0060020detail1-STOCK_UNIT\" class=\"expj-label\" data-name=\"STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.ACPT_QTY_5",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AE0060020-AE0060020detail1-SUM_ACPT_QTY\" class=\"expj-label\" data-name=\"SUM_ACPT_QTY\" data-detailItem=\"true\" data-kind=\"").append(Kind.convertNumeric(aAE0060020Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAE0060020Struct.getSUM_ACPT_QTY())).append("</span>").append("</div>','").append("<span id=\"expj-AE0060020-AE0060020detail1-d1_STOCK_UNIT\" class=\"expj-label\" data-name=\"d1_STOCK_UNIT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_UNIT())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-ACPT_INSPC_TYP_DN\" class=\"expj-label\" data-name=\"ACPT_INSPC_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getACPT_INSPC_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-ACPT_INSPC_TYP\" class=\"expj-label\" data-name=\"ACPT_INSPC_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getACPT_INSPC_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['12','").append(CoreTools.getRBString("Expj.PUCH_ODR_INST_DATE_1",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PUCH_ODR_SLIP_ISS_DATE\" class=\"expj-label\" data-name=\"PUCH_ODR_SLIP_ISS_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_SLIP_ISS_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['13','").append(CoreTools.getRBString("Expj.PUCH_ODR_DLV_DATE",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PUCH_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"PUCH_ODR_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_DLV_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['14','").append(CoreTools.getRBString("Expj.CONFIRM_DLV_DATE_1",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-CONFIRM_DLV_DATE\" class=\"expj-label\" data-name=\"CONFIRM_DLV_DATE\" data-detailItem=\"true\" data-kind=\"OBT_DATE;TYPE_YMD\">").append(TypeConverter.sanitizer(aAE0060020Struct.getCONFIRM_DLV_DATE())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['15','").append(CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-WORK_IN_PROC_CD\" class=\"expj-label\" data-name=\"WORK_IN_PROC_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getWORK_IN_PROC_CD())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['16','").append(CoreTools.getRBString("Expj.PROC_NAME",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PROC_NAME\" class=\"expj-label\" data-name=\"PROC_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPROC_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['17','").append(CoreTools.getRBString("Expj.PUCH_ODR_PERSON",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PUCH_ODR_PERSON\" class=\"expj-label\" data-name=\"PUCH_ODR_PERSON\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_PERSON())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['18','").append(CoreTools.getRBString("Expj.USER_NAME",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-USER_NAME\" class=\"expj-label\" data-name=\"USER_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getUSER_NAME())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['19','").append(CoreTools.getRBString("Expj.PUCH_ODR_STS_TYP",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PUCH_ODR_STS_TYP_DN\" class=\"expj-label\" data-name=\"PUCH_ODR_STS_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_STS_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PUCH_ODR_STS_TYP\" class=\"expj-label\" data-name=\"PUCH_ODR_STS_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_STS_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['20','").append(CoreTools.getRBString("Expj.INSPC_CMPLT_FLG",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-INSPC_CMPLT_FLG_DN\" class=\"expj-label\" data-name=\"INSPC_CMPLT_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getINSPC_CMPLT_FLG_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-INSPC_CMPLT_FLG\" class=\"expj-label\" data-name=\"INSPC_CMPLT_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getINSPC_CMPLT_FLG())).append("</span>").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['21','").append(CoreTools.getRBString("Expj.SPL_ITEM_TYP",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-SPL_ITEM_TYP_DN\" class=\"expj-label\" data-name=\"SPL_ITEM_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getSPL_ITEM_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-SPL_ITEM_TYP\" class=\"expj-label\" data-name=\"SPL_ITEM_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getSPL_ITEM_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['22','").append(CoreTools.getRBString("Expj.PRODUCT_TYP",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PRODUCT_TYP_DN\" class=\"expj-label\" data-name=\"PRODUCT_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPRODUCT_TYP_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PRODUCT_TYP\" class=\"expj-label\" data-name=\"PRODUCT_TYP\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPRODUCT_TYP())).append("</span>").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['23','").append(CoreTools.getRBString("Expj.NON_NO_ITEM_FLG",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-NON_NO_ITEM_FLG_DN\" class=\"expj-label\" data-name=\"NON_NO_ITEM_FLG_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getNON_NO_ITEM_FLG_DN())).append("</span>").append("','").append("").append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-NON_NO_ITEM_FLG\" class=\"expj-label\" data-name=\"NON_NO_ITEM_FLG\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getNON_NO_ITEM_FLG())).append("</span>").append("']").append(",");%>
 <% AE0060020detail1_DB.append("['24','").append(CoreTools.getRBString("Expj.PUCH_ODR_COMMENT",rb)).append("','").append("<span id=\"expj-AE0060020-AE0060020detail1-PUCH_ODR_COMMENT\" class=\"expj-label\" data-name=\"PUCH_ODR_COMMENT\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_COMMENT())).append("</span>").append("','").append("").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AE0060020detail1_Id;
 detailViewSelect = AE0060020detail1_select;
 detailViewResize = AE0060020detail1_resize;
 detailViewScroll = AE0060020detail1_scroll;
 detailViewHeaderData = AE0060020detail1_HB;
 detailViewBodyData = AE0060020detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAE0060020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AE0060020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AE0060020)) {
  expj.common.treeInstanceMap.AE0060020 = {};
}
expj.common.treeInstanceMap.AE0060020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AE0060020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AE0060020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AE0060020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AE0060020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AE0060020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AE0060020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020)) {
  expj.common.detailDialogMap.AE0060020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AE0060020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020.<%=detailId %>)) {
  expj.common.detailDialogMap.AE0060020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AE0060020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AE0060020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AE0060020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AE0060020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AE0060020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AE0060020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AE0060020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AE0060020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AE0060020)) {
  expj.common.viewInstanceMap.AE0060020 = {};
}
expj.common.viewInstanceMap.AE0060020.<%=viewId %> = {};
expj.common.viewInstanceMap.AE0060020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AE0060020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AE0060020.<%=viewId %>.init = function () {
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
    expj.AE0060020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AE0060020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AE0060020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AE0060020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AE0060020_init">
/**
 * AE0060020用のロード完了時初期化関数
 */
expj.AE0060020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AE0060020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AE0060020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AE0060020');
  expj.common.calendarInstanceMap.AE0060020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AE0060020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.init();
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AE0060020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AE0060020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AE0060020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AE0060020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AE0060020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AE0060020-<%=detailId %>');
<%
 }
%>
  try{expj.AE0060020.AE0060020form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020form1.h_LOTCTRL.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020form1.PeekerPuchOdrCd.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020form1.h_PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020form1.h_ODR_CANCEL_SLIP_ISS_FLG.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020form1.PUCH_ODR_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button1.Select.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button3.NoUserParts.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button3.UseParts.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button0.CancelComplete.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button0.CancelOdrCancel.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button0.Close.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020form1.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button1.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020view1.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020view2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button3.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020button0.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060020detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AE0060020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AE0060020', 'AE0060020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AE0060020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AE0060020-focus-move');
  // 初期フォーカス当てる処理
  $('.AE0060020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AE0060020', '<%=request.getContextPath() %>');
};

/**
 * AE0060020の全体onDecision処理
 */
expj.AE0060020.executeAllOnDecision = function () {
  expj.AE0060020.AE0060020form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AE0060020_console">
expj.AE0060020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>