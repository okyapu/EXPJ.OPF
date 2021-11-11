<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:37 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0030\AD0030021.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0030.*" %>
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
<jsp:useBean id="aAD0030020Control" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030020Control" scope="request"/>
<jsp:useBean id="aAD0030020Struct" class="com.nec.jp.orteus.metamorBase.AD0030.AD0030020Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

系列別作業計画メンテナンスサブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/jsp/AD0030021.jsp,v $
$Author: geng-jia $	
$Revision: 1.27 $ $Date: 2017/02/22 02:04:44 $
********************************************************* --%>
<html>
<head>
<title>系列別作業計画メンテナンスサブ１</title>
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
<script class="expj-script-AD0030020_init">
  // AD0030020名前空間
  expj.AD0030020 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

 <% String CallButton = aAD0030020Control.getButton(); %>
 <% int ScreenStatus = aAD0030020Control.getScreenStatus(); %>
 <div id="expj-business-screen-AD0030020" data-screen="AD0030021" data-newdata="<%=aAD0030020Control.isNewData() %>">
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
              <script class="expj-script-AD0030020-AD0030021form1">
expj.AD0030020.AD0030021form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5,6"
expj.AD0030020.AD0030021form1.onLoad0 = function () {
  console.log('AD0030021form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision6)){this.onDecision6();}
};
// script2="onDecision;0;CHK;<%=TypeConverter.sanitizer(ScreenStatus)%>[eq]0[or]<%=TypeConverter.sanitizer(ScreenStatus)%>[eq]2@*0,*4"
expj.AD0030020.AD0030021form1.onDecision0 = function () {
  console.log('AD0030021form1 script2');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(ScreenStatus)%>', '[eq]', '0') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(ScreenStatus)%>', '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script3="child;0;CHK;_AD0030021form2/OUTSIDE_TYP[eq]1@*1,*2"
expj.AD0030020.AD0030021form1.child0 = function () {
  console.log('AD0030021form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;CHKRQ;A,B,C@*3,*4"
expj.AD0030020.AD0030021form1.child1 = function () {
  console.log('AD0030021form1 script4');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'A') && expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'B') && expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'C')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script5="child;2;CHKRQ;A,B,D@*3,*4"
expj.AD0030020.AD0030021form1.child2 = function () {
  console.log('AD0030021form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'A') && expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'B') && expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'D')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="child;3;UNMASK;_AD0030021button1/Insert"
expj.AD0030020.AD0030021form1.child3 = function () {
  console.log('AD0030021form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021button1/Insert');
};
// script7="child;4;MASK;_AD0030021button1/Insert"
expj.AD0030020.AD0030021form1.child4 = function () {
  console.log('AD0030021form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021button1/Insert');
};
// script8="onDecision;1;CHK;<%=TypeConverter.sanitizer(ScreenStatus)%>[eq]1@*5,*9"
expj.AD0030020.AD0030021form1.onDecision1 = function () {
  console.log('AD0030021form1 script8');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(ScreenStatus)%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script9="child;5;CHK;_AD0030021form2/OUTSIDE_TYP[eq]1@*6,*7"
expj.AD0030020.AD0030021form1.child5 = function () {
  console.log('AD0030021form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script10="child;6;CHKRQ;B,C@*8,*9"
expj.AD0030020.AD0030021form1.child6 = function () {
  console.log('AD0030021form1 script10');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'B') && expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'C')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script11="child;7;CHKRQ;B,D@*8,*9"
expj.AD0030020.AD0030021form1.child7 = function () {
  console.log('AD0030021form1 script11');
if (expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'B') && expj.common.pscript.satisfiedRequiredComponent('AD0030020', 'D')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script12="child;8;UNMASK;_AD0030021button1/Update"
expj.AD0030020.AD0030021form1.child8 = function () {
  console.log('AD0030021form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021button1/Update');
};
// script13="child;9;MASK;_AD0030021button1/Update"
expj.AD0030020.AD0030021form1.child9 = function () {
  console.log('AD0030021form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021button1/Update');
};
// script14="onDecision;2;CHK;_AD0030021form2/OUTSIDE_TYP[eq]1@*11,*10"
expj.AD0030020.AD0030021form1.onDecision2 = function () {
  console.log('AD0030021form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script15="child;10;UNMASK;_AD0030021form2/SelectUnitCost"
expj.AD0030020.AD0030021form1.child10 = function () {
  console.log('AD0030021form1 script15');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/SelectUnitCost');
};
// script16="child;11;MASK;_AD0030021form2/SelectUnitCost"
expj.AD0030020.AD0030021form1.child11 = function () {
  console.log('AD0030021form1 script16');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/SelectUnitCost');
};
// script17="onDecision;3;CHK;<%=TypeConverter.sanitizer(ScreenStatus)%>[eq]1@*13,*12"
expj.AD0030020.AD0030021form1.onDecision3 = function () {
  console.log('AD0030021form1 script17');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(ScreenStatus)%>', '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child13)){this.child13();}
} else {
if(expj.common.checkNameSpace(this.child12)){this.child12();}
}
};
// script18="child;12;UNMASK;_AD0030021form2/WORK_IN_PROC_CD"
expj.AD0030020.AD0030021form1.child12 = function () {
  console.log('AD0030021form1 script18');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/WORK_IN_PROC_CD');
};
// script19="child;13;MASK;_AD0030021form2/WORK_IN_PROC_CD"
expj.AD0030020.AD0030021form1.child13 = function () {
  console.log('AD0030021form1 script19');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/WORK_IN_PROC_CD');
};
// script20="onDecision;4;CHK;_AD0030021form2/OUTSIDE_TYP[eq]1@*14,*16"
expj.AD0030020.AD0030021form1.onDecision4 = function () {
  console.log('AD0030021form1 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child14)){this.child14();}
} else {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
}
};
// script21="child;14;UNMASK;_AD0030021form2/WS_CD,_AD0030021form2/PeekerWsCd@*15"
expj.AD0030020.AD0030021form1.child14 = function () {
  console.log('AD0030021form1 script21');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/WS_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/PeekerWsCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script22="child;15;MASK;_AD0030021form2/VEND_CD,_AD0030021form2/PeekerVendCd,_AD0030021form2/ACPT_INSPC_TYP,_AD0030021form2/UNIT_COST_TYP,_AD0030021form2/UNIT_COST,_AD0030021form2/PROCESSING_COST,_AD0030021form2/MATERIAL_COST,_AD0030021form2/OTHER_OVERHEADS,_AD0030021form2/DISC_AMOUNT"
expj.AD0030020.AD0030021form1.child15 = function () {
  console.log('AD0030021form1 script22');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/PeekerVendCd');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/ACPT_INSPC_TYP');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/UNIT_COST_TYP');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/UNIT_COST');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/PROCESSING_COST');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/MATERIAL_COST');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/OTHER_OVERHEADS');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/DISC_AMOUNT');
};
// script23="child;16;MASK;_AD0030021form2/WS_CD,_AD0030021form2/PeekerWsCd@*17"
expj.AD0030020.AD0030021form1.child16 = function () {
  console.log('AD0030021form1 script23');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/PeekerWsCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child17)){this.child17();}}
};
// script24="child;17;UNMASK;_AD0030021form2/VEND_CD,_AD0030021form2/PeekerVendCd,_AD0030021form2/ACPT_INSPC_TYP,_AD0030021form2/UNIT_COST_TYP,_AD0030021form2/UNIT_COST,_AD0030021form2/PROCESSING_COST,_AD0030021form2/MATERIAL_COST,_AD0030021form2/OTHER_OVERHEADS,_AD0030021form2/DISC_AMOUNT"
expj.AD0030020.AD0030021form1.child17 = function () {
  console.log('AD0030021form1 script24');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/VEND_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/PeekerVendCd');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/ACPT_INSPC_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/UNIT_COST_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/UNIT_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/PROCESSING_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/MATERIAL_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/OTHER_OVERHEADS');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/DISC_AMOUNT');
};
// script25="onDecision;5;CHK;_AD0030021form2/TIME_CTRL[eq]true@*18,*19"
expj.AD0030020.AD0030021form1.onDecision5 = function () {
  console.log('AD0030021form1 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script26="child;18;UNMASK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME,_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME"
expj.AD0030020.AD0030021form1.child18 = function () {
  console.log('AD0030021form1 script26');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME');
};
// script27="child;19;MASK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME,_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME"
expj.AD0030020.AD0030021form1.child19 = function () {
  console.log('AD0030021form1 script27');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME');
};
// script28="onDecision;6;CHK;_AD0030021form2/h_MANHOUR_TYP[eq]1@*20"
expj.AD0030020.AD0030021form1.onDecision6 = function () {
  console.log('AD0030021form1 script28');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form1', '_AD0030021form2/h_MANHOUR_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
}
};
// script29="child;20;MASK;_AD0030021form2/OPR_INST_QTY,_AD0030021form2/OUTSIDE_TYP"
expj.AD0030020.AD0030021form1.child20 = function () {
  console.log('AD0030021form1 script29');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/OPR_INST_QTY');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form1', '_AD0030021form2/OUTSIDE_TYP');
};
expj.AD0030020.AD0030021form1.executeAllOnDecision = function () {
  console.log('execute AD0030021form1.onDecision');
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form1['onDecision' + i])) {
        expj.AD0030020.AD0030021form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021form1.executeOnLoad = function () {
  expj.AD0030020.AD0030021form1.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form1.executePScriptOnLoad = function () {
  console.log('execute AD0030021form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form1['onLoad' + i])) {
      expj.AD0030020.AD0030021form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0030020-AD0030021form1" action="AD0030020Servlet" name="AD0030021form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0030020Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_ODR_CD",rb)%></span><!-- 作業計画番号 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form1-WORK_ODR_CD">
expj.AD0030020.AD0030021form1.WORK_ODR_CD = {};
expj.AD0030020.AD0030021form1.WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form1/WORK_ODR_CD.onDecision');
  expj.AD0030020.AD0030021form1.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form1.WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form1-WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form1', 'WORK_ODR_CD', this);
  });
  expj.AD0030020.AD0030021form1.WORK_ODR_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form1.WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form1/WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form1-WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form1-WORK_ODR_CD" name="WORK_ODR_CD" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form1-ITEM_CD">
expj.AD0030020.AD0030021form1.ITEM_CD = {};
expj.AD0030020.AD0030021form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form1/ITEM_CD.onDecision');
  expj.AD0030020.AD0030021form1.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form1', 'ITEM_CD', this);
  });
  expj.AD0030020.AD0030021form1.ITEM_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form1-ITEM_CD" name="ITEM_CD" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form1-ITEM_NAME">
expj.AD0030020.AD0030021form1.ITEM_NAME = {};
expj.AD0030020.AD0030021form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0030021form1/ITEM_NAME.onDecision');
  expj.AD0030020.AD0030021form1.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form1', 'ITEM_NAME', this);
  });
  expj.AD0030020.AD0030021form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form1-ITEM_NAME" name="ITEM_NAME" class="AD0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
<input type="hidden" name="ORTEUS_HASHED" value="<%=hashed%>"></form>
<!-- ここに上段検索条件用のDataGridを配置する。↑ --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0030020-AD0030021form2">
expj.AD0030020.AD0030021form2 = {};
expj.AD0030020.AD0030021form2.executeAllOnDecision = function () {
  console.log('execute AD0030021form2.onDecision');
};
expj.AD0030020.AD0030021form2.executeOnLoad = function () {
  expj.AD0030020.AD0030021form2.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0030020-AD0030021form2" action="AD0030020Servlet" name="AD0030021form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_IN_PROC_CD_1",rb)%></span><!-- 作業コード --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-WORK_IN_PROC_CD">
expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD.onDecision0 = function () {
  console.log('WORK_IN_PROC_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD.child0 = function () {
  console.log('WORK_IN_PROC_CD script2');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021form2', '_SelectUnitCostFlag', 'false');
};
expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/WORK_IN_PROC_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD['onDecision' + i])) {
        expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD['onDecision' + i]();
      }
    }
  }
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-WORK_IN_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'WORK_IN_PROC_CD', this);
  });
  expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/WORK_IN_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-WORK_IN_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-WORK_IN_PROC_CD" name="WORK_IN_PROC_CD" class="AD0030020-focus-move  required-value expj-AD0030020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_IN_PROC_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_NAME",rb)%></span><!-- 作業名 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-PROC_NAME">
expj.AD0030020.AD0030021form2.PROC_NAME = {};
expj.AD0030020.AD0030021form2.PROC_NAME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/PROC_NAME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.PROC_NAME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'PROC_NAME', this);
  });
  expj.AD0030020.AD0030021form2.PROC_NAME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-PROC_NAME" name="PROC_NAME" class="AD0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getPROC_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_NO",rb)%></span><!-- 作業系列番号 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-PROC_NO">
expj.AD0030020.AD0030021form2.PROC_NO = {};
expj.AD0030020.AD0030021form2.PROC_NO.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/PROC_NO.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.PROC_NO.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-PROC_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'PROC_NO', this);
  });
  expj.AD0030020.AD0030021form2.PROC_NO.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.PROC_NO.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/PROC_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-PROC_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-PROC_NO" name="PROC_NO" class="AD0030020-focus-move expj-align-right required-value expj-AD0030020-required-B" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getPROC_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_7",rb)%></span><!-- 系列別製造納期 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC">
expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC = {};
expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'WORK_ODR_DLV_DATE_BY_PROC', this);
  });
  expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC" name="WORK_ODR_DLV_DATE_BY_PROC" class="AD0030020-focus-move  required-value expj-AD0030020-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_ODR_DLV_DATE_BY_PROC()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-CalendarWorkOdrDlvDateByProc">
expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc = {};
// script1="onClick;0;CALENDAR;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC"
expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc.onClick0 = function () {
  console.log('CalendarWorkOdrDlvDateByProc script1');
expj.common.pscript.executeCalendar('AD0030020','AD0030021form2','_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC');
};
expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc['onClick' + i])) {
        expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-CalendarWorkOdrDlvDateByProc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021form2', 'CalendarWorkOdrDlvDateByProc', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030020','AD0030021form2','_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC');
  expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/CalendarWorkOdrDlvDateByProc.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-CalendarWorkOdrDlvDateByProc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030020-AD0030021form2-CalendarWorkOdrDlvDateByProc" class="AD0030020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC_TIME">
expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC_TIME = {};
expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC_TIME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'WORK_ODR_DLV_DATE_BY_PROC_TIME', this);
  });
  expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC_TIME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-WORK_ODR_DLV_DATE_BY_PROC_TIME" name="WORK_ODR_DLV_DATE_BY_PROC_TIME" class="AD0030020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_ODR_DLV_DATE_BY_PROC_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_BUSINESS_OPR_DATE">
expj.AD0030020.AD0030021form2.h_BUSINESS_OPR_DATE = {};
expj.AD0030020.AD0030021form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AD0030020.AD0030021form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC" name="h_WORK_ODR_DLV_DATE_BY_PROC" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_WORK_ODR_DLV_DATE_BY_PROC()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC">
expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC = {};
expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_WORK_ODR_DLV_DATE_BY_PROC.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_WORK_ODR_DLV_DATE_BY_PROC', this);
  });
  expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_WORK_ODR_DLV_DATE_BY_PROC.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE_7",rb)%></span><!-- 系列別製造着手日 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC">
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC.onDecision0 = function () {
  console.log('OPR_INST_START_DATE_BY_PROC script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC.child0 = function () {
  console.log('OPR_INST_START_DATE_BY_PROC script2');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021form2', '_SelectUnitCostFlag', 'false');
};
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/OPR_INST_START_DATE_BY_PROC.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC['onDecision' + i])) {
        expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC['onDecision' + i]();
      }
    }
  }
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'OPR_INST_START_DATE_BY_PROC', this);
  });
  expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/OPR_INST_START_DATE_BY_PROC.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC" name="OPR_INST_START_DATE_BY_PROC" class="AD0030020-focus-move  required-value expj-AD0030020-required-B" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_START_DATE_BY_PROC()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-CalendarOprInstStartDateByProc">
expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc = {};
// script1="onClick;0;CALENDAR;_AD0030021form2/OPR_INST_START_DATE_BY_PROC"
expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc.onClick0 = function () {
  console.log('CalendarOprInstStartDateByProc script1');
expj.common.pscript.executeCalendar('AD0030020','AD0030021form2','_AD0030021form2/OPR_INST_START_DATE_BY_PROC');
};
expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc['onClick' + i])) {
        expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-CalendarOprInstStartDateByProc').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021form2', 'CalendarOprInstStartDateByProc', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0030020','AD0030021form2','_AD0030021form2/OPR_INST_START_DATE_BY_PROC');
  expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/CalendarOprInstStartDateByProc.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-CalendarOprInstStartDateByProc');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030020-AD0030021form2-CalendarOprInstStartDateByProc" class="AD0030020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC_TIME">
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME.onDecision0 = function () {
  console.log('OPR_INST_START_DATE_BY_PROC_TIME script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME.child0 = function () {
  console.log('OPR_INST_START_DATE_BY_PROC_TIME script2');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021form2', '_SelectUnitCostFlag', 'false');
};
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME['onDecision' + i])) {
        expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME['onDecision' + i]();
      }
    }
  }
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'OPR_INST_START_DATE_BY_PROC_TIME', this);
  });
  expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-OPR_INST_START_DATE_BY_PROC_TIME" name="OPR_INST_START_DATE_BY_PROC_TIME" class="AD0030020-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_START_DATE_BY_PROC_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_ODR_START_DATE" name="h_ODR_START_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_ODR_START_DATE()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_ODR_START_DATE">
expj.AD0030020.AD0030021form2.h_ODR_START_DATE = {};
expj.AD0030020.AD0030021form2.h_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_ODR_START_DATE.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_ODR_START_DATE', this);
  });
  expj.AD0030020.AD0030021form2.h_ODR_START_DATE.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC" name="h_OPR_INST_START_DATE_BY_PROC" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_OPR_INST_START_DATE_BY_PROC()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC">
expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC = {};
expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_OPR_INST_START_DATE_BY_PROC.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_OPR_INST_START_DATE_BY_PROC', this);
  });
  expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_OPR_INST_START_DATE_BY_PROC.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_QTY",rb)%></span><!-- 作業指示数 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-OPR_INST_QTY">
expj.AD0030020.AD0030021form2.OPR_INST_QTY = {};
expj.AD0030020.AD0030021form2.OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/OPR_INST_QTY.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'OPR_INST_QTY', this);
  });
  expj.AD0030020.AD0030021form2.OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-OPR_INST_QTY" name="OPR_INST_QTY" class="AD0030020-focus-move  required-value expj-AD0030020-required-B" style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0030020Struct.geth_UNIT_QTY_TYP(), Kind.P, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-STOCK_UNIT">
expj.AD0030020.AD0030021form2.STOCK_UNIT = {};
expj.AD0030020.AD0030021form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/STOCK_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'STOCK_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-STOCK_UNIT" name="STOCK_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_PARENT_OD_NO" name="h_PARENT_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_PARENT_OD_NO()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_PARENT_OD_NO">
expj.AD0030020.AD0030021form2.h_PARENT_OD_NO = {};
expj.AD0030020.AD0030021form2.h_PARENT_OD_NO.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_PARENT_OD_NO.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_PARENT_OD_NO.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_PARENT_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_PARENT_OD_NO', this);
  });
  expj.AD0030020.AD0030021form2.h_PARENT_OD_NO.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_PARENT_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_PARENT_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_PARENT_OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_UNIT_QTY_TYP" name="h_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_UNIT_QTY_TYP()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_UNIT_QTY_TYP">
expj.AD0030020.AD0030021form2.h_UNIT_QTY_TYP = {};
expj.AD0030020.AD0030021form2.h_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_UNIT_QTY_TYP.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_UNIT_QTY_TYP', this);
  });
  expj.AD0030020.AD0030021form2.h_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_OPR_INST_QTY" name="h_OPR_INST_QTY" class="" data-kind="OBT_NUMBER;14.1;CEIL;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_OPR_INST_QTY()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_OPR_INST_QTY">
expj.AD0030020.AD0030021form2.h_OPR_INST_QTY = {};
expj.AD0030020.AD0030021form2.h_OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_OPR_INST_QTY.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_OPR_INST_QTY', this);
  });
  expj.AD0030020.AD0030021form2.h_OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-OUTSIDE_TYP">
expj.AD0030020.AD0030021form2.OUTSIDE_TYP = {};
// script1="onDecision;0;CHK;_THIS[eq]1@*0,*2"
expj.AD0030020.AD0030021form2.OUTSIDE_TYP.onDecision0 = function () {
  console.log('OUTSIDE_TYP script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_THIS'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;0;UNMASK;_WS_CD,_PeekerWsCd@*1"
expj.AD0030020.AD0030021form2.OUTSIDE_TYP.child0 = function () {
  console.log('OUTSIDE_TYP script2');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_WS_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_PeekerWsCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;MASK;_SelectUnitCost,_VEND_CD,_PeekerVendCd,_ACPT_INSPC_TYP,_UNIT_COST_TYP,_UNIT_COST,_PROCESSING_COST,_MATERIAL_COST,_OTHER_OVERHEADS,_DISC_AMOUNT"
expj.AD0030020.AD0030021form2.OUTSIDE_TYP.child1 = function () {
  console.log('OUTSIDE_TYP script3');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_SelectUnitCost');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_VEND_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_PeekerVendCd');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_ACPT_INSPC_TYP');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_UNIT_COST_TYP');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_UNIT_COST');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_PROCESSING_COST');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_MATERIAL_COST');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_OTHER_OVERHEADS');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_DISC_AMOUNT');
};
// script4="child;2;MASK;_WS_CD,_PeekerWsCd@*3"
expj.AD0030020.AD0030021form2.OUTSIDE_TYP.child2 = function () {
  console.log('OUTSIDE_TYP script4');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_WS_CD');
expj.common.pscript.setMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_PeekerWsCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;UNMASK;_SelectUnitCost,_VEND_CD,_PeekerVendCd,_ACPT_INSPC_TYP,_UNIT_COST_TYP,_UNIT_COST,_PROCESSING_COST,_MATERIAL_COST,_OTHER_OVERHEADS,_DISC_AMOUNT"
expj.AD0030020.AD0030021form2.OUTSIDE_TYP.child3 = function () {
  console.log('OUTSIDE_TYP script5');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_SelectUnitCost');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_VEND_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_PeekerVendCd');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_ACPT_INSPC_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_UNIT_COST_TYP');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_UNIT_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_PROCESSING_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_MATERIAL_COST');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_OTHER_OVERHEADS');
expj.common.pscript.setUnMaskToReferenceComponent('AD0030020', 'AD0030021form2', '_DISC_AMOUNT');
};
expj.AD0030020.AD0030021form2.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/OUTSIDE_TYP.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.OUTSIDE_TYP['onDecision' + i])) {
        expj.AD0030020.AD0030021form2.OUTSIDE_TYP['onDecision' + i]();
      }
    }
  }
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0030020', 'AD0030021form2', 'OUTSIDE_TYP', this);
  });
  expj.AD0030020.AD0030021form2.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0030020-AD0030021form2-OUTSIDE_TYP" name='OUTSIDE_TYP' class='AD0030020-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0030020Control.getStruct().getList_OUTSIDE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0030020Control.getStruct().getList_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0030020Control.getStruct().getList_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0030020Struct.getOUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_JOB_ODR_CD" name="h_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_JOB_ODR_CD()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_JOB_ODR_CD">
expj.AD0030020.AD0030021form2.h_JOB_ODR_CD = {};
expj.AD0030020.AD0030021form2.h_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_JOB_ODR_CD.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_JOB_ODR_CD', this);
  });
  expj.AD0030020.AD0030021form2.h_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_JOB_ODR_CANCEL_NO" name="h_JOB_ODR_CANCEL_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_JOB_ODR_CANCEL_NO()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_JOB_ODR_CANCEL_NO">
expj.AD0030020.AD0030021form2.h_JOB_ODR_CANCEL_NO = {};
expj.AD0030020.AD0030021form2.h_JOB_ODR_CANCEL_NO.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_JOB_ODR_CANCEL_NO.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_JOB_ODR_CANCEL_NO.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_JOB_ODR_CANCEL_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_JOB_ODR_CANCEL_NO', this);
  });
  expj.AD0030020.AD0030021form2.h_JOB_ODR_CANCEL_NO.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_JOB_ODR_CANCEL_NO.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_JOB_ODR_CANCEL_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_JOB_ODR_CANCEL_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-WS_CD">
expj.AD0030020.AD0030021form2.WS_CD = {};
expj.AD0030020.AD0030021form2.WS_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/WS_CD.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.WS_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'WS_CD', this);
  });
  expj.AD0030020.AD0030021form2.WS_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-WS_CD" name="WS_CD" class="AD0030020-focus-move  required-value expj-AD0030020-required-C" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_PLANT_CD" name="h_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_PLANT_CD()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_PLANT_CD">
expj.AD0030020.AD0030021form2.h_PLANT_CD = {};
expj.AD0030020.AD0030021form2.h_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_PLANT_CD.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_PLANT_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_PLANT_CD', this);
  });
  expj.AD0030020.AD0030021form2.h_PLANT_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<script class="expj-script-AD0030020-AD0030021form2-PeekerWsCd">
expj.AD0030020.AD0030021form2.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AD0030021form2/WS_CD@<%=contextNo%>"
expj.AD0030020.AD0030021form2.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030020';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AD0030020', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAD0030020Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030021form2/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030020.AD0030021form2.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.PeekerWsCd['onClick' + i])) {
        expj.AD0030020.AD0030021form2.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021form2.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021form2.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021form2', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AD0030020.AD0030021form2.PeekerWsCd.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030020-AD0030021form2-PeekerWsCd" class="AD0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-WS_NAME">
expj.AD0030020.AD0030021form2.WS_NAME = {};
expj.AD0030020.AD0030021form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/WS_NAME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.WS_NAME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'WS_NAME', this);
  });
  expj.AD0030020.AD0030021form2.WS_NAME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-WS_NAME" name="WS_NAME" class="AD0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWS_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_ODR_START_DATE_TIME" name="h_ODR_START_DATE_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_ODR_START_DATE_TIME()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_ODR_START_DATE_TIME">
expj.AD0030020.AD0030021form2.h_ODR_START_DATE_TIME = {};
expj.AD0030020.AD0030021form2.h_ODR_START_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_ODR_START_DATE_TIME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_ODR_START_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_ODR_START_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_ODR_START_DATE_TIME', this);
  });
  expj.AD0030020.AD0030021form2.h_ODR_START_DATE_TIME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_ODR_START_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_ODR_START_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_ODR_START_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC_TIME" name="h_WORK_ODR_DLV_DATE_BY_PROC_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_WORK_ODR_DLV_DATE_BY_PROC_TIME()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC_TIME">
expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC_TIME = {};
expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_WORK_ODR_DLV_DATE_BY_PROC_TIME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC_TIME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_WORK_ODR_DLV_DATE_BY_PROC_TIME', this);
  });
  expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC_TIME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_WORK_ODR_DLV_DATE_BY_PROC_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_WORK_ODR_DLV_DATE_BY_PROC_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_CD",rb)%></span><!-- 作業指示番号 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-OPR_INST_CD">
expj.AD0030020.AD0030021form2.OPR_INST_CD = {};
expj.AD0030020.AD0030021form2.OPR_INST_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/OPR_INST_CD.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.OPR_INST_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-OPR_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'OPR_INST_CD', this);
  });
  expj.AD0030020.AD0030021form2.OPR_INST_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.OPR_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/OPR_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-OPR_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-OPR_INST_CD" name="OPR_INST_CD" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getOPR_INST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC_TIME" name="h_OPR_INST_START_DATE_BY_PROC_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_OPR_INST_START_DATE_BY_PROC_TIME()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC_TIME">
expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC_TIME = {};
expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC_TIME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_OPR_INST_START_DATE_BY_PROC_TIME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC_TIME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_OPR_INST_START_DATE_BY_PROC_TIME', this);
  });
  expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC_TIME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_OPR_INST_START_DATE_BY_PROC_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_OPR_INST_START_DATE_BY_PROC_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-VEND_CD">
expj.AD0030020.AD0030021form2.VEND_CD = {};
// script1="onDecision;0;CHK;?THIS[eq]DIFFER@*0"
expj.AD0030020.AD0030021form2.VEND_CD.onDecision0 = function () {
  console.log('VEND_CD script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '?THIS'), '[eq]', 'DIFFER')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SET;_SelectUnitCostFlag=false"
expj.AD0030020.AD0030021form2.VEND_CD.child0 = function () {
  console.log('VEND_CD script2');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021form2', '_SelectUnitCostFlag', 'false');
};
expj.AD0030020.AD0030021form2.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/VEND_CD.onDecision');
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.VEND_CD['onDecision' + i])) {
        expj.AD0030020.AD0030021form2.VEND_CD['onDecision' + i]();
      }
    }
  }
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.VEND_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'VEND_CD', this);
  });
  expj.AD0030020.AD0030021form2.VEND_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-VEND_CD" name="VEND_CD" class="AD0030020-focus-move  required-value expj-AD0030020-required-D" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-PeekerVendCd">
expj.AD0030020.AD0030021form2.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AD0030021form2/VEND_CD@<%=contextNo%>"
expj.AD0030020.AD0030021form2.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AD0030020';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AD0030021form2/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AD0030020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AD0030020.AD0030021form2.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.PeekerVendCd['onClick' + i])) {
        expj.AD0030020.AD0030021form2.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021form2.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021form2.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021form2', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AD0030020.AD0030021form2.PeekerVendCd.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0030020-AD0030021form2-PeekerVendCd" class="AD0030020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-VEND_ANAME">
expj.AD0030020.AD0030021form2.VEND_ANAME = {};
expj.AD0030020.AD0030021form2.VEND_ANAME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/VEND_ANAME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.VEND_ANAME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-VEND_ANAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'VEND_ANAME', this);
  });
  expj.AD0030020.AD0030021form2.VEND_ANAME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.VEND_ANAME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/VEND_ANAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-VEND_ANAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-VEND_ANAME" name="VEND_ANAME" class="AD0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_ANAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_COMPANY_CD" name="h_COMPANY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_COMPANY_CD()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_COMPANY_CD">
expj.AD0030020.AD0030021form2.h_COMPANY_CD = {};
expj.AD0030020.AD0030021form2.h_COMPANY_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_COMPANY_CD.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_COMPANY_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_COMPANY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_COMPANY_CD', this);
  });
  expj.AD0030020.AD0030021form2.h_COMPANY_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_COMPANY_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_COMPANY_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_COMPANY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_INSPC_TYP",rb)%></span><!-- 受入検査区分 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-ACPT_INSPC_TYP">
expj.AD0030020.AD0030021form2.ACPT_INSPC_TYP = {};
expj.AD0030020.AD0030021form2.ACPT_INSPC_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/ACPT_INSPC_TYP.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.ACPT_INSPC_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-ACPT_INSPC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0030020', 'AD0030021form2', 'ACPT_INSPC_TYP', this);
  });
  expj.AD0030020.AD0030021form2.ACPT_INSPC_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.ACPT_INSPC_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/ACPT_INSPC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-ACPT_INSPC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0030020-AD0030021form2-ACPT_INSPC_TYP" name='ACPT_INSPC_TYP' class='AD0030020-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0030020Control.getStruct().getList_ACPT_INSPC_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0030020Control.getStruct().getList_ACPT_INSPC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0030020Control.getStruct().getList_ACPT_INSPC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0030020Struct.getACPT_INSPC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_CD_1",rb)%></span><!-- 取引通貨コード --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-CUR_CD">
expj.AD0030020.AD0030021form2.CUR_CD = {};
expj.AD0030020.AD0030021form2.CUR_CD.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/CUR_CD.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.CUR_CD.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'CUR_CD', this);
  });
  expj.AD0030020.AD0030021form2.CUR_CD.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-CUR_CD" name="CUR_CD" class="AD0030020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getCUR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-CUR_NAME">
expj.AD0030020.AD0030021form2.CUR_NAME = {};
expj.AD0030020.AD0030021form2.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/CUR_NAME.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.CUR_NAME.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'CUR_NAME', this);
  });
  expj.AD0030020.AD0030021form2.CUR_NAME.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-CUR_NAME" name="CUR_NAME" class="AD0030020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getCUR_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)%></span><!-- 単価区分 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-UNIT_COST_TYP">
expj.AD0030020.AD0030021form2.UNIT_COST_TYP = {};
expj.AD0030020.AD0030021form2.UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/UNIT_COST_TYP.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-UNIT_COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0030020', 'AD0030021form2', 'UNIT_COST_TYP', this);
  });
  expj.AD0030020.AD0030021form2.UNIT_COST_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0030020-AD0030021form2-UNIT_COST_TYP" name='UNIT_COST_TYP' class='AD0030020-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0030020Control.getStruct().getList_UNIT_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0030020Control.getStruct().getList_UNIT_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0030020Control.getStruct().getList_UNIT_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0030020Struct.getUNIT_COST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-SelectUnitCost">
expj.AD0030020.AD0030021form2.SelectUnitCost = {};
// script1="onClick;0;CHK;_OUTSIDE_TYP[eq]1@#AD00041"
expj.AD0030020.AD0030021form2.SelectUnitCost.onClick0 = function () {
  console.log('SelectUnitCost script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_OUTSIDE_TYP'), '[eq]', '1')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021form2', 'AD00041');
}
};
// script2="onClick;1;CHK;_WORK_IN_PROC_CD[eq]@#AD00101"
expj.AD0030020.AD0030021form2.SelectUnitCost.onClick1 = function () {
  console.log('SelectUnitCost script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_WORK_IN_PROC_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021form2', 'AD00101');
}
};
// script3="onClick;2;CHK;_WORK_ODR_DLV_DATE_BY_PROC[eq]@#AD20071"
expj.AD0030020.AD0030021form2.SelectUnitCost.onClick2 = function () {
  console.log('SelectUnitCost script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_WORK_ODR_DLV_DATE_BY_PROC'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021form2', 'AD20071');
}
};
// script4="onClick;3;CHK;_OPR_INST_START_DATE_BY_PROC[eq]@#AD20072"
expj.AD0030020.AD0030021form2.SelectUnitCost.onClick3 = function () {
  console.log('SelectUnitCost script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_OPR_INST_START_DATE_BY_PROC'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021form2', 'AD20072');
}
};
// script5="onClick;4;CHK;_VEND_CD[eq]@#AD20023"
expj.AD0030020.AD0030021form2.SelectUnitCost.onClick4 = function () {
  console.log('SelectUnitCost script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_VEND_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021form2', 'AD20023');
}
};
// script6="onClick;5;CHK;_OPR_INST_QTY[lte]0@#AD30222"
expj.AD0030020.AD0030021form2.SelectUnitCost.onClick5 = function () {
  console.log('SelectUnitCost script6');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021form2', '_OPR_INST_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021form2', 'AD30222');
}
};
// script7="onClick;6;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AD0030021form1/*,_AD0030021form2/*@AD0030020Servlet"
expj.AD0030020.AD0030021form2.SelectUnitCost.onClick6 = function () {
  console.log('SelectUnitCost script7');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030021form2', '_AD0030021form1/*,_AD0030021form2/*', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.updateBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AD0030020.AD0030021form2.SelectUnitCost.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 6; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021form2.SelectUnitCost['onClick' + i])) {
        expj.AD0030020.AD0030021form2.SelectUnitCost['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021form2.SelectUnitCost.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021form2.SelectUnitCost.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-SelectUnitCost').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021form2', 'SelectUnitCost', this, 'Button');
    }
  });
  expj.AD0030020.AD0030021form2.SelectUnitCost.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.SelectUnitCost.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/SelectUnitCost.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-SelectUnitCost');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><button type="button" id="expj-AD0030020-AD0030021form2-SelectUnitCost" name="SelectUnitCost" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnSelectUnitCost",rb)%></button><!-- 単価読込ボタン --></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-SelectUnitCostFlag" name="SelectUnitCostFlag" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getSelectUnitCostFlag()) %>">
<script class="expj-script-AD0030020-AD0030021form2-SelectUnitCostFlag">
expj.AD0030020.AD0030021form2.SelectUnitCostFlag = {};
expj.AD0030020.AD0030021form2.SelectUnitCostFlag.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/SelectUnitCostFlag.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.SelectUnitCostFlag.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-SelectUnitCostFlag').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'SelectUnitCostFlag', this);
  });
  expj.AD0030020.AD0030021form2.SelectUnitCostFlag.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.SelectUnitCostFlag.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/SelectUnitCostFlag.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-SelectUnitCostFlag');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-UNIT_COST">
expj.AD0030020.AD0030021form2.UNIT_COST = {};
expj.AD0030020.AD0030021form2.UNIT_COST.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/UNIT_COST.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.UNIT_COST.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'UNIT_COST', this);
  });
  expj.AD0030020.AD0030021form2.UNIT_COST.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-UNIT_COST" name="UNIT_COST" class="AD0030020-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getUNIT_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-VEND_CUR_UNIT" name="VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_UNIT_COST_TYP" name="h_UNIT_COST_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_UNIT_COST_TYP()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_UNIT_COST_TYP">
expj.AD0030020.AD0030021form2.h_UNIT_COST_TYP = {};
expj.AD0030020.AD0030021form2.h_UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_UNIT_COST_TYP.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_UNIT_COST_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_UNIT_COST_TYP', this);
  });
  expj.AD0030020.AD0030021form2.h_UNIT_COST_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_VEND_DECIMAL_FIG" name="h_VEND_DECIMAL_FIG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_VEND_DECIMAL_FIG()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_VEND_DECIMAL_FIG">
expj.AD0030020.AD0030021form2.h_VEND_DECIMAL_FIG = {};
expj.AD0030020.AD0030021form2.h_VEND_DECIMAL_FIG.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_VEND_DECIMAL_FIG.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_VEND_DECIMAL_FIG.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_VEND_DECIMAL_FIG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_VEND_DECIMAL_FIG', this);
  });
  expj.AD0030020.AD0030021form2.h_VEND_DECIMAL_FIG.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_VEND_DECIMAL_FIG.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_VEND_DECIMAL_FIG.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_VEND_DECIMAL_FIG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_HOME_DECIMAL_FIG" name="h_HOME_DECIMAL_FIG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_HOME_DECIMAL_FIG()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_HOME_DECIMAL_FIG">
expj.AD0030020.AD0030021form2.h_HOME_DECIMAL_FIG = {};
expj.AD0030020.AD0030021form2.h_HOME_DECIMAL_FIG.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_HOME_DECIMAL_FIG.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_HOME_DECIMAL_FIG.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_HOME_DECIMAL_FIG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_HOME_DECIMAL_FIG', this);
  });
  expj.AD0030020.AD0030021form2.h_HOME_DECIMAL_FIG.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_HOME_DECIMAL_FIG.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_HOME_DECIMAL_FIG.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_HOME_DECIMAL_FIG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROCESSING_COST",rb)%></span><!-- 加工費 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-PROCESSING_COST">
expj.AD0030020.AD0030021form2.PROCESSING_COST = {};
expj.AD0030020.AD0030021form2.PROCESSING_COST.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/PROCESSING_COST.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.PROCESSING_COST.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-PROCESSING_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'PROCESSING_COST', this);
  });
  expj.AD0030020.AD0030021form2.PROCESSING_COST.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.PROCESSING_COST.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/PROCESSING_COST.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-PROCESSING_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-PROCESSING_COST" name="PROCESSING_COST" class="AD0030020-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getPROCESSING_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d1_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d1_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d1_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d1_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d1_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d1_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd1_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d1_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d1_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d1_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d1_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d1_VEND_CUR_UNIT" name="d1_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0707",rb)%></span><!-- 消費税 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-TAX_AMOUNT_1">
expj.AD0030020.AD0030021form2.TAX_AMOUNT_1 = {};
expj.AD0030020.AD0030021form2.TAX_AMOUNT_1.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/TAX_AMOUNT_1.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.TAX_AMOUNT_1.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-TAX_AMOUNT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'TAX_AMOUNT_1', this);
  });
  expj.AD0030020.AD0030021form2.TAX_AMOUNT_1.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.TAX_AMOUNT_1.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/TAX_AMOUNT_1.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-TAX_AMOUNT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-TAX_AMOUNT_1" name="TAX_AMOUNT_1" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_VEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getTAX_AMOUNT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d2_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d2_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d2_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d2_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d2_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d2_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd2_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d2_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d2_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d2_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d2_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d2_VEND_CUR_UNIT" name="d2_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_TAX_RATE_1" name="h_TAX_RATE_1" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_TAX_RATE_1()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_TAX_RATE_1">
expj.AD0030020.AD0030021form2.h_TAX_RATE_1 = {};
expj.AD0030020.AD0030021form2.h_TAX_RATE_1.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_TAX_RATE_1.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_TAX_RATE_1.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_TAX_RATE_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_TAX_RATE_1', this);
  });
  expj.AD0030020.AD0030021form2.h_TAX_RATE_1.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_TAX_RATE_1.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_TAX_RATE_1.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_TAX_RATE_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MATERIAL_COST",rb)%></span><!-- 材料費 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-MATERIAL_COST">
expj.AD0030020.AD0030021form2.MATERIAL_COST = {};
expj.AD0030020.AD0030021form2.MATERIAL_COST.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/MATERIAL_COST.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.MATERIAL_COST.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-MATERIAL_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'MATERIAL_COST', this);
  });
  expj.AD0030020.AD0030021form2.MATERIAL_COST.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.MATERIAL_COST.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/MATERIAL_COST.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-MATERIAL_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-MATERIAL_COST" name="MATERIAL_COST" class="AD0030020-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getMATERIAL_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d3_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d3_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d3_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d3_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d3_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d3_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd3_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d3_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d3_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d3_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d3_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d3_VEND_CUR_UNIT" name="d3_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0708",rb)%></span><!-- 取引税 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-TAX_AMOUNT_2">
expj.AD0030020.AD0030021form2.TAX_AMOUNT_2 = {};
expj.AD0030020.AD0030021form2.TAX_AMOUNT_2.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/TAX_AMOUNT_2.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.TAX_AMOUNT_2.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-TAX_AMOUNT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'TAX_AMOUNT_2', this);
  });
  expj.AD0030020.AD0030021form2.TAX_AMOUNT_2.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.TAX_AMOUNT_2.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/TAX_AMOUNT_2.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-TAX_AMOUNT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-TAX_AMOUNT_2" name="TAX_AMOUNT_2" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_VEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getTAX_AMOUNT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d4_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d4_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d4_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d4_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d4_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d4_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd4_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d4_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d4_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d4_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d4_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d4_VEND_CUR_UNIT" name="d4_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_TAX_RATE_2" name="h_TAX_RATE_2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_TAX_RATE_2()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_TAX_RATE_2">
expj.AD0030020.AD0030021form2.h_TAX_RATE_2 = {};
expj.AD0030020.AD0030021form2.h_TAX_RATE_2.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_TAX_RATE_2.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_TAX_RATE_2.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_TAX_RATE_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_TAX_RATE_2', this);
  });
  expj.AD0030020.AD0030021form2.h_TAX_RATE_2.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_TAX_RATE_2.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_TAX_RATE_2.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_TAX_RATE_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OTHER_OVERHEADS",rb)%></span><!-- その他経費 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-OTHER_OVERHEADS">
expj.AD0030020.AD0030021form2.OTHER_OVERHEADS = {};
expj.AD0030020.AD0030021form2.OTHER_OVERHEADS.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/OTHER_OVERHEADS.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.OTHER_OVERHEADS.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-OTHER_OVERHEADS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'OTHER_OVERHEADS', this);
  });
  expj.AD0030020.AD0030021form2.OTHER_OVERHEADS.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.OTHER_OVERHEADS.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/OTHER_OVERHEADS.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-OTHER_OVERHEADS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-OTHER_OVERHEADS" name="OTHER_OVERHEADS" class="AD0030020-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getOTHER_OVERHEADS()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d5_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d5_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d5_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d5_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d5_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d5_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd5_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d5_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d5_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d5_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d5_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d5_VEND_CUR_UNIT" name="d5_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0709",rb)%></span><!-- その他税 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-TAX_AMOUNT_3">
expj.AD0030020.AD0030021form2.TAX_AMOUNT_3 = {};
expj.AD0030020.AD0030021form2.TAX_AMOUNT_3.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/TAX_AMOUNT_3.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.TAX_AMOUNT_3.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-TAX_AMOUNT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'TAX_AMOUNT_3', this);
  });
  expj.AD0030020.AD0030021form2.TAX_AMOUNT_3.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.TAX_AMOUNT_3.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/TAX_AMOUNT_3.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-TAX_AMOUNT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-TAX_AMOUNT_3" name="TAX_AMOUNT_3" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_VEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getTAX_AMOUNT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d6_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d6_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d6_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d6_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d6_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d6_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd6_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d6_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d6_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d6_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d6_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d6_VEND_CUR_UNIT" name="d6_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_TAX_RATE_3" name="h_TAX_RATE_3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_TAX_RATE_3()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_TAX_RATE_3">
expj.AD0030020.AD0030021form2.h_TAX_RATE_3 = {};
expj.AD0030020.AD0030021form2.h_TAX_RATE_3.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_TAX_RATE_3.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_TAX_RATE_3.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_TAX_RATE_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_TAX_RATE_3', this);
  });
  expj.AD0030020.AD0030021form2.h_TAX_RATE_3.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_TAX_RATE_3.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_TAX_RATE_3.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_TAX_RATE_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2",rb)%></span><!-- 発注金額 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-PUCH_ODR_AMOUNT">
expj.AD0030020.AD0030021form2.PUCH_ODR_AMOUNT = {};
expj.AD0030020.AD0030021form2.PUCH_ODR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/PUCH_ODR_AMOUNT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.PUCH_ODR_AMOUNT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-PUCH_ODR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'PUCH_ODR_AMOUNT', this);
  });
  expj.AD0030020.AD0030021form2.PUCH_ODR_AMOUNT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.PUCH_ODR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/PUCH_ODR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-PUCH_ODR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-PUCH_ODR_AMOUNT" name="PUCH_ODR_AMOUNT" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_VEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getPUCH_ODR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d7_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d7_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d7_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d7_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d7_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d7_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd7_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d7_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d7_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d7_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d7_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d7_VEND_CUR_UNIT" name="d7_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX",rb)%></span><!-- 税込金額 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-AMOUNT_INCLUDE_TAX">
expj.AD0030020.AD0030021form2.AMOUNT_INCLUDE_TAX = {};
expj.AD0030020.AD0030021form2.AMOUNT_INCLUDE_TAX.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/AMOUNT_INCLUDE_TAX.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.AMOUNT_INCLUDE_TAX.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-AMOUNT_INCLUDE_TAX').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'AMOUNT_INCLUDE_TAX', this);
  });
  expj.AD0030020.AD0030021form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.AMOUNT_INCLUDE_TAX.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/AMOUNT_INCLUDE_TAX.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-AMOUNT_INCLUDE_TAX');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-AMOUNT_INCLUDE_TAX" name="AMOUNT_INCLUDE_TAX" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_VEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getAMOUNT_INCLUDE_TAX()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d8_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d8_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d8_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d8_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d8_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d8_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd8_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d8_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d8_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d8_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d8_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d8_VEND_CUR_UNIT" name="d8_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DISC_AMOUNT",rb)%></span><!-- 値引金額 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-DISC_AMOUNT">
expj.AD0030020.AD0030021form2.DISC_AMOUNT = {};
expj.AD0030020.AD0030021form2.DISC_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/DISC_AMOUNT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.DISC_AMOUNT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-DISC_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'DISC_AMOUNT', this);
  });
  expj.AD0030020.AD0030021form2.DISC_AMOUNT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.DISC_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/DISC_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-DISC_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-DISC_AMOUNT" name="DISC_AMOUNT" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_VEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getDISC_AMOUNT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d9_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d9_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d9_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d9_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d9_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d9_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd9_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d9_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d9_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d9_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d9_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d9_VEND_CUR_UNIT" name="d9_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HOME_CUR_AMOUNT",rb)%></span><!-- 邦貨金額 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-PROVISIONAL_HOME_CUR_AMOUNT">
expj.AD0030020.AD0030021form2.PROVISIONAL_HOME_CUR_AMOUNT = {};
expj.AD0030020.AD0030021form2.PROVISIONAL_HOME_CUR_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/PROVISIONAL_HOME_CUR_AMOUNT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.PROVISIONAL_HOME_CUR_AMOUNT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-PROVISIONAL_HOME_CUR_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'PROVISIONAL_HOME_CUR_AMOUNT', this);
  });
  expj.AD0030020.AD0030021form2.PROVISIONAL_HOME_CUR_AMOUNT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.PROVISIONAL_HOME_CUR_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/PROVISIONAL_HOME_CUR_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-PROVISIONAL_HOME_CUR_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-PROVISIONAL_HOME_CUR_AMOUNT" name="PROVISIONAL_HOME_CUR_AMOUNT" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_HOME_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getPROVISIONAL_HOME_CUR_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-HOME_CUR_UNIT">
expj.AD0030020.AD0030021form2.HOME_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/HOME_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'HOME_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-HOME_CUR_UNIT" name="HOME_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.NET_AMOUNT_3",rb)%></span><!-- 値引後金額 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-AFTER_DISC_AMOUNT">
expj.AD0030020.AD0030021form2.AFTER_DISC_AMOUNT = {};
expj.AD0030020.AD0030021form2.AFTER_DISC_AMOUNT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/AFTER_DISC_AMOUNT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.AFTER_DISC_AMOUNT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-AFTER_DISC_AMOUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'AFTER_DISC_AMOUNT', this);
  });
  expj.AD0030020.AD0030021form2.AFTER_DISC_AMOUNT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.AFTER_DISC_AMOUNT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/AFTER_DISC_AMOUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-AFTER_DISC_AMOUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-AFTER_DISC_AMOUNT" name="AFTER_DISC_AMOUNT" class="AD0030020-focus-move expj-align-right " style="width:150px;" data-kind="<%=Kind.convertNumeric(Kind.NUMBER, Kind.Z, 14, 2, aAD0030020Struct.getROUND_TYP(), aAD0030020Struct.geth_VEND_DECIMAL_FIG())%>" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getAFTER_DISC_AMOUNT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d10_VEND_CUR_UNIT">
expj.AD0030020.AD0030021form2.d10_VEND_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d10_VEND_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d10_VEND_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d10_VEND_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d10_VEND_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd10_VEND_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d10_VEND_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d10_VEND_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d10_VEND_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d10_VEND_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d10_VEND_CUR_UNIT" name="d10_VEND_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getVEND_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.EXCH_RATE",rb)%></span><!-- 為替レート --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-EXCH_RATE">
expj.AD0030020.AD0030021form2.EXCH_RATE = {};
expj.AD0030020.AD0030021form2.EXCH_RATE.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/EXCH_RATE.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.EXCH_RATE.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-EXCH_RATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'EXCH_RATE', this);
  });
  expj.AD0030020.AD0030021form2.EXCH_RATE.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.EXCH_RATE.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/EXCH_RATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-EXCH_RATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-EXCH_RATE" name="EXCH_RATE" class="AD0030020-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;16.2;CEIL;6" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getEXCH_RATE()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-d_HOME_CUR_UNIT">
expj.AD0030020.AD0030021form2.d_HOME_CUR_UNIT = {};
expj.AD0030020.AD0030021form2.d_HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/d_HOME_CUR_UNIT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.d_HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-d_HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'd_HOME_CUR_UNIT', this);
  });
  expj.AD0030020.AD0030021form2.d_HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.d_HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/d_HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-d_HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-d_HOME_CUR_UNIT" name="d_HOME_CUR_UNIT" class="AD0030020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getHOME_CUR_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0030020-AD0030021form2-TIME_CTRL">
expj.AD0030020.AD0030021form2.TIME_CTRL = {};
expj.AD0030020.AD0030021form2.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/TIME_CTRL.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'TIME_CTRL', this);
  });
  expj.AD0030020.AD0030021form2.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_IN_PROC_COMMENT_3",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021form2-WORK_IN_PROC_COMMENT">
expj.AD0030020.AD0030021form2.WORK_IN_PROC_COMMENT = {};
expj.AD0030020.AD0030021form2.WORK_IN_PROC_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/WORK_IN_PROC_COMMENT.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.WORK_IN_PROC_COMMENT.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-WORK_IN_PROC_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'WORK_IN_PROC_COMMENT', this);
  });
  expj.AD0030020.AD0030021form2.WORK_IN_PROC_COMMENT.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.WORK_IN_PROC_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/WORK_IN_PROC_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-WORK_IN_PROC_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:624px;text-align:left;"><input type="text" id="expj-AD0030020-AD0030021form2-WORK_IN_PROC_COMMENT" name="WORK_IN_PROC_COMMENT" class="AD0030020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0030020Struct.getWORK_IN_PROC_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_MANHOUR_TYP" name="h_MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_MANHOUR_TYP()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_MANHOUR_TYP">
expj.AD0030020.AD0030021form2.h_MANHOUR_TYP = {};
expj.AD0030020.AD0030021form2.h_MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_MANHOUR_TYP.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_MANHOUR_TYP', this);
  });
  expj.AD0030020.AD0030021form2.h_MANHOUR_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_WORK_STS_TYP" name="h_WORK_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_WORK_STS_TYP()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_WORK_STS_TYP">
expj.AD0030020.AD0030021form2.h_WORK_STS_TYP = {};
expj.AD0030020.AD0030021form2.h_WORK_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_WORK_STS_TYP.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_WORK_STS_TYP.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_WORK_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_WORK_STS_TYP', this);
  });
  expj.AD0030020.AD0030021form2.h_WORK_STS_TYP.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_WORK_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_WORK_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_WORK_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_OD_NO" name="h_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_OD_NO()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_OD_NO">
expj.AD0030020.AD0030021form2.h_OD_NO = {};
expj.AD0030020.AD0030021form2.h_OD_NO.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_OD_NO.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_OD_NO.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_OD_NO', this);
  });
  expj.AD0030020.AD0030021form2.h_OD_NO.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_ITEM" name="h_MODIFY_COUNT_BY_ITEM" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_MODIFY_COUNT_BY_ITEM()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_ITEM">
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_ITEM = {};
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_ITEM.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_MODIFY_COUNT_BY_ITEM.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_ITEM.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_ITEM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_MODIFY_COUNT_BY_ITEM', this);
  });
  expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_ITEM.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_ITEM.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_MODIFY_COUNT_BY_ITEM.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_ITEM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_PROC" name="h_MODIFY_COUNT_BY_PROC" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_MODIFY_COUNT_BY_PROC()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_PROC">
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_PROC = {};
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_PROC.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_MODIFY_COUNT_BY_PROC.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_PROC.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_PROC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_MODIFY_COUNT_BY_PROC', this);
  });
  expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_PROC.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_PROC.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_MODIFY_COUNT_BY_PROC.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_BY_PROC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_OPR_INST" name="h_MODIFY_COUNT_OPR_INST" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0030020Struct.geth_MODIFY_COUNT_OPR_INST()) %>">
<script class="expj-script-AD0030020-AD0030021form2-h_MODIFY_COUNT_OPR_INST">
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_OPR_INST = {};
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_OPR_INST.executeAllOnDecision = function () {
  console.log('execute AD0030021form2/h_MODIFY_COUNT_OPR_INST.onDecision');
  expj.AD0030020.AD0030021form2.executeAllOnDecision();
  expj.AD0030020.executeAllOnDecision();
};
expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_OPR_INST.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_OPR_INST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0030020', 'AD0030021form2', 'h_MODIFY_COUNT_OPR_INST', this);
  });
  expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_OPR_INST.executePScriptOnLoad();
};

expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_OPR_INST.executePScriptOnLoad = function () {
  console.log('execute AD0030021form2/h_MODIFY_COUNT_OPR_INST.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021form2-h_MODIFY_COUNT_OPR_INST');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0030020-AD0030021button1">
expj.AD0030020.AD0030021button1 = {};
expj.AD0030020.AD0030021button1.executeAllOnDecision = function () {
  console.log('execute AD0030021button1.onDecision');
};
expj.AD0030020.AD0030021button1.executeOnLoad = function () {
  expj.AD0030020.AD0030021button1.executePScriptOnLoad();
};

expj.AD0030020.AD0030021button1.executePScriptOnLoad = function () {
  console.log('execute AD0030021button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030020-AD0030021button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030020-AD0030021button1-Insert">
expj.AD0030020.AD0030021button1.Insert = {};
// script1="onClick;0;CHK;_AD0030021form2/TIME_CTRL[eq]true@*0"
expj.AD0030020.AD0030021button1.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]3@*1"
expj.AD0030020.AD0030021button1.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]4@*2"
expj.AD0030020.AD0030021button1.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AD0030021form2/TIME_CTRL[eq]true@*3"
expj.AD0030020.AD0030021button1.Insert.onClick3 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]3@*4"
expj.AD0030020.AD0030021button1.Insert.onClick4 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]4@*5"
expj.AD0030020.AD0030021button1.Insert.onClick5 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME[eq]@*6"
expj.AD0030020.AD0030021button1.Insert.onClick6 = function () {
  console.log('Insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME[eq]@*7"
expj.AD0030020.AD0030021button1.Insert.onClick7 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_AD0030021form2/PROC_NO[lte]0@#AD30350"
expj.AD0030020.AD0030021button1.Insert.onClick8 = function () {
  console.log('Insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/PROC_NO')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD30350');
}
};
// script10="onClick;9;CHK;_AD0030021form2/OPR_INST_QTY[lte]0@#AD30222"
expj.AD0030020.AD0030021button1.Insert.onClick9 = function () {
  console.log('Insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD30222');
}
};
// script11="onClick;10;CHK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC[lt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC@#AD00015"
expj.AD0030020.AD0030021button1.Insert.onClick10 = function () {
  console.log('Insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD00015');
}
};
// script12="onClick;11;CHK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC[eq]_AD0030021form2/OPR_INST_START_DATE_BY_PROC[and]_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME[lt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME@#AD00015"
expj.AD0030020.AD0030021button1.Insert.onClick11 = function () {
  console.log('Insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME')))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD00015');
}
};
// script13="onClick;12;CHK;_AD0030021form2/OUTSIDE_TYP[eq]2@*8"
expj.AD0030020.AD0030021button1.Insert.onClick12 = function () {
  console.log('Insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script14="onClick;13;CHK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC[lt]_AD0030021form2/h_BUSINESS_OPR_DATE@$AD25066"
expj.AD0030020.AD0030021button1.Insert.onClick13 = function () {
  console.log('Insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25066');
}
};
// script15="onClick;14;CHK;_AD0030021form2/OPR_INST_START_DATE_BY_PROC[lt]_AD0030021form2/h_BUSINESS_OPR_DATE@$AD25067"
expj.AD0030020.AD0030021button1.Insert.onClick14 = function () {
  console.log('Insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25067');
}
};
// script16="onClick;15;CHK;_AD0030021form2/h_ODR_START_DATE[gt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC@$AD25069"
expj.AD0030020.AD0030021button1.Insert.onClick15 = function () {
  console.log('Insert script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_ODR_START_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25069');
}
};
// script17="onClick;16;CHK;_AD0030021form2/h_ODR_START_DATE[eq]_AD0030021form2/OPR_INST_START_DATE_BY_PROC[and]_AD0030021form2/h_ODR_START_DATE_TIME[gt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME@$AD25069"
expj.AD0030020.AD0030021button1.Insert.onClick16 = function () {
  console.log('Insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_ODR_START_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_ODR_START_DATE_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25069');
}
};
// script18="onClick;17;CHK;_AD0030021form2/OUTSIDE_TYP[eq]2@*9"
expj.AD0030020.AD0030021button1.Insert.onClick17 = function () {
  console.log('Insert script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script19="onClick;18;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0030021form1/*,_AD0030021form2/*@AD0030020Servlet,,$ZZ07001"
expj.AD0030020.AD0030021button1.Insert.onClick18 = function () {
  console.log('Insert script19');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030021button1', '_AD0030021form1/*,_AD0030021form2/*', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.changeBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callConfirm('AD0030020', 'AD0030021button1', 'ZZ07001', okEvent);
};
// script20="child;0;CHK;~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]1[or]~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]2@#AS00039"
expj.AD0030020.AD0030021button1.Insert.child0 = function () {
  console.log('Insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00039');
}
};
// script21="child;1;CHK;[{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:1)}*10+{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:2)}][gte]60@#AS00040"
expj.AD0030020.AD0030021button1.Insert.child1 = function () {
  console.log('Insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00040');
}
};
// script22="child;2;CHK;[{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:0)}*10+{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:1)}][gte]24[or][{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:2)}*10+{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:3)}][gte]60@#AS00040"
expj.AD0030020.AD0030021button1.Insert.child2 = function () {
  console.log('Insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00040');
}
};
// script23="child;3;CHK;~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]1[or]~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]2@#AS00041"
expj.AD0030020.AD0030021button1.Insert.child3 = function () {
  console.log('Insert script23');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00041');
}
};
// script24="child;4;CHK;[{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:1)}*10+{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:2)}][gte]60@#AS00042"
expj.AD0030020.AD0030021button1.Insert.child4 = function () {
  console.log('Insert script24');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00042');
}
};
// script25="child;5;CHK;[{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:0)}*10+{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:1)}][gte]24[or][{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:2)}*10+{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:3)}][gte]60@#AS00042"
expj.AD0030020.AD0030021button1.Insert.child5 = function () {
  console.log('Insert script25');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00042');
}
};
// script26="child;6;SET;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME=2359"
expj.AD0030020.AD0030021button1.Insert.child6 = function () {
  console.log('Insert script26');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '2359');
};
// script27="child;7;SET;_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME=2359"
expj.AD0030020.AD0030021button1.Insert.child7 = function () {
  console.log('Insert script27');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '2359');
};
// script28="child;8;CHK;_AD0030021form2/UNIT_COST[lt][{_AD0030021form2/PROCESSING_COST}+{_AD0030021form2/MATERIAL_COST}+{_AD0030021form2/OTHER_OVERHEADS}]@$AD25032"
expj.AD0030020.AD0030021button1.Insert.child8 = function () {
  console.log('Insert script28');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/UNIT_COST')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/PROCESSING_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/MATERIAL_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OTHER_OVERHEADS')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25032');
}
};
// script29="child;9;CHK;_AD0030021form2/SelectUnitCostFlag[eq]false@$AD00100"
expj.AD0030020.AD0030021button1.Insert.child9 = function () {
  console.log('Insert script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/SelectUnitCostFlag'), '[eq]', 'false')) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD00100');
}
};
expj.AD0030020.AD0030021button1.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 18; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021button1.Insert['onClick' + i])) {
        expj.AD0030020.AD0030021button1.Insert['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021button1.Insert.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021button1.Insert.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021button1-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021button1', 'Insert', this, 'Button');
    }
  });
  expj.AD0030020.AD0030021button1.Insert.executePScriptOnLoad();
};

expj.AD0030020.AD0030021button1.Insert.executePScriptOnLoad = function () {
  console.log('execute AD0030021button1/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021button1-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030021button1-Insert" name="Insert" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AD0030020-AD0030021button1-Update">
expj.AD0030020.AD0030021button1.Update = {};
// script1="onClick;0;CHK;_AD0030021form2/TIME_CTRL[eq]true@*0"
expj.AD0030020.AD0030021button1.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="onClick;1;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]3@*1"
expj.AD0030020.AD0030021button1.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="onClick;2;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]4@*2"
expj.AD0030020.AD0030021button1.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onClick;3;CHK;_AD0030021form2/TIME_CTRL[eq]true@*3"
expj.AD0030020.AD0030021button1.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onClick;4;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]3@*4"
expj.AD0030020.AD0030021button1.Update.onClick4 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onClick;5;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]4@*5"
expj.AD0030020.AD0030021button1.Update.onClick5 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onClick;6;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME[eq]@*6"
expj.AD0030020.AD0030021button1.Update.onClick6 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="onClick;7;CHK;_AD0030021form2/TIME_CTRL[eq]true[and]_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME[eq]@*7"
expj.AD0030020.AD0030021button1.Update.onClick7 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script9="onClick;8;CHK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC[lt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC@#AD00015"
expj.AD0030020.AD0030021button1.Update.onClick8 = function () {
  console.log('Update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD00015');
}
};
// script10="onClick;9;CHK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC[eq]_AD0030021form2/OPR_INST_START_DATE_BY_PROC[and]_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME[lt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME@#AD00015"
expj.AD0030020.AD0030021button1.Update.onClick9 = function () {
  console.log('Update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME')))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD00015');
}
};
// script11="onClick;10;CHK;_AD0030021form2/OUTSIDE_TYP[eq]2@*8"
expj.AD0030020.AD0030021button1.Update.onClick10 = function () {
  console.log('Update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="onClick;11;CHK;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC[lt]_AD0030021form2/h_BUSINESS_OPR_DATE@$AD25066"
expj.AD0030020.AD0030021button1.Update.onClick11 = function () {
  console.log('Update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25066');
}
};
// script13="onClick;12;CHK;_AD0030021form2/OPR_INST_START_DATE_BY_PROC[lt]_AD0030021form2/h_BUSINESS_OPR_DATE@$AD25067"
expj.AD0030020.AD0030021button1.Update.onClick12 = function () {
  console.log('Update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25067');
}
};
// script14="onClick;13;CHK;_AD0030021form2/h_ODR_START_DATE[gt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC@$AD25069"
expj.AD0030020.AD0030021button1.Update.onClick13 = function () {
  console.log('Update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_ODR_START_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25069');
}
};
// script15="onClick;14;CHK;_AD0030021form2/h_ODR_START_DATE[eq]_AD0030021form2/OPR_INST_START_DATE_BY_PROC[and]_AD0030021form2/h_ODR_START_DATE_TIME[gt]_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME@$AD25069"
expj.AD0030020.AD0030021button1.Update.onClick14 = function () {
  console.log('Update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_ODR_START_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/h_ODR_START_DATE_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25069');
}
};
// script16="onClick;15;CHK;_AD0030021form2/OUTSIDE_TYP[eq]2@*9"
expj.AD0030020.AD0030021button1.Update.onClick15 = function () {
  console.log('Update script16');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OUTSIDE_TYP'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script17="onClick;16;CHK;_AD0030021form2/PROC_NO[lte]0@#AD30350"
expj.AD0030020.AD0030021button1.Update.onClick16 = function () {
  console.log('Update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/PROC_NO')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD30350');
}
};
// script18="onClick;17;CHK;_AD0030021form2/OPR_INST_QTY[lte]0@#AD30222"
expj.AD0030020.AD0030021button1.Update.onClick17 = function () {
  console.log('Update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AD30222');
}
};
// script19="onClick;18;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0030021form1/*,_AD0030021form2/*@AD0030020Servlet,,$ZZ07003"
expj.AD0030020.AD0030021button1.Update.onClick18 = function () {
  console.log('Update script19');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030021button1', '_AD0030021form1/*,_AD0030021form2/*', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.changeBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callConfirm('AD0030020', 'AD0030021button1', 'ZZ07003', okEvent);
};
// script20="child;0;CHK;~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]1[or]~LEN(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME)[eq]2@#AS00039"
expj.AD0030020.AD0030021button1.Update.child0 = function () {
  console.log('Update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00039');
}
};
// script21="child;1;CHK;[{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:1)}*10+{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:2)}][gte]60@#AS00040"
expj.AD0030020.AD0030021button1.Update.child1 = function () {
  console.log('Update script21');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00040');
}
};
// script22="child;2;CHK;[{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:0)}*10+{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:1)}][gte]24[or][{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:2)}*10+{~CHARAT(_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME:3)}][gte]60@#AS00040"
expj.AD0030020.AD0030021button1.Update.child2 = function () {
  console.log('Update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00040');
}
};
// script23="child;3;CHK;~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]1[or]~LEN(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME)[eq]2@#AS00041"
expj.AD0030020.AD0030021button1.Update.child3 = function () {
  console.log('Update script23');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00041');
}
};
// script24="child;4;CHK;[{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:1)}*10+{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:2)}][gte]60@#AS00042"
expj.AD0030020.AD0030021button1.Update.child4 = function () {
  console.log('Update script24');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00042');
}
};
// script25="child;5;CHK;[{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:0)}*10+{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:1)}][gte]24[or][{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:2)}*10+{~CHARAT(_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME:3)}][gte]60@#AS00042"
expj.AD0030020.AD0030021button1.Update.child5 = function () {
  console.log('Update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0030020', 'AD0030021button1', 'AS00042');
}
};
// script26="child;6;SET;_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME=2359"
expj.AD0030020.AD0030021button1.Update.child6 = function () {
  console.log('Update script26');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/WORK_ODR_DLV_DATE_BY_PROC_TIME', '2359');
};
// script27="child;7;SET;_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME=2359"
expj.AD0030020.AD0030021button1.Update.child7 = function () {
  console.log('Update script27');
expj.common.pscript.setReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OPR_INST_START_DATE_BY_PROC_TIME', '2359');
};
// script28="child;8;CHK;_AD0030021form2/UNIT_COST[lt][{_AD0030021form2/PROCESSING_COST}+{_AD0030021form2/MATERIAL_COST}+{_AD0030021form2/OTHER_OVERHEADS}]@$AD25032"
expj.AD0030020.AD0030021button1.Update.child8 = function () {
  console.log('Update script28');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/UNIT_COST')), '[lt]', expj.common.pscript.eval(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/PROCESSING_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/MATERIAL_COST') + '+' + expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/OTHER_OVERHEADS')))) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD25032');
}
};
// script29="child;9;CHK;_AD0030021form2/SelectUnitCostFlag[eq]false@$AD00100"
expj.AD0030020.AD0030021button1.Update.child9 = function () {
  console.log('Update script29');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0030020', 'AD0030021button1', '_AD0030021form2/SelectUnitCostFlag'), '[eq]', 'false')) {
expj.common.pscript.addWarningMessage('AD0030020', 'AD0030021button1', 'AD00100');
}
};
expj.AD0030020.AD0030021button1.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 18; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021button1.Update['onClick' + i])) {
        expj.AD0030020.AD0030021button1.Update['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021button1.Update.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021button1.Update.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021button1-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021button1', 'Update', this, 'Button');
    }
  });
  expj.AD0030020.AD0030021button1.Update.executePScriptOnLoad();
};

expj.AD0030020.AD0030021button1.Update.executePScriptOnLoad = function () {
  console.log('execute AD0030021button1/Update.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021button1-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030021button1-Update" name="Update" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AD0030021 Revision: 1.10  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AD0030020-AD0030021button0">
expj.AD0030020.AD0030021button0 = {};
expj.AD0030020.AD0030021button0.executeAllOnDecision = function () {
  console.log('execute AD0030021button0.onDecision');
};
expj.AD0030020.AD0030021button0.executeOnLoad = function () {
  expj.AD0030020.AD0030021button0.executePScriptOnLoad();
};

expj.AD0030020.AD0030021button0.executePScriptOnLoad = function () {
  console.log('execute AD0030021button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0030020-AD0030021button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0030020-AD0030021button0-Return">
expj.AD0030020.AD0030021button0.Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0030021form1/*,_AD0030021form2/*@AD0030020Servlet,,$ZZ07013"
expj.AD0030020.AD0030021button0.Return.onClick0 = function () {
  console.log('Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0030020', 'AD0030021button0', '_AD0030021form1/*,_AD0030021form2/*', 'AD0030020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0030020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0030020', response);
expj.common.changeBusinessScreenTab('AD0030020', contents);
};
expj.common.pscript.callConfirm('AD0030020', 'AD0030021button0', 'ZZ07013', okEvent);
};
expj.AD0030020.AD0030021button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0030020.AD0030021button0.Return['onClick' + i])) {
        expj.AD0030020.AD0030021button0.Return['onClick' + i]();
      }
    }
  }
};
expj.AD0030020.AD0030021button0.Return.executeAllOnDecision = function () {
};
expj.AD0030020.AD0030021button0.Return.executeOnLoad = function () {
  $('#expj-AD0030020-AD0030021button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0030020', 'AD0030021button0', 'Return', this, 'Button');
    }
  });
  expj.AD0030020.AD0030021button0.Return.executePScriptOnLoad();
};

expj.AD0030020.AD0030021button0.Return.executePScriptOnLoad = function () {
  console.log('execute AD0030021button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-AD0030020-AD0030021button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0030020-AD0030021button0-Return" name="Return" class="AD0030020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0030020 (END)-->
<%
MessageStruct msgStruct = aAD0030020Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0030020-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0030020)) {
  expj.common.treeInstanceMap.AD0030020 = {};
}
expj.common.treeInstanceMap.AD0030020.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0030020.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0030020.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0030020.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0030020.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0030020-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0030020-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020)) {
  expj.common.detailDialogMap.AD0030020 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0030020._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0030020.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0030020.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0030020.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0030020.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0030020-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0030020-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0030020-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0030020._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0030020-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0030020)) {
  expj.common.viewInstanceMap.AD0030020 = {};
}
expj.common.viewInstanceMap.AD0030020.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0030020.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0030020.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0030020.<%=viewId %>.init = function () {
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
    expj.AD0030020.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0030020.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0030020-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0030020-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0030020_init">
/**
 * AD0030020用のロード完了時初期化関数
 */
expj.AD0030020.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0030020');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0030020');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0030020');
  expj.common.calendarInstanceMap.AD0030020 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0030020.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0030020.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0030020.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0030020');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0030020');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0030020-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0030020-<%=detailId %>');
<%
 }
%>
  try{expj.AD0030020.AD0030021form1.WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.WORK_IN_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.PROC_NO.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.CalendarWorkOdrDlvDateByProc.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.WORK_ODR_DLV_DATE_BY_PROC_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.CalendarOprInstStartDateByProc.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.OPR_INST_START_DATE_BY_PROC_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_PARENT_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_JOB_ODR_CANCEL_NO.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_ODR_START_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_WORK_ODR_DLV_DATE_BY_PROC_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.OPR_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_OPR_INST_START_DATE_BY_PROC_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.VEND_ANAME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_COMPANY_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.ACPT_INSPC_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.SelectUnitCost.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.SelectUnitCostFlag.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_VEND_DECIMAL_FIG.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_HOME_DECIMAL_FIG.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.PROCESSING_COST.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d1_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.TAX_AMOUNT_1.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d2_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_TAX_RATE_1.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.MATERIAL_COST.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d3_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.TAX_AMOUNT_2.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d4_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_TAX_RATE_2.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.OTHER_OVERHEADS.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d5_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.TAX_AMOUNT_3.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d6_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_TAX_RATE_3.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.PUCH_ODR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d7_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.AMOUNT_INCLUDE_TAX.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d8_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.DISC_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d9_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.PROVISIONAL_HOME_CUR_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.AFTER_DISC_AMOUNT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d10_VEND_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.EXCH_RATE.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.d_HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.WORK_IN_PROC_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_WORK_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_ITEM.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_BY_PROC.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.h_MODIFY_COUNT_OPR_INST.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021button1.Insert.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021button1.Update.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021button0.Return.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form1.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021form2.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021button1.executeOnLoad();}catch(e){};
  try{expj.AD0030020.AD0030021button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0030020.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0030020', 'AD0030020');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0030020');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0030020-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0030020-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0030020', '<%=request.getContextPath() %>');
};

/**
 * AD0030020の全体onDecision処理
 */
expj.AD0030020.executeAllOnDecision = function () {
  expj.AD0030020.AD0030021form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0030020_console">
expj.AD0030020.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>