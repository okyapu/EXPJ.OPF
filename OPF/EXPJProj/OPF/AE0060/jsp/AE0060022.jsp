<%-- ***
This file is generated
 GeneratedDate  : Mon Feb 20 10:04:11 JST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF.V320\EXPJProj\OPF\AE0060\AE0060022.html
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

受入実績メンテナンスサブ２
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/jsp/AE0060022.jsp,v $
$Author: geng-jia $	
$Revision: 1.39 $ $Date: 2017/02/22 02:05:15 $
********************************************************* --%>
<html>
<head>
<title>受入実績メンテナンスサブ２</title>
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
 <% String callButton = aAE0060020Control.getButton(); %>

 <div id="expj-business-screen-AE0060020" data-screen="AE0060022" data-newdata="<%=aAE0060020Control.isNewData() %>">
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
              <script class="expj-script-AE0060020-AE0060022form1">
expj.AE0060020.AE0060022form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3"
expj.AE0060020.AE0060022form1.onLoad0 = function () {
  console.log('AE0060022form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
};
// script2="onDecision;0;CHKRQ;A@*0,*2"
expj.AE0060020.AE0060022form1.onDecision0 = function () {
  console.log('AE0060022form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AE0060020', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;0;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]UseParts[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Insert2@*1,*2"
expj.AE0060020.AE0060022form1.child0 = function () {
  console.log('AE0060022form1 script3');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'UseParts') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Insert2')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="child;1;UNMASK;_AE0060022button1/Insert2"
expj.AE0060020.AE0060022form1.child1 = function () {
  console.log('AE0060022form1 script4');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022button1/Insert2');
};
// script5="child;2;MASK;_AE0060022button1/Insert2"
expj.AE0060020.AE0060022form1.child2 = function () {
  console.log('AE0060022form1 script5');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022button1/Insert2');
};
// script6="onDecision;1;CHKRQ;A@*3,*5"
expj.AE0060020.AE0060022form1.onDecision1 = function () {
  console.log('AE0060022form1 script6');
if (expj.common.pscript.satisfiedRequiredComponent('AE0060020', 'A')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="child;3;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]NoUserParts[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Update2@*4,*5"
expj.AE0060020.AE0060022form1.child3 = function () {
  console.log('AE0060022form1 script7');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'NoUserParts') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Update2')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script8="child;4;UNMASK;_AE0060022button1/Update2@*8"
expj.AE0060020.AE0060022form1.child4 = function () {
  console.log('AE0060022form1 script8');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022button1/Update2');
if (!expj.common.pscript.alertMessageFlag){if(expj.common.checkNameSpace(this.child8)){this.child8();}}
};
// script9="child;5;MASK;_AE0060022button1/Update2"
expj.AE0060020.AE0060022form1.child5 = function () {
  console.log('AE0060022form1 script9');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022button1/Update2');
};
// script10="onDecision;2;CHK;<%=TypeConverter.sanitizer(callButton)%>[eq]UseParts[or]<%=TypeConverter.sanitizer(callButton)%>[eq]Insert2@*6,*7"
expj.AE0060020.AE0060022form1.onDecision2 = function () {
  console.log('AE0060022form1 script10');
if (expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'UseParts') || expj.common.pscript.evaluate('<%=TypeConverter.sanitizer(callButton)%>', '[eq]', 'Insert2')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
}
};
// script11="child;6;UNMASK;_AE0060022form2/ITEM_CD,_AE0060022form2/PeekerItemCd"
expj.AE0060020.AE0060022form1.child6 = function () {
  console.log('AE0060022form1 script11');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022form2/ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022form2/PeekerItemCd');
};
// script12="child;7;MASK;_AE0060022form2/ITEM_CD,_AE0060022form2/PeekerItemCd"
expj.AE0060020.AE0060022form1.child7 = function () {
  console.log('AE0060022form1 script12');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022form2/ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022form2/PeekerItemCd');
};
// script13="child;8;MASK;_AE0060022form2/LOT_NO,_AE0060022form2/PeekerLotNo"
expj.AE0060020.AE0060022form1.child8 = function () {
  console.log('AE0060022form1 script13');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022form2/LOT_NO');
expj.common.pscript.setMaskToReferenceComponent('AE0060020', 'AE0060022form1', '_AE0060022form2/PeekerLotNo');
};
// script14="onDecision;3;CHK;_AE0060022form2/h_LOTCTRL[neq]true@*8"
expj.AE0060020.AE0060022form1.onDecision3 = function () {
  console.log('AE0060022form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022form1', '_AE0060022form2/h_LOTCTRL'), '[neq]', 'true')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
expj.AE0060020.AE0060022form1.executeAllOnDecision = function () {
  console.log('execute AE0060022form1.onDecision');
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060022form1['onDecision' + i])) {
        expj.AE0060020.AE0060022form1['onDecision' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060022form1.executeOnLoad = function () {
  expj.AE0060020.AE0060022form1.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form1.executePScriptOnLoad = function () {
  console.log('execute AE0060022form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AE0060020.AE0060022form1['onLoad' + i])) {
      expj.AE0060020.AE0060022form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060020-AE0060022form1" action="AE0060020Servlet" name="AE0060022form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:50px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:50px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PUCH_ODR_CD",rb)%></span><!-- 発注番号 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form1-PUCH_ODR_CD">
expj.AE0060020.AE0060022form1.PUCH_ODR_CD = {};
expj.AE0060020.AE0060022form1.PUCH_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060022form1/PUCH_ODR_CD.onDecision');
  expj.AE0060020.AE0060022form1.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form1.PUCH_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form1-PUCH_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form1', 'PUCH_ODR_CD', this);
  });
  expj.AE0060020.AE0060022form1.PUCH_ODR_CD.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form1.PUCH_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060022form1/PUCH_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form1-PUCH_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form1-PUCH_ODR_CD" name="PUCH_ODR_CD" class="AE0060020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getPUCH_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_NO",rb)%></span><!-- 受入回数 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form1-ACPT_NO">
expj.AE0060020.AE0060022form1.ACPT_NO = {};
expj.AE0060020.AE0060022form1.ACPT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060022form1/ACPT_NO.onDecision');
  expj.AE0060020.AE0060022form1.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form1.ACPT_NO.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form1-ACPT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form1', 'ACPT_NO', this);
  });
  expj.AE0060020.AE0060022form1.ACPT_NO.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form1.ACPT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060022form1/ACPT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form1-ACPT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form1-ACPT_NO" name="ACPT_NO" class="AE0060020-focus-move  " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getACPT_NO()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
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
<div class="expj-td frame05" style="height:100%;"><!-- ここに上段検索条件用のDataGridを配置する。↓ --><script class="expj-script-AE0060020-AE0060022form2">
expj.AE0060020.AE0060022form2 = {};
expj.AE0060020.AE0060022form2.executeAllOnDecision = function () {
  console.log('execute AE0060022form2.onDecision');
};
expj.AE0060020.AE0060022form2.executeOnLoad = function () {
  expj.AE0060020.AE0060022form2.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060020-AE0060022form2" action="AE0060020Servlet" name="AE0060022form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:right"></div>
<div class="div-td" style="width:20px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD_11",rb)%></span><!-- 支給品目番号 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-ITEM_CD">
expj.AE0060020.AE0060022form2.ITEM_CD = {};
expj.AE0060020.AE0060022form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/ITEM_CD.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'ITEM_CD', this);
  });
  expj.AE0060020.AE0060022form2.ITEM_CD.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-ITEM_CD" name="ITEM_CD" class="AE0060020-focus-move  required-value expj-AE0060020-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-PeekerItemCd">
expj.AE0060020.AE0060022form2.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_AE0060022form2/ITEM_CD@<%=contextNo%>"
expj.AE0060020.AE0060022form2.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060020';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022form2', '_AE0060022form2/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060022form2/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060020.AE0060022form2.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060022form2.PeekerItemCd['onClick' + i])) {
        expj.AE0060020.AE0060022form2.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060022form2.PeekerItemCd.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060022form2.PeekerItemCd.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060022form2', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.AE0060020.AE0060022form2.PeekerItemCd.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060020-AE0060022form2-PeekerItemCd" class="AE0060020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-ITEM_NAME">
expj.AE0060020.AE0060022form2.ITEM_NAME = {};
expj.AE0060020.AE0060022form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/ITEM_NAME.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'ITEM_NAME', this);
  });
  expj.AE0060020.AE0060022form2.ITEM_NAME.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-ITEM_NAME" name="ITEM_NAME" class="AE0060020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUPPLIED_ISSUE_QTY",rb)%></span><!-- 使用予定数量 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-SUPPLIED_ISSUE_QTY">
expj.AE0060020.AE0060022form2.SUPPLIED_ISSUE_QTY = {};
expj.AE0060020.AE0060022form2.SUPPLIED_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/SUPPLIED_ISSUE_QTY.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.SUPPLIED_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-SUPPLIED_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'SUPPLIED_ISSUE_QTY', this);
  });
  expj.AE0060020.AE0060022form2.SUPPLIED_ISSUE_QTY.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.SUPPLIED_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/SUPPLIED_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-SUPPLIED_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-SUPPLIED_ISSUE_QTY" name="SUPPLIED_ISSUE_QTY" class="AE0060020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060020Struct.getUNIT_QTY_TYP2(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSUPPLIED_ISSUE_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-STOCK_UNIT2">
expj.AE0060020.AE0060022form2.STOCK_UNIT2 = {};
expj.AE0060020.AE0060022form2.STOCK_UNIT2.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/STOCK_UNIT2.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.STOCK_UNIT2.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-STOCK_UNIT2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'STOCK_UNIT2', this);
  });
  expj.AE0060020.AE0060022form2.STOCK_UNIT2.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.STOCK_UNIT2.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/STOCK_UNIT2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-STOCK_UNIT2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-STOCK_UNIT2" name="STOCK_UNIT2" class="AE0060020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_UNIT2()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060022form2-UNIT_QTY_TYP2" name="UNIT_QTY_TYP2" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getUNIT_QTY_TYP2()) %>">
<script class="expj-script-AE0060020-AE0060022form2-UNIT_QTY_TYP2">
expj.AE0060020.AE0060022form2.UNIT_QTY_TYP2 = {};
expj.AE0060020.AE0060022form2.UNIT_QTY_TYP2.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/UNIT_QTY_TYP2.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.UNIT_QTY_TYP2.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-UNIT_QTY_TYP2').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'UNIT_QTY_TYP2', this);
  });
  expj.AE0060020.AE0060022form2.UNIT_QTY_TYP2.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.UNIT_QTY_TYP2.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/UNIT_QTY_TYP2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-UNIT_QTY_TYP2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060022form2-h_LOTCTRL" name="h_LOTCTRL" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_LOTCTRL()) %>">
<script class="expj-script-AE0060020-AE0060022form2-h_LOTCTRL">
expj.AE0060020.AE0060022form2.h_LOTCTRL = {};
expj.AE0060020.AE0060022form2.h_LOTCTRL.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/h_LOTCTRL.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.h_LOTCTRL.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-h_LOTCTRL').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'h_LOTCTRL', this);
  });
  expj.AE0060020.AE0060022form2.h_LOTCTRL.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.h_LOTCTRL.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/h_LOTCTRL.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-h_LOTCTRL');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0321",rb)%></span><!-- 使用済数量 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-TOTAL_ISSUE_QTY">
expj.AE0060020.AE0060022form2.TOTAL_ISSUE_QTY = {};
expj.AE0060020.AE0060022form2.TOTAL_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/TOTAL_ISSUE_QTY.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.TOTAL_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-TOTAL_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'TOTAL_ISSUE_QTY', this);
  });
  expj.AE0060020.AE0060022form2.TOTAL_ISSUE_QTY.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.TOTAL_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/TOTAL_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-TOTAL_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-TOTAL_ISSUE_QTY" name="TOTAL_ISSUE_QTY" class="AE0060020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060020Struct.getUNIT_QTY_TYP2(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getTOTAL_ISSUE_QTY()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-STOCK_UNIT3">
expj.AE0060020.AE0060022form2.STOCK_UNIT3 = {};
expj.AE0060020.AE0060022form2.STOCK_UNIT3.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/STOCK_UNIT3.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.STOCK_UNIT3.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-STOCK_UNIT3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'STOCK_UNIT3', this);
  });
  expj.AE0060020.AE0060022form2.STOCK_UNIT3.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.STOCK_UNIT3.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/STOCK_UNIT3.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-STOCK_UNIT3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-STOCK_UNIT3" name="STOCK_UNIT3" class="AE0060020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_UNIT3()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060022form2-h_TOTAL_ISSUE_QTY" name="h_TOTAL_ISSUE_QTY" class="" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_TOTAL_ISSUE_QTY()) %>">
<script class="expj-script-AE0060020-AE0060022form2-h_TOTAL_ISSUE_QTY">
expj.AE0060020.AE0060022form2.h_TOTAL_ISSUE_QTY = {};
expj.AE0060020.AE0060022form2.h_TOTAL_ISSUE_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/h_TOTAL_ISSUE_QTY.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.h_TOTAL_ISSUE_QTY.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-h_TOTAL_ISSUE_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'h_TOTAL_ISSUE_QTY', this);
  });
  expj.AE0060020.AE0060022form2.h_TOTAL_ISSUE_QTY.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.h_TOTAL_ISSUE_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/h_TOTAL_ISSUE_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-h_TOTAL_ISSUE_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.RCV_ISSUE_DATE_1",rb)%></span><!-- 使用日 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-SUPPLIED_DATE">
expj.AE0060020.AE0060022form2.SUPPLIED_DATE = {};
expj.AE0060020.AE0060022form2.SUPPLIED_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/SUPPLIED_DATE.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.SUPPLIED_DATE.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-SUPPLIED_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'SUPPLIED_DATE', this);
  });
  expj.AE0060020.AE0060022form2.SUPPLIED_DATE.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.SUPPLIED_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/SUPPLIED_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-SUPPLIED_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-SUPPLIED_DATE" name="SUPPLIED_DATE" class="AE0060020-focus-move  required-value expj-AE0060020-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSUPPLIED_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-CalendarSuppliedDate">
expj.AE0060020.AE0060022form2.CalendarSuppliedDate = {};
// script1="onClick;0;CALENDAR;_AE0060022form2/SUPPLIED_DATE"
expj.AE0060020.AE0060022form2.CalendarSuppliedDate.onClick0 = function () {
  console.log('CalendarSuppliedDate script1');
expj.common.pscript.executeCalendar('AE0060020','AE0060022form2','_AE0060022form2/SUPPLIED_DATE');
};
expj.AE0060020.AE0060022form2.CalendarSuppliedDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060022form2.CalendarSuppliedDate['onClick' + i])) {
        expj.AE0060020.AE0060022form2.CalendarSuppliedDate['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060022form2.CalendarSuppliedDate.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060022form2.CalendarSuppliedDate.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-CalendarSuppliedDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060022form2', 'CalendarSuppliedDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AE0060020','AE0060022form2','_AE0060022form2/SUPPLIED_DATE');
  expj.AE0060020.AE0060022form2.CalendarSuppliedDate.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.CalendarSuppliedDate.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/CalendarSuppliedDate.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-CalendarSuppliedDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060020-AE0060022form2-CalendarSuppliedDate" class="AE0060020-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060022form2-h_BUSINESS_OPR_DATE" name="h_BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_BUSINESS_OPR_DATE()) %>">
<script class="expj-script-AE0060020-AE0060022form2-h_BUSINESS_OPR_DATE">
expj.AE0060020.AE0060022form2.h_BUSINESS_OPR_DATE = {};
expj.AE0060020.AE0060022form2.h_BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/h_BUSINESS_OPR_DATE.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.h_BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-h_BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'h_BUSINESS_OPR_DATE', this);
  });
  expj.AE0060020.AE0060022form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.h_BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/h_BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-h_BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060022form2-h_SUPPLIED_DATE" name="h_SUPPLIED_DATE" class="" data-kind="OBT_DATE;TYPE_YMD" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_SUPPLIED_DATE()) %>">
<script class="expj-script-AE0060020-AE0060022form2-h_SUPPLIED_DATE">
expj.AE0060020.AE0060022form2.h_SUPPLIED_DATE = {};
expj.AE0060020.AE0060022form2.h_SUPPLIED_DATE.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/h_SUPPLIED_DATE.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.h_SUPPLIED_DATE.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-h_SUPPLIED_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'h_SUPPLIED_DATE', this);
  });
  expj.AE0060020.AE0060022form2.h_SUPPLIED_DATE.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.h_SUPPLIED_DATE.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/h_SUPPLIED_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-h_SUPPLIED_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0356",rb)%></span><!-- 取引先手持在庫数量 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-STOCK_ON_HAND_QTY">
expj.AE0060020.AE0060022form2.STOCK_ON_HAND_QTY = {};
expj.AE0060020.AE0060022form2.STOCK_ON_HAND_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/STOCK_ON_HAND_QTY.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.STOCK_ON_HAND_QTY.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-STOCK_ON_HAND_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'STOCK_ON_HAND_QTY', this);
  });
  expj.AE0060020.AE0060022form2.STOCK_ON_HAND_QTY.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.STOCK_ON_HAND_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/STOCK_ON_HAND_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-STOCK_ON_HAND_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-STOCK_ON_HAND_QTY" name="STOCK_ON_HAND_QTY" class="AE0060020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060020Struct.getUNIT_QTY_TYP2(), Kind.N, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_ON_HAND_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-STOCK_UNIT4">
expj.AE0060020.AE0060022form2.STOCK_UNIT4 = {};
expj.AE0060020.AE0060022form2.STOCK_UNIT4.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/STOCK_UNIT4.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.STOCK_UNIT4.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-STOCK_UNIT4').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'STOCK_UNIT4', this);
  });
  expj.AE0060020.AE0060022form2.STOCK_UNIT4.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.STOCK_UNIT4.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/STOCK_UNIT4.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-STOCK_UNIT4');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-STOCK_UNIT4" name="STOCK_UNIT4" class="AE0060020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_UNIT4()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PART_SUPPLIED_COMMENT",rb)%></span><!-- 支給品使用備考 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-PART_SUPPLIED_COMMENT">
expj.AE0060020.AE0060022form2.PART_SUPPLIED_COMMENT = {};
expj.AE0060020.AE0060022form2.PART_SUPPLIED_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/PART_SUPPLIED_COMMENT.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.PART_SUPPLIED_COMMENT.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-PART_SUPPLIED_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'PART_SUPPLIED_COMMENT', this);
  });
  expj.AE0060020.AE0060022form2.PART_SUPPLIED_COMMENT.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.PART_SUPPLIED_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/PART_SUPPLIED_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-PART_SUPPLIED_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-PART_SUPPLIED_COMMENT" name="PART_SUPPLIED_COMMENT" class="AE0060020-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getPART_SUPPLIED_COMMENT()) %>" maxlength="80" ></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060022form2-h_PART_SUPPLIED_COMMENT" name="h_PART_SUPPLIED_COMMENT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.geth_PART_SUPPLIED_COMMENT()) %>">
<script class="expj-script-AE0060020-AE0060022form2-h_PART_SUPPLIED_COMMENT">
expj.AE0060020.AE0060022form2.h_PART_SUPPLIED_COMMENT = {};
expj.AE0060020.AE0060022form2.h_PART_SUPPLIED_COMMENT.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/h_PART_SUPPLIED_COMMENT.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.h_PART_SUPPLIED_COMMENT.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-h_PART_SUPPLIED_COMMENT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'h_PART_SUPPLIED_COMMENT', this);
  });
  expj.AE0060020.AE0060022form2.h_PART_SUPPLIED_COMMENT.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.h_PART_SUPPLIED_COMMENT.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/h_PART_SUPPLIED_COMMENT.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-h_PART_SUPPLIED_COMMENT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ISSUE_INST_CD",rb)%></span><!-- 出庫指示番号 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-ISSUE_INST_CD">
expj.AE0060020.AE0060022form2.ISSUE_INST_CD = {};
expj.AE0060020.AE0060022form2.ISSUE_INST_CD.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/ISSUE_INST_CD.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.ISSUE_INST_CD.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-ISSUE_INST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'ISSUE_INST_CD', this);
  });
  expj.AE0060020.AE0060022form2.ISSUE_INST_CD.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.ISSUE_INST_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/ISSUE_INST_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-ISSUE_INST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-ISSUE_INST_CD" name="ISSUE_INST_CD" class="AE0060020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getISSUE_INST_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.MRP_ODR_TYP",rb)%></span><!-- 品目手配区分 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-MRP_ODR_TYP">
expj.AE0060020.AE0060022form2.MRP_ODR_TYP = {};
expj.AE0060020.AE0060022form2.MRP_ODR_TYP.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/MRP_ODR_TYP.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.MRP_ODR_TYP.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-MRP_ODR_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'MRP_ODR_TYP', this);
  });
  expj.AE0060020.AE0060022form2.MRP_ODR_TYP.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.MRP_ODR_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/MRP_ODR_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-MRP_ODR_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-MRP_ODR_TYP" name="MRP_ODR_TYP" class="AE0060020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getMRP_ODR_TYP()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<p></p><div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.SUPPLIED_UNIT",rb)%></span></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-SUPPLIED_UNIT_NUMERATOR">
expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_NUMERATOR = {};
expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_NUMERATOR.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/SUPPLIED_UNIT_NUMERATOR.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_NUMERATOR.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-SUPPLIED_UNIT_NUMERATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'SUPPLIED_UNIT_NUMERATOR', this);
  });
  expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_NUMERATOR.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_NUMERATOR.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/SUPPLIED_UNIT_NUMERATOR.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-SUPPLIED_UNIT_NUMERATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-SUPPLIED_UNIT_NUMERATOR" name="SUPPLIED_UNIT_NUMERATOR" class="AE0060020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSUPPLIED_UNIT_NUMERATOR()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0005",rb)%></span><!-- ／ --></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-SUPPLIED_UNIT_DENOMINATOR">
expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_DENOMINATOR = {};
expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_DENOMINATOR.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/SUPPLIED_UNIT_DENOMINATOR.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_DENOMINATOR.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-SUPPLIED_UNIT_DENOMINATOR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'SUPPLIED_UNIT_DENOMINATOR', this);
  });
  expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_DENOMINATOR.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_DENOMINATOR.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/SUPPLIED_UNIT_DENOMINATOR.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-SUPPLIED_UNIT_DENOMINATOR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-SUPPLIED_UNIT_DENOMINATOR" name="SUPPLIED_UNIT_DENOMINATOR" class="AE0060020-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSUPPLIED_UNIT_DENOMINATOR()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-STOCK_UNIT5">
expj.AE0060020.AE0060022form2.STOCK_UNIT5 = {};
expj.AE0060020.AE0060022form2.STOCK_UNIT5.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/STOCK_UNIT5.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.STOCK_UNIT5.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-STOCK_UNIT5').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'STOCK_UNIT5', this);
  });
  expj.AE0060020.AE0060022form2.STOCK_UNIT5.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.STOCK_UNIT5.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/STOCK_UNIT5.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-STOCK_UNIT5');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-STOCK_UNIT5" name="STOCK_UNIT5" class="AE0060020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_UNIT5()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.STOCK_LOT_CD",rb)%></span><!-- 在庫ロット番号 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-LOT_NO">
expj.AE0060020.AE0060022form2.LOT_NO = {};
expj.AE0060020.AE0060022form2.LOT_NO.executeAllOnDecision = function () {
  console.log('execute AE0060022form2/LOT_NO.onDecision');
  expj.AE0060020.AE0060022form2.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form2.LOT_NO.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-LOT_NO').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form2', 'LOT_NO', this);
  });
  expj.AE0060020.AE0060022form2.LOT_NO.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.LOT_NO.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/LOT_NO.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-LOT_NO');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form2-LOT_NO" name="LOT_NO" class="AE0060020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getLOT_NO()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form2-PeekerLotNo">
expj.AE0060020.AE0060022form2.PeekerLotNo = {};
// script1="onClick;0;PEEKER;_AE0060022form2/LOT_NO:_AE0060022form2/ITEM_CD@<%=contextNo%>"
expj.AE0060020.AE0060022form2.PeekerLotNo.onClick0 = function () {
  console.log('PeekerLotNo script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AE0060020';
var parameterValues = 'PeekerLotNo%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022form2', '_AE0060022form2/LOT_NO') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022form2', '_AE0060022form2/ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%LOT_NO_13%&%';
parameterValues += 'TARGET_FIELD%=%_AE0060022form2/LOT_NO:_AE0060022form2/ITEM_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AE0060020%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AE0060020.AE0060022form2.PeekerLotNo.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060022form2.PeekerLotNo['onClick' + i])) {
        expj.AE0060020.AE0060022form2.PeekerLotNo['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060022form2.PeekerLotNo.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060022form2.PeekerLotNo.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form2-PeekerLotNo').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060022form2', 'PeekerLotNo', this, 'Button');
    }
  });
  expj.AE0060020.AE0060022form2.PeekerLotNo.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form2.PeekerLotNo.executePScriptOnLoad = function () {
  console.log('execute AE0060022form2/PeekerLotNo.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form2-PeekerLotNo');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AE0060020-AE0060022form2-PeekerLotNo" class="AE0060020-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-AE0060020-AE0060022button1">
expj.AE0060020.AE0060022button1 = {};
expj.AE0060020.AE0060022button1.executeAllOnDecision = function () {
  console.log('execute AE0060022button1.onDecision');
};
expj.AE0060020.AE0060022button1.executeOnLoad = function () {
  expj.AE0060020.AE0060022button1.executePScriptOnLoad();
};

expj.AE0060020.AE0060022button1.executePScriptOnLoad = function () {
  console.log('execute AE0060022button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060020-AE0060022button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060020-AE0060022button1-Insert2">
expj.AE0060020.AE0060022button1.Insert2 = {};
// script1="onClick;0;CHK;_AE0060022form2/h_BUSINESS_OPR_DATE[lt]_AE0060022form2/SUPPLIED_DATE@#AE00071"
expj.AE0060020.AE0060022button1.Insert2.onClick0 = function () {
  console.log('Insert2 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022button1', '_AE0060022form2/h_BUSINESS_OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022button1', '_AE0060022form2/SUPPLIED_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060020', 'AE0060022button1', 'AE00071');
}
};
// script2="onClick;1;CHK;_AE0060022form2/TOTAL_ISSUE_QTY[numeq]0@#AE00076"
expj.AE0060020.AE0060022button1.Insert2.onClick1 = function () {
  console.log('Insert2 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022button1', '_AE0060022form2/TOTAL_ISSUE_QTY')), '[numeq]', expj.common.pscript.convertNumber('0'))) {
expj.common.pscript.addErrorMessage('AE0060020', 'AE0060022button1', 'AE00076');
}
};
// script3="onClick;2;CHK;_AE0060022form2/LOT_NO[neq][and]_AE0060022form2/h_BEST_BEFORE_DATA_PARA[eq]1@$AE00163"
expj.AE0060020.AE0060022button1.Insert2.onClick2 = function () {
  console.log('Insert2 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022button1', '_AE0060022form2/LOT_NO'), '[neq]', '') && expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022button1', '_AE0060022form2/h_BEST_BEFORE_DATA_PARA'), '[eq]', '1')) {
expj.common.pscript.addWarningMessage('AE0060020', 'AE0060022button1', 'AE00163');
}
};
// script4="onClick;3;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0060022form1/*,_AE0060022form2/*,_AE0060022form3/*@AE0060020Servlet,,$ZZ07001"
expj.AE0060020.AE0060022button1.Insert2.onClick3 = function () {
  console.log('Insert2 script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060022button1', '_AE0060022form1/*,_AE0060022form2/*,_AE0060022form3/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.changeBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callConfirm('AE0060020', 'AE0060022button1', 'ZZ07001', okEvent);
};
expj.AE0060020.AE0060022button1.Insert2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 3; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060022button1.Insert2['onClick' + i])) {
        expj.AE0060020.AE0060022button1.Insert2['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060022button1.Insert2.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060022button1.Insert2.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022button1-Insert2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060022button1', 'Insert2', this, 'Button');
    }
  });
  expj.AE0060020.AE0060022button1.Insert2.executePScriptOnLoad();
};

expj.AE0060020.AE0060022button1.Insert2.executePScriptOnLoad = function () {
  console.log('execute AE0060022button1/Insert2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022button1-Insert2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060022button1-Insert2" name="Insert2" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022button1-Update2">
expj.AE0060020.AE0060022button1.Update2 = {};
// script1="onClick;0;CHK;_AE0060022form2/h_BUSINESS_OPR_DATE[lt]_AE0060022form2/SUPPLIED_DATE@#AE00071"
expj.AE0060020.AE0060022button1.Update2.onClick0 = function () {
  console.log('Update2 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022button1', '_AE0060022form2/h_BUSINESS_OPR_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AE0060020', 'AE0060022button1', '_AE0060022form2/SUPPLIED_DATE')))) {
expj.common.pscript.addErrorMessage('AE0060020', 'AE0060022button1', 'AE00071');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0060022form1/*,_AE0060022form2/*,_AE0060022form3/*@AE0060020Servlet,,$ZZ07003"
expj.AE0060020.AE0060022button1.Update2.onClick1 = function () {
  console.log('Update2 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060022button1', '_AE0060022form1/*,_AE0060022form2/*,_AE0060022form3/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.changeBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callConfirm('AE0060020', 'AE0060022button1', 'ZZ07003', okEvent);
};
expj.AE0060020.AE0060022button1.Update2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060022button1.Update2['onClick' + i])) {
        expj.AE0060020.AE0060022button1.Update2['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060022button1.Update2.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060022button1.Update2.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022button1-Update2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060022button1', 'Update2', this, 'Button');
    }
  });
  expj.AE0060020.AE0060022button1.Update2.executePScriptOnLoad();
};

expj.AE0060020.AE0060022button1.Update2.executePScriptOnLoad = function () {
  console.log('execute AE0060022button1/Update2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022button1-Update2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060022button1-Update2" name="Update2" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="expj-td frame05" style=""><% System.out.println(aAE0060020Struct.getUNIT_QTY_TYP()); %><!-- ここに下段メンテナンス用のDataGridを配置する。↓ --><script class="expj-script-AE0060020-AE0060022form3">
expj.AE0060020.AE0060022form3 = {};
expj.AE0060020.AE0060022form3.executeAllOnDecision = function () {
  console.log('execute AE0060022form3.onDecision');
};
expj.AE0060020.AE0060022form3.executeOnLoad = function () {
  expj.AE0060020.AE0060022form3.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form3.executePScriptOnLoad = function () {
  console.log('execute AE0060022form3.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AE0060020-AE0060022form3" action="AE0060020Servlet" name="AE0060022form3" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:75px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:75px;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:right"></div>
<div class="div-td" style="width:20px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ACPT_QTY_2",rb)%></span><!-- 受入数 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form3-ACPT_QTY">
expj.AE0060020.AE0060022form3.ACPT_QTY = {};
expj.AE0060020.AE0060022form3.ACPT_QTY.executeAllOnDecision = function () {
  console.log('execute AE0060022form3/ACPT_QTY.onDecision');
  expj.AE0060020.AE0060022form3.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form3.ACPT_QTY.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form3-ACPT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form3', 'ACPT_QTY', this);
  });
  expj.AE0060020.AE0060022form3.ACPT_QTY.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form3.ACPT_QTY.executePScriptOnLoad = function () {
  console.log('execute AE0060022form3/ACPT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form3-ACPT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form3-ACPT_QTY" name="ACPT_QTY" class="AE0060020-focus-move  " style="width:150px;" data-kind="<%=Kind.convertNumeric(aAE0060020Control.getStruct().getUNIT_QTY_TYP(), Kind.Z, 14, 1, Kind.FLOOR, 4)%>" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getACPT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form3-STOCK_UNIT1">
expj.AE0060020.AE0060022form3.STOCK_UNIT1 = {};
expj.AE0060020.AE0060022form3.STOCK_UNIT1.executeAllOnDecision = function () {
  console.log('execute AE0060022form3/STOCK_UNIT1.onDecision');
  expj.AE0060020.AE0060022form3.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form3.STOCK_UNIT1.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form3-STOCK_UNIT1').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form3', 'STOCK_UNIT1', this);
  });
  expj.AE0060020.AE0060022form3.STOCK_UNIT1.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form3.STOCK_UNIT1.executePScriptOnLoad = function () {
  console.log('execute AE0060022form3/STOCK_UNIT1.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form3-STOCK_UNIT1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form3-STOCK_UNIT1" name="STOCK_UNIT1" class="AE0060020-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getSTOCK_UNIT1()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span><!-- 製番 --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form3-JOB_ODR_CD">
expj.AE0060020.AE0060022form3.JOB_ODR_CD = {};
expj.AE0060020.AE0060022form3.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AE0060022form3/JOB_ODR_CD.onDecision');
  expj.AE0060020.AE0060022form3.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form3.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form3-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form3', 'JOB_ODR_CD', this);
  });
  expj.AE0060020.AE0060022form3.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form3.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060022form3/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form3-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form3-JOB_ODR_CD" name="JOB_ODR_CD" class="AE0060020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getJOB_ODR_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-AE0060020-AE0060022form3-UNIT_QTY_TYP" name="UNIT_QTY_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getUNIT_QTY_TYP()) %>">
<script class="expj-script-AE0060020-AE0060022form3-UNIT_QTY_TYP">
expj.AE0060020.AE0060022form3.UNIT_QTY_TYP = {};
expj.AE0060020.AE0060022form3.UNIT_QTY_TYP.executeAllOnDecision = function () {
  console.log('execute AE0060022form3/UNIT_QTY_TYP.onDecision');
  expj.AE0060020.AE0060022form3.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form3.UNIT_QTY_TYP.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form3-UNIT_QTY_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form3', 'UNIT_QTY_TYP', this);
  });
  expj.AE0060020.AE0060022form3.UNIT_QTY_TYP.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form3.UNIT_QTY_TYP.executePScriptOnLoad = function () {
  console.log('execute AE0060022form3/UNIT_QTY_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form3-UNIT_QTY_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:20px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span><!-- 取引先コード --></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form3-VEND_CD">
expj.AE0060020.AE0060022form3.VEND_CD = {};
expj.AE0060020.AE0060022form3.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AE0060022form3/VEND_CD.onDecision');
  expj.AE0060020.AE0060022form3.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form3.VEND_CD.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form3-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form3', 'VEND_CD', this);
  });
  expj.AE0060020.AE0060022form3.VEND_CD.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form3.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AE0060022form3/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form3-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form3-VEND_CD" name="VEND_CD" class="AE0060020-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getVEND_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AE0060020-AE0060022form3-VEND_NAME">
expj.AE0060020.AE0060022form3.VEND_NAME = {};
expj.AE0060020.AE0060022form3.VEND_NAME.executeAllOnDecision = function () {
  console.log('execute AE0060022form3/VEND_NAME.onDecision');
  expj.AE0060020.AE0060022form3.executeAllOnDecision();
  expj.AE0060020.executeAllOnDecision();
};
expj.AE0060020.AE0060022form3.VEND_NAME.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022form3-VEND_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AE0060020', 'AE0060022form3', 'VEND_NAME', this);
  });
  expj.AE0060020.AE0060022form3.VEND_NAME.executePScriptOnLoad();
};

expj.AE0060020.AE0060022form3.VEND_NAME.executePScriptOnLoad = function () {
  console.log('execute AE0060022form3/VEND_NAME.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022form3-VEND_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-AE0060020-AE0060022form3-VEND_NAME" name="VEND_NAME" class="AE0060020-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aAE0060020Struct.getVEND_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:0px;text-align:left;"></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 95px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AE0060022 Revision: 1.8  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-AE0060020-AE0060022button0">
expj.AE0060020.AE0060022button0 = {};
expj.AE0060020.AE0060022button0.executeAllOnDecision = function () {
  console.log('execute AE0060022button0.onDecision');
};
expj.AE0060020.AE0060022button0.executeOnLoad = function () {
  expj.AE0060020.AE0060022button0.executePScriptOnLoad();
};

expj.AE0060020.AE0060022button0.executePScriptOnLoad = function () {
  console.log('execute AE0060022button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AE0060020-AE0060022button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AE0060020-AE0060022button0-Return2">
expj.AE0060020.AE0060022button0.Return2 = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_AE0060022form1/,_AE0060022form2/,_AE0060022form3/*@AE0060020Servlet,,$ZZ07013"
expj.AE0060020.AE0060022button0.Return2.onClick0 = function () {
  console.log('Return2 script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AE0060020', 'AE0060022button0', '_AE0060022form1/,_AE0060022form2/,_AE0060022form3/*', 'AE0060020Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AE0060020Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AE0060020', response);
expj.common.changeBusinessScreenTab('AE0060020', contents);
};
expj.common.pscript.callConfirm('AE0060020', 'AE0060022button0', 'ZZ07013', okEvent);
};
expj.AE0060020.AE0060022button0.Return2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AE0060020.AE0060022button0.Return2['onClick' + i])) {
        expj.AE0060020.AE0060022button0.Return2['onClick' + i]();
      }
    }
  }
};
expj.AE0060020.AE0060022button0.Return2.executeAllOnDecision = function () {
};
expj.AE0060020.AE0060022button0.Return2.executeOnLoad = function () {
  $('#expj-AE0060020-AE0060022button0-Return2').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AE0060020', 'AE0060022button0', 'Return2', this, 'Button');
    }
  });
  expj.AE0060020.AE0060022button0.Return2.executePScriptOnLoad();
};

expj.AE0060020.AE0060022button0.Return2.executePScriptOnLoad = function () {
  console.log('execute AE0060022button0/Return2.onLoad');
  var targetComponent = document.getElementById('expj-AE0060020-AE0060022button0-Return2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AE0060020-AE0060022button0-Return2" name="Return2" class="AE0060020-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AE0060020 (END)-->
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
  try{expj.AE0060020.AE0060022form1.PUCH_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form1.ACPT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.SUPPLIED_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.STOCK_UNIT2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.UNIT_QTY_TYP2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.h_LOTCTRL.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.TOTAL_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.STOCK_UNIT3.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.h_TOTAL_ISSUE_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.SUPPLIED_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.CalendarSuppliedDate.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.h_BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.h_SUPPLIED_DATE.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.STOCK_ON_HAND_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.STOCK_UNIT4.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.PART_SUPPLIED_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.h_PART_SUPPLIED_COMMENT.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.ISSUE_INST_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.MRP_ODR_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_NUMERATOR.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.SUPPLIED_UNIT_DENOMINATOR.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.STOCK_UNIT5.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.LOT_NO.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.PeekerLotNo.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022button1.Insert2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022button1.Update2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form3.ACPT_QTY.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form3.STOCK_UNIT1.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form3.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form3.UNIT_QTY_TYP.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form3.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form3.VEND_NAME.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022button0.Return2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form1.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form2.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022button1.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022form3.executeOnLoad();}catch(e){};
  try{expj.AE0060020.AE0060022button0.executeOnLoad();}catch(e){};
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
  expj.AE0060020.AE0060022form1.executeAllOnDecision();
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