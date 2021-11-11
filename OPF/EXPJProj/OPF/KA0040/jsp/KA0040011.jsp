<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:57:13 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KA0040\KA0040011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KA0040.*" %>
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
<jsp:useBean id="aKA0040010Control" class="com.nec.jp.orteus.metamorBase.KA0040.KA0040010Control" scope="request"/>
<jsp:useBean id="aKA0040010Struct" class="com.nec.jp.orteus.metamorBase.KA0040.KA0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

製品単価メンテナンスサブ1
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0040/jsp/KA0040011.jsp,v $
$Author: geng-jia $     
$Revision: 1.10 $ $Date: 2017/02/22 02:06:56 $
********************************************************* --%>
<html>
<head>
<title>製品単価メンテナンスサブ1</title>
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
<script class="expj-script-KA0040010_init">
  // KA0040010名前空間
  expj.KA0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

<%
// 金額の書式
String costColKind = "OBT_NUMBER_P;14.2;FLOOR;4";
/*if(aKA0040010Struct.getPRICE_ROUND_TYP() != null && aKA0040010Struct.getDECIMAL_FIG() != null
&& "".equals(aKA0040010Struct.getPRICE_ROUND_TYP()) == false && "".equals(aKA0040010Struct.getDECIMAL_FIG()) == false){
    costColKind = Kind.convertNumeric(Kind.NUMBER,Kind.Z,14,2,aKA0040010Struct.getPRICE_ROUND_TYP(),aKA0040010Struct.getDECIMAL_FIG());
}*/
%>

<% String CallButton = aKA0040010Control.getButton(); %>
  <div id="expj-business-screen-KA0040010" data-screen="KA0040011" data-newdata="<%=aKA0040010Control.isNewData() %>">
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
              <script class="expj-script-KA0040010-KA0040011form1">
expj.KA0040010.KA0040011form1 = {};
// script1="onLoad;0;CALL;child@0"
expj.KA0040010.KA0040011form1.onLoad0 = function () {
  console.log('KA0040011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.child0)){this.child0();}
};
// script2="child;0;CHK;<%=CallButton%>[eq]append[or]<%=CallButton%>[eq]copy[or]<%=CallButton%>[eq]sub1Insert@*1,*2"
expj.KA0040010.KA0040011form1.child0 = function () {
  console.log('KA0040011form1 script2');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'copy') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'sub1Insert')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="child;1;MASK;_KA0040011button1/sub1Update"
expj.KA0040010.KA0040011form1.child1 = function () {
  console.log('KA0040011form1 script3');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011button1/sub1Update');
};
// script4="child;2;CHK;<%=CallButton%>[eq]modify[or]<%=CallButton%>[eq]sub1Update@*3"
expj.KA0040010.KA0040011form1.child2 = function () {
  console.log('KA0040011form1 script4');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'modify') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'sub1Update')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;3;MASK;_KA0040011button1/sub1Insert,_KA0040011form2/p_EFF_PHASE_IN_DATE,_KA0040011form2/CalendarEffPhaseInDate"
expj.KA0040010.KA0040011form1.child3 = function () {
  console.log('KA0040011form1 script5');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011button1/sub1Insert');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011form2/p_EFF_PHASE_IN_DATE');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011form2/CalendarEffPhaseInDate');
};
// script6="onLoad;1;CALL;onDecision@0,1,2"
expj.KA0040010.KA0040011form1.onLoad1 = function () {
  console.log('KA0040011form1 script6');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script7="onDecision;0;CHKRQ;A@*4,*6"
expj.KA0040010.KA0040011form1.onDecision0 = function () {
  console.log('KA0040011form1 script7');
if (expj.common.pscript.satisfiedRequiredComponent('KA0040010', 'A')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;<%=CallButton%>[eq]append[or]<%=CallButton%>[eq]copy[or]<%=CallButton%>[eq]sub1Insert@*5"
expj.KA0040010.KA0040011form1.child4 = function () {
  console.log('KA0040011form1 script8');
if (expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'append') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'copy') || expj.common.pscript.evaluate('<%=CallButton%>', '[eq]', 'sub1Insert')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script9="child;5;UNMASK;_KA0040011button1/sub1Insert"
expj.KA0040010.KA0040011form1.child5 = function () {
  console.log('KA0040011form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011button1/sub1Insert');
};
// script10="child;6;MASK;_KA0040011button1/sub1Insert"
expj.KA0040010.KA0040011form1.child6 = function () {
  console.log('KA0040011form1 script10');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011button1/sub1Insert');
};
// script11="onDecision;1;CHK;_KA0040011form1/h_APR_UNIT_COST[eq]0@*7,*8"
expj.KA0040010.KA0040011form1.onDecision1 = function () {
  console.log('KA0040011form1 script11');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040011form1', '_KA0040011form1/h_APR_UNIT_COST'), '[eq]', '0')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;MASK;_KA0040011form2/p_APPR_REMARKS"
expj.KA0040010.KA0040011form1.child7 = function () {
  console.log('KA0040011form1 script12');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011form2/p_APPR_REMARKS');
};
// script13="child;8;UNMASK;_KA0040011form2/p_APPR_REMARKS"
expj.KA0040010.KA0040011form1.child8 = function () {
  console.log('KA0040011form1 script13');
expj.common.pscript.setUnMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011form2/p_APPR_REMARKS');
};
// script14="onDecision;2;CHK;_KA0040011form1/h_SCREENMOVE_TYP[neq]@*9"
expj.KA0040010.KA0040011form1.onDecision2 = function () {
  console.log('KA0040011form1 script14');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040011form1', '_KA0040011form1/h_SCREENMOVE_TYP'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child9)){this.child9();}
}
};
// script15="child;9;MASK;_KA0040011button1/sub1Insert,_KA0040011button1/sub1Update"
expj.KA0040010.KA0040011form1.child9 = function () {
  console.log('KA0040011form1 script15');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011button1/sub1Insert');
expj.common.pscript.setMaskToReferenceComponent('KA0040010', 'KA0040011form1', '_KA0040011button1/sub1Update');
};
expj.KA0040010.KA0040011form1.executeAllOnDecision = function () {
  console.log('execute KA0040011form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040011form1['onDecision' + i])) {
        expj.KA0040010.KA0040011form1['onDecision' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040011form1.executeOnLoad = function () {
  expj.KA0040010.KA0040011form1.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (expj.common.checkNameSpace(expj.KA0040010.KA0040011form1['onLoad' + i])) {
      expj.KA0040010.KA0040011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0040010-KA0040011form1" action="KA0040010Servlet" name="KA0040011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:73px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:73px;">
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
<script class="expj-script-KA0040010-KA0040011form1-ITEM_CD">
expj.KA0040010.KA0040011form1.ITEM_CD = {};
expj.KA0040010.KA0040011form1.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/ITEM_CD.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.ITEM_CD.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'ITEM_CD', this);
  });
  expj.KA0040010.KA0040011form1.ITEM_CD.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form1-ITEM_CD" name="ITEM_CD" class="KA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getITEM_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form1-ITEM_NAME">
expj.KA0040010.KA0040011form1.ITEM_NAME = {};
expj.KA0040010.KA0040011form1.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/ITEM_NAME.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.ITEM_NAME.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'ITEM_NAME', this);
  });
  expj.KA0040010.KA0040011form1.ITEM_NAME.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form1-ITEM_NAME" name="ITEM_NAME" class="KA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040011form1-h_SCREENMOVE_TYP" name="h_SCREENMOVE_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.geth_SCREENMOVE_TYP()) %>">
<script class="expj-script-KA0040010-KA0040011form1-h_SCREENMOVE_TYP">
expj.KA0040010.KA0040011form1.h_SCREENMOVE_TYP = {};
expj.KA0040010.KA0040011form1.h_SCREENMOVE_TYP.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/h_SCREENMOVE_TYP.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.h_SCREENMOVE_TYP.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-h_SCREENMOVE_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'h_SCREENMOVE_TYP', this);
  });
  expj.KA0040010.KA0040011form1.h_SCREENMOVE_TYP.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.h_SCREENMOVE_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/h_SCREENMOVE_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-h_SCREENMOVE_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040011form1-h_APPR_ID" name="h_APPR_ID" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.geth_APPR_ID()) %>">
<script class="expj-script-KA0040010-KA0040011form1-h_APPR_ID">
expj.KA0040010.KA0040011form1.h_APPR_ID = {};
expj.KA0040010.KA0040011form1.h_APPR_ID.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/h_APPR_ID.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.h_APPR_ID.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-h_APPR_ID').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'h_APPR_ID', this);
  });
  expj.KA0040010.KA0040011form1.h_APPR_ID.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.h_APPR_ID.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/h_APPR_ID.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-h_APPR_ID');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUST_CD",rb)%></span><!-- 得意先コード --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form1-CUST_CD">
expj.KA0040010.KA0040011form1.CUST_CD = {};
expj.KA0040010.KA0040011form1.CUST_CD.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/CUST_CD.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.CUST_CD.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-CUST_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'CUST_CD', this);
  });
  expj.KA0040010.KA0040011form1.CUST_CD.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.CUST_CD.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/CUST_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-CUST_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form1-CUST_CD" name="CUST_CD" class="KA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUST_CD()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form1-CUST_NAME">
expj.KA0040010.KA0040011form1.CUST_NAME = {};
expj.KA0040010.KA0040011form1.CUST_NAME.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/CUST_NAME.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.CUST_NAME.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-CUST_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'CUST_NAME', this);
  });
  expj.KA0040010.KA0040011form1.CUST_NAME.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.CUST_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/CUST_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-CUST_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form1-CUST_NAME" name="CUST_NAME" class="KA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUST_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040011form1-h_APR_UNIT_COST" name="h_APR_UNIT_COST" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.geth_APR_UNIT_COST()) %>">
<script class="expj-script-KA0040010-KA0040011form1-h_APR_UNIT_COST">
expj.KA0040010.KA0040011form1.h_APR_UNIT_COST = {};
expj.KA0040010.KA0040011form1.h_APR_UNIT_COST.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/h_APR_UNIT_COST.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.h_APR_UNIT_COST.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-h_APR_UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'h_APR_UNIT_COST', this);
  });
  expj.KA0040010.KA0040011form1.h_APR_UNIT_COST.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.h_APR_UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/h_APR_UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-h_APR_UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CUR_CD",rb)%></span><!-- 通貨コード --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form1-CUR_CD">
expj.KA0040010.KA0040011form1.CUR_CD = {};
expj.KA0040010.KA0040011form1.CUR_CD.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/CUR_CD.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.CUR_CD.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-CUR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'CUR_CD', this);
  });
  expj.KA0040010.KA0040011form1.CUR_CD.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.CUR_CD.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/CUR_CD.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-CUR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form1-CUR_CD" name="CUR_CD" class="KA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUR_CD()) %>" maxlength="25" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form1-CUR_NAME">
expj.KA0040010.KA0040011form1.CUR_NAME = {};
expj.KA0040010.KA0040011form1.CUR_NAME.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/CUR_NAME.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.CUR_NAME.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-CUR_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'CUR_NAME', this);
  });
  expj.KA0040010.KA0040011form1.CUR_NAME.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.CUR_NAME.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/CUR_NAME.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-CUR_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form1-CUR_NAME" name="CUR_NAME" class="KA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getCUR_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-KA0040010-KA0040011form1-w_MODIFY_COUNT" name="w_MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getw_MODIFY_COUNT()) %>">
<script class="expj-script-KA0040010-KA0040011form1-w_MODIFY_COUNT">
expj.KA0040010.KA0040011form1.w_MODIFY_COUNT = {};
expj.KA0040010.KA0040011form1.w_MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute KA0040011form1/w_MODIFY_COUNT.onDecision');
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form1.w_MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form1-w_MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form1', 'w_MODIFY_COUNT', this);
  });
  expj.KA0040010.KA0040011form1.w_MODIFY_COUNT.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form1.w_MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute KA0040011form1/w_MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form1-w_MODIFY_COUNT');
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
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-KA0040010-KA0040011form2">
expj.KA0040010.KA0040011form2 = {};
expj.KA0040010.KA0040011form2.executeAllOnDecision = function () {
  console.log('execute KA0040011form2.onDecision');
};
expj.KA0040010.KA0040011form2.executeOnLoad = function () {
  expj.KA0040010.KA0040011form2.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form2.executePScriptOnLoad = function () {
  console.log('execute KA0040011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KA0040010-KA0040011form2" action="KA0040010Servlet" name="KA0040011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.EFF_PHASE_IN_DATE",rb)%></span><!-- 有効開始日付 --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form2-p_EFF_PHASE_IN_DATE">
expj.KA0040010.KA0040011form2.p_EFF_PHASE_IN_DATE = {};
expj.KA0040010.KA0040011form2.p_EFF_PHASE_IN_DATE.executeAllOnDecision = function () {
  console.log('execute KA0040011form2/p_EFF_PHASE_IN_DATE.onDecision');
  expj.KA0040010.KA0040011form2.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form2.p_EFF_PHASE_IN_DATE.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form2-p_EFF_PHASE_IN_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form2', 'p_EFF_PHASE_IN_DATE', this);
  });
  expj.KA0040010.KA0040011form2.p_EFF_PHASE_IN_DATE.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form2.p_EFF_PHASE_IN_DATE.executePScriptOnLoad = function () {
  console.log('execute KA0040011form2/p_EFF_PHASE_IN_DATE.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form2-p_EFF_PHASE_IN_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form2-p_EFF_PHASE_IN_DATE" name="p_EFF_PHASE_IN_DATE" class="KA0040010-focus-move  required-value expj-KA0040010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getp_EFF_PHASE_IN_DATE()) %>" maxlength="2147483647" ></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form2-CalendarEffPhaseInDate">
expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate = {};
// script1="onClick;0;CALENDAR;_KA0040011form2/p_EFF_PHASE_IN_DATE"
expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate.onClick0 = function () {
  console.log('CalendarEffPhaseInDate script1');
expj.common.pscript.executeCalendar('KA0040010','KA0040011form2','_KA0040011form2/p_EFF_PHASE_IN_DATE');
};
expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate['onClick' + i])) {
        expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form2-CalendarEffPhaseInDate').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040011form2', 'CalendarEffPhaseInDate', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('KA0040010','KA0040011form2','_KA0040011form2/p_EFF_PHASE_IN_DATE');
  expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate.executePScriptOnLoad = function () {
  console.log('execute KA0040011form2/CalendarEffPhaseInDate.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form2-CalendarEffPhaseInDate');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KA0040010-KA0040011form2-CalendarEffPhaseInDate" class="KA0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.UNIT_COST_TYP",rb)%></span><!-- 単価区分 --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form2-p_UNIT_COST_TYP">
expj.KA0040010.KA0040011form2.p_UNIT_COST_TYP = {};
expj.KA0040010.KA0040011form2.p_UNIT_COST_TYP.executeAllOnDecision = function () {
  console.log('execute KA0040011form2/p_UNIT_COST_TYP.onDecision');
  expj.KA0040010.KA0040011form2.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form2.p_UNIT_COST_TYP.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form2-p_UNIT_COST_TYP').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('KA0040010', 'KA0040011form2', 'p_UNIT_COST_TYP', this);
  });
  expj.KA0040010.KA0040011form2.p_UNIT_COST_TYP.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form2.p_UNIT_COST_TYP.executePScriptOnLoad = function () {
  console.log('execute KA0040011form2/p_UNIT_COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form2-p_UNIT_COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-KA0040010-KA0040011form2-p_UNIT_COST_TYP" name='p_UNIT_COST_TYP' class='KA0040010-focus-move' style='width:260px;'><%  for(int i = 0, size = aKA0040010Control.getStruct().getList_p_UNIT_COST_TYP_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aKA0040010Control.getStruct().getList_p_UNIT_COST_TYP_name().get(i));    String val = TypeConverter.sanitizer((String)aKA0040010Control.getStruct().getList_p_UNIT_COST_TYP_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aKA0040010Struct.getp_UNIT_COST_TYP()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.UNIT_COST",rb)%></span><!-- 単価 --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form2-p_UNIT_COST">
expj.KA0040010.KA0040011form2.p_UNIT_COST = {};
expj.KA0040010.KA0040011form2.p_UNIT_COST.executeAllOnDecision = function () {
  console.log('execute KA0040011form2/p_UNIT_COST.onDecision');
  expj.KA0040010.KA0040011form2.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form2.p_UNIT_COST.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form2-p_UNIT_COST').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form2', 'p_UNIT_COST', this);
  });
  expj.KA0040010.KA0040011form2.p_UNIT_COST.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form2.p_UNIT_COST.executePScriptOnLoad = function () {
  console.log('execute KA0040011form2/p_UNIT_COST.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form2-p_UNIT_COST');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form2-p_UNIT_COST" name="p_UNIT_COST" class="KA0040010-focus-move expj-align-right required-value expj-KA0040010-required-Z" style="width:150px;" data-kind="<%= costColKind %>" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getp_UNIT_COST()) %>" maxlength="2147483647" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt3165",rb)%></span><!-- 承認備考 --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011form2-p_APPR_REMARKS">
expj.KA0040010.KA0040011form2.p_APPR_REMARKS = {};
expj.KA0040010.KA0040011form2.p_APPR_REMARKS.executeAllOnDecision = function () {
  console.log('execute KA0040011form2/p_APPR_REMARKS.onDecision');
  expj.KA0040010.KA0040011form2.executeAllOnDecision();
  expj.KA0040010.executeAllOnDecision();
};
expj.KA0040010.KA0040011form2.p_APPR_REMARKS.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011form2-p_APPR_REMARKS').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KA0040010', 'KA0040011form2', 'p_APPR_REMARKS', this);
  });
  expj.KA0040010.KA0040011form2.p_APPR_REMARKS.executePScriptOnLoad();
};

expj.KA0040010.KA0040011form2.p_APPR_REMARKS.executePScriptOnLoad = function () {
  console.log('execute KA0040011form2/p_APPR_REMARKS.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011form2-p_APPR_REMARKS');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:712px;text-align:left;"><input type="text" id="expj-KA0040010-KA0040011form2-p_APPR_REMARKS" name="p_APPR_REMARKS" class="KA0040010-focus-move  " style="width:712px;" data-kind="" value="<%= TypeConverter.sanitizer(aKA0040010Struct.getp_APPR_REMARKS()) %>" maxlength="80" ></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-KA0040010-KA0040011button1">
expj.KA0040010.KA0040011button1 = {};
expj.KA0040010.KA0040011button1.executeAllOnDecision = function () {
  console.log('execute KA0040011button1.onDecision');
};
expj.KA0040010.KA0040011button1.executeOnLoad = function () {
  expj.KA0040010.KA0040011button1.executePScriptOnLoad();
};

expj.KA0040010.KA0040011button1.executePScriptOnLoad = function () {
  console.log('execute KA0040011button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0040010-KA0040011button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0040010-KA0040011button1-sub1Insert">
expj.KA0040010.KA0040011button1.sub1Insert = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KA0040011form1/*,_KA0040011form2/*@KA0040010Servlet,,$ZZ07001"
expj.KA0040010.KA0040011button1.sub1Insert.onClick0 = function () {
  console.log('sub1Insert script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040011button1', '_KA0040011form1/*,_KA0040011form2/*', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.changeBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callConfirm('KA0040010', 'KA0040011button1', 'ZZ07001', okEvent);
};
expj.KA0040010.KA0040011button1.sub1Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040011button1.sub1Insert['onClick' + i])) {
        expj.KA0040010.KA0040011button1.sub1Insert['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040011button1.sub1Insert.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040011button1.sub1Insert.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011button1-sub1Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040011button1', 'sub1Insert', this, 'Button');
    }
  });
  expj.KA0040010.KA0040011button1.sub1Insert.executePScriptOnLoad();
};

expj.KA0040010.KA0040011button1.sub1Insert.executePScriptOnLoad = function () {
  console.log('execute KA0040011button1/sub1Insert.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011button1-sub1Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040011button1-sub1Insert" name="sub1Insert" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-KA0040010-KA0040011button1-sub1Update">
expj.KA0040010.KA0040011button1.sub1Update = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_KA0040011form1/*,_KA0040011form2/*@KA0040010Servlet,,$ZZ07003"
expj.KA0040010.KA0040011button1.sub1Update.onClick0 = function () {
  console.log('sub1Update script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040011button1', '_KA0040011form1/*,_KA0040011form2/*', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.changeBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callConfirm('KA0040010', 'KA0040011button1', 'ZZ07003', okEvent);
};
expj.KA0040010.KA0040011button1.sub1Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040011button1.sub1Update['onClick' + i])) {
        expj.KA0040010.KA0040011button1.sub1Update['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040011button1.sub1Update.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040011button1.sub1Update.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011button1-sub1Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040011button1', 'sub1Update', this, 'Button');
    }
  });
  expj.KA0040010.KA0040011button1.sub1Update.executePScriptOnLoad();
};

expj.KA0040010.KA0040011button1.sub1Update.executePScriptOnLoad = function () {
  console.log('execute KA0040011button1/sub1Update.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011button1-sub1Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040011button1-sub1Update" name="sub1Update" class="KA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<div class="div-td" style="width:calc(100% - 105px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">KA0040011 Revision: 1.6  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-KA0040010-KA0040011button0">
expj.KA0040010.KA0040011button0 = {};
expj.KA0040010.KA0040011button0.executeAllOnDecision = function () {
  console.log('execute KA0040011button0.onDecision');
};
expj.KA0040010.KA0040011button0.executeOnLoad = function () {
  expj.KA0040010.KA0040011button0.executePScriptOnLoad();
};

expj.KA0040010.KA0040011button0.executePScriptOnLoad = function () {
  console.log('execute KA0040011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KA0040010-KA0040011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KA0040010-KA0040011button0-cancelSub1">
expj.KA0040010.KA0040011button0.cancelSub1 = {};
// script1="onClick;0;CHK;_KA0040011form1/h_SCREENMOVE_TYP[eq]@*0,*1"
expj.KA0040010.KA0040011button0.cancelSub1.onClick0 = function () {
  console.log('cancelSub1 script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KA0040010', 'KA0040011button0', '_KA0040011form1/h_SCREENMOVE_TYP'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>@KA0040010Servlet,,$ZZ07013"
expj.KA0040010.KA0040011button0.cancelSub1.child0 = function () {
  console.log('cancelSub1 script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KA0040010', 'KA0040011button0', '', 'KA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KA0040010', response);
expj.common.changeBusinessScreenTab('KA0040010', contents);
};
expj.common.pscript.callConfirm('KA0040010', 'KA0040011button0', 'ZZ07013', okEvent);
};
// script3="child;1;CLOSE"
expj.KA0040010.KA0040011button0.cancelSub1.child1 = function () {
  console.log('cancelSub1 script3');
expj.common.executeBusinessScreenCloseDialog('KA0040010');
};
expj.KA0040010.KA0040011button0.cancelSub1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KA0040010.KA0040011button0.cancelSub1['onClick' + i])) {
        expj.KA0040010.KA0040011button0.cancelSub1['onClick' + i]();
      }
    }
  }
};
expj.KA0040010.KA0040011button0.cancelSub1.executeAllOnDecision = function () {
};
expj.KA0040010.KA0040011button0.cancelSub1.executeOnLoad = function () {
  $('#expj-KA0040010-KA0040011button0-cancelSub1').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KA0040010', 'KA0040011button0', 'cancelSub1', this, 'Button');
    }
  });
  expj.KA0040010.KA0040011button0.cancelSub1.executePScriptOnLoad();
};

expj.KA0040010.KA0040011button0.cancelSub1.executePScriptOnLoad = function () {
  console.log('execute KA0040011button0/cancelSub1.onLoad');
  var targetComponent = document.getElementById('expj-KA0040010-KA0040011button0-cancelSub1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KA0040010-KA0040011button0-cancelSub1" name="cancelSub1" class="KA0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KA0040010 (END)-->
<%
MessageStruct msgStruct = aKA0040010Control.getMessage();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KA0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KA0040010)) {
  expj.common.treeInstanceMap.KA0040010 = {};
}
expj.common.treeInstanceMap.KA0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KA0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KA0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KA0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KA0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KA0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KA0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010)) {
  expj.common.detailDialogMap.KA0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KA0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.KA0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KA0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KA0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KA0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KA0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KA0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KA0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KA0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KA0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KA0040010)) {
  expj.common.viewInstanceMap.KA0040010 = {};
}
expj.common.viewInstanceMap.KA0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.KA0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KA0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KA0040010.<%=viewId %>.init = function () {
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
    expj.KA0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KA0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KA0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KA0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KA0040010_init">
/**
 * KA0040010用のロード完了時初期化関数
 */
expj.KA0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KA0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KA0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KA0040010');
  expj.common.calendarInstanceMap.KA0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KA0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KA0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KA0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KA0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KA0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KA0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KA0040010-<%=detailId %>');
<%
 }
%>
  try{expj.KA0040010.KA0040011form1.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.h_SCREENMOVE_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.h_APPR_ID.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.CUST_CD.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.CUST_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.h_APR_UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.CUR_CD.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.CUR_NAME.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.w_MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form2.p_EFF_PHASE_IN_DATE.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form2.CalendarEffPhaseInDate.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form2.p_UNIT_COST_TYP.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form2.p_UNIT_COST.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form2.p_APPR_REMARKS.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011button1.sub1Insert.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011button1.sub1Update.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011button0.cancelSub1.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form1.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011form2.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011button1.executeOnLoad();}catch(e){};
  try{expj.KA0040010.KA0040011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KA0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KA0040010', 'KA0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KA0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KA0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.KA0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KA0040010', '<%=request.getContextPath() %>');
};

/**
 * KA0040010の全体onDecision処理
 */
expj.KA0040010.executeAllOnDecision = function () {
  expj.KA0040010.KA0040011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KA0040010_console">
expj.KA0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>