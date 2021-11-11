<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:27:28 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\AC0040\AC0040010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.AC0040.*" %>
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
<jsp:useBean id="aAC0040010Control" class="com.nec.jp.orteus.metamorBase.AC0040.AC0040010Control" scope="request"/>
<jsp:useBean id="aAC0040010Struct" class="com.nec.jp.orteus.metamorBase.AC0040.AC0040010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

購入予定表出力指示
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0040/jsp/AC0040010.jsp,v $
$Author: geng-jia $    
$Revision: 1.9 $ $Date: 2017/02/22 02:04:24 $
********************************************************* --%>
<html>
<head>
<title>購入予定表出力指示</title>
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
<script class="expj-script-AC0040010_init">
  // AC0040010名前空間
  expj.AC0040010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>

  <div id="expj-business-screen-AC0040010" data-screen="AC0040010" data-newdata="<%=aAC0040010Control.isNewData() %>">
<div class="expj-table expj-tab-contants back" style="width:100%;height:100%;"><!--TABLE1-->
    <div class="expj-tr" style="height:5px"> 
      <div class="expj-td" style="width:968px;"></div><!--/td-->

    </div><!--/tr-->

    <div class="expj-tr expjDynamicHeight" style=""> 
      <div class="expj-td" style="width:5px;"></div><!--/td-->

      <div class="expj-td" style="width:calc(100% - 10px);height:100%;"> 
        <div class="expj-table data-grid-table" style="width:calc(100% - 12px);height:calc(100% - 12px);"><!--table2-->
          <div class="expj-tr" style="width:100%;height:0px;display:none;">
 
            <div class="expj-td frame01"></div><!--/td-->

            <div class="expj-td frame02"></div><!--/td-->

            <div class="expj-td frame03"></div><!--/td-->

          </div><!--/tr-->

          <div class="expj-tr" style="width:100%;height:calc(100% - 32px);">
 
            <div class="expj-td frame04" style="width:12px;"></div><!--/td-->

            <div class="expj-td frame05" style="height:100%;"> 
              <!-- ここに上段検索条件用のDataGridを配置する。↓ -->
              <script class="expj-script-AC0040010-AC0040010form1">
expj.AC0040010.AC0040010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2"
expj.AC0040010.AC0040010form1.onLoad0 = function () {
  console.log('AC0040010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
};
// script2="onDecision;0;CHKRQ;A@*1,*2"
expj.AC0040010.AC0040010form1.onDecision0 = function () {
  console.log('AC0040010form1 script2');
if (expj.common.pscript.satisfiedRequiredComponent('AC0040010', 'A')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script3="onDecision;1;CHK;_AC0040010form1/IN_c_CHECK3[eq]1@*0"
expj.AC0040010.AC0040010form1.onDecision1 = function () {
  console.log('AC0040010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_c_CHECK3'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script4="onDecision;2;CHK;_AC0040010form1/IN_RadioButton[neq]@*3"
expj.AC0040010.AC0040010form1.onDecision2 = function () {
  console.log('AC0040010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_RadioButton'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="child;0;SET;_AC0040010form1/c_CHECK3=true,_AC0040010form1/IN_c_CHECK3=0"
expj.AC0040010.AC0040010form1.child0 = function () {
  console.log('AC0040010form1 script5');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/c_CHECK3', 'true');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_c_CHECK3', '0');
};
// script6="child;1;UNMASK;_AC0040010button0/Print,_AC0040010button0/CsvOut"
expj.AC0040010.AC0040010form1.child1 = function () {
  console.log('AC0040010form1 script6');
expj.common.pscript.setUnMaskToReferenceComponent('AC0040010', 'AC0040010form1', '_AC0040010button0/Print');
expj.common.pscript.setUnMaskToReferenceComponent('AC0040010', 'AC0040010form1', '_AC0040010button0/CsvOut');
};
// script7="child;2;MASK;_AC0040010button0/Print,_AC0040010button0/CsvOut"
expj.AC0040010.AC0040010form1.child2 = function () {
  console.log('AC0040010form1 script7');
expj.common.pscript.setMaskToReferenceComponent('AC0040010', 'AC0040010form1', '_AC0040010button0/Print');
expj.common.pscript.setMaskToReferenceComponent('AC0040010', 'AC0040010form1', '_AC0040010button0/CsvOut');
};
// script8="child;3;CHK;_AC0040010form1/IN_RadioButton[eq]1@*6,*4"
expj.AC0040010.AC0040010form1.child3 = function () {
  console.log('AC0040010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_RadioButton'), '[eq]', '1')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
} else {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script9="child;4;CHK;_AC0040010form1/IN_RadioButton[eq]2@*7,*5"
expj.AC0040010.AC0040010form1.child4 = function () {
  console.log('AC0040010form1 script9');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_RadioButton'), '[eq]', '2')) {
if(expj.common.checkNameSpace(this.child7)){this.child7();}
} else {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script10="child;5;CHK;_AC0040010form1/IN_RadioButton[eq]3@*8"
expj.AC0040010.AC0040010form1.child5 = function () {
  console.log('AC0040010form1 script10');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_RadioButton'), '[eq]', '3')) {
if(expj.common.checkNameSpace(this.child8)){this.child8();}
}
};
// script11="child;6;SET;_AC0040010form1/r_ODR_START_DATE=true,_AC0040010form1/IN_RadioButton=0"
expj.AC0040010.AC0040010form1.child6 = function () {
  console.log('AC0040010form1 script11');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/r_ODR_START_DATE', 'true');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_RadioButton', '0');
};
// script12="child;7;SET;_AC0040010form1/r_PRD_START_DATE=true,_AC0040010form1/IN_RadioButton=0"
expj.AC0040010.AC0040010form1.child7 = function () {
  console.log('AC0040010form1 script12');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/r_PRD_START_DATE', 'true');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_RadioButton', '0');
};
// script13="child;8;SET;_AC0040010form1/r_PRD_DUE_DATE=true,_AC0040010form1/IN_RadioButton=0"
expj.AC0040010.AC0040010form1.child8 = function () {
  console.log('AC0040010form1 script13');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/r_PRD_DUE_DATE', 'true');
expj.common.pscript.setReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/IN_RadioButton', '0');
};
expj.AC0040010.AC0040010form1.executeAllOnDecision = function () {
  console.log('execute AC0040010form1.onDecision');
  for (var i = 0; i <= 2; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0040010.AC0040010form1['onDecision' + i])) {
        expj.AC0040010.AC0040010form1['onDecision' + i]();
      }
    }
  }
};
expj.AC0040010.AC0040010form1.executeOnLoad = function () {
  expj.AC0040010.AC0040010form1.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.AC0040010.AC0040010form1['onLoad' + i])) {
      expj.AC0040010.AC0040010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-AC0040010-AC0040010form1" action="AC0040010Servlet" name="AC0040010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:right"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:88px;align:center"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:150px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
<div class="div-td" style="width:170px;align:left"></div>
<div class="div-td" style="width:88px;align:left"></div>
<div class="div-td" style="width:10px;align:left"></div>
<div class="div-td" style="width:10px;align:left"></div>
<div class="div-td" style="width:10px;align:left"></div>
<div class="div-td" style="width:22px;align:left"></div>
</div><!--/tr-->
  <div class = "div-tr">
<input type="hidden" id="expj-AC0040010-AC0040010form1-k_ODR_STS_TYP" name="k_ODR_STS_TYP" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getk_ODR_STS_TYP()) %>">
<script class="expj-script-AC0040010-AC0040010form1-k_ODR_STS_TYP">
expj.AC0040010.AC0040010form1.k_ODR_STS_TYP = {};
expj.AC0040010.AC0040010form1.k_ODR_STS_TYP.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/k_ODR_STS_TYP.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.k_ODR_STS_TYP.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-k_ODR_STS_TYP').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'k_ODR_STS_TYP', this);
  });
  expj.AC0040010.AC0040010form1.k_ODR_STS_TYP.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.k_ODR_STS_TYP.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/k_ODR_STS_TYP.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-k_ODR_STS_TYP');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-k_PLANT_CD" name="k_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getk_PLANT_CD()) %>">
<script class="expj-script-AC0040010-AC0040010form1-k_PLANT_CD">
expj.AC0040010.AC0040010form1.k_PLANT_CD = {};
expj.AC0040010.AC0040010form1.k_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/k_PLANT_CD.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.k_PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-k_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'k_PLANT_CD', this);
  });
  expj.AC0040010.AC0040010form1.k_PLANT_CD.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.k_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/k_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-k_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-k_ODR_START_DATE" name="k_ODR_START_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getk_ODR_START_DATE()) %>">
<script class="expj-script-AC0040010-AC0040010form1-k_ODR_START_DATE">
expj.AC0040010.AC0040010form1.k_ODR_START_DATE = {};
expj.AC0040010.AC0040010form1.k_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/k_ODR_START_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.k_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-k_ODR_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'k_ODR_START_DATE', this);
  });
  expj.AC0040010.AC0040010form1.k_ODR_START_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.k_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/k_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-k_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-k_PRD_DUE_DATE" name="k_PRD_DUE_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getk_PRD_DUE_DATE()) %>">
<script class="expj-script-AC0040010-AC0040010form1-k_PRD_DUE_DATE">
expj.AC0040010.AC0040010form1.k_PRD_DUE_DATE = {};
expj.AC0040010.AC0040010form1.k_PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/k_PRD_DUE_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.k_PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-k_PRD_DUE_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'k_PRD_DUE_DATE', this);
  });
  expj.AC0040010.AC0040010form1.k_PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.k_PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/k_PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-k_PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-k_PRD_START_DATE" name="k_PRD_START_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getk_PRD_START_DATE()) %>">
<script class="expj-script-AC0040010-AC0040010form1-k_PRD_START_DATE">
expj.AC0040010.AC0040010form1.k_PRD_START_DATE = {};
expj.AC0040010.AC0040010form1.k_PRD_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/k_PRD_START_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.k_PRD_START_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-k_PRD_START_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'k_PRD_START_DATE', this);
  });
  expj.AC0040010.AC0040010form1.k_PRD_START_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.k_PRD_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/k_PRD_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-k_PRD_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-k_VEND_CD" name="k_VEND_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getk_VEND_CD()) %>">
<script class="expj-script-AC0040010-AC0040010form1-k_VEND_CD">
expj.AC0040010.AC0040010form1.k_VEND_CD = {};
expj.AC0040010.AC0040010form1.k_VEND_CD.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/k_VEND_CD.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.k_VEND_CD.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-k_VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'k_VEND_CD', this);
  });
  expj.AC0040010.AC0040010form1.k_VEND_CD.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.k_VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/k_VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-k_VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-k_JOB_ODR_CD" name="k_JOB_ODR_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getk_JOB_ODR_CD()) %>">
<script class="expj-script-AC0040010-AC0040010form1-k_JOB_ODR_CD">
expj.AC0040010.AC0040010form1.k_JOB_ODR_CD = {};
expj.AC0040010.AC0040010form1.k_JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/k_JOB_ODR_CD.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.k_JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-k_JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'k_JOB_ODR_CD', this);
  });
  expj.AC0040010.AC0040010form1.k_JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.k_JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/k_JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-k_JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-BUSINESS_OPR_DATE" name="BUSINESS_OPR_DATE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getBUSINESS_OPR_DATE()) %>">
<script class="expj-script-AC0040010-AC0040010form1-BUSINESS_OPR_DATE">
expj.AC0040010.AC0040010form1.BUSINESS_OPR_DATE = {};
expj.AC0040010.AC0040010form1.BUSINESS_OPR_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/BUSINESS_OPR_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.BUSINESS_OPR_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-BUSINESS_OPR_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'BUSINESS_OPR_DATE', this);
  });
  expj.AC0040010.AC0040010form1.BUSINESS_OPR_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.BUSINESS_OPR_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/BUSINESS_OPR_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-BUSINESS_OPR_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-user_PLANT_CD" name="user_PLANT_CD" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getuser_PLANT_CD()) %>">
<script class="expj-script-AC0040010-AC0040010form1-user_PLANT_CD">
expj.AC0040010.AC0040010form1.user_PLANT_CD = {};
expj.AC0040010.AC0040010form1.user_PLANT_CD.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/user_PLANT_CD.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.user_PLANT_CD.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-user_PLANT_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'user_PLANT_CD', this);
  });
  expj.AC0040010.AC0040010form1.user_PLANT_CD.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.user_PLANT_CD.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/user_PLANT_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-user_PLANT_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<input type="hidden" id="expj-AC0040010-AC0040010form1-DOWNLOAD_FILE" name="DOWNLOAD_FILE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getDOWNLOAD_FILE()) %>">
<script class="expj-script-AC0040010-AC0040010form1-DOWNLOAD_FILE">
expj.AC0040010.AC0040010form1.DOWNLOAD_FILE = {};
expj.AC0040010.AC0040010form1.DOWNLOAD_FILE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/DOWNLOAD_FILE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.DOWNLOAD_FILE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-DOWNLOAD_FILE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'DOWNLOAD_FILE', this);
  });
  expj.AC0040010.AC0040010form1.DOWNLOAD_FILE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.DOWNLOAD_FILE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/DOWNLOAD_FILE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-DOWNLOAD_FILE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-SUBMIT_BUTTON_TYPE" name="SUBMIT_BUTTON_TYPE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getSUBMIT_BUTTON_TYPE()) %>">
<script class="expj-script-AC0040010-AC0040010form1-SUBMIT_BUTTON_TYPE">
expj.AC0040010.AC0040010form1.SUBMIT_BUTTON_TYPE = {};
expj.AC0040010.AC0040010form1.SUBMIT_BUTTON_TYPE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/SUBMIT_BUTTON_TYPE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.SUBMIT_BUTTON_TYPE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-SUBMIT_BUTTON_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'SUBMIT_BUTTON_TYPE', this);
  });
  expj.AC0040010.AC0040010form1.SUBMIT_BUTTON_TYPE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.SUBMIT_BUTTON_TYPE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/SUBMIT_BUTTON_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-SUBMIT_BUTTON_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-PRINTER_TYPE" name="PRINTER_TYPE" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getPRINTER_TYPE()) %>">
<script class="expj-script-AC0040010-AC0040010form1-PRINTER_TYPE">
expj.AC0040010.AC0040010form1.PRINTER_TYPE = {};
expj.AC0040010.AC0040010form1.PRINTER_TYPE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/PRINTER_TYPE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.PRINTER_TYPE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-PRINTER_TYPE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'PRINTER_TYPE', this);
  });
  expj.AC0040010.AC0040010form1.PRINTER_TYPE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.PRINTER_TYPE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/PRINTER_TYPE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-PRINTER_TYPE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-SELECTED_PRINTER" name="SELECTED_PRINTER" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getSELECTED_PRINTER()) %>">
<script class="expj-script-AC0040010-AC0040010form1-SELECTED_PRINTER">
expj.AC0040010.AC0040010form1.SELECTED_PRINTER = {};
expj.AC0040010.AC0040010form1.SELECTED_PRINTER.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/SELECTED_PRINTER.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.SELECTED_PRINTER.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-SELECTED_PRINTER').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'SELECTED_PRINTER', this);
  });
  expj.AC0040010.AC0040010form1.SELECTED_PRINTER.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.SELECTED_PRINTER.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/SELECTED_PRINTER.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-SELECTED_PRINTER');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-r_ODR_START_DATE">
expj.AC0040010.AC0040010form1.r_ODR_START_DATE = {};
expj.AC0040010.AC0040010form1.r_ODR_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/r_ODR_START_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.r_ODR_START_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-r_ODR_START_DATE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010form1', 'r_ODR_START_DATE', this, 'RadioButton');
    }
  });
  expj.AC0040010.AC0040010form1.r_ODR_START_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.r_ODR_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/r_ODR_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-r_ODR_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP1" data-name="r_ODR_START_DATE" value="1" <%= ("true".equals(TypeConverter.convert(aAC0040010Struct.getr_ODR_START_DATE())) || "".equals(TypeConverter.convert(aAC0040010Struct.getr_ODR_START_DATE())))?"checked=\"checked\"": "" %> class="" id="expj-AC0040010-AC0040010form1-r_ODR_START_DATE" ><label for="expj-AC0040010-AC0040010form1-r_ODR_START_DATE"><%=CoreTools.getRBString("Expj.ODR_START_DATE",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-INPUT_DATE">
expj.AC0040010.AC0040010form1.INPUT_DATE = {};
expj.AC0040010.AC0040010form1.INPUT_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/INPUT_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.INPUT_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-INPUT_DATE').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'INPUT_DATE', this);
  });
  expj.AC0040010.AC0040010form1.INPUT_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.INPUT_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/INPUT_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-INPUT_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="text" id="expj-AC0040010-AC0040010form1-INPUT_DATE" name="INPUT_DATE" class="AC0040010-focus-move  required-value expj-AC0040010-required-A" style="width:150px;" data-kind="OBT_DATE;TYPE_YMD" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getINPUT_DATE()) %>" maxlength="10" ></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-INPUT_DATE_CALENDAR">
expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR = {};
// script1="onClick;0;CALENDAR;_AC0040010form1/INPUT_DATE"
expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR.onClick0 = function () {
  console.log('INPUT_DATE_CALENDAR script1');
expj.common.pscript.executeCalendar('AC0040010','AC0040010form1','_AC0040010form1/INPUT_DATE');
};
expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR['onClick' + i])) {
        expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR['onClick' + i]();
      }
    }
  }
};
expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR.executeAllOnDecision = function () {
};
expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-INPUT_DATE_CALENDAR').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010form1', 'INPUT_DATE_CALENDAR', this, 'Button');
    }
  });
  expj.common.pscript.createCalendar('AC0040010','AC0040010form1','_AC0040010form1/INPUT_DATE');
  expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/INPUT_DATE_CALENDAR.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-INPUT_DATE_CALENDAR');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0040010-AC0040010form1-INPUT_DATE_CALENDAR" class="AC0040010-focus-move expj-iconbutton"><img draggable="false" alt="CALENDER" src="common/img/OrCalendar.png"></button></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0028",rb)%></span></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-IN_RadioButton" name="IN_RadioButton" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getIN_RadioButton()) %>">
<script class="expj-script-AC0040010-AC0040010form1-IN_RadioButton">
expj.AC0040010.AC0040010form1.IN_RadioButton = {};
expj.AC0040010.AC0040010form1.IN_RadioButton.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/IN_RadioButton.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.IN_RadioButton.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-IN_RadioButton').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'IN_RadioButton', this);
  });
  expj.AC0040010.AC0040010form1.IN_RadioButton.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.IN_RadioButton.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/IN_RadioButton.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-IN_RadioButton');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-r_PRD_START_DATE">
expj.AC0040010.AC0040010form1.r_PRD_START_DATE = {};
expj.AC0040010.AC0040010form1.r_PRD_START_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/r_PRD_START_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.r_PRD_START_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-r_PRD_START_DATE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010form1', 'r_PRD_START_DATE', this, 'RadioButton');
    }
  });
  expj.AC0040010.AC0040010form1.r_PRD_START_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.r_PRD_START_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/r_PRD_START_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-r_PRD_START_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP1" data-name="r_PRD_START_DATE" value="1" <%= ("true".equals(TypeConverter.convert(aAC0040010Struct.getr_PRD_START_DATE())))?"checked=\"checked\"":"" %> class="" id="expj-AC0040010-AC0040010form1-r_PRD_START_DATE" ><label for="expj-AC0040010-AC0040010form1-r_PRD_START_DATE"><%=CoreTools.getRBString("Expj.PRD_START_DATE",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-r_PRD_DUE_DATE">
expj.AC0040010.AC0040010form1.r_PRD_DUE_DATE = {};
expj.AC0040010.AC0040010form1.r_PRD_DUE_DATE.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/r_PRD_DUE_DATE.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.r_PRD_DUE_DATE.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-r_PRD_DUE_DATE').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010form1', 'r_PRD_DUE_DATE', this, 'RadioButton');
    }
  });
  expj.AC0040010.AC0040010form1.r_PRD_DUE_DATE.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.r_PRD_DUE_DATE.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/r_PRD_DUE_DATE.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-r_PRD_DUE_DATE');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="GROUP1" data-name="r_PRD_DUE_DATE" value="1" <%= ("true".equals(TypeConverter.convert(aAC0040010Struct.getr_PRD_DUE_DATE())))?"checked=\"checked\"":"" %> class="" id="expj-AC0040010-AC0040010form1-r_PRD_DUE_DATE" ><label for="expj-AC0040010-AC0040010form1-r_PRD_DUE_DATE"><%=CoreTools.getRBString("Expj.PRD_DUE_DATE",rb)%></label></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.VEND_CD",rb)%></span></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-VEND_CD">
expj.AC0040010.AC0040010form1.VEND_CD = {};
expj.AC0040010.AC0040010form1.VEND_CD.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/VEND_CD.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.VEND_CD.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-VEND_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'VEND_CD', this);
  });
  expj.AC0040010.AC0040010form1.VEND_CD.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.VEND_CD.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/VEND_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-VEND_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0040010-AC0040010form1-VEND_CD" name="VEND_CD" class="AC0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getVEND_CD()) %>" maxlength="25" ></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"><span class="input-name "><%=CoreTools.getRBString("Expj.JOB_ODR_CD",rb)%></span></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-JOB_ODR_CD">
expj.AC0040010.AC0040010form1.JOB_ODR_CD = {};
expj.AC0040010.AC0040010form1.JOB_ODR_CD.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/JOB_ODR_CD.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.JOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-JOB_ODR_CD').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'JOB_ODR_CD', this);
  });
  expj.AC0040010.AC0040010form1.JOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.JOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/JOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-JOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-AC0040010-AC0040010form1-JOB_ODR_CD" name="JOB_ODR_CD" class="AC0040010-focus-move  " style="width:260px;" data-kind="OBT_WILD" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getJOB_ODR_CD()) %>" maxlength="25" ></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-PeekerJOB_ODR_CD">
expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD = {};
// script1="onClick;0;PEEKER;_AC0040010form1/JOB_ODR_CD@<%=contextNo%>"
expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD.onClick0 = function () {
  console.log('PeekerJOB_ODR_CD script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'AC0040010';
var parameterValues = 'PeekerJOB_ODR_CD%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_2%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010form1', '_AC0040010form1/JOB_ODR_CD') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%JOB_ODR_CD_04%&%';
parameterValues += 'TARGET_FIELD%=%_AC0040010form1/JOB_ODR_CD%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%AC0040010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD['onClick' + i])) {
        expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD['onClick' + i]();
      }
    }
  }
};
expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD.executeAllOnDecision = function () {
};
expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-PeekerJOB_ODR_CD').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010form1', 'PeekerJOB_ODR_CD', this, 'Button');
    }
  });
  expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/PeekerJOB_ODR_CD.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-PeekerJOB_ODR_CD');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-AC0040010-AC0040010form1-PeekerJOB_ODR_CD" class="AC0040010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"><span class="input-name "><%=CoreTools.getRBString("Expj.Cmt0002",rb)%></span></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010form1-c_CHECK3">
expj.AC0040010.AC0040010form1.c_CHECK3 = {};
expj.AC0040010.AC0040010form1.c_CHECK3.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/c_CHECK3.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.c_CHECK3.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-c_CHECK3').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010form1', 'c_CHECK3', this, 'CheckBox');
    }
  });
  expj.AC0040010.AC0040010form1.c_CHECK3.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.c_CHECK3.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/c_CHECK3.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-c_CHECK3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:170px;text-align:left;"><input type="checkbox" name="c_CHECK3" value="1" <%= ("true".equals(TypeConverter.convert(aAC0040010Struct.getc_CHECK3())) || "1".equals(TypeConverter.convert(aAC0040010Struct.getc_CHECK3())))?"checked=\"checked\"":"" %>  class="AC0040010-focus-move" id="expj-AC0040010-AC0040010form1-c_CHECK3"><label for="expj-AC0040010-AC0040010form1-c_CHECK3"><%=CoreTools.getRBString("Expj.Cmt0240",rb)%></label></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<input type="hidden" id="expj-AC0040010-AC0040010form1-IN_c_CHECK3" name="IN_c_CHECK3" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aAC0040010Struct.getIN_c_CHECK3()) %>">
<script class="expj-script-AC0040010-AC0040010form1-IN_c_CHECK3">
expj.AC0040010.AC0040010form1.IN_c_CHECK3 = {};
expj.AC0040010.AC0040010form1.IN_c_CHECK3.executeAllOnDecision = function () {
  console.log('execute AC0040010form1/IN_c_CHECK3.onDecision');
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
  expj.AC0040010.executeAllOnDecision();
};
expj.AC0040010.AC0040010form1.IN_c_CHECK3.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010form1-IN_c_CHECK3').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('AC0040010', 'AC0040010form1', 'IN_c_CHECK3', this);
  });
  expj.AC0040010.AC0040010form1.IN_c_CHECK3.executePScriptOnLoad();
};

expj.AC0040010.AC0040010form1.IN_c_CHECK3.executePScriptOnLoad = function () {
  console.log('execute AC0040010form1/IN_c_CHECK3.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010form1-IN_c_CHECK3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;text-align:right;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:center;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:150px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:170px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:88px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:10px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:22px;text-align:left;"></div><!--/td-->
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
<div class="expj-tr" style=""><div class="expj-td under-gradation" style="width:100%;height:42px;"><div class="div-table" style="width:100%;">
<div class="div-tr" style="display:table-row;">
<div class="div-td" style="width:calc(100% - 210px); padding-top:19px">
<%
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 String dateTime = sdf.format(new Date());
%>
<span class="version">AC0040010 Revision: 1.5  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:420px;">
<script class="expj-script-AC0040010-AC0040010button0">
expj.AC0040010.AC0040010button0 = {};
expj.AC0040010.AC0040010button0.executeAllOnDecision = function () {
  console.log('execute AC0040010button0.onDecision');
};
expj.AC0040010.AC0040010button0.executeOnLoad = function () {
  expj.AC0040010.AC0040010button0.executePScriptOnLoad();
};

expj.AC0040010.AC0040010button0.executePScriptOnLoad = function () {
  console.log('execute AC0040010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-AC0040010-AC0040010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:420px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-AC0040010-AC0040010button0-Print">
expj.AC0040010.AC0040010button0.Print = {};
// script1="onClick;0;CHK;_AC0040010form1/INPUT_DATE[lt]_AC0040010form1/BUSINESS_OPR_DATE@!AC50774,*0"
expj.AC0040010.AC0040010button0.Print.onClick0 = function () {
  console.log('Print script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010button0', '_AC0040010form1/INPUT_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010button0', '_AC0040010form1/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('AC0040010', 'AC0040010button0', 'AC50774');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;PRINTER;ORTEUS_HASHED=<%=hashed%>,_AC0040010form1/*@AC0040010Servlet:H,H,H"
expj.AC0040010.AC0040010button0.Print.child0 = function () {
  console.log('Print script2');
expj.common.pscript.viewPrinterDialog('AC0040010', 'AC0040010button0', '_AC0040010form1/*', 'AC0040010Servlet', 'H,H,H');
};
expj.AC0040010.AC0040010button0.Print.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0040010.AC0040010button0.Print['onClick' + i])) {
        expj.AC0040010.AC0040010button0.Print['onClick' + i]();
      }
    }
  }
};
expj.AC0040010.AC0040010button0.Print.executeAllOnDecision = function () {
};
expj.AC0040010.AC0040010button0.Print.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010button0-Print').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010button0', 'Print', this, 'Button');
    }
  });
  expj.AC0040010.AC0040010button0.Print.executePScriptOnLoad();
};

expj.AC0040010.AC0040010button0.Print.executePScriptOnLoad = function () {
  console.log('execute AC0040010button0/Print.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010button0-Print');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0040010-AC0040010button0-Print" name="Print" class="AC0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnPrint",rb)%></button><!-- 帳票出力ボタン --></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010button0-CsvOut">
expj.AC0040010.AC0040010button0.CsvOut = {};
// script1="onClick;0;CHK;_AC0040010form1/INPUT_DATE[lt]_AC0040010form1/BUSINESS_OPR_DATE@!AC50774,*0"
expj.AC0040010.AC0040010button0.CsvOut.onClick0 = function () {
  console.log('CsvOut script1');
if (expj.common.pscript.evaluate(expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010button0', '_AC0040010form1/INPUT_DATE')), '[lt]', expj.common.pscript.convertNumber(expj.common.pscript.getReferenceComponentValue('AC0040010', 'AC0040010button0', '_AC0040010form1/BUSINESS_OPR_DATE')))) {
expj.common.pscript.viewErrorMessage('AC0040010', 'AC0040010button0', 'AC50774');
} else {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script2="child;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_AC0040010form1/*@AC0040010Servlet,,$ZZ07011"
expj.AC0040010.AC0040010button0.CsvOut.child0 = function () {
  console.log('CsvOut script2');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0040010', 'AC0040010button0', '_AC0040010form1/*', 'AC0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0040010', response);
expj.common.updateBusinessScreenTab('AC0040010', contents);
};
expj.common.pscript.callConfirm('AC0040010', 'AC0040010button0', 'ZZ07011', okEvent);
};
expj.AC0040010.AC0040010button0.CsvOut.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0040010.AC0040010button0.CsvOut['onClick' + i])) {
        expj.AC0040010.AC0040010button0.CsvOut['onClick' + i]();
      }
    }
  }
};
expj.AC0040010.AC0040010button0.CsvOut.executeAllOnDecision = function () {
};
expj.AC0040010.AC0040010button0.CsvOut.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010button0-CsvOut').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010button0', 'CsvOut', this, 'Button');
    }
  });
  expj.AC0040010.AC0040010button0.CsvOut.executePScriptOnLoad();
};

expj.AC0040010.AC0040010button0.CsvOut.executePScriptOnLoad = function () {
  console.log('execute AC0040010button0/CsvOut.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010button0-CsvOut');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0040010-AC0040010button0-CsvOut" name="CsvOut" class="AC0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnCsvOut",rb)%></button><!-- CSV出力ボタン --></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010button0-Clear">
expj.AC0040010.AC0040010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@AC0040010Servlet,,$ZZ07008"
expj.AC0040010.AC0040010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('AC0040010', 'AC0040010button0', '', 'AC0040010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'AC0040010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('AC0040010', response);
expj.common.updateBusinessScreenTab('AC0040010', contents);
};
expj.common.pscript.callConfirm('AC0040010', 'AC0040010button0', 'ZZ07008', okEvent);
};
expj.AC0040010.AC0040010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0040010.AC0040010button0.Clear['onClick' + i])) {
        expj.AC0040010.AC0040010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.AC0040010.AC0040010button0.Clear.executeAllOnDecision = function () {
};
expj.AC0040010.AC0040010button0.Clear.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010button0', 'Clear', this, 'Button');
    }
  });
  expj.AC0040010.AC0040010button0.Clear.executePScriptOnLoad();
};

expj.AC0040010.AC0040010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute AC0040010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0040010-AC0040010button0-Clear" name="Clear" class="AC0040010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-AC0040010-AC0040010button0-Close">
expj.AC0040010.AC0040010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.AC0040010.AC0040010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('AC0040010');
};
expj.AC0040010.AC0040010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.AC0040010.AC0040010button0.Close['onClick' + i])) {
        expj.AC0040010.AC0040010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.AC0040010.AC0040010button0.Close.executeAllOnDecision = function () {
};
expj.AC0040010.AC0040010button0.Close.executeOnLoad = function () {
  $('#expj-AC0040010-AC0040010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('AC0040010', 'AC0040010button0', 'Close', this, 'Button');
    }
  });
  expj.AC0040010.AC0040010button0.Close.executePScriptOnLoad();
};

expj.AC0040010.AC0040010button0.Close.executePScriptOnLoad = function () {
  console.log('execute AC0040010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-AC0040010-AC0040010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-AC0040010-AC0040010button0-Close" name="Close" class="AC0040010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-AC0040010 (END)-->
<%
MessageStruct msgStruct = aAC0040010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-AC0040010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.AC0040010)) {
  expj.common.treeInstanceMap.AC0040010 = {};
}
expj.common.treeInstanceMap.AC0040010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0040010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.AC0040010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.AC0040010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.AC0040010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.AC0040010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.AC0040010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.AC0040010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.AC0040010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-AC0040010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-AC0040010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0040010)) {
  expj.common.detailDialogMap.AC0040010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0040010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.AC0040010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0040010.<%=detailId %>)) {
  expj.common.detailDialogMap.AC0040010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0040010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.AC0040010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.AC0040010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.AC0040010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-AC0040010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-AC0040010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-AC0040010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.AC0040010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.AC0040010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.AC0040010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-AC0040010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.AC0040010)) {
  expj.common.viewInstanceMap.AC0040010 = {};
}
expj.common.viewInstanceMap.AC0040010.<%=viewId %> = {};
expj.common.viewInstanceMap.AC0040010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.AC0040010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.AC0040010.<%=viewId %>.init = function () {
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
    expj.AC0040010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.AC0040010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-AC0040010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-AC0040010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-AC0040010_init">
/**
 * AC0040010用のロード完了時初期化関数
 */
expj.AC0040010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-AC0040010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('AC0040010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('AC0040010');
  expj.common.calendarInstanceMap.AC0040010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.AC0040010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.init();
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.AC0040010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.AC0040010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-AC0040010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-AC0040010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-AC0040010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-AC0040010-<%=detailId %>');
<%
 }
%>
  try{expj.AC0040010.AC0040010form1.k_ODR_STS_TYP.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.k_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.k_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.k_PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.k_PRD_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.k_VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.k_JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.BUSINESS_OPR_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.user_PLANT_CD.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.DOWNLOAD_FILE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.SUBMIT_BUTTON_TYPE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.PRINTER_TYPE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.SELECTED_PRINTER.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.r_ODR_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.INPUT_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.INPUT_DATE_CALENDAR.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.IN_RadioButton.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.r_PRD_START_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.r_PRD_DUE_DATE.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.VEND_CD.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.JOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.PeekerJOB_ODR_CD.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.c_CHECK3.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.IN_c_CHECK3.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010button0.Print.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010button0.CsvOut.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010button0.Close.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010form1.executeOnLoad();}catch(e){};
  try{expj.AC0040010.AC0040010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.AC0040010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-AC0040010', 'AC0040010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-AC0040010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.AC0040010-focus-move');
  // 初期フォーカス当てる処理
  $('.AC0040010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('AC0040010', '<%=request.getContextPath() %>');
};

/**
 * AC0040010の全体onDecision処理
 */
expj.AC0040010.executeAllOnDecision = function () {
  expj.AC0040010.AC0040010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-AC0040010_console">
expj.AC0040010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>