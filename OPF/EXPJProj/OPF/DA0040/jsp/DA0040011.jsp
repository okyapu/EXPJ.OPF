<%-- ***
This file is generated
 GeneratedDate  : Fri Feb 17 14:35:56 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\DA0040\DA0040011.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.DA0040.*" %>
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
<jsp:useBean id="aDA0040010Control" class="com.nec.jp.orteus.metamorBase.DA0040.DA0040010Control" scope="request"/>
<jsp:useBean id="aDA0040010Struct" class="com.nec.jp.orteus.metamorBase.DA0040.DA0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

品目別加工費マスタメンテナンスサブ１
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0040/jsp/DA0040011.jsp,v $
$Author: geng-jia $
$Revision: 1.11 $ $Date: 2017/02/22 02:06:39 $
********************************************************* --%>
<html>
<head>
<title>品目別加工費マスタメンテナンスサブ１</title>
<%@include file="common/expj_v5.jsp" %>
<%
String callButton = aDA0040010Control.getButton();
%>

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
<script class="expj-script-DA0040010_init">
  // DA0040010名前空間
  expj.DA0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
<div id="expj-business-screen-DA0040010" data-screen="DA0040011" data-newdata="<%=aDA0040010Control.isNewData() %>">
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
            <script class="expj-script-DA0040010-DA0040011form1">
expj.DA0040010.DA0040011form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.DA0040010.DA0040011form1.onLoad0 = function () {
  console.log('DA0040011form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*0,*3"
expj.DA0040010.DA0040011form1.onDecision0 = function () {
  console.log('DA0040011form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('DA0040010', 'A')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script3="child;0;CHK;?DA0040011form1/*[neq]ERROR@*1,*3"
expj.DA0040010.DA0040011form1.child0 = function () {
  console.log('DA0040011form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form1', '?DA0040011form1/*'), '[neq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script4="child;1;CHK;<%=callButton%>[eq]LineInsert[or]<%=callButton%>[eq]LineCopy[or]<%=callButton%>[eq]Insert@*2,*3"
expj.DA0040010.DA0040011form1.child1 = function () {
  console.log('DA0040011form1 script4');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Insert')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;2;UNMASK;_DA0040011button2/Insert"
expj.DA0040010.DA0040011form1.child2 = function () {
  console.log('DA0040011form1 script5');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011button2/Insert');
};
// script6="child;3;MASK;_DA0040011button2/Insert"
expj.DA0040010.DA0040011form1.child3 = function () {
  console.log('DA0040011form1 script6');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011button2/Insert');
};
// script7="onDecision;1;CHK;?DA0040011form1/*[neq]ERROR@*4,*6"
expj.DA0040010.DA0040011form1.onDecision1 = function () {
  console.log('DA0040011form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form1', '?DA0040011form1/*'), '[neq]', 'ERROR')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;4;CHK;<%=callButton%>[eq]LineUpdate[or]<%=callButton%>[eq]Update@*5,*6"
expj.DA0040010.DA0040011form1.child4 = function () {
  console.log('DA0040011form1 script8');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineUpdate') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Update')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
} else {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script9="child;5;UNMASK;_DA0040011button2/Update"
expj.DA0040010.DA0040011form1.child5 = function () {
  console.log('DA0040011form1 script9');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011button2/Update');
};
// script10="child;6;MASK;_DA0040011button2/Update"
expj.DA0040010.DA0040011form1.child6 = function () {
  console.log('DA0040011form1 script10');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011button2/Update');
};
// script11="onDecision;2;CHK;<%=callButton%>[eq]LineInsert[or]<%=callButton%>[eq]LineCopy[or]<%=callButton%>[eq]Insert@*7,*8"
expj.DA0040010.DA0040011form1.onDecision2 = function () {
  console.log('DA0040011form1 script11');
if (expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineInsert') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'LineCopy') || expj.common.pscript.evaluate('<%=callButton%>', '[eq]', 'Insert')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script12="child;7;UNMASK;_DA0040011form2/ITEM_CD,_DA0040011form2/PeekerItemCd,_DA0040011form2/PROC_COST_CLS_CD,_DA0040011form2/PeekerProcCostClsCd"
expj.DA0040010.DA0040011form1.child7 = function () {
  console.log('DA0040011form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/ITEM_CD');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/PeekerItemCd');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/PROC_COST_CLS_CD');
expj.common.pscript.setUnMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/PeekerProcCostClsCd');
};
// script13="child;8;MASK;_DA0040011form2/ITEM_CD,_DA0040011form2/PeekerItemCd,_DA0040011form2/PROC_COST_CLS_CD,_DA0040011form2/PeekerProcCostClsCd"
expj.DA0040010.DA0040011form1.child8 = function () {
  console.log('DA0040011form1 script13');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/ITEM_CD');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/PeekerItemCd');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/PROC_COST_CLS_CD');
expj.common.pscript.setMaskToReferenceComponent('DA0040010', 'DA0040011form1', '_DA0040011form2/PeekerProcCostClsCd');
};
expj.DA0040010.DA0040011form1.executeAllOnDecision = function () {
  console.log('execute DA0040011form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040011form1['onDecision' + i])) {
        expj.DA0040010.DA0040011form1['onDecision' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040011form1.executeOnLoad = function () {
  expj.DA0040010.DA0040011form1.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.DA0040010.DA0040011form1['onLoad' + i])) {
      expj.DA0040010.DA0040011form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0040010-DA0040011form1" action="DA0040010Servlet" name="DA0040011form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="<%= TypeConverter.sanitizer(aDA0040010Control.getReadStatusString()) %>" style="height:96px;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:96px;">
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
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PLANT_CD",rb)%></span><!-- 工場コード --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form1-PLANT_CD">
expj.DA0040010.DA0040011form1.PLANT_CD = {};
expj.DA0040010.DA0040011form1.PLANT_CD.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/PLANT_CD.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.PLANT_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'PLANT_CD', this);
  });
  expj.DA0040010.DA0040011form1.PLANT_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form1-PLANT_CD" name="PLANT_CD" class="DA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPLANT_CD()) %>" maxlength="2" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form1-PLANT_NAME">
expj.DA0040010.DA0040011form1.PLANT_NAME = {};
expj.DA0040010.DA0040011form1.PLANT_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/PLANT_NAME.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.PLANT_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-PLANT_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'PLANT_NAME', this);
  });
  expj.DA0040010.DA0040011form1.PLANT_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.PLANT_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/PLANT_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-PLANT_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form1-PLANT_NAME" name="PLANT_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPLANT_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.YEAR",rb)%></span><!-- 年度 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form1-YEAR">
expj.DA0040010.DA0040011form1.YEAR = {};
expj.DA0040010.DA0040011form1.YEAR.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/YEAR.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.YEAR.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-YEAR').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'YEAR', this);
  });
  expj.DA0040010.DA0040011form1.YEAR.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.YEAR.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/YEAR.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-YEAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form1-YEAR" name="YEAR" class="DA0040010-focus-move expj-align-right " style="width:150px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getYEAR()) %>" maxlength="4" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.HALF_TERM_TYP",rb)%></span><!-- 半期区分 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form1-HALF_TERM_TYP_DN">
expj.DA0040010.DA0040011form1.HALF_TERM_TYP_DN = {};
expj.DA0040010.DA0040011form1.HALF_TERM_TYP_DN.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/HALF_TERM_TYP_DN.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.HALF_TERM_TYP_DN.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-HALF_TERM_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'HALF_TERM_TYP_DN', this);
  });
  expj.DA0040010.DA0040011form1.HALF_TERM_TYP_DN.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.HALF_TERM_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/HALF_TERM_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-HALF_TERM_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form1-HALF_TERM_TYP_DN" name="HALF_TERM_TYP_DN" class="DA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getHALF_TERM_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-DA0040010-DA0040011form1-HALF_TERM_TYP" name="HALF_TERM_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getHALF_TERM_TYP()) %>">
<script class="expj-script-DA0040010-DA0040011form1-HALF_TERM_TYP">
expj.DA0040010.DA0040011form1.HALF_TERM_TYP = {};
expj.DA0040010.DA0040011form1.HALF_TERM_TYP.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/HALF_TERM_TYP.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.HALF_TERM_TYP.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-HALF_TERM_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'HALF_TERM_TYP', this);
  });
  expj.DA0040010.DA0040011form1.HALF_TERM_TYP.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.HALF_TERM_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/HALF_TERM_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-HALF_TERM_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.COST_TYP",rb)%></span><!-- 原価種別 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form1-COST_TYP_DN">
expj.DA0040010.DA0040011form1.COST_TYP_DN = {};
expj.DA0040010.DA0040011form1.COST_TYP_DN.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/COST_TYP_DN.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.COST_TYP_DN.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-COST_TYP_DN').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'COST_TYP_DN', this);
  });
  expj.DA0040010.DA0040011form1.COST_TYP_DN.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.COST_TYP_DN.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/COST_TYP_DN.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-COST_TYP_DN');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form1-COST_TYP_DN" name="COST_TYP_DN" class="DA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCOST_TYP_DN()) %>" maxlength="2147483647" disabled></div><!--/td-->
<input type="hidden" id="expj-DA0040010-DA0040011form1-COST_TYP" name="COST_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCOST_TYP()) %>">
<script class="expj-script-DA0040010-DA0040011form1-COST_TYP">
expj.DA0040010.DA0040011form1.COST_TYP = {};
expj.DA0040010.DA0040011form1.COST_TYP.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/COST_TYP.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.COST_TYP.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-COST_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'COST_TYP', this);
  });
  expj.DA0040010.DA0040011form1.COST_TYP.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.COST_TYP.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/COST_TYP.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-COST_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CS_PROC_CD",rb)%></span><!-- 工程コード --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form1-CS_PROC_CD">
expj.DA0040010.DA0040011form1.CS_PROC_CD = {};
expj.DA0040010.DA0040011form1.CS_PROC_CD.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/CS_PROC_CD.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.CS_PROC_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-CS_PROC_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'CS_PROC_CD', this);
  });
  expj.DA0040010.DA0040011form1.CS_PROC_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.CS_PROC_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/CS_PROC_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-CS_PROC_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form1-CS_PROC_CD" name="CS_PROC_CD" class="DA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCS_PROC_CD()) %>" maxlength="25" disabled></div><!--/td-->
<input type="hidden" id="expj-DA0040010-DA0040011form1-IN_ITEM_CD" name="IN_ITEM_CD" class="" data-kind="" maxlength="25" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getIN_ITEM_CD()) %>">
<script class="expj-script-DA0040010-DA0040011form1-IN_ITEM_CD">
expj.DA0040010.DA0040011form1.IN_ITEM_CD = {};
expj.DA0040010.DA0040011form1.IN_ITEM_CD.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/IN_ITEM_CD.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.IN_ITEM_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-IN_ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'IN_ITEM_CD', this);
  });
  expj.DA0040010.DA0040011form1.IN_ITEM_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.IN_ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/IN_ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-IN_ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form1-CS_PROC_NAME">
expj.DA0040010.DA0040011form1.CS_PROC_NAME = {};
expj.DA0040010.DA0040011form1.CS_PROC_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form1/CS_PROC_NAME.onDecision');
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form1.CS_PROC_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form1-CS_PROC_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form1', 'CS_PROC_NAME', this);
  });
  expj.DA0040010.DA0040011form1.CS_PROC_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form1.CS_PROC_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form1/CS_PROC_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form1-CS_PROC_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form1-CS_PROC_NAME" name="CS_PROC_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCS_PROC_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
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
<div class="expj-tr expjDynamicHeight" style=""><div class="expj-td" style="width:5px;"></div><!--/td-->
<div class="expj-td" style="width:calc(100% - 10px);height:100%;"><div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2--><div class="expj-tr" style="width:100%;height:0px;display:none;">
<div class="expj-td frame01"></div><!--/td-->
<div class="expj-td frame02"></div><!--/td-->
<div class="expj-td frame03"></div><!--/td-->
</div><!--/tr-->
<div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
<div class="expj-td frame04" style="width:12px;"></div><!--/td-->
<div class="expj-td frame05" style="height:100%;"><script class="expj-script-DA0040010-DA0040011form2">
expj.DA0040010.DA0040011form2 = {};
expj.DA0040010.DA0040011form2.executeAllOnDecision = function () {
  console.log('execute DA0040011form2.onDecision');
};
expj.DA0040010.DA0040011form2.executeOnLoad = function () {
  expj.DA0040010.DA0040011form2.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-DA0040010-DA0040011form2" action="DA0040010Servlet" name="DA0040011form2" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
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
<div class="div-td" style="align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.ITEM_CD",rb)%></span><!-- 品目番号 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-ITEM_CD">
expj.DA0040010.DA0040011form2.ITEM_CD = {};
expj.DA0040010.DA0040011form2.ITEM_CD.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/ITEM_CD.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.ITEM_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-ITEM_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'ITEM_CD', this);
  });
  expj.DA0040010.DA0040011form2.ITEM_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.ITEM_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/ITEM_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-ITEM_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-ITEM_CD" name="ITEM_CD" class="DA0040010-focus-move  required-value expj-DA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getITEM_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PeekerItemCd">
expj.DA0040010.DA0040011form2.PeekerItemCd = {};
// script1="onClick;0;PEEKER;_DA0040011form2/ITEM_CD:_DA0040011form2/ITEM_NAME:_DA0040011form2/CLASIFICATION_CD@<%=contextNo%>"
expj.DA0040010.DA0040011form2.PeekerItemCd.onClick0 = function () {
  console.log('PeekerItemCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0040010';
var parameterValues = 'PeekerItemCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form2', '_ITEM_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%ITEM_CD_D03%&%';
parameterValues += 'TARGET_FIELD%=%_DA0040011form2/ITEM_CD:_DA0040011form2/ITEM_NAME:_DA0040011form2/CLASIFICATION_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0040010.DA0040011form2.PeekerItemCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040011form2.PeekerItemCd['onClick' + i])) {
        expj.DA0040010.DA0040011form2.PeekerItemCd['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040011form2.PeekerItemCd.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040011form2.PeekerItemCd.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PeekerItemCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040011form2', 'PeekerItemCd', this, 'Button');
    }
  });
  expj.DA0040010.DA0040011form2.PeekerItemCd.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PeekerItemCd.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PeekerItemCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PeekerItemCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0040010-DA0040011form2-PeekerItemCd" class="DA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-ITEM_NAME">
expj.DA0040010.DA0040011form2.ITEM_NAME = {};
expj.DA0040010.DA0040011form2.ITEM_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/ITEM_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.ITEM_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-ITEM_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'ITEM_NAME', this);
  });
  expj.DA0040010.DA0040011form2.ITEM_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.ITEM_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/ITEM_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-ITEM_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-ITEM_NAME" name="ITEM_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getITEM_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.CLASIFICATION_CD_1",rb)%></span><!-- 品目管理コード --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-CLASIFICATION_CD">
expj.DA0040010.DA0040011form2.CLASIFICATION_CD = {};
expj.DA0040010.DA0040011form2.CLASIFICATION_CD.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/CLASIFICATION_CD.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.CLASIFICATION_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-CLASIFICATION_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'CLASIFICATION_CD', this);
  });
  expj.DA0040010.DA0040011form2.CLASIFICATION_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.CLASIFICATION_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/CLASIFICATION_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-CLASIFICATION_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-CLASIFICATION_CD" name="CLASIFICATION_CD" class="DA0040010-focus-move  " style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getCLASIFICATION_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-c_NoCheckClasificationCd">
expj.DA0040010.DA0040011form2.c_NoCheckClasificationCd = {};
expj.DA0040010.DA0040011form2.c_NoCheckClasificationCd.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/c_NoCheckClasificationCd.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.c_NoCheckClasificationCd.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-c_NoCheckClasificationCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040011form2', 'c_NoCheckClasificationCd', this, 'CheckBox');
    }
  });
  expj.DA0040010.DA0040011form2.c_NoCheckClasificationCd.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.c_NoCheckClasificationCd.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/c_NoCheckClasificationCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-c_NoCheckClasificationCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_NoCheckClasificationCd" value="true" <%= ("true".equals(TypeConverter.convert(aDA0040010Struct.getc_NoCheckClasificationCd())) || "1".equals(TypeConverter.convert(aDA0040010Struct.getc_NoCheckClasificationCd())))?"checked=\"checked\"":"" %>  class="DA0040010-focus-move" id="expj-DA0040010-DA0040011form2-c_NoCheckClasificationCd"><label for="expj-DA0040010-DA0040011form2-c_NoCheckClasificationCd"><%=CoreTools.getRBString("Expj.Cmt0253",rb)%></label></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.ONEROUS_CONS_FLG",rb)%></span><!-- 有償支給品フラグ --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-ONEROUS_CONS_FLG">
expj.DA0040010.DA0040011form2.ONEROUS_CONS_FLG = {};
expj.DA0040010.DA0040011form2.ONEROUS_CONS_FLG.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/ONEROUS_CONS_FLG.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.ONEROUS_CONS_FLG.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-ONEROUS_CONS_FLG').change(function () {
    expj.common.pscript.executeComboBoxOnDecisionEvent('DA0040010', 'DA0040011form2', 'ONEROUS_CONS_FLG', this);
  });
  expj.DA0040010.DA0040011form2.ONEROUS_CONS_FLG.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.ONEROUS_CONS_FLG.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/ONEROUS_CONS_FLG.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-ONEROUS_CONS_FLG');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><select id="expj-DA0040010-DA0040011form2-ONEROUS_CONS_FLG" name='ONEROUS_CONS_FLG' class='DA0040010-focus-move' style='width:260px;'><%  for(int i = 0, size = aDA0040010Control.getStruct().getList_ONEROUS_CONS_FLG_name().size(); i < size; ++i ) {    String name = TypeConverter.sanitizer((String)aDA0040010Control.getStruct().getList_ONEROUS_CONS_FLG_name().get(i));    String val = TypeConverter.sanitizer((String)aDA0040010Control.getStruct().getList_ONEROUS_CONS_FLG_val().get(i));    String selected =  (val!=null && val.equals(TypeConverter.convert(aDA0040010Struct.getONEROUS_CONS_FLG()))) ? " selected" : "";%> <option value="<%= val %>"<%= selected %>><%= name %></option><%  }%></select></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name required-name"><%=CoreTools.getRBString("Expj.PROC_COST_CLS_CD",rb)%></span><!-- 加工費分類コード --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_CLS_CD">
expj.DA0040010.DA0040011form2.PROC_COST_CLS_CD = {};
expj.DA0040010.DA0040011form2.PROC_COST_CLS_CD.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_CLS_CD.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_CLS_CD.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_CLS_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_CLS_CD', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_CLS_CD.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_CLS_CD.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_CLS_CD.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_CLS_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_CLS_CD" name="PROC_COST_CLS_CD" class="DA0040010-focus-move  required-value expj-DA0040010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_CLS_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PeekerProcCostClsCd">
expj.DA0040010.DA0040011form2.PeekerProcCostClsCd = {};
// script1="onClick;0;PEEKER;_DA0040011form2/PROC_COST_CLS_CD:_DA0040011form2/PROC_COST_CLS_NAME:_DA0040011form2/PROC_COST_UNIT_QTY:_DA0040011form2/STOCK_UNIT:_DA0040011form2/PROC_COST_01:_DA0040011form2/PROC_COST_02:_DA0040011form2/PROC_COST_03:_DA0040011form2/PROC_COST_04:_DA0040011form2/PROC_COST_05:_DA0040011form2/PROC_COST_06:_DA0040011form2/PROC_COST_07:_DA0040011form2/PROC_COST_08:_DA0040011form2/PROC_COST_09:_DA0040011form2/PROC_COST_10:_DA0040011form2/PROC_COST_11:_DA0040011form2/PROC_COST_12:_DA0040011form2/PROC_COST_SUM:_DA0040011form2/PROC_COST_01_NAME:_DA0040011form2/PROC_COST_02_NAME:_DA0040011form2/PROC_COST_03_NAME:_DA0040011form2/PROC_COST_04_NAME:_DA0040011form2/PROC_COST_05_NAME:_DA0040011form2/PROC_COST_06_NAME:_DA0040011form2/PROC_COST_07_NAME:_DA0040011form2/PROC_COST_08_NAME:_DA0040011form2/PROC_COST_09_NAME:_DA0040011form2/PROC_COST_10_NAME:_DA0040011form2/PROC_COST_11_NAME:_DA0040011form2/PROC_COST_12_NAME@<%=contextNo%>"
expj.DA0040010.DA0040011form2.PeekerProcCostClsCd.onClick0 = function () {
  console.log('PeekerProcCostClsCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'DA0040010';
var parameterValues = 'PeekerProcCostClsCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form2', '_DA0040011form1/PLANT_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form2', '_DA0040011form1/YEAR') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_3%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form2', '_DA0040011form1/HALF_TERM_TYP') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_4%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form2', '_DA0040011form1/COST_TYP') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_5%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form2', '_DA0040011form1/CS_PROC_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLPARAM_6%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011form2', '_PROC_COST_CLS_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PROC_COST_CLS_CD_D03%&%';
parameterValues += 'TARGET_FIELD%=%_DA0040011form2/PROC_COST_CLS_CD:_DA0040011form2/PROC_COST_CLS_NAME:_DA0040011form2/PROC_COST_UNIT_QTY:_DA0040011form2/STOCK_UNIT:_DA0040011form2/PROC_COST_01:_DA0040011form2/PROC_COST_02:_DA0040011form2/PROC_COST_03:_DA0040011form2/PROC_COST_04:_DA0040011form2/PROC_COST_05:_DA0040011form2/PROC_COST_06:_DA0040011form2/PROC_COST_07:_DA0040011form2/PROC_COST_08:_DA0040011form2/PROC_COST_09:_DA0040011form2/PROC_COST_10:_DA0040011form2/PROC_COST_11:_DA0040011form2/PROC_COST_12:_DA0040011form2/PROC_COST_SUM:_DA0040011form2/PROC_COST_01_NAME:_DA0040011form2/PROC_COST_02_NAME:_DA0040011form2/PROC_COST_03_NAME:_DA0040011form2/PROC_COST_04_NAME:_DA0040011form2/PROC_COST_05_NAME:_DA0040011form2/PROC_COST_06_NAME:_DA0040011form2/PROC_COST_07_NAME:_DA0040011form2/PROC_COST_08_NAME:_DA0040011form2/PROC_COST_09_NAME:_DA0040011form2/PROC_COST_10_NAME:_DA0040011form2/PROC_COST_11_NAME:_DA0040011form2/PROC_COST_12_NAME%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%DA0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.DA0040010.DA0040011form2.PeekerProcCostClsCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040011form2.PeekerProcCostClsCd['onClick' + i])) {
        expj.DA0040010.DA0040011form2.PeekerProcCostClsCd['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040011form2.PeekerProcCostClsCd.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040011form2.PeekerProcCostClsCd.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PeekerProcCostClsCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040011form2', 'PeekerProcCostClsCd', this, 'Button');
    }
  });
  expj.DA0040010.DA0040011form2.PeekerProcCostClsCd.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PeekerProcCostClsCd.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PeekerProcCostClsCd.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PeekerProcCostClsCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-DA0040010-DA0040011form2-PeekerProcCostClsCd" class="DA0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_CLS_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_CLS_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_CLS_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_CLS_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_CLS_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_CLS_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_CLS_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_CLS_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_CLS_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_CLS_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_CLS_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_CLS_NAME" name="PROC_COST_CLS_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_CLS_NAME()) %>" maxlength="40" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_UNIT_QTY",rb)%></span><!-- 加工費単位数 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_UNIT_QTY">
expj.DA0040010.DA0040011form2.PROC_COST_UNIT_QTY = {};
expj.DA0040010.DA0040011form2.PROC_COST_UNIT_QTY.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_UNIT_QTY.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_UNIT_QTY.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_UNIT_QTY').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_UNIT_QTY', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_UNIT_QTY.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_UNIT_QTY.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_UNIT_QTY.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_UNIT_QTY');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_UNIT_QTY" name="PROC_COST_UNIT_QTY" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_P;14.1;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_UNIT_QTY()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-STOCK_UNIT">
expj.DA0040010.DA0040011form2.STOCK_UNIT = {};
expj.DA0040010.DA0040011form2.STOCK_UNIT.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/STOCK_UNIT.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.STOCK_UNIT.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-STOCK_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'STOCK_UNIT', this);
  });
  expj.DA0040010.DA0040011form2.STOCK_UNIT.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.STOCK_UNIT.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/STOCK_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-STOCK_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-STOCK_UNIT" name="STOCK_UNIT" class="DA0040010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getSTOCK_UNIT()) %>" maxlength="12" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_01",rb)%></span><!-- 加工費01 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_01">
expj.DA0040010.DA0040011form2.PROC_COST_01 = {};
expj.DA0040010.DA0040011form2.PROC_COST_01.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_01.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_01.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_01').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_01', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_01.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_01.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_01.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_01');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_01" name="PROC_COST_01" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_01()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_01_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_01_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_01_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_01_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_01_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_01_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_01_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_01_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_01_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_01_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_01_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_01_NAME" name="PROC_COST_01_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_01_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_02",rb)%></span><!-- 加工費02 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_02">
expj.DA0040010.DA0040011form2.PROC_COST_02 = {};
expj.DA0040010.DA0040011form2.PROC_COST_02.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_02.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_02.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_02').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_02', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_02.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_02.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_02.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_02');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_02" name="PROC_COST_02" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_02()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_02_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_02_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_02_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_02_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_02_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_02_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_02_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_02_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_02_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_02_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_02_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_02_NAME" name="PROC_COST_02_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_02_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_03",rb)%></span><!-- 加工費03 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_03">
expj.DA0040010.DA0040011form2.PROC_COST_03 = {};
expj.DA0040010.DA0040011form2.PROC_COST_03.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_03.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_03.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_03').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_03', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_03.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_03.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_03.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_03');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_03" name="PROC_COST_03" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_03()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_03_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_03_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_03_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_03_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_03_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_03_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_03_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_03_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_03_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_03_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_03_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_03_NAME" name="PROC_COST_03_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_03_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_04",rb)%></span><!-- 加工費04 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_04">
expj.DA0040010.DA0040011form2.PROC_COST_04 = {};
expj.DA0040010.DA0040011form2.PROC_COST_04.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_04.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_04.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_04').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_04', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_04.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_04.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_04.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_04');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_04" name="PROC_COST_04" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_04()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_04_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_04_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_04_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_04_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_04_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_04_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_04_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_04_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_04_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_04_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_04_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_04_NAME" name="PROC_COST_04_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_04_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_05",rb)%></span><!-- 加工費05 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_05">
expj.DA0040010.DA0040011form2.PROC_COST_05 = {};
expj.DA0040010.DA0040011form2.PROC_COST_05.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_05.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_05.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_05').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_05', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_05.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_05.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_05.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_05');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_05" name="PROC_COST_05" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_05()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_05_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_05_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_05_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_05_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_05_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_05_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_05_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_05_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_05_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_05_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_05_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_05_NAME" name="PROC_COST_05_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_05_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_06",rb)%></span><!-- 加工費06 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_06">
expj.DA0040010.DA0040011form2.PROC_COST_06 = {};
expj.DA0040010.DA0040011form2.PROC_COST_06.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_06.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_06.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_06').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_06', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_06.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_06.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_06.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_06');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_06" name="PROC_COST_06" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_06()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_06_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_06_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_06_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_06_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_06_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_06_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_06_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_06_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_06_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_06_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_06_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_06_NAME" name="PROC_COST_06_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_06_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_07",rb)%></span><!-- 加工費07 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_07">
expj.DA0040010.DA0040011form2.PROC_COST_07 = {};
expj.DA0040010.DA0040011form2.PROC_COST_07.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_07.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_07.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_07').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_07', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_07.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_07.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_07.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_07');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_07" name="PROC_COST_07" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_07()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_07_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_07_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_07_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_07_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_07_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_07_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_07_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_07_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_07_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_07_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_07_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_07_NAME" name="PROC_COST_07_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_07_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_08",rb)%></span><!-- 加工費08 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_08">
expj.DA0040010.DA0040011form2.PROC_COST_08 = {};
expj.DA0040010.DA0040011form2.PROC_COST_08.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_08.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_08.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_08').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_08', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_08.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_08.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_08.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_08');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_08" name="PROC_COST_08" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_08()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_08_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_08_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_08_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_08_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_08_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_08_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_08_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_08_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_08_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_08_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_08_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_08_NAME" name="PROC_COST_08_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_08_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_09",rb)%></span><!-- 加工費09 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_09">
expj.DA0040010.DA0040011form2.PROC_COST_09 = {};
expj.DA0040010.DA0040011form2.PROC_COST_09.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_09.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_09.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_09').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_09', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_09.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_09.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_09.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_09');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_09" name="PROC_COST_09" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_09()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_09_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_09_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_09_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_09_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_09_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_09_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_09_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_09_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_09_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_09_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_09_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_09_NAME" name="PROC_COST_09_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_09_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_10",rb)%></span><!-- 加工費10 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_10">
expj.DA0040010.DA0040011form2.PROC_COST_10 = {};
expj.DA0040010.DA0040011form2.PROC_COST_10.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_10.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_10.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_10').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_10', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_10.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_10.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_10.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_10');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_10" name="PROC_COST_10" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_10()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_10_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_10_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_10_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_10_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_10_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_10_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_10_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_10_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_10_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_10_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_10_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_10_NAME" name="PROC_COST_10_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_10_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_11",rb)%></span><!-- 加工費11 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_11">
expj.DA0040010.DA0040011form2.PROC_COST_11 = {};
expj.DA0040010.DA0040011form2.PROC_COST_11.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_11.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_11.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_11').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_11', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_11.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_11.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_11.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_11');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_11" name="PROC_COST_11" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_11()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_11_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_11_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_11_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_11_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_11_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_11_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_11_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_11_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_11_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_11_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_11_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_11_NAME" name="PROC_COST_11_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_11_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_12",rb)%></span><!-- 加工費12 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_12">
expj.DA0040010.DA0040011form2.PROC_COST_12 = {};
expj.DA0040010.DA0040011form2.PROC_COST_12.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_12.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_12.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_12').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_12', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_12.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_12.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_12.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_12');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_12" name="PROC_COST_12" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_12()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_12_NAME">
expj.DA0040010.DA0040011form2.PROC_COST_12_NAME = {};
expj.DA0040010.DA0040011form2.PROC_COST_12_NAME.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_12_NAME.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_12_NAME.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_12_NAME').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_12_NAME', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_12_NAME.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_12_NAME.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_12_NAME.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_12_NAME');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:320px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_12_NAME" name="PROC_COST_12_NAME" class="DA0040010-focus-move  " style="width:320px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_12_NAME()) %>" maxlength="2147483647" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:0px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.PROC_COST_SUM",rb)%></span><!-- 加工費計 --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-PROC_COST_SUM">
expj.DA0040010.DA0040011form2.PROC_COST_SUM = {};
expj.DA0040010.DA0040011form2.PROC_COST_SUM.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/PROC_COST_SUM.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.PROC_COST_SUM.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-PROC_COST_SUM').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'PROC_COST_SUM', this);
  });
  expj.DA0040010.DA0040011form2.PROC_COST_SUM.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.PROC_COST_SUM.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/PROC_COST_SUM.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-PROC_COST_SUM');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-PROC_COST_SUM" name="PROC_COST_SUM" class="DA0040010-focus-move  " style="width:150px;text-align: right;" data-kind="OBT_NUMBER_Z;14.2;FLOOR;4" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getPROC_COST_SUM()) %>" maxlength="2147483647" disabled></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011form2-HOME_CUR_UNIT">
expj.DA0040010.DA0040011form2.HOME_CUR_UNIT = {};
expj.DA0040010.DA0040011form2.HOME_CUR_UNIT.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/HOME_CUR_UNIT.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.HOME_CUR_UNIT.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-HOME_CUR_UNIT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'HOME_CUR_UNIT', this);
  });
  expj.DA0040010.DA0040011form2.HOME_CUR_UNIT.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.HOME_CUR_UNIT.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/HOME_CUR_UNIT.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-HOME_CUR_UNIT');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"><input type="text" id="expj-DA0040010-DA0040011form2-HOME_CUR_UNIT" name="HOME_CUR_UNIT" class="DA0040010-focus-move  " style="width:110px;" data-kind="" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getHOME_CUR_UNIT()) %>" maxlength="12" disabled></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<input type="hidden" id="expj-DA0040010-DA0040011form2-MODIFY_COUNT" name="MODIFY_COUNT" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aDA0040010Struct.getMODIFY_COUNT()) %>">
<script class="expj-script-DA0040010-DA0040011form2-MODIFY_COUNT">
expj.DA0040010.DA0040011form2.MODIFY_COUNT = {};
expj.DA0040010.DA0040011form2.MODIFY_COUNT.executeAllOnDecision = function () {
  console.log('execute DA0040011form2/MODIFY_COUNT.onDecision');
  expj.DA0040010.DA0040011form2.executeAllOnDecision();
  expj.DA0040010.executeAllOnDecision();
};
expj.DA0040010.DA0040011form2.MODIFY_COUNT.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011form2-MODIFY_COUNT').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('DA0040010', 'DA0040011form2', 'MODIFY_COUNT', this);
  });
  expj.DA0040010.DA0040011form2.MODIFY_COUNT.executePScriptOnLoad();
};

expj.DA0040010.DA0040011form2.MODIFY_COUNT.executePScriptOnLoad = function () {
  console.log('execute DA0040011form2/MODIFY_COUNT.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011form2-MODIFY_COUNT');
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
<div class="datagrid-button-field-cell frame08" style="width:calc(100% - 294px);"></div><!--/td-->
<div class="datagrid-button-field-cell frame09 button-area-left" style="width:60px;"></div><!--/td-->
<div class="datagrid-button-field-cell frame10 button-area" style="width:210px;"><script class="expj-script-DA0040010-DA0040011button2">
expj.DA0040010.DA0040011button2 = {};
expj.DA0040010.DA0040011button2.executeAllOnDecision = function () {
  console.log('execute DA0040011button2.onDecision');
};
expj.DA0040010.DA0040011button2.executeOnLoad = function () {
  expj.DA0040010.DA0040011button2.executePScriptOnLoad();
};

expj.DA0040010.DA0040011button2.executePScriptOnLoad = function () {
  console.log('execute DA0040011button2.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0040010-DA0040011button2" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0040010-DA0040011button2-Insert">
expj.DA0040010.DA0040011button2.Insert = {};
// script1="onClick;0;CHK;_DA0040011form2/CLASIFICATION_CD[eq]@$DA04101"
expj.DA0040010.DA0040011button2.Insert.onClick0 = function () {
  console.log('Insert script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011button2', '_DA0040011form2/CLASIFICATION_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0040010', 'DA0040011button2', 'DA04101');
}
};
// script2="onClick;1;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0040011form1/*,_DA0040011form2/*@DA0040010Servlet,,$ZZ07001"
expj.DA0040010.DA0040011button2.Insert.onClick1 = function () {
  console.log('Insert script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040011button2', '_DA0040011form1/*,_DA0040011form2/*', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.changeBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callConfirm('DA0040010', 'DA0040011button2', 'ZZ07001', okEvent);
};
expj.DA0040010.DA0040011button2.Insert.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040011button2.Insert['onClick' + i])) {
        expj.DA0040010.DA0040011button2.Insert['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040011button2.Insert.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040011button2.Insert.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011button2-Insert').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040011button2', 'Insert', this, 'Button');
    }
  });
  expj.DA0040010.DA0040011button2.Insert.executePScriptOnLoad();
};

expj.DA0040010.DA0040011button2.Insert.executePScriptOnLoad = function () {
  console.log('execute DA0040011button2/Insert.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011button2-Insert');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040011button2-Insert" name="Insert" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnInsert",rb)%></button><!-- 登録ボタン --></div><!--/td-->
<script class="expj-script-DA0040010-DA0040011button2-Update">
expj.DA0040010.DA0040011button2.Update = {};
// script1="onClick;0;CHK;_DA0040011form2/CLASIFICATION_CD[eq]@$DA04101"
expj.DA0040010.DA0040011button2.Update.onClick0 = function () {
  console.log('Update script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011button2', '_DA0040011form2/CLASIFICATION_CD'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0040010', 'DA0040011button2', 'DA04101');
}
};
// script2="onClick;1;CHK;?DA0040011form2/ONEROUS_CONS_FLG[eq]@$DA04102"
expj.DA0040010.DA0040011button2.Update.onClick1 = function () {
  console.log('Update script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('DA0040010', 'DA0040011button2', '?DA0040011form2/ONEROUS_CONS_FLG'), '[eq]', '')) {
expj.common.pscript.addWarningMessage('DA0040010', 'DA0040011button2', 'DA04102');
}
};
// script3="onClick;2;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0040011form1/*,_DA0040011form2/*@DA0040010Servlet,,$ZZ07003"
expj.DA0040010.DA0040011button2.Update.onClick2 = function () {
  console.log('Update script3');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040011button2', '_DA0040011form1/*,_DA0040011form2/*', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.changeBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callConfirm('DA0040010', 'DA0040011button2', 'ZZ07003', okEvent);
};
expj.DA0040010.DA0040011button2.Update.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040011button2.Update['onClick' + i])) {
        expj.DA0040010.DA0040011button2.Update['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040011button2.Update.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040011button2.Update.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011button2-Update').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040011button2', 'Update', this, 'Button');
    }
  });
  expj.DA0040010.DA0040011button2.Update.executePScriptOnLoad();
};

expj.DA0040010.DA0040011button2.Update.executePScriptOnLoad = function () {
  console.log('execute DA0040011button2/Update.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011button2-Update');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040011button2-Update" name="Update" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnUpdate",rb)%></button><!-- 更新ボタン --></div><!--/td-->
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
<span class="version">DA0040011 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:105px;">
<script class="expj-script-DA0040010-DA0040011button0">
expj.DA0040010.DA0040011button0 = {};
expj.DA0040010.DA0040011button0.executeAllOnDecision = function () {
  console.log('execute DA0040011button0.onDecision');
};
expj.DA0040010.DA0040011button0.executeOnLoad = function () {
  expj.DA0040010.DA0040011button0.executePScriptOnLoad();
};

expj.DA0040010.DA0040011button0.executePScriptOnLoad = function () {
  console.log('execute DA0040011button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-DA0040010-DA0040011button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-DA0040010-DA0040011button0-Return">
expj.DA0040010.DA0040011button0.Return = {};
// script1="onClick;0;SCRCHG;ORTEUS_HASHED=<%=hashed%>,_DA0040011form1/*@DA0040010Servlet,,$ZZ07013"
expj.DA0040010.DA0040011button0.Return.onClick0 = function () {
  console.log('Return script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('DA0040010', 'DA0040011button0', '_DA0040011form1/*', 'DA0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'DA0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('DA0040010', response);
expj.common.changeBusinessScreenTab('DA0040010', contents);
};
expj.common.pscript.callConfirm('DA0040010', 'DA0040011button0', 'ZZ07013', okEvent);
};
expj.DA0040010.DA0040011button0.Return.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.DA0040010.DA0040011button0.Return['onClick' + i])) {
        expj.DA0040010.DA0040011button0.Return['onClick' + i]();
      }
    }
  }
};
expj.DA0040010.DA0040011button0.Return.executeAllOnDecision = function () {
};
expj.DA0040010.DA0040011button0.Return.executeOnLoad = function () {
  $('#expj-DA0040010-DA0040011button0-Return').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('DA0040010', 'DA0040011button0', 'Return', this, 'Button');
    }
  });
  expj.DA0040010.DA0040011button0.Return.executePScriptOnLoad();
};

expj.DA0040010.DA0040011button0.Return.executePScriptOnLoad = function () {
  console.log('execute DA0040011button0/Return.onLoad');
  var targetComponent = document.getElementById('expj-DA0040010-DA0040011button0-Return');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-DA0040010-DA0040011button0-Return" name="Return" class="DA0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnReturn",rb)%></button><!-- 戻るボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-DA0040010 (END)-->
<%
MessageStruct msgStruct = aDA0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-DA0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.DA0040010)) {
  expj.common.treeInstanceMap.DA0040010 = {};
}
expj.common.treeInstanceMap.DA0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.DA0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.DA0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.DA0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.DA0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-DA0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-DA0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010)) {
  expj.common.detailDialogMap.DA0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.DA0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.DA0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.DA0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.DA0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.DA0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-DA0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-DA0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-DA0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.DA0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-DA0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.DA0040010)) {
  expj.common.viewInstanceMap.DA0040010 = {};
}
expj.common.viewInstanceMap.DA0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.DA0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.DA0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.DA0040010.<%=viewId %>.init = function () {
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
    expj.DA0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.DA0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-DA0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-DA0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-DA0040010_init">
/**
 * DA0040010用のロード完了時初期化関数
 */
expj.DA0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-DA0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('DA0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('DA0040010');
  expj.common.calendarInstanceMap.DA0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.DA0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.DA0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.DA0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-DA0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-DA0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-DA0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-DA0040010-<%=detailId %>');
<%
 }
%>
  try{expj.DA0040010.DA0040011form1.PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.PLANT_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.YEAR.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.HALF_TERM_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.HALF_TERM_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.COST_TYP_DN.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.COST_TYP.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.CS_PROC_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.IN_ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.CS_PROC_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.ITEM_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PeekerItemCd.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.ITEM_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.CLASIFICATION_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.c_NoCheckClasificationCd.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.ONEROUS_CONS_FLG.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_CLS_CD.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PeekerProcCostClsCd.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_CLS_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_UNIT_QTY.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.STOCK_UNIT.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_01.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_01_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_02.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_02_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_03.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_03_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_04.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_04_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_05.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_05_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_06.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_06_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_07.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_07_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_08.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_08_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_09.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_09_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_10.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_10_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_11.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_11_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_12.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_12_NAME.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.PROC_COST_SUM.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.HOME_CUR_UNIT.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.MODIFY_COUNT.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011button2.Insert.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011button2.Update.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011button0.Return.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form1.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011form2.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011button2.executeOnLoad();}catch(e){};
  try{expj.DA0040010.DA0040011button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.DA0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-DA0040010', 'DA0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-DA0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.DA0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.DA0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('DA0040010', '<%=request.getContextPath() %>');
};

/**
 * DA0040010の全体onDecision処理
 */
expj.DA0040010.executeAllOnDecision = function () {
  expj.DA0040010.DA0040011form1.executeAllOnDecision();
};
</script>
<script class="expj-script-DA0040010_console">
expj.DA0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>