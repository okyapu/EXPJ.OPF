<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:30:18 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AD0020\AD0020012.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AD0020.*" %>
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
<jsp:useBean id="aAD0020011Control" class="com.nec.jp.orteus.metamorBase.AD0020.AD0020011Control" scope="request"/>
<jsp:useBean id="aAD0020011Struct" class="com.nec.jp.orteus.metamorBase.AD0020.AD0020011Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目別作業計画メンテナンス（製番）サブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/jsp/AD0020012.jsp,v $
$Author: geng-jia $	
$Revision: 1.12 $ $Date: 2017/02/22 02:04:42 $
********************************************************* --%>
<html>
<head>
<title>品目別作業計画メンテナンス（製番）サブ１</title>
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
<script class="expj-script-AD0020011_init">
  // AD0020011名前空間
  expj.AD0020011 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<% String CallButton = aAD0020011Control.getButton(); %>
  <div id="expj-business-screen-AD0020011" data-screen="AD0020012" data-newdata="<%=aAD0020011Control.isNewData() %>">
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
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AD0020011-AD0020012form1">
expj.AD0020011.AD0020012form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AD0020011.AD0020012form1.onLoad0 = function () {
  console.log('AD0020012form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]LineInsert[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]LineCopy[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]Insert@*0,*2"
expj.AD0020011.AD0020012form1.onDecision0 = function () {
  console.log('AD0020012form1 script2');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Insert')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHKRQ;A@*1,*2"
expj.AD0020011.AD0020012form1.child0 = function () {
  console.log('AD0020012form1 script3');
if (expj.common.pscript.satisfiedRequiredComponent('AD0020011', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AD0020012button1/Insert"
expj.AD0020011.AD0020012form1.child1 = function () {
  console.log('AD0020012form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012button1/Insert');
};
// script5="child;2;MASK;_AD0020012button1/Insert"
expj.AD0020011.AD0020012form1.child2 = function () {
  console.log('AD0020012form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012button1/Insert');
};
// script6="onDecision;1;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]LineUpdate[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]Update@*3,*5"
expj.AD0020011.AD0020012form1.onDecision1 = function () {
  console.log('AD0020012form1 script6');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'LineUpdate') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Update')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHKRQ;A@*4,*5"
expj.AD0020011.AD0020012form1.child3 = function () {
  console.log('AD0020012form1 script7');
if (expj.common.pscript.satisfiedRequiredComponent('AD0020011', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AD0020012button1/Update"
expj.AD0020011.AD0020012form1.child4 = function () {
  console.log('AD0020012form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012button1/Update');
};
// script9="child;5;MASK;_AD0020012button1/Update"
expj.AD0020011.AD0020012form1.child5 = function () {
  console.log('AD0020012form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012button1/Update');
};
// script10="onDecision;2;CHK;_AD0020012form2/TIME_CTRL[eq]true@*6,*7"
expj.AD0020011.AD0020012form1.onDecision2 = function () {
  console.log('AD0020012form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012form1', '_AD0020012form2/TIME_CTRL'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AD0020012form2/WORK_ODR_DLV_DATE_TIME,_AD0020012form2/OPR_INST_START_DATE_TIME"
expj.AD0020011.AD0020012form1.child6 = function () {
  console.log('AD0020012form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/OPR_INST_START_DATE_TIME');
};
// script12="child;7;MASK;_AD0020012form2/WORK_ODR_DLV_DATE_TIME,_AD0020012form2/OPR_INST_START_DATE_TIME"
expj.AD0020011.AD0020012form1.child7 = function () {
  console.log('AD0020012form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/OPR_INST_START_DATE_TIME');
};
// script13="onDecision;3;CHK;_AD0020012form2/h_MANHOUR_TYP[numeq]1@*8,*10"
expj.AD0020011.AD0020012form1.onDecision3 = function () {
  console.log('AD0020012form1 script13');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012form1', '_AD0020012form2/h_MANHOUR_TYP')), '[numeq]', expj.common.pscript.convertNumber('1'))) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
} else {
if(expj.common.checkNameSpace(this.child10)){this.child10();}
}
};
// script14="child;8;MASK;_AD0020012form2/OPR_INST_QTY@*9"
expj.AD0020011.AD0020012form1.child8 = function () {
  console.log('AD0020012form1 script14');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/OPR_INST_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child9)){this.child9();}}
};
// script15="child;9;MASK;_AD0020012form2/OUTSIDE_TYP"
expj.AD0020011.AD0020012form1.child9 = function () {
  console.log('AD0020012form1 script15');
expj.common.pscript.setMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/OUTSIDE_TYP');
};
// script16="child;10;UNMASK;_AD0020012form2/OPR_INST_QTY@*11"
expj.AD0020011.AD0020012form1.child10 = function () {
  console.log('AD0020012form1 script16');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/OPR_INST_QTY');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child11)){this.child11();}}
};
// script17="child;11;UNMASK;_AD0020012form2/OUTSIDE_TYP"
expj.AD0020011.AD0020012form1.child11 = function () {
  console.log('AD0020012form1 script17');
expj.common.pscript.setUnMaskToReferenceComponent('AD0020011', 'AD0020012form1', '_AD0020012form2/OUTSIDE_TYP');
};
expj.AD0020011.AD0020012form1.executeAllOnDecision = function () {
  console.log('execute AD0020012form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020012form1['onDecision' + i])) {
        expj.AD0020011.AD0020012form1['onDecision' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020012form1.executeOnLoad = function () {
  expj.AD0020011.AD0020012form1.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form1.executePScriptOnLoad = function () {
  console.log('execute AD0020012form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AD0020011.AD0020012form1['onLoad' + i])) {
      expj.AD0020011.AD0020012form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0020011-AD0020012form1" action="AD0020011Servlet" name="AD0020012form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aAD0020011Control.getReadStatusString()) %>" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<script class="expj-script-AD0020011-AD0020012form1-WORK_ODR_CD">
expj.AD0020011.AD0020012form1.WORK_ODR_CD = {};
expj.AD0020011.AD0020012form1.WORK_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AD0020012form1/WORK_ODR_CD.onDecision');
  expj.AD0020011.AD0020012form1.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form1.WORK_ODR_CD.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form1-WORK_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form1', 'WORK_ODR_CD', this);
  });
  expj.AD0020011.AD0020012form1.WORK_ODR_CD.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form1.WORK_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AD0020012form1/WORK_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form1-WORK_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form1-WORK_ODR_CD" name="WORK_ODR_CD" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getWORK_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form1-h_ITEM_MODIFY_COUNT" name="h_ITEM_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_ITEM_MODIFY_COUNT()) %>">
<script class="expj-script-AD0020011-AD0020012form1-h_ITEM_MODIFY_COUNT">
expj.AD0020011.AD0020012form1.h_ITEM_MODIFY_COUNT = {};
expj.AD0020011.AD0020012form1.h_ITEM_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AD0020012form1/h_ITEM_MODIFY_COUNT.onDecision');
  expj.AD0020011.AD0020012form1.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form1.h_ITEM_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form1-h_ITEM_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form1', 'h_ITEM_MODIFY_COUNT', this);
  });
  expj.AD0020011.AD0020012form1.h_ITEM_MODIFY_COUNT.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form1.h_ITEM_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AD0020012form1/h_ITEM_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form1-h_ITEM_MODIFY_COUNT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form1-ITEM_CD">
expj.AD0020011.AD0020012form1.ITEM_CD = {};
expj.AD0020011.AD0020012form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AD0020012form1/ITEM_CD.onDecision');
  expj.AD0020011.AD0020012form1.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form1', 'ITEM_CD', this);
  });
  expj.AD0020011.AD0020012form1.ITEM_CD.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AD0020012form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form1-ITEM_CD" name="ITEM_CD" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form1-ITEM_NAME">
expj.AD0020011.AD0020012form1.ITEM_NAME = {};
expj.AD0020011.AD0020012form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AD0020012form1/ITEM_NAME.onDecision');
  expj.AD0020011.AD0020012form1.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form1', 'ITEM_NAME', this);
  });
  expj.AD0020011.AD0020012form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AD0020012form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form1-ITEM_NAME" name="ITEM_NAME" class="AD0020011-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="expj-td" style="width:22px;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AD0020011-AD0020012form2">
expj.AD0020011.AD0020012form2 = {};
expj.AD0020011.AD0020012form2.executeAllOnDecision = function () {
  console.log('execute AD0020012form2.onDecision');
};
expj.AD0020011.AD0020012form2.executeOnLoad = function () {
  expj.AD0020011.AD0020012form2.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AD0020011-AD0020012form2" action="AD0020011Servlet" name="AD0020012form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.DRAW_CD",rb)%></span><!-- 図面番号 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-DRAW_CD">
expj.AD0020011.AD0020012form2.DRAW_CD = {};
expj.AD0020011.AD0020012form2.DRAW_CD.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/DRAW_CD.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.DRAW_CD.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-DRAW_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'DRAW_CD', this);
  });
  expj.AD0020011.AD0020012form2.DRAW_CD.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.DRAW_CD.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/DRAW_CD.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-DRAW_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-DRAW_CD" name="DRAW_CD" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getDRAW_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_MANHOUR_TYP" name="h_MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_MANHOUR_TYP()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_MANHOUR_TYP">
expj.AD0020011.AD0020012form2.h_MANHOUR_TYP = {};
expj.AD0020011.AD0020012form2.h_MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_MANHOUR_TYP.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_MANHOUR_TYP', this);
  });
  expj.AD0020011.AD0020012form2.h_MANHOUR_TYP.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_SPEC",rb)%></span><!-- 規格 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-SPEC">
expj.AD0020011.AD0020012form2.SPEC = {};
expj.AD0020011.AD0020012form2.SPEC.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/SPEC.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.SPEC.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-SPEC').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'SPEC', this);
  });
  expj.AD0020011.AD0020012form2.SPEC.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.SPEC.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/SPEC.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-SPEC');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-SPEC" name="SPEC" class="AD0020011-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getSPEC()) %>" maxlength="2147483647" disabled></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-MRP_ODR_TYP_DN">
expj.AD0020011.AD0020012form2.MRP_ODR_TYP_DN = {};
expj.AD0020011.AD0020012form2.MRP_ODR_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/MRP_ODR_TYP_DN.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.MRP_ODR_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-MRP_ODR_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'MRP_ODR_TYP_DN', this);
  });
  expj.AD0020011.AD0020012form2.MRP_ODR_TYP_DN.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.MRP_ODR_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/MRP_ODR_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-MRP_ODR_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-MRP_ODR_TYP_DN" name="MRP_ODR_TYP_DN" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getMRP_ODR_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_RSLT_TYP",rb)%></span><!-- 作業実績区分 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-OPR_RSLT_TYP_DN">
expj.AD0020011.AD0020012form2.OPR_RSLT_TYP_DN = {};
expj.AD0020011.AD0020012form2.OPR_RSLT_TYP_DN.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/OPR_RSLT_TYP_DN.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.OPR_RSLT_TYP_DN.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-OPR_RSLT_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'OPR_RSLT_TYP_DN', this);
  });
  expj.AD0020011.AD0020012form2.OPR_RSLT_TYP_DN.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.OPR_RSLT_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/OPR_RSLT_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-OPR_RSLT_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-OPR_RSLT_TYP_DN" name="OPR_RSLT_TYP_DN" class="AD0020011-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getOPR_RSLT_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_DUE_DATE" name="h_DUE_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_DUE_DATE()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_DUE_DATE">
expj.AD0020011.AD0020012form2.h_DUE_DATE = {};
expj.AD0020011.AD0020012form2.h_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_DUE_DATE.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_DUE_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_DUE_DATE', this);
  });
  expj.AD0020011.AD0020012form2.h_DUE_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_DUE_DATE_TIME" name="h_DUE_DATE_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_DUE_DATE_TIME()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_DUE_DATE_TIME">
expj.AD0020011.AD0020012form2.h_DUE_DATE_TIME = {};
expj.AD0020011.AD0020012form2.h_DUE_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_DUE_DATE_TIME.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_DUE_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_DUE_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_DUE_DATE_TIME', this);
  });
  expj.AD0020011.AD0020012form2.h_DUE_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_DUE_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_DUE_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_DUE_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.WORK_ODR_DLV_DATE_6",rb)%></span><!-- 品目別製造納期 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE">
expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE = {};
expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/WORK_ODR_DLV_DATE.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'WORK_ODR_DLV_DATE', this);
  });
  expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/WORK_ODR_DLV_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE" name="WORK_ODR_DLV_DATE" class="AD0020011-focus-move  required-value expj-AD0020011-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getWORK_ODR_DLV_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-CalWorkOdrDlvDate">
expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate = {};
// script1="onClick;0;CALENDAR;_AD0020012form2/WORK_ODR_DLV_DATE"
expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate.onClick0 = function () {
  console.log('CalWorkOdrDlvDate script1');
expj.common.pscript.executeCalendar('AD0020011','AD0020012form2','_AD0020012form2/WORK_ODR_DLV_DATE');
};
expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate['onClick' + i])) {
        expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-CalWorkOdrDlvDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020012form2', 'CalWorkOdrDlvDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0020011','AD0020012form2','_AD0020012form2/WORK_ODR_DLV_DATE');
  expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/CalWorkOdrDlvDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-CalWorkOdrDlvDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0020011-AD0020012form2-CalWorkOdrDlvDate" class="AD0020011-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE_TIME">
expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE_TIME = {};
expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/WORK_ODR_DLV_DATE_TIME.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'WORK_ODR_DLV_DATE_TIME', this);
  });
  expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/WORK_ODR_DLV_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-WORK_ODR_DLV_DATE_TIME" name="WORK_ODR_DLV_DATE_TIME" class="AD0020011-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getWORK_ODR_DLV_DATE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_BUSINESS_OPR_DATE">
expj.AD0020011.AD0020012form2.h_BUSINESS_OPR_DATE = {};
expj.AD0020011.AD0020012form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AD0020011.AD0020012form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_CHILD" name="h_CHILD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_CHILD()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_CHILD">
expj.AD0020011.AD0020012form2.h_CHILD = {};
expj.AD0020011.AD0020012form2.h_CHILD.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_CHILD.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_CHILD.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_CHILD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_CHILD', this);
  });
  expj.AD0020011.AD0020012form2.h_CHILD.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_CHILD.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_CHILD.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_CHILD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OPR_INST_START_DATE_6",rb)%></span><!-- 品目別製造着手日 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-OPR_INST_START_DATE">
expj.AD0020011.AD0020012form2.OPR_INST_START_DATE = {};
expj.AD0020011.AD0020012form2.OPR_INST_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/OPR_INST_START_DATE.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.OPR_INST_START_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-OPR_INST_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'OPR_INST_START_DATE', this);
  });
  expj.AD0020011.AD0020012form2.OPR_INST_START_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.OPR_INST_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/OPR_INST_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-OPR_INST_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-OPR_INST_START_DATE" name="OPR_INST_START_DATE" class="AD0020011-focus-move  " style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getOPR_INST_START_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-CalOprInstStartDate">
expj.AD0020011.AD0020012form2.CalOprInstStartDate = {};
// script1="onClick;0;CALENDAR;_AD0020012form2/OPR_INST_START_DATE"
expj.AD0020011.AD0020012form2.CalOprInstStartDate.onClick0 = function () {
  console.log('CalOprInstStartDate script1');
expj.common.pscript.executeCalendar('AD0020011','AD0020012form2','_AD0020012form2/OPR_INST_START_DATE');
};
expj.AD0020011.AD0020012form2.CalOprInstStartDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020012form2.CalOprInstStartDate['onClick' + i])) {
        expj.AD0020011.AD0020012form2.CalOprInstStartDate['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020012form2.CalOprInstStartDate.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020012form2.CalOprInstStartDate.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-CalOprInstStartDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020012form2', 'CalOprInstStartDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AD0020011','AD0020012form2','_AD0020012form2/OPR_INST_START_DATE');
  expj.AD0020011.AD0020012form2.CalOprInstStartDate.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.CalOprInstStartDate.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/CalOprInstStartDate.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-CalOprInstStartDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AD0020011-AD0020012form2-CalOprInstStartDate" class="AD0020011-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-OPR_INST_START_DATE_TIME">
expj.AD0020011.AD0020012form2.OPR_INST_START_DATE_TIME = {};
expj.AD0020011.AD0020012form2.OPR_INST_START_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/OPR_INST_START_DATE_TIME.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.OPR_INST_START_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-OPR_INST_START_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'OPR_INST_START_DATE_TIME', this);
  });
  expj.AD0020011.AD0020012form2.OPR_INST_START_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.OPR_INST_START_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/OPR_INST_START_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-OPR_INST_START_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-OPR_INST_START_DATE_TIME" name="OPR_INST_START_DATE_TIME" class="AD0020011-focus-move  " style="width:88px;" data-kind="OBT_N;" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getOPR_INST_START_DATE_TIME()) %>" maxlength="4" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_ODR_START_DATE" name="h_ODR_START_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_ODR_START_DATE()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_ODR_START_DATE">
expj.AD0020011.AD0020012form2.h_ODR_START_DATE = {};
expj.AD0020011.AD0020012form2.h_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_ODR_START_DATE.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_ODR_START_DATE', this);
  });
  expj.AD0020011.AD0020012form2.h_ODR_START_DATE.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_ODR_START_DATE_TIME" name="h_ODR_START_DATE_TIME" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_ODR_START_DATE_TIME()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_ODR_START_DATE_TIME">
expj.AD0020011.AD0020012form2.h_ODR_START_DATE_TIME = {};
expj.AD0020011.AD0020012form2.h_ODR_START_DATE_TIME.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_ODR_START_DATE_TIME.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_ODR_START_DATE_TIME.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_ODR_START_DATE_TIME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_ODR_START_DATE_TIME', this);
  });
  expj.AD0020011.AD0020012form2.h_ODR_START_DATE_TIME.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_ODR_START_DATE_TIME.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_ODR_START_DATE_TIME.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_ODR_START_DATE_TIME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.OPR_INST_QTY",rb)%></span><!-- 作業指示数 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-OPR_INST_QTY">
expj.AD0020011.AD0020012form2.OPR_INST_QTY = {};
expj.AD0020011.AD0020012form2.OPR_INST_QTY.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/OPR_INST_QTY.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.OPR_INST_QTY.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-OPR_INST_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'OPR_INST_QTY', this);
  });
  expj.AD0020011.AD0020012form2.OPR_INST_QTY.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.OPR_INST_QTY.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/OPR_INST_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-OPR_INST_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-OPR_INST_QTY" name="OPR_INST_QTY" class="AD0020011-focus-move expj-align-right required-value expj-AD0020011-required-A" style="width:150px;" data-kind="<%=Kind.convertNumeric(aAD0020011Struct.geth_UNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getOPR_INST_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-STOCK_UNIT">
expj.AD0020011.AD0020012form2.STOCK_UNIT = {};
expj.AD0020011.AD0020012form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/STOCK_UNIT.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'STOCK_UNIT', this);
  });
  expj.AD0020011.AD0020012form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-STOCK_UNIT" name="STOCK_UNIT" class="AD0020011-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_UNIT_QTY_TYP" name="h_UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_UNIT_QTY_TYP()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_UNIT_QTY_TYP">
expj.AD0020011.AD0020012form2.h_UNIT_QTY_TYP = {};
expj.AD0020011.AD0020012form2.h_UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_UNIT_QTY_TYP.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_UNIT_QTY_TYP', this);
  });
  expj.AD0020011.AD0020012form2.h_UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP",rb)%></span><!-- 内外作区分 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-OUTSIDE_TYP">
expj.AD0020011.AD0020012form2.OUTSIDE_TYP = {};
expj.AD0020011.AD0020012form2.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/OUTSIDE_TYP.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AD0020011', 'AD0020012form2', 'OUTSIDE_TYP', this);
  });
  expj.AD0020011.AD0020012form2.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AD0020011-AD0020012form2-OUTSIDE_TYP" name='OUTSIDE_TYP' class='AD0020011-focus-move' style='width:260px;'><%  for(int i = 0, size = aAD0020011Control.getStruct().getList_OUTSIDE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAD0020011Control.getStruct().getList_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAD0020011Control.getStruct().getList_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAD0020011Struct.getOUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WORK_IN_PROC_COMMENT_3",rb)%></span><!-- 備考 --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012form2-WORK_IN_PROC_COMMENT">
expj.AD0020011.AD0020012form2.WORK_IN_PROC_COMMENT = {};
expj.AD0020011.AD0020012form2.WORK_IN_PROC_COMMENT.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/WORK_IN_PROC_COMMENT.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.WORK_IN_PROC_COMMENT.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-WORK_IN_PROC_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'WORK_IN_PROC_COMMENT', this);
  });
  expj.AD0020011.AD0020012form2.WORK_IN_PROC_COMMENT.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.WORK_IN_PROC_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/WORK_IN_PROC_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-WORK_IN_PROC_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AD0020011-AD0020012form2-WORK_IN_PROC_COMMENT" name="WORK_IN_PROC_COMMENT" class="AD0020011-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getWORK_IN_PROC_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AD0020011-AD0020012form2-TIME_CTRL" name="TIME_CTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.getTIME_CTRL()) %>">
<script class="expj-script-AD0020011-AD0020012form2-TIME_CTRL">
expj.AD0020011.AD0020012form2.TIME_CTRL = {};
expj.AD0020011.AD0020012form2.TIME_CTRL.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/TIME_CTRL.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.TIME_CTRL.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-TIME_CTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'TIME_CTRL', this);
  });
  expj.AD0020011.AD0020012form2.TIME_CTRL.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.TIME_CTRL.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/TIME_CTRL.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-TIME_CTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<input type="hidden" id="expj-AD0020011-AD0020012form2-h_PARENT_OD_NO" name="h_PARENT_OD_NO" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAD0020011Struct.geth_PARENT_OD_NO()) %>">
<script class="expj-script-AD0020011-AD0020012form2-h_PARENT_OD_NO">
expj.AD0020011.AD0020012form2.h_PARENT_OD_NO = {};
expj.AD0020011.AD0020012form2.h_PARENT_OD_NO.executeAllOnDecision = function () {
  console.log('execute AD0020012form2/h_PARENT_OD_NO.onDecision');
  expj.AD0020011.AD0020012form2.executeAllOnDecision();
  expj.AD0020011.executeAllOnDecision();
};
expj.AD0020011.AD0020012form2.h_PARENT_OD_NO.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012form2-h_PARENT_OD_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AD0020011', 'AD0020012form2', 'h_PARENT_OD_NO', this);
  });
  expj.AD0020011.AD0020012form2.h_PARENT_OD_NO.executePScriptOnLoad();
};

expj.AD0020011.AD0020012form2.h_PARENT_OD_NO.executePScriptOnLoad = function () {
  console.log('execute AD0020012form2/h_PARENT_OD_NO.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012form2-h_PARENT_OD_NO');
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AD0020011-AD0020012button1">
expj.AD0020011.AD0020012button1 = {};
expj.AD0020011.AD0020012button1.executeAllOnDecision = function () {
  console.log('execute AD0020012button1.onDecision');
};
expj.AD0020011.AD0020012button1.executeOnLoad = function () {
  expj.AD0020011.AD0020012button1.executePScriptOnLoad();
};

expj.AD0020011.AD0020012button1.executePScriptOnLoad = function () {
  console.log('execute AD0020012button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0020011-AD0020012button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0020011-AD0020012button1-Insert">
expj.AD0020011.AD0020012button1.Insert = {};
// script1="onClick;0;CHK;~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]1[or]~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]2@#AS00034"
expj.AD0020011.AD0020012button1.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00034');
}
};
// script2="onClick;1;CHK;~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]3@*0"
expj.AD0020011.AD0020012button1.Insert.onClick1 = function () {
  console.log('Insert script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onClick;2;CHK;~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]4@*1"
expj.AD0020011.AD0020012button1.Insert.onClick2 = function () {
  console.log('Insert script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onClick;3;CHK;_AD0020012form2/OPR_INST_START_DATE[eq][and]_AD0020012form2/OPR_INST_START_DATE_TIME[neq]@#AS00036"
expj.AD0020011.AD0020012button1.Insert.onClick3 = function () {
  console.log('Insert script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00036');
}
};
// script5="onClick;4;CHK;~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]1[or]~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]2@#AS00037"
expj.AD0020011.AD0020012button1.Insert.onClick4 = function () {
  console.log('Insert script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00037');
}
};
// script6="onClick;5;CHK;~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]3@*2"
expj.AD0020011.AD0020012button1.Insert.onClick5 = function () {
  console.log('Insert script6');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="onClick;6;CHK;~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]4@*3"
expj.AD0020011.AD0020012button1.Insert.onClick6 = function () {
  console.log('Insert script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script8="onClick;7;CHK;_AD0020012form2/TIME_CTRL[eq]true[and]_AD0020012form2/WORK_ODR_DLV_DATE_TIME[eq]@*4"
expj.AD0020011.AD0020012button1.Insert.onClick7 = function () {
  console.log('Insert script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="onClick;8;CHK;_AD0020012form2/TIME_CTRL[eq]true[and]_AD0020012form2/OPR_INST_START_DATE[neq][and]_AD0020012form2/OPR_INST_START_DATE_TIME[eq]@*5"
expj.AD0020011.AD0020012button1.Insert.onClick8 = function () {
  console.log('Insert script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="onClick;9;CHK;_AD0020012form2/OPR_INST_START_DATE[neq][and]_AD0020012form2/WORK_ODR_DLV_DATE[lt]_AD0020012form2/OPR_INST_START_DATE@#AD32156"
expj.AD0020011.AD0020012button1.Insert.onClick9 = function () {
  console.log('Insert script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AD32156');
}
};
// script11="onClick;10;CHK;_AD0020012form2/OPR_INST_START_DATE[neq][and]_AD0020012form2/OPR_INST_START_DATE_TIME[neq][and]_AD0020012form2/WORK_ODR_DLV_DATE_TIME[neq][and]_AD0020012form2/WORK_ODR_DLV_DATE[eq]_AD0020012form2/OPR_INST_START_DATE[and]_AD0020012form2/WORK_ODR_DLV_DATE_TIME[lt]_AD0020012form2/OPR_INST_START_DATE_TIME@#AD32156"
expj.AD0020011.AD0020012button1.Insert.onClick10 = function () {
  console.log('Insert script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME')))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AD32156');
}
};
// script12="onClick;11;CHK;_AD0020012form2/OPR_INST_QTY[lte]0@#AD30222"
expj.AD0020011.AD0020012button1.Insert.onClick11 = function () {
  console.log('Insert script12');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AD30222');
}
};
// script13="onClick;12;CHK;_AD0020012form2/OPR_INST_START_DATE[eq]@$AD25048"
expj.AD0020011.AD0020012button1.Insert.onClick12 = function () {
  console.log('Insert script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25048');
}
};
// script14="onClick;13;CHK;_AD0020012form2/h_PARENT_OD_NO[eq]@$AD00084"
expj.AD0020011.AD0020012button1.Insert.onClick13 = function () {
  console.log('Insert script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD00084');
}
};
// script15="onClick;14;CHK;_AD0020012form2/WORK_ODR_DLV_DATE[lt]_AD0020012form2/h_BUSINESS_OPR_DATE@$AD25066"
expj.AD0020011.AD0020012button1.Insert.onClick14 = function () {
  console.log('Insert script15');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25066');
}
};
// script16="onClick;15;CHK;_AD0020012form2/OPR_INST_START_DATE[lt]_AD0020012form2/h_BUSINESS_OPR_DATE@$AD25067"
expj.AD0020011.AD0020012button1.Insert.onClick15 = function () {
  console.log('Insert script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25067');
}
};
// script17="onClick;16;CHK;_AD0020012form2/h_PARENT_OD_NO[neq][and]_AD0020012form2/h_DUE_DATE[lt]_AD0020012form2/WORK_ODR_DLV_DATE@$AD25023"
expj.AD0020011.AD0020012button1.Insert.onClick16 = function () {
  console.log('Insert script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25023');
}
};
// script18="onClick;17;CHK;_AD0020012form2/h_PARENT_OD_NO[neq][and]_AD0020012form2/h_DUE_DATE[eq]_AD0020012form2/WORK_ODR_DLV_DATE[and]_AD0020012form2/h_DUE_DATE_TIME[lt]_AD0020012form2/WORK_ODR_DLV_DATE_TIME@$AD25023"
expj.AD0020011.AD0020012button1.Insert.onClick17 = function () {
  console.log('Insert script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_DUE_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_DUE_DATE_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25023');
}
};
// script19="onClick;18;CHK;_AD0020012form2/h_ODR_START_DATE[gt]_AD0020012form2/OPR_INST_START_DATE@$AD25034"
expj.AD0020011.AD0020012button1.Insert.onClick18 = function () {
  console.log('Insert script19');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_ODR_START_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25034');
}
};
// script20="onClick;19;CHK;_AD0020012form2/h_ODR_START_DATE[eq]_AD0020012form2/OPR_INST_START_DATE[and]_AD0020012form2/h_ODR_START_DATE_TIME[gt]_AD0020012form2/OPR_INST_START_DATE_TIME@$AD25034"
expj.AD0020011.AD0020012button1.Insert.onClick19 = function () {
  console.log('Insert script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_ODR_START_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_ODR_START_DATE_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25034');
}
};
// script21="onClick;20;CHK;_AD0020012form2/h_PARENT_OD_NO[neq]@$AD00008"
expj.AD0020011.AD0020012button1.Insert.onClick20 = function () {
  console.log('Insert script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[neq]', '')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD00008');
}
};
// script22="onClick;21;CHK;_AD0020012form2/h_CHILD[gt]0@*6"
expj.AD0020011.AD0020012button1.Insert.onClick21 = function () {
  console.log('Insert script22');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_CHILD')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script23="onClick;22;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0020012form1/*,_AD0020012form2/*@AD0020011Servlet,,$ZZ07001"
expj.AD0020011.AD0020012button1.Insert.onClick22 = function () {
  console.log('Insert script23');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0020011', 'AD0020012button1', '_AD0020012form1/*,_AD0020012form2/*', 'AD0020011Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0020011Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0020011', response);
expj.common.changeBusinessScreenTab('AD0020011', contents);
};
expj.common.pscript.callConfirm('AD0020011', 'AD0020012button1', 'ZZ07001', okEvent);
};
// script24="child;0;CHK;[{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:1)}*10+{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:2)}][gte]60@#AS00035"
expj.AD0020011.AD0020012button1.Insert.child0 = function () {
  console.log('Insert script24');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00035');
}
};
// script25="child;1;CHK;[{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:0)}*10+{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:2)}*10+{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:3)}][gte]60@#AS00035"
expj.AD0020011.AD0020012button1.Insert.child1 = function () {
  console.log('Insert script25');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00035');
}
};
// script26="child;2;CHK;[{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:1)}*10+{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:2)}][gte]60@#AS00038"
expj.AD0020011.AD0020012button1.Insert.child2 = function () {
  console.log('Insert script26');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00038');
}
};
// script27="child;3;CHK;[{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:0)}*10+{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:2)}*10+{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:3)}][gte]60@#AS00038"
expj.AD0020011.AD0020012button1.Insert.child3 = function () {
  console.log('Insert script27');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00038');
}
};
// script28="child;4;SET;_AD0020012form2/WORK_ODR_DLV_DATE_TIME=2359"
expj.AD0020011.AD0020012button1.Insert.child4 = function () {
  console.log('Insert script28');
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '2359');
};
// script29="child;5;SET;_AD0020012form2/OPR_INST_START_DATE_TIME=2359"
expj.AD0020011.AD0020012button1.Insert.child5 = function () {
  console.log('Insert script29');
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '2359');
};
// script30="child;6;CHK;?AD0020012form2/OPR_INST_QTY[neq]SAME[or]?AD0020012form2/OPR_INST_START_DATE[neq]SAME@$AD25050"
expj.AD0020011.AD0020012button1.Insert.child6 = function () {
  console.log('Insert script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '?AD0020012form2/OPR_INST_QTY'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '?AD0020012form2/OPR_INST_START_DATE'), '[neq]', 'SAME')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25050');
}
};
expj.AD0020011.AD0020012button1.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 22; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020012button1.Insert['onClick' + i])) {
        expj.AD0020011.AD0020012button1.Insert['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020012button1.Insert.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020012button1.Insert.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012button1-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020012button1', 'Insert', this, 'Button');
    }
  });
  expj.AD0020011.AD0020012button1.Insert.executePScriptOnLoad();
};

expj.AD0020011.AD0020012button1.Insert.executePScriptOnLoad = function () {
  console.log('execute AD0020012button1/Insert.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012button1-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020012button1-Insert" name="Insert" class="AD0020011-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AD0020011-AD0020012button1-Update">
expj.AD0020011.AD0020012button1.Update = {};
// script1="onClick;0;CHK;~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]1[or]~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]2@#AS00034"
expj.AD0020011.AD0020012button1.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00034');
}
};
// script2="onClick;1;CHK;~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]3@*0"
expj.AD0020011.AD0020012button1.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onClick;2;CHK;~LEN(_AD0020012form2/WORK_ODR_DLV_DATE_TIME)[eq]4@*1"
expj.AD0020011.AD0020012button1.Update.onClick2 = function () {
  console.log('Update script3');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script4="onClick;3;CHK;_AD0020012form2/OPR_INST_START_DATE[eq][and]_AD0020012form2/OPR_INST_START_DATE_TIME[neq]@#AS00036"
expj.AD0020011.AD0020012button1.Update.onClick3 = function () {
  console.log('Update script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[neq]', '')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00036');
}
};
// script5="onClick;4;CHK;~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]1[or]~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]2@#AS00037"
expj.AD0020011.AD0020012button1.Update.onClick4 = function () {
  console.log('Update script5');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '1') || expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '2')) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00037');
}
};
// script6="onClick;5;CHK;~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]3@*2"
expj.AD0020011.AD0020012button1.Update.onClick5 = function () {
  console.log('Update script6');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script7="onClick;6;CHK;~LEN(_AD0020012form2/OPR_INST_START_DATE_TIME)[eq]4@*3"
expj.AD0020011.AD0020012button1.Update.onClick6 = function () {
  console.log('Update script7');
if (expj.common.pscript.evaluate(expj.common.pscript.func.LEN('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '4')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script8="onClick;7;CHK;_AD0020012form2/TIME_CTRL[eq]true[and]_AD0020012form2/WORK_ODR_DLV_DATE_TIME[eq]@*4"
expj.AD0020011.AD0020012button1.Update.onClick7 = function () {
  console.log('Update script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="onClick;8;CHK;_AD0020012form2/TIME_CTRL[eq]true[and]_AD0020012form2/OPR_INST_START_DATE[neq][and]_AD0020012form2/OPR_INST_START_DATE_TIME[eq]@*5"
expj.AD0020011.AD0020012button1.Update.onClick8 = function () {
  console.log('Update script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/TIME_CTRL'), '[eq]', 'true') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="onClick;9;CHK;_AD0020012form2/OPR_INST_START_DATE[neq][and]_AD0020012form2/WORK_ODR_DLV_DATE[lt]_AD0020012form2/OPR_INST_START_DATE@#AD32156"
expj.AD0020011.AD0020012button1.Update.onClick9 = function () {
  console.log('Update script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AD32156');
}
};
// script11="onClick;10;CHK;_AD0020012form2/OPR_INST_START_DATE[neq][and]_AD0020012form2/OPR_INST_START_DATE_TIME[neq][and]_AD0020012form2/WORK_ODR_DLV_DATE_TIME[neq][and]_AD0020012form2/WORK_ODR_DLV_DATE[eq]_AD0020012form2/OPR_INST_START_DATE[and]_AD0020012form2/WORK_ODR_DLV_DATE_TIME[lt]_AD0020012form2/OPR_INST_START_DATE_TIME@#AD32156"
expj.AD0020011.AD0020012button1.Update.onClick10 = function () {
  console.log('Update script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME')))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AD32156');
}
};
// script12="onClick;11;CHK;_AD0020012form2/OPR_INST_QTY[lte]0@#AD30222"
expj.AD0020011.AD0020012button1.Update.onClick11 = function () {
  console.log('Update script12');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_QTY')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AD30222');
}
};
// script13="onClick;12;CHK;_AD0020012form2/OPR_INST_START_DATE[eq]@$AD25048"
expj.AD0020011.AD0020012button1.Update.onClick12 = function () {
  console.log('Update script13');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25048');
}
};
// script14="onClick;13;CHK;_AD0020012form2/h_PARENT_OD_NO[eq][and]?AD0020012form2/OPR_INST_QTY[neq]SAME@$AD00084"
expj.AD0020011.AD0020012button1.Update.onClick13 = function () {
  console.log('Update script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[eq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '?AD0020012form2/OPR_INST_QTY'), '[neq]', 'SAME')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD00084');
}
};
// script15="onClick;14;CHK;_AD0020012form2/WORK_ODR_DLV_DATE[lt]_AD0020012form2/h_BUSINESS_OPR_DATE@$AD25066"
expj.AD0020011.AD0020012button1.Update.onClick14 = function () {
  console.log('Update script15');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25066');
}
};
// script16="onClick;15;CHK;_AD0020012form2/OPR_INST_START_DATE[lt]_AD0020012form2/h_BUSINESS_OPR_DATE@$AD25067"
expj.AD0020011.AD0020012button1.Update.onClick15 = function () {
  console.log('Update script16');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_BUSINESS_OPR_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25067');
}
};
// script17="onClick;16;CHK;_AD0020012form2/h_PARENT_OD_NO[neq][and]_AD0020012form2/h_DUE_DATE[lt]_AD0020012form2/WORK_ODR_DLV_DATE@$AD25023"
expj.AD0020011.AD0020012button1.Update.onClick16 = function () {
  console.log('Update script17');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_DUE_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25023');
}
};
// script18="onClick;17;CHK;_AD0020012form2/h_PARENT_OD_NO[neq][and]_AD0020012form2/h_DUE_DATE[eq]_AD0020012form2/WORK_ODR_DLV_DATE[and]_AD0020012form2/h_DUE_DATE_TIME[lt]_AD0020012form2/WORK_ODR_DLV_DATE_TIME@$AD25023"
expj.AD0020011.AD0020012button1.Update.onClick17 = function () {
  console.log('Update script18');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_DUE_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_DUE_DATE_TIME')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25023');
}
};
// script19="onClick;18;CHK;_AD0020012form2/h_ODR_START_DATE[gt]_AD0020012form2/OPR_INST_START_DATE@$AD25034"
expj.AD0020011.AD0020012button1.Update.onClick18 = function () {
  console.log('Update script19');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_ODR_START_DATE')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25034');
}
};
// script20="onClick;19;CHK;_AD0020012form2/h_ODR_START_DATE[eq]_AD0020012form2/OPR_INST_START_DATE[and]_AD0020012form2/h_ODR_START_DATE_TIME[gt]_AD0020012form2/OPR_INST_START_DATE_TIME@$AD25034"
expj.AD0020011.AD0020012button1.Update.onClick19 = function () {
  console.log('Update script20');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_ODR_START_DATE'), '[eq]', expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE')) && expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_ODR_START_DATE_TIME')), '[gt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME')))) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25034');
}
};
// script21="onClick;20;CHK;_AD0020012form2/h_PARENT_OD_NO[neq][and]?AD0020012form2/OPR_INST_QTY[neq]SAME@$AD00008"
expj.AD0020011.AD0020012button1.Update.onClick20 = function () {
  console.log('Update script21');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_PARENT_OD_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '?AD0020012form2/OPR_INST_QTY'), '[neq]', 'SAME')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD00008');
}
};
// script22="onClick;21;CHK;_AD0020012form2/h_CHILD[gt]0@*6"
expj.AD0020011.AD0020012button1.Update.onClick21 = function () {
  console.log('Update script22');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/h_CHILD')), '[gt]', expj.common.pscript.convertNumber('0'))) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script23="onClick;22;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0020012form1/*,_AD0020012form2/*@AD0020011Servlet,,$ZZ07003"
expj.AD0020011.AD0020012button1.Update.onClick22 = function () {
  console.log('Update script23');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0020011', 'AD0020012button1', '_AD0020012form1/*,_AD0020012form2/*', 'AD0020011Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0020011Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0020011', response);
expj.common.changeBusinessScreenTab('AD0020011', contents);
};
expj.common.pscript.callConfirm('AD0020011', 'AD0020012button1', 'ZZ07003', okEvent);
};
// script24="child;0;CHK;[{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:1)}*10+{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:2)}][gte]60@#AS00035"
expj.AD0020011.AD0020012button1.Update.child0 = function () {
  console.log('Update script24');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00035');
}
};
// script25="child;1;CHK;[{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:0)}*10+{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:2)}*10+{~CHARAT(_AD0020012form2/WORK_ODR_DLV_DATE_TIME:3)}][gte]60@#AS00035"
expj.AD0020011.AD0020012button1.Update.child1 = function () {
  console.log('Update script25');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00035');
}
};
// script26="child;2;CHK;[{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:1)}*10+{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:2)}][gte]60@#AS00038"
expj.AD0020011.AD0020012button1.Update.child2 = function () {
  console.log('Update script26');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '1') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '2') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00038');
}
};
// script27="child;3;CHK;[{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:0)}*10+{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:1)}][gte]24[or][{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:2)}*10+{~CHARAT(_AD0020012form2/OPR_INST_START_DATE_TIME:3)}][gte]60@#AS00038"
expj.AD0020011.AD0020012button1.Update.child3 = function () {
  console.log('Update script27');
if (expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '0') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '1') + '}'), '[gte]', expj.common.pscript.convertNumber('24')) || expj.common.pscript.evaluate(expj.common.pscript.eval('{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '2') + '}*10+{' + expj.common.pscript.func.CHARAT('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '3') + '}'), '[gte]', expj.common.pscript.convertNumber('60'))) {
expj.common.pscript.addErrorMessage('AD0020011', 'AD0020012button1', 'AS00038');
}
};
// script28="child;4;SET;_AD0020012form2/WORK_ODR_DLV_DATE_TIME=2359"
expj.AD0020011.AD0020012button1.Update.child4 = function () {
  console.log('Update script28');
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/WORK_ODR_DLV_DATE_TIME', '2359');
};
// script29="child;5;SET;_AD0020012form2/OPR_INST_START_DATE_TIME=2359"
expj.AD0020011.AD0020012button1.Update.child5 = function () {
  console.log('Update script29');
expj.common.pscript.setReferenceComponentValue('AD0020011', 'AD0020012button1', '_AD0020012form2/OPR_INST_START_DATE_TIME', '2359');
};
// script30="child;6;CHK;?AD0020012form2/OPR_INST_QTY[neq]SAME[or]?AD0020012form2/OPR_INST_START_DATE[neq]SAME@$AD25050"
expj.AD0020011.AD0020012button1.Update.child6 = function () {
  console.log('Update script30');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '?AD0020012form2/OPR_INST_QTY'), '[neq]', 'SAME') || expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AD0020011', 'AD0020012button1', '?AD0020012form2/OPR_INST_START_DATE'), '[neq]', 'SAME')) {
expj.common.pscript.addWarningMessage('AD0020011', 'AD0020012button1', 'AD25050');
}
};
expj.AD0020011.AD0020012button1.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 22; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020012button1.Update['onClick' + i])) {
        expj.AD0020011.AD0020012button1.Update['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020012button1.Update.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020012button1.Update.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012button1-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020012button1', 'Update', this, 'Button');
    }
  });
  expj.AD0020011.AD0020012button1.Update.executePScriptOnLoad();
};

expj.AD0020011.AD0020012button1.Update.executePScriptOnLoad = function () {
  console.log('execute AD0020012button1/Update.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012button1-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020012button1-Update" name="Update" class="AD0020011-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
<div class="datagrid-button-field-cell frame11 button-area" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
<div class="expj-td" style="width:22px;"></div><!--/td-->
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
<span class="version">AD0020012 Revision: 1.8  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AD0020011-AD0020012button0">
expj.AD0020011.AD0020012button0 = {};
expj.AD0020011.AD0020012button0.executeAllOnDecision = function () {
  console.log('execute AD0020012button0.onDecision');
};
expj.AD0020011.AD0020012button0.executeOnLoad = function () {
  expj.AD0020011.AD0020012button0.executePScriptOnLoad();
};

expj.AD0020011.AD0020012button0.executePScriptOnLoad = function () {
  console.log('execute AD0020012button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AD0020011-AD0020012button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AD0020011-AD0020012button0-Return">
expj.AD0020011.AD0020012button0.Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AD0020012form1/*,_AD0020012form2/*@AD0020011Servlet,,$ZZ07013"
expj.AD0020011.AD0020012button0.Return.onClick0 = function () {
  console.log('Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AD0020011', 'AD0020012button0', '_AD0020012form1/*,_AD0020012form2/*', 'AD0020011Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AD0020011Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AD0020011', response);
expj.common.changeBusinessScreenTab('AD0020011', contents);
};
expj.common.pscript.callConfirm('AD0020011', 'AD0020012button0', 'ZZ07013', okEvent);
};
expj.AD0020011.AD0020012button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AD0020011.AD0020012button0.Return['onClick' + i])) {
        expj.AD0020011.AD0020012button0.Return['onClick' + i]();
      }
    }
  }
};
expj.AD0020011.AD0020012button0.Return.executeAllOnDecision = function () {
};
expj.AD0020011.AD0020012button0.Return.executeOnLoad = function () {
  $('#expj-AD0020011-AD0020012button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AD0020011', 'AD0020012button0', 'Return', this, 'Button');
    }
  });
  expj.AD0020011.AD0020012button0.Return.executePScriptOnLoad();
};

expj.AD0020011.AD0020012button0.Return.executePScriptOnLoad = function () {
  console.log('execute AD0020012button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-AD0020011-AD0020012button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AD0020011-AD0020012button0-Return" name="Return" class="AD0020011-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AD0020011 (END)-->
<%
MessageStruct msgStruct = aAD0020011Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AD0020011-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AD0020011)) {
  expj.common.treeInstanceMap.AD0020011 = {};
}
expj.common.treeInstanceMap.AD0020011.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AD0020011.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AD0020011.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AD0020011.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AD0020011.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AD0020011-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AD0020011-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011)) {
  expj.common.detailDialogMap.AD0020011 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AD0020011._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011.<%=detailId %>)) {
  expj.common.detailDialogMap.AD0020011.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AD0020011.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AD0020011.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AD0020011.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AD0020011-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AD0020011-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AD0020011-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AD0020011._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AD0020011-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AD0020011)) {
  expj.common.viewInstanceMap.AD0020011 = {};
}
expj.common.viewInstanceMap.AD0020011.<%=viewId %> = {};
expj.common.viewInstanceMap.AD0020011.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AD0020011.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AD0020011.<%=viewId %>.init = function () {
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
    expj.AD0020011.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AD0020011.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AD0020011-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AD0020011-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AD0020011_init">
/**
 * AD0020011用のロード完了時初期化関数
 */
expj.AD0020011.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AD0020011');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AD0020011');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AD0020011');
  expj.common.calendarInstanceMap.AD0020011 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AD0020011.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.init();
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AD0020011.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AD0020011.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AD0020011');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AD0020011');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AD0020011-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AD0020011-<%=detailId %>');
<%
 }
%>
  try{expj.AD0020011.AD0020012form1.WORK_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form1.h_ITEM_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.DRAW_CD.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.SPEC.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.MRP_ODR_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.OPR_RSLT_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_DUE_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.CalWorkOdrDlvDate.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.WORK_ODR_DLV_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_CHILD.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.OPR_INST_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.CalOprInstStartDate.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.OPR_INST_START_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_ODR_START_DATE_TIME.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.OPR_INST_QTY.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.WORK_IN_PROC_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.TIME_CTRL.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.h_PARENT_OD_NO.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012button1.Insert.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012button1.Update.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012button0.Return.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form1.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012form2.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012button1.executeOnLoad();}catch(e){};
  try{expj.AD0020011.AD0020012button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AD0020011.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AD0020011', 'AD0020011');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AD0020011');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AD0020011-focus-move');
  // 初期フォーカス当てる処理
  $('.AD0020011-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AD0020011', '<%=request.getContextPath() %>');
};

/**
 * AD0020011の全体onDecision処理
 */
expj.AD0020011.executeAllOnDecision = function () {
  expj.AD0020011.AD0020012form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AD0020011_console">
expj.AD0020011.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>