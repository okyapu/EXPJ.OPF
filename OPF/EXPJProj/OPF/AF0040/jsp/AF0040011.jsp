<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:38:46 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AF0040\AF0040011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AF0040.*" %>
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
<jsp:useBean id="aAF0040010Control" class="com.nec.jp.orteus.metamorBase.AF0040.AF0040010Control" scope="request"/>
<jsp:useBean id="aAF0040010Struct" class="com.nec.jp.orteus.metamorBase.AF0040.AF0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

追加出庫実績入力サブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0040/jsp/AF0040011.jsp,v $
$Author: geng-jia $	
$Revision: 1.14 $ $Date: 2017/02/22 02:05:42 $
********************************************************* --%>
<html>
<head>
<title>追加出庫実績入力サブ1</title>
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
<script class="expj-script-AF0040010_init">
  // AF0040010名前空間
  expj.AF0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AF0040010" data-screen="AF0040011" data-newdata="<%=aAF0040010Control.isNewData() %>">
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
              <script class="expj-script-AF0040010-AF0040011form1">
expj.AF0040010.AF0040011form1 = {};
expj.AF0040010.AF0040011form1.executeAllOnDecision = function () {
  console.log('execute AF0040011form1.onDecision');
};
expj.AF0040010.AF0040011form1.executeOnLoad = function () {
  expj.AF0040010.AF0040011form1.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form1.executePScriptOnLoad = function () {
  console.log('execute AF0040011form1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0040010-AF0040011form1" action="AF0040010Servlet" name="AF0040011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_INST_CD",rb)%></span><!-- 出庫指示番号 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form1-ISSUE_INST_CD">
expj.AF0040010.AF0040011form1.ISSUE_INST_CD = {};
expj.AF0040010.AF0040011form1.ISSUE_INST_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form1/ISSUE_INST_CD.onDecision');
  expj.AF0040010.AF0040011form1.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form1.ISSUE_INST_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form1-ISSUE_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form1', 'ISSUE_INST_CD', this);
  });
  expj.AF0040010.AF0040011form1.ISSUE_INST_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form1.ISSUE_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form1/ISSUE_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form1-ISSUE_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form1-ISSUE_INST_CD" name="ISSUE_INST_CD" class="AF0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getISSUE_INST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="datagrid-button-field-cell frame18" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame19" style=""></div><!--/td-->
<div class="datagrid-button-field-cell frame20 button-area-left" style="width:60px;"></div><!--/td-->
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
<div class="expj-td frame04" style=""></div><!--/td-->
<div class="expj-td frame05" style=""><script class="expj-script-AF0040010-AF0040011form2">
expj.AF0040010.AF0040011form2 = {};
// script1="onLoad;0;CALL;child@0,2,24"
expj.AF0040010.AF0040011form2.onLoad0 = function () {
  console.log('AF0040011form2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child2)){this.child2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child24)){this.child24();}
};
// script2="child;0;MASK;_AF0040011form2/c_SHIP_COMPLETE@*1"
expj.AF0040010.AF0040011form2.child0 = function () {
  console.log('AF0040011form2 script2');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/c_SHIP_COMPLETE');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;SET;_AF0040011form2/c_SHIP_COMPLETE=true"
expj.AF0040010.AF0040011form2.child1 = function () {
  console.log('AF0040011form2 script3');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/c_SHIP_COMPLETE', 'true');
};
// script4="child;2;SET;_AF0040011form2/h_JOB_ODR_CD=_AF0040011form2/w_JOB_ODR_CD@*3"
expj.AF0040010.AF0040011form2.child2 = function () {
  console.log('AF0040011form2 script4');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/h_JOB_ODR_CD', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;CHK;_AF0040011form2/MRP_ODR_TYP[gt]3@*4,*7"
expj.AF0040010.AF0040011form2.child3 = function () {
  console.log('AF0040011form2 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/MRP_ODR_TYP')), '[gt]', expj.common.pscript.convertNumber('3'))) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script6="child;4;MASK;_AF0040011form2/w_JOB_ODR_CD,_AF0040011form2/PeekerWJobOdrCd@*5"
expj.AF0040010.AF0040011form2.child4 = function () {
  console.log('AF0040011form2 script6');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/PeekerWJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script7="child;5;SET;_AF0040011form2/c_JOB_ODR=false@*6"
expj.AF0040010.AF0040011form2.child5 = function () {
  console.log('AF0040011form2 script7');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child6)){this.child6();}}
};
// script8="child;6;MASK;_AF0040011form2/c_JOB_ODR@*14"
expj.AF0040010.AF0040011form2.child6 = function () {
  console.log('AF0040011form2 script8');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script9="child;7;CHK;_AF0040011form2/w_JOB_ODR_CD[eq]@*8,*11"
expj.AF0040010.AF0040011form2.child7 = function () {
  console.log('AF0040011form2 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child11)){this.child11();}
}
};
// script10="child;8;MASK;_AF0040011form2/w_JOB_ODR_CD,_AF0040011form2/PeekerWJobOdrCd@*9"
expj.AF0040010.AF0040011form2.child8 = function () {
  console.log('AF0040011form2 script10');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/PeekerWJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script11="child;9;UNMASK;_AF0040011form2/c_JOB_ODR@*10"
expj.AF0040010.AF0040011form2.child9 = function () {
  console.log('AF0040011form2 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child10)){this.child10();}}
};
// script12="child;10;SET;_AF0040011form2/c_JOB_ODR=false@*14"
expj.AF0040010.AF0040011form2.child10 = function () {
  console.log('AF0040011form2 script12');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR', 'false');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child14)){this.child14();}}
};
// script13="child;11;UNMASK;_AF0040011form2/w_JOB_ODR_CD,_AF0040011form2/PeekerWJobOdrCd@*12"
expj.AF0040010.AF0040011form2.child11 = function () {
  console.log('AF0040011form2 script13');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/PeekerWJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child12)){this.child12();}}
};
// script14="child;12;UNMASK;_AF0040011form2/c_JOB_ODR@*13"
expj.AF0040010.AF0040011form2.child12 = function () {
  console.log('AF0040011form2 script14');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child13)){this.child13();}}
};
// script15="child;13;SET;_AF0040011form2/c_JOB_ODR=true@*15"
expj.AF0040010.AF0040011form2.child13 = function () {
  console.log('AF0040011form2 script15');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR', 'true');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child15)){this.child15();}}
};
// script16="child;14;SET;_AF0040011form2/h_JOB_ODR=0"
expj.AF0040010.AF0040011form2.child14 = function () {
  console.log('AF0040011form2 script16');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/h_JOB_ODR', '0');
};
// script17="child;15;SET;_AF0040011form2/h_JOB_ODR=1"
expj.AF0040010.AF0040011form2.child15 = function () {
  console.log('AF0040011form2 script17');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/h_JOB_ODR', '1');
};
// script18="onLoad;1;CALL;onDecision@0,1"
expj.AF0040010.AF0040011form2.onLoad1 = function () {
  console.log('AF0040011form2 script18');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script19="onDecision;0;CHKRQ;B@*16,*19"
expj.AF0040010.AF0040011form2.onDecision0 = function () {
  console.log('AF0040011form2 script19');
if (expj.common.pscript.satisfiedRequiredComponent('AF0040010', 'B')) {
if(expj.common.checkNameSpace(this.child16)){this.child16();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script20="child;16;CHK;_AF0040011form2/c_JOB_ODR[eq]true@*17,*18"
expj.AF0040010.AF0040011form2.child16 = function () {
  console.log('AF0040011form2 script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child17)){this.child17();}
} else {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
}
};
// script21="child;17;CHKRQ;A@*18,*19"
expj.AF0040010.AF0040011form2.child17 = function () {
  console.log('AF0040011form2 script21');
if (expj.common.pscript.satisfiedRequiredComponent('AF0040010', 'A')) {
if(expj.common.checkNameSpace(this.child18)){this.child18();}
} else {
if(expj.common.checkNameSpace(this.child19)){this.child19();}
}
};
// script22="child;18;UNMASK;_AF0040011form2/selectSub1"
expj.AF0040010.AF0040011form2.child18 = function () {
  console.log('AF0040011form2 script22');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/selectSub1');
};
// script23="child;19;MASK;_AF0040011form2/selectSub1"
expj.AF0040010.AF0040011form2.child19 = function () {
  console.log('AF0040011form2 script23');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/selectSub1');
};
// script24="onDecision;1;CHKRQ;C@*20,*23"
expj.AF0040010.AF0040011form2.onDecision1 = function () {
  console.log('AF0040011form2 script24');
if (expj.common.pscript.satisfiedRequiredComponent('AF0040010', 'C')) {
if(expj.common.checkNameSpace(this.child20)){this.child20();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script25="child;20;CHK;_AF0040011form2/c_JOB_ODR[eq]true@*21,*22"
expj.AF0040010.AF0040011form2.child20 = function () {
  console.log('AF0040011form2 script25');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/c_JOB_ODR'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child21)){this.child21();}
} else {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
}
};
// script26="child;21;CHKRQ;A@*22,*23"
expj.AF0040010.AF0040011form2.child21 = function () {
  console.log('AF0040011form2 script26');
if (expj.common.pscript.satisfiedRequiredComponent('AF0040010', 'A')) {
if(expj.common.checkNameSpace(this.child22)){this.child22();}
} else {
if(expj.common.checkNameSpace(this.child23)){this.child23();}
}
};
// script27="child;22;UNMASK;_AF0040011button1/insertSub1"
expj.AF0040010.AF0040011form2.child22 = function () {
  console.log('AF0040011form2 script27');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011button1/insertSub1');
};
// script28="child;23;MASK;_AF0040011button1/insertSub1"
expj.AF0040010.AF0040011form2.child23 = function () {
  console.log('AF0040011form2 script28');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011button1/insertSub1');
};
expj.AF0040010.AF0040011form2.executeAllOnDecision = function () {
  console.log('execute AF0040011form2.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2['onDecision' + i])) {
        expj.AF0040010.AF0040011form2['onDecision' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011form2.executeOnLoad = function () {
  expj.AF0040010.AF0040011form2.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2['onLoad' + i])) {
      expj.AF0040010.AF0040011form2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0040010-AF0040011form2" action="AF0040010Servlet" name="AF0040011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:142px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:142px;">
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
<script class="expj-script-AF0040010-AF0040011form2-w_JOB_ODR_CD">
expj.AF0040010.AF0040011form2.w_JOB_ODR_CD = {};
expj.AF0040010.AF0040011form2.w_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/w_JOB_ODR_CD.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.w_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-w_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'w_JOB_ODR_CD', this);
  });
  expj.AF0040010.AF0040011form2.w_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.w_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/w_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-w_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-w_JOB_ODR_CD" name="w_JOB_ODR_CD" class="AF0040010-focus-move  required-value expj-AF0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_JOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-PeekerWJobOdrCd">
expj.AF0040010.AF0040011form2.PeekerWJobOdrCd = {};
// script1="onClick;0;PEEKER;_AF0040011form2/w_JOB_ODR_CD@<%=contextNo%>"
expj.AF0040010.AF0040011form2.PeekerWJobOdrCd.onClick0 = function () {
  console.log('PeekerWJobOdrCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0040010';
var parameterValues = 'PeekerWJobOdrCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0040010', 'PeekerWJobOdrCd', 'SQLPARAM_1', '<%=aAF0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AF0040011form2/w_JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0040010.AF0040011form2.PeekerWJobOdrCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2.PeekerWJobOdrCd['onClick' + i])) {
        expj.AF0040010.AF0040011form2.PeekerWJobOdrCd['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011form2.PeekerWJobOdrCd.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040011form2.PeekerWJobOdrCd.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-PeekerWJobOdrCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011form2', 'PeekerWJobOdrCd', this, 'Button');
    }
  });
  expj.AF0040010.AF0040011form2.PeekerWJobOdrCd.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.PeekerWJobOdrCd.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/PeekerWJobOdrCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-PeekerWJobOdrCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0040010-AF0040011form2-PeekerWJobOdrCd" class="AF0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-MRP_ODR_TYP" name="MRP_ODR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getMRP_ODR_TYP()) %>">
<script class="expj-script-AF0040010-AF0040011form2-MRP_ODR_TYP">
expj.AF0040010.AF0040011form2.MRP_ODR_TYP = {};
expj.AF0040010.AF0040011form2.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/MRP_ODR_TYP.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'MRP_ODR_TYP', this);
  });
  expj.AF0040010.AF0040011form2.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-c_JOB_ODR">
expj.AF0040010.AF0040011form2.c_JOB_ODR = {};
// script1="onClick;0;CHK;_THIS[eq]true@*0,*2"
expj.AF0040010.AF0040011form2.c_JOB_ODR.onClick0 = function () {
  console.log('c_JOB_ODR script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_THIS'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script2="child;0;UNMASK;_AF0040011form2/w_JOB_ODR_CD,_AF0040011form2/PeekerWJobOdrCd@*1"
expj.AF0040010.AF0040011form2.c_JOB_ODR.child0 = function () {
  console.log('c_JOB_ODR script2');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/PeekerWJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child1)){this.child1();}}
};
// script3="child;1;SET;_AF0040011form2/w_JOB_ODR_CD=_AF0040011form2/h_JOB_ODR_CD@*4"
expj.AF0040010.AF0040011form2.c_JOB_ODR.child1 = function () {
  console.log('c_JOB_ODR script3');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/h_JOB_ODR_CD'));
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child4)){this.child4();}}
};
// script4="child;2;SET;_AF0040011form2/w_JOB_ODR_CD=@*3"
expj.AF0040010.AF0040011form2.c_JOB_ODR.child2 = function () {
  console.log('c_JOB_ODR script4');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD', '');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child3)){this.child3();}}
};
// script5="child;3;MASK;_AF0040011form2/w_JOB_ODR_CD,_AF0040011form2/PeekerWJobOdrCd@*5"
expj.AF0040010.AF0040011form2.c_JOB_ODR.child3 = function () {
  console.log('c_JOB_ODR script5');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/w_JOB_ODR_CD');
expj.common.pscript.setMaskToReferenceComponent('AF0040010', 'AF0040011form2', '_AF0040011form2/PeekerWJobOdrCd');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child5)){this.child5();}}
};
// script6="child;4;SET;_AF0040011form2/h_JOB_ODR=1"
expj.AF0040010.AF0040011form2.c_JOB_ODR.child4 = function () {
  console.log('c_JOB_ODR script6');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/h_JOB_ODR', '1');
};
// script7="child;5;SET;_AF0040011form2/h_JOB_ODR=0"
expj.AF0040010.AF0040011form2.c_JOB_ODR.child5 = function () {
  console.log('c_JOB_ODR script7');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/h_JOB_ODR', '0');
};
expj.AF0040010.AF0040011form2.c_JOB_ODR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2.c_JOB_ODR['onClick' + i])) {
        expj.AF0040010.AF0040011form2.c_JOB_ODR['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011form2.c_JOB_ODR.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/c_JOB_ODR.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.c_JOB_ODR.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-c_JOB_ODR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011form2', 'c_JOB_ODR', this, 'CheckBox');
    }
  });
  expj.AF0040010.AF0040011form2.c_JOB_ODR.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.c_JOB_ODR.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/c_JOB_ODR.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-c_JOB_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="checkbox" name="c_JOB_ODR" value="true" <%= ("true".equals(TypeConverter.convert(aAF0040010Struct.getc_JOB_ODR())) || "1".equals(TypeConverter.convert(aAF0040010Struct.getc_JOB_ODR())))?"checked=\"checked\"":"" %>  class="AF0040010-focus-move" id="expj-AF0040010-AF0040011form2-c_JOB_ODR"><label for="expj-AF0040010-AF0040011form2-c_JOB_ODR"><%=CoreTools.getRBString("Expj.Cmt0210",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-h_JOB_ODR" name="h_JOB_ODR" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.geth_JOB_ODR()) %>">
<script class="expj-script-AF0040010-AF0040011form2-h_JOB_ODR">
expj.AF0040010.AF0040011form2.h_JOB_ODR = {};
expj.AF0040010.AF0040011form2.h_JOB_ODR.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/h_JOB_ODR.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.h_JOB_ODR.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-h_JOB_ODR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'h_JOB_ODR', this);
  });
  expj.AF0040010.AF0040011form2.h_JOB_ODR.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.h_JOB_ODR.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/h_JOB_ODR.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-h_JOB_ODR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-h_JOB_ODR_CD" name="h_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="">
<script class="expj-script-AF0040010-AF0040011form2-h_JOB_ODR_CD">
expj.AF0040010.AF0040011form2.h_JOB_ODR_CD = {};
expj.AF0040010.AF0040011form2.h_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/h_JOB_ODR_CD.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.h_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-h_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'h_JOB_ODR_CD', this);
  });
  expj.AF0040010.AF0040011form2.h_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.h_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/h_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-h_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WH_CD_10",rb)%></span><!-- 出庫元保管区コード --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-w_WH_CD">
expj.AF0040010.AF0040011form2.w_WH_CD = {};
expj.AF0040010.AF0040011form2.w_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/w_WH_CD.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.w_WH_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-w_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'w_WH_CD', this);
  });
  expj.AF0040010.AF0040011form2.w_WH_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.w_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/w_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-w_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-w_WH_CD" name="w_WH_CD" class="AF0040010-focus-move  required-value expj-AF0040010-required-B" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_WH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-PeekerWWhCd">
expj.AF0040010.AF0040011form2.PeekerWWhCd = {};
// script1="onClick;0;PEEKER;_AF0040011form2/w_WH_CD@<%=contextNo%>"
expj.AF0040010.AF0040011form2.PeekerWWhCd.onClick0 = function () {
  console.log('PeekerWWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0040010';
var parameterValues = 'PeekerWWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0040010', 'PeekerWWhCd', 'SQLPARAM_1', '<%=aAF0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/w_WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0040010', 'PeekerWWhCd', 'SQLPARAM_4', '0');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_5%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0040010', 'PeekerWWhCd', 'SQLPARAM_5', '1');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_11%&%';
parameterValues += 'TARGET_FIELD%=%_AF0040011form2/w_WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0040010.AF0040011form2.PeekerWWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2.PeekerWWhCd['onClick' + i])) {
        expj.AF0040010.AF0040011form2.PeekerWWhCd['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011form2.PeekerWWhCd.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040011form2.PeekerWWhCd.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-PeekerWWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011form2', 'PeekerWWhCd', this, 'Button');
    }
  });
  expj.AF0040010.AF0040011form2.PeekerWWhCd.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.PeekerWWhCd.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/PeekerWWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-PeekerWWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0040010-AF0040011form2-PeekerWWhCd" class="AF0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-w_WH_NAME">
expj.AF0040010.AF0040011form2.w_WH_NAME = {};
expj.AF0040010.AF0040011form2.w_WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/w_WH_NAME.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.w_WH_NAME.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-w_WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'w_WH_NAME', this);
  });
  expj.AF0040010.AF0040011form2.w_WH_NAME.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.w_WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/w_WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-w_WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-w_WH_NAME" name="w_WH_NAME" class="AF0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_WH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-selectSub1">
expj.AF0040010.AF0040011form2.selectSub1 = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AF0040011form1/*,_AF0040011form2/*,_AF0040011form3/*@AF0040010Servlet"
expj.AF0040010.AF0040011form2.selectSub1.onClick0 = function () {
  console.log('selectSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0040010', 'AF0040011form2', '_AF0040011form1/*,_AF0040011form2/*,_AF0040011form3/*', 'AF0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0040010', response);
expj.common.updateBusinessScreenTab('AF0040010', contents);
};
expj.common.pscript.callSubmit(okEvent);
};
expj.AF0040010.AF0040011form2.selectSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2.selectSub1['onClick' + i])) {
        expj.AF0040010.AF0040011form2.selectSub1['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011form2.selectSub1.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040011form2.selectSub1.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-selectSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011form2', 'selectSub1', this, 'Button');
    }
  });
  expj.AF0040010.AF0040011form2.selectSub1.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.selectSub1.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/selectSub1.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-selectSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><button type="button" id="expj-AF0040010-AF0040011form2-selectSub1" name="selectSub1" class="AF0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnStokCheck",rb)%></button><!-- 在庫確認ボタン --></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.RCV_ISSUE_QTY_6",rb)%></span><!-- 出庫数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-RCV_ISSUE_QTY">
expj.AF0040010.AF0040011form2.RCV_ISSUE_QTY = {};
expj.AF0040010.AF0040011form2.RCV_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/RCV_ISSUE_QTY.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.RCV_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-RCV_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'RCV_ISSUE_QTY', this);
  });
  expj.AF0040010.AF0040011form2.RCV_ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.RCV_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/RCV_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-RCV_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-RCV_ISSUE_QTY" name="RCV_ISSUE_QTY" class="AF0040010-focus-move expj-align-right required-value expj-AF0040010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getRCV_ISSUE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-STOCK_UNIT">
expj.AF0040010.AF0040011form2.STOCK_UNIT = {};
expj.AF0040010.AF0040011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/STOCK_UNIT.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'STOCK_UNIT', this);
  });
  expj.AF0040010.AF0040011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-STOCK_UNIT" name="STOCK_UNIT" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-c_SHIP_COMPLETE">
expj.AF0040010.AF0040011form2.c_SHIP_COMPLETE = {};
expj.AF0040010.AF0040011form2.c_SHIP_COMPLETE.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/c_SHIP_COMPLETE.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.c_SHIP_COMPLETE.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-c_SHIP_COMPLETE').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011form2', 'c_SHIP_COMPLETE', this, 'CheckBox');
    }
  });
  expj.AF0040010.AF0040011form2.c_SHIP_COMPLETE.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.c_SHIP_COMPLETE.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/c_SHIP_COMPLETE.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-c_SHIP_COMPLETE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_SHIP_COMPLETE" value="true" <%= ("true".equals(TypeConverter.convert(aAF0040010Struct.getc_SHIP_COMPLETE())) || "1".equals(TypeConverter.convert(aAF0040010Struct.getc_SHIP_COMPLETE())))?"checked=\"checked\"":"" %>  class="AF0040010-focus-move" id="expj-AF0040010-AF0040011form2-c_SHIP_COMPLETE"><label for="expj-AF0040010-AF0040011form2-c_SHIP_COMPLETE"><%=CoreTools.getRBString("Expj.ISSUE_CMPLT_FLG_2",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-THIS_MONTH" name="THIS_MONTH" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getTHIS_MONTH()) %>">
<script class="expj-script-AF0040010-AF0040011form2-THIS_MONTH">
expj.AF0040010.AF0040011form2.THIS_MONTH = {};
expj.AF0040010.AF0040011form2.THIS_MONTH.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/THIS_MONTH.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.THIS_MONTH.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-THIS_MONTH').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'THIS_MONTH', this);
  });
  expj.AF0040010.AF0040011form2.THIS_MONTH.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.THIS_MONTH.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/THIS_MONTH.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-THIS_MONTH');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ISSUE_DATE",rb)%></span><!-- 出庫日 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-RCV_ISSUE_DATE">
expj.AF0040010.AF0040011form2.RCV_ISSUE_DATE = {};
expj.AF0040010.AF0040011form2.RCV_ISSUE_DATE.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/RCV_ISSUE_DATE.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.RCV_ISSUE_DATE.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-RCV_ISSUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'RCV_ISSUE_DATE', this);
  });
  expj.AF0040010.AF0040011form2.RCV_ISSUE_DATE.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.RCV_ISSUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/RCV_ISSUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-RCV_ISSUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-RCV_ISSUE_DATE" name="RCV_ISSUE_DATE" class="AF0040010-focus-move  required-value expj-AF0040010-required-C" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getRCV_ISSUE_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-CalendarRcvIssueDate">
expj.AF0040010.AF0040011form2.CalendarRcvIssueDate = {};
// script1="onClick;0;CALENDAR;_AF0040011form2/RCV_ISSUE_DATE"
expj.AF0040010.AF0040011form2.CalendarRcvIssueDate.onClick0 = function () {
  console.log('CalendarRcvIssueDate script1');
expj.common.pscript.executeCalendar('AF0040010','AF0040011form2','_AF0040011form2/RCV_ISSUE_DATE');
};
expj.AF0040010.AF0040011form2.CalendarRcvIssueDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2.CalendarRcvIssueDate['onClick' + i])) {
        expj.AF0040010.AF0040011form2.CalendarRcvIssueDate['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011form2.CalendarRcvIssueDate.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040011form2.CalendarRcvIssueDate.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-CalendarRcvIssueDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011form2', 'CalendarRcvIssueDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AF0040010','AF0040011form2','_AF0040011form2/RCV_ISSUE_DATE');
  expj.AF0040010.AF0040011form2.CalendarRcvIssueDate.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.CalendarRcvIssueDate.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/CalendarRcvIssueDate.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-CalendarRcvIssueDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0040010-AF0040011form2-CalendarRcvIssueDate" class="AF0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-ISSUE_CMPLT_DATE" name="ISSUE_CMPLT_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getISSUE_CMPLT_DATE()) %>">
<script class="expj-script-AF0040010-AF0040011form2-ISSUE_CMPLT_DATE">
expj.AF0040010.AF0040011form2.ISSUE_CMPLT_DATE = {};
expj.AF0040010.AF0040011form2.ISSUE_CMPLT_DATE.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/ISSUE_CMPLT_DATE.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.ISSUE_CMPLT_DATE.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-ISSUE_CMPLT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'ISSUE_CMPLT_DATE', this);
  });
  expj.AF0040010.AF0040011form2.ISSUE_CMPLT_DATE.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.ISSUE_CMPLT_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/ISSUE_CMPLT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-ISSUE_CMPLT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-h_WH_CD" name="h_WH_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.geth_WH_CD()) %>">
<script class="expj-script-AF0040010-AF0040011form2-h_WH_CD">
expj.AF0040010.AF0040011form2.h_WH_CD = {};
expj.AF0040010.AF0040011form2.h_WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/h_WH_CD.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.h_WH_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-h_WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'h_WH_CD', this);
  });
  expj.AF0040010.AF0040011form2.h_WH_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.h_WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/h_WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-h_WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WH_CD_1",rb)%></span><!-- 出庫先保管区コード --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-WH_CD">
expj.AF0040010.AF0040011form2.WH_CD = {};
expj.AF0040010.AF0040011form2.WH_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/WH_CD.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.WH_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-WH_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'WH_CD', this);
  });
  expj.AF0040010.AF0040011form2.WH_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.WH_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/WH_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-WH_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-WH_CD" name="WH_CD" class="AF0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getWH_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-PeekerWhCd">
expj.AF0040010.AF0040011form2.PeekerWhCd = {};
// script1="onClick;0;PEEKER;_AF0040011form2/WH_CD@<%=contextNo%>"
expj.AF0040010.AF0040011form2.PeekerWhCd.onClick0 = function () {
  console.log('PeekerWhCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AF0040010';
var parameterValues = 'PeekerWhCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AF0040010', 'PeekerWhCd', 'SQLPARAM_1', '<%=aAF0040010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form2', '_AF0040011form2/WH_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WH_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AF0040011form2/WH_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AF0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AF0040010.AF0040011form2.PeekerWhCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form2.PeekerWhCd['onClick' + i])) {
        expj.AF0040010.AF0040011form2.PeekerWhCd['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011form2.PeekerWhCd.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040011form2.PeekerWhCd.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-PeekerWhCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011form2', 'PeekerWhCd', this, 'Button');
    }
  });
  expj.AF0040010.AF0040011form2.PeekerWhCd.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.PeekerWhCd.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/PeekerWhCd.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-PeekerWhCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AF0040010-AF0040011form2-PeekerWhCd" class="AF0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-WH_NAME">
expj.AF0040010.AF0040011form2.WH_NAME = {};
expj.AF0040010.AF0040011form2.WH_NAME.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/WH_NAME.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.WH_NAME.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-WH_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'WH_NAME', this);
  });
  expj.AF0040010.AF0040011form2.WH_NAME.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.WH_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/WH_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-WH_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-WH_NAME" name="WH_NAME" class="AF0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getWH_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-WH_FLG" name="WH_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getWH_FLG()) %>">
<script class="expj-script-AF0040010-AF0040011form2-WH_FLG">
expj.AF0040010.AF0040011form2.WH_FLG = {};
expj.AF0040010.AF0040011form2.WH_FLG.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/WH_FLG.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.WH_FLG.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-WH_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'WH_FLG', this);
  });
  expj.AF0040010.AF0040011form2.WH_FLG.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.WH_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/WH_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-WH_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_LOT_NO",rb)%></span><!-- メーカロット番号 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form2-VEND_LOT_NO">
expj.AF0040010.AF0040011form2.VEND_LOT_NO = {};
expj.AF0040010.AF0040011form2.VEND_LOT_NO.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/VEND_LOT_NO.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.VEND_LOT_NO.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-VEND_LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'VEND_LOT_NO', this);
  });
  expj.AF0040010.AF0040011form2.VEND_LOT_NO.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.VEND_LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/VEND_LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-VEND_LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form2-VEND_LOT_NO" name="VEND_LOT_NO" class="AF0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getVEND_LOT_NO()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form2-INSTALL_FLG" name="INSTALL_FLG" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getINSTALL_FLG()) %>">
<script class="expj-script-AF0040010-AF0040011form2-INSTALL_FLG">
expj.AF0040010.AF0040011form2.INSTALL_FLG = {};
expj.AF0040010.AF0040011form2.INSTALL_FLG.executeAllOnDecision = function () {
  console.log('execute AF0040011form2/INSTALL_FLG.onDecision');
  expj.AF0040010.AF0040011form2.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form2.INSTALL_FLG.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form2-INSTALL_FLG').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form2', 'INSTALL_FLG', this);
  });
  expj.AF0040010.AF0040011form2.INSTALL_FLG.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form2.INSTALL_FLG.executePScriptOnLoad = function () {
  console.log('execute AF0040011form2/INSTALL_FLG.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form2-INSTALL_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-AF0040010-AF0040011button1">
expj.AF0040010.AF0040011button1 = {};
expj.AF0040010.AF0040011button1.executeAllOnDecision = function () {
  console.log('execute AF0040011button1.onDecision');
};
expj.AF0040010.AF0040011button1.executeOnLoad = function () {
  expj.AF0040010.AF0040011button1.executePScriptOnLoad();
};

expj.AF0040010.AF0040011button1.executePScriptOnLoad = function () {
  console.log('execute AF0040011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0040010-AF0040011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0040010-AF0040011button1-insertSub1">
expj.AF0040010.AF0040011button1.insertSub1 = {};
// script1="onClick;0;CHK;_AF0040011form2/RCV_ISSUE_QTY[lte]0@#AF00055"
expj.AF0040010.AF0040011button1.insertSub1.onClick0 = function () {
  console.log('insertSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/RCV_ISSUE_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00055');
}
};
// script2="onClick;1;CHK;_AF0040011form3/CONS_TYP[eq]1[and]_AF0040011form2/w_WH_CD[eq]@#AF00027"
expj.AF0040010.AF0040011button1.insertSub1.onClick1 = function () {
  console.log('insertSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form3/CONS_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/w_WH_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00027');
}
};
// script3="onClick;2;CHK;_AF0040011form3/CONS_TYP[eq]1[and]_AF0040011form2/w_WH_CD[neq][and]_AF0040011form2/WH_CD[neq][and]_AF0040011form2/w_WH_CD[eq]_AF0040011form2/WH_CD@#AF00054"
expj.AF0040010.AF0040011button1.insertSub1.onClick2 = function () {
  console.log('insertSub1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form3/CONS_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/w_WH_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/WH_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/w_WH_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/WH_CD'))) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00054');
}
};
// script4="onClick;3;CHK;_AF0040011form3/CONS_TYP[neq]1[and]_AF0040011form2/w_WH_CD[eq]@#AF00027"
expj.AF0040010.AF0040011button1.insertSub1.onClick3 = function () {
  console.log('insertSub1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form3/CONS_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/w_WH_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00027');
}
};
// script5="onClick;4;CHK;_AF0040011form2/h_WH_CD[neq][and]_AF0040011form2/WH_CD[eq]@#AF00030"
expj.AF0040010.AF0040011button1.insertSub1.onClick4 = function () {
  console.log('insertSub1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/h_WH_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/WH_CD'), '[eq]', '')) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00030');
}
};
// script6="onClick;5;CHK;_AF0040011form2/h_WH_CD[eq][and]_AF0040011form2/WH_CD[neq]@#AF00138"
expj.AF0040010.AF0040011button1.insertSub1.onClick5 = function () {
  console.log('insertSub1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/h_WH_CD'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/WH_CD'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00138');
}
};
// script7="onClick;6;CHK;_AF0040011form3/CONS_TYP[neq]1[and]_AF0040011form2/w_WH_CD[neq][and]_AF0040011form2/WH_CD[neq][and]_AF0040011form2/w_WH_CD[eq]_AF0040011form2/WH_CD@#AF00054"
expj.AF0040010.AF0040011button1.insertSub1.onClick6 = function () {
  console.log('insertSub1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form3/CONS_TYP'), '[neq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/w_WH_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/WH_CD'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/w_WH_CD'), '[eq]', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/WH_CD'))) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00054');
}
};
// script8="onClick;7;CHK;_AF0040011form2/RCV_ISSUE_DATE[gt]_AF0040011form3/BUSINESS_OPR_DATE@#ZZ05103"
expj.AF0040010.AF0040011button1.insertSub1.onClick7 = function () {
  console.log('insertSub1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/RCV_ISSUE_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form3/BUSINESS_OPR_DATE')))) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'ZZ05103');
}
};
// script9="onClick;8;CHK;_AF0040011form2/INSTALL_FLG[eq]1[and]_AF0040011form3/CONS_TYP[eq]1@*0"
expj.AF0040010.AF0040011button1.insertSub1.onClick8 = function () {
  console.log('insertSub1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/INSTALL_FLG'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form3/CONS_TYP'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script10="onClick;9;CHK;_AF0040011form2/RCV_ISSUE_DATE[lt]_AF0040011form2/ISSUE_CMPLT_DATE@#AF00170"
expj.AF0040010.AF0040011button1.insertSub1.onClick9 = function () {
  console.log('insertSub1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/RCV_ISSUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/ISSUE_CMPLT_DATE')))) {
expj.common.pscript.addErrorMessage('AF0040010', 'AF0040011button1', 'AF00170');
}
};
// script11="onClick;10;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0040011form1/*,_AF0040011form2/*,_AF0040011form3/*@AF0040010Servlet,,$ZZ07003"
expj.AF0040010.AF0040011button1.insertSub1.onClick10 = function () {
  console.log('insertSub1 script11');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0040010', 'AF0040011button1', '_AF0040011form1/*,_AF0040011form2/*,_AF0040011form3/*', 'AF0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0040010', response);
expj.common.changeBusinessScreenTab('AF0040010', contents);
};
expj.common.pscript.callConfirm('AF0040010', 'AF0040011button1', 'ZZ07003', okEvent);
};
// script12="child;0;CHK;_AF0040011form2/THIS_MONTH[neq]@*1,$AF00142"
expj.AF0040010.AF0040011button1.insertSub1.child0 = function () {
  console.log('insertSub1 script12');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/THIS_MONTH'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
expj.common.pscript.addWarningMessage('AF0040010', 'AF0040011button1', 'AF00142');
}
};
// script13="child;1;CHK;_AF0040011form2/THIS_MONTH[gt]~TO_YYYY_MM(_AF0040011form2/RCV_ISSUE_DATE)@$AF00144"
expj.AF0040010.AF0040011button1.insertSub1.child1 = function () {
  console.log('insertSub1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011button1', '_AF0040011form2/THIS_MONTH')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.func.TO_YYYY_MM('AF0040010', 'AF0040011button1', '_AF0040011form2/RCV_ISSUE_DATE')))) {
expj.common.pscript.addWarningMessage('AF0040010', 'AF0040011button1', 'AF00144');
}
};
expj.AF0040010.AF0040011button1.insertSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 10; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011button1.insertSub1['onClick' + i])) {
        expj.AF0040010.AF0040011button1.insertSub1['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011button1.insertSub1.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040011button1.insertSub1.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011button1-insertSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011button1', 'insertSub1', this, 'Button');
    }
  });
  expj.AF0040010.AF0040011button1.insertSub1.executePScriptOnLoad();
};

expj.AF0040010.AF0040011button1.insertSub1.executePScriptOnLoad = function () {
  console.log('execute AF0040011button1/insertSub1.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011button1-insertSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0040010-AF0040011button1-insertSub1" name="insertSub1" class="AF0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AF0040010-AF0040011form3">
expj.AF0040010.AF0040011form3 = {};
expj.AF0040010.AF0040011form3.executeAllOnDecision = function () {
  console.log('execute AF0040011form3.onDecision');
};
expj.AF0040010.AF0040011form3.executeOnLoad = function () {
  expj.AF0040010.AF0040011form3.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AF0040010-AF0040011form3" action="AF0040010Servlet" name="AF0040011form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-ITEM_CD">
expj.AF0040010.AF0040011form3.ITEM_CD = {};
expj.AF0040010.AF0040011form3.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/ITEM_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.ITEM_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'ITEM_CD', this);
  });
  expj.AF0040010.AF0040011form3.ITEM_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-ITEM_CD" name="ITEM_CD" class="AF0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-ITEM_NAME">
expj.AF0040010.AF0040011form3.ITEM_NAME = {};
expj.AF0040010.AF0040011form3.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/ITEM_NAME.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'ITEM_NAME', this);
  });
  expj.AF0040010.AF0040011form3.ITEM_NAME.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-ITEM_NAME" name="ITEM_NAME" class="AF0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-DRAW_CD">
expj.AF0040010.AF0040011form3.DRAW_CD = {};
expj.AF0040010.AF0040011form3.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/DRAW_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.DRAW_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'DRAW_CD', this);
  });
  expj.AF0040010.AF0040011form3.DRAW_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-DRAW_CD" name="DRAW_CD" class="AF0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-SPEC">
expj.AF0040010.AF0040011form3.SPEC = {};
expj.AF0040010.AF0040011form3.SPEC.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/SPEC.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.SPEC.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'SPEC', this);
  });
  expj.AF0040010.AF0040011form3.SPEC.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.SPEC.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-SPEC" name="SPEC" class="AF0040010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CONS_TYP",rb)%></span><!-- 支給区分 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-w_CONS_TYP_NAME">
expj.AF0040010.AF0040011form3.w_CONS_TYP_NAME = {};
expj.AF0040010.AF0040011form3.w_CONS_TYP_NAME.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/w_CONS_TYP_NAME.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.w_CONS_TYP_NAME.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-w_CONS_TYP_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'w_CONS_TYP_NAME', this);
  });
  expj.AF0040010.AF0040011form3.w_CONS_TYP_NAME.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.w_CONS_TYP_NAME.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/w_CONS_TYP_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-w_CONS_TYP_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-w_CONS_TYP_NAME" name="w_CONS_TYP_NAME" class="AF0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_CONS_TYP_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_INST_QTY",rb)%></span><!-- 出庫指示数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-ISSUE_INST_QTY">
expj.AF0040010.AF0040011form3.ISSUE_INST_QTY = {};
expj.AF0040010.AF0040011form3.ISSUE_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/ISSUE_INST_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.ISSUE_INST_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-ISSUE_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'ISSUE_INST_QTY', this);
  });
  expj.AF0040010.AF0040011form3.ISSUE_INST_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.ISSUE_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/ISSUE_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-ISSUE_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-ISSUE_INST_QTY" name="ISSUE_INST_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getISSUE_INST_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_1">
expj.AF0040010.AF0040011form3.STOCK_UNIT_1 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_1.onLoad0 = function () {
  console.log('STOCK_UNIT_1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_1.child0 = function () {
  console.log('STOCK_UNIT_1 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_1.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_1.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_1', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_1.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_1['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_1" name="STOCK_UNIT_1" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-h_SHIP_COMPLETE" name="h_SHIP_COMPLETE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.geth_SHIP_COMPLETE()) %>">
<script class="expj-script-AF0040010-AF0040011form3-h_SHIP_COMPLETE">
expj.AF0040010.AF0040011form3.h_SHIP_COMPLETE = {};
expj.AF0040010.AF0040011form3.h_SHIP_COMPLETE.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/h_SHIP_COMPLETE.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.h_SHIP_COMPLETE.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-h_SHIP_COMPLETE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'h_SHIP_COMPLETE', this);
  });
  expj.AF0040010.AF0040011form3.h_SHIP_COMPLETE.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.h_SHIP_COMPLETE.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/h_SHIP_COMPLETE.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-h_SHIP_COMPLETE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AF0040010-AF0040011form3-BUSINESS_OPR_DATE">
expj.AF0040010.AF0040011form3.BUSINESS_OPR_DATE = {};
expj.AF0040010.AF0040011form3.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/BUSINESS_OPR_DATE.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'BUSINESS_OPR_DATE', this);
  });
  expj.AF0040010.AF0040011form3.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-CONS_TYP" name="CONS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getCONS_TYP()) %>">
<script class="expj-script-AF0040010-AF0040011form3-CONS_TYP">
expj.AF0040010.AF0040011form3.CONS_TYP = {};
expj.AF0040010.AF0040011form3.CONS_TYP.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/CONS_TYP.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.CONS_TYP.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-CONS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'CONS_TYP', this);
  });
  expj.AF0040010.AF0040011form3.CONS_TYP.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.CONS_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/CONS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-CONS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.TOTAL_ISSUE_QTY",rb)%></span><!-- 出庫累計数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-TOTAL_ISSUE_QTY">
expj.AF0040010.AF0040011form3.TOTAL_ISSUE_QTY = {};
expj.AF0040010.AF0040011form3.TOTAL_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/TOTAL_ISSUE_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.TOTAL_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-TOTAL_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'TOTAL_ISSUE_QTY', this);
  });
  expj.AF0040010.AF0040011form3.TOTAL_ISSUE_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.TOTAL_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/TOTAL_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-TOTAL_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-TOTAL_ISSUE_QTY" name="TOTAL_ISSUE_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getTOTAL_ISSUE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_2">
expj.AF0040010.AF0040011form3.STOCK_UNIT_2 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_2.onLoad0 = function () {
  console.log('STOCK_UNIT_2 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_2.child0 = function () {
  console.log('STOCK_UNIT_2 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_2.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_2.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_2', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_2.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_2['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_2['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_2" name="STOCK_UNIT_2" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AF0040010-AF0040011form3-MODIFY_COUNT">
expj.AF0040010.AF0040011form3.MODIFY_COUNT = {};
expj.AF0040010.AF0040011form3.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/MODIFY_COUNT.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'MODIFY_COUNT', this);
  });
  expj.AF0040010.AF0040011form3.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AF0040010-AF0040011form3-UNIT_QTY_TYP">
expj.AF0040010.AF0040011form3.UNIT_QTY_TYP = {};
expj.AF0040010.AF0040011form3.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/UNIT_QTY_TYP.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'UNIT_QTY_TYP', this);
  });
  expj.AF0040010.AF0040011form3.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0305",rb)%></span><!-- 出庫残数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-w_SHIP_REMAIN_QTY">
expj.AF0040010.AF0040011form3.w_SHIP_REMAIN_QTY = {};
expj.AF0040010.AF0040011form3.w_SHIP_REMAIN_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/w_SHIP_REMAIN_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.w_SHIP_REMAIN_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-w_SHIP_REMAIN_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'w_SHIP_REMAIN_QTY', this);
  });
  expj.AF0040010.AF0040011form3.w_SHIP_REMAIN_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.w_SHIP_REMAIN_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/w_SHIP_REMAIN_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-w_SHIP_REMAIN_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-w_SHIP_REMAIN_QTY" name="w_SHIP_REMAIN_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_SHIP_REMAIN_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_3">
expj.AF0040010.AF0040011form3.STOCK_UNIT_3 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_3.onLoad0 = function () {
  console.log('STOCK_UNIT_3 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_3.child0 = function () {
  console.log('STOCK_UNIT_3 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_3.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_3.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_3.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_3', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_3.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_3.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_3.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_3['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_3['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_3" name="STOCK_UNIT_3" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-WORK_ODR_CD" name="WORK_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getWORK_ODR_CD()) %>">
<script class="expj-script-AF0040010-AF0040011form3-WORK_ODR_CD">
expj.AF0040010.AF0040011form3.WORK_ODR_CD = {};
expj.AF0040010.AF0040011form3.WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/WORK_ODR_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'WORK_ODR_CD', this);
  });
  expj.AF0040010.AF0040011form3.WORK_ODR_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-WORK_IN_PROC_CD" name="WORK_IN_PROC_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getWORK_IN_PROC_CD()) %>">
<script class="expj-script-AF0040010-AF0040011form3-WORK_IN_PROC_CD">
expj.AF0040010.AF0040011form3.WORK_IN_PROC_CD = {};
expj.AF0040010.AF0040011form3.WORK_IN_PROC_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/WORK_IN_PROC_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.WORK_IN_PROC_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-WORK_IN_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'WORK_IN_PROC_CD', this);
  });
  expj.AF0040010.AF0040011form3.WORK_IN_PROC_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.WORK_IN_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/WORK_IN_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-WORK_IN_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_ON_HAND_QTY_3",rb)%></span><!-- 保管区在庫数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-w_STOCK_ON_HAND_QTY">
expj.AF0040010.AF0040011form3.w_STOCK_ON_HAND_QTY = {};
expj.AF0040010.AF0040011form3.w_STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/w_STOCK_ON_HAND_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.w_STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-w_STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'w_STOCK_ON_HAND_QTY', this);
  });
  expj.AF0040010.AF0040011form3.w_STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.w_STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/w_STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-w_STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-w_STOCK_ON_HAND_QTY" name="w_STOCK_ON_HAND_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_STOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_4">
expj.AF0040010.AF0040011form3.STOCK_UNIT_4 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_4.onLoad0 = function () {
  console.log('STOCK_UNIT_4 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_4.child0 = function () {
  console.log('STOCK_UNIT_4 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_4.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_4.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_4.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_4', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_4.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_4.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_4.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_4['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_4['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_4" name="STOCK_UNIT_4" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-PUCH_ODR_CD" name="PUCH_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getPUCH_ODR_CD()) %>">
<script class="expj-script-AF0040010-AF0040011form3-PUCH_ODR_CD">
expj.AF0040010.AF0040011form3.PUCH_ODR_CD = {};
expj.AF0040010.AF0040011form3.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/PUCH_ODR_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'PUCH_ODR_CD', this);
  });
  expj.AF0040010.AF0040011form3.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-VEND_CD" name="VEND_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getVEND_CD()) %>">
<script class="expj-script-AF0040010-AF0040011form3-VEND_CD">
expj.AF0040010.AF0040011form3.VEND_CD = {};
expj.AF0040010.AF0040011form3.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/VEND_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.VEND_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'VEND_CD', this);
  });
  expj.AF0040010.AF0040011form3.VEND_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-COMPANY_CD" name="COMPANY_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getCOMPANY_CD()) %>">
<script class="expj-script-AF0040010-AF0040011form3-COMPANY_CD">
expj.AF0040010.AF0040011form3.COMPANY_CD = {};
expj.AF0040010.AF0040011form3.COMPANY_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/COMPANY_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.COMPANY_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-COMPANY_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'COMPANY_CD', this);
  });
  expj.AF0040010.AF0040011form3.COMPANY_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.COMPANY_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/COMPANY_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-COMPANY_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0306",rb)%></span><!-- 在庫累計数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-w_TOTAL_STOCK_ON_HAND_QTY">
expj.AF0040010.AF0040011form3.w_TOTAL_STOCK_ON_HAND_QTY = {};
expj.AF0040010.AF0040011form3.w_TOTAL_STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/w_TOTAL_STOCK_ON_HAND_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.w_TOTAL_STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-w_TOTAL_STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'w_TOTAL_STOCK_ON_HAND_QTY', this);
  });
  expj.AF0040010.AF0040011form3.w_TOTAL_STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.w_TOTAL_STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/w_TOTAL_STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-w_TOTAL_STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-w_TOTAL_STOCK_ON_HAND_QTY" name="w_TOTAL_STOCK_ON_HAND_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getw_TOTAL_STOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_5">
expj.AF0040010.AF0040011form3.STOCK_UNIT_5 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_5.onLoad0 = function () {
  console.log('STOCK_UNIT_5 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_5.child0 = function () {
  console.log('STOCK_UNIT_5 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_5.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_5.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_5.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_5', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_5.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_5.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_5.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_5['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_5['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_5" name="STOCK_UNIT_5" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-ISSUE_TYP" name="ISSUE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getISSUE_TYP()) %>">
<script class="expj-script-AF0040010-AF0040011form3-ISSUE_TYP">
expj.AF0040010.AF0040011form3.ISSUE_TYP = {};
expj.AF0040010.AF0040011form3.ISSUE_TYP.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/ISSUE_TYP.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.ISSUE_TYP.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-ISSUE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'ISSUE_TYP', this);
  });
  expj.AF0040010.AF0040011form3.ISSUE_TYP.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.ISSUE_TYP.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/ISSUE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-ISSUE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-OD_NO" name="OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getOD_NO()) %>">
<script class="expj-script-AF0040010-AF0040011form3-OD_NO">
expj.AF0040010.AF0040011form3.OD_NO = {};
expj.AF0040010.AF0040011form3.OD_NO.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/OD_NO.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.OD_NO.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'OD_NO', this);
  });
  expj.AF0040010.AF0040011form3.OD_NO.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.OD_NO.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-OD_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AF0040010-AF0040011form3-JOB_ODR_CD" name="JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getJOB_ODR_CD()) %>">
<script class="expj-script-AF0040010-AF0040011form3-JOB_ODR_CD">
expj.AF0040010.AF0040011form3.JOB_ODR_CD = {};
expj.AF0040010.AF0040011form3.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/JOB_ODR_CD.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'JOB_ODR_CD', this);
  });
  expj.AF0040010.AF0040011form3.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0331",rb)%></span><!-- 品目在庫未引当数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-ITEM_STOCK_NON_ALC_QTY">
expj.AF0040010.AF0040011form3.ITEM_STOCK_NON_ALC_QTY = {};
expj.AF0040010.AF0040011form3.ITEM_STOCK_NON_ALC_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/ITEM_STOCK_NON_ALC_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.ITEM_STOCK_NON_ALC_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-ITEM_STOCK_NON_ALC_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'ITEM_STOCK_NON_ALC_QTY', this);
  });
  expj.AF0040010.AF0040011form3.ITEM_STOCK_NON_ALC_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.ITEM_STOCK_NON_ALC_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/ITEM_STOCK_NON_ALC_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-ITEM_STOCK_NON_ALC_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-ITEM_STOCK_NON_ALC_QTY" name="ITEM_STOCK_NON_ALC_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getITEM_STOCK_NON_ALC_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_6">
expj.AF0040010.AF0040011form3.STOCK_UNIT_6 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_6.onLoad0 = function () {
  console.log('STOCK_UNIT_6 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_6.child0 = function () {
  console.log('STOCK_UNIT_6 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_6.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_6.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_6.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_6').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_6', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_6.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_6.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_6.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_6');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_6['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_6['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_6" name="STOCK_UNIT_6" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0333",rb)%></span><!-- 個別手配分出庫可能数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-ODR_ISSUE_POSS_QTY">
expj.AF0040010.AF0040011form3.ODR_ISSUE_POSS_QTY = {};
expj.AF0040010.AF0040011form3.ODR_ISSUE_POSS_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/ODR_ISSUE_POSS_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.ODR_ISSUE_POSS_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-ODR_ISSUE_POSS_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'ODR_ISSUE_POSS_QTY', this);
  });
  expj.AF0040010.AF0040011form3.ODR_ISSUE_POSS_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.ODR_ISSUE_POSS_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/ODR_ISSUE_POSS_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-ODR_ISSUE_POSS_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-ODR_ISSUE_POSS_QTY" name="ODR_ISSUE_POSS_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getODR_ISSUE_POSS_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_7">
expj.AF0040010.AF0040011form3.STOCK_UNIT_7 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_7.onLoad0 = function () {
  console.log('STOCK_UNIT_7 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_7.child0 = function () {
  console.log('STOCK_UNIT_7 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_7.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_7.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_7.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_7').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_7', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_7.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_7.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_7.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_7');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_7['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_7['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_7" name="STOCK_UNIT_7" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0335",rb)%></span><!-- 引当済未出庫数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-ALC_NOISSUE_QTY">
expj.AF0040010.AF0040011form3.ALC_NOISSUE_QTY = {};
expj.AF0040010.AF0040011form3.ALC_NOISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/ALC_NOISSUE_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.ALC_NOISSUE_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-ALC_NOISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'ALC_NOISSUE_QTY', this);
  });
  expj.AF0040010.AF0040011form3.ALC_NOISSUE_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.ALC_NOISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/ALC_NOISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-ALC_NOISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-ALC_NOISSUE_QTY" name="ALC_NOISSUE_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getALC_NOISSUE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_8">
expj.AF0040010.AF0040011form3.STOCK_UNIT_8 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_8.onLoad0 = function () {
  console.log('STOCK_UNIT_8 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_8.child0 = function () {
  console.log('STOCK_UNIT_8 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_8.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_8.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_8.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_8').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_8', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_8.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_8.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_8.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_8');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_8['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_8['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_8" name="STOCK_UNIT_8" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0337",rb)%></span><!-- 今回出庫可能数 --></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-THIS_TIME_ISSUE_POSS_QTY">
expj.AF0040010.AF0040011form3.THIS_TIME_ISSUE_POSS_QTY = {};
expj.AF0040010.AF0040011form3.THIS_TIME_ISSUE_POSS_QTY.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/THIS_TIME_ISSUE_POSS_QTY.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.THIS_TIME_ISSUE_POSS_QTY.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-THIS_TIME_ISSUE_POSS_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'THIS_TIME_ISSUE_POSS_QTY', this);
  });
  expj.AF0040010.AF0040011form3.THIS_TIME_ISSUE_POSS_QTY.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.THIS_TIME_ISSUE_POSS_QTY.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/THIS_TIME_ISSUE_POSS_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-THIS_TIME_ISSUE_POSS_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-THIS_TIME_ISSUE_POSS_QTY" name="THIS_TIME_ISSUE_POSS_QTY" class="AF0040010-focus-move expj-align-right " style="width:150px;text-align: right;" data-kind="OBT_NUMBER;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAF0040010Struct.getTHIS_TIME_ISSUE_POSS_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AF0040010-AF0040011form3-STOCK_UNIT_9">
expj.AF0040010.AF0040011form3.STOCK_UNIT_9 = {};
// script1="onLoad;0;CALL;child@0"
expj.AF0040010.AF0040011form3.STOCK_UNIT_9.onLoad0 = function () {
  console.log('STOCK_UNIT_9 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;SET;_THIS=_AF0040011form2/STOCK_UNIT"
expj.AF0040010.AF0040011form3.STOCK_UNIT_9.child0 = function () {
  console.log('STOCK_UNIT_9 script2');
expj.common.pscript.setReferenceComponentValue('AF0040010', 'AF0040011form3', '_THIS', expj.common.pscript.getReferenceComponentValue('AF0040010', 'AF0040011form3', '_AF0040011form2/STOCK_UNIT'));
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_9.executeAllOnDecision = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_9.onDecision');
  expj.AF0040010.AF0040011form3.executeAllOnDecision();
  expj.AF0040010.executeAllOnDecision();
};
expj.AF0040010.AF0040011form3.STOCK_UNIT_9.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011form3-STOCK_UNIT_9').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AF0040010', 'AF0040011form3', 'STOCK_UNIT_9', this);
  });
  expj.AF0040010.AF0040011form3.STOCK_UNIT_9.executePScriptOnLoad();
};

expj.AF0040010.AF0040011form3.STOCK_UNIT_9.executePScriptOnLoad = function () {
  console.log('execute AF0040011form3/STOCK_UNIT_9.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011form3-STOCK_UNIT_9');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AF0040010.AF0040011form3.STOCK_UNIT_9['onLoad' + i])) {
      expj.AF0040010.AF0040011form3.STOCK_UNIT_9['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AF0040010-AF0040011form3-STOCK_UNIT_9" name="STOCK_UNIT_9" class="AF0040010-focus-move  " style="width:110px;" data-kind="" value="" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AF0040011 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AF0040010-AF0040011button0">
expj.AF0040010.AF0040011button0 = {};
expj.AF0040010.AF0040011button0.executeAllOnDecision = function () {
  console.log('execute AF0040011button0.onDecision');
};
expj.AF0040010.AF0040011button0.executeOnLoad = function () {
  expj.AF0040010.AF0040011button0.executePScriptOnLoad();
};

expj.AF0040010.AF0040011button0.executePScriptOnLoad = function () {
  console.log('execute AF0040011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AF0040010-AF0040011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AF0040010-AF0040011button0-closeSub1">
expj.AF0040010.AF0040011button0.closeSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AF0040011form1/*,_AF0040011form2/*,_AF0040011form3/*@AF0040010Servlet,,$ZZ07013"
expj.AF0040010.AF0040011button0.closeSub1.onClick0 = function () {
  console.log('closeSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AF0040010', 'AF0040011button0', '_AF0040011form1/*,_AF0040011form2/*,_AF0040011form3/*', 'AF0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AF0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AF0040010', response);
expj.common.changeBusinessScreenTab('AF0040010', contents);
};
expj.common.pscript.callConfirm('AF0040010', 'AF0040011button0', 'ZZ07013', okEvent);
};
expj.AF0040010.AF0040011button0.closeSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AF0040010.AF0040011button0.closeSub1['onClick' + i])) {
        expj.AF0040010.AF0040011button0.closeSub1['onClick' + i]();
      }
    }
  }
};
expj.AF0040010.AF0040011button0.closeSub1.executeAllOnDecision = function () {
};
expj.AF0040010.AF0040011button0.closeSub1.executeOnLoad = function () {
  $('#expj-AF0040010-AF0040011button0-closeSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AF0040010', 'AF0040011button0', 'closeSub1', this, 'Button');
    }
  });
  expj.AF0040010.AF0040011button0.closeSub1.executePScriptOnLoad();
};

expj.AF0040010.AF0040011button0.closeSub1.executePScriptOnLoad = function () {
  console.log('execute AF0040011button0/closeSub1.onLoad');
  var targetComponent = document.getElementById('expj-AF0040010-AF0040011button0-closeSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AF0040010-AF0040011button0-closeSub1" name="closeSub1" class="AF0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AF0040010 (END)-->
<%
MessageStruct msgStruct = aAF0040010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AF0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AF0040010)) {
  expj.common.treeInstanceMap.AF0040010 = {};
}
expj.common.treeInstanceMap.AF0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AF0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AF0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AF0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AF0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AF0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AF0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010)) {
  expj.common.detailDialogMap.AF0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AF0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AF0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AF0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AF0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AF0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AF0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AF0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AF0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AF0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AF0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AF0040010)) {
  expj.common.viewInstanceMap.AF0040010 = {};
}
expj.common.viewInstanceMap.AF0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AF0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AF0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AF0040010.<%=viewId %>.init = function () {
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
    expj.AF0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AF0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AF0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AF0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AF0040010_init">
/**
 * AF0040010用のロード完了時初期化関数
 */
expj.AF0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AF0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AF0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AF0040010');
  expj.common.calendarInstanceMap.AF0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AF0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AF0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AF0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AF0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AF0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AF0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AF0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AF0040010.AF0040011form1.ISSUE_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.w_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.PeekerWJobOdrCd.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.c_JOB_ODR.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.h_JOB_ODR.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.h_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.w_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.PeekerWWhCd.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.w_WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.selectSub1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.RCV_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.c_SHIP_COMPLETE.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.THIS_MONTH.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.RCV_ISSUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.CalendarRcvIssueDate.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.ISSUE_CMPLT_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.h_WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.WH_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.PeekerWhCd.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.WH_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.WH_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.VEND_LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.INSTALL_FLG.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011button1.insertSub1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.SPEC.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.w_CONS_TYP_NAME.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.ISSUE_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.h_SHIP_COMPLETE.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.CONS_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.TOTAL_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.w_SHIP_REMAIN_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_3.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.WORK_IN_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.w_STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_4.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.COMPANY_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.w_TOTAL_STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_5.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.ISSUE_TYP.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.OD_NO.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.ITEM_STOCK_NON_ALC_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_6.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.ODR_ISSUE_POSS_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_7.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.ALC_NOISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_8.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.THIS_TIME_ISSUE_POSS_QTY.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.STOCK_UNIT_9.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011button0.closeSub1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form2.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011button1.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011form3.executeOnLoad();}catch(e){};
  try{expj.AF0040010.AF0040011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AF0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AF0040010', 'AF0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AF0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AF0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AF0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AF0040010', '<%=request.getContextPath() %>');
};

/**
 * AF0040010の全体onDecision処理
 */
expj.AF0040010.executeAllOnDecision = function () {
  expj.AF0040010.AF0040011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AF0040010_console">
expj.AF0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>