<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:21:11 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AA0030\AA0030011.html
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

作業系列メンテナンスサブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0030/jsp/AA0030011.jsp,v $
$Author: geng-jia $  
$Revision: 1.10 $ $Date: 2017/02/22 02:03:46 $
********************************************************* --%>
<html>
<head>
<title>作業系列メンテナンスサブ1</title>
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
<%
  String CallButton = aAA0030010Control.getButton();    // 呼び出し元ボタン名
%>

<body>

  <div id="expj-business-screen-AA0030010" data-screen="AA0030011" data-newdata="<%=aAA0030010Control.isNewData() %>">
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
              <script class="expj-script-AA0030010-AA0030011form1">
expj.AA0030010.AA0030011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1"
expj.AA0030010.AA0030011form1.onLoad0 = function () {
  console.log('AA0030011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
};
// script2="onDecision;0;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]Append[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]Copy[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]insertSub1@*0,*1"
expj.AA0030010.AA0030011form1.onDecision0 = function () {
  console.log('AA0030011form1 script2');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Append') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Copy') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'insertSub1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script3="child;0;MASK;_AA0030011button2/updateSub1"
expj.AA0030010.AA0030011form1.child0 = function () {
  console.log('AA0030011form1 script3');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030011form1', '_AA0030011button2/updateSub1');
};
// script4="child;1;MASK;_AA0030011button2/insertSub1,_AA0030011form2/PROC_CD"
expj.AA0030010.AA0030011form1.child1 = function () {
  console.log('AA0030011form1 script4');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030011form1', '_AA0030011button2/insertSub1');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030011form1', '_AA0030011form2/PROC_CD');
};
// script5="onDecision;1;CHKRQ;A@*2,*3"
expj.AA0030010.AA0030011form1.onDecision1 = function () {
  console.log('AA0030011form1 script5');
if (expj.common.pscript.satisfiedRequiredComponent('AA0030010', 'A')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script6="child;2;CHK;<%=TypeConverter.sanitizer(CallButton)%>[eq]Append[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]Copy[or]<%=TypeConverter.sanitizer(CallButton)%>[eq]insertSub1@*4,*5"
expj.AA0030010.AA0030011form1.child2 = function () {
  console.log('AA0030011form1 script6');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Append') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'Copy') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(CallButton)%>', '[eq]', 'insertSub1')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;MASK;_AA0030011button2/updateSub1,_AA0030011button2/insertSub1"
expj.AA0030010.AA0030011form1.child3 = function () {
  console.log('AA0030011form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030011form1', '_AA0030011button2/updateSub1');
expj.common.pscript.setMaskToReferenceComponent('AA0030010', 'AA0030011form1', '_AA0030011button2/insertSub1');
};
// script8="child;4;UNMASK;_AA0030011button2/insertSub1"
expj.AA0030010.AA0030011form1.child4 = function () {
  console.log('AA0030011form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030011form1', '_AA0030011button2/insertSub1');
};
// script9="child;5;UNMASK;_AA0030011button2/updateSub1"
expj.AA0030010.AA0030011form1.child5 = function () {
  console.log('AA0030011form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('AA0030010', 'AA0030011form1', '_AA0030011button2/updateSub1');
};
expj.AA0030010.AA0030011form1.executeAllOnDecision = function () {
  console.log('execute AA0030011form1.onDecision');
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030011form1['onDecision' + i])) {
        expj.AA0030010.AA0030011form1['onDecision' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030011form1.executeOnLoad = function () {
  expj.AA0030010.AA0030011form1.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form1.executePScriptOnLoad = function () {
  console.log('execute AA0030011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AA0030010.AA0030011form1['onLoad' + i])) {
      expj.AA0030010.AA0030011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0030010-AA0030011form1" action="AA0030010Servlet" name="AA0030011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:27px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form1-ITEM_CD">
expj.AA0030010.AA0030011form1.ITEM_CD = {};
expj.AA0030010.AA0030011form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AA0030011form1/ITEM_CD.onDecision');
  expj.AA0030010.AA0030011form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form1', 'ITEM_CD', this);
  });
  expj.AA0030010.AA0030011form1.ITEM_CD.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AA0030011form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form1-ITEM_CD" name="ITEM_CD" class="AA0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getITEM_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form1-ITEM_NAME">
expj.AA0030010.AA0030011form1.ITEM_NAME = {};
expj.AA0030010.AA0030011form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AA0030011form1/ITEM_NAME.onDecision');
  expj.AA0030010.AA0030011form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form1', 'ITEM_NAME', this);
  });
  expj.AA0030010.AA0030011form1.ITEM_NAME.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0030011form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form1-ITEM_NAME" name="ITEM_NAME" class="AA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getITEM_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030011form1-MANHOUR_TYP" name="MANHOUR_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getMANHOUR_TYP()) %>">
<script class="expj-script-AA0030010-AA0030011form1-MANHOUR_TYP">
expj.AA0030010.AA0030011form1.MANHOUR_TYP = {};
expj.AA0030010.AA0030011form1.MANHOUR_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030011form1/MANHOUR_TYP.onDecision');
  expj.AA0030010.AA0030011form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form1.MANHOUR_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form1-MANHOUR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form1', 'MANHOUR_TYP', this);
  });
  expj.AA0030010.AA0030011form1.MANHOUR_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form1.MANHOUR_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030011form1/MANHOUR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form1-MANHOUR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AA0030010-AA0030011form1-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-AA0030010-AA0030011form1-MODIFY_COUNT">
expj.AA0030010.AA0030011form1.MODIFY_COUNT = {};
expj.AA0030010.AA0030011form1.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute AA0030011form1/MODIFY_COUNT.onDecision');
  expj.AA0030010.AA0030011form1.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form1.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form1-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form1', 'MODIFY_COUNT', this);
  });
  expj.AA0030010.AA0030011form1.MODIFY_COUNT.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form1.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute AA0030011form1/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form1-MODIFY_COUNT');
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-AA0030010-AA0030011form2">
expj.AA0030010.AA0030011form2 = {};
expj.AA0030010.AA0030011form2.executeAllOnDecision = function () {
  console.log('execute AA0030011form2.onDecision');
};
expj.AA0030010.AA0030011form2.executeOnLoad = function () {
  expj.AA0030010.AA0030011form2.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AA0030010-AA0030011form2" action="AA0030010Servlet" name="AA0030011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_CD",rb)%></span><!-- 品目別作業コード --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-PROC_CD">
expj.AA0030010.AA0030011form2.PROC_CD = {};
expj.AA0030010.AA0030011form2.PROC_CD.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/PROC_CD.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.PROC_CD.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'PROC_CD', this);
  });
  expj.AA0030010.AA0030011form2.PROC_CD.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.PROC_CD.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-PROC_CD" name="PROC_CD" class="AA0030010-focus-move  required-value expj-AA0030010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getPROC_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_NAME",rb)%></span><!-- 作業名 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-PROC_NAME">
expj.AA0030010.AA0030011form2.PROC_NAME = {};
expj.AA0030010.AA0030011form2.PROC_NAME.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/PROC_NAME.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.PROC_NAME.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'PROC_NAME', this);
  });
  expj.AA0030010.AA0030011form2.PROC_NAME.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:452px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-PROC_NAME" name="PROC_NAME" class="AA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getPROC_NAME()) %>" maxlength="40" ></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_NO",rb)%></span><!-- 作業系列番号 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-PROC_NO">
expj.AA0030010.AA0030011form2.PROC_NO = {};
expj.AA0030010.AA0030011form2.PROC_NO.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/PROC_NO.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.PROC_NO.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-PROC_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'PROC_NO', this);
  });
  expj.AA0030010.AA0030011form2.PROC_NO.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.PROC_NO.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/PROC_NO.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-PROC_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-PROC_NO" name="PROC_NO" class="AA0030010-focus-move expj-align-right required-value expj-AA0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_P;6" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getPROC_NO()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SPOIL",rb)%></span><!-- 作業系列仕損率 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-SPOIL">
expj.AA0030010.AA0030011form2.SPOIL = {};
expj.AA0030010.AA0030011form2.SPOIL.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/SPOIL.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.SPOIL.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-SPOIL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'SPOIL', this);
  });
  expj.AA0030010.AA0030011form2.SPOIL.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.SPOIL.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/SPOIL.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-SPOIL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-SPOIL" name="SPOIL" class="AA0030010-focus-move expj-align-right required-value expj-AA0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;5.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getSPOIL()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0051",rb)%></span><!-- ％ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.FIXED_LT_1",rb)%></span><!-- 作業系列固定分リードタイム --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-FIXED_LT">
expj.AA0030010.AA0030011form2.FIXED_LT = {};
expj.AA0030010.AA0030011form2.FIXED_LT.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/FIXED_LT.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.FIXED_LT.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-FIXED_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'FIXED_LT', this);
  });
  expj.AA0030010.AA0030011form2.FIXED_LT.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.FIXED_LT.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/FIXED_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-FIXED_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-FIXED_LT" name="FIXED_LT" class="AA0030010-focus-move expj-align-right required-value expj-AA0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getFIXED_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-LT_UNIT_1">
expj.AA0030010.AA0030011form2.LT_UNIT_1 = {};
expj.AA0030010.AA0030011form2.LT_UNIT_1.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/LT_UNIT_1.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.LT_UNIT_1.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-LT_UNIT_1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'LT_UNIT_1', this);
  });
  expj.AA0030010.AA0030011form2.LT_UNIT_1.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.LT_UNIT_1.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/LT_UNIT_1.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-LT_UNIT_1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-LT_UNIT_1" name="LT_UNIT_1" class="AA0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getLT_UNIT_1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROP_LT_1",rb)%></span><!-- 作業系列比例分リードタイム --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-PROP_LT">
expj.AA0030010.AA0030011form2.PROP_LT = {};
expj.AA0030010.AA0030011form2.PROP_LT.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/PROP_LT.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.PROP_LT.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-PROP_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'PROP_LT', this);
  });
  expj.AA0030010.AA0030011form2.PROP_LT.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.PROP_LT.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/PROP_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-PROP_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-PROP_LT" name="PROP_LT" class="AA0030010-focus-move expj-align-right required-value expj-AA0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getPROP_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-LT_UNIT_2">
expj.AA0030010.AA0030011form2.LT_UNIT_2 = {};
expj.AA0030010.AA0030011form2.LT_UNIT_2.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/LT_UNIT_2.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.LT_UNIT_2.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-LT_UNIT_2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'LT_UNIT_2', this);
  });
  expj.AA0030010.AA0030011form2.LT_UNIT_2.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.LT_UNIT_2.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/LT_UNIT_2.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-LT_UNIT_2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-LT_UNIT_2" name="LT_UNIT_2" class="AA0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getLT_UNIT_2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROP_LOT_SIZE_1",rb)%></span><!-- 作業系列比例分ロットサイズ --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-PROP_LOT_SIZE">
expj.AA0030010.AA0030011form2.PROP_LOT_SIZE = {};
expj.AA0030010.AA0030011form2.PROP_LOT_SIZE.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/PROP_LOT_SIZE.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.PROP_LOT_SIZE.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-PROP_LOT_SIZE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'PROP_LOT_SIZE', this);
  });
  expj.AA0030010.AA0030011form2.PROP_LOT_SIZE.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.PROP_LOT_SIZE.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/PROP_LOT_SIZE.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-PROP_LOT_SIZE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-PROP_LOT_SIZE" name="PROP_LOT_SIZE" class="AA0030010-focus-move expj-align-right required-value expj-AA0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getPROP_LOT_SIZE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-STOCK_UNIT">
expj.AA0030010.AA0030011form2.STOCK_UNIT = {};
expj.AA0030010.AA0030011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/STOCK_UNIT.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'STOCK_UNIT', this);
  });
  expj.AA0030010.AA0030011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-STOCK_UNIT" name="STOCK_UNIT" class="AA0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getSTOCK_UNIT()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.SAFETY_LT_1",rb)%></span><!-- 作業系列安全日数 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-SAFETY_LT">
expj.AA0030010.AA0030011form2.SAFETY_LT = {};
expj.AA0030010.AA0030011form2.SAFETY_LT.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/SAFETY_LT.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.SAFETY_LT.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-SAFETY_LT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'SAFETY_LT', this);
  });
  expj.AA0030010.AA0030011form2.SAFETY_LT.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.SAFETY_LT.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/SAFETY_LT.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-SAFETY_LT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-SAFETY_LT" name="SAFETY_LT" class="AA0030010-focus-move expj-align-right required-value expj-AA0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_INTEGER_Z;6" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getSAFETY_LT()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-LT_UNIT_3">
expj.AA0030010.AA0030011form2.LT_UNIT_3 = {};
expj.AA0030010.AA0030011form2.LT_UNIT_3.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/LT_UNIT_3.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.LT_UNIT_3.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-LT_UNIT_3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'LT_UNIT_3', this);
  });
  expj.AA0030010.AA0030011form2.LT_UNIT_3.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.LT_UNIT_3.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/LT_UNIT_3.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-LT_UNIT_3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-LT_UNIT_3" name="LT_UNIT_3" class="AA0030010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getLT_UNIT_3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.OUTSIDE_TYP_1",rb)%></span><!-- 作業系列内外作区分 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-OUTSIDE_TYP">
expj.AA0030010.AA0030011form2.OUTSIDE_TYP = {};
expj.AA0030010.AA0030011form2.OUTSIDE_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/OUTSIDE_TYP.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.OUTSIDE_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-OUTSIDE_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0030010', 'AA0030011form2', 'OUTSIDE_TYP', this);
  });
  expj.AA0030010.AA0030011form2.OUTSIDE_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.OUTSIDE_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/OUTSIDE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-OUTSIDE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0030010-AA0030011form2-OUTSIDE_TYP" name='OUTSIDE_TYP' class='AA0030010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0030010Control.getStruct().getList_OUTSIDE_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0030010Control.getStruct().getList_OUTSIDE_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0030010Control.getStruct().getList_OUTSIDE_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0030010Struct.getOUTSIDE_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.WS_CD",rb)%></span><!-- 作業区コード --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-WS_CD">
expj.AA0030010.AA0030011form2.WS_CD = {};
expj.AA0030010.AA0030011form2.WS_CD.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/WS_CD.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.WS_CD.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-WS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'WS_CD', this);
  });
  expj.AA0030010.AA0030011form2.WS_CD.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.WS_CD.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/WS_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-WS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-WS_CD" name="WS_CD" class="AA0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getWS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-PeekerWsCd">
expj.AA0030010.AA0030011form2.PeekerWsCd = {};
// script1="onClick;0;PEEKER;_AA0030011form2/WS_CD@<%=contextNo%>"
expj.AA0030010.AA0030011form2.PeekerWsCd.onClick0 = function () {
  console.log('PeekerWsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0030010';
var parameterValues = 'PeekerWsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
var checkParam = expj.common.pscript.getPeekerParam('AA0030010', 'PeekerWsCd', 'SQLPARAM_1', '<%=aAA0030010Control.getsysPLANT_CD()%>');
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011form2', checkParam);
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011form2', '_AA0030011form2/WS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%WS_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AA0030011form2/WS_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0030010.AA0030011form2.PeekerWsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030011form2.PeekerWsCd['onClick' + i])) {
        expj.AA0030010.AA0030011form2.PeekerWsCd['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030011form2.PeekerWsCd.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030011form2.PeekerWsCd.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-PeekerWsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030011form2', 'PeekerWsCd', this, 'Button');
    }
  });
  expj.AA0030010.AA0030011form2.PeekerWsCd.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.PeekerWsCd.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/PeekerWsCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-PeekerWsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0030010-AA0030011form2-PeekerWsCd" class="AA0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-WS_NAME">
expj.AA0030010.AA0030011form2.WS_NAME = {};
expj.AA0030010.AA0030011form2.WS_NAME.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/WS_NAME.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.WS_NAME.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-WS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'WS_NAME', this);
  });
  expj.AA0030010.AA0030011form2.WS_NAME.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.WS_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/WS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-WS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-WS_NAME" name="WS_NAME" class="AA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getWS_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD_2",rb)%></span><!-- 代表取引先コード --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-VEND_CD">
expj.AA0030010.AA0030011form2.VEND_CD = {};
expj.AA0030010.AA0030011form2.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/VEND_CD.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.VEND_CD.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'VEND_CD', this);
  });
  expj.AA0030010.AA0030011form2.VEND_CD.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-VEND_CD" name="VEND_CD" class="AA0030010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-PeekerVendCd">
expj.AA0030010.AA0030011form2.PeekerVendCd = {};
// script1="onClick;0;PEEKER;_AA0030011form2/VEND_CD@<%=contextNo%>"
expj.AA0030010.AA0030011form2.PeekerVendCd.onClick0 = function () {
  console.log('PeekerVendCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AA0030010';
var parameterValues = 'PeekerVendCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011form2', '_AA0030011form2/VEND_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%VEND_CD_03%&%';
parameterValues += 'TARGET_FIELD%=%_AA0030011form2/VEND_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AA0030010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AA0030010.AA0030011form2.PeekerVendCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030011form2.PeekerVendCd['onClick' + i])) {
        expj.AA0030010.AA0030011form2.PeekerVendCd['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030011form2.PeekerVendCd.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030011form2.PeekerVendCd.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-PeekerVendCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030011form2', 'PeekerVendCd', this, 'Button');
    }
  });
  expj.AA0030010.AA0030011form2.PeekerVendCd.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.PeekerVendCd.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/PeekerVendCd.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-PeekerVendCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AA0030010-AA0030011form2-PeekerVendCd" class="AA0030010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-VEND_NAME">
expj.AA0030010.AA0030011form2.VEND_NAME = {};
expj.AA0030010.AA0030011form2.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/VEND_NAME.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.VEND_NAME.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'VEND_NAME', this);
  });
  expj.AA0030010.AA0030011form2.VEND_NAME.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-VEND_NAME" name="VEND_NAME" class="AA0030010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getVEND_NAME()) %>" maxlength="80" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_INSPC_TYP_1",rb)%></span><!-- 作業系列受入検査区分 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-ACPT_INSPC_TYP">
expj.AA0030010.AA0030011form2.ACPT_INSPC_TYP = {};
expj.AA0030010.AA0030011form2.ACPT_INSPC_TYP.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/ACPT_INSPC_TYP.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.ACPT_INSPC_TYP.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-ACPT_INSPC_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('AA0030010', 'AA0030011form2', 'ACPT_INSPC_TYP', this);
  });
  expj.AA0030010.AA0030011form2.ACPT_INSPC_TYP.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.ACPT_INSPC_TYP.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/ACPT_INSPC_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-ACPT_INSPC_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-AA0030010-AA0030011form2-ACPT_INSPC_TYP" name='ACPT_INSPC_TYP' class='AA0030010-focus-move' style='width:260px;'><%  for(int i = 0, size = aAA0030010Control.getStruct().getList_ACPT_INSPC_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aAA0030010Control.getStruct().getList_ACPT_INSPC_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aAA0030010Control.getStruct().getList_ACPT_INSPC_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aAA0030010Struct.getACPT_INSPC_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.STANDARD_COST",rb)%></span><!-- 標準工数 --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011form2-STANDARD_COST">
expj.AA0030010.AA0030011form2.STANDARD_COST = {};
expj.AA0030010.AA0030011form2.STANDARD_COST.executeAllOnDecision = function () {
  console.log('execute AA0030011form2/STANDARD_COST.onDecision');
  expj.AA0030010.AA0030011form2.executeAllOnDecision();
  expj.AA0030010.executeAllOnDecision();
};
expj.AA0030010.AA0030011form2.STANDARD_COST.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011form2-STANDARD_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AA0030010', 'AA0030011form2', 'STANDARD_COST', this);
  });
  expj.AA0030010.AA0030011form2.STANDARD_COST.executePScriptOnLoad();
};

expj.AA0030010.AA0030011form2.STANDARD_COST.executePScriptOnLoad = function () {
  console.log('execute AA0030011form2/STANDARD_COST.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011form2-STANDARD_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AA0030010-AA0030011form2-STANDARD_COST" name="STANDARD_COST" class="AA0030010-focus-move expj-align-right required-value expj-AA0030010-required-Z" style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAA0030010Struct.getSTANDARD_COST()) %>" maxlength="2147483647" ></div><!--/td-->
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
</div><!--/td-->
<div class="expj-td frame06" style="width:12px;"></div><!--/td-->
</div><!--/tr-->
<div class="datagrid-button-field" style="width: 100%; height:32px;">
<div class="datagrid-button-field-cell frame07" style="width:12px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AA0030010-AA0030011button2">
expj.AA0030010.AA0030011button2 = {};
expj.AA0030010.AA0030011button2.executeAllOnDecision = function () {
  console.log('execute AA0030011button2.onDecision');
};
expj.AA0030010.AA0030011button2.executeOnLoad = function () {
  expj.AA0030010.AA0030011button2.executePScriptOnLoad();
};

expj.AA0030010.AA0030011button2.executePScriptOnLoad = function () {
  console.log('execute AA0030011button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0030010-AA0030011button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0030010-AA0030011button2-insertSub1">
expj.AA0030010.AA0030011button2.insertSub1 = {};
// script1="onClick;0;CHK;_AA0030011form2/PROC_NO[lte]0@#AA00064"
expj.AA0030010.AA0030011button2.insertSub1.onClick0 = function () {
  console.log('insertSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/PROC_NO')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0030010', 'AA0030011button2', 'AA00064');
}
};
// script2="onClick;1;CHK;_AA0030011form2/OUTSIDE_TYP[eq]2[and]_AA0030011form1/MANHOUR_TYP[eq]1@#AA00183"
expj.AA0030010.AA0030011button2.insertSub1.onClick1 = function () {
  console.log('insertSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/OUTSIDE_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form1/MANHOUR_TYP'), '[eq]', '1')) {
expj.common.pscript.addErrorMessage('AA0030010', 'AA0030011button2', 'AA00183');
}
};
// script3="onClick;2;CHK;_AA0030011form2/OUTSIDE_TYP[eq]1[and]_AA0030011form2/WS_CD[eq]@$AA90003"
expj.AA0030010.AA0030011button2.insertSub1.onClick2 = function () {
  console.log('insertSub1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/OUTSIDE_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/WS_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0030010', 'AA0030011button2', 'AA90003');
}
};
// script4="onClick;3;CHK;_AA0030011form2/OUTSIDE_TYP[eq]2[and]_AA0030011form2/VEND_CD[eq]@$AA90002"
expj.AA0030010.AA0030011button2.insertSub1.onClick3 = function () {
  console.log('insertSub1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/OUTSIDE_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/VEND_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0030010', 'AA0030011button2', 'AA90002');
}
};
// script5="onClick;4;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0030011form1/*,_AA0030011form2/*@AA0030010Servlet,,$ZZ07001"
expj.AA0030010.AA0030011button2.insertSub1.onClick4 = function () {
  console.log('insertSub1 script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030011button2', '_AA0030011form1/*,_AA0030011form2/*', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.changeBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callConfirm('AA0030010', 'AA0030011button2', 'ZZ07001', okEvent);
};
expj.AA0030010.AA0030011button2.insertSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030011button2.insertSub1['onClick' + i])) {
        expj.AA0030010.AA0030011button2.insertSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030011button2.insertSub1.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030011button2.insertSub1.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011button2-insertSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030011button2', 'insertSub1', this, 'Button');
    }
  });
  expj.AA0030010.AA0030011button2.insertSub1.executePScriptOnLoad();
};

expj.AA0030010.AA0030011button2.insertSub1.executePScriptOnLoad = function () {
  console.log('execute AA0030011button2/insertSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011button2-insertSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030011button2-insertSub1" name="insertSub1" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AA0030010-AA0030011button2-updateSub1">
expj.AA0030010.AA0030011button2.updateSub1 = {};
// script1="onClick;0;CHK;_AA0030011form2/PROC_NO[lte]0@#AA00064"
expj.AA0030010.AA0030011button2.updateSub1.onClick0 = function () {
  console.log('updateSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/PROC_NO')), '[lte]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AA0030010', 'AA0030011button2', 'AA00064');
}
};
// script2="onClick;1;CHK;_AA0030011form2/OUTSIDE_TYP[eq]2[and]_AA0030011form1/MANHOUR_TYP[eq]1@!AA00183"
expj.AA0030010.AA0030011button2.updateSub1.onClick1 = function () {
  console.log('updateSub1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/OUTSIDE_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form1/MANHOUR_TYP'), '[eq]', '1')) {
expj.common.pscript.viewErrorMessage('AA0030010', 'AA0030011button2', 'AA00183');
}
};
// script3="onClick;2;CHK;_AA0030011form2/OUTSIDE_TYP[eq]1[and]_AA0030011form2/WS_CD[eq]@$AA90003"
expj.AA0030010.AA0030011button2.updateSub1.onClick2 = function () {
  console.log('updateSub1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/OUTSIDE_TYP'), '[eq]', '1') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/WS_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0030010', 'AA0030011button2', 'AA90003');
}
};
// script4="onClick;3;CHK;_AA0030011form2/OUTSIDE_TYP[eq]2[and]_AA0030011form2/VEND_CD[eq]@$AA90002"
expj.AA0030010.AA0030011button2.updateSub1.onClick3 = function () {
  console.log('updateSub1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/OUTSIDE_TYP'), '[eq]', '2') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AA0030010', 'AA0030011button2', '_AA0030011form2/VEND_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('AA0030010', 'AA0030011button2', 'AA90002');
}
};
// script5="onClick;4;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AA0030011form1/*,_AA0030011form2/*@AA0030010Servlet,,$ZZ07003"
expj.AA0030010.AA0030011button2.updateSub1.onClick4 = function () {
  console.log('updateSub1 script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030011button2', '_AA0030011form1/*,_AA0030011form2/*', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.changeBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callConfirm('AA0030010', 'AA0030011button2', 'ZZ07003', okEvent);
};
expj.AA0030010.AA0030011button2.updateSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 4; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030011button2.updateSub1['onClick' + i])) {
        expj.AA0030010.AA0030011button2.updateSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030011button2.updateSub1.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030011button2.updateSub1.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011button2-updateSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030011button2', 'updateSub1', this, 'Button');
    }
  });
  expj.AA0030010.AA0030011button2.updateSub1.executePScriptOnLoad();
};

expj.AA0030010.AA0030011button2.updateSub1.executePScriptOnLoad = function () {
  console.log('execute AA0030011button2/updateSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011button2-updateSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030011button2-updateSub1" name="updateSub1" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AA0030011 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AA0030010-AA0030011button0">
expj.AA0030010.AA0030011button0 = {};
expj.AA0030010.AA0030011button0.executeAllOnDecision = function () {
  console.log('execute AA0030011button0.onDecision');
};
expj.AA0030010.AA0030011button0.executeOnLoad = function () {
  expj.AA0030010.AA0030011button0.executePScriptOnLoad();
};

expj.AA0030010.AA0030011button0.executePScriptOnLoad = function () {
  console.log('execute AA0030011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AA0030010-AA0030011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AA0030010-AA0030011button0-closeSub1">
expj.AA0030010.AA0030011button0.closeSub1 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@AA0030010Servlet,,$ZZ07013"
expj.AA0030010.AA0030011button0.closeSub1.onClick0 = function () {
  console.log('closeSub1 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AA0030010', 'AA0030011button0', '', 'AA0030010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AA0030010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AA0030010', response);
expj.common.changeBusinessScreenTab('AA0030010', contents);
};
expj.common.pscript.callConfirm('AA0030010', 'AA0030011button0', 'ZZ07013', okEvent);
};
expj.AA0030010.AA0030011button0.closeSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AA0030010.AA0030011button0.closeSub1['onClick' + i])) {
        expj.AA0030010.AA0030011button0.closeSub1['onClick' + i]();
      }
    }
  }
};
expj.AA0030010.AA0030011button0.closeSub1.executeAllOnDecision = function () {
};
expj.AA0030010.AA0030011button0.closeSub1.executeOnLoad = function () {
  $('#expj-AA0030010-AA0030011button0-closeSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AA0030010', 'AA0030011button0', 'closeSub1', this, 'Button');
    }
  });
  expj.AA0030010.AA0030011button0.closeSub1.executePScriptOnLoad();
};

expj.AA0030010.AA0030011button0.closeSub1.executePScriptOnLoad = function () {
  console.log('execute AA0030011button0/closeSub1.onLoad');
  var targetComponent = document.getElementById('expj-AA0030010-AA0030011button0-closeSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AA0030010-AA0030011button0-closeSub1" name="closeSub1" class="AA0030010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AA0030010 (END)-->
<% MessageStruct msgStruct = aAA0030010Control.getMessage(); %><%@include file="common/SetServerMessage.jsp" %><%
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
  try{expj.AA0030010.AA0030011form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form1.MANHOUR_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form1.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.PROC_CD.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.PROC_NO.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.SPOIL.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.FIXED_LT.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.LT_UNIT_1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.PROP_LT.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.LT_UNIT_2.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.PROP_LOT_SIZE.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.SAFETY_LT.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.LT_UNIT_3.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.OUTSIDE_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.WS_CD.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.PeekerWsCd.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.WS_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.PeekerVendCd.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.ACPT_INSPC_TYP.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.STANDARD_COST.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011button2.insertSub1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011button2.updateSub1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011button0.closeSub1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form1.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011form2.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011button2.executeOnLoad();}catch(e){};
  try{expj.AA0030010.AA0030011button0.executeOnLoad();}catch(e){};
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
  expj.AA0030010.AA0030011form1.executeAllOnDecision();
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