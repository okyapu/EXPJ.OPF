<%-- ***
This file is generated
 GeneratedDate  : Tue Feb 21 10:39:21 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0040\AD0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0040.*" %>
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
<jsp:useBean id="aAD0040010Control" class="com.nec.jp.orteus.metamorBase.AD0040.AD0040010Control" scope="request"/>
<jsp:useBean id="aAD0040010Struct" class="com.nec.jp.orteus.metamorBase.AD0040.AD0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
作業実績メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0040/jsp/AD0040010.jsp,v $
$Author: geng-jia $	
$Revision: 1.28 $ $Date: 2017/02/22 02:04:47 $
********************************************************* --%>
<html>
<head>
<title>作業実績メンテナンス</title>
<%@include file="common/expj_v5.jsp" %>
<% ScreenMoveUtil su = new ScreenMoveUtil("AD0040010Servlet", so); %>

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
<script class="expj-script-AD0040010_init">
  // AD0040010名前空間
  expj.AD0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<% 
boolean lastProc = aAD0040010Control.isLastProc(); 
boolean rsltListFlg = aAD0040010Control.isRsltListFlg(); 
boolean issueListFlg = aAD0040010Control.isIssueListFlg(); 
String h_PARTIAL_PRD_NO = aAD0040010Control.getHeaderStruct().getPARTIAL_PRD_NO(); 
%>

  <div id="expj-business-screen-AD0040010" data-screen="AD0040010" data-newdata="<%=aAD0040010Control.isNewData() %>">
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
              <script class="expj-script-AD0040010-AD0040010form1">
expj.AD0040010.AD0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6,7"
expj.AD0040010.AD0040010form1.onLoad0 = function () {
  console.log('AD0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision7)){this.onDecision7();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AD0040010.AD0040010form1.onDecision0 = function () {
  console.log('AD0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AD0040010button1/Select"
expj.AD0040010.AD0040010form1.child0 = function () {
  console.log('AD0040010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button1/Select');
};
// script4="child;1;MASK;_AD0040010button1/Select"
expj.AD0040010.AD0040010form1.child1 = function () {
  console.log('AD0040010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button1/Select');
};
// script5="onDecision;1;CHK;?IN_OPR_INST_CD[eq]SAME[and]_h_WORK_STS_TYP[neq]9@*2,*4"
expj.AD0040010.AD0040010form1.onDecision1 = function () {
  console.log('AD0040010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?IN_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '_h_WORK_STS_TYP'), '[neq]', '9')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;2;CHK;?AD0040010form1/*[eq]NORMAL[or]?AD0040010form1/*[eq]TOO_MANY@*3,*4"
expj.AD0040010.AD0040010form1.child2 = function () {
  console.log('AD0040010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AD0040010button2/LineInsert"
expj.AD0040010.AD0040010form1.child3 = function () {
  console.log('AD0040010form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button2/LineInsert');
};
// script8="child;4;MASK;_AD0040010button2/LineInsert"
expj.AD0040010.AD0040010form1.child4 = function () {
  console.log('AD0040010form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button2/LineInsert');
};
// script9="onDecision;2;CHK;?IN_OPR_INST_CD[eq]SAME[and]_h_WORK_STS_TYP[neq]9@*5,*8"
expj.AD0040010.AD0040010form1.onDecision2 = function () {
  console.log('AD0040010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?IN_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '_h_WORK_STS_TYP'), '[neq]', '9')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script10="child;5;CHK;?AD0040010form1/*[eq]NORMAL[or]?AD0040010form1/*[eq]TOO_MANY@*6,*8"
expj.AD0040010.AD0040010form1.child5 = function () {
  console.log('AD0040010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;CHKRQ;?AD0040010view1/?[eq]SINGLE@*7,*8"
expj.AD0040010.AD0040010form1.child6 = function () {
  console.log('AD0040010form1 script11');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_AD0040010button2/LineUpdate"
expj.AD0040010.AD0040010form1.child7 = function () {
  console.log('AD0040010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button2/LineUpdate');
};
// script13="child;8;MASK;_AD0040010button2/LineUpdate"
expj.AD0040010.AD0040010form1.child8 = function () {
  console.log('AD0040010form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button2/LineUpdate');
};
// script14="onDecision;3;CHK;?IN_OPR_INST_CD[eq]SAME[and]_h_WORK_STS_TYP[eq]9@*9,*11"
expj.AD0040010.AD0040010form1.onDecision3 = function () {
  console.log('AD0040010form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?IN_OPR_INST_CD'), '[eq]', 'SAME') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '_h_WORK_STS_TYP'), '[eq]', '9')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script15="child;9;CHK;?AD0040010form1/*[eq]NORMAL[or]?AD0040010form1/*[eq]TOO_MANY@*10,*11"
expj.AD0040010.AD0040010form1.child9 = function () {
  console.log('AD0040010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script16="child;10;UNMASK;_AD0040010button0/CancelComplete"
expj.AD0040010.AD0040010form1.child10 = function () {
  console.log('AD0040010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button0/CancelComplete');
};
// script17="child;11;MASK;_AD0040010button0/CancelComplete"
expj.AD0040010.AD0040010form1.child11 = function () {
  console.log('AD0040010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button0/CancelComplete');
};
// script18="onDecision;4;CHK;?IN_OPR_INST_CD[eq]SAME@*12,*15"
expj.AD0040010.AD0040010form1.onDecision4 = function () {
  console.log('AD0040010form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?IN_OPR_INST_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script19="child;12;CHK;?AD0040010form1/*[eq]NORMAL[or]?AD0040010form1/*[eq]TOO_MANY@*13,*15"
expj.AD0040010.AD0040010form1.child12 = function () {
  console.log('AD0040010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script20="child;13;CHKRQ;?AD0040010view1/?[eq]SINGLE@*14,*15"
expj.AD0040010.AD0040010form1.child13 = function () {
  console.log('AD0040010form1 script20');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
}
};
// script21="child;14;UNMASK;_AD0040010button3/UseParts"
expj.AD0040010.AD0040010form1.child14 = function () {
  console.log('AD0040010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button3/UseParts');
};
// script22="child;15;MASK;_AD0040010button3/UseParts"
expj.AD0040010.AD0040010form1.child15 = function () {
  console.log('AD0040010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button3/UseParts');
};
// script23="onDecision;5;CHK;?IN_OPR_INST_CD[eq]SAME@*16,*19"
expj.AD0040010.AD0040010form1.onDecision5 = function () {
  console.log('AD0040010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?IN_OPR_INST_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script24="child;16;CHK;?AD0040010form1/*[eq]NORMAL[or]?AD0040010form1/*[eq]TOO_MANY@*17,*19"
expj.AD0040010.AD0040010form1.child16 = function () {
  console.log('AD0040010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script25="child;17;CHKRQ;?AD0040010view1/?[eq]SINGLE@*18,*19"
expj.AD0040010.AD0040010form1.child17 = function () {
  console.log('AD0040010form1 script25');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script26="child;18;UNMASK;_AD0040010button3/UpdateAll"
expj.AD0040010.AD0040010form1.child18 = function () {
  console.log('AD0040010form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button3/UpdateAll');
};
// script27="child;19;MASK;_AD0040010button3/UpdateAll"
expj.AD0040010.AD0040010form1.child19 = function () {
  console.log('AD0040010form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button3/UpdateAll');
};
// script28="onDecision;6;CHK;?IN_OPR_INST_CD[eq]SAME@*20,*23"
expj.AD0040010.AD0040010form1.onDecision6 = function () {
  console.log('AD0040010form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?IN_OPR_INST_CD'), '[eq]', 'SAME')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script29="child;20;CHK;?AD0040010form1/*[eq]NORMAL[or]?AD0040010form1/*[eq]TOO_MANY@*21,*23"
expj.AD0040010.AD0040010form1.child20 = function () {
  console.log('AD0040010form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'NORMAL') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010form1/*'), '[eq]', 'TOO_MANY')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script30="child;21;CHKRQ;?AD0040010view1/?[eq]SINGLE,?AD0040010view2/?[eq]SINGLE@*22,*23"
expj.AD0040010.AD0040010form1.child21 = function () {
  console.log('AD0040010form1 script30');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010view1/?'), '[eq]', 'SINGLE')) && (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '?AD0040010view2/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script31="child;22;UNMASK;_AD0040010button3/NoUserParts"
expj.AD0040010.AD0040010form1.child22 = function () {
  console.log('AD0040010form1 script31');
expj.common.pscript.setUnMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button3/NoUserParts');
};
// script32="child;23;MASK;_AD0040010button3/NoUserParts"
expj.AD0040010.AD0040010form1.child23 = function () {
  console.log('AD0040010form1 script32');
expj.common.pscript.setMaskToReferenceComponent('AD0040010', 'AD0040010form1', '_AD0040010button3/NoUserParts');
};
// script33="onDecision;7;SET;_AD0040010form2/d1_STOCK_UNIT=_AD0040010form2/STOCK_UNIT,_AD0040010form2/d2_STOCK_UNIT=_AD0040010form2/STOCK_UNIT"
expj.AD0040010.AD0040010form1.onDecision7 = function () {
  console.log('AD0040010form1 script33');
expj.common.pscript.setReferenceComponentValue('AD0040010', 'AD0040010form1', '_AD0040010form2/d1_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '_AD0040010form2/STOCK_UNIT'));
expj.common.pscript.setReferenceComponentValue('AD0040010', 'AD0040010form1', '_AD0040010form2/d2_STOCK_UNIT', expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '_AD0040010form2/STOCK_UNIT'));
};
expj.AD0040010.AD0040010form1.executeAllOnDecision = function () {
  console.log('execute AD0040010form1.onDecision');
  for (var i = 0; i <= 7; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010form1['onDecision' + i])) {
        expj.AD0040010.AD0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010form1.executeOnLoad = function () {
  expj.AD0040010.AD0040010form1.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form1.executePScriptOnLoad = function () {
  console.log('execute AD0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0040010.AD0040010form1['onLoad' + i])) {
      expj.AD0040010.AD0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0040010-AD0040010form1" action="AD0040010Servlet" name="AD0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0040010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form1-IN_OPR_INST_CD">
expj.AD0040010.AD0040010form1.IN_OPR_INST_CD = {};
expj.AD0040010.AD0040010form1.IN_OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0040010form1/IN_OPR_INST_CD.onDecision');
  expj.AD0040010.AD0040010form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form1.IN_OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form1-IN_OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form1', 'IN_OPR_INST_CD', this);
  });
  expj.AD0040010.AD0040010form1.IN_OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form1.IN_OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040010form1/IN_OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form1-IN_OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form1-IN_OPR_INST_CD" name="IN_OPR_INST_CD" class="AD0040010-focus-move  required-value expj-AD0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getIN_OPR_INST_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form1-PeekerOprInstCd">
expj.AD0040010.AD0040010form1.PeekerOprInstCd = {};
// script1="onClick;0;PEEKER;_AD0040010form1/IN_OPR_INST_CD@<%=contextNo%>"
expj.AD0040010.AD0040010form1.PeekerOprInstCd.onClick0 = function () {
  console.log('PeekerOprInstCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0040010';
var parameterValues = 'PeekerOprInstCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0040010', 'PeekerOprInstCd', 'SQLPARAM_1', '<%=aAD0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010form1', '_IN_OPR_INST_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%OPR_INST_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AD0040010form1/IN_OPR_INST_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0040010.AD0040010form1.PeekerOprInstCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010form1.PeekerOprInstCd['onClick' + i])) {
        expj.AD0040010.AD0040010form1.PeekerOprInstCd['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010form1.PeekerOprInstCd.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010form1.PeekerOprInstCd.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form1-PeekerOprInstCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010form1', 'PeekerOprInstCd', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010form1.PeekerOprInstCd.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form1.PeekerOprInstCd.executePScriptOnLoad = function () {
  console.log('execute AD0040010form1/PeekerOprInstCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form1-PeekerOprInstCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0040010-AD0040010form1-PeekerOprInstCd" class="AD0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AD0040010-AD0040010form1-DOWNLOAD_FILE">
expj.AD0040010.AD0040010form1.DOWNLOAD_FILE = {};
expj.AD0040010.AD0040010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AD0040010form1/DOWNLOAD_FILE.onDecision');
  expj.AD0040010.AD0040010form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AD0040010.AD0040010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AD0040010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040010form1-h_SYS_LOT_CTRL_FLG" name="h_SYS_LOT_CTRL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_SYS_LOT_CTRL_FLG()) %>">
<script class="expj-script-AD0040010-AD0040010form1-h_SYS_LOT_CTRL_FLG">
expj.AD0040010.AD0040010form1.h_SYS_LOT_CTRL_FLG = {};
expj.AD0040010.AD0040010form1.h_SYS_LOT_CTRL_FLG.executeAllOnDecision = function () {
  console.log('execute AD0040010form1/h_SYS_LOT_CTRL_FLG.onDecision');
  expj.AD0040010.AD0040010form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form1.h_SYS_LOT_CTRL_FLG.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form1-h_SYS_LOT_CTRL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form1', 'h_SYS_LOT_CTRL_FLG', this);
  });
  expj.AD0040010.AD0040010form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form1.h_SYS_LOT_CTRL_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0040010form1/h_SYS_LOT_CTRL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form1-h_SYS_LOT_CTRL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040010form1-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0040010-AD0040010form1-TIME_CTRL">
expj.AD0040010.AD0040010form1.TIME_CTRL = {};
expj.AD0040010.AD0040010form1.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0040010form1/TIME_CTRL.onDecision');
  expj.AD0040010.AD0040010form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form1.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form1-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form1', 'TIME_CTRL', this);
  });
  expj.AD0040010.AD0040010form1.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form1.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0040010form1/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form1-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040010form1-h_WORK_STS_TYP" name="h_WORK_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_WORK_STS_TYP()) %>">
<script class="expj-script-AD0040010-AD0040010form1-h_WORK_STS_TYP">
expj.AD0040010.AD0040010form1.h_WORK_STS_TYP = {};
expj.AD0040010.AD0040010form1.h_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0040010form1/h_WORK_STS_TYP.onDecision');
  expj.AD0040010.AD0040010form1.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form1.h_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form1-h_WORK_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form1', 'h_WORK_STS_TYP', this);
  });
  expj.AD0040010.AD0040010form1.h_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form1.h_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0040010form1/h_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form1-h_WORK_STS_TYP');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0040010-AD0040010button1">
expj.AD0040010.AD0040010button1 = {};
expj.AD0040010.AD0040010button1.executeAllOnDecision = function () {
  console.log('execute AD0040010button1.onDecision');
};
expj.AD0040010.AD0040010button1.executeOnLoad = function () {
  expj.AD0040010.AD0040010button1.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button1.executePScriptOnLoad = function () {
  console.log('execute AD0040010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0040010-AD0040010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0040010-AD0040010button1-Detail">
expj.AD0040010.AD0040010button1.Detail = {};
// script1="onClick;0;FSHOW;AD0040010float1"
expj.AD0040010.AD0040010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AD0040010', 'AD0040010float1', '');
};
expj.AD0040010.AD0040010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button1.Detail['onClick' + i])) {
        expj.AD0040010.AD0040010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button1.Detail.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button1.Detail.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button1', 'Detail', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button1.Detail.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AD0040010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button1-Detail" name="Detail" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010button1-Select">
expj.AD0040010.AD0040010button1.Select = {};
// script1="onClick;0;CHK;_AD0040010form1/IN_OPR_INST_CD[eq]@!ZZ01104"
expj.AD0040010.AD0040010button1.Select.onClick0 = function () {
  console.log('Select script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0040010', 'AD0040010button1', '_AD0040010form1/IN_OPR_INST_CD'), '[eq]', '')) {
expj.common.pscript.viewErrorMessage('AD0040010', 'AD0040010button1', 'ZZ01104');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/IN_OPR_INST_CD@AD0040010Servlet"
expj.AD0040010.AD0040010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button1', '_AD0040010form1/IN_OPR_INST_CD', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.updateBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0040010.AD0040010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button1.Select['onClick' + i])) {
        expj.AD0040010.AD0040010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button1.Select.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button1.Select.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button1', 'Select', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button1.Select.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0040010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button1-Select" name="Select" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0040010-AD0040010view1">
expj.AD0040010.AD0040010view1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,ClickShow=ACT,_AD0040010form1/*,_AD0040010view1/+@AD0040010Servlet"
expj.AD0040010.AD0040010view1.onClick0 = function () {
  console.log('AD0040010view1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010view1', 'ClickShow=ACT,_AD0040010form1/*,_AD0040010view1/+', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.updateBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0040010.AD0040010view1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010view1['onClick' + i])) {
        expj.AD0040010.AD0040010view1['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010view1.executeAllOnDecision = function () {
  console.log('execute AD0040010view1.onDecision');
};
expj.AD0040010.AD0040010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0040010view1", "expj.AD0040010.AD0040010view1.executeAllOnClick");
%>
  expj.AD0040010.AD0040010view1.executePScriptOnLoad();
};

expj.AD0040010.AD0040010view1.executePScriptOnLoad = function () {
  console.log('execute AD0040010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0040010-AD0040010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:88px;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0040010view1_Id = "AD0040010view1";
 String AD0040010view1_select = "single";
 String AD0040010view1_sortable = "true";
 String AD0040010view1_resize = "true";
 String AD0040010view1_scroll = "true";
 StringBuffer AD0040010view1_HB = new StringBuffer();
 StringBuffer AD0040010view1_DB = new StringBuffer();
%>
<%
 AD0040010view1_select = "single";
 AD0040010view1_sortable = "true";
 AD0040010view1_resize = "true";
 AD0040010view1_scroll = "true";
%>
<%
 AD0040010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0040010view1_sortable).append("}").append(",");
%>
      <% aAD0040010Control.setList(aAD0040010Control.getRsltList()); %>
<%
AD0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PARTIAL_PRD_NO",rb))).append("', 'name':'PARTIAL_PRD_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0040010view1_sortable).append("}").append(",");
AD0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_QTY",rb))).append("', 'name':'ACPT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view1_sortable).append("}").append(",");
AD0040010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.DEFECT_QTY",rb))).append("', 'name':'DEFECT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view1_sortable).append("}").append(",");
AD0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'115px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OPR_DATE_3",rb))).append("', 'name':'OPR_DATE', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view1_sortable).append("}").append(",");
AD0040010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WH_CD",rb))).append("', 'name':'WH_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view1_sortable).append("}").append(",");
%>
<%
 int aAD0040010StructLength = aAD0040010Control.getListsize();
 final AD0040010Struct structBackup = aAD0040010Struct;
 aAD0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0040010StructLength; ++loopCount) {
  if((aAD0040010Struct = (AD0040010Struct) aAD0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0040010Struct", aAD0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0040010view1_DB.append("[");
 AD0040010view1_DB.append(loopCount);
 AD0040010view1_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view1-PARTIAL_PRD_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view1-PARTIAL_PRD_NO\" data-name=\"PARTIAL_PRD_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAD0040010Struct.getPARTIAL_PRD_NO())).append("</span>'");
 AD0040010view1_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view1-ACPT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view1-ACPT_QTY\" data-name=\"ACPT_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Control.getHeaderStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getACPT_QTY())).append("</span>'");
 AD0040010view1_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view1-DEFECT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view1-DEFECT_QTY\" data-name=\"DEFECT_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Control.getHeaderStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getDEFECT_QTY())).append("</span>'");
 AD0040010view1_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view1-OPR_DATE-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view1-OPR_DATE\" data-name=\"OPR_DATE\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getOPR_DATE())).append("</span>'");
 AD0040010view1_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view1-WH_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view1-WH_CD\" data-name=\"WH_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getWH_CD())).append("</span>'");
 AD0040010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0040010StructLength) {
   AD0040010view1_DB.append(",");
  }
 }
 aAD0040010Struct = structBackup;
 viewIdList.add(AD0040010view1_Id);
 viewSelectList.add(AD0040010view1_select);
 viewResizeList.add(AD0040010view1_resize);
 viewScrollList.add(AD0040010view1_scroll);
 viewHeaderDataList.add(AD0040010view1_HB);
 viewBodyDataList.add(AD0040010view1_DB);
%>
<%
}
%>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0040010-AD0040010button2">
expj.AD0040010.AD0040010button2 = {};
expj.AD0040010.AD0040010button2.executeAllOnDecision = function () {
  console.log('execute AD0040010button2.onDecision');
};
expj.AD0040010.AD0040010button2.executeOnLoad = function () {
  expj.AD0040010.AD0040010button2.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button2.executePScriptOnLoad = function () {
  console.log('execute AD0040010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0040010-AD0040010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0040010-AD0040010button2-LineInsert">
expj.AD0040010.AD0040010button2.LineInsert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/*,_AD0040010form2/*@AD0040010Servlet"
expj.AD0040010.AD0040010button2.LineInsert.onClick0 = function () {
  console.log('LineInsert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button2', '_AD0040010form1/*,_AD0040010form2/*', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.changeBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0040010.AD0040010button2.LineInsert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button2.LineInsert['onClick' + i])) {
        expj.AD0040010.AD0040010button2.LineInsert['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button2.LineInsert.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button2.LineInsert.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button2-LineInsert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button2', 'LineInsert', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button2.LineInsert.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button2.LineInsert.executePScriptOnLoad = function () {
  console.log('execute AD0040010button2/LineInsert.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button2-LineInsert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button2-LineInsert" name="LineInsert" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010button2-LineUpdate">
expj.AD0040010.AD0040010button2.LineUpdate = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+@AD0040010Servlet"
expj.AD0040010.AD0040010button2.LineUpdate.onClick0 = function () {
  console.log('LineUpdate script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button2', '_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.changeBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0040010.AD0040010button2.LineUpdate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button2.LineUpdate['onClick' + i])) {
        expj.AD0040010.AD0040010button2.LineUpdate['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button2.LineUpdate.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button2.LineUpdate.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button2-LineUpdate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button2', 'LineUpdate', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button2.LineUpdate.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button2.LineUpdate.executePScriptOnLoad = function () {
  console.log('execute AD0040010button2/LineUpdate.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button2-LineUpdate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button2-LineUpdate" name="LineUpdate" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0040010-AD0040010form2">
expj.AD0040010.AD0040010form2 = {};
expj.AD0040010.AD0040010form2.executeAllOnDecision = function () {
  console.log('execute AD0040010form2.onDecision');
};
expj.AD0040010.AD0040010form2.executeOnLoad = function () {
  expj.AD0040010.AD0040010form2.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0040010-AD0040010form2" action="AD0040010Servlet" name="AD0040010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
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
<script class="expj-script-AD0040010-AD0040010form2-ITEM_CD">
expj.AD0040010.AD0040010form2.ITEM_CD = {};
expj.AD0040010.AD0040010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/ITEM_CD.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'ITEM_CD', this);
  });
  expj.AD0040010.AD0040010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-ITEM_CD" name="ITEM_CD" class="AD0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-ITEM_NAME">
expj.AD0040010.AD0040010form2.ITEM_NAME = {};
expj.AD0040010.AD0040010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/ITEM_NAME.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'ITEM_NAME', this);
  });
  expj.AD0040010.AD0040010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-ITEM_NAME" name="ITEM_NAME" class="AD0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040010form2-h_OPR_DATE" name="h_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_OPR_DATE()) %>">
<script class="expj-script-AD0040010-AD0040010form2-h_OPR_DATE">
expj.AD0040010.AD0040010form2.h_OPR_DATE = {};
expj.AD0040010.AD0040010form2.h_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/h_OPR_DATE.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.h_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-h_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'h_OPR_DATE', this);
  });
  expj.AD0040010.AD0040010form2.h_OPR_DATE.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.h_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/h_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-h_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0040010-AD0040010form2-h_ITEM_MODIFY_COUNT" name="h_ITEM_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_ITEM_MODIFY_COUNT()) %>">
<script class="expj-script-AD0040010-AD0040010form2-h_ITEM_MODIFY_COUNT">
expj.AD0040010.AD0040010form2.h_ITEM_MODIFY_COUNT = {};
expj.AD0040010.AD0040010form2.h_ITEM_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/h_ITEM_MODIFY_COUNT.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.h_ITEM_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-h_ITEM_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'h_ITEM_MODIFY_COUNT', this);
  });
  expj.AD0040010.AD0040010form2.h_ITEM_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.h_ITEM_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/h_ITEM_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-h_ITEM_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040010form2-h_PROC_MODIFY_COUNT" name="h_PROC_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_PROC_MODIFY_COUNT()) %>">
<script class="expj-script-AD0040010-AD0040010form2-h_PROC_MODIFY_COUNT">
expj.AD0040010.AD0040010form2.h_PROC_MODIFY_COUNT = {};
expj.AD0040010.AD0040010form2.h_PROC_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/h_PROC_MODIFY_COUNT.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.h_PROC_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-h_PROC_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'h_PROC_MODIFY_COUNT', this);
  });
  expj.AD0040010.AD0040010form2.h_PROC_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.h_PROC_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/h_PROC_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-h_PROC_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)%></span><!-- 作業コード --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-WORK_IN_PROC_CD">
expj.AD0040010.AD0040010form2.WORK_IN_PROC_CD = {};
expj.AD0040010.AD0040010form2.WORK_IN_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/WORK_IN_PROC_CD.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.WORK_IN_PROC_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-WORK_IN_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'WORK_IN_PROC_CD', this);
  });
  expj.AD0040010.AD0040010form2.WORK_IN_PROC_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.WORK_IN_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/WORK_IN_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-WORK_IN_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-WORK_IN_PROC_CD" name="WORK_IN_PROC_CD" class="AD0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getWORK_IN_PROC_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-PROC_NAME">
expj.AD0040010.AD0040010form2.PROC_NAME = {};
expj.AD0040010.AD0040010form2.PROC_NAME.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/PROC_NAME.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.PROC_NAME.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'PROC_NAME', this);
  });
  expj.AD0040010.AD0040010form2.PROC_NAME.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-PROC_NAME" name="PROC_NAME" class="AD0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getPROC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_QTY",rb)%></span><!-- 作業指示数 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-OPR_INST_QTY">
expj.AD0040010.AD0040010form2.OPR_INST_QTY = {};
expj.AD0040010.AD0040010form2.OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/OPR_INST_QTY.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'OPR_INST_QTY', this);
  });
  expj.AD0040010.AD0040010form2.OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-OPR_INST_QTY" name="OPR_INST_QTY" class="AD0040010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0040010Control.getHeaderStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getOPR_INST_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-STOCK_UNIT">
expj.AD0040010.AD0040010form2.STOCK_UNIT = {};
expj.AD0040010.AD0040010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/STOCK_UNIT.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'STOCK_UNIT', this);
  });
  expj.AD0040010.AD0040010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-STOCK_UNIT" name="STOCK_UNIT" class="AD0040010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0040010-AD0040010form2-h_OPR_INST_CD" name="h_OPR_INST_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0040010Struct.geth_OPR_INST_CD()) %>">
<script class="expj-script-AD0040010-AD0040010form2-h_OPR_INST_CD">
expj.AD0040010.AD0040010form2.h_OPR_INST_CD = {};
expj.AD0040010.AD0040010form2.h_OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/h_OPR_INST_CD.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.h_OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-h_OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'h_OPR_INST_CD', this);
  });
  expj.AD0040010.AD0040010form2.h_OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.h_OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/h_OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-h_OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0318",rb)%></span><!-- 良品累計数 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-SUM_ACPT_QTY">
expj.AD0040010.AD0040010form2.SUM_ACPT_QTY = {};
expj.AD0040010.AD0040010form2.SUM_ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/SUM_ACPT_QTY.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.SUM_ACPT_QTY.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-SUM_ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'SUM_ACPT_QTY', this);
  });
  expj.AD0040010.AD0040010form2.SUM_ACPT_QTY.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.SUM_ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/SUM_ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-SUM_ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-SUM_ACPT_QTY" name="SUM_ACPT_QTY" class="AD0040010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0040010Control.getHeaderStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getSUM_ACPT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-d1_STOCK_UNIT">
expj.AD0040010.AD0040010form2.d1_STOCK_UNIT = {};
expj.AD0040010.AD0040010form2.d1_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/d1_STOCK_UNIT.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.d1_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-d1_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'd1_STOCK_UNIT', this);
  });
  expj.AD0040010.AD0040010form2.d1_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.d1_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/d1_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-d1_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-d1_STOCK_UNIT" name="d1_STOCK_UNIT" class="AD0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0319",rb)%></span><!-- 不良品累計数 --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-SUM_DEFECT_QTY">
expj.AD0040010.AD0040010form2.SUM_DEFECT_QTY = {};
expj.AD0040010.AD0040010form2.SUM_DEFECT_QTY.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/SUM_DEFECT_QTY.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.SUM_DEFECT_QTY.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-SUM_DEFECT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'SUM_DEFECT_QTY', this);
  });
  expj.AD0040010.AD0040010form2.SUM_DEFECT_QTY.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.SUM_DEFECT_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/SUM_DEFECT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-SUM_DEFECT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-SUM_DEFECT_QTY" name="SUM_DEFECT_QTY" class="AD0040010-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0040010Control.getHeaderStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0040010Struct.getSUM_DEFECT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010form2-d2_STOCK_UNIT">
expj.AD0040010.AD0040010form2.d2_STOCK_UNIT = {};
expj.AD0040010.AD0040010form2.d2_STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0040010form2/d2_STOCK_UNIT.onDecision');
  expj.AD0040010.AD0040010form2.executeAllOnDecision();
  expj.AD0040010.executeAllOnDecision();
};
expj.AD0040010.AD0040010form2.d2_STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010form2-d2_STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0040010', 'AD0040010form2', 'd2_STOCK_UNIT', this);
  });
  expj.AD0040010.AD0040010form2.d2_STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0040010.AD0040010form2.d2_STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0040010form2/d2_STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010form2-d2_STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0040010-AD0040010form2-d2_STOCK_UNIT" name="d2_STOCK_UNIT" class="AD0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><%
                List listBackup = aAD0040010Control.getList();
                aAD0040010Control.setList(aAD0040010Control.getIssueList());
              %><script class="expj-script-AD0040010-AD0040010view2">
expj.AD0040010.AD0040010view2 = {};
expj.AD0040010.AD0040010view2.executeAllOnClick = function () {
};
expj.AD0040010.AD0040010view2.executeAllOnDecision = function () {
  console.log('execute AD0040010view2.onDecision');
};
expj.AD0040010.AD0040010view2.executeOnLoad = function () {
<%
    viewSelectEvent.put("AD0040010view2", "expj.AD0040010.AD0040010view2.executeAllOnClick");
%>
  expj.AD0040010.AD0040010view2.executePScriptOnLoad();
};

expj.AD0040010.AD0040010view2.executePScriptOnLoad = function () {
  console.log('execute AD0040010view2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AD0040010-AD0040010view2" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AD0040010view2_Id = "AD0040010view2";
 String AD0040010view2_select = "single";
 String AD0040010view2_sortable = "true";
 String AD0040010view2_resize = "true";
 String AD0040010view2_scroll = "true";
 StringBuffer AD0040010view2_HB = new StringBuffer();
 StringBuffer AD0040010view2_DB = new StringBuffer();
%>
<%
 AD0040010view2_select = "single";
 AD0040010view2_sortable = "true";
 AD0040010view2_resize = "true";
 AD0040010view2_scroll = "true";
%>
<%
 AD0040010view2_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
%>
     
<%
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'l_PARTIAL_PRD_NO', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_CD_5",rb))).append("', 'name':'l_ITEM_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ITEM_NAME_2",rb))).append("', 'name':'l_ITEM_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STOCK_LOT_CD",rb))).append("', 'name':'l_LOT_NO', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_TYP",rb))).append("', 'name':'ISSUE_TYP_DN', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ISSUE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0320",rb))).append("', 'name':'TEMP_PLAN_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0321",rb))).append("', 'name':'TEMP_USEOVER_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'120px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0322",rb))).append("', 'name':'TEMP_PLANOUT_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0323",rb))).append("', 'name':'TEMP_USE_QTY', 'class':'expj-tooltip expj-view-cell-label expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_NUMERATOR_2",rb))).append("', 'name':'h_ISSUE_INST_UNIT_NUMERATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'numeric', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ISSUE_INST_UNIT_DENOMINATOR_2",rb))).append("', 'name':'h_ISSUE_INST_UNIT_DENOMINATOR', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ISSUE_INST_UNIT_FRACTION', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
AD0040010view2_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'h_ISSUE_INST_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AD0040010view2_sortable).append("}").append(",");
%>
<%
 int aAD0040010StructLength = aAD0040010Control.getListsize();
 final AD0040010Struct structBackup = aAD0040010Struct;
 aAD0040010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAD0040010StructLength; ++loopCount) {
  if((aAD0040010Struct = (AD0040010Struct) aAD0040010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAD0040010Struct", aAD0040010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AD0040010view2_DB.append("[");
 AD0040010view2_DB.append(loopCount);
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_PARTIAL_PRD_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_PARTIAL_PRD_NO\" data-name=\"l_PARTIAL_PRD_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER_P;6\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_PARTIAL_PRD_NO())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_ITEM_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_ITEM_CD\" data-name=\"l_ITEM_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_ITEM_CD())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_ITEM_NAME-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_ITEM_NAME\" data-name=\"l_ITEM_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_ITEM_NAME())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-l_LOT_NO-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-l_LOT_NO\" data-name=\"l_LOT_NO\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getl_LOT_NO())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-ISSUE_TYP_DN-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-ISSUE_TYP_DN\" data-name=\"ISSUE_TYP_DN\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getISSUE_TYP_DN())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_TYP\" data-name=\"h_ISSUE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_TYP())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_PLAN_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_PLAN_QTY\" data-name=\"TEMP_PLAN_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_PLAN_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_USEOVER_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_USEOVER_QTY\" data-name=\"TEMP_USEOVER_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_USEOVER_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_PLANOUT_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_PLANOUT_QTY\" data-name=\"TEMP_PLANOUT_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.N, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_PLANOUT_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-TEMP_USE_QTY-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-TEMP_USE_QTY\" data-name=\"TEMP_USE_QTY\" data-view=\"true\" data-kind=\"").append(Kind.convertNumeric(aAD0040010Struct.getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)).append("\">").append(TypeConverter.sanitizer(aAD0040010Struct.getTEMP_USE_QTY())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_NUMERATOR-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_NUMERATOR\" data-name=\"h_ISSUE_INST_UNIT_NUMERATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_INST_UNIT_NUMERATOR())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_DENOMINATOR-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_INST_UNIT_DENOMINATOR\" data-name=\"h_ISSUE_INST_UNIT_DENOMINATOR\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;CEIL;4\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_INST_UNIT_DENOMINATOR())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-ISSUE_INST_UNIT_FRACTION-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-ISSUE_INST_UNIT_FRACTION\" data-name=\"ISSUE_INST_UNIT_FRACTION\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getISSUE_INST_UNIT_FRACTION())).append("</span>'");
 AD0040010view2_DB.append(",").append("'<span id=\"expj-AD0040010-AD0040010view2-h_ISSUE_INST_CD-").append(loopCount).append("\" class=\"expj-label expj-AD0040010-AD0040010view2-h_ISSUE_INST_CD\" data-name=\"h_ISSUE_INST_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.geth_ISSUE_INST_CD())).append("</span>'");
 AD0040010view2_DB.append("]");
%>
<%
if (loopCount + 1 < aAD0040010StructLength) {
   AD0040010view2_DB.append(",");
  }
 }
 aAD0040010Struct = structBackup;
 viewIdList.add(AD0040010view2_Id);
 viewSelectList.add(AD0040010view2_select);
 viewResizeList.add(AD0040010view2_resize);
 viewScrollList.add(AD0040010view2_scroll);
 viewHeaderDataList.add(AD0040010view2_HB);
 viewBodyDataList.add(AD0040010view2_DB);
%>
<%
}
%>
<%
                aAD0040010Control.setList(listBackup);
              %><!-- ここに下段メンテナンス用のDataGridを配置する。↑ --></div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AD0040010-AD0040010button3">
expj.AD0040010.AD0040010button3 = {};
expj.AD0040010.AD0040010button3.executeAllOnDecision = function () {
  console.log('execute AD0040010button3.onDecision');
};
expj.AD0040010.AD0040010button3.executeOnLoad = function () {
  expj.AD0040010.AD0040010button3.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button3.executePScriptOnLoad = function () {
  console.log('execute AD0040010button3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0040010-AD0040010button3" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0040010-AD0040010button3-UpdateAll">
expj.AD0040010.AD0040010button3.UpdateAll = {};
// script1="onClick;0;CHK;<%=TypeConverter.sanitizer(lastProc)%>[eq][or]<%=TypeConverter.sanitizer(lastProc)%>[eq]false@!AD00076"
expj.AD0040010.AD0040010button3.UpdateAll.onClick0 = function () {
  console.log('UpdateAll script1');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(lastProc)%>', '[eq]', '') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(lastProc)%>', '[eq]', 'false')) {
expj.common.pscript.viewErrorMessage('AD0040010', 'AD0040010button3', 'AD00076');
}
};
// script2="onClick;1;CHK;<%=TypeConverter.sanitizer(issueListFlg)%>[eq][or]<%=TypeConverter.sanitizer(issueListFlg)%>[eq]false@!AD00089"
expj.AD0040010.AD0040010button3.UpdateAll.onClick1 = function () {
  console.log('UpdateAll script2');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(issueListFlg)%>', '[eq]', '') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(issueListFlg)%>', '[eq]', 'false')) {
expj.common.pscript.viewErrorMessage('AD0040010', 'AD0040010button3', 'AD00089');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+@AD0040010Servlet,,$ZZ07003"
expj.AD0040010.AD0040010button3.UpdateAll.onClick2 = function () {
  console.log('UpdateAll script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button3', '_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.updateBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callConfirm('AD0040010', 'AD0040010button3', 'ZZ07003', okEvent);
};
expj.AD0040010.AD0040010button3.UpdateAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button3.UpdateAll['onClick' + i])) {
        expj.AD0040010.AD0040010button3.UpdateAll['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button3.UpdateAll.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button3.UpdateAll.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button3-UpdateAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button3', 'UpdateAll', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button3.UpdateAll.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button3.UpdateAll.executePScriptOnLoad = function () {
  console.log('execute AD0040010button3/UpdateAll.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button3-UpdateAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button3-UpdateAll" name="UpdateAll" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdateAll",rb)%></button><!-- 一括更新ボタン --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010button3-NoUserParts">
expj.AD0040010.AD0040010button3.NoUserParts = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+,_AD0040010view2/+@AD0040010Servlet"
expj.AD0040010.AD0040010button3.NoUserParts.onClick0 = function () {
  console.log('NoUserParts script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button3', '_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+,_AD0040010view2/+', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.changeBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0040010.AD0040010button3.NoUserParts.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button3.NoUserParts['onClick' + i])) {
        expj.AD0040010.AD0040010button3.NoUserParts['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button3.NoUserParts.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button3.NoUserParts.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button3-NoUserParts').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button3', 'NoUserParts', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button3.NoUserParts.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button3.NoUserParts.executePScriptOnLoad = function () {
  console.log('execute AD0040010button3/NoUserParts.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button3-NoUserParts');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button3-NoUserParts" name="NoUserParts" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnNumRegistration",rb)%></button><!-- 調整数登録ボタン --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010button3-UseParts">
expj.AD0040010.AD0040010button3.UseParts = {};
// script1="onClick;0;CHK;<%=TypeConverter.sanitizer(lastProc)%>[eq][or]<%=TypeConverter.sanitizer(lastProc)%>[eq]false@#AD00076"
expj.AD0040010.AD0040010button3.UseParts.onClick0 = function () {
  console.log('UseParts script1');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(lastProc)%>', '[eq]', '') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(lastProc)%>', '[eq]', 'false')) {
expj.common.pscript.addErrorMessage('AD0040010', 'AD0040010button3', 'AD00076');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+@AD0040010Servlet"
expj.AD0040010.AD0040010button3.UseParts.onClick1 = function () {
  console.log('UseParts script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button3', '_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/+', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.changeBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0040010.AD0040010button3.UseParts.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button3.UseParts['onClick' + i])) {
        expj.AD0040010.AD0040010button3.UseParts['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button3.UseParts.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button3.UseParts.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button3-UseParts').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button3', 'UseParts', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button3.UseParts.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button3.UseParts.executePScriptOnLoad = function () {
  console.log('execute AD0040010button3/UseParts.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button3-UseParts');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button3-UseParts" name="UseParts" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUseParts",rb)%></button><!-- 子部品追加登録ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 305px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0040010 Revision: 1.13  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:315px;">
<script class="expj-script-AD0040010-AD0040010button0">
expj.AD0040010.AD0040010button0 = {};
// script1="onLoad;0;CALL;onDecision@0"
expj.AD0040010.AD0040010button0.onLoad0 = function () {
  console.log('AD0040010button0 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
};
// script2="onDecision;0;CHK;<%=aAD0040010Control.getPrintFlg()%>[eq]1@*0"
expj.AD0040010.AD0040010button0.onDecision0 = function () {
  console.log('AD0040010button0 script2');
if (expj.common.pscript.evaluate('<%=aAD0040010Control.getPrintFlg()%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,PrintShow=,_AD0040010form1/*@AD0040010Servlet:H,H,H"
expj.AD0040010.AD0040010button0.child0 = function () {
  console.log('AD0040010button0 script3');
expj.common.pscript.viewPrinterDialog('AD0040010', 'AD0040010button0', 'PrintShow=,_AD0040010form1/*', 'AD0040010Servlet', 'H,H,H');
};
expj.AD0040010.AD0040010button0.executeAllOnDecision = function () {
  console.log('execute AD0040010button0.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button0['onDecision' + i])) {
        expj.AD0040010.AD0040010button0['onDecision' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button0.executeOnLoad = function () {
  expj.AD0040010.AD0040010button0.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button0.executePScriptOnLoad = function () {
  console.log('execute AD0040010button0.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button0['onLoad' + i])) {
      expj.AD0040010.AD0040010button0['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0040010-AD0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0040010-AD0040010button0-CancelComplete">
expj.AD0040010.AD0040010button0.CancelComplete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/*,_AD0040010form2/*@AD0040010Servlet,,$AD00091"
expj.AD0040010.AD0040010button0.CancelComplete.onClick0 = function () {
  console.log('CancelComplete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button0', '_AD0040010form1/*,_AD0040010form2/*', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.updateBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callConfirm('AD0040010', 'AD0040010button0', 'AD00091', okEvent);
};
expj.AD0040010.AD0040010button0.CancelComplete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button0.CancelComplete['onClick' + i])) {
        expj.AD0040010.AD0040010button0.CancelComplete['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button0.CancelComplete.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button0.CancelComplete.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button0-CancelComplete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button0', 'CancelComplete', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button0.CancelComplete.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button0.CancelComplete.executePScriptOnLoad = function () {
  console.log('execute AD0040010button0/CancelComplete.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button0-CancelComplete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button0-CancelComplete" name="CancelComplete" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCancelComplete",rb)%></button><!-- 完了解除ボタン --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010button0-Clear">
expj.AD0040010.AD0040010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/*,_AD0040010view2/*@AD0040010Servlet,,$ZZ07008"
expj.AD0040010.AD0040010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0040010', 'AD0040010button0', '_AD0040010form1/*,_AD0040010form2/*,_AD0040010view1/*,_AD0040010view2/*', 'AD0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0040010', response);
expj.common.updateBusinessScreenTab('AD0040010', contents);
};
expj.common.pscript.callConfirm('AD0040010', 'AD0040010button0', 'ZZ07008', okEvent);
};
expj.AD0040010.AD0040010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button0.Clear['onClick' + i])) {
        expj.AD0040010.AD0040010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button0.Clear.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0040010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button0-Clear" name="Clear" class="AD0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0040010-AD0040010button0-Close">
expj.AD0040010.AD0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0040010.AD0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0040010');
};
expj.AD0040010.AD0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0040010.AD0040010button0.Close['onClick' + i])) {
        expj.AD0040010.AD0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0040010.AD0040010button0.Close.executeAllOnDecision = function () {
};
expj.AD0040010.AD0040010button0.Close.executeOnLoad = function () {
  $('#expj-AD0040010-AD0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0040010', 'AD0040010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0040010.AD0040010button0.Close.executePScriptOnLoad();
};

expj.AD0040010.AD0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0040010-AD0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0040010-AD0040010button0-Close" name="Close" class="AD0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0040010 (END)-->
<script class="expj-script-AD0040010-AD0040010detail1">
expj.AD0040010.AD0040010detail1 = {};
expj.AD0040010.AD0040010detail1.executeAllOnDecision = function () {
  console.log('execute AD0040010detail1.onDecision');
};
expj.AD0040010.AD0040010detail1.executeOnLoad = function () {
  expj.AD0040010.AD0040010detail1.executePScriptOnLoad();
};

expj.AD0040010.AD0040010detail1.executePScriptOnLoad = function () {
  console.log('execute AD0040010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAD0040010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AD0040010-AD0040010detail1" class="expj-datagird-detail" data-float="AD0040010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AD0040010detail1";
 detailFloat = "AD0040010float1";
 detailWidth = 358;
 detailHeight = 200 + 47;
 String AD0040010detail1_Id = "AD0040010detail1";
 String AD0040010detail1_select = "single";
 String AD0040010detail1_sortable = "true";
 String AD0040010detail1_resize = "true";
 String AD0040010detail1_scroll = "true";
 StringBuffer AD0040010detail1_HB = new StringBuffer();
 StringBuffer AD0040010detail1_DB = new StringBuffer();
%>
<%
 AD0040010detail1_sortable = "false";
 AD0040010detail1_select = "none";
%>
<% AD0040010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AD0040010detail1_sortable).append("}").append(","); %>
<%  AD0040010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AD0040010detail1_sortable).append("}").append(",");
AD0040010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AD0040010detail1_sortable).append("}").append(",");
AD0040010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AD0040010detail1_sortable).append("}").append(",");
 %>
  <% AD0040010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0040010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0040010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-MRP_ODR_TYP_DN\" class=\"expj-label\" data-name=\"MRP_ODR_TYP_DN\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getMRP_ODR_TYP_DN())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0040010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.JOB_ODR_CD",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-JOB_ODR_CD\" class=\"expj-label\" data-name=\"JOB_ODR_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getJOB_ODR_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0040010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.WS_CD",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-WS_CD\" class=\"expj-label\" data-name=\"WS_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getWS_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0040010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.WS_NAME",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-WS_NAME\" class=\"expj-label\" data-name=\"WS_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getWS_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0040010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_7",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-WORK_ODR_DLV_DATE\" class=\"expj-label\" data-name=\"WORK_ODR_DLV_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getWORK_ODR_DLV_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AD0040010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.OPR_INST_START_DATE_7",rb)).append("','").append("<span id=\"expj-AD0040010-AD0040010detail1-OPR_INST_START_DATE\" class=\"expj-label\" data-name=\"OPR_INST_START_DATE\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAD0040010Struct.getOPR_INST_START_DATE())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AD0040010detail1_Id;
 detailViewSelect = AD0040010detail1_select;
 detailViewResize = AD0040010detail1_resize;
 detailViewScroll = AD0040010detail1_scroll;
 detailViewHeaderData = AD0040010detail1_HB;
 detailViewBodyData = AD0040010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAD0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0040010)) {
  expj.common.treeInstanceMap.AD0040010 = {};
}
expj.common.treeInstanceMap.AD0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010)) {
  expj.common.detailDialogMap.AD0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0040010)) {
  expj.common.viewInstanceMap.AD0040010 = {};
}
expj.common.viewInstanceMap.AD0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0040010.<%=viewId %>.init = function () {
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
    expj.AD0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0040010_init">
/**
 * AD0040010用のロード完了時初期化関数
 */
expj.AD0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0040010');
  expj.common.calendarInstanceMap.AD0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0040010.AD0040010form1.IN_OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form1.PeekerOprInstCd.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form1.h_SYS_LOT_CTRL_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form1.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form1.h_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button2.LineInsert.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button2.LineUpdate.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.h_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.h_ITEM_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.h_PROC_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.WORK_IN_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.h_OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.SUM_ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.d1_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.SUM_DEFECT_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.d2_STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button3.UpdateAll.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button3.NoUserParts.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button3.UseParts.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button0.CancelComplete.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form1.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button1.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010view1.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button2.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010form2.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010view2.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button3.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010button0.executeOnLoad();}catch(e){};
  try{expj.AD0040010.AD0040010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0040010', 'AD0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0040010', '<%=request.getContextPath() %>');
};

/**
 * AD0040010の全体onDecision処理
 */
expj.AD0040010.executeAllOnDecision = function () {
  expj.AD0040010.AD0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0040010_console">
expj.AD0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>