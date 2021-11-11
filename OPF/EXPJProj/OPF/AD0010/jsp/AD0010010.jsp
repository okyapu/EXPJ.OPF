<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:01:14 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AD0010\AD0010010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0010.*" %>
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
<jsp:useBean id="aAD0010010Control" class="com.nec.jp.orteus.metamorBase.AD0010.AD0010010Control" scope="request"/>
<jsp:useBean id="aAD0010010Struct" class="com.nec.jp.orteus.metamorBase.AD0010.AD0010010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目別作業計画メンテナンス
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0010/jsp/AD0010010.jsp,v $
$Author: geng-jia $	
$Revision: 1.24 $ $Date: 2017/02/22 02:04:38 $
********************************************************* --%>
<html>
<head>
<title>品目別作業計画メンテナンス</title>
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
<script class="expj-script-AD0010010_init">
  // AD0010010名前空間
  expj.AD0010010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AD0010010" data-screen="AD0010010" data-newdata="<%=aAD0010010Control.isNewData() %>">
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
              <script class="expj-script-AD0010010-AD0010010form1">
expj.AD0010010.AD0010010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6"
expj.AD0010010.AD0010010form1.onLoad0 = function () {
  console.log('AD0010010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
};
// script2="onDecision;0;CHKRQ;A@*0,*1"
expj.AD0010010.AD0010010form1.onDecision0 = function () {
  console.log('AD0010010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AD0010010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;UNMASK;_AD0010010button1/Select"
expj.AD0010010.AD0010010form1.child0 = function () {
  console.log('AD0010010form1 script3');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button1/Select');
};
// script4="child;1;MASK;_AD0010010button1/Select"
expj.AD0010010.AD0010010form1.child1 = function () {
  console.log('AD0010010form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button1/Select');
};
// script5="onDecision;1;CHKRQ;B,C@*2,*3"
expj.AD0010010.AD0010010form1.onDecision1 = function () {
  console.log('AD0010010form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AD0010010', 'B') && expj.common.pscript.satisfiedRequiredComponent('AD0010010', 'C')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;UNMASK;_AD0010010button2/Insert"
expj.AD0010010.AD0010010form1.child2 = function () {
  console.log('AD0010010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button2/Insert');
};
// script7="child;3;MASK;_AD0010010button2/Insert"
expj.AD0010010.AD0010010form1.child3 = function () {
  console.log('AD0010010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button2/Insert');
};
// script8="onDecision;2;CHKRQ;A,B,C@*4,*6"
expj.AD0010010.AD0010010form1.onDecision2 = function () {
  console.log('AD0010010form1 script8');
if (expj.common.pscript.satisfiedRequiredComponent('AD0010010', 'A') && expj.common.pscript.satisfiedRequiredComponent('AD0010010', 'B') && expj.common.pscript.satisfiedRequiredComponent('AD0010010', 'C')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;4;CHK;_WORK_ODR_CD[eq]_h_WORK_ODR_CD[and]?AD0010010form1/*[eq]NORMAL@*5,*6"
expj.AD0010010.AD0010010form1.child4 = function () {
  console.log('AD0010010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '_WORK_ODR_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '_h_WORK_ODR_CD')) && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '?AD0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script10="child;5;UNMASK;_AD0010010button2/Update,_AD0010010button2/Delete"
expj.AD0010010.AD0010010form1.child5 = function () {
  console.log('AD0010010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button2/Update');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button2/Delete');
};
// script11="child;6;MASK;_AD0010010button2/Update,_AD0010010button2/Delete"
expj.AD0010010.AD0010010form1.child6 = function () {
  console.log('AD0010010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button2/Update');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button2/Delete');
};
// script12="onDecision;3;CHK;?AD0010010form1/*[eq]NORMAL@*7,*9"
expj.AD0010010.AD0010010form1.onDecision3 = function () {
  console.log('AD0010010form1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '?AD0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script13="child;7;CHK;<%= TypeConverter.sanitizer(aAD0010010Control.getButton()) %>[eq]Select[or]<%= TypeConverter.sanitizer(aAD0010010Control.getButton()) %>[eq]Insert[or]<%= TypeConverter.sanitizer(aAD0010010Control.getButton()) %>[eq]Update@*8,*9"
expj.AD0010010.AD0010010form1.child7 = function () {
  console.log('AD0010010form1 script13');
if (expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAD0010010Control.getButton()) %>', '[eq]', 'Select') || expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAD0010010Control.getButton()) %>', '[eq]', 'Insert') || expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAD0010010Control.getButton()) %>', '[eq]', 'Update')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script14="child;8;CHK;<%= TypeConverter.sanitizer(aAD0010010Control.getOutSideTyp()) %>[eq]2@*9,*10"
expj.AD0010010.AD0010010form1.child8 = function () {
  console.log('AD0010010form1 script14');
if (expj.common.pscript.evaluate('<%= TypeConverter.sanitizer(aAD0010010Control.getOutSideTyp()) %>', '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;9;UNMASK;_AD0010010form2/ITEM_CD,_AD0010010form2/PeekerItemCd"
expj.AD0010010.AD0010010form1.child9 = function () {
  console.log('AD0010010form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/PeekerItemCd');
};
// script16="child;10;MASK;_AD0010010form2/ITEM_CD,_AD0010010form2/PeekerItemCd"
expj.AD0010010.AD0010010form1.child10 = function () {
  console.log('AD0010010form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/PeekerItemCd');
};
// script17="onDecision;4;CHK;_AD0010010form2/TIME_CTRL[eq]true@*11,*12"
expj.AD0010010.AD0010010form1.onDecision4 = function () {
  console.log('AD0010010form1 script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '_AD0010010form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script18="child;11;UNMASK;_AD0010010form2/WORK_ODR_DLV_DATE_TIME,_AD0010010form2/OPR_INST_START_DATE_TIME"
expj.AD0010010.AD0010010form1.child11 = function () {
  console.log('AD0010010form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/OPR_INST_START_DATE_TIME');
};
// script19="child;12;MASK;_AD0010010form2/WORK_ODR_DLV_DATE_TIME,_AD0010010form2/OPR_INST_START_DATE_TIME"
expj.AD0010010.AD0010010form1.child12 = function () {
  console.log('AD0010010form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/OPR_INST_START_DATE_TIME');
};
// script20="onDecision;5;CHK;_AD0010010form2/h_MANHOUR_TYP[numeq]1@*13,*16"
expj.AD0010010.AD0010010form1.onDecision5 = function () {
  console.log('AD0010010form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '_AD0010010form2/h_MANHOUR_TYP')), '[numeq]', expj.common.pscript.convertNumber('1'))) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script21="child;13;MASK;_AD0010010form2/OPR_INST_QTY@*14"
expj.AD0010010.AD0010010form1.child13 = function () {
  console.log('AD0010010form1 script21');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/OPR_INST_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script22="child;14;MASK;_AD0010010form2/OUTSIDE_TYP@*15"
expj.AD0010010.AD0010010form1.child14 = function () {
  console.log('AD0010010form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/OUTSIDE_TYP');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script23="child;15;MASK;_AD0010010button2/Delete"
expj.AD0010010.AD0010010form1.child15 = function () {
  console.log('AD0010010form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010button2/Delete');
};
// script24="child;16;UNMASK;_AD0010010form2/OPR_INST_QTY@*17"
expj.AD0010010.AD0010010form1.child16 = function () {
  console.log('AD0010010form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/OPR_INST_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script25="child;17;UNMASK;_AD0010010form2/OUTSIDE_TYP"
expj.AD0010010.AD0010010form1.child17 = function () {
  console.log('AD0010010form1 script25');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/OUTSIDE_TYP');
};
// script26="onDecision;6;CHK;?AD0010010form1/*[eq]NORMAL@*18"
expj.AD0010010.AD0010010form1.onDecision6 = function () {
  console.log('AD0010010form1 script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '?AD0010010form1/*'), '[eq]', 'NORMAL')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script27="child;18;CHK;_WORK_ODR_CD[neq]_h_WORK_ODR_CD@*19"
expj.AD0010010.AD0010010form1.child18 = function () {
  console.log('AD0010010form1 script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '_WORK_ODR_CD'), '[neq]', expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '_h_WORK_ODR_CD'))) {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script28="child;19;UNMASK;_AD0010010form2/ITEM_CD,_AD0010010form2/PeekerItemCd"
expj.AD0010010.AD0010010form1.child19 = function () {
  console.log('AD0010010form1 script28');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0010010', 'AD0010010form1', '_AD0010010form2/PeekerItemCd');
};
expj.AD0010010.AD0010010form1.executeAllOnDecision = function () {
  console.log('execute AD0010010form1.onDecision');
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010form1['onDecision' + i])) {
        expj.AD0010010.AD0010010form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010form1.executeOnLoad = function () {
  expj.AD0010010.AD0010010form1.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form1.executePScriptOnLoad = function () {
  console.log('execute AD0010010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0010010.AD0010010form1['onLoad' + i])) {
      expj.AD0010010.AD0010010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0010010-AD0010010form1" action="AD0010010Servlet" name="AD0010010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0010010Control.getReadStatusString()) %>" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_CD",rb)%></span><!-- 作業計画番号 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form1-WORK_ODR_CD">
expj.AD0010010.AD0010010form1.WORK_ODR_CD = {};
expj.AD0010010.AD0010010form1.WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0010010form1/WORK_ODR_CD.onDecision');
  expj.AD0010010.AD0010010form1.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form1.WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form1-WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form1', 'WORK_ODR_CD', this);
  });
  expj.AD0010010.AD0010010form1.WORK_ODR_CD.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form1.WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0010010form1/WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form1-WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form1-WORK_ODR_CD" name="WORK_ODR_CD" class="AD0010010-focus-move  required-value expj-AD0010010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getWORK_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form1-h_WORK_ODR_CD" name="h_WORK_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_WORK_ODR_CD()) %>">
<script class="expj-script-AD0010010-AD0010010form1-h_WORK_ODR_CD">
expj.AD0010010.AD0010010form1.h_WORK_ODR_CD = {};
expj.AD0010010.AD0010010form1.h_WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0010010form1/h_WORK_ODR_CD.onDecision');
  expj.AD0010010.AD0010010form1.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form1.h_WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form1-h_WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form1', 'h_WORK_ODR_CD', this);
  });
  expj.AD0010010.AD0010010form1.h_WORK_ODR_CD.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form1.h_WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0010010form1/h_WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form1-h_WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0010010-AD0010010form1-PeekerWorkOdrCd">
expj.AD0010010.AD0010010form1.PeekerWorkOdrCd = {};
// script1="onClick;0;PEEKER;_AD0010010form1/WORK_ODR_CD@<%=contextNo%>"
expj.AD0010010.AD0010010form1.PeekerWorkOdrCd.onClick0 = function () {
  console.log('PeekerWorkOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0010010';
var parameterValues = 'PeekerWorkOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0010010', 'PeekerWorkOdrCd', 'SQLPARAM_1', '<%=aAD0010010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form1', '_WORK_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WORK_ODR_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0010010form1/WORK_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0010010.AD0010010form1.PeekerWorkOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010form1.PeekerWorkOdrCd['onClick' + i])) {
        expj.AD0010010.AD0010010form1.PeekerWorkOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010form1.PeekerWorkOdrCd.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010form1.PeekerWorkOdrCd.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form1-PeekerWorkOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010form1', 'PeekerWorkOdrCd', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010form1.PeekerWorkOdrCd.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form1.PeekerWorkOdrCd.executePScriptOnLoad = function () {
  console.log('execute AD0010010form1/PeekerWorkOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form1-PeekerWorkOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0010010-AD0010010form1-PeekerWorkOdrCd" class="AD0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AD0010010-AD0010010button1">
expj.AD0010010.AD0010010button1 = {};
expj.AD0010010.AD0010010button1.executeAllOnDecision = function () {
  console.log('execute AD0010010button1.onDecision');
};
expj.AD0010010.AD0010010button1.executeOnLoad = function () {
  expj.AD0010010.AD0010010button1.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button1.executePScriptOnLoad = function () {
  console.log('execute AD0010010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0010010-AD0010010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0010010-AD0010010button1-Select">
expj.AD0010010.AD0010010button1.Select = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0010010form1/WORK_ODR_CD,_AD0010010form2/h_BUSINESS_OPR_DATE@AD0010010Servlet"
expj.AD0010010.AD0010010button1.Select.onClick0 = function () {
  console.log('Select script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0010010', 'AD0010010button1', '_AD0010010form1/WORK_ODR_CD,_AD0010010form2/h_BUSINESS_OPR_DATE', 'AD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0010010', response);
expj.common.updateBusinessScreenTab('AD0010010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0010010.AD0010010button1.Select.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010button1.Select['onClick' + i])) {
        expj.AD0010010.AD0010010button1.Select['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010button1.Select.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010button1.Select.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010button1-Select').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010button1', 'Select', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010button1.Select.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button1.Select.executePScriptOnLoad = function () {
  console.log('execute AD0010010button1/Select.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010button1-Select');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0010010-AD0010010button1-Select" name="Select" class="AD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelect",rb)%></button><!-- 読込ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0010010-AD0010010form2">
expj.AD0010010.AD0010010form2 = {};
expj.AD0010010.AD0010010form2.executeAllOnDecision = function () {
  console.log('execute AD0010010form2.onDecision');
};
expj.AD0010010.AD0010010form2.executeOnLoad = function () {
  expj.AD0010010.AD0010010form2.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0010010-AD0010010form2" action="AD0010010Servlet" name="AD0010010form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-ITEM_CD">
expj.AD0010010.AD0010010form2.ITEM_CD = {};
expj.AD0010010.AD0010010form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/ITEM_CD.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'ITEM_CD', this);
  });
  expj.AD0010010.AD0010010form2.ITEM_CD.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-ITEM_CD" name="ITEM_CD" class="AD0010010-focus-move  required-value expj-AD0010010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-PeekerItemCd">
expj.AD0010010.AD0010010form2.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AD0010010form2/ITEM_CD@<%=contextNo%>"
expj.AD0010010.AD0010010form2.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0010010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form2', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_02%&%';
parameterValues += 'TARGET_FIELD%=%_AD0010010form2/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0010010.AD0010010form2.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010form2.PeekerItemCd['onClick' + i])) {
        expj.AD0010010.AD0010010form2.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010form2.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010form2.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010form2', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010form2.PeekerItemCd.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0010010-AD0010010form2-PeekerItemCd" class="AD0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-ITEM_NAME">
expj.AD0010010.AD0010010form2.ITEM_NAME = {};
expj.AD0010010.AD0010010form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/ITEM_NAME.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'ITEM_NAME', this);
  });
  expj.AD0010010.AD0010010form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-ITEM_NAME" name="ITEM_NAME" class="AD0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-DRAW_CD">
expj.AD0010010.AD0010010form2.DRAW_CD = {};
expj.AD0010010.AD0010010form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/DRAW_CD.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'DRAW_CD', this);
  });
  expj.AD0010010.AD0010010form2.DRAW_CD.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-DRAW_CD" name="DRAW_CD" class="AD0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-SPEC">
expj.AD0010010.AD0010010form2.SPEC = {};
expj.AD0010010.AD0010010form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/SPEC.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.SPEC.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'SPEC', this);
  });
  expj.AD0010010.AD0010010form2.SPEC.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-SPEC" name="SPEC" class="AD0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-JOB_ODR_CD">
expj.AD0010010.AD0010010form2.JOB_ODR_CD = {};
expj.AD0010010.AD0010010form2.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/JOB_ODR_CD.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'JOB_ODR_CD', this);
  });
  expj.AD0010010.AD0010010form2.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-JOB_ODR_CD" name="JOB_ODR_CD" class="AD0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-MRP_ODR_TYP_DN">
expj.AD0010010.AD0010010form2.MRP_ODR_TYP_DN = {};
expj.AD0010010.AD0010010form2.MRP_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/MRP_ODR_TYP_DN.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.MRP_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-MRP_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'MRP_ODR_TYP_DN', this);
  });
  expj.AD0010010.AD0010010form2.MRP_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.MRP_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/MRP_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-MRP_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-MRP_ODR_TYP_DN" name="MRP_ODR_TYP_DN" class="AD0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getMRP_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AD0010010-AD0010010form2-MRP_ODR_TYP">
expj.AD0010010.AD0010010form2.MRP_ODR_TYP = {};
expj.AD0010010.AD0010010form2.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/MRP_ODR_TYP.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'MRP_ODR_TYP', this);
  });
  expj.AD0010010.AD0010010form2.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)%></span><!-- 作業実績区分 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-OPR_RSLT_TYP_DN">
expj.AD0010010.AD0010010form2.OPR_RSLT_TYP_DN = {};
expj.AD0010010.AD0010010form2.OPR_RSLT_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/OPR_RSLT_TYP_DN.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.OPR_RSLT_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-OPR_RSLT_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'OPR_RSLT_TYP_DN', this);
  });
  expj.AD0010010.AD0010010form2.OPR_RSLT_TYP_DN.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.OPR_RSLT_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/OPR_RSLT_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-OPR_RSLT_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-OPR_RSLT_TYP_DN" name="OPR_RSLT_TYP_DN" class="AD0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getOPR_RSLT_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-OPR_RSLT_TYP" name="OPR_RSLT_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getOPR_RSLT_TYP()) %>">
<script class="expj-script-AD0010010-AD0010010form2-OPR_RSLT_TYP">
expj.AD0010010.AD0010010form2.OPR_RSLT_TYP = {};
expj.AD0010010.AD0010010form2.OPR_RSLT_TYP.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/OPR_RSLT_TYP.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.OPR_RSLT_TYP.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-OPR_RSLT_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'OPR_RSLT_TYP', this);
  });
  expj.AD0010010.AD0010010form2.OPR_RSLT_TYP.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.OPR_RSLT_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/OPR_RSLT_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-OPR_RSLT_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_6",rb)%></span><!-- 品目別製造納期 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE">
expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE = {};
expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/WORK_ODR_DLV_DATE.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'WORK_ODR_DLV_DATE', this);
  });
  expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/WORK_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE" name="WORK_ODR_DLV_DATE" class="AD0010010-focus-move  required-value expj-AD0010010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getWORK_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-CalendarWorkOdrDlvDate">
expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate = {};
// script1="onClick;0;CALENDAR;_AD0010010form2/WORK_ODR_DLV_DATE"
expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate.onClick0 = function () {
  console.log('CalendarWorkOdrDlvDate script1');
expj.common.pscript.executeCalendar('AD0010010','AD0010010form2','_AD0010010form2/WORK_ODR_DLV_DATE');
};
expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate['onClick' + i])) {
        expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-CalendarWorkOdrDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010form2', 'CalendarWorkOdrDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0010010','AD0010010form2','_AD0010010form2/WORK_ODR_DLV_DATE');
  expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/CalendarWorkOdrDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-CalendarWorkOdrDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0010010-AD0010010form2-CalendarWorkOdrDlvDate" class="AD0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE_TIME">
expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE_TIME = {};
expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/WORK_ODR_DLV_DATE_TIME.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'WORK_ODR_DLV_DATE_TIME', this);
  });
  expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE_TIME.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/WORK_ODR_DLV_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-WORK_ODR_DLV_DATE_TIME" name="WORK_ODR_DLV_DATE_TIME" class="AD0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getWORK_ODR_DLV_DATE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_ODR_START_DATE" name="h_ODR_START_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_ODR_START_DATE()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_ODR_START_DATE">
expj.AD0010010.AD0010010form2.h_ODR_START_DATE = {};
expj.AD0010010.AD0010010form2.h_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_ODR_START_DATE.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_ODR_START_DATE', this);
  });
  expj.AD0010010.AD0010010form2.h_ODR_START_DATE.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_BUSINESS_OPR_DATE">
expj.AD0010010.AD0010010form2.h_BUSINESS_OPR_DATE = {};
expj.AD0010010.AD0010010form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AD0010010.AD0010010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE" name="h_JOB_ODR_DLV_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_JOB_ODR_DLV_DATE()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE">
expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE = {};
expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_JOB_ODR_DLV_DATE.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_JOB_ODR_DLV_DATE', this);
  });
  expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_JOB_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_DUE_DATE" name="h_DUE_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_DUE_DATE()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_DUE_DATE">
expj.AD0010010.AD0010010form2.h_DUE_DATE = {};
expj.AD0010010.AD0010010form2.h_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_DUE_DATE.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_DUE_DATE.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_DUE_DATE', this);
  });
  expj.AD0010010.AD0010010form2.h_DUE_DATE.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE_6",rb)%></span><!-- 品目別製造着手日 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-OPR_INST_START_DATE">
expj.AD0010010.AD0010010form2.OPR_INST_START_DATE = {};
expj.AD0010010.AD0010010form2.OPR_INST_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/OPR_INST_START_DATE.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.OPR_INST_START_DATE.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-OPR_INST_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'OPR_INST_START_DATE', this);
  });
  expj.AD0010010.AD0010010form2.OPR_INST_START_DATE.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.OPR_INST_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/OPR_INST_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-OPR_INST_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-OPR_INST_START_DATE" name="OPR_INST_START_DATE" class="AD0010010-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getOPR_INST_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-CalendarOprInstStartDate">
expj.AD0010010.AD0010010form2.CalendarOprInstStartDate = {};
// script1="onClick;0;CALENDAR;_AD0010010form2/OPR_INST_START_DATE"
expj.AD0010010.AD0010010form2.CalendarOprInstStartDate.onClick0 = function () {
  console.log('CalendarOprInstStartDate script1');
expj.common.pscript.executeCalendar('AD0010010','AD0010010form2','_AD0010010form2/OPR_INST_START_DATE');
};
expj.AD0010010.AD0010010form2.CalendarOprInstStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010form2.CalendarOprInstStartDate['onClick' + i])) {
        expj.AD0010010.AD0010010form2.CalendarOprInstStartDate['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010form2.CalendarOprInstStartDate.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010form2.CalendarOprInstStartDate.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-CalendarOprInstStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010form2', 'CalendarOprInstStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0010010','AD0010010form2','_AD0010010form2/OPR_INST_START_DATE');
  expj.AD0010010.AD0010010form2.CalendarOprInstStartDate.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.CalendarOprInstStartDate.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/CalendarOprInstStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-CalendarOprInstStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0010010-AD0010010form2-CalendarOprInstStartDate" class="AD0010010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-OPR_INST_START_DATE_TIME">
expj.AD0010010.AD0010010form2.OPR_INST_START_DATE_TIME = {};
expj.AD0010010.AD0010010form2.OPR_INST_START_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/OPR_INST_START_DATE_TIME.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.OPR_INST_START_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-OPR_INST_START_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'OPR_INST_START_DATE_TIME', this);
  });
  expj.AD0010010.AD0010010form2.OPR_INST_START_DATE_TIME.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.OPR_INST_START_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/OPR_INST_START_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-OPR_INST_START_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-OPR_INST_START_DATE_TIME" name="OPR_INST_START_DATE_TIME" class="AD0010010-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getOPR_INST_START_DATE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_ODR_START_DATE_TIME" name="h_ODR_START_DATE_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_ODR_START_DATE_TIME()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_ODR_START_DATE_TIME">
expj.AD0010010.AD0010010form2.h_ODR_START_DATE_TIME = {};
expj.AD0010010.AD0010010form2.h_ODR_START_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_ODR_START_DATE_TIME.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_ODR_START_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_ODR_START_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_ODR_START_DATE_TIME', this);
  });
  expj.AD0010010.AD0010010form2.h_ODR_START_DATE_TIME.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_ODR_START_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_ODR_START_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_ODR_START_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE_TIME" name="h_JOB_ODR_DLV_DATE_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_JOB_ODR_DLV_DATE_TIME()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE_TIME">
expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE_TIME = {};
expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_JOB_ODR_DLV_DATE_TIME.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_JOB_ODR_DLV_DATE_TIME', this);
  });
  expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE_TIME.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_JOB_ODR_DLV_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_JOB_ODR_DLV_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_DUE_DATE_TIME" name="h_DUE_DATE_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_DUE_DATE_TIME()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_DUE_DATE_TIME">
expj.AD0010010.AD0010010form2.h_DUE_DATE_TIME = {};
expj.AD0010010.AD0010010form2.h_DUE_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_DUE_DATE_TIME.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_DUE_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_DUE_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_DUE_DATE_TIME', this);
  });
  expj.AD0010010.AD0010010form2.h_DUE_DATE_TIME.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_DUE_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_DUE_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_DUE_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_QTY",rb)%></span><!-- 作業指示数 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-OPR_INST_QTY">
expj.AD0010010.AD0010010form2.OPR_INST_QTY = {};
expj.AD0010010.AD0010010form2.OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/OPR_INST_QTY.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'OPR_INST_QTY', this);
  });
  expj.AD0010010.AD0010010form2.OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-OPR_INST_QTY" name="OPR_INST_QTY" class="AD0010010-focus-move expj-align-right required-value expj-AD0010010-required-C" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getOPR_INST_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-STOCK_UNIT">
expj.AD0010010.AD0010010form2.STOCK_UNIT = {};
expj.AD0010010.AD0010010form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/STOCK_UNIT.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'STOCK_UNIT', this);
  });
  expj.AD0010010.AD0010010form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-STOCK_UNIT" name="STOCK_UNIT" class="AD0010010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_OPR_INST_QTY" name="h_OPR_INST_QTY" class="" data-kind="OBT_NUMBER;14.4;FLOOR;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_OPR_INST_QTY()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_OPR_INST_QTY">
expj.AD0010010.AD0010010form2.h_OPR_INST_QTY = {};
expj.AD0010010.AD0010010form2.h_OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_OPR_INST_QTY.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_OPR_INST_QTY', this);
  });
  expj.AD0010010.AD0010010form2.h_OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_UNIT_QTY_TYP" name="h_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_UNIT_QTY_TYP()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_UNIT_QTY_TYP">
expj.AD0010010.AD0010010form2.h_UNIT_QTY_TYP = {};
expj.AD0010010.AD0010010form2.h_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_UNIT_QTY_TYP.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_UNIT_QTY_TYP', this);
  });
  expj.AD0010010.AD0010010form2.h_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-OUTSIDE_TYP">
expj.AD0010010.AD0010010form2.OUTSIDE_TYP = {};
expj.AD0010010.AD0010010form2.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/OUTSIDE_TYP.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0010010', 'AD0010010form2', 'OUTSIDE_TYP', this);
  });
  expj.AD0010010.AD0010010form2.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0010010-AD0010010form2-OUTSIDE_TYP" name='OUTSIDE_TYP' class='AD0010010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0010010Control.getStruct().getList_OUTSIDE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0010010Control.getStruct().getList_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0010010Control.getStruct().getList_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0010010Struct.getOUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-OPR_INST_CD">
expj.AD0010010.AD0010010form2.OPR_INST_CD = {};
expj.AD0010010.AD0010010form2.OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/OPR_INST_CD.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'OPR_INST_CD', this);
  });
  expj.AD0010010.AD0010010form2.OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-OPR_INST_CD" name="OPR_INST_CD" class="AD0010010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getOPR_INST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0010010-AD0010010form2-TIME_CTRL">
expj.AD0010010.AD0010010form2.TIME_CTRL = {};
expj.AD0010010.AD0010010form2.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/TIME_CTRL.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'TIME_CTRL', this);
  });
  expj.AD0010010.AD0010010form2.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-WS_CD">
expj.AD0010010.AD0010010form2.WS_CD = {};
expj.AD0010010.AD0010010form2.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/WS_CD.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.WS_CD.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'WS_CD', this);
  });
  expj.AD0010010.AD0010010form2.WS_CD.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-WS_CD" name="WS_CD" class="AD0010010-focus-move  required-value expj-AD0010010-required-Z" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-PeekerWsCd">
expj.AD0010010.AD0010010form2.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AD0010010form2/WS_CD@<%=contextNo%>"
expj.AD0010010.AD0010010form2.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0010010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0010010', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAD0010010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010form2', '_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0010010form2/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0010010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0010010.AD0010010form2.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010form2.PeekerWsCd['onClick' + i])) {
        expj.AD0010010.AD0010010form2.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010form2.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010form2.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010form2', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010form2.PeekerWsCd.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0010010-AD0010010form2-PeekerWsCd" class="AD0010010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-WS_NAME">
expj.AD0010010.AD0010010form2.WS_NAME = {};
expj.AD0010010.AD0010010form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/WS_NAME.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'WS_NAME', this);
  });
  expj.AD0010010.AD0010010form2.WS_NAME.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-WS_NAME" name="WS_NAME" class="AD0010010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getWS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_MANHOUR_TYP" name="h_MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_MANHOUR_TYP()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_MANHOUR_TYP">
expj.AD0010010.AD0010010form2.h_MANHOUR_TYP = {};
expj.AD0010010.AD0010010form2.h_MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_MANHOUR_TYP.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_MANHOUR_TYP', this);
  });
  expj.AD0010010.AD0010010form2.h_MANHOUR_TYP.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_IN_PROC_COMMENT_3",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010form2-WORK_IN_PROC_COMMENT">
expj.AD0010010.AD0010010form2.WORK_IN_PROC_COMMENT = {};
expj.AD0010010.AD0010010form2.WORK_IN_PROC_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/WORK_IN_PROC_COMMENT.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.WORK_IN_PROC_COMMENT.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-WORK_IN_PROC_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'WORK_IN_PROC_COMMENT', this);
  });
  expj.AD0010010.AD0010010form2.WORK_IN_PROC_COMMENT.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.WORK_IN_PROC_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/WORK_IN_PROC_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-WORK_IN_PROC_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AD0010010-AD0010010form2-WORK_IN_PROC_COMMENT" name="WORK_IN_PROC_COMMENT" class="AD0010010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0010010Struct.getWORK_IN_PROC_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_flg" name="h_flg" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_flg()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_flg">
expj.AD0010010.AD0010010form2.h_flg = {};
expj.AD0010010.AD0010010form2.h_flg.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_flg.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_flg.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_flg').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_flg', this);
  });
  expj.AD0010010.AD0010010form2.h_flg.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_flg.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_flg.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_flg');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_PARENT_OD_NO" name="h_PARENT_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_PARENT_OD_NO()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_PARENT_OD_NO">
expj.AD0010010.AD0010010form2.h_PARENT_OD_NO = {};
expj.AD0010010.AD0010010form2.h_PARENT_OD_NO.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_PARENT_OD_NO.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_PARENT_OD_NO.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_PARENT_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_PARENT_OD_NO', this);
  });
  expj.AD0010010.AD0010010form2.h_PARENT_OD_NO.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_PARENT_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_PARENT_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_PARENT_OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_SUB_FLG" name="h_SUB_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_SUB_FLG()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_SUB_FLG">
expj.AD0010010.AD0010010form2.h_SUB_FLG = {};
expj.AD0010010.AD0010010form2.h_SUB_FLG.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_SUB_FLG.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_SUB_FLG.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_SUB_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_SUB_FLG', this);
  });
  expj.AD0010010.AD0010010form2.h_SUB_FLG.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_SUB_FLG.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_SUB_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_SUB_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0010010-AD0010010form2-h_MODIFY_COUNT" name="h_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0010010Struct.geth_MODIFY_COUNT()) %>">
<script class="expj-script-AD0010010-AD0010010form2-h_MODIFY_COUNT">
expj.AD0010010.AD0010010form2.h_MODIFY_COUNT = {};
expj.AD0010010.AD0010010form2.h_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AD0010010form2/h_MODIFY_COUNT.onDecision');
  expj.AD0010010.AD0010010form2.executeAllOnDecision();
  expj.AD0010010.executeAllOnDecision();
};
expj.AD0010010.AD0010010form2.h_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010form2-h_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0010010', 'AD0010010form2', 'h_MODIFY_COUNT', this);
  });
  expj.AD0010010.AD0010010form2.h_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AD0010010.AD0010010form2.h_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AD0010010form2/h_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010form2-h_MODIFY_COUNT');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 399px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:315px;"><script class="expj-script-AD0010010-AD0010010button2">
expj.AD0010010.AD0010010button2 = {};
expj.AD0010010.AD0010010button2.executeAllOnDecision = function () {
  console.log('execute AD0010010button2.onDecision');
};
expj.AD0010010.AD0010010button2.executeOnLoad = function () {
  expj.AD0010010.AD0010010button2.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button2.executePScriptOnLoad = function () {
  console.log('execute AD0010010button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0010010-AD0010010button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:315px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0010010-AD0010010button2-Insert">
expj.AD0010010.AD0010010button2.Insert = {};
// script1="onClick;0;CHK;_AD0010010form1/WORK_ODR_CD[neq]@!AD00001"
expj.AD0010010.AD0010010button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form1/WORK_ODR_CD'), '[neq]', '')) {
expj.common.pscript.viewErrorMessage('AD0010010', 'AD0010010button2', 'AD00001');
}
};
// script2="onClick;1;CHK;~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]1[or]~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]2@#AS00027"
expj.AD0010010.AD0010010button2.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00027');
}
};
// script3="onClick;2;CHK;~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]3@*0"
expj.AD0010010.AD0010010button2.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="child;0;CHK;[{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:1)}*10+{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:2)}][gte]60@#AS00028"
expj.AD0010010.AD0010010button2.Insert.child0 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00028');
}
};
// script5="onClick;3;CHK;~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]4@*1"
expj.AD0010010.AD0010010button2.Insert.onClick3 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script6="child;1;CHK;[{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:0)}*10+{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:2)}*10+{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:3)}][gte]60@#AS00028"
expj.AD0010010.AD0010010button2.Insert.child1 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00028');
}
};
// script7="onClick;4;CHK;_AD0010010form2/OPR_INST_START_DATE[eq][and]_AD0010010form2/OPR_INST_START_DATE_TIME[neq]@#AS00033"
expj.AD0010010.AD0010010button2.Insert.onClick4 = function () {
  console.log('Insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00033');
}
};
// script8="onClick;5;CHK;~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]1[or]~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]2@#AS00029"
expj.AD0010010.AD0010010button2.Insert.onClick5 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00029');
}
};
// script9="onClick;6;CHK;~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]3@*2"
expj.AD0010010.AD0010010button2.Insert.onClick6 = function () {
  console.log('Insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script10="child;2;CHK;[{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:1)}*10+{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:2)}][gte]60@#AS00030"
expj.AD0010010.AD0010010button2.Insert.child2 = function () {
  console.log('Insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00030');
}
};
// script11="onClick;7;CHK;~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]4@*3"
expj.AD0010010.AD0010010button2.Insert.onClick7 = function () {
  console.log('Insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script12="child;3;CHK;[{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:0)}*10+{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:2)}*10+{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:3)}][gte]60@#AS00030"
expj.AD0010010.AD0010010button2.Insert.child3 = function () {
  console.log('Insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00030');
}
};
// script13="onClick;8;CHK;_AD0010010form2/OUTSIDE_TYP[neq]1@#AD00005"
expj.AD0010010.AD0010010button2.Insert.onClick8 = function () {
  console.log('Insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OUTSIDE_TYP'), '[neq]', '1')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD00005');
}
};
// script14="onClick;9;CHK;_AD0010010form2/WORK_ODR_DLV_DATE[neq][and]_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE[lt]_AD0010010form2/OPR_INST_START_DATE@#AD32156"
expj.AD0010010.AD0010010button2.Insert.onClick9 = function () {
  console.log('Insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD32156');
}
};
// script15="onClick;10;CHK;_AD0010010form2/TIME_CTRL[eq]true[and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[eq]@*4"
expj.AD0010010.AD0010010button2.Insert.onClick10 = function () {
  console.log('Insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script16="child;4;SET;_AD0010010form2/WORK_ODR_DLV_DATE_TIME=2359"
expj.AD0010010.AD0010010button2.Insert.child4 = function () {
  console.log('Insert script16');
expj.common.pscript.setReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '2359');
};
// script17="onClick;11;CHK;_AD0010010form2/TIME_CTRL[eq]true[and]_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/OPR_INST_START_DATE_TIME[eq]@*5"
expj.AD0010010.AD0010010button2.Insert.onClick11 = function () {
  console.log('Insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script18="child;5;SET;_AD0010010form2/OPR_INST_START_DATE_TIME=2359"
expj.AD0010010.AD0010010button2.Insert.child5 = function () {
  console.log('Insert script18');
expj.common.pscript.setReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '2359');
};
// script19="onClick;12;CHK;_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[neq][and]_AD0010010form2/OPR_INST_START_DATE_TIME[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE[eq]_AD0010010form2/OPR_INST_START_DATE[and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[lt]_AD0010010form2/OPR_INST_START_DATE_TIME@#AD32156"
expj.AD0010010.AD0010010button2.Insert.onClick12 = function () {
  console.log('Insert script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME')))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD32156');
}
};
// script20="onClick;13;CHK;_AD0010010form2/OPR_INST_QTY[eq][or]_AD0010010form2/OPR_INST_QTY[lte]0@#AD30222"
expj.AD0010010.AD0010010button2.Insert.onClick13 = function () {
  console.log('Insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_QTY'), '[eq]', '') || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD30222');
}
};
// script21="onClick;14;CHK;_AD0010010form2/WORK_ODR_DLV_DATE[lt]_AD0010010form2/h_BUSINESS_OPR_DATE@$AD25066"
expj.AD0010010.AD0010010button2.Insert.onClick14 = function () {
  console.log('Insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25066');
}
};
// script22="onClick;15;CHK;_AD0010010form2/OPR_INST_START_DATE[eq]@$AD25048,*6"
expj.AD0010010.AD0010010button2.Insert.onClick15 = function () {
  console.log('Insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25048');
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script23="child;6;CHK;_AD0010010form2/OPR_INST_START_DATE[lt]_AD0010010form2/h_BUSINESS_OPR_DATE@$AD25067"
expj.AD0010010.AD0010010button2.Insert.child6 = function () {
  console.log('Insert script23');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25067');
}
};
// script24="onClick;16;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0010010form1/*,_AD0010010form2/*@AD0010010Servlet,,$ZZ07001"
expj.AD0010010.AD0010010button2.Insert.onClick16 = function () {
  console.log('Insert script24');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0010010', 'AD0010010button2', '_AD0010010form1/*,_AD0010010form2/*', 'AD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0010010', response);
expj.common.updateBusinessScreenTab('AD0010010', contents);
};
expj.common.pscript.callConfirm('AD0010010', 'AD0010010button2', 'ZZ07001', okEvent);
};
expj.AD0010010.AD0010010button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 16; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010button2.Insert['onClick' + i])) {
        expj.AD0010010.AD0010010button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010button2.Insert.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010button2.Insert.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010button2', 'Insert', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010button2.Insert.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button2.Insert.executePScriptOnLoad = function () {
  console.log('execute AD0010010button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0010010-AD0010010button2-Insert" name="Insert" class="AD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010button2-Update">
expj.AD0010010.AD0010010button2.Update = {};
// script1="onClick;1;CHK;~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]1[or]~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]2@#AS00027"
expj.AD0010010.AD0010010button2.Update.onClick1 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00027');
}
};
// script2="onClick;2;CHK;~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]3@*0"
expj.AD0010010.AD0010010button2.Update.onClick2 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="child;0;CHK;[{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:1)}*10+{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:2)}][gte]60@#AS00028"
expj.AD0010010.AD0010010button2.Update.child0 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00028');
}
};
// script4="onClick;3;CHK;~LEN(_AD0010010form2/WORK_ODR_DLV_DATE_TIME)[eq]4@*1"
expj.AD0010010.AD0010010button2.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script5="child;1;CHK;[{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:0)}*10+{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:2)}*10+{~CHARAT(_AD0010010form2/WORK_ODR_DLV_DATE_TIME:3)}][gte]60@#AS00028"
expj.AD0010010.AD0010010button2.Update.child1 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00028');
}
};
// script6="onClick;4;CHK;_AD0010010form2/OPR_INST_START_DATE[eq][and]_AD0010010form2/OPR_INST_START_DATE_TIME[neq]@#AS00033"
expj.AD0010010.AD0010010button2.Update.onClick4 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00033');
}
};
// script7="onClick;5;CHK;~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]1[or]~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]2@#AS00029"
expj.AD0010010.AD0010010button2.Update.onClick5 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00029');
}
};
// script8="onClick;6;CHK;~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]3@*2"
expj.AD0010010.AD0010010button2.Update.onClick6 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script9="child;2;CHK;[{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:1)}*10+{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:2)}][gte]60@#AS00030"
expj.AD0010010.AD0010010button2.Update.child2 = function () {
  console.log('Update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00030');
}
};
// script10="onClick;7;CHK;~LEN(_AD0010010form2/OPR_INST_START_DATE_TIME)[eq]4@*3"
expj.AD0010010.AD0010010button2.Update.onClick7 = function () {
  console.log('Update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script11="child;3;CHK;[{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:0)}*10+{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:2)}*10+{~CHARAT(_AD0010010form2/OPR_INST_START_DATE_TIME:3)}][gte]60@#AS00030"
expj.AD0010010.AD0010010button2.Update.child3 = function () {
  console.log('Update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AS00030');
}
};
// script12="onClick;8;CHK;_AD0010010form2/WORK_ODR_DLV_DATE[neq][and]_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE[lt]_AD0010010form2/OPR_INST_START_DATE@#AD32156"
expj.AD0010010.AD0010010button2.Update.onClick8 = function () {
  console.log('Update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD32156');
}
};
// script13="onClick;9;CHK;_AD0010010form2/TIME_CTRL[eq]true[and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[eq]@*4"
expj.AD0010010.AD0010010button2.Update.onClick9 = function () {
  console.log('Update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script14="child;4;SET;_AD0010010form2/WORK_ODR_DLV_DATE_TIME=2359"
expj.AD0010010.AD0010010button2.Update.child4 = function () {
  console.log('Update script14');
expj.common.pscript.setReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME', '2359');
};
// script15="onClick;10;CHK;_AD0010010form2/TIME_CTRL[eq]true[and]_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/OPR_INST_START_DATE_TIME[eq]@*5"
expj.AD0010010.AD0010010button2.Update.onClick10 = function () {
  console.log('Update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script16="child;5;SET;_AD0010010form2/OPR_INST_START_DATE_TIME=2359"
expj.AD0010010.AD0010010button2.Update.child5 = function () {
  console.log('Update script16');
expj.common.pscript.setReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME', '2359');
};
// script17="onClick;11;CHK;_AD0010010form2/WORK_ODR_DLV_DATE[neq][and]_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[neq][and]_AD0010010form2/OPR_INST_START_DATE_TIME[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE[eq]_AD0010010form2/OPR_INST_START_DATE[and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[lt]_AD0010010form2/OPR_INST_START_DATE_TIME@#AD32156"
expj.AD0010010.AD0010010button2.Update.onClick11 = function () {
  console.log('Update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME')))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD32156');
}
};
// script18="onClick;12;CHK;_AD0010010form2/OPR_INST_QTY[eq][or]_AD0010010form2/OPR_INST_QTY[lte]0@#AD30222"
expj.AD0010010.AD0010010button2.Update.onClick12 = function () {
  console.log('Update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_QTY'), '[eq]', '') || expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD30222');
}
};
// script19="onClick;13;CHK;_AD0010010form2/OUTSIDE_TYP[eq]1[and]_AD0010010form2/OPR_RSLT_TYP[eq]1[and]_AD0010010form2/WS_CD[eq]@#AD30041"
expj.AD0010010.AD0010010button2.Update.onClick13 = function () {
  console.log('Update script19');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OUTSIDE_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_RSLT_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WS_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD30041');
}
};
// script20="onClick;14;CHK;_AD0010010form2/OUTSIDE_TYP[eq]1[and]_AD0010010form2/OPR_RSLT_TYP[eq]2[and]_AD0010010form2/WS_CD[neq]@#AD00227"
expj.AD0010010.AD0010010button2.Update.onClick14 = function () {
  console.log('Update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OUTSIDE_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_RSLT_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WS_CD'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD00227');
}
};
// script21="onClick;15;CHK;_AD0010010form2/JOB_ODR_CD[neq][and]_AD0010010form2/h_JOB_ODR_DLV_DATE[lt]_AD0010010form2/WORK_ODR_DLV_DATE@#AD32214"
expj.AD0010010.AD0010010button2.Update.onClick15 = function () {
  console.log('Update script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_JOB_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE')))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD32214');
}
};
// script22="onClick;16;CHK;_AD0010010form2/JOB_ODR_CD[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[neq][and]_AD0010010form2/h_JOB_ODR_DLV_DATE[eq]_AD0010010form2/WORK_ODR_DLV_DATE[and]_AD0010010form2/h_JOB_ODR_DLV_DATE_TIME[lt]_AD0010010form2/WORK_ODR_DLV_DATE_TIME@#AD32214"
expj.AD0010010.AD0010010button2.Update.onClick16 = function () {
  console.log('Update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_JOB_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_JOB_ODR_DLV_DATE_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME')))) {
expj.common.pscript.addErrorMessage('AD0010010', 'AD0010010button2', 'AD32214');
}
};
// script23="onClick;17;CHK;_AD0010010form2/WORK_ODR_DLV_DATE[lt]_AD0010010form2/h_BUSINESS_OPR_DATE@$AD25066"
expj.AD0010010.AD0010010button2.Update.onClick17 = function () {
  console.log('Update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25066');
}
};
// script24="onClick;18;CHK;_AD0010010form2/OPR_INST_START_DATE[eq]@$AD25048"
expj.AD0010010.AD0010010button2.Update.onClick18 = function () {
  console.log('Update script24');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25048');
}
};
// script25="onClick;19;CHK;_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/h_ODR_START_DATE[gt]_AD0010010form2/OPR_INST_START_DATE@$AD25034"
expj.AD0010010.AD0010010button2.Update.onClick19 = function () {
  console.log('Update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_ODR_START_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25034');
}
};
// script26="onClick;20;CHK;_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/OPR_INST_START_DATE_TIME[neq][and]_AD0010010form2/h_ODR_START_DATE[neq][and]_AD0010010form2/h_ODR_START_DATE_TIME[neq][and]_AD0010010form2/h_ODR_START_DATE[eq]_AD0010010form2/OPR_INST_START_DATE[and]_AD0010010form2/h_ODR_START_DATE_TIME[gt]_AD0010010form2/OPR_INST_START_DATE_TIME@$AD25034"
expj.AD0010010.AD0010010button2.Update.onClick20 = function () {
  console.log('Update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_ODR_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_ODR_START_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_ODR_START_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_ODR_START_DATE_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE_TIME')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25034');
}
};
// script27="onClick;21;CHK;_AD0010010form2/OPR_INST_START_DATE[neq][and]_AD0010010form2/OPR_INST_START_DATE[lt]_AD0010010form2/h_BUSINESS_OPR_DATE@$AD25067"
expj.AD0010010.AD0010010button2.Update.onClick21 = function () {
  console.log('Update script27');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OPR_INST_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25067');
}
};
// script28="onClick;22;CHK;_AD0010010form2/JOB_ODR_CD[neq][and]_AD0010010form2/h_PARENT_OD_NO[neq][and]?AD0010010form2/OPR_INST_QTY[neq]SAME@$AD00008"
expj.AD0010010.AD0010010button2.Update.onClick22 = function () {
  console.log('Update script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '?AD0010010form2/OPR_INST_QTY'), '[neq]', 'SAME')) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD00008');
}
};
// script29="onClick;23;CHK;_AD0010010form2/JOB_ODR_CD[neq][and]_AD0010010form2/h_PARENT_OD_NO[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE[gt]_AD0010010form2/h_DUE_DATE@$AD25023"
expj.AD0010010.AD0010010button2.Update.onClick23 = function () {
  console.log('Update script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_DUE_DATE')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25023');
}
};
// script30="onClick;24;CHK;_AD0010010form2/JOB_ODR_CD[neq][and]_AD0010010form2/h_PARENT_OD_NO[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[neq][and]_AD0010010form2/WORK_ODR_DLV_DATE[eq]_AD0010010form2/h_DUE_DATE[and]_AD0010010form2/WORK_ODR_DLV_DATE_TIME[gt]_AD0010010form2/h_DUE_DATE_TIME@$AD25023"
expj.AD0010010.AD0010010button2.Update.onClick24 = function () {
  console.log('Update script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_DUE_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/WORK_ODR_DLV_DATE_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_DUE_DATE_TIME')))) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25023');
}
};
// script31="onClick;25;CHK;_AD0010010form2/h_SUB_FLG[eq]1@*6"
expj.AD0010010.AD0010010button2.Update.onClick25 = function () {
  console.log('Update script31');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_SUB_FLG'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script32="child;6;CHK;?AD0010010form2/OPR_INST_QTY[neq]SAME[or]?AD0010010form2/WORK_ODR_DLV_DATE[neq]SAME[or]?AD0010010form2/OPR_INST_START_DATE[neq]SAME[or]?AD0010010form2/WORK_ODR_DLV_DATE_TIME[neq]SAME[or]?AD0010010form2/OPR_INST_START_DATE_TIME[neq]SAME@$AD25050"
expj.AD0010010.AD0010010button2.Update.child6 = function () {
  console.log('Update script32');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '?AD0010010form2/OPR_INST_QTY'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '?AD0010010form2/WORK_ODR_DLV_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '?AD0010010form2/OPR_INST_START_DATE'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '?AD0010010form2/WORK_ODR_DLV_DATE_TIME'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '?AD0010010form2/OPR_INST_START_DATE_TIME'), '[neq]', 'SAME')) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25050');
}
};
// script33="onClick;26;CHK;_AD0010010form2/OUTSIDE_TYP[neq]1@$AD25049"
expj.AD0010010.AD0010010button2.Update.onClick26 = function () {
  console.log('Update script33');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/OUTSIDE_TYP'), '[neq]', '1')) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD25049');
}
};
// script34="onClick;27;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0010010form1/*,_AD0010010form2/*@AD0010010Servlet,,$ZZ07003"
expj.AD0010010.AD0010010button2.Update.onClick27 = function () {
  console.log('Update script34');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0010010', 'AD0010010button2', '_AD0010010form1/*,_AD0010010form2/*', 'AD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0010010', response);
expj.common.updateBusinessScreenTab('AD0010010', contents);
};
expj.common.pscript.callConfirm('AD0010010', 'AD0010010button2', 'ZZ07003', okEvent);
};
expj.AD0010010.AD0010010button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 27; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010button2.Update['onClick' + i])) {
        expj.AD0010010.AD0010010button2.Update['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010button2.Update.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010button2.Update.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010button2', 'Update', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010button2.Update.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button2.Update.executePScriptOnLoad = function () {
  console.log('execute AD0010010button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0010010-AD0010010button2-Update" name="Update" class="AD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010button2-Delete">
expj.AD0010010.AD0010010button2.Delete = {};
// script1="onClick;0;CHK;_AD0010010form2/JOB_ODR_CD[neq][and]_AD0010010form2/h_PARENT_OD_NO[eq]@$AD00084"
expj.AD0010010.AD0010010button2.Delete.onClick0 = function () {
  console.log('Delete script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_PARENT_OD_NO'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD00084');
}
};
// script2="onClick;1;CHK;_AD0010010form2/JOB_ODR_CD[neq][and]_AD0010010form2/h_PARENT_OD_NO[neq]@$AD00008"
expj.AD0010010.AD0010010button2.Delete.onClick1 = function () {
  console.log('Delete script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/JOB_ODR_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0010010', 'AD0010010button2', '_AD0010010form2/h_PARENT_OD_NO'), '[neq]', '')) {
expj.common.pscript.addWarningMessage('AD0010010', 'AD0010010button2', 'AD00008');
}
};
// script3="onClick;2;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0010010form1/*,_AD0010010form2/*@AD0010010Servlet,,$ZZ07004"
expj.AD0010010.AD0010010button2.Delete.onClick2 = function () {
  console.log('Delete script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0010010', 'AD0010010button2', '_AD0010010form1/*,_AD0010010form2/*', 'AD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0010010', response);
expj.common.updateBusinessScreenTab('AD0010010', contents);
};
expj.common.pscript.callConfirm('AD0010010', 'AD0010010button2', 'ZZ07004', okEvent);
};
expj.AD0010010.AD0010010button2.Delete.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010button2.Delete['onClick' + i])) {
        expj.AD0010010.AD0010010button2.Delete['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010button2.Delete.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010button2.Delete.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010button2-Delete').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010button2', 'Delete', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010button2.Delete.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button2.Delete.executePScriptOnLoad = function () {
  console.log('execute AD0010010button2/Delete.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010button2-Delete');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0010010-AD0010010button2-Delete" name="Delete" class="AD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnDelete",rb)%></button><!-- 削除ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0010010 Revision: 1.12  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-AD0010010-AD0010010button0">
expj.AD0010010.AD0010010button0 = {};
expj.AD0010010.AD0010010button0.executeAllOnDecision = function () {
  console.log('execute AD0010010button0.onDecision');
};
expj.AD0010010.AD0010010button0.executeOnLoad = function () {
  expj.AD0010010.AD0010010button0.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button0.executePScriptOnLoad = function () {
  console.log('execute AD0010010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0010010-AD0010010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0010010-AD0010010button0-Clear">
expj.AD0010010.AD0010010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AD0010010Servlet,,$ZZ07008"
expj.AD0010010.AD0010010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0010010', 'AD0010010button0', '', 'AD0010010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0010010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0010010', response);
expj.common.updateBusinessScreenTab('AD0010010', contents);
};
expj.common.pscript.callConfirm('AD0010010', 'AD0010010button0', 'ZZ07008', okEvent);
};
expj.AD0010010.AD0010010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010button0.Clear['onClick' + i])) {
        expj.AD0010010.AD0010010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010button0.Clear.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010button0.Clear.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010button0', 'Clear', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010button0.Clear.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AD0010010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0010010-AD0010010button0-Clear" name="Clear" class="AD0010010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AD0010010-AD0010010button0-Close">
expj.AD0010010.AD0010010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AD0010010.AD0010010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AD0010010');
};
expj.AD0010010.AD0010010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0010010.AD0010010button0.Close['onClick' + i])) {
        expj.AD0010010.AD0010010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AD0010010.AD0010010button0.Close.executeAllOnDecision = function () {
};
expj.AD0010010.AD0010010button0.Close.executeOnLoad = function () {
  $('#expj-AD0010010-AD0010010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0010010', 'AD0010010button0', 'Close', this, 'Button');
    }
  });
  expj.AD0010010.AD0010010button0.Close.executePScriptOnLoad();
};

expj.AD0010010.AD0010010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AD0010010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AD0010010-AD0010010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0010010-AD0010010button0-Close" name="Close" class="AD0010010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0010010 (END)-->
<%
MessageStruct msgStruct = aAD0010010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0010010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0010010)) {
  expj.common.treeInstanceMap.AD0010010 = {};
}
expj.common.treeInstanceMap.AD0010010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0010010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0010010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0010010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0010010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0010010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0010010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0010010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0010010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0010010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0010010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0010010)) {
  expj.common.detailDialogMap.AD0010010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0010010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0010010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0010010.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0010010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0010010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0010010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0010010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0010010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0010010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0010010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0010010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0010010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0010010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0010010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0010010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0010010)) {
  expj.common.viewInstanceMap.AD0010010 = {};
}
expj.common.viewInstanceMap.AD0010010.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0010010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0010010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0010010.<%=viewId %>.init = function () {
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
    expj.AD0010010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0010010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0010010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0010010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0010010_init">
/**
 * AD0010010用のロード完了時初期化関数
 */
expj.AD0010010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0010010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0010010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0010010');
  expj.common.calendarInstanceMap.AD0010010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0010010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0010010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0010010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0010010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0010010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0010010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0010010-<%=detailId %>');
<%
 }
%>
  try{expj.AD0010010.AD0010010form1.WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form1.h_WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form1.PeekerWorkOdrCd.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button1.Select.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.MRP_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.OPR_RSLT_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.OPR_RSLT_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.CalendarWorkOdrDlvDate.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.WORK_ODR_DLV_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.OPR_INST_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.CalendarOprInstStartDate.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.OPR_INST_START_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_ODR_START_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_JOB_ODR_DLV_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_DUE_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.WORK_IN_PROC_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_flg.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_PARENT_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_SUB_FLG.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.h_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button2.Insert.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button2.Update.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button2.Delete.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form1.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button1.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010form2.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button2.executeOnLoad();}catch(e){};
  try{expj.AD0010010.AD0010010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0010010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0010010', 'AD0010010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0010010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0010010-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0010010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0010010', '<%=request.getContextPath() %>');
};

/**
 * AD0010010の全体onDecision処理
 */
expj.AD0010010.executeAllOnDecision = function () {
  expj.AD0010010.AD0010010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0010010_console">
expj.AD0010010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>