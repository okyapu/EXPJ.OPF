<%-- ***
This file is generated
 GeneratedDate  : Sun Feb 12 12:59:15 CST 2017
 JspGeneratorVer: 1.1
 HtmlFileName   : D:\EXPJ.OPF\OPF\EXPJProj\OPF\KP0050\KP0050010.html
*** --%>
<%-- ********** Generated section begin ********** --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="Windows-31J" %>
<%@ page buffer="64kb" %>
<%@ page import="com.nec.jp.orteus.metamorBase.KP0050.*" %>
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
<jsp:useBean id="aKP0050010Control" class="com.nec.jp.orteus.metamorBase.KP0050.KP0050010Control" scope="request"/>
<jsp:useBean id="aKP0050010Struct" class="com.nec.jp.orteus.metamorBase.KP0050.KP0050010Struct" scope="request"/>
<%-- ********** Generated section end ********** --%>

<!DOCTYPE html>
<%-- ********************************************************
Copyright (c) 2003-2004 NEC Corporation
Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.

販売所要計画Ｉ／Ｆ処理実行
$Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0050/jsp/KP0050010.jsp,v $
$Author: geng-jia $	
$Revision: 1.18 $　$Date: 2017/02/22 02:07:09 $
********************************************************* --%>
<html>
<head>
<title>販売所要計画Ｉ／Ｆ処理実行</title>
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
<script class="expj-script-KP0050010_init">
  // KP0050010名前空間
  expj.KP0050010 = {};
</script>
<%-- ********** Generated section end ********** --%>
</head>
<body>
  <div id="expj-business-screen-KP0050010" data-screen="KP0050010" data-newdata="<%=aKP0050010Control.isNewData() %>">
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
              <!-- ここにバッチ選択用のDataGridを配置する。↓ -->
              <script class="expj-script-KP0050010-KP0050010form1">
expj.KP0050010.KP0050010form1 = {};
// script1="onLoad;0;CALL;onDecision@0,1,2,3,4,5"
expj.KP0050010.KP0050010form1.onLoad0 = function () {
  console.log('KP0050010form1 script1');
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision0)){this.onDecision0();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision1)){this.onDecision1();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision2)){this.onDecision2();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision3)){this.onDecision3();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision4)){this.onDecision4();}
if (!expj.common.pscript.alertMessageFlag && expj.common.checkNameSpace(this.onDecision5)){this.onDecision5();}
};
// script2="onDecision;0;CHK;_KP0050010form1/rdoPlantTyp1[eq]true@*0"
expj.KP0050010.KP0050010form1.onDecision0 = function () {
  console.log('KP0050010form1 script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child0)){this.child0();}
}
};
// script3="onDecision;1;CHK;_KP0050010form1/rdoPlantTyp2[eq]true@*2"
expj.KP0050010.KP0050010form1.onDecision1 = function () {
  console.log('KP0050010form1 script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script4="onDecision;2;CHK;_KP0050010form1/rdoPlantTyp2[eq]true@*3"
expj.KP0050010.KP0050010form1.onDecision2 = function () {
  console.log('KP0050010form1 script4');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
}
};
// script5="onDecision;3;CHK;_KP0050010form1/rdoPlantTyp1[eq]true@*4"
expj.KP0050010.KP0050010form1.onDecision3 = function () {
  console.log('KP0050010form1 script5');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
}
};
// script6="onDecision;4;CHK;_KP0050010form1/rdoPlantTyp2[eq]true@*5"
expj.KP0050010.KP0050010form1.onDecision4 = function () {
  console.log('KP0050010form1 script6');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child5)){this.child5();}
}
};
// script7="onDecision;5;CHK;_KP0050010form1/rdoPlanTyp1[eq]true@*6"
expj.KP0050010.KP0050010form1.onDecision5 = function () {
  console.log('KP0050010form1 script7');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlanTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child6)){this.child6();}
}
};
// script8="child;0;CHK;_KP0050010form1/txtPlantCd[eq]@*1,*2"
expj.KP0050010.KP0050010form1.child0 = function () {
  console.log('KP0050010form1 script8');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd'), '[eq]', '')) {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
} else {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
}
};
// script9="child;1;MASK;_KP0050010button1/execute"
expj.KP0050010.KP0050010form1.child1 = function () {
  console.log('KP0050010form1 script9');
expj.common.pscript.setMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010button1/execute');
};
// script10="child;2;UNMASK;_KP0050010button1/execute"
expj.KP0050010.KP0050010form1.child2 = function () {
  console.log('KP0050010form1 script10');
expj.common.pscript.setUnMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010button1/execute');
};
// script11="child;3;MASK;_KP0050010form1/txtPlantCd,_KP0050010form1/PeekerIPlantCd"
expj.KP0050010.KP0050010form1.child3 = function () {
  console.log('KP0050010form1 script11');
expj.common.pscript.setMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd');
expj.common.pscript.setMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010form1/PeekerIPlantCd');
};
// script12="child;4;UNMASK;_KP0050010form1/txtPlantCd"
expj.KP0050010.KP0050010form1.child4 = function () {
  console.log('KP0050010form1 script12');
expj.common.pscript.setUnMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd');
};
// script13="child;5;SET;_KP0050010form1/txtPlantCd="
expj.KP0050010.KP0050010form1.child5 = function () {
  console.log('KP0050010form1 script13');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd', '');
};
// script14="child;6;SET;_KP0050010form1/rdoPlanTyp=1"
expj.KP0050010.KP0050010form1.child6 = function () {
  console.log('KP0050010form1 script14');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlanTyp', '1');
};
expj.KP0050010.KP0050010form1.executeAllOnDecision = function () {
  console.log('execute KP0050010form1.onDecision');
  for (var i = 0; i <= 5; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1['onDecision' + i])) {
        expj.KP0050010.KP0050010form1['onDecision' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010form1.executeOnLoad = function () {
  expj.KP0050010.KP0050010form1.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1.onLoad');
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1['onLoad' + i])) {
      expj.KP0050010.KP0050010form1['onLoad' + i]();
    }
  }
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<form id="expj-KP0050010-KP0050010form1" action="KP0050010Servlet" name="KP0050010form1" data-orftype="DataGrid" data-mode="FORM" method="post" data-status="" style="height:100%;overflow-y:auto;overflow-x:hidden;" onsubmit="return false;">
<div class="div-table expj-datagrid-form" data-orftype="DataGrid" data-mode="FORM" style="width: 950px; height:100%;">
 <div class="div-tr" style="font-size:0px; height:0px;background-color:#ccff99;">
<div class="div-td" style="width:170px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:110px;align:"></div>
<div class="div-td" style="width:40px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:88px;align:"></div>
<div class="div-td" style="width:22px;align:"></div>
<div class="div-td" style="width:150px;align:"></div>
<div class="div-td" style="width:70px;align:"></div>
</div><!--/tr-->
  <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010form1-rdoPlanTyp1">
expj.KP0050010.KP0050010form1.rdoPlanTyp1 = {};
// script1="onClick;0;SET;_KP0050010form1/rdoPlanTyp=1"
expj.KP0050010.KP0050010form1.rdoPlanTyp1.onClick0 = function () {
  console.log('rdoPlanTyp1 script1');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlanTyp', '1');
};
expj.KP0050010.KP0050010form1.rdoPlanTyp1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1.rdoPlanTyp1['onClick' + i])) {
        expj.KP0050010.KP0050010form1.rdoPlanTyp1['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010form1.rdoPlanTyp1.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/rdoPlanTyp1.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.rdoPlanTyp1.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-rdoPlanTyp1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010form1', 'rdoPlanTyp1', this, 'RadioButton');
    }
  });
  expj.KP0050010.KP0050010form1.rdoPlanTyp1.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.rdoPlanTyp1.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/rdoPlanTyp1.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-rdoPlanTyp1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlanTyp" data-name="rdoPlanTyp1" value="true" <%= ("true".equals(TypeConverter.convert(aKP0050010Struct.getrdoPlanTyp1())) || "".equals(TypeConverter.convert(aKP0050010Struct.getrdoPlanTyp1())))?"checked=\"checked\"": "" %> class="" id="expj-KP0050010-KP0050010form1-rdoPlanTyp1" ><label for="expj-KP0050010-KP0050010form1-rdoPlanTyp1"><%=CoreTools.getRBString("Expj.Cmt0711",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KP0050010-KP0050010form1-rdoPlanTyp" name="rdoPlanTyp" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKP0050010Struct.getrdoPlanTyp()) %>">
<script class="expj-script-KP0050010-KP0050010form1-rdoPlanTyp">
expj.KP0050010.KP0050010form1.rdoPlanTyp = {};
expj.KP0050010.KP0050010form1.rdoPlanTyp.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/rdoPlanTyp.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.rdoPlanTyp.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-rdoPlanTyp').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0050010', 'KP0050010form1', 'rdoPlanTyp', this);
  });
  expj.KP0050010.KP0050010form1.rdoPlanTyp.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.rdoPlanTyp.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/rdoPlanTyp.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-rdoPlanTyp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010form1-rdoPlanTyp2">
expj.KP0050010.KP0050010form1.rdoPlanTyp2 = {};
// script1="onClick;0;SET;_KP0050010form1/rdoPlanTyp=2"
expj.KP0050010.KP0050010form1.rdoPlanTyp2.onClick0 = function () {
  console.log('rdoPlanTyp2 script1');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlanTyp', '2');
};
expj.KP0050010.KP0050010form1.rdoPlanTyp2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1.rdoPlanTyp2['onClick' + i])) {
        expj.KP0050010.KP0050010form1.rdoPlanTyp2['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010form1.rdoPlanTyp2.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/rdoPlanTyp2.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.rdoPlanTyp2.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-rdoPlanTyp2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010form1', 'rdoPlanTyp2', this, 'RadioButton');
    }
  });
  expj.KP0050010.KP0050010form1.rdoPlanTyp2.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.rdoPlanTyp2.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/rdoPlanTyp2.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-rdoPlanTyp2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlanTyp" data-name="rdoPlanTyp2" value="true" <%= ("true".equals(TypeConverter.convert(aKP0050010Struct.getrdoPlanTyp2())))?"checked=\"checked\"":"" %> class="" id="expj-KP0050010-KP0050010form1-rdoPlanTyp2" ><label for="expj-KP0050010-KP0050010form1-rdoPlanTyp2"><%=CoreTools.getRBString("Expj.Cmt0712",rb)%></label></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010form1-rdoPlanTyp3">
expj.KP0050010.KP0050010form1.rdoPlanTyp3 = {};
// script1="onClick;0;SET;_KP0050010form1/rdoPlanTyp=3"
expj.KP0050010.KP0050010form1.rdoPlanTyp3.onClick0 = function () {
  console.log('rdoPlanTyp3 script1');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlanTyp', '3');
};
expj.KP0050010.KP0050010form1.rdoPlanTyp3.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1.rdoPlanTyp3['onClick' + i])) {
        expj.KP0050010.KP0050010form1.rdoPlanTyp3['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010form1.rdoPlanTyp3.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/rdoPlanTyp3.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.rdoPlanTyp3.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-rdoPlanTyp3').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010form1', 'rdoPlanTyp3', this, 'RadioButton');
    }
  });
  expj.KP0050010.KP0050010form1.rdoPlanTyp3.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.rdoPlanTyp3.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/rdoPlanTyp3.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-rdoPlanTyp3');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlanTyp" data-name="rdoPlanTyp3" value="true" <%= ("true".equals(TypeConverter.convert(aKP0050010Struct.getrdoPlanTyp3())))?"checked=\"checked\"":"" %> class="" id="expj-KP0050010-KP0050010form1-rdoPlanTyp3" ><label for="expj-KP0050010-KP0050010form1-rdoPlanTyp3"><%=CoreTools.getRBString("Expj.Cmt0713",rb)%></label></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010form1-rdoPlantTyp1">
expj.KP0050010.KP0050010form1.rdoPlantTyp1 = {};
// script1="onClick;0;UNMASK;_KP0050010form1/txtPlantCd,_KP0050010form1/PeekerIPlantCd"
expj.KP0050010.KP0050010form1.rdoPlantTyp1.onClick0 = function () {
  console.log('rdoPlantTyp1 script1');
expj.common.pscript.setUnMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd');
expj.common.pscript.setUnMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010form1/PeekerIPlantCd');
};
// script2="onClick;1;SET;_KP0050010form1/rdoPlantTyp=1"
expj.KP0050010.KP0050010form1.rdoPlantTyp1.onClick1 = function () {
  console.log('rdoPlantTyp1 script2');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlantTyp', '1');
};
expj.KP0050010.KP0050010form1.rdoPlantTyp1.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1.rdoPlantTyp1['onClick' + i])) {
        expj.KP0050010.KP0050010form1.rdoPlantTyp1['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010form1.rdoPlantTyp1.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/rdoPlantTyp1.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.rdoPlantTyp1.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-rdoPlantTyp1').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010form1', 'rdoPlantTyp1', this, 'RadioButton');
    }
  });
  expj.KP0050010.KP0050010form1.rdoPlantTyp1.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.rdoPlantTyp1.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/rdoPlantTyp1.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-rdoPlantTyp1');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp1" value="true" <%= ("true".equals(TypeConverter.convert(aKP0050010Struct.getrdoPlantTyp1())) || "".equals(TypeConverter.convert(aKP0050010Struct.getrdoPlantTyp1())))?"checked=\"checked\"": "" %> class="" id="expj-KP0050010-KP0050010form1-rdoPlantTyp1" ><label for="expj-KP0050010-KP0050010form1-rdoPlantTyp1"><%=CoreTools.getRBString("Expj.Cmt0038",rb)%></label></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010form1-txtPlantCd">
expj.KP0050010.KP0050010form1.txtPlantCd = {};
expj.KP0050010.KP0050010form1.txtPlantCd.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/txtPlantCd.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.txtPlantCd.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-txtPlantCd').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0050010', 'KP0050010form1', 'txtPlantCd', this);
  });
  expj.KP0050010.KP0050010form1.txtPlantCd.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.txtPlantCd.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/txtPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-txtPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:260px;text-align:left;"><input type="text" id="expj-KP0050010-KP0050010form1-txtPlantCd" name="txtPlantCd" class="KP0050010-focus-move  required-value expj-KP0050010-required-A" style="width:260px;" data-kind="" value="<%= TypeConverter.sanitizer(aKP0050010Struct.gettxtPlantCd()) %>" maxlength="2" ></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010form1-PeekerIPlantCd">
expj.KP0050010.KP0050010form1.PeekerIPlantCd = {};
// script1="onClick;0;PEEKER;_KP0050010form1/txtPlantCd@<%=contextNo%>"
expj.KP0050010.KP0050010form1.PeekerIPlantCd.onClick0 = function () {
  console.log('PeekerIPlantCd script1');
expj.common.controlLoadingScreen(true);
setTimeout(function () {
var submitScreenId = 'KP0050010';
var parameterValues = 'PeekerIPlantCd%=%%&%SUBMIT_BUTTON_TYPE%=%0%&%';
parameterValues += 'SQLPARAM_1%=%';
parameterValues += expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd') + '%';
parameterValues += '%&%';
parameterValues += 'SQLNAME%=%PLANT_CD_01%&%';
parameterValues += 'TARGET_FIELD%=%_KP0050010form1/txtPlantCd%&%';
parameterValues += 'MSG_CONTEXT_NO%=%<%=contextNo%>%&%';
parameterValues += 'FLASH_NAME%=%KP0050010%&%TARGET_WINDOW%=%';
expj.common.executeStartupPeekerPage(submitScreenId, parameterValues);
}, expj.common.screenFrameLoadingTime);
};
expj.KP0050010.KP0050010form1.PeekerIPlantCd.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1.PeekerIPlantCd['onClick' + i])) {
        expj.KP0050010.KP0050010form1.PeekerIPlantCd['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010form1.PeekerIPlantCd.executeAllOnDecision = function () {
};
expj.KP0050010.KP0050010form1.PeekerIPlantCd.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-PeekerIPlantCd').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010form1', 'PeekerIPlantCd', this, 'Button');
    }
  });
  expj.KP0050010.KP0050010form1.PeekerIPlantCd.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.PeekerIPlantCd.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/PeekerIPlantCd.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-PeekerIPlantCd');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:22px;text-align:left;"><button type="button" id="expj-KP0050010-KP0050010form1-PeekerIPlantCd" class="KP0050010-focus-move expj-iconbutton"><img draggable="false" alt="PEEKER" src="common/img/binocle.png"></button></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010form1-rdoPlantTyp2">
expj.KP0050010.KP0050010form1.rdoPlantTyp2 = {};
// script1="onClick;0;MASK;_KP0050010form1/txtPlantCd,_KP0050010form1/PeekerIPlantCd"
expj.KP0050010.KP0050010form1.rdoPlantTyp2.onClick0 = function () {
  console.log('rdoPlantTyp2 script1');
expj.common.pscript.setMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd');
expj.common.pscript.setMaskToReferenceComponent('KP0050010', 'KP0050010form1', '_KP0050010form1/PeekerIPlantCd');
};
// script2="onClick;1;SET;_KP0050010form1/rdoPlantTyp=2,_KP0050010form1/txtPlantCd="
expj.KP0050010.KP0050010form1.rdoPlantTyp2.onClick1 = function () {
  console.log('rdoPlantTyp2 script2');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/rdoPlantTyp', '2');
expj.common.pscript.setReferenceComponentValue('KP0050010', 'KP0050010form1', '_KP0050010form1/txtPlantCd', '');
};
expj.KP0050010.KP0050010form1.rdoPlantTyp2.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 1; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010form1.rdoPlantTyp2['onClick' + i])) {
        expj.KP0050010.KP0050010form1.rdoPlantTyp2['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010form1.rdoPlantTyp2.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/rdoPlantTyp2.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.rdoPlantTyp2.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-rdoPlantTyp2').change(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010form1', 'rdoPlantTyp2', this, 'RadioButton');
    }
  });
  expj.KP0050010.KP0050010form1.rdoPlantTyp2.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.rdoPlantTyp2.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/rdoPlantTyp2.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-rdoPlantTyp2');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:150px;text-align:left;"><input type="radio" name="rdoPlantTyp" data-name="rdoPlantTyp2" value="true" <%= ("true".equals(TypeConverter.convert(aKP0050010Struct.getrdoPlantTyp2())))?"checked=\"checked\"":"" %> class="" id="expj-KP0050010-KP0050010form1-rdoPlantTyp2" ><label for="expj-KP0050010-KP0050010form1-rdoPlantTyp2"><%=CoreTools.getRBString("Expj.Cmt0036",rb)%></label></div><!--/td-->
<input type="hidden" id="expj-KP0050010-KP0050010form1-rdoPlantTyp" name="rdoPlantTyp" class="" data-kind="" maxlength="2147483647" value="<%= TypeConverter.sanitizer(aKP0050010Struct.getrdoPlantTyp()) %>">
<script class="expj-script-KP0050010-KP0050010form1-rdoPlantTyp">
expj.KP0050010.KP0050010form1.rdoPlantTyp = {};
expj.KP0050010.KP0050010form1.rdoPlantTyp.executeAllOnDecision = function () {
  console.log('execute KP0050010form1/rdoPlantTyp.onDecision');
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
  expj.KP0050010.executeAllOnDecision();
};
expj.KP0050010.KP0050010form1.rdoPlantTyp.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010form1-rdoPlantTyp').blur(function () {
    expj.common.pscript.executeTextInputOnDecisionEvent('KP0050010', 'KP0050010form1', 'rdoPlantTyp', this);
  });
  expj.KP0050010.KP0050010form1.rdoPlantTyp.executePScriptOnLoad();
};

expj.KP0050010.KP0050010form1.rdoPlantTyp.executePScriptOnLoad = function () {
  console.log('execute KP0050010form1/rdoPlantTyp.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010form1-rdoPlantTyp');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:110px;text-align:left;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
</div><!--/tr-->
 <div class = "div-tr">
<div class="div-td" style="width:170px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:110px;"></div><!--/td-->
<div class="div-td" style="width:40px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:88px;"></div><!--/td-->
<div class="div-td" style="width:22px;"></div><!--/td-->
<div class="div-td" style="width:150px;"></div><!--/td-->
<div class="div-td" style="width:70px;"></div><!--/td-->
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
<div class="datagrid-button-field-cell frame10 button-area" style="width:105px;"><script class="expj-script-KP0050010-KP0050010button1">
expj.KP0050010.KP0050010button1 = {};
expj.KP0050010.KP0050010button1.executeAllOnDecision = function () {
  console.log('execute KP0050010button1.onDecision');
};
expj.KP0050010.KP0050010button1.executeOnLoad = function () {
  expj.KP0050010.KP0050010button1.executePScriptOnLoad();
};

expj.KP0050010.KP0050010button1.executePScriptOnLoad = function () {
  console.log('execute KP0050010button1.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0050010-KP0050010button1" class="div-table" data-orftype="DataGrid" data-mode="BUTTON" style="width:105px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0050010-KP0050010button1-execute">
expj.KP0050010.KP0050010button1.execute = {};
// script1="onClick;0;CHK;_KP0050010form1/rdoPlantTyp1[eq]true@*2,*1"
expj.KP0050010.KP0050010button1.execute.onClick0 = function () {
  console.log('execute script1');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010button1', '_KP0050010form1/rdoPlantTyp1'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child2)){this.child2();}
} else {
if(expj.common.checkNameSpace(this.child1)){this.child1();}
}
};
// script2="child;1;CHK;_KP0050010form1/rdoPlantTyp2[eq]true@*4,!AZ00006"
expj.KP0050010.KP0050010button1.execute.child1 = function () {
  console.log('execute script2');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010button1', '_KP0050010form1/rdoPlantTyp2'), '[eq]', 'true')) {
if(expj.common.checkNameSpace(this.child4)){this.child4();}
} else {
expj.common.pscript.viewErrorMessage('KP0050010', 'KP0050010button1', 'AZ00006');
}
};
// script3="child;2;CHK;_KP0050010form1/txtPlantCd[neq]@*3,!ZZ01104"
expj.KP0050010.KP0050010button1.execute.child2 = function () {
  console.log('execute script3');
if (expj.common.pscript.evaluate(expj.common.pscript.getReferenceComponentValue('KP0050010', 'KP0050010button1', '_KP0050010form1/txtPlantCd'), '[neq]', '')) {
if(expj.common.checkNameSpace(this.child3)){this.child3();}
} else {
expj.common.pscript.viewErrorMessage('KP0050010', 'KP0050010button1', 'ZZ01104');
}
};
// script4="child;3;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0050010form1/*@KP0050010Servlet,,$ZZ07010"
expj.KP0050010.KP0050010button1.execute.child3 = function () {
  console.log('execute script4');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0050010', 'KP0050010button1', '_KP0050010form1/*', 'KP0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0050010', response);
expj.common.updateBusinessScreenTab('KP0050010', contents);
};
expj.common.pscript.callConfirm('KP0050010', 'KP0050010button1', 'ZZ07010', okEvent);
};
// script5="child;4;SUBMIT;ORTEUS_HASHED=<%=hashed%>,_KP0050010form1/*@KP0050010Servlet,,$ZZ07010"
expj.KP0050010.KP0050010button1.execute.child4 = function () {
  console.log('execute script5');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0050010', 'KP0050010button1', '_KP0050010form1/*', 'KP0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0050010', response);
expj.common.updateBusinessScreenTab('KP0050010', contents);
};
expj.common.pscript.callConfirm('KP0050010', 'KP0050010button1', 'ZZ07010', okEvent);
};
expj.KP0050010.KP0050010button1.execute.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010button1.execute['onClick' + i])) {
        expj.KP0050010.KP0050010button1.execute['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010button1.execute.executeAllOnDecision = function () {
};
expj.KP0050010.KP0050010button1.execute.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010button1-execute').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010button1', 'execute', this, 'Button');
    }
  });
  expj.KP0050010.KP0050010button1.execute.executePScriptOnLoad();
};

expj.KP0050010.KP0050010button1.execute.executePScriptOnLoad = function () {
  console.log('execute KP0050010button1/execute.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010button1-execute');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0050010-KP0050010button1-execute" name="execute" class="KP0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnExecute",rb)%></button><!-- 実行ボタン --></div><!--/td-->
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
<span class="version">KP0050010 Revision: 1.9  <%= dateTime %></span>
</div><!--/td-->
<div class="div-td" style="width:210px;">
<script class="expj-script-KP0050010-KP0050010button0">
expj.KP0050010.KP0050010button0 = {};
expj.KP0050010.KP0050010button0.executeAllOnDecision = function () {
  console.log('execute KP0050010button0.onDecision');
};
expj.KP0050010.KP0050010button0.executeOnLoad = function () {
  expj.KP0050010.KP0050010button0.executePScriptOnLoad();
};

expj.KP0050010.KP0050010button0.executePScriptOnLoad = function () {
  console.log('execute KP0050010button0.onLoad');
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div id="expj-KP0050010-KP0050010button0" class="div-table footer-button" data-orftype="DataGrid" data-mode="BUTTON" style="width:210px;height:22px;">
   <div class = "div-tr">
<script class="expj-script-KP0050010-KP0050010button0-Clear">
expj.KP0050010.KP0050010button0.Clear = {};
// script1="onClick;0;SUBMIT;ORTEUS_HASHED=<%=hashed%>@KP0050010Servlet,,$ZZ07008"
expj.KP0050010.KP0050010button0.Clear.onClick0 = function () {
  console.log('Clear script1');
var okEvent = function () {
var params = expj.common.pscript.createParameter('KP0050010', 'KP0050010button0', '', 'KP0050010Servlet');
params._FLASHPARAMETERVALUES_ += 'ORTEUS_HASHED%=%<%=hashed%>%&%';
var response = expj.common.accessBusinessScreen('POST', 'KP0050010Servlet', params);
var contents = expj.common.analyzeBusinessScreenResponse('KP0050010', response);
expj.common.updateBusinessScreenTab('KP0050010', contents);
};
expj.common.pscript.callConfirm('KP0050010', 'KP0050010button0', 'ZZ07008', okEvent);
};
expj.KP0050010.KP0050010button0.Clear.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010button0.Clear['onClick' + i])) {
        expj.KP0050010.KP0050010button0.Clear['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010button0.Clear.executeAllOnDecision = function () {
};
expj.KP0050010.KP0050010button0.Clear.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010button0-Clear').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010button0', 'Clear', this, 'Button');
    }
  });
  expj.KP0050010.KP0050010button0.Clear.executePScriptOnLoad();
};

expj.KP0050010.KP0050010button0.Clear.executePScriptOnLoad = function () {
  console.log('execute KP0050010button0/Clear.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010button0-Clear');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0050010-KP0050010button0-Clear" name="Clear" class="KP0050010-focus-move" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClear",rb)%></button><!-- クリアボタン --></div><!--/td-->
<script class="expj-script-KP0050010-KP0050010button0-Close">
expj.KP0050010.KP0050010button0.Close = {};
// script1="onClick;0;CLOSE"
expj.KP0050010.KP0050010button0.Close.onClick0 = function () {
  console.log('Close script1');
expj.common.executeBusinessScreenCloseDialog('KP0050010');
};
expj.KP0050010.KP0050010button0.Close.executeAllOnClick = function () {
  expj.common.pscript.alertMessageFlag = false;
  for (var i = 0; i <= 0; i++) {
    if (!expj.common.pscript.alertMessageFlag){
      if (expj.common.checkNameSpace(expj.KP0050010.KP0050010button0.Close['onClick' + i])) {
        expj.KP0050010.KP0050010button0.Close['onClick' + i]();
      }
    }
  }
};
expj.KP0050010.KP0050010button0.Close.executeAllOnDecision = function () {
};
expj.KP0050010.KP0050010button0.Close.executeOnLoad = function () {
  $('#expj-KP0050010-KP0050010button0-Close').click(function () {
    if (!this.hasAttribute('disabled')) {
      expj.common.pscript.executeOnClickEvent('KP0050010', 'KP0050010button0', 'Close', this, 'Button');
    }
  });
  expj.KP0050010.KP0050010button0.Close.executePScriptOnLoad();
};

expj.KP0050010.KP0050010button0.Close.executePScriptOnLoad = function () {
  console.log('execute KP0050010button0/Close.onLoad');
  var targetComponent = document.getElementById('expj-KP0050010-KP0050010button0-Close');
  expj.common.pscript.setActionTargetComponent(targetComponent);
  expj.common.pscript.setActionTargetComponentNull();
};
</script>
<div class="div-td" style="width:calc(100px + 5px);float:none;height:30px;"><button type="button" id="expj-KP0050010-KP0050010button0-Close" name="Close" class="KP0050010-focus-move expj-business-screen-close-button" style="width:100px;"><%=CoreTools.getRBString("Expj.BtnClose",rb)%></button><!-- 閉じるボタン --></div><!--/td-->
</div><!--/tr-->
</div><!-- /DataGridTable -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table2 -->
</div><!--/td-->
</div><!--/tr-->
</div><!-- /table1 -->
</div><!-- expj-business-screen-KP0050010 (END)-->
<%
MessageStruct msgStruct = aKP0050010Control.getMsgStruct();
%><%@include file="common/SetServerMessage.jsp" %><%
//TREE JS宣言
 if (treeId != null) {
%>
<script class="expj-script-KP0050010-<%=treeId %>">
if (!expj.common.checkNameSpace(expj.common.treeInstanceMap.KP0050010)) {
  expj.common.treeInstanceMap.KP0050010 = {};
}
expj.common.treeInstanceMap.KP0050010.<%=treeId %> = {};
// TREEのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0050010.<%=treeId %>.treeInstance = null;
// 選択中のNodeを保存する変数
expj.common.treeInstanceMap.KP0050010.<%=treeId %>.gPrevSelectedNode = null;
// コンテキストメニューのインスタンスを保存する変数
expj.common.treeInstanceMap.KP0050010.<%=treeId %>.contextData = null;
// ツリーのノードが選択された時に処理される関数
expj.common.treeInstanceMap.KP0050010.<%=treeId %>.onTreeActivate = function (event, data) {
  expj.common.pscript.onClickTargetButtonData = null;
  expj.common.ui.tree.clickTreeNodeInit(expj.common.treeInstanceMap.KP0050010.<%=treeId %>, data);
  expj.common.pscript.alertMessageFlag = false;
  expj.common.pscript.setActionTargetComponent(expj.common.treeInstanceMap.KP0050010.<%=treeId %>.treeInstance[0]);
  console.log('execute <%=treeId %>.onClick');
  <%=treeClickEvent.get(treeId) %>();
  expj.KP0050010.executeAllOnDecision();
  expj.common.pscript.setActionTargetComponentNull();
};
expj.common.treeInstanceMap.KP0050010.<%=treeId %>.init = function () {
  var treeXml = '<%=treeXmlData %>';
  var dmyFunc = null;
  this.treeInstance = expj.common.createDataGridTreeInstance(treeXml, '#expj-KP0050010-<%=treeId %>', this.onTreeActivate, dmyFunc);
};
</script>
<%
 }
//TREE JS(END)

//DETAIL Js宣言
 if (detailId != null) {
%>
<script class="expj-script-KP0050010-<%=detailId %>">
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0050010)) {
  expj.common.detailDialogMap.KP0050010 = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0050010._detailWindowNameMap_)) {
  expj.common.detailDialogMap.KP0050010._detailWindowNameMap_ = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0050010.<%=detailId %>)) {
  expj.common.detailDialogMap.KP0050010.<%=detailId %> = {};
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0050010.<%=detailId %>.visible)) {
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.visible = false;
}
if (!expj.common.checkNameSpace(expj.common.detailDialogMap.KP0050010.<%=detailId %>.hidden)) {
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.hidden = false;
}
expj.common.detailDialogMap.KP0050010.<%=detailId %>.tableInstance = null;
expj.common.detailDialogMap.KP0050010.<%=detailId %>.init = function () {
  // DataGrid(DETAIL)のVIEWボディデータ
  var body_data = [<%=detailViewBodyData.toString() %>];
  // DataGrid(DETAIL)のVIEWヘッダーデータ
  var header_data = [<%=detailViewHeaderData.toString() %>];
  var selector = '#expj-KP0050010-<%=detailViewId %>';
  var allowResize = <%=detailViewResize %>;
  var selectKind = '<%=detailViewSelect %>';
  var selectEvent = null;
  // DataGrid(DETAIL)のVIEW生成
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.tableInstance = expj.common.createOrteusViewInstance(selector, header_data, body_data, allowResize, selectKind, selectEvent);
<%
 if ("false".equals(detailViewScroll)) {
%>
  $('#expj-KP0050010-<%=detailViewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
 }
%>
  // 詳細ウィンドウの初期化
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.dialogInstance = expj.common.createDetailWindowInstance('#expj-KP0050010-<%=detailId %>', false, <%=detailWidth %>, <%=detailHeight %>);
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.dialogInstance.dialog({
    'open' : function (event) {
      expj.common.detailDialogMap.KP0050010.<%=detailId %>.visible = true;
    },
    'close' : function (event) {
      expj.common.detailDialogMap.KP0050010.<%=detailId %>.visible = false;
    }
  });
<%
 if (detailFloat != null && !detailFloat.isEmpty()) {
%>
  expj.common.detailDialogMap.KP0050010._detailWindowNameMap_['<%=detailFloat %>'] = '<%=detailId %>';
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
<script class="expj-script-KP0050010-<%=viewId %>">
if (!expj.common.checkNameSpace(expj.common.viewInstanceMap.KP0050010)) {
  expj.common.viewInstanceMap.KP0050010 = {};
}
expj.common.viewInstanceMap.KP0050010.<%=viewId %> = {};
expj.common.viewInstanceMap.KP0050010.<%=viewId %>.tableInstance = null;
expj.common.viewInstanceMap.KP0050010.<%=viewId %>.resize = function () {
};
expj.common.viewInstanceMap.KP0050010.<%=viewId %>.init = function () {
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
    expj.KP0050010.executeAllOnDecision();
  };
  expj.common.viewInstanceMap.KP0050010.<%=viewId %>.tableInstance = expj.common.createOrteusViewInstance('#expj-KP0050010-<%=viewId %>', header_data, body_data, <%=viewResize %>, '<%=viewSelect %>', viewSelectEvent);
<%
 if ("false".equals(viewScroll)) {
%>
  $('#expj-KP0050010-<%=viewId %> div.expjView_scrollBody').css('overflow', 'hidden');
<%
}
%>
};
</script>
<%
}
%>
<script class="expj-script-KP0050010_init">
/**
 * KP0050010用のロード完了時初期化関数
 */
expj.KP0050010.executeScreenLoad = function () {
  expj.common.tuningLoadScreenBefore('#expj-business-screen-tabs-body-KP0050010');
  //ボタンなしボタン行エリア削除処理
  expj.common.arrangeDatagridButtonArea('KP0050010');
  //可変DataGridTableに動的高さ設定
  expj.common.setExpjDynamicHeight('KP0050010');
  expj.common.calendarInstanceMap.KP0050010 = {};
<%
 if (treeId != null) {
%>
  // TREEの初期化
  expj.common.treeInstanceMap.KP0050010.<%=treeId %>.init();
<%
 }
 if (detailId != null) {
%>
  // DataGrid(DETAIL)用の初期化
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.init();
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.visible = false;
  expj.common.detailDialogMap.KP0050010.<%=detailId %>.hidden = false;
<%
 }
%>
  // DataGrid(VIEW)の初期化
<%
 for (int i = 0; i < viewIdList.size(); i++) {
  String viewId = (String) viewIdList.get(i);
%>
  expj.common.viewInstanceMap.KP0050010.<%=viewId %>.init();
<%
 }
%>
  expj.common.pscript.kind.applyKind('#expj-business-screen-tabs-body-KP0050010');
  expj.common.pscript.setComponentValueManage('#expj-business-screen-tabs-body-KP0050010');
<%
 if (detailId != null) {
%>
  expj.common.pscript.kind.applyKind('#expj-KP0050010-<%=detailId %>');
  expj.common.pscript.setComponentValueManage('#expj-KP0050010-<%=detailId %>');
<%
 }
%>
  try{expj.KP0050010.KP0050010form1.rdoPlanTyp1.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.rdoPlanTyp.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.rdoPlanTyp2.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.rdoPlanTyp3.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.rdoPlantTyp1.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.txtPlantCd.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.PeekerIPlantCd.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.rdoPlantTyp2.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.rdoPlantTyp.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010button1.execute.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010button0.Clear.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010button0.Close.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010form1.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010button1.executeOnLoad();}catch(e){};
  try{expj.KP0050010.KP0050010button0.executeOnLoad();}catch(e){};
  // コンソール出力
  expj.KP0050010.viewConsole();
  expj.common.tuningLoadScreenAfter('#expj-business-screen-tabs-body-KP0050010', 'KP0050010');
  expj.common.ui.customizeSelect('#expj-business-screen-tabs-body-KP0050010');  
  // キーによるフォーカス移動設定
  expj.common.ui.setupFocusMove('.KP0050010-focus-move');
  // 初期フォーカス当てる処理
  $('.KP0050010-focus-move').each(function(){
    if(!$(this).is(':disabled') && this.type !== 'image'){
      $(this).focus();
      return false;
    }
  });
  // ファイルダウンロード処理
  expj.common.executeFileDownLoad('KP0050010', '<%=request.getContextPath() %>');
};

/**
 * KP0050010の全体onDecision処理
 */
expj.KP0050010.executeAllOnDecision = function () {
  expj.KP0050010.KP0050010form1.executeAllOnDecision();
};
</script>
<script class="expj-script-KP0050010_console">
expj.KP0050010.viewConsole = function () {
  var message = '<%=messageString %>';
  if (message !== '') {
    // コンソール出力
    expj.common.setScreenFrameConsoleMessage(message);
  }
};
</script>
</body></html>