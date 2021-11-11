<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:57:58 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KM0020\KM0020010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KM0020.*" %>
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
<jsp:useBean id="aKM0020010Control" class="com.nec.jp.orteus.metamorBase.KM0020.KM0020010Control" scope="request"/>
<jsp:useBean id="aKM0020010Struct" class="com.nec.jp.orteus.metamorBase.KM0020.KM0020010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

見積登録
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0020/jsp/KM0020010.jsp,v $
$Author: geng-jia $	
$Revision: 1.4 $　$Date: 2017/02/22 02:07:02 $
********************************************************* --%>
<html>
<head>
<title>見積登録</title>
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
<script class="expj-script-KM0020010_init">
  // KM0020010名前空間
  expj.KM0020010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KM0020010" data-screen="KM0020010" data-newdata="<%=aKM0020010Control.isNewData() %>">
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
			  <script class="expj-script-KM0020010-KM0020010form1">
expj.KM0020010.KM0020010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7,8,9"
expj.KM0020010.KM0020010form1.onLoad0 = function () {
  console.log('KM0020010form1 script1');
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
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.KM0020010.KM0020010form1.onDecision0 = function () {
  console.log('KM0020010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('KM0020010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_KM0020010button1/Select"
expj.KM0020010.KM0020010form1.child0 = function () {
  console.log('KM0020010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button1/Select');
};
// script4="child;1;MASK;_KM0020010button1/Select"
expj.KM0020010.KM0020010form1.child1 = function () {
  console.log('KM0020010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button1/Select');
};
// script5="onDecision;1;CHK;?KM0020010form1/*[eq]NORMAL[and]?KM0020010form1/PROJECT_CD[eq]SAME@*2,*6"
expj.KM0020010.KM0020010form1.onDecision1 = function () {
  console.log('KM0020010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/PROJECT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script6="child;2;CHKRQ;B@*3,*6"
expj.KM0020010.KM0020010form1.child2 = function () {
  console.log('KM0020010form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('KM0020010', 'B')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script7="child;3;CHK;_PROJECT_STAT[eq]2@*5,*4"
expj.KM0020010.KM0020010form1.child3 = function () {
  console.log('KM0020010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script8="child;4;CHK;_PROJECT_STAT[eq]1[and]?KM0020010form1/ESTIMATE_NO[eq]SAME@*5,*6"
expj.KM0020010.KM0020010form1.child4 = function () {
  console.log('KM0020010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/ESTIMATE_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_KM0020010button2/append,_KM0020010button0/insert,_KM0020010form2/Total,_KM0020010form2/Q_Select"
expj.KM0020010.KM0020010form1.child5 = function () {
  console.log('KM0020010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/append');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/insert');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/Total');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/Q_Select');
};
// script10="child;6;MASK;_KM0020010button2/append,_KM0020010button0/insert,_KM0020010form2/Total,_KM0020010form2/Q_Select"
expj.KM0020010.KM0020010form1.child6 = function () {
  console.log('KM0020010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/append');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/insert');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/Total');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/Q_Select');
};
// script11="onDecision;2;CHK;?KM0020010view1/?[eq]SINGLE[and]?KM0020010form1/*[eq]NORMAL[and]?KM0020010form1/PROJECT_CD[eq]SAME@*7,*8"
expj.KM0020010.KM0020010form1.onDecision2 = function () {
  console.log('KM0020010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010view1/?'), '[eq]', 'SINGLE') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/PROJECT_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_KM0020010button2/modify@*33"
expj.KM0020010.KM0020010form1.child7 = function () {
  console.log('KM0020010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/modify');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child33)){this.child33();}}
};
// script13="child;8;MASK;_KM0020010button2/modify,_KM0020010button2/copy,_KM0020010button2/erase"
expj.KM0020010.KM0020010form1.child8 = function () {
  console.log('KM0020010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/modify');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/copy');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/erase');
};
// script14="onDecision;3;CHK;?KM0020010form1/*[eq]NORMAL[and]?KM0020010form1/PROJECT_CD[eq]SAME[and]?KM0020010form1/ESTIMATE_NO[eq]SAME@*9,*12"
expj.KM0020010.KM0020010form1.onDecision3 = function () {
  console.log('KM0020010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/PROJECT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/ESTIMATE_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script15="child;9;CHKRQ;B@*10,*12"
expj.KM0020010.KM0020010form1.child9 = function () {
  console.log('KM0020010form1 script15');
if (expj.common.pscript.satisfiedRequiredComponent('KM0020010', 'B')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script16="child;10;CHK;_PROJECT_STAT[eq]1@*12,*11"
expj.KM0020010.KM0020010form1.child10 = function () {
  console.log('KM0020010form1 script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script17="child;11;UNMASK;_KM0020010button0/print"
expj.KM0020010.KM0020010form1.child11 = function () {
  console.log('KM0020010form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/print');
};
// script18="child;12;MASK;_KM0020010button0/print"
expj.KM0020010.KM0020010form1.child12 = function () {
  console.log('KM0020010form1 script18');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/print');
};
// script19="onDecision;4;CHK;?KM0020010form1/*[eq]NORMAL[and]?KM0020010form1/PROJECT_CD[eq]SAME[and]?KM0020010form1/ESTIMATE_NO[eq]SAME@*13,*15"
expj.KM0020010.KM0020010form1.onDecision4 = function () {
  console.log('KM0020010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/PROJECT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/ESTIMATE_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script20="child;13;CHK;_PROJECT_STAT[eq]2@*14,*15"
expj.KM0020010.KM0020010form1.child13 = function () {
  console.log('KM0020010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script21="child;14;UNMASK;_KM0020010button0/delete"
expj.KM0020010.KM0020010form1.child14 = function () {
  console.log('KM0020010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/delete');
};
// script22="child;15;MASK;_KM0020010button0/delete"
expj.KM0020010.KM0020010form1.child15 = function () {
  console.log('KM0020010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/delete');
};
// script23="onDecision;5;CHK;_KM0020010form2/QUOTE_PROJECT_CD[eq]@*16"
expj.KM0020010.KM0020010form1.onDecision5 = function () {
  console.log('KM0020010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_KM0020010form2/QUOTE_PROJECT_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script24="child;16;MASK;_KM0020010form2/Q_Select"
expj.KM0020010.KM0020010form1.child16 = function () {
  console.log('KM0020010form1 script24');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/Q_Select');
};
// script25="onDecision;6;CHK;?KM0020010form1/*[eq]NORMAL@*17,*19"
expj.KM0020010.KM0020010form1.onDecision6 = function () {
  console.log('KM0020010form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script26="child;17;CHK;_PROJECT_STAT[eq]1@*19,*18"
expj.KM0020010.KM0020010form1.child17 = function () {
  console.log('KM0020010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script27="child;18;CHK;_PROJECT_STAT[eq]2[and]?KM0020010form1/ESTIMATE_NO[neq]SAME@*19,*20"
expj.KM0020010.KM0020010form1.child18 = function () {
  console.log('KM0020010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/ESTIMATE_NO'), '[neq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script28="child;19;UNMASK;_KM0020010form2/QUOTE_PROJECT_CD,_KM0020010form2/QUOTE_ESTIMATE_NO,_KM0020010form2/PeekerProjectCdQuote"
expj.KM0020010.KM0020010form1.child19 = function () {
  console.log('KM0020010form1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/QUOTE_PROJECT_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/QUOTE_ESTIMATE_NO');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/PeekerProjectCdQuote');
};
// script29="child;20;MASK;_KM0020010form2/QUOTE_PROJECT_CD,_KM0020010form2/QUOTE_ESTIMATE_NO,_KM0020010form2/PeekerProjectCdQuote"
expj.KM0020010.KM0020010form1.child20 = function () {
  console.log('KM0020010form1 script29');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/QUOTE_PROJECT_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/QUOTE_ESTIMATE_NO');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/PeekerProjectCdQuote');
};
// script30="onDecision;7;CHK;?KM0020010form1/*[eq]NORMAL@*21,*23"
expj.KM0020010.KM0020010form1.onDecision7 = function () {
  console.log('KM0020010form1 script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script31="child;21;CHK;_PROJECT_STAT[eq]1@*23,*22"
expj.KM0020010.KM0020010form1.child21 = function () {
  console.log('KM0020010form1 script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script32="child;22;CHK;_PROJECT_STAT[eq]3[or]_PROJECT_STAT[eq]2@*36,*24"
expj.KM0020010.KM0020010form1.child22 = function () {
  console.log('KM0020010form1 script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '3') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child36)){this.child36();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
// script33="child;23;UNMASK;_KM0020010form2/UNOFFICIAL_RECEIPT_FLG"
expj.KM0020010.KM0020010form1.child23 = function () {
  console.log('KM0020010form1 script33');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/UNOFFICIAL_RECEIPT_FLG');
};
// script34="child;24;MASK;_KM0020010form2/UNOFFICIAL_RECEIPT_FLG"
expj.KM0020010.KM0020010form1.child24 = function () {
  console.log('KM0020010form1 script34');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/UNOFFICIAL_RECEIPT_FLG');
};
// script35="onDecision;8;CHK;?KM0020010form1/*[eq]NORMAL@*25,*26"
expj.KM0020010.KM0020010form1.onDecision8 = function () {
  console.log('KM0020010form1 script35');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
} else {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script36="child;25;CHK;_PROJECT_STAT[eq]1[or]_PROJECT_STAT[eq]2@*26,*27"
expj.KM0020010.KM0020010form1.child25 = function () {
  console.log('KM0020010form1 script36');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
} else {
if(expj.common.checkNameSpace(this.child27)){this.child27();}
}
};
// script37="child;26;UNMASK;_KM0020010form2/ESTIMATE_DATE,_KM0020010form2/ES_USER_CD,_KM0020010form2/ES_ORG_CD,_KM0020010form2/ESREMARK1,_KM0020010form2/ESREMARK2,_KM0020010form2/ESREMARK3,_KM0020010form2/ES_COMMET1,_KM0020010form2/ES_COMMET2,_KM0020010form2/ES_COMMET3,_KM0020010form2/ES_COMMET4,_KM0020010form2/ES_COMMET5,_KM0020010form2/PeekerUserCd,_KM0020010form2/PeekerOrgCd"
expj.KM0020010.KM0020010form1.child26 = function () {
  console.log('KM0020010form1 script37');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESTIMATE_DATE');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_USER_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_ORG_CD');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESREMARK1');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESREMARK2');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESREMARK3');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET1');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET2');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET3');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET4');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET5');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/PeekerUserCd');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/PeekerOrgCd');
};
// script38="child;27;MASK;_KM0020010form2/ESTIMATE_DATE,_KM0020010form2/ES_USER_CD,_KM0020010form2/ES_ORG_CD,_KM0020010form2/ESREMARK1,_KM0020010form2/ESREMARK2,_KM0020010form2/ESREMARK3,_KM0020010form2/ES_COMMET1,_KM0020010form2/ES_COMMET2,_KM0020010form2/ES_COMMET3,_KM0020010form2/ES_COMMET4,_KM0020010form2/ES_COMMET5,_KM0020010form2/PeekerUserCd,_KM0020010form2/PeekerOrgCd"
expj.KM0020010.KM0020010form1.child27 = function () {
  console.log('KM0020010form1 script38');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESTIMATE_DATE');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_USER_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_ORG_CD');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESREMARK1');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESREMARK2');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ESREMARK3');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET1');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET2');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET3');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET4');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/ES_COMMET5');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/PeekerUserCd');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010form2/PeekerOrgCd');
};
// script39="onDecision;9;CHK;?KM0020010form1/*[eq]NORMAL[and]?KM0020010form1/PROJECT_CD[eq]SAME[and]?KM0020010form1/ESTIMATE_NO[eq]SAME@*28,*32"
expj.KM0020010.KM0020010form1.onDecision9 = function () {
  console.log('KM0020010form1 script39');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/*'), '[eq]', 'NORMAL') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/PROJECT_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '?KM0020010form1/ESTIMATE_NO'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child28)){this.child28();}
} else {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script40="child;28;CHKRQ;B@*29,*32"
expj.KM0020010.KM0020010form1.child28 = function () {
  console.log('KM0020010form1 script40');
if (expj.common.pscript.satisfiedRequiredComponent('KM0020010', 'B')) {
if(expj.common.checkNameSpace(this.child29)){this.child29();}
} else {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
}
};
// script41="child;29;CHK;_PROJECT_STAT[eq]1@*32,*30"
expj.KM0020010.KM0020010form1.child29 = function () {
  console.log('KM0020010form1 script41');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
} else {
if(expj.common.checkNameSpace(this.child30)){this.child30();}
}
};
// script42="child;30;CHK;_PROJECT_STAT[eq]3[and]<%= aKM0020010Struct.getESTIMATE_ST()%>[eq]9@*32,*31"
expj.KM0020010.KM0020010form1.child30 = function () {
  console.log('KM0020010form1 script42');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[eq]', '3') && expj.common.pscript.evaluate('<%= aKM0020010Struct.getESTIMATE_ST()%>', '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child32)){this.child32();}
} else {
if(expj.common.checkNameSpace(this.child31)){this.child31();}
}
};
// script43="child;31;UNMASK;_KM0020010button0/update"
expj.KM0020010.KM0020010form1.child31 = function () {
  console.log('KM0020010form1 script43');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/update');
};
// script44="child;32;MASK;_KM0020010button0/update"
expj.KM0020010.KM0020010form1.child32 = function () {
  console.log('KM0020010form1 script44');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button0/update');
};
// script45="child;33;CHK;_PROJECT_STAT[neq]1[and]_PROJECT_STAT[neq]2@*34,*35"
expj.KM0020010.KM0020010form1.child33 = function () {
  console.log('KM0020010form1 script45');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_STAT'), '[neq]', '2')) {
if(expj.common.checkNameSpace(this.child34)){this.child34();}
} else {
if(expj.common.checkNameSpace(this.child35)){this.child35();}
}
};
// script46="child;34;MASK;_KM0020010button2/copy,_KM0020010button2/erase"
expj.KM0020010.KM0020010form1.child34 = function () {
  console.log('KM0020010form1 script46');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/copy');
expj.common.pscript.setMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/erase');
};
// script47="child;35;UNMASK;_KM0020010button2/copy,_KM0020010button2/erase"
expj.KM0020010.KM0020010form1.child35 = function () {
  console.log('KM0020010form1 script47');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/copy');
expj.common.pscript.setUnMaskToReferenceComponent('KM0020010', 'KM0020010form1', '_KM0020010button2/erase');
};
// script48="child;36;CHK;<%= aKM0020010Struct.getESTIMATE_ST()%>[neq]9@*23,*24"
expj.KM0020010.KM0020010form1.child36 = function () {
  console.log('KM0020010form1 script48');
if (expj.common.pscript.evaluate('<%= aKM0020010Struct.getESTIMATE_ST()%>', '[neq]', '9')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
} else {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
}
};
expj.KM0020010.KM0020010form1.executeAllOnDecision = function () {
  console.log('execute KM0020010form1.onDecision');
  for (var i = 0; i <= 9; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form1['onDecision' + i])) {
        expj.KM0020010.KM0020010form1['onDecision' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form1.executeOnLoad = function () {
  expj.KM0020010.KM0020010form1.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form1.executePScriptOnLoad = function () {
  console.log('execute KM0020010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form1['onLoad' + i])) {
      expj.KM0020010.KM0020010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0020010-KM0020010form1" action="KM0020010Servlet" name="KM0020010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aKM0020010Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROJECT_CD",rb)%></span><!-- 案件番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form1-PROJECT_CD">
expj.KM0020010.KM0020010form1.PROJECT_CD = {};
expj.KM0020010.KM0020010form1.PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0020010form1/PROJECT_CD.onDecision');
  expj.KM0020010.KM0020010form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form1.PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form1-PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form1', 'PROJECT_CD', this);
  });
  expj.KM0020010.KM0020010form1.PROJECT_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form1.PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020010form1/PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form1-PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form1-PROJECT_CD" name="PROJECT_CD" class="KM0020010-focus-move  required-value expj-KM0020010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getPROJECT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form1-PeekerProjectCd">
expj.KM0020010.KM0020010form1.PeekerProjectCd = {};
// script1="onClick;0;PEEKER;_KM0020010form1/PROJECT_CD@<%=contextNo%>"
expj.KM0020010.KM0020010form1.PeekerProjectCd.onClick0 = function () {
  console.log('PeekerProjectCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0020010';
var parameterValues = 'PeekerProjectCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form1', '_PROJECT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROJECT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0020010form1/PROJECT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0020010.KM0020010form1.PeekerProjectCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form1.PeekerProjectCd['onClick' + i])) {
        expj.KM0020010.KM0020010form1.PeekerProjectCd['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form1.PeekerProjectCd.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010form1.PeekerProjectCd.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form1-PeekerProjectCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form1', 'PeekerProjectCd', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010form1.PeekerProjectCd.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form1.PeekerProjectCd.executePScriptOnLoad = function () {
  console.log('execute KM0020010form1/PeekerProjectCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form1-PeekerProjectCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020010form1-PeekerProjectCd" class="KM0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form1-PROJECT_NAME">
expj.KM0020010.KM0020010form1.PROJECT_NAME = {};
expj.KM0020010.KM0020010form1.PROJECT_NAME.executeAllOnDecision = function () {
  console.log('execute KM0020010form1/PROJECT_NAME.onDecision');
  expj.KM0020010.KM0020010form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form1.PROJECT_NAME.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form1-PROJECT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form1', 'PROJECT_NAME', this);
  });
  expj.KM0020010.KM0020010form1.PROJECT_NAME.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form1.PROJECT_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0020010form1/PROJECT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form1-PROJECT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:430px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form1-PROJECT_NAME" name="PROJECT_NAME" class="KM0020010-focus-move  " style="width:430px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getPROJECT_NAME()) %>" maxlength="80" disabled></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020010form1-PROJECT_STAT" name="PROJECT_STAT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getPROJECT_STAT()) %>">
<script class="expj-script-KM0020010-KM0020010form1-PROJECT_STAT">
expj.KM0020010.KM0020010form1.PROJECT_STAT = {};
expj.KM0020010.KM0020010form1.PROJECT_STAT.executeAllOnDecision = function () {
  console.log('execute KM0020010form1/PROJECT_STAT.onDecision');
  expj.KM0020010.KM0020010form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form1.PROJECT_STAT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form1-PROJECT_STAT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form1', 'PROJECT_STAT', this);
  });
  expj.KM0020010.KM0020010form1.PROJECT_STAT.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form1.PROJECT_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0020010form1/PROJECT_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form1-PROJECT_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATES_CD",rb)%></span><!-- 見積番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form1-ESTIMATE_NO">
expj.KM0020010.KM0020010form1.ESTIMATE_NO = {};
expj.KM0020010.KM0020010form1.ESTIMATE_NO.executeAllOnDecision = function () {
  console.log('execute KM0020010form1/ESTIMATE_NO.onDecision');
  expj.KM0020010.KM0020010form1.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form1.ESTIMATE_NO.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form1-ESTIMATE_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form1', 'ESTIMATE_NO', this);
  });
  expj.KM0020010.KM0020010form1.ESTIMATE_NO.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form1.ESTIMATE_NO.executePScriptOnLoad = function () {
  console.log('execute KM0020010form1/ESTIMATE_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form1-ESTIMATE_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form1-ESTIMATE_NO" name="ESTIMATE_NO" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;3.0;CEIL;0" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESTIMATE_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.AUTO_NO",rb)%></span><!-- （自動採番） --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KM0020010-KM0020010button1">
expj.KM0020010.KM0020010button1 = {};
expj.KM0020010.KM0020010button1.executeAllOnDecision = function () {
  console.log('execute KM0020010button1.onDecision');
};
expj.KM0020010.KM0020010button1.executeOnLoad = function () {
  expj.KM0020010.KM0020010button1.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button1.executePScriptOnLoad = function () {
  console.log('execute KM0020010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0020010-KM0020010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0020010-KM0020010button1-Select">
expj.KM0020010.KM0020010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*@KM0020010Servlet"
expj.KM0020010.KM0020010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button1', '_KM0020010form1/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button1.Select['onClick' + i])) {
        expj.KM0020010.KM0020010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button1.Select.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button1.Select.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button1', 'Select', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button1.Select.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button1.Select.executePScriptOnLoad = function () {
  console.log('execute KM0020010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button1-Select" name="Select" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに中段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0020010-KM0020010form2">
expj.KM0020010.KM0020010form2 = {};
expj.KM0020010.KM0020010form2.executeAllOnDecision = function () {
  console.log('execute KM0020010form2.onDecision');
};
expj.KM0020010.KM0020010form2.executeOnLoad = function () {
  expj.KM0020010.KM0020010form2.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KM0020010-KM0020010form2" action="KM0020010Servlet" name="KM0020010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:184px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:184px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.QUOTE_PROJECT_CD",rb)%></span><!-- 引用案件番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-QUOTE_PROJECT_CD">
expj.KM0020010.KM0020010form2.QUOTE_PROJECT_CD = {};
expj.KM0020010.KM0020010form2.QUOTE_PROJECT_CD.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/QUOTE_PROJECT_CD.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.QUOTE_PROJECT_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-QUOTE_PROJECT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'QUOTE_PROJECT_CD', this);
  });
  expj.KM0020010.KM0020010form2.QUOTE_PROJECT_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.QUOTE_PROJECT_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/QUOTE_PROJECT_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-QUOTE_PROJECT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-QUOTE_PROJECT_CD" name="QUOTE_PROJECT_CD" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getQUOTE_PROJECT_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-PeekerProjectCdQuote">
expj.KM0020010.KM0020010form2.PeekerProjectCdQuote = {};
// script1="onClick;0;PEEKER;_KM0020010form2/QUOTE_PROJECT_CD@<%=contextNo%>"
expj.KM0020010.KM0020010form2.PeekerProjectCdQuote.onClick0 = function () {
  console.log('PeekerProjectCdQuote script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0020010';
var parameterValues = 'PeekerProjectCdQuote%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form2', '_QUOTE_PROJECT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROJECT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0020010form2/QUOTE_PROJECT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0020010.KM0020010form2.PeekerProjectCdQuote.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form2.PeekerProjectCdQuote['onClick' + i])) {
        expj.KM0020010.KM0020010form2.PeekerProjectCdQuote['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form2.PeekerProjectCdQuote.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010form2.PeekerProjectCdQuote.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-PeekerProjectCdQuote').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form2', 'PeekerProjectCdQuote', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010form2.PeekerProjectCdQuote.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.PeekerProjectCdQuote.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/PeekerProjectCdQuote.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-PeekerProjectCdQuote');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020010form2-PeekerProjectCdQuote" class="KM0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.QUOTE_ESTIMATE_NO",rb)%></span><!-- 引用見積番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-QUOTE_ESTIMATE_NO">
expj.KM0020010.KM0020010form2.QUOTE_ESTIMATE_NO = {};
expj.KM0020010.KM0020010form2.QUOTE_ESTIMATE_NO.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/QUOTE_ESTIMATE_NO.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.QUOTE_ESTIMATE_NO.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-QUOTE_ESTIMATE_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'QUOTE_ESTIMATE_NO', this);
  });
  expj.KM0020010.KM0020010form2.QUOTE_ESTIMATE_NO.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.QUOTE_ESTIMATE_NO.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/QUOTE_ESTIMATE_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-QUOTE_ESTIMATE_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-QUOTE_ESTIMATE_NO" name="QUOTE_ESTIMATE_NO" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;3.0;FLOOR;0" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getQUOTE_ESTIMATE_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-Q_Select">
expj.KM0020010.KM0020010form2.Q_Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*@KM0020010Servlet"
expj.KM0020010.KM0020010form2.Q_Select.onClick0 = function () {
  console.log('Q_Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010form2', '_KM0020010form1/*,_KM0020010form2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020010form2.Q_Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form2.Q_Select['onClick' + i])) {
        expj.KM0020010.KM0020010form2.Q_Select['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form2.Q_Select.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010form2.Q_Select.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-Q_Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form2', 'Q_Select', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010form2.Q_Select.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.Q_Select.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/Q_Select.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-Q_Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020010form2-Q_Select" name="Q_Select" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnQUOTE_SELECT",rb)%></button><!-- 引用読込ボタン --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_STAT",rb)%></span><!-- 見積ステータス --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ESTIMATE_STAT">
expj.KM0020010.KM0020010form2.ESTIMATE_STAT = {};
expj.KM0020010.KM0020010form2.ESTIMATE_STAT.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ESTIMATE_STAT.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ESTIMATE_STAT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ESTIMATE_STAT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ESTIMATE_STAT', this);
  });
  expj.KM0020010.KM0020010form2.ESTIMATE_STAT.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ESTIMATE_STAT.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ESTIMATE_STAT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ESTIMATE_STAT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ESTIMATE_STAT" name="ESTIMATE_STAT" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESTIMATE_STAT()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-UNOFFICIAL_RECEIPT_FLG">
expj.KM0020010.KM0020010form2.UNOFFICIAL_RECEIPT_FLG = {};
expj.KM0020010.KM0020010form2.UNOFFICIAL_RECEIPT_FLG.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/UNOFFICIAL_RECEIPT_FLG.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.UNOFFICIAL_RECEIPT_FLG.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-UNOFFICIAL_RECEIPT_FLG').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form2', 'UNOFFICIAL_RECEIPT_FLG', this, 'CheckBox');
    }
  });
  expj.KM0020010.KM0020010form2.UNOFFICIAL_RECEIPT_FLG.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.UNOFFICIAL_RECEIPT_FLG.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/UNOFFICIAL_RECEIPT_FLG.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-UNOFFICIAL_RECEIPT_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="UNOFFICIAL_RECEIPT_FLG" value="true" <%= ("true".equals(TypeConverter.convert(aKM0020010Struct.getUNOFFICIAL_RECEIPT_FLG())) || "1".equals(TypeConverter.convert(aKM0020010Struct.getUNOFFICIAL_RECEIPT_FLG())))?"checked=\"checked\"":"" %>  class="KM0020010-focus-move" id="expj-KM0020010-KM0020010form2-UNOFFICIAL_RECEIPT_FLG"><label for="expj-KM0020010-KM0020010form2-UNOFFICIAL_RECEIPT_FLG"><%=CoreTools.getRBString("Expj.UNOFFICIAL_RECEIPT",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020010form2-h_MAX_DETAL_NO" name="h_MAX_DETAL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.geth_MAX_DETAL_NO()) %>">
<script class="expj-script-KM0020010-KM0020010form2-h_MAX_DETAL_NO">
expj.KM0020010.KM0020010form2.h_MAX_DETAL_NO = {};
expj.KM0020010.KM0020010form2.h_MAX_DETAL_NO.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/h_MAX_DETAL_NO.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.h_MAX_DETAL_NO.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-h_MAX_DETAL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'h_MAX_DETAL_NO', this);
  });
  expj.KM0020010.KM0020010form2.h_MAX_DETAL_NO.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.h_MAX_DETAL_NO.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/h_MAX_DETAL_NO.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-h_MAX_DETAL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_NAME",rb)%></span><!-- 得意先名 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-CUST_NAME">
expj.KM0020010.KM0020010form2.CUST_NAME = {};
expj.KM0020010.KM0020010form2.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/CUST_NAME.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.CUST_NAME.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'CUST_NAME', this);
  });
  expj.KM0020010.KM0020010form2.CUST_NAME.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-CUST_NAME" name="CUST_NAME" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getCUST_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb)%></span><!-- 指定納期 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ES_COMMET1">
expj.KM0020010.KM0020010form2.ES_COMMET1 = {};
expj.KM0020010.KM0020010form2.ES_COMMET1.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ES_COMMET1.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ES_COMMET1.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ES_COMMET1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ES_COMMET1', this);
  });
  expj.KM0020010.KM0020010form2.ES_COMMET1.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ES_COMMET1.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ES_COMMET1.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ES_COMMET1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ES_COMMET1" name="ES_COMMET1" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getES_COMMET1()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020010form2-h_CUST_CD" name="h_CUST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.geth_CUST_CD()) %>">
<script class="expj-script-KM0020010-KM0020010form2-h_CUST_CD">
expj.KM0020010.KM0020010form2.h_CUST_CD = {};
expj.KM0020010.KM0020010form2.h_CUST_CD.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/h_CUST_CD.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.h_CUST_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-h_CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'h_CUST_CD', this);
  });
  expj.KM0020010.KM0020010form2.h_CUST_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.h_CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/h_CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-h_CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ESTIMATE_DATE",rb)%></span><!-- 見積日 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ESTIMATE_DATE">
expj.KM0020010.KM0020010form2.ESTIMATE_DATE = {};
expj.KM0020010.KM0020010form2.ESTIMATE_DATE.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ESTIMATE_DATE.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ESTIMATE_DATE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ESTIMATE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ESTIMATE_DATE', this);
  });
  expj.KM0020010.KM0020010form2.ESTIMATE_DATE.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ESTIMATE_DATE.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ESTIMATE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ESTIMATE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ESTIMATE_DATE" name="ESTIMATE_DATE" class="KM0020010-focus-move  required-value expj-KM0020010-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESTIMATE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-CalendarSalesDate">
expj.KM0020010.KM0020010form2.CalendarSalesDate = {};
// script1="onClick;0;CALENDAR;_KM0020010form2/ESTIMATE_DATE"
expj.KM0020010.KM0020010form2.CalendarSalesDate.onClick0 = function () {
  console.log('CalendarSalesDate script1');
expj.common.pscript.executeCalendar('KM0020010','KM0020010form2','_KM0020010form2/ESTIMATE_DATE');
};
expj.KM0020010.KM0020010form2.CalendarSalesDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form2.CalendarSalesDate['onClick' + i])) {
        expj.KM0020010.KM0020010form2.CalendarSalesDate['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form2.CalendarSalesDate.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010form2.CalendarSalesDate.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-CalendarSalesDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form2', 'CalendarSalesDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KM0020010','KM0020010form2','_KM0020010form2/ESTIMATE_DATE');
  expj.KM0020010.KM0020010form2.CalendarSalesDate.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.CalendarSalesDate.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/CalendarSalesDate.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-CalendarSalesDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020010form2-CalendarSalesDate" class="KM0020010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt5934",rb)%></span><!-- 納品場所 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ES_COMMET2">
expj.KM0020010.KM0020010form2.ES_COMMET2 = {};
expj.KM0020010.KM0020010form2.ES_COMMET2.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ES_COMMET2.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ES_COMMET2.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ES_COMMET2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ES_COMMET2', this);
  });
  expj.KM0020010.KM0020010form2.ES_COMMET2.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ES_COMMET2.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ES_COMMET2.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ES_COMMET2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ES_COMMET2" name="ES_COMMET2" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getES_COMMET2()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020010form2-h_CUR_CD" name="h_CUR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.geth_CUR_CD()) %>">
<script class="expj-script-KM0020010-KM0020010form2-h_CUR_CD">
expj.KM0020010.KM0020010form2.h_CUR_CD = {};
expj.KM0020010.KM0020010form2.h_CUR_CD.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/h_CUR_CD.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.h_CUR_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-h_CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'h_CUR_CD', this);
  });
  expj.KM0020010.KM0020010form2.h_CUR_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.h_CUR_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/h_CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-h_CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_AMOUNT",rb)%></span><!-- 見積金額合計 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ESTIMATE_AMOUNT">
expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT = {};
expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ESTIMATE_AMOUNT.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ESTIMATE_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ESTIMATE_AMOUNT', this);
  });
  expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ESTIMATE_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ESTIMATE_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ESTIMATE_AMOUNT" name="ESTIMATE_AMOUNT" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESTIMATE_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-CUR_UNIT">
expj.KM0020010.KM0020010form2.CUR_UNIT = {};
expj.KM0020010.KM0020010form2.CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/CUR_UNIT.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.CUR_UNIT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'CUR_UNIT', this);
  });
  expj.KM0020010.KM0020010form2.CUR_UNIT.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-CUR_UNIT" name="CUR_UNIT" class="KM0020010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getCUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ES_COMMET4",rb)%></span><!-- お支払条件 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ES_COMMET4">
expj.KM0020010.KM0020010form2.ES_COMMET4 = {};
expj.KM0020010.KM0020010form2.ES_COMMET4.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ES_COMMET4.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ES_COMMET4.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ES_COMMET4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ES_COMMET4', this);
  });
  expj.KM0020010.KM0020010form2.ES_COMMET4.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ES_COMMET4.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ES_COMMET4.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ES_COMMET4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ES_COMMET4" name="ES_COMMET4" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getES_COMMET4()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020010form2-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-KM0020010-KM0020010form2-DOWNLOAD_FILE">
expj.KM0020010.KM0020010form2.DOWNLOAD_FILE = {};
expj.KM0020010.KM0020010form2.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/DOWNLOAD_FILE.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'DOWNLOAD_FILE', this);
  });
  expj.KM0020010.KM0020010form2.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ESTIMATE_AMOUNT_JPN",rb)%></span><!-- 見積金額合計(邦貨) --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ESTIMATE_AMOUNT_JPN">
expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT_JPN = {};
expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT_JPN.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ESTIMATE_AMOUNT_JPN.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT_JPN.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ESTIMATE_AMOUNT_JPN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ESTIMATE_AMOUNT_JPN', this);
  });
  expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT_JPN.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT_JPN.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ESTIMATE_AMOUNT_JPN.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ESTIMATE_AMOUNT_JPN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ESTIMATE_AMOUNT_JPN" name="ESTIMATE_AMOUNT_JPN" class="KM0020010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESTIMATE_AMOUNT_JPN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-Total">
expj.KM0020010.KM0020010form2.Total = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*,_KM0020010View1/*@KM0020010Servlet"
expj.KM0020010.KM0020010form2.Total.onClick0 = function () {
  console.log('Total script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010form2', '_KM0020010form1/*,_KM0020010form2/*,_KM0020010View1/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020010form2.Total.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form2.Total['onClick' + i])) {
        expj.KM0020010.KM0020010form2.Total['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form2.Total.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010form2.Total.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-Total').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form2', 'Total', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010form2.Total.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.Total.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/Total.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-Total');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020010form2-Total" name="Total" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDETAIL_TOTAL",rb)%></button><!-- 明細合計ボタン --></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ES_COMMET3",rb)%></span><!-- 荷造運送費 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ES_COMMET3">
expj.KM0020010.KM0020010form2.ES_COMMET3 = {};
expj.KM0020010.KM0020010form2.ES_COMMET3.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ES_COMMET3.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ES_COMMET3.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ES_COMMET3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ES_COMMET3', this);
  });
  expj.KM0020010.KM0020010form2.ES_COMMET3.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ES_COMMET3.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ES_COMMET3.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ES_COMMET3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ES_COMMET3" name="ES_COMMET3" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getES_COMMET3()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-KM0020010-KM0020010form2-LIST_CNT" name="LIST_CNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getLIST_CNT()) %>">
<script class="expj-script-KM0020010-KM0020010form2-LIST_CNT">
expj.KM0020010.KM0020010form2.LIST_CNT = {};
expj.KM0020010.KM0020010form2.LIST_CNT.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/LIST_CNT.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.LIST_CNT.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-LIST_CNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'LIST_CNT', this);
  });
  expj.KM0020010.KM0020010form2.LIST_CNT.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.LIST_CNT.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/LIST_CNT.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-LIST_CNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ES_COMMET5",rb)%></span><!-- 見積有効期限 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ES_COMMET5">
expj.KM0020010.KM0020010form2.ES_COMMET5 = {};
expj.KM0020010.KM0020010form2.ES_COMMET5.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ES_COMMET5.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ES_COMMET5.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ES_COMMET5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ES_COMMET5', this);
  });
  expj.KM0020010.KM0020010form2.ES_COMMET5.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ES_COMMET5.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ES_COMMET5.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ES_COMMET5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ES_COMMET5" name="ES_COMMET5" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getES_COMMET5()) %>" maxlength="25" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ES_USER_CD",rb)%></span><!-- 見積担当者コード --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ES_USER_CD">
expj.KM0020010.KM0020010form2.ES_USER_CD = {};
expj.KM0020010.KM0020010form2.ES_USER_CD.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ES_USER_CD.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ES_USER_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ES_USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ES_USER_CD', this);
  });
  expj.KM0020010.KM0020010form2.ES_USER_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ES_USER_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ES_USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ES_USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ES_USER_CD" name="ES_USER_CD" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getES_USER_CD()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-PeekerUserCd">
expj.KM0020010.KM0020010form2.PeekerUserCd = {};
// script1="onClick;0;PEEKER;_KM0020010form2/ES_USER_CD@<%=contextNo%>"
expj.KM0020010.KM0020010form2.PeekerUserCd.onClick0 = function () {
  console.log('PeekerUserCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0020010';
var parameterValues = 'PeekerUserCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form2', '_ES_USER_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0020010form2/ES_USER_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0020010.KM0020010form2.PeekerUserCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form2.PeekerUserCd['onClick' + i])) {
        expj.KM0020010.KM0020010form2.PeekerUserCd['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form2.PeekerUserCd.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010form2.PeekerUserCd.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-PeekerUserCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form2', 'PeekerUserCd', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010form2.PeekerUserCd.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.PeekerUserCd.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/PeekerUserCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-PeekerUserCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020010form2-PeekerUserCd" class="KM0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-USER_NAME">
expj.KM0020010.KM0020010form2.USER_NAME = {};
expj.KM0020010.KM0020010form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/USER_NAME.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.USER_NAME.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'USER_NAME', this);
  });
  expj.KM0020010.KM0020010form2.USER_NAME.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-USER_NAME" name="USER_NAME" class="KM0020010-focus-move  " style="width:300px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getUSER_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ES_ORG_CD",rb)%></span><!-- 見積担当部門コード --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ES_ORG_CD">
expj.KM0020010.KM0020010form2.ES_ORG_CD = {};
expj.KM0020010.KM0020010form2.ES_ORG_CD.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ES_ORG_CD.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ES_ORG_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ES_ORG_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ES_ORG_CD', this);
  });
  expj.KM0020010.KM0020010form2.ES_ORG_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ES_ORG_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ES_ORG_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ES_ORG_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ES_ORG_CD" name="ES_ORG_CD" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getES_ORG_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-PeekerOrgCd">
expj.KM0020010.KM0020010form2.PeekerOrgCd = {};
// script1="onClick;0;PEEKER;_KM0020010form2/ES_ORG_CD@<%=contextNo%>"
expj.KM0020010.KM0020010form2.PeekerOrgCd.onClick0 = function () {
  console.log('PeekerOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KM0020010';
var parameterValues = 'PeekerOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010form2', '_ES_ORG_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KM0020010form2/ES_ORG_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KM0020010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KM0020010.KM0020010form2.PeekerOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010form2.PeekerOrgCd['onClick' + i])) {
        expj.KM0020010.KM0020010form2.PeekerOrgCd['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010form2.PeekerOrgCd.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010form2.PeekerOrgCd.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-PeekerOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010form2', 'PeekerOrgCd', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010form2.PeekerOrgCd.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.PeekerOrgCd.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/PeekerOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-PeekerOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KM0020010-KM0020010form2-PeekerOrgCd" class="KM0020010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ORG_NAME">
expj.KM0020010.KM0020010form2.ORG_NAME = {};
expj.KM0020010.KM0020010form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ORG_NAME.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ORG_NAME', this);
  });
  expj.KM0020010.KM0020010form2.ORG_NAME.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ORG_NAME" name="ORG_NAME" class="KM0020010-focus-move  " style="width:300px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getORG_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ZIP_CD",rb)%></span><!-- 郵便番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ZIP_CD">
expj.KM0020010.KM0020010form2.ZIP_CD = {};
expj.KM0020010.KM0020010form2.ZIP_CD.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ZIP_CD.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ZIP_CD.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ZIP_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ZIP_CD', this);
  });
  expj.KM0020010.KM0020010form2.ZIP_CD.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ZIP_CD.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ZIP_CD.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ZIP_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ZIP_CD" name="ZIP_CD" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getZIP_CD()) %>" maxlength="8" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TEL",rb)%></span><!-- 電話番号 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-TEL">
expj.KM0020010.KM0020010form2.TEL = {};
expj.KM0020010.KM0020010form2.TEL.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/TEL.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.TEL.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-TEL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'TEL', this);
  });
  expj.KM0020010.KM0020010form2.TEL.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.TEL.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/TEL.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-TEL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-TEL" name="TEL" class="KM0020010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getTEL()) %>" maxlength="20" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_1",rb)%></span><!-- 住所1 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ADDRESS_1">
expj.KM0020010.KM0020010form2.ADDRESS_1 = {};
expj.KM0020010.KM0020010form2.ADDRESS_1.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ADDRESS_1.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ADDRESS_1.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ADDRESS_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ADDRESS_1', this);
  });
  expj.KM0020010.KM0020010form2.ADDRESS_1.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ADDRESS_1.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ADDRESS_1.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ADDRESS_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ADDRESS_1" name="ADDRESS_1" class="KM0020010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getADDRESS_1()) %>" maxlength="80" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ADDRESS_2",rb)%></span><!-- 住所2 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ADDRESS_2">
expj.KM0020010.KM0020010form2.ADDRESS_2 = {};
expj.KM0020010.KM0020010form2.ADDRESS_2.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ADDRESS_2.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ADDRESS_2.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ADDRESS_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ADDRESS_2', this);
  });
  expj.KM0020010.KM0020010form2.ADDRESS_2.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ADDRESS_2.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ADDRESS_2.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ADDRESS_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ADDRESS_2" name="ADDRESS_2" class="KM0020010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getADDRESS_2()) %>" maxlength="80" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.REMARKS",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ESREMARK1">
expj.KM0020010.KM0020010form2.ESREMARK1 = {};
expj.KM0020010.KM0020010form2.ESREMARK1.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ESREMARK1.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ESREMARK1.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ESREMARK1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ESREMARK1', this);
  });
  expj.KM0020010.KM0020010form2.ESREMARK1.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ESREMARK1.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ESREMARK1.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ESREMARK1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ESREMARK1" name="ESREMARK1" class="KM0020010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESREMARK1()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ESREMARK2">
expj.KM0020010.KM0020010form2.ESREMARK2 = {};
expj.KM0020010.KM0020010form2.ESREMARK2.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ESREMARK2.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ESREMARK2.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ESREMARK2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ESREMARK2', this);
  });
  expj.KM0020010.KM0020010form2.ESREMARK2.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ESREMARK2.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ESREMARK2.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ESREMARK2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ESREMARK2" name="ESREMARK2" class="KM0020010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESREMARK2()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010form2-ESREMARK3">
expj.KM0020010.KM0020010form2.ESREMARK3 = {};
expj.KM0020010.KM0020010form2.ESREMARK3.executeAllOnDecision = function () {
  console.log('execute KM0020010form2/ESREMARK3.onDecision');
  expj.KM0020010.KM0020010form2.executeAllOnDecision();
  expj.KM0020010.executeAllOnDecision();
};
expj.KM0020010.KM0020010form2.ESREMARK3.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010form2-ESREMARK3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KM0020010', 'KM0020010form2', 'ESREMARK3', this);
  });
  expj.KM0020010.KM0020010form2.ESREMARK3.executePScriptOnLoad();
};

expj.KM0020010.KM0020010form2.ESREMARK3.executePScriptOnLoad = function () {
  console.log('execute KM0020010form2/ESREMARK3.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010form2-ESREMARK3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KM0020010-KM0020010form2-ESREMARK3" name="ESREMARK3" class="KM0020010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKM0020010Struct.getESREMARK3()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに中段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-KM0020010-KM0020010view1">
expj.KM0020010.KM0020010view1 = {};
expj.KM0020010.KM0020010view1.executeAllOnClick = function () {
};
expj.KM0020010.KM0020010view1.executeAllOnDecision = function () {
  console.log('execute KM0020010view1.onDecision');
};
expj.KM0020010.KM0020010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("KM0020010view1", "expj.KM0020010.KM0020010view1.executeAllOnClick");
%>
  expj.KM0020010.KM0020010view1.executePScriptOnLoad();
};

expj.KM0020010.KM0020010view1.executePScriptOnLoad = function () {
  console.log('execute KM0020010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-KM0020010-KM0020010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status="<%=TypeConverter.sanitizer(aKM0020010Control.getReadStatus())%>"></div>
<!-- VIEW END -->
<%
 String KM0020010view1_Id = "KM0020010view1";
 String KM0020010view1_select = "single";
 String KM0020010view1_sortable = "true";
 String KM0020010view1_resize = "true";
 String KM0020010view1_scroll = "true";
 StringBuffer KM0020010view1_HB = new StringBuffer();
 StringBuffer KM0020010view1_DB = new StringBuffer();
%>
<%
 KM0020010view1_select = "single";
 KM0020010view1_sortable = "true";
 KM0020010view1_resize = "true";
 KM0020010view1_scroll = "true";
%>
<%
 KM0020010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
%>
     
<%
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DETAIL_NO",rb))).append("', 'name':'l_DETAL_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ARRANGE_ITEMS_SPECIES",rb))).append("', 'name':'l_ESTIMATE_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_CD",rb))).append("', 'name':'l_CUST_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'80px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",rb))).append("', 'name':'l_DESINATED_DLV_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.QTY",rb))).append("', 'name':'l_ESTIMATE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'70px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PUCH_ODR_UNIT",rb))).append("', 'name':'l_UNIT_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACTUAL_UNIT_PRICE",rb))).append("', 'name':'l_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DISCOUNT_PRICE",rb))).append("', 'name':'l_DISCOUNT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_UNIT_PRICE",rb))).append("', 'name':'l_ESTIMATE_UNIT_PRICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUR_UNIT",rb))).append("', 'name':'l_CUR_UNIT', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.AMOUNT",rb))).append("', 'name':'l_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DISC_AMOUNT",rb))).append("', 'name':'l_DISCOUNT_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_AMOUNT_1",rb))).append("', 'name':'l_ESTIMATE_AMOUNT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_AMOUNT_JPN_1",rb))).append("', 'name':'l_ESTIMATE_AMOUNT_JPN', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ES_COST_ALL",rb))).append("', 'name':'l_ES_COST_ALL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ESTIMATE_GAIN",rb))).append("', 'name':'l_ESTIMATE_GAIN', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.MATERIAL_COST",rb))).append("', 'name':'l_ES_COST_MATERIAL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROCESSING_COST",rb))).append("', 'name':'l_ES_COST_PROCESS', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SBCNT_COST",rb))).append("', 'name':'l_ES_COST_OUTSOUCE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb))).append("', 'name':'l_ES_COST_ETC', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SERVICE_COST",rb))).append("', 'name':'l_ES_COST_SERVICE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPEC_CLASS1",rb))).append("', 'name':'l_SPEC_CLASS1_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPEC_CLASS2",rb))).append("', 'name':'l_SPEC_CLASS2_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPEC_SELECT1",rb))).append("', 'name':'l_SPEC_SELECT1_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPEC_SELECT2",rb))).append("', 'name':'l_SPEC_SELECT2_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPEC_SELECT3",rb))).append("', 'name':'l_SPEC_SELECT3_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPEC_SELECT4",rb))).append("', 'name':'l_SPEC_SELECT4_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_REM",rb))).append("', 'name':'l_REMARKS', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.CUST_ITEM_NAME",rb))).append("', 'name':'l_CUST_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.UNIT_COST_3",rb))).append("', 'name':'l_UNIT_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_FLAG', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_ESTIMATE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPEC_CLASS1_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPEC_CLASS2_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPEC_SELECT1_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPEC_SELECT2_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPEC_SELECT3_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
KM0020010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_SPEC_SELECT4_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(KM0020010view1_sortable).append("}").append(",");
%>
<%
 int aKM0020010StructLength = aKM0020010Control.getListsize();
 final KM0020010Struct structBackup = aKM0020010Struct;
 aKM0020010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aKM0020010StructLength; ++loopCount) {
  if((aKM0020010Struct = (KM0020010Struct) aKM0020010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aKM0020010Struct", aKM0020010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 KM0020010view1_DB.append("[");
 KM0020010view1_DB.append(loopCount);
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_DETAL_NO-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_DETAL_NO\" data-name=\"l_DETAL_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;3\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_DETAL_NO())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ESTIMATE_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ESTIMATE_NAME\" data-name=\"l_ESTIMATE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_CUST_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_CUST_ITEM_CD\" data-name=\"l_CUST_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_CUST_ITEM_CD())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ITEM_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_DESINATED_DLV_DATE-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_DESINATED_DLV_DATE\" data-name=\"l_DESINATED_DLV_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_DESINATED_DLV_DATE())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ESTIMATE_QTY-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ESTIMATE_QTY\" data-name=\"l_ESTIMATE_QTY\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_QTY())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_UNIT_CD-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_UNIT_CD\" data-name=\"l_UNIT_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_UNIT_CD())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_UNIT_PRICE\" data-name=\"l_UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_UNIT_PRICE())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_DISCOUNT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_DISCOUNT_PRICE\" data-name=\"l_DISCOUNT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_DISCOUNT_PRICE())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ESTIMATE_UNIT_PRICE-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ESTIMATE_UNIT_PRICE\" data-name=\"l_ESTIMATE_UNIT_PRICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_UNIT_PRICE())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_CUR_UNIT-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_CUR_UNIT\" data-name=\"l_CUR_UNIT\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_CUR_UNIT())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_AMOUNT\" data-name=\"l_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_AMOUNT())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_DISCOUNT_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_DISCOUNT_AMOUNT\" data-name=\"l_DISCOUNT_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_DISCOUNT_AMOUNT())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ESTIMATE_AMOUNT-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ESTIMATE_AMOUNT\" data-name=\"l_ESTIMATE_AMOUNT\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_AMOUNT())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ESTIMATE_AMOUNT_JPN-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ESTIMATE_AMOUNT_JPN\" data-name=\"l_ESTIMATE_AMOUNT_JPN\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_AMOUNT_JPN())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ES_COST_ALL-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ES_COST_ALL\" data-name=\"l_ES_COST_ALL\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_ALL())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ESTIMATE_GAIN-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ESTIMATE_GAIN\" data-name=\"l_ESTIMATE_GAIN\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_GAIN())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ES_COST_MATERIAL-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ES_COST_MATERIAL\" data-name=\"l_ES_COST_MATERIAL\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_MATERIAL())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ES_COST_PROCESS-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ES_COST_PROCESS\" data-name=\"l_ES_COST_PROCESS\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_PROCESS())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ES_COST_OUTSOUCE-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ES_COST_OUTSOUCE\" data-name=\"l_ES_COST_OUTSOUCE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_OUTSOUCE())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ES_COST_ETC-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ES_COST_ETC\" data-name=\"l_ES_COST_ETC\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_ETC())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ES_COST_SERVICE-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ES_COST_SERVICE\" data-name=\"l_ES_COST_SERVICE\" data-view=\"true\" data-kind=\"OBT_NUMBER_Z;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ES_COST_SERVICE())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_CLASS1_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_CLASS1_NAME\" data-name=\"l_SPEC_CLASS1_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_CLASS1_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_CLASS2_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_CLASS2_NAME\" data-name=\"l_SPEC_CLASS2_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_CLASS2_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT1_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT1_NAME\" data-name=\"l_SPEC_SELECT1_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT1_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT2_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT2_NAME\" data-name=\"l_SPEC_SELECT2_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT2_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT3_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT3_NAME\" data-name=\"l_SPEC_SELECT3_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT3_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT4_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT4_NAME\" data-name=\"l_SPEC_SELECT4_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT4_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_REMARKS-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_REMARKS\" data-name=\"l_REMARKS\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_REMARKS())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_CUST_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_CUST_ITEM_NAME\" data-name=\"l_CUST_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_CUST_ITEM_NAME())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_UNIT_COST-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_UNIT_COST\" data-name=\"l_UNIT_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER_P;14.2;FLOOR;4\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_UNIT_COST())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_FLAG-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_FLAG\" data-name=\"l_FLAG\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_FLAG())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_ESTIMATE_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_ESTIMATE_TYP\" data-name=\"l_ESTIMATE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_ESTIMATE_TYP())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_CLASS1_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_CLASS1_TYP\" data-name=\"l_SPEC_CLASS1_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_CLASS1_TYP())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_CLASS2_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_CLASS2_TYP\" data-name=\"l_SPEC_CLASS2_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_CLASS2_TYP())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT1_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT1_TYP\" data-name=\"l_SPEC_SELECT1_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT1_TYP())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT2_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT2_TYP\" data-name=\"l_SPEC_SELECT2_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT2_TYP())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT3_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT3_TYP\" data-name=\"l_SPEC_SELECT3_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT3_TYP())).append("</span>'");
 KM0020010view1_DB.append(",").append("'<span id=\"expj-KM0020010-KM0020010view1-l_SPEC_SELECT4_TYP-").append(loopCount).append("\" class=\"expj-label expj-KM0020010-KM0020010view1-l_SPEC_SELECT4_TYP\" data-name=\"l_SPEC_SELECT4_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aKM0020010Struct.getl_SPEC_SELECT4_TYP())).append("</span>'");
 KM0020010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aKM0020010StructLength) {
   KM0020010view1_DB.append(",");
  }
 }
 aKM0020010Struct = structBackup;
 viewIdList.add(KM0020010view1_Id);
 viewSelectList.add(KM0020010view1_select);
 viewResizeList.add(KM0020010view1_resize);
 viewScrollList.add(KM0020010view1_scroll);
 viewHeaderDataList.add(KM0020010view1_HB);
 viewBodyDataList.add(KM0020010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:420px;"><script class="expj-script-KM0020010-KM0020010button2">
expj.KM0020010.KM0020010button2 = {};
expj.KM0020010.KM0020010button2.executeAllOnDecision = function () {
  console.log('execute KM0020010button2.onDecision');
};
expj.KM0020010.KM0020010button2.executeOnLoad = function () {
  expj.KM0020010.KM0020010button2.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button2.executePScriptOnLoad = function () {
  console.log('execute KM0020010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0020010-KM0020010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0020010-KM0020010button2-append">
expj.KM0020010.KM0020010button2.append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*@KM0020010Servlet"
expj.KM0020010.KM0020010button2.append.onClick0 = function () {
  console.log('append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button2', '_KM0020010form1/*,_KM0020010form2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.changeBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020010button2.append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button2.append['onClick' + i])) {
        expj.KM0020010.KM0020010button2.append['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button2.append.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button2.append.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button2-append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button2', 'append', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button2.append.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button2.append.executePScriptOnLoad = function () {
  console.log('execute KM0020010button2/append.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button2-append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button2-append" name="append" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button2-modify">
expj.KM0020010.KM0020010button2.modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*,_KM0020010view1/+@KM0020010Servlet"
expj.KM0020010.KM0020010button2.modify.onClick0 = function () {
  console.log('modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button2', '_KM0020010form1/*,_KM0020010form2/*,_KM0020010view1/+', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.changeBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020010button2.modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button2.modify['onClick' + i])) {
        expj.KM0020010.KM0020010button2.modify['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button2.modify.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button2.modify.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button2-modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button2', 'modify', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button2.modify.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button2.modify.executePScriptOnLoad = function () {
  console.log('execute KM0020010button2/modify.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button2-modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button2-modify" name="modify" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button2-copy">
expj.KM0020010.KM0020010button2.copy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*,_KM0020010view1/+@KM0020010Servlet"
expj.KM0020010.KM0020010button2.copy.onClick0 = function () {
  console.log('copy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button2', '_KM0020010form1/*,_KM0020010form2/*,_KM0020010view1/+', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.changeBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020010button2.copy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button2.copy['onClick' + i])) {
        expj.KM0020010.KM0020010button2.copy['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button2.copy.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button2.copy.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button2-copy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button2', 'copy', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button2.copy.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button2.copy.executePScriptOnLoad = function () {
  console.log('execute KM0020010button2/copy.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button2-copy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button2-copy" name="copy" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button2-erase">
expj.KM0020010.KM0020010button2.erase = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*,_KM0020010view1/+@KM0020010Servlet"
expj.KM0020010.KM0020010button2.erase.onClick0 = function () {
  console.log('erase script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button2', '_KM0020010form1/*,_KM0020010form2/*,_KM0020010view1/+', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.KM0020010.KM0020010button2.erase.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button2.erase['onClick' + i])) {
        expj.KM0020010.KM0020010button2.erase['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button2.erase.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button2.erase.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button2-erase').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button2', 'erase', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button2.erase.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button2.erase.executePScriptOnLoad = function () {
  console.log('execute KM0020010button2/erase.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button2-erase');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button2-erase" name="erase" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 504px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="height:5px"><div class="expj-td" style="width:968px;"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 630px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KM0020010 Revision: 1.3  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:630px;">
<script class="expj-script-KM0020010-KM0020010button0">
expj.KM0020010.KM0020010button0 = {};
expj.KM0020010.KM0020010button0.executeAllOnDecision = function () {
  console.log('execute KM0020010button0.onDecision');
};
expj.KM0020010.KM0020010button0.executeOnLoad = function () {
  expj.KM0020010.KM0020010button0.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button0.executePScriptOnLoad = function () {
  console.log('execute KM0020010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KM0020010-KM0020010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:630px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KM0020010-KM0020010button0-print">
expj.KM0020010.KM0020010button0.print = {};
// script1="onClick;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*,_KM0020010view2/*@KM0020010Servlet:M,C,M"
expj.KM0020010.KM0020010button0.print.onClick0 = function () {
  console.log('print script1');
expj.common.pscript.viewPrinterDialog('KM0020010', 'KM0020010button0', '_KM0020010form1/*,_KM0020010form2/*,_KM0020010view2/*', 'KM0020010Servlet', 'M,C,M');
};
expj.KM0020010.KM0020010button0.print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button0.print['onClick' + i])) {
        expj.KM0020010.KM0020010button0.print['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button0.print.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button0.print.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button0-print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button0', 'print', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button0.print.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button0.print.executePScriptOnLoad = function () {
  console.log('execute KM0020010button0/print.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button0-print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button0-print" name="print" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button0-insert">
expj.KM0020010.KM0020010button0.insert = {};
// script1="onClick;0;CHK;_KM0020010form2/LIST_CNT[eq]0@!KM00012"
expj.KM0020010.KM0020010button0.insert.onClick0 = function () {
  console.log('insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010button0', '_KM0020010form2/LIST_CNT'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('KM0020010', 'KM0020010button0', 'KM00012');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*,_KM0020010view2/*@KM0020010Servlet,,$ZZ07001"
expj.KM0020010.KM0020010button0.insert.onClick1 = function () {
  console.log('insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button0', '_KM0020010form1/*,_KM0020010form2/*,_KM0020010view2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callConfirm('KM0020010', 'KM0020010button0', 'ZZ07001', okEvent);
};
expj.KM0020010.KM0020010button0.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button0.insert['onClick' + i])) {
        expj.KM0020010.KM0020010button0.insert['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button0.insert.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button0.insert.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button0-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button0', 'insert', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button0.insert.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button0.insert.executePScriptOnLoad = function () {
  console.log('execute KM0020010button0/insert.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button0-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button0-insert" name="insert" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button0-update">
expj.KM0020010.KM0020010button0.update = {};
// script1="onClick;0;CHK;_KM0020010form2/LIST_CNT[eq]0@!KM00012"
expj.KM0020010.KM0020010button0.update.onClick0 = function () {
  console.log('update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KM0020010', 'KM0020010button0', '_KM0020010form2/LIST_CNT'), '[eq]', '0')) {
expj.common.pscript.viewErrorMessage('KM0020010', 'KM0020010button0', 'KM00012');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*,_KM0020010view2/*@KM0020010Servlet,,$ZZ07003"
expj.KM0020010.KM0020010button0.update.onClick1 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button0', '_KM0020010form1/*,_KM0020010form2/*,_KM0020010view2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callConfirm('KM0020010', 'KM0020010button0', 'ZZ07003', okEvent);
};
expj.KM0020010.KM0020010button0.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button0.update['onClick' + i])) {
        expj.KM0020010.KM0020010button0.update['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button0.update.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button0.update.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button0-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button0', 'update', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button0.update.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button0.update.executePScriptOnLoad = function () {
  console.log('execute KM0020010button0/update.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button0-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button0-update" name="update" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button0-delete">
expj.KM0020010.KM0020010button0.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KM0020010form1/*,_KM0020010form2/*@KM0020010Servlet,,$ZZ07004"
expj.KM0020010.KM0020010button0.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button0', '_KM0020010form1/*,_KM0020010form2/*', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callConfirm('KM0020010', 'KM0020010button0', 'ZZ07004', okEvent);
};
expj.KM0020010.KM0020010button0.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button0.delete['onClick' + i])) {
        expj.KM0020010.KM0020010button0.delete['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button0.delete.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button0.delete.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button0-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button0', 'delete', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button0.delete.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button0.delete.executePScriptOnLoad = function () {
  console.log('execute KM0020010button0/delete.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button0-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button0-delete" name="delete" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button0-Clear">
expj.KM0020010.KM0020010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KM0020010Servlet,,$ZZ07008"
expj.KM0020010.KM0020010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KM0020010', 'KM0020010button0', '', 'KM0020010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KM0020010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KM0020010', response);
expj.common.updateBusinessScreenTab('KM0020010', contents);
};
expj.common.pscript.callConfirm('KM0020010', 'KM0020010button0', 'ZZ07008', okEvent);
};
expj.KM0020010.KM0020010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button0.Clear['onClick' + i])) {
        expj.KM0020010.KM0020010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button0.Clear.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button0.Clear.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button0', 'Clear', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button0.Clear.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KM0020010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button0-Clear" name="Clear" class="KM0020010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KM0020010-KM0020010button0-Close">
expj.KM0020010.KM0020010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KM0020010.KM0020010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KM0020010');
};
expj.KM0020010.KM0020010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KM0020010.KM0020010button0.Close['onClick' + i])) {
        expj.KM0020010.KM0020010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KM0020010.KM0020010button0.Close.executeAllOnDecision = function () {
};
expj.KM0020010.KM0020010button0.Close.executeOnLoad = function () {
  $('#expj-KM0020010-KM0020010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KM0020010', 'KM0020010button0', 'Close', this, 'Button');
    }
  });
  expj.KM0020010.KM0020010button0.Close.executePScriptOnLoad();
};

expj.KM0020010.KM0020010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KM0020010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KM0020010-KM0020010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KM0020010-KM0020010button0-Close" name="Close" class="KM0020010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KM0020010 (END)-->
<%
MessageStruct msgStruct = aKM0020010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KM0020010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KM0020010)) {
  expj.common.treeInstanceMap.KM0020010 = {};
}
expj.common.treeInstanceMap.KM0020010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KM0020010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KM0020010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KM0020010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KM0020010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KM0020010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KM0020010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010)) {
  expj.common.detailDialogMap.KM0020010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KM0020010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010.<%=detailId %>)) {
  expj.common.detailDialogMap.KM0020010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KM0020010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KM0020010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KM0020010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KM0020010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KM0020010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KM0020010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KM0020010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KM0020010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KM0020010)) {
  expj.common.viewInstanceMap.KM0020010 = {};
}
expj.common.viewInstanceMap.KM0020010.<%=viewId %> = {};
expj.common.viewInstanceMap.KM0020010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KM0020010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KM0020010.<%=viewId %>.init = function () {
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
    expj.KM0020010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KM0020010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KM0020010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KM0020010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KM0020010_init">
/**
 * KM0020010用のロード完了時初期化関数
 */
expj.KM0020010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KM0020010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KM0020010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KM0020010');
  expj.common.calendarInstanceMap.KM0020010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KM0020010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.init();
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KM0020010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KM0020010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KM0020010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KM0020010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KM0020010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KM0020010-<%=detailId %>');
<%
 }
%>
  try{expj.KM0020010.KM0020010form1.PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form1.PeekerProjectCd.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form1.PROJECT_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form1.PROJECT_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form1.ESTIMATE_NO.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button1.Select.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.QUOTE_PROJECT_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.PeekerProjectCdQuote.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.QUOTE_ESTIMATE_NO.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.Q_Select.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ESTIMATE_STAT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.UNOFFICIAL_RECEIPT_FLG.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.h_MAX_DETAL_NO.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ES_COMMET1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.h_CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ESTIMATE_DATE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.CalendarSalesDate.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ES_COMMET2.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.h_CUR_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ES_COMMET4.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ESTIMATE_AMOUNT_JPN.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.Total.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ES_COMMET3.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.LIST_CNT.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ES_COMMET5.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ES_USER_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.PeekerUserCd.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ES_ORG_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.PeekerOrgCd.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ZIP_CD.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.TEL.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ADDRESS_1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ADDRESS_2.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ESREMARK1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ESREMARK2.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.ESREMARK3.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button2.append.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button2.modify.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button2.copy.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button2.erase.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button0.print.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button0.insert.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button0.update.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button0.delete.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010form2.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010view1.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button2.executeOnLoad();}catch(e){};
  try{expj.KM0020010.KM0020010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KM0020010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KM0020010', 'KM0020010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KM0020010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KM0020010-focus-move');
  // 初期フォーカス当てる処理
  $('.KM0020010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KM0020010', '<%=request.getContextPath() %>');
};

/**
 * KM0020010の全体onDecision処理
 */
expj.KM0020010.executeAllOnDecision = function () {
  expj.KM0020010.KM0020010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KM0020010_console">
expj.KM0020010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>