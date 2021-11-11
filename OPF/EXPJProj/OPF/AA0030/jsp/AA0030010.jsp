<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:21:08 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0030\AA0030010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AA0030.*" %>
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
<jsp:useBean id="aAA0030010Control" class="com.nec.jp.orteus.metamorBase.AA0030.AA0030010Control" scope="request"/>
<jsp:useBean id="aAA0030010Struct" class="com.nec.jp.orteus.metamorBase.AA0030.AA0030010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

作業系列メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0030/jsp/AA0030010.jsp,v $
$Author: geng-jia $  
$Revision: 1.12 $ $Date: 2017/02/22 02:03:46 $
********************************************************* --%>
<html>
<head>
<title>作業系列メンテナンス</title>
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
<script class="expj-script-AA0030010_init">
  // AA0030010名前空間
  expj.AA0030010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AA0030010" data-screen="AA0030010" data-newdata="<%=aAA0030010Control.isNewData() %>">
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
              <script class="expj-script-AA0030010-AA0030010form1">
expj.AA0030010.AA0030010form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AA0030010.AA0030010form1.onLoad0 = function () {
  console.log('AA0030010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;?AA0030010form1/*[neq]NORMAL@*1"
expj.AA0030010.AA0030010form1.child0 = function () {
  console.log('AA0030010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '?AA0030010form1/*'), '[neq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;1;MASK;_AA0030010button2/Modify,_AA0030010button2/Copy,_AA0030010button2/Erace@*2"
expj.AA0030010.AA0030010form1.child1 = function () {
  console.log('AA0030010form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Modify');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Copy');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Erace');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child2)){this.child2();}}
};
// script4="child;2;CHK;?AA0030010form1/*[neq]NOT_FOUND@*3,*4"
expj.AA0030010.AA0030010form1.child2 = function () {
  console.log('AA0030010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '?AA0030010form1/*'), '[neq]', 'NOT_FOUND')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;3;MASK;_AA0030010button2/Append,_AA0030010button2/EraceAll,_AA0030010button2/Change"
expj.AA0030010.AA0030010form1.child3 = function () {
  console.log('AA0030010form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/EraceAll');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Change');
};
// script6="child;4;MASK;_AA0030010button2/EraceAll,_AA0030010button2/Change"
expj.AA0030010.AA0030010form1.child4 = function () {
  console.log('AA0030010form1 script6');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/EraceAll');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Change');
};
// script7="onLoad;1;CALL;onDecision@0,1"
expj.AA0030010.AA0030010form1.onLoad1 = function () {
  console.log('AA0030010form1 script7');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script8="onDecision;0;CHKRQ;A@*5,*6"
expj.AA0030010.AA0030010form1.onDecision0 = function () {
  console.log('AA0030010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AA0030010', 'A')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_AA0030010button1/Select@*7"
expj.AA0030010.AA0030010form1.child5 = function () {
  console.log('AA0030010form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button1/Select');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child7)){this.child7();}}
};
// script10="child;6;MASK;_AA0030010button1/Select,_AA0030010button2/Append,_AA0030010button2/Modify,_AA0030010button2/Copy,_AA0030010button2/Erace,_AA0030010button2/EraceAll,_AA0030010button2/Change"
expj.AA0030010.AA0030010form1.child6 = function () {
  console.log('AA0030010form1 script10');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button1/Select');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Modify');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Copy');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Erace');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/EraceAll');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Change');
};
// script11="child;7;CHK;?AA0030010form1/*[eq]NORMAL@*8,*11"
expj.AA0030010.AA0030010form1.child7 = function () {
  console.log('AA0030010form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '?AA0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script12="child;8;CHK;_AA0030010form1/ITEM_CD[eq]_AA0030010form1/h_ITEM_CD@*9,*10"
expj.AA0030010.AA0030010form1.child8 = function () {
  console.log('AA0030010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script13="child;9;UNMASK;_AA0030010button2/Append,_AA0030010button2/EraceAll,_AA0030010button2/Change"
expj.AA0030010.AA0030010form1.child9 = function () {
  console.log('AA0030010form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/EraceAll');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Change');
};
// script14="child;10;MASK;_AA0030010button2/Append,_AA0030010button2/EraceAll,_AA0030010button2/Change"
expj.AA0030010.AA0030010form1.child10 = function () {
  console.log('AA0030010form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/EraceAll');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Change');
};
// script15="child;11;CHK;_AA0030010form1/ITEM_CD[eq]_AA0030010form1/h_ITEM_CD@*12,*13"
expj.AA0030010.AA0030010form1.child11 = function () {
  console.log('AA0030010form1 script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
} else {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
}
};
// script16="child;12;UNMASK;_AA0030010button2/Append"
expj.AA0030010.AA0030010form1.child12 = function () {
  console.log('AA0030010form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
};
// script17="child;13;MASK;_AA0030010button2/Append"
expj.AA0030010.AA0030010form1.child13 = function () {
  console.log('AA0030010form1 script17');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
};
// script18="onDecision;1;CHKRQ;?AA0030010view1/?[eq]SINGLE@*14,*21"
expj.AA0030010.AA0030010form1.onDecision1 = function () {
  console.log('AA0030010form1 script18');
if ((expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '?AA0030010view1/?'), '[eq]', 'SINGLE'))) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script19="child;14;CHK;?AA0030010form1/*[eq]NORMAL@*15,*18"
expj.AA0030010.AA0030010form1.child14 = function () {
  console.log('AA0030010form1 script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '?AA0030010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child15)){this.child15();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script20="child;15;CHK;_AA0030010form1/ITEM_CD[eq]_AA0030010form1/h_ITEM_CD@*16,*17"
expj.AA0030010.AA0030010form1.child15 = function () {
  console.log('AA0030010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
}
};
// script21="child;16;UNMASK;_AA0030010button2/Append,_AA0030010button2/Modify,_AA0030010button2/Copy,_AA0030010button2/Erace,_AA0030010button2/EraceAll,_AA0030010button2/Change"
expj.AA0030010.AA0030010form1.child16 = function () {
  console.log('AA0030010form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Modify');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Copy');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Erace');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/EraceAll');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Change');
};
// script22="child;17;MASK;_AA0030010button2/Append,_AA0030010button2/Modify,_AA0030010button2/Copy,_AA0030010button2/Erace,_AA0030010button2/EraceAll,_AA0030010button2/Change"
expj.AA0030010.AA0030010form1.child17 = function () {
  console.log('AA0030010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Append');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Modify');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Copy');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Erace');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/EraceAll');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Change');
};
// script23="child;18;CHK;?AA0030010form1/*[neq]INITIAL@*19"
expj.AA0030010.AA0030010form1.child18 = function () {
  console.log('AA0030010form1 script23');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '?AA0030010form1/*'), '[neq]', 'INITIAL')) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script24="child;19;CHK;_AA0030010form1/ITEM_CD[eq]_AA0030010form1/h_ITEM_CD@*20,*21"
expj.AA0030010.AA0030010form1.child19 = function () {
  console.log('AA0030010form1 script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/ITEM_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/h_ITEM_CD'))) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
}
};
// script25="child;20;UNMASK;_AA0030010button2/Modify,_AA0030010button2/Copy,_AA0030010button2/Erace"
expj.AA0030010.AA0030010form1.child20 = function () {
  console.log('AA0030010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Modify');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Copy');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Erace');
};
// script26="child;21;MASK;_AA0030010button2/Modify,_AA0030010button2/Copy,_AA0030010button2/Erace"
expj.AA0030010.AA0030010form1.child21 = function () {
  console.log('AA0030010form1 script26');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Modify');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Copy');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030010form1', '_AA0030010button2/Erace');
};
expj.AA0030010.AA0030010form1.executeAllOnDecision = function () {
  console.log('execute AA0030010form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010form1['onDecision' + i])) {
        expj.AA0030010.AA0030010form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010form1.executeOnLoad = function () {
  expj.AA0030010.AA0030010form1.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AA0030010.AA0030010form1['onLoad' + i])) {
      expj.AA0030010.AA0030010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0030010-AA0030010form1" action="AA0030010Servlet" name="AA0030010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAA0030010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:76px;align:"></div>
<div class="div-td" style="width:4px;align:"></div>
<div class="div-td" style="width:4px;align:"></div>
<div class="div-td" style="width:4px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010form1-ITEM_CD">
expj.AA0030010.AA0030010form1.ITEM_CD = {};
expj.AA0030010.AA0030010form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/ITEM_CD.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'ITEM_CD', this);
  });
  expj.AA0030010.AA0030010form1.ITEM_CD.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030010form1-ITEM_CD" name="ITEM_CD" class="AA0030010-focus-move  required-value expj-AA0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030010form1-h_ITEM_CD" name="h_ITEM_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.geth_ITEM_CD()) %>">
<script class="expj-script-AA0030010-AA0030010form1-h_ITEM_CD">
expj.AA0030010.AA0030010form1.h_ITEM_CD = {};
expj.AA0030010.AA0030010form1.h_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/h_ITEM_CD.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.h_ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-h_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'h_ITEM_CD', this);
  });
  expj.AA0030010.AA0030010form1.h_ITEM_CD.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.h_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/h_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-h_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AA0030010-AA0030010form1-PeekerItemCd">
expj.AA0030010.AA0030010form1.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AA0030010form1/ITEM_CD@<%=contextNo%>"
expj.AA0030010.AA0030010form1.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0030010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010form1', '_AA0030010form1/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0030010form1/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0030010.AA0030010form1.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010form1.PeekerItemCd['onClick' + i])) {
        expj.AA0030010.AA0030010form1.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010form1.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010form1.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010form1', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010form1.PeekerItemCd.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0030010-AA0030010form1-PeekerItemCd" class="AA0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010form1-ITEM_NAME">
expj.AA0030010.AA0030010form1.ITEM_NAME = {};
expj.AA0030010.AA0030010form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/ITEM_NAME.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'ITEM_NAME', this);
  });
  expj.AA0030010.AA0030010form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030010form1-ITEM_NAME" name="ITEM_NAME" class="AA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030010form1-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AA0030010-AA0030010form1-MRP_ODR_TYP">
expj.AA0030010.AA0030010form1.MRP_ODR_TYP = {};
expj.AA0030010.AA0030010form1.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/MRP_ODR_TYP.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'MRP_ODR_TYP', this);
  });
  expj.AA0030010.AA0030010form1.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AA0030010-AA0030010form1-ITEM_OUTSIDE_TYP" name="ITEM_OUTSIDE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getITEM_OUTSIDE_TYP()) %>">
<script class="expj-script-AA0030010-AA0030010form1-ITEM_OUTSIDE_TYP">
expj.AA0030010.AA0030010form1.ITEM_OUTSIDE_TYP = {};
expj.AA0030010.AA0030010form1.ITEM_OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/ITEM_OUTSIDE_TYP.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.ITEM_OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-ITEM_OUTSIDE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'ITEM_OUTSIDE_TYP', this);
  });
  expj.AA0030010.AA0030010form1.ITEM_OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.ITEM_OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/ITEM_OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-ITEM_OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030010form1-OPR_RSLT_TYP" name="OPR_RSLT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getOPR_RSLT_TYP()) %>">
<script class="expj-script-AA0030010-AA0030010form1-OPR_RSLT_TYP">
expj.AA0030010.AA0030010form1.OPR_RSLT_TYP = {};
expj.AA0030010.AA0030010form1.OPR_RSLT_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/OPR_RSLT_TYP.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.OPR_RSLT_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-OPR_RSLT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'OPR_RSLT_TYP', this);
  });
  expj.AA0030010.AA0030010form1.OPR_RSLT_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.OPR_RSLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/OPR_RSLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-OPR_RSLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:76px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030010form1-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AA0030010-AA0030010form1-UNIT_QTY_TYP">
expj.AA0030010.AA0030010form1.UNIT_QTY_TYP = {};
expj.AA0030010.AA0030010form1.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/UNIT_QTY_TYP.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'UNIT_QTY_TYP', this);
  });
  expj.AA0030010.AA0030010form1.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:4px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030010form1-STOCK_UNIT" name="STOCK_UNIT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getSTOCK_UNIT()) %>">
<script class="expj-script-AA0030010-AA0030010form1-STOCK_UNIT">
expj.AA0030010.AA0030010form1.STOCK_UNIT = {};
expj.AA0030010.AA0030010form1.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/STOCK_UNIT.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'STOCK_UNIT', this);
  });
  expj.AA0030010.AA0030010form1.STOCK_UNIT.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:4px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030010form1-MANHOUR_TYP" name="MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getMANHOUR_TYP()) %>">
<script class="expj-script-AA0030010-AA0030010form1-MANHOUR_TYP">
expj.AA0030010.AA0030010form1.MANHOUR_TYP = {};
expj.AA0030010.AA0030010form1.MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030010form1/MANHOUR_TYP.onDecision');
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030010form1.MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010form1-MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030010form1', 'MANHOUR_TYP', this);
  });
  expj.AA0030010.AA0030010form1.MANHOUR_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030010form1.MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030010form1/MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010form1-MANHOUR_TYP');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0030010-AA0030010button1">
expj.AA0030010.AA0030010button1 = {};
expj.AA0030010.AA0030010button1.executeAllOnDecision = function () {
  console.log('execute AA0030010button1.onDecision');
};
expj.AA0030010.AA0030010button1.executeOnLoad = function () {
  expj.AA0030010.AA0030010button1.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button1.executePScriptOnLoad = function () {
  console.log('execute AA0030010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0030010-AA0030010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0030010-AA0030010button1-Detail">
expj.AA0030010.AA0030010button1.Detail = {};
// script1="onClick;0;FSHOW;AA0030010float1"
expj.AA0030010.AA0030010button1.Detail.onClick0 = function () {
  console.log('Detail script1');
expj.common.pscript.showDetailWindow('AA0030010', 'AA0030010float1', '');
};
expj.AA0030010.AA0030010button1.Detail.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button1.Detail['onClick' + i])) {
        expj.AA0030010.AA0030010button1.Detail['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button1.Detail.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button1.Detail.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button1-Detail').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button1', 'Detail', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button1.Detail.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button1.Detail.executePScriptOnLoad = function () {
  console.log('execute AA0030010button1/Detail.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button1-Detail');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button1-Detail" name="Detail" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDetail",rb)%></button><!-- 詳細ボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010button1-Select">
expj.AA0030010.AA0030010button1.Select = {};
// script1="onClick;0;SET;_AA0030010form1/h_ITEM_CD=_AA0030010form1/ITEM_CD"
expj.AA0030010.AA0030010button1.Select.onClick0 = function () {
  console.log('Select script1');
expj.common.pscript.setReferenceComponentValue('AA0030010', 'AA0030010button1', '_AA0030010form1/h_ITEM_CD', expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030010button1', '_AA0030010form1/ITEM_CD'));
};
// script2="onClick;1;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0030010form1/*@AA0030010Servlet"
expj.AA0030010.AA0030010button1.Select.onClick1 = function () {
  console.log('Select script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button1', '_AA0030010form1/*', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.updateBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0030010.AA0030010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button1.Select['onClick' + i])) {
        expj.AA0030010.AA0030010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button1.Select.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button1.Select.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button1', 'Select', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button1.Select.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AA0030010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button1-Select" name="Select" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0030010-AA0030010view1">
expj.AA0030010.AA0030010view1 = {};
expj.AA0030010.AA0030010view1.executeAllOnClick = function () {
};
expj.AA0030010.AA0030010view1.executeAllOnDecision = function () {
  console.log('execute AA0030010view1.onDecision');
};
expj.AA0030010.AA0030010view1.executeOnLoad = function () {
<%
    viewSelectEvent.put("AA0030010view1", "expj.AA0030010.AA0030010view1.executeAllOnClick");
%>
  expj.AA0030010.AA0030010view1.executePScriptOnLoad();
};

expj.AA0030010.AA0030010view1.executePScriptOnLoad = function () {
  console.log('execute AA0030010view1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<%
{
%>
<!-- VIEW -->
<div id="expj-AA0030010-AA0030010view1" class="expj-datagrid-view expj-view-single" style="width:100%;height:100%;" data-orftype="DataGrid" data-mode="VIEW" data-status=""></div>
<!-- VIEW END -->
<%
 String AA0030010view1_Id = "AA0030010view1";
 String AA0030010view1_select = "single";
 String AA0030010view1_sortable = "true";
 String AA0030010view1_resize = "true";
 String AA0030010view1_scroll = "true";
 StringBuffer AA0030010view1_HB = new StringBuffer();
 StringBuffer AA0030010view1_DB = new StringBuffer();
%>
<%
 AA0030010view1_select = "single";
 AA0030010view1_sortable = "true";
 AA0030010view1_resize = "true";
 AA0030010view1_scroll = "true";
%>
<%
 AA0030010view1_HB.append("{'visible':false, 'width':'0px', 'title':'', 'name':'col0', 'class':'expj-view-cell-hidden', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
%>
     
<%
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_CD",rb))).append("', 'name':'PROC_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'150px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NAME",rb))).append("', 'name':'PROC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROC_NO",rb))).append("', 'name':'PROC_NO', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.OUTSIDE_TYP_1",rb))).append("', 'name':'OUTSIDE_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.WS_CD",rb))).append("', 'name':'WS_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.VEND_CD",rb))).append("', 'name':'VEND_CD', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb))).append("', 'name':'ACPT_INSPC_NAME', 'class':'expj-tooltip expj-view-cell-label', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.FIXED_LT_1",rb))).append("', 'name':'FIXED_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROP_LT_1",rb))).append("', 'name':'PROP_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.PROP_LOT_SIZE_1",rb))).append("', 'name':'PROP_LOT_SIZE', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SAFETY_LT_1",rb))).append("', 'name':'SAFETY_LT', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.SPOIL",rb))).append("', 'name':'SPOIL', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'numeric', 'width':'100px', 'title':'").append(TypeConverter.sanitizer(CoreTools.getRBString("Expj.STANDARD_COST",rb))).append("', 'name':'STANDARD_COST', 'class':'expj-tooltip expj-view-cell-label expj-align-right expj-align-right', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'OUTSIDE_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'ACPT_INSPC_TYP', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'MODIFY_COUNT', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'WS_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
AA0030010view1_HB.append("{'visible':true, 'type':'string', 'width':'0px', 'title':'', 'name':'VEND_NAME', 'class':'expj-tooltip expj-view-cell-hidden', 'sortable':").append(AA0030010view1_sortable).append("}").append(",");
%>
<%
 int aAA0030010StructLength = aAA0030010Control.getListsize();
 final AA0030010Struct structBackup = aAA0030010Struct;
 aAA0030010Struct = null;
 int loopCount2=0;
 for(int loopCount = 0; loopCount < aAA0030010StructLength; ++loopCount) {
  if((aAA0030010Struct = (AA0030010Struct) aAA0030010Control.getListvalue(loopCount)) == null) {
   continue;
  }
  pageContext.setAttribute("aAA0030010Struct", aAA0030010Struct);
  String rowStyleClass = (loopCount % 2 == 0) ? "" : ""; 
%>
<%
 AA0030010view1_DB.append("[");
 AA0030010view1_DB.append(loopCount);
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-PROC_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-PROC_CD\" data-name=\"PROC_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getPROC_CD())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-PROC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-PROC_NAME\" data-name=\"PROC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getPROC_NAME())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-PROC_NO-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-PROC_NO\" data-name=\"PROC_NO\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getPROC_NO())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-OUTSIDE_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-OUTSIDE_NAME\" data-name=\"OUTSIDE_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getOUTSIDE_NAME())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-WS_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-WS_CD\" data-name=\"WS_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getWS_CD())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-VEND_CD-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-VEND_CD\" data-name=\"VEND_CD\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getVEND_CD())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-ACPT_INSPC_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-ACPT_INSPC_NAME\" data-name=\"ACPT_INSPC_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getACPT_INSPC_NAME())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-FIXED_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-FIXED_LT\" data-name=\"FIXED_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getFIXED_LT())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-PROP_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-PROP_LT\" data-name=\"PROP_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getPROP_LT())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-PROP_LOT_SIZE-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-PROP_LOT_SIZE\" data-name=\"PROP_LOT_SIZE\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0030010Struct.getPROP_LOT_SIZE())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-SAFETY_LT-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-SAFETY_LT\" data-name=\"SAFETY_LT\" data-view=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getSAFETY_LT())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-SPOIL-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-SPOIL\" data-name=\"SPOIL\" data-view=\"true\" data-kind=\"OBT_NUMBER;5.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0030010Struct.getSPOIL())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-STANDARD_COST-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-STANDARD_COST\" data-name=\"STANDARD_COST\" data-view=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0030010Struct.getSTANDARD_COST())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-OUTSIDE_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-OUTSIDE_TYP\" data-name=\"OUTSIDE_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getOUTSIDE_TYP())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-ACPT_INSPC_TYP-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-ACPT_INSPC_TYP\" data-name=\"ACPT_INSPC_TYP\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getACPT_INSPC_TYP())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-MODIFY_COUNT-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-MODIFY_COUNT\" data-name=\"MODIFY_COUNT\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getMODIFY_COUNT())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-WS_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-WS_NAME\" data-name=\"WS_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getWS_NAME())).append("</span>'");
 AA0030010view1_DB.append(",").append("'<span id=\"expj-AA0030010-AA0030010view1-VEND_NAME-").append(loopCount).append("\" class=\"expj-label expj-AA0030010-AA0030010view1-VEND_NAME\" data-name=\"VEND_NAME\" data-view=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getVEND_NAME())).append("</span>'");
 AA0030010view1_DB.append("]");
%>
<%
if (loopCount + 1 < aAA0030010StructLength) {
   AA0030010view1_DB.append(",");
  }
 }
 aAA0030010Struct = structBackup;
 viewIdList.add(AA0030010view1_Id);
 viewSelectList.add(AA0030010view1_select);
 viewResizeList.add(AA0030010view1_resize);
 viewScrollList.add(AA0030010view1_scroll);
 viewHeaderDataList.add(AA0030010view1_HB);
 viewBodyDataList.add(AA0030010view1_DB);
%>
<%
}
%>
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field view-next-button" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame15 button-area" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:630px;"><script class="expj-script-AA0030010-AA0030010button2">
expj.AA0030010.AA0030010button2 = {};
expj.AA0030010.AA0030010button2.executeAllOnDecision = function () {
  console.log('execute AA0030010button2.onDecision');
};
expj.AA0030010.AA0030010button2.executeOnLoad = function () {
  expj.AA0030010.AA0030010button2.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button2.executePScriptOnLoad = function () {
  console.log('execute AA0030010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0030010-AA0030010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:630px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0030010-AA0030010button2-Append">
expj.AA0030010.AA0030010button2.Append = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0030010form1/*@AA0030010Servlet"
expj.AA0030010.AA0030010button2.Append.onClick0 = function () {
  console.log('Append script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button2', '_AA0030010form1/*', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.changeBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0030010.AA0030010button2.Append.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button2.Append['onClick' + i])) {
        expj.AA0030010.AA0030010button2.Append['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button2.Append.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button2.Append.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button2-Append').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button2', 'Append', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button2.Append.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button2.Append.executePScriptOnLoad = function () {
  console.log('execute AA0030010button2/Append.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button2-Append');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button2-Append" name="Append" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineInsert",rb)%></button><!-- 行追加ボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010button2-Modify">
expj.AA0030010.AA0030010button2.Modify = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0030010form1/*,_AA0030010view1/+@AA0030010Servlet"
expj.AA0030010.AA0030010button2.Modify.onClick0 = function () {
  console.log('Modify script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button2', '_AA0030010form1/*,_AA0030010view1/+', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.changeBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0030010.AA0030010button2.Modify.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button2.Modify['onClick' + i])) {
        expj.AA0030010.AA0030010button2.Modify['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button2.Modify.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button2.Modify.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button2-Modify').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button2', 'Modify', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button2.Modify.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button2.Modify.executePScriptOnLoad = function () {
  console.log('execute AA0030010button2/Modify.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button2-Modify');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button2-Modify" name="Modify" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineUpdate",rb)%></button><!-- 行修正ボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010button2-Copy">
expj.AA0030010.AA0030010button2.Copy = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0030010form1/*,_AA0030010view1/+@AA0030010Servlet"
expj.AA0030010.AA0030010button2.Copy.onClick0 = function () {
  console.log('Copy script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button2', '_AA0030010form1/*,_AA0030010view1/+', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.changeBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AA0030010.AA0030010button2.Copy.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button2.Copy['onClick' + i])) {
        expj.AA0030010.AA0030010button2.Copy['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button2.Copy.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button2.Copy.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button2-Copy').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button2', 'Copy', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button2.Copy.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button2.Copy.executePScriptOnLoad = function () {
  console.log('execute AA0030010button2/Copy.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button2-Copy');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button2-Copy" name="Copy" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineCopy",rb)%></button><!-- 行複写ボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010button2-Erace">
expj.AA0030010.AA0030010button2.Erace = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0030010form1/*,_AA0030010view1/+@AA0030010Servlet,,$ZZ07004"
expj.AA0030010.AA0030010button2.Erace.onClick0 = function () {
  console.log('Erace script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button2', '_AA0030010form1/*,_AA0030010view1/+', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.updateBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callConfirm('AA0030010', 'AA0030010button2', 'ZZ07004', okEvent);
};
expj.AA0030010.AA0030010button2.Erace.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button2.Erace['onClick' + i])) {
        expj.AA0030010.AA0030010button2.Erace['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button2.Erace.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button2.Erace.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button2-Erace').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button2', 'Erace', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button2.Erace.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button2.Erace.executePScriptOnLoad = function () {
  console.log('execute AA0030010button2/Erace.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button2-Erace');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button2-Erace" name="Erace" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnLineDelete",rb)%></button><!-- 行削除ボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010button2-EraceAll">
expj.AA0030010.AA0030010button2.EraceAll = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0030010form1/*,_AA0030010view1/*@AA0030010Servlet,,$ZZ07014"
expj.AA0030010.AA0030010button2.EraceAll.onClick0 = function () {
  console.log('EraceAll script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button2', '_AA0030010form1/*,_AA0030010view1/*', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.updateBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callConfirm('AA0030010', 'AA0030010button2', 'ZZ07014', okEvent);
};
expj.AA0030010.AA0030010button2.EraceAll.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button2.EraceAll['onClick' + i])) {
        expj.AA0030010.AA0030010button2.EraceAll['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button2.EraceAll.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button2.EraceAll.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button2-EraceAll').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button2', 'EraceAll', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button2.EraceAll.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button2.EraceAll.executePScriptOnLoad = function () {
  console.log('execute AA0030010button2/EraceAll.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button2-EraceAll');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button2-EraceAll" name="EraceAll" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDeleteAll",rb)%></button><!-- 全削除ボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010button2-Change">
expj.AA0030010.AA0030010button2.Change = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AA0030010form1/*,_AA0030010view1/*@AA0030010Servlet,,$ZZ07009"
expj.AA0030010.AA0030010button2.Change.onClick0 = function () {
  console.log('Change script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button2', '_AA0030010form1/*,_AA0030010view1/*', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.updateBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callConfirm('AA0030010', 'AA0030010button2', 'ZZ07009', okEvent);
};
expj.AA0030010.AA0030010button2.Change.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button2.Change['onClick' + i])) {
        expj.AA0030010.AA0030010button2.Change['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button2.Change.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button2.Change.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button2-Change').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button2', 'Change', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button2.Change.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button2.Change.executePScriptOnLoad = function () {
  console.log('execute AA0030010button2/Change.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button2-Change');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button2-Change" name="Change" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnChangeNumber",rb)%></button><!-- 番号再振ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame16 button-area-right" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 714px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame17" style="width:12px;"></div><!--/td-->
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
<span class="version">AA0030010 Revision: 1.8  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AA0030010-AA0030010button0">
expj.AA0030010.AA0030010button0 = {};
expj.AA0030010.AA0030010button0.executeAllOnDecision = function () {
  console.log('execute AA0030010button0.onDecision');
};
expj.AA0030010.AA0030010button0.executeOnLoad = function () {
  expj.AA0030010.AA0030010button0.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button0.executePScriptOnLoad = function () {
  console.log('execute AA0030010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0030010-AA0030010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0030010-AA0030010button0-Clear">
expj.AA0030010.AA0030010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AA0030010Servlet,,$ZZ07008"
expj.AA0030010.AA0030010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030010button0', '', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.updateBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callConfirm('AA0030010', 'AA0030010button0', 'ZZ07008', okEvent);
};
expj.AA0030010.AA0030010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button0.Clear['onClick' + i])) {
        expj.AA0030010.AA0030010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button0.Clear.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button0.Clear.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button0', 'Clear', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button0.Clear.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AA0030010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button0-Clear" name="Clear" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030010button0-Close">
expj.AA0030010.AA0030010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AA0030010.AA0030010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AA0030010');
};
expj.AA0030010.AA0030010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030010button0.Close['onClick' + i])) {
        expj.AA0030010.AA0030010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030010button0.Close.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030010button0.Close.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030010button0', 'Close', this, 'Button');
    }
  });
  expj.AA0030010.AA0030010button0.Close.executePScriptOnLoad();
};

expj.AA0030010.AA0030010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AA0030010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030010button0-Close" name="Close" class="AA0030010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0030010 (END)-->
<script class="expj-script-AA0030010-AA0030010detail1">
expj.AA0030010.AA0030010detail1 = {};
expj.AA0030010.AA0030010detail1.executeAllOnDecision = function () {
  console.log('execute AA0030010detail1.onDecision');
};
expj.AA0030010.AA0030010detail1.executeOnLoad = function () {
  expj.AA0030010.AA0030010detail1.executePScriptOnLoad();
};

expj.AA0030010.AA0030010detail1.executePScriptOnLoad = function () {
  console.log('execute AA0030010detail1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
 <%
if(aAA0030010Control.isNewData() == true) {
%>
<!--Detail -->
<div id="expj-AA0030010-AA0030010detail1" class="expj-datagird-detail" data-float="AA0030010float1" data-orftype="DataGrid" data-mode="DETAIL" title="Detail Window"></div>
<!--Detail (END) -->
<%
 detailId = "AA0030010detail1";
 detailFloat = "AA0030010float1";
 detailWidth = 358;
 detailHeight = 220 + 47;
 String AA0030010detail1_Id = "AA0030010detail1";
 String AA0030010detail1_select = "single";
 String AA0030010detail1_sortable = "true";
 String AA0030010detail1_resize = "true";
 String AA0030010detail1_scroll = "true";
 StringBuffer AA0030010detail1_HB = new StringBuffer();
 StringBuffer AA0030010detail1_DB = new StringBuffer();
%>
<%
 AA0030010detail1_sortable = "false";
 AA0030010detail1_select = "none";
%>
<% AA0030010detail1_HB.append("{'bVisible':false, 'sWidth':'0px', 'sTitle':'', 'sName':'col0', 'sClass':'expj-detail-head', 'bSortable':").append(AA0030010detail1_sortable).append("}").append(","); %>
<%  AA0030010detail1_HB.append("{'visible':true,'width':'100px','title':'','name':'col1','class':'expj-detail-cell expj-align-right','sortable':").append(AA0030010detail1_sortable).append("}").append(",");
AA0030010detail1_HB.append("{'visible':true,'width':'200px','title':'','name':'col2','class':'expj-detail-cell expj-align-left','sortable':").append(AA0030010detail1_sortable).append("}").append(",");
AA0030010detail1_HB.append("{'visible':true,'width':'30px','title':'','name':'col3','class':'expj-detail-cell expj-align-left','sortable':").append(AA0030010detail1_sortable).append("}").append(",");
 %>
  <% AA0030010detail1_DB.append("['1','").append(CoreTools.getRBString("Expj.DRAW_CD",rb)).append("','").append("<span id=\"expj-AA0030010-AA0030010detail1-DRAW_CD\" class=\"expj-label\" data-name=\"DRAW_CD\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getDRAW_CD())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['2','").append(CoreTools.getRBString("Expj.ITEM_SPEC",rb)).append("','").append("<span id=\"expj-AA0030010-AA0030010detail1-SPEC\" class=\"expj-label\" data-name=\"SPEC\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getSPEC())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['3','").append(CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)).append("','").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_MRP_ODR_NAME\" class=\"expj-label\" data-name=\"ITEM_MRP_ODR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_MRP_ODR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['4','").append(CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)).append("','").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_OUTSIDE_NAME\" class=\"expj-label\" data-name=\"ITEM_OUTSIDE_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_OUTSIDE_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['5','").append(CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)).append("','").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_OPR_RSLT_NAME\" class=\"expj-label\" data-name=\"ITEM_OPR_RSLT_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_OPR_RSLT_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['6','").append(CoreTools.getRBString("Expj.FIXED_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_FIXED_LT\" class=\"expj-label\" data-name=\"ITEM_FIXED_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_FIXED_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['7','").append(CoreTools.getRBString("Expj.PROP_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_PROP_LT\" class=\"expj-label\" data-name=\"ITEM_PROP_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_PROP_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['8','").append(CoreTools.getRBString("Expj.PROP_LOT_SIZE",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_PROP_LOT_SIZE\" class=\"expj-label\" data-name=\"ITEM_PROP_LOT_SIZE\" data-detailItem=\"true\" data-kind=\"OBT_NUMBER;14.1;FLOOR;4\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_PROP_LOT_SIZE())).append("</span>").append("</div>','").append("<span id=\"expj-AA0030010-AA0030010detail1-STOCK_UNIT_1\" class=\"expj-label\" data-name=\"STOCK_UNIT_1\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getSTOCK_UNIT())).append("</span>").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['9','").append(CoreTools.getRBString("Expj.ISSUE_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_ISSUE_LT\" class=\"expj-label\" data-name=\"ITEM_ISSUE_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_ISSUE_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['10','").append(CoreTools.getRBString("Expj.SAFETY_LT",rb)).append("','<div class=\"expj-align-right\">").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_SAFETY_LT\" class=\"expj-label\" data-name=\"ITEM_SAFETY_LT\" data-detailItem=\"true\" data-kind=\"OBT_INTEGER;6\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_SAFETY_LT())).append("</span>").append("</div>','").append("").append("']").append(",");%>
 <% AA0030010detail1_DB.append("['11','").append(CoreTools.getRBString("Expj.MANHOUR_TYP",rb)).append("','").append("<span id=\"expj-AA0030010-AA0030010detail1-ITEM_MANHOUR_NAME\" class=\"expj-label\" data-name=\"ITEM_MANHOUR_NAME\" data-detailItem=\"true\">").append(TypeConverter.sanitizer(aAA0030010Struct.getITEM_MANHOUR_NAME())).append("</span>").append("','").append("").append("']").append(",");%>
<%
 detailViewId = AA0030010detail1_Id;
 detailViewSelect = AA0030010detail1_select;
 detailViewResize = AA0030010detail1_resize;
 detailViewScroll = AA0030010detail1_scroll;
 detailViewHeaderData = AA0030010detail1_HB;
 detailViewBodyData = AA0030010detail1_DB;
%>
<%
}
%>
<%
MessageStruct msgStruct = aAA0030010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AA0030010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AA0030010)) {
  expj.common.treeInstanceMap.AA0030010 = {};
}
expj.common.treeInstanceMap.AA0030010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0030010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AA0030010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AA0030010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AA0030010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AA0030010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AA0030010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AA0030010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AA0030010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AA0030010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AA0030010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0030010)) {
  expj.common.detailDialogMap.AA0030010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0030010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AA0030010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0030010.<%=detailId %>)) {
  expj.common.detailDialogMap.AA0030010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0030010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AA0030010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AA0030010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AA0030010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AA0030010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AA0030010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AA0030010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AA0030010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AA0030010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AA0030010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AA0030010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AA0030010)) {
  expj.common.viewInstanceMap.AA0030010 = {};
}
expj.common.viewInstanceMap.AA0030010.<%=viewId %> = {};
expj.common.viewInstanceMap.AA0030010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AA0030010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AA0030010.<%=viewId %>.init = function () {
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
    expj.AA0030010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AA0030010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AA0030010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AA0030010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AA0030010_init">
/**
 * AA0030010用のロード完了時初期化関数
 */
expj.AA0030010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AA0030010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AA0030010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AA0030010');
  expj.common.calendarInstanceMap.AA0030010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AA0030010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.init();
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AA0030010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AA0030010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AA0030010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AA0030010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AA0030010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AA0030010-<%=detailId %>');
<%
 }
%>
  try{expj.AA0030010.AA0030010form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.h_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.ITEM_OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.OPR_RSLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button1.Detail.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button2.Append.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button2.Modify.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button2.Copy.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button2.Erace.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button2.EraceAll.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button2.Change.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010form1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010view1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button2.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010button0.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030010detail1.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AA0030010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AA0030010', 'AA0030010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AA0030010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AA0030010-focus-move');
  // 初期フォーカス当てる処理
  $('.AA0030010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AA0030010', '<%=request.getContextPath() %>');
};

/**
 * AA0030010の全体onDecision処理
 */
expj.AA0030010.executeAllOnDecision = function () {
  expj.AA0030010.AA0030010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AA0030010_console">
expj.AA0030010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>