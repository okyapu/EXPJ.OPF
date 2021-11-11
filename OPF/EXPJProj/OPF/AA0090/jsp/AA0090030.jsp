<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:22:53 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0090\AA0090030.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0090.*" %>
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
<jsp:useBean id="aAA0090030Control" class="com.nec.jp.orteus.metamorBase.AA0090.AA0090030Control" scope="request"/>
<jsp:useBean id="aAA0090030Struct" class="com.nec.jp.orteus.metamorBase.AA0090.AA0090030Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

利用者メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0090/jsp/AA0090030.jsp,v $
$Author: geng-jia $
$Revision: 1.19 $ $Date: 2017/02/22 02:03:56 $
********************************************************* --%>
<html>
<head>
<title>利用者メンテナンス</title>
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
<script class="expj-script-AA0090030_init">
  // AA0090030名前空間
  expj.AA0090030 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0090030" data-screen="AA0090030" data-newdata="<%=aAA0090030Control.isNewData() %>">
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
              <script class="expj-script-AA0090030-AA0090030form1">
expj.AA0090030.AA0090030form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0090030.AA0090030form1.onLoad0 = function () {
  console.log('AA0090030form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AA0090030form1/*[eq]NORMAL@*1,*2"
expj.AA0090030.AA0090030form1.child0 = function () {
  console.log('AA0090030form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '?AA0090030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_AA0090030button2/insert"
expj.AA0090030.AA0090030form1.child1 = function () {
  console.log('AA0090030form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/insert');
};
// script4="child;2;MASK;_AA0090030button2/update,_AA0090030button2/delete"
expj.AA0090030.AA0090030form1.child2 = function () {
  console.log('AA0090030form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/delete');
};
// script5="onLoad;1;CALL;onDecision@0,1,2,3,4,5"
expj.AA0090030.AA0090030form1.onLoad1 = function () {
  console.log('AA0090030form1 script5');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script6="onDecision;0;CHKRQ;A@*3,*4"
expj.AA0090030.AA0090030form1.onDecision0 = function () {
  console.log('AA0090030form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AA0090030', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script7="child;3;UNMASK;_AA0090030button1/select@*5"
expj.AA0090030.AA0090030form1.child3 = function () {
  console.log('AA0090030form1 script7');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script8="child;4;MASK;_AA0090030button1/select@*6"
expj.AA0090030.AA0090030form1.child4 = function () {
  console.log('AA0090030form1 script8');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button1/select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script9="child;5;CHKRQ;B@*7,*6"
expj.AA0090030.AA0090030form1.child5 = function () {
  console.log('AA0090030form1 script9');
if (expj.common.pscript.satisfiedRequiredComponent('AA0090030', 'B')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;6;MASK;_AA0090030button2/insert,_AA0090030button2/update"
expj.AA0090030.AA0090030form1.child6 = function () {
  console.log('AA0090030form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/update');
};
// script11="child;7;CHK;?AA0090030form1/*[eq]INITIAL@*17,*9"
expj.AA0090030.AA0090030form1.child7 = function () {
  console.log('AA0090030form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '?AA0090030form1/*'), '[eq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;8;UNMASK;_AA0090030button2/insert"
expj.AA0090030.AA0090030form1.child8 = function () {
  console.log('AA0090030form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/insert');
};
// script13="child;9;CHK;_AA0090030form1/USER_CD[eq]_AA0090030form1/h_USER_CD@*10,*12"
expj.AA0090030.AA0090030form1.child9 = function () {
  console.log('AA0090030form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/USER_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/h_USER_CD'))) {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script14="child;10;MASK;_AA0090030button2/insert@*11"
expj.AA0090030.AA0090030form1.child10 = function () {
  console.log('AA0090030form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script15="child;11;UNMASK;_AA0090030button2/update"
expj.AA0090030.AA0090030form1.child11 = function () {
  console.log('AA0090030form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/update');
};
// script16="child;12;MASK;_AA0090030button2/update@*13"
expj.AA0090030.AA0090030form1.child12 = function () {
  console.log('AA0090030form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/update');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script17="child;13;UNMASK;_AA0090030button2/insert"
expj.AA0090030.AA0090030form1.child13 = function () {
  console.log('AA0090030form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/insert');
};
// script18="onDecision;1;CHK;?AA0090030form1/*[eq]NORMAL@*14,*16"
expj.AA0090030.AA0090030form1.onDecision1 = function () {
  console.log('AA0090030form1 script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '?AA0090030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script19="child;14;CHK;_AA0090030form1/USER_CD[eq]_AA0090030form1/h_USER_CD@*15,*16"
expj.AA0090030.AA0090030form1.child14 = function () {
  console.log('AA0090030form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/USER_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/h_USER_CD'))) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script20="child;15;UNMASK;_AA0090030button2/delete"
expj.AA0090030.AA0090030form1.child15 = function () {
  console.log('AA0090030form1 script20');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/delete');
};
// script21="child;16;MASK;_AA0090030button2/delete"
expj.AA0090030.AA0090030form1.child16 = function () {
  console.log('AA0090030form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/delete');
};
// script22="child;17;CHKRQ;A,B,C@*8,*6"
expj.AA0090030.AA0090030form1.child17 = function () {
  console.log('AA0090030form1 script22');
if (expj.common.pscript.satisfiedRequiredComponent('AA0090030', 'A') && expj.common.pscript.satisfiedRequiredComponent('AA0090030', 'B') && expj.common.pscript.satisfiedRequiredComponent('AA0090030', 'C')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script23="onDecision;2;CHK;?AA0090030form1/*[eq]NORMAL@*18,*21"
expj.AA0090030.AA0090030form1.onDecision2 = function () {
  console.log('AA0090030form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '?AA0090030form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script24="child;18;CHK;_AA0090030form1/USER_CD[eq]_AA0090030form1/h_USER_CD@*19,*21"
expj.AA0090030.AA0090030form1.child18 = function () {
  console.log('AA0090030form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/USER_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/h_USER_CD'))) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script25="child;19;MASK;_AA0090030form2/PASSWORD@*20"
expj.AA0090030.AA0090030form1.child19 = function () {
  console.log('AA0090030form1 script25');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/PASSWORD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child20)){this.child20();}}
};
// script26="child;20;UNMASK;_AA0090030form2/NEW_PASSWORD"
expj.AA0090030.AA0090030form1.child20 = function () {
  console.log('AA0090030form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/NEW_PASSWORD');
};
// script27="child;21;UNMASK;_AA0090030form2/PASSWORD@*22"
expj.AA0090030.AA0090030form1.child21 = function () {
  console.log('AA0090030form1 script27');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/PASSWORD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child22)){this.child22();}}
};
// script28="child;22;MASK;_AA0090030form2/NEW_PASSWORD@*17"
expj.AA0090030.AA0090030form1.child22 = function () {
  console.log('AA0090030form1 script28');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/NEW_PASSWORD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script29="onDecision;3;CHK;_AA0090030form1/h_SCREENMOVE_TYP[neq]@*23"
expj.AA0090030.AA0090030form1.onDecision3 = function () {
  console.log('AA0090030form1 script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/h_SCREENMOVE_TYP'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script30="child;23;MASK;_AA0090030button1/select,_AA0090030button2/insert,_AA0090030button2/update,_AA0090030button2/delete,_AA0090030button0/clear"
expj.AA0090030.AA0090030form1.child23 = function () {
  console.log('AA0090030form1 script30');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button1/select');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/insert');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/delete');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button0/clear');
};
// script31="onDecision;4;CHK;_AA0090030form1/h_APR_USER_MST[eq]0@*24,*25"
expj.AA0090030.AA0090030form1.onDecision4 = function () {
  console.log('AA0090030form1 script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/h_APR_USER_MST'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child24)){this.child24();}
} else {
if(expj.common.checkNameSpace(this.child25)){this.child25();}
}
};
// script32="child;24;MASK;_AA0090030form2/APPR_REMARKS"
expj.AA0090030.AA0090030form1.child24 = function () {
  console.log('AA0090030form1 script32');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/APPR_REMARKS');
};
// script33="child;25;UNMASK;_AA0090030form2/APPR_REMARKS"
expj.AA0090030.AA0090030form1.child25 = function () {
  console.log('AA0090030form1 script33');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/APPR_REMARKS');
};
// script34="onDecision;5;CHK;_AA0090030form1/h_INSERT_ERROR_FLG[eq]1@*26"
expj.AA0090030.AA0090030form1.onDecision5 = function () {
  console.log('AA0090030form1 script34');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/h_INSERT_ERROR_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child26)){this.child26();}
}
};
// script35="child;26;UNMASK;_AA0090030button2/insert@*27"
expj.AA0090030.AA0090030form1.child26 = function () {
  console.log('AA0090030form1 script35');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/insert');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child27)){this.child27();}}
};
// script36="child;27;MASK;_AA0090030button2/update,_AA0090030button2/delete@*17"
expj.AA0090030.AA0090030form1.child27 = function () {
  console.log('AA0090030form1 script36');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/update');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030button2/delete');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
expj.AA0090030.AA0090030form1.executeAllOnDecision = function () {
  console.log('execute AA0090030form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030form1['onDecision' + i])) {
        expj.AA0090030.AA0090030form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030form1.executeOnLoad = function () {
  expj.AA0090030.AA0090030form1.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0090030.AA0090030form1['onLoad' + i])) {
      expj.AA0090030.AA0090030form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0090030-AA0090030form1" action="AA0090030Servlet" name="AA0090030form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0090030Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.USER_CD",rb)%></span><!-- ユーザ番号 --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form1-USER_CD">
expj.AA0090030.AA0090030form1.USER_CD = {};
// script1="onDecision;0;SET;_AA0090030form2/PASSWORD=,_AA0090030form2/NEW_PASSWORD=,_AA0090030form1/h_USER_CD=@*0"
expj.AA0090030.AA0090030form1.USER_CD.onDecision0 = function () {
  console.log('USER_CD script1');
expj.common.pscript.setReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form2/PASSWORD', '');
expj.common.pscript.setReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form2/NEW_PASSWORD', '');
expj.common.pscript.setReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/h_USER_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child0)){this.child0();}}
};
// script2="child;0;UNMASK;_AA0090030form2/PASSWORD@*1"
expj.AA0090030.AA0090030form1.USER_CD.child0 = function () {
  console.log('USER_CD script2');
expj.common.pscript.setUnMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/PASSWORD');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;MASK;_AA0090030form2/NEW_PASSWORD"
expj.AA0090030.AA0090030form1.USER_CD.child1 = function () {
  console.log('USER_CD script3');
expj.common.pscript.setMaskToReferenceComponent('AA0090030', 'AA0090030form1', '_AA0090030form2/NEW_PASSWORD');
};
expj.AA0090030.AA0090030form1.USER_CD.executeAllOnDecision = function () {
  console.log('execute AA0090030form1/USER_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030form1.USER_CD['onDecision' + i])) {
        expj.AA0090030.AA0090030form1.USER_CD['onDecision' + i]();
      }
    }
  }
  expj.AA0090030.AA0090030form1.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form1.USER_CD.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form1-USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form1', 'USER_CD', this);
  });
  expj.AA0090030.AA0090030form1.USER_CD.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.USER_CD.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1/USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form1-USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form1-USER_CD" name="USER_CD" class="AA0090030-focus-move  required-value expj-AA0090030-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getUSER_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0090030-AA0090030form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090030Struct.geth_APPR_ID()) %>">
<script class="expj-script-AA0090030-AA0090030form1-h_APPR_ID">
expj.AA0090030.AA0090030form1.h_APPR_ID = {};
expj.AA0090030.AA0090030form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute AA0090030form1/h_APPR_ID.onDecision');
  expj.AA0090030.AA0090030form1.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form1', 'h_APPR_ID', this);
  });
  expj.AA0090030.AA0090030form1.h_APPR_ID.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form1-h_APPR_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0090030-AA0090030form1-PeekerUserCd">
expj.AA0090030.AA0090030form1.PeekerUserCd = {};
// script1="onClick;0;PEEKER;_AA0090030form1/USER_CD@<%=contextNo%>"
expj.AA0090030.AA0090030form1.PeekerUserCd.onClick0 = function () {
  console.log('PeekerUserCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0090030';
var parameterValues = 'PeekerUserCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form1', '_AA0090030form1/USER_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%USER_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0090030form1/USER_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0090030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0090030.AA0090030form1.PeekerUserCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030form1.PeekerUserCd['onClick' + i])) {
        expj.AA0090030.AA0090030form1.PeekerUserCd['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030form1.PeekerUserCd.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030form1.PeekerUserCd.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form1-PeekerUserCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030form1', 'PeekerUserCd', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030form1.PeekerUserCd.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.PeekerUserCd.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1/PeekerUserCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form1-PeekerUserCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0090030-AA0090030form1-PeekerUserCd" class="AA0090030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AA0090030-AA0090030form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090030Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-AA0090030-AA0090030form1-h_SCREENMOVE_TYP">
expj.AA0090030.AA0090030form1.h_SCREENMOVE_TYP = {};
expj.AA0090030.AA0090030form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0090030form1/h_SCREENMOVE_TYP.onDecision');
  expj.AA0090030.AA0090030form1.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.AA0090030.AA0090030form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0090030-AA0090030form1-h_USER_CD" name="h_USER_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090030Control.getStruct().getUSER_CD()) %>">
<script class="expj-script-AA0090030-AA0090030form1-h_USER_CD">
expj.AA0090030.AA0090030form1.h_USER_CD = {};
expj.AA0090030.AA0090030form1.h_USER_CD.executeAllOnDecision = function () {
  console.log('execute AA0090030form1/h_USER_CD.onDecision');
  expj.AA0090030.AA0090030form1.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form1.h_USER_CD.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form1-h_USER_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form1', 'h_USER_CD', this);
  });
  expj.AA0090030.AA0090030form1.h_USER_CD.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.h_USER_CD.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1/h_USER_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form1-h_USER_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0090030-AA0090030form1-h_INSERT_ERROR_FLG" name="h_INSERT_ERROR_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090030Struct.geth_INSERT_ERROR_FLG()) %>">
<script class="expj-script-AA0090030-AA0090030form1-h_INSERT_ERROR_FLG">
expj.AA0090030.AA0090030form1.h_INSERT_ERROR_FLG = {};
expj.AA0090030.AA0090030form1.h_INSERT_ERROR_FLG.executeAllOnDecision = function () {
  console.log('execute AA0090030form1/h_INSERT_ERROR_FLG.onDecision');
  expj.AA0090030.AA0090030form1.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form1.h_INSERT_ERROR_FLG.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form1-h_INSERT_ERROR_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form1', 'h_INSERT_ERROR_FLG', this);
  });
  expj.AA0090030.AA0090030form1.h_INSERT_ERROR_FLG.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.h_INSERT_ERROR_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1/h_INSERT_ERROR_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form1-h_INSERT_ERROR_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0090030-AA0090030form1-h_APR_USER_MST" name="h_APR_USER_MST" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090030Struct.geth_APR_USER_MST()) %>">
<script class="expj-script-AA0090030-AA0090030form1-h_APR_USER_MST">
expj.AA0090030.AA0090030form1.h_APR_USER_MST = {};
expj.AA0090030.AA0090030form1.h_APR_USER_MST.executeAllOnDecision = function () {
  console.log('execute AA0090030form1/h_APR_USER_MST.onDecision');
  expj.AA0090030.AA0090030form1.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form1.h_APR_USER_MST.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form1-h_APR_USER_MST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form1', 'h_APR_USER_MST', this);
  });
  expj.AA0090030.AA0090030form1.h_APR_USER_MST.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form1.h_APR_USER_MST.executePScriptOnLoad = function () {
  console.log('execute AA0090030form1/h_APR_USER_MST.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form1-h_APR_USER_MST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AA0090030-AA0090030button1">
expj.AA0090030.AA0090030button1 = {};
expj.AA0090030.AA0090030button1.executeAllOnDecision = function () {
  console.log('execute AA0090030button1.onDecision');
};
expj.AA0090030.AA0090030button1.executeOnLoad = function () {
  expj.AA0090030.AA0090030button1.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button1.executePScriptOnLoad = function () {
  console.log('execute AA0090030button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0090030-AA0090030button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0090030-AA0090030button1-select">
expj.AA0090030.AA0090030button1.select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0090030form1/*@AA0090030Servlet"
expj.AA0090030.AA0090030button1.select.onClick0 = function () {
  console.log('select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090030', 'AA0090030button1', '_AA0090030form1/*', 'AA0090030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090030', response);
expj.common.updateBusinessScreenTab('AA0090030', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0090030.AA0090030button1.select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030button1.select['onClick' + i])) {
        expj.AA0090030.AA0090030button1.select['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030button1.select.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030button1.select.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030button1-select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030button1', 'select', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030button1.select.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button1.select.executePScriptOnLoad = function () {
  console.log('execute AA0090030button1/select.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030button1-select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090030-AA0090030button1-select" name="select" class="AA0090030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><script class="expj-script-AA0090030-AA0090030form2">
expj.AA0090030.AA0090030form2 = {};
expj.AA0090030.AA0090030form2.executeAllOnDecision = function () {
  console.log('execute AA0090030form2.onDecision');
};
expj.AA0090030.AA0090030form2.executeOnLoad = function () {
  expj.AA0090030.AA0090030form2.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0090030-AA0090030form2" action="AA0090030Servlet" name="AA0090030form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:165px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:165px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.USER_NAME",rb)%></span><!-- ユーザ名称 --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-USER_NAME">
expj.AA0090030.AA0090030form2.USER_NAME = {};
expj.AA0090030.AA0090030form2.USER_NAME.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/USER_NAME.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.USER_NAME.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-USER_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'USER_NAME', this);
  });
  expj.AA0090030.AA0090030form2.USER_NAME.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.USER_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/USER_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-USER_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form2-USER_NAME" name="USER_NAME" class="AA0090030-focus-move  required-value expj-AA0090030-required-B" style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getUSER_NAME()) %>" maxlength="40" ></div><!--/td-->
<input type="hidden" id="expj-AA0090030-AA0090030form2-PASSWORD_CHG_DATE" name="PASSWORD_CHG_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getPASSWORD_CHG_DATE()) %>">
<script class="expj-script-AA0090030-AA0090030form2-PASSWORD_CHG_DATE">
expj.AA0090030.AA0090030form2.PASSWORD_CHG_DATE = {};
expj.AA0090030.AA0090030form2.PASSWORD_CHG_DATE.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/PASSWORD_CHG_DATE.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.PASSWORD_CHG_DATE.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-PASSWORD_CHG_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'PASSWORD_CHG_DATE', this);
  });
  expj.AA0090030.AA0090030form2.PASSWORD_CHG_DATE.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.PASSWORD_CHG_DATE.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/PASSWORD_CHG_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-PASSWORD_CHG_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-PLANT_CD">
expj.AA0090030.AA0090030form2.PLANT_CD = {};
expj.AA0090030.AA0090030form2.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/PLANT_CD.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.PLANT_CD.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'PLANT_CD', this);
  });
  expj.AA0090030.AA0090030form2.PLANT_CD.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form2-PLANT_CD" name="PLANT_CD" class="AA0090030-focus-move  required-value expj-AA0090030-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getPLANT_CD()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-PeekerPlantCd">
expj.AA0090030.AA0090030form2.PeekerPlantCd = {};
// script1="onClick;0;PEEKER;_AA0090030form2/PLANT_CD@<%=contextNo%>"
expj.AA0090030.AA0090030form2.PeekerPlantCd.onClick0 = function () {
  console.log('PeekerPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0090030';
var parameterValues = 'PeekerPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form2', '_AA0090030form2/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0090030form2/PLANT_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0090030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0090030.AA0090030form2.PeekerPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030form2.PeekerPlantCd['onClick' + i])) {
        expj.AA0090030.AA0090030form2.PeekerPlantCd['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030form2.PeekerPlantCd.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030form2.PeekerPlantCd.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-PeekerPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030form2', 'PeekerPlantCd', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030form2.PeekerPlantCd.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.PeekerPlantCd.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/PeekerPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-PeekerPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0090030-AA0090030form2-PeekerPlantCd" class="AA0090030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-PLANT_NAME">
expj.AA0090030.AA0090030form2.PLANT_NAME = {};
expj.AA0090030.AA0090030form2.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/PLANT_NAME.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.PLANT_NAME.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'PLANT_NAME', this);
  });
  expj.AA0090030.AA0090030form2.PLANT_NAME.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form2-PLANT_NAME" name="PLANT_NAME" class="AA0090030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ORG_CD",rb)%></span><!-- 部門コード --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-SECTION_CD">
expj.AA0090030.AA0090030form2.SECTION_CD = {};
expj.AA0090030.AA0090030form2.SECTION_CD.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/SECTION_CD.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.SECTION_CD.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-SECTION_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'SECTION_CD', this);
  });
  expj.AA0090030.AA0090030form2.SECTION_CD.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.SECTION_CD.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/SECTION_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-SECTION_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form2-SECTION_CD" name="SECTION_CD" class="AA0090030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getSECTION_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-PeekerOrgCd">
expj.AA0090030.AA0090030form2.PeekerOrgCd = {};
// script1="onClick;0;PEEKER;_AA0090030form2/SECTION_CD@<%=contextNo%>"
expj.AA0090030.AA0090030form2.PeekerOrgCd.onClick0 = function () {
  console.log('PeekerOrgCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0090030';
var parameterValues = 'PeekerOrgCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0090030', 'AA0090030form2', '_AA0090030form2/SECTION_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ORG_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0090030form2/SECTION_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0090030%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0090030.AA0090030form2.PeekerOrgCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030form2.PeekerOrgCd['onClick' + i])) {
        expj.AA0090030.AA0090030form2.PeekerOrgCd['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030form2.PeekerOrgCd.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030form2.PeekerOrgCd.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-PeekerOrgCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030form2', 'PeekerOrgCd', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030form2.PeekerOrgCd.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.PeekerOrgCd.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/PeekerOrgCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-PeekerOrgCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0090030-AA0090030form2-PeekerOrgCd" class="AA0090030-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-ORG_NAME">
expj.AA0090030.AA0090030form2.ORG_NAME = {};
expj.AA0090030.AA0090030form2.ORG_NAME.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/ORG_NAME.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.ORG_NAME.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-ORG_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'ORG_NAME', this);
  });
  expj.AA0090030.AA0090030form2.ORG_NAME.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.ORG_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/ORG_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-ORG_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form2-ORG_NAME" name="ORG_NAME" class="AA0090030-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getORG_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PASSWORD",rb)%></span><!-- パスワード --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-PASSWORD">
expj.AA0090030.AA0090030form2.PASSWORD = {};
expj.AA0090030.AA0090030form2.PASSWORD.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/PASSWORD.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.PASSWORD.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-PASSWORD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'PASSWORD', this);
  });
  expj.AA0090030.AA0090030form2.PASSWORD.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.PASSWORD.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/PASSWORD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-PASSWORD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="password" id="expj-AA0090030-AA0090030form2-PASSWORD" name="PASSWORD" class="AA0090030-focus-move  required-value expj-AA0090030-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getPASSWORD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0090030-AA0090030form2-h_PASSWORD" name="h_PASSWORD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0090030Struct.geth_PASSWORD()) %>">
<script class="expj-script-AA0090030-AA0090030form2-h_PASSWORD">
expj.AA0090030.AA0090030form2.h_PASSWORD = {};
expj.AA0090030.AA0090030form2.h_PASSWORD.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/h_PASSWORD.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.h_PASSWORD.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-h_PASSWORD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'h_PASSWORD', this);
  });
  expj.AA0090030.AA0090030form2.h_PASSWORD.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.h_PASSWORD.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/h_PASSWORD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-h_PASSWORD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.NEW_PASSWORD",rb)%></span><!-- 新パスワード --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-NEW_PASSWORD">
expj.AA0090030.AA0090030form2.NEW_PASSWORD = {};
expj.AA0090030.AA0090030form2.NEW_PASSWORD.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/NEW_PASSWORD.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.NEW_PASSWORD.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-NEW_PASSWORD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'NEW_PASSWORD', this);
  });
  expj.AA0090030.AA0090030form2.NEW_PASSWORD.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.NEW_PASSWORD.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/NEW_PASSWORD.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-NEW_PASSWORD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="password" id="expj-AA0090030-AA0090030form2-NEW_PASSWORD" name="NEW_PASSWORD" class="AA0090030-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getNEW_PASSWORD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3161",rb)%></span><!-- 承認権限 --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-APPR_POWER_TYP">
expj.AA0090030.AA0090030form2.APPR_POWER_TYP = {};
expj.AA0090030.AA0090030form2.APPR_POWER_TYP.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/APPR_POWER_TYP.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.APPR_POWER_TYP.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-APPR_POWER_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0090030', 'AA0090030form2', 'APPR_POWER_TYP', this);
  });
  expj.AA0090030.AA0090030form2.APPR_POWER_TYP.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.APPR_POWER_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/APPR_POWER_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-APPR_POWER_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0090030-AA0090030form2-APPR_POWER_TYP" name='APPR_POWER_TYP' class='AA0090030-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0090030Control.getStruct().getList_APPR_POWER_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0090030Control.getStruct().getList_APPR_POWER_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0090030Control.getStruct().getList_APPR_POWER_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0090030Struct.getAPPR_POWER_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EMAIL",rb)%></span><!-- メールアドレス --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-ADDRESS">
expj.AA0090030.AA0090030form2.ADDRESS = {};
expj.AA0090030.AA0090030form2.ADDRESS.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/ADDRESS.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.ADDRESS.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-ADDRESS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'ADDRESS', this);
  });
  expj.AA0090030.AA0090030form2.ADDRESS.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.ADDRESS.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/ADDRESS.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-ADDRESS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form2-ADDRESS" name="ADDRESS" class="AA0090030-focus-move  " style="width:320px;" data-kind="OBT_MAIL;" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getADDRESS()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td over-inner" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.LOCALE",rb)%></span></div><script class="expj-script-AA0090030-AA0090030form2-LOCALE">
expj.AA0090030.AA0090030form2.LOCALE = {};
expj.AA0090030.AA0090030form2.LOCALE.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/LOCALE.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.LOCALE.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-LOCALE').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0090030', 'AA0090030form2', 'LOCALE', this);
  });
  expj.AA0090030.AA0090030form2.LOCALE.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.LOCALE.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/LOCALE.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-LOCALE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:172px;text-align:left;"><select id="expj-AA0090030-AA0090030form2-LOCALE" name='LOCALE' class='AA0090030-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0090030Control.getStruct().getList_LOCALE_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0090030Control.getStruct().getList_LOCALE_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0090030Control.getStruct().getList_LOCALE_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0090030Struct.getLOCALE()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030form2-APPR_REMARKS">
expj.AA0090030.AA0090030form2.APPR_REMARKS = {};
expj.AA0090030.AA0090030form2.APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute AA0090030form2/APPR_REMARKS.onDecision');
  expj.AA0090030.AA0090030form2.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030form2.APPR_REMARKS.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030form2-APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0090030', 'AA0090030form2', 'APPR_REMARKS', this);
  });
  expj.AA0090030.AA0090030form2.APPR_REMARKS.executePScriptOnLoad();
};

expj.AA0090030.AA0090030form2.APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute AA0090030form2/APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030form2-APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AA0090030-AA0090030form2-APPR_REMARKS" name="APPR_REMARKS" class="AA0090030-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0090030Struct.getAPPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:12px;">
<div class="datagrid-button-field-cell frame02" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame02" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame02 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0090030-AA0090030view1">
expj.AA0090030.AA0090030view1 = {};
expj.AA0090030.AA0090030view1.executeAllOnClick = function () {
};
expj.AA0090030.AA0090030view1.executeAllOnDecision = function () {
  console.log('execute AA0090030view1.onDecision');
};
expj.AA0090030.AA0090030view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0090030view1", "expj.AA0090030.AA0090030view1.executeAllOnClick");
%>
  expj.AA0090030.AA0090030view1.executePScriptOnLoad();
};

expj.AA0090030.AA0090030view1.executePScriptOnLoad = function () {
  console.log('execute AA0090030view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0090030-AA0090030view1" class="expj-datagrid-view expj-view-noselect" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0090030view1_Id = "AA0090030view1";
 String AA0090030view1_select = "single";
 String AA0090030view1_sortable = "true";
 String AA0090030view1_resize = "true";
 String AA0090030view1_scroll = "true";
 StringBuffer AA0090030view1_HB = new StringBuffer();
 StringBuffer AA0090030view1_DB = new StringBuffer();
%>
<%
 AA0090030view1_select = "none";
 AA0090030view1_sortable = "true";
 AA0090030view1_resize = "true";
 AA0090030view1_scroll = "true";
%>
<%
 AA0090030view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0090030view1_sortable).append("}").append(",");
%>
    <script class="expj-script-AA0090030-AA0090030view1-BUSINESS_GROUP_VALID_FLG">
expj.AA0090030.AA0090030view1.BUSINESS_GROUP_VALID_FLG = {};
expj.AA0090030.AA0090030view1.BUSINESS_GROUP_VALID_FLG.executeAllOnClick = function () {
};
expj.AA0090030.AA0090030view1.BUSINESS_GROUP_VALID_FLG.executeAllOnDecision = function () {
  console.log('execute AA0090030view1/BUSINESS_GROUP_VALID_FLG.onDecision');
  expj.AA0090030.AA0090030view1.executeAllOnDecision();
  expj.AA0090030.executeAllOnDecision();
};
expj.AA0090030.AA0090030view1.BUSINESS_GROUP_VALID_FLG.executeOnLoad = function () {
  $('.expj-AA0090030-AA0090030view1-BUSINESS_GROUP_VALID_FLG').click(function () {
    var component = this;
    if (!component.hasAttribute('disabled')) {
      setTimeout(function () {
        expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030view1', 'BUSINESS_GROUP_VALID_FLG', component, 'CheckBox');
      }, 0);
    }
  });
  expj.AA0090030.AA0090030view1.BUSINESS_GROUP_VALID_FLG.executePScriptOnLoad();
};

expj.AA0090030.AA0090030view1.BUSINESS_GROUP_VALID_FLG.executePScriptOnLoad = function () {
  console.log('execute AA0090030view1/BUSINESS_GROUP_VALID_FLG.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>

 
<%
AA0090030view1_HB.append("{'visible':true, 'type':'string', 'width':'40px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0015",rb))).append("', 'name':'BUSINESS_GROUP_VALID_FLG', 'class':'expj-tooltip expj-view-cell-checkbox', 'sortable':").append(AA0090030view1_sortable).append("}").append(",");
AA0090030view1_HB.append("{'visible':true, 'type':'string', 'width':'200px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.Cmt0039",rb))).append("', 'name':'BUSINESS_GROUP_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0090030view1_sortable).append("}").append(",");
AA0090030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'BUSINESS_GROUP_CD', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0090030view1_sortable).append("}").append(",");
AA0090030view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0090030view1_sortable).append("}").append(",");
%>
<%
 int aAA0090030StructLength = aAA0090030Control.getListsize();
 final AA0090030Struct structBackup = aAA0090030Struct;
 aAA0090030Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0090030StructLength; ++loopCount) {
  if((aAA0090030Struct = (AA0090030Struct) aAA0090030Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0090030Struct", aAA0090030Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0090030view1_DB.append("[");
 AA0090030view1_DB.append(loopCount);
 AA0090030view1_DB.append(",").append("'<input type=\"checkbox\" id=\"expj-AA0090030-AA0090030view1-BUSINESS_GROUP_VALID_FLG-").append(loopCount).append("\" class=\"expj-AA0090030-AA0090030view1-BUSINESS_GROUP_VALID_FLG AA0090030-focus-move\" data-name=\"BUSINESS_GROUP_VALID_FLG\" data-view=\"true\"").append("true".equals(TypeConverter.convert(aAA0090030Struct.getBUSINESS_GROUP_VALID_FLG())) ? " checked=\"checked\"" : "").append("").append(">'");
 AA0090030view1_DB.append(",").append("'<span id=\"expj-AA0090030-AA0090030view1-BUSINESS_GROUP_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0090030-AA0090030view1-BUSINESS_GROUP_NAME\" data-name=\"BUSINESS_GROUP_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0090030Struct.getBUSINESS_GROUP_NAME())).append("</span>'");
 AA0090030view1_DB.append(",").append("'<span id=\"expj-AA0090030-AA0090030view1-BUSINESS_GROUP_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0090030-AA0090030view1-BUSINESS_GROUP_CD\" data-name=\"BUSINESS_GROUP_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0090030Struct.getBUSINESS_GROUP_CD())).append("</span>'");
 AA0090030view1_DB.append(",''");
 AA0090030view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0090030StructLength) {
   AA0090030view1_DB.append(",");
  }
 }
 aAA0090030Struct = structBackup;
 viewIdList.add(AA0090030view1_Id);
 viewSelectList.add(AA0090030view1_select);
 viewResizeList.add(AA0090030view1_resize);
 viewScrollList.add(AA0090030view1_scroll);
 viewHeaderDataList.add(AA0090030view1_HB);
 viewBodyDataList.add(AA0090030view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08 button-area" style="width:559px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10" style="width:calc(100% - 643px);"><script class="expj-script-AA0090030-AA0090030button2">
expj.AA0090030.AA0090030button2 = {};
expj.AA0090030.AA0090030button2.executeAllOnDecision = function () {
  console.log('execute AA0090030button2.onDecision');
};
expj.AA0090030.AA0090030button2.executeOnLoad = function () {
  expj.AA0090030.AA0090030button2.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button2.executePScriptOnLoad = function () {
  console.log('execute AA0090030button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0090030-AA0090030button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0090030-AA0090030button2-insert">
expj.AA0090030.AA0090030button2.insert = {};
// script1="onClick;0;COLCHK;AA0090030view1:_BUSINESS_GROUP_VALID_FLG[eq]NULL@$AA90007"
expj.AA0090030.AA0090030button2.insert.onClick0 = function () {
  console.log('insert script1');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AA0090030', 'AA0090030view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.BUSINESS_GROUP_VALID_FLG, '[eq]', 'NULL'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
expj.common.pscript.addWarningMessage('AA0090030', 'AA0090030button2', 'AA90007');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0090030form1/*,_AA0090030form2/*,_AA0090030view1/*@AA0090030Servlet,,$ZZ07001"
expj.AA0090030.AA0090030button2.insert.onClick1 = function () {
  console.log('insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090030', 'AA0090030button2', '_AA0090030form1/*,_AA0090030form2/*,_AA0090030view1/*', 'AA0090030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090030', response);
expj.common.updateBusinessScreenTab('AA0090030', contents);
};
expj.common.pscript.callConfirm('AA0090030', 'AA0090030button2', 'ZZ07001', okEvent);
};
expj.AA0090030.AA0090030button2.insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030button2.insert['onClick' + i])) {
        expj.AA0090030.AA0090030button2.insert['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030button2.insert.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030button2.insert.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030button2-insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030button2', 'insert', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030button2.insert.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button2.insert.executePScriptOnLoad = function () {
  console.log('execute AA0090030button2/insert.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030button2-insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090030-AA0090030button2-insert" name="insert" class="AA0090030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030button2-update">
expj.AA0090030.AA0090030button2.update = {};
// script1="onClick;0;COLCHK;AA0090030view1:_BUSINESS_GROUP_VALID_FLG[eq]NULL@$AA90007"
expj.AA0090030.AA0090030button2.update.onClick0 = function () {
  console.log('update script1');
var selectCells = expj.common.pscript.getPreviewVIEWCells('AA0090030', 'AA0090030view1');
var checkFlg = true;
for (var i = 0; i < selectCells.length; i++) {
var cell = selectCells[i].rowData;
if (!(expj.common.pscript.evaluate(cell.BUSINESS_GROUP_VALID_FLG, '[eq]', 'NULL'))) {
checkFlg = false;
break;
}
}
if (checkFlg) {
expj.common.pscript.addWarningMessage('AA0090030', 'AA0090030button2', 'AA90007');
}
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0090030form1/*,_AA0090030form2/*,_AA0090030view1/*@AA0090030Servlet,,$ZZ07003"
expj.AA0090030.AA0090030button2.update.onClick1 = function () {
  console.log('update script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090030', 'AA0090030button2', '_AA0090030form1/*,_AA0090030form2/*,_AA0090030view1/*', 'AA0090030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090030', response);
expj.common.updateBusinessScreenTab('AA0090030', contents);
};
expj.common.pscript.callConfirm('AA0090030', 'AA0090030button2', 'ZZ07003', okEvent);
};
expj.AA0090030.AA0090030button2.update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030button2.update['onClick' + i])) {
        expj.AA0090030.AA0090030button2.update['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030button2.update.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030button2.update.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030button2-update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030button2', 'update', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030button2.update.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button2.update.executePScriptOnLoad = function () {
  console.log('execute AA0090030button2/update.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030button2-update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090030-AA0090030button2-update" name="update" class="AA0090030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030button2-delete">
expj.AA0090030.AA0090030button2.delete = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0090030form1/*,_AA0090030form2/*,_AA0090030view1/*@AA0090030Servlet,,$ZZ07004"
expj.AA0090030.AA0090030button2.delete.onClick0 = function () {
  console.log('delete script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090030', 'AA0090030button2', '_AA0090030form1/*,_AA0090030form2/*,_AA0090030view1/*', 'AA0090030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090030', response);
expj.common.updateBusinessScreenTab('AA0090030', contents);
};
expj.common.pscript.callConfirm('AA0090030', 'AA0090030button2', 'ZZ07004', okEvent);
};
expj.AA0090030.AA0090030button2.delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030button2.delete['onClick' + i])) {
        expj.AA0090030.AA0090030button2.delete['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030button2.delete.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030button2.delete.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030button2-delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030button2', 'delete', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030button2.delete.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button2.delete.executePScriptOnLoad = function () {
  console.log('execute AA0090030button2/delete.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030button2-delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090030-AA0090030button2-delete" name="delete" class="AA0090030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:5px;"></div><!--/td-->
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
<span class="version">AA0090030 Revision: 1.11  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0090030-AA0090030button0">
expj.AA0090030.AA0090030button0 = {};
expj.AA0090030.AA0090030button0.executeAllOnDecision = function () {
  console.log('execute AA0090030button0.onDecision');
};
expj.AA0090030.AA0090030button0.executeOnLoad = function () {
  expj.AA0090030.AA0090030button0.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button0.executePScriptOnLoad = function () {
  console.log('execute AA0090030button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0090030-AA0090030button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0090030-AA0090030button0-clear">
expj.AA0090030.AA0090030button0.clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0090030Servlet,,$ZZ07008"
expj.AA0090030.AA0090030button0.clear.onClick0 = function () {
  console.log('clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0090030', 'AA0090030button0', '', 'AA0090030Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0090030Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0090030', response);
expj.common.updateBusinessScreenTab('AA0090030', contents);
};
expj.common.pscript.callConfirm('AA0090030', 'AA0090030button0', 'ZZ07008', okEvent);
};
expj.AA0090030.AA0090030button0.clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030button0.clear['onClick' + i])) {
        expj.AA0090030.AA0090030button0.clear['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030button0.clear.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030button0.clear.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030button0-clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030button0', 'clear', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030button0.clear.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button0.clear.executePScriptOnLoad = function () {
  console.log('execute AA0090030button0/clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030button0-clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090030-AA0090030button0-clear" name="clear" class="AA0090030-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0090030-AA0090030button0-close">
expj.AA0090030.AA0090030button0.close = {};
// script1="onClick;0;CLOSE"
expj.AA0090030.AA0090030button0.close.onClick0 = function () {
  console.log('close script1');
expj.common.executeBusinessScreenCloseDialog('AA0090030');
};
expj.AA0090030.AA0090030button0.close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0090030.AA0090030button0.close['onClick' + i])) {
        expj.AA0090030.AA0090030button0.close['onClick' + i]();
      }
    }
  }
};
expj.AA0090030.AA0090030button0.close.executeAllOnDecision = function () {
};
expj.AA0090030.AA0090030button0.close.executeOnLoad = function () {
  $('#expj-AA0090030-AA0090030button0-close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0090030', 'AA0090030button0', 'close', this, 'Button');
    }
  });
  expj.AA0090030.AA0090030button0.close.executePScriptOnLoad();
};

expj.AA0090030.AA0090030button0.close.executePScriptOnLoad = function () {
  console.log('execute AA0090030button0/close.onLoad');
  var targetComponent = document.getElementById('expj-AA0090030-AA0090030button0-close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0090030-AA0090030button0-close" name="close" class="AA0090030-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0090030 (END)-->
<%
MessageStruct msgStruct = aAA0090030Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0090030-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0090030)) {
  expj.common.treeInstanceMap.AA0090030 = {};
}
expj.common.treeInstanceMap.AA0090030.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0090030.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0090030.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0090030.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0090030.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0090030.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0090030.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0090030.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0090030.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0090030-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0090030-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090030)) {
  expj.common.detailDialogMap.AA0090030 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090030._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0090030._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090030.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0090030.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090030.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0090030.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0090030.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0090030.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0090030-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0090030-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0090030-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0090030.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0090030.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0090030._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0090030-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0090030)) {
  expj.common.viewInstanceMap.AA0090030 = {};
}
expj.common.viewInstanceMap.AA0090030.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0090030.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0090030.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0090030.<%=viewId %>.init = function () {
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
    expj.AA0090030.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0090030.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0090030-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0090030-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0090030_init">
/**
 * AA0090030用のロード完了時初期化関数
 */
expj.AA0090030.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0090030');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0090030');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0090030');
  expj.common.calendarInstanceMap.AA0090030 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0090030.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0090030.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0090030.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0090030');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0090030');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0090030-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0090030-<%=detailId %>');
<%
 }
%>
  try{expj.AA0090030.AA0090030form1.USER_CD.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form1.PeekerUserCd.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form1.h_USER_CD.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form1.h_INSERT_ERROR_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form1.h_APR_USER_MST.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button1.select.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.USER_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.PASSWORD_CHG_DATE.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.PeekerPlantCd.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.SECTION_CD.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.PeekerOrgCd.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.ORG_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.PASSWORD.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.h_PASSWORD.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.NEW_PASSWORD.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.APPR_POWER_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.ADDRESS.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.LOCALE.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030view1.BUSINESS_GROUP_VALID_FLG.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button2.insert.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button2.update.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button2.delete.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button0.clear.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button0.close.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form1.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button1.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030form2.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030view1.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button2.executeOnLoad();}catch(e){};
  try{expj.AA0090030.AA0090030button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0090030.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0090030', 'AA0090030');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0090030');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0090030-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0090030-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0090030', '<%=request.getContextPath() %>');
};

/**
 * AA0090030の全体onDecision処理
 */
expj.AA0090030.executeAllOnDecision = function () {
  expj.AA0090030.AA0090030form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0090030_console">
expj.AA0090030.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>